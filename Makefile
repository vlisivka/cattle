MVN_OPTS=
MVN=${MVN_OPTS} install

build: build-env
	./tools/docker/build.sh mvn ${MVN}

shell: build-env
	./tools/docker/build.sh bash

run: build
	./tools/docker/build.sh run

build-env:
	cd ./tools/docker && \
	docker build -t cattle-buildenv .

enter: build-env
	./tools/docker/build.sh bash

mvn-clean: build-env
	./tools/docker/build.sh mvn -Drelease clean

runtime-clean:
	rm -rf ./runtime

clean: mvn-clean
	./tools/docker/build.sh find -depth -name __pycache__ -type d -exec rm -rf {} \;
	./tools/docker/build.sh find -depth -name .tox -type d -exec rm -rf {} \;
	./tools/docker/build.sh rm -rf dist ./code/agent/src/agents/node-services/content-home/node-services/node_modules ./code/agent/src/agents/pyagent/dist ./tests/integration/.tox ./code/agent/src/agents/pyagent/.tox

test: build
	FORCE_DB=h2 ./tools/docker/build.sh ./tools/build/runtests.sh

bundle: build-env
	./tools/docker/build.sh mvn ${MVN_OPTS} -Drelease package

release-images: build
	./dist/package.sh

images: bundle
	./dist/package.sh

images-clean:
	./tools/build/checkin-test.sh -c test clean images

check-dir-clean:
	./tools/build/checkin-test.sh -c

check-in-test:
	./tools/build/checkin-test.sh mvn-clean runtime-clean test

check-dir-dirty:
	./tools/build/checkin-test.sh dirty

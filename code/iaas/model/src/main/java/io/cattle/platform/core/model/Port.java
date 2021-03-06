/**
 * This class is generated by jOOQ
 */
package io.cattle.platform.core.model;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.3.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
@javax.persistence.Entity
@javax.persistence.Table(name = "port", schema = "cattle")
public interface Port extends java.io.Serializable {

	/**
	 * Setter for <code>cattle.port.id</code>.
	 */
	public void setId(java.lang.Long value);

	/**
	 * Getter for <code>cattle.port.id</code>.
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "id", unique = true, nullable = false, precision = 19)
	public java.lang.Long getId();

	/**
	 * Setter for <code>cattle.port.name</code>.
	 */
	public void setName(java.lang.String value);

	/**
	 * Getter for <code>cattle.port.name</code>.
	 */
	@javax.persistence.Column(name = "name", length = 255)
	public java.lang.String getName();

	/**
	 * Setter for <code>cattle.port.account_id</code>.
	 */
	public void setAccountId(java.lang.Long value);

	/**
	 * Getter for <code>cattle.port.account_id</code>.
	 */
	@javax.persistence.Column(name = "account_id", precision = 19)
	public java.lang.Long getAccountId();

	/**
	 * Setter for <code>cattle.port.kind</code>.
	 */
	public void setKind(java.lang.String value);

	/**
	 * Getter for <code>cattle.port.kind</code>.
	 */
	@javax.persistence.Column(name = "kind", nullable = false, length = 255)
	public java.lang.String getKind();

	/**
	 * Setter for <code>cattle.port.uuid</code>.
	 */
	public void setUuid(java.lang.String value);

	/**
	 * Getter for <code>cattle.port.uuid</code>.
	 */
	@javax.persistence.Column(name = "uuid", unique = true, nullable = false, length = 128)
	public java.lang.String getUuid();

	/**
	 * Setter for <code>cattle.port.description</code>.
	 */
	public void setDescription(java.lang.String value);

	/**
	 * Getter for <code>cattle.port.description</code>.
	 */
	@javax.persistence.Column(name = "description", length = 1024)
	public java.lang.String getDescription();

	/**
	 * Setter for <code>cattle.port.state</code>.
	 */
	public void setState(java.lang.String value);

	/**
	 * Getter for <code>cattle.port.state</code>.
	 */
	@javax.persistence.Column(name = "state", nullable = false, length = 128)
	public java.lang.String getState();

	/**
	 * Setter for <code>cattle.port.created</code>.
	 */
	public void setCreated(java.util.Date value);

	/**
	 * Getter for <code>cattle.port.created</code>.
	 */
	@javax.persistence.Column(name = "created")
	public java.util.Date getCreated();

	/**
	 * Setter for <code>cattle.port.removed</code>.
	 */
	public void setRemoved(java.util.Date value);

	/**
	 * Getter for <code>cattle.port.removed</code>.
	 */
	@javax.persistence.Column(name = "removed")
	public java.util.Date getRemoved();

	/**
	 * Setter for <code>cattle.port.remove_time</code>.
	 */
	public void setRemoveTime(java.util.Date value);

	/**
	 * Getter for <code>cattle.port.remove_time</code>.
	 */
	@javax.persistence.Column(name = "remove_time")
	public java.util.Date getRemoveTime();

	/**
	 * Setter for <code>cattle.port.data</code>.
	 */
	public void setData(java.util.Map<String,Object> value);

	/**
	 * Getter for <code>cattle.port.data</code>.
	 */
	@javax.persistence.Column(name = "data", length = 65535)
	public java.util.Map<String,Object> getData();

	/**
	 * Setter for <code>cattle.port.public_port</code>.
	 */
	public void setPublicPort(java.lang.Integer value);

	/**
	 * Getter for <code>cattle.port.public_port</code>.
	 */
	@javax.persistence.Column(name = "public_port", precision = 10)
	public java.lang.Integer getPublicPort();

	/**
	 * Setter for <code>cattle.port.private_port</code>.
	 */
	public void setPrivatePort(java.lang.Integer value);

	/**
	 * Getter for <code>cattle.port.private_port</code>.
	 */
	@javax.persistence.Column(name = "private_port", precision = 10)
	public java.lang.Integer getPrivatePort();

	/**
	 * Setter for <code>cattle.port.instance_id</code>.
	 */
	public void setInstanceId(java.lang.Long value);

	/**
	 * Getter for <code>cattle.port.instance_id</code>.
	 */
	@javax.persistence.Column(name = "instance_id", precision = 19)
	public java.lang.Long getInstanceId();

	/**
	 * Setter for <code>cattle.port.public_ip_address_id</code>.
	 */
	public void setPublicIpAddressId(java.lang.Long value);

	/**
	 * Getter for <code>cattle.port.public_ip_address_id</code>.
	 */
	@javax.persistence.Column(name = "public_ip_address_id", precision = 19)
	public java.lang.Long getPublicIpAddressId();

	/**
	 * Setter for <code>cattle.port.protocol</code>.
	 */
	public void setProtocol(java.lang.String value);

	/**
	 * Getter for <code>cattle.port.protocol</code>.
	 */
	@javax.persistence.Column(name = "protocol", nullable = false, length = 128)
	public java.lang.String getProtocol();

	/**
	 * Setter for <code>cattle.port.private_ip_address_id</code>.
	 */
	public void setPrivateIpAddressId(java.lang.Long value);

	/**
	 * Getter for <code>cattle.port.private_ip_address_id</code>.
	 */
	@javax.persistence.Column(name = "private_ip_address_id", precision = 19)
	public java.lang.Long getPrivateIpAddressId();

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * Load data from another generated Record/POJO implementing the common interface Port
	 */
	public void from(io.cattle.platform.core.model.Port from);

	/**
	 * Copy data into another generated Record/POJO implementing the common interface Port
	 */
	public <E extends io.cattle.platform.core.model.Port> E into(E into);
}

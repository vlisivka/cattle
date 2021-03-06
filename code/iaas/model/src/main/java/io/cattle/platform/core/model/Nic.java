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
@javax.persistence.Table(name = "nic", schema = "cattle")
public interface Nic extends java.io.Serializable {

	/**
	 * Setter for <code>cattle.nic.id</code>.
	 */
	public void setId(java.lang.Long value);

	/**
	 * Getter for <code>cattle.nic.id</code>.
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "id", unique = true, nullable = false, precision = 19)
	public java.lang.Long getId();

	/**
	 * Setter for <code>cattle.nic.name</code>.
	 */
	public void setName(java.lang.String value);

	/**
	 * Getter for <code>cattle.nic.name</code>.
	 */
	@javax.persistence.Column(name = "name", length = 255)
	public java.lang.String getName();

	/**
	 * Setter for <code>cattle.nic.account_id</code>.
	 */
	public void setAccountId(java.lang.Long value);

	/**
	 * Getter for <code>cattle.nic.account_id</code>.
	 */
	@javax.persistence.Column(name = "account_id", precision = 19)
	public java.lang.Long getAccountId();

	/**
	 * Setter for <code>cattle.nic.kind</code>.
	 */
	public void setKind(java.lang.String value);

	/**
	 * Getter for <code>cattle.nic.kind</code>.
	 */
	@javax.persistence.Column(name = "kind", nullable = false, length = 255)
	public java.lang.String getKind();

	/**
	 * Setter for <code>cattle.nic.uuid</code>.
	 */
	public void setUuid(java.lang.String value);

	/**
	 * Getter for <code>cattle.nic.uuid</code>.
	 */
	@javax.persistence.Column(name = "uuid", unique = true, nullable = false, length = 128)
	public java.lang.String getUuid();

	/**
	 * Setter for <code>cattle.nic.description</code>.
	 */
	public void setDescription(java.lang.String value);

	/**
	 * Getter for <code>cattle.nic.description</code>.
	 */
	@javax.persistence.Column(name = "description", length = 1024)
	public java.lang.String getDescription();

	/**
	 * Setter for <code>cattle.nic.state</code>.
	 */
	public void setState(java.lang.String value);

	/**
	 * Getter for <code>cattle.nic.state</code>.
	 */
	@javax.persistence.Column(name = "state", nullable = false, length = 128)
	public java.lang.String getState();

	/**
	 * Setter for <code>cattle.nic.created</code>.
	 */
	public void setCreated(java.util.Date value);

	/**
	 * Getter for <code>cattle.nic.created</code>.
	 */
	@javax.persistence.Column(name = "created")
	public java.util.Date getCreated();

	/**
	 * Setter for <code>cattle.nic.removed</code>.
	 */
	public void setRemoved(java.util.Date value);

	/**
	 * Getter for <code>cattle.nic.removed</code>.
	 */
	@javax.persistence.Column(name = "removed")
	public java.util.Date getRemoved();

	/**
	 * Setter for <code>cattle.nic.remove_time</code>.
	 */
	public void setRemoveTime(java.util.Date value);

	/**
	 * Getter for <code>cattle.nic.remove_time</code>.
	 */
	@javax.persistence.Column(name = "remove_time")
	public java.util.Date getRemoveTime();

	/**
	 * Setter for <code>cattle.nic.data</code>.
	 */
	public void setData(java.util.Map<String,Object> value);

	/**
	 * Getter for <code>cattle.nic.data</code>.
	 */
	@javax.persistence.Column(name = "data", length = 65535)
	public java.util.Map<String,Object> getData();

	/**
	 * Setter for <code>cattle.nic.instance_id</code>.
	 */
	public void setInstanceId(java.lang.Long value);

	/**
	 * Getter for <code>cattle.nic.instance_id</code>.
	 */
	@javax.persistence.Column(name = "instance_id", precision = 19)
	public java.lang.Long getInstanceId();

	/**
	 * Setter for <code>cattle.nic.network_id</code>.
	 */
	public void setNetworkId(java.lang.Long value);

	/**
	 * Getter for <code>cattle.nic.network_id</code>.
	 */
	@javax.persistence.Column(name = "network_id", precision = 19)
	public java.lang.Long getNetworkId();

	/**
	 * Setter for <code>cattle.nic.subnet_id</code>.
	 */
	public void setSubnetId(java.lang.Long value);

	/**
	 * Getter for <code>cattle.nic.subnet_id</code>.
	 */
	@javax.persistence.Column(name = "subnet_id", precision = 19)
	public java.lang.Long getSubnetId();

	/**
	 * Setter for <code>cattle.nic.vnet_id</code>.
	 */
	public void setVnetId(java.lang.Long value);

	/**
	 * Getter for <code>cattle.nic.vnet_id</code>.
	 */
	@javax.persistence.Column(name = "vnet_id", precision = 19)
	public java.lang.Long getVnetId();

	/**
	 * Setter for <code>cattle.nic.device_number</code>.
	 */
	public void setDeviceNumber(java.lang.Integer value);

	/**
	 * Getter for <code>cattle.nic.device_number</code>.
	 */
	@javax.persistence.Column(name = "device_number", precision = 10)
	public java.lang.Integer getDeviceNumber();

	/**
	 * Setter for <code>cattle.nic.mac_address</code>.
	 */
	public void setMacAddress(java.lang.String value);

	/**
	 * Getter for <code>cattle.nic.mac_address</code>.
	 */
	@javax.persistence.Column(name = "mac_address", length = 128)
	public java.lang.String getMacAddress();

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * Load data from another generated Record/POJO implementing the common interface Nic
	 */
	public void from(io.cattle.platform.core.model.Nic from);

	/**
	 * Copy data into another generated Record/POJO implementing the common interface Nic
	 */
	public <E extends io.cattle.platform.core.model.Nic> E into(E into);
}

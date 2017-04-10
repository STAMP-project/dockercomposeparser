package eu.stamp.dockerComposeParser.model.network;

import eu.stamp.dockerComposeParser.model.common.LabelsOrArgs;

public class NetworkDescription {

	NetworkDriver driver;
	LabelsOrArgs driver_opts;
	boolean enable_ipv6;
	Ipam ipam;
	boolean internal;
	LabelsOrArgs labels;
	External external;
	public NetworkDriver getDriver() {
		return driver;
	}
	public LabelsOrArgs getDriver_opts() {
		return driver_opts;
	}
	public boolean isEnable_ipv6() {
		return enable_ipv6;
	}
	public Ipam getIpam() {
		return ipam;
	}
	public boolean isInternal() {
		return internal;
	}
	public LabelsOrArgs getLabels() {
		return labels;
	}
	public External getExternal() {
		return external;
	}
	public void setDriver(NetworkDriver driver) {
		this.driver = driver;
	}
	public void setDriver_opts(LabelsOrArgs driver_opts) {
		this.driver_opts = driver_opts;
	}
	public void setEnable_ipv6(boolean enable_ipv6) {
		this.enable_ipv6 = enable_ipv6;
	}
	public void setIpam(Ipam ipam) {
		this.ipam = ipam;
	}
	public void setInternal(boolean internal) {
		this.internal = internal;
	}
	public void setLabels(LabelsOrArgs labels) {
		this.labels = labels;
	}
	public void setExternal(External external) {
		this.external = external;
	}

}

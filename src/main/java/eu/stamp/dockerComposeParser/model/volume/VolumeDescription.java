package eu.stamp.dockerComposeParser.model.volume;

import eu.stamp.dockerComposeParser.model.common.LabelsOrArgs;
import eu.stamp.dockerComposeParser.model.network.External;

public class VolumeDescription {

	String driver;
	LabelsOrArgs driver_opts;
	LabelsOrArgs labels;
	External external;
	public String getDriver() {
		return driver;
	}
	public LabelsOrArgs getDriver_opts() {
		return driver_opts;
	}
	public LabelsOrArgs getLabels() {
		return labels;
	}
	public External getExternal() {
		return external;
	}
	public void setDriver(String driver) {
		this.driver = driver;
	}
	public void setDriver_opts(LabelsOrArgs driver_opts) {
		this.driver_opts = driver_opts;
	}
	public void setLabels(LabelsOrArgs labels) {
		this.labels = labels;
	}
	public void setExternal(External external) {
		this.external = external;
	}

}

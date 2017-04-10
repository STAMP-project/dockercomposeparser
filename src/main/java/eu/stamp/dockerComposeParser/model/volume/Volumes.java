package eu.stamp.dockerComposeParser.model.volume;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class Volumes {

	private List<String> nameList = new ArrayList<String>();
	private List<VolumeDescription> volumes = new ArrayList<VolumeDescription>();

	@JsonIgnore
	public List<String> getNameList() {
		return nameList;
	}

	public List<VolumeDescription> getVolumes() {
		return volumes;
	}

	public void setVolumes(List<VolumeDescription> volumes) {
		this.volumes = volumes;
	}

	@JsonAnySetter
	public void setDynamicVolume(String name, VolumeDescription s) {
		nameList.add(name);
		volumes.add(s);
	}

}

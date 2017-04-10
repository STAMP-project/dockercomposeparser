package eu.stamp.dockerComposeParser.model.volume;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;

public class Volumes {

	private Map<String,VolumeDescription> volumes = new HashMap<String,VolumeDescription>();


	@JsonAnySetter
	public void setDynamicVolume(String name, VolumeDescription s) {
		volumes.put(name,s);
	}

	@JsonAnyGetter
	public Map<String,VolumeDescription> getDynamicVolume() {
		return volumes;
	}

}

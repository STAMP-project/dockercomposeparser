package eu.stamp.dockerComposeParser.model.network;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;

import eu.stamp.dockerComposeParser.model.volume.VolumeDescription;

public class Networks {

	private Map<String,NetworkDescription> networks = new HashMap<String,NetworkDescription>();

	


	@JsonAnySetter
	public void setDynamicNetwork(String name, NetworkDescription s) {
		networks.put(name,s);
	}

	@JsonAnyGetter
	public Map<String,NetworkDescription> getDynamicNetwork() {
		return networks;
	}

	
}

package eu.stamp.dockerComposeParser.model.network;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonAnySetter;

public class Networks {

	private List<String> nameList = new ArrayList<String>();
	private List<NetworkDescription> networks = new ArrayList<NetworkDescription>();

	
	public List<NetworkDescription> getNetworks() {
		return networks;
	}


	public void setNetworks(List<NetworkDescription> networks) {
		this.networks = networks;
	}


	@JsonAnySetter
	public void setDynamicNetwork(String name, NetworkDescription s) {
		nameList.add(name);
		networks.add(s);
	}
	
}

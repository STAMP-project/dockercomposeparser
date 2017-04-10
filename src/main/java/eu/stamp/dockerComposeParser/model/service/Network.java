package eu.stamp.dockerComposeParser.model.service;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonAnySetter;

public class Network {

	private List<String> nameList = new ArrayList<String>();
	public List<String> getNameList() {
		return nameList;
	}


	private List<NetworkDetails> networks = new ArrayList<NetworkDetails>();

	
	public Network() {
		// TODO Auto-generated constructor stub
	}

	public Network(String networks) {
		nameList.add(networks);	
	}


	
	@JsonAnySetter
	public void setDynamicService(String name, NetworkDetails s) {
		nameList.add(name);
		networks.add(s);
	}


	public List<NetworkDetails> getNetworks() {
		return networks;
	}


	public void setNetworks(List<NetworkDetails> networks) {
		this.networks = networks;
	}

	
}

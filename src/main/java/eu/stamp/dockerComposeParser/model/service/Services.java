package eu.stamp.dockerComposeParser.model.service;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonAnySetter;

public class Services {

	private List<String> nameList = new ArrayList<String>();
	private List<Service> services = new ArrayList<Service>();

	public List<Service> getServices() {
		return services;
	}

	public void setServices(List<Service> services) {
		this.services = services;
	}

	@JsonAnySetter
	public void setDynamicService(String name, Service s) {
		nameList.add(name);
		services.add(s);
	}

}

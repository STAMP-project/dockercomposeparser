package eu.stamp.dockerComposeParser.model;

import eu.stamp.dockerComposeParser.model.network.Networks;
import eu.stamp.dockerComposeParser.model.secret.Secrets;
import eu.stamp.dockerComposeParser.model.service.Services;
import eu.stamp.dockerComposeParser.model.volume.Volumes;

public class Architecture {

	String version;
	Services services;
	Networks networks;
	Volumes volumes;
	Secrets secrets;

	public Services getServices() {
		return services;
	}

	public void setServices(Services services) {
		this.services = services;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public Networks getNetworks() {
		return networks;
	}


	public Volumes getVolumes() {
		return volumes;
	}

	public Secrets getSecrets() {
		return secrets;
	}

	public void setVolumes(Volumes volumes) {
		this.volumes = volumes;
	}

	public void setSecrets(Secrets secrets) {
		this.secrets = secrets;
	}

	public void setNetworks(Networks networks) {
		this.networks = networks;
	}


}

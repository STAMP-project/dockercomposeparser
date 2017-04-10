package eu.stamp.dockerComposeParser.model.secret;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class Secrets {

	private List<String> nameList = new ArrayList<String>();
	private List<SecretDescription> secrets = new ArrayList<SecretDescription>();

	public List<SecretDescription> getSecrets() {
		return secrets;
	}

	public void setSecrets(List<SecretDescription> secrets) {
		this.secrets = secrets;
	}

	@JsonIgnore
	public List<String> getNameList() {
		return nameList;
	}

	@JsonAnySetter
	public void setDynamicVolume(String name, SecretDescription s) {
		nameList.add(name);
		secrets.add(s);
	}

}

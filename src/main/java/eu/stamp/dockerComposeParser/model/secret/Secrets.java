package eu.stamp.dockerComposeParser.model.secret;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;

public class Secrets {

	private Map<String,SecretDescription> secrets = new HashMap<String,SecretDescription>();


	@JsonAnySetter
	public void setDynamicVolume(String name, SecretDescription s) {
		
		secrets.put(name,s);
	}
	
	@JsonAnyGetter
	public Map<String,SecretDescription> getDynamicVolume() {
		
		return secrets;
	}

}

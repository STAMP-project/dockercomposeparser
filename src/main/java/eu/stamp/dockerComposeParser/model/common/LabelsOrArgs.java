package eu.stamp.dockerComposeParser.model.common;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnySetter;

public class LabelsOrArgs {
	
	Map<String,String> entries = new HashMap<String, String>();
	
	@JsonAnySetter
    public void setDynamicService(String name, String s) {
       this.entries.put(name, s) ;
    }

}

package eu.stamp.dockerComposeParser.model.common;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;

public class LabelsOrArgs {
	
	Map<String,String> entries = new HashMap<String, String>();
	
	@JsonAnySetter
    public void setDynamicService(String name, String s) {
       this.entries.put(name, s) ;
    }
	
	@JsonAnyGetter
    public Map<String,String> getDynamicService() {
		/*StringBuffer b = new StringBuffer();
		for (String e : entries.keySet()){
			b.append(e + ":"+ entries.get(e)+ "\n");
			
		}
		return b.toString();*/
		return entries;
	
	}

}

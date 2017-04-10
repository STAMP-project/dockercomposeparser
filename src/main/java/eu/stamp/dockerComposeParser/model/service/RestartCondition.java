package eu.stamp.dockerComposeParser.model.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.lang3.StringUtils;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum RestartCondition {
	onfailure
	, none, any;
	
	
    private static Map<String, RestartCondition> namesMap = new HashMap<String, RestartCondition>(3);

    static {
        namesMap.put("on-failure", RestartCondition.onfailure);
        namesMap.put("none", none);
        namesMap.put("any", any);
    }
	  @JsonCreator
	    public static RestartCondition forValue(String value) {
	        return namesMap.get(StringUtils.lowerCase(value));
	    }

	    @JsonValue
	    public String toValue() {
	        for (Entry<String, RestartCondition> entry : namesMap.entrySet()) {
	            if (entry.getValue() == this)
	                return entry.getKey();
	        }

	        return null; // or fail
	    }
}

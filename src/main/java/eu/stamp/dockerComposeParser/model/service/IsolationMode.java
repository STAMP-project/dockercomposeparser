package eu.stamp.dockerComposeParser.model.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.lang3.StringUtils;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum IsolationMode {
	_default, process , hyperv;
	
    private static Map<String, IsolationMode> namesMap = new HashMap<String, IsolationMode>(3);

    static {
        namesMap.put("default", IsolationMode._default);
        namesMap.put("process", process);
        namesMap.put("hyperv", IsolationMode.hyperv);
    }
	  @JsonCreator
	    public static IsolationMode forValue(String value) {
	        return namesMap.get(StringUtils.lowerCase(value));
	    }

	    @JsonValue
	    public String toValue() {
	        for (Entry<String, IsolationMode> entry : namesMap.entrySet()) {
	            if (entry.getValue() == this)
	                return entry.getKey();
	        }

	        return null; // or fail
	    }

}

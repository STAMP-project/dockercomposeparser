package eu.stamp.dockerComposeParser.model.network;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.lang3.StringUtils;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum NetworkDriver {

	bridge,overlay,_default;
	 private static Map<String, NetworkDriver> namesMap = new HashMap<String, NetworkDriver>(3);

	    static {
	        namesMap.put("default", NetworkDriver._default);
	        namesMap.put("overlay", NetworkDriver.overlay);
	        namesMap.put("bridge", NetworkDriver.bridge);
	    }
		  @JsonCreator
		    public static NetworkDriver forValue(String value) {
		        return namesMap.get(StringUtils.lowerCase(value));
		    }

		    @JsonValue
		    public String toValue() {
		        for (Entry<String, NetworkDriver> entry : namesMap.entrySet()) {
		            if (entry.getValue() == this)
		                return entry.getKey();
		        }

		        return null; // or fail
		    }
}

package example.quickstart.model;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnySetter;

/**
 * This Class doesn't have any setter method .
 * AnySetter Method , will take JSON  key and Value and save to internal map.
 * @author satish
 *
 */
public class PropContainer {
    // public String lastName;
    private Map<String, Object> properties;

    PropContainer() {
	properties = new HashMap<>();
    }

    @JsonAnySetter
    void addProperty(String fieldName, Object value) {
	properties.put(fieldName, value);
    }

    public Iterator<Map.Entry<String, Object>> iterator() {
	return properties.entrySet().iterator();
    }
}
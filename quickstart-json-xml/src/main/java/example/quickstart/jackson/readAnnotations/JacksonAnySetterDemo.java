package example.quickstart.jackson.readAnnotations;

import java.util.Iterator;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;

import example.quickstart.model.PropContainer;

public class JacksonAnySetterDemo {

    public static void main(String[] args) throws Exception {
	String jsonContent = "{" + "   \"id\": 820787," + "   \"firstName\": \"Pierre\","
		+ "   \"lastName\": \"Francois\"" + "}";

	ObjectMapper mapper = new ObjectMapper();
	PropContainer pc = mapper.readValue(jsonContent, PropContainer.class);

	Iterator<Map.Entry<String, Object>> iter = pc.iterator();

	while (iter.hasNext()) {
	    Map.Entry<String, Object> entry = iter.next();
	    System.out.println("Key: %s, Value: %s%n" + entry.getKey() + entry.getValue());
	}
    }

}

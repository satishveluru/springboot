package example.quickstart.jackson.readAnnotations;

import com.fasterxml.jackson.databind.ObjectMapper;

import example.quickstart.model.Vehicle;

public class JacksonCreatorDemo {

    public static void main(String[] args) throws Exception {
	String jsonContent = "{" + "   \"make\": \"Ford\"," + "   \"model\": \"F150\"," + "   \"year\": 2008" + "}";
	ObjectMapper mapper = new ObjectMapper();
	Vehicle vehicle = mapper.readValue(jsonContent, Vehicle.class);
	System.out.println("Make %s, Model %s, Year %d%n"+  vehicle.getMake()+ vehicle.getModel()+ vehicle.getYear());
    }
}
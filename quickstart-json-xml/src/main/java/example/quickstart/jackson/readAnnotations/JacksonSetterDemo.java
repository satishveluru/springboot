package example.quickstart.jackson.readAnnotations;

import com.fasterxml.jackson.databind.ObjectMapper;

import example.quickstart.model.Employee;
import example.quickstart.model.Person;

public class JacksonSetterDemo {
    public static void main(String[] args) throws Exception {
	String jsonContent = "{" + "   \"id\": 820787," + "   \"firstName\": \"Pierre\"" + "}";

	ObjectMapper mapper = new ObjectMapper();
	Person person = mapper.readValue(jsonContent, Person.class);
	System.out.println(person);
	Employee employee = mapper.readValue(jsonContent, Employee.class);
	System.out.println(employee);

    }
}

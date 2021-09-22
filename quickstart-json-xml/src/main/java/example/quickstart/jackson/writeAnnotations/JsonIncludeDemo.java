package example.quickstart.jackson.writeAnnotations;

import java.io.PrintWriter;
import java.io.Writer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.ObjectMapper;

import example.quickstart.model.Employee;
import example.quickstart.model.WriteEmploy3;
import example.quickstart.model.WriteEmployee;
import example.quickstart.model.WritePerson;

/**
 * 
 * Using JsonInclude to Skip or Serialize Empty or Null Properties
 * 
 * JsonInclude.Include enum’s constants to its value parameter. 
 * Here are three examples:
 * 
 * mapper.disable(JsonGenerator.Feature.AUTO_CLOSE_TARGET); 
 * prevents the System.out stream from being closed after 
 * mapper.writeValue();
 * 
 * @author satish
 *
 */
public class JsonIncludeDemo {

    public static void main(String[] args) throws Exception {

	Writer out = new PrintWriter(System.out);
	ObjectMapper mapper = new ObjectMapper();
	mapper.disable(JsonGenerator.Feature.AUTO_CLOSE_TARGET);
	WritePerson person1 = new WritePerson();
	mapper.writeValue(out, person1);
	Employee person2 = new Employee();
	mapper.writeValue(out, person2);
	WriteEmploy3 person3 = new WriteEmploy3();
	mapper.writeValue(out, person3);
	WriteEmployee person4 = new WriteEmployee();
	mapper.writeValue(out, person4);
    }
}

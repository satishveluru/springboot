package example.quickstart.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class WriteEmploy3 {


       public int personID = 0;
       public String firstName = null;
       public String lastName = "Doe";
       public List<String> phoneNumbers = new ArrayList<>();
    }

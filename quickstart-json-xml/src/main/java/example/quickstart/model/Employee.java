package example.quickstart.model;

import com.fasterxml.jackson.annotation.JsonSetter;

public class Employee {
    
     /**
     * Name of the JSON field to match to this setter method
     */
    @JsonSetter("id")
    private int personID;

    private String firstName;

    public int getPersonID() {
	return personID;
    }

    public String getFirstName() {
	return firstName;
    }

    public void setFirstName(String firstName) {
	this.firstName = firstName;
    }

    @Override
    public String toString() {
	return personID + ": " + firstName;
    }
}

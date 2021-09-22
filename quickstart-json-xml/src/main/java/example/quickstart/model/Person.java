package example.quickstart.model;

import com.fasterxml.jackson.annotation.JsonSetter;

public class Person {
    private int personID;
    private String firstName;

    public int getPersonID() {
	return personID;
    }

    @JsonSetter("id")
    public void setPersonID(int personID) {
	this.personID = personID;
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
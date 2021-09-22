package example.quickstart.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Vehicle {
    private String make, model;
    private int year;

    @JsonCreator
    Vehicle(@JsonProperty("make") String make, @JsonProperty("model") String model, @JsonProperty("year") int year) {
	this.make = make;
	this.model = model;
	this.year = year;
    }

    public String getMake() {
	return make;
    }

    public String getModel() {
	return model;
    }

    public int getYear() {
	return year;
    }
}
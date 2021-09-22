package example.quickstart.entity;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(as = Address.class)
final public class Address {

    private String streetName;
    private String streetNo;

    public Address() {
	super();
    }

    public Address(String x, String y) {
	this.streetName = x;
	this.streetNo = y;
    }

    @Override
    public String toString() {
	return String.format("Address{streetName=%d, streetNo=%d}", streetName, streetNo);
    }

    public String getStreetName() {
	return streetName;
    }

    public void setStreetName(String streetName) {
	this.streetName = streetName;
    }

    public String getStreetNo() {
	return streetNo;
    }

    public void setStreetNo(String streetNo) {
	this.streetNo = streetNo;
    }

}

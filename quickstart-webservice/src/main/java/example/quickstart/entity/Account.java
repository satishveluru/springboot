package example.quickstart.entity;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(as = Address.class)
public class Account {
    private String id;
    private String name;
    private String status;
    private Address address;

    public Account() {
	super();
    }

    public Account(String id) {
	this.id = id;
    }

    public Account(String id, Address point) {
	this.id = id;
	this.address = point;
    }

    @Override
    public String toString() {
	return String.format("Person{id=%s, point=%s}", id, address);
    }

    public String getId() {
	return id;
    }

    public Address getAddress() {
	return address;
    }

    public void setAddress(Address address) {
	this.address = address;
    }

    public void setId(String id) {
	this.id = id;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public String getStatus() {
	return status;
    }

    public void setStatus(String status) {
	this.status = status;
    }

}

package example.quickstart.jackson.annotation.misc;

import com.fasterxml.jackson.annotation.JsonRawValue;

public class RawBean {
    public String name;

    @JsonRawValue
    public String json;

    public RawBean() {

    }

    public RawBean(final String name, final String json) {
	this.name = name;
	this.json = json;
    }
}
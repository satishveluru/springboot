package example.quickstart.jackson.annotation.misc;

import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("myFilter")
public class BeanWithFilter {
    public int id;
    public String name;

    public BeanWithFilter() {

    }

    public BeanWithFilter(final int id, final String name) {
	this.id = id;
	this.name = name;
    }
}
package com.example.construct;

import java.util.HashMap;

import org.junit.Before;

import example.quickstart.service.impl.privates.Employee;

public abstract class BaseEmployeeTest {

	protected HashMap<String, Employee> employee ;
	
	@Before
	public void setUp() {
		employee = new HashMap<String, Employee>();
		employee.put("1", new Employee("English", "Will"));
		employee.put("2", new Employee("Cushing", "Robert"));
	}
}

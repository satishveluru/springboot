package com.example.construct;

import org.junit.Before;
import org.junit.Test;

import example.quickstart.service.impl.privates.Employee;
import example.quickstart.service.impl.privates.EmployeeService;
import example.quickstart.service.impl.privates.EmployeeServiceImpl;

public class EmployeeServiceTest extends BaseEmployeeTest {
     
	EmployeeService service;
	@Before
	public void setUp() {
		super.setUp();
		service = new EmployeeServiceImpl();
	}
	
	@Test
	public void someTest() throws Exception {
		for(Employee emp:employee.values()) {
			service.doSomething(emp);
		}
	}
}

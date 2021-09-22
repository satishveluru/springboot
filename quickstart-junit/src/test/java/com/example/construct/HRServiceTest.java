package com.example.construct;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import example.quickstart.service.impl.privates.Employee;
import example.quickstart.service.impl.privates.HRService;

public class HRServiceTest {
	String familyName = "Smith";
	static HRService service = new HRService();

	@Test
	public void when_one_employee_RETURNS_familyName01() throws Exception {
		Employee johnSmith = new Employee(familyName, "John");
		String id = service.generateUniqueIdFor(johnSmith);
		assertEquals(familyName + "01", id);
	}

	//This test will fail, to fix this problem remove the static modifier
	@Test
	public void when_many_employees_RETURNS_familyName_and_count() {
		Employee johnSmith = new Employee(familyName, "John");
		Employee bobSmith = new Employee(familyName, "Bob");
		String id = service.generateUniqueIdFor(johnSmith);
		id = service.generateUniqueIdFor(bobSmith);
		assertEquals(familyName + "02", id);
	}

}

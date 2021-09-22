package com.example.construct;

import org.junit.Before;
import org.junit.Test;

import example.quickstart.service.impl.privates.PrivateMethod;

public class PrivateMethodTest {
	PrivateMethod privateMethod;
	
	@Before
	public void setUp() {
		privateMethod = new PrivateMethod();
	}
	
	@Test
	public void validate() throws Exception {
		privateMethod.validate(null);
	}
}

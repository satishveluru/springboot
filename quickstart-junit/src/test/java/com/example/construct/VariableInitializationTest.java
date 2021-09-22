package com.example.construct;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import example.quickstart.service.impl.constructor.DatabaseDependency;
import example.quickstart.service.impl.instantiate.VariableInitialization;

public class VariableInitializationTest {
	@Mock DatabaseDependency dependency;
	VariableInitialization initialization;
	
	@Before
	public void setUp() throws Exception {
		initialization = new VariableInitialization(dependency);
	}
	
	@Test
	public void sanity() throws Exception {
		
	}
}

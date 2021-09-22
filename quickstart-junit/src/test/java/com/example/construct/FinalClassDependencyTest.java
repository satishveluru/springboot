package com.example.construct;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import example.quickstart.service.impl.finals.FinalClassDependency;
import example.quickstart.service.impl.finals.FinalDepencyClass;

@RunWith(MockitoJUnitRunner.class)
public class FinalClassDependencyTest {
	@Mock
	FinalDepencyClass finalDependency;
	
	FinalClassDependency test;

	@Before
	public void setUp() {
		test = new FinalClassDependency(finalDependency);
	}
	@Test
	public void testMe() throws Exception {
		Mockito.doNothing().when(finalDependency).poison();
		test.testMe();
	}
}

package com.example.construct;

import static org.mockito.Mockito.doNothing;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import example.quickstart.service.impl.finals.FinalDependency;
import example.quickstart.service.impl.finals.FinalMethodDependency;

@RunWith(MockitoJUnitRunner.class)
public class FinalMethodDependencyTest {
	@Mock
	FinalDependency finalDependency;
	FinalMethodDependency methodDependency;

	@Before
	public void setUp() {
		methodDependency = new FinalMethodDependency(finalDependency);
	}

	@Test
	public void testSomething() throws Exception {
		doNothing().when(finalDependency).doSomething();
		methodDependency.testMe();
	}
}

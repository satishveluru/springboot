package com.example.construct;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.verify;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import example.quickstart.misc.matcher.Decorator;
import example.quickstart.misc.matcher.Facade;
import example.quickstart.misc.matcher.PrinterService;

@RunWith(MockitoJUnitRunner.class)
public class FacadeTest {

	@Mock PrinterService mockService;
	Facade facade;
	
	@Before
	public void setUp() throws Exception {
		facade = new Facade(new Decorator(), mockService);
	}

	@Test
	public void test() {
		String input = "hello";
		doNothing().when(mockService).print(anyString());
		facade.process(input);
		verify(mockService).print(anyString());
	}

}

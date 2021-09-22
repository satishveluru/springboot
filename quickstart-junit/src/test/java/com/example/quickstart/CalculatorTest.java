package com.example.quickstart;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import example.quickstart.service.Calculator;

public class CalculatorTest {

	@Test
	public void adds_ints() throws Exception {
		Calculator<Integer> calc = new Calculator<Integer>();
		assertEquals("3", calc.add(1,1,1));
	}
	
	@Test
	public void adds_longs() throws Exception {
		Calculator<Long> calc = new Calculator<Long>();
		assertEquals("3", calc.add(1l,1l,1l));
	}
	
	@Test
	public void adds_doubles() throws Exception {
		Calculator<Double> calc = new Calculator<Double>();
		assertEquals("2.2", calc.add(1.1d,1.1d));
	}
}

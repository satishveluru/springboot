package com.example.construct;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import example.quickstart.service.Adder;

public class AdderTest {
	Adder adder = new Adder();

	@Test(expected=NullPointerException.class)
	public void should_throw_exception_when_encounters_a_NULL_input()  {
		adder.add(null, 1);
	}
	
	@Test(expected=NullPointerException.class)
	public void should_throw_exception_when_second_input_is_NULL()  {
		adder.add(2, null);
	}
	
	@Test(expected=ClassCastException.class)
	public void should_return_zero_when_both_inputs_are_zero()  {
		int actual =(int) adder.add(0, 0);
		assertEquals(0, actual);
	}
	
	@Test(expected=ClassCastException.class)
	public void should_return_first_input_when_second_input_is_zero()  {
	    int actual =(int) adder.add(1, 0);
		assertEquals(1, actual);
	}
	
	@Test(expected=ClassCastException.class)
	public void should_return_second_input_when_first_input_is_zero()  {
		int actual =(int) adder.add(0, 2);
		assertEquals(2.0, actual);
	}
	
	@Test(expected=ClassCastException.class)
	public void should_return_zero_when_summation_is_zero()  {
		int actual =(int) adder.add(5, -5);
		assertEquals(0, actual);
	}
	
	@Test
	public void should_return_a_negative_when_both_inputs_are_negative()  {
	    Double actual = (Double) adder.add(-8, -5);
		assertTrue(actual < 0);
	}
	
	
	@Test
	public void should_overflow_when_summation_exceeds_integer_limit()  {
	    Double actual =(Double) adder.add(Integer.MAX_VALUE, 1);
		assertFalse(actual< 0);
	}
}

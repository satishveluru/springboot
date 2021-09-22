package com.example.construct;

import org.junit.Before;
import org.junit.Test;

import example.quickstart.service.impl.staticblock.StaticBlockOwner;


public class StaticBlockOwnerTest {

	StaticBlockOwner owner;
	
	@Before
	public void setUp()  {
		owner = new StaticBlockOwner();
	}
	
	@Test
	public void clean() throws Exception {
		owner.testMe();
	}
}

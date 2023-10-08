package com.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksExample {
	@Before(order = 0)
	public void beforeMethod() {
		System.out.println("Before hooks methos example");
	}
	@After(order = 1)
	public void afterMethod() {
		System.out.println("After hooks method example");
	}
	@Before(order = 1)
	public void beforeMethodOne() {
		System.out.println("Before hooks methos exampleOne");
	}
	@After(order = 0)
	public void afterMethodOne() {
		
		System.out.println("After hooks method exampleOne");
		
	}
}

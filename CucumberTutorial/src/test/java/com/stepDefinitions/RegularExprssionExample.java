package com.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class RegularExprssionExample {
	
	@Given("user has {int} laptop")
	public void user_has_laptop(Integer count) {
		System.out.println("User has Laptop count " + count);
	    
	}
	@Given("user has {int} mobilePhone")
	public void user_has_mobile_phone(Integer count) {
	    System.out.println("User has Mobile count of " + count);
	}
	@Then("user has {int} Tablet")
	public void user_has_tablet(Integer count) {
		
		System.out.println("User has Tablet count of "+ count);
	    
	}
	
	@Then("user name is {string}")
	public void user_name_is(String name ) {
	    System.out.println("User name is " + name);
	}




}

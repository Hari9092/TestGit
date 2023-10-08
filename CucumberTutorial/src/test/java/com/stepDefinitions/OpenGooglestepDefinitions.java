package com.stepDefinitions;

import static org.junit.jupiter.api.Assertions.assertAll;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class OpenGooglestepDefinitions {
	
	WebDriver myDriver;
	
	
	@Given("^user is on te login page$")
	public void user_is_on_te_login_page() {
		
	    myDriver  = new ChromeDriver();
	    myDriver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	}
	
	@When("^user enters the valid credentials$")
	public void user_enters_the_valid_credentials() {
		myDriver.findElement(By.name("username")).sendKeys("Admin");
		myDriver.findElement(By.name("password")).sendKeys("admin123");
	   
		
	}
	
	@When("^clicks the login button$")
	public void clicks_the_login_button() {
		myDriver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	   
		
	}
	
	@Then("^the user should see the home page$")
	public void the_user_should_see_the_home_page() {
		Boolean status = myDriver.findElement(By.xpath("//h6[text()='Dashboard']")).isDisplayed();
		Assert.assertTrue(status);
		
		
	}



	
	

}

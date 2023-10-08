package com.stepDefinitions;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class LoginDataWithHeaderStepDefinition {
	
	WebDriver myDriver ;
	
	
	@Given("user2 to enter the login page with header")
	public void user2_to_enter_the_login_page_with_header() {
	    
		myDriver = new ChromeDriver();
		myDriver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	}
	
	
	@SuppressWarnings("deprecation")
	@When("user2 enters the valid credentials with username and password of below mentioned")
	public void user2_enters_the_valid_credentials_with_username_and_password_of_below_mentioned(io.cucumber.datatable.DataTable dataTable) {
	    
		myDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		List<Map<String, String>>keyValuePair = dataTable.asMaps(String.class, String.class);
		String username = keyValuePair.get(0).get("username");
		String password = keyValuePair.get(0).get("password");
		myDriver.findElement(By.xpath("//*[@name='username']")).sendKeys(username);
		myDriver.findElement(By.xpath("//*[@type='password']")).sendKeys(password);
		
		
		
		
	}
	
	
	@When("clicks2 the login button after enter the credential")
	public void clicks2_the_login_button_after_enter_the_credential() {
	    
		myDriver.findElement(By.xpath("//*[text()=' Login ']")).click();
		
		
	}
	
	@Then("the user2 should see the home page after the sucessful login web Page")
	public void the_user2_should_see_the_home_page_after_the_sucessful_login_web_page() {
		
		Boolean statusWeb = myDriver.findElement(By.xpath("//h6[text()='Dashboard']")).isDisplayed();
		Assert.assertTrue(statusWeb);
		myDriver.close();
		
	}


}

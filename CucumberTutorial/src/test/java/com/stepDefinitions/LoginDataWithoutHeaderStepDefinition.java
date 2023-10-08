package com.stepDefinitions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class LoginDataWithoutHeaderStepDefinition {
	
	WebDriver myDriver;
	
	
	@Given("user1 to enter the login page")
	public void user1_to_enter_the_login_page() {
		
		myDriver = new ChromeDriver();
		myDriver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    
	}
	
	
	@SuppressWarnings("deprecation")
	@When("user1 enters the valid credentials with username and password of")
	public void user1_enters_the_valid_credentials_with_username_and_password_of(io.cucumber.datatable.DataTable dataTable) {
	   
		myDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		List<String> crendential = dataTable.asList(String.class);
		String username = crendential.get(0);
		String password = crendential.get(1);
		myDriver.findElement(By.xpath("//*[@name='username']")).sendKeys(username);
		myDriver.findElement(By.xpath("//*[@type='password']")).sendKeys(password);
		myDriver.findElement(By.xpath("//*[text()=' Login ']")).click();

	}
	
	
	@Then("the user1 should see the home page after the sucessful login")
	public void the_user1_should_see_the_home_page_after_the_sucessful_login() {
		
		myDriver.findElement(By.xpath("//*[text()=' Login ']")).click();
	   
		Boolean statusWeb = myDriver.findElement(By.xpath("//h6[text()='Dashboard']")).isDisplayed();
		Assert.assertTrue(statusWeb);
		myDriver.close();
		
	}




}

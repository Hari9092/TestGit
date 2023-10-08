package com.stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class LoginWithDataStepDefinition {
	WebDriver myDriver;
	
	
	@Given("user to enter the login page")
	public void user_to_enter_the_login_page() {

		myDriver = new ChromeDriver();
		myDriver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@When("user enters the valid credentials with username and password of {string} and {string}")
	public void user_enters_the_valid_credentials_with_username_and_password_of_and(String uName, String pWord) {
		myDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		myDriver.findElement(By.xpath("//*[@name='username']")).sendKeys(uName);
		myDriver.findElement(By.xpath("//*[@type='password']")).sendKeys(pWord);
	}

	@When("clicks the login button after enter the credential")
	public void clicks_the_login_button_after_enter_the_credential() {

		myDriver.findElement(By.xpath("//*[text()=' Login ']")).click();


	}

	@Then("the user should see the home page after the sucessful login")
	public void the_user_should_see_the_home_page_after_the_sucessful_login() {

		Boolean statusWeb = myDriver.findElement(By.xpath("//h6[text()='Dashboard']")).isDisplayed();
		Assert.assertTrue(statusWeb);
		myDriver.close();

	}
}

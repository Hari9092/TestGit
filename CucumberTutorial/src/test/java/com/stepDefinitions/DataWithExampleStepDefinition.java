package com.stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class DataWithExampleStepDefinition {
	WebDriver myDriver;
	
	@Given("lanch HRm login Page")
	public void lanch_h_rm_login_page() {
		myDriver = new ChromeDriver();
		myDriver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	}
	
	@SuppressWarnings("deprecation")
	@Then("enter the Credentials {string} and {string}")
	public void enter_the_credentials(String uname,String pword) {
		myDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		myDriver.findElement(By.xpath("//*[@name='username']")).sendKeys(uname);
		myDriver.findElement(By.xpath("//*[@type='password']")).sendKeys(pword);
		
		
	}
	
	
	@Then("click on login Button")
	public void click_on_login_button() {
	   
		myDriver.findElement(By.xpath("//*[text()=' Login ']")).click();
		myDriver.close();
	}



}

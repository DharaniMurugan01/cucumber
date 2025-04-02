package Stepdefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class step {
	WebDriver driver;
	@Before
	public void setup() {
	driver=new ChromeDriver();
    driver.get("https://www.saucedemo.com/v1/index.html");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@After
	public void teardown() {
	   driver.quit();
	}
	@When("I enter {string} as username1")
	public void i_enter_as_username1(String string) {
		WebElement ele1=driver.findElement(By.xpath("//input[@name='user-name']"));
		   ele1.sendKeys(string);
	}

	@When("I enter {string} as password1")
	public void i_enter_as_password1(String string) {
		WebElement ele1=driver.findElement(By.xpath("//input[@name='password']"));
		   ele1.sendKeys(string);
	}

	@When("I click on the login button1")
	public void i_click_on_the_login_button1() {
		WebElement ele1=driver.findElement(By.xpath("//input[@id='login-button']"));
		   ele1.click();
	}

	@Then("I should be redirected to the products pagee")
	public void i_should_be_redirected_to_the_products_pagee() {
	}

	@Then("I should see an error messagee")
	public void i_should_see_an_error_messagee() {
	}

	@Then("I should see an error message in password fieldd")
	public void i_should_see_an_error_message_in_password_fieldd() {
	    
	}

	@Then("I should see an error message in both fieldsd")
	public void i_should_see_an_error_message_in_both_fieldsd() {
	    
	}
}

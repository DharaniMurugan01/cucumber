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
	@Then("I should {string}")
	public void i_should(String string) {
		if(string.equals("be redirected to the products pageee")) {
		    //WebElement tit=driver.findElement(By.xpath("//span[@class='title']"));
		    String ex="Swag Labs";
		    String ac=driver.getTitle();
		    System.out.println(ac);
		    Assert.assertEquals(ex,ac);
	    }
	    else if(string.equals("see an error messageee")) {
	    	WebElement txt=driver.findElement(By.xpath("//h3[@data-test='error']"));
			String ex="Username is required";
			String ac=txt.getText();
			Assert.assertTrue(ac.contains(ex));
	    }
	    else if(string.equals("see an error message in password fielddds")) {
	    	WebElement txt=driver.findElement(By.xpath("//h3[@data-test='error']"));
			String ex="Password is required";
			String ac=txt.getText();
			Assert.assertTrue(ac.contains(ex));
	    }
	    else if(string.equals("see an error message in both fieldsd")) {
	    	WebElement err=driver.findElement(By.xpath("//h3"));
		    String ex="Epic sadface: Username and password do not match any user in this service";
		    String ac=err.getText();
		    Assert.assertEquals(ex,ac);
	    }
	}
}

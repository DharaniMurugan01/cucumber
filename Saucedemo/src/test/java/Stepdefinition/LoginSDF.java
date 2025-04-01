package Stepdefinition;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class LoginSDF {
	WebDriver driver=new ChromeDriver();
	@Given("I am on the Swag Labs login page")
	public void i_am_on_the_swag_labs_login_page() {
	    driver.get("https://www.saucedemo.com/v1/index.html");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    }

	@When("I enter {string} as username")
	public void i_enter_as_username(String un) {
	   WebElement ele1=driver.findElement(By.xpath("//input[@name='user-name']"));
	   ele1.sendKeys(un);
	}

	@When("I enter {string} as password")
	public void i_enter_as_password(String pass) {
		WebElement ele1=driver.findElement(By.xpath("//input[@name='password']"));
		   ele1.sendKeys(pass);
	}

	@When("I click on the login button")
	public void i_click_on_the_login_button() {
		WebElement ele1=driver.findElement(By.xpath("//input[@id='login-button']"));
		   ele1.click();
	}

	@Then("I should be redirected to the products page")
	public void i_should_be_redirected_to_the_products_page() {
	  String k=driver.findElement(By.xpath("//div[text()='Products']")).getText();
	  String l="Products";
	  Assert.assertEquals(k,l);
	  System.out.println("successfully login");
	}
	@Then("I should see an error message")
	public void i_should_see_an_error_message() {
	   String k=driver.findElement(By.xpath("//h3[@data-test='error']")).getText();
	   String m="Username is required";
	   Assert.assertTrue(k.contains(m));
	   System.out.println("username is required");
	}
	@When("I enter {string} as passwordd")
	public void i_enter_as_passwordd(String pass) {
		WebElement ele1=driver.findElement(By.xpath("//input[@name='password']"));
		   ele1.sendKeys(pass);
	}
	@Then("I should see an error message in password field")
	public void i_should_see_an_error_message_in_password_field() {
		String k=driver.findElement(By.xpath("//h3[@data-test='error']")).getText();
		   String m="Password is required";
		   System.out.println(k);
		   Assert.assertTrue(k.contains(m));
		   System.out.println("Password is required");
	}
	@Then("I should see an error message in both field")
	public void i_should_see_an_error_message_in_both_field() {
		String k=driver.findElement(By.xpath("//h3[@data-test='error']")).getText();
		   String m="Username and password do not match any user in this service";
		   Assert.assertTrue(k.contains(m));
		   System.out.println("Both are invalid");
	}
	@Then("quit the application")
	public void quit_the_application() {
	   driver.quit();
	}
}
// package Stepdefinition;
//import java.time.Duration;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.Assert;
//
//import io.cucumber.java.After;
//import io.cucumber.java.AfterStep;
//import io.cucumber.java.Before;
//import io.cucumber.java.BeforeStep;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//public class LoginSDF {
//	WebDriver driver;
//	@Before("@chrome")
//	public void setup() {
//		driver=new ChromeDriver();
//	    driver.get("https://www.saucedemo.com/v1/index.html");
//	    driver.manage().window().maximize();
//	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//	    }
//	@Before("@Firefox")
//	public void setup1() {
//		driver=new FirefoxDriver();
//	    driver.get("https://www.saucedemo.com/v1/index.html");
//	    driver.manage().window().maximize();
//	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//	    }
//    @BeforeStep
//    public void set() {
//    	System.out.println("before step running");
//    	}
//    @AfterStep
//    public void after() {
//    	System.out.println("After step running");
//    	}
//	@When("I enter {string} as username")
//	public void i_enter_as_username(String un) {
//	   WebElement ele1=driver.findElement(By.xpath("//input[@name='user-name']"));
//	   ele1.sendKeys(un);
//	}
//
//	@When("I enter {string} as password")
//	public void i_enter_as_password(String pass) {
//		WebElement ele1=driver.findElement(By.xpath("//input[@name='password']"));
//		   ele1.sendKeys(pass);
//	}
//
//	@When("I click on the login button")
//	public void i_click_on_the_login_button() {
//		WebElement ele1=driver.findElement(By.xpath("//input[@id='login-button']"));
//		   ele1.click();
//	}
//
//	@Then("I should be redirected to the products page")
//	public void i_should_be_redirected_to_the_products_page() {
//	  String k=driver.findElement(By.xpath("//div[text()='Products']")).getText();
//	  String l="Products";
//	  Assert.assertEquals(k,l);
//	  System.out.println("successfully login");
//	}
//	@Then("I should see an error message")
//	public void i_should_see_an_error_message() {
//	   String k=driver.findElement(By.xpath("//h3[@data-test='error']")).getText();
//	   String m="Username is required";
//	   Assert.assertTrue(k.contains(m));
//	   System.out.println("username is required");
//	}
//	@When("I enter {string} as passwordd")
//	public void i_enter_as_passwordd(String pass) {
//		WebElement ele1=driver.findElement(By.xpath("//input[@name='password']"));
//		   ele1.sendKeys(pass);
//	}
//	@Then("I should see an error message in password field")
//	public void i_should_see_an_error_message_in_password_field() {
//		String k=driver.findElement(By.xpath("//h3[@data-test='error']")).getText();
//		   String m="Password is required";
//		   System.out.println(k);
//		   Assert.assertTrue(k.contains(m));
//		   System.out.println("Password is required");
//	}
//	@Then("I should see an error message in both field")
//	public void i_should_see_an_error_message_in_both_field() {
//		String k=driver.findElement(By.xpath("//h3[@data-test='error']")).getText();
//		   String m="Username and password do not match any user in this service";
//		   Assert.assertTrue(k.contains(m));
//		   System.out.println("Both are invalid");
//	}
//	@After
//	public void teardown() {
//	   driver.quit();
//	}
//}
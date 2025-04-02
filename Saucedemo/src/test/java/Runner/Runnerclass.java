package Runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions( plugin = {
        "pretty",
        "html:target/cucumber-reports/Cucumber.html",
        "json:target/cucumber-reports/Cucumber.json"
    },features="src\\test\\resources\\com\\features\\Login.feature",glue="Stepdefinition")
public class Runnerclass extends  AbstractTestNGCucumberTests{
	
}

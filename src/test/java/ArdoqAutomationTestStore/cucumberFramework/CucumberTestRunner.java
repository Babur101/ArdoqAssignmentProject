package ArdoqAutomationTestStore.cucumberFramework;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {"pretty","html:target/cucumber-html-report.html","json:target/cucumber.json"},
        features = {"src/test/resources"},
        tags = "@CreateUserTest"
)
public class CucumberTestRunner {
}

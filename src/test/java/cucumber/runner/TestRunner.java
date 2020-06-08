package cucumber.runner;



//To show this is the cucumber.runner class, Cucumber use JUnit to run so we need to create the test cucumber.runner class which use JUnit annotation @RunWith to show which is the cucumber.runner class

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = {"cucumber"},
        features = {"src/test/resources/functional"},

       //plugin report
        plugin = { "pretty", "json:target/cucumber-reports/Cucumber.json",
                "junit:target/cucumber-reports/Cucumber.xml",
                "html:target/cucumber-reports"},
        monochrome = true
)
public class TestRunner {


}

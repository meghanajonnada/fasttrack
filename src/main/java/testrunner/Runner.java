package testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = {"stepDefinition","testrunner"},
        features = {"src/test/resources/Feature/"},
       plugin = { "html:target/Report" ,"json:target/cucumber-report/cucumber.json"},
        monochrome = true
        )

public class Runner {

}



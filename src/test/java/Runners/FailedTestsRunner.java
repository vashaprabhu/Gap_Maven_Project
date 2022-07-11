package Runners;

import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(
    monochrome = true,
    features = "@target/rerun.txt", //Cucumber picks the failed scenarios from this file 
    plugin = {"pretty", "html:target/site/cucumber-pretty",
            "json:target/cucumber.json"}
  )
public class FailedTestsRunner {

}

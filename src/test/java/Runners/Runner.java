package Runners;

import org.junit.runner.RunWith;
import org.testng.annotations.Listeners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(features = {"src\\test\\java\\FeatureFiles"},
					glue = {"TestCase_StepDefs"}, 
							plugin = {"html:target/cucumber-html-report.html", 
									 "json:target/cucumber.json", 
									 "pretty:target/cucumber-pretty.txt", 
									 "usage:target/cucumber-usage.json", 
									 "junit:target/cucumber-result.xml", "rerun:target/rerun.txt"},
							
					monochrome = true /*, tags = "@Smoke" */ )   /* to ignore perticular scenario we should give tags = "not @ignore" */
public class Runner extends AbstractTestNGCucumberTests{

}
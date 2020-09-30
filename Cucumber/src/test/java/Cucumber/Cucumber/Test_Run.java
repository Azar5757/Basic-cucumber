package Cucumber.Cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features ="D:\\Azar\\Cucumber\\src\\test\\java\\Cucumber\\Cucumber\\fbAppTesting.feature",
glue={"Cucumber.Cucumber"},format= {"pretty","html:D:/Azar/Cucumber/reports","json:json-output/cucumber.json","junit:junit-xml/cucumber.xml"},
dryRun=false,
monochrome=true,
strict=true)
public class Test_Run {
	
	
}

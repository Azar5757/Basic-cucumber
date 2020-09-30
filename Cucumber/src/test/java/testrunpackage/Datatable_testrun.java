package testrunpackage;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"D:\\Azar\\Cucumber\\src\\test\\java\\featurepackage\\usingdatatable.feature"},
glue= {"stepdefpackage"},
format= {"pretty","html:D:/Azar/Cucumber/reports","junit:junit_xml/Datatable.xml"},
strict=true,
monochrome=true,
dryRun=false)
public class Datatable_testrun {
	

}

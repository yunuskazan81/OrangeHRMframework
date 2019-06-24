package com.orangehrm.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= "src/test/resources/features/" 
		,glue = "com/orangehrm/steps"
		//,dryRun= true
		,monochrome= true
		,plugin= {"pretty", "html:target/cucumber-deafult-report", "json:target/cucumber.json"}
		,tags= {"@compare123"}
		
		)

public class TestRunnerGeneral {

}
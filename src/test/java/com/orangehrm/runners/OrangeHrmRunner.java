package com.orangehrm.runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= "src/test/resources/features/OrangeHrmLogin.feature"
		,dryRun = true
		,monochrome = true
		,glue= "com/orangehrm/steps"
		,tags= {"@smoke"}
		
		)



public class OrangeHrmRunner {
	
	
	

}

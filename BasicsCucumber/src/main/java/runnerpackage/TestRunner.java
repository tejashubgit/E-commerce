package runnerpackage;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
	features= "C:\\Users\\Admin\\eclipse-workspace\\BasicsCucumber\\src\\main\\java\\runnerpackage\\Cucumber2.feature"	
	,glue= {"C:\\Users\\Admin\\eclipse-workspace\\BasicsCucumber\\src\\main\\java\\stepDefinition\\LoginStepDefinition.java"}
	//format= {"pretty", "html:test-output"}
	
		
		)

public class TestRunner {

}

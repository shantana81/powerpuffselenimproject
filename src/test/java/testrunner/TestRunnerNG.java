package testrunner;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests; 

public class TestRunnerNG {

	// features folder and stepdef can communicate through TestRunner    
	 @CucumberOptions(   
			 features = {"features"},     
	             glue = {"stepdefs"}
			     //tags= {"@sc1,@customerservice1"}
	             
	 )  
	 public class Testrunner extends AbstractTestNGCucumberTests{}  

	
	
	
	
}

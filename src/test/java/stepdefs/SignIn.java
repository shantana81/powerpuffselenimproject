package stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjectmodel.SignInPOM;

public class SignIn {
	WebDriver driver;
	
	@Given("^user navigates Facebook homepage$")
	public void user_navigates_Facebook_homepage() throws Throwable {
		try {
System.setProperty("webdriver.chrome.driver","C:\\Users\\bishm\\Downloads\\chromedriver_win32\\chromedriver.exe") ;

driver = new ChromeDriver();

driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
driver.manage().window().maximize();

driver.get("https://www.facebook.com/");
}
catch(Exception e) {
	System.out.println("browser or url not opening");
}

	}
		
		
		

	@When("^When user enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void when_user_enter_and(String arg1, String arg2) throws Throwable {
	 try {
		 SignInPOM facebook=new SignInPOM(driver);
		 facebook.EmailAddress().sendKeys(arg1);
		 WebDriverWait wait=new WebDriverWait(driver,10);
		 
		 facebook.Password().sendKeys(arg2);
	 }
	 catch(Exception e) {
		 System.out.println("the email address and password is not working");
	 }
	 
	}


	@When("^user click on log in button$")
	public void user_click_on_log_in_button() throws Throwable {
	try {
		 SignInPOM facebook=new SignInPOM(driver);
		 facebook.login().click();
		 WebDriverWait wait=new WebDriverWait(driver,10);
	}
	catch(Exception e) {
		System.out.println("The log in button didnt work");
	}
	}

	@Then("^user successfully login to the system$")
	public void user_successfully_login_to_the_system() throws Throwable {
	    
	}



}

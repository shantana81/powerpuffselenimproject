package stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjectmodel.LocationsPOM1;

public class HiltonLocations {
	WebDriver driver;
	@Given("^user visits Hilton home page$")
	public void user_visits_Hilton_home_page() throws Throwable {
		try {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\bishm\\Downloads\\chromedriver_win32\\chromedriver.exe") ;

			driver = new ChromeDriver();

			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			driver.manage().window().maximize();

			driver.get("https://www.hilton.com/en/");
			}
		catch(Exception e) {
			System.out.println("browser or url not opening");
		}
		}
	   
	

	@When("^user click locations$")
	public void user_click_locations() throws Throwable {
		try {
			LocationsPOM1 obj=new LocationsPOM1(driver);
			obj.locations().click();
			 WebDriverWait wait=new WebDriverWait(driver,10);
		}
		catch(Exception e) {
			System.out.println("The locations didnt work");
		}
		}
	   
	

	@Then("^user can successfully go to the Hilton locations page$")
	public void user_can_successfully_go_to_the_Hilton_locations_page() throws Throwable {
	    
	}

}

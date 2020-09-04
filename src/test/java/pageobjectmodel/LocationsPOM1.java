package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LocationsPOM1 {
WebDriver driver;
public LocationsPOM1(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
		}

@FindBy(xpath="//*[@id=\"NavMenu\"]/ul/li[2]/a")
WebElement click_locations;
public WebElement locations() {
	return click_locations;
	
}
	
}
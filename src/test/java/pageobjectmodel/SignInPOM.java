package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPOM {
WebDriver driver;
public SignInPOM(WebDriver driver)	{
	this.driver=driver;
	PageFactory.initElements(driver,this);
	
}

@FindBy(name="email")
WebElement Type_EmailAddress;

public WebElement EmailAddress() {
	return Type_EmailAddress;
}
@FindBy(name="pass")
WebElement Type_Password;
public WebElement Password() {
	return Type_Password;
}
@FindBy(xpath="//button[@name='login']")
WebElement click_login;
public WebElement login() {
	return click_login;
	
}

}
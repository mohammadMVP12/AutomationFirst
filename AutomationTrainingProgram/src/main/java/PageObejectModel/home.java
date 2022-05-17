package PageObejectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class home {
	WebDriver driver;
	@FindBy(name = "email") WebElement id;
	@FindBy(name = "pass") WebElement passwd;
	@FindBy(linkText = "Forgot password?")WebElement forgot;


public home(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
}
public void email() {
	id.sendKeys("protainingtech");
}
public void passwor() {
	passwd.sendKeys("mypasss");
}
public void Forgotthepassword() {
	forgot.click();
}














}
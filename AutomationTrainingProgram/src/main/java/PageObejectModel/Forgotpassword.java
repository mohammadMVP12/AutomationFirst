package PageObejectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Forgotpassword {
	WebDriver driver;
	@FindBy(linkText = "cancel") WebElement no;
	



public Forgotpassword(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
}
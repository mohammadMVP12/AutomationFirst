package ProTrainingTech.AutomationTrainingProgram;

import org.testng.annotations.Test;

import PageObejectModel.Forgotpassword;
import PageObejectModel.home;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class browser {
	WebDriver driver;
  @Test
  public void f() {
	  home ob=new home(driver);
	  ob.email();
	  ob.passwor();
	  ob.Forgotthepassword();
	  Forgotpassword ob2=new Forgotpassword(driver);
	  
  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\moham\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.navigate().to("https://www.facebook.com");
		driver.manage().window().maximize();
	    }
  

  @AfterClass
  public void afterClass() throws InterruptedException {
	 Thread.sleep(3000);
	 driver.close();
  }
 
}

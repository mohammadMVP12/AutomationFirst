package ProTrainingTech.AutomationTrainingProgram;

import org.testng.annotations.Test;

import CommonCodeClass.Utilities;
import CommonCodeClass.Utility;
import PageObejectModel.home;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;

public class dataproviders extends Utility {
  @Test(dataProvider = "dp")
  public void f(String n, String s) throws InterruptedException {
	home ob=new home(driver);
	ob.email(n);
	ob.passwor(s);
	Thread.sleep(3000);
	ob.sigh();
	Thread.sleep(3000);
	driver.navigate().back();
	Thread.sleep(3000);
	  
	  
  }
  

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] {"john@gmail.com", "Silver" },
      new Object[] { "haider@gmail.com", "Somepassword" },
      new Object[] { "theemail@gmail.com", "isadkasf" },
    };
  }
}

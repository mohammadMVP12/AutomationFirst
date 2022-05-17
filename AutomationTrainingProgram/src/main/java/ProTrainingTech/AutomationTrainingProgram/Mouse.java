package ProTrainingTech.AutomationTrainingProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\moham\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://www.amazon.com");
		driver.manage().window().maximize();
		Actions ob=new Actions(driver);
		WebElement signin=driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		ob.moveToElement(signin).build().perform();
		WebElement gift=driver.findElement(By.linkText("Memberships & Subscriptions"));
		ob.moveToElement(gift).click().build().perform();
	
	
	
	
	
	
	
	
	}

}

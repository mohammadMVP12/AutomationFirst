package ProTrainingTech.AutomationTrainingProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\moham\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		driver.manage().window().maximize();
		WebElement simpleofalert=driver.findElement(By.name("alert"));
		simpleofalert.click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		WebElement confirm=driver.findElement(By.name("confirmation"));
		confirm.click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		WebElement prom=driver.findElement(By.name("prompt"));
		prom.click();
		Thread.sleep(1000);
		driver.switchTo().alert().sendKeys("Accept");
		driver.switchTo().alert().accept();
		
		
		
	
	
	
	
	
	
	
	}

}

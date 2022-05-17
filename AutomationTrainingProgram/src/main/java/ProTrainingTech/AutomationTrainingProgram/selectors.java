package ProTrainingTech.AutomationTrainingProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectors {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	
	

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\moham\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://www.Facebook.com");
		driver.manage().window().maximize();
	
	WebElement create = driver.findElement(By.linkText("Create new account"));
	create.click();
	Thread.sleep(2000);
	WebElement month=driver.findElement(By.id("month"));
	Select ob=new Select(month);
	ob.selectByValue("1");
	WebElement day=driver.findElement(By.id("day"));
	Select it= new Select(day);
	it.selectByValue("11");
	WebElement year= driver.findElement(By.id("year"));
	Select ai=new Select(year);
	ai.selectByValue("1993");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}

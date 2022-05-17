package ProTrainingTech.AutomationTrainingProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class popups {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\moham\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://www.expedia.com");
		driver.manage().window().maximize();
		WebElement selection=driver.findElement(By.id("d1-btn"));
		selection.click();
		Thread.sleep(3000);
		WebElement departure=driver.findElement(By.xpath("//*[@id=\"wizard-hotel-pwa-v2-1\"]/div[2]/div[2]/div/div/div[2]/div/div[2]/div/div[2]/div[2]/div[1]/table/tbody/tr[2]/td[3]/button"));
		departure.click();
		WebElement returns=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[1]/div[2]/div[1]/div[4]/div[1]/div/div/div/div/div/div/div[1]/div/form/div[2]/div[2]/div/div/div[1]/div/div/button[1]"));
		returns.click();
		
	
	
	
	
	//go to homedepot.com click my account.click register. select personal account.fill out form create account button
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}

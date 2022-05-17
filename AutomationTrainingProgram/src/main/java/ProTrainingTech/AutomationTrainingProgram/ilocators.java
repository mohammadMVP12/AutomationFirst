package ProTrainingTech.AutomationTrainingProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ilocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\moham\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://www.amazon.com");
		driver.manage().window().maximize();
	//WebElement search=driver.findElement(By.xpath("/html/body/div/header/div/div/div/div/form/div/div/span/input"));
	//search.click();
	
	//WebElement searchbar=driver.findElement(By.xpath("/html/body/div/header/div/div/div/div/form/div/div/input"));
	//searchbar.sendKeys("auto");
	
	//WebElement bar=driver.findElement(By.xpath("//input[@aria-label='Search']"));
	//bar.sendKeys("auto");
		//WebElement text=driver.findElement(By.xpath("//a[text()='Personal Shopper']"));
		//text.click();
	
	}

}

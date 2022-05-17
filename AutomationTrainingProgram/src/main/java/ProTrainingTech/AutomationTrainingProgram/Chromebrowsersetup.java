package ProTrainingTech.AutomationTrainingProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chromebrowsersetup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub, how to launch chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\moham\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://www.amazon.com");
		driver.manage().window().maximize();
		driver.navigate().back();
		Thread.sleep(6000);
		driver.navigate().forward();
		String windowhandleids=driver.getWindowHandle();
		System.out.println(windowhandleids);
		//WebElement Searchbar= driver.findElement(By.name("field-keywords"));
		//Searchbar.sendKeys("Computer");
		//Thread.sleep(5000);
		//WebElement Searchbutton= driver.findElement(By.id("nav-search-submit-button"));
		//Searchbutton.click();
		//WebElement deallink= driver.findElement(By.linkText("Today's Deals"));
		//driver.findElement(By.partialLinkText("Today's"));
		//deallink.click();
		WebElement search=driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]"));
		search.click();
				
		//driver.close();
	}

}
//write program for facebook enter email and password
//protraining tech website click contact us and fill form and submit
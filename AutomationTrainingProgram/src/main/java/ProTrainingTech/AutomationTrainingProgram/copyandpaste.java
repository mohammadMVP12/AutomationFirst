package ProTrainingTech.AutomationTrainingProgram;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class copyandpaste {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\moham\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		/*driver.navigate().to("https://www.amazon.com");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wt=new WebDriverWait(driver,Duration.ofSeconds(10));
		wt.until(ExpectedConditions.elementToBeClickable(By.id("twotabsearchtextbox")));
		WebElement searchto=driver.findElement(By.id("twotabsearchtextbox"));
		searchto.sendKeys("Computer");
		Actions ob =new Actions(driver);
		ob.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		ob.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();	
		Thread.sleep(3000);
		searchto.clear();
		Thread.sleep(3000);
		searchto.click();
		ob.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();*/
		driver.navigate().to("https://www.expedia.com");
		driver.manage().window().maximize();
		WebElement it=driver.findElement(By.id("d1-btn"));
		it.click();
	WebElement date=driver.findElement(By.xpath("html/body/div/div/div/div/div/div/div/div/div/table/tbody/tr/td/button"));
		Select ur=new Select(date);
		ur.selectByValue("May 10");
	}

}

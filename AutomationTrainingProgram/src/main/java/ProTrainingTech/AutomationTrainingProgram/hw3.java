package ProTrainingTech.AutomationTrainingProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class hw3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\moham\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://www.Homedepot.com");
		driver.manage().window().maximize();
		Actions ob=new Actions(driver);
		WebElement acc=driver.findElement(By.className("MyAccount__button"));
		acc.click();
		Thread.sleep(2000);
		WebElement reg=driver.findElement(By.xpath("//*[@id=\"SPSORegister\"]/a/span"));
		reg.click();
		Thread.sleep(2000);
		WebElement pri=driver.findElement(By.className("bttn__content"));
		pri.click();
		Thread.sleep(2000);
		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys("myemail@gmail.com");
		WebElement pass=driver.findElement(By.id("password-input-field"));
		pass.sendKeys("Word1279@");
		WebElement zip=driver.findElement(By.id("zipCode"));
		zip.sendKeys("21244");
		WebElement cell=driver.findElement(By.id("phone"));
		cell.sendKeys("4109804399");
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		WebElement box=driver.findElement(By.id("recaptcha-anchor-label"));
		ob.click(box).build().perform();
		driver.switchTo().parentFrame();
		Thread.sleep(2000);
		WebElement page=driver.findElement(By.id("single-signin__body"));
		ob.clickAndHold();
		ob.release();
				Thread.sleep(2000);
		WebElement last=driver.findElement(By.className("bttn--primary"));
		last.click();
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}

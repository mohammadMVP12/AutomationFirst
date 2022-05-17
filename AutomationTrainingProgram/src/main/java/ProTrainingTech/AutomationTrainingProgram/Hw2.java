package ProTrainingTech.AutomationTrainingProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\moham\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("http://www.Facebook.com");
		driver.manage().window().maximize();
		WebElement email= driver.findElement(By.id("email"));
		Thread.sleep(2000);
		email.sendKeys("thisismyemail@email.com");
		WebElement password= driver.findElement(By.id("pass"));
		Thread.sleep(2000);
		password.sendKeys("imnotsure");
		WebElement login= driver.findElement(By.name("login"));
		login.click();
		Thread.sleep(2000);
		
		WebDriver drive= new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\moham\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\chromedriver.exe");
		drive.manage().window().maximize();
		drive.navigate().to("https://www.protrainingtech.com");
		WebElement contact=drive.findElement(By.linkText("Contact us"));
		contact.click();
		WebElement first=drive.findElement(By.id("nf-field-17"));
		first.sendKeys("haider");
		Thread.sleep(2000);
		WebElement last=drive.findElement(By.id("nf-field-18"));
		last.sendKeys("Mohammad");
		WebElement user=drive.findElement(By.id("nf-field-19"));
		user.sendKeys("thisismyemail@gmail.com");
		WebElement phone=drive.findElement(By.id("nf-field-20"));
		phone.sendKeys("4109804399");
		WebElement register=drive.findElement(By.id("nf-field-27"));
		register.click();
		
		
		
	}

}

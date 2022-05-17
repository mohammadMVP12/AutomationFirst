package ProTrainingTech.AutomationTrainingProgram;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Windows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\moham\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://www.amazon.com");
		driver.manage().window().maximize();
		Actions ob= new Actions(driver);
		WebElement best= driver.findElement(By.linkText("New Releases"));
		ob.keyDown(Keys.SHIFT).build().perform();
		best.click();
		ob.keyUp(Keys.SHIFT).build().perform();
		driver.getWindowHandle();
		Set<String> windowhandles=driver.getWindowHandles();
		Iterator<String> iterator=windowhandles.iterator();
		String Parentwindow=iterator.next();
		String Secondwindow=iterator.next();
		System.out.println("this is parent window"+Parentwindow);
		System.out.println("this is second window"+Secondwindow);
		driver.switchTo().window(Secondwindow);
		WebElement cam=driver.findElement(By.linkText("Camera & Photo Products"));
		Thread.sleep(2000);
		cam.click();
		driver.switchTo().window(Parentwindow);
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}

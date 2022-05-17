package ProTrainingTech.AutomationTrainingProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class drop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\moham\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://www.jqueryui.com/");
		driver.manage().window().maximize();
		WebElement droplink=driver.findElement(By.linkText("Droppable"));
		droplink.click();
		driver.switchTo().frame(0);
		WebElement draggable=driver.findElement(By.id("draggable"));
		WebElement droppable=driver.findElement(By.id("droppable"));
		Actions ob= new Actions(driver);
		ob.dragAndDrop(draggable, droppable).build().perform();
		driver.switchTo().parentFrame();
		WebElement sort=driver.findElement(By.linkText("Sortable"));
		sort.click();
		
		
	
	
	
	
	
	
	
	
	
	}

}

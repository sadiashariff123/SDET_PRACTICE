package javatry;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dec26dragndrop {

	public static void main(String[] args) throws NoAlertPresentException,InterruptedException  {									
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sadia\\eclipse-workspace\\SeleniumTryOut\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//URL
		driver.get("https://demoqa.com/droppable");
		
		Actions act=new Actions(driver);
		
		WebElement drag=driver.findElement(By.id("draggable"));
		WebElement drop=driver.findElement(By.id("droppable"));
		
		
		act.clickAndHold(drag).moveToElement(drop).release().build().perform();
	
	
	}
	
}

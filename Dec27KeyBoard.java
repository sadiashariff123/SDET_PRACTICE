package javatry;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dec27KeyBoard {

			public static void main(String[] args) throws NoAlertPresentException,InterruptedException  {									
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\sadia\\eclipse-workspace\\SeleniumTryOut\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			//URL
			driver.get("https://www.facebook.com/reg/");
			
			Actions act=new Actions(driver);
			
			driver.findElement(By.name("firstname")).sendKeys("Selenium");
			
			act.sendKeys(Keys.TAB)
			.pause(1)
			.sendKeys("WebDriver");
			act.sendKeys(Keys.TAB)
			.pause(1)
			.sendKeys("7367625786475");
			act.sendKeys(Keys.TAB)
			.pause(1)
			.sendKeys("hsgdjsg")
			.build().perform();
			
			
			
			
			
			

	}

}

package javatry;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dec29KeyupKeydown {

	public static void main(String[] args) throws NoAlertPresentException,InterruptedException  {									
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sadia\\eclipse-workspace\\SeleniumTryOut\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//URL
		driver.get("http://omayo.blogspot.com/");
        
        WebElement compediumDevLink = driver.findElement(By.linkText("compendiumdev"));
       
        Actions actions = new Actions(driver);
       
        actions.moveToElement(compediumDevLink).keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).build().perform();

	}

}

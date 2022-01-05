package javatry;

import java.awt.Desktop.Action;
import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Jan3Multiplekeys {

		public static void main(String[] args) throws NoAlertPresentException,InterruptedException  {	
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\sadia\\eclipse-workspace\\SeleniumTryOut\\chromedriver.exe");
		        WebDriver driver = new ChromeDriver();
		        driver.get("https://text-compare.com/");
		        driver.manage().window().maximize();
		        
		        
		        WebElement input1=driver.findElement(By.id("inputText1"));
		        WebElement input2=driver.findElement(By.id("inputText2"));
		        
		        input1.sendKeys("wellcome all");
		        
		        Actions act=new Actions(driver);
		        
		        //CTRL + A
		        act.keyDown(Keys.CONTROL);
		        act.sendKeys("a");
		        act.keyUp(Keys.CONTROL);
		        act.perform();
		        
		      //CTRL + C
		        act.keyDown(Keys.CONTROL);
		        act.sendKeys("c");
		        act.keyUp(Keys.CONTROL);
		        act.perform();
		        
		        //TAB sift to input2
		        act.sendKeys(Keys.TAB);
		        
		      //CTRL + V
		        act.keyDown(Keys.CONTROL);
		        act.sendKeys("v");
		        act.keyUp(Keys.CONTROL);
		        act.perform();
		        
		        
		        
		        
		        
		        
	}

}

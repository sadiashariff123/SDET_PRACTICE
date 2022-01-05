package javatry;
package javatry;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dec30Screenshot {

	
		public static void main(String[] args) throws NoAlertPresentException,InterruptedException  {									
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\sadia\\eclipse-workspace\\SeleniumTryOut\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			//URL
			driver.get("https://www.facebook.com/");
			
			//ScreenShot for WebElelments 
			//WebElement loginButton = driver.findElement(By.name("login"));
			//File fs = loginButton.getScreenshotAs(OutputType.FILE);
			//FileUtils.copyfile(fs,new file("C:\screenshot\\login.jpg"));
			
			//ScreeenShot for WebPage
			TakeScreenshot ts= (TakeScreenshot)driver;
			File fs = loginButton.getScreenshotAs(OutputType.FILE);
			FileUtils.copyfile(fs,new file("C:\screenshot\\page.jpg"));
			
			

	}

}

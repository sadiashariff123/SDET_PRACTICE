package javatry;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dec23Frames {
	
		
		public static void main(String[] args) throws NoAlertPresentException,InterruptedException  {									
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\sadia\\eclipse-workspace\\SeleniumTryOut\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			//Demo URL
			driver.get("https://demoqa.com/frames");
			
			//Using index value for frame
			/*driver.switchTo().frame(0);
			String text=driver.findElement(By.id("sampleHeading")).getText();
			System.out.println(text);*/
			
			//Using index with id or name
			/*driver.switchTo().frame("frame1");
			String text=driver.findElement(By.id("sampleHeading")).getText();
			System.out.println(text);*/
			
			//Using elements of frames
			WebElement frame=driver.findElement(By.id("frame1"));
			driver.switchTo().frame(frame);
			String text=driver.findElement(By.id("sampleHeading")).getText();
			System.out.println(text);
		
			
			driver.close();
			driver.quit();
			
			
			
			

	}

}

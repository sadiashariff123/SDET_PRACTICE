package javatry;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dec24frames {

	public static void main(String[] args) throws NoAlertPresentException,InterruptedException  {									
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sadia\\eclipse-workspace\\SeleniumTryOut\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//Demo URL
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		
		
		driver.findElement(By.id("name")).sendKeys ("Hello");
		Thread.sleep(2000);
		driver.switchTo().frame(driver.findElement(By.id("frm1")));
		
		
		Select coursedd = new Select(driver.findElement(By.id("course")));
		coursedd.selectByVisibleText("Java");
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		
	
		

	}

}

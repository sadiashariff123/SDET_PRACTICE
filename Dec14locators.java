package javatry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dec14locators {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sadia\\eclipse-workspace\\SeleniumTryOut\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://login.yahoo.com/?.lang=en-US&src=homepage&.done=https%3A%2F%2Fwww.yahoo.com%2F&pspid=2023538075&activity=ybar-signin");
		
		//1.id : always Unique.
		WebElement username = driver.findElement(By.id("login-username"));
		username.sendKeys("test@yahoo.com");
		
		WebElement nextBtn = driver.findElement(By.id("login-signin"));
		nextBtn.click();
		
		//alternatively we can also do this as:
			//driver.findElement(By.id("login-username")).sendKeys("test@yahoo.com");
			//driver.findElement(By.id("login-signin")).click();
		

	}

}

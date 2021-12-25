package javatry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dec19selectdropdown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sadia\\eclipse-workspace\\SeleniumTryOut\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//website
		driver.get("https://www.sugarcrm.com/au/request-demo/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement ddown = driver.findElement(By.name("employees_c"));
		Select select = new Select(ddown);
		
		
		select.selectByValue("level1"); //by value 1st method
		Thread.sleep(2000);
		
		select.selectByIndex(2); //by index 2nd method
		Thread.sleep(2000);
		
		select.selectByVisibleText("251 - 500 employees"); //by text 2rd method
		Thread.sleep(2000);
		
		
		
	}

}

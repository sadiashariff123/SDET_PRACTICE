package javatry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dec18dropdown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sadia\\eclipse-workspace\\SeleniumTryOut\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.SauceDemo.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@type,'submit')]")).click();
		Thread.sleep(2000);
		Select s=new Select(driver.findElement(By.xpath("//select[@class='product_sort_container']")));
		s.selectByValue("lohi");
}
}
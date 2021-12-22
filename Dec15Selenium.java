package javatry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Dec15Selenium {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sadia\\eclipse-workspace\\SeleniumTryOut\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// fetching the url
				driver.get("https://www.udemy.com/join/login-popup/?skip_suggest=1&locale=en_US&next=https%3A%2F%2Fwww.udemy.com%2F&response_type=html");
				// Locators in Selenium: Total 8 locators in Se
				
				//1. by id: always unique
				
				// enter email
				//driver.findElement(By.id("email--1"));
				//WebElement user = driver.findElement(By.id("email--1"));
				//user.sendKeys("sadia@gmail.com");
				
				//enter password
				//driver.findElement(By.id("id_password"));
				//WebElement pswd = driver.findElement(By.id("id_password"));
				//pswd.sendKeys("locators123");
				
				//click login
				//WebElement login = driver.findElement(By.id("submit-id-submit"));
				//login.click();
				
				//alternatively we can also do this as:
				//driver.findElement(By.id("email--1")).sendKeys("sadia@gmail.com");
				//driver.findElement(By.id("id_password")).sendKeys("locators123");
		
				
				
				//2. by name: always unique
				//driver.findElement(By.name("email")).sendKeys("sadia@gmail.com");
				//driver.findElement(By.name("password")).sendKeys("locators123");
				
				
				//3. by xpath: mostly used when Id, name are dynamic or not present
				//driver.findElement(By.xpath("//input[@id='email--1']")).sendKeys("sadia@gmail.com");
				//driver.findElement(By.xpath("//input[@id='id_password']")).sendKeys("locators123");
				
				//4. cssSelector: 
				//driver.findElement(By.cssSelector("#email--1")).sendKeys("sadia@gmail.com");
				//driver.findElement(By.cssSelector("#id_password")).sendKeys("locators123");
				
				//5. linkText: only for links
				//notes: alink-> angular link
				//driver.findElement(By.linkText("Forgot Password")).click();
				//driver.findElement(By.linkText("Sign up")).click();
				
				
				//6. partial linkText: only for links but not recommended.used when there is a huge link 
				//driver.findElement(By.partialLinkText("organization")).click();
				
				//7. class name: class name isnot always unique
				//driver.findElement(By.className(className)).sendKeys("asadia@gmail.com");
	}


}

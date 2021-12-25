package javatry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dec20alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\sadia\\eclipse-workspace\\SeleniumTryOut\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			
			//url
			driver.get("http://demo.guru99.com/V1/index.php");
			driver.findElement(By.id("details-button")).click();
			driver.findElement(By.id("proceed-link")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.name("cusid")).sendKeys("ASDF");
			Thread.sleep(2000);
			
			driver.findElement(By.name("submit")).click();
			Thread.sleep(2000);
			
			System.out.println(driver.switchTo().alert().getText());
			//driver.switchTo().alert().dismiss();
			driver.switchTo().alert().accept();
			}


	}



package javatry;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dec21MoreAlets {

	public static void main(String[] args) throws NoAlertPresentException,InterruptedException  {									
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sadia\\eclipse-workspace\\SeleniumTryOut\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	
        
        // Alert Message handling
         driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");			
         
         
         //Simple Alert
         driver.findElement(By.id("alertBox")).click();
         Alert simpleAlert = driver.switchTo().alert();
         System.out.println(simpleAlert.getText());
         Thread.sleep(3000);
         simpleAlert.accept();
         Thread.sleep(3000);
         driver.quit();
         
         
       //Confirmation Alert
         //driver.findElement(By.id("confirmBox")).click();
         //Alert confirmationAlert = driver.switchTo().alert();
         //System.out.println(confirmationAlert.getText());
         //Thread.sleep(2000);
         //confirmationAlert.accept();
         //Thread.sleep(2000);
         //System.out.println(driver.findElement(By.id("output")).getText());
         //driver.quit();
         
				}
        
         
         
         
        }
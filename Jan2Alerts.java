package javatry;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jan2Alerts {

	public static void main(String[] args) throws NoAlertPresentException,InterruptedException  {	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sadia\\eclipse-workspace\\SeleniumTryOut\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	        driver.manage().window().maximize();
	        
	        driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]")).click();
	        Alert alert = driver.switchTo().alert();
	        alert.accept();
	        String result = driver.findElement(By.cssSelector("#result")).getText();
	        System.out.println(result);
	        Assert.assertEquals("You successfuly clicked an alert",result);


	        driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]")).click();
	        Alert alert2 = driver.switchTo().alert();
	        alert2.dismiss();
	        String result2 = driver.findElement(By.cssSelector("#result")).getText();
	        System.out.println(result2);
	        Assert.assertEquals("You clicked: Cancel",result2);

	        driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]")).click();
	        Alert alert3 = driver.switchTo().alert();
	        alert3.accept();
	        String result3 = driver.findElement(By.cssSelector("#result")).getText();
	        System.out.println(result3);
	        Assert.assertEquals("You clicked: Ok",result3);



	        driver.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]")).click();
	        driver.switchTo().alert().sendKeys("Hello Pramod");
	        driver.switchTo().alert().accept();
	        String result4 = driver.findElement(By.cssSelector("#result")).getText();
	        System.out.println(result4);
	        Assert.assertEquals("You entered: Hello Pramod",result4);


	        driver.quit();
	        
	}

}

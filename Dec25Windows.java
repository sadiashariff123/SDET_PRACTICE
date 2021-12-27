package javatry;

import java.util.Iterator;
import java.util.Set;




import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dec25Windows {

	public static void main(String[] args) throws NoAlertPresentException,InterruptedException  {									
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sadia\\eclipse-workspace\\SeleniumTryOut\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//Demo URL
		driver.get("https://www.salesforce.com/");
		driver.findElement(By.xpath("/html/body/main/div[1]/div/div[1]/div[1]/div/div[2]/hgf-cta[1]//div/a/span")).click();
		Thread.sleep(2000);
		Set<String> windowhandle = driver.getWindowHandles();
		System.out.println(windowhandle);
		
		Iterator<String> iterator = windowhandle.iterator();
		String parentwindow = iterator.next();
		System.out.println(parentwindow);
		String childwindow = iterator.next();
		System.out.println(childwindow);
		
		driver.switchTo().window(childwindow);
		
		driver.findElement(By.name("UserFirstName")).sendKeys("nany");
		driver.findElement(By.name("UserLastName")).sendKeys("chawla");
		

	}

}

package javatry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dec17xpath {

	//XPath Functions: contains(), starts-with(), text(),customize Xpath
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sadia\\eclipse-workspace\\SeleniumTryOut\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// fetching the url
		driver.get("https://www.amazon.com/");
		
		// contains()--> used when value of any attribute changes dynamically eg login info
		driver.findElement(By.xpath("//a[contains(text(),'cyz44y-gjs7xd-bcf91g-i8k2ft')]")).click();

		// starts-with()--> used for attributes whose value of function changes on refresh or any operation of webpage
		//driver.findElement(By.xpath("//*[starts-with(@alt,'Save on Hobby RC Trucks and Kits from LAEGENDARY')]")).click();

		// text()--> used to match exact text
	}

}

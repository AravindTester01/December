package webdriverpackage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class Locators {
	EdgeDriver driver;

	
	@Before
	public void setup() {
		 driver=new EdgeDriver();
		   driver.get("http://www.facebook.com");
	}
	
   @Test
   public void test2() 
   {
	   driver.findElement(By.name("email")).sendKeys("abcgmail.com");
	   driver.findElement(By.name("pass")).sendKeys("aravind123");
	   driver.findElement( By.name("login")).click();
   }
   @After
   public void teardown() {
	   
   }
}

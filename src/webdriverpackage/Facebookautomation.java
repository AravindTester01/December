package webdriverpackage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;


public class Facebookautomation {
 EdgeDriver driver;
	
	
	@Before
	public void  setup() {
		driver=new EdgeDriver();
		driver.get("http://www.facebook.com");
	}
	
	@Test
	public void test1() {
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abx@gmail.com");
		driver.findElement(By.xpath("//input[@name=\'pass\']")).sendKeys("pass");
		 driver.findElement( By.xpath("//button[@name='login']")).click();
	}
	@After
	public void terminate() {
		driver.quit();
	}
}

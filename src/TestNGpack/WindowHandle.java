package TestNGpack;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WindowHandle {
	EdgeDriver driver;
	@BeforeTest
	public void Start() {
		driver=new EdgeDriver();
		
		driver.manage().window().maximize();
	}
	@Test
	public void test1() {
		driver.get("https://demo.guru99.com/popup.php");
		
	String parentwindow =driver.getWindowHandle();
	 driver.findElement(By.xpath("/html/body/p/a")).click();
	   Set<String>allwindowhandle=driver.getWindowHandles();
	   
	   for(String handle:allwindowhandle) {
		   System.out.println(handle);
		   
		   if(!handle.equalsIgnoreCase(parentwindow)) {
			   driver.switchTo().window(handle);
			   driver.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/input")).sendKeys("aravind@gmail.com");
			   driver.close();
		   }
	   }
	}
	
}

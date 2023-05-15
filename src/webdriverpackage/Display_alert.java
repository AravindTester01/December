package webdriverpackage;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Display_alert {
	EdgeDriver driver;

		
		@Before
		public void start() {
			driver=new EdgeDriver();
			driver.get("file:///C:/Users/user/Documents/Display_alert1.html");
	        driver.manage().window().maximize();
		}
	        
	   @Test
	   public void Automation() {
		   driver.findElement(By.xpath("/html/body/input[1]")).click();
		   Alert a=driver.switchTo().alert();
		   String text=a.getText();
		   System.out.println(text);
		   a.accept();
		   driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("Aravind");
		   driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("Mohanan");
		   
	        
}
}
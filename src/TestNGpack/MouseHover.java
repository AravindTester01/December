package TestNGpack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MouseHover {
	EdgeDriver driver;
	@BeforeTest
	public void start() {
		driver=new EdgeDriver();
		driver.get("https://www.ebay.com/");
	}
		
		@Test
		public void automation() {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			WebElement curser=driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/a"));
			Actions act=new Actions(driver);
			act.moveToElement(curser).perform();
			WebElement curser2=driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]"));
			curser2.click();
			
		
		
	}
	 

}

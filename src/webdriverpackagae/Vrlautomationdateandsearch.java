package webdriverpackagae;

import java.time.Duration;
import java.util.Arrays;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Vrlautomationdateandsearch {
	WebDriver driver;
	@BeforeTest
	public void start() {
		ChromeOptions opt1=new ChromeOptions();
		  opt1.addArguments("--remote-allow-origins=*"); 
		   driver = new ChromeDriver(opt1);
		   driver.get("https://www.vrlbus.in/#/");
		   
		   
		
	
		  
	
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  
		  
		  
	}
	@Test
	public void chromeoptions() {
		
	}
		  @Test
		 public void test() throws Exception  {
			  
			  WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(50));
			
		
			  
			  JavascriptExecutor js=(JavascriptExecutor)driver;
			  WebElement d = driver.findElement(By.xpath("//*[@id=\"txtFromDate\"]"));
			  js.executeScript("arguments[0].click()", d);
			 
			  d.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
			  d.sendKeys("20-04-2023",Keys.ENTER);
			  
			
				
				
	
				  
			
				 
			  
			  
              }
		  
		  
		
		  }
		
		
	



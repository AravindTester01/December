package webdriverpackagae;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class VrlbusAutomation {
	WebDriver driver;
	@BeforeTest
	public void start() {
		  ChromeOptions options=new ChromeOptions();
		  options.addArguments("--remote-allow-origins=*"); 
		  driver=new ChromeDriver(options);
		  driver.get("https://www.vrlbus.in/#/");
		  
		  driver.manage().window().maximize();
	
		  //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
	
	
		
		 @Test (priority = 1)
		  public void test()
		  {
			  JavascriptExecutor js =(JavascriptExecutor) driver;
			  WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
				
				  boolean invisible =
				  wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(
				  ".MuiDialog-container.MuiDialog-scrollPaper.css-hz1bth-MuiDialog-container\r\n"
				  ))); if(invisible) { WebElement
				  d=driver.findElement(By.xpath("//*[@id=\"FromCity\"]")); d.click();
				  d.sendKeys("AHMEDABAD",Keys.ENTER); }
				 
			
			  WebElement d=driver.findElement(By.id("FromCity"));
			  js.executeScript("arguments[0].click()", d);
			  d.sendKeys("Ahmedabad");
			       
			  }
			@Test(priority = 2)
			public void test1() {
				
				  WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30)); boolean
				  invisible =
				  wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(
				  ".MuiDialog-container.MuiDialog-scrollPaper.css-hz1bth-MuiDialog-container\r\n"
				  ))); if(invisible) {
				 
				 WebElement dr=driver.findElement(By.id("ToCity")); 
				  dr.click();
		         dr.sendKeys("BANGLORE",Keys.ENTER); 
				  }
			}
			
			
			@Test(priority = 3)
			public void test2() {
				WebElement dri=driver.findElement(By.id("txtFromDate"));
				dri.click();
				dri.clear();
				dri.sendKeys("18-04-2023");
				//dri.clear();
				
			}
			
			  @Test (priority = 4) 
			  public void test3() { 
				  WebElement driv=driver.findElement(By.xpath("//button[@class='btn']")); 
				  driv.click(); }
			 












}




		 

	
			  
		  
		
	 


	 
	 
	 
	
	

		
	

	
	
		

	        
	



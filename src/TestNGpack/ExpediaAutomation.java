package TestNGpack;

import javax.crypto.SecretKeyFactorySpi;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ExpediaAutomation {
	WebDriver driver;
String baseurl="https://www.expedia.co.in/";
@BeforeTest
public void start() {
	
	 ChromeOptions options=new ChromeOptions();
		
	  options.addArguments("--remote-allow-origins=*"); 
	  driver=new ChromeDriver(options);

	
}
@BeforeMethod
public void Automation() {
	driver.get(baseurl);
	driver.manage().window().maximize();
	}
@Test
public void test() {
	WebElement d=driver.findElement(By.xpath("//*[@id=\"wizardMainRegionV2\"]/div/div/div/div/ul/li[2]/a"));
	d.click();
	driver.findElement(By.xpath("//*[@id=\"location-field-leg1-origin-menu\"]/div/div/div[1]/button")).click();
	driver.findElement(By.id("location-field-leg1-origin")).sendKeys("Brussels (BRU - Brussels-National)",Keys.ENTER);
	driver.findElement(By.xpath("//button[@data-stid='location-field-leg1-destination-menu-trigger']")).click();
	driver.findElement(By.id("location-field-leg1-destination")).sendKeys("Newyork",Keys.ENTER);
	driver.findElement(By.xpath("//button[@data-testid='travelers-field']")).click();
	driver.findElement(By.xpath("//*[@id=\"adaptive-menu\"]/div/div/div/div[2]/section/div[1]/div[1]/div/button[2]")).click();
	driver.findElement(By.xpath("//*[@id=\"adaptive-menu\"]/div/div/div/div[2]/section/div[1]/div[2]/div/button[2]")).click();
    WebElement dr= driver.findElement(By.xpath("//select[@id='child-age-input-0-0']"));
    		dr.click();
            dr.sendKeys("15");
	}


}

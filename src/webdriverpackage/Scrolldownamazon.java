package webdriverpackage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Scrolldownamazon {
	WebDriver driver;
	String baseurl="https://www.amazon.in/";
	@BeforeTest
	public void start() {
		ChromeOptions options=new ChromeOptions();
		
		  options.addArguments("--remote-allow-origins=*"); 
		  driver=new ChromeDriver(options);

		
		
	}
	@BeforeMethod
	public void startup() {
		driver.get(baseurl);
		
		
		
	}
	@Test
	public void scrolldown() {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}

}

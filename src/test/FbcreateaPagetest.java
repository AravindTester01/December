package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.FbcreateaPage;

public class FbcreateaPagetest {
	WebDriver driver;
	@BeforeTest
	
	public void setup() {
		driver=new EdgeDriver();
		driver.get("http://www.facebook.com");
		
	}
	@Test
	public void test() {
		FbcreateaPage ob1=new FbcreateaPage(driver);
	      ob1.fbcreateapageclick();
	      ob1.fbgetstartedclick();
	}


}

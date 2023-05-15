package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.FbloginPage;

public class FbloginPagetest {
	WebDriver driver;
	@BeforeTest
	public void setup() {
		driver=new EdgeDriver();
		driver.get("http://www.facebook.com");
	}
	@Test
	public void test() {
		FbloginPage ob1=new FbloginPage(driver);
		ob1.setvalues("abc@gmail.com","aghahei" );
		ob1.login();
	}

}

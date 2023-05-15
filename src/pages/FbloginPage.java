package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class FbloginPage {
	WebDriver driver;
	By Fbemaillogin=By.id("email");
	By Fbpasswordlogin=By.id("pass");
	By Fbbuttonlogin=By.name("login");

	
	public FbloginPage(WebDriver driver) {
		
		this.driver=driver;
		
	}
	public void setvalues(String email,String password)
	{
		driver.findElement(Fbemaillogin).sendKeys(email);
		driver.findElement(Fbpasswordlogin).sendKeys(password);
		
}
	public void login() {
		driver.findElement(Fbbuttonlogin).click();
	}
}
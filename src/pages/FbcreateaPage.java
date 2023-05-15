package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FbcreateaPage {
	WebDriver driver;
	
	By fbcreateapageclick=By.xpath("//*[@id=\"reg_pages_msg\"]/a");
	By fbgetstartedclick=By.xpath("//*[@id=\"content\"]/div/div[2]/div/div[2]/table/tbody/tr/td[1]/div/div[1]/div[2]/button");
     
	public FbcreateaPage(WebDriver driver) {
		this.driver=driver;
	}

	
	
	public void fbcreateapageclick() {
		driver.findElement(fbcreateapageclick).click();
		
	}

	public void fbgetstartedclick() {
		driver.findElement(fbgetstartedclick).click();
		
	}

	
	}



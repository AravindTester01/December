package TestNGpack;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GoogleParameters {
EdgeDriver driver; 
	@BeforeTest
	public void start() {
		driver = new EdgeDriver();

	}
  @Test
    public void automation() {
	  driver.get("https://www.google.com/");
  }
  @Parameters("searchterms")
  @Test
  public void xml(String searchterms)  {
	  
	  driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys(searchterms,Keys.ENTER);
  }
	

}

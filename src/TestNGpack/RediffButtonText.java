package TestNGpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RediffButtonText {

	EdgeDriver driver;

	@BeforeTest
	public void start() {
		driver = new EdgeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}

	@Test
	public void automation() {
		WebElement button = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[2]"));
		
		  String text=button.getAttribute("value"); 
		 
		  if (text.equals("Check Avaliable")) 
		  {
			System.out.println("pass");
		} else {
			System.out.println("fail");
		}

	}

}

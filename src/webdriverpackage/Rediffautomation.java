package webdriverpackage;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Rediffautomation {
	EdgeDriver driver;
	
	@Before
	public void Start() {
		driver=new EdgeDriver();
	}
		@Test
		public void Authentication() {
			driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
			driver.manage().window().maximize();
		
			WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]"));
			Select day=new Select(dropdown);
			day.selectByValue("14");
			 
			
		    WebElement dropdown1=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[2]"));
		    Select month=new Select(dropdown);
		    month.selectByVisibleText("JAN");
		    
		    WebElement dropdown2=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[3]"));
		    Select year=new Select(dropdown2);
		    year.selectByValue("2000");
		    
	}

}

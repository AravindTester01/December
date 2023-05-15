package TestNGpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Redifftask {
	EdgeDriver driver;
	@BeforeTest
	public void startup() {
		 driver=new EdgeDriver();
	}
	 @BeforeMethod
	 public void Method()
	 {
		 driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	 }
	 @Test
	 public void automation() 
	 {
		 boolean logo=driver.findElement(By.xpath("//*[@id=\"wrapper\"]/table[1]/tbody/tr[1]/td[1]/img")).isSelected();
		
		 
		if(logo) {
			System.out.println("Icon is displayed");}
		else
		{
			System.out.println("Icon is not displayed ");
			 
		 }
	 }
	 @Test
	 public void automation2() {
			
			  boolean RadioButton= driver.findElement(By.xpath(
			  "//*[@id=\"tblcrtac\"]/tbody/tr[24]/td[3]/input[1]")).isSelected(); 
			  if(RadioButton) {
				  System.out.println("radio button is selected");
			  }
			  else
			  {
				  System.out.println("radio button is not selected");
			  }
			  
			 
	 }
			
	@Test
	public void createaccount() {
		boolean Createac=driver.findElement(By.xpath("//*[@id=\"Register\"]")).isEnabled();
		if (Createac) {
			System.out.println("Create ac is Enabled");
		}
		else
		{
			System.out.println("Createac is not enabled");
		}
	}

	 }
		/*
		 * //@Test(priority=1) public void automation2() { driver.findElement(By.xpath(
		 * "/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).
		 * sendKeys("what is the captial of India");
		 * 
		 * System.out.println("trusting "); }
		 * 
		 * @AfterMethod public void done() {
		 * System.out.println("done with the progress");
		 * System.out.println("Don't quit "); }
		 */



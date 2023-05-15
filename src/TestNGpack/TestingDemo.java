package TestNGpack;


import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestingDemo {
	EdgeDriver driver;
	
@BeforeTest
public void startup() {
	 driver=new EdgeDriver();
}
 @BeforeMethod
 public void Method()
 {
	 driver.get("https://www.google.com");
 }
 @Test(priority=2,invocationCount = 1)
 public void automation() 
 {
	 driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/img"));
	
 }
 @Test(priority=1)
 public void automation2()
 {
	 driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("what is the captial of India");
	 
	 System.out.println("trusting ");
 }
	 
@AfterMethod
public void done() {
	System.out.println("done with the progress");
    System.out.println("Don't quit ");
 }
@AfterTest
public void quit()
{
	//driver.quit();
}
	

}

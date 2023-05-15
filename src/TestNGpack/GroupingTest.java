
package TestNGpack;


import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GroupingTest {
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
	 @Test(groups= {"smoke"})
	 public void automation() 
	 {
		System.out.println("test1");
		
	 }
	 @Test(groups= {"regression"})
	 public void automation2()
	 {
		 System.out.println("test2 ");
	 }
	 @Test(groups= {"smoke","sanity"})
	 public void automation3() 
	 {
		System.out.println("test3");
		
	 }
	 @Test(groups= {"sanity"})
	 public void automation4() 
	 {
		System.out.println("test4");
		
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

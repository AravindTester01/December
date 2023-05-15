package TestNGpack;


import java.io.File;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TakeScreenshot {
	EdgeDriver driver;
	@BeforeTest
	public void start() {
		driver=new EdgeDriver();
		
	}
	@BeforeMethod
	public void automation()  {
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
		
		@Test
		public void Screenshot() throws Exception 
		{
     File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);		
       FileHandler.copy(src,new File("D://image.png"));
            
		}
		
		}
		


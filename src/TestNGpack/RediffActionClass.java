package TestNGpack;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RediffActionClass {


EdgeDriver driver;
@BeforeTest
public void Startup() {
	driver=new EdgeDriver();
}
@BeforeMethod
public void Method() {
	driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	driver.manage().window().maximize();
}
 @Test
 public void automation() {
	 WebElement fullscreen=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input"));
     WebElement RediffmaillId=  driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[1]"));
     fullscreen.sendKeys("aravind");
     Actions act=new Actions(driver);
     act.keyDown(fullscreen,Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL);
     act.keyDown(fullscreen,Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL);
     act.keyDown(RediffmaillId,Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL);
      act.perform();
 }
}
 
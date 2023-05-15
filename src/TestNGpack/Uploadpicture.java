package TestNGpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Uploadpicture {
EdgeDriver driver;
@BeforeTest
public void start() {
	driver = new EdgeDriver();
	driver.get("https://demo.guru99.com/test/upload/");
}

@Test
public void automation() {
	WebElement button = driver.findElement(By.xpath("//*[@id=\"uploadfile_0\"]"));
	button.sendKeys("C:\\Users\\user\\Documents\\redifftask.txt");
	driver.findElement(By.xpath("//*[@id=\"terms\"]")).click();
	driver.findElement(By.xpath("//*[@id=\"submitbutton\"]")).click();
	}
}
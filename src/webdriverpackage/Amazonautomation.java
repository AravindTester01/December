package webdriverpackage;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Amazonautomation {
	EdgeDriver driver;
	
@Before
public void setup(){
	

driver=new EdgeDriver();
driver.get("http://www.amazon.in");
driver.manage().window().maximize();
}
@Test
public void Authentication() {
	driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("lenovo");
	driver.findElement(By.xpath("//*[@id='nav-search-submit-button']")).click();
	driver.findElement(By.xpath("//button[@data-csa-c-content-id='nav_cs_bestsellers']")).click();
	driver.findElement(By.xpath("//*[//*[@id=\"nav-xshop\"]/a[2]]")).click();
	driver.findElement(By.xpath("//*[@id='GLUXZipUpdateInput']")).sendKeys("aravind@123");
	driver.findElement(By.xpath("//*[@id=\"GLUXZipUpdate\"]")).click();
	//driver.findElement(By.xpath("")
}
}
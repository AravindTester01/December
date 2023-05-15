package TestNGpack;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DroppableClass {

	EdgeDriver driver;
	@BeforeTest
	public void startup() {
		driver=new EdgeDriver();
		driver.manage().window().maximize();
	}
	@BeforeMethod
	  public void Method() {
		driver.get("https://demoqa.com/droppable");
	}
	@Test
	public void Test1() {
		WebElement source= driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		WebElement target= driver.findElement(By.xpath("//*[@id=\"droppable\"] "));
		Actions act=new Actions(driver);
		act.dragAndDrop(source, target).build().perform();
		String exptext="Dropped";
		String actualtext=target.getText();
		if(exptext.equals(actualtext)) {
			System.out.println("Dropped");
			}
		else
		{
			System.out.println("not change ");
		}
		
		
	}
}

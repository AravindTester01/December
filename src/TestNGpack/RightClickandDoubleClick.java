package TestNGpack;



import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RightClickandDoubleClick {
	EdgeDriver driver;
	@BeforeTest
	public void Startup() {
		driver=new EdgeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	}
	
		@Test
		public void test1() {
			Actions act=new Actions(driver);
			//RightClick
			
			  WebElement
			  rightclick=driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
			  act.contextClick(rightclick).perform(); WebElement
			  copy=driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[1]"));
			  copy.click(); driver.switchTo().alert().accept();
			 
		
		//Doubleclick
		WebElement doubleclick=driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
		act.doubleClick(doubleclick).perform();
		Alert alert=driver.switchTo().alert();
		//System.out.println(alert.getText());
		alert.accept();
		
			
		}
	}



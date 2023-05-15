package webdriverpackage;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Tagname {

    EdgeDriver driver;
    
    @Before
    public void start() {
    driver= new EdgeDriver();
    }
    
    @Test
    public void authecation() {
    	driver.get("http://www.facebook.com");
    List<WebElement> I=driver.findElements(By.tagName("a"));	
    System.out.println(I.size());	
    
   //for (int i=0;i<I.size();i++) {
	   System.out.println("links on page are"+I.get(i).getAttribute("href"));
	   System.out.println("links on page are"+I.get(i).getText());
	   
	   for(WebElement li:I) {
		   
		   String link=li.getAttribute("href");
		   String linktext=li.getText();
		   System.out.println(link+"...."+linktext);
		   
	   }
   }
    

	}

}

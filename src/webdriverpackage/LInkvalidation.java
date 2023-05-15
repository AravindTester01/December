package webdriverpackage;


import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;



import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.edge.EdgeDriver;

public class LInkvalidation {  
      EdgeDriver driver;
	
	@Before
	public void start() {
		driver=new EdgeDriver();
		driver.get("https://www.facebook.com");
        driver.manage().window().maximize();
	}
	
   @Test
   public void Automation() {
	   List<WebElement> I=driver.findElements(By.tagName("a"));	
	    System.out.println(I.size());	
	     
  for(WebElement li:I) {
	  String link=li.getAttribute("href");
	   verify(link);
  }
		

	}

private void verify(String link) {
	try {
	URL ob=new URL(link);
	
		HttpURLConnection con=(HttpURLConnection)ob.openConnection();
	   con.connect();
	   if(con.getResponseCode()==200)
	   {
		   System.out.println("link is succesful----"+link);
	   }
	   else if(con.getResponseCode()==404)
	   {
		   System.out.println("link is broken---"+link);
	   }
	} catch (IOException e) {
		System.out.println("error");
	}
	
	
}


	

   
		
	
	
}


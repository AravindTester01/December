package webdriverpackage;

import org.junit.After;
import org.junit.Before;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitdemo {
	ChromeDriver driver;
	
    @Before		
	public void setup() {
	   driver=new ChromeDriver();
	  
  }
    
    @Test
    public void test1()
    {
    	driver.get("https //openai.com login");
    }
    
   @Test
   public void test2() {
	 String pagesource= driver.getPageSource();
   }
   
   @Test
   public void test3(){
	  String actualtitle =driver.getTitle();
   }
   
   
	  @After
	  public void teardown() {
		  driver.quit();	  
	   
   }
}

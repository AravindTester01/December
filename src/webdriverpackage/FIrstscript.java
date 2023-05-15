package webdriverpackage;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FIrstscript {

	public static void main(String[] args) {
 EdgeDriver driver=new EdgeDriver();// browser open
     driver.get("http://www.google.com"); // url loading
    String actualtitle= driver.getTitle(); //returns actual title of the application
     System.out.println(actualtitle);
     String exp= "google";
     if(actualtitle.equalsIgnoreCase(exp))
     {
    	 System.out.println("pass");
     }
     else {
    	 System.out.println("fail");
     }
    
   EdgeDriver newdriver= new EdgeDriver();
   newdriver.get("http://www.google.com");
   String actualtitile=newdriver.getTitle();
   System.out.println(actualtitle);
   String exp1= "google";
    if(actualtitle.equals(exp))
    {
    	System.out.println("pass");
    }
    else
    {
    	System.out.println("fail");
    }

	}

}

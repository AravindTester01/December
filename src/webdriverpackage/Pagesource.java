package webdriverpackage;

import org.openqa.selenium.chrome.ChromeDriver;

public class Pagesource {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
	  String pagesource=driver.getPageSource();
       if(pagesource.contains("Gmail")) {
    	   System.out.println("present");
       }
       else {
    	   System.out.println("not present");
       }
	}

}

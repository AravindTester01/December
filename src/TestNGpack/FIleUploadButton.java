package TestNGpack;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FIleUploadButton {
	ChromeDriver driver;
	@BeforeTest
	public void start() {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*"); 
		  driver=new ChromeDriver(options);
	
	}
	@Test
	public void automation() throws AWTException {
		driver.get("https://www.ilovepdf.com/word_to_pdf");
		driver.findElement(By.xpath("//*[@id=\"pickfiles\"]/span")).click();
		fileupload("C:\\Users\\user\\Downloads\\Hello world.docx");
	}
	
		
	
	public void fileupload(String p) throws AWTException 
	{
	StringSelection	strSelection=new StringSelection(p);
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strSelection,null);
	
	Robot robot=new Robot();
	robot.delay(3000);
    robot.keyPress(KeyEvent.VK_CONTROL);
    robot.keyPress(KeyEvent.VK_V);
    robot.keyRelease(KeyEvent.VK_V);
    robot.keyRelease(KeyEvent.VK_CONTROL);
    robot.delay(2000);
	robot.keyRelease(KeyEvent.VK_ENTER);	
	}
	
		
		
	}
	
	



package webPages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseclass.ProjectSpecificMethod;

public class UploadRequiredDocument extends ProjectSpecificMethod{
	
	WebDriverWait webdwait = new WebDriverWait(driver, Duration.ofSeconds(180));
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	public void uploadDocument(String type) throws InterruptedException, AWTException
	{
		switch(type)
		{
		case "Exceptional_Cas2Cash":
			
				//driver.findElement(By.xpath("(//button[text()='Upload'])[1]")).click(); 
			
			    Thread.sleep(5000);
				WebElement chooseFile = driver.findElement(By.xpath("(//button[text()='Upload'])[1]"));
				File file = new File("./sample.jpg");
				chooseFile.click();
				Thread.sleep(3000);
				 StringSelection upload =
						  new StringSelection(file.getAbsolutePath());
						  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(upload, null);
						  Robot action = new Robot(); 
						  action.keyPress(KeyEvent.VK_CONTROL);
						  action.keyPress(KeyEvent.VK_V); 
						  action.keyRelease(KeyEvent.VK_CONTROL);
						  action.keyRelease(KeyEvent.VK_V);
						  Thread.sleep(3000);
						  action.keyPress(KeyEvent.VK_ENTER);
						  action.keyRelease(KeyEvent.VK_ENTER);
				
			    
			    WebElement submit = webdwait.until(ExpectedConditions
						.elementToBeClickable(By.xpath("//button[text()='Submit']")));
			    submit.click();
		}
		
	}

}

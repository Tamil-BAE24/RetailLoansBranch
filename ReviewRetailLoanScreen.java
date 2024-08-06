package webPages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseclass.ProjectSpecificMethod;

public class ReviewRetailLoanScreen extends ProjectSpecificMethod {
	
	WebDriverWait webdwait = new WebDriverWait(driver, Duration.ofSeconds(180));
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	public UploadRequiredDocument reviewretailloan(String type)
	{
		switch(type)
		{
		
		case "Exceptional_Cas2Cash":
		js.executeScript("window.scrollBy(0,1600)");
		
		WebElement next2 = webdwait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//button[text()='NEXT']")));
		next2.click();
		
		break;
		}
		
		return new UploadRequiredDocument();
		
	}

}

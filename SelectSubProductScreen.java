package webPages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseclass.ProjectSpecificMethod;

public class SelectSubProductScreen extends ProjectSpecificMethod {
	WebDriverWait webdwait = new WebDriverWait(driver, Duration.ofSeconds(180));
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	public EnterLoanDetails selectsubproduct(String type) {
		
		
		switch(type) {
		
		case "Exceptional_Cas2Cash" :
		
		WebElement subproduct = webdwait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//strong[text()='Cash to Cash - CC']")));
		
		subproduct.click();
		
		js.executeScript("window.scrollBy(0,1250)");
		
		WebElement next = webdwait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//button[text()='NEXT']")));
		
		next.click();
		
		break;
		
		}
		
		return new EnterLoanDetails();
		
	}

}

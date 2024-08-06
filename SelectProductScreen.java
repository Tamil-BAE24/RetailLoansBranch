package webPages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseclass.ProjectSpecificMethod;

public class SelectProductScreen extends ProjectSpecificMethod {
	
	WebDriverWait webdwait = new WebDriverWait(driver, Duration.ofSeconds(180));
	
	
public SelectSubProductScreen selectProduct(String type) throws InterruptedException

{
	

	switch(type) {
	
	case "Exceptional_Cas2Cash":
		
	Thread.sleep(10000);
	WebElement product = webdwait.until(ExpectedConditions
			.elementToBeClickable(By.xpath("(//div[@class='CardLayout---scrollable_content'])[1]")));
	product.click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[text()='NEXT']")).click();
	
	break;
	
	case "Exceptional":
		break;
	case "Normal":
		break;
	case "Topup":
		break;
	
	}
	
	return new SelectSubProductScreen();
	
}
}

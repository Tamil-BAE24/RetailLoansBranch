package webPages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseclass.ProjectSpecificMethod;

public class EnterLoanDetails extends ProjectSpecificMethod {
	
	WebDriverWait webdwait = new WebDriverWait(driver, Duration.ofSeconds(180));
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	public EnterColateralDetails loandetailsscreen(String type ) throws InterruptedException
	
	{
		switch(type)
		{
		
		case "Exceptional_Cas2Cash" :
			
		js.executeScript("window.scrollBy(0,600)");
		
		WebElement currency = webdwait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//strong[text()='JOD']")));
		
		currency.click();
		
		Thread.sleep(3000);
		
		js.executeScript("window.scrollBy(0,600)");
		
		driver.findElement(By.xpath("//span[text()='Settlement Account']//following::span[text()='-----Select-----']")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//div[text()='0410135528115101 - Regular Demand - JOD - 139,388.5160']")).click();
		
		js.executeScript("window.scrollBy(0,600)");
		
		driver.findElement(By.xpath("//span[text()='Cash To Cash Account Number']//following::span[text()='-----Select-----']")).click();
		js.executeScript("window.scrollBy(0,100)");
		Thread.sleep(1500);
		Actions action = new Actions(driver);
		WebElement ele= driver.findElement(By.xpath("//div[text()='0410135528115101 - Regular Demand - JOD - 139,388.5160']"));
		action.moveToElement(ele).click().perform();
		//ele.click();
		
		js.executeScript("window.scrollBy(0,600)");
		
		driver.findElement(By.xpath("//label[text()='Limit *']//following::input[@class='TextInput---text TextInput---align_start']")).sendKeys("10000");
		driver.findElement(By.xpath("//label[text()='Limit *']")).click();
		
		js.executeScript("window.scrollBy(0,600)");
		
		Thread.sleep(2000);
		
		WebElement cardtype = webdwait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//strong[text()='PLATINUM']")));
		cardtype.click();
		
		WebElement next = webdwait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//button[text()='Next']")));
		next.click();
		
		WebElement payment = webdwait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//strong[text()='Payment Due Percentage *']//following::strong[text()='100%']")));
		payment.click();
		
		WebElement next1 = webdwait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//button[text()='Next']")));
		next1.click();
		
		driver.findElement(By.xpath("//span[text()='Delivery of Credit Card']//following::label[text()='No']")).click();
		
		WebElement next2 = webdwait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//button[text()='Next']")));
		next2.click();
		
		break;
		}
		
	return new EnterColateralDetails();
		
	}
	

}

package webPages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseclass.ProjectSpecificMethod;

public class EnterColateralDetails extends ProjectSpecificMethod {
	WebDriverWait webdwait = new WebDriverWait(driver, Duration.ofSeconds(180));
	
	public ReviewRetailLoanScreen colateralDetails(String type)
	
	{
	
		switch(type)
		{
		case "Exceptional_Cas2Cash":
		WebElement colateral1 = webdwait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//div[text()='Cash Guarantee Is Mandatory For Credit Cash to Cash Loans']//following::span[text()='-----Select-----']")));
		colateral1.click();
		WebElement colateral2 = webdwait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//div[text()='Cash Guarantee']")));
		colateral2.click();
		
		WebElement colateral3 = webdwait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("(//strong[text()='Loan Type']//following::span[@data-placeholder='-----Select-----'])[1]")));
		colateral3.click();
		
		WebElement colateral4 = webdwait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//div[text()='Credit Card | Loan Limit - 10000']")));
		colateral4.click();
		
		WebElement next2 = webdwait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//button[text()='Next']")));
		next2.click();
		
		
		break;
		}
		
		
		
		return new ReviewRetailLoanScreen();
	}

}

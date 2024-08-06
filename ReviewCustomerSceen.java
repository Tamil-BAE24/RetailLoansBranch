package webPages;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseclass.ProjectSpecificMethod;

public class ReviewCustomerSceen extends ProjectSpecificMethod {
	WebDriverWait webdwait = new WebDriverWait(driver, Duration.ofSeconds(180));

	public SelectProductScreen ReviewCustomer(String type) throws InterruptedException

	{	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		switch(type) {
		
		case "Exceptional_Cas2Cash":
			WebElement company = webdwait.until(ExpectedConditions
					.elementToBeClickable(By.xpath("//input[@placeholder='Type to select the Company Name']")));
			
			company.sendKeys("Samsung Electronics Levant - TML - true");	
		driver.findElement(By.xpath("//p[text()='Samsung Electronics Levant - TML - true']")).click();
		driver.findElement(By.xpath("(//strong[text()='Sector']/following::div)[5]")).click();
		driver.findElement(By.xpath("//div[text()='Private']")).click();
		driver.findElement(By.xpath("(//span[text()='Exception Reason']/following::div)[3]")).click();
		driver.findElement(By.xpath("//div[text()='الراتب الصافي اقل من السياسة']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()='Other Comments']")).click();
		//driver.findElement(By.xpath("(//textarea[@class='ParagraphWidget---textarea ParagraphWidget---align_start ParagraphWidget---height_medium'])[2]")).sendKeys("Review customer screen submitted");
		driver.findElement(By.xpath("//button[text()='NEXT']")).click();
		
		break;
		
		case "Normal":
			break;
			
		case "Topup":
			break;
			
		case "Exceptional":
			break;
		}
		return new SelectProductScreen();
	}
	
	}


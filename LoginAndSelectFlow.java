package webPages;

import java.time.Duration;

import org.openqa.selenium.By;


import baseclass.ProjectSpecificMethod;

public class LoginAndSelectFlow extends ProjectSpecificMethod {
	

	public  ReviewCustomerSceen SelectApplication(String type) throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("un")).sendKeys("LMBranchMaker");
		driver.findElement(By.id("pw")).sendKeys("1234");
		driver.findElement(By.xpath("//input[@value='Sign In']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//span[text()='Retail Loans']")).click();
		Thread.sleep(5000);
		switch(type) {
		
		case"Normal" :
			driver.findElement(By.xpath("//a[text()='Create New Retail Loan']")).click();
			break;
		case"Exceptional" :
			driver.findElement(By.xpath("//a[text()='Create New Exceptional Retail Loan']")).click();
			driver.findElement(By.xpath("//strong[text()='  New Loan']")).click();
			break;
		case"TopUp" :
			driver.findElement(By.xpath("//a[text()='Top Up Retail Loans']")).click();
			break;	
		case"Exceptional Topup" :
			driver.findElement(By.xpath("//a[text()='Create New Exceptional Retail Loan']")).click();
			driver.findElement(By.xpath("//strong[text()='  Top Up Loan']")).click();
			break;
		case"Exceptional_Cas2Cash" :
			
			driver.findElement(By.xpath("//a[text()='Create New Exceptional Retail Loan']")).click();
			driver.findElement(By.xpath("//strong[text()='  New Loan']")).click();
			driver.findElement(By.xpath("//label[contains(text(),'Existing')]")).click();
			driver.findElement(By.xpath("(//input[@value='No']/following-sibling::label[text()='No'])[1]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@value='Yes']/following-sibling::label[text()='Yes'])[2]")).click();
			driver.findElement(By.xpath("//strong[text()='  Credit Card Loan']")).click();
			driver.findElement(By.xpath("(//label[text()='CIF Number']/following::input)[1]")).sendKeys("041355281");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[text()='Search']")).click();
			driver.findElement(By.xpath("//th[@class='PagingGridLayout---checkbox']")).click();
			driver.findElement(By.xpath("//button[text()='Next']")).click();
			break;		
		}	
		
return new ReviewCustomerSceen();				
	}
	

}

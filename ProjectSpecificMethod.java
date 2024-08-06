package baseclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ProjectSpecificMethod {
	
	public static RemoteWebDriver driver;
	
	

	@BeforeMethod
	public void preCondition() {
		
		driver = new ChromeDriver();
		driver.get("https://bpm-qa-01.baelab.net/suite/tempo/actions");
		driver.manage().window().maximize();
		driver.findElement(By.id("un")).sendKeys("LMBranchMaker");
		driver.findElement(By.id("pw")).sendKeys("1234");
		driver.findElement(By.xpath("//input[@value='Sign In']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//span[text()='Retail Loans']")).click();	
	}
	
	@AfterMethod
	public void postCondition()
	{
		//driver.close();
	}
}

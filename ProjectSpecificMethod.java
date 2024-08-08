package baseclass;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ProjectSpecificMethod {
	
	public static RemoteWebDriver driver;
	public static String reqid;
	
	public static ExtentSparkReporter reporter;
	public static ExtentReports extent;
	public static ExtentTest test;
	int i=1;
	
	@BeforeTest
	public void reportstart(ITestContext context)
	{
		String testName = context.getCurrentXmlTest().getName();
		String reportFileName = null;

		if (testName.equals("Regression"))
		{
			
			reportFileName = "./RetailloanBranch.html";	
			
		} 
		
		reporter = new ExtentSparkReporter(reportFileName);
		extent = new ExtentReports();
		extent.attachReporter(reporter);
	}


	@BeforeMethod
	public void preCondition() {
		
		
		
		driver = new ChromeDriver();
		driver.get("https://bpm-qa-01.baelab.net/suite/tempo/actions");
		driver.manage().window().maximize();
		
		test = extent.createTest("TC_00" + i);
		test.assignCategory("Regression");
		test.assignAuthor("Tamil Selvan Lenin");
			
		
	}
	
	@AfterMethod
	public void reportEnd(ITestResult result) {
		if (result.getStatus() == ITestResult.FAILURE) {
			test.fail(result.getThrowable());
		} else if (result.getStatus() == ITestResult.SUCCESS) {
			;
		} else {
			test.skip("Test skipped");
		}
		extent.flush();
		i++;
		
		
	}
}

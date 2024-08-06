package testCases;

import java.awt.AWTException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import baseclass.ProjectSpecificMethod;
import webPages.LoginAndSelectFlow;

public class Testcases extends ProjectSpecificMethod {
	
	@Test(dataProvider="loans")
	public void ExceptionalC2C(String type) throws InterruptedException, AWTException
	{
		LoginAndSelectFlow case1 = new LoginAndSelectFlow();
		
		case1.SelectApplication(type).ReviewCustomer(type).selectProduct(type)
		.selectsubproduct(type).loandetailsscreen(type).colateralDetails(type)
		.reviewretailloan(type).uploadDocument(type);
		
		
		
	}
	@DataProvider(name="loans")
	public Object[] loantype() {
		
		return new Object[] {"Exceptional_Cas2Cash"};
		
	}

}

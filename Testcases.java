package testCases;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import approvals.BranchCheckerApproval;
import baseclass.ProjectSpecificMethod;
import webPages.LoginAndSelectFlow;

public class ExceptionC2CCreditCard extends ProjectSpecificMethod {
	
	@Test(dataProvider="loans" ,enabled =true ,priority=1)
	public void ExceptionalC2C(String type) throws InterruptedException, AWTException
	{
		LoginAndSelectFlow case1 = new LoginAndSelectFlow();
		case1.SelectApplication(type).ReviewCustomer(type).selectProduct(type)
		.selectsubproduct(type).loandetailsscreen(type).colateralDetails(type)
		.reviewretailloan(type).uploadDocument(type);
		
		test.pass("Test Case 01: To verify customer able to submit a Exceptional C2C request without any sail errors");
	}
	@DataProvider(name="loans")
	public Object[] loantype() {
		
		return new Object[] {"Exceptional_Cas2Cash"};
		
	}

	@Test(enabled =true,priority=2,dependsOnMethods ="ExceptionalC2C")
	public void branchapproval() throws InterruptedException, IOException
	{
		BranchCheckerApproval ap = new BranchCheckerApproval();
		ap.branchchecker();
		test.pass("Test Case 02: To verify branch checker able to approve a Exceptional C2C request without any sail errors");
		
	}
	@Test(enabled =true,dependsOnMethods ="branchapproval",priority=3)
	public void creditmakerapproval() throws InterruptedException
	{
		BranchCheckerApproval ap = new BranchCheckerApproval();
		ap.creditmaker();
		test.pass("Test Case 03: To verify credit maker able to approve a Exceptional C2C request without any sail errors");
	}
	@Test(enabled =true,dependsOnMethods ="creditmakerapproval",priority=4)
	public void creditcheckerapproval() throws InterruptedException
	{
		BranchCheckerApproval ap = new BranchCheckerApproval();
		ap.creditchecker();
		test.pass("Test Case 04: To verify credit checker able to approve a Exceptional C2C request without any sail errors");
	}
	@Test(enabled =true,dependsOnMethods ="creditcheckerapproval",priority=5)
	public void branchmakerapproval() throws InterruptedException, AWTException
	{
		BranchCheckerApproval ap = new BranchCheckerApproval();
		ap.branchmaker();
		test.pass("Test Case 05: To verify Branch maker able to upload a contract document and approve a Exceptional C2C request without any sail errors");
	}
	@Test(enabled =true,dependsOnMethods ="branchmakerapproval",priority=6)
	public void creditadminmakerapproval() throws InterruptedException
	{
		BranchCheckerApproval ap = new BranchCheckerApproval();
		ap.creditadminmaker();
		test.pass("Test Case 06: To verify credit admin maker able to approve a Exceptional C2C request without any sail errors");
	}
	@Test(enabled =true,dependsOnMethods ="creditadminmakerapproval",priority=7)
	public void creditadmincheckerapproval() throws InterruptedException
	{
		BranchCheckerApproval ap = new BranchCheckerApproval();
		ap.creditadminchecker();
		
		test.pass("Test Case 07: To verify credit admin checker able to approve a Exceptional C2C request without any sail errors");
	}
	@Test(enabled =true,dependsOnMethods ="creditadmincheckerapproval",priority=8)
	public void operationmakerapproval() throws InterruptedException
	{
		BranchCheckerApproval ap = new BranchCheckerApproval();
		ap.OperationMaker();
		
		test.pass("Test Case 08: To verify operation maker able to approve a Exceptional C2C request without any sail errors");
	}
	@Test(enabled =true,dependsOnMethods ="operationmakerapproval",priority=9)
	public void operationcheckerapproval() throws InterruptedException
	{
		BranchCheckerApproval ap = new BranchCheckerApproval();
		ap.OperationChecker();
		
		test.pass("Test Case 09: To verify operation checker able to approve a Exceptional C2C request without any sail errors");
	}

}

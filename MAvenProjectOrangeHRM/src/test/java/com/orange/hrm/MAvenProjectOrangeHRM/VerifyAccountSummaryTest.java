package com.orange.hrm.MAvenProjectOrangeHRM;


import org.junit.Assert;
import org.testng.annotations.Test;


public class VerifyAccountSummaryTest extends Base{
	
	@Test
	public void VerifyAccountSummary() {
		


		Login lp = new Login(driver);
		lp.applicationLogin("username", "password");

		AccountSummary acc = new AccountSummary(driver);
	
		
		
		String actualMsg = acc.getCashAccountText();
		String expectedMsg = "Cash Accounts";
		
		Assert.assertEquals(actualMsg,expectedMsg);
		
		
	}	

}

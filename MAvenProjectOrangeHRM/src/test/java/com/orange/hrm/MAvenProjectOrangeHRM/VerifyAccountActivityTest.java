package com.orange.hrm.MAvenProjectOrangeHRM;

import org.junit.Assert;
import org.testng.annotations.Test;

public class VerifyAccountActivityTest  extends Base{
	@Test
	public void testAccountActivity() {
		Login lp = new Login(driver);
		lp.applicationLogin("username", "password");
	//	AccountSummary acc = new AccountSummary(driver);
		AccountActivity act = new AccountActivity(driver);
	
		act.clickAccountActivity();
		
		String actualText0 = act.getTextMessage();
		String expectedText0 = "Show Transactions";
		Assert.assertEquals(actualText0, expectedText0);
		
		
		act.selectAccountType();
		
		
//		String actualText1 =act.getMessageDate();
//		String expectedText1 = "";
//		Assert.assertEquals(actualText1, expectedText1);
//		
//		String actualText2 =act.getMessageDate1();
//		String expectedText2 = "";
//		Assert.assertEquals(actualText2, expectedText2);
//		
//		String actualText3 =act.getMessageDate2();
//		String expectedText3 = "";
//		Assert.assertEquals(actualText3, expectedText3);
//		
//		String actualText4 =act.getMessageDate3();
//		String expectedText4 = "";
//		Assert.assertEquals(actualText4, expectedText4);
//		
//		String actualText5 =act.getTextDescription();
//		String expectedText5 = "";
//		Assert.assertEquals(actualText5, expectedText5);
//		
//		String actualText6 =act.getTextonlinetransfer1();
//		String expectedText6 = "";
//		Assert.assertEquals(actualText6, expectedText6);
//		
//		String actualText7 =act.getTextofficesupply();
//		String expectedText7 = "";
//		Assert.assertEquals(actualText7, expectedText7);
//		
//		
//		
//		String actualText8 =act.getTextonlinetransfer2();
//		String expectedText8 = "";
//		Assert.assertEquals(actualText8, expectedText8);
//		
		
	}
	


}

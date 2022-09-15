package com.orange.hrm.MAvenProjectOrangeHRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AccountActivity {
	@FindBy(linkText="Account Activity")
	private WebElement accountactivityElement;
	
	@FindBy(css="#ui-tabs-1 > h2")
	private WebElement showTransationsElement;
	
	@FindBy(css="#show_transactions_form > fieldset > div > label")
	private WebElement accountLabelElement;
	
		@FindBy(id="aa_accountId")
	private WebElement accountTypeElement;
	
	@FindBy(css="#all_transactions_for_account > table > thead > tr > th:nth-child(1)")
	private WebElement dateElement;
	
	@FindBy(css="#all_transactions_for_account > table > tbody > tr:nth-child(1) > td:nth-child(1)")
	private WebElement date1Element;
	
	@FindBy(css="#all_transactions_for_account > table > tbody > tr:nth-child(2) > td:nth-child(1)")
	private WebElement date2Element;
	
	@FindBy(css="#all_transactions_for_account > table > tbody > tr:nth-child(3) > td:nth-child(1)")
	private WebElement date3Element;
	
	@FindBy(css="#all_transactions_for_account > table > thead > tr > th:nth-child(1)")
	private WebElement DescriptionElement;
	
	@FindBy(css="#all_transactions_for_account > table > tbody > tr:nth-child(1) > td:nth-child(2)")
	private WebElement onlineTransfer1Element;
	
	@FindBy(css="#all_transactions_for_account > table > tbody > tr:nth-child(2) > td:nth-child(2)")
	private WebElement officesupplyElement;
	
	@FindBy(css="#all_transactions_for_account > table > tbody > tr:nth-child(3) > td:nth-child(2)")
	private WebElement onlineTransfer2Element;
	
	@FindBy(css="#all_transactions_for_account > table > thead > tr > th:nth-child(3)")
	private WebElement DepositsElement;
	
	@FindBy(css="#all_transactions_for_account > table > tbody > tr:nth-child(1) > td:nth-child(3)")
	private WebElement Amount1Element;
	
	@FindBy(css="#all_transactions_for_account > table > tbody > tr:nth-child(3) > td:nth-child(3)")
	private WebElement Amount2Element;
	
	@FindBy(css="#all_transactions_for_account > table > thead > tr > th:nth-child(4)")
	private WebElement WithdrawalElement;
	
	@FindBy(css="#all_transactions_for_account > table > tbody > tr:nth-child(2) > td:nth-child(4)")
	private WebElement withdrawAmountElement;
	
	
	
	
	
	public AccountActivity(WebDriver driver ) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickAccountActivity() {
		accountactivityElement.click();
		
	}
	public String getTextMessage() {
		String actualText = showTransationsElement.getText();
		return  actualText;

	}
	public String getTextAccount() {
		String actualText = accountLabelElement.getText();
		return  actualText;
	}
	public void selectAccountType() {
		Select at = new Select (accountTypeElement);
		at.selectByIndex(4);
		
	}
//	public String getMessageDate() {
//		String actualText = dateElement.getText();
//		return actualText;
//		
//	}
//	
//	public String getMessageDate1() {
//		String actualText = date1Element.getText();
//		return actualText;
//		
//	}
//	public String getMessageDate2() {
//		String actualText = date2Element.getText();
//		return actualText;
//		
//	}
//	public String getMessageDate3() {
//		String actualText = date3Element.getText();
//		return actualText;
//		
//	}
//	public String getTextDescription() {
//		String actualText = DescriptionElement.getText();
//		return actualText;
//		
//	}
//	
//	public String getTextonlinetransfer1() {
//		String actualText = officesupplyElement.getText();
//		return actualText;
//		
//	}
//	public String getTextofficesupply() {
//		String actualText = onlineTransfer1Element.getText();
//		return actualText;
//		
//	}
//	public String getTextonlinetransfer2() {
//		String actualText = onlineTransfer2Element.getText();
//		return actualText;
//		
//	}
//	public String getTextDeposits() {
//		String actualText = DepositsElement.getText();
//		return actualText;
//		
//	}
//	public String getTextAmount1() {
//		String actualText = Amount1Element.getText();
//		return actualText;
//		
//	}
//	public String getTextAmount2() {
//		String actualText = Amount2Element.getText();
//		return actualText;
//		
//	}
//	
//	public String getTextWithdrawal() {
//		String actualText = WithdrawalElement.getText();
//		return actualText;
//		
//	}
//	
//	public String getTextWithdrawalAmount() {
//		String actualText = withdrawAmountElement.getText();
//		return actualText;
//		
//	}
//	
	
	
	
	
	

}

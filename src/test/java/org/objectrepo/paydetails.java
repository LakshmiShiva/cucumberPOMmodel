package org.objectrepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.stepdefinition.Hooks;

public class paydetails {
	public paydetails()
	{
		PageFactory.initElements(Hooks.driver, this);
	}
	
	@FindBy(xpath="(//a[contains(text(),'Pay Billing')])[1]")
	private WebElement paybill;
	
	@FindBy(xpath="//input[@name=\"customer_id\"]")
	private WebElement data;
	
	@FindBy(xpath="//h1[contains(text(),'Pay Billing')]")
	private WebElement report;
	
	@FindBy(xpath="//h4[contains(text(),'Please Input Your Correct Customer ID')]")
	private WebElement errormessagegen;

	public WebElement getPaybill() {
		return paybill;
	}

	public WebElement getData() {
		return data;
	}

	public WebElement getReport() {
		return report;
	}

	public WebElement getErrormessagegen() {
		return errormessagegen;
	}

	
	
}

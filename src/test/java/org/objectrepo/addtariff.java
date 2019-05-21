package org.objectrepo;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.stepdefinition.Hooks;


public class addtariff {
	public addtariff()
	{
		PageFactory.initElements(Hooks.driver, this);
	}
	
	@FindBy(name="rental")
	private WebElement rent;
	
	@FindBy(id="local_minutes")
	private WebElement localmin;
	
	@FindBy(id="inter_minutes")
	private WebElement interminutes;
	
	@FindBy(id="sms_pack")
	private WebElement smspack;
	
	@FindBy(id="minutes_charges")
	private WebElement mincharges;
	
	@FindBy(id="inter_charges")
	private WebElement intercharges;
	

	@FindBy(id="sms_charges")
	private WebElement smscharges;
	
	@FindBy(xpath="//input[@value='Reset']")
	private WebElement resetbutton;
	@FindBy(tagName="h1")
	private WebElement clear;
	@FindBy(name="submit")
	private WebElement submit;
	@FindBy(tagName="h1")
	private WebElement errormessage;
	public WebElement getRent() {
		return rent;
	}
	public WebElement getLocalmin() {
		return localmin;
	}
	public WebElement getInterminutes() {
		return interminutes;
	}
	public WebElement getSmspack() {
		return smspack;
	}
	
	public WebElement getIntercharges() {
		return intercharges;
	}
	public WebElement getSmscharges() {
		return smscharges;
	}
	public WebElement getMincharges() {
		return mincharges;
	}
	public WebElement getResetbutton() {
		return resetbutton;
	}
	public WebElement getClear() {
		return clear;
	}
	public WebElement getSubmit() {
		return submit;
	}
	public WebElement getErrormessage() {
		return errormessage;
	}
	
	
	
	
}

	
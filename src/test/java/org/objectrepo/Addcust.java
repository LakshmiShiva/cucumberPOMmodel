package org.objectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.stepdefinition.Hooks;

public class Addcust {
	
	public Addcust()
	{
		PageFactory.initElements(Hooks.driver, this);
	}
	
	@FindBy(xpath="//label[contains(text(),'Done')]")
	private WebElement btn;
	
	@FindBy(name="fname")
	private WebElement firstname;
	
	@FindBy(name="lname")
	private WebElement lastname;
	
	@FindBy(name="emailid")
	private WebElement email;
	
	@FindBy(name="addr")
	private WebElement address;
	
	@FindBy(name="telephoneno")
	private WebElement mobilenumber;
	
	@FindBy(name="submit")
	private WebElement submit;
	
	

	

	public WebElement getSubmit() {
		return submit;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getMobilenumber() {
		return mobilenumber;
	}
	public WebElement getBtn() {
		return btn;
	}
	

}

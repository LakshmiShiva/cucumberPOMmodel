package org.objectrepo;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.stepdefinition.Hooks;

import cucumber.api.java.en.Then;

public class access {
	public access()
	{
		PageFactory.initElements(Hooks.driver, this);
	}
	@FindBy(xpath="//b[contains(text(),'Customer')]")
	private WebElement success;
	public WebElement getSuccess() {
		return success;
	}
	
}
package org.objectrepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.stepdefinition.Hooks;

public class addtarifplan {
public addtarifplan()
{
	PageFactory.initElements(Hooks.driver, this);
}

@FindBy(xpath="(//a[contains(text(),'Add Tariff Plan to Customer')])[1]")
private WebElement addtariffplan;

@FindBy(xpath="//input[@name=\"customer_id\"]")
private WebElement validdata;
@FindBy(name="submit")
private WebElement submit;

@FindBy(xpath="//h2[contains(text(),'Approved Tariff Plans')]")
private WebElement plangenerate;

public WebElement getAddtariffplan() {
	return addtariffplan;
}

public WebElement getValiddata() {
	return validdata;
}

public WebElement getSubmit() {
	return submit;
}

public WebElement getPlangenerate() {
	return plangenerate;
}

public WebElement getErrormessage() {
	return errormessage;
}

@FindBy(xpath="//h4[contains(text(),'Please')]")
private WebElement errormessage;

}
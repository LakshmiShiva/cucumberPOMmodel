package org.stepdefinition;



import java.util.List;

import org.junit.Assert;
import org.objectrepo.addtariff;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class addtarrif {
	@Given("the user is in addTrafic page")
	public void the_user_is_in_addTrafic_page() {
	
		Hooks.driver.findElement(By.xpath("(//a[contains(text(),'Add Tariff Plan')])[2]")).click();
	}

	@When("the user fill all the fields {string},{string},{string},{string},{string},{string},{string}")
	public void the_user_fill_all_the_fields(String rent, String localmins, String intermin, String smspack,
			String minutecharges, String intercharges, String smscharges) {
		addtariff at=new addtariff();
	at.getRent().sendKeys(rent);
		at.getLocalmin().sendKeys(localmins);
		at.getInterminutes().sendKeys(intermin);
		at.getSmspack().sendKeys(smspack);
		at.getMincharges().sendKeys(minutecharges);
	at.getIntercharges().sendKeys(intercharges);
		at.getSmscharges().sendKeys(smscharges);
	}

	@When("the user click reset button")
	public void the_user_click_reset_button() {
		addtariff at1=new addtariff();
		at1.getResetbutton().click();
	}

	@Then("the form should be clear")
	public void the_form_should_be_clear() {
		addtariff at3=new addtariff();
		Assert.assertTrue(at3.getClear().isDisplayed());
	}

	
		@When("the user fill all the fields with invalid data")
	public void the_user_fill_all_the_fields_with_invalid_data(io.cucumber.datatable.DataTable customerDetails) {
		List<String> cuslist = customerDetails.asList(String.class);
		addtariff at4=new addtariff();
		at4.getRent().sendKeys(cuslist.get(0));
		at4.getLocalmin().sendKeys(cuslist.get(1));
	at4.getInterminutes().sendKeys(cuslist.get(2));
		at4.getSmspack().sendKeys(cuslist.get(3));
		at4.getMincharges().sendKeys(cuslist.get(4));
		at4.getIntercharges().sendKeys(cuslist.get(5));
		at4.getSmscharges().sendKeys(cuslist.get(6));
	}

	@When("The user clicks the submit button in tariff page")
	public void the_user_clicks_the_submit_button() {
		addtariff at5= new addtariff();
		at5.getSubmit().click();
		Alert a = Hooks.driver.switchTo().alert();
		a.accept();
		

	}

	@Then("the error message should display in tariff page")
	public void the_error_message_shoul_display() {
		addtariff at6=new addtariff();
		Assert.assertTrue(at6.getErrormessage().isDisplayed());
		
	}

	@When("the user left all the fields as blank")
	public void the_user_left_all_the_fields_as_blank() {
		addtariff at7=new addtariff();
		at7.getSubmit().click();
		Alert a = Hooks.driver.switchTo().alert();
		a.accept();
	}

	@Then("the error message should display")
	public void the_error_message_should_display() {
		addtariff at8=new addtariff();
		Assert.assertTrue(at8.getErrormessage().isDisplayed());
		
	}

	

}




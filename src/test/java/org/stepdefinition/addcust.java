package org.stepdefinition;
import java.util.List;

import org.objectrepo.Addcust;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
public class addcust {
	
	@Given("the user is in addcust page")
	public void the_user_is_in_addcust_page() {
		
		Hooks.driver.findElement(By.xpath("(//a[contains(text(),'Add Customer')])[1]")).click();
	}

	@When("the user fill all the fields with valid data {string},{string},{string},{string},{string}")
	public void the_user_fill_all_the_fields_with_valid_data(String firstname, String lastname, String email,
			String address, String mobilenumber) {
		Addcust add=new Addcust();
		add.getBtn().click();
		add.getFirstname().sendKeys(firstname);
		add.getLastname().sendKeys(lastname);
		add.getEmail().sendKeys(email);
		add.getAddress().sendKeys(address);
		add.getMobilenumber().sendKeys(mobilenumber);
	}
		@When("The user clicks the submit button")
		public void the_user_clicks_the_submit_button() {
			Addcust add1=new Addcust();
			add1.getSubmit().click();
		}

@When("the user fill all the fields without valid data")
public void the_user_fill_all_the_fields_without_valid_data(io.cucumber.datatable.DataTable cDetails) {
	List<String> cuslist = cDetails.asList(String.class);
	Addcust add1=new Addcust();
	add1.getBtn().click();
	add1.getFirstname().sendKeys(cuslist.get(0));
	add1.getLastname().sendKeys(cuslist.get(1));
	add1.getEmail().sendKeys(cuslist.get(2));
	add1.getAddress().sendKeys(cuslist.get(3));
	add1.getMobilenumber().sendKeys(cuslist.get(4));
    
}

@Then("the error should be generated")
public void the_error_should_be_generated() {
	Alert a = Hooks.driver.switchTo().alert();
	a.accept();
	
}

	}
	
	
package org.stepdefinition;

import java.util.List;

import org.junit.Assert;
import org.objectrepo.addtarifplan;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddTariffPlan {
	


@Given("the user is in addTarifplan page")
public void the_user_is_in_addTarifplan_page() {
	addtarifplan addtar1=new addtarifplan();

	
	addtar1.getAddtariffplan().click();
	  
}

@When("the user fill the field with valid data in addtarif page{string}")
public void the_user_fill_the_field_with_valid_data_in_addtarif_page(String customerid) {
   addtarifplan addtar2=new addtarifplan();
   addtar2.getValiddata().sendKeys(customerid);
}
@When("The user clicks the submit button in add tariff plan page")
public void the_user_clicks_the_submit_button() {
	addtarifplan addtar3=new addtarifplan();
		addtar3.getSubmit().click();
}

@Then("the plan should generated for add tarif page")
public void the_plan_should_generated_for_add_tarif_page() {
	addtarifplan addtar4=new addtarifplan();
	Assert.assertTrue(addtar4.getPlangenerate().isDisplayed());
}

@When("the user fill all the fields by using invalid data in addtarif page")
public void the_user_fill_all_the_fields_by_using_invalid_data_in_addtarif_page(io.cucumber.datatable.DataTable ddetails) {
	addtarifplan addtar5=new addtarifplan();
	List<String> cuslistone = ddetails.asList(String.class);
	addtar5.getValiddata().sendKeys(cuslistone.get(0));
	
}

@Then("the error should generate the error in addtarifplan page")
public void the_error_should_generate_the_error_in_addtarifplan_page() {
	addtarifplan addtar6=new addtarifplan();
	Assert.assertTrue(addtar6.getErrormessage().isDisplayed()); 
}

}

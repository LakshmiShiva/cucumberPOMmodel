package org.stepdefinition;

import java.util.List;

import org.junit.Assert;
import org.objectrepo.paydetails;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class paydetailsmain {

@Given("the user is in paybill page")
public void the_user_is_in_paybill_page() {
	
	
	paydetails bill=new paydetails();
	bill.getPaybill().click();
  }

@When("the user fill the field with valid data in paybill page{string}")
public void the_user_fill_the_field_with_valid_data_in_paybill_page(String cusid) {
	paydetails bill2=new paydetails();
	bill2.getData().sendKeys(cusid);
}

@Then("the plan should generated for paybill report page")
public void the_plan_should_generated_for_paybill_report_page() {
	paydetails bill3=new paydetails();
	Assert.assertTrue(bill3.getReport().isDisplayed());
}

@When("the user fill all the fields by using invalid data in paybill page")
public void the_user_fill_all_the_fields_by_using_invalid_data_in_paybill_page(io.cucumber.datatable.DataTable data) {
	List<String> cuslisttwo = data.asList(String.class);
	paydetails bill4=new paydetails();
	bill4.getData().sendKeys(cuslisttwo.get(0));
}

@Then("the error should generate the error in paybill page")
public void the_error_should_generate_the_error_in_paybill_page() {
	paydetails bill5=new paydetails();
	Assert.assertTrue(bill5.getErrormessagegen().isDisplayed()); 
}


}

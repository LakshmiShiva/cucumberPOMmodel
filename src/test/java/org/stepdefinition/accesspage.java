package org.stepdefinition;

import org.junit.Assert;
import org.objectrepo.access;


import cucumber.api.java.en.Then;

public class accesspage {
	
	@Then("the customer id should generate") 
	public void the_customer_id_should_generate() {
		access ac=new access();
		
	 Assert.assertTrue(ac.getSuccess().isDisplayed()); 
	 }
	
}



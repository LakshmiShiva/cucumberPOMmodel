/*
 * package org.stepdefinition;
 * 
 * import java.util.List;
 * 
 * import org.junit.Assert; import org.openqa.selenium.Alert; import
 * org.openqa.selenium.By; import org.openqa.selenium.WebDriver; import
 * org.openqa.selenium.WebElement; import
 * org.openqa.selenium.chrome.ChromeDriver;
 * 
 * import cucumber.api.java.en.Given; import cucumber.api.java.en.Then; import
 * cucumber.api.java.en.When;
 * 
 * public class Addtariffsteps {
 */
	/*static WebDriver driver;

	@Given("the user is in addTrafic page")
	public void the_user_is_in_addTrafic_page() {
		System.setProperty("webdriver.chrome.drizver",
				"C:\\UsersLakshmi\\CloneTry\\eclipse-workspace\\cucumber\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/telecom/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//a[contains(text(),'Add Tariff Plan')])[2]")).click();
	}

	@When("the user fill all the fields {string},{string},{string},{string},{string},{string},{string}")
	public void the_user_fill_all_the_fields(String rent, String localmins, String intermin, String smspack,
			String minutecharges, String intercharges, String smscharges) {
		driver.findElement(By.name("rental")).sendKeys(rent);
		driver.findElement(By.id("local_minutes")).sendKeys(localmins);
		driver.findElement(By.id("inter_minutes")).sendKeys(intermin);
		driver.findElement(By.id("sms_pack")).sendKeys(smspack);
		driver.findElement(By.id("minutes_charges")).sendKeys(minutecharges);
		driver.findElement(By.id("inter_charges")).sendKeys(intercharges);
		driver.findElement(By.id("sms_charges")).sendKeys(smscharges);
	}

	@When("the user click reset button")
	public void the_user_click_reset_button() {
		driver.findElement(By.xpath("//input[@value='Reset']")).click();
	}

	@Then("the form should be clear")
	public void the_form_should_be_clear() {
		Assert.assertTrue(driver.findElement(By.tagName("h1")).isDisplayed());
	}

	
	 * @Given("The user is in addTraffic page") public void
	 * the_user_is_in_addTraffic_page() { // Write code here that turns the phrase
	 * above into concrete actions throw new cucumber.api.PendingException(); }
	 

	@When("the user fill all the fields with invalid data")
	public void the_user_fill_all_the_fields_with_invalid_data(io.cucumber.datatable.DataTable customerDetails) {
		List<String> cuslist = customerDetails.asList(String.class);
		driver.findElement(By.name("rental")).sendKeys(cuslist.get(0));
		driver.findElement(By.id("local_minutes")).sendKeys(cuslist.get(1));
		driver.findElement(By.id("inter_minutes")).sendKeys(cuslist.get(2));
		driver.findElement(By.id("sms_pack")).sendKeys(cuslist.get(3));
		driver.findElement(By.id("minutes_charges")).sendKeys(cuslist.get(4));
		driver.findElement(By.id("inter_charges")).sendKeys(cuslist.get(5));
		driver.findElement(By.id("sms_charges")).sendKeys(cuslist.get(6));
	}

	@When("The user clicks the submit button")
	public void the_user_clicks_the_submit_button() {
		driver.findElement(By.name("submit")).click();

	}

	@Then("the error message should display")
	public void the_error_message_shoul_display() {
		Assert.assertTrue(driver.findElement(By.tagName("h1")).isDisplayed());
	}

	@When("the user left all the fields as blank")
	public void the_user_left_all_the_fields_as_blank() {
		driver.findElement(By.name("submit")).click();
	}

	@Then("the error message should display")
	public void the_error_message_should_display() {
		Assert.assertTrue(driver.findElement(By.tagName("h1")).isDisplayed());
	}

	
	 * @Given("the user is in addcust page") public void
	 * the_user_is_in_addcust_page() { System.setProperty("webdriver.chrome.driver",
	 * "C:\\UsersLakshmi\\CloneTry\\eclipse-workspace\\cucumber\\driver\\chromedriver.exe"
	 * ); driver = new ChromeDriver();
	 * driver.get("http://demo.guru99.com/telecom/");
	 * driver.manage().window().maximize();
	 * driver.findElement(By.xpath("(//a[contains(text(),'Add Customer')])[1]")).
	 * click(); }
	 * 
	 * @When("the user fill all the fields with valid data {string},{string},{string},{string},{string}"
	 * ) public void the_user_fill_all_the_fields_with_valid_data(String firstname,
	 * String lastname, String email, String address, String mobilenumber) {
	 * //driver.findElement(By.xpath("(//input[@name='active'])[1]")).click();
	 * driver.findElement(By.name("fname")).sendKeys(firstname);
	 * driver.findElement(By.id("lname")).sendKeys(lastname);
	 * driver.findElement(By.name("emailid")).sendKeys(email);
	 * driver.findElement(By.name("addr")).sendKeys(address);
	 * driver.findElement(By.id("telephoneno")).sendKeys(mobilenumber);
	 * 
	 * }
	 * 
	 * @Then("the customer id should generate") public void
	 * the_customer_id_should_generate() {
	 * 
	 * Assert.assertTrue(driver.findElement(By.xpath(
	 * "//b[contains(text(),'Customer')]")).isDisplayed()); }
	 
	@When("the user fill all the fields without valid data")
	public void the_user_fill_all_the_fields_without_valid_data(io.cucumber.datatable.DataTable cDetails) {
		List<String> cuslist = cDetails.asList(String.class);
		driver.findElement(By.name("fname")).sendKeys(cuslist.get(0));
		driver.findElement(By.id("lname")).sendKeys(cuslist.get(1));
		driver.findElement(By.name("emailid")).sendKeys(cuslist.get(2));
		driver.findElement(By.name("addr")).sendKeys(cuslist.get(3));
		driver.findElement(By.id("telephoneno")).sendKeys(cuslist.get(4));

	}

	@Then("the error should be generated")
	public void the_error_should_be_generated() {
		Alert a = driver.switchTo().alert();
		a.accept();
	}



@Given("the user is in addTarifplan page")
public void the_user_is_in_addTarifplan_page() {
	System.setProperty("webdriver.chrome.driver",
			"C:\\UsersLakshmi\\CloneTry\\eclipse-workspace\\cucumber\\driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://demo.guru99.com/telecom/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("(//a[contains(text(),'Add Tariff Plan to Customer')])[1]")).click();
	  
}

@When("the user fill the field with valid data in addtarif page{string}")
public void the_user_fill_the_field_with_valid_data_in_addtarif_page(String customerid) {
   driver.findElement(By.xpath("//input[@name=\"customer_id\"]")).sendKeys(customerid);
}

@Then("the plan should generated for add tarif page")
public void the_plan_should_generated_for_add_tarif_page() {
	Assert.assertTrue(driver.findElement(By.xpath("//h2[contains(text(),'Approved Tariff Plans')]")).isDisplayed());
}

@When("the user fill all the fields by using invalid data in addtarif page")
public void the_user_fill_all_the_fields_by_using_invalid_data_in_addtarif_page(io.cucumber.datatable.DataTable ddetails) {
	List<String> cuslistone = ddetails.asList(String.class);
	driver.findElement(By.xpath("//input[@name=\"customer_id\"]")).sendKeys(cuslistone.get(0));
	
}

@Then("the error should generate the error in addtarifplan page")
public void the_error_should_generate_the_error_in_addtarifplan_page() {
	Assert.assertTrue(driver.findElement(By.xpath("//h4[contains(text(),'Please')]")).isDisplayed()); 
}

@Given("the user is in paybill page")
public void the_user_is_in_paybill_page() {
	System.setProperty("webdriver.chrome.driver",
			"C:\\UsersLakshmi\\CloneTry\\eclipse-workspace\\cucumber\\driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://demo.guru99.com/telecom/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("(//a[contains(text(),'Pay Billing')])[1]")).click();
  }

@When("the user fill the field with valid data in paybill page{string}")
public void the_user_fill_the_field_with_valid_data_in_paybill_page(String cusid) {
	driver.findElement(By.xpath("//input[@name=\"customer_id\"]")).sendKeys(cusid);
}

@Then("the plan should generated for paybill report page")
public void the_plan_should_generated_for_paybill_report_page() {
	Assert.assertTrue(driver.findElement(By.xpath("//h1[contains(text(),'Pay Billing')]")).isDisplayed());
}

@When("the user fill all the fields by using invalid data in paybill page")
public void the_user_fill_all_the_fields_by_using_invalid_data_in_paybill_page(io.cucumber.datatable.DataTable data) {
	List<String> cuslisttwo = data.asList(String.class);
	driver.findElement(By.xpath("//input[@name=\"customer_id\"]")).sendKeys(cuslisttwo.get(0));
}

@Then("the error should generate the error in paybill page")
public void the_error_should_generate_the_error_in_paybill_page() {
	Assert.assertTrue(driver.findElement(By.xpath("//h4[contains(text(),'Please Input Your Correct Customer ID')]")).isDisplayed()); 
}

}
*/
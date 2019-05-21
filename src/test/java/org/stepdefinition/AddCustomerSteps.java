/*
 * package org.stepdefinition;
 * 
 * import java.util.List; import java.util.Map;
 * 
 * import org.junit.Assert; import org.openqa.selenium.By; import
 * org.openqa.selenium.WebDriver; import
 * org.openqa.selenium.chrome.ChromeDriver;
 * 
 * import cucumber.api.java.en.Given; import cucumber.api.java.en.Then; import
 * cucumber.api.java.en.When; import io.cucumber.datatable.DataTable;
 * 
 * public class AddCustomerSteps {
 * 
 * static WebDriver driver;
 * 
 * @Given("the user is in add tarif page") public void
 * the_user_is_in_add_tarif_page() {
 * System.setProperty("webdriver.chrome.driver",
 * "C:\\UsersLakshmi\\CloneTry\\eclipse-workspace\\cucumber\\driver\\chromedriver.exe"
 * ); driver=new ChromeDriver(); driver.get("http://demo.guru99.com/telecom/");
 * driver.manage().window().maximize();
 * driver.findElement(By.xpath("(//a[contains(text(),'Add Tariff Plan')])[2]")).
 * click(); }
 * 
 * @When("the customer fill the valid data in fields") public void
 * the_customer_fill_the_valid_data_in_fields(DataTable customerDetails) {
 * List<String> cuslist = customerDetails.asList(String.class);
 * driver.findElement(By.name("rental")).sendKeys(cuslist.get(0));
 * driver.findElement(By.id("local_minutes")).sendKeys(cuslist.get(1));
 * driver.findElement(By.id("inter_minutes")).sendKeys(cuslist.get(3));
 * driver.findElement(By.id("sms_pack")).sendKeys(cuslist.get(4));
 * driver.findElement(By.id("minutes_charges")).sendKeys(cuslist.get(5));
 * driver.findElement(By.id("inter_charges")).sendKeys(cuslist.get(6));
 * driver.findElement(By.id("sms_charges")).sendKeys(cuslist.get(7)); }
 * 
 * @When("the user clicks the refresh button") public void
 * the_user_clicks_the_refresh_button() {
 * driver.findElement(By.xpath("//input[@value='Reset']")).click(); }
 * 
 * @Then("the form should be refresh") public void the_form_should_be_refresh()
 * { Assert.assertTrue(driver.findElement(By.xpath("")).isDisplayed()); }
 * 
 * }
 */
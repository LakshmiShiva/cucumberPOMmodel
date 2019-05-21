package org.stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	public static WebDriver driver;

	@Before
	public void loadth() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\UsersLakshmi\\CloneTry\\eclipse-workspace\\cucumber\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/telecom/");
		driver.manage().window().maximize();
	}

	@After
	public void quit() {
		driver.quit();
	}
}

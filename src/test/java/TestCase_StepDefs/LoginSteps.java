package TestCase_StepDefs;

import PageObjects.Gap_Login_Page;
import Utilities.ReusableUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps extends BaseClass{
	ReusableUtils reusableUtil = new ReusableUtils();
	
	@Given("User launches the loginpage")
	public void user_launches_the_loginpage() {
		setup();
		testLogger.info("Chrome opened");
		driver.get(baseURL);
		testLogger.info("url opened");
		
	    
	}

	@When("User enters {string} and {string}")
	public void user_enters_and(String string, String string2) {
		Gap_Login_Page gapLoginpage = new Gap_Login_Page(driver);
		reusableUtil.setValueToElement(gapLoginpage.getUserName(), username);
		testLogger.info("Entered username");
		reusableUtil.clickOnWebElement(gapLoginpage.getContinue_btn());
		testLogger.info("Clickedon continue button");
		reusableUtil.setValueToElement(gapLoginpage.getPassword(), password);
		testLogger.info("Entered Password");
	    
	}

	@When("User clicks on login button")
	public void user_clicks_on_login_button() {
		Gap_Login_Page gapLoginpage = new Gap_Login_Page(driver);
		reusableUtil.clickOnWebElement(gapLoginpage.getSignIn_btn());
		testLogger.info("Clickedon Signin button");
	   
	}

	@Then("User should land on HomePage")
	public void user_should_land_on_home_page() {
	    System.out.println(driver.getCurrentUrl());
	    testLogger.info(driver.getCurrentUrl());
	}


}

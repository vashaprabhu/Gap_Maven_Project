package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Gap_Login_Page {

	WebDriver lDriver;
	
	public Gap_Login_Page(WebDriver rDriver) {
		lDriver = rDriver;
		PageFactory.initElements(lDriver, this);
	}
	
	@FindBy(id="verify-account-email")
	WebElement userName;
	
	@FindBy(xpath = "//form[@class='loyalty-email-form']/button")
	WebElement continue_btn;
	
	@FindBy(xpath = "//input[@name='password']")
	WebElement password;
	
	@FindBy(xpath = "//div[@class='loyalty-signInForm-container']//button[contains(text(),'Sign In')]")
	WebElement signIn_btn;
	
	@FindBy(xpath = "//div[@class='sitewide-x5foxo']/button")
	WebElement closeAdWindow;
	
	@FindBy(id="sitewide-account-button-greeting")
	WebElement signinDropDown;
	
	@FindBy(xpath = "//a[contains(text(), 'Sign In')]")
	WebElement signinOption;
	
	public WebElement getUserName() {
		return userName;
	}

	public WebElement getContinue_btn() {
		return continue_btn;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSignIn_btn() {
		return signIn_btn;
	}
	
	public WebElement getCloseWindowButton() {
		return closeAdWindow;
	}
	
	public WebElement getSigninDropDown() {
		return signinDropDown;
	}
	
	public WebElement getSigninOption() {
		return signinOption;
	}


}

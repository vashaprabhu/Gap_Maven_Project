package Utilities;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReusableUtils {
	
public WebDriver driver;
	
	public void clickOnItemOfList(List<WebElement> webelementList, String item) {
		for(WebElement set :webelementList ) {
			if(set.getText().equalsIgnoreCase(item)) {
				try{
					set.click();
					break;
				}catch(Exception e)
				{
					System.out.println(e);
				}
				
			}
		}
	}
	
	public void clickOnWebElement(WebElement element) {
		element.click();
	}
	
	public void setValueToElement(WebElement element, String value) {
		element.sendKeys(value);
	}
	
	public void explicitWait(WebDriver driver, WebElement element) {
		WebDriverWait wait =new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

}

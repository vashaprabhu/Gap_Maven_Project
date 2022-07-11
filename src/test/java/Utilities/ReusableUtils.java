package Utilities;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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

}

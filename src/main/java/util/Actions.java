package util;

import org.openqa.selenium.WebElement;

public class Actions {
	
	public static boolean clickAction(WebElement element) {
		try {
			element.click();
			return true;
		} catch (Exception e) {
			return false;
		}
	}
		
	public static boolean sendKeyAction(WebElement element, String data) {
		try {
			element.sendKeys(data);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public static boolean verifyPage(WebElement element) {
		try {
			return element.isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}

}

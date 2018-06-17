package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.appium.java_client.pagefactory.AndroidFindBy;
import util.MobilePageObject;

public class ErrorAutenticacionPage extends MobilePageObject {

	@AndroidFindBy(id = "android:id/button3")
	private WebElement cancelButton;

	public ErrorAutenticacionPage(WebDriver driver) {
		super(driver);
	}

	public boolean clickCancel() {
		try {
			cancelButton.click();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

}

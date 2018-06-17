package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.appium.java_client.pagefactory.AndroidFindBy;
import util.MobilePageObject;

public class MenuPage extends MobilePageObject {

	@AndroidFindBy(id = "makePaymentButton")
	private WebElement makePaymentButton;

	@AndroidFindBy(id = "logoutButton")
	private WebElement logoutButton;

	public MenuPage(WebDriver driver) {
		super(driver);
	}

	public boolean clickMakePayment() {
		try {
			makePaymentButton.click();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean clickLogout() {
		try {
			logoutButton.click();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean verificarPagina() {
		try {
			return makePaymentButton.isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}

}

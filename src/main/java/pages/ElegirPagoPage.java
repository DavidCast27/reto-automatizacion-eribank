package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.appium.java_client.pagefactory.AndroidFindBy;
import util.MobilePageObject;

public class ElegirPagoPage extends MobilePageObject {

	@AndroidFindBy(id = "makePaymentButton")
	private WebElement makePaymentButton;

	@AndroidFindBy(id = "logoutButton")
	private WebElement logoutButton;


	public ElegirPagoPage(WebDriver driver) {
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
			makePaymentButton.click();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

}

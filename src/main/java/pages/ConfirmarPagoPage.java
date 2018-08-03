package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.appium.java_client.pagefactory.AndroidFindBy;
import util.MobilePageObject;

public class ConfirmarPagoPage extends MobilePageObject {

	@AndroidFindBy(id = "android:id/button1")
	private WebElement yesButton;

	@AndroidFindBy(id = "android:id/button2")
	private WebElement noButton;

	public ConfirmarPagoPage(WebDriver driver) {
		super(driver);
	}

	public WebElement getYesButton() {
		return yesButton;
	}

	public WebElement getNoButton() {
		return noButton;
	}

}

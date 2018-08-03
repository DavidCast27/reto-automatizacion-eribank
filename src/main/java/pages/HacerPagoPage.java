package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import entidades.Usuario;
import io.appium.java_client.pagefactory.AndroidFindBy;
import util.FuncionesComunes;
import util.MobilePageObject;

public class HacerPagoPage extends MobilePageObject {

	@AndroidFindBy(id = "phoneTextField")
	private WebElement phoneTextField;

	@AndroidFindBy(id = "nameTextField")
	private WebElement nameTextField;

	@AndroidFindBy(id = "countryTextField")
	private WebElement countryTextField;

	@AndroidFindBy(id = "sendPaymentButton")
	private WebElement sendPaymentButton;

	@AndroidFindBy(id = "cancelButton")
	private WebElement cancelButton;

	@AndroidFindBy(id = "amountTextField")
	private WebElement amountTextField;

	private FuncionesComunes funcionesComunes = new FuncionesComunes(getDriver());

	public HacerPagoPage(WebDriver driver) {
		super(driver);
	}

	public WebElement getPhoneTextField() {
		return phoneTextField;
	}

	public WebElement getNameTextField() {
		return nameTextField;
	}

	public WebElement getCountryTextField() {
		return countryTextField;
	}

	public WebElement getSendPaymentButton() {
		return sendPaymentButton;
	}

	public WebElement getCancelButton() {
		return cancelButton;
	}

	public WebElement getAmountTextField() {
		return amountTextField;
	}

	public FuncionesComunes getFuncionesComunes() {
		return funcionesComunes;
	}

}

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

	public boolean sendKeyPhone(Usuario userDTO) {
		try {
			String strTelefono = userDTO.getTelefono();
			phoneTextField.sendKeys(strTelefono);
			funcionesComunes.hideKeyboard();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean sendKeyName(Usuario userDTO) {
		try {
			String strNombre = userDTO.getNombre();
			nameTextField.sendKeys(strNombre);
			funcionesComunes.hideKeyboard();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean sendKeyAmount(Usuario userDTO) {
		try {
			String strValor = userDTO.getTransaccionDTO().getMontoTransferir();
			amountTextField.sendKeys(strValor);
			funcionesComunes.hideKeyboard();
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean sendKeyCountry(Usuario userDTO) {
		try {
			String strPais = userDTO.getPais();
			countryTextField.sendKeys(strPais);
			funcionesComunes.hideKeyboard();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean clickSendPayment() {
		try {
			sendPaymentButton.click();
			return true;
		} catch (Exception e) {
			return false;
		}
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

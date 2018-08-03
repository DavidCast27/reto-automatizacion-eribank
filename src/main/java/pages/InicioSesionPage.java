package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import entidades.Usuario;
import io.appium.java_client.pagefactory.AndroidFindBy;
import util.MobilePageObject;
import util.FuncionesComunes;

public class InicioSesionPage extends MobilePageObject {

	@AndroidFindBy(id = "usernameTextField")
	private WebElement usernameTextField;

	@AndroidFindBy(id = "passwordTextField")
	private WebElement passwordTextField;

	@AndroidFindBy(id = "loginButton")
	private WebElement loginButton;

	private FuncionesComunes funcionesComunes = new FuncionesComunes(getDriver());

	public InicioSesionPage(WebDriver driver) {
		super(driver);
	}

	public WebElement getUsernameTextField() {
		return usernameTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	
	
	

//	public boolean sendKeyUser(Usuario userDTO) {
//
//		try {
//			String strUsuario = userDTO.getUser();
//			usernameTextField.sendKeys(strUsuario);
//			funcionesComunes.hideKeyboard();
//			return true;
//		} catch (Exception e) {
//			return false;
//		}
//	}
//
//	public boolean sendKeyPass(Usuario userDTO) {
//
//		try {
//			String strPass = userDTO.getClave();
//			passwordTextField.sendKeys(strPass);
//			funcionesComunes.hideKeyboard();
//			return true;
//		} catch (Exception e) {
//			return false;
//		}
//	}
//
//	public boolean clickLogin() {
//		try {
//			loginButton.click();
//			return true;
//		} catch (Exception e) {
//			return false;
//		}
//	}

}

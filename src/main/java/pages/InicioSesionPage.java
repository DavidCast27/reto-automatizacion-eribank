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


}

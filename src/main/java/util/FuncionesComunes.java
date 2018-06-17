package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import net.thucydides.core.webdriver.WebDriverFacade;

public class FuncionesComunes extends MobilePageObject {
	@SuppressWarnings("unchecked")
	AndroidDriver<MobileElement> conexionAppium = ((AndroidDriver<MobileElement>) ((WebDriverFacade) getDriver())
			.getProxiedDriver());

	public FuncionesComunes(WebDriver driver) {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(getDriver()), this);
	}

	public void hideKeyboard() throws Exception {
		try {
			conexionAppium.hideKeyboard();

		} catch (Exception e) {
			System.out.println("Error al esconder el teclado");
		}
	}

	public void swipe() {
		new TouchAction((PerformsTouchActions) conexionAppium).longPress(0, 990).moveTo(0, 250).release().perform();
	}
	
	public boolean verifyPage(WebElement tvElement) {
        try {
               return tvElement.isDisplayed();
        } catch (Exception e) {
               return false;
        }

  }


}
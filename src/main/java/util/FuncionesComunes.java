package util;




import java.util.logging.Level;
import java.util.logging.Logger;

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
	
	private  static final Logger LOGGER = Logger.getLogger("bitacora.subnivel.Control");
	
	@SuppressWarnings("unchecked")
	AndroidDriver<MobileElement> conexionAppium = ((AndroidDriver<MobileElement>) ((WebDriverFacade) getDriver())
			.getProxiedDriver());
	
	public FuncionesComunes(WebDriver driver) {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(getDriver()), this);
	}

	public void hideKeyboard() {
		try {
			conexionAppium.hideKeyboard();

		} catch (Exception e) {		
			LOGGER.log(Level.INFO, "Error al esconder el teclado");
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
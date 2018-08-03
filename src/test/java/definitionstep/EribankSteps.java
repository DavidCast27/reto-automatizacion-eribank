package definitionstep;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.interactions.ClickAction;

import cucumber.api.java.en_old.Ac;
import entidades.Usuario;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Step;
import pages.*;
import util.Actions;

public class EribankSteps {
	InicioSesionPage inicioSesion;
	MenuPage menu;
	HacerPagoPage hacerPago;
	ConfirmarPagoPage confirmarPago;
	ErrorAutenticacionPage errorAutenticacion;

	@Step
	public static void crearEntidades(List<String> data) {

		Usuario userDTO = new Usuario();

		userDTO.getTransaccionDTO().setId(data.get(0));
		userDTO.setUser(data.get(1));
		userDTO.setClave(data.get(2));
		userDTO.setTelefono(data.get(3));
		userDTO.setNombre(data.get(4));
		userDTO.setPais(data.get(5));
		userDTO.getTransaccionDTO().setOrientacion(data.get(6));
		userDTO.getTransaccionDTO().setMontoTransferir(data.get(7));
		Serenity.setSessionVariable("UserDTO").to(userDTO);

	}

	@Step
	public void autenticarApp() throws InterruptedException {
		boolean result;
		Usuario userDTO = Serenity.sessionVariableCalled("UserDTO");
		
		boolean resultUser = Actions.sendKeyAction(inicioSesion.getUsernameTextField(), userDTO.getUser()); 	
		
		boolean resultPass = Actions.sendKeyAction(inicioSesion.getPasswordTextField(),userDTO.getClave());
		boolean resultClickContinuar = Actions.clickAction(inicioSesion.getLoginButton());
		result = resultUser && resultPass && resultClickContinuar;
		assertTrue("Ingreso Usuario y clave", result);
	}

	@Step
	public void seleccionarPago() {
		
		boolean result = Actions.clickAction(menu.getMakePaymentButton());
		assertTrue("Dar click a seleccionar pago", result);
	}

	@Step
	public void ingresarPago() throws InterruptedException {
		boolean result = false;
		Usuario userDTO = Serenity.sessionVariableCalled("UserDTO");
		
		boolean resultPhone = Actions.sendKeyAction(hacerPago.getPhoneTextField(), userDTO.getTelefono());
		boolean resultName = Actions.sendKeyAction(hacerPago.getNameTextField(), userDTO.getNombre());
		boolean resultAmount = Actions.sendKeyAction(hacerPago.getAmountTextField(), userDTO.getTransaccionDTO().getMontoTransferir());
		boolean resultCountry = Actions.sendKeyAction(hacerPago.getCountryTextField(), userDTO.getPais());

		boolean resultSend = Actions.clickAction(hacerPago.getSendPaymentButton());
		result = resultPhone && resultName && resultAmount && resultCountry && resultSend;
		assertTrue("Ingresar informacion del apgo", result);
	}

	@Step
	public void confirmarPago() {
		
		boolean result = Actions.clickAction(confirmarPago.getYesButton());
		assertTrue("Dar click Confirmar Pago", result);
	}

	@Step
	public void verificoAutenticacion() {
		Usuario userDTO = Serenity.sessionVariableCalled("UserDTO");
		String strOrientacion = userDTO.getTransaccionDTO().getOrientacion();
		boolean resultVerificar = Actions.verifyPage(menu.getMakePaymentButton());
		boolean result = false;
		if ((strOrientacion.equalsIgnoreCase("ACIERTO") && resultVerificar)
				|| (strOrientacion.equalsIgnoreCase("ERROR") && !resultVerificar)) {
			result = true;
		}
		if (!resultVerificar) {
			Actions.clickAction(errorAutenticacion.getCancelButton());
		}

		assertTrue("Verificar Autenticacion", result);
	}

	@Step
	public void verificoPago() {
		Usuario userDTO = Serenity.sessionVariableCalled("UserDTO");
		String strOrientacion = userDTO.getTransaccionDTO().getOrientacion();
		boolean resultVerificar = Actions.verifyPage(menu.getMakePaymentButton());
		boolean result = false;
		if ((strOrientacion.equalsIgnoreCase("ACIERTO") && resultVerificar)) {
			result = true;
		}

		assertTrue("Verificar Pago", result);
	}

	@Step
	public void cerrarSesion() {
		boolean result = Actions.clickAction(menu.getLogoutButton());
		assertTrue("Cerrar sesion", result);
	}

}

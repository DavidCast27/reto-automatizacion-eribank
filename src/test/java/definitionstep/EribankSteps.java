package definitionstep;

import static org.junit.Assert.assertTrue;

import java.util.List;

import entidades.Usuario;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Step;
import pages.*;

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
		boolean resultUser = inicioSesion.sendKeyUser(userDTO);
		boolean resultPass = inicioSesion.sendKeyPass(userDTO);
		inicioSesion.clickLogin();
		result = resultUser && resultPass;
		assertTrue("Ingreso Usuario y clave", result);
	}

	@Step
	public void seleccionarPago() {
		boolean result = menu.clickMakePayment();
		assertTrue("Dar click a seleccionar pago", result);
	}

	@Step
	public void ingresarPago() throws InterruptedException {
		boolean result = false;
		Usuario userDTO = Serenity.sessionVariableCalled("UserDTO");
		boolean resultPhone = hacerPago.sendKeyPhone(userDTO);
		boolean resultName = hacerPago.sendKeyName(userDTO);
		boolean resultAmount = hacerPago.sendKeyAmount(userDTO);
		boolean resultCountry = hacerPago.sendKeyCountry(userDTO);

		boolean resultSend = hacerPago.clickSendPayment();
		result = resultPhone && resultName && resultAmount && resultCountry && resultSend;
		assertTrue("Ingresar informacion del apgo", result);
	}

	@Step
	public void confirmarPago() {
		boolean result = confirmarPago.clickYes();
		assertTrue("Dar click Confirmar Pago", result);
	}

	@Step
	public void verificoAutenticacion() {
		Usuario userDTO = Serenity.sessionVariableCalled("UserDTO");
		String strOrientacion = userDTO.getTransaccionDTO().getOrientacion();
		boolean resultVerificar = menu.verificarPagina();
		boolean result = false;
		if ((strOrientacion.equalsIgnoreCase("ACIERTO") && resultVerificar)
				|| (strOrientacion.equalsIgnoreCase("ERROR") && !resultVerificar)) {
			result = true;
		}
		if (!resultVerificar) {
			errorAutenticacion.clickCancel();
		}

		assertTrue("Verificar Autenticacion", result);
	}

	@Step
	public void verificoPago() {
		Usuario userDTO = Serenity.sessionVariableCalled("UserDTO");
		String strOrientacion = userDTO.getTransaccionDTO().getOrientacion();
		boolean resultVerificar = menu.verificarPagina();
		boolean result = false;
		if ((strOrientacion.equalsIgnoreCase("ACIERTO") && resultVerificar)) {
			result = true;
		}

		assertTrue("Verificar Pago", result);
	}

	@Step
	public void cerrarSesion() {
		boolean result = menu.clickLogout();
		assertTrue("Cerrar sesion", result);
	}

}

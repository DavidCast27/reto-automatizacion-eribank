package definitionstep;

import static org.junit.Assert.assertTrue;

import java.util.List;

import entidades.Usuario;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Step;
import pages.*;

public class CommonSteps {
	InicioSesionPage inicioSesion;
	ElegirPagoPage elegirPago;
	HacerPagoPage hacerPago;
	ConfirmarPagoPage confirmarPago;

	@Step
	public static void crearEntidades(List<String> data) {

		Usuario userDTO = new Usuario();

		userDTO.getTransaccionDTO().setId(data.get(0));

		// userDTO.setNumeroDocumento(data.get(5));
		// userDTO.setTipoDocumento(data.get(6));
		// userDTO.setUsuario(data.get(7));
		// userDTO.setClave(data.get(8));
		// userDTO.setSegundaClave(data.get(9));
		// userDTO.setPregunta1(data.get(10));
		// userDTO.setPregunta2(data.get(11));
		// userDTO.getTransaccionDTO().setOrientacion(data.get(12));
		// userDTO.getTransaccionDTO().setCodigoError(data.get(13));
		// userDTO.getTransaccionDTO().setCodigoTransaccion(data.get(14));
		// userDTO.getTransaccionDTO().setResultadoEsperado(data.get(15));
		// userDTO.getTransaccionDTO().setTipoTransaccion(data.get(16));
		// userDTO.getTransaccionDTO().setCodigoOperacion(data.get(17));

		Serenity.setSessionVariable("UserDTO").to(userDTO);

	}

	@Step
	public void autenticarApp() throws InterruptedException {
		boolean result;
		Usuario userDTO = Serenity.sessionVariableCalled("UserDTO");
		Thread.sleep(1000);
		boolean resultUser = inicioSesion.sendKeyUser(userDTO);
		Thread.sleep(1000);
		boolean resultPass = inicioSesion.sendKeyPass(userDTO);
		Thread.sleep(1000);
		inicioSesion.clickLogin();
		result = resultUser && resultPass;
		assertTrue("Ingreso Usuario y clave", result);
	}

	@Step
	public void verificarAutenticacion() throws InterruptedException {
		boolean result;
		// TODO: falta mirar como hacer la verificacion
		// assertTrue("Verificar Autenticacion", result);
	}

	@Step
	public void seleccionarPago() {
		elegirPago.clickMakePayment();		
	}

	@Step
	public void ingresarPago() {
		Usuario userDTO = Serenity.sessionVariableCalled("UserDTO");
		hacerPago.sendKeyPhone(userDTO);
		hacerPago.sendKeyName(userDTO);
		hacerPago.sendKeyCountry(userDTO);
		//TODO: agregar la barra deslizante;
		hacerPago.clickSendPayment();
		
	}

	@Step
	public void confirmarPago() {
		confirmarPago.clickYes();
		
	}

}

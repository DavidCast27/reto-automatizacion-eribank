package definitionstep;

import java.util.List;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class CommonDefinitions {

	@Steps
	CommonSteps commonSteps;

	@Given("^Cargo los Datos de la transaccion$")
	public void cargoLosDatosDeLaTransaccion(List<String> data) throws Throwable {
		CommonSteps.crearEntidades(data);

	}

	@When("^Me autentico en la App$")
	public void meAutenticoEnLaApp() throws Throwable {
		commonSteps.autenticarApp();

	}
	
	@Then("^Verifico Autenticacion$")
	public void verificoAutenticacion() throws Throwable {
		commonSteps.verificoAutenticacion();
	}

	@When("^Seleccion hacer un pago$")
	public void seleccionHacerUnPago() throws Throwable {
		commonSteps.seleccionarPago();

	}

	@When("^Ingreso informacion del pago$")
	public void ingresoInformacionDelPago() throws Throwable {
		commonSteps.ingresarPago();

	}

	@When("^Confirmo el pago$")
	public void confirmoElPago() throws Throwable {
		commonSteps.confirmarPago();

	}

	@Then("^Verifico el que el pago se realizara$")
	public void verificoElQueElPagoSeRealizara() throws Throwable {
		commonSteps.verificoPago();

	}
	
	@Then("^Cerrar Sesion$")
	public void cerrarSesion() throws Throwable {
		commonSteps.cerrarSesion();
	}

}

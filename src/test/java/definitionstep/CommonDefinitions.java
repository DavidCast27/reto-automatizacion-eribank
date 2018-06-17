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
		// Write code here that turns the phrase above into concrete actions

	}

	@Then("^Verifico el resultado obtenido de la autenticacion$")
	public void verificoElResultadoObtenidoDeLaAutenticacion() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

	}

	@When("^Seleccion hacer un pago$")
	public void seleccionHacerUnPago() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

	}

	@When("^Ingreso informacion del pago$")
	public void ingresoInformacionDelPago() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

	}

	@When("^Confirmo el pago$")
	public void confirmoElPago() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

	}

	@Then("^Verifico el que el pago se realizara$")
	public void verificoElQueElPagoSeRealizara() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

	}

}

package definitionstep;

import java.util.List;
import java.util.Properties;

import entidades.Usuario;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Step;

public class Steps {
	
	@Step
	public static void crearEntidades(List<String> data) {

		Usuario userDTO = new Usuario();

		userDTO.getTransaccionDTO().setId(data.get(0));

//		userDTO.setNumeroDocumento(data.get(5));
//		userDTO.setTipoDocumento(data.get(6));
//		userDTO.setUsuario(data.get(7));
//		userDTO.setClave(data.get(8));
//		userDTO.setSegundaClave(data.get(9));
//		userDTO.setPregunta1(data.get(10));
//		userDTO.setPregunta2(data.get(11));
//		userDTO.getTransaccionDTO().setOrientacion(data.get(12));
//		userDTO.getTransaccionDTO().setCodigoError(data.get(13));
//		userDTO.getTransaccionDTO().setCodigoTransaccion(data.get(14));
//		userDTO.getTransaccionDTO().setResultadoEsperado(data.get(15));
//		userDTO.getTransaccionDTO().setTipoTransaccion(data.get(16));
//		userDTO.getTransaccionDTO().setCodigoOperacion(data.get(17));

		Serenity.setSessionVariable("UserDTO").to(userDTO);
			
		
	}

}

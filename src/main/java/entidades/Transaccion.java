package entidades;

import java.io.Serializable;

public class Transaccion implements Serializable{
	
	private static final long serialVersionUID = 1905122041950251207L;

	private String orientacion;
	private String id;
	private String montoAntes;
	private String montoTransferir;

	public String getOrientacion() {
		return orientacion;
	}

	public void setOrientacion(String orientacion) {
		this.orientacion = orientacion;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMontoAntes() {
		return montoAntes;
	}

	public void setMontoAntes(String valorAntesTransaccion) {
		this.montoAntes = valorAntesTransaccion;
	}

	public String getMontoTransferir() {
		return montoTransferir;
	}

	public void setMontoTransferir(String montoTransferir) {
		this.montoTransferir = montoTransferir;
	}

}

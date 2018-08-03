package Interfaces;

import java.io.Serializable;

import entidades.Transaccion;

public interface IUsuario extends Serializable{
	
	static final long serialVersionUID = 4632430914889241426L;

	String user = "";
	String clave = "";
	String telefono = "";
	String nombre = "";
	String pais = "";

	Transaccion transaccionDTO = new Transaccion();

}

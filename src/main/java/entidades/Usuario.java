/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;

import Interfaces.IUsuario;

/**
 *
 * @author david.c.gonzalez
 */
public class Usuario implements IUsuario {

	private static final long serialVersionUID = 4632430914889241426L;

	private String user;
	private String clave;
	private String telefono;
	private String nombre;
	private String pais;

	private Transaccion transaccionDTO;

	public Usuario() {
		transaccionDTO = new Transaccion();

	}

	public String getUser() {
		return user;
	}

	public void setUser(String usuario) {
		this.user = usuario;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public Transaccion getTransaccionDTO() {
		return transaccionDTO;
	}

	public void setTransaccionDTO(Transaccion transaccionDTO) {
		this.transaccionDTO = transaccionDTO;
	}

}

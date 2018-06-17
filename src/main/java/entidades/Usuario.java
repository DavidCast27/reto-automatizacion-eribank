/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;

/**
 *
 * @author jesmuner
 */
public class Usuario implements Serializable {

	private static final long serialVersionUID = 4632430914889241426L;

	private String usuario;
	private String clave;
	private String telefono;
	private String nombre;
	private String pais;
	private String valorATransferir;

	private Transaccion transaccionDTO;

	public Usuario() {
		transaccionDTO = new Transaccion();

	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
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

	public String getValorATransferir() {
		return valorATransferir;
	}

	public void setValorATransferir(String valorATransferir) {
		this.valorATransferir = valorATransferir;
	}

	public Transaccion getTransaccionDTO() {
		return transaccionDTO;
	}

	public void setTransaccionDTO(Transaccion transaccionDTO) {
		this.transaccionDTO = transaccionDTO;
	}


}

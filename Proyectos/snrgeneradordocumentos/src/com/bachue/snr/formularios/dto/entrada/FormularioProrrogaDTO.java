package com.bachue.snr.formularios.dto.entrada;

import java.util.List;

import com.bachue.snr.formularios.dto.comun.ArchivoDinamicoDTO;
import com.bachue.snr.formularios.dto.comun.FormularioGenericoDTO;

/**
 * 
 * @version 1.0
 * @author Smartsoft Solutions S.A.S
 * 
 */
public class FormularioProrrogaDTO extends FormularioGenericoDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String dia;
	private String mes;
	private String ano;
	private String nir;
	private String nombre;
	private String documento;
	private String direccion;
	private String telefono;
	private String correo;	
	private List<ArchivoDinamicoDTO> imagenes;

	public FormularioProrrogaDTO() {
		// Metodo constructor
	}

	public String getDia() {
		return dia;
	}
	public void setDia(String dia) {
		this.dia = dia;
	}
	public String getMes() {
		return mes;
	}
	public void setMes(String mes) {
		this.mes = mes;
	}
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public String getNir() {
		return nir;
	}
	public void setNir(String nir) {
		this.nir = nir;
	}
	
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public List<ArchivoDinamicoDTO> getArchivo() {
		return imagenes;
	}

	public void setImagenes(List<ArchivoDinamicoDTO> imagenes) {
		this.imagenes = imagenes;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}


}

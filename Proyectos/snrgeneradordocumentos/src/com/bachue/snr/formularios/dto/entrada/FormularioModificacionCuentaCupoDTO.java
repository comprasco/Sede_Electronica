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
public class FormularioModificacionCuentaCupoDTO extends FormularioGenericoDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String dia;
	private String mes;
	private String ano;
	private String nit;
	private String cedula;
	private String cedulaExtranjeria;
	private String numeroCedula;
	private String digitoVerificacion;
	private String razonSocial;
	private String representanteLegal;
	private String numeroIdentificacion;
	private String direccion;
	private String telefono;
	private String ciudad;
	private String celular;
	private String correo;	
	private String minpermitido;
	private String maxpermitido;
	private String minsolicitado;
	private String maxsolicitado;
	private String motivosSolicitud;
	private List<ArchivoDinamicoDTO> imagenes;

	public FormularioModificacionCuentaCupoDTO() {
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
	public String getNit() {
		return nit;
	}
	public void setNit(String nit) {
		this.nit = nit;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getCedulaExtranjeria() {
		return cedulaExtranjeria;
	}
	public void setCedulaExtranjeria(String cedulaExtranjeria) {
		this.cedulaExtranjeria = cedulaExtranjeria;
	}
	public String getNumeroCedula() {
		return numeroCedula;
	}
	public void setNumeroCedula(String numeroCedula) {
		this.numeroCedula = numeroCedula;
	}
	public String getDigitoVerificacion() {
		return digitoVerificacion;
	}
	public void setDigitoVerificacion(String digitoVerificacion) {
		this.digitoVerificacion = digitoVerificacion;
	}
	public String getRazonSocial() {
		return razonSocial;
	}
	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}
	public String getRepresentanteLegal() {
		return representanteLegal;
	}
	public void setRepresentanteLegal(String representanteLegal) {
		this.representanteLegal = representanteLegal;
	}
	public String getNumeroIdentificacion() {
		return numeroIdentificacion;
	}
	public void setNumeroIdentificacion(String numeroIdentificacion) {
		this.numeroIdentificacion = numeroIdentificacion;
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

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
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

	public String getMinpermitido() {
		return minpermitido;
	}

	public void setMinpermitido(String minpermitido) {
		this.minpermitido = minpermitido;
	}

	public String getMaxpermitido() {
		return maxpermitido;
	}

	public void setMaxpermitido(String maxpermitido) {
		this.maxpermitido = maxpermitido;
	}

	public String getMinsolicitado() {
		return minsolicitado;
	}

	public void setMinsolicitado(String minsolicitado) {
		this.minsolicitado = minsolicitado;
	}

	public String getMaxsolicitado() {
		return maxsolicitado;
	}

	public void setMaxsolicitado(String maxsolicitado) {
		this.maxsolicitado = maxsolicitado;
	}

	public List<ArchivoDinamicoDTO> getImagenes() {
		return imagenes;
	}

	public String getMotivosSolicitud() {
		return motivosSolicitud;
	}

	public void setMotivosSolicitud(String motivosSolicitud) {
		this.motivosSolicitud = motivosSolicitud;
	}


}

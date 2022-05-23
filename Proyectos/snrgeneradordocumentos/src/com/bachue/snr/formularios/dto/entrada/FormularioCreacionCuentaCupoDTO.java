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
public class FormularioCreacionCuentaCupoDTO extends FormularioGenericoDTO {

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
	private String profesion;
	private String tipoEmpresa;
	private String servicioSolicitud;
	private String montoSolicitud;
	private String frecuenciaRecarga;
	private String necesidadServicio;
	private String declaracionIngresos;
	private String descripcionActividad;
	private String ciudad;
	private String celular;
	private String correo;	
	private List<ArchivoDinamicoDTO> imagenes;

	public FormularioCreacionCuentaCupoDTO() {
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
	public String getProfesion() {
		return profesion;
	}
	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}
	public String getTipoEmpresa() {
		return tipoEmpresa;
	}
	public void setTipoEmpresa(String tipoEmpresa) {
		this.tipoEmpresa = tipoEmpresa;
	}
	public String getServicioSolicitud() {
		return servicioSolicitud;
	}
	public void setServicioSolicitud(String servicioSolicitud) {
		this.servicioSolicitud = servicioSolicitud;
	}
	public String getMontoSolicitud() {
		return montoSolicitud;
	}
	public void setMontoSolicitud(String montoSolicitud) {
		this.montoSolicitud = montoSolicitud;
	}
	public String getFrecuenciaRecarga() {
		return frecuenciaRecarga;
	}
	public void setFrecuenciaRecarga(String frecuenciaRecarga) {
		this.frecuenciaRecarga = frecuenciaRecarga;
	}
	public String getNecesidadServicio() {
		return necesidadServicio;
	}
	public void setNecesidadServicio(String necesidadServicio) {
		this.necesidadServicio = necesidadServicio;
	}
	public String getDeclaracionIngresos() {
		return declaracionIngresos;
	}
	public void setDeclaracionIngresos(String declaracionIngresos) {
		this.declaracionIngresos = declaracionIngresos;
	}

	public String getDescripcionActividad() {
		return descripcionActividad;
	}

	public void setDescripcionActividad(String descripcionActividad) {
		this.descripcionActividad = descripcionActividad;
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


}

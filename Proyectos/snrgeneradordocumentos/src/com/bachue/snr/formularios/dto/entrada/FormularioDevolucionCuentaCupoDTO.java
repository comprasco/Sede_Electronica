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
public class FormularioDevolucionCuentaCupoDTO extends FormularioGenericoDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// Seccion datos basicos
	private String dia;
	private String mes;
	private String ano;
	private String tipoDocumento;
	private String numeroDocumento;
	private String razonSocial;
	private String nombreRepresentanteLegal;
	private String numeroIdentificacionRepresentanteLegal;
	private String direccion;
	private String telefono;
	private String celular;
	private String correo;

	// Seccion solicitud de devolucion
	private String tipoDevolucion;
	private String idCuentaCupo;
	private String saldo;
	private String codigoCuentaCupo;
	private String codigoNotaCredito;
	private List<NotaCreditoDTO> notasCredito;

	// Seccion info cuenta bancaria
	private String entidadFinanciera;
	private String tipoCuenta;
	private String numeroCuenta;
	private String tipoDocumentoTitularCuentaBancaria;
	private String numeroDocumentoTitularCuentaBancaria;
	private String nombreTitularCuentaBancaria;
	private String segundoNombreTitularCuentaBancaria;
	private String apellidoTitularCuentaBancaria;
	private String segundoApellidoTitularCuentaBancaria;
	private String titularCuentaBancariaRazonSocial;
	private String motivosSolicitud;

	private List<ArchivoDinamicoDTO> imagenes;

	public FormularioDevolucionCuentaCupoDTO() {
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

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public String getNumeroDocumento() {
		return numeroDocumento;
	}

	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	public String getRazonSocial() {
		return razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	public String getNombreRepresentanteLegal() {
		return nombreRepresentanteLegal;
	}

	public void setNombreRepresentanteLegal(String nombreRepresentanteLegal) {
		this.nombreRepresentanteLegal = nombreRepresentanteLegal;
	}

	public String getNumeroIdentificacionRepresentanteLegal() {
		return numeroIdentificacionRepresentanteLegal;
	}

	public void setNumeroIdentificacionRepresentanteLegal(String numeroIdentificacionRepresentanteLegal) {
		this.numeroIdentificacionRepresentanteLegal = numeroIdentificacionRepresentanteLegal;
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

	public String getTipoDevolucion() {
		return tipoDevolucion;
	}

	public void setTipoDevolucion(String tipoDevolucion) {
		this.tipoDevolucion = tipoDevolucion;
	}

	public String getIdCuentaCupo() {
		return idCuentaCupo;
	}

	public void setIdCuentaCupo(String idCuentaCupo) {
		this.idCuentaCupo = idCuentaCupo;
	}

	public String getSaldo() {
		return saldo;
	}

	public void setSaldo(String saldo) {
		this.saldo = saldo;
	}

	public String getCodigoCuentaCupo() {
		return codigoCuentaCupo;
	}

	public void setCodigoCuentaCupo(String codigoCuentaCupo) {
		this.codigoCuentaCupo = codigoCuentaCupo;
	}

	public String getCodigoNotaCredito() {
		return codigoNotaCredito;
	}

	public void setCodigoNotaCredito(String codigoNotaCredito) {
		this.codigoNotaCredito = codigoNotaCredito;
	}

	public List<NotaCreditoDTO> getNotasCredito() {
		return notasCredito;
	}

	public void setNotasCredito(List<NotaCreditoDTO> notasCredito) {
		this.notasCredito = notasCredito;
	}

	public String getEntidadFinanciera() {
		return entidadFinanciera;
	}

	public void setEntidadFinanciera(String entidadFinanciera) {
		this.entidadFinanciera = entidadFinanciera;
	}

	public String getTipoCuenta() {
		return tipoCuenta;
	}

	public void setTipoCuenta(String tipoCuenta) {
		this.tipoCuenta = tipoCuenta;
	}

	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public String getTipoDocumentoTitularCuentaBancaria() {
		return tipoDocumentoTitularCuentaBancaria;
	}

	public void setTipoDocumentoTitularCuentaBancaria(String tipoDocumentoTitularCuentaBancaria) {
		this.tipoDocumentoTitularCuentaBancaria = tipoDocumentoTitularCuentaBancaria;
	}

	public String getNumeroDocumentoTitularCuentaBancaria() {
		return numeroDocumentoTitularCuentaBancaria;
	}

	public void setNumeroDocumentoTitularCuentaBancaria(String numeroDocumentoTitularCuentaBancaria) {
		this.numeroDocumentoTitularCuentaBancaria = numeroDocumentoTitularCuentaBancaria;
	}

	public String getNombreTitularCuentaBancaria() {
		return nombreTitularCuentaBancaria;
	}

	public void setNombreTitularCuentaBancaria(String nombreTitularCuentaBancaria) {
		this.nombreTitularCuentaBancaria = nombreTitularCuentaBancaria;
	}

	public String getSegundoNombreTitularCuentaBancaria() {
		return segundoNombreTitularCuentaBancaria;
	}

	public void setSegundoNombreTitularCuentaBancaria(String segundoNombreTitularCuentaBancaria) {
		this.segundoNombreTitularCuentaBancaria = segundoNombreTitularCuentaBancaria;
	}

	public String getApellidoTitularCuentaBancaria() {
		return apellidoTitularCuentaBancaria;
	}

	public void setApellidoTitularCuentaBancaria(String apellidoTitularCuentaBancaria) {
		this.apellidoTitularCuentaBancaria = apellidoTitularCuentaBancaria;
	}

	public String getSegundoApellidoTitularCuentaBancaria() {
		return segundoApellidoTitularCuentaBancaria;
	}

	public void setSegundoApellidoTitularCuentaBancaria(String segundoApellidoTitularCuentaBancaria) {
		this.segundoApellidoTitularCuentaBancaria = segundoApellidoTitularCuentaBancaria;
	}

	public String getTitularCuentaBancariaRazonSocial() {
		return titularCuentaBancariaRazonSocial;
	}

	public void setTitularCuentaBancariaRazonSocial(String titularCuentaBancariaRazonSocial) {
		this.titularCuentaBancariaRazonSocial = titularCuentaBancariaRazonSocial;
	}

	public String getMotivosSolicitud() {
		return motivosSolicitud;
	}

	public void setMotivosSolicitud(String motivosSolicitud) {
		this.motivosSolicitud = motivosSolicitud;
	}

	public List<ArchivoDinamicoDTO> getImagenes() {
		return imagenes;
	}

	public void setImagenes(List<ArchivoDinamicoDTO> imagenes) {
		this.imagenes = imagenes;
	}
	
}

package co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.poderes;

import java.util.Date;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.GenericoDTO;

/**
 * Clase tipo objeto de transferencia de datos para web service (WSDTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y servicios web.
 * <br>
 * Contiene propiedades para representar los datos del objeto documento de
 * consulta poder.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class DocumentoConsultaPoderWSDTO extends GenericoDTO {

	private static final long serialVersionUID = 1L;
	private String is_did;
	private String is_docName;
	private String is_xJustificacionRevocado;
	private String is_xTipoPoder;
	private String is_xDepartamentos;
	private String is_xMunicipios;
	private String is_xTipDocApoderado;
	private String is_xNotaria;
	private String is_xccApoderado;
	private String is_xNombreApoderado;
	private String is_xTipDocPoderdante;
	private String is_xccPoderdante;
	private String is_xNombrePoderdante;
	private String is_xNumMatriculaPoder;
	private String is_xDireccionPredio;
	private String is_xDepartamentoPredio;
	private String is_xCiudadPredio;
	private String is_xNumeroInstrumento;
	private Date id_xFechaInstrumento;
	private String is_xEstadoPoder;
	private String is_xUsoPoder;
	private String is_xCirculoPredio;
	private Date id_xFinalizacionPoder;
	private String is_xJustificacionUsado;
	private Date id_xFechaCarguePoder;
	private String is_urlVisor;
	private Integer ii_codigoMensaje;
	private String is_xDiligenciaReconocimiento;
	private String is_descripcionMensaje;
	private String is_dDocType;
	private String is_notificaciones;
	private String is_xTipoDocumento;

	public String getIs_did() {
		return is_did;
	}

	public void setIs_did(String as_did) {
		this.is_did = as_did;
	}

	public String getIs_docName() {
		return is_docName;
	}

	public void setIs_docName(String as_docName) {
		this.is_docName = as_docName;
	}

	public String getIs_xJustificacionRevocado() {
		return is_xJustificacionRevocado;
	}

	public void setIs_xJustificacionRevocado(String as_xJustificacionRevocado) {
		this.is_xJustificacionRevocado = as_xJustificacionRevocado;
	}

	public String getIs_xTipoPoder() {
		return is_xTipoPoder;
	}

	public void setIs_xTipoPoder(String as_xTipoPoder) {
		this.is_xTipoPoder = as_xTipoPoder;
	}

	public String getIs_xDepartamentos() {
		return is_xDepartamentos;
	}

	public void setIs_xDepartamentos(String as_xDepartamentos) {
		this.is_xDepartamentos = as_xDepartamentos;
	}

	public String getIs_xMunicipios() {
		return is_xMunicipios;
	}

	public void setIs_xMunicipios(String as_xMunicipios) {
		this.is_xMunicipios = as_xMunicipios;
	}

	public String getIs_xTipDocApoderado() {
		return is_xTipDocApoderado;
	}

	public void setIs_xTipDocApoderado(String as_xTipDocApoderado) {
		this.is_xTipDocApoderado = as_xTipDocApoderado;
	}

	public String getIs_xNotaria() {
		return is_xNotaria;
	}

	public void setIs_xNotaria(String as_xNotaria) {
		this.is_xNotaria = as_xNotaria;
	}

	public String getIs_xccApoderado() {
		return is_xccApoderado;
	}

	public void setIs_xccApoderado(String as_xccApoderado) {
		this.is_xccApoderado = as_xccApoderado;
	}

	public String getIs_xNombreApoderado() {
		return is_xNombreApoderado;
	}

	public void setIs_xNombreApoderado(String as_xNombreApoderado) {
		this.is_xNombreApoderado = as_xNombreApoderado;
	}

	public String getIs_xTipDocPoderdante() {
		return is_xTipDocPoderdante;
	}

	public void setIs_xTipDocPoderdante(String as_xTipDocPoderdante) {
		this.is_xTipDocPoderdante = as_xTipDocPoderdante;
	}

	public String getIs_xccPoderdante() {
		return is_xccPoderdante;
	}

	public void setIs_xccPoderdante(String as_xccPoderdante) {
		this.is_xccPoderdante = as_xccPoderdante;
	}

	public String getIs_xNombrePoderdante() {
		return is_xNombrePoderdante;
	}

	public void setIs_xNombrePoderdante(String as_xNombrePoderdante) {
		this.is_xNombrePoderdante = as_xNombrePoderdante;
	}

	public String getIs_xNumMatriculaPoder() {
		return is_xNumMatriculaPoder;
	}

	public void setIs_xNumMatriculaPoder(String as_xNumMatriculaPoder) {
		this.is_xNumMatriculaPoder = as_xNumMatriculaPoder;
	}

	public String getIs_xDireccionPredio() {
		return is_xDireccionPredio;
	}

	public void setIs_xDireccionPredio(String as_xDireccionPredio) {
		this.is_xDireccionPredio = as_xDireccionPredio;
	}

	public String getIs_xDepartamentoPredio() {
		return is_xDepartamentoPredio;
	}

	public void setIs_xDepartamentoPredio(String as_xDepartamentoPredio) {
		this.is_xDepartamentoPredio = as_xDepartamentoPredio;
	}

	public String getIs_xCiudadPredio() {
		return is_xCiudadPredio;
	}

	public void setIs_xCiudadPredio(String as_xCiudadPredio) {
		this.is_xCiudadPredio = as_xCiudadPredio;
	}

	public String getIs_xNumeroInstrumento() {
		return is_xNumeroInstrumento;
	}

	public void setIs_xNumeroInstrumento(String as_xNumeroInstrumento) {
		this.is_xNumeroInstrumento = as_xNumeroInstrumento;
	}

	public Date getId_xFechaInstrumento() {
		return id_xFechaInstrumento;
	}

	public void setId_xFechaInstrumento(Date ad_xFechaInstrumento) {
		this.id_xFechaInstrumento = ad_xFechaInstrumento;
	}

	public String getIs_xEstadoPoder() {
		return is_xEstadoPoder;
	}

	public void setIs_xEstadoPoder(String as_xEstadoPoder) {
		this.is_xEstadoPoder = as_xEstadoPoder;
	}

	public String getIs_xUsoPoder() {
		return is_xUsoPoder;
	}

	public void setIs_xUsoPoder(String as_xUsoPoder) {
		this.is_xUsoPoder = as_xUsoPoder;
	}

	public String getIs_xCirculoPredio() {
		return is_xCirculoPredio;
	}

	public void setIs_xCirculoPredio(String as_xCirculoPredio) {
		this.is_xCirculoPredio = as_xCirculoPredio;
	}

	public Date getId_xFinalizacionPoder() {
		return id_xFinalizacionPoder;
	}

	public void setId_xFinalizacionPoder(Date ad_xFinalizacionPoder) {
		this.id_xFinalizacionPoder = ad_xFinalizacionPoder;
	}

	public String getIs_xJustificacionUsado() {
		return is_xJustificacionUsado;
	}

	public void setIs_xJustificacionUsado(String as_xJustificacionUsado) {
		this.is_xJustificacionUsado = as_xJustificacionUsado;
	}

	public Date getId_xFechaCarguePoder() {
		return id_xFechaCarguePoder;
	}

	public void setId_xFechaCarguePoder(Date ad_xFechaCarguePoder) {
		this.id_xFechaCarguePoder = ad_xFechaCarguePoder;
	}

	public String getIs_urlVisor() {
		return is_urlVisor;
	}

	public void setIs_urlVisor(String as_urlVisor) {
		this.is_urlVisor = as_urlVisor;
	}

	public Integer getIi_codigoMensaje() {
		return ii_codigoMensaje;
	}

	public void setIi_codigoMensaje(Integer ai_codigoMensaje) {
		this.ii_codigoMensaje = ai_codigoMensaje;
	}

	public String getIs_descripcionMensaje() {
		return is_descripcionMensaje;
	}

	public void setIs_descripcionMensaje(String as_descripcionMensaje) {
		this.is_descripcionMensaje = as_descripcionMensaje;
	}

	public String getIs_xDiligenciaReconocimiento() {
		return is_xDiligenciaReconocimiento;
	}

	public void setIs_xDiligenciaReconocimiento(String as_xDiligenciaReconocimiento) {
		this.is_xDiligenciaReconocimiento = as_xDiligenciaReconocimiento;
	}

	public String getIs_dDocType() {
		return is_dDocType;
	}

	public void setIs_dDocType(String as_dDocType) {
		this.is_dDocType = as_dDocType;
	}

	public String getIs_notificaciones() {
		return is_notificaciones;
	}

	public void setIs_notificaciones(String as_notificaciones) {
		this.is_notificaciones = as_notificaciones;
	}

	public String getIs_xTipoDocumento() {
		return is_xTipoDocumento;
	}

	public void setIs_xTipoDocumento(String as_xTipoDocumento) {
		this.is_xTipoDocumento = as_xTipoDocumento;
	}

}

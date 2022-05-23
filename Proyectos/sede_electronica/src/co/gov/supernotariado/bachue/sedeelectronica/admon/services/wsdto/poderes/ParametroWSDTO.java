package co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.poderes;

import java.util.Date;
import java.util.List;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.GenericoDTO;

public class ParametroWSDTO extends GenericoDTO{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String is_xComments;
	private String is_xJustificacionRevocado;
	private String is_xTipDocApoderado;
	private String is_xccApoderado;
	private String is_xNombreApoderado;
	private String is_xTipDocPoderdante;
	private String is_xccPoderdante;
	private String is_xNombrePoderdante;
	private String is_notariaOrigen;
	private String is_xDireccionPredio;
	private String is_xDepartamentoPredio;
	private String is_xCiudadPredio;
	private String is_xNumeroInstrumento;
	private Date id_xFechaInstrumento;
	private String is_xCirculoPredio;
	private Date id_xFinalizacionPoder;
	private String is_xJustificacionUsado;
	private String is_xEstadoPoder;
	private String is_xUsoPoder;
	private String is_diligenciaReconocimiento;
	private String is_xTipoPoder;
	private String is_xNotaria;
    private List<NotificacionWSDTO> iln_notificaciones;

	public String getIs_xComments() {
		return is_xComments;
	}
	public void setIs_xComments(String as_xComments) {
		this.is_xComments = as_xComments;
	}
	public String getIs_xJustificacionRevocado() {
		return is_xJustificacionRevocado;
	}
	public void setIs_xJustificacionRevocado(String as_xJustificacionRevocado) {
		this.is_xJustificacionRevocado = as_xJustificacionRevocado;
	}
	public String getIs_xTipDocApoderado() {
		return is_xTipDocApoderado;
	}
	public void setIs_xTipDocApoderado(String as_xTipDocApoderado) {
		this.is_xTipDocApoderado = as_xTipDocApoderado;
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
	public String getIs_diligenciaReconocimiento() {
		return is_diligenciaReconocimiento;
	}
	public void setIs_diligenciaReconocimiento(String as_diligenciaReconocimiento) {
		this.is_diligenciaReconocimiento = as_diligenciaReconocimiento;
	}
	public List<NotificacionWSDTO> getIln_notificaciones() {
		return iln_notificaciones;
	}
	public void setIln_notificaciones(List<NotificacionWSDTO> aln_notificaciones) {
		this.iln_notificaciones = aln_notificaciones;
	}
	public String getIs_notariaOrigen() {
		return is_notariaOrigen;
	}
	public void setIs_notariaOrigen(String as_notariaOrigen) {
		this.is_notariaOrigen = as_notariaOrigen;
	}
	public String getIs_xTipoPoder() {
		return is_xTipoPoder;
	}
	public void setIs_xTipoPoder(String as_xTipoPoder) {
		this.is_xTipoPoder = as_xTipoPoder;
	}
	public String getIs_xNotaria() {
		return is_xNotaria;
	}
	public void setIs_xNotaria(String as_xNotaria) {
		this.is_xNotaria = as_xNotaria;
	}
	
}

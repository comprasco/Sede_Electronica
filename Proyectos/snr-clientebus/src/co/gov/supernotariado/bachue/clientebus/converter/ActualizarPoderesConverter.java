package co.gov.supernotariado.bachue.clientebus.converter;

import java.util.List;

import co.gov.supernotariado.bachue.clientebus.poderes.types.actualizacionmetadatospoderes.TipoEntradaActualizarMetadatosPoder;
import co.gov.supernotariado.bachue.clientebus.poderes.types.actualizacionmetadatospoderes.TipoEntradaActualizarMetadatosPoder.Parametros;
import co.gov.supernotariado.bachue.clientebus.poderes.types.actualizacionmetadatospoderes.TipoEntradaActualizarMetadatosPoder.Parametros.Parametro;
import co.gov.supernotariado.bachue.clientebus.poderes.types.actualizacionmetadatospoderes.TipoSalidaActualizarMetadatosPoder;
import co.gov.supernotariado.bachue.clientebus.util.UtilidadFecha;
import co.gov.supernotariado.bachue.clientebus.vo.poderes.actualizarPoderes.ParametroVO;
import co.gov.supernotariado.bachue.clientebus.vo.poderes.actualizarPoderes.TipoEntradaActualizarMetadatosPoderVO;
import co.gov.supernotariado.bachue.clientebus.vo.poderes.actualizarPoderes.TipoSalidaActualizarMetadatosPoderVO;

public class ActualizarPoderesConverter {
	
	/**
	 * Metodo que permite cambiar de vo a Tipo
	 */
	public static TipoEntradaActualizarMetadatosPoder voATipo(TipoEntradaActualizarMetadatosPoderVO ateamp_tipoEntradaActualizarMetadatosPoderVO) {
		TipoEntradaActualizarMetadatosPoder lteamp_tipoEntradaActualizarMetadatosPoder = new TipoEntradaActualizarMetadatosPoder();

		lteamp_tipoEntradaActualizarMetadatosPoder.setDDocName(ateamp_tipoEntradaActualizarMetadatosPoderVO.getIs_dDocName());
		lteamp_tipoEntradaActualizarMetadatosPoder.setParametros(listaVoATipo(ateamp_tipoEntradaActualizarMetadatosPoderVO.getIlp_parametros()));
		lteamp_tipoEntradaActualizarMetadatosPoder.setSistemaOrigen(ateamp_tipoEntradaActualizarMetadatosPoderVO.getIs_sistemaOrigen());

		return lteamp_tipoEntradaActualizarMetadatosPoder;
	}
	
	/**
	 * Metodo que permite cambiar de vo a Tipo en una lista
	 */
	private static Parametros listaVoATipo(List<ParametroVO> alp_parametros) {
		Parametros lp_parametros = new Parametros();
		alp_parametros.forEach(lp_parametro -> {
			lp_parametros.getParametro().add(voATipo(lp_parametro));
		});
		return lp_parametros;
	}
	
	/**
	 * Metodo que permite cambiar de vo a Tipo en un parametro
	 */

	private static Parametro voATipo(ParametroVO ap_parametro) {
		Parametro lp_parametro = new Parametro();
		lp_parametro.setXCCApoderado(validarDatos(ap_parametro.getIs_xccApoderado()));
		lp_parametro.setXCCPoderdante(validarDatos(ap_parametro.getIs_xccPoderdante()));
		lp_parametro.setXCirculoPredio(validarDatos(ap_parametro.getIs_xCirculoPredio()));
		lp_parametro.setXCiudadPredio(validarDatos(ap_parametro.getIs_xCiudadPredio()));
		lp_parametro.setXComments(validarDatos(ap_parametro.getIs_xComments()));
		lp_parametro.setXDepartamentoPredio(validarDatos(ap_parametro.getIs_xDepartamentoPredio()));
		lp_parametro.setXDireccionPredio(validarDatos(ap_parametro.getIs_xDireccionPredio()));
		lp_parametro.setXEstadoPoder(validarDatos(ap_parametro.getIs_xEstadoPoder()));
		lp_parametro.setXFechaInstrumento(UtilidadFecha.cambiarDateAXmlGregoriaCalender(ap_parametro.getId_xFechaInstrumento()));
		lp_parametro.setXFinalizacionPoder(UtilidadFecha.cambiarDateAXmlGregoriaCalender(ap_parametro.getId_xFinalizacionPoder()));
		lp_parametro.setXJustificacionRevocado(validarDatos(ap_parametro.getIs_xJustificacionRevocado()));
		lp_parametro.setXJustificacionUsado(validarDatos(ap_parametro.getIs_xJustificacionUsado()));
		lp_parametro.setXNombreApoderado(validarDatos(ap_parametro.getIs_xNombreApoderado()));
		lp_parametro.setXNombrePoderdante(validarDatos(ap_parametro.getIs_xNombrePoderdante()));
		lp_parametro.setXNumeroInstrumento(validarDatos(ap_parametro.getIs_xNumeroInstrumento()));
		lp_parametro.setXTipDocApoderado(validarDatos(ap_parametro.getIs_xTipDocApoderado()));
		lp_parametro.setXTipDocPoderdante(validarDatos(ap_parametro.getIs_xTipDocPoderdante()));
		lp_parametro.setXUsoPoder(validarDatos(ap_parametro.getIs_xUsoPoder()));
		lp_parametro.setXNotificaciones(ap_parametro.getIs_xNotificaciones());
		lp_parametro.setXDiligenciaReconocimiento(ap_parametro.getIs_xDiligenciaReconocimiento());
		lp_parametro.setDDocType(ap_parametro.getIs_dDocType());
		lp_parametro.setXTipoDocumento(ap_parametro.getIs_tipoDocumento());
		return lp_parametro;
	}
	
	/**
	 * Metodo que permite validar un strign
	 * @param as_dato 
	 * @return si es vacio retorna un guion "-"
	 */
	private static String validarDatos(String as_dato) {
		return as_dato == null ||as_dato.isEmpty() ? "-"  : as_dato ;
	}

	/**
	 * Metodo que permite cambiar de Tipo a vo
	 */
	public static TipoSalidaActualizarMetadatosPoderVO tipoAVo(
			TipoSalidaActualizarMetadatosPoder atsamp_actualizarMetadatosPoder) {
		TipoSalidaActualizarMetadatosPoderVO ltsamp_tipoSalidaActualizarMetadatosPoderVO = new TipoSalidaActualizarMetadatosPoderVO();
		
		ltsamp_tipoSalidaActualizarMetadatosPoderVO.setIi_codigoMensaje(atsamp_actualizarMetadatosPoder.getCodigoMensaje());
		ltsamp_tipoSalidaActualizarMetadatosPoderVO.setIi_did(atsamp_actualizarMetadatosPoder.getDID());
		ltsamp_tipoSalidaActualizarMetadatosPoderVO.setIs_descripcionMensaje(atsamp_actualizarMetadatosPoder.getDescripcionMensaje());
		ltsamp_tipoSalidaActualizarMetadatosPoderVO.setIs_docName(atsamp_actualizarMetadatosPoder.getDocName());
		
		return ltsamp_tipoSalidaActualizarMetadatosPoderVO;
	}



}

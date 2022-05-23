package co.gov.supernotariado.bachue.clientebus.converter;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.clientebus.poderes.types.consultaPoderes.TipoEntradaConsultarPoder.Parametros;
import co.gov.supernotariado.bachue.clientebus.poderes.types.consultaPoderes.TipoEntradaConsultarPoder;
import co.gov.supernotariado.bachue.clientebus.poderes.types.consultaPoderes.TipoEntradaConsultarPoder.Parametros.Parametro;
import co.gov.supernotariado.bachue.clientebus.poderes.types.consultaPoderes.TipoSalidaConsultarPoder;
import co.gov.supernotariado.bachue.clientebus.poderes.types.consultaPoderes.TipoSalidaConsultarPoder.Documentos;
import co.gov.supernotariado.bachue.clientebus.poderes.types.consultaPoderes.TipoSalidaConsultarPoder.Documentos.Documento;
import co.gov.supernotariado.bachue.clientebus.util.UtilidadFecha;
import co.gov.supernotariado.bachue.clientebus.vo.poderes.consultaPoderes.DocumentoVO;
import co.gov.supernotariado.bachue.clientebus.vo.poderes.consultaPoderes.ParametroVO;
import co.gov.supernotariado.bachue.clientebus.vo.poderes.consultaPoderes.TipoEntradaConsultarPoderVO;
import co.gov.supernotariado.bachue.clientebus.vo.poderes.consultaPoderes.TipoSalidaConsultarPoderVO;

public class ConsultaPoderesConverter {

	/**
	 * Metodo que permite cambiar de vo a Tipo
	 */
	public static TipoEntradaConsultarPoder voATipo(TipoEntradaConsultarPoderVO atecp_tipoEntradaConsultarPoderVO) {

		TipoEntradaConsultarPoder ltecp_tipoEntradaConsultaPoder = new TipoEntradaConsultarPoder();

		ltecp_tipoEntradaConsultaPoder.setParametros(ListaVoATipo(atecp_tipoEntradaConsultarPoderVO.getIlp_parametros()));
		ltecp_tipoEntradaConsultaPoder.setSistemaOrigen(atecp_tipoEntradaConsultarPoderVO.getIs_sistemaOrigen());	

		return ltecp_tipoEntradaConsultaPoder;
	}

	/**
	 * Metodo que permite cambiar de vo a Tipo en una lista
	 */
	private static Parametros ListaVoATipo(List<ParametroVO> alp_parametros) {
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

		lp_parametro.setXCCApoderado(ap_parametro.getIs_xccApoderado());
		lp_parametro.setXCCPoderdante(ap_parametro.getIs_xccPoderdante());
		lp_parametro.setXCirculoPredio(ap_parametro.getIs_xCirculoPredio());
		lp_parametro.setXCiudadPredio(ap_parametro.getIs_xCiudadPredio());
		lp_parametro.setXDepartamentoPredio(ap_parametro.getIs_xDepartamentoPredio());
		lp_parametro.setXDepartamentos(ap_parametro.getIs_xDepartamentos());
		lp_parametro.setXDireccionPredio(ap_parametro.getIs_xDireccionPredio());
		lp_parametro.setXEstadoPoder(ap_parametro.getIs_xEstadoPoder());
//		if(ap_parametro.getId_xFechaCarguePoder() != null)
//			lp_parametro.setXFechaCarguePoder(UtilidadFecha.cambiarDateAXmlGregoriaCalender(ap_parametro.getId_xFechaCarguePoder()));
		if(ap_parametro.getId_xFechaInstrumento() != null)
			lp_parametro.setXFechaInstrumento(UtilidadFecha.cambiarDateAXmlGregoriaCalender(ap_parametro.getId_xFechaInstrumento()));
		if(ap_parametro.getId_xFinalizacionPoder() != null)
			lp_parametro.setXFinalizacionPoder(UtilidadFecha.cambiarDateAXmlGregoriaCalender(ap_parametro.getId_xFinalizacionPoder()));
		lp_parametro.setXJustificacionRevocado(ap_parametro.getIs_xJustificacionRevocado());
		lp_parametro.setXJustificacionUsado(ap_parametro.getIs_xJustificacionUsado());
		lp_parametro.setXMunicipios(ap_parametro.getIs_xMunicipios());
		lp_parametro.setXNombreApoderado(ap_parametro.getIs_xNombreApoderado());
		lp_parametro.setXNombrePoderdante(ap_parametro.getIs_xNombrePoderdante());
		lp_parametro.setXNotaria(ap_parametro.getIs_xNotaria());
		lp_parametro.setXNumeroInstrumento(ap_parametro.getIs_xNumeroInstrumento());
		lp_parametro.setXNumMatriculaPoder(ap_parametro.getIs_xNumMatriculaPoder());
		lp_parametro.setXTipDocApoderado(ap_parametro.getIs_xTipDocApoderado());
		lp_parametro.setXTipDocPoderdante(ap_parametro.getIs_xTipDocPoderdante());
		lp_parametro.setXTipoPoder(ap_parametro.getIs_xTipoPoder());
		lp_parametro.setXUsoPoder(ap_parametro.getIs_xUsoPoder());
		lp_parametro.setDId(ap_parametro.getIs_did());
		lp_parametro.setDDocName(ap_parametro.getIs_dDocName());
        lp_parametro.setXDiligenciaReconocimiento(ap_parametro.getIs_xDiligenciaReconocimiento());
        lp_parametro.setDDocType(ap_parametro.getIs_dDocType());
        lp_parametro.setXTipoDocumento(ap_parametro.getIs_tipoDocumento());

		return lp_parametro;
	}

	/**
	 * Metodo que permite cambiar de Tipo a vo
	 */
	public static TipoSalidaConsultarPoderVO tipoAVo(TipoSalidaConsultarPoder atscp_consultarPoder) {
		TipoSalidaConsultarPoderVO ltscp_tipoSalidaConsultaPoder = new TipoSalidaConsultarPoderVO();
		ltscp_tipoSalidaConsultaPoder.setIld_documentosVo(listaTipoAVo(atscp_consultarPoder.getDocumentos()));
		return ltscp_tipoSalidaConsultaPoder;
	}

	/**
	 * Metodo que permite cambiar de Tipo a vo en una lista
	 */
	private static List<DocumentoVO> listaTipoAVo(Documentos ad_documentos) {
		List<DocumentoVO> ld_documentos = new ArrayList<DocumentoVO>();
		ad_documentos.getDocumento().forEach(ld_documento -> {
			ld_documentos.add(tipoAVo(ld_documento));
		});
		return ld_documentos;
	}

	/**
	 * Metodo que permite cambiar de Tipo a vo en un documento
	 */
	private static DocumentoVO tipoAVo(Documento ad_documento) {
		DocumentoVO ld_documentos = new DocumentoVO();
		if(ad_documento.getXFechaCarguePoder() != null)
			ld_documentos.setId_xFechaCarguePoder(ad_documento.getXFechaCarguePoder().toGregorianCalendar().getTime());
		if(ad_documento.getXFechaInstrumento() != null)
			ld_documentos.setId_xFechaInstrumento(ad_documento.getXFechaInstrumento().toGregorianCalendar().getTime());
		if(ad_documento.getXFinalizacionPoder() != null)
			ld_documentos.setId_xFinalizacionPoder(ad_documento.getXFinalizacionPoder().toGregorianCalendar().getTime());
		ld_documentos.setIi_codigoMensaje(ad_documento.getCodigoMensaje());
		ld_documentos.setIs_descripcionMensaje(ad_documento.getDescripcionMensaje());
		ld_documentos.setIs_did(ad_documento.getDID());
		ld_documentos.setIs_docName(ad_documento.getDocName());
		ld_documentos.setIs_urlVisor(ad_documento.getUrlVisor());
		ld_documentos.setIs_xccApoderado(ad_documento.getXCCApoderado());
		ld_documentos.setIs_xccPoderdante(ad_documento.getXCCPoderdante());
		ld_documentos.setIs_xCirculoPredio(ad_documento.getXCirculoPredio());
		ld_documentos.setIs_xCiudadPredio(ad_documento.getXCiudadPredio());
		ld_documentos.setIs_xDepartamentoPredio(ad_documento.getXDepartamentoPredio());
		ld_documentos.setIs_xDireccionPredio(ad_documento.getXDireccionPredio());
		ld_documentos.setIs_xDepartamentos(ad_documento.getXDepartamentos());
		ld_documentos.setIs_xEstadoPoder(ad_documento.getXEstadoPoder());
		ld_documentos.setIs_xJustificacionRevocado(ad_documento.getXJustificacionRevocado());
		ld_documentos.setIs_xJustificacionUsado(ad_documento.getXJustificacionUsado());
		ld_documentos.setIs_xMunicipios(ad_documento.getXMunicipios());
		ld_documentos.setIs_xNombreApoderado(ad_documento.getXNombreApoderado());
		ld_documentos.setIs_xNombrePoderdante(ad_documento.getXNombrePoderdante());
		ld_documentos.setIs_xNotaria(ad_documento.getXNotaria());
		ld_documentos.setIs_xNumeroInstrumento(ad_documento.getXNumeroInstrumento());
		ld_documentos.setIs_xNumMatriculaPoder(ad_documento.getXNumMatriculaPoder());
		ld_documentos.setIs_xTipDocApoderado(ad_documento.getXTipDocApoderado());
		ld_documentos.setIs_xTipDocPoderdante(ad_documento.getXTipDocPoderdante());
		ld_documentos.setIs_xTipoPoder(ad_documento.getXTipoPoder());
		ld_documentos.setIs_xUsoPoder(ad_documento.getXUsoPoder());
		ld_documentos.setIs_did(ad_documento.getDID());
		ld_documentos.setIs_docName(ad_documento.getDocName());
		ld_documentos.setIs_did(ad_documento.getDID());
		ld_documentos.setIs_xDiligenciaReconocimiento(ad_documento.getXDiligenciaReconocimiento());
		ld_documentos.setIs_dDocType(ad_documento.getDDocType());
		ld_documentos.setIs_xTipoDocumento(ad_documento.getXTipoDocumento());
		ld_documentos.setIs_xNotificaciones(ad_documento.getXNotificaciones());

		return ld_documentos;
	}

}

package co.gov.supernotariado.bachue.clientebus.converter;

import java.util.List;

import co.gov.supernotariado.bachue.clientebus.poderes.types.enviarpoder.TipoEntradaEnviarPoder;
import co.gov.supernotariado.bachue.clientebus.poderes.types.enviarpoder.TipoEntradaEnviarPoder.Parametros;
import co.gov.supernotariado.bachue.clientebus.poderes.types.enviarpoder.TipoEntradaEnviarPoder.Parametros.Parametro;
import co.gov.supernotariado.bachue.clientebus.poderes.types.enviarpoder.TipoSalidaEnviarPoder;
import co.gov.supernotariado.bachue.clientebus.util.UtilidadFecha;
import co.gov.supernotariado.bachue.clientebus.vo.poderes.envioPoderes.TipoSalidaEnviarPoderVo;
import co.gov.supernotariado.bachue.clientebus.vo.poderes.envioPoderes.ParametrosVO;
import co.gov.supernotariado.bachue.clientebus.vo.poderes.envioPoderes.TipoEntradaEnviarPoderVO;

public class EnvioPoderesConverter {

	public static TipoEntradaEnviarPoder voATipo(TipoEntradaEnviarPoderVO ateed_tipoEntradaEnviarDoucumentoVo) {

		TipoEntradaEnviarPoder lteep_tipoEntradaEnviarPoder = new TipoEntradaEnviarPoder();

		lteep_tipoEntradaEnviarPoder.setArchivo(ateed_tipoEntradaEnviarDoucumentoVo.getIb_archivo());
		lteep_tipoEntradaEnviarPoder.setNombreArchivo(ateed_tipoEntradaEnviarDoucumentoVo.getIs_nombreArchivo());
		lteep_tipoEntradaEnviarPoder.setParametros(listaVoATipo(ateed_tipoEntradaEnviarDoucumentoVo.getIlp_parametros()));
		lteep_tipoEntradaEnviarPoder.setSistemaOrigen(ateed_tipoEntradaEnviarDoucumentoVo.getIs_sistemaOrigen());

		return lteep_tipoEntradaEnviarPoder;
	}

	public static Parametros listaVoATipo(List<ParametrosVO> alp_parametrosVo) {
		Parametros lp_parametros = new Parametros();
		alp_parametrosVo.forEach(lp_parametro -> {
			lp_parametros.getParametro().add(voATipo(lp_parametro));
		});
		return lp_parametros;
	}


	public static Parametro voATipo(ParametrosVO ap_parametroVo) {

		Parametro lp_parametro = new Parametro();

		lp_parametro.setDDocName(ap_parametroVo.getIs_dDocName());
		lp_parametro.setDDocTittle(ap_parametroVo.getIs_dDocTittle());
		lp_parametro.setDDocType(ap_parametroVo.getIs_dDocType());
		lp_parametro.setDOutDate(UtilidadFecha.cambiarDateAXmlGregoriaCalender(ap_parametroVo.getId_dOutDate()));
		lp_parametro.setXActualizarDocumento(ap_parametroVo.getIs_xActualizarDocumento());
		lp_parametro.setXCCApoderado(ap_parametroVo.getIs_xccApoderado());
		lp_parametro.setXCCPoderdante(ap_parametroVo.getIs_xccPoderdante());
		lp_parametro.setXCirculoPredio(ap_parametroVo.getIs_xCirculoPredio());
		lp_parametro.setXCiudadPredio(ap_parametroVo.getIs_xCiudadPredio());
		lp_parametro.setXComments(ap_parametroVo.getIs_xComments());
		lp_parametro.setXDepartamentoPredio(ap_parametroVo.getIs_xDepartamentoPredio());
		lp_parametro.setXDepartamentos(ap_parametroVo.getIs_xDepartamentos());
		lp_parametro.setXDireccionPredio(ap_parametroVo.getIs_xDireccionPredio());
		lp_parametro.setXEstadoPoder(ap_parametroVo.getIs_xEstadoPoder());
		lp_parametro.setXFechaCarguePoder(UtilidadFecha.cambiarDateAXmlGregoriaCalender(ap_parametroVo.getId_xFechaCarguePoder()));
		lp_parametro.setXFechaInstrumento(UtilidadFecha.cambiarDateAXmlGregoriaCalender(ap_parametroVo.getId_xFechaInstrumento()));
		lp_parametro.setXFinalizacionPoder(UtilidadFecha.cambiarDateAXmlGregoriaCalender(ap_parametroVo.getId_xFinalizacionPoder()));
		lp_parametro.setXIdcProfile(ap_parametroVo.getIs_xIdcProfile());
		lp_parametro.setXJustificacionRevocado(ap_parametroVo.getIs_xJustificacionRevocado());
		lp_parametro.setXJustificacionUsado(ap_parametroVo.getIs_xJustificacionUsado());
		lp_parametro.setXMunicipios(ap_parametroVo.getIs_xMunicipios());
		lp_parametro.setXNombreApoderado(ap_parametroVo.getIs_xNombreApoderado());
		lp_parametro.setXNombrePoderdante(ap_parametroVo.getIs_xNombrePoderdante());
		lp_parametro.setXNotaria(ap_parametroVo.getIs_xNotaria());
		lp_parametro.setXNumeroInstrumento(ap_parametroVo.getIs_xNumeroInstrumento());
		lp_parametro.setXNumMatriculaPoder(ap_parametroVo.getIs_xNumMatriculaPoder());
		lp_parametro.setXTipDocPoderdante(ap_parametroVo.getIs_xTipDocPoderdante());
		lp_parametro.setXTipDocApoderado(ap_parametroVo.getIs_xTipDocApoderado());
		lp_parametro.setXTipoPoder(ap_parametroVo.getIs_xTipoPoder());
		lp_parametro.setXUsoPoder(ap_parametroVo.getIs_xUsoPoder());
		lp_parametro.setxDiligenciaReconocimiento(ap_parametroVo.getIs_xDiligenciaReconocimiento());
		lp_parametro.setxTipoDocumento(ap_parametroVo.getIs_xTipoDocumento());

		return lp_parametro;
	}

	public static TipoSalidaEnviarPoderVo tipoAVo(TipoSalidaEnviarPoder atsep_enviarPoder) {

		TipoSalidaEnviarPoderVo ltsep_enviarPoderSalida = new TipoSalidaEnviarPoderVo();
		ltsep_enviarPoderSalida.setIi_codigoMensaje(atsep_enviarPoder.getCodigoMensaje());
		ltsep_enviarPoderSalida.setIs_descripcionMensaje(atsep_enviarPoder.getDescripcionMensaje());
		ltsep_enviarPoderSalida.setIi_did(atsep_enviarPoder.getDID());
		ltsep_enviarPoderSalida.setIs_docName(atsep_enviarPoder.getDocName());

		return ltsep_enviarPoderSalida;
	}

}

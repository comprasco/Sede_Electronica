package co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import co.gov.supernotariado.bachue.clientebus.vo.poderes.actualizarPoderes.ParametroVO;
import co.gov.supernotariado.bachue.clientebus.vo.poderes.actualizarPoderes.TipoEntradaActualizarMetadatosPoderVO;
import co.gov.supernotariado.bachue.clientebus.vo.poderes.actualizarPoderes.TipoSalidaActualizarMetadatosPoderVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.poderes.ParametroWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.poderes.ParametrosWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.poderes.TipoEntradaActualizarMetadatosPoderWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.poderes.TipoEntradaEnviarPoderWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.poderes.TipoSalidaActualizarMetadatosPoderWSDTO;

public class ActualizarMetadatosPoderWsDtoConverter {
	
	private ActualizarMetadatosPoderWsDtoConverter() {
		// Contructor privado
	}

	public static TipoEntradaActualizarMetadatosPoderVO wsDtoAVo(TipoEntradaActualizarMetadatosPoderWSDTO ateamp_tipoEntradaActualizarMetadatosPoder) {
		TipoEntradaActualizarMetadatosPoderVO lteamp_tipoEntradaActualizarMetadatosPoder = new TipoEntradaActualizarMetadatosPoderVO();

		lteamp_tipoEntradaActualizarMetadatosPoder.setIs_dDocName(ateamp_tipoEntradaActualizarMetadatosPoder.getIs_dDocName());
		lteamp_tipoEntradaActualizarMetadatosPoder.setIlp_parametros(listaVoATipo(ateamp_tipoEntradaActualizarMetadatosPoder.getIlp_parametros()));
		lteamp_tipoEntradaActualizarMetadatosPoder.setIs_sistemaOrigen(ateamp_tipoEntradaActualizarMetadatosPoder.getIs_sistemaOrigen());

		return lteamp_tipoEntradaActualizarMetadatosPoder;
	}

	private static List<ParametroVO> listaVoATipo(List<ParametroWSDTO> alp_parametros) {
		List<ParametroVO> llp_parametros = new ArrayList<>();
		
		alp_parametros.forEach(lp_parametro -> 
			llp_parametros.add(voATipo(lp_parametro))
		);
		return llp_parametros;
	}


	private static ParametroVO voATipo(ParametroWSDTO ap_parametro) {
		ParametroVO lp_parametro = new ParametroVO();
		
		lp_parametro.setIs_xccApoderado(ap_parametro.getIs_xccApoderado());
		lp_parametro.setIs_xccPoderdante(ap_parametro.getIs_xccPoderdante());
		lp_parametro.setIs_xCirculoPredio(ap_parametro.getIs_xCirculoPredio());
		lp_parametro.setIs_xCiudadPredio(ap_parametro.getIs_xCiudadPredio());
		lp_parametro.setIs_xComments(ap_parametro.getIs_xComments());
		lp_parametro.setIs_xDepartamentoPredio(ap_parametro.getIs_xDepartamentoPredio());
		lp_parametro.setIs_xDireccionPredio(ap_parametro.getIs_xDireccionPredio());
		lp_parametro.setIs_xEstadoPoder(ap_parametro.getIs_xEstadoPoder());
		lp_parametro.setId_xFechaInstrumento(ap_parametro.getId_xFechaInstrumento() == null ? new Date() :ap_parametro.getId_xFechaInstrumento());
		lp_parametro.setId_xFinalizacionPoder(ap_parametro.getId_xFinalizacionPoder() == null ? new Date() : ap_parametro.getId_xFinalizacionPoder() );
		lp_parametro.setIs_xJustificacionRevocado(ap_parametro.getIs_xJustificacionRevocado());
		lp_parametro.setIs_xJustificacionUsado(ap_parametro.getIs_xJustificacionUsado());
		lp_parametro.setIs_xNombreApoderado(ap_parametro.getIs_xNombreApoderado());
		lp_parametro.setIs_xNombrePoderdante(ap_parametro.getIs_xNombrePoderdante());
		lp_parametro.setIs_xNumeroInstrumento(ap_parametro.getIs_xNumeroInstrumento());
		lp_parametro.setIs_xTipDocApoderado(ap_parametro.getIs_xTipDocApoderado());
		lp_parametro.setIs_xTipDocPoderdante(ap_parametro.getIs_xTipDocPoderdante());
		lp_parametro.setIs_xUsoPoder(ap_parametro.getIs_xUsoPoder());
		if (ap_parametro.getIln_notificaciones() != null) {
			lp_parametro.setIs_xNotificaciones(ap_parametro.getIln_notificaciones().toString());			
		}
		
		return lp_parametro;
	}


	public static TipoSalidaActualizarMetadatosPoderWSDTO voAWsDto(
			TipoSalidaActualizarMetadatosPoderVO atsamp_tipoSalidaActualizarMetadatosPoderVo) {
		TipoSalidaActualizarMetadatosPoderWSDTO ltsamp_tipoSalidaActualizarMetadatosPoderWSDTO = new TipoSalidaActualizarMetadatosPoderWSDTO();
		
		ltsamp_tipoSalidaActualizarMetadatosPoderWSDTO.setIi_codigoMensaje(atsamp_tipoSalidaActualizarMetadatosPoderVo.getIi_codigoMensaje());
		ltsamp_tipoSalidaActualizarMetadatosPoderWSDTO.setIi_did(atsamp_tipoSalidaActualizarMetadatosPoderVo.getIi_did());
		ltsamp_tipoSalidaActualizarMetadatosPoderWSDTO.setIs_descripcionMensaje(atsamp_tipoSalidaActualizarMetadatosPoderVo.getIs_descripcionMensaje());
		ltsamp_tipoSalidaActualizarMetadatosPoderWSDTO.setIs_docName(atsamp_tipoSalidaActualizarMetadatosPoderVo.getIs_docName());
		
		return ltsamp_tipoSalidaActualizarMetadatosPoderWSDTO;
	}


	public static TipoEntradaActualizarMetadatosPoderVO wsDtoAVo(TipoEntradaEnviarPoderWSDTO ateep_tipoEntrada) {
		TipoEntradaActualizarMetadatosPoderVO lteamp_entradaMetadatos = new TipoEntradaActualizarMetadatosPoderVO();
		ParametrosWSDTO lp_tipoEntrada = ateep_tipoEntrada.getIlp_parametros().iterator().next();
		lteamp_entradaMetadatos.setIs_dDocName(lp_tipoEntrada.getIs_dDocName());
		lteamp_entradaMetadatos.setIlp_parametros(listaVoATipo(ateep_tipoEntrada));
		lteamp_entradaMetadatos.setIs_sistemaOrigen(ateep_tipoEntrada.getIs_sistemaOrigen());

		return lteamp_entradaMetadatos;
	}


	private static List<ParametroVO> listaVoATipo(TipoEntradaEnviarPoderWSDTO ateep_tipoEntrada) {
		List<ParametroVO> llp_parametros = new ArrayList<>();
		
		ParametrosWSDTO lp_parametroWs = ateep_tipoEntrada.getIlp_parametros().iterator().next();
		
		ParametroVO lp_parametro = new ParametroVO();
		
		lp_parametro.setIs_xccApoderado(validarDatos(lp_parametroWs.getIs_xccApoderado()));
		lp_parametro.setIs_xccPoderdante(validarDatos(lp_parametroWs.getIs_xccPoderdante()));
		lp_parametro.setIs_xCirculoPredio(validarDatos(lp_parametroWs.getIs_xCirculoPredio()));
		lp_parametro.setIs_xCiudadPredio(validarDatos(lp_parametroWs.getIs_xCiudadPredio()));
		lp_parametro.setIs_xComments(validarDatos(lp_parametroWs.getIs_xComments()));
		lp_parametro.setIs_xDepartamentoPredio(validarDatos(lp_parametroWs.getIs_xDepartamentoPredio()));
		lp_parametro.setIs_xDireccionPredio(validarDatos(lp_parametroWs.getIs_xDireccionPredio()));
		lp_parametro.setIs_xEstadoPoder(validarDatos(lp_parametroWs.getIs_xEstadoPoder()));
		lp_parametro.setId_xFechaInstrumento(lp_parametroWs.getId_xFechaInstrumento());
		lp_parametro.setId_xFinalizacionPoder(lp_parametroWs.getId_xFinalizacionPoder());
		lp_parametro.setIs_xJustificacionRevocado(validarDatos(lp_parametroWs.getIs_xJustificacionRevocado()));
		lp_parametro.setIs_xJustificacionUsado(validarDatos(lp_parametroWs.getIs_xJustificacionUsado()));
		lp_parametro.setIs_xNombreApoderado(validarDatos(lp_parametroWs.getIs_xNombreApoderado()));
		lp_parametro.setIs_xNombrePoderdante(validarDatos(lp_parametroWs.getIs_xNombrePoderdante()));
		lp_parametro.setIs_xNumeroInstrumento(validarDatos(lp_parametroWs.getIs_xNumeroInstrumento()));
		lp_parametro.setIs_xTipDocApoderado(validarDatos(lp_parametroWs.getIs_xTipDocApoderado()));
		lp_parametro.setIs_xTipDocPoderdante(validarDatos(lp_parametroWs.getIs_xTipDocPoderdante()));
		lp_parametro.setIs_xUsoPoder(validarDatos(lp_parametroWs.getIs_xUsoPoder()));
		
		lp_parametro.setIs_tipoDocumento(validarDatos(lp_parametroWs.getIs_tipoDocumento()));
		lp_parametro.setIs_xDiligenciaReconocimiento(validarDatos(lp_parametroWs.getIs_xDiligenciaReconocimiento()));
		lp_parametro.setIs_xNotificaciones(validarDatos(lp_parametroWs.getIs_xNotificaciones()));
		
		llp_parametros.add(lp_parametro);
			
		return llp_parametros;
	}
	
	private static String validarDatos(String as_dato) {
		return as_dato == null ||as_dato.isEmpty() ? "-"  : as_dato ;
	}

}

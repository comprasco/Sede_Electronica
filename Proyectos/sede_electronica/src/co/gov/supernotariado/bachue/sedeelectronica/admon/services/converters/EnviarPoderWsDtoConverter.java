package co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.clientebus.vo.poderes.envioPoderes.ParametrosVO;
import co.gov.supernotariado.bachue.clientebus.vo.poderes.envioPoderes.TipoEntradaEnviarPoderVO;
import co.gov.supernotariado.bachue.clientebus.vo.poderes.envioPoderes.TipoSalidaEnviarPoderVo;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.poderes.ParametrosWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.poderes.TipoEntradaEnviarPoderWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.poderes.TipoSalidaEnviarPoderWSDTO;

public class EnviarPoderWsDtoConverter {

	public static TipoEntradaEnviarPoderVO wsDtoAVo(TipoEntradaEnviarPoderWSDTO ateep_tipoEntradaEnviarPoder) {

		TipoEntradaEnviarPoderVO lteep_tipoEntradaEnviarPoder = new TipoEntradaEnviarPoderVO();
		
		lteep_tipoEntradaEnviarPoder.setIb_archivo(ateep_tipoEntradaEnviarPoder.getIb_archivo());
		lteep_tipoEntradaEnviarPoder.setIs_nombreArchivo(ateep_tipoEntradaEnviarPoder.getIs_nombreArchivo());
		lteep_tipoEntradaEnviarPoder.setIlp_parametros(listaVoATipo(ateep_tipoEntradaEnviarPoder.getIlp_parametros()));
		lteep_tipoEntradaEnviarPoder.setIs_sistemaOrigen(ateep_tipoEntradaEnviarPoder.getIs_sistemaOrigen());
		
		return lteep_tipoEntradaEnviarPoder;
	}
	


	private static List<ParametrosVO> listaVoATipo(List<ParametrosWSDTO> alp_parametros) {
		
		List<ParametrosVO> llp_parametros = new ArrayList<ParametrosVO>();
		
		alp_parametros.forEach(lp_parametro -> {
			llp_parametros.add(voATipo(lp_parametro));
		});
		return llp_parametros;
	}



	private static ParametrosVO voATipo(ParametrosWSDTO ap_parametro) {
		ParametrosVO lp_parametro = new ParametrosVO();

		lp_parametro.setIs_dDocName(ap_parametro.getIs_dDocName());
		lp_parametro.setIs_dDocTittle(ap_parametro.getIs_dDocTittle());
		lp_parametro.setIs_dDocType(ap_parametro.getIs_dDocType());
		lp_parametro.setId_dOutDate(ap_parametro.getId_dOutDate());
		lp_parametro.setIs_xActualizarDocumento(ap_parametro.getIs_xActualizarDocumento());
		
		lp_parametro.setIs_xccApoderado(ap_parametro.getIs_xccApoderado());
		lp_parametro.setIs_xccPoderdante(ap_parametro.getIs_xccPoderdante());
		
		lp_parametro.setIs_xTipDocPoderdante(ap_parametro.getIs_xTipDocPoderdante());
		lp_parametro.setIs_xTipDocApoderado(ap_parametro.getIs_xTipDocApoderado());

		lp_parametro.setIs_xNombreApoderado(ap_parametro.getIs_xNombreApoderado());
		lp_parametro.setIs_xNombrePoderdante(ap_parametro.getIs_xNombrePoderdante());
		
		lp_parametro.setIs_xCirculoPredio(ap_parametro.getIs_xCirculoPredio());
		lp_parametro.setIs_xCiudadPredio(ap_parametro.getIs_xCiudadPredio());
		lp_parametro.setIs_xComments(ap_parametro.getIs_xComments());
		lp_parametro.setIs_xDepartamentoPredio(ap_parametro.getIs_xDepartamentoPredio());
		lp_parametro.setIs_xDepartamentos(ap_parametro.getIs_xDepartamentos());
		lp_parametro.setIs_xDireccionPredio(ap_parametro.getIs_xDireccionPredio());
		lp_parametro.setIs_xEstadoPoder(ap_parametro.getIs_xEstadoPoder());
		lp_parametro.setId_xFechaCarguePoder(ap_parametro.getId_xFechaCarguePoder());
		lp_parametro.setId_xFechaInstrumento(ap_parametro.getId_xFechaInstrumento());
		lp_parametro.setId_xFinalizacionPoder(ap_parametro.getId_xFinalizacionPoder());
		lp_parametro.setIs_xIdcProfile(ap_parametro.getIs_xIdcProfile());
		lp_parametro.setIs_xJustificacionRevocado(ap_parametro.getIs_xJustificacionRevocado());
		lp_parametro.setIs_xJustificacionUsado(ap_parametro.getIs_xJustificacionUsado());
		lp_parametro.setIs_xMunicipios(ap_parametro.getIs_xMunicipios());
		lp_parametro.setIs_xNotaria(ap_parametro.getIs_xNotaria());
		lp_parametro.setIs_xNumeroInstrumento(ap_parametro.getIs_xNumeroInstrumento());
		lp_parametro.setIs_xNumMatriculaPoder(ap_parametro.getIs_xNumMatriculaPoder());

		lp_parametro.setIs_xTipoPoder(ap_parametro.getIs_xTipoPoder());
		lp_parametro.setIs_xUsoPoder(ap_parametro.getIs_xUsoPoder());
		lp_parametro.setIs_xDiligenciaReconocimiento(ap_parametro.getIs_xDiligenciaReconocimiento());
		lp_parametro.setIs_xTipoDocumento(ap_parametro.getIs_tipoDocumento());
		
		return lp_parametro;
	}



	public static TipoSalidaEnviarPoderWSDTO voAWsDto(TipoSalidaEnviarPoderVo atsep_tipoSalidaEnviarPoderVo) {
	
		TipoSalidaEnviarPoderWSDTO  ltsep_enviarPoderSalida = new TipoSalidaEnviarPoderWSDTO();
		
		ltsep_enviarPoderSalida.setIi_codigoMensaje(atsep_tipoSalidaEnviarPoderVo.getIi_codigoMensaje());
		ltsep_enviarPoderSalida.setIs_descripcionMensaje(atsep_tipoSalidaEnviarPoderVo.getIs_descripcionMensaje());
		ltsep_enviarPoderSalida.setIi_did(atsep_tipoSalidaEnviarPoderVo.getIi_did());
		ltsep_enviarPoderSalida.setIs_docName(atsep_tipoSalidaEnviarPoderVo.getIs_docName());

		return ltsep_enviarPoderSalida;
	}


}

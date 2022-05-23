/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: AlertaTierrasWSBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.impl
 * Nombre del elemento: AlertaTierrasWSBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import co.gov.supernotariado.bachue.clientebus.vo.poderes.actualizarPoderes.TipoEntradaActualizarMetadatosPoderVO;
import co.gov.supernotariado.bachue.clientebus.vo.poderes.actualizarPoderes.TipoSalidaActualizarMetadatosPoderVO;
import co.gov.supernotariado.bachue.clientebus.vo.poderes.consultaPoderes.TipoEntradaConsultarPoderVO;
import co.gov.supernotariado.bachue.clientebus.vo.poderes.consultaPoderes.TipoSalidaConsultarPoderVO;
import co.gov.supernotariado.bachue.clientebus.vo.poderes.envioPoderes.TipoEntradaEnviarPoderVO;
import co.gov.supernotariado.bachue.clientebus.vo.poderes.envioPoderes.TipoSalidaEnviarPoderVo;
import co.gov.supernotariado.bachue.clientebus.vo.poderes.obtenerpoder.TipoEntradaObtenerPoderVO;
import co.gov.supernotariado.bachue.clientebus.vo.poderes.obtenerpoder.TipoSalidaObtenerPoderVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters.ActualizarMetadatosPoderWsDtoConverter;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters.ConsultarPoderWsDtoConverter;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters.EnviarPoderWsDtoConverter;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters.ObtenerPoderWsDtoConverter;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IPoderesWSBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.poderes.ParametroConsultaPoderWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.poderes.TipoEntradaActualizarMetadatosPoderWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.poderes.TipoEntradaConsultaPoderWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.poderes.TipoEntradaEnviarPoderWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.poderes.TipoEntradaObtenerPoderWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.poderes.TipoSalidaActualizarMetadatosPoderWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.poderes.TipoSalidaConsultaPoderWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.poderes.TipoSalidaEnviarPoderWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.poderes.TipoSalidaObtenerPoderWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumCriterio;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumOperacionesWs;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumServiciosWs;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadBusCliente;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadHistoricoConsulta;

/**
 * Clase tipo EJB (Enterprise Java Bean) de la capa de negocio. <br>
 * Contiene la implementacion logica para consumir operaciones del servicio
 * Poderes WS. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless(name = "PoderesWSBusiness", mappedName = "PoderesWSBusiness")
@LocalBean
public class PoderesWSBusiness implements IPoderesWSBusiness {

	@Override
	public TipoSalidaConsultaPoderWSDTO consultarPoder(TipoEntradaConsultaPoderWSDTO atecp_tipoEntradaConsultaPoder) {

		TipoEntradaConsultarPoderVO ltecp_tipoEntradaConsultarPoderVo = ConsultarPoderWsDtoConverter.wsDtoAVo(atecp_tipoEntradaConsultaPoder);
		TipoSalidaConsultarPoderVO ltscp_tipoSalidaConsultaPoderVo = (TipoSalidaConsultarPoderVO) UtilidadBusCliente.crearEntradaClienteIntegracionBase(EnumServiciosWs.CONSULTA_PODERES, EnumOperacionesWs.CONSULTA_PODERES_CONSULTAR_PODER, ltecp_tipoEntradaConsultarPoderVo);
		TipoSalidaConsultaPoderWSDTO ltscp_tipoSalidaConsultaPoderWsDto = ConsultarPoderWsDtoConverter.voAWsDto(ltscp_tipoSalidaConsultaPoderVo);

		UtilidadHistoricoConsulta.registrarHistorioConsulta(
				EnumOperacionesWs.CONSULTA_PODERES_CONSULTAR_PODER.getIs_nombreServicio(), 
				atecp_tipoEntradaConsultaPoder.toString(), 
				ltscp_tipoSalidaConsultaPoderWsDto);
		
		return ltscp_tipoSalidaConsultaPoderWsDto;		
	}	

	@Override
	public TipoSalidaConsultaPoderWSDTO consultarPoder(String as_didPoder, String as_idDocNamePoder) {
		TipoEntradaConsultaPoderWSDTO ltecp_tipoEntradaConsultaPoder = new TipoEntradaConsultaPoderWSDTO();
		ltecp_tipoEntradaConsultaPoder.setIs_sistemaOrigen(EnumCriterio.CANAL_ORIGEN.getIs_criterio());
		List<ParametroConsultaPoderWSDTO> llpcp_listaParametroConsultaPoderWsdto = new ArrayList<ParametroConsultaPoderWSDTO>();
		ParametroConsultaPoderWSDTO lpcp_poder = new ParametroConsultaPoderWSDTO();
		lpcp_poder.setIs_did(as_didPoder);
		lpcp_poder.setIs_dDocName(as_idDocNamePoder);
		llpcp_listaParametroConsultaPoderWsdto.add(lpcp_poder);
		ltecp_tipoEntradaConsultaPoder.setIlpcp_listaParametroConsultaPoderWsdto(llpcp_listaParametroConsultaPoderWsdto );
		TipoEntradaConsultarPoderVO ltecp_tipoEntradaConsultarPoderVo = ConsultarPoderWsDtoConverter.wsDtoAVo(ltecp_tipoEntradaConsultaPoder);
		TipoSalidaConsultarPoderVO ltscp_tipoSalidaConsultaPoderVo = (TipoSalidaConsultarPoderVO) UtilidadBusCliente.crearEntradaClienteIntegracionBase(EnumServiciosWs.CONSULTA_PODERES, EnumOperacionesWs.CONSULTA_PODERES_CONSULTAR_PODER, ltecp_tipoEntradaConsultarPoderVo);
		TipoSalidaConsultaPoderWSDTO ltscp_tipoSalidaConsultaPoderWsDto = ConsultarPoderWsDtoConverter.voAWsDto(ltscp_tipoSalidaConsultaPoderVo);
	
		UtilidadHistoricoConsulta.registrarHistorioConsulta(
				EnumOperacionesWs.CONSULTA_PODERES_CONSULTAR_PODER.getIs_nombreServicio(), 
				ltecp_tipoEntradaConsultaPoder.toString(), 
				ltscp_tipoSalidaConsultaPoderWsDto);
		
		return ltscp_tipoSalidaConsultaPoderWsDto;		
	}

	@Override
	public TipoSalidaEnviarPoderWSDTO enviarPoder(TipoEntradaEnviarPoderWSDTO ateep_tipoEntradaEnviarPoderWSDTO) {
		TipoEntradaEnviarPoderVO lteep_tipoEntradaEnviarPoderVo = EnviarPoderWsDtoConverter.wsDtoAVo(ateep_tipoEntradaEnviarPoderWSDTO);
		TipoSalidaEnviarPoderVo ltsep_tipoSalidaEnviarPoderVo = (TipoSalidaEnviarPoderVo) UtilidadBusCliente.crearEntradaClienteIntegracionBase(EnumServiciosWs.ENVIO_PODERES, EnumOperacionesWs.ENVIO_PODER, lteep_tipoEntradaEnviarPoderVo);
		TipoSalidaEnviarPoderWSDTO ltsep_tipoSalidaEnviarPoderWsDto = EnviarPoderWsDtoConverter.voAWsDto(ltsep_tipoSalidaEnviarPoderVo);
		
		UtilidadHistoricoConsulta.registrarHistorioConsulta(
				EnumOperacionesWs.ENVIO_PODER.getIs_nombreServicio(), 
				ateep_tipoEntradaEnviarPoderWSDTO.toString(), 
				ltsep_tipoSalidaEnviarPoderWsDto);
		
		return ltsep_tipoSalidaEnviarPoderWsDto;
	}	

	@Override
	public TipoSalidaActualizarMetadatosPoderWSDTO actualizarMetadataPoder(TipoEntradaActualizarMetadatosPoderWSDTO ateamp_ipoEntradaActualizarMetadatosPoderWSDTO) {
		TipoEntradaActualizarMetadatosPoderVO lteamp_tipoEntradaActualizarMetadatosPoderVo = ActualizarMetadatosPoderWsDtoConverter.wsDtoAVo(ateamp_ipoEntradaActualizarMetadatosPoderWSDTO);
		TipoSalidaActualizarMetadatosPoderVO ltsamp_tipoSalidaActualizarMetadatosPoderVo = (TipoSalidaActualizarMetadatosPoderVO) UtilidadBusCliente.crearEntradaClienteIntegracionBase(EnumServiciosWs.ACTUALIZACION_PODERES, EnumOperacionesWs.ACTUALIZACION_PODERES, lteamp_tipoEntradaActualizarMetadatosPoderVo);
		TipoSalidaActualizarMetadatosPoderWSDTO ltsamp_tipoSalidaActualizarMetadatosPoderWsDto = ActualizarMetadatosPoderWsDtoConverter.voAWsDto(ltsamp_tipoSalidaActualizarMetadatosPoderVo);
		
		UtilidadHistoricoConsulta.registrarHistorioConsulta(
				EnumOperacionesWs.ACTUALIZACION_PODERES.getIs_nombreServicio(), 
				ateamp_ipoEntradaActualizarMetadatosPoderWSDTO.toString(), 
				ltsamp_tipoSalidaActualizarMetadatosPoderWsDto);
		
		return ltsamp_tipoSalidaActualizarMetadatosPoderWsDto;
	}

	@Override
	public TipoSalidaObtenerPoderWSDTO obtenerPoder(TipoEntradaObtenerPoderWSDTO ateop_tipoEntradaObtenerPoderWSDTO) {
		TipoEntradaObtenerPoderVO lteop_tipoEntradaActualizarMetadatosPoderVo = ObtenerPoderWsDtoConverter.wsDtoAVo(ateop_tipoEntradaObtenerPoderWSDTO);
		TipoSalidaObtenerPoderVO ltsop_tipoSalidaActualizarMetadatosPoderVo = (TipoSalidaObtenerPoderVO) UtilidadBusCliente.crearEntradaClienteIntegracionBase(EnumServiciosWs.OBTENER_PODER, EnumOperacionesWs.CONSULTA_PODERES_OBTENER_PODER, lteop_tipoEntradaActualizarMetadatosPoderVo);
		TipoSalidaObtenerPoderWSDTO ltsop_tipoSalidaObtenerPoderWsDto = ObtenerPoderWsDtoConverter.voAWsDto(ltsop_tipoSalidaActualizarMetadatosPoderVo);
		
		UtilidadHistoricoConsulta.registrarHistorioConsulta(
				EnumOperacionesWs.CONSULTA_PODERES_OBTENER_PODER.getIs_nombreServicio(), 
				lteop_tipoEntradaActualizarMetadatosPoderVo.toString(), 
				ltsop_tipoSalidaObtenerPoderWsDto);
		
		
		return ltsop_tipoSalidaObtenerPoderWsDto;
	}

	@Override
	public TipoSalidaActualizarMetadatosPoderWSDTO actualizarMetadataPoder(TipoEntradaEnviarPoderWSDTO ateep_tipoEntradaEnviarPoderWSDTO) {
		TipoEntradaActualizarMetadatosPoderVO lteamp_tipoEntradaActualizarMetadatosPoderVO = ActualizarMetadatosPoderWsDtoConverter.wsDtoAVo(ateep_tipoEntradaEnviarPoderWSDTO);
		lteamp_tipoEntradaActualizarMetadatosPoderVO.setIs_sistemaOrigen(EnumCriterio.CANAL_ORIGEN.getIs_criterio());
		lteamp_tipoEntradaActualizarMetadatosPoderVO.setIs_dDocName(ateep_tipoEntradaEnviarPoderWSDTO.getIs_dDocName() +"-"+ ateep_tipoEntradaEnviarPoderWSDTO.getIs_did());
		TipoSalidaActualizarMetadatosPoderVO ltscp_tipoSalidaActualizarMetadatosPoderVo = (TipoSalidaActualizarMetadatosPoderVO) UtilidadBusCliente.crearEntradaClienteIntegracionBase(EnumServiciosWs.ACTUALIZACION_PODERES, EnumOperacionesWs.ACTUALIZACION_PODERES, lteamp_tipoEntradaActualizarMetadatosPoderVO);
		TipoSalidaActualizarMetadatosPoderWSDTO ltscp_tipoSalidaActualizarMetadatosPoderWsDto = ActualizarMetadatosPoderWsDtoConverter.voAWsDto(ltscp_tipoSalidaActualizarMetadatosPoderVo);
	
		UtilidadHistoricoConsulta.registrarHistorioConsulta(
				EnumOperacionesWs.ACTUALIZACION_PODERES.getIs_nombreServicio(), 
				lteamp_tipoEntradaActualizarMetadatosPoderVO.toString(), 
				ltscp_tipoSalidaActualizarMetadatosPoderWsDto);
		
		return ltscp_tipoSalidaActualizarMetadatosPoderWsDto;
	}
}

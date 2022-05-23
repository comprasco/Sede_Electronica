/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: GestionAlertasTitularesBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.impl
 * Nombre del elemento: GestionAlertasTitularesBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.impl;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import co.gov.supernotariado.bachue.clientebus.vo.gestionalertastitulares.TipoEntradaActualizarContactoAlertaVO;
import co.gov.supernotariado.bachue.clientebus.vo.gestionalertastitulares.TipoEntradaConsultarAlertaVO;
import co.gov.supernotariado.bachue.clientebus.vo.gestionalertastitulares.TipoEntradaConsultarTarifaAlertasTitularesVO;
import co.gov.supernotariado.bachue.clientebus.vo.gestionalertastitulares.TipoEntradaInactivarAlertaVO;
import co.gov.supernotariado.bachue.clientebus.vo.gestionalertastitulares.TipoEntradaValidarSolicitudAlertaIndividualVO;
import co.gov.supernotariado.bachue.clientebus.vo.gestionalertastitulares.TipoEntradaValidarSolicitudAlertaMasivaVO;
import co.gov.supernotariado.bachue.clientebus.vo.gestionalertastitulares.TipoSalidaActualizarContactoAlertaVO;
import co.gov.supernotariado.bachue.clientebus.vo.gestionalertastitulares.TipoSalidaConsultarAlertaVO;
import co.gov.supernotariado.bachue.clientebus.vo.gestionalertastitulares.TipoSalidaConsultarTarifaAlertasTitularesVO;
import co.gov.supernotariado.bachue.clientebus.vo.gestionalertastitulares.TipoSalidaInactivarAlertaVO;
import co.gov.supernotariado.bachue.clientebus.vo.gestionalertastitulares.TipoSalidaValidarSolicitudAlertaIndividualVO;
import co.gov.supernotariado.bachue.clientebus.vo.gestionalertastitulares.TipoSalidaValidarSolicitudAlertaMasivaVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters.ActualizarContactoAlertaWsDtoConverter;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters.ConsultarAlertaTarifaWsDtoConverter;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters.ConsultarAlertaWsDtoConverter;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters.InactivarAlertaWsDtoConverter;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters.ValidarSolicitudAlertaIndividualWsDtoConverter;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters.ValidarSolicitudAlertaMasivaWsDtoConverter;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IGestionAlertasTitularesBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaActualizarContactoAlertaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarAlertaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarTarifaAlertasTitularesWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaInactivarAlertaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaValidarSolicitudAlertaIndividualWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaValidarSolicitudAlertaMasivaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaActualizarContactoAlertaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarAlertaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarTarifaAlertasTitularesWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaInactivarAlertaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaValidarSolicitudAlertaIndividualWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaValidarSolicitudAlertaMasivaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumOperacionesWs;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumServiciosWs;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadBusCliente;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadHistoricoConsulta;

/**
 * Clase tipo EJB (Enterprise Java Bean) de la capa de negocio. <br>
 * Contiene la implementacion logica para consumir operaciones del servicio
 * Gestion alertas titulares. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless(name = "GestionAlertasTitularesBusiness", mappedName = "GestionAlertasTitularesBusiness")
@LocalBean
public class GestionAlertasTitularesBusiness implements IGestionAlertasTitularesBusiness{

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IGestionAlertasTitularesBusiness#actualizarContactoAlerta(co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaActualizarContactoAlertaWSDTO)
	 */
	@Override
	public TipoSalidaActualizarContactoAlertaWSDTO actualizarContactoAlerta(
			TipoEntradaActualizarContactoAlertaWSDTO ateaca_tipoEntradaActualizarContactoAlertaWsDto) {
		TipoEntradaActualizarContactoAlertaVO lteaca_tipoEntradaActualizarContactoAlertaVo = ActualizarContactoAlertaWsDtoConverter.voAEntidad(ateaca_tipoEntradaActualizarContactoAlertaWsDto);
		TipoSalidaActualizarContactoAlertaVO ltsaca_tipoSalidaActualizarContactoAlertaVo = (TipoSalidaActualizarContactoAlertaVO) UtilidadBusCliente.crearEntradaClienteIntegracionBase(EnumServiciosWs.GESTION_ALERTAS_TITULARES, EnumOperacionesWs.GESTION_ALERTAS_TITULARES_ACTUALIZAR_CONTACTO, lteaca_tipoEntradaActualizarContactoAlertaVo);
		TipoSalidaActualizarContactoAlertaWSDTO ltsaca_tipoSalidaActualizarContactoAlertaWsDto;
		ltsaca_tipoSalidaActualizarContactoAlertaWsDto = ActualizarContactoAlertaWsDtoConverter.entidadAVo(ltsaca_tipoSalidaActualizarContactoAlertaVo);
		return ltsaca_tipoSalidaActualizarContactoAlertaWsDto;
	}

	
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IGestionAlertasTitularesBusiness#consultarAlerta(co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarAlertaWSDTO)
	 */
	@Override
	public TipoSalidaConsultarAlertaWSDTO consultarAlerta(
			TipoEntradaConsultarAlertaWSDTO ateca_tipoEntradaConsultarAlertaWsDto) {
		TipoEntradaConsultarAlertaVO lteca_tipoEntradaConsultarAlertaVo = ConsultarAlertaWsDtoConverter.voAEntidad(ateca_tipoEntradaConsultarAlertaWsDto);
		TipoSalidaConsultarAlertaVO ltsca_tipoSalidaConsultarAlertaVo = (TipoSalidaConsultarAlertaVO) UtilidadBusCliente.crearEntradaClienteIntegracionBase(EnumServiciosWs.GESTION_ALERTAS_TITULARES, EnumOperacionesWs.GESTION_ALERTAS_TITULARES_CONSULTAR, lteca_tipoEntradaConsultarAlertaVo);
		TipoSalidaConsultarAlertaWSDTO ltsca_tipoSalidaConsultarAlertaWsDto;
		ltsca_tipoSalidaConsultarAlertaWsDto = ConsultarAlertaWsDtoConverter.entidadAVo(ltsca_tipoSalidaConsultarAlertaVo);
		
		UtilidadHistoricoConsulta.registrarHistorioConsulta(
				EnumOperacionesWs.ALERTA_TIERRAS_CONSULTAR_ALERTAS.getIs_nombreServicio(), 
				ateca_tipoEntradaConsultarAlertaWsDto.toString(), 
				ltsca_tipoSalidaConsultarAlertaWsDto);
		
		
		return ltsca_tipoSalidaConsultarAlertaWsDto;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IGestionAlertasTitularesBusiness#inactivarAlerta(co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaInactivarAlertaWSDTO)
	 */
	@Override
	public TipoSalidaInactivarAlertaWSDTO inactivarAlerta(
			TipoEntradaInactivarAlertaWSDTO ateia_tipoEntradaInactivarAlertaWsDto) {
		TipoEntradaInactivarAlertaVO ateia_tipoEntradaInactivarAlertaVo = InactivarAlertaWsDtoConverter.voAEntidad(ateia_tipoEntradaInactivarAlertaWsDto);
		TipoSalidaInactivarAlertaVO atsia_tipoSalidaInactivarAlertaVo = (TipoSalidaInactivarAlertaVO) UtilidadBusCliente.crearEntradaClienteIntegracionBase(EnumServiciosWs.GESTION_ALERTAS_TITULARES, EnumOperacionesWs.GESTION_ALERTAS_TITULARES_INACTIVAR, ateia_tipoEntradaInactivarAlertaVo);
		TipoSalidaInactivarAlertaWSDTO ateia_tipoSalidaInactivarAlertaWsDto;
		ateia_tipoSalidaInactivarAlertaWsDto = InactivarAlertaWsDtoConverter.entidadAVo(atsia_tipoSalidaInactivarAlertaVo);
		return ateia_tipoSalidaInactivarAlertaWsDto;
		
	}

	
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IGestionAlertasTitularesBusiness#validarSolicitudAlertaIndividual(co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaValidarSolicitudAlertaIndividualWSDTO)
	 */
	@Override
	public TipoSalidaValidarSolicitudAlertaIndividualWSDTO validarSolicitudAlertaIndividual(
			TipoEntradaValidarSolicitudAlertaIndividualWSDTO atevsai_tipoEntradaValidarSolicitudAlertaIndividualWsDto) {
		TipoEntradaValidarSolicitudAlertaIndividualVO ltevsai_tipoEntradaValidarSolicitudAlertaIndividualVo = ValidarSolicitudAlertaIndividualWsDtoConverter.voAEntidad(atevsai_tipoEntradaValidarSolicitudAlertaIndividualWsDto);
		TipoSalidaValidarSolicitudAlertaIndividualVO ltsvsai_tipoSalidaValidarSolicitudAlertaIndividualVo = (TipoSalidaValidarSolicitudAlertaIndividualVO) UtilidadBusCliente.crearEntradaClienteIntegracionBase(EnumServiciosWs.GESTION_ALERTAS_TITULARES, EnumOperacionesWs.GESTION_ALERTAS_TITULARES_VALIDACION_INDIVIDUAL, ltevsai_tipoEntradaValidarSolicitudAlertaIndividualVo);
		TipoSalidaValidarSolicitudAlertaIndividualWSDTO ltsvsai_tipoSalidaValidarSolicitudAlertaIndividualWsDto;
		ltsvsai_tipoSalidaValidarSolicitudAlertaIndividualWsDto = ValidarSolicitudAlertaIndividualWsDtoConverter.entidadAVo(ltsvsai_tipoSalidaValidarSolicitudAlertaIndividualVo);
		
		UtilidadHistoricoConsulta.registrarHistorioConsulta(
				EnumOperacionesWs.GESTION_ALERTAS_TITULARES_VALIDACION_INDIVIDUAL.getIs_nombreServicio(), 
				atevsai_tipoEntradaValidarSolicitudAlertaIndividualWsDto.toString(), 
				ltsvsai_tipoSalidaValidarSolicitudAlertaIndividualWsDto);
		
		return ltsvsai_tipoSalidaValidarSolicitudAlertaIndividualWsDto;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IGestionAlertasTitularesBusiness#validarSolicitudAlertaMasiva(co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaValidarSolicitudAlertaMasivaWSDTO)
	 */
	@Override
	public TipoSalidaValidarSolicitudAlertaMasivaWSDTO validarSolicitudAlertaMasiva(
			TipoEntradaValidarSolicitudAlertaMasivaWSDTO atevsam_tipoEntradaValidarSolicitudAlertaMasivoWsDto) {
		TipoEntradaValidarSolicitudAlertaMasivaVO ltevsam_tipoEntradaValidarSolicitudAlertaMasivaVo = ValidarSolicitudAlertaMasivaWsDtoConverter.voAEntidad(atevsam_tipoEntradaValidarSolicitudAlertaMasivoWsDto);
		TipoSalidaValidarSolicitudAlertaMasivaVO ltsvsam_tipoSalidaValidarSolicitudAlertaMasivaVo = (TipoSalidaValidarSolicitudAlertaMasivaVO) UtilidadBusCliente.crearEntradaClienteIntegracionBase(EnumServiciosWs.GESTION_ALERTAS_TITULARES, EnumOperacionesWs.GESTION_ALERTAS_TITULARES_VALIDACION_MASIVA, ltevsam_tipoEntradaValidarSolicitudAlertaMasivaVo);
		TipoSalidaValidarSolicitudAlertaMasivaWSDTO ltsvsam_tipoSalidaValidarSolicitudAlertaMasivaWsDto;
		ltsvsam_tipoSalidaValidarSolicitudAlertaMasivaWsDto = ValidarSolicitudAlertaMasivaWsDtoConverter.entidadAVo(ltsvsam_tipoSalidaValidarSolicitudAlertaMasivaVo);
		
		UtilidadHistoricoConsulta.registrarHistorioConsulta(
				EnumOperacionesWs.GESTION_ALERTAS_TITULARES_VALIDACION_MASIVA.getIs_nombreServicio(), 
				atevsam_tipoEntradaValidarSolicitudAlertaMasivoWsDto.toString(), 
				ltsvsam_tipoSalidaValidarSolicitudAlertaMasivaWsDto);
		
		return ltsvsam_tipoSalidaValidarSolicitudAlertaMasivaWsDto;
	}


	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IGestionAlertasTitularesBusiness#consultarTarifaAlertasTitulares(co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarTarifaAlertasTitularesWSDTO)
	 */
	@Override
	public TipoSalidaConsultarTarifaAlertasTitularesWSDTO consultarTarifaAlertasTitulares(TipoEntradaConsultarTarifaAlertasTitularesWSDTO atectat_tipoEntradaConsultarTarifaAlertasTitularesWsDto)
	{
		TipoEntradaConsultarTarifaAlertasTitularesVO atectat_tipoEntradaConsultarTarifaAlertasTitularesVo = ConsultarAlertaTarifaWsDtoConverter.voAEntidad(atectat_tipoEntradaConsultarTarifaAlertasTitularesWsDto);
		TipoSalidaConsultarTarifaAlertasTitularesVO ltsctat_tipoSalidaConsultarTarifaAlertasTitularesVo = (TipoSalidaConsultarTarifaAlertasTitularesVO) UtilidadBusCliente.crearEntradaClienteIntegracionBase(EnumServiciosWs.GESTION_ALERTAS_TITULARES,EnumOperacionesWs.GESTION_ALERTAS_TITULARES_CONSULTAR_TARIFA,atectat_tipoEntradaConsultarTarifaAlertasTitularesVo);
		TipoSalidaConsultarTarifaAlertasTitularesWSDTO ltsctat_tipoSalidaConsultarTarifaAlertasTitularesWsDto;
		ltsctat_tipoSalidaConsultarTarifaAlertasTitularesWsDto = ConsultarAlertaTarifaWsDtoConverter.entidadAVo(ltsctat_tipoSalidaConsultarTarifaAlertasTitularesVo);
		
		UtilidadHistoricoConsulta.registrarHistorioConsulta(
				EnumOperacionesWs.GESTION_ALERTAS_TITULARES_CONSULTAR_TARIFA.getIs_nombreServicio(), 
				atectat_tipoEntradaConsultarTarifaAlertasTitularesWsDto.toString(), 
				ltsctat_tipoSalidaConsultarTarifaAlertasTitularesWsDto);
		
		return ltsctat_tipoSalidaConsultarTarifaAlertasTitularesWsDto;
	}

}

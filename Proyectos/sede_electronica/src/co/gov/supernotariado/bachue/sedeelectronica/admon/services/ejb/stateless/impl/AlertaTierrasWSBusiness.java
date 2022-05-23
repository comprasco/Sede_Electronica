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

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.EntradaConsultarEntidadesJAVO;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoEntradaActivarAlertaTierrasVO;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoEntradaAgregarListaMatriculasAlertaVO;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoEntradaAgregarMatriculaAlertaVO;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoEntradaCancelarIngresoAlertaTierrasVO;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoEntradaConsultarAlertasVO;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoEntradaConsultarDetalleAlertaVO;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoEntradaConsultarDocumentoAlertaVO;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoEntradaConsultarListaMatriculasVO;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoEntradaConsultarMapaPredioInfoCatastralVO;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoEntradaConsultarMatriculaAlertaVO;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoEntradaConsultarMatriculaFiltrosTierrasVO;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoEntradaConsultarMatriculaInfoCatastralVO;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoEntradaConsultarMatriculaVO;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoEntradaConsultarOficinasOrigenTipoVO;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoEntradaCrearProcAntiguoSistemaTierrasVO;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoEntradaEliminarProcAntiguoSistemaVO;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoEntradaInactivarAlertaVO;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoEntradaInscribirAlertaCabeceraVO;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoEntradaListarProcAntiguoSistemaVO;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoEntradaRechazarCorreccionAlertaVO;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoEntradaRemoverMatriculaAlertaVO;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoSalidaActivarAlertaTierrasVO;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoSalidaAgregarListaMatriculasAlertaVO;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoSalidaAgregarMatriculaAlertaVO;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoSalidaCancelarIngresoAlertaTierrasVO;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoSalidaConsultarAlertasVO;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoSalidaConsultarDetalleAlertaVO;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoSalidaConsultarDocumentoAlertaVO;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoSalidaConsultarEntidadesJAVO;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoSalidaConsultarListaMatriculasVO;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoSalidaConsultarMapaPredioInfoCatastralVO;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoSalidaConsultarMatriculaAlertaVO;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoSalidaConsultarMatriculaFiltrosTierrasVO;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoSalidaConsultarMatriculaInfoCatastralVO;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoSalidaConsultarMatriculaVO;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoSalidaConsultarOficinasOrigenTipoVO;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoSalidaCrearProcAntiguoSistemaTierrasVO;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoSalidaEliminarProcAntiguoSistemaVO;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoSalidaInactivarAlertaVO;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoSalidaInscribirAlertaCabeceraVO;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoSalidaListarProcAntiguoSistemaVO;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoSalidaRechazarCorreccionAlertaVO;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoSalidaRemoverMatriculaAlertaVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters.ActivarAlertaTierrasWsDtoConverter;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters.AgregarListaMatriculasAlertaWsDtoConverter;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters.AgregarMatriculaAlertaWsDtoConverter;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters.CancelarIngresoAlertaTierrasWsDtoConverter;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters.ConsultarAlertasWsDtoConverter;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters.ConsultarDetalleAlertaWsDtoConverter;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters.ConsultarDocumentoAlertaWsDtoConverter;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters.ConsultarEntidadesJAWsDtoConverter;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters.ConsultarListaMatriculasWsDtoConverter;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters.ConsultarMapaPredioInfoCatastralWsDtoConverter;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters.ConsultarMatriculaAlertaWsDtoConverter;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters.ConsultarMatriculaFiltrosTierrasWsDtoConverter;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters.ConsultarMatriculaInfoCatastralWsDtoConverter;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters.ConsultarMatriculaWsDtoConverter;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters.ConsultarOficinasOrigenTipoWsDtoConverter;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters.CrearProcAntiguoSistemaTierrasWsDtoConverter;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters.EliminarProcAntiguoSistemaWsDtoConverter;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters.InactivarAlertaTierrasWsDtoConverter;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters.InscribirAlertaCabeceraWsDtoConverter;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters.ListarProcAntiguoSistemaWsDtoConverter;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters.RechazarCorreccionAlertaWsDtoConverter;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters.RemoverMatriculaAlertaWsDtoConverter;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IAlertaTierrasWSBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.EntradaConsultarEntidadesJAWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaActivarAlertaTierrasWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaAgregarListaMatriculasAlertaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaAgregarMatriculaAlertaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaCancelarIngresoAlertaTierrasWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarAlertasWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarDetalleAlertaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarDocumentoAlertaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarListaMatriculasWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarMapaPredioInfoCatastralWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarMatriculaAlertaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarMatriculaFiltrosTierrasWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarMatriculaInfoCatastralWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarMatriculaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarOficinasOrigenTipoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaCrearProcAntiguoSistemaTierrasWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaEliminarProcAntiguoSistemaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaInactivarAlertaTierrasWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaInscribirAlertaCabeceraWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaListarProcAntiguoSistemaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaRechazarCorreccionAlertaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaRemoverMatriculaAlertaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaActivarAlertaTierrasWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaAgregarListaMatriculasAlertaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaAgregarMatriculaAlertaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaCancelarIngresoAlertaTierrasWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarAlertasWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarDetalleAlertaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarDocumentoAlertaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarEntidadesJAWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarListaMatriculasWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarMapaPredioInfoCatastralWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarMatriculaAlertaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarMatriculaFiltrosTierrasWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarMatriculaInfoCatastralWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarMatriculaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarOficinasOrigenTipoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaCrearProcAntiguoSistemaTierrasWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaEliminarProcAntiguoSistemaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaInactivarAlertaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaInscribirAlertaCabeceraWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaListarProcAntiguoSistemaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaRechazarCorreccionAlertaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaRemoverMatriculaAlertaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumOperacionesWs;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumServiciosWs;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadBusCliente;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadHistoricoConsulta;

/**
 * Clase tipo EJB (Enterprise Java Bean) de la capa de negocio. <br>
 * Contiene la implementacion logica para consumir operaciones del servicio
 * Alerta tierras WS. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless(name = "AlertaTierrasWSBusinessBusiness", mappedName = "AlertaTierrasWSBusinessBusiness")
@LocalBean
public class AlertaTierrasWSBusiness implements IAlertaTierrasWSBusiness{

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IAlertaTierrasWSBusiness#activarAlertaTierras(co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaActivarAlertaTierrasWSDTO)
	 */
	@Override
	public TipoSalidaActivarAlertaTierrasWSDTO activarAlertaTierras(
			TipoEntradaActivarAlertaTierrasWSDTO ateaat_tipoEntradaActivarAlertaTierrasWsDto) {
		
		TipoEntradaActivarAlertaTierrasVO lteaat_tipoEntradaActivarAlertaTierrasVo = ActivarAlertaTierrasWsDtoConverter.wsDtoAVo(ateaat_tipoEntradaActivarAlertaTierrasWsDto);
		TipoSalidaActivarAlertaTierrasVO ltsaat_tipoSalidaActivarAlertaTierrasVo = (TipoSalidaActivarAlertaTierrasVO) UtilidadBusCliente.crearEntradaClienteIntegracionBase(EnumServiciosWs.ALERTA_TIERRAS, EnumOperacionesWs.ALERTA_TIERRAS_ACTIVAR_ALERTA_TIERRAS, lteaat_tipoEntradaActivarAlertaTierrasVo);
		TipoSalidaActivarAlertaTierrasWSDTO ltsaat_tipoSalidaActivarAlertaTierrasWsDto;
		ltsaat_tipoSalidaActivarAlertaTierrasWsDto = ActivarAlertaTierrasWsDtoConverter.voAWsDto(ltsaat_tipoSalidaActivarAlertaTierrasVo);
		return ltsaat_tipoSalidaActivarAlertaTierrasWsDto;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IAlertaTierrasWSBusiness#agregarListaMatriculasAlerta(co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaAgregarListaMatriculasAlertaWSDTO)
	 */
	@Override
	public TipoSalidaAgregarListaMatriculasAlertaWSDTO agregarListaMatriculasAlerta(
			TipoEntradaAgregarListaMatriculasAlertaWSDTO atealma_tipoEntradaAgregarListaMatriculasAlertaWsDto) {
		
		TipoEntradaAgregarListaMatriculasAlertaVO ltealma_tipoEntradaAgregarListaMatriculasAlertaVo = AgregarListaMatriculasAlertaWsDtoConverter.wsDtoAVo(atealma_tipoEntradaAgregarListaMatriculasAlertaWsDto);
		TipoSalidaAgregarListaMatriculasAlertaVO ltsalma_tipoSalidaAgregarListaMatriculasAlertaVo = (TipoSalidaAgregarListaMatriculasAlertaVO) UtilidadBusCliente.crearEntradaClienteIntegracionBase(EnumServiciosWs.ALERTA_TIERRAS, EnumOperacionesWs.ALERTA_TIERRAS_AGREGAR_LISTA_MATRICULAS_ALERTA, ltealma_tipoEntradaAgregarListaMatriculasAlertaVo);
		TipoSalidaAgregarListaMatriculasAlertaWSDTO ltsalma_tipoSalidaAgregarListaMatriculasAlertaWsDto;
		ltsalma_tipoSalidaAgregarListaMatriculasAlertaWsDto = AgregarListaMatriculasAlertaWsDtoConverter.voAWsDto(ltsalma_tipoSalidaAgregarListaMatriculasAlertaVo);
		return ltsalma_tipoSalidaAgregarListaMatriculasAlertaWsDto;
	}
	
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IAlertaTierrasWSBusiness#agregarMatriculaAlerta(co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaAgregarMatriculaAlertaWSDTO)
	 */
	@Override
	public TipoSalidaAgregarMatriculaAlertaWSDTO agregarMatriculaAlerta(
			TipoEntradaAgregarMatriculaAlertaWSDTO ateama_tipoEntradaAgregarMatriculaAlertaWsDto) {
		
		TipoEntradaAgregarMatriculaAlertaVO lteama_tipoEntradaAgregarMatriculaAlertaVo = AgregarMatriculaAlertaWsDtoConverter.wsDtoAVo(ateama_tipoEntradaAgregarMatriculaAlertaWsDto);
		TipoSalidaAgregarMatriculaAlertaVO ltsama_tipoSalidaAgregarMatriculaAlertaVo = (TipoSalidaAgregarMatriculaAlertaVO) UtilidadBusCliente.crearEntradaClienteIntegracionBase(EnumServiciosWs.ALERTA_TIERRAS, EnumOperacionesWs.ALERTA_TIERRAS_AGREGAR_MATRICULA_ALERTA, lteama_tipoEntradaAgregarMatriculaAlertaVo);
		TipoSalidaAgregarMatriculaAlertaWSDTO ltsama_tipoSalidaAgregarMatriculaAlertaWsDto;
		ltsama_tipoSalidaAgregarMatriculaAlertaWsDto = AgregarMatriculaAlertaWsDtoConverter.voAWsDto(ltsama_tipoSalidaAgregarMatriculaAlertaVo);
		return ltsama_tipoSalidaAgregarMatriculaAlertaWsDto;
	}
	
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IAlertaTierrasWSBusiness#cancelarIngresoAlertaTierras(co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaCancelarIngresoAlertaTierrasWSDTO)
	 */
	@Override
	public TipoSalidaCancelarIngresoAlertaTierrasWSDTO cancelarIngresoAlertaTierras(
			TipoEntradaCancelarIngresoAlertaTierrasWSDTO ateciat_tipoEntradaCancelarIngresoAlertaTierrasWsDto) {
		
		TipoEntradaCancelarIngresoAlertaTierrasVO lteciat_tipoEntradaCancelarIngresoAlertaTierrasVo = CancelarIngresoAlertaTierrasWsDtoConverter.wsDtoAVo(ateciat_tipoEntradaCancelarIngresoAlertaTierrasWsDto);
		TipoSalidaCancelarIngresoAlertaTierrasVO ltsciat_tipoSalidaCancelarIngresoAlertaTierrasVo = (TipoSalidaCancelarIngresoAlertaTierrasVO) UtilidadBusCliente.crearEntradaClienteIntegracionBase(EnumServiciosWs.ALERTA_TIERRAS, EnumOperacionesWs.ALERTA_TIERRAS_CANCELAR_INGRESO_ALERTA_TIERRAS, lteciat_tipoEntradaCancelarIngresoAlertaTierrasVo);
		TipoSalidaCancelarIngresoAlertaTierrasWSDTO ltsciat_tipoSalidaCancelarIngresoAlertaTierrasWsDto;
		ltsciat_tipoSalidaCancelarIngresoAlertaTierrasWsDto = CancelarIngresoAlertaTierrasWsDtoConverter.voAWsDto(ltsciat_tipoSalidaCancelarIngresoAlertaTierrasVo);
		return ltsciat_tipoSalidaCancelarIngresoAlertaTierrasWsDto;
	}
	
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IAlertaTierrasWSBusiness#consultarAlertas(co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarAlertasWSDTO)
	 */
	@Override
	public TipoSalidaConsultarAlertasWSDTO consultarAlertas(
			TipoEntradaConsultarAlertasWSDTO ateca_tipoEntradaConsultarAlertasWsDto) {
		
		TipoEntradaConsultarAlertasVO lteca_tipoEntradaConsultarAlertasVo = ConsultarAlertasWsDtoConverter.wsDtoAVo(ateca_tipoEntradaConsultarAlertasWsDto);
		TipoSalidaConsultarAlertasVO ltsca_tipoSalidaConsultarAlertasVo = (TipoSalidaConsultarAlertasVO) UtilidadBusCliente.crearEntradaClienteIntegracionBase(EnumServiciosWs.ALERTA_TIERRAS, EnumOperacionesWs.ALERTA_TIERRAS_CONSULTAR_ALERTAS, lteca_tipoEntradaConsultarAlertasVo);
		TipoSalidaConsultarAlertasWSDTO ltsca_tipoSalidaConsultarAlertasWsDto;
		ltsca_tipoSalidaConsultarAlertasWsDto = ConsultarAlertasWsDtoConverter.voAWsDto(ltsca_tipoSalidaConsultarAlertasVo);
		
		UtilidadHistoricoConsulta.registrarHistorioConsulta(
				EnumOperacionesWs.ALERTA_TIERRAS_CONSULTAR_ALERTAS.getIs_nombreServicio(), 
				ateca_tipoEntradaConsultarAlertasWsDto.toString(), 
				ltsca_tipoSalidaConsultarAlertasWsDto);
		
		return ltsca_tipoSalidaConsultarAlertasWsDto;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IAlertaTierrasWSBusiness#consultarDetalleAlerta(co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarDetalleAlertaWSDTO)
	 */
	@Override
	public TipoSalidaConsultarDetalleAlertaWSDTO consultarDetalleAlerta(
			TipoEntradaConsultarDetalleAlertaWSDTO atecda_tipoEntradaConsultarDetalleAlertaWsDto) {
		
		TipoEntradaConsultarDetalleAlertaVO ltecda_tipoEntradaConsultarDetalleAlertaVo = ConsultarDetalleAlertaWsDtoConverter.wsDtoAVo(atecda_tipoEntradaConsultarDetalleAlertaWsDto);
		TipoSalidaConsultarDetalleAlertaVO ltscda_tipoSalidaConsultarDetalleAlertaVo = (TipoSalidaConsultarDetalleAlertaVO) UtilidadBusCliente.crearEntradaClienteIntegracionBase(EnumServiciosWs.ALERTA_TIERRAS, EnumOperacionesWs.ALERTA_TIERRAS_CONSULTAR_DETALLE_ALERTA, ltecda_tipoEntradaConsultarDetalleAlertaVo);
		TipoSalidaConsultarDetalleAlertaWSDTO ltscda_tipoSalidaConsultarDetalleAlertaWsDto;
		ltscda_tipoSalidaConsultarDetalleAlertaWsDto = ConsultarDetalleAlertaWsDtoConverter.voAWsDto(ltscda_tipoSalidaConsultarDetalleAlertaVo);
		
		UtilidadHistoricoConsulta.registrarHistorioConsulta(
				EnumOperacionesWs.ALERTA_TIERRAS_CONSULTAR_DETALLE_ALERTA.getIs_nombreServicio(), 
				atecda_tipoEntradaConsultarDetalleAlertaWsDto.toString(), 
				ltscda_tipoSalidaConsultarDetalleAlertaWsDto);
		
		return ltscda_tipoSalidaConsultarDetalleAlertaWsDto;
	}


	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IAlertaTierrasWSBusiness#consultarDocumentoAlerta(co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarDocumentoAlertaWSDTO)
	 */
	@Override
	public TipoSalidaConsultarDocumentoAlertaWSDTO consultarDocumentoAlerta(
			TipoEntradaConsultarDocumentoAlertaWSDTO atecda_tipoEntradaConsultarDocumentoAlertaWsDto) {
		
		TipoEntradaConsultarDocumentoAlertaVO ltecda_tipoEntradaConsultarDocumentoAlertaVo = ConsultarDocumentoAlertaWsDtoConverter.wsDtoAVo(atecda_tipoEntradaConsultarDocumentoAlertaWsDto);
		TipoSalidaConsultarDocumentoAlertaVO ltscda_tipoSalidaConsultarDocumentoAlertaVo = (TipoSalidaConsultarDocumentoAlertaVO) UtilidadBusCliente.crearEntradaClienteIntegracionBase(EnumServiciosWs.ALERTA_TIERRAS, EnumOperacionesWs.ALERTA_TIERRAS_CONSULTAR_DOCUMENTO_ALERTA, ltecda_tipoEntradaConsultarDocumentoAlertaVo);
		TipoSalidaConsultarDocumentoAlertaWSDTO ltscda_tipoSalidaConsultarDocumentoAlertaWsDto;
		ltscda_tipoSalidaConsultarDocumentoAlertaWsDto = ConsultarDocumentoAlertaWsDtoConverter.voAWsDto(ltscda_tipoSalidaConsultarDocumentoAlertaVo);
	
		UtilidadHistoricoConsulta.registrarHistorioConsulta(
				EnumOperacionesWs.ALERTA_TIERRAS_CONSULTAR_DOCUMENTO_ALERTA.getIs_nombreServicio(), 
				atecda_tipoEntradaConsultarDocumentoAlertaWsDto.toString(), 
				ltscda_tipoSalidaConsultarDocumentoAlertaWsDto);
		
		return ltscda_tipoSalidaConsultarDocumentoAlertaWsDto;
	}


	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IAlertaTierrasWSBusiness#consultarEntidadesJA(co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.EntradaConsultarEntidadesJAWSDTO)
	 */
	@Override
	public TipoSalidaConsultarEntidadesJAWSDTO consultarEntidadesJA(
			EntradaConsultarEntidadesJAWSDTO aece_entradaConsultarEntidadesJAWsDto) {
		
		EntradaConsultarEntidadesJAVO lece_entradaConsultarEntidadesJAVo = ConsultarEntidadesJAWsDtoConverter.wsDtoAVo(aece_entradaConsultarEntidadesJAWsDto);
		TipoSalidaConsultarEntidadesJAVO ltsce_tipoSalidaConsultarEntidadesJAVo = (TipoSalidaConsultarEntidadesJAVO) UtilidadBusCliente.crearEntradaClienteIntegracionBase(EnumServiciosWs.ALERTA_TIERRAS, EnumOperacionesWs.ALERTA_TIERRAS_CONSULTAR_ENTIDADES_J_A, lece_entradaConsultarEntidadesJAVo);
		TipoSalidaConsultarEntidadesJAWSDTO ltsce_tipoSalidaConsultarEntidadesJAWsDto;
		ltsce_tipoSalidaConsultarEntidadesJAWsDto = ConsultarEntidadesJAWsDtoConverter.voAWsDto(ltsce_tipoSalidaConsultarEntidadesJAVo);
		
		UtilidadHistoricoConsulta.registrarHistorioConsulta(
				EnumOperacionesWs.ALERTA_TIERRAS_CONSULTAR_ENTIDADES_J_A.getIs_nombreServicio(), 
				aece_entradaConsultarEntidadesJAWsDto.toString(), 
				ltsce_tipoSalidaConsultarEntidadesJAWsDto);
		
		return ltsce_tipoSalidaConsultarEntidadesJAWsDto;
	}


	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IAlertaTierrasWSBusiness#consultarListaMatriculas(co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarListaMatriculasWSDTO)
	 */
	@Override
	public TipoSalidaConsultarListaMatriculasWSDTO consultarListaMatriculas(
			TipoEntradaConsultarListaMatriculasWSDTO ateclm_tipoEntradaConsultarListaMatriculasWsDto) {
		
		TipoEntradaConsultarListaMatriculasVO lteclm_tipoEntradaConsultarListaMatriculasVo = ConsultarListaMatriculasWsDtoConverter.wsDtoAVo(ateclm_tipoEntradaConsultarListaMatriculasWsDto);
		TipoSalidaConsultarListaMatriculasVO ltsclm_tipoSalidaConsultarListaMatriculasVo = (TipoSalidaConsultarListaMatriculasVO) UtilidadBusCliente.crearEntradaClienteIntegracionBase(EnumServiciosWs.ALERTA_TIERRAS, EnumOperacionesWs.ALERTA_TIERRAS_CONSULTAR_LISTA_MATRICULAS, lteclm_tipoEntradaConsultarListaMatriculasVo);
		TipoSalidaConsultarListaMatriculasWSDTO ltsclm_tipoSalidaConsultarListaMatriculasWsDto;
		ltsclm_tipoSalidaConsultarListaMatriculasWsDto = ConsultarListaMatriculasWsDtoConverter.voAWsDto(ltsclm_tipoSalidaConsultarListaMatriculasVo);
	
		UtilidadHistoricoConsulta.registrarHistorioConsulta(
				EnumOperacionesWs.ALERTA_TIERRAS_CONSULTAR_LISTA_MATRICULAS.getIs_nombreServicio(), 
				ateclm_tipoEntradaConsultarListaMatriculasWsDto.toString(), 
				ltsclm_tipoSalidaConsultarListaMatriculasWsDto);
		
		
		return ltsclm_tipoSalidaConsultarListaMatriculasWsDto;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IAlertaTierrasWSBusiness#consultarMapaPredioInfoCatastral(co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarMapaPredioInfoCatastralWSDTO)
	 */
	@Override
	public TipoSalidaConsultarMapaPredioInfoCatastralWSDTO consultarMapaPredioInfoCatastral(
			TipoEntradaConsultarMapaPredioInfoCatastralWSDTO atecmpic_tipoEntradaConsultarMapaPredioInfoCatastralWsDto) {
		
		TipoEntradaConsultarMapaPredioInfoCatastralVO ltecmpic_tipoEntradaConsultarMapaPredioInfoCatastralVo = ConsultarMapaPredioInfoCatastralWsDtoConverter.wsDtoAVo(atecmpic_tipoEntradaConsultarMapaPredioInfoCatastralWsDto);
		TipoSalidaConsultarMapaPredioInfoCatastralVO ltscmpic_tipoSalidaConsultarMapaPredioInfoCatastralVo = (TipoSalidaConsultarMapaPredioInfoCatastralVO) UtilidadBusCliente.crearEntradaClienteIntegracionBase(EnumServiciosWs.ALERTA_TIERRAS, EnumOperacionesWs.ALERTA_TIERRAS_CONSULTAR_MAPA_PREDIO_INFO_CATASTRAL, ltecmpic_tipoEntradaConsultarMapaPredioInfoCatastralVo);
		TipoSalidaConsultarMapaPredioInfoCatastralWSDTO ltscmpic_tipoSalidaConsultarMapaPredioInfoCatastralWsDto;
		ltscmpic_tipoSalidaConsultarMapaPredioInfoCatastralWsDto = ConsultarMapaPredioInfoCatastralWsDtoConverter.voAWsDto(ltscmpic_tipoSalidaConsultarMapaPredioInfoCatastralVo);
		
		UtilidadHistoricoConsulta.registrarHistorioConsulta(
				EnumOperacionesWs.ALERTA_TIERRAS_CONSULTAR_MAPA_PREDIO_INFO_CATASTRAL.getIs_nombreServicio(), 
				atecmpic_tipoEntradaConsultarMapaPredioInfoCatastralWsDto.toString(), 
				ltscmpic_tipoSalidaConsultarMapaPredioInfoCatastralWsDto);
		
		return ltscmpic_tipoSalidaConsultarMapaPredioInfoCatastralWsDto;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IAlertaTierrasWSBusiness#consultarMatricula(co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarMatriculaWSDTO)
	 */
	@Override
	public TipoSalidaConsultarMatriculaWSDTO consultarMatricula(
			TipoEntradaConsultarMatriculaWSDTO atecm_tipoEntradaConsultarMatriculaWsDto) {
		
		TipoEntradaConsultarMatriculaVO ltecm_tipoEntradaConsultarMatriculaVo = ConsultarMatriculaWsDtoConverter.wsDtoAVo(atecm_tipoEntradaConsultarMatriculaWsDto);
		TipoSalidaConsultarMatriculaVO ltscm_tipoSalidaConsultarMatriculaVo = (TipoSalidaConsultarMatriculaVO) UtilidadBusCliente.crearEntradaClienteIntegracionBase(EnumServiciosWs.ALERTA_TIERRAS, EnumOperacionesWs.ALERTA_TIERRAS_CONSULTAR_MATRICULA, ltecm_tipoEntradaConsultarMatriculaVo);
		TipoSalidaConsultarMatriculaWSDTO ltscm_tipoSalidaConsultarMatriculaWsDto;
		ltscm_tipoSalidaConsultarMatriculaWsDto = ConsultarMatriculaWsDtoConverter.voAWsDto(ltscm_tipoSalidaConsultarMatriculaVo);
		
		UtilidadHistoricoConsulta.registrarHistorioConsulta(
				EnumOperacionesWs.ALERTA_TIERRAS_CONSULTAR_MATRICULA.getIs_nombreServicio(), 
				atecm_tipoEntradaConsultarMatriculaWsDto.toString(), 
				ltscm_tipoSalidaConsultarMatriculaWsDto);
		
		return ltscm_tipoSalidaConsultarMatriculaWsDto;
	}
	
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IAlertaTierrasWSBusiness#consultarMatriculaAlerta(co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarMatriculaAlertaWSDTO)
	 */
	@Override
	public TipoSalidaConsultarMatriculaAlertaWSDTO consultarMatriculaAlerta(
			TipoEntradaConsultarMatriculaAlertaWSDTO atecma_tipoEntradaConsultarMatriculaAlertaWsDto) {
		
		TipoEntradaConsultarMatriculaAlertaVO ltecma_tipoEntradaConsultarMatriculaAlertaVo = ConsultarMatriculaAlertaWsDtoConverter.wsDtoAVo(atecma_tipoEntradaConsultarMatriculaAlertaWsDto);
		TipoSalidaConsultarMatriculaAlertaVO ltscma_tipoSalidaConsultarMatriculaAlertaVo = (TipoSalidaConsultarMatriculaAlertaVO) UtilidadBusCliente.crearEntradaClienteIntegracionBase(EnumServiciosWs.ALERTA_TIERRAS, EnumOperacionesWs.ALERTA_TIERRAS_CONSULTAR_MATRICULA_ALERTA, ltecma_tipoEntradaConsultarMatriculaAlertaVo);
		TipoSalidaConsultarMatriculaAlertaWSDTO ltscma_tipoSalidaConsultarMatriculaAlertaWsDto;
		ltscma_tipoSalidaConsultarMatriculaAlertaWsDto = ConsultarMatriculaAlertaWsDtoConverter.voAWsDto(ltscma_tipoSalidaConsultarMatriculaAlertaVo);
		
		UtilidadHistoricoConsulta.registrarHistorioConsulta(
				EnumOperacionesWs.ALERTA_TIERRAS_CONSULTAR_MATRICULA_ALERTA.getIs_nombreServicio(), 
				atecma_tipoEntradaConsultarMatriculaAlertaWsDto.toString(), 
				ltscma_tipoSalidaConsultarMatriculaAlertaWsDto);
		
		return ltscma_tipoSalidaConsultarMatriculaAlertaWsDto;
	}


	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IAlertaTierrasWSBusiness#consultarMatriculaFiltrosTierras(co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarMatriculaFiltrosTierrasWSDTO)
	 */
	@Override
	public TipoSalidaConsultarMatriculaFiltrosTierrasWSDTO consultarMatriculaFiltrosTierras(
			TipoEntradaConsultarMatriculaFiltrosTierrasWSDTO atecmft_tipoEntradaConsultarMatriculaFiltrosTierrasWsDto) {
		
		TipoEntradaConsultarMatriculaFiltrosTierrasVO ltecmft_tipoEntradaConsultarMatriculaFiltrosTierrasVo = ConsultarMatriculaFiltrosTierrasWsDtoConverter.wsDtoAVo(atecmft_tipoEntradaConsultarMatriculaFiltrosTierrasWsDto);
		TipoSalidaConsultarMatriculaFiltrosTierrasVO ltscmft_tipoSalidaConsultarMatriculaFiltrosTierrasVo = (TipoSalidaConsultarMatriculaFiltrosTierrasVO) UtilidadBusCliente.crearEntradaClienteIntegracionBase(EnumServiciosWs.ALERTA_TIERRAS, EnumOperacionesWs.ALERTA_TIERRAS_CONSULTAR_MATRICULA_FILTROS_TIERRAS, ltecmft_tipoEntradaConsultarMatriculaFiltrosTierrasVo);
		TipoSalidaConsultarMatriculaFiltrosTierrasWSDTO ltscmft_tipoSalidaConsultarMatriculaFiltrosTierrasWsDto;
		ltscmft_tipoSalidaConsultarMatriculaFiltrosTierrasWsDto = ConsultarMatriculaFiltrosTierrasWsDtoConverter.voAWsDto(ltscmft_tipoSalidaConsultarMatriculaFiltrosTierrasVo);
		
		UtilidadHistoricoConsulta.registrarHistorioConsulta(
				EnumOperacionesWs.ALERTA_TIERRAS_CONSULTAR_MATRICULA_FILTROS_TIERRAS.getIs_nombreServicio(), 
				atecmft_tipoEntradaConsultarMatriculaFiltrosTierrasWsDto.toString(), 
				ltscmft_tipoSalidaConsultarMatriculaFiltrosTierrasWsDto);
		
		
		return ltscmft_tipoSalidaConsultarMatriculaFiltrosTierrasWsDto;
	}
	
	
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IAlertaTierrasWSBusiness#consultarMatriculaInfoCatastral(co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarMatriculaInfoCatastralWSDTO)
	 */
	@Override
	public TipoSalidaConsultarMatriculaInfoCatastralWSDTO consultarMatriculaInfoCatastral(
			TipoEntradaConsultarMatriculaInfoCatastralWSDTO atecmic_tipoEntradaConsultarMatriculaInfoCatastralWsDto) {
		
		TipoEntradaConsultarMatriculaInfoCatastralVO ltecmic_tipoEntradaConsultarMatriculaInfoCatastralVo = ConsultarMatriculaInfoCatastralWsDtoConverter.wsDtoAVo(atecmic_tipoEntradaConsultarMatriculaInfoCatastralWsDto);
		TipoSalidaConsultarMatriculaInfoCatastralVO ltscmic_tipoSalidaConsultarMatriculaInfoCatastralVo = (TipoSalidaConsultarMatriculaInfoCatastralVO) UtilidadBusCliente.crearEntradaClienteIntegracionBase(EnumServiciosWs.ALERTA_TIERRAS, EnumOperacionesWs.ALERTA_TIERRAS_CONSULTAR_MATRICULA_INFO_CATASTRAL, ltecmic_tipoEntradaConsultarMatriculaInfoCatastralVo);
		TipoSalidaConsultarMatriculaInfoCatastralWSDTO ltscmi_tipoSalidaConsultarMatriculaInfoCatastralWsDto;
		ltscmi_tipoSalidaConsultarMatriculaInfoCatastralWsDto = ConsultarMatriculaInfoCatastralWsDtoConverter.voAWsDto(ltscmic_tipoSalidaConsultarMatriculaInfoCatastralVo);
		
		UtilidadHistoricoConsulta.registrarHistorioConsulta(
				EnumOperacionesWs.ALERTA_TIERRAS_CONSULTAR_MATRICULA_INFO_CATASTRAL.getIs_nombreServicio(), 
				atecmic_tipoEntradaConsultarMatriculaInfoCatastralWsDto.toString(), 
				ltscmi_tipoSalidaConsultarMatriculaInfoCatastralWsDto);
		
		return ltscmi_tipoSalidaConsultarMatriculaInfoCatastralWsDto;
	}


	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IAlertaTierrasWSBusiness#consultarOficinasOrigenTipo(co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarOficinasOrigenTipoWSDTO)
	 */
	@Override
	public TipoSalidaConsultarOficinasOrigenTipoWSDTO consultarOficinasOrigenTipo(
			TipoEntradaConsultarOficinasOrigenTipoWSDTO atecoot_tipoEntradaConsultarOficinasOrigenTipoWsDto) {
		
		TipoEntradaConsultarOficinasOrigenTipoVO ltecoot_tipoEntradaConsultarOficinasOrigenTipoVo = ConsultarOficinasOrigenTipoWsDtoConverter.wsDtoAVo(atecoot_tipoEntradaConsultarOficinasOrigenTipoWsDto);
		TipoSalidaConsultarOficinasOrigenTipoVO ltscoot_tipoSalidaConsultarOficinasOrigenTipoVo = (TipoSalidaConsultarOficinasOrigenTipoVO) UtilidadBusCliente.crearEntradaClienteIntegracionBase(EnumServiciosWs.ALERTA_TIERRAS, EnumOperacionesWs.ALERTA_TIERRAS_CONSULTAR_OFICINAS_ORIGEN_TIPO, ltecoot_tipoEntradaConsultarOficinasOrigenTipoVo);
		TipoSalidaConsultarOficinasOrigenTipoWSDTO ltscoot_tipoSalidaConsultarOficinasOrigenTipoWsDto;
		ltscoot_tipoSalidaConsultarOficinasOrigenTipoWsDto = ConsultarOficinasOrigenTipoWsDtoConverter.voAWsDto(ltscoot_tipoSalidaConsultarOficinasOrigenTipoVo);
		
		UtilidadHistoricoConsulta.registrarHistorioConsulta(
				EnumOperacionesWs.ALERTA_TIERRAS_CONSULTAR_OFICINAS_ORIGEN_TIPO.getIs_nombreServicio(), 
				atecoot_tipoEntradaConsultarOficinasOrigenTipoWsDto.toString(), 
				ltscoot_tipoSalidaConsultarOficinasOrigenTipoWsDto);
		
		return ltscoot_tipoSalidaConsultarOficinasOrigenTipoWsDto;
	}
	
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IAlertaTierrasWSBusiness#crearProcAntiguoSistemaTierras(co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaCrearProcAntiguoSistemaTierrasWSDTO)
	 */
	@Override
	public TipoSalidaCrearProcAntiguoSistemaTierrasWSDTO crearProcAntiguoSistemaTierras(
			TipoEntradaCrearProcAntiguoSistemaTierrasWSDTO atecpast_tipoEntradaCrearProcAntiguoSistemaTierrasWsDto) {
		
		TipoEntradaCrearProcAntiguoSistemaTierrasVO ltecpast_tipoEntradaCrearProcAntiguoSistemaTierrasVo = CrearProcAntiguoSistemaTierrasWsDtoConverter.wsDtoAvo(atecpast_tipoEntradaCrearProcAntiguoSistemaTierrasWsDto);
		TipoSalidaCrearProcAntiguoSistemaTierrasVO ltscpast_tipoSalidaCrearProcAntiguoSistemaTierrasVo = (TipoSalidaCrearProcAntiguoSistemaTierrasVO) UtilidadBusCliente.crearEntradaClienteIntegracionBase(EnumServiciosWs.ALERTA_TIERRAS, EnumOperacionesWs.ALERTA_TIERRAS_CREAR_PROC_ANTIGUO_SISTEMA_TIERRAS, ltecpast_tipoEntradaCrearProcAntiguoSistemaTierrasVo);
		TipoSalidaCrearProcAntiguoSistemaTierrasWSDTO ltscpast_tipoSalidaCrearProcAntiguoSistemaTierrasWsDto;
		ltscpast_tipoSalidaCrearProcAntiguoSistemaTierrasWsDto = CrearProcAntiguoSistemaTierrasWsDtoConverter.voAWsDto(ltscpast_tipoSalidaCrearProcAntiguoSistemaTierrasVo);
		return ltscpast_tipoSalidaCrearProcAntiguoSistemaTierrasWsDto;
	}
	
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IAlertaTierrasWSBusiness#eliminarProcAntiguoSistema(co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaEliminarProcAntiguoSistemaWSDTO)
	 */
	@Override
	public TipoSalidaEliminarProcAntiguoSistemaWSDTO eliminarProcAntiguoSistema(
			TipoEntradaEliminarProcAntiguoSistemaWSDTO ateepas_tipoEntradaEliminarProcAntiguoSistemaWsDto) {
		
		TipoEntradaEliminarProcAntiguoSistemaVO lteepas_tipoEntradaEliminarProcAntiguoSistemaVo = EliminarProcAntiguoSistemaWsDtoConverter.wsDtoAVo(ateepas_tipoEntradaEliminarProcAntiguoSistemaWsDto);
		TipoSalidaEliminarProcAntiguoSistemaVO ltsepas_tipoEntradaEliminarProcAntiguoSistemaVo = (TipoSalidaEliminarProcAntiguoSistemaVO) UtilidadBusCliente.crearEntradaClienteIntegracionBase(EnumServiciosWs.ALERTA_TIERRAS, EnumOperacionesWs.ALERTA_TIERRAS_ELIMINAR_PROC_ANTIGUO_SISTEMA, lteepas_tipoEntradaEliminarProcAntiguoSistemaVo);
		TipoSalidaEliminarProcAntiguoSistemaWSDTO ltsepas_tipoSalidaEliminarProcAntiguoSistemaWsDto;
		ltsepas_tipoSalidaEliminarProcAntiguoSistemaWsDto = EliminarProcAntiguoSistemaWsDtoConverter.voAWsDto(ltsepas_tipoEntradaEliminarProcAntiguoSistemaVo);
		return ltsepas_tipoSalidaEliminarProcAntiguoSistemaWsDto;
	}
	
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IAlertaTierrasWSBusiness#inactivarAlerta(co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaInactivarAlertaTierrasWSDTO)
	 */
	@Override
	public TipoSalidaInactivarAlertaWSDTO inactivarAlerta(
			TipoEntradaInactivarAlertaTierrasWSDTO ateia_tipoEntradaInactivarAlertaWsDto) {
		
		TipoEntradaInactivarAlertaVO lteia_tipoEntradaInactivarAlertaVo = InactivarAlertaTierrasWsDtoConverter.wsDtoAVo(ateia_tipoEntradaInactivarAlertaWsDto);
		TipoSalidaInactivarAlertaVO ltsia_tipoSalidaInactivarAlertaVo = (TipoSalidaInactivarAlertaVO) UtilidadBusCliente.crearEntradaClienteIntegracionBase(EnumServiciosWs.ALERTA_TIERRAS, EnumOperacionesWs.ALERTA_TIERRAS_INACTIVAR_ALERTA, lteia_tipoEntradaInactivarAlertaVo);
		TipoSalidaInactivarAlertaWSDTO ltsia_tipoSalidaInactivarAlertaWsDto;
		ltsia_tipoSalidaInactivarAlertaWsDto = InactivarAlertaTierrasWsDtoConverter.voAWsDto(ltsia_tipoSalidaInactivarAlertaVo);
		return ltsia_tipoSalidaInactivarAlertaWsDto;
	}
	
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IAlertaTierrasWSBusiness#inscribirAlertaCabecera(co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaInscribirAlertaCabeceraWSDTO)
	 */
	@Override
	public TipoSalidaInscribirAlertaCabeceraWSDTO inscribirAlertaCabecera(
			TipoEntradaInscribirAlertaCabeceraWSDTO ateiac_tipoEntradaInscribirAlertaCabeceraWsDto) {
		
		TipoEntradaInscribirAlertaCabeceraVO lteiac_tipoEntradaInscribirAlertaCabeceraVo = InscribirAlertaCabeceraWsDtoConverter.wsDtoAVo(ateiac_tipoEntradaInscribirAlertaCabeceraWsDto);
		TipoSalidaInscribirAlertaCabeceraVO ltsiac_tipoEntradaInscribirAlertaCabeceraVo = (TipoSalidaInscribirAlertaCabeceraVO) UtilidadBusCliente.crearEntradaClienteIntegracionBase(EnumServiciosWs.ALERTA_TIERRAS, EnumOperacionesWs.ALERTA_TIERRAS_INSCRIBIR_ALERTA_CABECERA, lteiac_tipoEntradaInscribirAlertaCabeceraVo);
		TipoSalidaInscribirAlertaCabeceraWSDTO ltsiac_tipoSalidaInscribirAlertaCabeceraWsDto;
		ltsiac_tipoSalidaInscribirAlertaCabeceraWsDto = InscribirAlertaCabeceraWsDtoConverter.voAWsDto(ltsiac_tipoEntradaInscribirAlertaCabeceraVo);
		return ltsiac_tipoSalidaInscribirAlertaCabeceraWsDto;
	}
	
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IAlertaTierrasWSBusiness#listarProcAntiguoSistema(co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaListarProcAntiguoSistemaWSDTO)
	 */
	@Override
	public TipoSalidaListarProcAntiguoSistemaWSDTO listarProcAntiguoSistema(
			TipoEntradaListarProcAntiguoSistemaWSDTO atelpas_tipoEntradaListarProcAntiguoSistemaWsDto) {
		
		TipoEntradaListarProcAntiguoSistemaVO ltelpas_tipoEntradaListarProcAntiguoSistemaVo = ListarProcAntiguoSistemaWsDtoConverter.wsDtoAVo(atelpas_tipoEntradaListarProcAntiguoSistemaWsDto);
		TipoSalidaListarProcAntiguoSistemaVO ltslpas_tipoEntradaListarProcAntiguoSistemaVo = (TipoSalidaListarProcAntiguoSistemaVO) UtilidadBusCliente.crearEntradaClienteIntegracionBase(EnumServiciosWs.ALERTA_TIERRAS, EnumOperacionesWs.ALERTA_TIERRAS_LISTAR_PROC_ANTIGUO_SISTEMA, ltelpas_tipoEntradaListarProcAntiguoSistemaVo);
		TipoSalidaListarProcAntiguoSistemaWSDTO ltslpas_tipoSalidaListarProcAntiguoSistemaWsDto;
		ltslpas_tipoSalidaListarProcAntiguoSistemaWsDto = ListarProcAntiguoSistemaWsDtoConverter.voAWsDto(ltslpas_tipoEntradaListarProcAntiguoSistemaVo);
		
		UtilidadHistoricoConsulta.registrarHistorioConsulta(
				EnumOperacionesWs.ALERTA_TIERRAS_LISTAR_PROC_ANTIGUO_SISTEMA.getIs_nombreServicio(), 
				atelpas_tipoEntradaListarProcAntiguoSistemaWsDto.toString(), 
				ltslpas_tipoSalidaListarProcAntiguoSistemaWsDto);
		
		return ltslpas_tipoSalidaListarProcAntiguoSistemaWsDto;
	}
	
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IAlertaTierrasWSBusiness#rechazarCorreccionAlerta(co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaRechazarCorreccionAlertaWSDTO)
	 */
	@Override
	public TipoSalidaRechazarCorreccionAlertaWSDTO rechazarCorreccionAlerta(
			TipoEntradaRechazarCorreccionAlertaWSDTO aterca_tipoEntradaRechazarCorreccionAlertaWsDto) {
		
		TipoEntradaRechazarCorreccionAlertaVO lterca_tipoEntradaRechazarCorreccionAlertaVo = RechazarCorreccionAlertaWsDtoConverter.wsDtoAVo(aterca_tipoEntradaRechazarCorreccionAlertaWsDto);
		TipoSalidaRechazarCorreccionAlertaVO ltsrca_tipoSalidaRechazarCorreccionAlertaVo = (TipoSalidaRechazarCorreccionAlertaVO) UtilidadBusCliente.crearEntradaClienteIntegracionBase(EnumServiciosWs.ALERTA_TIERRAS, EnumOperacionesWs.ALERTA_TIERRAS_RECHAZAR_CORRECCION_ALERTA, lterca_tipoEntradaRechazarCorreccionAlertaVo);
		TipoSalidaRechazarCorreccionAlertaWSDTO ltsrca_tipoSalidaRechazarCorreccionAlertaWsDto;
		ltsrca_tipoSalidaRechazarCorreccionAlertaWsDto = RechazarCorreccionAlertaWsDtoConverter.voAWsDto(ltsrca_tipoSalidaRechazarCorreccionAlertaVo);
		return ltsrca_tipoSalidaRechazarCorreccionAlertaWsDto;
	}
	
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IAlertaTierrasWSBusiness#removerMatriculaAlerta(co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaRemoverMatriculaAlertaWSDTO)
	 */
	@Override
	public TipoSalidaRemoverMatriculaAlertaWSDTO removerMatriculaAlerta(
			TipoEntradaRemoverMatriculaAlertaWSDTO aterma_tipoEntradaRemoverMatriculaAlertaWsDto) {
		
		TipoEntradaRemoverMatriculaAlertaVO lterma_tipoEntradaRemoverMatriculaAlertaVo = RemoverMatriculaAlertaWsDtoConverter.wsDtoAVo(aterma_tipoEntradaRemoverMatriculaAlertaWsDto);
		TipoSalidaRemoverMatriculaAlertaVO ltsrma_tipoSalidaRemoverMatriculaAlertaVo = (TipoSalidaRemoverMatriculaAlertaVO) UtilidadBusCliente.crearEntradaClienteIntegracionBase(EnumServiciosWs.ALERTA_TIERRAS, EnumOperacionesWs.ALERTA_TIERRAS_REMOVER_MATRICULA_ALERTA, lterma_tipoEntradaRemoverMatriculaAlertaVo);
		TipoSalidaRemoverMatriculaAlertaWSDTO ltsrma_tipoSalidaRemoverMatriculaAlertaWsDto;
		ltsrma_tipoSalidaRemoverMatriculaAlertaWsDto = RemoverMatriculaAlertaWsDtoConverter.voAWsDto(ltsrma_tipoSalidaRemoverMatriculaAlertaVo);
		return ltsrma_tipoSalidaRemoverMatriculaAlertaWsDto;
	}
	
}

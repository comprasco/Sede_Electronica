/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: EstadoJuridicoFolio.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.impl
 * Nombre del elemento: EstadoJuridicoFolio
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.impl;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import co.gov.supernotariado.bachue.clientebus.vo.estadojuridicofolio.TipoEntradaConsultaJuridicaFolioVO;
import co.gov.supernotariado.bachue.clientebus.vo.estadojuridicofolio.TipoSalidaConsultaEstadoJuridicoFolioVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters.ConsultarEstadoJuridicoWsDtoConverter;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IEstadoJuridicoFolio;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultaJuridicaFolioWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultaEstadoJuridicoFolioWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumOperacionesWs;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumServiciosWs;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadBusCliente;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadHistoricoConsulta;

/**
 * El elemento Class EstadoJuridicoFolio.<br>
 * Representa un/una estado juridico folio.<br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless(name = "EstadoJuridicoFolio", mappedName = "EstadoJuridicoFolio")
@LocalBean
public class EstadoJuridicoFolio implements IEstadoJuridicoFolio{

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IEstadoJuridicoFolio#consultarEstadoJuridicoFolio(co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultaJuridicaFolioWSDTO)
	 */
	@Override
	public TipoSalidaConsultaEstadoJuridicoFolioWSDTO consultarEstadoJuridicoFolio(
			TipoEntradaConsultaJuridicaFolioWSDTO atecjf_tipoEntradaConsultaJuridicaFolioWsDto) {
		TipoEntradaConsultaJuridicaFolioVO ltecjf_tipoEntradaConsultaJuridicaFolioVo = ConsultarEstadoJuridicoWsDtoConverter.dtoAVo(atecjf_tipoEntradaConsultaJuridicaFolioWsDto);
		TipoSalidaConsultaEstadoJuridicoFolioVO ltscejf_tipoSalidaConsultaEstadoJuridicaFolicoVo = (TipoSalidaConsultaEstadoJuridicoFolioVO) UtilidadBusCliente.crearEntradaClienteIntegracionBase(EnumServiciosWs.CONSULTA_ESTADO_JURIDICO_FOLIO,EnumOperacionesWs.ESTADO_JURIDICO_FOLIO,ltecjf_tipoEntradaConsultaJuridicaFolioVo);
		TipoSalidaConsultaEstadoJuridicoFolioWSDTO ltscejf_tipoSalidaConsultaEstadoJuridicaFolicoWsDto;
		ltscejf_tipoSalidaConsultaEstadoJuridicaFolicoWsDto = ConsultarEstadoJuridicoWsDtoConverter.voADto(ltscejf_tipoSalidaConsultaEstadoJuridicaFolicoVo);
		//Sedeja esta linea por que el servicio no devulve codigos de error o exitoso
		UtilidadHistoricoConsulta.registrarHistorioConsulta(
				EnumOperacionesWs.CONSULTA_DATOS_BASICOS_MATRICULA.getIs_nombreServicio(), 
				ltscejf_tipoSalidaConsultaEstadoJuridicaFolicoWsDto.toString(), 
				ltscejf_tipoSalidaConsultaEstadoJuridicaFolicoWsDto);
		//TODO Revisar porque estan llegando datos pero NO codigo de mensaje
		//UtilidadExcepciones.manejadorExcepcionesServicios(ltscejf_tipoSalidaConsultaEstadoJuridicaFolicoWsDto);
		return ltscejf_tipoSalidaConsultaEstadoJuridicaFolicoWsDto;
	}
}

/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: BusquedaDocumentosBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.impl
 * Nombre del elemento: BusquedaDocumentosBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.impl;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import co.gov.supernotariado.bachue.clientebus.vo.busquedadocumentos.TipoEntradaConsultarVO;
import co.gov.supernotariado.bachue.clientebus.vo.busquedadocumentos.TipoEntradaObtenerArchivoVO;
import co.gov.supernotariado.bachue.clientebus.vo.busquedadocumentos.TipoSalidaConsultarVO;
import co.gov.supernotariado.bachue.clientebus.vo.busquedadocumentos.TipoSalidaObtenerArchivoVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters.BusquedaDocumentosConsultarWsDtoConverter;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters.ObtenerArchivoWsDtoConverter;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IBusquedaDocumentosBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaObtenerArchivoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaObtenerArchivoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumOperacionesWs;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumServiciosWs;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadBusCliente;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadHistoricoConsulta;

/**
 * Clase tipo EJB (Enterprise Java Bean) de la capa de negocio. <br>
 * Contiene la implementacion logica para consumir operaciones del servicio
 * Busqueda documentos. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless(name = "BusquedaDocumentosBusiness", mappedName = "BusquedaDocumentosBusiness")
@LocalBean
public class BusquedaDocumentosBusiness implements IBusquedaDocumentosBusiness{

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IBusquedaDocumentosBusiness#consultar(co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarWSDTO)
	 */
	@Override
	public TipoSalidaConsultarWSDTO consultar(TipoEntradaConsultarWSDTO atec_tipoEntradaConsultarWsDto) {
		TipoEntradaConsultarVO ltec_tipoEntradaConsultarVo = BusquedaDocumentosConsultarWsDtoConverter.wsDtoAVo(atec_tipoEntradaConsultarWsDto);
		TipoSalidaConsultarVO ltsc_tipoSalidaConsultarVo = (TipoSalidaConsultarVO) UtilidadBusCliente.crearEntradaClienteIntegracionBase(EnumServiciosWs.BUSQUEDA_DOCUMENTOS, EnumOperacionesWs.BUSQUEDA_DOCUMENTOS_CONSULTAR, ltec_tipoEntradaConsultarVo);
		TipoSalidaConsultarWSDTO ltsc_tipoSalidaWSDTO = BusquedaDocumentosConsultarWsDtoConverter.voAWsDto(ltsc_tipoSalidaConsultarVo);

		UtilidadHistoricoConsulta.registrarHistorioConsulta(
				EnumOperacionesWs.BUSQUEDA_DOCUMENTOS_CONSULTAR.getIs_nombreServicio(), 
				atec_tipoEntradaConsultarWsDto.toString(), 
				ltsc_tipoSalidaWSDTO);

		return ltsc_tipoSalidaWSDTO;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IBusquedaDocumentosBusiness#obtenerArchivo(co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaObtenerArchivoWSDTO)
	 */
	@Override
	public TipoSalidaObtenerArchivoWSDTO obtenerArchivo(
			TipoEntradaObtenerArchivoWSDTO ateoa_tipoEntradaObtenerArchivoWsDto) {
		TipoEntradaObtenerArchivoVO lteoa_tipoEntradaObtenerArchivoVo = ObtenerArchivoWsDtoConverter.wsdtoAVo(ateoa_tipoEntradaObtenerArchivoWsDto);
		TipoSalidaObtenerArchivoVO ltsoa_tipoSalidaObtenerArchivoVo = (TipoSalidaObtenerArchivoVO) UtilidadBusCliente.crearEntradaClienteIntegracionBase(EnumServiciosWs.BUSQUEDA_DOCUMENTOS, EnumOperacionesWs.BUSQUEDA_DOCUMENTOS_OBTENER_ARCHIVO, lteoa_tipoEntradaObtenerArchivoVo);
		TipoSalidaObtenerArchivoWSDTO ltsoa_tipoSalidaObtenerArchivoWSDTO =ObtenerArchivoWsDtoConverter.voAWsDto(ltsoa_tipoSalidaObtenerArchivoVo);

		UtilidadHistoricoConsulta.registrarHistorioConsulta(
				EnumOperacionesWs.BUSQUEDA_DOCUMENTOS_CONSULTAR.getIs_nombreServicio(), 
				ateoa_tipoEntradaObtenerArchivoWsDto.toString(), 
				ltsoa_tipoSalidaObtenerArchivoWSDTO);

		return ltsoa_tipoSalidaObtenerArchivoWSDTO;
	}

}

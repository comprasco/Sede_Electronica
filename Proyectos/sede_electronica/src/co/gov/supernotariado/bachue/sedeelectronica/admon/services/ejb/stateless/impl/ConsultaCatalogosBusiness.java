/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ConsultaCatalogosBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.impl
 * Nombre del elemento: ConsultaCatalogosBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.impl;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import co.gov.supernotariado.bachue.clientebus.vo.consultacatalogos.TipoEntradaConsultarCatalogosVO;
import co.gov.supernotariado.bachue.clientebus.vo.consultacatalogos.TipoSalidaConsultarCatalogosVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters.ConsultarCatalogosWsDtoConverter;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IConsultaCatalogosBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarCatalogosWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarCatalogosWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumOperacionesWs;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumServiciosWs;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadBusCliente;

/**
 * Clase tipo EJB (Enterprise Java Bean) de la capa de negocio. <br>
 * Contiene la implementacion logica para consumir operaciones del servicio
 * Consulta catalogos. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless(name = "ConsultaCatalogosBusiness", mappedName = "ConsultaCatalogosBusiness")
@LocalBean
public class ConsultaCatalogosBusiness implements IConsultaCatalogosBusiness{

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IConsultaCatalogosBusiness#consultarCatalogos(co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarCatalogosWSDTO)
	 */
	@Override
	public TipoSalidaConsultarCatalogosWSDTO consultarCatalogos(
			TipoEntradaConsultarCatalogosWSDTO atecc_tipoEntradaConsultarCatalogosWsDto) {
		TipoEntradaConsultarCatalogosVO ltecc_tipoEntradaConsultaCatalogosVo = ConsultarCatalogosWsDtoConverter.voAEntidad(atecc_tipoEntradaConsultarCatalogosWsDto);
		TipoSalidaConsultarCatalogosVO ltscc_tipoSalidaConsultaCatalogosVo = (TipoSalidaConsultarCatalogosVO) UtilidadBusCliente.crearEntradaClienteIntegracionBase(EnumServiciosWs.CONSULTA_CATALOGOS, EnumOperacionesWs.CONSULTA_CATALOGOS_CONSULTAR, ltecc_tipoEntradaConsultaCatalogosVo);
		TipoSalidaConsultarCatalogosWSDTO ltscc_tipoSalidaConsultaCatalogosWsDto;
		ltscc_tipoSalidaConsultaCatalogosWsDto = ConsultarCatalogosWsDtoConverter.entidadAVo(ltscc_tipoSalidaConsultaCatalogosVo);
		return ltscc_tipoSalidaConsultaCatalogosWsDto;
	}

}

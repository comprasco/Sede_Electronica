/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: HistorialNotificacionesWSBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.impl
 * Nombre del elemento: HistorialNotificacionesWSBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.impl;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import co.gov.supernotariado.bachue.clientebus.vo.historialnotificaciones.TipoEntradaConsultarHistorialVO;
import co.gov.supernotariado.bachue.clientebus.vo.historialnotificaciones.TipoSalidaConsultarHistorialVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters.ConsultarHistorialWsDtoConverter;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IHistorialNotificacionesWSBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarHistorialWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarHistorialWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumOperacionesWs;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumServiciosWs;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadBusCliente;

/**
 * Clase tipo EJB (Enterprise Java Bean) de la capa de negocio. <br>
 * Contiene la implementacion logica para consumir operaciones del servicio
 * Historial notificaciones WS. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless(name = "HistorialNotificacionesWSBusiness", mappedName = "HistorialNotificacionesWSBusiness")
@LocalBean
public class HistorialNotificacionesWSBusiness implements IHistorialNotificacionesWSBusiness{

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IHistorialNotificacionesWSBusiness#activarAlertaTierras(co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaActivarAlertaTierrasWSDTO)
	 */
	@Override
	public TipoSalidaConsultarHistorialWSDTO consultarHistorial(
			TipoEntradaConsultarHistorialWSDTO atech_tipoEntradaConsultarHistorialWsDto) {
		
		TipoEntradaConsultarHistorialVO ltech_tipoEntradaConsultarHistorialVo = ConsultarHistorialWsDtoConverter.wsDtoAVo(atech_tipoEntradaConsultarHistorialWsDto);
		TipoSalidaConsultarHistorialVO ltsch_tipoSalidaConsultarHistorialVo = (TipoSalidaConsultarHistorialVO) UtilidadBusCliente.crearEntradaClienteIntegracionBase(EnumServiciosWs.HISTORIAL_NOTIFICACIONES, EnumOperacionesWs.HISTORIAL_NOTIFICACIONES_CONSULTAR_HISTORIAL, ltech_tipoEntradaConsultarHistorialVo);
		TipoSalidaConsultarHistorialWSDTO ltsch_tipoSalidaConsultarHistorialWsDto;
		ltsch_tipoSalidaConsultarHistorialWsDto = ConsultarHistorialWsDtoConverter.voAWsDto(ltsch_tipoSalidaConsultarHistorialVo);
		return ltsch_tipoSalidaConsultarHistorialWsDto;
	}

}

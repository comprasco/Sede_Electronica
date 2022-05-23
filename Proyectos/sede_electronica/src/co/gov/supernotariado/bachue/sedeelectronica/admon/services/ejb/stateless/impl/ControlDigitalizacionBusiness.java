/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ControlDigitalizacionBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.impl
 * Nombre del elemento: ControlDigitalizacionBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.impl;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import co.gov.supernotariado.bachue.clientebus.vo.controldigitalizacion.TipoEntradaNotificarDigitalizacionVO;
import co.gov.supernotariado.bachue.clientebus.vo.controldigitalizacion.TipoSalidaNotificarDigitalizacionVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters.NotificarDigitalizacionWsDtoConverter;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IControlDigitalizacionBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaNotificarDigitalizacionWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaNotificarDigitalizacionWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumOperacionesWs;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumServiciosWs;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadBusCliente;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadExcepciones;

/**
 * Clase tipo EJB (Enterprise Java Bean) de la capa de negocio. <br>
 * Contiene la implementacion logica para consumir operaciones del servicio
 * Control digitalizacion. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */

@Stateless(name = "ControlDigitalizacionBusiness", mappedName = "ControlDigitalizacionBusiness")
@LocalBean
public class ControlDigitalizacionBusiness implements IControlDigitalizacionBusiness
{

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IControlDigitalizacionBusiness#notificarDigitalizacion(co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaNotificarDigitalizacionWSDTO)
	 */
	@Override
	public TipoSalidaNotificarDigitalizacionWSDTO notificarDigitalizacion(TipoEntradaNotificarDigitalizacionWSDTO atend_tipoEntradaNotificarDigitalizacionWsDto) 
	{
		TipoEntradaNotificarDigitalizacionVO ltend_tipoEntradaNotificarDigitalizacionVo = NotificarDigitalizacionWsDtoConverter.dtoAVo(atend_tipoEntradaNotificarDigitalizacionWsDto);
		TipoSalidaNotificarDigitalizacionVO ltsnd_tipoSalidaNotificarDigitalizacionVo = (TipoSalidaNotificarDigitalizacionVO) UtilidadBusCliente.crearEntradaClienteIntegracionBase(EnumServiciosWs.CONTROL_DIGITALIZACION,EnumOperacionesWs.CONTROL_DIGITALIZACION_NOTIFICAR_DIGITALIZACION,ltend_tipoEntradaNotificarDigitalizacionVo);
		TipoSalidaNotificarDigitalizacionWSDTO ltsnd_tipoSalidaNotificarDigitalizacionWsDto;
		ltsnd_tipoSalidaNotificarDigitalizacionWsDto = NotificarDigitalizacionWsDtoConverter.voADto(ltsnd_tipoSalidaNotificarDigitalizacionVo);
		UtilidadExcepciones.manejadorExcepcionesServicios(ltsnd_tipoSalidaNotificarDigitalizacionWsDto);
		return ltsnd_tipoSalidaNotificarDigitalizacionWsDto;
	}
}
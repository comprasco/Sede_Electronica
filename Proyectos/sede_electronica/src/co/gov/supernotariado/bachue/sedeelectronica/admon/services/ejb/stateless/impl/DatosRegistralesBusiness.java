/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: DatosRegistralesBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.impl
 * Nombre del elemento: DatosRegistralesBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.impl;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import co.gov.supernotariado.bachue.clientebus.vo.consultardatosregistrales.TipoEntradaConsultarDatosRegistralesVO;
import co.gov.supernotariado.bachue.clientebus.vo.consultardatosregistrales.TipoSalidaConsultarDatosRegistralesVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters.DatosRegistralesWsDtoConverter;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IDatosRegistralesBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarDatosRegistralesWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarDatosRegistralesWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumOperacionesWs;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumServiciosWs;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadBusCliente;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadExcepciones;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadHistoricoConsulta;

/**
 * Clase tipo EJB (Enterprise Java Bean) de la capa de negocio. <br>
 * Contiene la implementacion logica para consumir operaciones del servicio
 * Datos registrales. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless(name = "DatosRegistralesBusiness", mappedName = "DatosRegistralesBusiness")
@LocalBean
public class DatosRegistralesBusiness implements IDatosRegistralesBusiness{

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IDatosRegistralesBusiness#consultarDatosRegistrales(co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarDatosRegistralesWSDTO)
	 */
	@Override
	public TipoSalidaConsultarDatosRegistralesWSDTO consultarDatosRegistrales(TipoEntradaConsultarDatosRegistralesWSDTO atecdr_datosRegistralesEntrada) {	
		TipoEntradaConsultarDatosRegistralesVO ltecdr_consultarDatosRegistralesVO = DatosRegistralesWsDtoConverter.voAEntidad(atecdr_datosRegistralesEntrada);
		TipoSalidaConsultarDatosRegistralesVO ltscdr_consultarDatosRegistralesVO = (TipoSalidaConsultarDatosRegistralesVO) UtilidadBusCliente.crearEntradaClienteIntegracionBase(EnumServiciosWs.CONSULTAR_DATOS_REGISTRALES,EnumOperacionesWs.CONSULTAR_DATOS_REGISTRALES_CONSULTAR,ltecdr_consultarDatosRegistralesVO);
		TipoSalidaConsultarDatosRegistralesWSDTO ltscdr_consultarDatosRegistralesWSDTO = DatosRegistralesWsDtoConverter.voADto(ltscdr_consultarDatosRegistralesVO);

		UtilidadHistoricoConsulta.registrarHistorioConsulta(
				EnumOperacionesWs.HISTORIAL_SOLICITUDES_CONSULTAR_DETALLE_SOLICITUD.getIs_nombreServicio(), 
				atecdr_datosRegistralesEntrada.toString(), 
				ltscdr_consultarDatosRegistralesWSDTO);
		UtilidadExcepciones.manejadorExcepcionesServicios(ltscdr_consultarDatosRegistralesWSDTO);

		return ltscdr_consultarDatosRegistralesWSDTO;
	}

} 
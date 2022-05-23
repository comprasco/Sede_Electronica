/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ISolicitudCopiasBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless
 * Nombre del elemento: ISolicitudCopiasBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarSolicitudWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaIngresoSolicitudCopiasWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarSolicitudWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaIngresoSolicitudCopiasWSDTO;

/**
 * Interface de la capa de negocio. <br>
 * Contiene las definiciones logicas para consumir operaciones del servicio
 * Solicitud copias. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface ISolicitudCopiasBusiness {

	/**
	 * Metodo que se encarga de llamar al cliente bus e ingresar la solicitud de
	 * copias.
	 *
	 * @param ateisc_tipoEntradaIngresoSolicitudCopiasWsDto valores para consumir
	 *                                                      solicitud
	 * @return Resultado para ingreso solicitud copias retornado como
	 *         TipoSalidaIngresoSolicitudCopiasWSDTO
	 */
	public TipoSalidaIngresoSolicitudCopiasWSDTO ingresoSolicitudCopias (TipoEntradaIngresoSolicitudCopiasWSDTO ateisc_tipoEntradaIngresoSolicitudCopiasWsDto);
	
	/**
	 * Metodo que se encarga de llamar al cliente bus e consultar la solicitud de
	 * copias.
	 *
	 * @param atecs_tipoEntradaConsultarSolicitudWsDto valores para consultar la
	 *                                                 solicitud
	 * @return Resultado para consultar solicitud copias retornado como
	 *         TipoSalidaConsultarSolicitudWSDTO
	 */
	public TipoSalidaConsultarSolicitudWSDTO consultarSolicitudCopias(TipoEntradaConsultarSolicitudWSDTO atecs_tipoEntradaConsultarSolicitudWsDto);
}

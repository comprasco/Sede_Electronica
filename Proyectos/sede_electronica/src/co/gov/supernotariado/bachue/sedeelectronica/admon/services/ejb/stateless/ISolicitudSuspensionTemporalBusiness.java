/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ISolicitudCorreccionesBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless
 * Nombre del elemento: ISolicitudCorreccionesBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaIngresoSolicitudWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaIngresoSolicitudWSDTO;

/**
 * Interface de la capa de negocio. <br>
 * Contiene las definiciones logicas para consumir operaciones del servicio
 * Solicitud correcciones. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface ISolicitudSuspensionTemporalBusiness {

	/**
	 * Metodo que se encarga de llamar a la operacion ingreso solicitud en el
	 * servicio de solicitud correccion.
	 *
	 * @param ateis_tipoEntradaIngresoSolicitudWsdto el parametro tipo entrada
	 *                                               ingreso solicitud wsdto
	 * @return Resultado para ingreso solicitud retornado como
	 *         TipoSalidaIngresoSolicitudWSDTO
	 */
	public TipoSalidaIngresoSolicitudWSDTO ingresoSolicitud(TipoEntradaIngresoSolicitudWSDTO ateis_tipoEntradaIngresoSolicitudWsdto);
}

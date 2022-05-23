/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: IDatosRegistralesBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless
 * Nombre del elemento: IDatosRegistralesBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarDatosRegistralesWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarDatosRegistralesWSDTO;

/**
 * Interface de la capa de negocio. <br>
 * Contiene las definiciones logicas para consumir operaciones del servicio
 * Datos registrales. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface IDatosRegistralesBusiness {

	/**
	 * Metodo que permite consultar los datos registrales.
	 *
	 * @param atecdr_datosRegistralesEntrada datos de entrada de la referencia de
	 *                                       los datos registrales
	 * @return Resultado para consultar datos registrales retornado como
	 *         TipoSalidaConsultarDatosRegistralesWSDTO
	 */
	public TipoSalidaConsultarDatosRegistralesWSDTO consultarDatosRegistrales(TipoEntradaConsultarDatosRegistralesWSDTO atecdr_datosRegistralesEntrada);



}

/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: IAlertaTierrasWSBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless
 * Nombre del elemento: IAlertaTierrasWSBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.consultadrr.TipoSalidaConsultarRRRMatriculasWSDTO;

/**
 * Interface de la capa de negocio. <br>
 * Contiene las definiciones logicas para consumir operaciones del servicio
 * Consulta DrrWS. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface IConsultaDrrBusiness {

	/**
	 * Metodo que consulta drr a travez de un servicio soap
	 * @param as_numero valor del criterio
	 * @param as_criterioBusqueda tipo de criterio de busqueda
	 * @return TipoSalidaConsultarRRRMatriculasWSDTO
	 */ 
	public TipoSalidaConsultarRRRMatriculasWSDTO consultaDrr(String as_numero, String as_criterioBusqueda);

	
}

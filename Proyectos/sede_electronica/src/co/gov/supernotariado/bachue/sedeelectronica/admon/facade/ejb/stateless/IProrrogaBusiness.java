/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: IProrrogaBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless
 * Nombre del elemento: IProrrogaBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless;

//import java.util.List;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionProrrogaDTO;

/**
 * Interface de la capa de negocio. <br>
 * Permite definir las operaciones requeridas del recurso Prorroga.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface IProrrogaBusiness extends IGenericoTransaccionModeloBusiness{

	/**
	 * Metodo que se encarga de consumir el servicio de generar solicitud sin costo.
	 *
	 * @param atd_transaccionProrrogaDto datos de la transaccion a generar la
	 *                                     solicitud de Prorroga
	 * @return String Nir de la solicitud
	 */
	public String generarSolicitudProrroga(TransaccionProrrogaDTO atp_transaccionProrrogaDto);



}

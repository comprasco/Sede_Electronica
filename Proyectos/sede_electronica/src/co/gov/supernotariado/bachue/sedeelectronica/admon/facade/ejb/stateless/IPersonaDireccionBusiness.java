/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: IPersonaDireccionBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless
 * Nombre del elemento: IPersonaDireccionBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.DireccionDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.PersonaDTO;

/**
 * Interface de la capa de negocio. <br>
 * Permite definir las operaciones requeridas del recurso Persona direccion.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface IPersonaDireccionBusiness {

	/**
	 * Metodo que permite crear y almacenar una persona direccion en la base de datos.
	 *
	 * @param add_personaDireccionDto el parametro persona direccion dto
	 * @param apd_personaDto          el parametro persona dto
	 * @return true si la operacion se realiza exitosamente.
	 */
	public Boolean crearPersonaDireccion(DireccionDTO add_personaDireccionDto, PersonaDTO apd_personaDto);

}

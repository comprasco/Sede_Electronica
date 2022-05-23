/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: IParametrizacionPlantillaBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless
 * Nombre del elemento: IParametrizacionPlantillaBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless;

import java.util.List;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ParametrizacionPlantillaDTO;

/**
 * Interface de la capa de negocio. <br>
 * Permite definir las operaciones requeridas del recurso Parametrizacion
 * plantilla.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface IParametrizacionPlantillaBusiness {

	/**
	 * Metodo que permite consultar todas las plantillas.
	 *
	 * @return Lista de ParametrizacionPlantillaDTO, lista de las plantillas
	 *         parametrizadas
	 */
	public List<ParametrizacionPlantillaDTO> consultarPlantillas();

	/**
	 * Metodo que actualiza una plantilla.
	 *
	 * @param app_plantilla el parametro plantilla
	 * @return true, si se cumple o la accion se realiza exitosamente, false en caso
	 *         contrario.
	 */
	public Boolean actualizarPlantilla(ParametrizacionPlantillaDTO app_plantilla);

}

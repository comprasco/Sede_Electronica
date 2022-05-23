/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: IParametrizacionPlantillaDAO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless
 * Nombre del elemento: IParametrizacionPlantillaDAO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless;

import java.util.List;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.ParametrizacionPlantilla;

/**
 * Interface para definir operaciones sobre objetos de acceso a datos (DAO) <br>
 * Define operaciones para manipular el modelo de datos Parametrizacion
 * plantilla.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface IParametrizacionPlantillaDAO {
	
	/**
	 * Metodo que consulta una plantilla configurada.
	 *
	 * @param as_codigoPlantilla codigo de plantilla
	 * @return parametrizacion de la plantilla consultada
	 */
	public ParametrizacionPlantilla consultarPlantilla(String as_codigoPlantilla);
	
	/**
	 * Metodo que permite consultar todas las plantillas.
	 *
	 * @return lista de las plantillas parametrizadas
	 */
	public List<ParametrizacionPlantilla> consultarPlantillas();
	
	/**
	 * Metodo que actualiza una plantilla.
	 *
	 * @param app_plantilla el parametro plantilla
	 * @return true, si se cumple o la accion se realiza exitosamente
	 */
	public Boolean actualizarPlantilla(ParametrizacionPlantilla app_plantilla);

}

/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: IConfiguracionFormularioDAO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless
 * Nombre del elemento: IConfiguracionFormularioDAO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.ConfiguracionFormulario;

/**
 * Interface para definir operaciones sobre objetos de acceso a datos (DAO) <br>
 * Define operaciones para manipular el modelo de datos Configuracion
 * formulario.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface IConfiguracionFormularioDAO {
	
	/**
	 * Metodo para consultar el formulario por nombre para obtener id.
	 *
	 * @param as_configuracionFormulario el parametro configuracion formulario
	 * @return Resultado para consultar id configuracion formulario retornado como
	 *         ConfiguracionFormulario
	 */
	public ConfiguracionFormulario consultarIdConfiguracionFormulario(String as_configuracionFormulario);

}
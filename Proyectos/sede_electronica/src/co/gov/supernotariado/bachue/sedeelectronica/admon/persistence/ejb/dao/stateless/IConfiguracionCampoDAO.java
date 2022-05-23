/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: IConfiguracionCampoDAO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless
 * Nombre del elemento: IConfiguracionCampoDAO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.ConfiguracionCampo;

/**
 * Interface para definir operaciones sobre objetos de acceso a datos (DAO) <br>
 * Define operaciones para manipular el modelo de datos Configuracion campo.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface IConfiguracionCampoDAO {

	/**
	 * Consultar por nombre.
	 *
	 * @param as_nombreCampo el parametro nombre campo
	 * @return Resultado para consultar por nombre retornado como ConfiguracionCampo
	 */
	public ConfiguracionCampo consultarPorNombre(String as_nombreCampo);

}
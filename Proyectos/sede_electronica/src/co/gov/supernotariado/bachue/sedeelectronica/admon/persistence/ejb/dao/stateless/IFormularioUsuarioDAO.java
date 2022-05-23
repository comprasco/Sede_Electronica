/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: IFormularioUsuarioDAO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless
 * Nombre del elemento: IFormularioUsuarioDAO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.ConfiguracionFormulario;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.FormularioUsuario;

/**
 * Interface para definir operaciones sobre objetos de acceso a datos (DAO) <br>
 * Define operaciones para manipular el modelo de datos Formulario usuario.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface IFormularioUsuarioDAO {

	/**
	 * Metodo para consultar formulario por usuario.
	 *
	 * @param acf_configuracionFormulario el parametro configuracion formulario
	 * @param as_idUsuario                el parametro id usuario
	 * @return Resultado para consultar formulario usuario retornado como
	 *         FormularioUsuario
	 */
	public FormularioUsuario consultarFormularioUsuario(ConfiguracionFormulario acf_configuracionFormulario,
			String as_idUsuario);

	/**
	 * Metodo para crear un formulario para un usuario.
	 *
	 * @param afu_formularioUsuario el parametro formulario usuario
	 * @return Resultado para crear formulario usuario retornado como
	 *         FormularioUsuario
	 */
	public FormularioUsuario crearFormularioUsuario(FormularioUsuario afu_formularioUsuario);

}
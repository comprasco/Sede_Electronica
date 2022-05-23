/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: IValorCampoFormularioDAO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless
 * Nombre del elemento: IValorCampoFormularioDAO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless;

import java.util.List;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.ConfiguracionCampo;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.ConfiguracionFormulario;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.FormularioUsuario;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.ValorCampoFormulario;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.ValorCampoFormularioPK;

/**
 * Interface para definir operaciones sobre objetos de acceso a datos (DAO) <br>
 * Define operaciones para manipular el modelo de datos Valor campo formulario.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface IValorCampoFormularioDAO {

	/**
	 * Metodo encargado de consultar el valor del campo correspondiente al
	 * formulario crear cuenta cupo.
	 *
	 * @param acc_configuracionCampo el parametro configuracion campo
	 * @param as_formularioUsuario   el parametro formulario usuario
	 * @return Resultado para consultar valor campo formulario retornado como
	 *         ValorCampoFormulario
	 */
	public ValorCampoFormulario consultarValorCampoFormulario(ConfiguracionCampo acc_configuracionCampo,
			String as_formularioUsuario);

	/**
	 * Metodo encargado de actualizar el campo valor del formulario.
	 *
	 * @param avcf_valorCampoFormulario el parametro valor campo formulario
	 * @return true, si se cumple o la accion se realiza exitosamente, false en caso
	 *         contrario.
	 */
	public Boolean actualizaValorCampoFormulario(ValorCampoFormulario avcf_valorCampoFormulario);

	/**
	 * Metodo para insertar un valor a un campor de un formulario.
	 *
	 * @param avcf_valorCampoFormularioDto el parametro valor campo formulario dto
	 */
	public void crearValorCampoFormulario(ValorCampoFormulario avcf_valorCampoFormularioDto);

	/**
	 * Metodo encargado de consultar una lista de valores de los campos
	 * correspondientes al formulario crear cuenta cupo.
	 *
	 * @param acf_configuracionFormulario el parametro configuracion formulario
	 * @param afu_formularioUsuario       el parametro formulario usuario
	 * @return Resultado para consultar lista valor campo formulario retornado como
	 *         List
	 */
	public List<ValorCampoFormulario> consultarListaValorCampoFormulario(
			ConfiguracionFormulario acf_configuracionFormulario, FormularioUsuario afu_formularioUsuario);

	/**
	 * Metodo encargado de eliminar un formulario cuenta cupo.
	 *
	 * @param avcf_valorCampoFormulario el parametro valor campo formulario
	 * @return true, si se cumple o la accion se realiza exitosamente, false en caso
	 *         contrario.
	 */
	public Boolean eliminarFormulario(ValorCampoFormulario avcf_valorCampoFormulario);

	/**
	 * Metodo que consulta por el id el valor campo formulario.
	 *
	 * @param avcf_valorCampoFormularioPk datos de la primary key
	 * @return Resultado para consultar por id retornado como ValorCampoFormulario
	 */
	public ValorCampoFormulario consultarPorId(ValorCampoFormularioPK avcf_valorCampoFormularioPk);

}
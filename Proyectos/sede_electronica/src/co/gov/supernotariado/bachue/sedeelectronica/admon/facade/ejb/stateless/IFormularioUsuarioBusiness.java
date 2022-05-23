/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: IFormularioUsuarioBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless
 * Nombre del elemento: IFormularioUsuarioBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.FormularioCrearCuentaCupoDTO;

/**
 * Interface de la capa de negocio. <br>
 * Permite definir las operaciones requeridas del recurso Formulario usuario.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface IFormularioUsuarioBusiness {

	/**
	 * Metodo que permite consultar el formulario de cuenta cupo referente a la
	 * creacion (Del usuario en sesion).
	 *
	 * @return Resultado para consultar datos formulario cuenta cupo creacion
	 *         retornado como FormularioCrearCuentaCupoDTO
	 */
	public FormularioCrearCuentaCupoDTO consultarDatosFormularioCuentaCupoCreacion();

	/**
	 * Metodo que permite consultar el formulario de cuenta cupo referente a la
	 * creacion de un usuario especifico.
	 *
	 * @param as_idUsuario id del usuario a consultar
	 * @return Resultado para consultar datos formulario cuenta cupo creacion
	 *         retornado como FormularioCrearCuentaCupoDTO
	 */
	public FormularioCrearCuentaCupoDTO consultarDatosFormularioCuentaCupoCreacion(String as_idUsuario);

}

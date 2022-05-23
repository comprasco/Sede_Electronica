/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ITransaccionFormularioBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless
 * Nombre del elemento: ITransaccionFormularioBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionFormularioDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumConfiguracionFormulario;

/**
 * Interface de la capa de negocio. <br>
 * Permite definir las operaciones requeridas del recurso Transaccion
 * formulario.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface ITransaccionFormularioBusiness {

	/**
	 * Metodo encargado de crear una solicitud de creacion cuenta cupo para generar
	 * NIR.
	 *
	 * @param atf_transaccionFormularioDto el parametro transaccion formulario dto
	 */
	public void crearTransaccionSolicitudFormulario(TransaccionFormularioDTO atf_transaccionFormularioDto);

	/**
	 * Metodo encargado de actualizar el estado de una creacion cuenta cupo.
	 *
	 * @param atf_transaccionFormularioDto el parametro transaccion formulario dto
	 */
	public void actualizarEstadoFormulario(TransaccionFormularioDTO atf_transaccionFormularioDto);

	/**
	 * Metodo encargado de validar el estado de una cuenta cupo creada.
	 *
	 * @param as_estadoCuentaCupo el parametro estado cuenta cupo
	 * @return Resultado para validar estado cuenta cupo retornado como
	 *         TransaccionFormularioDTO
	 */
	public TransaccionFormularioDTO validarEstadoCuentaCupo(String as_estadoCuentaCupo);

	/**
	 * Metodo que consulta si ya se genero un NIrt para la solicitud de cuenta cupo.
	 *
	 * @param aecf_enumConfiguracionFormulario enum de formulario a buscar
	 * @return Resultado para consultar transaccion vigente cuenta cupo retornado
	 *         como TransaccionFormularioDTO
	 */
	public TransaccionFormularioDTO consultarTransaccionVigente(
			EnumConfiguracionFormulario aecf_enumConfiguracionFormulario);

	/**
	 * Metodo qeu se encarga de consultar el usuario juridico de la asociacion para
	 * consultar el estado de cuenta cupo.
	 *
	 * @param as_idAsociacion id de la asociacion para consultar
	 * @return Resultado para consultar cancelacion cuenta cupo asociado retornado
	 *         como TransaccionFormularioDTO
	 */
	public TransaccionFormularioDTO consultarCancelacionCuentaCupoAsociado(String as_idAsociacion);

	/**
	 * Metodo encargado de consultar una transaccion vigente de modificacion cuenta
	 * cupo.
	 *
	 * @return Resultado para consultar transaccion vigente modificar cuenta cupo
	 *         retornado como TransaccionFormularioDTO
	 */
	public TransaccionFormularioDTO consultarTransaccionVigenteModificarCuentaCupo();

	/**
	 * Metodo encargado de actualizar la cantidad de intentos fallidos
	 * 
	 * @param atf_transaccionFormularioDto
	 */
	public void actualizarCantidadIntentosFallidos(TransaccionFormularioDTO atf_transaccionFormularioDto);

}

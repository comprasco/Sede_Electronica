/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ISolicitudRecuperacionClaveBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless
 * Nombre del elemento: ISolicitudRecuperacionClaveBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.HistoricoClaveDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.SolicitudRecuperacionClaveDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioDTO;

/**
 * Interface de la capa de negocio. <br>
 * Permite definir las operaciones requeridas del recurso Solicitud recuperacion
 * clave.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface ISolicitudRecuperacionClaveBusiness {

	/**
	 * Metodo que permite crear el objeto a una Entidad asociada a la capa DAO.
	 *
	 * @param asrc_solicitudRecuperacionClaveDto el parametro solicitud recuperacion
	 *                                           clave dto
	 * @return true si la operacion se realiza exitosamente.
	 */
	public Boolean crearSolicitudRecuperacionClave(SolicitudRecuperacionClaveDTO asrc_solicitudRecuperacionClaveDto);

	/**
	 * Este metodo permite consultar usuarios para la recuperacion de la clave.
	 *
	 * @param as_codigo el parametro codigo
	 * @return Resultado para consulta usuarios recuperacion clave retornado como
	 *         SolicitudRecuperacionClaveDTO
	 */
	public SolicitudRecuperacionClaveDTO consultaUsuariosRecuperacionClave(String as_codigo);

	/**
	 * Este metodo permite actualizar el estado de la contrasena generica.
	 *
	 * @param asrc_solicitudRecuperacionClaveDTO el parametro solicitud recuperacion
	 *                                           clave DTO
	 * @return true, si se cumple o la accion se realiza exitosamente, false en caso
	 *         contrario.
	 */
	public Boolean actualizarUsuariosRecuperacionClave(
			SolicitudRecuperacionClaveDTO asrc_solicitudRecuperacionClaveDTO);

	/**
	 * Metodo que llama a los metodos para actualizar usuario, actualizar la
	 * solicitud de recuperacion clave y crea el historico de la clave.
	 *
	 * @param aud_usuarioDTO                     el parametro usuario DTO
	 * @param asrc_solicitudRecuperacionClaveDto el parametro solicitud recuperacion
	 *                                           clave dto
	 * @param ahc_historicoClaveDTO              el parametro historico clave DTO
	 */
	public void actualizarClaveUsuario(UsuarioDTO aud_usuarioDTO,
			SolicitudRecuperacionClaveDTO asrc_solicitudRecuperacionClaveDto, HistoricoClaveDTO ahc_historicoClaveDTO);
}

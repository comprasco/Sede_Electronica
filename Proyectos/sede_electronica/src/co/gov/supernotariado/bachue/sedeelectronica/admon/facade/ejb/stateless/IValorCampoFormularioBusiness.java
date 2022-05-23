/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: IValorCampoFormularioBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless
 * Nombre del elemento: IValorCampoFormularioBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless;

import java.util.List;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.FormularioCrearCuentaCupoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.FormularioDevolucionConsignacionErradaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.FormularioDevolucionesCuentaCupoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.FormularioDevolucionServicioRegistralDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.FormularioModificarCuentaCupoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.FormularioUsuarioDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ProrrogaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionFormularioDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ValorCampoFormularioDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaGenerarSolicitudWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumConfiguracionFormulario;

/**
 * Interface de la capa de negocio. <br>
 * Permite definir las operaciones requeridas del recurso Valor campo
 * formulario.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface IValorCampoFormularioBusiness {

	/**
	 * Metodo que se encarga de consultar un formulario cuenta cupo.
	 *
	 * @param aecf_enumConfiguracionFormulario enum del formulario a encontrar
	 * @return Resultado para consultar formulario cuenta cupo retornado como una
	 *         lista de ValorCampoFormularioDTO, lista valor campo formulario
	 */
	public List<ValorCampoFormularioDTO> consultarFormulario(
			EnumConfiguracionFormulario aecf_enumConfiguracionFormulario);

	/**
	 * Metodo que se encarga de guardar un valor del formulario de crear cuenta
	 * cupo.
	 *
	 * @param as_campo              el parametro campo
	 * @param as_valor              el parametro valor
	 * @param aecf_nombreFormulario el parametro nombre formulario
	 */
	public void guardarTransaccionTemporal(String as_campo, String as_valor,
			EnumConfiguracionFormulario aecf_nombreFormulario);

	/**
	 * Metodo que se encarga de eliminar un formulario cuenta cupo.
	 *
	 * @param alvcf_listaValorCampoFormularioDto el parametro lista valor campo
	 *                                           formulario dto
	 * @param aecf_enumConfiguracionFormulario   enum del formulario a eliminar
	 * @return true, si se cumple o la accion se realiza exitosamente, false en caso
	 *         contrario.
	 */
	public Boolean eliminarFormulario(List<ValorCampoFormularioDTO> alvcf_listaValorCampoFormularioDto,
			EnumConfiguracionFormulario aecf_enumConfiguracionFormulario);

	/**
	 * Metodo encargado de cosumir el servicio sin costo para generar NIR.
	 *
	 * @param afccc_formularioCrearCuentaCupo el parametro formulario crear cuenta
	 *                                        cupo
	 * @param aecf_nombreFormulario           el parametro nombre formulario
	 * @return Resultado para crear solicitud cuenta cupo retornado como
	 *         TransaccionFormularioDTO
	 */
	public TransaccionFormularioDTO crearSolicitudCuentaCupo(
			FormularioCrearCuentaCupoDTO afccc_formularioCrearCuentaCupo,
			EnumConfiguracionFormulario aecf_nombreFormulario);

	/**
	 * Metodo encargado de cosumir el servicio sin costo para generar NIR.
	 *
	 * @param ap_prorroga el parametro prorroga
	 * @param aecf_nombreFormulario           el parametro nombre formulario
	 * @return Resultado para crear solicitud prorroga retornado como
	 *         TransaccionFormularioDTO
	 */
	public TransaccionFormularioDTO crearSolicitudProrroga(ProrrogaDTO ap_prorroga,
			EnumConfiguracionFormulario aecf_nombreFormulario);

	/**
	 * Metodo encargado de eliminar una solicitud de creacion cuenta cupo.
	 *
	 * @param atf_transaccionFormularioDto el parametro transaccion formulario dto
	 * @return true, si se cumple o la accion se realiza exitosamente, false en caso
	 *         contrario.
	 */
	public Boolean eliminarTransaccion(TransaccionFormularioDTO atf_transaccionFormularioDto);

	/**
	 * Metodo que consulta una transaccion solicitud cuenta cupo por el NIR
	 * generado.
	 *
	 * @param atf_transaccionFormularioDto datos de la transaccion
	 * @return Resultado para consultar NIR retornado como TransaccionFormularioDTO
	 */
	public TransaccionFormularioDTO consultarNIR(TransaccionFormularioDTO atf_transaccionFormularioDto);

	/**
	 * Metodo encargado de consultar el estado de la cuenta cupo creada.
	 *
	 * @param atf_transaccionFormularioDto el parametro transaccion formulario dto
	 * @return Resultado para consultar estado solicitud retornado como int.
	 * 
	 */
	public int consultarEstadoSolicitud(TransaccionFormularioDTO atf_transaccionFormularioDto);

	/**
	 * Metodo encargado de crear una solicitu de modificacion cuenta cupo.
	 *
	 * @param afmcc_formularioModificarCuentaCupo el parametro formulario modificar
	 *                                            cuenta cupo
	 * @param aecf_nombreFormulario               el parametro nombre formulario
	 * @return Resultado para crear solicitud modificacion cuenta cupo retornado
	 *         como TransaccionFormularioDTO
	 */
	public TransaccionFormularioDTO crearSolicitudModificacionCuentaCupo(
			FormularioModificarCuentaCupoDTO afmcc_formularioModificarCuentaCupo,
			EnumConfiguracionFormulario aecf_nombreFormulario);

	/**
	 * Metodo que se encarga de ir a base de datos y guardar una transaccion cuenta
	 * cupo.
	 *
	 * @param aecf_nombreFormulario el parametro nombre formulario
	 * @param as_nir                el parametro nir
	 * @return Resultado para guardar transaccion cuenta cupo retornado como
	 *         TransaccionFormularioDTO
	 */
	public TransaccionFormularioDTO guardarTransaccionFormulario(EnumConfiguracionFormulario aecf_nombreFormulario,
			String as_nir);

	/**
	 * Metodo que se encarga de consultar un formulario por enum y el usuario y
	 * devolver sus parametros.
	 *
	 * @param aecf_enumConfiguracionFormulario el parametro enum configuracion
	 *                                         formulario
	 * @param as_idUsuario                     el parametro id usuario
	 * @return Resultado para consultar formulario cuenta cupo retornado como una
	 *         lista de ValorCampoFormularioDTO
	 */
	public List<ValorCampoFormularioDTO> consultarFormulario(
			EnumConfiguracionFormulario aecf_enumConfiguracionFormulario, String as_idUsuario);

	/**
	 * Metodo encagado de crear una solicitud de devolcuion consignacion errada
	 * 
	 * @param afdce_formularioDevolcionConsignacionErradaDto
	 * @param aecf_nombreFormulario
	 * @return TransaccionFormularioDTO
	 */
	public TransaccionFormularioDTO crearSolicitudDevolucionConsignacionErrada(
			FormularioDevolucionConsignacionErradaDTO afdce_formularioDevolcionConsignacionErradaDto,
			EnumConfiguracionFormulario aecf_nombreFormulario);

	/**
	 * Metodo encagado de crear una solicitud de devolucion servicio Registral
	 * 
	 * @param afdsr_formularioDevolcionServicioRegistralDto
	 * @param aecf_nombreFormulario
	 * @return TransaccionFormularioDTO
	 */
	public TransaccionFormularioDTO crearSolicitudDevolucionServicioRegistral(
			FormularioDevolucionServicioRegistralDTO afdsr_formularioDevolcionServicioRegistralDto,
			EnumConfiguracionFormulario aecf_nombreFormulario);

	/**
	 * Metodo encargado de consultar el estado de una solicitud devolucion
	 * 
	 * @param atf_transaccionFormularioDto
	 * @param au_usuarioDto
	 * @return int
	 */
	public int consultarEstadoSolicitudDevolucion(TransaccionFormularioDTO atf_transaccionFormularioDto,
			UsuarioDTO au_usuarioDto);

	/**
	 * Metodo encargado de consultar el estado de una solicitud devolucion cuenta
	 * cupo
	 * 
	 * @param afdcc_formularioDevolucionCuentaCupoDto
	 * @param aecf_nombreFormulario
	 * @return TransaccionFormularioDTO
	 */
	public TransaccionFormularioDTO crearSolicitudDevolucionCuentaCupo(
			FormularioDevolucionesCuentaCupoDTO afdcc_formularioDevolucionCuentaCupoDto,
			EnumConfiguracionFormulario aecf_nombreFormulario);

	/**
	 * Metodo que valida el codigo de verificacion
	 * 
	 * @param atf_transaccionFormulario
	 * @param as_codigoVerificacion
	 * @param ab_verificacionCodigo
	 * @return error si el codigo es incorrecto, true si es correcto y false si la
	 *         cantidad de intentos fue culminada
	 */
	public Boolean validarCodigoVerificacion(TransaccionFormularioDTO atf_transaccionFormulario,
			String as_codigoVerificacion, Boolean ab_verificacionCodigo);

	/**
	 * 
	 * @param aecf_nombreFormulario
	 * @return Resultado para consultar formulario usuario retornado como
	 *         FormularioUsuarioDTO
	 */
	public FormularioUsuarioDTO consultarFormularioUsuario(EnumConfiguracionFormulario aecf_nombreFormulario);

	/**
	 * 
	 * @param aecf_nombreFormulario
	 * @param atf_transaccionFormularioDto
	 * @return
	 */
	public TransaccionFormularioDTO guardarTransaccionFormularioDevolucion(
			EnumConfiguracionFormulario aecf_nombreFormulario,
			TipoSalidaGenerarSolicitudWSDTO atsgs_tipoSalidaGenerarSolicitudWsDto);

	/**
	 * Metodo encargado de actualizar el stado del codigo de verificacion cuando
	 * esta validado
	 * 
	 * @param atf_transaccionFormularioDto
	 */
	public void actualizarEstadoCodigoVerificacionValidado(TransaccionFormularioDTO atf_transaccionFormularioDto);

	/**
	 * Metodo encargado de validar el estado de una cuenta cupo
	 * 
	 * @param atf_transaccionFormularioDto
	 * @return String
	 */
	public String consultarEstadoCuentaCupo(TransaccionFormularioDTO atf_transaccionFormularioDto);

}

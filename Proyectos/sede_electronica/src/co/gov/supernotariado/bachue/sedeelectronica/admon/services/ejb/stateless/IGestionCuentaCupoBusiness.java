/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: IGestionCuentaCupoBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless
 * Nombre del elemento: IGestionCuentaCupoBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaActualizarEntidadWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaCancelarUsuarioWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarIDCuentaCupoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarMovimientosWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarSaldoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarSaldosNotaCreditoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarUsuarioWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarUsuariosWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaInscribirUsuarioWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaPagarCuentaCupoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaActualizarEntidadWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaCancelarUsuarioWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarIDCuentaCupoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarMovimientosWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarSaldoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarSaldosNotaCreditoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarUsuarioWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarUsuariosWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaInscribirUsuarioWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaPagarCuentaCupoWSDTO;

/**
 * Interface de la capa de negocio. <br>
 * Contiene las definiciones logicas para consumir operaciones del servicio
 * Gestion cuenta cupo. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface IGestionCuentaCupoBusiness {

	/**
	 * Metodo que llama a la operacion de actualizar entidad del servicio de gestion
	 * cuenta cupo.
	 *
	 * @param ateae_tipoEntradaActualizarEntidadWsDto el parametro tipo entrada
	 *                                                actualizar entidad ws dto
	 * @return Resultado para actualizar entidad retornado como
	 *         TipoSalidaActualizarEntidadWSDTO
	 */
	public TipoSalidaActualizarEntidadWSDTO actualizarEntidad(
			TipoEntradaActualizarEntidadWSDTO ateae_tipoEntradaActualizarEntidadWsDto);

	/**
	 * Metodo que llama a la operacion de cancelar usuario del servicio de gestion
	 * cuenta cupo.
	 *
	 * @param atecu_tipoEntradaCancelarUsuarioWsDto el parametro tipo entrada
	 *                                              cancelar usuario ws dto
	 * @return Resultado para cancelar usuario retornado como
	 *         TipoSalidaCancelarUsuarioWSDTO
	 */
	public TipoSalidaCancelarUsuarioWSDTO cancelarUsuario(
			TipoEntradaCancelarUsuarioWSDTO atecu_tipoEntradaCancelarUsuarioWsDto);

	/**
	 * Metodo que llama a la operacion de consultar movimientos del servicio de
	 * gestion cuenta cupo.
	 *
	 * @param atecm_tipoEntradaConsultarMovimientosWsDto el parametro tipo entrada
	 *                                                   consultar movimientos ws
	 *                                                   dto
	 * @return Resultado para consultar movimientos retornado como
	 *         TipoSalidaConsultarMovimientosWSDTO
	 */
	public TipoSalidaConsultarMovimientosWSDTO consultarMovimientos(
			TipoEntradaConsultarMovimientosWSDTO atecm_tipoEntradaConsultarMovimientosWsDto);

	/**
	 * Metodo que llama a la operacion de consultar saldo del servicio de gestion
	 * cuenta cupo.
	 *
	 * @param atecs_tipoEntradaConsultarSaldoWsDto el parametro tipo entrada
	 *                                             consultar saldo ws dto
	 * @return Resultado para consultar saldo retornado como
	 *         TipoSalidaConsultarSaldoWSDTO
	 */
	public TipoSalidaConsultarSaldoWSDTO consultarSaldo(
			TipoEntradaConsultarSaldoWSDTO atecs_tipoEntradaConsultarSaldoWsDto);

	/**
	 * Metodo que llama a la operacion de consultar usuario del servicio de gestion
	 * cuenta cupo.
	 *
	 * @param atecu_tipoEntradaConsultarUsuarioWsDto el parametro tipo entrada
	 *                                               consultar usuario ws dto
	 * @return Resultado para consultar usuario retornado como
	 *         TipoSalidaConsultarUsuarioWSDTO
	 */
	public TipoSalidaConsultarUsuarioWSDTO consultarUsuario(
			TipoEntradaConsultarUsuarioWSDTO atecu_tipoEntradaConsultarUsuarioWsDto);

	/**
	 * Metodo que llama a la operacion de consultar usuario del servicio de gestion
	 * cuenta cupo.
	 *
	 * @param atecu_tipoEntradaConsultarUsuariosWsDto el parametro tipo entrada
	 *                                                consultar usuarios ws dto
	 * @return Resultado para consultar usuarios retornado como
	 *         TipoSalidaConsultarUsuariosWSDTO
	 */
	public TipoSalidaConsultarUsuariosWSDTO consultarUsuarios(
			TipoEntradaConsultarUsuariosWSDTO atecu_tipoEntradaConsultarUsuariosWsDto);

	/**
	 * Metodo que llama a la operacion de inscribir usuario del servicio de gestion
	 * cuenta cupo.
	 *
	 * @param ateiu_tipoEntradaInscribirUsuarioWsDto el parametro tipo entrada
	 *                                               inscribir usuario ws dto
	 * @return Resultado para inscribir usuario retornado como
	 *         TipoSalidaInscribirUsuarioWSDTO
	 */
	public TipoSalidaInscribirUsuarioWSDTO inscribirUsuario(
			TipoEntradaInscribirUsuarioWSDTO ateiu_tipoEntradaInscribirUsuarioWsDto);

	/**
	 * Metodo que llama a la operacion de pagar cuenta cupo del servicio de gestion
	 * cuenta cupo.
	 *
	 * @param atepcc_tipoEntradaPagarCuentaCupoWsDto el parametro tipo entrada pagar
	 *                                               cuenta cupo ws dto
	 * @return Resultado para pagar cuenta cupo retornado como
	 *         TipoSalidaPagarCuentaCupoWSDTO
	 */
	public TipoSalidaPagarCuentaCupoWSDTO pagarCuentaCupo(
			TipoEntradaPagarCuentaCupoWSDTO atepcc_tipoEntradaPagarCuentaCupoWsDto);

	/**
	 * Metodo que llama a la operacion de consultar id cuenta cupo del servicio de
	 * gestion cuenta cupo.
	 *
	 * @param atecicc_tipoEntradaConsultarIdCuentaCupoWsDto el parametro tipo
	 *                                                      entrada consultar id
	 *                                                      cuenta cupo ws dto
	 * @return Resultado para consultar id cuenta cupo retornado como
	 *         TipoSalidaConsultarIDCuentaCupoWSDTO
	 */
	public TipoSalidaConsultarIDCuentaCupoWSDTO consultarIdCuentaCupo(
			TipoEntradaConsultarIDCuentaCupoWSDTO atecicc_tipoEntradaConsultarIdCuentaCupoWsDto);

	/**
	 * 
	 * Metodo que llama a la operacion de consultar saldos nota credito del servicio
	 * gestion cuenta cupo.
	 * 
	 * @param atecsnc_tipoEntradaConsultarSaldosNotaCreditoWsDto
	 * @return TipoSalidaConsultarSaldosNotaCreditoWSDTO
	 */
	public TipoSalidaConsultarSaldosNotaCreditoWSDTO consultarSaldosNotaCredito(
			TipoEntradaConsultarSaldosNotaCreditoWSDTO atecsnc_tipoEntradaConsultarSaldosNotaCreditoWsDto);
}

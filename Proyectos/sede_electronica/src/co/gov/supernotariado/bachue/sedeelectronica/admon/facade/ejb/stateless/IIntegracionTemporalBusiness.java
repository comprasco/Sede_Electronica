/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: IIntegracionTemporalBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless
 * Nombre del elemento: IIntegracionTemporalBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless;

import java.util.List;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.DetalleCuentaCupoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.IntegracionEntradaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.IntegracionTemporalDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.RecargaCuentaCupoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionCEDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionIndividualDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.interfaces.ITransaccionDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.ObtenerPdfLiquidacionSalidaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaGenerarLiquidacionWSDTO;

/**
 * Interface de la capa de negocio. <br>
 * Permite definir las operaciones requeridas del recurso Integracion temporal.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface IIntegracionTemporalBusiness {

	/**
	 * Metodo que permite crear el objeto a una Entidad asociada a la capa DAO.
	 *
	 * @param ait_integracionTemporalDto el parametro integracion temporal dto
	 * @return true si la operacion se realiza exitosamente.
	 */
	public Boolean crearIntegracionTemporal(IntegracionTemporalDTO ait_integracionTemporalDto);

	/**
	 * /** Metodo que se encarga de eliminar en transaccion Temporal despues de
	 * guardarse en permanente.
	 *
	 * @param ait_integracionTemporalDto el parametro integracion temporal dto
	 * @return true, si se cumple o la accion se realiza exitosamente, false en caso
	 *         contrario.
	 */
	public Boolean eliminarTemporal(IntegracionTemporalDTO ait_integracionTemporalDto);

	/**
	 * Metodo que consulta los datos de integracionTemporal del usuario en base de
	 * datos.
	 *
	 * @return Retorna una lista con las IntegracionTemporalDto que existan en base
	 *         de datos para el usuario
	 */
	public List<IntegracionTemporalDTO> consultarIntegraciones();

	/**
	 * Metodo que consulta una integracionTemporal segun el nir.
	 *
	 * @param as_nir nir de la peticion que falta por pagar
	 * @return IntegracionTemporalDTO con los datos de la peticion que falta pagar
	 */
	public IntegracionTemporalDTO consultarTransaccion(String as_nir);
	
	/**
	 * Metodo que consulta una integracionTemporal segun la referencia
	 * 
	 * @param as_referencia referencia de la peticion que falta por pagar
	 * @return IntegracionTemporalDTO con los datos de la peticion que falta pagar
	 */
	public IntegracionTemporalDTO consultarTransaccionReferencia(String as_referencia);

	/**
	 * Metodo que se encarga de consultar todas las integraciones.
	 *
	 * @param ati_transaccionIndividualDto el parametro transaccion individual dto
	 * @return Lista de IntegracionEntradaDTO, Lista con los resultados de la
	 *         consulta
	 */
	public List<IntegracionEntradaDTO> consultarHistorico(TransaccionIndividualDTO ati_transaccionIndividualDto);

	/**
	 * Metodo que se encarga de realizar el pedido al servicio de interfaces
	 * financieras, guardar en la tabla de integracion temporal.
	 *
	 * @param atce_transaccionCEDTO Datos de la transaccion para generar liquidacion
	 * @return IntegracionTemporalDTO que se guardo en base de datos
	 */
	public IntegracionTemporalDTO guardarTransaccionCE(TransaccionCEDTO atce_transaccionCEDTO);

	/**
	 * Metodo que se encarga de generar liquidacion para el servicio de registrar
	 * alertas y guardar en transaccion Temporal.
	 *
	 * @param ait_transaccionDTO transaccion a generar
	 * @return Resultado para guardar transaccion retornado como
	 *         IntegracionTemporalDTO
	 */
	public IntegracionTemporalDTO guardarTransaccion(ITransaccionDTO ait_transaccionDTO);

	/**
	 * Se encarga de validar que la contrasena de la persona sea correcta para
	 * continuar con la modificacion, se muestra dialog con mensaje informando el
	 * error.
	 *
	 * @param as_contrasenaConfirmacion contrasena a validar
	 * @return true, si se cumple o la accion se realiza exitosamente, false en caso
	 *         contrario.
	 */
	public boolean validarContrasenaCorrecta(String as_contrasenaConfirmacion);

	/**
	 * Consultar cuenta cupo.
	 *
	 * @param aie_integracionEntradaDto el parametro integracion entrada dto
	 * @return Resultado para consultar cuenta cupo retornado como
	 *         DetalleCuentaCupoDTO
	 */
	public DetalleCuentaCupoDTO consultarCuentaCupo(IntegracionEntradaDTO aie_integracionEntradaDto);

	/**
	 * Metodo que realiza el pago por cuenta cupo.
	 *
	 * @param aie_integracionEntradaDto el parametro integracion entrada dto
	 * @return true, si se cumple o la accion se realiza exitosamente, false en caso
	 *         contrario.
	 */
	public boolean pagarCuentaCupo(IntegracionEntradaDTO aie_integracionEntradaDto);

	/**
	 * Metodo que se encarga de generar la liquidacion para la funcion de recargar
	 * cuenta cupo.
	 *
	 * @param arcc_recargaCuentaCupoDto el parametro recarga cuenta cupo dto
	 * @return Resultado para generar entrada liquidacion recarga retornado como
	 *         TipoEntradaGenerarLiquidacionWSDTO
	 */
	public TipoEntradaGenerarLiquidacionWSDTO generarEntradaLiquidacionRecarga(
			RecargaCuentaCupoDTO arcc_recargaCuentaCupoDto);

	/**
	 * Metodo el pedido al servicio de interfaces financieras, guardar en la tabla
	 * de integracion temporal.
	 *
	 * @param arcc_recargarCuentaCupoDto el parametro recargar cuenta cupo dto
	 * @return Resultado para guardar transaccion recarga retornado como
	 *         IntegracionTemporalDTO
	 */
	public IntegracionTemporalDTO guardarTransaccionRecarga(RecargaCuentaCupoDTO arcc_recargarCuentaCupoDto);

	/**
	 * Metodo que se encarga de generar el archivo pdf correspondiente al recibo de
	 * pago para recarga cuenta cupo.
	 *
	 * @param ait_integracionTemporal el parametro integracion temporal
	 * @return Resultado para generar recibo retornado como
	 *         ObtenerPdfLiquidacionSalidaWSDTO
	 */
	public ObtenerPdfLiquidacionSalidaWSDTO generarRecibo(IntegracionTemporalDTO ait_integracionTemporal);

	/**
	 * Metodo que se encarga de consultar la recarga en la tabla de integracion
	 * temporal.
	 *
	 * @param as_tipoProceso el parametro tipo proceso
	 * @return Resultado para consultar recarga retornado como
	 *         IntegracionTemporalDTO
	 */
	public IntegracionTemporalDTO consultarRecarga(String as_tipoProceso);

	/**
	 * Metodo que se encarga de modificar la referencia de pago de una transaccion
	 * aie_integracionEntradaDto.
	 *
	 * @param aie_integracionEntradaDto el parametro integracion entrada dto
	 * @return Resultado para modificar referencia retornado como
	 *         IntegracionEntradaDTO
	 */
	public IntegracionEntradaDTO modificarReferencia(IntegracionEntradaDTO aie_integracionEntradaDto);

	/**
	 * Metodo que se encarga de eliminar transaccion temporal asignada al usuario en
	 * sesion al solicitar nuevo certificado especial.
	 *
	 * @return Resultado para eliminar integracion temporal no visible usuario
	 *         retornado como una lista de IntegracionTemporalDTO
	 */
	public List<IntegracionTemporalDTO> eliminarIntegracionTemporalNoVisibleUsuario();

	/**
	 * Metodo que se encarga de eliminar cada 24 horas transacciones temporales de
	 * certificados especiales.
	 *
	 * @return Resultado para eliminar integracion temporales no visibles retornado
	 *         como una lista de IntegracionTemporalDTO
	 */
	public List<IntegracionTemporalDTO> eliminarIntegracionTemporalesNoVisibles();
}

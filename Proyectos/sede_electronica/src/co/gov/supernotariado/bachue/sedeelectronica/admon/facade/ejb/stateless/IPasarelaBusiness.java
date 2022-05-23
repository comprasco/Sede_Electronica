/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: IPasarelaBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless
 * Nombre del elemento: IPasarelaBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.IntegracionTemporalDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionPasarelaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.pasarelarealpay.wsdto.EntradaConsultaTransaccionTokenWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.pasarelarealpay.wsdto.EntradaCreacionTransaccionWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.pasarelarealpay.wsdto.EntradaVerificacionEstadoNegocioWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.pasarelarealpay.wsdto.SalidaCreacionTransaccionWSDTO;

/**
 * Interface de la capa de negocio. <br>
 * Permite definir las operaciones requeridas del recurso Pasarela.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface IPasarelaBusiness {

	/**
	 * Metodo que permite validar estado de una empresa registrada con centralizador
	 * de pagos.
	 *
	 * @param aeven_verificacion el parametro verificacion
	 * @return Validacion positiva o negativa
	 */
	public Boolean validarEmpresa(EntradaVerificacionEstadoNegocioWSDTO aeven_verificacion);

	/**
	 * Metodo que permite crear una transaccion a la pasarela.
	 *
	 * @param aect_transaccion el parametro transaccion
	 * @param as_nir           el parametro nir
	 * @return Resultado para crear transaccion retornado como
	 *         SalidaCreacionTransaccionWSDTO, la salida del modelo de transaccion
	 */
	public SalidaCreacionTransaccionWSDTO crearTransaccion(EntradaCreacionTransaccionWSDTO aect_transaccion,
			String as_nir);

	/**
	 * Metodo que permite consultar el estado de la transaccion y retorna al resumen
	 * segun resultado.
	 *
	 * @param aectt_transaccion       transaccion
	 * @param atp_transaccionPasarela el parametro transaccion pasarela
	 * @return Resultado para validar estado transaccion token pasarela retornado
	 *         como String, el valor de la respuesta de la validacion
	 */
	public String validarEstadoTransaccionTokenPasarela(EntradaConsultaTransaccionTokenWSDTO aectt_transaccion, TransaccionPasarelaDTO atp_transaccionPasarela, IntegracionTemporalDTO ait_integracionTempora);
	

	/**
	 * Metodo que permite consultar la pasarela al core bachue (confirmacion).
	 *
	 * @param as_token                el parametro token
	 * @param atp_transaccionPasarela el parametro transaccion pasarela
	 * @return Resultado para validar estado transaccion pasarela core retornado
	 *         como String, el valor de la respuesta de la validacion
	 */
	public String validarEstadoTransaccionPasarelaCore(String as_token, TransaccionPasarelaDTO atp_transaccionPasarela);

	/**
	 * Metodo que permite consultar una transaccion con un token.
	 *
	 * @param as_token token entregada por la pasarela
	 * @return Resultado para consultar transaccion token retornado como
	 *         TransaccionPasarelaDTO
	 */
	public TransaccionPasarelaDTO consultarTransaccionToken(String as_token);

	/**
	 * Metodo que permite validar las transacciones pendientes.
	 *
	 * @param atp_transaccionPasarela el parametro transaccion pasarela
	 * @param ait_integracionTemporal el parametro integracion temporal
	 */
	public void validarTransaccionPendiente(TransaccionPasarelaDTO atp_transaccionPasarela,
			IntegracionTemporalDTO ait_integracionTemporal);

	/**
	 * Metodo que permite validar las transacciones pendientes.
	 */
	public void validarTransaccionesPendientes();

	/**
	 * Metodo que permite actualziar estado de la transaccion.
	 *
	 * @param is_nir el parametro nir
	 * @return Resultado para consultar transaccion nir retornado como
	 *         TransaccionPasarelaDTO
	 */
	public TransaccionPasarelaDTO consultarTransaccionNir(String as_nir); 
	
	/**
	 * Metodo que permite actualziar estado de la transaccion
	 * @param is_nir nir a consultar
	 * @return TransaccionPasarelaDTO
	 */
	public TransaccionPasarelaDTO consultarTransaccionReferencia(String as_referencia); 

}

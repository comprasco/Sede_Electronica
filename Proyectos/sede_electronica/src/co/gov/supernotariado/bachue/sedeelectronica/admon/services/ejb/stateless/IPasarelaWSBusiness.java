/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: IPasarelaWSBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless
 * Nombre del elemento: IPasarelaWSBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.services.pasarelarealpay.wsdto.EntradaAceptacionTransaccionWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.pasarelarealpay.wsdto.EntradaConsultaTransaccionTokenWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.pasarelarealpay.wsdto.EntradaCreacionTransaccionWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.pasarelarealpay.wsdto.EntradaVerificacionEstadoNegocioWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.pasarelarealpay.wsdto.SalidaAceptacionTransaccionWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.pasarelarealpay.wsdto.SalidaConsultaTransaccionTokenWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.pasarelarealpay.wsdto.SalidaCreacionTransaccionWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.pasarelarealpay.wsdto.SalidaVerificacionEstadoNegocioWSDTO;

/**
 * Interface de la capa de negocio. <br>
 * Contiene las definiciones logicas para consumir operaciones del servicio
 * Pasarela WS. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface IPasarelaWSBusiness {


	/**
	 * Verifica negocio en centralizador de pagos.
	 *
	 * @param aeven_entradaVerificacionDto el parametro entrada verificacion dto
	 * @return Resultado para verificar negocio retornado como
	 *         SalidaVerificacionEstadoNegocioWSDTO
	 */
	public SalidaVerificacionEstadoNegocioWSDTO verificarNegocio(EntradaVerificacionEstadoNegocioWSDTO aeven_entradaVerificacionDto);
	
	/**
	 * Metodo que permite crear transaccion.
	 *
	 * @param aect_creacionTransaccionDto metodo de entrada accion
	 * @return Resultado para crear transaccion retornado como
	 *         SalidaCreacionTransaccionWSDTO
	 */
	public SalidaCreacionTransaccionWSDTO crearTransaccion(EntradaCreacionTransaccionWSDTO aect_creacionTransaccionDto);
	
	/**
	 * Metodo que permite aceptar transaccion.
	 *
	 * @param aeat_entradaTransaccionDto el parametro entrada transaccion dto
	 * @return Resultado para aceptar transaccion retornado como
	 *         SalidaAceptacionTransaccionWSDTO
	 */
	public SalidaAceptacionTransaccionWSDTO aceptarTransaccion(EntradaAceptacionTransaccionWSDTO aeat_entradaTransaccionDto);

	
	/**
	 * Metodo que permite validar estado de transaccion.
	 *
	 * @param aecttw_transaccion transaccion respectiva
	 * @return Resultado para validar transaccion token retornado como
	 *         SalidaConsultaTransaccionTokenWSDTO
	 */
	public SalidaConsultaTransaccionTokenWSDTO validarTransaccionToken(EntradaConsultaTransaccionTokenWSDTO aecttw_transaccion);
	
}

/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: VerificacionTransaccionConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.converter
 * Nombre del elemento: VerificacionTransaccionConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.converter;

import co.gov.supernotariado.bachue.clientebus.pasarela.types.validarestado.ValidateBusinessStatus;
import co.gov.supernotariado.bachue.clientebus.pasarela.types.validarestado.ValidateSystemStatusDTO;
import co.gov.supernotariado.bachue.clientebus.vo.pasarela.EntradaVerificacionEstadoNegocioVO;
import co.gov.supernotariado.bachue.clientebus.vo.pasarela.SalidaVerificacionEstadoNegocioVO;

/**
 * Clase auxiliar (Converter) del proyecto Cliente BUS, que permite transformar
 * entre Value Object(VO) y ComplexType.<br>
 * <b>VO</b>, objeto que recibe o retorna el cliente de servicios cuando lo
 * invoca otra aplicacion o capa de negocio. <br>
 * <b>ComplexType</b>, objeto que representa un elemento especifico de un
 * esquema de servicios SOAP, relacionado a una representacion XML que sera
 * enviada o recibida al hacer ejecutar una operacion de un servicio. <br>
 * Contiene metodos de transformacion para el elemento u operacion Verificacion
 * transaccion. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class VerificacionTransaccionConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * VerificacionTransaccionConverter.
	 */
	private VerificacionTransaccionConverter() {
		// Metodo constructor privado y vacio
	}

	/**
	 * Metodo que convierte de ComplexType a VO ( De elemento especifico del esquema
	 * de un Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto con un resultado/salida de una peticion de
	 * Servicio SOAP, en un objeto de datos llamado VO; para ser retornado como
	 * resultado a la aplicacion o capa de negocio que consume el cliente de
	 * servicios. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> ValidateSystemStatusDTO <b>a</b>
	 * SalidaVerificacionEstadoNegocioVO, <br>
	 * En otras palabras, <b>de</b> Validate system status DTO (ComplexType
	 * relacionado a la representacion XML del servicio) <b>a</b> Salida
	 * verificacion estado negocio objeto con valores de servicio.
	 *
	 * @param avss_validateSystemStatus el parametro que representa el complex type
	 *                                  a convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como SalidaVerificacionEstadoNegocioVO.
	 */
	public static SalidaVerificacionEstadoNegocioVO tipoAVo(ValidateSystemStatusDTO avss_validateSystemStatus) {
		SalidaVerificacionEstadoNegocioVO lsven_salidaVerificacionEstadoNegocioVo = new SalidaVerificacionEstadoNegocioVO();
		lsven_salidaVerificacionEstadoNegocioVo
				.setIs_consecutivo(avss_validateSystemStatus.getConsecutive().toString());
		lsven_salidaVerificacionEstadoNegocioVo.setIs_log(LogConverter.tipoAVo(avss_validateSystemStatus.getLog()));
		lsven_salidaVerificacionEstadoNegocioVo.setIs_resultado(avss_validateSystemStatus.getResult());
		return lsven_salidaVerificacionEstadoNegocioVo;
	}

	/**
	 * Metodo que convierte de VO a ComplexType (De Objeto de valores de Servicio,
	 * entrada del cliente bus; a elemento especifico del esquema de un Servicio
	 * Web, entrada de una peticion de Servicio SOAP).<br>
	 * Se usa para convertir un objeto con las entradas de un servicio web (objeto
	 * VO), a un objeto ComplexType para ser enviado en una operacion de un
	 * servicio. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> EntradaVerificacionEstadoNegocioVO
	 * <b>a</b> ValidateBusinessStatus, <br>
	 * En otras palabras, <b>de</b> Entrada verificacion estado negocio objeto con
	 * valores de servicio <b>a</b> Validate business status (ComplexType
	 * relacionado a la representacion XML del servicio).
	 *
	 * @param aeven_entradaVerificacionEstadoNegocioVo el parametro que representa
	 *                                                 el objeto con valores de
	 *                                                 servicio a convertir.
	 * @return Resultado para la conversion de objeto de valores de servicio a
	 *         complex type, en este caso como ValidateBusinessStatus.
	 */
	public static ValidateBusinessStatus voATipo(
			EntradaVerificacionEstadoNegocioVO aeven_entradaVerificacionEstadoNegocioVo) {
		ValidateBusinessStatus lvbs_validateBusinessStatus = new ValidateBusinessStatus();
		lvbs_validateBusinessStatus.setCompany(aeven_entradaVerificacionEstadoNegocioVo.getIs_empresa());
		lvbs_validateBusinessStatus.setPassword(aeven_entradaVerificacionEstadoNegocioVo.getIs_contrasena());
		lvbs_validateBusinessStatus.setBusiness(aeven_entradaVerificacionEstadoNegocioVo.getIs_negocio());
		lvbs_validateBusinessStatus.setBusinessType(aeven_entradaVerificacionEstadoNegocioVo.getIs_tipoNegocio());
		return lvbs_validateBusinessStatus;
	}
}
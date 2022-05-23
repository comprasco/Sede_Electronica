/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: AceptarTransaccionConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.converter
 * Nombre del elemento: AceptarTransaccionConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.converter;

import co.gov.supernotariado.bachue.clientebus.pasarela.types.aceptartransaccion.AcceptTransaction;
import co.gov.supernotariado.bachue.clientebus.pasarela.types.aceptartransaccion.AcceptTransactionDTO;
import co.gov.supernotariado.bachue.clientebus.vo.pasarela.EntradaAceptacionTransaccionVO;
import co.gov.supernotariado.bachue.clientebus.vo.pasarela.SalidaAceptacionTransaccionVO;

/**
 * Clase auxiliar (Converter) del proyecto Cliente BUS, que permite transformar
 * entre Value Object(VO) y ComplexType.<br>
 * <b>VO</b>, objeto que recibe o retorna el cliente de servicios cuando lo
 * invoca otra aplicacion o capa de negocio. <br>
 * <b>ComplexType</b>, objeto que representa un elemento especifico de un
 * esquema de servicios SOAP, relacionado a una representacion XML que sera
 * enviada o recibida al hacer ejecutar una operacion de un servicio. <br>
 * Contiene metodos de transformacion para el elemento u operacion Aceptar
 * transaccion. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class AceptarTransaccionConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase AceptarTransaccionConverter.
	 */
	private AceptarTransaccionConverter() {
		// Metodo constructor privado y vacio
	}

	/**
	 * Metodo que convierte de VO a ComplexType (De Objeto de valores de Servicio,
	 * entrada del cliente bus; a elemento especifico del esquema de un Servicio
	 * Web, entrada de una peticion de Servicio SOAP).<br>
	 * Se usa para convertir un objeto con las entradas de un servicio web (objeto
	 * VO), a un objeto ComplexType para ser enviado en una operacion de un
	 * servicio. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> EntradaAceptacionTransaccionVO <b>a</b>
	 * AcceptTransaction, <br>
	 * En otras palabras, <b>de</b> Entrada aceptacion transaccion objeto con
	 * valores de servicio <b>a</b> Accept transaction (ComplexType relacionado a la
	 * representacion XML del servicio).
	 *
	 * @param aeat_vo el parametro que representa el objeto con valores de servicio
	 *                a convertir.
	 * @return Resultado para la conversion de objeto de valores de servicio a
	 *         complex type, en este caso como AcceptTransaction.
	 */
	public static AcceptTransaction voATipo(EntradaAceptacionTransaccionVO aeat_vo) {

		AcceptTransaction lat_aceptacionTransaccion = new AcceptTransaction();

		lat_aceptacionTransaccion.setBusiness(aeat_vo.getIs_negocio());
		lat_aceptacionTransaccion.setBusinessType(aeat_vo.getIs_tipoNegocio());
		lat_aceptacionTransaccion.setCompany(aeat_vo.getIs_empresa());
		lat_aceptacionTransaccion.setPassword(aeat_vo.getIs_contrasena());
		lat_aceptacionTransaccion.setToken(aeat_vo.getIs_token());

		return lat_aceptacionTransaccion;
	}

	/**
	 * Metodo que convierte de ComplexType a VO ( De elemento especifico del esquema
	 * de un Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto con un resultado/salida de una peticion de
	 * Servicio SOAP, en un objeto de datos llamado VO; para ser retornado como
	 * resultado a la aplicacion o capa de negocio que consume el cliente de
	 * servicios. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> AcceptTransactionDTO <b>a</b>
	 * SalidaAceptacionTransaccionVO, <br>
	 * En otras palabras, <b>de</b> Accept transaction DTO (ComplexType relacionado
	 * a la representacion XML del servicio) <b>a</b> Salida aceptacion transaccion
	 * objeto con valores de servicio.
	 *
	 * @param aat_salidaAceptacionTransaccion el parametro que representa el complex
	 *                                        type a convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como SalidaAceptacionTransaccionVO.
	 */
	public static SalidaAceptacionTransaccionVO tipoAVo(AcceptTransactionDTO aat_salidaAceptacionTransaccion) {

		SalidaAceptacionTransaccionVO lsat_salidaAceptacionTransaccionVo = new SalidaAceptacionTransaccionVO();

		lsat_salidaAceptacionTransaccionVo
				.setIs_consecutivo(aat_salidaAceptacionTransaccion.getConsecutive().toString());
		lsat_salidaAceptacionTransaccionVo.setIs_resultado(aat_salidaAceptacionTransaccion.getResult());
		lsat_salidaAceptacionTransaccionVo.setIs_token(aat_salidaAceptacionTransaccion.getToken());
		lsat_salidaAceptacionTransaccionVo.setIs_log(LogConverter.tipoAVo(aat_salidaAceptacionTransaccion.getLog()));

		return lsat_salidaAceptacionTransaccionVo;
	}

}

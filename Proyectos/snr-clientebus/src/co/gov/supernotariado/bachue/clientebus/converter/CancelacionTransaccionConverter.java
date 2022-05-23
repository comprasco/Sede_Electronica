/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: CancelacionTransaccionConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.converter
 * Nombre del elemento: CancelacionTransaccionConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.converter;

import co.gov.supernotariado.bachue.clientebus.pasarela.types.cancelartransaccion.CancelTransaction;
import co.gov.supernotariado.bachue.clientebus.pasarela.types.cancelartransaccion.CancelTransactionDTO;
import co.gov.supernotariado.bachue.clientebus.vo.pasarela.EntradaCancelacionTransaccionVO;
import co.gov.supernotariado.bachue.clientebus.vo.pasarela.SalidaCancelacionTransaccionVO;

/**
 * Clase auxiliar (Converter) del proyecto Cliente BUS, que permite transformar
 * entre Value Object(VO) y ComplexType.<br>
 * <b>VO</b>, objeto que recibe o retorna el cliente de servicios cuando lo
 * invoca otra aplicacion o capa de negocio. <br>
 * <b>ComplexType</b>, objeto que representa un elemento especifico de un
 * esquema de servicios SOAP, relacionado a una representacion XML que sera
 * enviada o recibida al hacer ejecutar una operacion de un servicio. <br>
 * Contiene metodos de transformacion para el elemento u operacion Cancelacion
 * transaccion. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class CancelacionTransaccionConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * CancelacionTransaccionConverter.
	 */
	private CancelacionTransaccionConverter() {
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
	 * Especificamente convierte <b>de</b> EntradaCancelacionTransaccionVO <b>a</b>
	 * CancelTransaction, <br>
	 * En otras palabras, <b>de</b> Entrada cancelacion transaccion objeto con
	 * valores de servicio <b>a</b> Cancel transaction (ComplexType relacionado a la
	 * representacion XML del servicio).
	 *
	 * @param aect_vo el parametro que representa el objeto con valores de servicio
	 *                a convertir.
	 * @return Resultado para la conversion de objeto de valores de servicio a
	 *         complex type, en este caso como CancelTransaction.
	 */
	public static CancelTransaction voATipo(EntradaCancelacionTransaccionVO aect_vo) {

		CancelTransaction lect_tipoServicio = new CancelTransaction();

		lect_tipoServicio.setBusiness(aect_vo.getIs_negocio());
		lect_tipoServicio.setBusinessType(aect_vo.getIs_tipoNegocio());
		lect_tipoServicio.setCompany(aect_vo.getIs_empresa());
		lect_tipoServicio.setPassword(aect_vo.getIs_contrasena());
		lect_tipoServicio.setToken(aect_vo.getIs_token());

		return lect_tipoServicio;

	}

	/**
	 * Metodo que convierte de ComplexType a VO ( De elemento especifico del esquema
	 * de un Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto con un resultado/salida de una peticion de
	 * Servicio SOAP, en un objeto de datos llamado VO; para ser retornado como
	 * resultado a la aplicacion o capa de negocio que consume el cliente de
	 * servicios. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> CancelTransactionDTO <b>a</b>
	 * SalidaCancelacionTransaccionVO, <br>
	 * En otras palabras, <b>de</b> Cancel transaction DTO (ComplexType relacionado
	 * a la representacion XML del servicio) <b>a</b> Salida cancelacion transaccion
	 * objeto con valores de servicio.
	 *
	 * @param act_tipoServicio el parametro que representa el complex type a
	 *                         convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como SalidaCancelacionTransaccionVO.
	 */
	public static SalidaCancelacionTransaccionVO tipoAVo(CancelTransactionDTO act_tipoServicio) {

		SalidaCancelacionTransaccionVO lsct_cancelacionTransaccionVo = new SalidaCancelacionTransaccionVO();

		lsct_cancelacionTransaccionVo.setIs_consecutivo(act_tipoServicio.getConsecutive().toString());
		lsct_cancelacionTransaccionVo.setIs_log(LogConverter.tipoAVo(act_tipoServicio.getLog()));
		lsct_cancelacionTransaccionVo.setIs_resultado(act_tipoServicio.getResult());
		lsct_cancelacionTransaccionVo.setIs_token(act_tipoServicio.getToken());

		return lsct_cancelacionTransaccionVo;
	}

}

/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: CrearTransaccionFechaConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.converter
 * Nombre del elemento: CrearTransaccionFechaConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.converter;

import java.math.BigDecimal;

import co.gov.supernotariado.bachue.clientebus.pasarela.types.creartransaccion.CreateTransaction;
import co.gov.supernotariado.bachue.clientebus.pasarela.types.creartransaccion.CreateTransactionDTO;
import co.gov.supernotariado.bachue.clientebus.vo.pasarela.EntradaCreacionTransaccionVO;
import co.gov.supernotariado.bachue.clientebus.vo.pasarela.SalidaCreacionTransaccionVO;

/**
 * Clase auxiliar (Converter) del proyecto Cliente BUS, que permite transformar
 * entre Value Object(VO) y ComplexType.<br>
 * <b>VO</b>, objeto que recibe o retorna el cliente de servicios cuando lo
 * invoca otra aplicacion o capa de negocio. <br>
 * <b>ComplexType</b>, objeto que representa un elemento especifico de un
 * esquema de servicios SOAP, relacionado a una representacion XML que sera
 * enviada o recibida al hacer ejecutar una operacion de un servicio. <br>
 * Contiene metodos de transformacion para el elemento u operacion Crear
 * transaccion fecha. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class CrearTransaccionFechaConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * CrearTransaccionFechaConverter.
	 */
	private CrearTransaccionFechaConverter() {
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
	 * Especificamente convierte <b>de</b> CreateTransactionDTO <b>a</b>
	 * SalidaCreacionTransaccionVO, <br>
	 * En otras palabras, <b>de</b> Crea el/la transaction DTO (ComplexType
	 * relacionado a la representacion XML del servicio) <b>a</b> Salida creacion
	 * transaccion objeto con valores de servicio.
	 *
	 * @param act_createTransaction el parametro que representa el complex type a
	 *                              convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como SalidaCreacionTransaccionVO.
	 */
	public static SalidaCreacionTransaccionVO tipoAVo(CreateTransactionDTO act_createTransaction) {
		SalidaCreacionTransaccionVO lsct_salidaCreacionTransaccionVo = new SalidaCreacionTransaccionVO();
		lsct_salidaCreacionTransaccionVo.setIs_consecutivo(act_createTransaction.getConsecutive().toString());
		lsct_salidaCreacionTransaccionVo.setIsl_salidaLog(LogConverter.tipoAVo(act_createTransaction.getLog()));
		lsct_salidaCreacionTransaccionVo.setIs_enlacePago(act_createTransaction.getPaymentLink());
		lsct_salidaCreacionTransaccionVo.setIs_resultado(act_createTransaction.getResult());
		lsct_salidaCreacionTransaccionVo.setIs_token(act_createTransaction.getToken());
		return lsct_salidaCreacionTransaccionVo;
	}

	/**
	 * Metodo que convierte de VO a ComplexType (De Objeto de valores de Servicio,
	 * entrada del cliente bus; a elemento especifico del esquema de un Servicio
	 * Web, entrada de una peticion de Servicio SOAP).<br>
	 * Se usa para convertir un objeto con las entradas de un servicio web (objeto
	 * VO), a un objeto ComplexType para ser enviado en una operacion de un
	 * servicio. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> EntradaCreacionTransaccionVO <b>a</b>
	 * CreateTransaction, <br>
	 * En otras palabras, <b>de</b> Entrada creacion transaccion objeto con valores
	 * de servicio <b>a</b> Crea el/la transaction (ComplexType relacionado a la
	 * representacion XML del servicio).
	 *
	 * @param aect_entradaCreacionTransaccionVo el parametro que representa el
	 *                                          objeto con valores de servicio a
	 *                                          convertir.
	 * @return Resultado para la conversion de objeto de valores de servicio a
	 *         complex type, en este caso como CreateTransaction.
	 */
	public static CreateTransaction voATipo(EntradaCreacionTransaccionVO aect_entradaCreacionTransaccionVo) {
		CreateTransaction lct_createTransaction = new CreateTransaction();
		lct_createTransaction.setCompany(aect_entradaCreacionTransaccionVo.getIs_empresa());
		lct_createTransaction.setPassword(aect_entradaCreacionTransaccionVo.getIs_contrasena());
		lct_createTransaction.setBusiness(aect_entradaCreacionTransaccionVo.getIs_negocio());
		lct_createTransaction.setBusinessType(aect_entradaCreacionTransaccionVo.getIs_tipoNegocio());
		lct_createTransaction.setReference1(aect_entradaCreacionTransaccionVo.getIs_referencia1());
		lct_createTransaction.setReference2(aect_entradaCreacionTransaccionVo.getIs_referencia2());
		lct_createTransaction.setReference3(aect_entradaCreacionTransaccionVo.getIs_referencia3());
		lct_createTransaction.setReference4(aect_entradaCreacionTransaccionVo.getIs_referencia4());
		lct_createTransaction.setDescription(aect_entradaCreacionTransaccionVo.getIs_descripcion());
		lct_createTransaction.setValue(new BigDecimal(aect_entradaCreacionTransaccionVo.getIs_valor()));
		lct_createTransaction.setVat(new BigDecimal(aect_entradaCreacionTransaccionVo.getIs_iva()));
		lct_createTransaction.setTaxes(new BigDecimal(aect_entradaCreacionTransaccionVo.getIs_impuesto()));
		lct_createTransaction.setDocumentType(aect_entradaCreacionTransaccionVo.getIs_tipoDocumento());
		lct_createTransaction.setDocument(aect_entradaCreacionTransaccionVo.getIs_documento());
		lct_createTransaction.setName(aect_entradaCreacionTransaccionVo.getIs_nombreTitular());
		lct_createTransaction.setLastName(aect_entradaCreacionTransaccionVo.getIs_apellido());
		lct_createTransaction.setEmail(aect_entradaCreacionTransaccionVo.getIs_correo());
		lct_createTransaction.setPhone(aect_entradaCreacionTransaccionVo.getIs_telefono());
		return lct_createTransaction;
	}
}

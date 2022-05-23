/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: ConsultaTransaccionTokenConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.converter
 * Nombre del elemento: ConsultaTransaccionTokenConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.converter;

import co.gov.supernotariado.bachue.clientebus.pasarela.types.consultartransacciontoken.QueryTransactionByToken;
import co.gov.supernotariado.bachue.clientebus.pasarela.types.consultartransacciontoken.QueryTransactionByTokenDTO;
import co.gov.supernotariado.bachue.clientebus.vo.pasarela.EntradaConsultaTransaccionTokenVO;
import co.gov.supernotariado.bachue.clientebus.vo.pasarela.SalidaConsultaTransaccionTokenVO;

/**
 * Clase auxiliar (Converter) del proyecto Cliente BUS, que permite transformar
 * entre Value Object(VO) y ComplexType.<br>
 * <b>VO</b>, objeto que recibe o retorna el cliente de servicios cuando lo
 * invoca otra aplicacion o capa de negocio. <br>
 * <b>ComplexType</b>, objeto que representa un elemento especifico de un
 * esquema de servicios SOAP, relacionado a una representacion XML que sera
 * enviada o recibida al hacer ejecutar una operacion de un servicio. <br>
 * Contiene metodos de transformacion para el elemento u operacion Consulta
 * transaccion token. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ConsultaTransaccionTokenConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * ConsultaTransaccionTokenConverter.
	 */
	private ConsultaTransaccionTokenConverter() {
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
	 * Especificamente convierte <b>de</b> EntradaConsultaTransaccionTokenVO
	 * <b>a</b> QueryTransactionByToken, <br>
	 * En otras palabras, <b>de</b> Entrada consulta transaccion token objeto con
	 * valores de servicio <b>a</b> Query transaction by token (ComplexType
	 * relacionado a la representacion XML del servicio).
	 *
	 * @param aectt_vo el parametro que representa el objeto con valores de servicio
	 *                 a convertir.
	 * @return Resultado para la conversion de objeto de valores de servicio a
	 *         complex type, en este caso como QueryTransactionByToken.
	 */
	public static QueryTransactionByToken voATipo(EntradaConsultaTransaccionTokenVO aectt_vo) {

		QueryTransactionByToken lqtbt_consultaToken = new QueryTransactionByToken();

		lqtbt_consultaToken.setBusiness(aectt_vo.getIs_negocio());
		lqtbt_consultaToken.setBusinessType(aectt_vo.getIs_tipoNegocio());
		lqtbt_consultaToken.setCompany(aectt_vo.getIs_empresa());
		lqtbt_consultaToken.setPassword(aectt_vo.getIs_contrasena());
		lqtbt_consultaToken.setToken(aectt_vo.getIs_token());

		return lqtbt_consultaToken;

	}

	/**
	 * Metodo que convierte de ComplexType a VO ( De elemento especifico del esquema
	 * de un Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto con un resultado/salida de una peticion de
	 * Servicio SOAP, en un objeto de datos llamado VO; para ser retornado como
	 * resultado a la aplicacion o capa de negocio que consume el cliente de
	 * servicios. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> QueryTransactionByTokenDTO <b>a</b>
	 * SalidaConsultaTransaccionTokenVO, <br>
	 * En otras palabras, <b>de</b> Query transaction by token DTO (ComplexType
	 * relacionado a la representacion XML del servicio) <b>a</b> Salida consulta
	 * transaccion token objeto con valores de servicio.
	 *
	 * @param aqtbt_entidad el parametro que representa el complex type a convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como SalidaConsultaTransaccionTokenVO.
	 */
	public static SalidaConsultaTransaccionTokenVO tipoAVo(QueryTransactionByTokenDTO aqtbt_entidad) {

		SalidaConsultaTransaccionTokenVO lsctt_salidaConsutaTransaccionVo = new SalidaConsultaTransaccionTokenVO();

		lsctt_salidaConsutaTransaccionVo.setIs_horarioBanco(aqtbt_entidad.getBankHorary());
		lsctt_salidaConsutaTransaccionVo.setIs_codigoNegocio(aqtbt_entidad.getBusinessCode());
		lsctt_salidaConsutaTransaccionVo.setIs_nombreNegocio(aqtbt_entidad.getBusinessName());
		lsctt_salidaConsutaTransaccionVo.setIs_tipoCodigoNegocio(aqtbt_entidad.getBusinessTypeCode());
		lsctt_salidaConsutaTransaccionVo.setIs_tipoNombreNegocio(aqtbt_entidad.getBusinessTypeName());
		lsctt_salidaConsutaTransaccionVo.setIs_cicle(aqtbt_entidad.getCicle());
		lsctt_salidaConsutaTransaccionVo.setIs_nombreCompania(aqtbt_entidad.getCompanyName());
		lsctt_salidaConsutaTransaccionVo.setIs_consecutivo(aqtbt_entidad.getConsecutive().toString());
		lsctt_salidaConsutaTransaccionVo.setIs_cus(aqtbt_entidad.getCus());
		lsctt_salidaConsutaTransaccionVo.setIs_documento(aqtbt_entidad.getDocument());
		lsctt_salidaConsutaTransaccionVo.setIs_tipoDocumento(aqtbt_entidad.getDocumentType());
		lsctt_salidaConsutaTransaccionVo.setIs_correo(aqtbt_entidad.getEmail());
		lsctt_salidaConsutaTransaccionVo
				.setId_fechaFinal(aqtbt_entidad.getFinishDate().toGregorianCalendar().getTime());
		lsctt_salidaConsutaTransaccionVo.setIs_nombreUsuario(aqtbt_entidad.getFirstName());
		lsctt_salidaConsutaTransaccionVo
				.setId_fechaIngresos(aqtbt_entidad.getIncomeDate().toGregorianCalendar().getTime());
		lsctt_salidaConsutaTransaccionVo.setIs_esNotificado(aqtbt_entidad.getIsNotified());
		lsctt_salidaConsutaTransaccionVo.setIs_apellido(aqtbt_entidad.getLastName());
		lsctt_salidaConsutaTransaccionVo.setIs_notifiedCounter(aqtbt_entidad.getNotifiedCounter());
		lsctt_salidaConsutaTransaccionVo.setIs_telefono(aqtbt_entidad.getPhone());
		lsctt_salidaConsutaTransaccionVo.setIs_referencia1(aqtbt_entidad.getReference1());
		lsctt_salidaConsutaTransaccionVo.setIs_referencia2(aqtbt_entidad.getReference2());
		lsctt_salidaConsutaTransaccionVo.setIs_referencia3(aqtbt_entidad.getReference3());
		lsctt_salidaConsutaTransaccionVo.setIs_referencia4(aqtbt_entidad.getReference4());
		lsctt_salidaConsutaTransaccionVo
				.setId_fechaInicio(aqtbt_entidad.getStartDate().toGregorianCalendar().getTime());
		lsctt_salidaConsutaTransaccionVo.setIs_estatus(aqtbt_entidad.getStatus());
		lsctt_salidaConsutaTransaccionVo.setIs_valor(aqtbt_entidad.getValue().toString());
		lsctt_salidaConsutaTransaccionVo.setIs_valorAplicado(aqtbt_entidad.getValueApplied().toString());
		lsctt_salidaConsutaTransaccionVo.setIs_descripcion(aqtbt_entidad.getDescription());
		lsctt_salidaConsutaTransaccionVo.setIsl_log(LogConverter.tipoAVo(aqtbt_entidad.getLog()));
		lsctt_salidaConsutaTransaccionVo.setIs_enlacePago(aqtbt_entidad.getPaymentLink());
		lsctt_salidaConsutaTransaccionVo.setIs_tipoPago(aqtbt_entidad.getPaymentType());
		lsctt_salidaConsutaTransaccionVo.setIs_resultado(aqtbt_entidad.getResult());
		lsctt_salidaConsutaTransaccionVo.setIs_token(aqtbt_entidad.getToken());
		lsctt_salidaConsutaTransaccionVo.setIs_iva(aqtbt_entidad.getVat().toString());

		return lsctt_salidaConsutaTransaccionVo;
	}

}

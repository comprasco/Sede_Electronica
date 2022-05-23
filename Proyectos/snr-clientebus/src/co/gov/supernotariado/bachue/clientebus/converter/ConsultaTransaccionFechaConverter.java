/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: ConsultaTransaccionFechaConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.converter
 * Nombre del elemento: ConsultaTransaccionFechaConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.converter;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.clientebus.pasarela.types.consultartransacciondate.QueryTransactionByDate;
import co.gov.supernotariado.bachue.clientebus.pasarela.types.consultartransacciondate.QueryTransactionByDateDTO;
import co.gov.supernotariado.bachue.clientebus.pasarela.types.consultartransacciontoken.QueryTransactionByTokenDTO;
import co.gov.supernotariado.bachue.clientebus.vo.pasarela.EntradaConsultaTransaccionFechaVO;
import co.gov.supernotariado.bachue.clientebus.vo.pasarela.SalidaConsultaTransaccionFechaVO;
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
 * transaccion fecha. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ConsultaTransaccionFechaConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * ConsultaTransaccionFechaConverter.
	 */
	private ConsultaTransaccionFechaConverter() {
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
	 * Especificamente convierte <b>de</b> EntradaConsultaTransaccionFechaVO
	 * <b>a</b> QueryTransactionByDate, <br>
	 * En otras palabras, <b>de</b> Entrada consulta transaccion fecha objeto con
	 * valores de servicio <b>a</b> Query transaction by date (ComplexType
	 * relacionado a la representacion XML del servicio).
	 *
	 * @param aectf_vo el parametro que representa el objeto con valores de servicio
	 *                 a convertir.
	 * @return Resultado para la conversion de objeto de valores de servicio a
	 *         complex type, en este caso como QueryTransactionByDate.
	 */
	public static QueryTransactionByDate voATipo(EntradaConsultaTransaccionFechaVO aectf_vo) {

		QueryTransactionByDate lqtbd_consultaFecha = new QueryTransactionByDate();

		lqtbd_consultaFecha.setBusiness(aectf_vo.getIs_negocio());
		lqtbd_consultaFecha.setBusinessType(aectf_vo.getIs_tipoNegocio());
		lqtbd_consultaFecha.setCompany(aectf_vo.getIs_empresa());
		lqtbd_consultaFecha.setPassword(aectf_vo.getIs_contrasena());
		lqtbd_consultaFecha.setDate(aectf_vo.getIs_fecha());

		return lqtbd_consultaFecha;
	}

	/**
	 * Metodo que convierte de ComplexType a VO ( De elemento especifico del esquema
	 * de un Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto con un resultado/salida de una peticion de
	 * Servicio SOAP, en un objeto de datos llamado VO; para ser retornado como
	 * resultado a la aplicacion o capa de negocio que consume el cliente de
	 * servicios. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> QueryTransactionByDateDTO <b>a</b>
	 * SalidaConsultaTransaccionFechaVO, <br>
	 * En otras palabras, <b>de</b> Query transaction by date DTO (ComplexType
	 * relacionado a la representacion XML del servicio) <b>a</b> Salida consulta
	 * transaccion fecha objeto con valores de servicio.
	 *
	 * @param aqtbd_tipoServicio el parametro que representa el complex type a
	 *                           convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como SalidaConsultaTransaccionFechaVO.
	 */
	public static SalidaConsultaTransaccionFechaVO tipoAVo(QueryTransactionByDateDTO aqtbd_tipoServicio) {

		SalidaConsultaTransaccionFechaVO lsctf_salidaAceptacionTransaccionVo = new SalidaConsultaTransaccionFechaVO();
		List<SalidaConsultaTransaccionTokenVO> llsctt_transacciones = new ArrayList<>();

		for (QueryTransactionByTokenDTO lqtbt_transacciones : aqtbd_tipoServicio.getTransacciones()) {

			SalidaConsultaTransaccionTokenVO lsctt_transaccion = new SalidaConsultaTransaccionTokenVO();

			lsctt_transaccion.setIs_horarioBanco(lqtbt_transacciones.getBankHorary());
			lsctt_transaccion.setIs_codigoNegocio(lqtbt_transacciones.getBusinessCode());
			lsctt_transaccion.setIs_nombreNegocio(lqtbt_transacciones.getBusinessName());
			lsctt_transaccion.setIs_tipoCodigoNegocio(lqtbt_transacciones.getBusinessTypeCode());
			lsctt_transaccion.setIs_tipoNombreNegocio(lqtbt_transacciones.getBusinessTypeName());
			lsctt_transaccion.setIs_cicle(lqtbt_transacciones.getCicle());
			lsctt_transaccion.setIs_nombreCompania(lqtbt_transacciones.getCompanyName());
			lsctt_transaccion.setIs_consecutivo(lqtbt_transacciones.getConsecutive().toString());
			lsctt_transaccion.setIs_cus(lqtbt_transacciones.getCus());
			lsctt_transaccion.setIs_documento(lqtbt_transacciones.getDocument());
			lsctt_transaccion.setIs_tipoDocumento(lqtbt_transacciones.getDocumentType());
			lsctt_transaccion.setIs_correo(lqtbt_transacciones.getEmail());
			lsctt_transaccion.setId_fechaFinal(lqtbt_transacciones.getFinishDate().toGregorianCalendar().getTime());
			lsctt_transaccion.setIs_nombreUsuario(lqtbt_transacciones.getFirstName());
			lsctt_transaccion.setId_fechaIngresos(lqtbt_transacciones.getIncomeDate().toGregorianCalendar().getTime());
			lsctt_transaccion.setIs_esNotificado(lqtbt_transacciones.getIsNotified());
			lsctt_transaccion.setIs_apellido(lqtbt_transacciones.getLastName());
			lsctt_transaccion.setIs_notifiedCounter(lqtbt_transacciones.getNotifiedCounter());
			lsctt_transaccion.setIs_telefono(lqtbt_transacciones.getPhone());
			lsctt_transaccion.setIs_referencia1(lqtbt_transacciones.getReference1());
			lsctt_transaccion.setIs_referencia2(lqtbt_transacciones.getReference2());
			lsctt_transaccion.setIs_referencia3(lqtbt_transacciones.getReference3());
			lsctt_transaccion.setIs_referencia4(lqtbt_transacciones.getReference4());
			lsctt_transaccion.setId_fechaInicio(lqtbt_transacciones.getStartDate().toGregorianCalendar().getTime());
			lsctt_transaccion.setIs_estatus(lqtbt_transacciones.getStatus());
			lsctt_transaccion.setIs_valor(lqtbt_transacciones.getValue().toString());
			lsctt_transaccion.setIs_valorAplicado(lqtbt_transacciones.getValueApplied().toString());
			lsctt_transaccion.setIs_descripcion(lqtbt_transacciones.getDescription());
			lsctt_transaccion.setIsl_log(LogConverter.tipoAVo(lqtbt_transacciones.getLog()));
			lsctt_transaccion.setIs_enlacePago(lqtbt_transacciones.getPaymentLink());
			lsctt_transaccion.setIs_tipoPago(lqtbt_transacciones.getPaymentType());
			lsctt_transaccion.setIs_resultado(lqtbt_transacciones.getResult());
			lsctt_transaccion.setIs_token(lqtbt_transacciones.getToken());
			lsctt_transaccion.setIs_iva(lqtbt_transacciones.getVat().toString());
			llsctt_transacciones.add(lsctt_transaccion);

		}

		lsctf_salidaAceptacionTransaccionVo.setIs_resultado(aqtbd_tipoServicio.getResult());
		lsctf_salidaAceptacionTransaccionVo.setIs_consecutivo(aqtbd_tipoServicio.getConsecutive().toString());
		lsctf_salidaAceptacionTransaccionVo.setIs_log(LogConverter.tipoAVo(aqtbd_tipoServicio.getLog()));

		lsctf_salidaAceptacionTransaccionVo.setIlsctt_listaTransaccionesToken(llsctt_transacciones);

		return lsctf_salidaAceptacionTransaccionVo;
	}

}

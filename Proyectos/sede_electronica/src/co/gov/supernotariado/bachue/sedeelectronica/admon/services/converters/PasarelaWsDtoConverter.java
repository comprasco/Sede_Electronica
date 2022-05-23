/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: PasarelaWsDtoConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters
 * Nombre del elemento: PasarelaWsDtoConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters;

import co.gov.supernotariado.bachue.clientebus.vo.pasarela.EntradaAceptacionTransaccionVO;
import co.gov.supernotariado.bachue.clientebus.vo.pasarela.EntradaConsultaTransaccionTokenVO;
import co.gov.supernotariado.bachue.clientebus.vo.pasarela.EntradaCreacionTransaccionVO;
import co.gov.supernotariado.bachue.clientebus.vo.pasarela.EntradaVerificacionEstadoNegocioVO;
import co.gov.supernotariado.bachue.clientebus.vo.pasarela.SalidaAceptacionTransaccionVO;
import co.gov.supernotariado.bachue.clientebus.vo.pasarela.SalidaConsultaTransaccionTokenVO;
import co.gov.supernotariado.bachue.clientebus.vo.pasarela.SalidaCreacionTransaccionVO;
import co.gov.supernotariado.bachue.clientebus.vo.pasarela.SalidaVerificacionEstadoNegocioVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.pasarelarealpay.wsdto.EntradaAceptacionTransaccionWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.pasarelarealpay.wsdto.EntradaConsultaTransaccionTokenWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.pasarelarealpay.wsdto.EntradaCreacionTransaccionWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.pasarelarealpay.wsdto.EntradaVerificacionEstadoNegocioWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.pasarelarealpay.wsdto.ResumenPagoPasarelaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.pasarelarealpay.wsdto.SalidaAceptacionTransaccionWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.pasarelarealpay.wsdto.SalidaConsultaTransaccionTokenWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.pasarelarealpay.wsdto.SalidaCreacionTransaccionWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.pasarelarealpay.wsdto.SalidaVerificacionEstadoNegocioWSDTO;

/**
 * Clase auxiliar(converter) que permite transformar un Value Object (VO, objeto
 * que recibe el cliente de servicios) a un objeto WsDto (Objeto de
 * transferencia de datos de servicio web), y viceversa. <br>
 * Contiene operaciones de transformacion para el VO y el WsDto Pasarela ws dto.
 * <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class PasarelaWsDtoConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase PasarelaWsDtoConverter.
	 */
	private PasarelaWsDtoConverter() {
		// Constructor vacio de la clase
	}

	/**
	 * Metodo que convierte de VO a WSDTO (De Objeto de valores de Servicio, a
	 * Objeto de Transferencia de Datos de Servicio Web).<br>
	 * Se usa para convertir el resultado o salida de servicio(objeto VO) a un
	 * objeto WSDTO para ser manipulado en la capa de negocio. <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> SalidaVerificacionEstadoNegocioVO
	 * <b>a</b> SalidaVerificacionEstadoNegocioWSDTO, <br>
	 * En otras palabras, <b>de</b> Salida verificacion estado negocio objeto con
	 * valores de servicio <b>a</b> Salida verificacion estado negocio web service
	 * dto.
	 *
	 * @param asven_verificacionEstadoNegocio el parametro verificacion estado
	 *                                        negocio
	 * @return Resultado para convertir objeto de valores de servicio a web service
	 *         dto, retornado como SalidaVerificacionEstadoNegocioWSDTO
	 */
	public static SalidaVerificacionEstadoNegocioWSDTO voAEntidad(
			SalidaVerificacionEstadoNegocioVO asven_verificacionEstadoNegocio) {
		SalidaVerificacionEstadoNegocioWSDTO lsven_salidaVerificacionEstadoNegocioVo = new SalidaVerificacionEstadoNegocioWSDTO();
		lsven_salidaVerificacionEstadoNegocioVo.setIs_consecutive(asven_verificacionEstadoNegocio.getIs_consecutivo());
		lsven_salidaVerificacionEstadoNegocioVo
				.setIs_log(LogWsDtoConverter.entidadAVo(asven_verificacionEstadoNegocio.getIs_log()));
		lsven_salidaVerificacionEstadoNegocioVo.setIs_result(asven_verificacionEstadoNegocio.getIs_resultado());
		return lsven_salidaVerificacionEstadoNegocioVo;
	}

	/**
	 * Metodo que convierte de WSDTO a VO ( De Objeto de Transferencia de Datos de
	 * Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto WSDTO manipulado en la capa de negocio, en
	 * una entrada de datos para consumir una operacion de un servicio(objeto VO).
	 * <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> EntradaVerificacionEstadoNegocioWSDTO
	 * <b>a</b> EntradaVerificacionEstadoNegocioVO, <br>
	 * En otras palabras, <b>de</b> Entrada verificacion estado negocio web service
	 * dto <b>a</b> Entrada verificacion estado negocio objeto con valores de
	 * servicio.
	 *
	 * @param aeven_entradaVerificacionEstadoNegocioVo el parametro entrada
	 *                                                 verificacion estado negocio
	 *                                                 vo
	 * @return Resultado para convertir web service dto a objeto de valores de
	 *         servicio, retornado como EntradaVerificacionEstadoNegocioVO
	 */
	public static EntradaVerificacionEstadoNegocioVO entidadAVo(
			EntradaVerificacionEstadoNegocioWSDTO aeven_entradaVerificacionEstadoNegocioVo) {
		EntradaVerificacionEstadoNegocioVO leven_validateBusinessStatus = new EntradaVerificacionEstadoNegocioVO();
		leven_validateBusinessStatus.setIs_empresa(aeven_entradaVerificacionEstadoNegocioVo.getIs_company());
		leven_validateBusinessStatus.setIs_contrasena(aeven_entradaVerificacionEstadoNegocioVo.getIs_password());
		leven_validateBusinessStatus.setIs_negocio(aeven_entradaVerificacionEstadoNegocioVo.getIs_business());
		leven_validateBusinessStatus.setIs_tipoNegocio(aeven_entradaVerificacionEstadoNegocioVo.getIs_businessType());

		return leven_validateBusinessStatus;
	}

	/**
	 * Metodo que convierte de VO a WSDTO (De Objeto de valores de Servicio, a
	 * Objeto de Transferencia de Datos de Servicio Web).<br>
	 * Se usa para convertir el resultado o salida de servicio(objeto VO) a un
	 * objeto WSDTO para ser manipulado en la capa de negocio. <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> SalidaCreacionTransaccionVO <b>a</b>
	 * SalidaCreacionTransaccionWSDTO, <br>
	 * En otras palabras, <b>de</b> Salida creacion transaccion objeto con valores
	 * de servicio <b>a</b> Salida creacion transaccion web service dto.
	 *
	 * @param asct_createTransaction el parametro create transaction
	 * @return Resultado para convertir objeto de valores de servicio a web service
	 *         dto, retornado como SalidaCreacionTransaccionWSDTO
	 */
	public static SalidaCreacionTransaccionWSDTO voAEntidad(SalidaCreacionTransaccionVO asct_createTransaction) {
		SalidaCreacionTransaccionWSDTO lsct_salidaCreacionTransaccionVo = new SalidaCreacionTransaccionWSDTO();
		lsct_salidaCreacionTransaccionVo.setIs_consecutive(asct_createTransaction.getIs_consecutivo());
		lsct_salidaCreacionTransaccionVo
				.setIs_log(LogWsDtoConverter.entidadAVo(asct_createTransaction.getIsl_salidaLog()));
		lsct_salidaCreacionTransaccionVo.setIs_paymentLink(asct_createTransaction.getIs_enlacePago());
		lsct_salidaCreacionTransaccionVo.setIs_result(asct_createTransaction.getIs_resultado());
		lsct_salidaCreacionTransaccionVo.setIs_token(asct_createTransaction.getIs_token());

		return lsct_salidaCreacionTransaccionVo;
	}

	/**
	 * Metodo que convierte de WSDTO a VO ( De Objeto de Transferencia de Datos de
	 * Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto WSDTO manipulado en la capa de negocio, en
	 * una entrada de datos para consumir una operacion de un servicio(objeto VO).
	 * <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> EntradaCreacionTransaccionWSDTO <b>a</b>
	 * EntradaCreacionTransaccionVO, <br>
	 * En otras palabras, <b>de</b> Entrada creacion transaccion web service dto
	 * <b>a</b> Entrada creacion transaccion objeto con valores de servicio.
	 *
	 * @param aect_entradaCreacionTransaccionVo el parametro entrada creacion
	 *                                          transaccion vo
	 * @return Resultado para convertir web service dto a objeto de valores de
	 *         servicio, retornado como EntradaCreacionTransaccionVO
	 */
	public static EntradaCreacionTransaccionVO entidadAVo(
			EntradaCreacionTransaccionWSDTO aect_entradaCreacionTransaccionVo) {
		EntradaCreacionTransaccionVO lect_createTransaction = new EntradaCreacionTransaccionVO();

		lect_createTransaction.setIs_empresa(aect_entradaCreacionTransaccionVo.getIs_company());
		lect_createTransaction.setIs_contrasena(aect_entradaCreacionTransaccionVo.getIs_password());
		lect_createTransaction.setIs_negocio(aect_entradaCreacionTransaccionVo.getIs_business());
		lect_createTransaction.setIs_tipoNegocio(aect_entradaCreacionTransaccionVo.getIs_businessType());
		lect_createTransaction.setIs_referencia1(aect_entradaCreacionTransaccionVo.getIs_reference1());
		lect_createTransaction.setIs_referencia2(aect_entradaCreacionTransaccionVo.getIs_reference2());
		lect_createTransaction.setIs_referencia3(aect_entradaCreacionTransaccionVo.getIs_reference3());
		lect_createTransaction.setIs_referencia4(aect_entradaCreacionTransaccionVo.getIs_reference4());
		lect_createTransaction.setIs_descripcion(aect_entradaCreacionTransaccionVo.getIs_description());
		lect_createTransaction.setIs_valor(aect_entradaCreacionTransaccionVo.getIs_value());
		lect_createTransaction.setIs_iva(aect_entradaCreacionTransaccionVo.getIs_vat());
		lect_createTransaction.setIs_impuesto(aect_entradaCreacionTransaccionVo.getIs_taxes());
		lect_createTransaction.setIs_tipoDocumento(aect_entradaCreacionTransaccionVo.getIs_documentType());
		lect_createTransaction.setIs_documento(aect_entradaCreacionTransaccionVo.getIs_document());
		lect_createTransaction.setIs_nombreTitular(aect_entradaCreacionTransaccionVo.getIs_lastname());
		lect_createTransaction.setIs_apellido(aect_entradaCreacionTransaccionVo.getIs_lastname());
		lect_createTransaction.setIs_correo(aect_entradaCreacionTransaccionVo.getIs_email());
		lect_createTransaction.setIs_telefono(aect_entradaCreacionTransaccionVo.getIs_phone());

		return lect_createTransaction;
	}

	/**
	 * Metodo que convierte de WSDTO a VO ( De Objeto de Transferencia de Datos de
	 * Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto WSDTO manipulado en la capa de negocio, en
	 * una entrada de datos para consumir una operacion de un servicio(objeto VO).
	 * <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> EntradaAceptacionTransaccionWSDTO
	 * <b>a</b> EntradaAceptacionTransaccionVO, <br>
	 * En otras palabras, <b>de</b> Entrada aceptacion transaccion web service dto
	 * <b>a</b> Entrada aceptacion transaccion objeto con valores de servicio.
	 *
	 * @param aeat_entidad el parametro entidad
	 * @return Resultado para convertir web service dto a objeto de valores de
	 *         servicio, retornado como EntradaAceptacionTransaccionVO
	 */
	public static EntradaAceptacionTransaccionVO entidadAVo(EntradaAceptacionTransaccionWSDTO aeat_entidad) {

		EntradaAceptacionTransaccionVO leat_aceptacionTransaccion = new EntradaAceptacionTransaccionVO();

		leat_aceptacionTransaccion.setIs_negocio(aeat_entidad.getIs_business());
		leat_aceptacionTransaccion.setIs_tipoNegocio(aeat_entidad.getIs_businessType());
		leat_aceptacionTransaccion.setIs_empresa(aeat_entidad.getIs_company());
		leat_aceptacionTransaccion.setIs_contrasena(aeat_entidad.getIs_password());
		leat_aceptacionTransaccion.setIs_token(aeat_entidad.getIs_token());

		return leat_aceptacionTransaccion;

	}

	/**
	 * Metodo que convierte de VO a WSDTO (De Objeto de valores de Servicio, a
	 * Objeto de Transferencia de Datos de Servicio Web).<br>
	 * Se usa para convertir el resultado o salida de servicio(objeto VO) a un
	 * objeto WSDTO para ser manipulado en la capa de negocio. <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> SalidaAceptacionTransaccionVO <b>a</b>
	 * SalidaAceptacionTransaccionWSDTO, <br>
	 * En otras palabras, <b>de</b> Salida aceptacion transaccion objeto con valores
	 * de servicio <b>a</b> Salida aceptacion transaccion web service dto.
	 *
	 * @param asat_salidaAceptacionTransaccion el parametro salida aceptacion
	 *                                         transaccion
	 * @return Resultado para convertir objeto de valores de servicio a web service
	 *         dto, retornado como SalidaAceptacionTransaccionWSDTO
	 */
	public static SalidaAceptacionTransaccionWSDTO voAEntidad(
			SalidaAceptacionTransaccionVO asat_salidaAceptacionTransaccion) {

		SalidaAceptacionTransaccionWSDTO lsat_salidaAceptacionTransaccionVo = new SalidaAceptacionTransaccionWSDTO();

		lsat_salidaAceptacionTransaccionVo.setIs_consecutive(asat_salidaAceptacionTransaccion.getIs_consecutivo());
		lsat_salidaAceptacionTransaccionVo.setIs_result(asat_salidaAceptacionTransaccion.getIs_resultado());
		lsat_salidaAceptacionTransaccionVo.setIs_token(asat_salidaAceptacionTransaccion.getIs_token());
		lsat_salidaAceptacionTransaccionVo
				.setIs_log(LogWsDtoConverter.entidadAVo(asat_salidaAceptacionTransaccion.getIs_log()));
		lsat_salidaAceptacionTransaccionVo.setIs_url(asat_salidaAceptacionTransaccion.getIs_urlRetorno());

		return lsat_salidaAceptacionTransaccionVo;
	}

	/**
	 * Metodo que convierte de WSDTO a VO ( De Objeto de Transferencia de Datos de
	 * Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto WSDTO manipulado en la capa de negocio, en
	 * una entrada de datos para consumir una operacion de un servicio(objeto VO).
	 * <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> EntradaConsultaTransaccionTokenWSDTO
	 * <b>a</b> EntradaConsultaTransaccionTokenVO, <br>
	 * En otras palabras, <b>de</b> Entrada consulta transaccion token web service
	 * dto <b>a</b> Entrada consulta transaccion token objeto con valores de
	 * servicio.
	 *
	 * @param aectt_transaccion el parametro transaccion
	 * @return Resultado para convertir web service dto a objeto de valores de
	 *         servicio, retornado como EntradaConsultaTransaccionTokenVO
	 */
	public static EntradaConsultaTransaccionTokenVO entidadAVo(EntradaConsultaTransaccionTokenWSDTO aectt_transaccion) {

		EntradaConsultaTransaccionTokenVO lectt_entradaConsultaTransaccion = new EntradaConsultaTransaccionTokenVO();

		lectt_entradaConsultaTransaccion.setIs_negocio(aectt_transaccion.getIs_business());
		lectt_entradaConsultaTransaccion.setIs_tipoNegocio(aectt_transaccion.getIs_businessType());
		lectt_entradaConsultaTransaccion.setIs_empresa(aectt_transaccion.getIs_company());
		lectt_entradaConsultaTransaccion.setIs_contrasena(aectt_transaccion.getIs_password());
		lectt_entradaConsultaTransaccion.setIs_token(aectt_transaccion.getIs_token());

		return lectt_entradaConsultaTransaccion;

	}

	/**
	 * Metodo que convierte de VO a WSDTO (De Objeto de valores de Servicio, a
	 * Objeto de Transferencia de Datos de Servicio Web).<br>
	 * Se usa para convertir el resultado o salida de servicio(objeto VO) a un
	 * objeto WSDTO para ser manipulado en la capa de negocio. <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> SalidaConsultaTransaccionTokenVO <b>a</b>
	 * SalidaConsultaTransaccionTokenWSDTO, <br>
	 * En otras palabras, <b>de</b> Salida consulta transaccion token objeto con
	 * valores de servicio <b>a</b> Salida consulta transaccion token web service
	 * dto.
	 *
	 * @param lsctt_salidaConsultaTransaccionToken el parametro lsctt salida
	 *                                             consulta transaccion token
	 * @return Resultado para convertir objeto de valores de servicio a web service
	 *         dto, retornado como SalidaConsultaTransaccionTokenWSDTO
	 */
	public static SalidaConsultaTransaccionTokenWSDTO voAEntidad(
			SalidaConsultaTransaccionTokenVO lsctt_salidaConsultaTransaccionToken) {

		SalidaConsultaTransaccionTokenWSDTO lscttw_salidaConusltaTransaccion = new SalidaConsultaTransaccionTokenWSDTO();

		lscttw_salidaConusltaTransaccion
				.setId_finishDate(lsctt_salidaConsultaTransaccionToken.getId_fechaFinal().toString());
		lscttw_salidaConusltaTransaccion
				.setId_incomeDate(lsctt_salidaConsultaTransaccionToken.getId_fechaIngresos().toString());
		lscttw_salidaConusltaTransaccion
				.setIs_startDate(lsctt_salidaConsultaTransaccionToken.getId_fechaInicio().toString());
		lscttw_salidaConusltaTransaccion.setIs_bankHorary(lsctt_salidaConsultaTransaccionToken.getIs_horarioBanco());
		lscttw_salidaConusltaTransaccion.setIs_businessCode(lsctt_salidaConsultaTransaccionToken.getIs_codigoNegocio());
		lscttw_salidaConusltaTransaccion.setIs_businessName(lsctt_salidaConsultaTransaccionToken.getIs_nombreNegocio());
		lscttw_salidaConusltaTransaccion
				.setIs_businessTypeCode(lsctt_salidaConsultaTransaccionToken.getIs_tipoCodigoNegocio());
		lscttw_salidaConusltaTransaccion
				.setIs_businessTypeName(lsctt_salidaConsultaTransaccionToken.getIs_tipoNombreNegocio());
		lscttw_salidaConusltaTransaccion.setIs_cicle(lsctt_salidaConsultaTransaccionToken.getIs_cicle());
		lscttw_salidaConusltaTransaccion.setIs_companyName(lsctt_salidaConsultaTransaccionToken.getIs_nombreCompania());
		lscttw_salidaConusltaTransaccion.setIs_consecutive(lsctt_salidaConsultaTransaccionToken.getIs_consecutivo());
		lscttw_salidaConusltaTransaccion.setIs_cus(lsctt_salidaConsultaTransaccionToken.getIs_cus());
		lscttw_salidaConusltaTransaccion.setIs_description(lsctt_salidaConsultaTransaccionToken.getIs_descripcion());
		lscttw_salidaConusltaTransaccion.setIs_document(lsctt_salidaConsultaTransaccionToken.getIs_documento());
		lscttw_salidaConusltaTransaccion.setIs_documentType(lsctt_salidaConsultaTransaccionToken.getIs_tipoDocumento());
		lscttw_salidaConusltaTransaccion.setIs_email(lsctt_salidaConsultaTransaccionToken.getIs_correo());
		lscttw_salidaConusltaTransaccion.setIs_firstName(lsctt_salidaConsultaTransaccionToken.getIs_nombreUsuario());
		lscttw_salidaConusltaTransaccion.setIs_isNotified(lsctt_salidaConsultaTransaccionToken.getIs_esNotificado());
		lscttw_salidaConusltaTransaccion.setIs_paymentLink(lsctt_salidaConsultaTransaccionToken.getIs_enlacePago());
		lscttw_salidaConusltaTransaccion.setIs_paymentType(lsctt_salidaConsultaTransaccionToken.getIs_tipoPago());
		lscttw_salidaConusltaTransaccion.setIs_phone(lsctt_salidaConsultaTransaccionToken.getIs_telefono());
		lscttw_salidaConusltaTransaccion.setIs_reference1(lsctt_salidaConsultaTransaccionToken.getIs_referencia1());
		lscttw_salidaConusltaTransaccion.setIs_reference2(lsctt_salidaConsultaTransaccionToken.getIs_referencia2());
		lscttw_salidaConusltaTransaccion.setIs_reference3(lsctt_salidaConsultaTransaccionToken.getIs_referencia3());
		lscttw_salidaConusltaTransaccion.setIs_reference4(lsctt_salidaConsultaTransaccionToken.getIs_referencia4());
		lscttw_salidaConusltaTransaccion.setIs_result(lsctt_salidaConsultaTransaccionToken.getIs_resultado());
		lscttw_salidaConusltaTransaccion.setIs_status(lsctt_salidaConsultaTransaccionToken.getIs_estatus());
		lscttw_salidaConusltaTransaccion.setIs_token(lsctt_salidaConsultaTransaccionToken.getIs_token());
		lscttw_salidaConusltaTransaccion.setIs_value(lsctt_salidaConsultaTransaccionToken.getIs_valor());
		lscttw_salidaConusltaTransaccion.setIs_valueApplied(lsctt_salidaConsultaTransaccionToken.getIs_valorAplicado());
		lscttw_salidaConusltaTransaccion.setIs_vat(lsctt_salidaConsultaTransaccionToken.getIs_iva());
		lscttw_salidaConusltaTransaccion
				.setIs_log(LogWsDtoConverter.entidadAVo(lsctt_salidaConsultaTransaccionToken.getIsl_log()));
		return lscttw_salidaConusltaTransaccion;
	}

	/**
	 * Dto transaccion A dtoresumen.
	 *
	 * @param asctt_transaccion el parametro transaccion
	 * @return Resultado para dto transaccion A dtoresumen retornado como
	 *         ResumenPagoPasarelaWSDTO
	 */
	public static ResumenPagoPasarelaWSDTO dtoTransaccionADtoresumen(
			SalidaConsultaTransaccionTokenWSDTO asctt_transaccion) {

		ResumenPagoPasarelaWSDTO lrppw_resumenPagoPasarela = new ResumenPagoPasarelaWSDTO();

		lrppw_resumenPagoPasarela.setIs_apellido(asctt_transaccion.getIs_lastName());
		lrppw_resumenPagoPasarela.setIs_codigoOperacion(asctt_transaccion.getIs_consecutive());
		lrppw_resumenPagoPasarela.setIs_correoElectronico(asctt_transaccion.getIs_email());
		lrppw_resumenPagoPasarela.setIs_estado(asctt_transaccion.getIs_status());

		if (asctt_transaccion.getId_incomeDate() != null)
			lrppw_resumenPagoPasarela.setIs_fecha(asctt_transaccion.getId_incomeDate());

		lrppw_resumenPagoPasarela.setIs_ip(asctt_transaccion.getIs_reference2());
		lrppw_resumenPagoPasarela.setIs_referenciaPago(asctt_transaccion.getIs_reference1());
		lrppw_resumenPagoPasarela.setIs_nombre(asctt_transaccion.getIs_firstName());
		lrppw_resumenPagoPasarela.setIs_numeroDocumento(asctt_transaccion.getIs_document());
		lrppw_resumenPagoPasarela.setIs_numeroProducto(asctt_transaccion.getIs_businessName());
		lrppw_resumenPagoPasarela.setIs_numeroTelefono(asctt_transaccion.getIs_phone());
		lrppw_resumenPagoPasarela.setIs_receptorPago(asctt_transaccion.getIs_companyName());
		lrppw_resumenPagoPasarela.setIs_resultadoTransaccion(asctt_transaccion.getIs_result());
		lrppw_resumenPagoPasarela.setIs_totalPagado(asctt_transaccion.getIs_value());
		lrppw_resumenPagoPasarela.setIs_cus(asctt_transaccion.getIs_cus());

		return lrppw_resumenPagoPasarela;

	}

}

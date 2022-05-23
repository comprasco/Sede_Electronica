/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: ServicioPasarela.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.fabrica
 * Nombre del elemento: ServicioPasarela
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.fabrica;

import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;

import org.apache.log4j.Logger;

import co.gov.supernotariado.bachue.clientebus.converter.AceptarTransaccionConverter;
import co.gov.supernotariado.bachue.clientebus.converter.CancelacionTransaccionConverter;
import co.gov.supernotariado.bachue.clientebus.converter.ConsultaTransaccionFechaConverter;
import co.gov.supernotariado.bachue.clientebus.converter.ConsultaTransaccionTokenConverter;
import co.gov.supernotariado.bachue.clientebus.converter.CrearTransaccionFechaConverter;
import co.gov.supernotariado.bachue.clientebus.converter.VerificacionTransaccionConverter;
import co.gov.supernotariado.bachue.clientebus.enums.EnumLog;
import co.gov.supernotariado.bachue.clientebus.enums.EnumOperacionesSoap;
import co.gov.supernotariado.bachue.clientebus.pasarela.operacion.RealPayPort;
import co.gov.supernotariado.bachue.clientebus.pasarela.types.aceptartransaccion.AcceptTransaction;
import co.gov.supernotariado.bachue.clientebus.pasarela.types.aceptartransaccion.AcceptTransactionDTO;
import co.gov.supernotariado.bachue.clientebus.pasarela.types.cancelartransaccion.CancelTransaction;
import co.gov.supernotariado.bachue.clientebus.pasarela.types.cancelartransaccion.CancelTransactionDTO;
import co.gov.supernotariado.bachue.clientebus.pasarela.types.consultartransacciondate.QueryTransactionByDate;
import co.gov.supernotariado.bachue.clientebus.pasarela.types.consultartransacciondate.QueryTransactionByDateDTO;
import co.gov.supernotariado.bachue.clientebus.pasarela.types.consultartransacciontoken.QueryTransactionByToken;
import co.gov.supernotariado.bachue.clientebus.pasarela.types.consultartransacciontoken.QueryTransactionByTokenDTO;
import co.gov.supernotariado.bachue.clientebus.pasarela.types.creartransaccion.CreateTransaction;
import co.gov.supernotariado.bachue.clientebus.pasarela.types.creartransaccion.CreateTransactionDTO;
import co.gov.supernotariado.bachue.clientebus.pasarela.types.validarestado.ValidateBusinessStatus;
import co.gov.supernotariado.bachue.clientebus.pasarela.types.validarestado.ValidateSystemStatusDTO;
import co.gov.supernotariado.bachue.clientebus.servicios.RealPayAPI;
import co.gov.supernotariado.bachue.clientebus.util.UtilidadClienteSoap;
import co.gov.supernotariado.bachue.clientebus.util.UtilidadLog;
import co.gov.supernotariado.bachue.clientebus.vo.ClienteIntegracionVO;
import co.gov.supernotariado.bachue.clientebus.vo.pasarela.EntradaAceptacionTransaccionVO;
import co.gov.supernotariado.bachue.clientebus.vo.pasarela.EntradaCancelacionTransaccionVO;
import co.gov.supernotariado.bachue.clientebus.vo.pasarela.EntradaConsultaTransaccionFechaVO;
import co.gov.supernotariado.bachue.clientebus.vo.pasarela.EntradaConsultaTransaccionTokenVO;
import co.gov.supernotariado.bachue.clientebus.vo.pasarela.EntradaCreacionTransaccionVO;
import co.gov.supernotariado.bachue.clientebus.vo.pasarela.EntradaVerificacionEstadoNegocioVO;
import co.gov.supernotariado.bachue.clientebus.vo.pasarela.SalidaAceptacionTransaccionVO;
import co.gov.supernotariado.bachue.clientebus.vo.pasarela.SalidaCancelacionTransaccionVO;
import co.gov.supernotariado.bachue.clientebus.vo.pasarela.SalidaConsultaTransaccionFechaVO;
import co.gov.supernotariado.bachue.clientebus.vo.pasarela.SalidaConsultaTransaccionTokenVO;
import co.gov.supernotariado.bachue.clientebus.vo.pasarela.SalidaCreacionTransaccionVO;
import co.gov.supernotariado.bachue.clientebus.vo.pasarela.SalidaVerificacionEstadoNegocioVO;

/**
 * Implementacion de interfaces para el servicio pasarela.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ServicioPasarela implements IServicioWeb {

	/**
	 * Define la constante CL_LOGGER.
	 */
	static final Logger CL_LOGGER = Logger.getLogger(ServicioPasarela.class);

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * co.gov.supernotariado.bachue.clientebus.fabrica.IServicioWeb#ejecutar(co.gov.
	 * supernotariado.bachue.clientebus.vo.ClienteIntegracionVO, java.lang.String,
	 * org.apache.log4j.Logger)
	 */
	@Override
	public ClienteIntegracionVO ejecutar(ClienteIntegracionVO aci_clienteIntegracionVO, String as_operacion,
			Logger al_logger) {
		try {
			ClienteIntegracionVO lci_clienteIntegracionVO = new ClienteIntegracionVO();

			QName qname = new QName(aci_clienteIntegracionVO.getIs_espacioNombre(),
					aci_clienteIntegracionVO.getIs_nombreServicioSoap());
			RealPayAPI lrpa_realPayAPI = new RealPayAPI(null, qname);
			RealPayPort lrpp_pasarela = lrpa_realPayAPI.getRealPayAPIPORTPort();
			UtilidadClienteSoap.insertarPropiedadesConexion(aci_clienteIntegracionVO, (BindingProvider) lrpp_pasarela);

			if (as_operacion.equalsIgnoreCase(EnumOperacionesSoap.PASARELA_CREAR_TRANSACCION.getIs_nombreOperacion())) {
				lci_clienteIntegracionVO = crearTransaccionFecha(aci_clienteIntegracionVO, lrpp_pasarela);
			} else if (as_operacion
					.equalsIgnoreCase(EnumOperacionesSoap.PASARELA_ACEPTAR_TRANSACCION.getIs_nombreOperacion())) {
				lci_clienteIntegracionVO = aceptarTransaccion(aci_clienteIntegracionVO, lrpp_pasarela);
			} else if (as_operacion
					.equalsIgnoreCase(EnumOperacionesSoap.PASARELA_CANCELAR_TRANSACCION.getIs_nombreOperacion())) {
				lci_clienteIntegracionVO = cancelarTransaccion(aci_clienteIntegracionVO, lrpp_pasarela);
			} else if (as_operacion
					.equalsIgnoreCase(EnumOperacionesSoap.PASARELA_VERIFICAR_NEGOCIO.getIs_nombreOperacion())) {
				lci_clienteIntegracionVO = verificarTransaccion(aci_clienteIntegracionVO, lrpp_pasarela);
			} else if (as_operacion.equalsIgnoreCase(
					EnumOperacionesSoap.PASARELA_CONSULTAR_TRANSACCION_FECHA.getIs_nombreOperacion())) {
				lci_clienteIntegracionVO = consultarTransaccionFecha(aci_clienteIntegracionVO, lrpp_pasarela);
			} else if (as_operacion.equalsIgnoreCase(
					EnumOperacionesSoap.PASARELA_CONSULTAR_TRANSACCION_TOKEN.getIs_nombreOperacion())) {
				lci_clienteIntegracionVO = consultarTransaccionToken(aci_clienteIntegracionVO, lrpp_pasarela);
			}
			return lci_clienteIntegracionVO;
		} catch (Exception ae_excepcion) {
			CL_LOGGER.error(ae_excepcion.getMessage(), ae_excepcion);
			throw ae_excepcion;
		}
	}

	/**
	 * Metodo que llama la operacion aceptar transaccion.
	 *
	 * @param aci_clienteIntegracionVO datos del cliente a enviar
	 * @param arpp_servicio            servicio a consumir
	 * @return SalidaAceptacionTransaccionVO Datos de respuesta del servicio
	 */
	private SalidaAceptacionTransaccionVO aceptarTransaccion(ClienteIntegracionVO aci_clienteIntegracionVO,
			RealPayPort arpp_servicio) {

		if (!(aci_clienteIntegracionVO instanceof EntradaAceptacionTransaccionVO)) {
			throw new IllegalArgumentException();
		}

		EntradaAceptacionTransaccionVO leat_entradaAceptacionTrasaccionVo = (EntradaAceptacionTransaccionVO) aci_clienteIntegracionVO;

		UtilidadLog<EntradaAceptacionTransaccionVO> lul_utilidadLog = new UtilidadLog<>();
		lul_utilidadLog.generarDebugObjeto(leat_entradaAceptacionTrasaccionVo, EntradaAceptacionTransaccionVO.class,
				"debug.entrada");

		AcceptTransaction leat_entradaAceptacionTransaccion = AceptarTransaccionConverter
				.voATipo(leat_entradaAceptacionTrasaccionVo);
		AcceptTransactionDTO lat_salidaAceptacionTransaccion;
		lat_salidaAceptacionTransaccion = aceptarTransaccion(leat_entradaAceptacionTransaccion, arpp_servicio);

		SalidaAceptacionTransaccionVO lsat_salidaAceptacionTransaccion;
		lsat_salidaAceptacionTransaccion = AceptarTransaccionConverter.tipoAVo(lat_salidaAceptacionTransaccion);

		UtilidadLog<SalidaAceptacionTransaccionVO> lul_utilidadSalidaLog = new UtilidadLog<>();
		lul_utilidadSalidaLog.generarDebugObjeto(lsat_salidaAceptacionTransaccion, SalidaAceptacionTransaccionVO.class,
				EnumLog.SALIDA_SERVICIO.getIs_codigo());

		return lsat_salidaAceptacionTransaccion;

	}

	/**
	 * Metodo que llama la operacion cancelar transaccion.
	 *
	 * @param aci_clienteIntegracionVO datos del cliente a enviar
	 * @param arpp_servicio            servicio a consumir
	 * @return SalidaCancelacionTransaccionVO Datos de respuesta del servicio
	 */
	private SalidaCancelacionTransaccionVO cancelarTransaccion(ClienteIntegracionVO aci_clienteIntegracionVO,
			RealPayPort arpp_servicio) {
		if (!(aci_clienteIntegracionVO instanceof EntradaCancelacionTransaccionVO)) {
			throw new IllegalArgumentException();
		}
		EntradaCancelacionTransaccionVO ltect_tipoEntradaCancelarVo = (EntradaCancelacionTransaccionVO) aci_clienteIntegracionVO;
		CancelTransaction lct_entradaCancelarEntrada = CancelacionTransaccionConverter
				.voATipo(ltect_tipoEntradaCancelarVo);

		UtilidadLog<EntradaCancelacionTransaccionVO> lul_utilidadLogEntrada = new UtilidadLog<>();
		lul_utilidadLogEntrada.generarDebugObjeto(ltect_tipoEntradaCancelarVo, EntradaCancelacionTransaccionVO.class,
				EnumLog.ENTRADA_SERVICIO.getIs_codigo());

		SalidaCancelacionTransaccionVO lsct_salidaCancelacionTransaccion;
		lsct_salidaCancelacionTransaccion = CancelacionTransaccionConverter
				.tipoAVo(cancelarTransaccion(lct_entradaCancelarEntrada, arpp_servicio));

		UtilidadLog<SalidaCancelacionTransaccionVO> lul_utilidadLogSalida = new UtilidadLog<>();
		lul_utilidadLogSalida.generarDebugObjeto(lsct_salidaCancelacionTransaccion,
				SalidaCancelacionTransaccionVO.class, EnumLog.SALIDA_SERVICIO.getIs_codigo());

		return lsct_salidaCancelacionTransaccion;
	}

	/**
	 * Metodo que llama la operacion consultar transaccion fecha.
	 *
	 * @param aci_clienteIntegracionVO datos del cliente a enviar
	 * @param arpp_servicio            servicio a consumir
	 * @return SalidaConsultaTransaccionFechaVO Datos de respuesta del servicio
	 */
	private SalidaConsultaTransaccionFechaVO consultarTransaccionFecha(ClienteIntegracionVO aci_clienteIntegracionVO,
			RealPayPort arpp_servicio) {
		if (!(aci_clienteIntegracionVO instanceof EntradaConsultaTransaccionFechaVO)) {
			throw new IllegalArgumentException();
		}

		EntradaConsultaTransaccionFechaVO lectf_entradaConsultaTransaccionFechaVo = (EntradaConsultaTransaccionFechaVO) aci_clienteIntegracionVO;
		QueryTransactionByDate lqtd_consultaFechaTransacciones = ConsultaTransaccionFechaConverter
				.voATipo(lectf_entradaConsultaTransaccionFechaVo);

		UtilidadLog<EntradaConsultaTransaccionFechaVO> lul_utilidadLogEntrada = new UtilidadLog<>();
		lul_utilidadLogEntrada.generarDebugObjeto(lectf_entradaConsultaTransaccionFechaVo,
				EntradaConsultaTransaccionFechaVO.class, EnumLog.ENTRADA_SERVICIO.getIs_codigo());

		SalidaConsultaTransaccionFechaVO lscft_consultaTransaccionFecha;
		lscft_consultaTransaccionFecha = ConsultaTransaccionFechaConverter
				.tipoAVo(consultarTransaccionesFecha(lqtd_consultaFechaTransacciones, arpp_servicio));

		UtilidadLog<SalidaConsultaTransaccionFechaVO> lul_utilidadLogSalida = new UtilidadLog<>();
		lul_utilidadLogSalida.generarDebugObjeto(lscft_consultaTransaccionFecha, SalidaConsultaTransaccionFechaVO.class,
				EnumLog.SALIDA_SERVICIO.getIs_codigo());

		return lscft_consultaTransaccionFecha;
	}

	/**
	 * Metodo que llama la operacion consultar transaccion token.
	 *
	 * @param aci_clienteIntegracionVO datos del cliente a enviar
	 * @param arpp_servicio            servicio a consumir
	 * @return SalidaConsultaTransaccionTokenVO Datos de respuesta del servicio
	 */
	private SalidaConsultaTransaccionTokenVO consultarTransaccionToken(ClienteIntegracionVO aci_clienteIntegracionVO,
			RealPayPort arpp_servicio) {
		if (!(aci_clienteIntegracionVO instanceof EntradaConsultaTransaccionTokenVO)) {
			throw new IllegalArgumentException();
		}
		EntradaConsultaTransaccionTokenVO lectt_transaccionTokenVo = (EntradaConsultaTransaccionTokenVO) aci_clienteIntegracionVO;
		QueryTransactionByToken lqtt_transaccionToken = ConsultaTransaccionTokenConverter
				.voATipo(lectt_transaccionTokenVo);

		UtilidadLog<EntradaConsultaTransaccionTokenVO> lul_utilidadLogEntrada = new UtilidadLog<>();
		lul_utilidadLogEntrada.generarDebugObjeto(lectt_transaccionTokenVo, EntradaConsultaTransaccionTokenVO.class,
				EnumLog.ENTRADA_SERVICIO.getIs_codigo());

		SalidaConsultaTransaccionTokenVO lsctt_consultaTransaccionToken;
		lsctt_consultaTransaccionToken = ConsultaTransaccionTokenConverter
				.tipoAVo(consultarTransaccionesToken(lqtt_transaccionToken, arpp_servicio));

		UtilidadLog<SalidaConsultaTransaccionTokenVO> lul_utilidadLogSalida = new UtilidadLog<>();
		lul_utilidadLogSalida.generarDebugObjeto(lsctt_consultaTransaccionToken, SalidaConsultaTransaccionTokenVO.class,
				EnumLog.SALIDA_SERVICIO.getIs_codigo());

		return lsctt_consultaTransaccionToken;
	}

	/**
	 * Metodo que llama la operacion crear transaccion fecha.
	 *
	 * @param aci_clienteIntegracionVO datos del cliente a enviar
	 * @param arpp_realPayPort         el parametro real pay port
	 * @return SalidaCreacionTransaccionVO Datos de respuesta del servicio
	 */
	private SalidaCreacionTransaccionVO crearTransaccionFecha(ClienteIntegracionVO aci_clienteIntegracionVO,
			RealPayPort arpp_realPayPort) {

		if (!(aci_clienteIntegracionVO instanceof EntradaCreacionTransaccionVO)) {
			throw new IllegalArgumentException();
		}

		EntradaCreacionTransaccionVO lect_entradaCreacionTransaccionVo = (EntradaCreacionTransaccionVO) aci_clienteIntegracionVO;
		CreateTransaction lct_createTransaction = CrearTransaccionFechaConverter
				.voATipo(lect_entradaCreacionTransaccionVo);

		UtilidadLog<EntradaCreacionTransaccionVO> lul_utilidadLogEntrada = new UtilidadLog<>();
		lul_utilidadLogEntrada.generarDebugObjeto(lect_entradaCreacionTransaccionVo, EntradaCreacionTransaccionVO.class,
				EnumLog.ENTRADA_SERVICIO.getIs_codigo());

		SalidaCreacionTransaccionVO lsct_salidaCreacionTransaccionVo;
		lsct_salidaCreacionTransaccionVo = CrearTransaccionFechaConverter
				.tipoAVo(creacionTransaccionFecha(lct_createTransaction, arpp_realPayPort));

		UtilidadLog<SalidaCreacionTransaccionVO> lul_utilidadLogSalida = new UtilidadLog<>();
		lul_utilidadLogSalida.generarDebugObjeto(lsct_salidaCreacionTransaccionVo, SalidaCreacionTransaccionVO.class,
				EnumLog.SALIDA_SERVICIO.getIs_codigo());

		return lsct_salidaCreacionTransaccionVo;
	}

	/**
	 * Metodo que llama la operacion verificar transaccion.
	 *
	 * @param aci_clienteIntegracionVO datos del cliente a enviar
	 * @param arpp_realPayPort         el parametro real pay port
	 * @return SalidaVerificacionEstadoNegocioVO Datos de respuesta del servicio
	 */
	private SalidaVerificacionEstadoNegocioVO verificarTransaccion(ClienteIntegracionVO aci_clienteIntegracionVO,
			RealPayPort arpp_realPayPort) {

		if (!(aci_clienteIntegracionVO instanceof EntradaVerificacionEstadoNegocioVO)) {
			throw new IllegalArgumentException();
		}

		EntradaVerificacionEstadoNegocioVO leven_entradaVerficacionEstadoNegocioVo = (EntradaVerificacionEstadoNegocioVO) aci_clienteIntegracionVO;
		ValidateBusinessStatus lvbs_validateBusinessStatus = VerificacionTransaccionConverter
				.voATipo(leven_entradaVerficacionEstadoNegocioVo);

		UtilidadLog<EntradaVerificacionEstadoNegocioVO> lul_utilidadLogEntrada = new UtilidadLog<>();
		lul_utilidadLogEntrada.generarDebugObjeto(leven_entradaVerficacionEstadoNegocioVo,
				EntradaVerificacionEstadoNegocioVO.class, EnumLog.ENTRADA_SERVICIO.getIs_codigo());

		SalidaVerificacionEstadoNegocioVO lsven_salidaVerificacionEstadoNegocioVo;
		lsven_salidaVerificacionEstadoNegocioVo = VerificacionTransaccionConverter
				.tipoAVo(validacionEstadoNegocio(lvbs_validateBusinessStatus, arpp_realPayPort));

		UtilidadLog<SalidaVerificacionEstadoNegocioVO> lul_utilidadLogSalida = new UtilidadLog<>();
		lul_utilidadLogSalida.generarDebugObjeto(lsven_salidaVerificacionEstadoNegocioVo,
				SalidaVerificacionEstadoNegocioVO.class, EnumLog.SALIDA_SERVICIO.getIs_codigo());

		return lsven_salidaVerificacionEstadoNegocioVo;

	}

	static {
		SSLUtilities.trustAllHostnames();
		SSLUtilities.trustAllHttpsCertificates();
	}

	/**
	 * Metodo que llama la operacion creacion transaccion fecha.
	 *
	 * @param act_createTransaction datos del cliente a enviar
	 * @param arpp_servicio         servicio a consumir
	 * @return CreateTransactionDTO Datos de respuesta del servicio
	 */
	public static CreateTransactionDTO creacionTransaccionFecha(CreateTransaction act_createTransaction,
			RealPayPort arpp_servicio) {
		return arpp_servicio.createTransaction(act_createTransaction.getCompany(), act_createTransaction.getPassword(),
				act_createTransaction.getBusiness(), act_createTransaction.getBusinessType(),
				act_createTransaction.getReference1(), act_createTransaction.getReference2(),
				act_createTransaction.getReference3(), act_createTransaction.getReference4(),
				act_createTransaction.getDescription(), act_createTransaction.getValue(),
				act_createTransaction.getVat(), act_createTransaction.getTaxes(),
				act_createTransaction.getDocumentType(), act_createTransaction.getDocument(),
				act_createTransaction.getName(), act_createTransaction.getLastName(), act_createTransaction.getEmail(),
				act_createTransaction.getPhone());
	}

	/**
	 * Metodo que llama la operacion aceptar transaccion.
	 *
	 * @param aat_aceptacionTransaccion datos del cliente a enviar
	 * @param arpp_servicio             servicio a consumir
	 * @return AcceptTransactionDTO Datos de respuesta del servicio
	 */
	public static AcceptTransactionDTO aceptarTransaccion(AcceptTransaction aat_aceptacionTransaccion,
			RealPayPort arpp_servicio) {
		return arpp_servicio.acceptTransaction(aat_aceptacionTransaccion.getCompany(),
				aat_aceptacionTransaccion.getPassword(), aat_aceptacionTransaccion.getBusiness(),
				aat_aceptacionTransaccion.getBusinessType(), aat_aceptacionTransaccion.getToken());
	}

	/**
	 * Metodo que llama la operacion cancelar transaccion.
	 *
	 * @param act_cancelacionTransaccion datos del cliente a enviar
	 * @param arpp_servicio              servicio a consumir
	 * @return CancelTransactionDTO Datos de respuesta del servicio
	 */
	public static CancelTransactionDTO cancelarTransaccion(CancelTransaction act_cancelacionTransaccion,
			RealPayPort arpp_servicio) {
		return arpp_servicio.cancelTransaction(act_cancelacionTransaccion.getCompany(),
				act_cancelacionTransaccion.getPassword(), act_cancelacionTransaccion.getBusiness(),
				act_cancelacionTransaccion.getBusinessType(), act_cancelacionTransaccion.getToken());
	}

	/**
	 * Metodo que llama la operacion validacion estado negocio.
	 *
	 * @param avbs_validateBusinessStatus datos del cliente a enviar
	 * @param arpp_servicio               servicio a consumir
	 * @return ValidateSystemStatusDTO Datos de respuesta del servicio
	 */
	public static ValidateSystemStatusDTO validacionEstadoNegocio(ValidateBusinessStatus avbs_validateBusinessStatus,
			RealPayPort arpp_servicio) {
		return arpp_servicio.validateBusinessStatus(avbs_validateBusinessStatus.getCompany(),
				avbs_validateBusinessStatus.getPassword(), avbs_validateBusinessStatus.getBusiness(),
				avbs_validateBusinessStatus.getBusinessType());
	}

	/**
	 * Metodo que llama la operacion consultar transacciones token.
	 *
	 * @param aqtd_transaccionesToken datos del cliente a enviar
	 * @param arpp_servicio           servicio a consumir
	 * @return QueryTransactionByTokenDTO Datos de respuesta del servicio
	 */
	public static QueryTransactionByTokenDTO consultarTransaccionesToken(
			QueryTransactionByToken aqtd_transaccionesToken, RealPayPort arpp_servicio) {
		return arpp_servicio.queryTransactionByToken(aqtd_transaccionesToken.getCompany(),
				aqtd_transaccionesToken.getPassword(), aqtd_transaccionesToken.getBusiness(),
				aqtd_transaccionesToken.getBusinessType(), aqtd_transaccionesToken.getToken());
	}

	/**
	 * Metodo que llama la operacion consultar transacciones fecha.
	 *
	 * @param aqtd_transaccionesFecha datos del cliente a enviar
	 * @param arpp_servicio           servicio a consumir
	 * @return QueryTransactionByDateDTO Datos de respuesta del servicio
	 */
	public static QueryTransactionByDateDTO consultarTransaccionesFecha(QueryTransactionByDate aqtd_transaccionesFecha,
			RealPayPort arpp_servicio) {
		return arpp_servicio.queryTransactionByDate(aqtd_transaccionesFecha.getCompany(),
				aqtd_transaccionesFecha.getPassword(), aqtd_transaccionesFecha.getBusiness(),
				aqtd_transaccionesFecha.getBusinessType(), aqtd_transaccionesFecha.getDate());
	}
}

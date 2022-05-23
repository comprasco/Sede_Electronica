/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: ServicioBancarizacion.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.fabrica
 * Nombre del elemento: ServicioBancarizacion
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.fabrica;

import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;

import org.apache.log4j.Logger;

import co.gov.supernotariado.bachue.clientebus.bancarizacion.operacion.ServiciosCertificados;
import co.gov.supernotariado.bachue.clientebus.converter.ConsultarCertificadosTransaccionConverter;
import co.gov.supernotariado.bachue.clientebus.converter.ConsultarEstadoOficinasConverter;
import co.gov.supernotariado.bachue.clientebus.converter.ConsultarEstadoTransaccionConvenioConverter;
import co.gov.supernotariado.bachue.clientebus.converter.ConsultarInformacionMatriculaConverter;
import co.gov.supernotariado.bachue.clientebus.converter.ConsultarInformacionMatriculaMasivasConverter;
import co.gov.supernotariado.bachue.clientebus.converter.ConsultarTarifaConvenioConverter;
import co.gov.supernotariado.bachue.clientebus.converter.DescargarResultadoConsultaConverter;
import co.gov.supernotariado.bachue.clientebus.converter.GenerarTransaccionConsultaExtendidaConverter;
import co.gov.supernotariado.bachue.clientebus.converter.GenerarTransaccionExtendidaConverter;
import co.gov.supernotariado.bachue.clientebus.enums.EnumLog;
import co.gov.supernotariado.bachue.clientebus.enums.EnumOperacionesSoap;
import co.gov.supernotariado.bachue.clientebus.servicios.ServiciosCertificadosService;
import co.gov.supernotariado.bachue.clientebus.util.UtilidadClienteSoap;
import co.gov.supernotariado.bachue.clientebus.util.UtilidadLog;
import co.gov.supernotariado.bachue.clientebus.vo.ClienteIntegracionVO;
import co.gov.supernotariado.bachue.clientebus.vo.bancarizacion.consultarInformacionmatricula.ConsultarInformacionMatriculaVO;
import co.gov.supernotariado.bachue.clientebus.vo.bancarizacion.consultarInformacionmatricula.RespuestaConsultarInformacionMatriculaVO;
import co.gov.supernotariado.bachue.clientebus.vo.bancarizacion.consultarcertificadostransaccion.ConsultarCertificadosTransaccionVO;
import co.gov.supernotariado.bachue.clientebus.vo.bancarizacion.consultarcertificadostransaccion.EntidadConsultarCertificadosTransaccionVO;
import co.gov.supernotariado.bachue.clientebus.vo.bancarizacion.consultarestadooficinasregistro.ConsultarEstadoOficinasRegistroVO;
import co.gov.supernotariado.bachue.clientebus.vo.bancarizacion.consultarestadooficinasregistro.RespuestaConsultarEstadoOficinasVO;
import co.gov.supernotariado.bachue.clientebus.vo.bancarizacion.consultarestadotransaccionconvenio.ConsultarEstadoTransaccionConvenioVO;
import co.gov.supernotariado.bachue.clientebus.vo.bancarizacion.consultarestadotransaccionconvenio.RespuestaConsultarEstadoTransaccionConvenioVO;
import co.gov.supernotariado.bachue.clientebus.vo.bancarizacion.consultarinformacionmatriculamasivas.ConsultarInformacionMatriculaMasivasVO;
import co.gov.supernotariado.bachue.clientebus.vo.bancarizacion.consultarinformacionmatriculamasivas.EntidadMatriculaSalidaVO;
import co.gov.supernotariado.bachue.clientebus.vo.bancarizacion.consultartarifaconvenio.ConsultarTarifaConvenioVO;
import co.gov.supernotariado.bachue.clientebus.vo.bancarizacion.consultartarifaconvenio.RespuestaConsultarTarifaConvenioVO;
import co.gov.supernotariado.bachue.clientebus.vo.bancarizacion.descargarresultadoconsulta.DescargarResultadoConsultaVO;
import co.gov.supernotariado.bachue.clientebus.vo.bancarizacion.descargarresultadoconsulta.RespuestaDescargarResultadoConsultaVO;
import co.gov.supernotariado.bachue.clientebus.vo.bancarizacion.generartransaccionconsultaextendida.GenerarTransaccionConsultaExtendidaVO;
import co.gov.supernotariado.bachue.clientebus.vo.bancarizacion.generartransaccionconsultaextendida.RespuestaGenerarTransaccionConsultaVO;
import co.gov.supernotariado.bachue.clientebus.vo.bancarizacion.generartransaccionextendida.GenerarTransaccionExtendidaVO;
import co.gov.supernotariado.bachue.clientebus.vo.bancarizacion.generartransaccionextendida.RespuestaGenerarTransaccionVO;

/**
 * Implementacion de interfaces para el servicio bancarizacion.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ServicioBancarizacion implements IServicioWeb {

	/**
	 * Define la constante CL_LOGGER.
	 */
	static final Logger CL_LOGGER = Logger.getLogger(ServicioBancarizacion.class);

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
			ServiciosCertificadosService lscs_certificadosServicio = new ServiciosCertificadosService(null, qname);
			ServiciosCertificados lsc_servicioCertificados = lscs_certificadosServicio.getServiciosCertificadosPort();
			UtilidadClienteSoap.insertarPropiedadesConexion(aci_clienteIntegracionVO,
					(BindingProvider) lsc_servicioCertificados);

			if (as_operacion
					.equalsIgnoreCase(EnumOperacionesSoap.BANCARIZACION_CONSULTAR_CERTIFICADOS_TRANSACCION.getIs_nombreOperacion())) {
				lci_clienteIntegracionVO = consultarCertificadosTransaccion(aci_clienteIntegracionVO,
						lsc_servicioCertificados);
			} else if (as_operacion
					.equalsIgnoreCase(EnumOperacionesSoap.BANCARIZACION_CONSULTAR_ESTADO_OFICINAS_REGISTRO.getIs_nombreOperacion())) {
				lci_clienteIntegracionVO = consultarEstadoOficinasRegistro(aci_clienteIntegracionVO,
						lsc_servicioCertificados);
			} else if (as_operacion
					.equalsIgnoreCase(EnumOperacionesSoap.BANCARIZACION_CONSULTAR_INFORMACION_MATRICULA.getIs_nombreOperacion())) {
				lci_clienteIntegracionVO = consultarInformacionMatricula(aci_clienteIntegracionVO,
						lsc_servicioCertificados);
			} else if (as_operacion.equalsIgnoreCase(
					EnumOperacionesSoap.BANCARIZACION_CONSULTAR_INFORMACION_MATRICULA_MASIVAS.getIs_nombreOperacion())) {
				lci_clienteIntegracionVO = consultarInformacionMatriculaMasivas(aci_clienteIntegracionVO,
						lsc_servicioCertificados);
			} else if (as_operacion.equalsIgnoreCase(
					EnumOperacionesSoap.BANCARIZACION_CONSULTAR_ESTADO_TRANSACCION_CONVENIO.getIs_nombreOperacion())) {
				lci_clienteIntegracionVO = consultarEstadoTransaccionConvenio(aci_clienteIntegracionVO,
						lsc_servicioCertificados);
			} else if (as_operacion.equalsIgnoreCase(
					EnumOperacionesSoap.BANCARIZACION_CONSULTAR_ESTADO_TRANSACCION_CONVENIO.getIs_nombreOperacion())) {
				lci_clienteIntegracionVO = consultarEstadoTransaccionConvenio(aci_clienteIntegracionVO,
						lsc_servicioCertificados);
			} else if (as_operacion
					.equalsIgnoreCase(EnumOperacionesSoap.BANCARIZACION_GENERAR_TRANSACCION_EXTENDIDA.getIs_nombreOperacion())) {
				lci_clienteIntegracionVO = generarTransaccionExtendida(aci_clienteIntegracionVO,
						lsc_servicioCertificados);
			} else if (as_operacion.equalsIgnoreCase(
					EnumOperacionesSoap.BANCARIZACION_GENERAR_TRANSACCION_CONSULTA_EXTENDIDA.getIs_nombreOperacion())) {
				lci_clienteIntegracionVO = generarTransaccionConsultaExtendida(aci_clienteIntegracionVO,
						lsc_servicioCertificados);
			} else if (as_operacion
					.equalsIgnoreCase(EnumOperacionesSoap.BANCARIZACION_DESCARGAR_RESULTADO_CONSULTA.getIs_nombreOperacion())) {
				lci_clienteIntegracionVO = descargarResultadoConsulta(aci_clienteIntegracionVO,
						lsc_servicioCertificados);
			} else if (as_operacion
					.equalsIgnoreCase(EnumOperacionesSoap.BANCARIZACION_CONSULTAR_TARIFA_CONVENIO.getIs_nombreOperacion())) {
				lci_clienteIntegracionVO = consultarTarifaConvenio(aci_clienteIntegracionVO, lsc_servicioCertificados);
			}

			return lci_clienteIntegracionVO;
		} catch (Exception ae_excepcion) {
			CL_LOGGER.debug(ae_excepcion.getMessage());
			throw ae_excepcion;
		}
	}

	/**
	 * Metodo que permite consultar certificados de una transaccion.
	 *
	 * @param aci_clienteIntegracionVO el parametro cliente integracion objeto con
	 *                                 valores de servicio
	 * @param asc_certificados         el parametro certificados
	 * @return Resultado para consultar certificados transaccion retornado como
	 *         EntidadConsultarCertificadosTransaccionVO
	 */
	private EntidadConsultarCertificadosTransaccionVO consultarCertificadosTransaccion(
			ClienteIntegracionVO aci_clienteIntegracionVO, ServiciosCertificados asc_certificados) {

		if (!(aci_clienteIntegracionVO instanceof ConsultarCertificadosTransaccionVO)) {
			throw new IllegalArgumentException();
		}

		ConsultarCertificadosTransaccionVO lcct_certificadosTransaccionVo = (ConsultarCertificadosTransaccionVO) aci_clienteIntegracionVO;

		UtilidadLog<ConsultarCertificadosTransaccionVO> lultealma_utilidadLogEntrada = new UtilidadLog<>();
		lultealma_utilidadLogEntrada.generarDebugObjeto(lcct_certificadosTransaccionVo,
				ConsultarCertificadosTransaccionVO.class, EnumLog.ENTRADA_SERVICIO.getIs_codigo());

		EntidadConsultarCertificadosTransaccionVO lcct_consultaTransaccionResponseVo;
		lcct_consultaTransaccionResponseVo = ConsultarCertificadosTransaccionConverter.tipoAVo(
				asc_certificados.consultarCertificadosTransaccion(lcct_certificadosTransaccionVo.getIs_usuarioWS(),
						lcct_certificadosTransaccionVo.getIs_claveWS(),
						lcct_certificadosTransaccionVo.getIs_codigoConvenio(),
						lcct_certificadosTransaccionVo.getIs_codigoServicio(),
						lcct_certificadosTransaccionVo.getIl_codigoTransaccion()));

		UtilidadLog<EntidadConsultarCertificadosTransaccionVO> lultealma_utilidadLogSalida = new UtilidadLog<>();
		lultealma_utilidadLogSalida.generarDebugObjeto(lcct_consultaTransaccionResponseVo,
				EntidadConsultarCertificadosTransaccionVO.class, EnumLog.SALIDA_SERVICIO.getIs_codigo());

		return lcct_consultaTransaccionResponseVo;
	}

	/**
	 * Metodo que consulta los estados de una oficina de registro.
	 *
	 * @param aci_clienteIntegracionVO el parametro cliente integracion objeto con
	 *                                 valores de servicio
	 * @param asc_certificados         el parametro certificados
	 * @return Resultado para consultar estado oficinas registro retornado como
	 *         RespuestaConsultarEstadoOficinasVO
	 */
	private RespuestaConsultarEstadoOficinasVO consultarEstadoOficinasRegistro(
			ClienteIntegracionVO aci_clienteIntegracionVO, ServiciosCertificados asc_certificados) {

		if (!(aci_clienteIntegracionVO instanceof ConsultarEstadoOficinasRegistroVO)) {
			throw new IllegalArgumentException();
		}

		ConsultarEstadoOficinasRegistroVO lceor_consultaEstadoOficinaRegistroVo = (ConsultarEstadoOficinasRegistroVO) aci_clienteIntegracionVO;

		UtilidadLog<ConsultarEstadoOficinasRegistroVO> lulceor_utilidadLogEntrada = new UtilidadLog<>();
		lulceor_utilidadLogEntrada.generarDebugObjeto(lceor_consultaEstadoOficinaRegistroVo,
				ConsultarEstadoOficinasRegistroVO.class, EnumLog.ENTRADA_SERVICIO.getIs_codigo());

		RespuestaConsultarEstadoOficinasVO lrceo_consultaTransaccionResponseVo;
		lrceo_consultaTransaccionResponseVo = ConsultarEstadoOficinasConverter.tipoAVo(asc_certificados
				.consultarEstadoOficinasRegistro(lceor_consultaEstadoOficinaRegistroVo.getIs_usuarioWS(),
						lceor_consultaEstadoOficinaRegistroVo.getIs_claveWS(),
						lceor_consultaEstadoOficinaRegistroVo.getIs_codigoConvenio(),
						lceor_consultaEstadoOficinaRegistroVo.getIs_codigoConvenio(),
						lceor_consultaEstadoOficinaRegistroVo.getIs_tipoConsulta()));

		UtilidadLog<RespuestaConsultarEstadoOficinasVO> lultealma_utilidadLogSalida = new UtilidadLog<>();
		lultealma_utilidadLogSalida.generarDebugObjeto(lrceo_consultaTransaccionResponseVo,
				RespuestaConsultarEstadoOficinasVO.class, EnumLog.SALIDA_SERVICIO.getIs_codigo());

		return lrceo_consultaTransaccionResponseVo;
	}

	/**
	 * Metodo que consulta informacion de una matricula.
	 *
	 * @param aci_clienteIntegracionVO el parametro cliente integracion objeto con
	 *                                 valores de servicio
	 * @param asc_certificados         el parametro certificados
	 * @return Resultado para consultar informacion matricula retornado como
	 *         RespuestaConsultarInformacionMatriculaVO
	 */
	private RespuestaConsultarInformacionMatriculaVO consultarInformacionMatricula(
			ClienteIntegracionVO aci_clienteIntegracionVO, ServiciosCertificados asc_certificados) {

		if (!(aci_clienteIntegracionVO instanceof ConsultarInformacionMatriculaVO)) {
			throw new IllegalArgumentException();
		}

		ConsultarInformacionMatriculaVO lcim_consultarInformacionMatriculaVOVo = (ConsultarInformacionMatriculaVO) aci_clienteIntegracionVO;

		UtilidadLog<ConsultarInformacionMatriculaVO> lulceor_utilidadLogEntrada = new UtilidadLog<>();
		lulceor_utilidadLogEntrada.generarDebugObjeto(lcim_consultarInformacionMatriculaVOVo,
				ConsultarInformacionMatriculaVO.class, EnumLog.ENTRADA_SERVICIO.getIs_codigo());

		RespuestaConsultarInformacionMatriculaVO lrcim_respuestaConsultarInformacionMatriculaVo;
		lrcim_respuestaConsultarInformacionMatriculaVo = ConsultarInformacionMatriculaConverter.tipoAVo(
				asc_certificados.consultarInformacionMatricula(lcim_consultarInformacionMatriculaVOVo.getIs_usuarioWS(),
						lcim_consultarInformacionMatriculaVOVo.getIs_claveWS(),
						lcim_consultarInformacionMatriculaVOVo.getIs_codigoConvenio(),
						lcim_consultarInformacionMatriculaVOVo.getIs_codigoServicio(),
						lcim_consultarInformacionMatriculaVOVo.getIs_codigoServicio(),
						lcim_consultarInformacionMatriculaVOVo.getIs_matricula()));

		UtilidadLog<RespuestaConsultarInformacionMatriculaVO> lultealma_utilidadLogSalida = new UtilidadLog<>();
		lultealma_utilidadLogSalida.generarDebugObjeto(lrcim_respuestaConsultarInformacionMatriculaVo,
				RespuestaConsultarInformacionMatriculaVO.class, EnumLog.SALIDA_SERVICIO.getIs_codigo());

		return lrcim_respuestaConsultarInformacionMatriculaVo;
	}

	/**
	 * Metodo que consulta informacion de una matricula Masivas.
	 *
	 * @param aci_clienteIntegracionVO el parametro cliente integracion objeto con
	 *                                 valores de servicio
	 * @param asc_certificados         el parametro certificados
	 * @return Resultado para consultar informacion matricula masivas retornado como
	 *         ClienteIntegracionVO
	 */
	private ClienteIntegracionVO consultarInformacionMatriculaMasivas(ClienteIntegracionVO aci_clienteIntegracionVO,
			ServiciosCertificados asc_certificados) {

		if (!(aci_clienteIntegracionVO instanceof ConsultarInformacionMatriculaMasivasVO)) {
			throw new IllegalArgumentException();
		}

		ConsultarInformacionMatriculaMasivasVO lcimm_consultarInformacionMatriculaVO = (ConsultarInformacionMatriculaMasivasVO) aci_clienteIntegracionVO;

		UtilidadLog<ConsultarInformacionMatriculaMasivasVO> lulceor_utilidadLogEntrada = new UtilidadLog<>();
		lulceor_utilidadLogEntrada.generarDebugObjeto(lcimm_consultarInformacionMatriculaVO,
				ConsultarInformacionMatriculaMasivasVO.class, EnumLog.ENTRADA_SERVICIO.getIs_codigo());

		EntidadMatriculaSalidaVO lrcim_respuestaConsultarInformacionMatriculaVo;
		lrcim_respuestaConsultarInformacionMatriculaVo = ConsultarInformacionMatriculaMasivasConverter
				.tipoAVo(asc_certificados.consultarInformacionMatriculaMasivas(
						lcimm_consultarInformacionMatriculaVO.getIs_usuarioWS(),
						lcimm_consultarInformacionMatriculaVO.getIs_claveWS(),
						lcimm_consultarInformacionMatriculaVO.getIs_codigoConvenio(),
						lcimm_consultarInformacionMatriculaVO.getIs_codigoServicio(),
						ConsultarInformacionMatriculaMasivasConverter
								.voATipo(lcimm_consultarInformacionMatriculaVO.getLem_matriculas())));

		UtilidadLog<EntidadMatriculaSalidaVO> lultealma_utilidadLogSalida = new UtilidadLog<>();
		lultealma_utilidadLogSalida.generarDebugObjeto(lrcim_respuestaConsultarInformacionMatriculaVo,
				EntidadMatriculaSalidaVO.class, EnumLog.SALIDA_SERVICIO.getIs_codigo());

		return lrcim_respuestaConsultarInformacionMatriculaVo;
	}

	static {
		SSLUtilities.trustAllHostnames();
		SSLUtilities.trustAllHttpsCertificates();
	}

	/**
	 * Metodo que permite consultar estado de una transaccion convenio.
	 *
	 * @param aci_clienteIntegracionVO el parametro cliente integracion objeto con
	 *                                 valores de servicio
	 * @param asc_certificados         el parametro certificados
	 * @return Resultado para consultar estado transaccion convenio retornado como
	 *         ClienteIntegracionVO
	 */
	private ClienteIntegracionVO consultarEstadoTransaccionConvenio(ClienteIntegracionVO aci_clienteIntegracionVO,
			ServiciosCertificados asc_certificados) {

		if (!(aci_clienteIntegracionVO instanceof ConsultarEstadoTransaccionConvenioVO)) {
			throw new IllegalArgumentException();
		}

		ConsultarEstadoTransaccionConvenioVO lcetc_consultarestadoTransaccionConvenioVo = (ConsultarEstadoTransaccionConvenioVO) aci_clienteIntegracionVO;

		UtilidadLog<ConsultarEstadoTransaccionConvenioVO> lulceor_utilidadLogEntrada = new UtilidadLog<>();
		lulceor_utilidadLogEntrada.generarDebugObjeto(lcetc_consultarestadoTransaccionConvenioVo,
				ConsultarEstadoTransaccionConvenioVO.class, EnumLog.ENTRADA_SERVICIO.getIs_codigo());

		RespuestaConsultarEstadoTransaccionConvenioVO lrcim_respuestaConsultarInformacionMatriculaVo;
		lrcim_respuestaConsultarInformacionMatriculaVo = ConsultarEstadoTransaccionConvenioConverter
				.tipoAVo(asc_certificados.consultarEstadoTransaccionConvenio(
						lcetc_consultarestadoTransaccionConvenioVo.getIs_usuarioWS(),
						lcetc_consultarestadoTransaccionConvenioVo.getIs_claveWS(),
						lcetc_consultarestadoTransaccionConvenioVo.getIs_codigoConvenio(),
						lcetc_consultarestadoTransaccionConvenioVo.getIs_codigoServicio(),
						lcetc_consultarestadoTransaccionConvenioVo.getIs_idSeguimientoConvenio(),
						lcetc_consultarestadoTransaccionConvenioVo.getIs_confirmacionEntrega()));

		UtilidadLog<RespuestaConsultarEstadoTransaccionConvenioVO> lulrcetc_utilidadLogSalida = new UtilidadLog<>();
		lulrcetc_utilidadLogSalida.generarDebugObjeto(lrcim_respuestaConsultarInformacionMatriculaVo,
				RespuestaConsultarEstadoTransaccionConvenioVO.class, EnumLog.SALIDA_SERVICIO.getIs_codigo());

		return lrcim_respuestaConsultarInformacionMatriculaVo;
	}

	/**
	 * Metodo encargador de generar una transaccion extendida.
	 *
	 * @param aci_clienteIntegracionVO  el parametro cliente integracion objeto con
	 *                                  valores de servicio
	 * @param asc_serviciosCertificados el parametro servicios certificados
	 * @return Resultado para generar transaccion extendida retornado como
	 *         RespuestaGenerarTransaccionVO
	 */
	private RespuestaGenerarTransaccionVO generarTransaccionExtendida(ClienteIntegracionVO aci_clienteIntegracionVO,
			ServiciosCertificados asc_serviciosCertificados) {
		if (!(aci_clienteIntegracionVO instanceof GenerarTransaccionExtendidaVO)) {
			throw new IllegalArgumentException();
		}

		GenerarTransaccionExtendidaVO lgte_generarTransaccionExtendidaVo = (GenerarTransaccionExtendidaVO) aci_clienteIntegracionVO;
		UtilidadLog<GenerarTransaccionExtendidaVO> lulgte_utilidadLogEntrada = new UtilidadLog<>();
		lulgte_utilidadLogEntrada.generarDebugObjeto(lgte_generarTransaccionExtendidaVo,
				GenerarTransaccionExtendidaVO.class, EnumLog.ENTRADA_SERVICIO.getIs_codigo());

		RespuestaGenerarTransaccionVO lrgt_respuestaGenerarTransaccionVo;

		lrgt_respuestaGenerarTransaccionVo = GenerarTransaccionExtendidaConverter
				.respuestaTipoARespuestaVo(asc_serviciosCertificados.generarTransaccionExtendida(
						lgte_generarTransaccionExtendidaVo.getIs_usuarioWS(),
						lgte_generarTransaccionExtendidaVo.getIs_claveWS(),
						lgte_generarTransaccionExtendidaVo.getIs_codigoConvenio(),
						lgte_generarTransaccionExtendidaVo.getIs_codigoServicio(),
						lgte_generarTransaccionExtendidaVo.getIs_codigoSeguimiento(),
						GenerarTransaccionExtendidaConverter.listaEntidadVoAListaEntidadTipo(
								lgte_generarTransaccionExtendidaVo.getIlem_matriculas())));
		UtilidadLog<RespuestaGenerarTransaccionVO> lulrgt_utilidadLogSalida = new UtilidadLog<>();
		lulrgt_utilidadLogSalida.generarDebugObjeto(lrgt_respuestaGenerarTransaccionVo,
				RespuestaGenerarTransaccionVO.class, EnumLog.SALIDA_SERVICIO.getIs_codigo());

		return lrgt_respuestaGenerarTransaccionVo;
	}

	/**
	 * Metodo encargado de generar la transaccion de una consulta extendida.
	 *
	 * @param aci_clienteIntegracionVO  el parametro cliente integracion objeto con
	 *                                  valores de servicio
	 * @param asc_serviciosCertificados el parametro servicios certificados
	 * @return Resultado para generar transaccion consulta extendida retornado como
	 *         RespuestaGenerarTransaccionConsultaVO
	 */
	private RespuestaGenerarTransaccionConsultaVO generarTransaccionConsultaExtendida(
			ClienteIntegracionVO aci_clienteIntegracionVO, ServiciosCertificados asc_serviciosCertificados) {
		if (!(aci_clienteIntegracionVO instanceof GenerarTransaccionConsultaExtendidaVO)) {
			throw new IllegalArgumentException();
		}

		GenerarTransaccionConsultaExtendidaVO lgtce_generarTransaccionConsultaExtendida = (GenerarTransaccionConsultaExtendidaVO) aci_clienteIntegracionVO;
		UtilidadLog<GenerarTransaccionConsultaExtendidaVO> lulgtce_utilidadLogEntrada = new UtilidadLog<>();
		lulgtce_utilidadLogEntrada.generarDebugObjeto(lgtce_generarTransaccionConsultaExtendida,
				GenerarTransaccionConsultaExtendidaVO.class, EnumLog.ENTRADA_SERVICIO.getIs_codigo());

		RespuestaGenerarTransaccionConsultaVO lrgtc_respuestaGenerarTransaccionConsultaVo = GenerarTransaccionConsultaExtendidaConverter
				.respuestaTipoARespuestaVo(asc_serviciosCertificados.generarTransaccionConsultaExtendida(
						lgtce_generarTransaccionConsultaExtendida.getIs_usuarioWS(),
						lgtce_generarTransaccionConsultaExtendida.getIs_claveWS(),
						lgtce_generarTransaccionConsultaExtendida.getIs_codigoConvenio(),
						lgtce_generarTransaccionConsultaExtendida.getIs_codigoServicio(),
						lgtce_generarTransaccionConsultaExtendida.getIs_codigoSeguimiento(),
						lgtce_generarTransaccionConsultaExtendida.getIs_tipoDocumento(),
						lgtce_generarTransaccionConsultaExtendida.getIs_numeroDocumento(),
						lgtce_generarTransaccionConsultaExtendida.isIb_usaNombres(),
						lgtce_generarTransaccionConsultaExtendida.getIs_primerNombre(),
						lgtce_generarTransaccionConsultaExtendida.getIs_primerApellido(),
						lgtce_generarTransaccionConsultaExtendida.getIs_segundoNombre(),
						lgtce_generarTransaccionConsultaExtendida.getIs_segundoApellido(),
						lgtce_generarTransaccionConsultaExtendida.getIs_razonSocial(),
						lgtce_generarTransaccionConsultaExtendida.isIb_usaMatricula(),
						lgtce_generarTransaccionConsultaExtendida.getIs_matriculaCatastral()));
		UtilidadLog<RespuestaGenerarTransaccionConsultaVO> lulrgtc_utilidadLogSalida = new UtilidadLog<>();
		lulrgtc_utilidadLogSalida.generarDebugObjeto(lrgtc_respuestaGenerarTransaccionConsultaVo,
				RespuestaGenerarTransaccionConsultaVO.class, EnumLog.SALIDA_SERVICIO.getIs_codigo());

		return lrgtc_respuestaGenerarTransaccionConsultaVo;
	}

	/**
	 * Metodo que permite descargar el resultado de la consulta.
	 *
	 * @param aci_clienteIntegracionVO  el parametro cliente integracion objeto con
	 *                                  valores de servicio
	 * @param asc_serviciosCertificados el parametro servicios certificados
	 * @return Resultado para descargar resultado consulta retornado como
	 *         RespuestaDescargarResultadoConsultaVO
	 */
	private RespuestaDescargarResultadoConsultaVO descargarResultadoConsulta(
			ClienteIntegracionVO aci_clienteIntegracionVO, ServiciosCertificados asc_serviciosCertificados) {
		if (!(aci_clienteIntegracionVO instanceof DescargarResultadoConsultaVO)) {
			throw new IllegalArgumentException();
		}

		DescargarResultadoConsultaVO ldrc_descargarResultadoConsultaVo = (DescargarResultadoConsultaVO) aci_clienteIntegracionVO;
		UtilidadLog<DescargarResultadoConsultaVO> lulgtce_utilidadLogEntrada = new UtilidadLog<>();
		lulgtce_utilidadLogEntrada.generarDebugObjeto(ldrc_descargarResultadoConsultaVo,
				DescargarResultadoConsultaVO.class, EnumLog.ENTRADA_SERVICIO.getIs_codigo());

		RespuestaDescargarResultadoConsultaVO lrdrc_respuestaDescargarResultadoConsultaVo = DescargarResultadoConsultaConverter
				.respuestaTipoARespuestaVo(asc_serviciosCertificados.descargarResultadoConsulta(
						ldrc_descargarResultadoConsultaVo.getIs_usuarioWS(),
						ldrc_descargarResultadoConsultaVo.getIs_claveWS(),
						ldrc_descargarResultadoConsultaVo.getIs_codigoConvenio(),
						ldrc_descargarResultadoConsultaVo.getIs_codigoServicio(),
						ldrc_descargarResultadoConsultaVo.getIl_codigoTransaccion(),
						ldrc_descargarResultadoConsultaVo.getIs_tipoRespuesta()));
		UtilidadLog<RespuestaDescargarResultadoConsultaVO> lulrgtc_utilidadLogSalida = new UtilidadLog<>();
		lulrgtc_utilidadLogSalida.generarDebugObjeto(lrdrc_respuestaDescargarResultadoConsultaVo,
				RespuestaDescargarResultadoConsultaVO.class, EnumLog.SALIDA_SERVICIO.getIs_codigo());

		return lrdrc_respuestaDescargarResultadoConsultaVo;
	}

	/**
	 * Metodo encargado de consultar la tarifa del convenio.
	 *
	 * @param aci_clienteIntegracionVO  el parametro cliente integracion objeto con
	 *                                  valores de servicio
	 * @param asc_serviciosCertificados el parametro servicios certificados
	 * @return Resultado para consultar tarifa convenio retornado como
	 *         RespuestaConsultarTarifaConvenioVO
	 */
	private RespuestaConsultarTarifaConvenioVO consultarTarifaConvenio(ClienteIntegracionVO aci_clienteIntegracionVO,
			ServiciosCertificados asc_serviciosCertificados) {
		if (!(aci_clienteIntegracionVO instanceof ConsultarTarifaConvenioVO)) {
			throw new IllegalArgumentException();
		}

		ConsultarTarifaConvenioVO lctc_consultarTarifaConvenioVo = (ConsultarTarifaConvenioVO) aci_clienteIntegracionVO;
		UtilidadLog<ConsultarTarifaConvenioVO> lulctc_utilidadLogEntrada = new UtilidadLog<>();
		lulctc_utilidadLogEntrada.generarDebugObjeto(lctc_consultarTarifaConvenioVo, ConsultarTarifaConvenioVO.class,
				EnumLog.ENTRADA_SERVICIO.getIs_codigo());

		RespuestaConsultarTarifaConvenioVO lrctc_respuestaConsultarTarifaConvenioVo = ConsultarTarifaConvenioConverter
				.respuestaTipoARespuestaVo(asc_serviciosCertificados.consultarTarifaConvenio(
						lctc_consultarTarifaConvenioVo.getIs_usuarioWS(),
						lctc_consultarTarifaConvenioVo.getIs_claveWS(),
						lctc_consultarTarifaConvenioVo.getIs_codigoConvenio(),
						lctc_consultarTarifaConvenioVo.getIs_codigoServicio()));
		UtilidadLog<RespuestaConsultarTarifaConvenioVO> lulrctc_utilidadLogSalida = new UtilidadLog<>();
		lulrctc_utilidadLogSalida.generarDebugObjeto(lrctc_respuestaConsultarTarifaConvenioVo,
				RespuestaConsultarTarifaConvenioVO.class, EnumLog.SALIDA_SERVICIO.getIs_codigo());

		return lrctc_respuestaConsultarTarifaConvenioVo;
	}

}
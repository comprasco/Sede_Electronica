/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: ServicioConsultarTrazabilidad.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.fabrica
 * Nombre del elemento: ServicioConsultarTrazabilidad
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.fabrica;

import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;

import org.apache.log4j.Logger;

import co.gov.supernotariado.bachue.clientebus.consultatrazabilidad.operacion.SDIEEConsultaTrazabilidad;
import co.gov.supernotariado.bachue.clientebus.consultatrazabilidad.types.consultaactosturno.TipoEntradaConsultaActosTurno;
import co.gov.supernotariado.bachue.clientebus.consultatrazabilidad.types.consultaactosturno.TipoSalidaConsultaActosTurno;
import co.gov.supernotariado.bachue.clientebus.consultatrazabilidad.types.consultadetallecertificado.TipoEntradaConsultaDetalleCertificado;
import co.gov.supernotariado.bachue.clientebus.consultatrazabilidad.types.consultadetallecertificado.TipoSalidaConsultaDetalleCertificado;
import co.gov.supernotariado.bachue.clientebus.consultatrazabilidad.types.consultatrazabilidad.TipoEntradaConsultarTrazabilidad;
import co.gov.supernotariado.bachue.clientebus.consultatrazabilidad.types.consultatrazabilidad.TipoSalidaConsultarTrazabilidad;
import co.gov.supernotariado.bachue.clientebus.consultatrazabilidad.types.consultatrazabilidadnoc.TipoEntradaTrazabilidadTramiteRegistroNodoCentral;
import co.gov.supernotariado.bachue.clientebus.consultatrazabilidad.types.consultatrazabilidadnoc.TipoSalidaTrazabilidadTramiteRegistroNodoCentral;
import co.gov.supernotariado.bachue.clientebus.converter.ConsultaActosTurnoConverter;
import co.gov.supernotariado.bachue.clientebus.converter.ConsultaDetalleCertificadoConverter;
import co.gov.supernotariado.bachue.clientebus.converter.ConsultarTrazabilidadConverter;
import co.gov.supernotariado.bachue.clientebus.converter.ConsultarTrazabilidadNocConverter;
import co.gov.supernotariado.bachue.clientebus.enums.EnumLog;
import co.gov.supernotariado.bachue.clientebus.enums.EnumOperacionesSoap;
import co.gov.supernotariado.bachue.clientebus.servicios.SDIEEConsultaTrazabilidadService;
import co.gov.supernotariado.bachue.clientebus.util.UtilidadClienteSoap;
import co.gov.supernotariado.bachue.clientebus.util.UtilidadLog;
import co.gov.supernotariado.bachue.clientebus.vo.ClienteIntegracionVO;
import co.gov.supernotariado.bachue.clientebus.vo.consultartrazabilidad.TipoEntradaConsultaActosTurnoVO;
import co.gov.supernotariado.bachue.clientebus.vo.consultartrazabilidad.TipoEntradaConsultaDetalleCertificadoVO;
import co.gov.supernotariado.bachue.clientebus.vo.consultartrazabilidad.TipoEntradaConsultarTrazabilidadVO;
import co.gov.supernotariado.bachue.clientebus.vo.consultartrazabilidad.TipoSalidaConsultaActosTurnoVO;
import co.gov.supernotariado.bachue.clientebus.vo.consultartrazabilidad.TipoSalidaConsultaDetalleCertificadoVO;
import co.gov.supernotariado.bachue.clientebus.vo.consultartrazabilidad.TipoSalidaConsultarTrazabilidadVO;
import co.gov.supernotariado.bachue.clientebus.vo.consultartrazabilidadnoc.TipoEntradaTrazabilidadTramiteRegistroNodoCentralVO;
import co.gov.supernotariado.bachue.clientebus.vo.consultartrazabilidadnoc.TipoSalidaTrazabilidadTramiteRegistroNodoCentralVO;

/**
 * Implementacion de interfaces para el servicio consulta trazabilidad.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ServicioConsultarTrazabilidad implements IServicioWeb {

	/**
	 * Define la constante CL_LOGGER.
	 */
	static final Logger CL_LOGGER = Logger.getLogger(ServicioConsultarTrazabilidad.class);

	/**
	 * Metodo que realiza la operacion de consultar trazabilidad del servicio de
	 * consulta trazabilidad.
	 *
	 * @param aci_clienteIntegracionVO  datos a consumir
	 * @param act_consultarTrazabilidad servicio a consumir
	 * @return TipoSalidaConsultarTrazabilidadVO Datos de respuesta del servicio
	 */
	private TipoSalidaConsultarTrazabilidadVO consultarTrazabilidad(ClienteIntegracionVO aci_clienteIntegracionVO,
			SDIEEConsultaTrazabilidad act_consultarTrazabilidad) {

		if (!(aci_clienteIntegracionVO instanceof TipoEntradaConsultarTrazabilidadVO)) {
			throw new IllegalArgumentException();
		}

		TipoEntradaConsultarTrazabilidadVO ltect_tipoEntradaConsultarTrazabilidadVO = (TipoEntradaConsultarTrazabilidadVO) aci_clienteIntegracionVO;

		TipoEntradaConsultarTrazabilidad ltect_consultarTrazabilidad = ConsultarTrazabilidadConverter
				.voATipo(ltect_tipoEntradaConsultarTrazabilidadVO);

		UtilidadLog<TipoEntradaConsultarTrazabilidadVO> lul_utilidadLogEntrada = new UtilidadLog<>();
		lul_utilidadLogEntrada.generarDebugObjeto(ltect_tipoEntradaConsultarTrazabilidadVO,
				TipoEntradaConsultarTrazabilidadVO.class, EnumLog.ENTRADA_SERVICIO.getIs_codigo());

		TipoSalidaConsultarTrazabilidad ltsct_tipoSalidaConsultarTrazabilidad = act_consultarTrazabilidad
				.consultarTrazabilidad(ltect_consultarTrazabilidad);

		TipoSalidaConsultarTrazabilidadVO ltsct_tipoSalidaConsultarTrazabilidadVO;
		ltsct_tipoSalidaConsultarTrazabilidadVO = ConsultarTrazabilidadConverter
				.tipoAVo(ltsct_tipoSalidaConsultarTrazabilidad);

		UtilidadLog<TipoSalidaConsultarTrazabilidadVO> lul_utilidadLogSalida = new UtilidadLog<>();
		lul_utilidadLogSalida.generarDebugObjeto(ltsct_tipoSalidaConsultarTrazabilidadVO,
				TipoSalidaConsultarTrazabilidadVO.class, EnumLog.SALIDA_SERVICIO.getIs_codigo());
		return ltsct_tipoSalidaConsultarTrazabilidadVO;
	}

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

			ClienteIntegracionVO c_clienteIntegracionVO = new ClienteIntegracionVO();

			QName qname = new QName(aci_clienteIntegracionVO.getIs_espacioNombre(),
					aci_clienteIntegracionVO.getIs_nombreServicioSoap());
			SDIEEConsultaTrazabilidadService lscts_consultaTrazabilidadService = new SDIEEConsultaTrazabilidadService(
					null, qname);
			SDIEEConsultaTrazabilidad lct_consultarTrazabilidad = lscts_consultaTrazabilidadService
					.getSDIEEConsultaTrazabilidadSOAP12BindingQSPort();
			UtilidadClienteSoap.insertarPropiedadesConexion(aci_clienteIntegracionVO,
					(BindingProvider) lct_consultarTrazabilidad);

			if (as_operacion.equalsIgnoreCase(EnumOperacionesSoap.TRAZABILIDAD_CONSULTAR.getIs_nombreOperacion())) {
				return consultarTrazabilidad(aci_clienteIntegracionVO, lct_consultarTrazabilidad);
			} else if (as_operacion
					.equalsIgnoreCase(EnumOperacionesSoap.TRAZABILIDAD_CONSULTAR_NOC.getIs_nombreOperacion())) {
				return consultarTrazabilidadNOC(aci_clienteIntegracionVO, lct_consultarTrazabilidad);
			} else if (as_operacion
					.equalsIgnoreCase(EnumOperacionesSoap.TRAZABILIDAD_CONSULTA_ACTOS_TURNO.getIs_nombreOperacion())) {
				return consultaActosTurno(aci_clienteIntegracionVO, lct_consultarTrazabilidad);
			} else if (as_operacion
					.equalsIgnoreCase(EnumOperacionesSoap.TRAZABILIDAD_CONSULTA_DETALLE_CERTIFICADO.getIs_nombreOperacion())) {
				return consultaDetalleCertificado(aci_clienteIntegracionVO, lct_consultarTrazabilidad);
			}

			return c_clienteIntegracionVO;
		} catch (Exception ae_excepcion) {
			CL_LOGGER.error(ae_excepcion.getMessage(), ae_excepcion);
			throw ae_excepcion;
		}
	}

	/**
	 * Metodo que realiza la operacion de consultar trazabilidad del servicio de
	 * consulta trazabilidad NOC.
	 *
	 * @param aci_clienteIntegracionVO  datos a consumir
	 * @param act_consultarTrazabilidad servicio a consumir
	 * @return TipoSalidaTrazabilidadTramiteRegistroNodoCentralVO Datos de respuesta
	 *         del servicio
	 */
	private TipoSalidaTrazabilidadTramiteRegistroNodoCentralVO consultarTrazabilidadNOC(
			ClienteIntegracionVO aci_clienteIntegracionVO, SDIEEConsultaTrazabilidad act_consultarTrazabilidad) {
		if (!(aci_clienteIntegracionVO instanceof TipoEntradaTrazabilidadTramiteRegistroNodoCentralVO)) {
			throw new IllegalArgumentException();
		}

		TipoEntradaTrazabilidadTramiteRegistroNodoCentralVO ltettrnc_tipoEntradaConsultarTrazabilidadVO = (TipoEntradaTrazabilidadTramiteRegistroNodoCentralVO) aci_clienteIntegracionVO;

		TipoEntradaTrazabilidadTramiteRegistroNodoCentral ltettrnc_consultarTrazabilidad = ConsultarTrazabilidadNocConverter
				.voATipo(ltettrnc_tipoEntradaConsultarTrazabilidadVO);

		UtilidadLog<TipoEntradaTrazabilidadTramiteRegistroNodoCentralVO> lultettrnc_utilidadLogEntrada = new UtilidadLog<>();
		lultettrnc_utilidadLogEntrada.generarDebugObjeto(ltettrnc_tipoEntradaConsultarTrazabilidadVO,
				TipoEntradaTrazabilidadTramiteRegistroNodoCentralVO.class, EnumLog.ENTRADA_SERVICIO.getIs_codigo());

		TipoSalidaTrazabilidadTramiteRegistroNodoCentral ltsttrnc_tipoSalidaConsultarTrazabilidad = act_consultarTrazabilidad
				.consultarTrazabilidadNOC(ltettrnc_consultarTrazabilidad);

		TipoSalidaTrazabilidadTramiteRegistroNodoCentralVO ltsttrnc_tipoSalidaConsultarTrazabilidadVO;
		ltsttrnc_tipoSalidaConsultarTrazabilidadVO = ConsultarTrazabilidadNocConverter
				.tipoAVo(ltsttrnc_tipoSalidaConsultarTrazabilidad);

		UtilidadLog<TipoSalidaTrazabilidadTramiteRegistroNodoCentralVO> lultsttrnc_utilidadLogSalida = new UtilidadLog<>();
		lultsttrnc_utilidadLogSalida.generarDebugObjeto(ltsttrnc_tipoSalidaConsultarTrazabilidadVO,
				TipoSalidaTrazabilidadTramiteRegistroNodoCentralVO.class, EnumLog.SALIDA_SERVICIO.getIs_codigo());
		return ltsttrnc_tipoSalidaConsultarTrazabilidadVO;
	}

	/**
	 * Metodo que realiza la operacion de consultar actos turno del servicio de
	 * consulta trazabilidad.
	 *
	 * @param aci_clienteIntegracionVO  datos a consumir
	 * @param asdieect_consultarTrazabilidad servicio a consumir
	 * @return TipoSalidaConsultaActosTurnoVO Datos de respuesta del servicio
	 */

	private TipoSalidaConsultaActosTurnoVO consultaActosTurno(ClienteIntegracionVO aci_clienteIntegracionVO,
			SDIEEConsultaTrazabilidad asdieect_consultarTrazabilidad) {

		if (!(aci_clienteIntegracionVO instanceof TipoEntradaConsultaActosTurnoVO)) {
			throw new IllegalArgumentException();
		}

		TipoEntradaConsultaActosTurnoVO ltecat_tipoEntradaConsultaActosTurnoVO = (TipoEntradaConsultaActosTurnoVO) aci_clienteIntegracionVO;

		TipoEntradaConsultaActosTurno ltecat_consultaActosTurno = ConsultaActosTurnoConverter
				.voATipo(ltecat_tipoEntradaConsultaActosTurnoVO);

		UtilidadLog<TipoEntradaConsultaActosTurnoVO> lultecat_utilidadLogEntrada = new UtilidadLog<>();
		lultecat_utilidadLogEntrada.generarDebugObjeto(ltecat_tipoEntradaConsultaActosTurnoVO,
				TipoEntradaConsultaActosTurnoVO.class, EnumLog.ENTRADA_SERVICIO.getIs_codigo());

		TipoSalidaConsultaActosTurno ltscat_tipoSalidaConsultaActosTurno = asdieect_consultarTrazabilidad
				.consultaActosTurno(ltecat_consultaActosTurno);

		TipoSalidaConsultaActosTurnoVO ltscat_tipoSalidaConsultaActosTurnoVO;
		ltscat_tipoSalidaConsultaActosTurnoVO = ConsultaActosTurnoConverter
				.tipoAVo(ltscat_tipoSalidaConsultaActosTurno);

		UtilidadLog<TipoSalidaConsultaActosTurnoVO> lul_utilidadLogSalida = new UtilidadLog<>();
		lul_utilidadLogSalida.generarDebugObjeto(ltscat_tipoSalidaConsultaActosTurnoVO,
				TipoSalidaConsultaActosTurnoVO.class, EnumLog.SALIDA_SERVICIO.getIs_codigo());
		return ltscat_tipoSalidaConsultaActosTurnoVO;
	}

	/**
	 * Metodo que realiza la operacion de consultar detalle certificado del servicio
	 * de consulta trazabilidad.
	 *
	 * @param aci_clienteIntegracionVO  datos a consumir
	 * @param asdieect_consultarTrazabilidad servicio a consumir
	 * @return TipoSalidaConsultaActosTurnoVO Datos de respuesta del servicio
	 */

	private TipoSalidaConsultaDetalleCertificadoVO consultaDetalleCertificado(
			ClienteIntegracionVO aci_clienteIntegracionVO, SDIEEConsultaTrazabilidad asdieect_consultarTrazabilidad) {

		if (!(aci_clienteIntegracionVO instanceof TipoEntradaConsultaDetalleCertificadoVO)) {
			throw new IllegalArgumentException();
		}

		TipoEntradaConsultaDetalleCertificadoVO ltecat_tipoEntradaConsultaConsultaDetalleCertificadoVO = (TipoEntradaConsultaDetalleCertificadoVO) aci_clienteIntegracionVO;

		TipoEntradaConsultaDetalleCertificado ltecdc_consultaDetalleCertificado = ConsultaDetalleCertificadoConverter
				.voATipo(ltecat_tipoEntradaConsultaConsultaDetalleCertificadoVO);

		UtilidadLog<TipoEntradaConsultaDetalleCertificadoVO> lul_utilidadLogEntrada = new UtilidadLog<>();
		lul_utilidadLogEntrada.generarDebugObjeto(ltecat_tipoEntradaConsultaConsultaDetalleCertificadoVO,
				TipoEntradaConsultaDetalleCertificadoVO.class, EnumLog.ENTRADA_SERVICIO.getIs_codigo());

		TipoSalidaConsultaDetalleCertificado ltscdc_tipoSalidaConsultaDetalleCertificado = asdieect_consultarTrazabilidad
				.consultaDetalleCertificado(ltecdc_consultaDetalleCertificado);

		TipoSalidaConsultaDetalleCertificadoVO ltscdc_tipoSalidaConsultaDetalleCertificadoTurnoVO;
		ltscdc_tipoSalidaConsultaDetalleCertificadoTurnoVO = ConsultaDetalleCertificadoConverter
				.tipoAVo(ltscdc_tipoSalidaConsultaDetalleCertificado);

		UtilidadLog<TipoSalidaConsultaDetalleCertificadoVO> lul_utilidadLogSalida = new UtilidadLog<>();
		lul_utilidadLogSalida.generarDebugObjeto(ltscdc_tipoSalidaConsultaDetalleCertificadoTurnoVO,
				TipoSalidaConsultaDetalleCertificadoVO.class, EnumLog.SALIDA_SERVICIO.getIs_codigo());
		return ltscdc_tipoSalidaConsultaDetalleCertificadoTurnoVO;
	}

}

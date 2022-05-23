/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: ServicioConsultarDatosRegistrales.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.fabrica
 * Nombre del elemento: ServicioConsultarDatosRegistrales
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.fabrica;

import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;

import org.apache.log4j.Logger;

import co.gov.supernotariado.bachue.clientebus.consultardatosregistrales.operacion.SDICIConsultaDatosRegistrales;
import co.gov.supernotariado.bachue.clientebus.consultardatosregistrales.types.TipoEntradaConsultarDatosRegistrales;
import co.gov.supernotariado.bachue.clientebus.consultardatosregistrales.types.TipoSalidaConsultarDatosRegistrales;
import co.gov.supernotariado.bachue.clientebus.converter.ConsultarDatosRegistralesConverter;
import co.gov.supernotariado.bachue.clientebus.enums.EnumLog;
import co.gov.supernotariado.bachue.clientebus.enums.EnumOperacionesSoap;
import co.gov.supernotariado.bachue.clientebus.servicios.SDICIConsultaDatosRegistralesService;
import co.gov.supernotariado.bachue.clientebus.util.UtilidadClienteSoap;
import co.gov.supernotariado.bachue.clientebus.util.UtilidadLog;
import co.gov.supernotariado.bachue.clientebus.vo.ClienteIntegracionVO;
import co.gov.supernotariado.bachue.clientebus.vo.consultardatosregistrales.TipoEntradaConsultarDatosRegistralesVO;
import co.gov.supernotariado.bachue.clientebus.vo.consultardatosregistrales.TipoSalidaConsultarDatosRegistralesVO;

/**
 * Implementacion de interfaces para el servicio consulta datos registrales.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ServicioConsultarDatosRegistrales implements IServicioWeb {

	/**
	 * Define la constante CL_LOGGER.
	 */
	static final Logger CL_LOGGER = Logger.getLogger(ServicioConsultarDatosRegistrales.class);

	/**
	 * Metodo que realiza la operacion de consultar datos registrales del servicio
	 * de consultar datos registrales.
	 *
	 * @param aci_clienteIntegracionVO datos a enviar al servicio
	 * @param acdr_datosRegistrales    el parametro datos registrales
	 * @return TipoSalidaConsultarDatosRegistralesVO Datos de respuesta del servicio
	 */
	private TipoSalidaConsultarDatosRegistralesVO consultarDatosRegistrales(
			ClienteIntegracionVO aci_clienteIntegracionVO, SDICIConsultaDatosRegistrales acdr_datosRegistrales) {

		if (!(aci_clienteIntegracionVO instanceof TipoEntradaConsultarDatosRegistralesVO)) {
			throw new IllegalArgumentException();
		}

		TipoEntradaConsultarDatosRegistralesVO ltecdr_tipoEntradaConsultarDatosRegistralesVO = (TipoEntradaConsultarDatosRegistralesVO) aci_clienteIntegracionVO;
		UtilidadLog<TipoEntradaConsultarDatosRegistralesVO> lultecdr_utilidadLogEntrada = new UtilidadLog<>();
		lultecdr_utilidadLogEntrada.generarDebugObjeto(ltecdr_tipoEntradaConsultarDatosRegistralesVO,
				TipoEntradaConsultarDatosRegistralesVO.class, EnumLog.ENTRADA_SERVICIO.getIs_codigo());

		TipoEntradaConsultarDatosRegistrales ltecdr_consultarDatosRegistrales = ConsultarDatosRegistralesConverter
				.voATipo(ltecdr_tipoEntradaConsultarDatosRegistralesVO);

		TipoSalidaConsultarDatosRegistrales ltscdr_salidaConsultarDatosRegistrales = acdr_datosRegistrales
				.consultarDatosRegistrales(ltecdr_consultarDatosRegistrales);

		TipoSalidaConsultarDatosRegistralesVO ltscdr_consultarDatosRegistralesSalidaVO;
		ltscdr_consultarDatosRegistralesSalidaVO = ConsultarDatosRegistralesConverter
				.tipoAVo(ltscdr_salidaConsultarDatosRegistrales);

		UtilidadLog<TipoSalidaConsultarDatosRegistralesVO> lultscdr_utilidadLogSalida = new UtilidadLog<>();
		lultscdr_utilidadLogSalida.generarDebugObjeto(ltscdr_consultarDatosRegistralesSalidaVO,
				TipoSalidaConsultarDatosRegistralesVO.class, EnumLog.SALIDA_SERVICIO.getIs_codigo());

		return ltscdr_consultarDatosRegistralesSalidaVO;

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
			ClienteIntegracionVO lci_clienteIntegracionVO = new ClienteIntegracionVO();

			QName qname = new QName(aci_clienteIntegracionVO.getIs_espacioNombre(),
					aci_clienteIntegracionVO.getIs_nombreServicioSoap());
			SDICIConsultaDatosRegistralesService lcdr_consultaDatosRegistralesService = new SDICIConsultaDatosRegistralesService(
					null, qname);
			SDICIConsultaDatosRegistrales lcdr_datosRegistrales = lcdr_consultaDatosRegistralesService
					.getSDICIConsultaDatosRegistralesPort();
			UtilidadClienteSoap.insertarPropiedadesConexion(aci_clienteIntegracionVO,
					(BindingProvider) lcdr_datosRegistrales);

			if (as_operacion.equalsIgnoreCase(
					EnumOperacionesSoap.CONSULTAR_DATOS_REGISTRALES_CONSULTAR.getIs_nombreOperacion())) {
				lci_clienteIntegracionVO = consultarDatosRegistrales(aci_clienteIntegracionVO, lcdr_datosRegistrales);
			}

			return lci_clienteIntegracionVO;
		} catch (Exception ae_excepcion) {
			CL_LOGGER.error(ae_excepcion.getMessage(), ae_excepcion);

			throw ae_excepcion;
		}
	}

}

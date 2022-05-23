/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: ServicioBusquedaDocumento.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.fabrica
 * Nombre del elemento: ServicioBusquedaDocumento
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.fabrica;

import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;

import org.apache.log4j.Logger;

import co.gov.supernotariado.bachue.clientebus.busquedadocumentos.operacion.SUTCIBusquedaDocumentos;
import co.gov.supernotariado.bachue.clientebus.busquedadocumentos.types.consultar.TipoEntradaConsultar;
import co.gov.supernotariado.bachue.clientebus.busquedadocumentos.types.obtenerarchivo.TipoEntradaObtenerArchivo;
import co.gov.supernotariado.bachue.clientebus.converter.BusquedaDocumentosConsultarConverter;
import co.gov.supernotariado.bachue.clientebus.converter.ObtenerArchivoConverter;
import co.gov.supernotariado.bachue.clientebus.enums.EnumLog;
import co.gov.supernotariado.bachue.clientebus.enums.EnumOperacionesSoap;
import co.gov.supernotariado.bachue.clientebus.servicios.SUTCIBusquedaDocumentosService;
import co.gov.supernotariado.bachue.clientebus.util.UtilidadClienteSoap;
import co.gov.supernotariado.bachue.clientebus.util.UtilidadLog;
import co.gov.supernotariado.bachue.clientebus.vo.ClienteIntegracionVO;
import co.gov.supernotariado.bachue.clientebus.vo.busquedadocumentos.TipoEntradaConsultarVO;
import co.gov.supernotariado.bachue.clientebus.vo.busquedadocumentos.TipoEntradaObtenerArchivoVO;
import co.gov.supernotariado.bachue.clientebus.vo.busquedadocumentos.TipoSalidaConsultarVO;
import co.gov.supernotariado.bachue.clientebus.vo.busquedadocumentos.TipoSalidaObtenerArchivoVO;

/**
 * Implementacion de interfaces para el servicio busqueda documentos.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ServicioBusquedaDocumento implements IServicioWeb {

	/**
	 * Define la constante CL_LOGGER.
	 */
	static final Logger CL_LOGGER = Logger.getLogger(ServicioBusquedaDocumento.class);

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.clientebus.fabrica.IServicioWeb#ejecutar(co.gov.supernotariado.bachue.clientebus.vo.ClienteIntegracionVO, java.lang.String, org.apache.log4j.Logger)
	 */
	@Override
	public ClienteIntegracionVO ejecutar(ClienteIntegracionVO aci_clienteIntegracionVO, String as_operacion,
			Logger al_logger) {
		try {
			ClienteIntegracionVO lci_clienteIntegracionVO = new ClienteIntegracionVO();

			QName qname = new QName(aci_clienteIntegracionVO.getIs_espacioNombre(),
					aci_clienteIntegracionVO.getIs_nombreServicioSoap());
			SUTCIBusquedaDocumentosService lsgats_busquedaDocumentosServicio = new SUTCIBusquedaDocumentosService(null,
					qname);
			SUTCIBusquedaDocumentos lsbd_busquedaDocumentos = lsgats_busquedaDocumentosServicio
					.getSUTCIBusquedaDocumentosSOAP12BindingQSPort();
			UtilidadClienteSoap.insertarPropiedadesConexion(aci_clienteIntegracionVO,
					(BindingProvider) lsbd_busquedaDocumentos);

			if (as_operacion
					.equalsIgnoreCase(EnumOperacionesSoap.BUSQUEDA_DOCUMENTOS_CONSULTAR.getIs_nombreOperacion())) {
				lci_clienteIntegracionVO = consultar(aci_clienteIntegracionVO, lsbd_busquedaDocumentos);
			} else if (as_operacion.equalsIgnoreCase(
					EnumOperacionesSoap.BUSQUEDA_DOCUMENTOS_OBTENER_ARCHIVO.getIs_nombreOperacion())) {
				lci_clienteIntegracionVO = obtenerArchivo(aci_clienteIntegracionVO, lsbd_busquedaDocumentos);
			}
			return lci_clienteIntegracionVO;
		} catch (Exception ae_excepcion) {
			CL_LOGGER.error(ae_excepcion.getMessage(), ae_excepcion);

			throw ae_excepcion;
		}
	}

	/**
	 * Metodo que llama la operacion de obtener archivo del servicio busqueda de
	 * documentos.
	 *
	 * @param aci_clienteIntegracionVO datos del cliente a enviar
	 * @param asbd_busquedaDocumentos  servicio el cual realiza el metodo
	 * @return TipoSalidaObtenerArchivoVO Datos de respuesta del servicio
	 */
	private TipoSalidaObtenerArchivoVO obtenerArchivo(ClienteIntegracionVO aci_clienteIntegracionVO,
			SUTCIBusquedaDocumentos asbd_busquedaDocumentos) {
		if (!(aci_clienteIntegracionVO instanceof TipoEntradaObtenerArchivoVO)) {
			throw new IllegalArgumentException();
		}
		TipoEntradaObtenerArchivoVO lteoa_tipoEntradaObtenerArchivoVo = (TipoEntradaObtenerArchivoVO) aci_clienteIntegracionVO;
		TipoEntradaObtenerArchivo lteoa_tipoEntradaObtenerArchivo = ObtenerArchivoConverter
				.voATipo(lteoa_tipoEntradaObtenerArchivoVo);

		UtilidadLog<TipoEntradaObtenerArchivoVO> lulteoa_utilidadLogEntrada = new UtilidadLog<>();
		lulteoa_utilidadLogEntrada.generarDebugObjeto(lteoa_tipoEntradaObtenerArchivoVo,
				TipoEntradaObtenerArchivoVO.class, EnumLog.ENTRADA_SERVICIO.getIs_codigo());

		TipoSalidaObtenerArchivoVO ltsoa_tipoSalidaObtenerArchivo;
		ltsoa_tipoSalidaObtenerArchivo = ObtenerArchivoConverter
				.tipoAVo(asbd_busquedaDocumentos.obtenerArchivo(lteoa_tipoEntradaObtenerArchivo));

		UtilidadLog<TipoSalidaObtenerArchivoVO> lultsoa_utilidadLogSalida = new UtilidadLog<>();
		lultsoa_utilidadLogSalida.generarDebugObjeto(ltsoa_tipoSalidaObtenerArchivo, TipoSalidaObtenerArchivoVO.class,
				EnumLog.SALIDA_SERVICIO.getIs_codigo());

		return ltsoa_tipoSalidaObtenerArchivo;
	}

	/**
	 * Metodo que llama la operacion de consultar del servicio busqueda de
	 * documentos.
	 *
	 * @param aci_clienteIntegracionVO datos del cliente a enviar
	 * @param asbd_busquedaDocumentos  servicio el cual realiza el metodo
	 * @return TipoSalidaConsultarVO Datos de respuesta del servicio
	 */
	private TipoSalidaConsultarVO consultar(ClienteIntegracionVO aci_clienteIntegracionVO,
			SUTCIBusquedaDocumentos asbd_busquedaDocumentos) {
		if (!(aci_clienteIntegracionVO instanceof TipoEntradaConsultarVO)) {
			throw new IllegalArgumentException();
		}

		TipoEntradaConsultarVO ltec_tipoEntradaConsultarVo = (TipoEntradaConsultarVO) aci_clienteIntegracionVO;
		TipoEntradaConsultar ltec_tipoEntradaConsultar = BusquedaDocumentosConsultarConverter
				.voATipo(ltec_tipoEntradaConsultarVo);

		UtilidadLog<TipoEntradaConsultarVO> lultec_utilidadLogEntrada = new UtilidadLog<>();
		lultec_utilidadLogEntrada.generarDebugObjeto(ltec_tipoEntradaConsultarVo, TipoEntradaConsultarVO.class,
				EnumLog.ENTRADA_SERVICIO.getIs_codigo());

		TipoSalidaConsultarVO ltsc_tipoSalidaConsultarVo;
		ltsc_tipoSalidaConsultarVo = BusquedaDocumentosConsultarConverter
				.tipoAVo(asbd_busquedaDocumentos.consultar(ltec_tipoEntradaConsultar));

		UtilidadLog<TipoSalidaConsultarVO> lultsc_utilidadLogSalida = new UtilidadLog<>();
		lultsc_utilidadLogSalida.generarDebugObjeto(ltsc_tipoSalidaConsultarVo, TipoSalidaConsultarVO.class,
				EnumLog.SALIDA_SERVICIO.getIs_codigo());

		return ltsc_tipoSalidaConsultarVo;
	}

}

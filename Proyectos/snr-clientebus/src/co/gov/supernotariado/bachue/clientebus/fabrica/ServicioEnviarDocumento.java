/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: ServicioEnviarDocumento.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.fabrica
 * Nombre del elemento: ServicioEnviarDocumento
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.fabrica;

import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;

import org.apache.log4j.Logger;

import co.gov.supernotariado.bachue.clientebus.converter.EnviarDocumentoConverter;
import co.gov.supernotariado.bachue.clientebus.enums.EnumLog;
import co.gov.supernotariado.bachue.clientebus.enums.EnumOperacionesSoap;
import co.gov.supernotariado.bachue.clientebus.enviodocumento.operacion.SUTCOEnvioDocumentos;
import co.gov.supernotariado.bachue.clientebus.enviodocumento.types.TipoEntradaEnviarDocumento;
import co.gov.supernotariado.bachue.clientebus.servicios.SUTCOEnvioDocumentosService;
import co.gov.supernotariado.bachue.clientebus.util.UtilidadClienteSoap;
import co.gov.supernotariado.bachue.clientebus.util.UtilidadLog;
import co.gov.supernotariado.bachue.clientebus.vo.ClienteIntegracionVO;
import co.gov.supernotariado.bachue.clientebus.vo.enviardocumentos.TipoEntradaEnviarDocumentoVO;
import co.gov.supernotariado.bachue.clientebus.vo.enviardocumentos.TipoSalidaEnviarDocumentoVO;

/**
 * Implementacion de interfaces para el servicio enviar documento.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ServicioEnviarDocumento implements IServicioWeb {

	/**
	 * Define la constante CL_LOGGER.
	 */
	static final Logger CL_LOGGER = Logger.getLogger(ServicioEnviarDocumento.class);

	/**
	 * Metodo que llama la operacion de enviar documentos del servicio de Envio
	 * documento.
	 *
	 * @param aci_clienteIntegracionVo datos del cliente a enviar
	 * @param ased_enivoDocumento      servicio el cual realiza el metodo
	 * @return TipoSalidaEnviarDocumentoVO Datos de respuesta del servicio
	 */
	private TipoSalidaEnviarDocumentoVO enviarDocumento(ClienteIntegracionVO aci_clienteIntegracionVo,
			SUTCOEnvioDocumentos ased_enivoDocumento) {
		if (!(aci_clienteIntegracionVo instanceof TipoEntradaEnviarDocumentoVO)) {
			throw new IllegalArgumentException();
		}
		TipoEntradaEnviarDocumentoVO lteed_tipoEntradaEnviarDocumentoVo = (TipoEntradaEnviarDocumentoVO) aci_clienteIntegracionVo;
		TipoEntradaEnviarDocumento lteed_tipoEntradaEnviarDocumento = EnviarDocumentoConverter
				.voATipo(lteed_tipoEntradaEnviarDocumentoVo);

		UtilidadLog<TipoEntradaEnviarDocumentoVO> lulteed_utilidadLogEntrada = new UtilidadLog<>();
		lulteed_utilidadLogEntrada.generarDebugObjeto(lteed_tipoEntradaEnviarDocumentoVo,
				TipoEntradaEnviarDocumentoVO.class, EnumLog.ENTRADA_SERVICIO.getIs_codigo());

		TipoSalidaEnviarDocumentoVO ltsed_tipoSalidaEnviarDocumento;
		ltsed_tipoSalidaEnviarDocumento = EnviarDocumentoConverter
				.tipoAVo(ased_enivoDocumento.enviarDocumento(lteed_tipoEntradaEnviarDocumento));

		UtilidadLog<TipoSalidaEnviarDocumentoVO> lultsed_utilidadLogSalida = new UtilidadLog<>();
		lultsed_utilidadLogSalida.generarDebugObjeto(ltsed_tipoSalidaEnviarDocumento, TipoSalidaEnviarDocumentoVO.class,
				EnumLog.SALIDA_SERVICIO.getIs_codigo());

		return ltsed_tipoSalidaEnviarDocumento;
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
			SUTCOEnvioDocumentosService lseds_envioDocumentosService = new SUTCOEnvioDocumentosService(null, qname);
			SUTCOEnvioDocumentos led_enivoDocumentos = lseds_envioDocumentosService.getSUTCOEnvioDocumentosPort();
			UtilidadClienteSoap.insertarPropiedadesConexion(aci_clienteIntegracionVO,
					(BindingProvider) led_enivoDocumentos);

			if (as_operacion
					.equalsIgnoreCase(EnumOperacionesSoap.ENVIO_DOCUMENTO_ENVIAR_DOCUMENTO.getIs_nombreOperacion())) {
				lci_clienteIntegracionVO = enviarDocumento(aci_clienteIntegracionVO, led_enivoDocumentos);
			}
			return lci_clienteIntegracionVO;
		} catch (Exception ae_excepcion) {
			CL_LOGGER.error(ae_excepcion.getMessage(), ae_excepcion);

			throw ae_excepcion;
		}
	}

}

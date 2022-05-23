/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: ServicioConsultaCatalogos.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.fabrica
 * Nombre del elemento: ServicioConsultaCatalogos
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.fabrica;

import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;

import org.apache.log4j.Logger;

import co.gov.supernotariado.bachue.clientebus.consultacatalogos.operacion.SDIEEConsultaCatalogos;
import co.gov.supernotariado.bachue.clientebus.consultacatalogos.types.consultarcatalogos.TipoEntradaConsultarCatalogos;
import co.gov.supernotariado.bachue.clientebus.converter.ConsultarCatalogosConverter;
import co.gov.supernotariado.bachue.clientebus.enums.EnumLog;
import co.gov.supernotariado.bachue.clientebus.enums.EnumOperacionesSoap;
import co.gov.supernotariado.bachue.clientebus.servicios.SDIEEConsultaCatalogosService;
import co.gov.supernotariado.bachue.clientebus.util.UtilidadClienteSoap;
import co.gov.supernotariado.bachue.clientebus.util.UtilidadLog;
import co.gov.supernotariado.bachue.clientebus.vo.ClienteIntegracionVO;
import co.gov.supernotariado.bachue.clientebus.vo.consultacatalogos.TipoEntradaConsultarCatalogosVO;
import co.gov.supernotariado.bachue.clientebus.vo.consultacatalogos.TipoSalidaConsultarCatalogosVO;

/**
 * Implementacion de interfaces para el servicio catalogos.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ServicioConsultaCatalogos implements IServicioWeb {

	/**
	 * Define la constante CL_LOGGER.
	 */
	static final Logger CL_LOGGER = Logger.getLogger(ServicioConsultaCatalogos.class);

	/**
	 * Metodo que realiza la operacion de consultar catalogos.
	 *
	 * @param aci_clienteIntegracioVO el parametro cliente integracio objeto con
	 *                                valores de servicio
	 * @param acc_consultaCatalogos   servicio a consumir en este caso consulta
	 *                                catalogos
	 * @return TipoSalidaConsultarCatalogosVO Datos de respuesta del servicio
	 */
	private TipoSalidaConsultarCatalogosVO consultarCatalogos(ClienteIntegracionVO aci_clienteIntegracioVO,
			SDIEEConsultaCatalogos acc_consultaCatalogos) {
		if (!(aci_clienteIntegracioVO instanceof TipoEntradaConsultarCatalogosVO)) {
			throw new IllegalArgumentException();
		}
		TipoEntradaConsultarCatalogosVO ltecc_tipoEntradaConsultarCatalogosVo = (TipoEntradaConsultarCatalogosVO) aci_clienteIntegracioVO;
		TipoEntradaConsultarCatalogos ltecc_tipoEntradaConsultarCatalogos = ConsultarCatalogosConverter
				.voATipo(ltecc_tipoEntradaConsultarCatalogosVo);

		UtilidadLog<TipoEntradaConsultarCatalogosVO> lul_utilidadLogEntrada = new UtilidadLog<>();
		lul_utilidadLogEntrada.generarDebugObjeto(ltecc_tipoEntradaConsultarCatalogosVo,
				TipoEntradaConsultarCatalogosVO.class, EnumLog.ENTRADA_SERVICIO.getIs_codigo());

		TipoSalidaConsultarCatalogosVO ltscc_tipoSalidaConsultarCatalogosVo;
		ltscc_tipoSalidaConsultarCatalogosVo = ConsultarCatalogosConverter
				.tipoAVo(acc_consultaCatalogos.consultarCatalogos(ltecc_tipoEntradaConsultarCatalogos));

		UtilidadLog<TipoSalidaConsultarCatalogosVO> lul_utilidadLogSalida = new UtilidadLog<>();
		lul_utilidadLogSalida.generarDebugObjeto(ltscc_tipoSalidaConsultarCatalogosVo,
				TipoSalidaConsultarCatalogosVO.class, EnumLog.SALIDA_SERVICIO.getIs_codigo());

		return ltscc_tipoSalidaConsultarCatalogosVo;
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
			SDIEEConsultaCatalogosService lccs_consultaCatalogosServicio = new SDIEEConsultaCatalogosService(null,
					qname);
			SDIEEConsultaCatalogos lcc_consultaCatalogos = lccs_consultaCatalogosServicio
					.getSDIEEConsultaCatalogosSOAP12BindingQSPort();
			UtilidadClienteSoap.insertarPropiedadesConexion(aci_clienteIntegracionVO,
					(BindingProvider) lcc_consultaCatalogos);

			if (as_operacion
					.equalsIgnoreCase(EnumOperacionesSoap.CONSULTA_CATALOGOS_CONSULTAR.getIs_nombreOperacion())) {
				lci_clienteIntegracionVO = consultarCatalogos(aci_clienteIntegracionVO, lcc_consultaCatalogos);
			}
			return lci_clienteIntegracionVO;
		} catch (Exception ae_excepcion) {
			CL_LOGGER.error(ae_excepcion.getMessage(), ae_excepcion);

			throw ae_excepcion;
		}
	}

}
/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: ServicioEstadoJuridicoFolio.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.fabrica
 * Nombre del elemento: ServicioEstadoJuridicoFolio
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.fabrica;

import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;

import org.apache.log4j.Logger;

import co.gov.supernotariado.bachue.clientebus.converter.ConsultarEstadoJuridicoConverter;
import co.gov.supernotariado.bachue.clientebus.enums.EnumLog;
import co.gov.supernotariado.bachue.clientebus.enums.EnumOperacionesSoap;
import co.gov.supernotariado.bachue.clientebus.estadojuridicofolio.operacion.SBBEEEstadoJuridicoFolio;
import co.gov.supernotariado.bachue.clientebus.estadojuridicofolio.types.consultarestadojuridico.TipoEntradaConsultaJuridicaFolio;
import co.gov.supernotariado.bachue.clientebus.servicios.SBBEEEstadoJuridicoFolioService;
import co.gov.supernotariado.bachue.clientebus.util.UtilidadClienteSoap;
import co.gov.supernotariado.bachue.clientebus.util.UtilidadLog;
import co.gov.supernotariado.bachue.clientebus.vo.ClienteIntegracionVO;
import co.gov.supernotariado.bachue.clientebus.vo.estadojuridicofolio.TipoEntradaConsultaJuridicaFolioVO;
import co.gov.supernotariado.bachue.clientebus.vo.estadojuridicofolio.TipoSalidaConsultaEstadoJuridicoFolioVO;

/**
 * Implementacion de interfaces para el servicio estado juridico folio.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ServicioEstadoJuridicoFolio implements IServicioWeb {

	/**
	 * Define la constante CL_LOGGER.
	 */
	static final Logger CL_LOGGER = Logger.getLogger(ServicioEstadoJuridicoFolio.class);

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
			SBBEEEstadoJuridicoFolioService lsejfs_estadoJuridicoFolioService = new SBBEEEstadoJuridicoFolioService(
					null, qname);
			SBBEEEstadoJuridicoFolio lsejf_estadoJuridicoFolio = lsejfs_estadoJuridicoFolioService
					.getSBBEEEstadoJuridicoFolioPort();
			UtilidadClienteSoap.insertarPropiedadesConexion(aci_clienteIntegracionVO,
					(BindingProvider) lsejf_estadoJuridicoFolio);

			if (as_operacion.equalsIgnoreCase(EnumOperacionesSoap.ESTADO_JURIDICO_FOLIO.getIs_nombreOperacion())) {
				lci_clienteIntegracionVO = consultarEstadoJuridico(aci_clienteIntegracionVO, lsejf_estadoJuridicoFolio);
			}
			return lci_clienteIntegracionVO;
		} catch (Exception ae_excepcion) {
			CL_LOGGER.debug(ae_excepcion.getMessage());
			throw ae_excepcion;
		}
	}

	/**
	 * Metodo encargado de consultar estado juridico.
	 *
	 * @param aci_clienteIntegracionVO  datos a consumir
	 * @param asejf_estadoJuridicoFolio servicio a consumir
	 * @return TipoSalidaConsultaEstadoJuridicoFolioVO Datos de respuesta del
	 *         servicio
	 */
	private TipoSalidaConsultaEstadoJuridicoFolioVO consultarEstadoJuridico(
			ClienteIntegracionVO aci_clienteIntegracionVO, SBBEEEstadoJuridicoFolio asejf_estadoJuridicoFolio) {
		if (!(aci_clienteIntegracionVO instanceof TipoEntradaConsultaJuridicaFolioVO)) {
			throw new IllegalArgumentException();
		}
		TipoEntradaConsultaJuridicaFolioVO ltecjf_tipoEntradaConsultarJuridicaFolioVo = (TipoEntradaConsultaJuridicaFolioVO) aci_clienteIntegracionVO;
		TipoEntradaConsultaJuridicaFolio ltecjf_tipoEntradaConsultarJuridicaFolio = ConsultarEstadoJuridicoConverter
				.voATipo(ltecjf_tipoEntradaConsultarJuridicaFolioVo);

		UtilidadLog<TipoEntradaConsultaJuridicaFolioVO> lultecjf_utilidadLogEntrada = new UtilidadLog<>();
		lultecjf_utilidadLogEntrada.generarDebugObjeto(ltecjf_tipoEntradaConsultarJuridicaFolioVo,
				TipoEntradaConsultaJuridicaFolioVO.class, EnumLog.ENTRADA_SERVICIO.getIs_codigo());

		TipoSalidaConsultaEstadoJuridicoFolioVO ltscejf_tipoSalidaConsultaEstadoJuridicoFolioVo;
		ltscejf_tipoSalidaConsultaEstadoJuridicoFolioVo = ConsultarEstadoJuridicoConverter
				.tipoAVo(asejf_estadoJuridicoFolio.consultarEstadoJuridico(ltecjf_tipoEntradaConsultarJuridicaFolio));

		UtilidadLog<TipoSalidaConsultaEstadoJuridicoFolioVO> lultscejf_utilidadLogSalida = new UtilidadLog<>();
		lultscejf_utilidadLogSalida.generarDebugObjeto(ltscejf_tipoSalidaConsultaEstadoJuridicoFolioVo,
				TipoSalidaConsultaEstadoJuridicoFolioVO.class, EnumLog.SALIDA_SERVICIO.getIs_codigo());

		return ltscejf_tipoSalidaConsultaEstadoJuridicoFolioVo;
	}

}
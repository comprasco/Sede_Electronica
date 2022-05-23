/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: ServicioConsultaMigracion.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.fabrica
 * Nombre del elemento: ServicioConsultaMigracion
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.fabrica;

import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;

import org.apache.log4j.Logger;

import co.gov.supernotariado.bachue.clientebus.consultamigracion.operacion.SUTCBConsultaMigracion;
import co.gov.supernotariado.bachue.clientebus.consultamigracion.types.consultarmigracionmatriculas.TipoEntradaConsultaMigracionMatriculas;
import co.gov.supernotariado.bachue.clientebus.consultamigracion.types.consultarmigracionpredio.TipoEntradaConsultaMigracionPredio;
import co.gov.supernotariado.bachue.clientebus.converter.ConsultarMigracionMatriculasConverter;
import co.gov.supernotariado.bachue.clientebus.converter.ConsultarMigracionPredioConverter;
import co.gov.supernotariado.bachue.clientebus.enums.EnumLog;
import co.gov.supernotariado.bachue.clientebus.enums.EnumOperacionesSoap;
import co.gov.supernotariado.bachue.clientebus.servicios.SUTCBConsultaMigracionService;
import co.gov.supernotariado.bachue.clientebus.util.UtilidadClienteSoap;
import co.gov.supernotariado.bachue.clientebus.util.UtilidadLog;
import co.gov.supernotariado.bachue.clientebus.vo.ClienteIntegracionVO;
import co.gov.supernotariado.bachue.clientebus.vo.consultamigracion.TipoEntradaConsultaMigracionMatriculasVO;
import co.gov.supernotariado.bachue.clientebus.vo.consultamigracion.TipoEntradaConsultaMigracionPredioVO;
import co.gov.supernotariado.bachue.clientebus.vo.consultamigracion.TipoSalidaConsultaMigracionMatriculasVO;
import co.gov.supernotariado.bachue.clientebus.vo.consultamigracion.TipoSalidaConsultaMigracionPredioVO;

/**
 * Implementacion de interfaces para el servicio consulta migracion.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */

public class ServicioConsultaMigracion implements IServicioWeb {

	/**
	 * Define la constante CL_LOGGER.
	 */
	static final Logger CL_LOGGER = Logger.getLogger(ServicioConsultaMigracion.class);

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
			Logger al_logger) throws Exception {
		try {
			ClienteIntegracionVO lci_clienteIntegracionVO = new ClienteIntegracionVO();

			QName qname = new QName(aci_clienteIntegracionVO.getIs_espacioNombre(),
					aci_clienteIntegracionVO.getIs_nombreServicioSoap());
			SUTCBConsultaMigracionService lscm_consultaMigracion = new SUTCBConsultaMigracionService(null, qname);
			SUTCBConsultaMigracion as_consultaMigracion = lscm_consultaMigracion.getSUTCBConsultaMigracionPort();
			UtilidadClienteSoap.insertarPropiedadesConexion(aci_clienteIntegracionVO,
					(BindingProvider) as_consultaMigracion);

			if (as_operacion
					.equalsIgnoreCase(EnumOperacionesSoap.CONSULTAR_MIGRACION_MATRICULAS.getIs_nombreOperacion())) {
				lci_clienteIntegracionVO = consultarMigracionMatriculas(aci_clienteIntegracionVO, as_consultaMigracion);
			} else if (as_operacion
					.equalsIgnoreCase(EnumOperacionesSoap.CONSULTAR_MIGRACION_PREDIO.getIs_nombreOperacion())) {
				lci_clienteIntegracionVO = consultarMigracionPredio(aci_clienteIntegracionVO, as_consultaMigracion);

			}
			return lci_clienteIntegracionVO;
		} catch (Exception ae_excepcion) {
			CL_LOGGER.debug(ae_excepcion.getMessage());
			throw ae_excepcion;
		}
	}

	/**
	 * Metodo encargado de consultar migracion matriculas.
	 *
	 * @param aci_clienteIntegracionVO el parametro cliente integracion objeto con
	 *                                 valores de servicio
	 * @param ascm_consultaMigracion   el parametro consulta migracion
	 * @return Resultado para consultar migracion matriculas retornado como
	 *         TipoSalidaConsultaMigracionMatriculasVO
	 */
	private TipoSalidaConsultaMigracionMatriculasVO consultarMigracionMatriculas(
			ClienteIntegracionVO aci_clienteIntegracionVO, SUTCBConsultaMigracion ascm_consultaMigracion) {
		if (!(aci_clienteIntegracionVO instanceof TipoEntradaConsultaMigracionMatriculasVO)) {
			throw new IllegalArgumentException();
		}
		TipoEntradaConsultaMigracionMatriculasVO ltecmm_tipoEntradaConsultaMigracionMatriculasVo = (TipoEntradaConsultaMigracionMatriculasVO) aci_clienteIntegracionVO;
		TipoEntradaConsultaMigracionMatriculas ltecmm_tipoEntradaConsultaMigracionMatriculas = ConsultarMigracionMatriculasConverter
				.voATipo(ltecmm_tipoEntradaConsultaMigracionMatriculasVo);
		UtilidadLog<TipoEntradaConsultaMigracionMatriculasVO> lultecmm_utilidadLogEntrada = new UtilidadLog<>();
		lultecmm_utilidadLogEntrada.generarDebugObjeto(ltecmm_tipoEntradaConsultaMigracionMatriculasVo,
				TipoEntradaConsultaMigracionMatriculasVO.class, EnumLog.ENTRADA_SERVICIO.getIs_codigo());

		TipoSalidaConsultaMigracionMatriculasVO ltscmm_tipoSalidaConsultaMigracionMatriculasVo;
		ltscmm_tipoSalidaConsultaMigracionMatriculasVo = ConsultarMigracionMatriculasConverter.tipoAVo(
				ascm_consultaMigracion.consultarMigracionMatriculas(ltecmm_tipoEntradaConsultaMigracionMatriculas));
		UtilidadLog<TipoSalidaConsultaMigracionMatriculasVO> lultscmm_utilidadLogSalida = new UtilidadLog<>();
		lultscmm_utilidadLogSalida.generarDebugObjeto(ltscmm_tipoSalidaConsultaMigracionMatriculasVo,
				TipoSalidaConsultaMigracionMatriculasVO.class, EnumLog.SALIDA_SERVICIO.getIs_codigo());

		return ltscmm_tipoSalidaConsultaMigracionMatriculasVo;
	}

	/**
	 * Metodo encartado de consultar la migración por predio.
	 *
	 * @param aci_clienteIntegracionVO el parametro cliente integracion objeto con
	 *                                 valores de servicio
	 * @param ascm_consultaMigracion   el parametro consulta migracion
	 * @return Resultado para consultar migracion predio retornado como
	 *         TipoSalidaConsultaMigracionPredioVO
	 */
	private TipoSalidaConsultaMigracionPredioVO consultarMigracionPredio(ClienteIntegracionVO aci_clienteIntegracionVO,
			SUTCBConsultaMigracion ascm_consultaMigracion) {
		if (!(aci_clienteIntegracionVO instanceof TipoEntradaConsultaMigracionPredioVO)) {
			throw new IllegalArgumentException();
		}
		TipoEntradaConsultaMigracionPredioVO ltecmp_tipoEntradaConsultaMigracionPredioVo = (TipoEntradaConsultaMigracionPredioVO) aci_clienteIntegracionVO;
		TipoEntradaConsultaMigracionPredio ltecmp_tipoEntradaConsultaMigracionPredio = ConsultarMigracionPredioConverter
				.voATipo(ltecmp_tipoEntradaConsultaMigracionPredioVo);
		UtilidadLog<TipoEntradaConsultaMigracionPredioVO> lultecmp_utilidadLogEntrada = new UtilidadLog<>();
		lultecmp_utilidadLogEntrada.generarDebugObjeto(ltecmp_tipoEntradaConsultaMigracionPredioVo,
				TipoEntradaConsultaMigracionPredioVO.class, EnumLog.ENTRADA_SERVICIO.getIs_codigo());

		TipoSalidaConsultaMigracionPredioVO ltscmp_tipoSalidaConsultaMigracionPredioVo;
		ltscmp_tipoSalidaConsultaMigracionPredioVo = ConsultarMigracionPredioConverter
				.tipoAVo(ascm_consultaMigracion.consultarMigracionPredio(ltecmp_tipoEntradaConsultaMigracionPredio));
		UtilidadLog<TipoSalidaConsultaMigracionPredioVO> lultscmp_utilidadLogSalida = new UtilidadLog<>();
		lultscmp_utilidadLogSalida.generarDebugObjeto(ltscmp_tipoSalidaConsultaMigracionPredioVo,
				TipoSalidaConsultaMigracionPredioVO.class, EnumLog.SALIDA_SERVICIO.getIs_codigo());

		return ltscmp_tipoSalidaConsultaMigracionPredioVo;
	}


}

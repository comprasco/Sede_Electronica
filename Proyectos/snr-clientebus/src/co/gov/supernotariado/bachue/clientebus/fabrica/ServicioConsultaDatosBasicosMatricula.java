/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: ServicioConsultaDatosBasicosMatricula.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.fabrica
 * Nombre del elemento: ServicioConsultaDatosBasicosMatricula
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.fabrica;

import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;

import org.apache.log4j.Logger;

import co.gov.supernotariado.bachue.clientebus.consultadatosbasicos.operacion.SBBEEDatosBasicosMatricula;
import co.gov.supernotariado.bachue.clientebus.consultadatosbasicos.types.consultardatosbasicos.TipoEntradaDatosBasicosMatricula;
import co.gov.supernotariado.bachue.clientebus.converter.ConsultaDatosBasicosConverter;
import co.gov.supernotariado.bachue.clientebus.enums.EnumLog;
import co.gov.supernotariado.bachue.clientebus.enums.EnumOperacionesSoap;
import co.gov.supernotariado.bachue.clientebus.servicios.SBBEEDatosBasicosMatriculaService;
import co.gov.supernotariado.bachue.clientebus.util.UtilidadClienteSoap;
import co.gov.supernotariado.bachue.clientebus.util.UtilidadLog;
import co.gov.supernotariado.bachue.clientebus.vo.ClienteIntegracionVO;
import co.gov.supernotariado.bachue.clientebus.vo.consultadatosbasicos.TipoEntradaDatosBasicosMatriculaVO;
import co.gov.supernotariado.bachue.clientebus.vo.consultadatosbasicos.TipoSalidaDatosBasicosMatriculaVO;

/**
 * Implementacion de interfaces para el servicio consulta datos basicos
 * matricula.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ServicioConsultaDatosBasicosMatricula implements IServicioWeb {

	/**
	 * Define la constante CL_LOGGER.
	 */
	static final Logger CL_LOGGER = Logger.getLogger(ServicioConsultaDatosBasicosMatricula.class);

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

		QName qname = new QName(aci_clienteIntegracionVO.getIs_espacioNombre(),
				aci_clienteIntegracionVO.getIs_nombreServicioSoap());
		SBBEEDatosBasicosMatriculaService lsdbm_datosBasicosMatriculaServicio = new SBBEEDatosBasicosMatriculaService(
				null, qname);
		SBBEEDatosBasicosMatricula ldbm_datosBasicosMatricula = lsdbm_datosBasicosMatriculaServicio
				.getSBBEEDatosBasicosMatriculaQSPort();
		UtilidadClienteSoap.insertarPropiedadesConexion(aci_clienteIntegracionVO,
				(BindingProvider) ldbm_datosBasicosMatricula);

		if (as_operacion
				.equalsIgnoreCase(EnumOperacionesSoap.CONSULTA_DATOS_BASICOS_MATRICULA.getIs_nombreOperacion())) {
			if (!(aci_clienteIntegracionVO instanceof TipoEntradaDatosBasicosMatriculaVO)) {
				throw new IllegalArgumentException();
			}
			TipoEntradaDatosBasicosMatriculaVO ltedbm_tipoEntradaDatosBasicosMatriculaVo = (TipoEntradaDatosBasicosMatriculaVO) aci_clienteIntegracionVO;
			TipoEntradaDatosBasicosMatricula ltedbm_tipoEntradaDatosBasicosMatricula = ConsultaDatosBasicosConverter
					.voATipo(ltedbm_tipoEntradaDatosBasicosMatriculaVo);

			UtilidadLog<TipoEntradaDatosBasicosMatriculaVO> lultedbm_utilidadLogEntrada = new UtilidadLog<>();
			lultedbm_utilidadLogEntrada.generarDebugObjeto(ltedbm_tipoEntradaDatosBasicosMatriculaVo,
					TipoEntradaDatosBasicosMatriculaVO.class, EnumLog.ENTRADA_SERVICIO.getIs_codigo());

			TipoSalidaDatosBasicosMatriculaVO ltsdbm_tipoSalidaDatosBasicosMatricula;
			ltsdbm_tipoSalidaDatosBasicosMatricula = ConsultaDatosBasicosConverter
					.tipoAVo(ldbm_datosBasicosMatricula.consultarDatosBasicos(ltedbm_tipoEntradaDatosBasicosMatricula));

			UtilidadLog<TipoSalidaDatosBasicosMatriculaVO> lultsdbm_utilidadLogSalida = new UtilidadLog<>();
			lultsdbm_utilidadLogSalida.generarDebugObjeto(ltsdbm_tipoSalidaDatosBasicosMatricula,
					TipoSalidaDatosBasicosMatriculaVO.class, EnumLog.SALIDA_SERVICIO.getIs_codigo());

			return ltsdbm_tipoSalidaDatosBasicosMatricula;
		}
		return null;
	}

}

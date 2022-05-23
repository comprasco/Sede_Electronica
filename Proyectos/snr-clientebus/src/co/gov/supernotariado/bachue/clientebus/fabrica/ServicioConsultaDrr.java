/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: ServicioConsultaDrr.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.fabrica
 * Nombre del elemento: ServicioConsultaDrr
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.fabrica;

import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;

import org.apache.log4j.Logger;

import co.gov.supernotariado.bachue.clientebus.consultardrrmatriculas.operacion.SBBEERRRMatriculas;
import co.gov.supernotariado.bachue.clientebus.consultardrrmatriculas.type.consultarrrrmatriculas.TipoEntradaConsultarRRRMatriculas;
import co.gov.supernotariado.bachue.clientebus.converter.ConsultaRRRMatriculasConverter;
import co.gov.supernotariado.bachue.clientebus.enums.EnumLog;
import co.gov.supernotariado.bachue.clientebus.enums.EnumOperacionesSoap;
import co.gov.supernotariado.bachue.clientebus.servicios.SBBEERRRMatriculasService;
import co.gov.supernotariado.bachue.clientebus.util.UtilidadClienteSoap;
import co.gov.supernotariado.bachue.clientebus.util.UtilidadLog;
import co.gov.supernotariado.bachue.clientebus.vo.ClienteIntegracionVO;
import co.gov.supernotariado.bachue.clientebus.vo.consultarrrrmatriculas.TipoEntradaConsultarRRRMatriculasVO;
import co.gov.supernotariado.bachue.clientebus.vo.consultarrrrmatriculas.TipoSalidaConsultarRRRMatriculasVO;

/**
 * Implementacion de interfaces para el servicio consulta DRR<br>
 * Permite consultar la informacion asociada a los derechos, restricciones,
 * responsabilidades, hipotecas o publicidades sobre una propiedad inmueble con
 * Folio de Matricula Inmobiliaria
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ServicioConsultaDrr implements IServicioWeb {

	/**
	 * Define la constante CL_LOGGER.
	 */
	static final Logger CL_LOGGER = Logger.getLogger(ServicioConsultaDrr.class);

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

		ClienteIntegracionVO lci_clienteIntegracionVO = new ClienteIntegracionVO();
		try {
			QName lqn_qname = new QName(aci_clienteIntegracionVO.getIs_espacioNombre(),
					aci_clienteIntegracionVO.getIs_nombreServicioSoap());
			SBBEERRRMatriculasService lsms_ConsultaDrrServicio = new SBBEERRRMatriculasService(null, lqn_qname);
			SBBEERRRMatriculas lsm_consultarDrrMatriculas = lsms_ConsultaDrrServicio.getSBBEERRRMatriculasQSPort();

			UtilidadClienteSoap.insertarPropiedadesConexion(aci_clienteIntegracionVO,
					(BindingProvider) lsm_consultarDrrMatriculas);

			if (as_operacion.equalsIgnoreCase(EnumOperacionesSoap.CONSULTA_DRR.getIs_nombreOperacion())) {
				lci_clienteIntegracionVO = consultaDrr(aci_clienteIntegracionVO, lsm_consultarDrrMatriculas);
			}

			return lci_clienteIntegracionVO;
		} catch (Exception ae_excepcion) {
			CL_LOGGER.debug(ae_excepcion.getMessage());
			throw ae_excepcion;
		}
	}

	/**
	 * Consulta drr. Permite consultar la informacion asociada a los derechos,
	 * restricciones, responsabilidades, hipotecas o publicidades sobre una
	 * propiedad inmueble con Folio de Matricula Inmobiliaria
	 * 
	 * @param aci_clienteIntegracionVO el parametro cliente integracion objeto con
	 *                                 valores de servicio
	 * @param asm_consultaDrr          el parametro consulta drr
	 * @return Resultado para consulta drr retornado como
	 *         TipoSalidaConsultarRRRMatriculasVO
	 */
	private TipoSalidaConsultarRRRMatriculasVO consultaDrr(ClienteIntegracionVO aci_clienteIntegracionVO,
			SBBEERRRMatriculas asm_consultaDrr) {

		if (!(aci_clienteIntegracionVO instanceof TipoEntradaConsultarRRRMatriculasVO)) {
			throw new IllegalArgumentException();
		}
		TipoEntradaConsultarRRRMatriculasVO ltedbm_tipoEntradaDatosBasicosMatriculaVo = (TipoEntradaConsultarRRRMatriculasVO) aci_clienteIntegracionVO;
		TipoEntradaConsultarRRRMatriculas ltecrm_tipoEntradaConsultarRRRMatriculas = ConsultaRRRMatriculasConverter
				.voATipo(ltedbm_tipoEntradaDatosBasicosMatriculaVo);
		UtilidadLog<TipoEntradaConsultarRRRMatriculasVO> lultedbm_utilidadLogEntrada = new UtilidadLog<>();
		lultedbm_utilidadLogEntrada.generarDebugObjeto(ltedbm_tipoEntradaDatosBasicosMatriculaVo,
				TipoEntradaConsultarRRRMatriculasVO.class, EnumLog.ENTRADA_SERVICIO.getIs_codigo());
		TipoSalidaConsultarRRRMatriculasVO ltsdbm_tipoSalidaConsultarRRRMatriculasVO;
		ltsdbm_tipoSalidaConsultarRRRMatriculasVO = ConsultaRRRMatriculasConverter
				.tipoAVo(asm_consultaDrr.consultarRRRMatriculas(ltecrm_tipoEntradaConsultarRRRMatriculas));
		UtilidadLog<TipoSalidaConsultarRRRMatriculasVO> lultsdbm_utilidadLogSalida = new UtilidadLog<>();
		lultsdbm_utilidadLogSalida.generarDebugObjeto(ltsdbm_tipoSalidaConsultarRRRMatriculasVO,
				TipoSalidaConsultarRRRMatriculasVO.class, EnumLog.SALIDA_SERVICIO.getIs_codigo());

		return ltsdbm_tipoSalidaConsultarRRRMatriculasVO;
	}

}

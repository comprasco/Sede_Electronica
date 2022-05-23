/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: ServicioAlertaTierras.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.fabrica
 * Nombre del elemento: ServicioAlertaTierras
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.fabrica;

import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;

import org.apache.log4j.Logger;

import co.gov.supernotariado.bachue.clientebus.alertatierras.operacion.SBBEEAlertaTierras;
import co.gov.supernotariado.bachue.clientebus.alertatierras.types.activaralertatierras.TipoEntradaActivarAlertaTierras;
import co.gov.supernotariado.bachue.clientebus.alertatierras.types.agregarlistamatriculasalerta.TipoEntradaAgregarListaMatriculasAlerta;
import co.gov.supernotariado.bachue.clientebus.alertatierras.types.agregarmatriculaalerta.TipoEntradaAgregarMatriculaAlerta;
import co.gov.supernotariado.bachue.clientebus.alertatierras.types.cancelaringresoalertatierras.TipoEntradaCancelarIngresoAlertaTierras;
import co.gov.supernotariado.bachue.clientebus.alertatierras.types.consultaralertas.TipoEntradaConsultarAlertas;
import co.gov.supernotariado.bachue.clientebus.alertatierras.types.consultardetallealerta.TipoEntradaConsultarDetalleAlerta;
import co.gov.supernotariado.bachue.clientebus.alertatierras.types.consultardocumentoalerta.TipoEntradaConsultarDocumentoAlerta;
import co.gov.supernotariado.bachue.clientebus.alertatierras.types.consultarentidadesja.EntradaConsultarEntidadesJA;
import co.gov.supernotariado.bachue.clientebus.alertatierras.types.consultarlistamatriculas.TipoEntradaConsultarListaMatriculas;
import co.gov.supernotariado.bachue.clientebus.alertatierras.types.consultarmapapredioinfocatastral.TipoEntradaConsultarMapaPredioInfoCatastral;
import co.gov.supernotariado.bachue.clientebus.alertatierras.types.consultarmatricula.TipoEntradaConsultarMatricula;
import co.gov.supernotariado.bachue.clientebus.alertatierras.types.consultarmatriculaalerta.TipoEntradaConsultarMatriculaAlerta;
import co.gov.supernotariado.bachue.clientebus.alertatierras.types.consultarmatriculafiltrostierras.TipoEntradaConsultarMatriculaFiltrosTierras;
import co.gov.supernotariado.bachue.clientebus.alertatierras.types.consultarmatriculainfocatastral.TipoEntradaConsultarMatriculaInfoCatastral;
import co.gov.supernotariado.bachue.clientebus.alertatierras.types.consultaroficinasorigentipo.TipoEntradaConsultarOficinasOrigenTipo;
import co.gov.supernotariado.bachue.clientebus.alertatierras.types.crearprocantiguosistematierras.TipoEntradaCrearProcAntiguoSistemaTierras;
import co.gov.supernotariado.bachue.clientebus.alertatierras.types.eliminarprocantiguosistema.TipoEntradaEliminarProcAntiguoSistema;
import co.gov.supernotariado.bachue.clientebus.alertatierras.types.inactivaralerta.TipoEntradaInactivarAlerta;
import co.gov.supernotariado.bachue.clientebus.alertatierras.types.inscribiralertacabecera.TipoEntradaInscribirAlertaCabecera;
import co.gov.supernotariado.bachue.clientebus.alertatierras.types.listarprocantiguosistema.TipoEntradaListarProcAntiguoSistema;
import co.gov.supernotariado.bachue.clientebus.alertatierras.types.rechazarcorreccionalerta.TipoEntradaRechazarCorreccionAlerta;
import co.gov.supernotariado.bachue.clientebus.alertatierras.types.removermatriculaalerta.TipoEntradaRemoverMatriculaAlerta;
import co.gov.supernotariado.bachue.clientebus.converter.ActivarAlertaTierrasConverter;
import co.gov.supernotariado.bachue.clientebus.converter.AgregarListaMatriculasAlertaConverter;
import co.gov.supernotariado.bachue.clientebus.converter.AgregarMatriculaAlertaConverter;
import co.gov.supernotariado.bachue.clientebus.converter.CancelarIngresoAlertaTierrasConverter;
import co.gov.supernotariado.bachue.clientebus.converter.ConsultarAlertasConverter;
import co.gov.supernotariado.bachue.clientebus.converter.ConsultarDetalleAlertaConverter;
import co.gov.supernotariado.bachue.clientebus.converter.ConsultarDocumentoAlertaConverter;
import co.gov.supernotariado.bachue.clientebus.converter.ConsultarEntidadesJAConverter;
import co.gov.supernotariado.bachue.clientebus.converter.ConsultarListaMatriculasConverter;
import co.gov.supernotariado.bachue.clientebus.converter.ConsultarMapaPredioInfoCatastralConverter;
import co.gov.supernotariado.bachue.clientebus.converter.ConsultarMatriculaAlertaConverter;
import co.gov.supernotariado.bachue.clientebus.converter.ConsultarMatriculaConverter;
import co.gov.supernotariado.bachue.clientebus.converter.ConsultarMatriculaFiltrosTierrasConverter;
import co.gov.supernotariado.bachue.clientebus.converter.ConsultarMatriculaInfoCatastralConverter;
import co.gov.supernotariado.bachue.clientebus.converter.ConsultarOficinasOrigenTipoConverter;
import co.gov.supernotariado.bachue.clientebus.converter.CrearProcAntiguoSistemaTierrasConverte;
import co.gov.supernotariado.bachue.clientebus.converter.EliminarProcAntiguoSistemaConverter;
import co.gov.supernotariado.bachue.clientebus.converter.InactivarAlertaTierrasConverter;
import co.gov.supernotariado.bachue.clientebus.converter.InscribirAlertaCabeceraConverter;
import co.gov.supernotariado.bachue.clientebus.converter.ListarProcAntiguoSistemaConverter;
import co.gov.supernotariado.bachue.clientebus.converter.RechazarCorreccionAlertaConverter;
import co.gov.supernotariado.bachue.clientebus.converter.RemoverMatriculaAlertaConverter;
import co.gov.supernotariado.bachue.clientebus.enums.EnumLog;
import co.gov.supernotariado.bachue.clientebus.enums.EnumOperacionesSoap;
import co.gov.supernotariado.bachue.clientebus.servicios.BSSDICBAlertaTierrasService;
import co.gov.supernotariado.bachue.clientebus.util.UtilidadClienteSoap;
import co.gov.supernotariado.bachue.clientebus.util.UtilidadLog;
import co.gov.supernotariado.bachue.clientebus.vo.ClienteIntegracionVO;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.EntradaConsultarEntidadesJAVO;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoEntradaActivarAlertaTierrasVO;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoEntradaAgregarListaMatriculasAlertaVO;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoEntradaAgregarMatriculaAlertaVO;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoEntradaCancelarIngresoAlertaTierrasVO;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoEntradaConsultarAlertasVO;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoEntradaConsultarDetalleAlertaVO;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoEntradaConsultarDocumentoAlertaVO;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoEntradaConsultarListaMatriculasVO;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoEntradaConsultarMapaPredioInfoCatastralVO;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoEntradaConsultarMatriculaAlertaVO;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoEntradaConsultarMatriculaFiltrosTierrasVO;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoEntradaConsultarMatriculaInfoCatastralVO;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoEntradaConsultarMatriculaVO;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoEntradaConsultarOficinasOrigenTipoVO;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoEntradaCrearProcAntiguoSistemaTierrasVO;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoEntradaEliminarProcAntiguoSistemaVO;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoEntradaInactivarAlertaVO;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoEntradaInscribirAlertaCabeceraVO;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoEntradaListarProcAntiguoSistemaVO;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoEntradaRechazarCorreccionAlertaVO;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoEntradaRemoverMatriculaAlertaVO;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoSalidaActivarAlertaTierrasVO;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoSalidaAgregarListaMatriculasAlertaVO;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoSalidaAgregarMatriculaAlertaVO;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoSalidaCancelarIngresoAlertaTierrasVO;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoSalidaConsultarAlertasVO;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoSalidaConsultarDetalleAlertaVO;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoSalidaConsultarDocumentoAlertaVO;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoSalidaConsultarEntidadesJAVO;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoSalidaConsultarListaMatriculasVO;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoSalidaConsultarMapaPredioInfoCatastralVO;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoSalidaConsultarMatriculaAlertaVO;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoSalidaConsultarMatriculaFiltrosTierrasVO;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoSalidaConsultarMatriculaInfoCatastralVO;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoSalidaConsultarMatriculaVO;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoSalidaConsultarOficinasOrigenTipoVO;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoSalidaCrearProcAntiguoSistemaTierrasVO;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoSalidaEliminarProcAntiguoSistemaVO;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoSalidaInactivarAlertaVO;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoSalidaInscribirAlertaCabeceraVO;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoSalidaListarProcAntiguoSistemaVO;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoSalidaRechazarCorreccionAlertaVO;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoSalidaRemoverMatriculaAlertaVO;

/**
 * Implementacion de interfaces para el servicio de alertas de tierras.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ServicioAlertaTierras implements IServicioWeb {

	/**
	 * Define la constante CL_LOGGER.
	 */
	static final Logger CL_LOGGER = Logger.getLogger(ServicioAlertaTierras.class);

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
			BSSDICBAlertaTierrasService lbsats_alertaTierraServicio = new BSSDICBAlertaTierrasService(null, qname);
			SBBEEAlertaTierras lat_alertaTierras = lbsats_alertaTierraServicio.getBSSDICBAlertaTierrasPort();
			UtilidadClienteSoap.insertarPropiedadesConexion(aci_clienteIntegracionVO,
					(BindingProvider) lat_alertaTierras);

			if (as_operacion.equalsIgnoreCase(EnumOperacionesSoap.ALERTA_TIERRAS_ACTIVAR_ALERTA_TIERRAS.getIs_nombreOperacion())) {
				lci_clienteIntegracionVO = activarAlertaTierras(aci_clienteIntegracionVO, lat_alertaTierras);
			} else if (as_operacion
					.equalsIgnoreCase(EnumOperacionesSoap.ALERTA_TIERRAS_AGREGAR_LISTA_MATRICULAS_ALERTA.getIs_nombreOperacion())) {
				lci_clienteIntegracionVO = agregarListaMatriculasAlerta(aci_clienteIntegracionVO, lat_alertaTierras);
			} else if (as_operacion
					.equalsIgnoreCase(EnumOperacionesSoap.ALERTA_TIERRAS_AGREGAR_MATRICULA_ALERTA.getIs_nombreOperacion())) {
				lci_clienteIntegracionVO = agregarMatriculaAlerta(aci_clienteIntegracionVO, lat_alertaTierras);
			} else if (as_operacion
					.equalsIgnoreCase(EnumOperacionesSoap.ALERTA_TIERRAS_CANCELAR_INGRESO_ALERTA_TIERRAS.getIs_nombreOperacion())) {
				lci_clienteIntegracionVO = cancelarIngresoAlertaTierras(aci_clienteIntegracionVO, lat_alertaTierras);
			} else if (as_operacion.equalsIgnoreCase(EnumOperacionesSoap.ALERTA_TIERRAS_CONSULTAR_ALERTAS.getIs_nombreOperacion())) {
				lci_clienteIntegracionVO = consultarAlertas(aci_clienteIntegracionVO, lat_alertaTierras);
			} else if (as_operacion
					.equalsIgnoreCase(EnumOperacionesSoap.ALERTA_TIERRAS_CONSULTAR_DETALLE_ALERTA.getIs_nombreOperacion())) {
				lci_clienteIntegracionVO = consultarDetalleAlerta(aci_clienteIntegracionVO, lat_alertaTierras);
			} else if (as_operacion
					.equalsIgnoreCase(EnumOperacionesSoap.ALERTA_TIERRAS_CONSULTAR_DOCUMENTO_ALERTA.getIs_nombreOperacion())) {
				lci_clienteIntegracionVO = consultarDocumentoAlerta(aci_clienteIntegracionVO, lat_alertaTierras);
			} else if (as_operacion
					.equalsIgnoreCase(EnumOperacionesSoap.ALERTA_TIERRAS_CONSULTAR_ENTIDADES_J_A.getIs_nombreOperacion())) {
				lci_clienteIntegracionVO = consultarEntidadesJA(aci_clienteIntegracionVO, lat_alertaTierras);
			} else if (as_operacion
					.equalsIgnoreCase(EnumOperacionesSoap.ALERTA_TIERRAS_CONSULTAR_LISTA_MATRICULAS.getIs_nombreOperacion())) {
				lci_clienteIntegracionVO = consultarListaMatriculas(aci_clienteIntegracionVO, lat_alertaTierras);
			} else if (as_operacion.equalsIgnoreCase(
					EnumOperacionesSoap.ALERTA_TIERRAS_CONSULTAR_MAPA_PREDIO_INFO_CATASTRAL.getIs_nombreOperacion())) {
				lci_clienteIntegracionVO = consultarMapaPredioInfoCatastral(aci_clienteIntegracionVO,
						lat_alertaTierras);
			} else if (as_operacion.equalsIgnoreCase(EnumOperacionesSoap.ALERTA_TIERRAS_CONSULTAR_MATRICULA.getIs_nombreOperacion())) {
				lci_clienteIntegracionVO = consultarMatricula(aci_clienteIntegracionVO, lat_alertaTierras);
			} else if (as_operacion
					.equalsIgnoreCase(EnumOperacionesSoap.ALERTA_TIERRAS_CONSULTAR_MATRICULA_ALERTA.getIs_nombreOperacion())) {
				lci_clienteIntegracionVO = consultarMatriculaAlerta(aci_clienteIntegracionVO, lat_alertaTierras);
			} else if (as_operacion.equalsIgnoreCase(
					EnumOperacionesSoap.ALERTA_TIERRAS_CONSULTAR_MATRICULA_FILTROS_TIERRAS.getIs_nombreOperacion())) {
				lci_clienteIntegracionVO = consultarMatriculaFiltrosTierras(aci_clienteIntegracionVO,
						lat_alertaTierras);
			} else if (as_operacion
					.equalsIgnoreCase(EnumOperacionesSoap.ALERTA_TIERRAS_CONSULTAR_MATRICULA_INFO_CATASTRAL.getIs_nombreOperacion())) {
				lci_clienteIntegracionVO = consultarMatriculaInfoCatastral(aci_clienteIntegracionVO, lat_alertaTierras);
			} else if (as_operacion
					.equalsIgnoreCase(EnumOperacionesSoap.ALERTA_TIERRAS_CONSULTAR_OFICINAS_ORIGEN_TIPO.getIs_nombreOperacion())) {
				lci_clienteIntegracionVO = consultarOficinasOrigenTipo(aci_clienteIntegracionVO, lat_alertaTierras);
			} else if (as_operacion
					.equalsIgnoreCase(EnumOperacionesSoap.ALERTA_TIERRAS_CREAR_PROC_ANTIGUO_SISTEMA_TIERRAS.getIs_nombreOperacion())) {
				lci_clienteIntegracionVO = crearProcAntiguoSistemaTierras(aci_clienteIntegracionVO, lat_alertaTierras);
			} else if (as_operacion
					.equalsIgnoreCase(EnumOperacionesSoap.ALERTA_TIERRAS_ELIMINAR_PROC_ANTIGUO_SISTEMA.getIs_nombreOperacion())) {
				lci_clienteIntegracionVO = eliminarProcAntiguoSistema(aci_clienteIntegracionVO, lat_alertaTierras);
			} else if (as_operacion.equalsIgnoreCase(EnumOperacionesSoap.ALERTA_TIERRAS_INACTIVAR_ALERTA.getIs_nombreOperacion())) {
				lci_clienteIntegracionVO = inactivarAlerta(aci_clienteIntegracionVO, lat_alertaTierras);
			} else if (as_operacion
					.equalsIgnoreCase(EnumOperacionesSoap.ALERTA_TIERRAS_INSCRIBIR_ALERTA_CABECERA.getIs_nombreOperacion())) {
				lci_clienteIntegracionVO = inscribirAlertaCabecera(aci_clienteIntegracionVO, lat_alertaTierras);
			} else if (as_operacion
					.equalsIgnoreCase(EnumOperacionesSoap.ALERTA_TIERRAS_LISTAR_PROC_ANTIGUO_SISTEMA.getIs_nombreOperacion())) {
				lci_clienteIntegracionVO = listarProcAntiguoSistema(aci_clienteIntegracionVO, lat_alertaTierras);
			} else if (as_operacion
					.equalsIgnoreCase(EnumOperacionesSoap.ALERTA_TIERRAS_RECHAZAR_CORRECCION_ALERTA.getIs_nombreOperacion())) {
				lci_clienteIntegracionVO = rechazarCorreccionAlerta(aci_clienteIntegracionVO, lat_alertaTierras);
			} else if (as_operacion
					.equalsIgnoreCase(EnumOperacionesSoap.ALERTA_TIERRAS_REMOVER_MATRICULA_ALERTA.getIs_nombreOperacion())) {
				lci_clienteIntegracionVO = removerMatriculaAlerta(aci_clienteIntegracionVO, lat_alertaTierras);
			}

			return lci_clienteIntegracionVO;
		} catch (Exception ae_excepcion) {
			CL_LOGGER.debug(ae_excepcion.getMessage());
			throw ae_excepcion;
		}
	}

	/**
	 * Metodo encargado de activar alerta tierras.
	 *
	 * @param aci_clienteIntegracionVO datos de la entrada del sevicio
	 * @param asat_alertaTierras       clase del servicio a llamar
	 * @return TipoSalidaActivarAlertaTierrasVO Datos de respuesta del servicio
	 */
	private TipoSalidaActivarAlertaTierrasVO activarAlertaTierras(ClienteIntegracionVO aci_clienteIntegracionVO,
			SBBEEAlertaTierras asat_alertaTierras) {
		if (!(aci_clienteIntegracionVO instanceof TipoEntradaActivarAlertaTierrasVO)) {
			throw new IllegalArgumentException();
		}
		TipoEntradaActivarAlertaTierrasVO lteaat_tipoEntradaActivarAlertaTierrasVo = (TipoEntradaActivarAlertaTierrasVO) aci_clienteIntegracionVO;
		TipoEntradaActivarAlertaTierras lteaat_tipoEntradaActivarAlertaTierras = ActivarAlertaTierrasConverter
				.voATipo(lteaat_tipoEntradaActivarAlertaTierrasVo);

		UtilidadLog<TipoEntradaActivarAlertaTierrasVO> lulteaat_utilidadLogEntrada = new UtilidadLog<>();
		lulteaat_utilidadLogEntrada.generarDebugObjeto(lteaat_tipoEntradaActivarAlertaTierrasVo,
				TipoEntradaActivarAlertaTierrasVO.class, EnumLog.ENTRADA_SERVICIO.getIs_codigo());

		TipoSalidaActivarAlertaTierrasVO ltsaat_tipoSalidaActivarAlertaTierrasVo;
		ltsaat_tipoSalidaActivarAlertaTierrasVo = ActivarAlertaTierrasConverter
				.tipoAVo(asat_alertaTierras.activarAlertaTierras(lteaat_tipoEntradaActivarAlertaTierras));

		UtilidadLog<TipoSalidaActivarAlertaTierrasVO> lultsaat_utilidadLogSalida = new UtilidadLog<>();
		lultsaat_utilidadLogSalida.generarDebugObjeto(ltsaat_tipoSalidaActivarAlertaTierrasVo,
				TipoSalidaActivarAlertaTierrasVO.class, EnumLog.SALIDA_SERVICIO.getIs_codigo());

		return ltsaat_tipoSalidaActivarAlertaTierrasVo;
	}

	/**
	 * Metodo encargado de agregar lista de matriculas alerta.
	 *
	 * @param aci_clienteIntegracionVO datos de la entrada del servicio
	 * @param asat_alertaTierras       clase del servicio a llamar
	 * @return TipoSalidaAgregarListaMatriculasAlertaVO respuesta del servicio
	 */
	private TipoSalidaAgregarListaMatriculasAlertaVO agregarListaMatriculasAlerta(
			ClienteIntegracionVO aci_clienteIntegracionVO, SBBEEAlertaTierras asat_alertaTierras) {
		if (!(aci_clienteIntegracionVO instanceof TipoEntradaAgregarListaMatriculasAlertaVO)) {
			throw new IllegalArgumentException();
		}
		TipoEntradaAgregarListaMatriculasAlertaVO ltealma_tipoEntradaAgregarListaMatriculasAlertaVo = (TipoEntradaAgregarListaMatriculasAlertaVO) aci_clienteIntegracionVO;
		TipoEntradaAgregarListaMatriculasAlerta ltealma_tipoEntradaAgregarListaMatriculasAlerta = AgregarListaMatriculasAlertaConverter
				.voATipo(ltealma_tipoEntradaAgregarListaMatriculasAlertaVo);

		UtilidadLog<TipoEntradaAgregarListaMatriculasAlertaVO> lultealma_utilidadLogEntrada = new UtilidadLog<>();
		lultealma_utilidadLogEntrada.generarDebugObjeto(ltealma_tipoEntradaAgregarListaMatriculasAlertaVo,
				TipoEntradaAgregarListaMatriculasAlertaVO.class, EnumLog.ENTRADA_SERVICIO.getIs_codigo());

		TipoSalidaAgregarListaMatriculasAlertaVO ltsalma_tipoSalidaAgregarListaMatriculasAlertaVo;
		ltsalma_tipoSalidaAgregarListaMatriculasAlertaVo = AgregarListaMatriculasAlertaConverter.tipoAVo(
				asat_alertaTierras.agregarListaMatriculasAlerta(ltealma_tipoEntradaAgregarListaMatriculasAlerta));

		UtilidadLog<TipoSalidaAgregarListaMatriculasAlertaVO> lultsalma_utilidadLogSalida = new UtilidadLog<>();
		lultsalma_utilidadLogSalida.generarDebugObjeto(ltsalma_tipoSalidaAgregarListaMatriculasAlertaVo,
				TipoSalidaAgregarListaMatriculasAlertaVO.class, EnumLog.SALIDA_SERVICIO.getIs_codigo());

		return ltsalma_tipoSalidaAgregarListaMatriculasAlertaVo;
	}

	/**
	 * Metodo encargado de agregar matriculas alerta tierras.
	 *
	 * @param aci_clienteIntegracionVO datos de la entrada del servicio
	 * @param asat_alertaTierras       clase del servicio a llamar
	 * @return TipoSalidaAgregarMatriculaAlertaVO respuesta del servicio
	 */
	private TipoSalidaAgregarMatriculaAlertaVO agregarMatriculaAlerta(ClienteIntegracionVO aci_clienteIntegracionVO,
			SBBEEAlertaTierras asat_alertaTierras) {
		if (!(aci_clienteIntegracionVO instanceof TipoEntradaAgregarMatriculaAlertaVO)) {
			throw new IllegalArgumentException();
		}
		TipoEntradaAgregarMatriculaAlertaVO lteama_tipoEntradaAgregarMatriculaAlertaVo = (TipoEntradaAgregarMatriculaAlertaVO) aci_clienteIntegracionVO;
		TipoEntradaAgregarMatriculaAlerta lteama_tipoEntradaAgregarMatriculaAlerta = AgregarMatriculaAlertaConverter
				.voATipo(lteama_tipoEntradaAgregarMatriculaAlertaVo);

		UtilidadLog<TipoEntradaAgregarMatriculaAlertaVO> lulteama_utilidadLogEntrada = new UtilidadLog<>();
		lulteama_utilidadLogEntrada.generarDebugObjeto(lteama_tipoEntradaAgregarMatriculaAlertaVo,
				TipoEntradaAgregarMatriculaAlertaVO.class, EnumLog.ENTRADA_SERVICIO.getIs_codigo());

		TipoSalidaAgregarMatriculaAlertaVO ltsama_tipoSalidaAgregarMatriculaAlertaVo;
		ltsama_tipoSalidaAgregarMatriculaAlertaVo = AgregarMatriculaAlertaConverter
				.tipoAVo(asat_alertaTierras.agregarMatriculaAlerta(lteama_tipoEntradaAgregarMatriculaAlerta));

		UtilidadLog<TipoSalidaAgregarMatriculaAlertaVO> lultsama_utilidadLogSalida = new UtilidadLog<>();
		lultsama_utilidadLogSalida.generarDebugObjeto(ltsama_tipoSalidaAgregarMatriculaAlertaVo,
				TipoSalidaAgregarMatriculaAlertaVO.class, EnumLog.SALIDA_SERVICIO.getIs_codigo());

		return ltsama_tipoSalidaAgregarMatriculaAlertaVo;
	}

	/**
	 * Metodo encargado de cancelar el ingreso de alerta tierras.
	 *
	 * @param aci_clienteIntegracionVO datos de la entrada del servicio
	 * @param asat_alertaTierras       clase del servicio a llamar
	 * @return TipoSalidaCancelarIngresoAlertaTierrasVO respuesta del servicio
	 */
	private TipoSalidaCancelarIngresoAlertaTierrasVO cancelarIngresoAlertaTierras(
			ClienteIntegracionVO aci_clienteIntegracionVO, SBBEEAlertaTierras asat_alertaTierras) {
		if (!(aci_clienteIntegracionVO instanceof TipoEntradaCancelarIngresoAlertaTierrasVO)) {
			throw new IllegalArgumentException();
		}
		TipoEntradaCancelarIngresoAlertaTierrasVO lteciat_tipoEntradaCancelarIngresoAlertaTierrasVo = (TipoEntradaCancelarIngresoAlertaTierrasVO) aci_clienteIntegracionVO;
		TipoEntradaCancelarIngresoAlertaTierras lteciat_tipoEntradaCancelarIngresoAlertaTierras = CancelarIngresoAlertaTierrasConverter
				.voATipo(lteciat_tipoEntradaCancelarIngresoAlertaTierrasVo);

		UtilidadLog<TipoEntradaCancelarIngresoAlertaTierrasVO> lulteciat_utilidadLogEntrada = new UtilidadLog<>();
		lulteciat_utilidadLogEntrada.generarDebugObjeto(lteciat_tipoEntradaCancelarIngresoAlertaTierrasVo,
				TipoEntradaCancelarIngresoAlertaTierrasVO.class, EnumLog.ENTRADA_SERVICIO.getIs_codigo());

		TipoSalidaCancelarIngresoAlertaTierrasVO ltsciat_tipoSalidaCancelarIngresoAlertaTierrasVo;
		ltsciat_tipoSalidaCancelarIngresoAlertaTierrasVo = CancelarIngresoAlertaTierrasConverter.tipoAVo(
				asat_alertaTierras.cancelarIngresoAlertaTierras(lteciat_tipoEntradaCancelarIngresoAlertaTierras));

		UtilidadLog<TipoSalidaCancelarIngresoAlertaTierrasVO> lultsciat_utilidadLogSalida = new UtilidadLog<>();
		lultsciat_utilidadLogSalida.generarDebugObjeto(ltsciat_tipoSalidaCancelarIngresoAlertaTierrasVo,
				TipoSalidaCancelarIngresoAlertaTierrasVO.class, EnumLog.SALIDA_SERVICIO.getIs_codigo());

		return ltsciat_tipoSalidaCancelarIngresoAlertaTierrasVo;
	}

	/**
	 * Metodo encargado de consultar las alertas tierras.
	 *
	 * @param aci_clienteIntegracionVO datos de la entrada del servicio
	 * @param asat_alertaTierras       clase del servicio a llamar
	 * @return TipoSalidaConsultarAlertasVO respuesta del servicio
	 */
	private TipoSalidaConsultarAlertasVO consultarAlertas(ClienteIntegracionVO aci_clienteIntegracionVO,
			SBBEEAlertaTierras asat_alertaTierras) {
		if (!(aci_clienteIntegracionVO instanceof TipoEntradaConsultarAlertasVO)) {
			throw new IllegalArgumentException();
		}
		TipoEntradaConsultarAlertasVO lteca_tipoEntradaConsultarAlertasVo = (TipoEntradaConsultarAlertasVO) aci_clienteIntegracionVO;
		TipoEntradaConsultarAlertas lteca_tipoEntradaConsultarAlertas = ConsultarAlertasConverter
				.voATipo(lteca_tipoEntradaConsultarAlertasVo);

		UtilidadLog<TipoEntradaConsultarAlertasVO> lulteca_utilidadLogEntrada = new UtilidadLog<>();
		lulteca_utilidadLogEntrada.generarDebugObjeto(lteca_tipoEntradaConsultarAlertasVo,
				TipoEntradaConsultarAlertasVO.class, EnumLog.ENTRADA_SERVICIO.getIs_codigo());

		TipoSalidaConsultarAlertasVO ltsca_tipoSalidaConsultarAlertasVo;
		ltsca_tipoSalidaConsultarAlertasVo = ConsultarAlertasConverter
				.tipoAVo(asat_alertaTierras.consultarAlertas(lteca_tipoEntradaConsultarAlertas));

		UtilidadLog<TipoSalidaConsultarAlertasVO> lultsca_utilidadLogSalida = new UtilidadLog<>();
		lultsca_utilidadLogSalida.generarDebugObjeto(ltsca_tipoSalidaConsultarAlertasVo,
				TipoSalidaConsultarAlertasVO.class, EnumLog.SALIDA_SERVICIO.getIs_codigo());

		return ltsca_tipoSalidaConsultarAlertasVo;
	}

	/**
	 * Metodo encargado de consultar el detalle de las alertas tierras.
	 *
	 * @param aci_clienteIntegracionVO datos de la entrada del servicio
	 * @param asat_alertaTierras       clase del servicio a llamar
	 * @return TipoSalidaConsultarDetalleAlertaVO respuesta del servicio
	 */
	private TipoSalidaConsultarDetalleAlertaVO consultarDetalleAlerta(ClienteIntegracionVO aci_clienteIntegracionVO,
			SBBEEAlertaTierras asat_alertaTierras) {
		if (!(aci_clienteIntegracionVO instanceof TipoEntradaConsultarDetalleAlertaVO)) {
			throw new IllegalArgumentException();
		}
		TipoEntradaConsultarDetalleAlertaVO ltecda_tipoEntradaConsultarDetalleAlertaVo = (TipoEntradaConsultarDetalleAlertaVO) aci_clienteIntegracionVO;
		TipoEntradaConsultarDetalleAlerta ltecda_tipoEntradaConsultarDetalleAlerta = ConsultarDetalleAlertaConverter
				.voATipo(ltecda_tipoEntradaConsultarDetalleAlertaVo);

		UtilidadLog<TipoEntradaConsultarDetalleAlertaVO> lultecda_utilidadLogEntrada = new UtilidadLog<>();
		lultecda_utilidadLogEntrada.generarDebugObjeto(ltecda_tipoEntradaConsultarDetalleAlertaVo,
				TipoEntradaConsultarDetalleAlertaVO.class, EnumLog.ENTRADA_SERVICIO.getIs_codigo());

		TipoSalidaConsultarDetalleAlertaVO ltscda_tipoSalidaConsultarDetalleAlertaVo;
		ltscda_tipoSalidaConsultarDetalleAlertaVo = ConsultarDetalleAlertaConverter
				.tipoAVo(asat_alertaTierras.consultarDetalleAlerta(ltecda_tipoEntradaConsultarDetalleAlerta));

		UtilidadLog<TipoSalidaConsultarDetalleAlertaVO> lultscda_utilidadLogSalida = new UtilidadLog<>();
		lultscda_utilidadLogSalida.generarDebugObjeto(ltscda_tipoSalidaConsultarDetalleAlertaVo,
				TipoSalidaConsultarDetalleAlertaVO.class, EnumLog.SALIDA_SERVICIO.getIs_codigo());

		return ltscda_tipoSalidaConsultarDetalleAlertaVo;
	}

	/**
	 * Metodo encargado de consultar el documento de las alertas tierras.
	 *
	 * @param aci_clienteIntegracionVO datos de la entrada del servicio
	 * @param asat_alertaTierras       clase del servicio a llamar
	 * @return TipoSalidaConsultarDocumentoAlertaVO respuesta del servicio
	 */
	private TipoSalidaConsultarDocumentoAlertaVO consultarDocumentoAlerta(ClienteIntegracionVO aci_clienteIntegracionVO,
			SBBEEAlertaTierras asat_alertaTierras) {
		if (!(aci_clienteIntegracionVO instanceof TipoEntradaConsultarDocumentoAlertaVO)) {
			throw new IllegalArgumentException();
		}
		TipoEntradaConsultarDocumentoAlertaVO ltecda_tipoEntradaConsultarDocumentoAlertaVo = (TipoEntradaConsultarDocumentoAlertaVO) aci_clienteIntegracionVO;
		TipoEntradaConsultarDocumentoAlerta ltecda_tipoEntradaConsultarDocumentoAlerta = ConsultarDocumentoAlertaConverter
				.voATipo(ltecda_tipoEntradaConsultarDocumentoAlertaVo);

		UtilidadLog<TipoEntradaConsultarDocumentoAlertaVO> lultecda_utilidadLogEntrada = new UtilidadLog<>();
		lultecda_utilidadLogEntrada.generarDebugObjeto(ltecda_tipoEntradaConsultarDocumentoAlertaVo,
				TipoEntradaConsultarDocumentoAlertaVO.class, EnumLog.ENTRADA_SERVICIO.getIs_codigo());

		TipoSalidaConsultarDocumentoAlertaVO ltscda_tipoSalidaConsultarDocumentoAlertaVo;
		ltscda_tipoSalidaConsultarDocumentoAlertaVo = ConsultarDocumentoAlertaConverter
				.tipoAVo(asat_alertaTierras.consultarDocumentoAlerta(ltecda_tipoEntradaConsultarDocumentoAlerta));

		UtilidadLog<TipoSalidaConsultarDocumentoAlertaVO> lultscda_utilidadLogSalida = new UtilidadLog<>();
		lultscda_utilidadLogSalida.generarDebugObjeto(ltscda_tipoSalidaConsultarDocumentoAlertaVo,
				TipoSalidaConsultarDocumentoAlertaVO.class, EnumLog.SALIDA_SERVICIO.getIs_codigo());

		return ltscda_tipoSalidaConsultarDocumentoAlertaVo;
	}

	/**
	 * Metodo encargado de consultar las entidades juridicas.
	 *
	 * @param aci_clienteIntegracionVO datos de la entrada del servicio
	 * @param asat_alertaTierras       clase del servicio a llamar
	 * @return TipoSalidaConsultarEntidadesJAVO respuesta del servicio
	 */
	private TipoSalidaConsultarEntidadesJAVO consultarEntidadesJA(ClienteIntegracionVO aci_clienteIntegracionVO,
			SBBEEAlertaTierras asat_alertaTierras) {
		if (!(aci_clienteIntegracionVO instanceof EntradaConsultarEntidadesJAVO)) {
			throw new IllegalArgumentException();
		}
		EntradaConsultarEntidadesJAVO leceja_entradaConsultarEntidadesJAVo = (EntradaConsultarEntidadesJAVO) aci_clienteIntegracionVO;
		EntradaConsultarEntidadesJA leceja_entradaConsultarEntidadesJA = new EntradaConsultarEntidadesJA();

		UtilidadLog<EntradaConsultarEntidadesJAVO> lulecej_utilidadLogEntrada = new UtilidadLog<>();
		lulecej_utilidadLogEntrada.generarDebugObjeto(leceja_entradaConsultarEntidadesJAVo,
				EntradaConsultarEntidadesJAVO.class, EnumLog.ENTRADA_SERVICIO.getIs_codigo());

		TipoSalidaConsultarEntidadesJAVO ltsceja_tipoSalidaConsultarEntidadesJAVo;
		ltsceja_tipoSalidaConsultarEntidadesJAVo = ConsultarEntidadesJAConverter
				.tipoAVo(asat_alertaTierras.consultarEntidadesJA(leceja_entradaConsultarEntidadesJA));

		UtilidadLog<TipoSalidaConsultarEntidadesJAVO> lultscej_utilidadLogSalida = new UtilidadLog<>();
		lultscej_utilidadLogSalida.generarDebugObjeto(ltsceja_tipoSalidaConsultarEntidadesJAVo,
				TipoSalidaConsultarEntidadesJAVO.class, EnumLog.SALIDA_SERVICIO.getIs_codigo());

		return ltsceja_tipoSalidaConsultarEntidadesJAVo;
	}

	/**
	 * Metodo encargado de consultar lista de matriculas.
	 *
	 * @param aci_clienteIntegracionVO datos de la entrada del servicio
	 * @param asat_alertaTierras       clase del servicio a llamar
	 * @return TipoSalidaConsultarListaMatriculasVO respuesta del servicio
	 */
	private TipoSalidaConsultarListaMatriculasVO consultarListaMatriculas(ClienteIntegracionVO aci_clienteIntegracionVO,
			SBBEEAlertaTierras asat_alertaTierras) {
		if (!(aci_clienteIntegracionVO instanceof TipoEntradaConsultarListaMatriculasVO)) {
			throw new IllegalArgumentException();
		}
		TipoEntradaConsultarListaMatriculasVO lteclm_tipoEntradaConsultarListaMatriculasVo = (TipoEntradaConsultarListaMatriculasVO) aci_clienteIntegracionVO;
		TipoEntradaConsultarListaMatriculas lteclm_tipoEntradaConsultarListaMatriculas = ConsultarListaMatriculasConverter
				.voATipo(lteclm_tipoEntradaConsultarListaMatriculasVo);

		UtilidadLog<TipoEntradaConsultarListaMatriculasVO> lulteclm_utilidadLogEntrada = new UtilidadLog<>();
		lulteclm_utilidadLogEntrada.generarDebugObjeto(lteclm_tipoEntradaConsultarListaMatriculasVo,
				TipoEntradaConsultarListaMatriculasVO.class, EnumLog.ENTRADA_SERVICIO.getIs_codigo());

		TipoSalidaConsultarListaMatriculasVO ltsclm_tipoSalidaConsultarListaMatriculasVo;
		ltsclm_tipoSalidaConsultarListaMatriculasVo = ConsultarListaMatriculasConverter
				.tipoAVo(asat_alertaTierras.consultarListaMatriculas(lteclm_tipoEntradaConsultarListaMatriculas));

		UtilidadLog<TipoSalidaConsultarListaMatriculasVO> lultsclm_utilidadLogSalida = new UtilidadLog<>();
		lultsclm_utilidadLogSalida.generarDebugObjeto(ltsclm_tipoSalidaConsultarListaMatriculasVo,
				TipoSalidaConsultarListaMatriculasVO.class, EnumLog.SALIDA_SERVICIO.getIs_codigo());

		return ltsclm_tipoSalidaConsultarListaMatriculasVo;
	}

	/**
	 * Metodo encargado de consultar el mapa del predio de la informacion catastral.
	 *
	 * @param aci_clienteIntegracionVO datos de la entrada del servicio
	 * @param asat_alertaTierras       clase del servicio a llamar
	 * @return TipoSalidaConsultarMapaPredioInfoCatastralVO respuesta del servicio
	 */
	private TipoSalidaConsultarMapaPredioInfoCatastralVO consultarMapaPredioInfoCatastral(
			ClienteIntegracionVO aci_clienteIntegracionVO, SBBEEAlertaTierras asat_alertaTierras) {
		if (!(aci_clienteIntegracionVO instanceof TipoEntradaConsultarMapaPredioInfoCatastralVO)) {
			throw new IllegalArgumentException();
		}
		TipoEntradaConsultarMapaPredioInfoCatastralVO ltecmpic_tipoEntradaConsultarMapaPredioInfoCatastralVo = (TipoEntradaConsultarMapaPredioInfoCatastralVO) aci_clienteIntegracionVO;
		TipoEntradaConsultarMapaPredioInfoCatastral ltecmpic_tipoEntradaConsultarMapaPredioInfoCatastral = ConsultarMapaPredioInfoCatastralConverter
				.voATipo(ltecmpic_tipoEntradaConsultarMapaPredioInfoCatastralVo);

		UtilidadLog<TipoEntradaConsultarMapaPredioInfoCatastralVO> lultecmpic_utilidadLogEntrada = new UtilidadLog<>();
		lultecmpic_utilidadLogEntrada.generarDebugObjeto(ltecmpic_tipoEntradaConsultarMapaPredioInfoCatastralVo,
				TipoEntradaConsultarMapaPredioInfoCatastralVO.class, EnumLog.ENTRADA_SERVICIO.getIs_codigo());

		TipoSalidaConsultarMapaPredioInfoCatastralVO ltscmpic_tipoSalidaConsultarMapaPredioInfoCatastralVo;
		ltscmpic_tipoSalidaConsultarMapaPredioInfoCatastralVo = ConsultarMapaPredioInfoCatastralConverter
				.tipoAVo(asat_alertaTierras
						.consultarMapaPredioInfoCatastral(ltecmpic_tipoEntradaConsultarMapaPredioInfoCatastral));

		UtilidadLog<TipoSalidaConsultarMapaPredioInfoCatastralVO> lultscmpic_utilidadLogSalida = new UtilidadLog<>();
		lultscmpic_utilidadLogSalida.generarDebugObjeto(ltscmpic_tipoSalidaConsultarMapaPredioInfoCatastralVo,
				TipoSalidaConsultarMapaPredioInfoCatastralVO.class, EnumLog.SALIDA_SERVICIO.getIs_codigo());

		return ltscmpic_tipoSalidaConsultarMapaPredioInfoCatastralVo;
	}

	/**
	 * Metodo encargado de consultar matricula.
	 *
	 * @param aci_clienteIntegracionVO datos de la entrada del servicio
	 * @param asat_alertaTierras       clase del servicio a llamar
	 * @return TipoSalidaConsultarMatriculaVO respuesta del servicio
	 */
	private TipoSalidaConsultarMatriculaVO consultarMatricula(ClienteIntegracionVO aci_clienteIntegracionVO,
			SBBEEAlertaTierras asat_alertaTierras) {
		if (!(aci_clienteIntegracionVO instanceof TipoEntradaConsultarMatriculaVO)) {
			throw new IllegalArgumentException();
		}
		TipoEntradaConsultarMatriculaVO ltecm_tipoEntradaConsultarMatriculaVo = (TipoEntradaConsultarMatriculaVO) aci_clienteIntegracionVO;
		TipoEntradaConsultarMatricula ltecm_tipoEntradaConsultarMatricula = ConsultarMatriculaConverter
				.voATipo(ltecm_tipoEntradaConsultarMatriculaVo);

		UtilidadLog<TipoEntradaConsultarMatriculaVO> lultecm_utilidadLogEntrada = new UtilidadLog<>();
		lultecm_utilidadLogEntrada.generarDebugObjeto(ltecm_tipoEntradaConsultarMatriculaVo,
				TipoEntradaConsultarMatriculaVO.class, EnumLog.ENTRADA_SERVICIO.getIs_codigo());

		TipoSalidaConsultarMatriculaVO ltscm_tipoSalidaConsultarMatriculaVo;
		ltscm_tipoSalidaConsultarMatriculaVo = ConsultarMatriculaConverter
				.tipoAVo(asat_alertaTierras.consultarMatricula(ltecm_tipoEntradaConsultarMatricula));

		UtilidadLog<TipoSalidaConsultarMatriculaVO> lultscm_utilidadLogSalida = new UtilidadLog<>();
		lultscm_utilidadLogSalida.generarDebugObjeto(ltscm_tipoSalidaConsultarMatriculaVo,
				TipoSalidaConsultarMatriculaVO.class, EnumLog.SALIDA_SERVICIO.getIs_codigo());

		return ltscm_tipoSalidaConsultarMatriculaVo;
	}

	/**
	 * Metodo encargado de consultar matricula alerta.
	 *
	 * @param aci_clienteIntegracionVO datos de la entrada del servicio
	 * @param asat_alertaTierras       clase del servicio a llamar
	 * @return TipoSalidaConsultarMatriculaAlertaVO respuesta del servicio
	 */
	private TipoSalidaConsultarMatriculaAlertaVO consultarMatriculaAlerta(ClienteIntegracionVO aci_clienteIntegracionVO,
			SBBEEAlertaTierras asat_alertaTierras) {
		if (!(aci_clienteIntegracionVO instanceof TipoEntradaConsultarMatriculaAlertaVO)) {
			throw new IllegalArgumentException();
		}
		TipoEntradaConsultarMatriculaAlertaVO ltecma_tipoEntradaConsultarMatriculaAlertaVo = (TipoEntradaConsultarMatriculaAlertaVO) aci_clienteIntegracionVO;
		TipoEntradaConsultarMatriculaAlerta ltecma_tipoEntradaConsultarMatriculaAlerta = ConsultarMatriculaAlertaConverter
				.voATipo(ltecma_tipoEntradaConsultarMatriculaAlertaVo);

		UtilidadLog<TipoEntradaConsultarMatriculaAlertaVO> lultecma_utilidadLogEntrada = new UtilidadLog<>();
		lultecma_utilidadLogEntrada.generarDebugObjeto(ltecma_tipoEntradaConsultarMatriculaAlertaVo,
				TipoEntradaConsultarMatriculaAlertaVO.class, EnumLog.ENTRADA_SERVICIO.getIs_codigo());

		TipoSalidaConsultarMatriculaAlertaVO ltscma_tipoSalidaConsultarMatriculaAlertaVo;
		ltscma_tipoSalidaConsultarMatriculaAlertaVo = ConsultarMatriculaAlertaConverter
				.tipoAVo(asat_alertaTierras.consultarMatriculaAlerta(ltecma_tipoEntradaConsultarMatriculaAlerta));

		UtilidadLog<TipoSalidaConsultarMatriculaAlertaVO> lultscma_utilidadLogSalida = new UtilidadLog<>();
		lultscma_utilidadLogSalida.generarDebugObjeto(ltscma_tipoSalidaConsultarMatriculaAlertaVo,
				TipoSalidaConsultarMatriculaAlertaVO.class, EnumLog.SALIDA_SERVICIO.getIs_codigo());

		return ltscma_tipoSalidaConsultarMatriculaAlertaVo;
	}

	/**
	 * Metodo encargado de consultar matricula por filtros tierras.
	 *
	 * @param aci_clienteIntegracionVO datos de la entrada del servicio
	 * @param asat_alertaTierras       clase del servicio a llamar
	 * @return TipoSalidaConsultarMatriculaFiltrosTierrasVO respuesta del servicio
	 */
	private TipoSalidaConsultarMatriculaFiltrosTierrasVO consultarMatriculaFiltrosTierras(
			ClienteIntegracionVO aci_clienteIntegracionVO, SBBEEAlertaTierras asat_alertaTierras) {
		if (!(aci_clienteIntegracionVO instanceof TipoEntradaConsultarMatriculaFiltrosTierrasVO)) {
			throw new IllegalArgumentException();
		}
		TipoEntradaConsultarMatriculaFiltrosTierrasVO ltecmft_tipoEntradaConsultarMatriculaFiltrosTierrasVo = (TipoEntradaConsultarMatriculaFiltrosTierrasVO) aci_clienteIntegracionVO;
		TipoEntradaConsultarMatriculaFiltrosTierras ltecmft_tipoEntradaConsultarMatriculaFiltrosTierras = ConsultarMatriculaFiltrosTierrasConverter
				.voATipo(ltecmft_tipoEntradaConsultarMatriculaFiltrosTierrasVo);

		UtilidadLog<TipoEntradaConsultarMatriculaFiltrosTierrasVO> lultecmft_utilidadLogEntrada = new UtilidadLog<>();
		lultecmft_utilidadLogEntrada.generarDebugObjeto(ltecmft_tipoEntradaConsultarMatriculaFiltrosTierrasVo,
				TipoEntradaConsultarMatriculaFiltrosTierrasVO.class, EnumLog.ENTRADA_SERVICIO.getIs_codigo());

		TipoSalidaConsultarMatriculaFiltrosTierrasVO ltscmft_tipoSalidaConsultarMatriculaFiltrosTierrasVo;
		ltscmft_tipoSalidaConsultarMatriculaFiltrosTierrasVo = ConsultarMatriculaFiltrosTierrasConverter
				.tipoAVo(asat_alertaTierras
						.consultarMatriculaFiltrosTierras(ltecmft_tipoEntradaConsultarMatriculaFiltrosTierras));

		UtilidadLog<TipoSalidaConsultarMatriculaFiltrosTierrasVO> lultscmft_utilidadLogSalida = new UtilidadLog<>();
		lultscmft_utilidadLogSalida.generarDebugObjeto(ltscmft_tipoSalidaConsultarMatriculaFiltrosTierrasVo,
				TipoSalidaConsultarMatriculaFiltrosTierrasVO.class, EnumLog.SALIDA_SERVICIO.getIs_codigo());

		return ltscmft_tipoSalidaConsultarMatriculaFiltrosTierrasVo;
	}

	/**
	 * Metodo encargado de consultar matricula con informacion catastral.
	 *
	 * @param aci_clienteIntegracionVO datos de la entrada del servicio
	 * @param asat_alertaTierras       clase del servicio a llamar
	 * @return TipoSalidaConsultarMatriculaInfoCatastralVO respuesta del servicio
	 */
	private TipoSalidaConsultarMatriculaInfoCatastralVO consultarMatriculaInfoCatastral(
			ClienteIntegracionVO aci_clienteIntegracionVO, SBBEEAlertaTierras asat_alertaTierras) {
		if (!(aci_clienteIntegracionVO instanceof TipoEntradaConsultarMatriculaInfoCatastralVO)) {
			throw new IllegalArgumentException();
		}
		TipoEntradaConsultarMatriculaInfoCatastralVO ltecmic_tipoEntradaConsultarMatriculaInfoCatastralVo = (TipoEntradaConsultarMatriculaInfoCatastralVO) aci_clienteIntegracionVO;
		TipoEntradaConsultarMatriculaInfoCatastral ltecmic_tipoEntradaConsultarMatriculaInfoCatastral = ConsultarMatriculaInfoCatastralConverter
				.voATipo(ltecmic_tipoEntradaConsultarMatriculaInfoCatastralVo);

		UtilidadLog<TipoEntradaConsultarMatriculaInfoCatastralVO> lultecmic_utilidadLogEntrada = new UtilidadLog<>();
		lultecmic_utilidadLogEntrada.generarDebugObjeto(ltecmic_tipoEntradaConsultarMatriculaInfoCatastralVo,
				TipoEntradaConsultarMatriculaInfoCatastralVO.class, EnumLog.ENTRADA_SERVICIO.getIs_codigo());

		TipoSalidaConsultarMatriculaInfoCatastralVO ltscmic_tipoSalidaConsultarMatriculaInfoCatastralVo;
		ltscmic_tipoSalidaConsultarMatriculaInfoCatastralVo = ConsultarMatriculaInfoCatastralConverter.tipoAVo(
				asat_alertaTierras.consultarMatriculaInfoCatastral(ltecmic_tipoEntradaConsultarMatriculaInfoCatastral));

		UtilidadLog<TipoSalidaConsultarMatriculaInfoCatastralVO> lultscmic_utilidadLogSalida = new UtilidadLog<>();
		lultscmic_utilidadLogSalida.generarDebugObjeto(ltscmic_tipoSalidaConsultarMatriculaInfoCatastralVo,
				TipoSalidaConsultarMatriculaInfoCatastralVO.class, EnumLog.SALIDA_SERVICIO.getIs_codigo());

		return ltscmic_tipoSalidaConsultarMatriculaInfoCatastralVo;
	}

	/**
	 * Metodo encargado de consultar tipo de oficinas de origen.
	 *
	 * @param aci_clienteIntegracionVO datos de la entrada del servicio
	 * @param asat_alertaTierras       clase del servicio a llamar
	 * @return TipoSalidaConsultarOficinasOrigenTipoVO respuesta del servicio
	 */
	private TipoSalidaConsultarOficinasOrigenTipoVO consultarOficinasOrigenTipo(
			ClienteIntegracionVO aci_clienteIntegracionVO, SBBEEAlertaTierras asat_alertaTierras) {
		if (!(aci_clienteIntegracionVO instanceof TipoEntradaConsultarOficinasOrigenTipoVO)) {
			throw new IllegalArgumentException();
		}
		TipoEntradaConsultarOficinasOrigenTipoVO ltecoot_tipoEntradaConsultarOficinasOrigenTipoVo = (TipoEntradaConsultarOficinasOrigenTipoVO) aci_clienteIntegracionVO;
		TipoEntradaConsultarOficinasOrigenTipo ltecoot_tipoEntradaConsultarOficinasOrigenTipo = ConsultarOficinasOrigenTipoConverter
				.voATipo(ltecoot_tipoEntradaConsultarOficinasOrigenTipoVo);

		UtilidadLog<TipoEntradaConsultarOficinasOrigenTipoVO> lultecoot_utilidadLogEntrada = new UtilidadLog<>();
		lultecoot_utilidadLogEntrada.generarDebugObjeto(ltecoot_tipoEntradaConsultarOficinasOrigenTipoVo,
				TipoEntradaConsultarOficinasOrigenTipoVO.class, EnumLog.ENTRADA_SERVICIO.getIs_codigo());

		TipoSalidaConsultarOficinasOrigenTipoVO ltscoot_tipoSalidaConsultarOficinasOrigenTipoVo;
		ltscoot_tipoSalidaConsultarOficinasOrigenTipoVo = ConsultarOficinasOrigenTipoConverter.tipoAVo(
				asat_alertaTierras.consultarOficinasOrigenTipo(ltecoot_tipoEntradaConsultarOficinasOrigenTipo));

		UtilidadLog<TipoSalidaConsultarOficinasOrigenTipoVO> lultscoot_utilidadLogSalida = new UtilidadLog<>();
		lultscoot_utilidadLogSalida.generarDebugObjeto(ltscoot_tipoSalidaConsultarOficinasOrigenTipoVo,
				TipoSalidaConsultarOficinasOrigenTipoVO.class, EnumLog.SALIDA_SERVICIO.getIs_codigo());

		return ltscoot_tipoSalidaConsultarOficinasOrigenTipoVo;
	}

	/**
	 * Metodo encargado de crear procedimiento del antiguo sistemas de tierras.
	 *
	 * @param aci_clienteIntegracionVO datos de la entrada del servicio
	 * @param asat_alertaTierras       clase del servicio a llamar
	 * @return TipoSalidaCrearProcAntiguoSistemaTierrasVO respuesta del servicio
	 */
	private TipoSalidaCrearProcAntiguoSistemaTierrasVO crearProcAntiguoSistemaTierras(
			ClienteIntegracionVO aci_clienteIntegracionVO, SBBEEAlertaTierras asat_alertaTierras) {
		if (!(aci_clienteIntegracionVO instanceof TipoEntradaCrearProcAntiguoSistemaTierrasVO)) {
			throw new IllegalArgumentException();
		}
		TipoEntradaCrearProcAntiguoSistemaTierrasVO ltecpast_tipoEntradaCrearProcAntiguoSistemaTierrasVo = (TipoEntradaCrearProcAntiguoSistemaTierrasVO) aci_clienteIntegracionVO;
		TipoEntradaCrearProcAntiguoSistemaTierras ltecpast_tipoEntradaCrearProcAntiguoSistemaTierras = CrearProcAntiguoSistemaTierrasConverte
				.voATipo(ltecpast_tipoEntradaCrearProcAntiguoSistemaTierrasVo);

		UtilidadLog<TipoEntradaCrearProcAntiguoSistemaTierrasVO> lultecpast_utilidadLogEntrada = new UtilidadLog<>();
		lultecpast_utilidadLogEntrada.generarDebugObjeto(ltecpast_tipoEntradaCrearProcAntiguoSistemaTierrasVo,
				TipoEntradaCrearProcAntiguoSistemaTierrasVO.class, EnumLog.ENTRADA_SERVICIO.getIs_codigo());

		TipoSalidaCrearProcAntiguoSistemaTierrasVO ltscpast_tipoSalidaCrearProcAntiguoSistemaTierrasVo;
		ltscpast_tipoSalidaCrearProcAntiguoSistemaTierrasVo = CrearProcAntiguoSistemaTierrasConverte.tipoAVo(
				asat_alertaTierras.crearProcAntiguoSistemaTierras(ltecpast_tipoEntradaCrearProcAntiguoSistemaTierras));

		UtilidadLog<TipoSalidaCrearProcAntiguoSistemaTierrasVO> lultscoast_utilidadLogSalida = new UtilidadLog<>();
		lultscoast_utilidadLogSalida.generarDebugObjeto(ltscpast_tipoSalidaCrearProcAntiguoSistemaTierrasVo,
				TipoSalidaCrearProcAntiguoSistemaTierrasVO.class, EnumLog.SALIDA_SERVICIO.getIs_codigo());

		return ltscpast_tipoSalidaCrearProcAntiguoSistemaTierrasVo;
	}

	/**
	 * Metodo encargado de eliminar procedimiento del antiguo sistema.
	 *
	 * @param aci_clienteIntegracionVO datos de la entrada del servicio
	 * @param asat_alertaTierras       clase del servicio a llamar
	 * @return TipoSalidaEliminarProcAntiguoSistemaVO respuesta del servicio
	 */
	private TipoSalidaEliminarProcAntiguoSistemaVO eliminarProcAntiguoSistema(
			ClienteIntegracionVO aci_clienteIntegracionVO, SBBEEAlertaTierras asat_alertaTierras) {
		if (!(aci_clienteIntegracionVO instanceof TipoEntradaEliminarProcAntiguoSistemaVO)) {
			throw new IllegalArgumentException();
		}
		TipoEntradaEliminarProcAntiguoSistemaVO lteepas_tipoEntradaEliminarProcAntiguoSistemaVo = (TipoEntradaEliminarProcAntiguoSistemaVO) aci_clienteIntegracionVO;
		TipoEntradaEliminarProcAntiguoSistema lteepas_tipoEntradaEliminarProcAntiguoSistema = EliminarProcAntiguoSistemaConverter
				.voATipo(lteepas_tipoEntradaEliminarProcAntiguoSistemaVo);

		UtilidadLog<TipoEntradaEliminarProcAntiguoSistemaVO> lulteepas_utilidadLogEntrada = new UtilidadLog<>();
		lulteepas_utilidadLogEntrada.generarDebugObjeto(lteepas_tipoEntradaEliminarProcAntiguoSistemaVo,
				TipoEntradaEliminarProcAntiguoSistemaVO.class, EnumLog.ENTRADA_SERVICIO.getIs_codigo());

		TipoSalidaEliminarProcAntiguoSistemaVO ltsepas_tipoSalidaEliminarProcAntiguoSistemaVo;
		ltsepas_tipoSalidaEliminarProcAntiguoSistemaVo = EliminarProcAntiguoSistemaConverter
				.tipoAVo(asat_alertaTierras.eliminarProcAntiguoSistema(lteepas_tipoEntradaEliminarProcAntiguoSistema));

		UtilidadLog<TipoSalidaEliminarProcAntiguoSistemaVO> lultsepas_utilidadLogSalida = new UtilidadLog<>();
		lultsepas_utilidadLogSalida.generarDebugObjeto(ltsepas_tipoSalidaEliminarProcAntiguoSistemaVo,
				TipoSalidaEliminarProcAntiguoSistemaVO.class, EnumLog.SALIDA_SERVICIO.getIs_codigo());

		return ltsepas_tipoSalidaEliminarProcAntiguoSistemaVo;
	}

	/**
	 * Metodo encargado de incativar alerta.
	 *
	 * @param aci_clienteIntegracionVO datos de la entrada del servicio
	 * @param asat_alertaTierras       clase del servicio a llamar
	 * @return TipoSalidaInactivarAlertaVO respuesta del servicio
	 */
	private TipoSalidaInactivarAlertaVO inactivarAlerta(ClienteIntegracionVO aci_clienteIntegracionVO,
			SBBEEAlertaTierras asat_alertaTierras) {
		if (!(aci_clienteIntegracionVO instanceof TipoEntradaInactivarAlertaVO)) {
			throw new IllegalArgumentException();
		}
		TipoEntradaInactivarAlertaVO lteia_tipoEntradaInactivarAlertaVo = (TipoEntradaInactivarAlertaVO) aci_clienteIntegracionVO;
		TipoEntradaInactivarAlerta lteia_tipoEntradaInactivarAlerta = InactivarAlertaTierrasConverter
				.voATipo(lteia_tipoEntradaInactivarAlertaVo);

		UtilidadLog<TipoEntradaInactivarAlertaVO> lulteia_utilidadLogEntrada = new UtilidadLog<>();
		lulteia_utilidadLogEntrada.generarDebugObjeto(lteia_tipoEntradaInactivarAlertaVo,
				TipoEntradaInactivarAlertaVO.class, EnumLog.ENTRADA_SERVICIO.getIs_codigo());

		TipoSalidaInactivarAlertaVO ltsia_tipoSalidaInactivarAlertaVo;
		ltsia_tipoSalidaInactivarAlertaVo = InactivarAlertaTierrasConverter
				.tipoAVo(asat_alertaTierras.inactivarAlerta(lteia_tipoEntradaInactivarAlerta));

		UtilidadLog<TipoSalidaInactivarAlertaVO> lultsia_utilidadLogSalida = new UtilidadLog<>();
		lultsia_utilidadLogSalida.generarDebugObjeto(ltsia_tipoSalidaInactivarAlertaVo,
				TipoSalidaInactivarAlertaVO.class, EnumLog.SALIDA_SERVICIO.getIs_codigo());

		return ltsia_tipoSalidaInactivarAlertaVo;
	}

	/**
	 * Metodo encargado de inscribir alerta cabecera.
	 *
	 * @param aci_clienteIntegracionVO datos de la entrada del servicio
	 * @param asat_alertaTierras       clase del servicio a llamar
	 * @return TipoSalidaInscribirAlertaCabeceraVO respuesta del servicio
	 */
	private TipoSalidaInscribirAlertaCabeceraVO inscribirAlertaCabecera(ClienteIntegracionVO aci_clienteIntegracionVO,
			SBBEEAlertaTierras asat_alertaTierras) {
		if (!(aci_clienteIntegracionVO instanceof TipoEntradaInscribirAlertaCabeceraVO)) {
			throw new IllegalArgumentException();
		}
		TipoEntradaInscribirAlertaCabeceraVO lteiac_tipoEntradaInscribirAlertaCabeceraVo = (TipoEntradaInscribirAlertaCabeceraVO) aci_clienteIntegracionVO;
		TipoEntradaInscribirAlertaCabecera lteiac_tipoEntradaInscribirAlertaCabecera = InscribirAlertaCabeceraConverter
				.voATipo(lteiac_tipoEntradaInscribirAlertaCabeceraVo);

		UtilidadLog<TipoEntradaInscribirAlertaCabeceraVO> lulteiac_utilidadLogEntrada = new UtilidadLog<>();
		lulteiac_utilidadLogEntrada.generarDebugObjeto(lteiac_tipoEntradaInscribirAlertaCabeceraVo,
				TipoEntradaInscribirAlertaCabeceraVO.class, EnumLog.ENTRADA_SERVICIO.getIs_codigo());

		TipoSalidaInscribirAlertaCabeceraVO ltsiac_tipoSalidaInscribirAlertaCabeceraVo;
		ltsiac_tipoSalidaInscribirAlertaCabeceraVo = InscribirAlertaCabeceraConverter
				.tipoAVo(asat_alertaTierras.inscribirAlertaCabecera(lteiac_tipoEntradaInscribirAlertaCabecera));

		UtilidadLog<TipoSalidaInscribirAlertaCabeceraVO> lultsiac_utilidadLogSalida = new UtilidadLog<>();
		lultsiac_utilidadLogSalida.generarDebugObjeto(ltsiac_tipoSalidaInscribirAlertaCabeceraVo,
				TipoSalidaInscribirAlertaCabeceraVO.class, EnumLog.SALIDA_SERVICIO.getIs_codigo());

		return ltsiac_tipoSalidaInscribirAlertaCabeceraVo;
	}

	/**
	 * Metodo encargado de listar procedimientos antiguo sistema.
	 *
	 * @param aci_clienteIntegracionVO datos de la entrada del servicio
	 * @param asat_alertaTierras       clase del servicio a llamar
	 * @return TipoSalidaListarProcAntiguoSistemaVO respuesta del servicio
	 */
	private TipoSalidaListarProcAntiguoSistemaVO listarProcAntiguoSistema(ClienteIntegracionVO aci_clienteIntegracionVO,
			SBBEEAlertaTierras asat_alertaTierras) {
		if (!(aci_clienteIntegracionVO instanceof TipoEntradaListarProcAntiguoSistemaVO)) {
			throw new IllegalArgumentException();
		}
		TipoEntradaListarProcAntiguoSistemaVO ltelpas_tipoEntradaListarProcAntiguoSistemaVo = (TipoEntradaListarProcAntiguoSistemaVO) aci_clienteIntegracionVO;
		TipoEntradaListarProcAntiguoSistema ltelpas_tipoEntradaListarProcAntiguoSistema = ListarProcAntiguoSistemaConverter
				.voATipo(ltelpas_tipoEntradaListarProcAntiguoSistemaVo);

		UtilidadLog<TipoEntradaListarProcAntiguoSistemaVO> lultelpas_utilidadLogEntrada = new UtilidadLog<>();
		lultelpas_utilidadLogEntrada.generarDebugObjeto(ltelpas_tipoEntradaListarProcAntiguoSistemaVo,
				TipoEntradaListarProcAntiguoSistemaVO.class, EnumLog.ENTRADA_SERVICIO.getIs_codigo());

		TipoSalidaListarProcAntiguoSistemaVO ltslpas_tipoSalidaListarProcAntiguoSistemaVo;
		ltslpas_tipoSalidaListarProcAntiguoSistemaVo = ListarProcAntiguoSistemaConverter
				.tipoAVo(asat_alertaTierras.listarProcAntiguoSistema(ltelpas_tipoEntradaListarProcAntiguoSistema));

		UtilidadLog<TipoSalidaListarProcAntiguoSistemaVO> lultslpas_utilidadLogSalida = new UtilidadLog<>();
		lultslpas_utilidadLogSalida.generarDebugObjeto(ltslpas_tipoSalidaListarProcAntiguoSistemaVo,
				TipoSalidaListarProcAntiguoSistemaVO.class, EnumLog.SALIDA_SERVICIO.getIs_codigo());

		return ltslpas_tipoSalidaListarProcAntiguoSistemaVo;
	}

	/**
	 * Metodo encargado de rechazar correcion alerta.
	 *
	 * @param aci_clienteIntegracionVO datos de la entrada del servicio
	 * @param asat_alertaTierras       clase del servicio a llamar
	 * @return TipoSalidaRechazarCorreccionAlertaVO respuesta del servicio
	 */
	private TipoSalidaRechazarCorreccionAlertaVO rechazarCorreccionAlerta(ClienteIntegracionVO aci_clienteIntegracionVO,
			SBBEEAlertaTierras asat_alertaTierras) {
		if (!(aci_clienteIntegracionVO instanceof TipoEntradaRechazarCorreccionAlertaVO)) {
			throw new IllegalArgumentException();
		}
		TipoEntradaRechazarCorreccionAlertaVO lterca_tipoEntradaRechazarCorreccionAlertaVo = (TipoEntradaRechazarCorreccionAlertaVO) aci_clienteIntegracionVO;
		TipoEntradaRechazarCorreccionAlerta lterca_tipoEntradaRechazarCorreccionAlerta = RechazarCorreccionAlertaConverter
				.voATipo(lterca_tipoEntradaRechazarCorreccionAlertaVo);

		UtilidadLog<TipoEntradaRechazarCorreccionAlertaVO> lulterca_utilidadLogEntrada = new UtilidadLog<>();
		lulterca_utilidadLogEntrada.generarDebugObjeto(lterca_tipoEntradaRechazarCorreccionAlertaVo,
				TipoEntradaRechazarCorreccionAlertaVO.class, EnumLog.ENTRADA_SERVICIO.getIs_codigo());

		TipoSalidaRechazarCorreccionAlertaVO ltsrca_tipoSalidaRechazarCorreccionAlertaVo;
		ltsrca_tipoSalidaRechazarCorreccionAlertaVo = RechazarCorreccionAlertaConverter
				.tipoAVo(asat_alertaTierras.rechazarCorreccionAlerta(lterca_tipoEntradaRechazarCorreccionAlerta));

		UtilidadLog<TipoSalidaRechazarCorreccionAlertaVO> lultsrca_utilidadLogSalida = new UtilidadLog<>();
		lultsrca_utilidadLogSalida.generarDebugObjeto(ltsrca_tipoSalidaRechazarCorreccionAlertaVo,
				TipoSalidaRechazarCorreccionAlertaVO.class, EnumLog.SALIDA_SERVICIO.getIs_codigo());

		return ltsrca_tipoSalidaRechazarCorreccionAlertaVo;
	}

	/**
	 * Metodo encargado de remover matricula alerta.
	 *
	 * @param aci_clienteIntegracionVO datos de la entrada del servicio
	 * @param asat_alertaTierras       clase del servicio a llamar
	 * @return TipoSalidaRemoverMatriculaAlertaVO respuesta del servicio
	 */
	private TipoSalidaRemoverMatriculaAlertaVO removerMatriculaAlerta(ClienteIntegracionVO aci_clienteIntegracionVO,
			SBBEEAlertaTierras asat_alertaTierras) {
		if (!(aci_clienteIntegracionVO instanceof TipoEntradaRemoverMatriculaAlertaVO)) {
			throw new IllegalArgumentException();
		}
		TipoEntradaRemoverMatriculaAlertaVO lterma_tipoEntradaRemoverMatriculaAlertaVo = (TipoEntradaRemoverMatriculaAlertaVO) aci_clienteIntegracionVO;
		TipoEntradaRemoverMatriculaAlerta lterma_tipoEntradaRemoverMatriculaAlerta = RemoverMatriculaAlertaConverter
				.voATipo(lterma_tipoEntradaRemoverMatriculaAlertaVo);

		UtilidadLog<TipoEntradaRemoverMatriculaAlertaVO> lulterma_utilidadLogEntrada = new UtilidadLog<>();
		lulterma_utilidadLogEntrada.generarDebugObjeto(lterma_tipoEntradaRemoverMatriculaAlertaVo,
				TipoEntradaRemoverMatriculaAlertaVO.class, EnumLog.ENTRADA_SERVICIO.getIs_codigo());

		TipoSalidaRemoverMatriculaAlertaVO ltsrma_tipoSalidaRemoverMatriculaAlertaVo;
		ltsrma_tipoSalidaRemoverMatriculaAlertaVo = RemoverMatriculaAlertaConverter
				.tipoAVo(asat_alertaTierras.removerMatriculaAlerta(lterma_tipoEntradaRemoverMatriculaAlerta));

		UtilidadLog<TipoSalidaRemoverMatriculaAlertaVO> lultstma_utilidadLogSalida = new UtilidadLog<>();
		lultstma_utilidadLogSalida.generarDebugObjeto(ltsrma_tipoSalidaRemoverMatriculaAlertaVo,
				TipoSalidaRemoverMatriculaAlertaVO.class, EnumLog.SALIDA_SERVICIO.getIs_codigo());

		return ltsrma_tipoSalidaRemoverMatriculaAlertaVo;
	}

}

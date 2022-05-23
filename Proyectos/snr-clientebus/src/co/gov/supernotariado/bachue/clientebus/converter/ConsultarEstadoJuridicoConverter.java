/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: ConsultarEstadoJuridicoConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.converter
 * Nombre del elemento: ConsultarEstadoJuridicoConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.converter;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.clientebus.estadojuridicofolio.types.consultarestadojuridico.TipoAnotacion;
import co.gov.supernotariado.bachue.clientebus.estadojuridicofolio.types.consultarestadojuridico.TipoAnotacionCancelada;
import co.gov.supernotariado.bachue.clientebus.estadojuridicofolio.types.consultarestadojuridico.TipoEntradaConsultaJuridicaFolio;
import co.gov.supernotariado.bachue.clientebus.estadojuridicofolio.types.consultarestadojuridico.TipoInterviniente;
import co.gov.supernotariado.bachue.clientebus.estadojuridicofolio.types.consultarestadojuridico.TipoMatriculaDerivada;
import co.gov.supernotariado.bachue.clientebus.estadojuridicofolio.types.consultarestadojuridico.TipoMatriculaMatriz;
import co.gov.supernotariado.bachue.clientebus.estadojuridicofolio.types.consultarestadojuridico.TipoMedidaCautelar;
import co.gov.supernotariado.bachue.clientebus.estadojuridicofolio.types.consultarestadojuridico.TipoPropietario;
import co.gov.supernotariado.bachue.clientebus.estadojuridicofolio.types.consultarestadojuridico.TipoSalidaConsultaEstadoJuridicoFolio;
import co.gov.supernotariado.bachue.clientebus.vo.estadojuridicofolio.AnotacionesCanceladasVO;
import co.gov.supernotariado.bachue.clientebus.vo.estadojuridicofolio.AnotacionesVO;
import co.gov.supernotariado.bachue.clientebus.vo.estadojuridicofolio.IntervinientesVO;
import co.gov.supernotariado.bachue.clientebus.vo.estadojuridicofolio.MatriculasDerivadasVO;
import co.gov.supernotariado.bachue.clientebus.vo.estadojuridicofolio.MatriculasMatrizVO;
import co.gov.supernotariado.bachue.clientebus.vo.estadojuridicofolio.MedidasCautelaresVO;
import co.gov.supernotariado.bachue.clientebus.vo.estadojuridicofolio.PropietariosVO;
import co.gov.supernotariado.bachue.clientebus.vo.estadojuridicofolio.TipoEntradaConsultaJuridicaFolioVO;
import co.gov.supernotariado.bachue.clientebus.vo.estadojuridicofolio.TipoSalidaConsultaEstadoJuridicoFolioVO;

/**
 * Clase auxiliar (Converter) del proyecto Cliente BUS, que permite transformar
 * entre Value Object(VO) y ComplexType.<br>
 * <b>VO</b>, objeto que recibe o retorna el cliente de servicios cuando lo
 * invoca otra aplicacion o capa de negocio. <br>
 * <b>ComplexType</b>, objeto que representa un elemento especifico de un
 * esquema de servicios SOAP, relacionado a una representacion XML que sera
 * enviada o recibida al hacer ejecutar una operacion de un servicio. <br>
 * Contiene metodos de transformacion para el elemento u operacion Consultar
 * estado juridico. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ConsultarEstadoJuridicoConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * ConsultarEstadoJuridicoConverter.
	 */
	private ConsultarEstadoJuridicoConverter() {
		// Metodo constructor privado y vacio
	}

	/**
	 * Metodo que convierte de VO a ComplexType (De Objeto de valores de Servicio,
	 * entrada del cliente bus; a elemento especifico del esquema de un Servicio
	 * Web, entrada de una peticion de Servicio SOAP).<br>
	 * Se usa para convertir un objeto con las entradas de un servicio web (objeto
	 * VO), a un objeto ComplexType para ser enviado en una operacion de un
	 * servicio. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoEntradaConsultaJuridicaFolioVO
	 * <b>a</b> TipoEntradaConsultaJuridicaFolio, <br>
	 * En otras palabras, <b>de</b> Tipo entrada consulta juridica folio objeto con
	 * valores de servicio <b>a</b> Tipo entrada consulta juridica folio
	 * (ComplexType relacionado a la representacion XML del servicio).
	 *
	 * @param atecjf_tipoEntradaConsultaJuridicaFolioVo el parametro que representa
	 *                                                  el objeto con valores de
	 *                                                  servicio a convertir.
	 * @return Resultado para la conversion de objeto de valores de servicio a
	 *         complex type, en este caso como TipoEntradaConsultaJuridicaFolio.
	 */
	public static TipoEntradaConsultaJuridicaFolio voATipo(
			TipoEntradaConsultaJuridicaFolioVO atecjf_tipoEntradaConsultaJuridicaFolioVo) {
		TipoEntradaConsultaJuridicaFolio ltecjf_tipoEntradaConsultaJuridicaFolio = new TipoEntradaConsultaJuridicaFolio();

		ltecjf_tipoEntradaConsultaJuridicaFolio.setTipoIdentificacionPredio(
				atecjf_tipoEntradaConsultaJuridicaFolioVo.getIs_tipoIdentificacionPredio());
		ltecjf_tipoEntradaConsultaJuridicaFolio
				.setNumIdentificacionPredio(atecjf_tipoEntradaConsultaJuridicaFolioVo.getIs_numIdentificacionPredio());
		ltecjf_tipoEntradaConsultaJuridicaFolio.setConvenio(atecjf_tipoEntradaConsultaJuridicaFolioVo.getIs_convenio());

		return ltecjf_tipoEntradaConsultaJuridicaFolio;
	}

	/**
	 * Metodo que convierte de ComplexType a VO ( De elemento especifico del esquema
	 * de un Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto con un resultado/salida de una peticion de
	 * Servicio SOAP, en un objeto de datos llamado VO; para ser retornado como
	 * resultado a la aplicacion o capa de negocio que consume el cliente de
	 * servicios. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoSalidaConsultaEstadoJuridicoFolio
	 * <b>a</b> TipoSalidaConsultaEstadoJuridicoFolioVO, <br>
	 * En otras palabras, <b>de</b> Tipo salida consulta estado juridico folio
	 * (ComplexType relacionado a la representacion XML del servicio) <b>a</b> Tipo
	 * salida consulta estado juridico folio objeto con valores de servicio.
	 *
	 * @param atscejf_tipoSalidaConsultaEstadoJuridicoFolio el parametro que
	 *                                                      representa el complex
	 *                                                      type a convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como TipoSalidaConsultaEstadoJuridicoFolioVO.
	 */
	public static TipoSalidaConsultaEstadoJuridicoFolioVO tipoAVo(
			TipoSalidaConsultaEstadoJuridicoFolio atscejf_tipoSalidaConsultaEstadoJuridicoFolio) {
		TipoSalidaConsultaEstadoJuridicoFolioVO ltscejf_tipoSalidaConsultaEstadoJuridicoFolioVo = new TipoSalidaConsultaEstadoJuridicoFolioVO();

		ltscejf_tipoSalidaConsultaEstadoJuridicoFolioVo.setIs_numMatriculaInmobiliaria(
				atscejf_tipoSalidaConsultaEstadoJuridicoFolio.getNumMatriculaInmobiliaria());
		ltscejf_tipoSalidaConsultaEstadoJuridicoFolioVo
				.setIs_codCirculoRegistral(atscejf_tipoSalidaConsultaEstadoJuridicoFolio.getCodCirculoRegistral());
		ltscejf_tipoSalidaConsultaEstadoJuridicoFolioVo
				.setIs_nomCirculoRegistral(atscejf_tipoSalidaConsultaEstadoJuridicoFolio.getNomCirculoRegistral());
		ltscejf_tipoSalidaConsultaEstadoJuridicoFolioVo
				.setIs_numPredial(atscejf_tipoSalidaConsultaEstadoJuridicoFolio.getNumPredial());
		ltscejf_tipoSalidaConsultaEstadoJuridicoFolioVo
				.setIs_numPredialAnterior(atscejf_tipoSalidaConsultaEstadoJuridicoFolio.getNumPredialAnterior());
		ltscejf_tipoSalidaConsultaEstadoJuridicoFolioVo
				.setIs_nupre(atscejf_tipoSalidaConsultaEstadoJuridicoFolio.getNUPRE());
		ltscejf_tipoSalidaConsultaEstadoJuridicoFolioVo
				.setIs_estadoNUPRE(atscejf_tipoSalidaConsultaEstadoJuridicoFolio.getEstadoNUPRE());
		ltscejf_tipoSalidaConsultaEstadoJuridicoFolioVo
				.setIs_direccionPredio(atscejf_tipoSalidaConsultaEstadoJuridicoFolio.getDireccionPredio());
		ltscejf_tipoSalidaConsultaEstadoJuridicoFolioVo
				.setIs_codDepartamento(atscejf_tipoSalidaConsultaEstadoJuridicoFolio.getCodDepartamento());
		ltscejf_tipoSalidaConsultaEstadoJuridicoFolioVo
				.setIs_nomDepartamento(atscejf_tipoSalidaConsultaEstadoJuridicoFolio.getNomDepartamento());
		ltscejf_tipoSalidaConsultaEstadoJuridicoFolioVo
				.setIs_codMunicipio(atscejf_tipoSalidaConsultaEstadoJuridicoFolio.getCodMunicipio());
		ltscejf_tipoSalidaConsultaEstadoJuridicoFolioVo
				.setIs_nomMunicipio(atscejf_tipoSalidaConsultaEstadoJuridicoFolio.getNomMunicipio());
		ltscejf_tipoSalidaConsultaEstadoJuridicoFolioVo.setIlp_listaPropietarios(
				listaTipoAListaPropietariosVo(atscejf_tipoSalidaConsultaEstadoJuridicoFolio.getPropietarios()));
		ltscejf_tipoSalidaConsultaEstadoJuridicoFolioVo.setIla_listaAnotaciones(
				listaTipoAListaAnotacionesVo(atscejf_tipoSalidaConsultaEstadoJuridicoFolio.getAnotaciones()));
		ltscejf_tipoSalidaConsultaEstadoJuridicoFolioVo.setIlmm_listaMatriculasMatriz(
				listaTipoAListaMatriculasMatrizVo(atscejf_tipoSalidaConsultaEstadoJuridicoFolio.getMatriculasMatriz()));
		ltscejf_tipoSalidaConsultaEstadoJuridicoFolioVo
				.setIlmd_listaMatriculasDerivadas(listaTipoAListaMatriculasDerivadasVo(
						atscejf_tipoSalidaConsultaEstadoJuridicoFolio.getMatriculasDerivadas()));
		ltscejf_tipoSalidaConsultaEstadoJuridicoFolioVo
				.setIlmc_listaMedidasCautelares(listaTipoAListaMedidasCautelaresVo(
						atscejf_tipoSalidaConsultaEstadoJuridicoFolio.getMedidasCautelares()));
		ltscejf_tipoSalidaConsultaEstadoJuridicoFolioVo
				.setIbi_codMensaje(atscejf_tipoSalidaConsultaEstadoJuridicoFolio.getCodMensaje());
		ltscejf_tipoSalidaConsultaEstadoJuridicoFolioVo
				.setIs_descripcionMensaje(atscejf_tipoSalidaConsultaEstadoJuridicoFolio.getDescripcionMensaje());
		ltscejf_tipoSalidaConsultaEstadoJuridicoFolioVo
				.setIl_numeroConsulta(atscejf_tipoSalidaConsultaEstadoJuridicoFolio.getNumeroConsulta());
		if (atscejf_tipoSalidaConsultaEstadoJuridicoFolio.getFechaHoraConsulta() != null)
			ltscejf_tipoSalidaConsultaEstadoJuridicoFolioVo
					.setId_fechaHoraConsulta(atscejf_tipoSalidaConsultaEstadoJuridicoFolio.getFechaHoraConsulta()
							.toGregorianCalendar().getTime());

		return ltscejf_tipoSalidaConsultaEstadoJuridicoFolioVo;
	}

	/**
	 * Metodo que convierte de ComplexType a VO ( De elemento especifico del esquema
	 * de un Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto con un resultado/salida de una peticion de
	 * Servicio SOAP, en un objeto de datos llamado VO; para ser retornado como
	 * resultado a la aplicacion o capa de negocio que consume el cliente de
	 * servicios. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoPropietario <b>a</b> PropietariosVO,
	 * <br>
	 * En otras palabras, <b>de</b> Tipo propietario (ComplexType relacionado a la
	 * representacion XML del servicio) <b>a</b> Propietarios objeto con valores de
	 * servicio.
	 *
	 * @param atp_tipoPropietario el parametro que representa el complex type a
	 *                            convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como PropietariosVO.
	 */
	public static PropietariosVO tipoAPropietariosVo(TipoPropietario atp_tipoPropietario) {
		PropietariosVO lp_propietariosVo = new PropietariosVO();

		lp_propietariosVo.setIs_tipoPersona(atp_tipoPropietario.getTipoPersona());
		lp_propietariosVo.setIs_tipoDocumentoPersona(atp_tipoPropietario.getTipoDocumentoPersona());
		lp_propietariosVo.setIs_numDocumentoPersona(atp_tipoPropietario.getNumDocumentoPersona());
		lp_propietariosVo.setIs_numNIT(atp_tipoPropietario.getNumNIT());
		lp_propietariosVo.setIs_primerApellido(atp_tipoPropietario.getPrimerApellido());
		lp_propietariosVo.setIs_segundoApellido(atp_tipoPropietario.getSegundoApellido());
		lp_propietariosVo.setIs_primerNombre(atp_tipoPropietario.getPrimerNombre());
		lp_propietariosVo.setIs_segundoNombre(atp_tipoPropietario.getSegundoNombre());
		lp_propietariosVo.setIs_codGenero(atp_tipoPropietario.getCodGenero());
		lp_propietariosVo.setIs_razonSocial(atp_tipoPropietario.getRazonSocial());
		lp_propietariosVo.setIs_porcentajeParticipacion(atp_tipoPropietario.getRazonSocial());

		return lp_propietariosVo;
	}

	/**
	 * Metodo que convierte de una lista de ComplexType a una lista de VO ( De una
	 * lista de elementos especificos del esquema de un Servicio Web, a una lista de
	 * Objetos de valores de Servicio).<br>
	 * Se usa para convertir una lista de objetos con un resultado/salida de una
	 * peticion de Servicio SOAP, en una lista de objetos de datos llamados VOs;
	 * para ser retornado como resultado a la aplicacion o capa de negocio que
	 * consume el cliente de servicios. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoPropietario <b>a</b> PropietariosVO,
	 * <br>
	 * En otras palabras, <b>de</b> Tipo propietario (ComplexType relacionado a la
	 * representacion XML del servicio) <b>a</b> Propietarios objeto con valores de
	 * servicio.
	 *
	 * @param altp_listaTipoPropietario el parametro que representa la lista de
	 *                                  complex types a convertir.
	 * @return Resultado para la conversion de lista de complex types a lista de
	 *         objetos con valores de servicio, en este caso como lista de
	 *         PropietariosVO.
	 */
	public static List<PropietariosVO> listaTipoAListaPropietariosVo(List<TipoPropietario> altp_listaTipoPropietario) {
		List<PropietariosVO> llp_listaPropietariosVo = new ArrayList<>();
		for (TipoPropietario ltp_tipoPropietario : altp_listaTipoPropietario) {
			llp_listaPropietariosVo.add(tipoAPropietariosVo(ltp_tipoPropietario));
		}
		return llp_listaPropietariosVo;
	}

	/**
	 * Metodo que convierte de ComplexType a VO ( De elemento especifico del esquema
	 * de un Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto con un resultado/salida de una peticion de
	 * Servicio SOAP, en un objeto de datos llamado VO; para ser retornado como
	 * resultado a la aplicacion o capa de negocio que consume el cliente de
	 * servicios. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoAnotacion <b>a</b> AnotacionesVO,
	 * <br>
	 * En otras palabras, <b>de</b> Tipo anotacion (ComplexType relacionado a la
	 * representacion XML del servicio) <b>a</b> Anotaciones objeto con valores de
	 * servicio.
	 *
	 * @param ata_tipoAnotacion el parametro que representa el complex type a
	 *                          convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como AnotacionesVO.
	 */
	public static AnotacionesVO tipoAAnotacionesVo(TipoAnotacion ata_tipoAnotacion) {
		AnotacionesVO la_anotacionesVo = new AnotacionesVO();

		la_anotacionesVo.setIbi_numAnotacion(ata_tipoAnotacion.getNumAnotacion());
		la_anotacionesVo.setIlac_listaAnotacionesCanceladas(
				listaTipoAListaAnotacionesCanceladasVo(ata_tipoAnotacion.getAnotacionesCanceladas()));
		la_anotacionesVo.setIs_comentario(ata_tipoAnotacion.getComentario());
		la_anotacionesVo.setIs_codTipoDocumentoPublico(ata_tipoAnotacion.getCodTipoDocumentoPublico());
		la_anotacionesVo.setId_fechaDocumento(ata_tipoAnotacion.getFechaDocumento().toGregorianCalendar().getTime());
		la_anotacionesVo.setIs_nomDocumentoPublico(ata_tipoAnotacion.getNomDocumentoPublico());
		la_anotacionesVo.setIs_codDominioActoJuridico(ata_tipoAnotacion.getCodDominioActoJuridico());
		la_anotacionesVo.setIs_nomDominioActoJuridico(ata_tipoAnotacion.getNomDominioActoJuridico());
		la_anotacionesVo.setIs_oficinaOrigen(ata_tipoAnotacion.getOficinaOrigen());
		la_anotacionesVo.setIs_comentarioEspecificoAnotacion(ata_tipoAnotacion.getComentarioEspecificoAnotacion());
		la_anotacionesVo.setIs_drr(ata_tipoAnotacion.getDRR());
		la_anotacionesVo.setIs_codNaturalezaJuridicaFolio(ata_tipoAnotacion.getCodNaturalezaJuridicaFolio());
		la_anotacionesVo.setId_fechaAnotacion(ata_tipoAnotacion.getFechaAnotacion().toGregorianCalendar().getTime());
		la_anotacionesVo
				.setIli_listaIntervinientes(listaTipoAListaIntervinientesVo(ata_tipoAnotacion.getIntervinientes()));
		la_anotacionesVo.setIs_nir(ata_tipoAnotacion.getNIR());
		la_anotacionesVo.setIs_radicacion(ata_tipoAnotacion.getRadicacion());
		la_anotacionesVo.setIs_estadoAnotacion(ata_tipoAnotacion.getEstadoAnotacion());
		la_anotacionesVo.setIs_valorActo(ata_tipoAnotacion.getValorActo());

		return la_anotacionesVo;
	}

	/**
	 * Metodo que convierte de una lista de ComplexType a una lista de VO ( De una
	 * lista de elementos especificos del esquema de un Servicio Web, a una lista de
	 * Objetos de valores de Servicio).<br>
	 * Se usa para convertir una lista de objetos con un resultado/salida de una
	 * peticion de Servicio SOAP, en una lista de objetos de datos llamados VOs;
	 * para ser retornado como resultado a la aplicacion o capa de negocio que
	 * consume el cliente de servicios. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoAnotacion <b>a</b> AnotacionesVO,
	 * <br>
	 * En otras palabras, <b>de</b> Tipo anotacion (ComplexType relacionado a la
	 * representacion XML del servicio) <b>a</b> Anotaciones objeto con valores de
	 * servicio.
	 *
	 * @param alta_listaTipoAnotacion el parametro que representa la lista de
	 *                                complex types a convertir.
	 * @return Resultado para la conversion de lista de complex types a lista de
	 *         objetos con valores de servicio, en este caso como lista de
	 *         AnotacionesVO.
	 */

	public static List<AnotacionesVO> listaTipoAListaAnotacionesVo(List<TipoAnotacion> alta_listaTipoAnotacion) {
		List<AnotacionesVO> lla_listaAnotacionesVo = new ArrayList<>();
		for (TipoAnotacion ata_tipoAnotacion : alta_listaTipoAnotacion) {
			lla_listaAnotacionesVo.add(tipoAAnotacionesVo(ata_tipoAnotacion));
		}
		return lla_listaAnotacionesVo;
	}

	/**
	 * Metodo que convierte de ComplexType a VO ( De elemento especifico del esquema
	 * de un Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto con un resultado/salida de una peticion de
	 * Servicio SOAP, en un objeto de datos llamado VO; para ser retornado como
	 * resultado a la aplicacion o capa de negocio que consume el cliente de
	 * servicios. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoAnotacionCancelada <b>a</b>
	 * AnotacionesCanceladasVO, <br>
	 * En otras palabras, <b>de</b> Tipo anotacion cancelada (ComplexType
	 * relacionado a la representacion XML del servicio) <b>a</b> Anotaciones
	 * canceladas objeto con valores de servicio.
	 *
	 * @param atac_tipoAnotacionCancelada el parametro que representa el complex
	 *                                    type a convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como AnotacionesCanceladasVO.
	 */
	public static AnotacionesCanceladasVO tipoAAnotacionesCanceladasVo(
			TipoAnotacionCancelada atac_tipoAnotacionCancelada) {
		AnotacionesCanceladasVO lac_anotacionesCanceladasVo = new AnotacionesCanceladasVO();

		lac_anotacionesCanceladasVo.setIs_anotacionCancelada(atac_tipoAnotacionCancelada.getAnotacionCancelada());

		return lac_anotacionesCanceladasVo;
	}

	/**
	 * Metodo que convierte de una lista de ComplexType a una lista de VO ( De una
	 * lista de elementos especificos del esquema de un Servicio Web, a una lista de
	 * Objetos de valores de Servicio).<br>
	 * Se usa para convertir una lista de objetos con un resultado/salida de una
	 * peticion de Servicio SOAP, en una lista de objetos de datos llamados VOs;
	 * para ser retornado como resultado a la aplicacion o capa de negocio que
	 * consume el cliente de servicios. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoAnotacionCancelada <b>a</b>
	 * AnotacionesCanceladasVO, <br>
	 * En otras palabras, <b>de</b> Tipo anotacion cancelada (ComplexType
	 * relacionado a la representacion XML del servicio) <b>a</b> Anotaciones
	 * canceladas objeto con valores de servicio.
	 *
	 * @param altac_listaTipoAnotacionCancelada el parametro que representa la lista
	 *                                          de complex types a convertir.
	 * @return Resultado para la conversion de lista de complex types a lista de
	 *         objetos con valores de servicio, en este caso como lista de
	 *         AnotacionesCanceladasVO.
	 */
	public static List<AnotacionesCanceladasVO> listaTipoAListaAnotacionesCanceladasVo(
			List<TipoAnotacionCancelada> altac_listaTipoAnotacionCancelada) {
		List<AnotacionesCanceladasVO> llac_listaAnotacionesCanceladasVo = new ArrayList<>();
		for (TipoAnotacionCancelada atac_tipoAnotacionCancelada : altac_listaTipoAnotacionCancelada) {
			llac_listaAnotacionesCanceladasVo.add(tipoAAnotacionesCanceladasVo(atac_tipoAnotacionCancelada));
		}
		return llac_listaAnotacionesCanceladasVo;
	}

	/**
	 * Metodo que convierte de ComplexType a VO ( De elemento especifico del esquema
	 * de un Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto con un resultado/salida de una peticion de
	 * Servicio SOAP, en un objeto de datos llamado VO; para ser retornado como
	 * resultado a la aplicacion o capa de negocio que consume el cliente de
	 * servicios. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoInterviniente <b>a</b>
	 * IntervinientesVO, <br>
	 * En otras palabras, <b>de</b> Tipo interviniente (ComplexType relacionado a la
	 * representacion XML del servicio) <b>a</b> Intervinientes objeto con valores
	 * de servicio.
	 *
	 * @param ati_tipoInterviniente el parametro que representa el complex type a
	 *                              convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como IntervinientesVO.
	 */
	public static IntervinientesVO tipoAIntevinientesVo(TipoInterviniente ati_tipoInterviniente) {
		IntervinientesVO li_intervinientesVo = new IntervinientesVO();

		li_intervinientesVo.setIs_rolInterviniente(ati_tipoInterviniente.getRolInterviniente());
		li_intervinientesVo.setIs_tipoPersona(ati_tipoInterviniente.getTipoPersona());
		li_intervinientesVo.setIs_esPropietario(ati_tipoInterviniente.getEsPropietario());
		li_intervinientesVo.setIs_tipoDocumentoPersona(ati_tipoInterviniente.getTipoDocumentoPersona());
		li_intervinientesVo.setIs_numDocumentoPersona(ati_tipoInterviniente.getNumDocumentoPersona());
		li_intervinientesVo.setIs_numNIT(ati_tipoInterviniente.getNumNIT());
		li_intervinientesVo.setIs_porcentajeParticipacion(ati_tipoInterviniente.getPorcentajeParticipacion());
		li_intervinientesVo.setIs_primerNombre(ati_tipoInterviniente.getPrimerNombre());
		li_intervinientesVo.setIs_segundoNombre(ati_tipoInterviniente.getSegundoNombre());
		li_intervinientesVo.setIs_primerApellido(ati_tipoInterviniente.getPrimerApellido());
		li_intervinientesVo.setIs_segundoApellido(ati_tipoInterviniente.getSegundoApellido());
		li_intervinientesVo.setIs_codGenero(ati_tipoInterviniente.getCodGenero());
		li_intervinientesVo.setIs_razonSocial(ati_tipoInterviniente.getRazonSocial());

		return li_intervinientesVo;
	}

	/**
	 * Metodo que convierte de una lista de ComplexType a una lista de VO ( De una
	 * lista de elementos especificos del esquema de un Servicio Web, a una lista de
	 * Objetos de valores de Servicio).<br>
	 * Se usa para convertir una lista de objetos con un resultado/salida de una
	 * peticion de Servicio SOAP, en una lista de objetos de datos llamados VOs;
	 * para ser retornado como resultado a la aplicacion o capa de negocio que
	 * consume el cliente de servicios. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoInterviniente <b>a</b>
	 * IntervinientesVO, <br>
	 * En otras palabras, <b>de</b> Tipo interviniente (ComplexType relacionado a la
	 * representacion XML del servicio) <b>a</b> Intervinientes objeto con valores
	 * de servicio.
	 *
	 * @param alti_listaTipoInterviniente el parametro que representa la lista de
	 *                                    complex types a convertir.
	 * @return Resultado para la conversion de lista de complex types a lista de
	 *         objetos con valores de servicio, en este caso como lista de
	 *         IntervinientesVO.
	 */
	public static List<IntervinientesVO> listaTipoAListaIntervinientesVo(
			List<TipoInterviniente> alti_listaTipoInterviniente) {
		List<IntervinientesVO> lli_listaIntervinientesVo = new ArrayList<>();
		for (TipoInterviniente ati_tipoInterviniente : alti_listaTipoInterviniente) {
			lli_listaIntervinientesVo.add(tipoAIntevinientesVo(ati_tipoInterviniente));
		}
		return lli_listaIntervinientesVo;
	}

	/**
	 * Metodo que convierte de ComplexType a VO ( De elemento especifico del esquema
	 * de un Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto con un resultado/salida de una peticion de
	 * Servicio SOAP, en un objeto de datos llamado VO; para ser retornado como
	 * resultado a la aplicacion o capa de negocio que consume el cliente de
	 * servicios. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoMatriculaMatriz <b>a</b>
	 * MatriculasMatrizVO, <br>
	 * En otras palabras, <b>de</b> Tipo matricula matriz (ComplexType relacionado a
	 * la representacion XML del servicio) <b>a</b> Matriculas matriz objeto con
	 * valores de servicio.
	 *
	 * @param atmm_tipoMatriculaMatriz el parametro que representa el complex type a
	 *                                 convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como MatriculasMatrizVO.
	 */
	public static MatriculasMatrizVO tipoAMatriculasMatrizVo(TipoMatriculaMatriz atmm_tipoMatriculaMatriz) {
		MatriculasMatrizVO lmm_matriculasMatrizVo = new MatriculasMatrizVO();

		lmm_matriculasMatrizVo.setIs_numMatriculaInmobiliaria(atmm_tipoMatriculaMatriz.getNumMatriculaInmobiliaria());
		lmm_matriculasMatrizVo.setIs_codCirculoRegistral(atmm_tipoMatriculaMatriz.getCodCirculoRegistral());

		return lmm_matriculasMatrizVo;
	}

	/**
	 * Metodo que convierte de una lista de ComplexType a una lista de VO ( De una
	 * lista de elementos especificos del esquema de un Servicio Web, a una lista de
	 * Objetos de valores de Servicio).<br>
	 * Se usa para convertir una lista de objetos con un resultado/salida de una
	 * peticion de Servicio SOAP, en una lista de objetos de datos llamados VOs;
	 * para ser retornado como resultado a la aplicacion o capa de negocio que
	 * consume el cliente de servicios. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoMatriculaMatriz <b>a</b>
	 * MatriculasMatrizVO, <br>
	 * En otras palabras, <b>de</b> Tipo matricula matriz (ComplexType relacionado a
	 * la representacion XML del servicio) <b>a</b> Matriculas matriz objeto con
	 * valores de servicio.
	 *
	 * @param altmm_listaTipoMatriculaMatriz el parametro que representa la lista de
	 *                                       complex types a convertir.
	 * @return Resultado para la conversion de lista de complex types a lista de
	 *         objetos con valores de servicio, en este caso como lista de
	 *         MatriculasMatrizVO.
	 */
	public static List<MatriculasMatrizVO> listaTipoAListaMatriculasMatrizVo(
			List<TipoMatriculaMatriz> altmm_listaTipoMatriculaMatriz) {
		List<MatriculasMatrizVO> llmm_listaMatriculasMatrizVo = new ArrayList<>();
		for (TipoMatriculaMatriz atmm_tipoMatriculaMatriz : altmm_listaTipoMatriculaMatriz) {
			llmm_listaMatriculasMatrizVo.add(tipoAMatriculasMatrizVo(atmm_tipoMatriculaMatriz));
		}
		return llmm_listaMatriculasMatrizVo;
	}

	/**
	 * Metodo que convierte de ComplexType a VO ( De elemento especifico del esquema
	 * de un Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto con un resultado/salida de una peticion de
	 * Servicio SOAP, en un objeto de datos llamado VO; para ser retornado como
	 * resultado a la aplicacion o capa de negocio que consume el cliente de
	 * servicios. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoMatriculaDerivada <b>a</b>
	 * MatriculasDerivadasVO, <br>
	 * En otras palabras, <b>de</b> Tipo matricula derivada (ComplexType relacionado
	 * a la representacion XML del servicio) <b>a</b> Matriculas derivadas objeto
	 * con valores de servicio.
	 *
	 * @param atmd_tipoMatriculaDerivada el parametro que representa el complex type
	 *                                   a convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como MatriculasDerivadasVO.
	 */
	public static MatriculasDerivadasVO tipoAMatriculasDerivadasVo(TipoMatriculaDerivada atmd_tipoMatriculaDerivada) {
		MatriculasDerivadasVO lmd_matriculasDerivadasVo = new MatriculasDerivadasVO();

		lmd_matriculasDerivadasVo
				.setIs_numMatriculaInmobiliaria(atmd_tipoMatriculaDerivada.getNumMatriculaInmobiliaria());
		lmd_matriculasDerivadasVo.setIs_codCirculoRegistral(atmd_tipoMatriculaDerivada.getCodCirculoRegistral());
		lmd_matriculasDerivadasVo.setIs_direccionPredio(atmd_tipoMatriculaDerivada.getDireccionPredio());
		lmd_matriculasDerivadasVo.setIs_nir(atmd_tipoMatriculaDerivada.getNIR());
		lmd_matriculasDerivadasVo.setIs_radicacion(atmd_tipoMatriculaDerivada.getRadicacion());
		lmd_matriculasDerivadasVo.setIs_anotacionRelacionada(atmd_tipoMatriculaDerivada.getAnotacionRelacionada());

		return lmd_matriculasDerivadasVo;
	}

	/**
	 * Metodo que convierte de una lista de ComplexType a una lista de VO ( De una
	 * lista de elementos especificos del esquema de un Servicio Web, a una lista de
	 * Objetos de valores de Servicio).<br>
	 * Se usa para convertir una lista de objetos con un resultado/salida de una
	 * peticion de Servicio SOAP, en una lista de objetos de datos llamados VOs;
	 * para ser retornado como resultado a la aplicacion o capa de negocio que
	 * consume el cliente de servicios. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoMatriculaDerivada <b>a</b>
	 * MatriculasDerivadasVO, <br>
	 * En otras palabras, <b>de</b> Tipo matricula derivada (ComplexType relacionado
	 * a la representacion XML del servicio) <b>a</b> Matriculas derivadas objeto
	 * con valores de servicio.
	 *
	 * @param altmd_listaTipoMatriculaDerivada el parametro que representa la lista
	 *                                         de complex types a convertir.
	 * @return Resultado para la conversion de lista de complex types a lista de
	 *         objetos con valores de servicio, en este caso como lista de
	 *         MatriculasDerivadasVO.
	 */
	public static List<MatriculasDerivadasVO> listaTipoAListaMatriculasDerivadasVo(
			List<TipoMatriculaDerivada> altmd_listaTipoMatriculaDerivada) {
		List<MatriculasDerivadasVO> llmd_listaMatriculasDerivadasVo = new ArrayList<>();
		for (TipoMatriculaDerivada atmd_tipoMatriculaDerivada : altmd_listaTipoMatriculaDerivada) {
			llmd_listaMatriculasDerivadasVo.add(tipoAMatriculasDerivadasVo(atmd_tipoMatriculaDerivada));
		}
		return llmd_listaMatriculasDerivadasVo;
	}

	/**
	 * Metodo que convierte de ComplexType a VO ( De elemento especifico del esquema
	 * de un Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto con un resultado/salida de una peticion de
	 * Servicio SOAP, en un objeto de datos llamado VO; para ser retornado como
	 * resultado a la aplicacion o capa de negocio que consume el cliente de
	 * servicios. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoMedidaCautelar <b>a</b>
	 * MedidasCautelaresVO, <br>
	 * En otras palabras, <b>de</b> Tipo medida cautelar (ComplexType relacionado a
	 * la representacion XML del servicio) <b>a</b> Medidas cautelares objeto con
	 * valores de servicio.
	 *
	 * @param atmc_tipoMedidaCautelar el parametro que representa el complex type a
	 *                                convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como MedidasCautelaresVO.
	 */
	public static MedidasCautelaresVO tipoAMedidasCautelaresVo(TipoMedidaCautelar atmc_tipoMedidaCautelar) {
		MedidasCautelaresVO lmc_medidasCautelaresVo = new MedidasCautelaresVO();

		lmc_medidasCautelaresVo.setIbi_numAnotacion(atmc_tipoMedidaCautelar.getNumAnotacion());
		lmc_medidasCautelaresVo.setIlac_listaAnotacionesCanceladas(
				listaTipoAListaAnotacionesCanceladasVo(atmc_tipoMedidaCautelar.getAnotacionesCanceladas()));
		lmc_medidasCautelaresVo.setIs_comentario(atmc_tipoMedidaCautelar.getComentario());
		lmc_medidasCautelaresVo.setIs_codTipoDocumentoPublico(atmc_tipoMedidaCautelar.getCodTipoDocumentoPublico());
		lmc_medidasCautelaresVo
				.setId_fechaDocumento(atmc_tipoMedidaCautelar.getFechaDocumento().toGregorianCalendar().getTime());
		lmc_medidasCautelaresVo.setIs_nomDocumentoPublico(atmc_tipoMedidaCautelar.getNomDocumentoPublico());
		lmc_medidasCautelaresVo.setIs_codDominioActoJuridico(atmc_tipoMedidaCautelar.getCodDominioActoJuridico());
		lmc_medidasCautelaresVo.setIs_nomDominioActoJuridico(atmc_tipoMedidaCautelar.getNomDominioActoJuridico());
		lmc_medidasCautelaresVo.setIs_oficinaOrigen(atmc_tipoMedidaCautelar.getOficinaOrigen());
		lmc_medidasCautelaresVo
				.setIs_comentarioEspecificoAnotacion(atmc_tipoMedidaCautelar.getComentarioEspecificoAnotacion());
		lmc_medidasCautelaresVo.setIs_drr(atmc_tipoMedidaCautelar.getDRR());
		lmc_medidasCautelaresVo
				.setIs_codNaturalezaJuridicaFolio(atmc_tipoMedidaCautelar.getCodNaturalezaJuridicaFolio());
		lmc_medidasCautelaresVo
				.setId_fechaAnotacion(atmc_tipoMedidaCautelar.getFechaAnotacion().toGregorianCalendar().getTime());
		lmc_medidasCautelaresVo.setIli_listaIntervinientes(
				listaTipoAListaIntervinientesVo(atmc_tipoMedidaCautelar.getIntervinientes()));
		lmc_medidasCautelaresVo.setIs_nir(atmc_tipoMedidaCautelar.getNIR());
		lmc_medidasCautelaresVo.setIs_radicacion(atmc_tipoMedidaCautelar.getRadicacion());
		lmc_medidasCautelaresVo.setIs_estadoAnotacion(atmc_tipoMedidaCautelar.getEstadoAnotacion());
		lmc_medidasCautelaresVo.setIs_valorActo(atmc_tipoMedidaCautelar.getValorActo());

		return lmc_medidasCautelaresVo;
	}

	/**
	 * Metodo que convierte de una lista de ComplexType a una lista de VO ( De una
	 * lista de elementos especificos del esquema de un Servicio Web, a una lista de
	 * Objetos de valores de Servicio).<br>
	 * Se usa para convertir una lista de objetos con un resultado/salida de una
	 * peticion de Servicio SOAP, en una lista de objetos de datos llamados VOs;
	 * para ser retornado como resultado a la aplicacion o capa de negocio que
	 * consume el cliente de servicios. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoMedidaCautelar <b>a</b>
	 * MedidasCautelaresVO, <br>
	 * En otras palabras, <b>de</b> Tipo medida cautelar (ComplexType relacionado a
	 * la representacion XML del servicio) <b>a</b> Medidas cautelares objeto con
	 * valores de servicio.
	 *
	 * @param altmc_tipoMedidaCautelar el parametro que representa la lista de
	 *                                 complex types a convertir.
	 * @return Resultado para la conversion de lista de complex types a lista de
	 *         objetos con valores de servicio, en este caso como lista de
	 *         MedidasCautelaresVO.
	 */
	public static List<MedidasCautelaresVO> listaTipoAListaMedidasCautelaresVo(
			List<TipoMedidaCautelar> altmc_tipoMedidaCautelar) {
		List<MedidasCautelaresVO> llmc_listaMedidasCautelaresVo = new ArrayList<>();
		for (TipoMedidaCautelar atmc_tipoMedidaCautelar : altmc_tipoMedidaCautelar) {
			llmc_listaMedidasCautelaresVo.add(tipoAMedidasCautelaresVo(atmc_tipoMedidaCautelar));
		}
		return llmc_listaMedidasCautelaresVo;
	}
}
/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ConsultaEstadoJuridicoPredioBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl
 * Nombre del elemento: ConsultaEstadoJuridicoPredioBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IConsultaEstadoJuridicoPredioBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.AnotacionEstadoJuridicoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CatalogoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.EstadoJuridicoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.IntervinientesEstadoJuridicoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.MatriculaDerivadaEJDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.MatriculaMatrizDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.MedidadCautelaresEJDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.PropietarioDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IEstadoJuridicoFolio;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.AnotacionesCanceladasWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.AnotacionesWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.IntervinientesWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.MatriculasDerivadasWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.MatriculasMatrizWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.MedidasCautelaresWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.PropietariosWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultaJuridicaFolioWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultaEstadoJuridicoFolioWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumGeneroNoc;

/**
 * Clase tipo EJB (Enterprise Java Bean) de la capa de negocio. <br>
 * Contiene la implementacion logica de las operaciones del recurso Consulta
 * estado juridico predio. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless(name = "ConsultaEstadoJuridicoPredioBusiness", mappedName = "ConsultaEstadoJuridicoPredioBusiness")
@LocalBean
public class ConsultaEstadoJuridicoPredioBusiness implements IConsultaEstadoJuridicoPredioBusiness{

	/**
	 * Atributo de instancia tipo IEstadoJuridicoFolio para definir la propiedad
	 * estado juridico folio.
	 */
	@EJB
	private IEstadoJuridicoFolio iiejf_estadoJuridicoFolio;

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IConsultaEstadoJuridicoPredioBusiness#consultarEstadoJuridicoPredios(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CatalogoDTO, java.lang.String)
	 */
	@Override
	public EstadoJuridicoDTO consultarEstadoJuridicoPredios(
			CatalogoDTO ac_catalogoTipoIdentificacionPredio, String as_identificacionPredio) {

		//TODO Revisar convenio
		//UsuarioSesionDTO lus_usuarioSesionDto;
		//lus_usuarioSesionDto = UtilidadAutoridadUsuario.consultarUsuarioSesion();
		TipoEntradaConsultaJuridicaFolioWSDTO ltecjf_tipoEntradaConsultaJuridicaFolioWsDto =  new TipoEntradaConsultaJuridicaFolioWSDTO();
		ltecjf_tipoEntradaConsultaJuridicaFolioWsDto.setIs_convenio("stringstringstringstringstringstringstringstringstringstringstringstringstringstringstringstringstringstringstringstringstringstringstringstringstringstringstringstringstringstringstringstringstringstringstringstringstringstringstringstringstringstringstri");
		ltecjf_tipoEntradaConsultaJuridicaFolioWsDto.setIs_numIdentificacionPredio(as_identificacionPredio);
		ltecjf_tipoEntradaConsultaJuridicaFolioWsDto.setIs_tipoIdentificacionPredio(ac_catalogoTipoIdentificacionPredio.getIs_nombre());
		TipoSalidaConsultaEstadoJuridicoFolioWSDTO ltscejf_tipoSalidaConsultaEstadoJuridicaFolicoWsDto = iiejf_estadoJuridicoFolio.consultarEstadoJuridicoFolio(ltecjf_tipoEntradaConsultaJuridicaFolioWsDto);

		EstadoJuridicoDTO lej_estadoJuridicoDto = new EstadoJuridicoDTO();
		lej_estadoJuridicoDto.setIlaej_anotacionesDto(cargarAnotaciones(ltscejf_tipoSalidaConsultaEstadoJuridicaFolicoWsDto.getIla_listaAnotaciones()));
		lej_estadoJuridicoDto.setIlmc_medidasCautelaresDto(cargarMedidasCautelares(ltscejf_tipoSalidaConsultaEstadoJuridicaFolicoWsDto.getIlmc_listaMedidasCautelares()));
		lej_estadoJuridicoDto.setIlmd_matriculasDerivadasDto(cargarMatriculasDerivadas(ltscejf_tipoSalidaConsultaEstadoJuridicaFolicoWsDto.getIlmd_listaMatriculasDerivadas()));
		lej_estadoJuridicoDto.setIlmm_matriculasMatrizDto(cargarMatriculasMatriz(ltscejf_tipoSalidaConsultaEstadoJuridicaFolicoWsDto.getIlmm_listaMatriculasMatriz()));
		lej_estadoJuridicoDto.setIlp_propietarios(cargarPropietarios(ltscejf_tipoSalidaConsultaEstadoJuridicaFolicoWsDto.getIlp_listaPropietarios()));


		lej_estadoJuridicoDto.setId_fechaHoraConsulta(ltscejf_tipoSalidaConsultaEstadoJuridicaFolicoWsDto.getId_fechaHoraConsulta());
		lej_estadoJuridicoDto.setIs_codCirculoRegistral(ltscejf_tipoSalidaConsultaEstadoJuridicaFolicoWsDto.getIs_codCirculoRegistral());
		lej_estadoJuridicoDto.setIs_codDepartamento(ltscejf_tipoSalidaConsultaEstadoJuridicaFolicoWsDto.getIs_codDepartamento());
		lej_estadoJuridicoDto.setIs_estadoNupre(ltscejf_tipoSalidaConsultaEstadoJuridicaFolicoWsDto.getIs_estadoNUPRE());
		lej_estadoJuridicoDto.setIs_direccionPredio(ltscejf_tipoSalidaConsultaEstadoJuridicaFolicoWsDto.getIs_direccionPredio());
		lej_estadoJuridicoDto.setIs_codMunicipio(ltscejf_tipoSalidaConsultaEstadoJuridicaFolicoWsDto.getIs_codMunicipio());
		lej_estadoJuridicoDto.setIs_nomCirculoRegistral(ltscejf_tipoSalidaConsultaEstadoJuridicaFolicoWsDto.getIs_nomCirculoRegistral());
		lej_estadoJuridicoDto.setIs_nomDepartamento(ltscejf_tipoSalidaConsultaEstadoJuridicaFolicoWsDto.getIs_nomDepartamento());
		lej_estadoJuridicoDto.setIs_nomMunicipio(ltscejf_tipoSalidaConsultaEstadoJuridicaFolicoWsDto.getIs_nomMunicipio());
		lej_estadoJuridicoDto.setIl_numeroConsulta(ltscejf_tipoSalidaConsultaEstadoJuridicaFolicoWsDto.getIl_numeroConsulta());
		lej_estadoJuridicoDto.setIs_numMatriculaInmobiliaria(ltscejf_tipoSalidaConsultaEstadoJuridicaFolicoWsDto.getIs_numMatriculaInmobiliaria());
		lej_estadoJuridicoDto.setIs_numPredial(ltscejf_tipoSalidaConsultaEstadoJuridicaFolicoWsDto.getIs_numPredial());
		lej_estadoJuridicoDto.setIs_numPredialAnterior(ltscejf_tipoSalidaConsultaEstadoJuridicaFolicoWsDto.getIs_numPredialAnterior());
		lej_estadoJuridicoDto.setIs_nupre(ltscejf_tipoSalidaConsultaEstadoJuridicaFolicoWsDto.getIs_nupre());
		return lej_estadoJuridicoDto;
	}

	/**
	 * Metodo que se encarga de cargar los propietarios que vienen del servicio.
	 *
	 * @param alp_listaPropietariosWsDto el parametro lista propietarios ws dto
	 * @return Resultado para cargar propietarios retornado como una lista de
	 *         PropietarioDTO
	 */
	private List<PropietarioDTO> cargarPropietarios(List<PropietariosWSDTO> alp_listaPropietariosWsDto) {
		List<PropietarioDTO> llp_listaPropietario = new ArrayList<>();
		for(PropietariosWSDTO lp_propietarioWsDto: alp_listaPropietariosWsDto) {
			PropietarioDTO lp_propietarioDto = new PropietarioDTO();
			lp_propietarioDto.setIs_numDocumentoPersona(lp_propietarioWsDto.getIs_numDocumentoPersona());
			lp_propietarioDto.setIs_numNIT(lp_propietarioWsDto.getIs_numNIT());
			lp_propietarioDto.setIs_porcentajeParticipacion(lp_propietarioWsDto.getIs_porcentajeParticipacion());
			lp_propietarioDto.setIs_primerApellido(lp_propietarioWsDto.getIs_primerApellido());
			lp_propietarioDto.setIs_primerNombre(lp_propietarioWsDto.getIs_primerNombre());
			lp_propietarioDto.setIs_segundoApellido(lp_propietarioWsDto.getIs_segundoApellido());
			lp_propietarioDto.setIs_segundoNombre(lp_propietarioWsDto.getIs_segundoNombre());
			lp_propietarioDto.setIs_tipoDocumentoDto(lp_propietarioWsDto.getIs_razonSocial());
			EnumGeneroNoc legn_enumGeneroNoc = EnumGeneroNoc.buscarPorCodigo(lp_propietarioWsDto.getIs_codGenero());
			if(legn_enumGeneroNoc != null)
				lp_propietarioDto.setIs_codGenero(legn_enumGeneroNoc.getIs_nombreLegible());
			lp_propietarioDto.setIs_tipoPersona(lp_propietarioWsDto.getIs_tipoPersona());
			llp_listaPropietario.add(lp_propietarioDto);
		}
		return llp_listaPropietario;
	}

	/**
	 * Metodo que se encarga de llenar la matriculas matriz del servicio.
	 *
	 * @param almm_listaMatriculaMatrizWsDto el parametro lista matricula matriz ws
	 *                                       dto
	 * @return Resultado para cargar matriculas matriz retornado como una lista de
	 *         MatriculaMatrizDTO
	 */
	private List<MatriculaMatrizDTO> cargarMatriculasMatriz(List<MatriculasMatrizWSDTO> almm_listaMatriculaMatrizWsDto) {
		List<MatriculaMatrizDTO> llmm_listaMatriculaMatrizDto = new ArrayList<>();
		for(MatriculasMatrizWSDTO lmm_matriculasMatrizWsDto: almm_listaMatriculaMatrizWsDto) {
			MatriculaMatrizDTO lmm_matriculaMatrizDto = new MatriculaMatrizDTO();
			lmm_matriculaMatrizDto.setIs_codCirculoRegistral(lmm_matriculasMatrizWsDto.getIs_codCirculoRegistral());
			lmm_matriculaMatrizDto.setIs_numMatriculaInmobiliaria(lmm_matriculasMatrizWsDto.getIs_numMatriculaInmobiliaria());
			llmm_listaMatriculaMatrizDto.add(lmm_matriculaMatrizDto);
		}
		return llmm_listaMatriculaMatrizDto;
	}

	/**
	 * Metodo que se encarga de llenar la matriculas derivadas del servicio.
	 *
	 * @param almd_listaMatriculasDerivadasWsDto el parametro lista matriculas
	 *                                           derivadas ws dto
	 * @return Resultado para cargar matriculas derivadas retornado como una lista
	 *         de MatriculaDerivadaEJDTO
	 */
	private List<MatriculaDerivadaEJDTO> cargarMatriculasDerivadas(List<MatriculasDerivadasWSDTO> almd_listaMatriculasDerivadasWsDto) {
		List<MatriculaDerivadaEJDTO> llmd_listaMatriculaDerivadaDto = new ArrayList<>();
		for(MatriculasDerivadasWSDTO lmd_matriculasDerivadasWsDto: almd_listaMatriculasDerivadasWsDto) {
			MatriculaDerivadaEJDTO lmd_matriculaDerivadaDto = new MatriculaDerivadaEJDTO();
			lmd_matriculaDerivadaDto.setIs_anotacionRelacionada(lmd_matriculasDerivadasWsDto.getIs_anotacionRelacionada());
			lmd_matriculaDerivadaDto.setIs_codCirculoRegistral(lmd_matriculasDerivadasWsDto.getIs_codCirculoRegistral());
			lmd_matriculaDerivadaDto.setIs_direccionPredial(lmd_matriculasDerivadasWsDto.getIs_direccionPredio());
			lmd_matriculaDerivadaDto.setIs_nir(lmd_matriculasDerivadasWsDto.getIs_nir());
			lmd_matriculaDerivadaDto.setIs_numMatriculaInmobiliaria(lmd_matriculasDerivadasWsDto.getIs_numMatriculaInmobiliaria());
			lmd_matriculaDerivadaDto.setIs_radicacion(lmd_matriculasDerivadasWsDto.getIs_radicacion());
			llmd_listaMatriculaDerivadaDto.add(lmd_matriculaDerivadaDto);
		}
		return llmd_listaMatriculaDerivadaDto;
	}

	/**
	 * Metodo que se encarga de llenar la medidas cautelares del servicio.
	 *
	 * @param almc_listaMedidasCautelaresWsDto el parametro lista medidas cautelares
	 *                                         ws dto
	 * @return Resultado para cargar medidas cautelares retornado como una lista de
	 *         MedidadCautelaresEJDTO
	 */
	private List<MedidadCautelaresEJDTO> cargarMedidasCautelares(List<MedidasCautelaresWSDTO> almc_listaMedidasCautelaresWsDto) {
		List<MedidadCautelaresEJDTO> llmc_listaMedidasCautelaresDto = new ArrayList<>();
		for(MedidasCautelaresWSDTO lmc_medidasCautelaresWsDto :almc_listaMedidasCautelaresWsDto) {
			MedidadCautelaresEJDTO lmc_medidadCautelares = new MedidadCautelaresEJDTO();
			lmc_medidadCautelares.setId_fechaAnotacion(lmc_medidasCautelaresWsDto.getId_fechaAnotacion());
			lmc_medidadCautelares.setId_fechaDocumento(lmc_medidasCautelaresWsDto.getId_fechaDocumento());
			lmc_medidadCautelares.setIs_codDominioActoJuridico(lmc_medidasCautelaresWsDto.getIs_codDominioActoJuridico());
			lmc_medidadCautelares.setIs_codNaturalezaJuridicaFolio(lmc_medidasCautelaresWsDto.getIs_codNaturalezaJuridicaFolio());
			lmc_medidadCautelares.setIs_codTipoDocumentoPublico(lmc_medidasCautelaresWsDto.getIs_codTipoDocumentoPublico());
			lmc_medidadCautelares.setIs_comentario(lmc_medidasCautelaresWsDto.getIs_comentario());
			lmc_medidadCautelares.setIs_comentarioEspecificoAnotacion(lmc_medidasCautelaresWsDto.getIs_comentarioEspecificoAnotacion());
			lmc_medidadCautelares.setIs_drr(lmc_medidasCautelaresWsDto.getIs_drr());
			lmc_medidadCautelares.setIs_estadoAnotacion(lmc_medidasCautelaresWsDto.getIs_estadoAnotacion());
			lmc_medidadCautelares.setIs_nir(lmc_medidasCautelaresWsDto.getIs_nir());
			lmc_medidadCautelares.setIs_nomDocumentoPublico(lmc_medidasCautelaresWsDto.getIs_nomDocumentoPublico());
			lmc_medidadCautelares.setIs_nomDominioActoJuridico(lmc_medidasCautelaresWsDto.getIs_nomDominioActoJuridico());
			lmc_medidadCautelares.setIbi_numAnotacion(lmc_medidasCautelaresWsDto.getIbi_numAnotacion());
			lmc_medidadCautelares.setIs_oficinaOrigen(lmc_medidasCautelaresWsDto.getIs_oficinaOrigen());
			lmc_medidadCautelares.setIs_radicacion(lmc_medidasCautelaresWsDto.getIs_radicacion());
			lmc_medidadCautelares.setIs_valorActo(lmc_medidasCautelaresWsDto.getIs_valorActo());
			lmc_medidadCautelares.setIliej_intervinientes(cargarListaIntervinientes(lmc_medidasCautelaresWsDto.getIli_listaIntervinientes()));
			lmc_medidadCautelares.setIls_anotacionesCautelares(cargarAnotacionesCanceladas(lmc_medidasCautelaresWsDto.getIlac_listaAnotacionesCanceladas()));
			llmc_listaMedidasCautelaresDto.add(lmc_medidadCautelares);
		}
		return llmc_listaMedidasCautelaresDto;
	}

	/**
	 * Metodo que se encarga de llenar la lista de intervinientes.
	 *
	 * @param ali_listaIntervientesWsDto el parametro lista intervientes ws dto
	 * @return Resultado para cargar lista intervinientes retornado como una lista
	 *         de IntervinientesEstadoJuridicoDTO
	 */
	private List<IntervinientesEstadoJuridicoDTO> cargarListaIntervinientes(List<IntervinientesWSDTO> ali_listaIntervientesWsDto) {
		List<IntervinientesEstadoJuridicoDTO> lliej_intervinientesDto = new ArrayList<>();
		for(IntervinientesWSDTO li_intervinienteWsDto :ali_listaIntervientesWsDto) {
			IntervinientesEstadoJuridicoDTO liej_intervinientes = new IntervinientesEstadoJuridicoDTO();
			EnumGeneroNoc legn_enumGeneroNoc = EnumGeneroNoc.buscarPorCodigo(li_intervinienteWsDto.getIs_codGenero());
			if(legn_enumGeneroNoc != null)
				liej_intervinientes.setIs_codGenero(legn_enumGeneroNoc.getIs_nombreLegible());
			liej_intervinientes.setIs_esPropietario(li_intervinienteWsDto.getIs_esPropietario());
			liej_intervinientes.setIs_numDocumentoPersona(li_intervinienteWsDto.getIs_numDocumentoPersona());
			liej_intervinientes.setIs_numNit(li_intervinienteWsDto.getIs_numNIT());
			liej_intervinientes.setIs_porcentajeParticipacion(li_intervinienteWsDto.getIs_porcentajeParticipacion());
			liej_intervinientes.setIs_razonSocial(li_intervinienteWsDto.getIs_razonSocial());
			liej_intervinientes.setIs_rolInterviniente(li_intervinienteWsDto.getIs_rolInterviniente());
			liej_intervinientes.setIs_tipoDocumentoPersona(li_intervinienteWsDto.getIs_tipoDocumentoPersona());
			liej_intervinientes.setIs_tipoPersona(li_intervinienteWsDto.getIs_tipoPersona());
			liej_intervinientes.setIs_primerApellido(li_intervinienteWsDto.getIs_primerApellido());
			liej_intervinientes.setIs_primerNombre(li_intervinienteWsDto.getIs_primerNombre());
			liej_intervinientes.setIs_segundoApellido(li_intervinienteWsDto.getIs_segundoApellido());
			liej_intervinientes.setIs_segundoNombre(li_intervinienteWsDto.getIs_segundoNombre());
			lliej_intervinientesDto.add(liej_intervinientes);
		}
		return lliej_intervinientesDto;
	}

	/**
	 * Metodo que se encarga de llenar la anotaciones.
	 *
	 * @param ala_listaAnotacionesWsDto el parametro lista anotaciones ws dto
	 * @return Resultado para cargar anotaciones retornado como una lista de
	 *         AnotacionEstadoJuridicoDTO
	 */
	private List<AnotacionEstadoJuridicoDTO> cargarAnotaciones(List<AnotacionesWSDTO> ala_listaAnotacionesWsDto) {
		List<AnotacionEstadoJuridicoDTO> llaej_listaAnotacionEstadoJuridico = new ArrayList<>();
		for(AnotacionesWSDTO la_anotacionesWsDto: ala_listaAnotacionesWsDto) {
			AnotacionEstadoJuridicoDTO laej_anotacionEstadoJuridico = new AnotacionEstadoJuridicoDTO();
			laej_anotacionEstadoJuridico.setId_fechaAnotacion(la_anotacionesWsDto.getId_fechaAnotacion());
			laej_anotacionEstadoJuridico.setId_fechaDocumento(la_anotacionesWsDto.getId_fechaDocumento());
			laej_anotacionEstadoJuridico.setIliej_intervinientesDto(cargarListaIntervinientes(la_anotacionesWsDto.getIli_listaIntervinientes()));
			laej_anotacionEstadoJuridico.setIls_anotacionesCanceladas(cargarAnotacionesCanceladas(la_anotacionesWsDto.getIlac_listaAnotacionesCanceladas()));
			laej_anotacionEstadoJuridico.setIs_codDominioActoJuridico(la_anotacionesWsDto.getIs_codDominioActoJuridico());
			laej_anotacionEstadoJuridico.setIs_codNaturalezaJuridicaFolio(la_anotacionesWsDto.getIs_codNaturalezaJuridicaFolio());
			laej_anotacionEstadoJuridico.setIs_codTipoDocumentoPublico(la_anotacionesWsDto.getIs_codTipoDocumentoPublico());
			laej_anotacionEstadoJuridico.setIs_comentario(la_anotacionesWsDto.getIs_comentario());
			laej_anotacionEstadoJuridico.setIs_comentarioEspecificoAnotacion(la_anotacionesWsDto.getIs_comentarioEspecificoAnotacion());
			laej_anotacionEstadoJuridico.setIs_drr(la_anotacionesWsDto.getIs_drr());
			laej_anotacionEstadoJuridico.setIs_estadoAnotacion(la_anotacionesWsDto.getIs_estadoAnotacion());
			laej_anotacionEstadoJuridico.setIs_nir(la_anotacionesWsDto.getIs_nir());
			laej_anotacionEstadoJuridico.setIs_nomDocumentoPublico(la_anotacionesWsDto.getIs_nomDocumentoPublico());
			laej_anotacionEstadoJuridico.setIs_nomDominioActoJuridico(la_anotacionesWsDto.getIs_nomDominioActoJuridico());
			laej_anotacionEstadoJuridico.setIbi_numAnotacion(la_anotacionesWsDto.getIbi_numAnotacion());
			laej_anotacionEstadoJuridico.setIs_oficinaOrigen(la_anotacionesWsDto.getIs_oficinaOrigen());
			laej_anotacionEstadoJuridico.setIs_radicacion(la_anotacionesWsDto.getIs_radicacion());
			laej_anotacionEstadoJuridico.setIs_valorActo(la_anotacionesWsDto.getIs_valorActo());
			llaej_listaAnotacionEstadoJuridico.add(laej_anotacionEstadoJuridico);
		}
		return llaej_listaAnotacionEstadoJuridico;
	}

	/**
	 * Metodo que se encarga de llenar las anotaciones.
	 *
	 * @param alac_listaAnotacionesCanceladas el parametro lista anotaciones
	 *                                        canceladas
	 * @return Resultado para cargar anotaciones canceladas retornado como una lista
	 *         de String
	 */
	private List<String> cargarAnotacionesCanceladas(List<AnotacionesCanceladasWSDTO> alac_listaAnotacionesCanceladas) {
		List<String> lls_listaAnotacionesCanceladas = new ArrayList<>();
		for(AnotacionesCanceladasWSDTO lac_anotacionesCanceladasWsDto: alac_listaAnotacionesCanceladas) {
			lls_listaAnotacionesCanceladas.add(lac_anotacionesCanceladasWsDto.getIs_anotacionCancelada());
		}
		return lls_listaAnotacionesCanceladas;
	}

}

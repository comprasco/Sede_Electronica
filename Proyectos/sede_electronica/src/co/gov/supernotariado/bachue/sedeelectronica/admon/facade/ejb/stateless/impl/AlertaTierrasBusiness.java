/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: AlertaTierrasBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl
 * Nombre del elemento: AlertaTierrasBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl;

import java.util.Date;
import java.util.List;
import java.util.Objects;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import co.gov.supernotariado.bachue.sedeelectronica.admon.exception.ExcepcionesDatosEntrada;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IAlertaTierrasBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.AlertaTierrasAntiguoSistemaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.BandejaAlertaTierraDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.BusquedaDatosCatastralesDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.BusquedaDatosPredioDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CargaDocumentosFormularioDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CargueAlertaTierrasDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CirculoRegistralDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.InactivarAlertaEntradaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.MatriculaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TablaBandejaAlertasTierrasDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TablaMatriculaAlertaTierrasDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UbicacionDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioSesionDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters.MatriculaAlertaTierrasWsDtoConverter;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IAlertaTierrasWSBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.EntradaConsultarEntidadesJAWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaActivarAlertaTierrasWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaAgregarListaMatriculasAlertaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaAgregarMatriculaAlertaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaCancelarIngresoAlertaTierrasWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarAlertasWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarDetalleAlertaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarDocumentoAlertaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarListaMatriculasWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarMapaPredioInfoCatastralWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarMatriculaFiltrosTierrasWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarMatriculaInfoCatastralWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarMatriculaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarOficinasOrigenTipoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaCrearProcAntiguoSistemaTierrasWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaEliminarProcAntiguoSistemaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaInactivarAlertaTierrasWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaInscribirAlertaCabeceraWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaListarProcAntiguoSistemaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaRechazarCorreccionAlertaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaRemoverMatriculaAlertaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaActivarAlertaTierrasWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaAgregarListaMatriculasAlertaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaAgregarMatriculaAlertaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaCancelarIngresoAlertaTierrasWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarAlertasWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarDetalleAlertaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarDocumentoAlertaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarEntidadesJAWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarListaMatriculasWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarMapaPredioInfoCatastralWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarMatriculaFiltrosTierrasWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarMatriculaInfoCatastralWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarMatriculaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarOficinasOrigenTipoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaCrearProcAntiguoSistemaTierrasWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaEliminarProcAntiguoSistemaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaEnviarDocumentoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaInactivarAlertaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaInscribirAlertaCabeceraWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaListarProcAntiguoSistemaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaRechazarCorreccionAlertaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaRemoverMatriculaAlertaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones.EnumExcepcionesGenerales;


/**
 * Clase tipo EJB (Enterprise Java Bean) de la capa de negocio. <br>
 * Contiene la implementacion logica de las operaciones del recurso Alerta
 * tierras. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless(name = "AlertaTierrasBusiness", mappedName = "AlertaTierrasBusiness")
@LocalBean
public class AlertaTierrasBusiness implements IAlertaTierrasBusiness {

	/**
	 * Atributo de instancia tipo IAlertaTierrasWSBusiness para definir la propiedad
	 * alerta tierra ws business.
	 */
	@EJB
	private IAlertaTierrasWSBusiness iiat_alertaTierraWsBusiness;
	
	/**
	 * Define la constante CS_INFO.
	 */
	private static final String CS_INFO = "111";
	
	/**
	 * Define la constante CS_INFO_ENTIDAD.
	 */
	private static final int CS_INFO_ENTIDAD = 12;

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IAlertaTierrasBusiness#consultarEntidadesJA()
	 */
	@Override
	public TipoSalidaConsultarEntidadesJAWSDTO consultarEntidadesJA() {
		EntradaConsultarEntidadesJAWSDTO lece_entradaConsultarEntidadesJAWsDto = new EntradaConsultarEntidadesJAWSDTO();

		TipoSalidaConsultarEntidadesJAWSDTO ltsce_tipoSalidaConsultarEntidadesJAWsDto = new TipoSalidaConsultarEntidadesJAWSDTO();
		try {
			ltsce_tipoSalidaConsultarEntidadesJAWsDto = iiat_alertaTierraWsBusiness.consultarEntidadesJA(lece_entradaConsultarEntidadesJAWsDto);
		} catch (Exception ae_excepcion) {
			throw new ExcepcionesDatosEntrada(EnumExcepcionesGenerales.ERROR_TECNICO, ae_excepcion);
		}
		return ltsce_tipoSalidaConsultarEntidadesJAWsDto;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IAlertaTierrasBusiness#consultarTiposOficinaOrigen()
	 */
	@Override
	public TipoSalidaConsultarOficinasOrigenTipoWSDTO consultarTiposOficinaOrigen() {
		TipoEntradaConsultarOficinasOrigenTipoWSDTO ltecoot_tipoEntradaConsultarOficinasOrigenTipoWsDto = new TipoEntradaConsultarOficinasOrigenTipoWSDTO();
		ltecoot_tipoEntradaConsultarOficinasOrigenTipoWsDto.setIs_codigoOficinaOrigen(CS_INFO);
		ltecoot_tipoEntradaConsultarOficinasOrigenTipoWsDto.setIs_tipoOficinaOrigen(CS_INFO);

		TipoSalidaConsultarOficinasOrigenTipoWSDTO ltscoot_tipoSalidaConsultarOficinasOrigenTipoWsDto = new TipoSalidaConsultarOficinasOrigenTipoWSDTO();
		try {
			ltscoot_tipoSalidaConsultarOficinasOrigenTipoWsDto = iiat_alertaTierraWsBusiness.consultarOficinasOrigenTipo(ltecoot_tipoEntradaConsultarOficinasOrigenTipoWsDto);
		} catch (Exception ae_excepcion) {
			throw new ExcepcionesDatosEntrada(EnumExcepcionesGenerales.ERROR_TECNICO, ae_excepcion);
		}
		return ltscoot_tipoSalidaConsultarOficinasOrigenTipoWsDto;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IAlertaTierrasBusiness#consultarDocumentoAlerta(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CargueAlertaTierrasDTO)
	 */
	@Override
	public TipoSalidaConsultarDocumentoAlertaWSDTO consultarDocumentoAlerta(
			CargueAlertaTierrasDTO acat_cargueAlertaTierrasDto) {
		TipoEntradaConsultarDocumentoAlertaWSDTO ltecda_tipoEntradaConsultarDocumentoAlertaWsDto = new TipoEntradaConsultarDocumentoAlertaWSDTO();
		ltecda_tipoEntradaConsultarDocumentoAlertaWsDto
				.setId_fechaDocumento(acat_cargueAlertaTierrasDto.getId_fechaDocumento());
		ltecda_tipoEntradaConsultarDocumentoAlertaWsDto
				.setIs_codTipoDocumentoPublico(acat_cargueAlertaTierrasDto.getIs_tipoDocumentoAlerta());
		ltecda_tipoEntradaConsultarDocumentoAlertaWsDto
				.setIs_docNumero(acat_cargueAlertaTierrasDto.getIs_numeroDocumentoAlerta());
		ltecda_tipoEntradaConsultarDocumentoAlertaWsDto
				.setIs_oficinaOrigen(acat_cargueAlertaTierrasDto.getIs_nombreOficinaOrigen());


		TipoSalidaConsultarDocumentoAlertaWSDTO ltscda_tipoSalidaConsultarDocumentoAlertaWsDto = new TipoSalidaConsultarDocumentoAlertaWSDTO();
		try {
			ltscda_tipoSalidaConsultarDocumentoAlertaWsDto = iiat_alertaTierraWsBusiness.consultarDocumentoAlerta(ltecda_tipoEntradaConsultarDocumentoAlertaWsDto);
		} catch (Exception ae_excepcion) {
			throw new ExcepcionesDatosEntrada(EnumExcepcionesGenerales.ERROR_TECNICO, ae_excepcion);
		}
		return ltscda_tipoSalidaConsultarDocumentoAlertaWsDto;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IAlertaTierrasBusiness#inscribirAlertaCabecera(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CargueAlertaTierrasDTO, co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaEnviarDocumentoWSDTO)
	 */
	@Override
	public TipoSalidaInscribirAlertaCabeceraWSDTO inscribirAlertaCabecera(
			CargueAlertaTierrasDTO acat_cargueAlertaTierrasDto,
			TipoSalidaEnviarDocumentoWSDTO atsed_tipoSalidaEnviarDocumentoWsDto) {
		TipoEntradaInscribirAlertaCabeceraWSDTO lteiac_tipoEntradaInscribirAlertaCabeceraWsDto = new TipoEntradaInscribirAlertaCabeceraWSDTO();
		lteiac_tipoEntradaInscribirAlertaCabeceraWsDto
				.setId_fechaDocumento(acat_cargueAlertaTierrasDto.getId_fechaDocumento());
		lteiac_tipoEntradaInscribirAlertaCabeceraWsDto
				.setId_procesoFechaRadicado(acat_cargueAlertaTierrasDto.getId_fechaProceso());
		lteiac_tipoEntradaInscribirAlertaCabeceraWsDto.setIi_idEntidad(CS_INFO_ENTIDAD);
		lteiac_tipoEntradaInscribirAlertaCabeceraWsDto
				.setIs_codTipoDocumentoPublico(acat_cargueAlertaTierrasDto.getIs_tipoDocumentoAlerta());
		lteiac_tipoEntradaInscribirAlertaCabeceraWsDto
				.setIs_oficinaOrigen(acat_cargueAlertaTierrasDto.getIs_nombreOficinaOrigen());
		lteiac_tipoEntradaInscribirAlertaCabeceraWsDto
				.setIs_procesoNroRadicado(acat_cargueAlertaTierrasDto.getIs_numeroRadicadoProceso());
		lteiac_tipoEntradaInscribirAlertaCabeceraWsDto.setIs_tipoAlerta(acat_cargueAlertaTierrasDto.getIs_tipoAlerta());
		lteiac_tipoEntradaInscribirAlertaCabeceraWsDto.setIs_docIdSGD(atsed_tipoSalidaEnviarDocumentoWsDto.getIs_dId());
		lteiac_tipoEntradaInscribirAlertaCabeceraWsDto
				.setIs_docNameSGD(atsed_tipoSalidaEnviarDocumentoWsDto.getIs_docName());
		lteiac_tipoEntradaInscribirAlertaCabeceraWsDto
				.setIs_docNumero(acat_cargueAlertaTierrasDto.getIs_numeroDocumentoAlerta());


		TipoSalidaInscribirAlertaCabeceraWSDTO ltsiac_tipoSalidaInscribirAlertaCabeceraWsDto = new TipoSalidaInscribirAlertaCabeceraWSDTO();
		try {
			ltsiac_tipoSalidaInscribirAlertaCabeceraWsDto = iiat_alertaTierraWsBusiness.inscribirAlertaCabecera(lteiac_tipoEntradaInscribirAlertaCabeceraWsDto);
		} catch (Exception ae_excepcion) {
			throw new ExcepcionesDatosEntrada(EnumExcepcionesGenerales.ERROR_TECNICO, ae_excepcion);
		}
		return ltsiac_tipoSalidaInscribirAlertaCabeceraWsDto;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IAlertaTierrasBusiness#cancelarIngresoAlertaTierras(co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaInscribirAlertaCabeceraWSDTO)
	 */
	@Override
	public TipoSalidaCancelarIngresoAlertaTierrasWSDTO cancelarIngresoAlertaTierras(
			TipoSalidaInscribirAlertaCabeceraWSDTO atsiac_tipoSalidaInscribirAlertaCabeceraWsDto) {
		TipoEntradaCancelarIngresoAlertaTierrasWSDTO lteciat_tipoEntradaCancelarIngresoAlertaTierrasWsDto = new TipoEntradaCancelarIngresoAlertaTierrasWSDTO();
		lteciat_tipoEntradaCancelarIngresoAlertaTierrasWsDto
				.setIi_idAlerta(atsiac_tipoSalidaInscribirAlertaCabeceraWsDto.getIi_idAlerta());


		TipoSalidaCancelarIngresoAlertaTierrasWSDTO lsciat_tipoSalidaCancelarIngresoAlertaTierrasWsDto = new TipoSalidaCancelarIngresoAlertaTierrasWSDTO();
		try {
			lsciat_tipoSalidaCancelarIngresoAlertaTierrasWsDto = iiat_alertaTierraWsBusiness.cancelarIngresoAlertaTierras(lteciat_tipoEntradaCancelarIngresoAlertaTierrasWsDto);
		} catch (Exception ae_excepcion) {
			throw new ExcepcionesDatosEntrada(EnumExcepcionesGenerales.ERROR_TECNICO, ae_excepcion);
		}
		return lsciat_tipoSalidaCancelarIngresoAlertaTierrasWsDto;

	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IAlertaTierrasBusiness#consultarMatricula(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CirculoRegistralDTO, int)
	 */
	@Override
	public TipoSalidaConsultarMatriculaWSDTO consultarMatricula(CirculoRegistralDTO acr_circuloRegistralSeleccionadoDto,
			int ai_numeroMatricula) {
		TipoEntradaConsultarMatriculaWSDTO ltecm_tipoEntradaConsultarMatriculaWsDto = new TipoEntradaConsultarMatriculaWSDTO();
		ltecm_tipoEntradaConsultarMatriculaWsDto
				.setIs_codCirculoRegistral(acr_circuloRegistralSeleccionadoDto.getIs_nombre());
		ltecm_tipoEntradaConsultarMatriculaWsDto.setIi_numMatriculaInmobiliaria(ai_numeroMatricula);


		TipoSalidaConsultarMatriculaWSDTO ltscm_tipoSalidaConsultarMatriculaWsDto = new TipoSalidaConsultarMatriculaWSDTO();
		try {
			ltscm_tipoSalidaConsultarMatriculaWsDto = iiat_alertaTierraWsBusiness.consultarMatricula(ltecm_tipoEntradaConsultarMatriculaWsDto);
		} catch (Exception ae_excepcion) {
			throw new ExcepcionesDatosEntrada(EnumExcepcionesGenerales.ERROR_TECNICO, ae_excepcion);
		}
		return ltscm_tipoSalidaConsultarMatriculaWsDto;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IAlertaTierrasBusiness#consultarMatriculaFiltrosTierras(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UbicacionDTO, co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.BusquedaDatosPredioDTO)
	 */
	@Override
	public TipoSalidaConsultarMatriculaFiltrosTierrasWSDTO consultarMatriculaFiltrosTierras(
			UbicacionDTO au_ubicacionDto, BusquedaDatosPredioDTO abdp_busquedaDatosPredioDto) {
		TipoEntradaConsultarMatriculaFiltrosTierrasWSDTO ltecmft_tipoEntradaConsultarMatriculaFiltrosTierrasWsDto = new TipoEntradaConsultarMatriculaFiltrosTierrasWSDTO();
		ltecmft_tipoEntradaConsultarMatriculaFiltrosTierrasWsDto
				.setIs_idDepartamento(au_ubicacionDto.getId_departamentoSeleccionado().getIs_nombre());
		ltecmft_tipoEntradaConsultarMatriculaFiltrosTierrasWsDto
				.setIs_idMunicipio(au_ubicacionDto.getIm_municipioSeleccionado().getIs_nombre());
		if (au_ubicacionDto.getIv_veredaSeleccionado() == null) {
			ltecmft_tipoEntradaConsultarMatriculaFiltrosTierrasWsDto.setIs_idVereda("");
		} else {
			ltecmft_tipoEntradaConsultarMatriculaFiltrosTierrasWsDto.setIs_idVereda(au_ubicacionDto.getIv_veredaSeleccionado().getIs_nombre());
		}
		ltecmft_tipoEntradaConsultarMatriculaFiltrosTierrasWsDto
				.setIs_nombrePredio(abdp_busquedaDatosPredioDto.getIs_nombrePredio());
		ltecmft_tipoEntradaConsultarMatriculaFiltrosTierrasWsDto
				.setIi_areaPredio(Integer.parseInt(abdp_busquedaDatosPredioDto.getIs_areaPredio()));


		TipoSalidaConsultarMatriculaFiltrosTierrasWSDTO ltscmft_tipoSalidaConsultarMatriculaFiltrosTierrasWsDto = new TipoSalidaConsultarMatriculaFiltrosTierrasWSDTO();
		try {
			ltscmft_tipoSalidaConsultarMatriculaFiltrosTierrasWsDto = iiat_alertaTierraWsBusiness.consultarMatriculaFiltrosTierras(ltecmft_tipoEntradaConsultarMatriculaFiltrosTierrasWsDto);
		} catch (Exception ae_excepcion) {
			throw new ExcepcionesDatosEntrada(EnumExcepcionesGenerales.ERROR_TECNICO, ae_excepcion);
		}
		return ltscmft_tipoSalidaConsultarMatriculaFiltrosTierrasWsDto;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IAlertaTierrasBusiness#consultarMatriculaInfoCatastral(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.BusquedaDatosCatastralesDTO)
	 */
	@Override
	public TipoSalidaConsultarMatriculaInfoCatastralWSDTO consultarMatriculaInfoCatastral(
			BusquedaDatosCatastralesDTO abdc_busquedaDatosCatastralesDto) {
		TipoEntradaConsultarMatriculaInfoCatastralWSDTO ltecmic_tipoEntradaConsultarMatriculaInfoCatastralWsDto = new TipoEntradaConsultarMatriculaInfoCatastralWSDTO();
		ltecmic_tipoEntradaConsultarMatriculaInfoCatastralWsDto
				.setIs_nupre(abdc_busquedaDatosCatastralesDto.getIs_nupre());
		ltecmic_tipoEntradaConsultarMatriculaInfoCatastralWsDto
				.setIi_numPredial(Integer.parseInt(abdc_busquedaDatosCatastralesDto.getIs_cedulaCatastral()));
		ltecmic_tipoEntradaConsultarMatriculaInfoCatastralWsDto
				.setIi_chip(Integer.parseInt(abdc_busquedaDatosCatastralesDto.getIs_chip()));


		TipoSalidaConsultarMatriculaInfoCatastralWSDTO ltscmic_tipoSalidaconsultarMatriculaInfoCatastralWsDto = new TipoSalidaConsultarMatriculaInfoCatastralWSDTO();
		try {
			ltscmic_tipoSalidaconsultarMatriculaInfoCatastralWsDto = iiat_alertaTierraWsBusiness.consultarMatriculaInfoCatastral(ltecmic_tipoEntradaConsultarMatriculaInfoCatastralWsDto);
		} catch (Exception ae_excepcion) {
			throw new ExcepcionesDatosEntrada(EnumExcepcionesGenerales.ERROR_TECNICO, ae_excepcion);
		}
		return ltscmic_tipoSalidaconsultarMatriculaInfoCatastralWsDto;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IAlertaTierrasBusiness#crearProcAntiguoSistemaTierras(co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaInscribirAlertaCabeceraWSDTO, co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.AlertaTierrasAntiguoSistemaDTO)
	 */
	@Override
	public TipoSalidaCrearProcAntiguoSistemaTierrasWSDTO crearProcAntiguoSistemaTierras(
			TipoSalidaInscribirAlertaCabeceraWSDTO atsiac_tipoSalidaInscribirAlertaCabeceraWsDto,
			AlertaTierrasAntiguoSistemaDTO aatas_alertaTerrasAntiguoSistemaDto) {
		TipoEntradaCrearProcAntiguoSistemaTierrasWSDTO ltecpast_tipoEntradaCrearProcAntiguoSistemaTierrasWsDto = new TipoEntradaCrearProcAntiguoSistemaTierrasWSDTO();
		ltecpast_tipoEntradaCrearProcAntiguoSistemaTierrasWsDto
				.setIi_idAlerta(atsiac_tipoSalidaInscribirAlertaCabeceraWsDto.getIi_idAlerta());
		ltecpast_tipoEntradaCrearProcAntiguoSistemaTierrasWsDto
				.setIs_codCirculoRegistral(aatas_alertaTerrasAntiguoSistemaDto.getIs_nomCirculoRegistral());
		ltecpast_tipoEntradaCrearProcAntiguoSistemaTierrasWsDto.setIi_codPais(CS_INFO_ENTIDAD);
		ltecpast_tipoEntradaCrearProcAntiguoSistemaTierrasWsDto.setIi_codDepartamento(CS_INFO_ENTIDAD);
		ltecpast_tipoEntradaCrearProcAntiguoSistemaTierrasWsDto.setIi_codMunicipio(CS_INFO_ENTIDAD);
		ltecpast_tipoEntradaCrearProcAntiguoSistemaTierrasWsDto
				.setIs_tipoPredio(aatas_alertaTerrasAntiguoSistemaDto.getIs_tipoPredio());
		ltecpast_tipoEntradaCrearProcAntiguoSistemaTierrasWsDto
				.setIi_numLibro(aatas_alertaTerrasAntiguoSistemaDto.getIi_numLibro());
		ltecpast_tipoEntradaCrearProcAntiguoSistemaTierrasWsDto
				.setIi_numTomo(aatas_alertaTerrasAntiguoSistemaDto.getIi_numTomo());
		ltecpast_tipoEntradaCrearProcAntiguoSistemaTierrasWsDto
				.setIs_idTipoPartida(aatas_alertaTerrasAntiguoSistemaDto.getIs_idTipoPartida());
		ltecpast_tipoEntradaCrearProcAntiguoSistemaTierrasWsDto
				.setIi_numPartida(aatas_alertaTerrasAntiguoSistemaDto.getIi_numPartida());
		ltecpast_tipoEntradaCrearProcAntiguoSistemaTierrasWsDto
				.setIi_numFolio(aatas_alertaTerrasAntiguoSistemaDto.getIi_numFolio());
		ltecpast_tipoEntradaCrearProcAntiguoSistemaTierrasWsDto
				.setIi_anio(aatas_alertaTerrasAntiguoSistemaDto.getIi_anio());
		ltecpast_tipoEntradaCrearProcAntiguoSistemaTierrasWsDto
				.setIs_nomPredio(aatas_alertaTerrasAntiguoSistemaDto.getIs_nomPredio());
		ltecpast_tipoEntradaCrearProcAntiguoSistemaTierrasWsDto
				.setIi_numPredio(aatas_alertaTerrasAntiguoSistemaDto.getIi_numPredio());


		TipoSalidaCrearProcAntiguoSistemaTierrasWSDTO ltscpast_tipoSalidaCrearProcAntiguoSistemaTierrasWsDto = new TipoSalidaCrearProcAntiguoSistemaTierrasWSDTO();
		try {
			ltscpast_tipoSalidaCrearProcAntiguoSistemaTierrasWsDto = iiat_alertaTierraWsBusiness.crearProcAntiguoSistemaTierras(ltecpast_tipoEntradaCrearProcAntiguoSistemaTierrasWsDto);
		} catch (Exception ae_excepcion) {
			throw new ExcepcionesDatosEntrada(EnumExcepcionesGenerales.ERROR_TECNICO, ae_excepcion);
		}
		return ltscpast_tipoSalidaCrearProcAntiguoSistemaTierrasWsDto;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IAlertaTierrasBusiness#eliminarProcAntiguoSistema(co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaCrearProcAntiguoSistemaTierrasWSDTO, co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaInscribirAlertaCabeceraWSDTO)
	 */
	@Override
	public TipoSalidaEliminarProcAntiguoSistemaWSDTO eliminarProcAntiguoSistema(TipoSalidaCrearProcAntiguoSistemaTierrasWSDTO atscpas_tipoSalidaCrearProcAntiguoSistemaTierrasWsDto,
			TipoSalidaInscribirAlertaCabeceraWSDTO atsiac_tipoSalidaInscribirAlertaCabeceraWsDto) {
		TipoEntradaEliminarProcAntiguoSistemaWSDTO lteepas_tipoEntradaEliminarProcAntiguoSistemaWsDto = new TipoEntradaEliminarProcAntiguoSistemaWSDTO();
		lteepas_tipoEntradaEliminarProcAntiguoSistemaWsDto.setIi_idAlerta(atsiac_tipoSalidaInscribirAlertaCabeceraWsDto.getIi_idAlerta());
		lteepas_tipoEntradaEliminarProcAntiguoSistemaWsDto.setIi_idAntiguoSistemaTierras(atscpas_tipoSalidaCrearProcAntiguoSistemaTierrasWsDto.getIi_idAntiguoSistemaTierras());

		TipoSalidaEliminarProcAntiguoSistemaWSDTO ltsepas_tipoSalidaEliminarProcAntiguoSistemaWsDto = new TipoSalidaEliminarProcAntiguoSistemaWSDTO();
		try {
			ltsepas_tipoSalidaEliminarProcAntiguoSistemaWsDto = iiat_alertaTierraWsBusiness.eliminarProcAntiguoSistema(lteepas_tipoEntradaEliminarProcAntiguoSistemaWsDto);
		} catch (Exception ae_excepcion) {
			throw new ExcepcionesDatosEntrada(EnumExcepcionesGenerales.ERROR_TECNICO, ae_excepcion);
		}
		return ltsepas_tipoSalidaEliminarProcAntiguoSistemaWsDto;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IAlertaTierrasBusiness#consultarMapaPredioInfoCatastral(java.lang.String)
	 */
	@Override
	public TipoSalidaConsultarMapaPredioInfoCatastralWSDTO consultarMapaPredioInfoCatastral(String as_numeroCatastral) {
		TipoEntradaConsultarMapaPredioInfoCatastralWSDTO ltecmpic_tipoEntradaConsultarMapaPredioInfoCatastralWsDto = new TipoEntradaConsultarMapaPredioInfoCatastralWSDTO();
		ltecmpic_tipoEntradaConsultarMapaPredioInfoCatastralWsDto.setIs_numeroCatastral(as_numeroCatastral);

		TipoSalidaConsultarMapaPredioInfoCatastralWSDTO ltscmpic_tipoSalidaConsultarMapaPredioInfoCatastralWsDto = new TipoSalidaConsultarMapaPredioInfoCatastralWSDTO();
		try {
			ltscmpic_tipoSalidaConsultarMapaPredioInfoCatastralWsDto = iiat_alertaTierraWsBusiness.consultarMapaPredioInfoCatastral(ltecmpic_tipoEntradaConsultarMapaPredioInfoCatastralWsDto);
		} catch (Exception ae_excepcion) {
			throw new ExcepcionesDatosEntrada(EnumExcepcionesGenerales.ERROR_TECNICO, ae_excepcion);
		}
		return ltscmpic_tipoSalidaConsultarMapaPredioInfoCatastralWsDto;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IAlertaTierrasBusiness#agregarMatriculaAlerta(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TablaMatriculaAlertaTierrasDTO, co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaInscribirAlertaCabeceraWSDTO)
	 */
	@Override
	public TipoSalidaAgregarMatriculaAlertaWSDTO agregarMatriculaAlerta(
			TablaMatriculaAlertaTierrasDTO atmat_tablaMatriculaAlertaTierrasDto,
			TipoSalidaInscribirAlertaCabeceraWSDTO atsiac_tipoSalidaInscribirAlertaCabeceraWsDto) {
		TipoEntradaAgregarMatriculaAlertaWSDTO lteama_tipoEntradaAgregarMatriculaAlertaWsDto = new TipoEntradaAgregarMatriculaAlertaWSDTO();
		lteama_tipoEntradaAgregarMatriculaAlertaWsDto
				.setIi_idAlerta(atsiac_tipoSalidaInscribirAlertaCabeceraWsDto.getIi_idAlerta());
		lteama_tipoEntradaAgregarMatriculaAlertaWsDto.setIi_numMatriculaInmobiliaria(
				Integer.parseInt(atmat_tablaMatriculaAlertaTierrasDto.getIs_numeroMatricula()));
		lteama_tipoEntradaAgregarMatriculaAlertaWsDto
				.setIs_codCirculoRegistral(atmat_tablaMatriculaAlertaTierrasDto.getIs_numeroCatastral());

		TipoSalidaAgregarMatriculaAlertaWSDTO ltsama_tipoSalidaAgregarMatriculaAlertaWsDto = new TipoSalidaAgregarMatriculaAlertaWSDTO();
		try {
			ltsama_tipoSalidaAgregarMatriculaAlertaWsDto = iiat_alertaTierraWsBusiness.agregarMatriculaAlerta(lteama_tipoEntradaAgregarMatriculaAlertaWsDto);
		} catch (Exception ae_excepcion) {
			throw new ExcepcionesDatosEntrada(EnumExcepcionesGenerales.ERROR_TECNICO, ae_excepcion);
		}
		return ltsama_tipoSalidaAgregarMatriculaAlertaWsDto;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IAlertaTierrasBusiness#agregarListaMatriculasAlerta(java.util.List, co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaInscribirAlertaCabeceraWSDTO)
	 */
	@Override
	public TipoSalidaAgregarListaMatriculasAlertaWSDTO agregarListaMatriculasAlerta(
			List<TablaMatriculaAlertaTierrasDTO> altmat_tablaMatriculaAlertaTierrasDto,
			TipoSalidaInscribirAlertaCabeceraWSDTO atsiac_tipoSalidaInscribirAlertaCabeceraWsDto) {
		TipoEntradaAgregarListaMatriculasAlertaWSDTO ltealma_tipoEntradaAgregarListaMatriculasAlertaWsDto = new TipoEntradaAgregarListaMatriculasAlertaWSDTO();
		ltealma_tipoEntradaAgregarListaMatriculasAlertaWsDto
				.setIi_idAlerta(atsiac_tipoSalidaInscribirAlertaCabeceraWsDto.getIi_idAlerta());
		ltealma_tipoEntradaAgregarListaMatriculasAlertaWsDto.setImat_matriculaAlertaTierrasWsDto(
				MatriculaAlertaTierrasWsDtoConverter.listaVoAListaDto(altmat_tablaMatriculaAlertaTierrasDto));

		TipoSalidaAgregarListaMatriculasAlertaWSDTO ltsalma_tipoSalidaAgregarListaMatriculasAlertaWsDto = new TipoSalidaAgregarListaMatriculasAlertaWSDTO();
		try {
			ltsalma_tipoSalidaAgregarListaMatriculasAlertaWsDto = iiat_alertaTierraWsBusiness.agregarListaMatriculasAlerta(ltealma_tipoEntradaAgregarListaMatriculasAlertaWsDto);
		} catch (Exception ae_excepcion) {
			throw new ExcepcionesDatosEntrada(EnumExcepcionesGenerales.ERROR_TECNICO, ae_excepcion);
		}
		return ltsalma_tipoSalidaAgregarListaMatriculasAlertaWsDto;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IAlertaTierrasBusiness#consultarListaMatriculas(java.util.List)
	 */
	@Override
	public TipoSalidaConsultarListaMatriculasWSDTO consultarListaMatriculas(List<MatriculaDTO> alm_listaMatriculaDto) {
		TipoEntradaConsultarListaMatriculasWSDTO lteclm_tipoEntradaConsultarListaMatriculasWsDto = new TipoEntradaConsultarListaMatriculasWSDTO();
		lteclm_tipoEntradaConsultarListaMatriculasWsDto.setIllm_listaMatriculasWsDto(
				MatriculaAlertaTierrasWsDtoConverter.listaVoAListaMatriculaDto(alm_listaMatriculaDto));

		TipoSalidaConsultarListaMatriculasWSDTO ltsclm_tipoSalidaConsultarListaMatriculasWsDto = new TipoSalidaConsultarListaMatriculasWSDTO();
		try {
			ltsclm_tipoSalidaConsultarListaMatriculasWsDto = iiat_alertaTierraWsBusiness.consultarListaMatriculas(lteclm_tipoEntradaConsultarListaMatriculasWsDto);
		} catch (Exception ae_excepcion) {
			throw new ExcepcionesDatosEntrada(EnumExcepcionesGenerales.ERROR_TECNICO, ae_excepcion);
		}
		return ltsclm_tipoSalidaConsultarListaMatriculasWsDto;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IAlertaTierrasBusiness#activarAlertaTierras(co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaInscribirAlertaCabeceraWSDTO)
	 */
	@Override
	public TipoSalidaActivarAlertaTierrasWSDTO activarAlertaTierras(
			TipoSalidaInscribirAlertaCabeceraWSDTO atsiac_tipoSalidaInscribirAlertaCabeceraWsDto) {
		TipoEntradaActivarAlertaTierrasWSDTO lteaat_tipoEntradaActivarAlertaTierrasWsDto = new TipoEntradaActivarAlertaTierrasWSDTO();
		lteaat_tipoEntradaActivarAlertaTierrasWsDto
				.setIi_idAlerta(atsiac_tipoSalidaInscribirAlertaCabeceraWsDto.getIi_idAlerta());

		TipoSalidaActivarAlertaTierrasWSDTO ltsaat_tipoSalidaActivarAlertaTierrasWsDto = new TipoSalidaActivarAlertaTierrasWSDTO();
		try {
			ltsaat_tipoSalidaActivarAlertaTierrasWsDto = iiat_alertaTierraWsBusiness.activarAlertaTierras(lteaat_tipoEntradaActivarAlertaTierrasWsDto);
		} catch (Exception ae_excepcion) {
			throw new ExcepcionesDatosEntrada(EnumExcepcionesGenerales.ERROR_TECNICO, ae_excepcion);
		}
		return ltsaat_tipoSalidaActivarAlertaTierrasWsDto;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IAlertaTierrasBusiness#inactivarAlerta(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.InactivarAlertaEntradaDTO, co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CargaDocumentosFormularioDTO)
	 */
	@Override
	public TipoSalidaInactivarAlertaWSDTO inactivarAlerta(InactivarAlertaEntradaDTO aiae_inactivarAlertaDto,
			CargaDocumentosFormularioDTO acdf_cargarDocumentoAlertaTierrasDto) {
		TipoEntradaInactivarAlertaTierrasWSDTO lteiat_tipoEntradaInactivarAlertaTierrasWsDto = new TipoEntradaInactivarAlertaTierrasWSDTO();

		lteiat_tipoEntradaInactivarAlertaTierrasWsDto.setId_fechaDocumento((aiae_inactivarAlertaDto.getId_fechaDocumento() != null)
				? aiae_inactivarAlertaDto.getId_fechaDocumento()
				: new Date());
		lteiat_tipoEntradaInactivarAlertaTierrasWsDto.setIi_idAlerta(aiae_inactivarAlertaDto.getIi_idAlerta());
		lteiat_tipoEntradaInactivarAlertaTierrasWsDto
				.setIs_codTipoDocumentoPublico((aiae_inactivarAlertaDto.getIs_tipoDocumentoInactivacion() != null)
						? aiae_inactivarAlertaDto.getIs_tipoDocumentoInactivacion()
						: "");
		lteiat_tipoEntradaInactivarAlertaTierrasWsDto.setIs_docNumero((aiae_inactivarAlertaDto.getIs_numeroDocInactivacion() != null)
				? aiae_inactivarAlertaDto.getIs_numeroDocInactivacion()
				: "");
		lteiat_tipoEntradaInactivarAlertaTierrasWsDto.setIs_idMotivo(aiae_inactivarAlertaDto.getIs_idMotivo());
		lteiat_tipoEntradaInactivarAlertaTierrasWsDto.setIs_oficinaOrigen((aiae_inactivarAlertaDto.getIs_idOficinaOrigen() != null)
				? aiae_inactivarAlertaDto.getIs_idOficinaOrigen()
				: "");
		lteiat_tipoEntradaInactivarAlertaTierrasWsDto
				.setIs_docNameSGD((acdf_cargarDocumentoAlertaTierrasDto.getIa_archivoDto().getIs_nombreArchivo() != null)
						? acdf_cargarDocumentoAlertaTierrasDto.getIa_archivoDto().getIs_nombreArchivo()
						: "");
//		TODO:Verificar el id aca
//		lteiat_tipoEntradaInactivarAlertaTierrasWsDto.setIs_docIdSGD((acdf_cargarDocumentoAlertaTierrasDto.getIs_id() != null)
//				? acdf_cargarDocumentoAlertaTierrasDto.getIs_id()
//				: "");
		lteiat_tipoEntradaInactivarAlertaTierrasWsDto.setIs_textoInactivacion(aiae_inactivarAlertaDto.getIs_txtInactivacion());

		TipoSalidaInactivarAlertaWSDTO ltsia_tipoSalidaInactivarAlertaTierrasWsDto = new TipoSalidaInactivarAlertaWSDTO();
		try {
			ltsia_tipoSalidaInactivarAlertaTierrasWsDto = iiat_alertaTierraWsBusiness.inactivarAlerta(lteiat_tipoEntradaInactivarAlertaTierrasWsDto);
		} catch (Exception ae_excepcion) {
			throw new ExcepcionesDatosEntrada(EnumExcepcionesGenerales.ERROR_TECNICO, ae_excepcion);
		}
		return ltsia_tipoSalidaInactivarAlertaTierrasWsDto;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IAlertaTierrasBusiness#consultarAlertas(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.BandejaAlertaTierraDTO, co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CirculoRegistralDTO)
	 */
	@Override
	public TipoSalidaConsultarAlertasWSDTO consultarAlertas(BandejaAlertaTierraDTO abat_bandejaAlertaTierraDto,
			CirculoRegistralDTO acr_circuloRegistralSeleccionadoDto) {
		TipoSalidaConsultarAlertasWSDTO ltsca_tipoSalidaConsultarAlertasWsDto = null;
		TipoEntradaConsultarAlertasWSDTO lteca_tipoEntradaConsultarAlertasWsDto = new TipoEntradaConsultarAlertasWSDTO();
		if(!Objects.isNull(abat_bandejaAlertaTierraDto)) {
		lteca_tipoEntradaConsultarAlertasWsDto
				.setId_fechaInscripcion((abat_bandejaAlertaTierraDto.getId_fechaInscripcion() != null)
						? abat_bandejaAlertaTierraDto.getId_fechaInscripcion()
						: new Date());
		lteca_tipoEntradaConsultarAlertasWsDto
				.setIi_numMatriculaInmobiliaria((abat_bandejaAlertaTierraDto.getIi_numeroMatricula() != null)
						? abat_bandejaAlertaTierraDto.getIi_numeroMatricula()
						: 0);
		lteca_tipoEntradaConsultarAlertasWsDto
				.setIs_codCirculoRegistral((acr_circuloRegistralSeleccionadoDto.getIs_nombre() != null)
						? acr_circuloRegistralSeleccionadoDto.getIs_nombre()
						: "");
		lteca_tipoEntradaConsultarAlertasWsDto.setIs_codigoEstado(
				(abat_bandejaAlertaTierraDto.getIs_estado() != null) ? abat_bandejaAlertaTierraDto.getIs_estado() : "");
		lteca_tipoEntradaConsultarAlertasWsDto
				.setIs_codTipoDocumentoPublico((abat_bandejaAlertaTierraDto.getIs_tipoDocumento() != null)
						? abat_bandejaAlertaTierraDto.getIs_tipoDocumento()
						: "");
		lteca_tipoEntradaConsultarAlertasWsDto
				.setIs_nombreComunidadEtnica((abat_bandejaAlertaTierraDto.getIs_comunidadEtnica() != null)
						? abat_bandejaAlertaTierraDto.getIs_comunidadEtnica()
						: "");

		try {
			ltsca_tipoSalidaConsultarAlertasWsDto = iiat_alertaTierraWsBusiness.consultarAlertas(lteca_tipoEntradaConsultarAlertasWsDto);
		} catch (Exception ae_excepcion) {
			throw new ExcepcionesDatosEntrada(EnumExcepcionesGenerales.ERROR_TECNICO, ae_excepcion);
		}
		}
		return ltsca_tipoSalidaConsultarAlertasWsDto;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IAlertaTierrasBusiness#listarProcAntiguoSistema(co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaInscribirAlertaCabeceraWSDTO)
	 */
	@Override
	public TipoSalidaListarProcAntiguoSistemaWSDTO listarProcAntiguoSistema(
			TipoSalidaInscribirAlertaCabeceraWSDTO atsiac_tipoSalidaInscribirAlertaCabeceraWsDto) {
		TipoEntradaListarProcAntiguoSistemaWSDTO ltelpas_tipoEntradaListarProcAntiguoSistemaWsDto = new TipoEntradaListarProcAntiguoSistemaWSDTO();
		ltelpas_tipoEntradaListarProcAntiguoSistemaWsDto
				.setIi_idAlerta(atsiac_tipoSalidaInscribirAlertaCabeceraWsDto.getIi_idAlerta());

		TipoSalidaListarProcAntiguoSistemaWSDTO ltslpas_tipoSalidaListarProcAntiguoSistemaWsDto = new TipoSalidaListarProcAntiguoSistemaWSDTO();
		try {
			ltslpas_tipoSalidaListarProcAntiguoSistemaWsDto = iiat_alertaTierraWsBusiness.listarProcAntiguoSistema(ltelpas_tipoEntradaListarProcAntiguoSistemaWsDto);
		} catch (Exception ae_excepcion) {
			throw new ExcepcionesDatosEntrada(EnumExcepcionesGenerales.ERROR_TECNICO, ae_excepcion);
		}
		return ltslpas_tipoSalidaListarProcAntiguoSistemaWsDto;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IAlertaTierrasBusiness#listarDetalleAlertaTierras(co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarDetalleAlertaWSDTO)
	 */
	@Override
	public TipoSalidaConsultarDetalleAlertaWSDTO listarDetalleAlertaTierras(
			TipoEntradaConsultarDetalleAlertaWSDTO atecda_tipoEntradaConsultarDetalleAlertaWsDto) {
		TipoEntradaConsultarDetalleAlertaWSDTO ltecda_tipoEntradaConsultarAlertaWsDto = new TipoEntradaConsultarDetalleAlertaWSDTO();
		ltecda_tipoEntradaConsultarAlertaWsDto
				.setIi_idAlerta(atecda_tipoEntradaConsultarDetalleAlertaWsDto.getIi_idAlerta());

		TipoSalidaConsultarDetalleAlertaWSDTO ltscda_tipoSalidaConsultarDetalleAlertaWsDto = new TipoSalidaConsultarDetalleAlertaWSDTO();
		try {
			ltscda_tipoSalidaConsultarDetalleAlertaWsDto = iiat_alertaTierraWsBusiness.consultarDetalleAlerta(ltecda_tipoEntradaConsultarAlertaWsDto);
		} catch (Exception ae_excepcion) {
			throw new ExcepcionesDatosEntrada(EnumExcepcionesGenerales.ERROR_TECNICO, ae_excepcion);
		}
		return ltscda_tipoSalidaConsultarDetalleAlertaWsDto;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IAlertaTierrasBusiness#removerMatriculaAlerta(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TablaMatriculaAlertaTierrasDTO, co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaInscribirAlertaCabeceraWSDTO)
	 */
	@Override
	public TipoSalidaRemoverMatriculaAlertaWSDTO removerMatriculaAlerta(
			TablaMatriculaAlertaTierrasDTO atmat_tablaMatriculaAlertaTierrasDto,
			TipoSalidaInscribirAlertaCabeceraWSDTO atsiac_tipoSalidaInscribirAlertaCabeceraWsDto) {
		TipoEntradaRemoverMatriculaAlertaWSDTO lterma_tipoEntradaRemoverMatriculaAlertaWsDto = new TipoEntradaRemoverMatriculaAlertaWSDTO();
		lterma_tipoEntradaRemoverMatriculaAlertaWsDto
				.setIi_idAlerta(atsiac_tipoSalidaInscribirAlertaCabeceraWsDto.getIi_idAlerta());
		lterma_tipoEntradaRemoverMatriculaAlertaWsDto.setIi_numMatriculaInmobiliaria(
				Integer.parseInt(atmat_tablaMatriculaAlertaTierrasDto.getIs_numeroMatricula()));
		lterma_tipoEntradaRemoverMatriculaAlertaWsDto
				.setIs_codCirculoRegistral(atmat_tablaMatriculaAlertaTierrasDto.getIs_numeroCatastral());

		TipoSalidaRemoverMatriculaAlertaWSDTO ltsrma_tipoSalidaRemoverMatriculaAlertaWsDto = new TipoSalidaRemoverMatriculaAlertaWSDTO();
		try {
			ltsrma_tipoSalidaRemoverMatriculaAlertaWsDto = iiat_alertaTierraWsBusiness.removerMatriculaAlerta(lterma_tipoEntradaRemoverMatriculaAlertaWsDto);
		} catch (Exception ae_excepcion) {
			throw new ExcepcionesDatosEntrada(EnumExcepcionesGenerales.ERROR_TECNICO, ae_excepcion);
		}
		return ltsrma_tipoSalidaRemoverMatriculaAlertaWsDto;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IAlertaTierrasBusiness#rechazarCorreccionAlerta(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TablaBandejaAlertasTierrasDTO, java.lang.String, co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioSesionDTO)
	 */
	@Override
	public TipoSalidaRechazarCorreccionAlertaWSDTO rechazarCorreccionAlerta(
			TablaBandejaAlertasTierrasDTO atbat_tablaBandejaAlertasTierrasDto, String as_textoNegacion,
			UsuarioSesionDTO aus_usuarioSesionDto) {
		TipoEntradaRechazarCorreccionAlertaWSDTO lterca_tipoEntradaRechazarCorreccionAlertaWsDto = new TipoEntradaRechazarCorreccionAlertaWSDTO();
		lterca_tipoEntradaRechazarCorreccionAlertaWsDto.setIi_idAlerta(atbat_tablaBandejaAlertasTierrasDto.getIi_idAlerta());
		lterca_tipoEntradaRechazarCorreccionAlertaWsDto.setIs_idUsuario(aus_usuarioSesionDto.getIs_numeroDocumento());
		lterca_tipoEntradaRechazarCorreccionAlertaWsDto.setIs_texto(as_textoNegacion);

		TipoSalidaRechazarCorreccionAlertaWSDTO ltsrca_tipoSalidaRechazarCorreccionAlertaWsDto = new TipoSalidaRechazarCorreccionAlertaWSDTO();
		try {
			ltsrca_tipoSalidaRechazarCorreccionAlertaWsDto = iiat_alertaTierraWsBusiness.rechazarCorreccionAlerta(lterca_tipoEntradaRechazarCorreccionAlertaWsDto);
		} catch (Exception ae_excepcion) {
			throw new ExcepcionesDatosEntrada(EnumExcepcionesGenerales.ERROR_TECNICO, ae_excepcion);
		}
		return ltsrca_tipoSalidaRechazarCorreccionAlertaWsDto;
	}

}

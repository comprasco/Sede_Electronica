package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICatalogoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IDetalleCatalogoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IDocumentosCargadosOwccBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IGenericoTransaccionModeloBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITipoProcesoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITransaccionSolicitudModeloBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ArchivoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CatalogoDocumentalDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.DetalleCatalogoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.DocumentosCargadosOwccDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.PersonaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.SoporteTransaccionDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TipoProcesoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionSinPagoGenericaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionSolicitudModeloDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioSesionDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IUsuarioDAO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper.PersonaHelper;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Usuario;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.ISolicitudesSinPagoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoCriterioWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaGenerarSolicitudWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaGenerarSolicitudWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoServicioGSIWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSolicitanteGSIWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumBoolean;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumCriterio;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumEstadoSolicitudSinPago;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoPersona;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoProceso;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadAutoridadUsuario;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadExcepciones;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadFecha;

/**
 * Clase tipo EJB (Enterprise Java Bean) de la capa de negocio. <br>
 * Contiene la implementacion logica de las operaciones del recurso Generico
 * transaccion modelo. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless(name = "GenericoTransaccionModeloBusiness", mappedName = "GenericoTransaccionModeloBusiness")
@LocalBean
public class GenericoTransaccionModeloBusiness implements IGenericoTransaccionModeloBusiness{

	/**
	 * Define la constante CS_TURNO.
	 */
	private static final String CS_TURNO = "//";

	/**
	 * Atributo de instancia tipo ITipoProcesoBusiness para definir la propiedad
	 * tipo proceso business.
	 */
	@EJB
	private ITipoProcesoBusiness iitp_tipoProcesoBusiness;

	/**
	 * Atributo de instancia tipo IUsuarioDAO para definir la propiedad usuario dao.
	 */
	@EJB
	private IUsuarioDAO iiu_usuarioDao;
	
	/**
	 * Atributo de instancia tipo ICatalogoBusiness para definir la
	 * propiedad catalogo.
	 */
	@EJB
	private ICatalogoBusiness iic_catalogoBusiness;
	
	/**
	 * Atributo de instancia tipo IDetalleCatalogoBusiness para definir la propiedad
	 * detalle catalogo business.
	 */
	@EJB
	protected IDetalleCatalogoBusiness iidc_detalleCatalogoBusiness;

	/**
	 * Atributo de instancia tipo ITransaccionSolicitudModeloBusiness para definir
	 * la propiedad transaccion solicitud modelo business.
	 */
	@EJB
	private ITransaccionSolicitudModeloBusiness iitsm_transaccionSolicitudModeloBusiness;

	/**
	 * Atributo de instancia tipo ISolicitudesSinPagoBusiness para definir la
	 * propiedad solicitud sin pago business.
	 */
	@EJB
	private ISolicitudesSinPagoBusiness iisspb_solicitudSinPagoBusiness;

	/**
	 * Atributo de instancia tipo IDocumentosCargadosOwccBusiness para definir la
	 * propiedad documentos cargados oracle web center content business.
	 */
	@EJB
	private IDocumentosCargadosOwccBusiness iidco_documentosCargadosOwccBusiness;

	@Override
	public TransaccionSinPagoGenericaDTO iniciarTransaccion(EnumTipoProceso aetp_enumTipoProceso) {
		TipoProcesoDTO ltp_tipoProcesoDto = iitp_tipoProcesoBusiness
				.consultarTipoProcesoPorCodigo(aetp_enumTipoProceso.getIs_codigo());
		TransaccionSinPagoGenericaDTO ltspg_transaccionModeloGenericoDto = new TransaccionSinPagoGenericaDTO();
		ltspg_transaccionModeloGenericoDto.setIeessp_enumEstadoSolicitudSinPago(EnumEstadoSolicitudSinPago.EN_CURSO);
		ltspg_transaccionModeloGenericoDto.setIp_personaDto(consultarUsuarioSession());
		ltspg_transaccionModeloGenericoDto.setItp_tipoProcesoDto(ltp_tipoProcesoDto);
		return ltspg_transaccionModeloGenericoDto;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITrasladoMatriculasBusiness#consultarTransaccionVigente(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TrasladoMatriculaDTO)
	 */
	@Override
	public TransaccionSinPagoGenericaDTO consultarTransaccionVigenteGenerico(TransaccionSinPagoGenericaDTO atspg_transaccionSinPagoGenericaDto) {
		TransaccionSolicitudModeloDTO ltsm_transaccionSolicitudModeloDto = iitsm_transaccionSolicitudModeloBusiness
				.consultarTransaccionSolicitudModeloVigente(atspg_transaccionSinPagoGenericaDto);
		if (ltsm_transaccionSolicitudModeloDto == null)
			return atspg_transaccionSinPagoGenericaDto;
		TransaccionSinPagoGenericaDTO ltspg_transaccionSinPagoGenericaDto = new TransaccionSinPagoGenericaDTO();
		ltspg_transaccionSinPagoGenericaDto.setIs_nir(ltsm_transaccionSolicitudModeloDto.getIs_nir());
		ltspg_transaccionSinPagoGenericaDto.setItp_tipoProcesoDto(ltsm_transaccionSolicitudModeloDto.getItp_tipoProcesoDto());
		ltspg_transaccionSinPagoGenericaDto.setIp_personaDto(ltsm_transaccionSolicitudModeloDto.getIu_idUsuario().getIp_personaDto());
		ltspg_transaccionSinPagoGenericaDto.setIeessp_enumEstadoSolicitudSinPago(EnumEstadoSolicitudSinPago
				.consultarEnumPorCodigo(ltsm_transaccionSolicitudModeloDto.getIs_estadoTransaccion()));
		ltspg_transaccionSinPagoGenericaDto.setIdc_detalleCatalgoDto(atspg_transaccionSinPagoGenericaDto.getIdc_detalleCatalgoDto());
		ltspg_transaccionSinPagoGenericaDto.setIs_modeloTransaccionRecuperado(ltsm_transaccionSolicitudModeloDto.getIs_modeloTransaccionVigente());
		if (ltspg_transaccionSinPagoGenericaDto.getIs_nir() != null && !ltspg_transaccionSinPagoGenericaDto.getIs_nir().equals(""))
			ltspg_transaccionSinPagoGenericaDto
			.setIlst_soportesTransaccionCargadosDto(cargarArchivos(ltspg_transaccionSinPagoGenericaDto.getIs_nir()));
		return ltspg_transaccionSinPagoGenericaDto;
	}

	/**
	 * Metodo que se encarga de generar liquidacion de las solicitudes sin pago con los criterios para cada vez
	 * 
	 * @param atspg_transaccionSinPagoGenericaDto datos de la transaccion para generar liquidacion
	 * @param altsgw_servicios criterios para consumir servicio
	 * @return String Nir generado
	 */
	protected String generarSolicitudGenerico(TransaccionSinPagoGenericaDTO atspg_transaccionSinPagoGenericaDto,List<TipoCriterioWSDTO> altc_tipoCriterio) {
		TipoEntradaGenerarSolicitudWSDTO ltegs_tipoEntradaGenerarSolicitudWsDto = new TipoEntradaGenerarSolicitudWSDTO();
		ltegs_tipoEntradaGenerarSolicitudWsDto.setIs_modulo(EnumCriterio.CANAL_ORIGEN.getIs_criterio());
		TipoSolicitanteGSIWSDTO ltsgv_solicitante = new TipoSolicitanteGSIWSDTO();
		ltsgv_solicitante.setIs_numeroDocumento(atspg_transaccionSinPagoGenericaDto.getIp_personaDto().getIs_numeroDocumento());
		ltsgv_solicitante.setIs_tipoDocumento(atspg_transaccionSinPagoGenericaDto.getIp_personaDto().getItd_tipoDocumentoDto().getIs_id());
		ltsgv_solicitante.setIs_tipoPersona(atspg_transaccionSinPagoGenericaDto.getIp_personaDto().getIc_catalogoDto().getIs_codigoValor());

		if(ltsgv_solicitante.getIs_tipoPersona().equals(EnumTipoPersona.JURIDICA.getIs_codigo())) {
			TipoCriterioWSDTO ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
			ltc_tipoCriterioWsDto.setIs_codigo(EnumCriterio.RAZON_SOCIAL_CC.getIs_criterio());
			ltc_tipoCriterioWsDto.setIs_valor(atspg_transaccionSinPagoGenericaDto.getIp_personaDto().getIpj_personaJuridicaDto().getIs_razonSocial());
			altc_tipoCriterio.add(ltc_tipoCriterioWsDto);
		}else if(ltsgv_solicitante.getIs_tipoPersona().equals(EnumTipoPersona.NATURAL.getIs_codigo())) {
			TipoCriterioWSDTO ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
			ltc_tipoCriterioWsDto.setIs_codigo(EnumCriterio.PRIMER_NOMBRE_GS.getIs_criterio());
			ltc_tipoCriterioWsDto.setIs_valor(atspg_transaccionSinPagoGenericaDto.getIp_personaDto().getIpn_personaNaturalDto().getIs_primerNombre());
			altc_tipoCriterio.add(ltc_tipoCriterioWsDto);

			ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
			ltc_tipoCriterioWsDto.setIs_codigo(EnumCriterio.PRIMER_APELLIDO_GS.getIs_criterio());
			ltc_tipoCriterioWsDto.setIs_valor(atspg_transaccionSinPagoGenericaDto.getIp_personaDto().getIpn_personaNaturalDto().getIs_primerApellido());
			altc_tipoCriterio.add(ltc_tipoCriterioWsDto);

			if(atspg_transaccionSinPagoGenericaDto.getIp_personaDto().getIpn_personaNaturalDto().getIs_segundoNombre() != null && atspg_transaccionSinPagoGenericaDto.getIp_personaDto().getIpn_personaNaturalDto().getIs_segundoNombre().equals("")) {
				ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
				ltc_tipoCriterioWsDto.setIs_codigo(EnumCriterio.SEGUNDO_NOMBRE_GS.getIs_criterio());
				ltc_tipoCriterioWsDto.setIs_valor(atspg_transaccionSinPagoGenericaDto.getIp_personaDto().getIpn_personaNaturalDto().getIs_segundoNombre());
				altc_tipoCriterio.add(ltc_tipoCriterioWsDto);
			}
			if(atspg_transaccionSinPagoGenericaDto.getIp_personaDto().getIpn_personaNaturalDto().getIs_segundoApellido() != null && atspg_transaccionSinPagoGenericaDto.getIp_personaDto().getIpn_personaNaturalDto().getIs_segundoApellido().equals("")) {
				ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
				ltc_tipoCriterioWsDto.setIs_codigo(EnumCriterio.SEGUNDO_APELLIDO_GS.getIs_criterio());
				ltc_tipoCriterioWsDto.setIs_valor(atspg_transaccionSinPagoGenericaDto.getIp_personaDto().getIpn_personaNaturalDto().getIs_segundoApellido());
				altc_tipoCriterio.add(ltc_tipoCriterioWsDto);
			}
		}

		ltegs_tipoEntradaGenerarSolicitudWsDto.setItsgv_solicitante(ltsgv_solicitante);
		List<TipoServicioGSIWSDTO> lltsgw_servicios = new ArrayList<>();
		TipoServicioGSIWSDTO lts_tipoServicioWsdto = new TipoServicioGSIWSDTO();
		DetalleCatalogoDTO ldc_detalleCatalogoDto = atspg_transaccionSinPagoGenericaDto.getIdc_detalleCatalgoDto();
		lts_tipoServicioWsdto.setIs_subTipoServicio(ldc_detalleCatalogoDto.getIs_idCodigoSubServicio());
		lts_tipoServicioWsdto.setIs_tipoServicio(ldc_detalleCatalogoDto.getIs_idCodigoServicio());
		ltegs_tipoEntradaGenerarSolicitudWsDto.setIltsgw_servicios(lltsgw_servicios);
		lts_tipoServicioWsdto.setIltc_tipoCriterio(altc_tipoCriterio);
		lltsgw_servicios.add(lts_tipoServicioWsdto);
		TipoSalidaGenerarSolicitudWSDTO ltsgs_tipoSalidaGenerarSolicitudWsDto = iisspb_solicitudSinPagoBusiness
				.generarSolicitud(ltegs_tipoEntradaGenerarSolicitudWsDto);
		UtilidadExcepciones.manejadorExcepcionesServicios(ltsgs_tipoSalidaGenerarSolicitudWsDto);
		return ltsgs_tipoSalidaGenerarSolicitudWsDto.getIs_nir();
	}

	/**
	 * Metodo que consulta por una transaccion de traslada de matricula los documentos que
	 * tenga asociado si existe nir.
	 *
	 * @param as_nir nir asociado a la transaccion
	 * @return Resultado para cargar archivos retornado como una lista de
	 *         SoporteTransaccionDTO
	 */
	private List<SoporteTransaccionDTO> cargarArchivos(String as_nir) {
		List<DocumentosCargadosOwccDTO> lldco_listaDocumentosCargadosOwcc = iidco_documentosCargadosOwccBusiness
				.consultarDocumentosPorNir(as_nir);
		List<SoporteTransaccionDTO> llst_soportesCargadosDto = new ArrayList<>();
		for (DocumentosCargadosOwccDTO ldco_documentosCargadosOwcc : lldco_listaDocumentosCargadosOwcc) {
			llst_soportesCargadosDto.add(cargarSoportePorOwcc(ldco_documentosCargadosOwcc));
		}
		return llst_soportesCargadosDto;
	}

	/**
	 * Metodo que se encarga de convertir de documentosCargadosOwccDTo a
	 * SoporteTransaccionDTO.
	 *
	 * @param adco_documentosCargadosOwcc documento en bd
	 * @return Resultado para cargar soporte por oracle web center content retornado
	 *         como SoporteTransaccionDTO
	 */
	private SoporteTransaccionDTO cargarSoportePorOwcc(DocumentosCargadosOwccDTO adco_documentosCargadosOwcc) {
		SoporteTransaccionDTO lst_soporteTransaccionDto = new SoporteTransaccionDTO();
		ArchivoDTO la_soporteDto = new ArchivoDTO();
		la_soporteDto.setIs_nombreArchivo(adco_documentosCargadosOwcc.getIs_nombreDocumento());
		lst_soporteTransaccionDto.setIa_archivoDto(la_soporteDto);
		if(adco_documentosCargadosOwcc.getIs_observaciones() != null) {
			String[] ls_arrayObservacion = adco_documentosCargadosOwcc.getIs_observaciones().split(CS_TURNO);
			if(ls_arrayObservacion.length > 0) {
				String ls_turno = ls_arrayObservacion[0];
				String ls_observacion = ls_arrayObservacion[1];
				lst_soporteTransaccionDto.setIs_turno(ls_turno);
				try {
					lst_soporteTransaccionDto.setId_fechaDocumento(UtilidadFecha.formatearFecha(ls_observacion));
				} catch (ParseException ape_excepcionConvertir) {
					lst_soporteTransaccionDto.setIs_observacion(ls_observacion);
				}
			}
		}
		CatalogoDocumentalDTO lcd_tipoDocumentalDto = new CatalogoDocumentalDTO();
		lcd_tipoDocumentalDto.setIs_nombre(adco_documentosCargadosOwcc.getIs_tipoDocumental());
		lcd_tipoDocumentalDto.setIs_codigoValor(adco_documentosCargadosOwcc.getIs_tipoDocumental());
		lst_soporteTransaccionDto.setIcd_catalogoDocumentoDto(lcd_tipoDocumentalDto);
		lst_soporteTransaccionDto.setIb_desactivarBotonesCarga(true);
		return lst_soporteTransaccionDto;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IGenericoTransaccionModeloBusiness#consultarUsuarioSession()
	 */
	@Override
	public PersonaDTO consultarUsuarioSession() {
		UsuarioSesionDTO lus_usuarioSesionDto;
		Usuario lu_usuario;
		lus_usuarioSesionDto = UtilidadAutoridadUsuario.consultarUsuarioSesion();
		lu_usuario = iiu_usuarioDao.consultarUsuario(lus_usuarioSesionDto.getIs_nombreUsuario());
		return PersonaHelper.entidadADtoCompletoConPersonaJuridicaSinDocumentos(lu_usuario.getPersona());
	}

	@Override
	public Boolean eliminarTransaccionGenerica(TransaccionSinPagoGenericaDTO atspg_transaccionSinPagogenericaDto) {
		TransaccionSolicitudModeloDTO ltsm_transaccionSolicitudModeloDto = iitsm_transaccionSolicitudModeloBusiness
				.consultarTransaccionSolicitudModeloVigente(atspg_transaccionSinPagogenericaDto);
		iitsm_transaccionSolicitudModeloBusiness.eliminarTransaccionSolicitudModelo(ltsm_transaccionSolicitudModeloDto);
		return true;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITrasladoMatriculasBusiness#guardarTransaccion(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TrasladoMatriculaDTO)
	 */
	@Override
	public Boolean guardarTransaccion(TransaccionSinPagoGenericaDTO atspg_transaccionSinPagoGenericaDto) {
		TransaccionSolicitudModeloDTO ltsm_transaccionSolicitudModeloDto = iitsm_transaccionSolicitudModeloBusiness
				.consultarTransaccionSolicitudModeloVigente(atspg_transaccionSinPagoGenericaDto);
		if (ltsm_transaccionSolicitudModeloDto == null)
			ltsm_transaccionSolicitudModeloDto = new TransaccionSolicitudModeloDTO();
		ltsm_transaccionSolicitudModeloDto.setIs_activo(EnumBoolean.CHAR_S.getIs_codigo());
		ltsm_transaccionSolicitudModeloDto.setIs_estadoTransaccion(
				atspg_transaccionSinPagoGenericaDto.getIeessp_enumEstadoSolicitudSinPago().getIs_codigo());
		ltsm_transaccionSolicitudModeloDto
		.setIs_modeloTransaccionVigente(atspg_transaccionSinPagoGenericaDto.toString());
		ltsm_transaccionSolicitudModeloDto.setIu_idUsuario(atspg_transaccionSinPagoGenericaDto.getIp_personaDto().getIu_usuarioDto());
		ltsm_transaccionSolicitudModeloDto.setItp_tipoProcesoDto(atspg_transaccionSinPagoGenericaDto.getItp_tipoProcesoDto());
		ltsm_transaccionSolicitudModeloDto.setIs_nir(atspg_transaccionSinPagoGenericaDto.getIs_nir());
		iitsm_transaccionSolicitudModeloBusiness.crearTransaccionSolicitudModelo(ltsm_transaccionSolicitudModeloDto);
		return true;

	}

}

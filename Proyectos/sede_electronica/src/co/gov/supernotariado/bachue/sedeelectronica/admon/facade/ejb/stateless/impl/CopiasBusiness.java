/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: CopiasBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl
 * Nombre del elemento: CopiasBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICarritoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICopiasBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IParametroBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CirculoRegistralDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CopiasDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ParametroDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionCopiasDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.interfaces.ITransaccionDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IBusquedaDocumentosBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IInterfacesFinancierasBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.ISolicitudCopiasBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.DocumentoBusquedaDocumentosWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.DocumentoSGDWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.ParametroBusquedaDocumentoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoCriterioCTSIWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaIngresoSolicitudCopiasWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarTarifaServicioWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaIngresoSolicitudCopiasWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoServicioCTSIWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumCriterio;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumFormatoFecha;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoProceso;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.DateDeserializer;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadExcepciones;

/**
 * Clase tipo EJB (Enterprise Java Bean) de la capa de negocio. <br>
 * Contiene la implementacion logica de las operaciones del recurso Copias. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless(name = "CopiasBusiness", mappedName = "CopiasBusiness")
@LocalBean
public class CopiasBusiness implements ICopiasBusiness{

	/**
	 * Atributo de instancia tipo IBusquedaDocumentosBusiness para definir la
	 * propiedad busqueda documentos business.
	 */
	@EJB
	private IBusquedaDocumentosBusiness iibd_busquedaDocumentosBusiness;
	
	/**
	 * Atributo de instancia tipo ICarritoBusiness para definir la propiedad carrito
	 * business.
	 */
	@EJB
	private ICarritoBusiness iic_carritoBusiness;
	
	/**
	 * Atributo de instancia tipo ISolicitudCopiasBusiness para definir la propiedad
	 * solicitud copias business.
	 */
	@EJB
	private ISolicitudCopiasBusiness iisc_solicitudCopiasBusiness;
	
	/**
	 * Atributo de instancia tipo IParametroBusiness para definir la propiedad
	 * parametro business.
	 */
	@EJB
	private IParametroBusiness iip_parametroBusiness;
	
	/**
	 * Atributo de instancia tipo IInterfacesFinancierasBusiness para definir la
	 * propiedad interfaces financieras business.
	 */
	@EJB
	private IInterfacesFinancierasBusiness iiif_interfacesFinancierasBusiness;

	/**
	 * Define la constante CS_NIR.
	 */
	private static final String CS_NIR = "NIR";
	
	/**
	 * Define la constante CS_MATRICULA.
	 */
	private static final String CS_MATRICULA = "Matricula";
	
	/**
	 * Define la constante CS_TURNO.
	 */
	private static final String CS_TURNO = "Turno";
	
	/**
	 * Define la constante CS_DOCUMENTO.
	 */
	private static final String CS_DOCUMENTO = "Documento";

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICopiasBusiness#consultarDocumento(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CopiasDTO)
	 */
	@Override
	public List<CopiasDTO> consultarDocumento(CopiasDTO ac_copiasDto) {
		TipoEntradaConsultarWSDTO ltec_tipoEntradaConsultarWsDto = new TipoEntradaConsultarWSDTO();
		ltec_tipoEntradaConsultarWsDto.setIs_sistemaOrigen(EnumCriterio.CANAL_ORIGEN.getIs_criterio());
		ltec_tipoEntradaConsultarWsDto.setIs_repositorio(EnumCriterio.TIPO_DOCUMENTO_FINAL.getIs_criterio());
		List<ParametroBusquedaDocumentoWSDTO> llpbd_listaParametrosWsDto;
		switch (ac_copiasDto.getIs_tipoCriterio()) {
		case CS_NIR:
			llpbd_listaParametrosWsDto = cargarCriteriosNir(ac_copiasDto);
			break;
		case CS_MATRICULA:
			llpbd_listaParametrosWsDto = cargarCriteriosMatricula(ac_copiasDto);
			break;
		case CS_TURNO:
			llpbd_listaParametrosWsDto = cargarCriteriosTurno(ac_copiasDto);
			break;
		case CS_DOCUMENTO:
			llpbd_listaParametrosWsDto = cargarCriteriosDocumento(ac_copiasDto);
			break;
		default:
			llpbd_listaParametrosWsDto = new ArrayList<>();
			break;
		}

		ltec_tipoEntradaConsultarWsDto.setIlp_listaParametrosVo(llpbd_listaParametrosWsDto);
		TipoSalidaConsultarWSDTO ltsc_tipoSalidaConsultarWsDto = iibd_busquedaDocumentosBusiness.consultar(ltec_tipoEntradaConsultarWsDto);
		UtilidadExcepciones.manejadorExcepcionesServicios(ltsc_tipoSalidaConsultarWsDto);
		List<CopiasDTO> llc_listaCopiasDto = new ArrayList<>();
		for(DocumentoBusquedaDocumentosWSDTO ldbd_documentoBusquedaDocumentoWsDto : ltsc_tipoSalidaConsultarWsDto.getIldbd_listaDocumentoBusquedaDocumentosWsDto())
		{
			CopiasDTO lc_copiasDto = new CopiasDTO();
			Integer li_numeroFolios;
			if(ldbd_documentoBusquedaDocumentoWsDto.getIs_numeroFolios() != null && !ldbd_documentoBusquedaDocumentoWsDto.getIs_numeroFolios().isEmpty())
				li_numeroFolios = Integer.parseInt(ldbd_documentoBusquedaDocumentoWsDto.getIs_numeroFolios());
			else
				li_numeroFolios = 0;
			lc_copiasDto.setIi_cantidadFolios(li_numeroFolios);
			lc_copiasDto.setId_fechaDocumento(!ldbd_documentoBusquedaDocumentoWsDto.getIs_fechaPublicacion().equals("")?DateDeserializer.deserializeServicioCopias(ldbd_documentoBusquedaDocumentoWsDto.getIs_fechaPublicacion()):null);
			lc_copiasDto.setIs_numeroDocumento(ldbd_documentoBusquedaDocumentoWsDto.getIs_numeroDocumento());
			lc_copiasDto.setIs_tipoDocumento(ldbd_documentoBusquedaDocumentoWsDto.getIs_tipoDocumental());
			lc_copiasDto.setIs_matricula(ldbd_documentoBusquedaDocumentoWsDto.getIs_matricula());
			lc_copiasDto.setIs_nir(ldbd_documentoBusquedaDocumentoWsDto.getIs_nir());
			lc_copiasDto.setIs_turno(ldbd_documentoBusquedaDocumentoWsDto.getIs_turno());
			lc_copiasDto.setIs_dId(ldbd_documentoBusquedaDocumentoWsDto.getIs_dId());
			lc_copiasDto.setIs_documentoNombre(ldbd_documentoBusquedaDocumentoWsDto.getIs_docName());
			lc_copiasDto.setIcr_circuloRegistral(new CirculoRegistralDTO());
			lc_copiasDto.getIcr_circuloRegistral().setIs_id(ldbd_documentoBusquedaDocumentoWsDto.getIs_codOrip());
			lc_copiasDto.getIcr_circuloRegistral().setIs_nombre(ldbd_documentoBusquedaDocumentoWsDto.getIs_orip());
			llc_listaCopiasDto.add(lc_copiasDto);
		}
		return llc_listaCopiasDto;
	}

	/**
	 * Metodo que carga los parametros para consultar los documentos segun datos de
	 * documento.
	 *
	 * @param ac_copiasDto el parametro copias dto
	 * @return Resultado para cargar criterios documento retornado como una lista de
	 *         ParametroBusquedaDocumentoWSDTO
	 */
	private List<ParametroBusquedaDocumentoWSDTO> cargarCriteriosDocumento(CopiasDTO ac_copiasDto) {
		List<ParametroBusquedaDocumentoWSDTO> llpbd_listaParametrosWsDto = new ArrayList<>();
		ParametroBusquedaDocumentoWSDTO lpbd_parametroBusquedaDocumentosWsDto = new ParametroBusquedaDocumentoWSDTO();
		lpbd_parametroBusquedaDocumentosWsDto.setIs_nombre(EnumCriterio.DOCUMENTO_FECHA.getIs_criterio());
		ParametroDTO lp_parametroFechaEnvio = iip_parametroBusiness.consultarParametro(EnumFormatoFecha.FECHA_BUSQUEDA_DOCUMENTO.getIs_formato());
		DateFormat ldf_formatoFecha = new SimpleDateFormat(lp_parametroFechaEnvio.getIs_valor());
		lpbd_parametroBusquedaDocumentosWsDto.setIs_valor(ldf_formatoFecha.format(ac_copiasDto.getId_fechaDocumento()));
		llpbd_listaParametrosWsDto.add(lpbd_parametroBusquedaDocumentosWsDto);
		lpbd_parametroBusquedaDocumentosWsDto = new ParametroBusquedaDocumentoWSDTO();
		lpbd_parametroBusquedaDocumentosWsDto.setIs_nombre(EnumCriterio.DOCUMENTO_TIPO.getIs_criterio());
		lpbd_parametroBusquedaDocumentosWsDto.setIs_valor(ac_copiasDto.getIs_tipoDocumento());		
		llpbd_listaParametrosWsDto.add(lpbd_parametroBusquedaDocumentosWsDto);
		lpbd_parametroBusquedaDocumentosWsDto = new ParametroBusquedaDocumentoWSDTO();
		lpbd_parametroBusquedaDocumentosWsDto.setIs_nombre(EnumCriterio.DOCUMENTO_NUMERO.getIs_criterio());
		lpbd_parametroBusquedaDocumentosWsDto.setIs_valor(ac_copiasDto.getIs_numeroDocumento());		
		llpbd_listaParametrosWsDto.add(lpbd_parametroBusquedaDocumentosWsDto);
		return llpbd_listaParametrosWsDto;
	}

	/**
	 * Metodo que carga los parametros para consultar los documentos segun turno.
	 *
	 * @param ac_copiasDto el parametro copias dto
	 * @return Resultado para cargar criterios turno retornado como una lista de
	 *         ParametroBusquedaDocumentoWSDTO
	 */
	private List<ParametroBusquedaDocumentoWSDTO> cargarCriteriosTurno(CopiasDTO ac_copiasDto) {
		List<ParametroBusquedaDocumentoWSDTO> llpbd_listaParametrosWsDto = new ArrayList<>();
		ParametroBusquedaDocumentoWSDTO lpbd_parametroBusquedaDocumentosWsDto = new ParametroBusquedaDocumentoWSDTO();
		lpbd_parametroBusquedaDocumentosWsDto.setIs_nombre(EnumCriterio.DOCUMENTO_TURNO.getIs_criterio());
		lpbd_parametroBusquedaDocumentosWsDto.setIs_valor(ac_copiasDto.getIs_turno());		
		llpbd_listaParametrosWsDto.add(lpbd_parametroBusquedaDocumentosWsDto);
		return llpbd_listaParametrosWsDto;
	}

	/**
	 * Metodo que carga los parametros para consultar los documentos segun
	 * matricula.
	 *
	 * @param ac_copiasDto el parametro copias dto
	 * @return Resultado para cargar criterios matricula retornado como una lista de
	 *         ParametroBusquedaDocumentoWSDTO
	 */
	private List<ParametroBusquedaDocumentoWSDTO> cargarCriteriosMatricula(CopiasDTO ac_copiasDto) {
		List<ParametroBusquedaDocumentoWSDTO> llpbd_listaParametrosWsDto = new ArrayList<>();
		ParametroBusquedaDocumentoWSDTO lpbd_parametroBusquedaDocumentosWsDto = new ParametroBusquedaDocumentoWSDTO();
		lpbd_parametroBusquedaDocumentosWsDto.setIs_nombre(EnumCriterio.DOCUMENTO_MATRICULA.getIs_criterio());
		lpbd_parametroBusquedaDocumentosWsDto.setIs_valor(ac_copiasDto.getIcr_circuloRegistral().getIs_id()+"-"+ac_copiasDto.getIs_matricula());		
		llpbd_listaParametrosWsDto.add(lpbd_parametroBusquedaDocumentosWsDto);
		return llpbd_listaParametrosWsDto;
	}

	/**
	 * Metodo que carga los parametros para consultar los documentos segun nir.
	 *
	 * @param ac_copiasDto el parametro copias dto
	 * @return Resultado para cargar criterios nir retornado como una lista de
	 *         ParametroBusquedaDocumentoWSDTO
	 */
	private List<ParametroBusquedaDocumentoWSDTO> cargarCriteriosNir(CopiasDTO ac_copiasDto) {
		List<ParametroBusquedaDocumentoWSDTO> llpbd_listaParametrosWsDto = new ArrayList<>();
		ParametroBusquedaDocumentoWSDTO lpbd_parametroBusquedaDocumentosWsDto = new ParametroBusquedaDocumentoWSDTO();
		lpbd_parametroBusquedaDocumentosWsDto.setIs_nombre(EnumCriterio.DOCUMENTO_NIR.getIs_criterio());
		lpbd_parametroBusquedaDocumentosWsDto.setIs_valor(ac_copiasDto.getIs_nir());		
		llpbd_listaParametrosWsDto.add(lpbd_parametroBusquedaDocumentosWsDto);
		return llpbd_listaParametrosWsDto;
	}


	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICopiasBusiness#guardarTransaccionVigente(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.interfaces.ITransaccionDTO)
	 */
	@Override
	public Boolean guardarTransaccionVigente(ITransaccionDTO ait_transaccionDto)
	{
		return iic_carritoBusiness.guardarTransaccionVigente(ait_transaccionDto,EnumTipoProceso.COPIAS);
	}
	
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICopiasBusiness#consultarTarifa(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CopiasDTO, co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionCopiasDTO)
	 */
	@Override
	public BigDecimal consultarTarifa(CopiasDTO ac_copiasDto,TransaccionCopiasDTO atc_transaccionCopiasDto)
	{
		List<TipoServicioCTSIWSDTO> llts_listaServicioTarifaWsDto = new ArrayList<>();
		TipoServicioCTSIWSDTO lts_tipoServicioCtsiWsDto = new TipoServicioCTSIWSDTO();
		lts_tipoServicioCtsiWsDto.setIs_subtipoServicio(atc_transaccionCopiasDto.getIdc_detalleCatalogoDto().getIs_idCodigoSubServicio());
		lts_tipoServicioCtsiWsDto.setIs_tipoServicio(atc_transaccionCopiasDto.getIdc_detalleCatalogoDto().getIs_idCodigoServicio());
		
		List<TipoCriterioCTSIWSDTO> lltc_criterios = new ArrayList<>();
		TipoCriterioCTSIWSDTO ltc_tipoCriterioCtsiWsDto = new TipoCriterioCTSIWSDTO();
		
		ltc_tipoCriterioCtsiWsDto.setIs_codigo(EnumCriterio.COPIAS_ID_SOLICITUD.getIs_criterio());
		ltc_tipoCriterioCtsiWsDto.setIs_valor(ac_copiasDto.getIs_dId());
		lltc_criterios.add(ltc_tipoCriterioCtsiWsDto);
		lts_tipoServicioCtsiWsDto.setIltc_criterios(lltc_criterios);
		llts_listaServicioTarifaWsDto.add(lts_tipoServicioCtsiWsDto);
		TipoSalidaConsultarTarifaServicioWSDTO ltscts_tipoSalidaConsultarTaroifaWsDto;
		ltscts_tipoSalidaConsultarTaroifaWsDto =  
				iiif_interfacesFinancierasBusiness.consultarTarifaServicio(llts_listaServicioTarifaWsDto, atc_transaccionCopiasDto.getIp_personaDto());
		return ltscts_tipoSalidaConsultarTaroifaWsDto.getIlts_listaTipoServiciosTarifadosWsDto().iterator().next().getIbd_valorServicio();
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICopiasBusiness#cancelarTransaccionVigente(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.interfaces.ITransaccionDTO)
	 */
	@Override
	public boolean cancelarTransaccionVigente(ITransaccionDTO ait_transaccionDto) {
		return iic_carritoBusiness.cancelarCarrito(ait_transaccionDto,EnumTipoProceso.COPIAS);
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICopiasBusiness#generarSolicitud(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionCopiasDTO)
	 */
	@Override
	public String generarSolicitud(TransaccionCopiasDTO atc_transaccionCopiasDto) {
		TipoEntradaIngresoSolicitudCopiasWSDTO lteisc_tipoEntradaIngresoSolicitudCopiasWsDto = new TipoEntradaIngresoSolicitudCopiasWSDTO();
		List<DocumentoSGDWSDTO> lld_documentoSgdWsDto = new ArrayList<>();
		for(CopiasDTO lc_copiasDto :atc_transaccionCopiasDto.getIlc_listaCopiasDto())
		{
			DocumentoSGDWSDTO ld_documentoSgdWsDto = new DocumentoSGDWSDTO();
			ld_documentoSgdWsDto.setIs_dId(lc_copiasDto.getIs_dId());
			ld_documentoSgdWsDto.setIs_docName(lc_copiasDto.getIs_documentoNombre());
			ld_documentoSgdWsDto.setIs_tipoDocumental(lc_copiasDto.getIs_tipoDocumento());
			lld_documentoSgdWsDto.add(ld_documentoSgdWsDto);
		}
		lteisc_tipoEntradaIngresoSolicitudCopiasWsDto.setIld_documentoSgdWsDto(lld_documentoSgdWsDto);
		TipoSalidaIngresoSolicitudCopiasWSDTO ltsisc_tipoSalidaIngresoSolicitudCopiasWsDto;
		ltsisc_tipoSalidaIngresoSolicitudCopiasWsDto = iisc_solicitudCopiasBusiness.ingresoSolicitudCopias(lteisc_tipoEntradaIngresoSolicitudCopiasWsDto);
		UtilidadExcepciones.manejadorExcepcionesServicios(ltsisc_tipoSalidaIngresoSolicitudCopiasWsDto);
		return ltsisc_tipoSalidaIngresoSolicitudCopiasWsDto.getIs_idSolicitudCopias();
	}


}

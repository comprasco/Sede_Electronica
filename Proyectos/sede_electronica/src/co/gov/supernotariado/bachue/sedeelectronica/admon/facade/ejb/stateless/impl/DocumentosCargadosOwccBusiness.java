/**
 * --------------------------------------
 * Nombre del archivo: DocumentosCargadosOwccBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl
 * Nombre del elemento: DocumentosCargadosOwccBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IDocumentosCargadosOwccBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITransaccionFormularioBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IValorCampoFormularioBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CargaDocumentosFormularioDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.DocumentosCargadosOwccDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.SoporteTransaccionDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionFormularioDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionSolicitudModeloDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IDocumentosCargadosOwccDAO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.ITransaccionFormularioDAO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper.DocumentosCargadosOwccHelper;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.DocumentosCargadosOwcc;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IEnvioDocumentosBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaEnviarDocumentoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoParametroWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaEnviarDocumentoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.cache.impl.CacheGeneral;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumCriterio;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumServicioEnvioDocumentos;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadAuditoria;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadExcepciones;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadFecha;

/**
 * Clase tipo EJB (Enterprise Java Bean) de la capa de negocio. <br>
 * Contiene la implementacion logica de las operaciones del recurso Documentos
 * cargados owcc. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless(name = "DocumentosCargadosOwccBusiness", mappedName = "DocumentosCargadosOwccBusiness")
@LocalBean
public class DocumentosCargadosOwccBusiness extends CacheGeneral<DocumentosCargadosOwccDTO>
		implements IDocumentosCargadosOwccBusiness {



	/**
	 * Atributo de instancia tipo IDocumentosCargadosOwccDAO para definir la
	 * propiedad documentos cargados oracle web center content dao.
	 */
	@EJB
	private IDocumentosCargadosOwccDAO iidco_documentosCargadosOwccDao;
	
	/**
	 * Atributo de instancia tipo IDocumentosCargadosOwccBusiness para definir la
	 * propiedad documentos cargados oracle web center content business.
	 */
	@EJB
	private IDocumentosCargadosOwccBusiness iidco_documentosCargadosOwccBusiness;
	
	/**
	 * Atributo de instancia tipo ITransaccionFormularioBusiness para definir la
	 * propiedad transaccion formulario business.
	 */
	@EJB
	private ITransaccionFormularioBusiness iitf_transaccionFormularioBusiness;
	
	/**
	 * Atributo de instancia tipo IValorCampoFormularioBusiness para definir la
	 * propiedad valor campo formulario business.
	 */
	@EJB
	private IValorCampoFormularioBusiness iivcf_valorCampoFormularioBusiness;
	
	/**
	 * Atributo de instancia tipo ITransaccionFormularioDAO para definir la
	 * propiedad transaccion formulario dao.
	 */
	@EJB
	private ITransaccionFormularioDAO iitf_transaccionFormularioDao;
	
	/**
	 * Atributo de instancia tipo IEnvioDocumentosBusiness para definir la propiedad
	 * envio documentos business.
	 */
	@EJB
	private IEnvioDocumentosBusiness iied_envioDocumentosBusiness;

	/**
	 * Define la constante CS_TURNO.
	 */
	private static final String CS_TURNO = "//";

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IDocumentosCargadosOwccBusiness#cargarDocumentosBD(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.DocumentosCargadosOwccDTO)
	 */
	@Override
	public void cargarDocumentosBD(DocumentosCargadosOwccDTO adco_documentosCargadosOwccDto) {
		adco_documentosCargadosOwccDto = (DocumentosCargadosOwccDTO) UtilidadAuditoria
				.adicionarDatosCreacion(adco_documentosCargadosOwccDto);
		iidco_documentosCargadosOwccDao.cargarDocumentosBD(DocumentosCargadosOwccHelper
				.dtoAEntidadCompleto(adco_documentosCargadosOwccDto, new DocumentosCargadosOwcc()));
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IDocumentosCargadosOwccBusiness#eliminarDocumentosCargados(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionFormularioDTO)
	 */
	@Override
	public void eliminarDocumentosCargados(TransaccionFormularioDTO atf_transaccionFormularioDto) {
		borrarDocumentosCargadosOwcc(atf_transaccionFormularioDto.getIs_nir());
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IDocumentosCargadosOwccBusiness#eliminarDocumentosCargadosAlertaTierras(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionSolicitudModeloDTO)
	 */
	@Override
	public void eliminarDocumentosCargadosAlertaTierras(
			TransaccionSolicitudModeloDTO atsm_transaccionSolicitudModeloAlertaTierrasDto) {
		borrarDocumentosCargadosOwcc(atsm_transaccionSolicitudModeloAlertaTierrasDto.getIs_nir());
	}

	/**
	 * Borrar documentos cargados oracle web center content.
	 *
	 * @param as_consultaNir el parametro consulta nir
	 */
	private void borrarDocumentosCargadosOwcc(String as_consultaNir) {
		iidco_documentosCargadosOwccDao.borrarDocumentosCargadosOwcc(as_consultaNir);

	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IDocumentosCargadosOwccBusiness#consultarFormularioCuentaCupo(java.lang.String, co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioDTO, java.lang.String)
	 */
	@Override
	public Boolean consultarFormularioCuentaCupo(String as_nombreFormulario, UsuarioDTO au_usuarioDto, String as_nir) {
		return iidco_documentosCargadosOwccDao.consultarFormularioCuentaCupo(as_nombreFormulario, au_usuarioDto, as_nir);
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IDocumentosCargadosOwccBusiness#consultarDocumentosPorNir(java.lang.String)
	 */
	@Override
	public List<DocumentosCargadosOwccDTO> consultarDocumentosPorNir(String as_nir) {
		return DocumentosCargadosOwccHelper
				.listaEntidadADtoSimple(iidco_documentosCargadosOwccDao.consultaNirDocumentosCargados(as_nir));
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IDocumentosCargadosOwccBusiness#servicioCargarArchivos(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CargaDocumentosFormularioDTO, co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionFormularioDTO)
	 */
	@Override
	public TipoSalidaEnviarDocumentoWSDTO servicioCargarArchivos(
			CargaDocumentosFormularioDTO acdf_cargarDocumentosFormularioDto,
			TransaccionFormularioDTO atf_transaccionFormularioDto) {

		TipoEntradaEnviarDocumentoWSDTO lteed_tipoEntradaEnviarDocumentosWsDto = new TipoEntradaEnviarDocumentoWSDTO();
		lteed_tipoEntradaEnviarDocumentosWsDto
				.setIb_archivo(acdf_cargarDocumentosFormularioDto.getIa_archivoDto().getIf_archivo());
		lteed_tipoEntradaEnviarDocumentosWsDto
				.setIs_nombreArchivo(acdf_cargarDocumentosFormularioDto.getIa_archivoDto().getIs_nombreArchivo());
		List<TipoParametroWSDTO> altp_listaTipoParametro = new ArrayList<>();
		TipoParametroWSDTO ltp_tipoParametroWsDto = new TipoParametroWSDTO();
		ltp_tipoParametroWsDto.setIs_nombre(EnumServicioEnvioDocumentos.NIR.getIs_criterio());
		ltp_tipoParametroWsDto.setIs_valor(atf_transaccionFormularioDto.getIs_nir());
		altp_listaTipoParametro.add(ltp_tipoParametroWsDto);
		ltp_tipoParametroWsDto = new TipoParametroWSDTO();
		ltp_tipoParametroWsDto.setIs_nombre(EnumServicioEnvioDocumentos.TIPO_DOCUMENTAL.getIs_criterio());
		ltp_tipoParametroWsDto.setIs_valor(acdf_cargarDocumentosFormularioDto.getIcd_catalogoDocumentoDto().getIs_codigoValor());
		altp_listaTipoParametro.add(ltp_tipoParametroWsDto);
		lteed_tipoEntradaEnviarDocumentosWsDto.setIltp_listaTipoParametro(altp_listaTipoParametro);
		lteed_tipoEntradaEnviarDocumentosWsDto.setIs_repositorio(EnumServicioEnvioDocumentos.TEMPORAL.getIs_criterio());
		lteed_tipoEntradaEnviarDocumentosWsDto.setIs_sistemaOrigen(EnumCriterio.CANAL_ORIGEN.getIs_criterio());
		TipoSalidaEnviarDocumentoWSDTO ltsed_tipoSalidaEnviarDocumentoWsDto = iied_envioDocumentosBusiness
				.enviarDocumentos(lteed_tipoEntradaEnviarDocumentosWsDto);

		ltsed_tipoSalidaEnviarDocumentoWsDto.setIs_dId(ltsed_tipoSalidaEnviarDocumentoWsDto.getIs_dId());

		DocumentosCargadosOwccDTO ldco_documentosCargadosOwccDto = new DocumentosCargadosOwccDTO();
		ldco_documentosCargadosOwccDto.setIs_nir(atf_transaccionFormularioDto.getIs_nir());
		ldco_documentosCargadosOwccDto.setIs_idOwcc(ltsed_tipoSalidaEnviarDocumentoWsDto.getIs_dId());
		ldco_documentosCargadosOwccDto.setIs_tipoDocumental(acdf_cargarDocumentosFormularioDto.getIcd_catalogoDocumentoDto().getIs_codigoValor());
		ldco_documentosCargadosOwccDto.setIs_nombreDocumento(acdf_cargarDocumentosFormularioDto.getIa_archivoDto().getIs_nombreArchivo());
		iidco_documentosCargadosOwccBusiness.cargarDocumentosBD(ldco_documentosCargadosOwccDto);

		return ltsed_tipoSalidaEnviarDocumentoWsDto;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IDocumentosCargadosOwccBusiness#servicioCargarArchivos(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CargaDocumentosFormularioDTO, java.lang.String)
	 */
	@Override
	public TipoSalidaEnviarDocumentoWSDTO servicioCargarArchivos(
			SoporteTransaccionDTO ast_cargarDocumentosCE, String as_nir) {
		TipoEntradaEnviarDocumentoWSDTO lteed_tipoEntradaEnviarDocumentosWsDto = new TipoEntradaEnviarDocumentoWSDTO();
		lteed_tipoEntradaEnviarDocumentosWsDto
				.setIb_archivo(ast_cargarDocumentosCE.getIa_archivoDto().getIf_archivo());
		lteed_tipoEntradaEnviarDocumentosWsDto
				.setIs_nombreArchivo(ast_cargarDocumentosCE.getIa_archivoDto().getIs_nombreArchivo());
		List<TipoParametroWSDTO> altp_listaTipoParametro = new ArrayList<>();
		TipoParametroWSDTO ltp_tipoParametroWsDto = new TipoParametroWSDTO();
		ltp_tipoParametroWsDto.setIs_nombre(EnumServicioEnvioDocumentos.NIR.getIs_criterio());
		ltp_tipoParametroWsDto.setIs_valor(as_nir);
		altp_listaTipoParametro.add(ltp_tipoParametroWsDto);
		ltp_tipoParametroWsDto = new TipoParametroWSDTO();
		ltp_tipoParametroWsDto.setIs_nombre(EnumServicioEnvioDocumentos.TIPO_DOCUMENTAL.getIs_criterio());
		ltp_tipoParametroWsDto.setIs_valor(ast_cargarDocumentosCE.getIcd_catalogoDocumentoDto().getIs_codigoValor());
		altp_listaTipoParametro.add(ltp_tipoParametroWsDto);
		lteed_tipoEntradaEnviarDocumentosWsDto.setIltp_listaTipoParametro(altp_listaTipoParametro);
		lteed_tipoEntradaEnviarDocumentosWsDto.setIs_repositorio(EnumServicioEnvioDocumentos.FINAL.getIs_criterio());
		lteed_tipoEntradaEnviarDocumentosWsDto.setIs_sistemaOrigen(EnumCriterio.CANAL_ORIGEN.getIs_criterio());
		TipoSalidaEnviarDocumentoWSDTO ltsed_tipoSalidaEnviarDocumentoWsDto = iied_envioDocumentosBusiness
				.enviarDocumentos(lteed_tipoEntradaEnviarDocumentosWsDto);

		ltsed_tipoSalidaEnviarDocumentoWsDto.setIs_dId(ltsed_tipoSalidaEnviarDocumentoWsDto.getIs_dId());

		DocumentosCargadosOwccDTO ldco_documentosCargadosOwccDto = new DocumentosCargadosOwccDTO();
		ldco_documentosCargadosOwccDto.setIs_nir(as_nir);
		ldco_documentosCargadosOwccDto.setIs_idOwcc(ltsed_tipoSalidaEnviarDocumentoWsDto.getIs_dId());
		ldco_documentosCargadosOwccDto.setIs_tipoDocumental(ast_cargarDocumentosCE.getIcd_catalogoDocumentoDto().getIs_codigoValor());
		ldco_documentosCargadosOwccDto.setIs_nombreDocumento(ast_cargarDocumentosCE.getIa_archivoDto().getIs_nombreArchivo());
		ldco_documentosCargadosOwccDto.setIs_observaciones(ast_cargarDocumentosCE.getIs_observacion());
		iidco_documentosCargadosOwccBusiness.cargarDocumentosBD(ldco_documentosCargadosOwccDto);
		return ltsed_tipoSalidaEnviarDocumentoWsDto;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IDocumentosCargadosOwccBusiness#servicioCargarAlerta(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CargaDocumentosFormularioDTO, co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionSolicitudModeloDTO)
	 */
	@Override
	public TipoSalidaEnviarDocumentoWSDTO servicioCargarAlerta(
			CargaDocumentosFormularioDTO acdf_cargarDocumentoAlertaTierrasDto,
			TransaccionSolicitudModeloDTO atsm_transaccionSolicitudModeloDto) {
		TipoEntradaEnviarDocumentoWSDTO lteed_tipoEntradaEnviarDocumentosWsDto = new TipoEntradaEnviarDocumentoWSDTO();
		lteed_tipoEntradaEnviarDocumentosWsDto
				.setIb_archivo(acdf_cargarDocumentoAlertaTierrasDto.getIa_archivoDto().getIf_archivo());
		lteed_tipoEntradaEnviarDocumentosWsDto
				.setIs_nombreArchivo(acdf_cargarDocumentoAlertaTierrasDto.getIa_archivoDto().getIs_nombreArchivo());
		List<TipoParametroWSDTO> altp_listaTipoParametro = new ArrayList<>();
		TipoParametroWSDTO ltp_tipoParametroWsDto = new TipoParametroWSDTO();
		ltp_tipoParametroWsDto.setIs_nombre(EnumServicioEnvioDocumentos.NIR.getIs_criterio());
		ltp_tipoParametroWsDto.setIs_valor(atsm_transaccionSolicitudModeloDto.getIs_nir());
		altp_listaTipoParametro.add(ltp_tipoParametroWsDto);
		ltp_tipoParametroWsDto = new TipoParametroWSDTO();
		ltp_tipoParametroWsDto.setIs_nombre(EnumServicioEnvioDocumentos.TIPO_DOCUMENTAL.getIs_criterio());
		ltp_tipoParametroWsDto.setIs_valor(acdf_cargarDocumentoAlertaTierrasDto.getIcd_catalogoDocumentoDto().getIs_codigoValor());
		altp_listaTipoParametro.add(ltp_tipoParametroWsDto);
		lteed_tipoEntradaEnviarDocumentosWsDto.setIltp_listaTipoParametro(altp_listaTipoParametro);
		lteed_tipoEntradaEnviarDocumentosWsDto.setIs_repositorio(EnumServicioEnvioDocumentos.FINAL.getIs_criterio());
		lteed_tipoEntradaEnviarDocumentosWsDto.setIs_sistemaOrigen(EnumCriterio.CANAL_ORIGEN.getIs_criterio());
		TipoSalidaEnviarDocumentoWSDTO ltsed_tipoSalidaEnviarDocumentoWsDto = iied_envioDocumentosBusiness
				.enviarDocumentos(lteed_tipoEntradaEnviarDocumentosWsDto);

		ltsed_tipoSalidaEnviarDocumentoWsDto.setIs_dId(ltsed_tipoSalidaEnviarDocumentoWsDto.getIs_dId());

		DocumentosCargadosOwccDTO ldco_documentosCargadosOwccDto = new DocumentosCargadosOwccDTO();
		ldco_documentosCargadosOwccDto.setIs_nir(atsm_transaccionSolicitudModeloDto.getIs_nir());
		ldco_documentosCargadosOwccDto.setIs_idOwcc(ltsed_tipoSalidaEnviarDocumentoWsDto.getIs_dId());
		ldco_documentosCargadosOwccDto
				.setIs_tipoDocumental(acdf_cargarDocumentoAlertaTierrasDto.getIcd_catalogoDocumentoDto().getIs_codigoValor());
		ldco_documentosCargadosOwccDto
				.setIs_nombreDocumento(acdf_cargarDocumentoAlertaTierrasDto.getIa_archivoDto().getIs_nombreArchivo());
		iidco_documentosCargadosOwccBusiness.cargarDocumentosBD(ldco_documentosCargadosOwccDto);
		return ltsed_tipoSalidaEnviarDocumentoWsDto;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IDocumentosCargadosOwccBusiness#cargarArchivo(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.SoporteTransaccionDTO, java.lang.String)
	 */
	@Override
	public TipoSalidaEnviarDocumentoWSDTO cargarArchivo(SoporteTransaccionDTO ast_soporteTransaccionDto, String as_nir) {
		TipoEntradaEnviarDocumentoWSDTO lteed_tipoEntradaEnviarDocumentosWsDto = new TipoEntradaEnviarDocumentoWSDTO();
		lteed_tipoEntradaEnviarDocumentosWsDto
				.setIb_archivo(ast_soporteTransaccionDto.getIa_archivoDto().getIf_archivo());
		lteed_tipoEntradaEnviarDocumentosWsDto
				.setIs_nombreArchivo(ast_soporteTransaccionDto.getIa_archivoDto().getIs_nombreArchivo());
		List<TipoParametroWSDTO> altp_listaTipoParametro = new ArrayList<>();
		TipoParametroWSDTO ltp_tipoParametroWsDto = new TipoParametroWSDTO();
		ltp_tipoParametroWsDto.setIs_nombre(EnumServicioEnvioDocumentos.NIR.getIs_criterio());
		ltp_tipoParametroWsDto.setIs_valor(as_nir);
		altp_listaTipoParametro.add(ltp_tipoParametroWsDto);
		ltp_tipoParametroWsDto = new TipoParametroWSDTO();
		ltp_tipoParametroWsDto.setIs_nombre(EnumServicioEnvioDocumentos.TIPO_DOCUMENTAL.getIs_criterio());
		ltp_tipoParametroWsDto.setIs_valor(ast_soporteTransaccionDto.getIcd_catalogoDocumentoDto().getIs_codigoValor());
		altp_listaTipoParametro.add(ltp_tipoParametroWsDto);
		lteed_tipoEntradaEnviarDocumentosWsDto.setIltp_listaTipoParametro(altp_listaTipoParametro);
		lteed_tipoEntradaEnviarDocumentosWsDto.setIs_repositorio(EnumServicioEnvioDocumentos.FINAL.getIs_criterio());
		lteed_tipoEntradaEnviarDocumentosWsDto.setIs_sistemaOrigen(EnumCriterio.CANAL_ORIGEN.getIs_criterio());
		TipoSalidaEnviarDocumentoWSDTO ltsed_tipoSalidaEnviarDocumentoWsDto = iied_envioDocumentosBusiness
				.enviarDocumentos(lteed_tipoEntradaEnviarDocumentosWsDto);
		
		UtilidadExcepciones.manejadorExcepcionesServicios(ltsed_tipoSalidaEnviarDocumentoWsDto);
		DocumentosCargadosOwccDTO ldco_documentosCargadosOwccDto = new DocumentosCargadosOwccDTO();
		ldco_documentosCargadosOwccDto.setIs_nir(as_nir);
		ldco_documentosCargadosOwccDto.setIs_idOwcc(ltsed_tipoSalidaEnviarDocumentoWsDto.getIs_dId());
		ldco_documentosCargadosOwccDto.setIs_nombreTipoDocumental(ast_soporteTransaccionDto.getIcd_catalogoDocumentoDto().getIs_nombre());
		ldco_documentosCargadosOwccDto.setIs_tipoDocumental(ast_soporteTransaccionDto.getIcd_catalogoDocumentoDto().getIs_codigoValor());
		ldco_documentosCargadosOwccDto
				.setIs_nombreDocumento(ast_soporteTransaccionDto.getIa_archivoDto().getIs_nombreArchivo());
		if(ast_soporteTransaccionDto.getIs_observacion() != null && !ast_soporteTransaccionDto.getIs_observacion().isEmpty()) {
			ldco_documentosCargadosOwccDto.setIs_observaciones(ast_soporteTransaccionDto.getIs_turno().concat(CS_TURNO)
				.concat(ast_soporteTransaccionDto.getIs_observacion()));
		}else {
			if(ast_soporteTransaccionDto.getId_fechaDocumento() != null)
			ldco_documentosCargadosOwccDto.setIs_observaciones(ast_soporteTransaccionDto.getIs_turno().concat(CS_TURNO)
					.concat(UtilidadFecha.formatearFecha(ast_soporteTransaccionDto.getId_fechaDocumento())));
		}
		iidco_documentosCargadosOwccBusiness.cargarDocumentosBD(ldco_documentosCargadosOwccDto);
		return ltsed_tipoSalidaEnviarDocumentoWsDto;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IDocumentosCargadosOwccBusiness#consultaNirDocumentosCargados(java.lang.String)
	 */
	@Override
	public List<DocumentosCargadosOwccDTO> consultaNirDocumentosCargados(String as_nir) {
		List<DocumentosCargadosOwcc> lldco_documentosCargadosOwcc = iidco_documentosCargadosOwccDao
				.consultaNirDocumentosCargados(as_nir);
		if (Objects.isNull(lldco_documentosCargadosOwcc))
			return new ArrayList<>();
		List<DocumentosCargadosOwccDTO> lldco_documentosCargadosOwccDto;
		lldco_documentosCargadosOwccDto = DocumentosCargadosOwccHelper
				.listaEntidadADtoSimple(lldco_documentosCargadosOwcc);
		return lldco_documentosCargadosOwccDto;
	}

}

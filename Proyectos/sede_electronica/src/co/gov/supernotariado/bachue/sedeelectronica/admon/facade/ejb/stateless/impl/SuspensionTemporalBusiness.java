package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IDocumentosCargadosOwccBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ISuspensionTemporalBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITipoProcesoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITransaccionSolicitudModeloBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.GenericoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TipoProcesoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionSinPagoGenericaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionSolicitudModeloDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionSuspensionTemporalDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IUsuarioDAO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IDatosRegistralesBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IEnvioDocumentosBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.ISolicitudSuspensionTemporalBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.ISolicitudesSinPagoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoCriterioWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumBoolean;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumCriterio;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumEstadoSolicitudSinPago;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoProceso;

/**
 * Clase tipo EJB (Enterprise Java Bean) de la capa de negocio. <br>
 * Contiene la implementacion logica de las operaciones del recurso
 * Suspensiones. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless(name = "SuspensionTemporalBusiness", mappedName = "SuspensionTemporalBusiness")
@LocalBean
public class SuspensionTemporalBusiness extends GenericoTransaccionModeloBusiness implements ISuspensionTemporalBusiness {
	
	/**
	 * Atributo de instancia tipo IDatosRegistralesBusiness para definir la
	 * propiedad datos registrales business.
	 */
	@EJB
	private IDatosRegistralesBusiness iidr_datosRegistralesBusiness;
	
	/**
	 * Atributo de instancia tipo ISolicitudesSinPagoBusiness para definir la
	 * propiedad solicitudes sin pago business.
	 */
	@EJB
	private ISolicitudesSinPagoBusiness iissp_solicitudesSinPagoBusiness;
	
	/**
	 * Atributo de instancia tipo IEnvioDocumentosBusiness para definir la propiedad
	 * envio documentos business.
	 */
	@EJB
	private IEnvioDocumentosBusiness iied_envioDocumentosBusiness;
	
	/**
	 * Atributo de instancia tipo IUsuarioDAO para definir la propiedad usuario dao.
	 */
	@EJB
	private IUsuarioDAO iiu_usuarioDao;

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICorreccionesBusiness#iniciarTransaccionCorreccion()
	 */
	
	/**
	 * Atributo de instancia tipo ITipoProcesoBusiness para definir la propiedad
	 * tipo proceso business.
	 */
	@EJB
	private ITipoProcesoBusiness iitp_tipoProcesoBusiness;
	
	/**
	 * Atributo de instancia tipo ITransaccionSolicitudModeloBusiness para definir
	 * la propiedad transaccion solicitud modelo business.
	 */
	@EJB
	private ITransaccionSolicitudModeloBusiness iitsm_transaccionSolicitudModeloBusiness;
	
	/**
	 * Atributo de instancia tipo IDocumentosCargadosOwccBusiness para definir la
	 * propiedad documentos cargados oracle web center content business.
	 */
	@EJB
	private IDocumentosCargadosOwccBusiness iidco_documentosCargadosOwccBusiness;
	
	/**
	 * Atributo de instancia tipo ISolicitudCorreccionesBusiness para definir la
	 * propiedad solicitud correcciones business.
	 */
	@EJB
	private ISolicitudSuspensionTemporalBusiness iisst_solicitudSuspensionTemporal;

	
	@Override
	public TransaccionSuspensionTemporalDTO iniciarTransaccionSuspensionTemporal() {
		TipoProcesoDTO ltp_tipoProcesoDto = iitp_tipoProcesoBusiness
				.consultarTipoProcesoPorCodigo(EnumTipoProceso.SUSPENSION_TEMPORAL.getIs_codigo());
		TransaccionSuspensionTemporalDTO ltst_suspensionTemporalDto = new TransaccionSuspensionTemporalDTO();
		ltst_suspensionTemporalDto.setIeessp_enumEstadoSolicitudSinPago(EnumEstadoSolicitudSinPago.EN_CURSO);
		ltst_suspensionTemporalDto.setIp_personaDto(consultarUsuarioSession());
		ltst_suspensionTemporalDto.setItp_tipoProcesoDto(ltp_tipoProcesoDto);
		return ltst_suspensionTemporalDto;
	}


	@Override
	public String generarSuspensionTemporal(TransaccionSuspensionTemporalDTO atst_suspensionTemporalDto) {
		List<TipoCriterioWSDTO> lltc_tipoCriterio = new ArrayList<>();
		TipoCriterioWSDTO ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
		ltc_tipoCriterioWsDto.setIs_codigo(EnumCriterio.TURNO_IR.getIs_criterio());
		ltc_tipoCriterioWsDto.setIs_valor(atst_suspensionTemporalDto.getIssr_seguimientoSolicitudesRespuestaDto().getIs_numeroTurno());
		lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);
		
		ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
		ltc_tipoCriterioWsDto.setIs_codigo(EnumCriterio.TIPO_RECURSO_IR.getIs_criterio());
		ltc_tipoCriterioWsDto.setIs_valor(atst_suspensionTemporalDto.getIdc_detalleCatalgoDto().getIs_codigoServicio());
		lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);
		
		ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
		ltc_tipoCriterioWsDto.setIs_codigo(EnumCriterio.CALIDAD_SOLICITANTE_IR.getIs_criterio());
		ltc_tipoCriterioWsDto.setIs_valor(atst_suspensionTemporalDto.getIs_solicitante());
		lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);
		
		ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
		ltc_tipoCriterioWsDto.setIs_codigo(EnumCriterio.EMAIL_IR.getIs_criterio());
		ltc_tipoCriterioWsDto.setIs_valor(atst_suspensionTemporalDto.getIp_personaDto().getIu_usuarioDto().getIs_correoElectronico());
		lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);
		
		ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
		ltc_tipoCriterioWsDto.setIs_codigo(EnumCriterio.DOCUMENTOS_SOLICITADOS_IR.getIs_criterio());
		ltc_tipoCriterioWsDto.setIs_valor(atst_suspensionTemporalDto.getIs_tiposDocumentales());
		lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);
		
		ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
		ltc_tipoCriterioWsDto.setIs_codigo(EnumCriterio.OBSERVACION_IR.getIs_criterio());
		ltc_tipoCriterioWsDto.setIs_valor(atst_suspensionTemporalDto.getIs_observaciones());
		lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);
		return generarSolicitudGenerico(atst_suspensionTemporalDto,lltc_tipoCriterio);
		
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICorreccionesBusiness#guardarTransaccion(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionCorreccionDTO)
	 */
	@Override
	public Boolean guardarTransaccion(TransaccionSuspensionTemporalDTO atst_transaccionSuspensionTemporalDto) {
		TransaccionSolicitudModeloDTO ltsm_transaccionSolicitudModeloDto = iitsm_transaccionSolicitudModeloBusiness
				.consultarTransaccionSolicitudModeloVigente(atst_transaccionSuspensionTemporalDto);
		if (ltsm_transaccionSolicitudModeloDto == null)
			ltsm_transaccionSolicitudModeloDto = new TransaccionSolicitudModeloDTO();
		ltsm_transaccionSolicitudModeloDto.setIs_activo(EnumBoolean.CHAR_S.getIs_codigo());
		ltsm_transaccionSolicitudModeloDto.setIs_estadoTransaccion(
				atst_transaccionSuspensionTemporalDto.getIeessp_enumEstadoSolicitudSinPago().getIs_codigo());
		ltsm_transaccionSolicitudModeloDto
				.setIs_modeloTransaccionVigente(atst_transaccionSuspensionTemporalDto.toString());
		ltsm_transaccionSolicitudModeloDto.setIu_idUsuario(atst_transaccionSuspensionTemporalDto.getIp_personaDto().getIu_usuarioDto());
		ltsm_transaccionSolicitudModeloDto.setItp_tipoProcesoDto(atst_transaccionSuspensionTemporalDto.getItp_tipoProcesoDto());
		ltsm_transaccionSolicitudModeloDto.setIs_nir(atst_transaccionSuspensionTemporalDto.getIs_nir());
		iitsm_transaccionSolicitudModeloBusiness.crearTransaccionSolicitudModelo(ltsm_transaccionSolicitudModeloDto);
		return true;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICorreccionesBusiness#consultarTransaccionVigente(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionCorreccionDTO)
	 */
	@Override
	public TransaccionSuspensionTemporalDTO consultarTransaccionVigenteSuspension(TransaccionSuspensionTemporalDTO atst_suspensionTemporalDto) {
		TransaccionSinPagoGenericaDTO ltspg_transaccionSinPagoGenericaDto = consultarTransaccionVigenteGenerico(atst_suspensionTemporalDto);
		TransaccionSuspensionTemporalDTO ltst_suspensionTemporalDto = new TransaccionSuspensionTemporalDTO(ltspg_transaccionSinPagoGenericaDto);
		if(ltspg_transaccionSinPagoGenericaDto.getIs_modeloTransaccionRecuperado() != null &&  !ltspg_transaccionSinPagoGenericaDto.getIs_modeloTransaccionRecuperado().isEmpty()) {
			ltst_suspensionTemporalDto =(TransaccionSuspensionTemporalDTO) GenericoDTO
					.toObject(ltspg_transaccionSinPagoGenericaDto.getIs_modeloTransaccionRecuperado(), TransaccionSuspensionTemporalDTO.class);
			ltst_suspensionTemporalDto.setIlst_soportesTransaccionCargadosDto(ltspg_transaccionSinPagoGenericaDto.getIlst_soportesTransaccionCargadosDto());
		}
		return ltst_suspensionTemporalDto;
	}
	
	
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICorreccionesBusiness#eliminarTransaccion(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionCorreccionDTO)
	 */
	@Override
	public TransaccionSuspensionTemporalDTO eliminarTransaccion(TransaccionSuspensionTemporalDTO atst_suspensionTemporalDto) {
		TransaccionSolicitudModeloDTO ltsm_transaccionSolicitudModeloDto = iitsm_transaccionSolicitudModeloBusiness
				.consultarTransaccionSolicitudModeloVigente(atst_suspensionTemporalDto);
		iitsm_transaccionSolicitudModeloBusiness.eliminarTransaccionSolicitudModelo(ltsm_transaccionSolicitudModeloDto);
		return iniciarTransaccionSuspensionTemporal();
	}
}

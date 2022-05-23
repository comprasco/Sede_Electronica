/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: TransaccionSolicitudModeloBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl
 * Nombre del elemento: TransaccionSolicitudModeloBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICatalogoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IDetalleCatalogoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITipoProcesoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITransaccionSolicitudModeloBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IUsuarioBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CargueAlertaTierrasDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CatalogoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.DetalleCatalogoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.InactivarAlertaEntradaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TipoProcesoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionSinPagoGenericaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionSolicitudModeloDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioSesionDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.ITransaccionSolicitudModeloDAO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper.TipoProcesoHelper;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper.TransaccionSolicitudModeloHelper;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper.UsuarioHelper;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.TipoProceso;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.TransaccionSolicitudModelo;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Usuario;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.ISolicitudesSinPagoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoCriterioWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaGenerarSolicitudWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaGenerarSolicitudWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoServicioGSIWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSolicitanteGSIWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.cache.impl.CacheGeneral;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumBoolean;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumCatalogoTipoServicio;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumCriterio;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumEstadoSolicitudSinPago;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadAuditoria;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadAutoridadUsuario;

/**
 * Clase tipo EJB (Enterprise Java Bean) de la capa de negocio. <br>
 * Contiene la implementacion logica de las operaciones del recurso Transaccion
 * solicitud modelo. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless(name = "TransaccionSolicitudModeloBusiness", mappedName = "TransaccionSolicitudModeloBusiness")
@LocalBean
public class TransaccionSolicitudModeloBusiness extends CacheGeneral<TransaccionSolicitudModeloDTO>
		implements ITransaccionSolicitudModeloBusiness {



	/**
	 * Atributo de instancia tipo ITransaccionSolicitudModeloDAO para definir la
	 * propiedad transaccion solicitud modelo dao.
	 */
	@EJB
	private ITransaccionSolicitudModeloDAO iitsm_transaccionSolicitudModeloDao;
	
	/**
	 * Atributo de instancia tipo IUsuarioBusiness para definir la propiedad usuario
	 * business.
	 */
	@EJB
	private IUsuarioBusiness iiub_usuarioBusiness;
	
	/**
	 * Atributo de instancia tipo ICatalogoBusiness para definir la propiedad
	 * catalogo business.
	 */
	@EJB
	private ICatalogoBusiness iic_catalogoBusiness;
	
	/**
	 * Atributo de instancia tipo IDetalleCatalogoBusiness para definir la propiedad
	 * detalle catalogo business.
	 */
	@EJB
	private IDetalleCatalogoBusiness iidc_detalleCatalogoBusiness;
	
	/**
	 * Atributo de instancia tipo ISolicitudesSinPagoBusiness para definir la
	 * propiedad solicitud sin pago business.
	 */
	@EJB
	private ISolicitudesSinPagoBusiness iisspb_solicitudSinPagoBusiness;
	
	/**
	 * Atributo de instancia tipo ITipoProcesoBusiness para definir la propiedad
	 * tipo proceso business.
	 */
	@EJB
	private ITipoProcesoBusiness iitp_tipoProcesoBusiness;

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITransaccionSolicitudModeloBusiness#crearTransaccionSolicitudModelo(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionSolicitudModeloDTO)
	 */
	@Override
	public void crearTransaccionSolicitudModelo(TransaccionSolicitudModeloDTO atsm_transaccionSolicitudModeloDto) {
		if (atsm_transaccionSolicitudModeloDto.getIs_id() == null) {
			atsm_transaccionSolicitudModeloDto = (TransaccionSolicitudModeloDTO) UtilidadAuditoria
					.adicionarDatosCreacion(atsm_transaccionSolicitudModeloDto);
			iitsm_transaccionSolicitudModeloDao.crearTransaccionSolicitudModelo(TransaccionSolicitudModeloHelper
					.dtoAEntidadCompleto(atsm_transaccionSolicitudModeloDto, new TransaccionSolicitudModelo()));
		} else {
			atsm_transaccionSolicitudModeloDto = (TransaccionSolicitudModeloDTO) UtilidadAuditoria
					.adicionarDatosModificacion(atsm_transaccionSolicitudModeloDto);
			iitsm_transaccionSolicitudModeloDao
					.modificarTransaccionSolicitudModelo(TransaccionSolicitudModeloHelper
							.dtoAEntidadCompleto(atsm_transaccionSolicitudModeloDto, new TransaccionSolicitudModelo()));
		}
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITransaccionSolicitudModeloBusiness#consultarTransaccionSolicitudModeloVigente(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionSinPagoGenericaDTO)
	 */
	@Override
	public TransaccionSolicitudModeloDTO consultarTransaccionSolicitudModeloVigente(
			TransaccionSinPagoGenericaDTO atspg_transaccionSinPagoGenericaDto) {
		TipoProceso ltp_tipoProceso = TipoProcesoHelper
				.dtoAEntidadSimple(atspg_transaccionSinPagoGenericaDto.getItp_tipoProcesoDto(), new TipoProceso());
		Usuario lu_usuarioDto = UsuarioHelper.dtoAEntidadSimple(atspg_transaccionSinPagoGenericaDto.getIp_personaDto().getIu_usuarioDto(),
				new Usuario());
		TransaccionSolicitudModelo ltsm_transaccionSolicitudModelo;
		ltsm_transaccionSolicitudModelo = iitsm_transaccionSolicitudModeloDao
				.consultarTransaccionSolicitudModeloVigente(lu_usuarioDto, ltp_tipoProceso);
		if (ltsm_transaccionSolicitudModelo == null)
			return null;
		return TransaccionSolicitudModeloHelper.entidadADtoCompleto(ltsm_transaccionSolicitudModelo);
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITransaccionSolicitudModeloBusiness#eliminarTransaccionSolicitudModelo(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionSolicitudModeloDTO)
	 */
	@Override
	public Boolean eliminarTransaccionSolicitudModelo(
			TransaccionSolicitudModeloDTO atsm_transaccionSolicitudModeloDto) {
		iitsm_transaccionSolicitudModeloDao.eliminarTansaccion(TransaccionSolicitudModeloHelper
				.dtoAEntidadSimple(atsm_transaccionSolicitudModeloDto, new TransaccionSolicitudModelo()));
		return true;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITransaccionSolicitudModeloBusiness#generarNirAlertaTierras(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CargueAlertaTierrasDTO)
	 */
	@Override
	public TransaccionSolicitudModeloDTO generarNirAlertaTierras(CargueAlertaTierrasDTO acat_cargueAlertaTierrasDto) {
		UsuarioSesionDTO lus_usuarioSesionDto;
		lus_usuarioSesionDto = UtilidadAutoridadUsuario.consultarUsuarioSesion();
		UsuarioDTO lu_usuarioDto = new UsuarioDTO();
		lu_usuarioDto.setIs_id(lus_usuarioSesionDto.getIs_idUsuario());
		lu_usuarioDto = iiub_usuarioBusiness
				.consultarUsuarioConDireccionYPersonaJuridica(lus_usuarioSesionDto.getIs_nombreUsuario());
		TipoEntradaGenerarSolicitudWSDTO ltegs_tipoEntradaGenerarSolicitudWsDto = new TipoEntradaGenerarSolicitudWSDTO();
		ltegs_tipoEntradaGenerarSolicitudWsDto.setIs_modulo(EnumCriterio.CANAL_ORIGEN.getIs_criterio());

		TipoSolicitanteGSIWSDTO ltsg_solicitante = new TipoSolicitanteGSIWSDTO();
		ltsg_solicitante.setIs_numeroDocumento(lu_usuarioDto.getIs_entidadEspecial());
		ltsg_solicitante.setIs_tipoDocumento(lu_usuarioDto.getIs_usuario());
		ltsg_solicitante.setIs_tipoPersona(lu_usuarioDto.getIs_rol());

		ltegs_tipoEntradaGenerarSolicitudWsDto.setItsgv_solicitante(ltsg_solicitante);

		TipoServicioGSIWSDTO lts_tipoServicioGsiWsDto = new TipoServicioGSIWSDTO();
		CatalogoDTO lc_catalogoDto = iic_catalogoBusiness
				.consultarCatalogoCodigoValor(EnumCatalogoTipoServicio.ALERTA_TIERRAS.getIs_codigo());
		DetalleCatalogoDTO ldc_detalleCatalogoDto = iidc_detalleCatalogoBusiness
				.consultarDetalleCatalogo(lc_catalogoDto);
		lts_tipoServicioGsiWsDto.setIs_tipoServicio(ldc_detalleCatalogoDto.getIs_codigoServicio());
		lts_tipoServicioGsiWsDto.setIs_subTipoServicio(ldc_detalleCatalogoDto.getIs_codigoSubServicio());

		List<TipoCriterioWSDTO> lltc_tipoCriterio = new ArrayList<>();

		TipoCriterioWSDTO ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
		ltc_tipoCriterioWsDto.setIs_codigo(EnumCriterio.NOMBRE_OFICINA_ORIGEN.getIs_criterio());
		ltc_tipoCriterioWsDto.setIs_valor(acat_cargueAlertaTierrasDto.getIs_nombreOficinaOrigen());
		lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);

		ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
		ltc_tipoCriterioWsDto.setIs_codigo(EnumCriterio.TIPO_DOCUMENTO_ALERTA.getIs_criterio());
		ltc_tipoCriterioWsDto.setIs_valor(acat_cargueAlertaTierrasDto.getIs_tipoDocumentoAlerta());
		lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);

		ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
		ltc_tipoCriterioWsDto.setIs_codigo(EnumCriterio.NUMERO_DOCUMENTO_ALERTA.getIs_criterio());
		ltc_tipoCriterioWsDto.setIs_valor(acat_cargueAlertaTierrasDto.getIs_numeroDocumentoAlerta());
		lts_tipoServicioGsiWsDto.setIltc_tipoCriterio(lltc_tipoCriterio);

		List<TipoServicioGSIWSDTO> lltsg_listaTipoServicioGsiWsDto = new ArrayList<>();
		lltsg_listaTipoServicioGsiWsDto.add(lts_tipoServicioGsiWsDto);
		ltegs_tipoEntradaGenerarSolicitudWsDto.setIltsgw_servicios(lltsg_listaTipoServicioGsiWsDto);

		TipoSalidaGenerarSolicitudWSDTO ltsgs_tipoSalidaGenerarSolicitudWsDto = iisspb_solicitudSinPagoBusiness
				.generarSolicitud(ltegs_tipoEntradaGenerarSolicitudWsDto);

		TransaccionSolicitudModeloDTO ltsm_transaccionSolicitudModeloDto = new TransaccionSolicitudModeloDTO();
		ltsm_transaccionSolicitudModeloDto.setIs_nir(ltsgs_tipoSalidaGenerarSolicitudWsDto.getIs_nir());
		ltsm_transaccionSolicitudModeloDto
		.setIs_estadoTransaccion(EnumEstadoSolicitudSinPago.EN_CURSO.getIs_codigo());
		ltsm_transaccionSolicitudModeloDto.setIu_idUsuario(lu_usuarioDto);
		ltsm_transaccionSolicitudModeloDto.setIs_modeloTransaccionVigente(ltsgs_tipoSalidaGenerarSolicitudWsDto.getIs_codigoEstadoSolicitud());
		TipoProcesoDTO itp_tipoProcesoDto = iitp_tipoProcesoBusiness.consultarTipoProcesoPorCodigo(EnumCatalogoTipoServicio.ALERTA_TIERRAS.getIs_codigo());
		ltsm_transaccionSolicitudModeloDto.setItp_tipoProcesoDto(itp_tipoProcesoDto);
		ltsm_transaccionSolicitudModeloDto.setIs_activo(EnumBoolean.CHAR_S.getIs_codigo());

		guardarTransaccionAlertaTierras(ltsm_transaccionSolicitudModeloDto);
		return ltsm_transaccionSolicitudModeloDto;
	}
	
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITransaccionSolicitudModeloBusiness#generarNirInactivarAlertaTierras(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.InactivarAlertaEntradaDTO)
	 */
	@Override
	public TransaccionSolicitudModeloDTO generarNirInactivarAlertaTierras(InactivarAlertaEntradaDTO aiae_inactivarAlertaTierrasDto) {
		UsuarioSesionDTO lus_usuarioSesionDto;
		lus_usuarioSesionDto = UtilidadAutoridadUsuario.consultarUsuarioSesion();
		UsuarioDTO lu_usuarioDto = new UsuarioDTO();
		lu_usuarioDto.setIs_id(lus_usuarioSesionDto.getIs_idUsuario());
		lu_usuarioDto = iiub_usuarioBusiness
				.consultarUsuarioConDireccionYPersonaJuridica(lus_usuarioSesionDto.getIs_nombreUsuario());
		TipoEntradaGenerarSolicitudWSDTO ltegs_tipoEntradaGenerarSolicitudWsDto = new TipoEntradaGenerarSolicitudWSDTO();
		ltegs_tipoEntradaGenerarSolicitudWsDto.setIs_modulo(EnumCriterio.CANAL_ORIGEN.getIs_criterio());

		TipoSolicitanteGSIWSDTO ltsgv_solicitante = new TipoSolicitanteGSIWSDTO();
		ltsgv_solicitante.setIs_numeroDocumento(lu_usuarioDto.getIs_entidadEspecial());
		ltsgv_solicitante.setIs_tipoDocumento(lu_usuarioDto.getIs_usuario());
		ltsgv_solicitante.setIs_tipoPersona(lu_usuarioDto.getIs_rol());

		ltegs_tipoEntradaGenerarSolicitudWsDto.setItsgv_solicitante(ltsgv_solicitante);

		TipoServicioGSIWSDTO lts_tipoServicioGsiWsDto = new TipoServicioGSIWSDTO();
		CatalogoDTO lc_catalogoDto = iic_catalogoBusiness
				.consultarCatalogoCodigoValor(EnumCatalogoTipoServicio.ALERTA_TIERRAS.getIs_codigo());
		DetalleCatalogoDTO ldc_detalleCatalogoDto = iidc_detalleCatalogoBusiness
				.consultarDetalleCatalogo(lc_catalogoDto);
		lts_tipoServicioGsiWsDto.setIs_tipoServicio(ldc_detalleCatalogoDto.getIs_codigoServicio());
		lts_tipoServicioGsiWsDto.setIs_subTipoServicio(ldc_detalleCatalogoDto.getIs_codigoSubServicio());

		List<TipoCriterioWSDTO> lltc_tipoCriterio = new ArrayList<>();

		TipoCriterioWSDTO ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
		ltc_tipoCriterioWsDto.setIs_codigo(EnumCriterio.ID_ALERTA.getIs_criterio());
		ltc_tipoCriterioWsDto.setIs_valor(aiae_inactivarAlertaTierrasDto.getIi_idAlerta().toString());
		lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);

		ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
		ltc_tipoCriterioWsDto.setIs_codigo(EnumCriterio.ID_MOTIVO.getIs_criterio());
		ltc_tipoCriterioWsDto.setIs_valor(aiae_inactivarAlertaTierrasDto.getIs_idMotivo());
		lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);

		ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
		ltc_tipoCriterioWsDto.setIs_codigo(EnumCriterio.TXT_INACTIVACION.getIs_criterio());
		ltc_tipoCriterioWsDto.setIs_valor(aiae_inactivarAlertaTierrasDto.getIs_txtInactivacion());
		lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);
		
		ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
		ltc_tipoCriterioWsDto.setIs_codigo(EnumCriterio.TIPO_OFICINA.getIs_criterio());
		ltc_tipoCriterioWsDto.setIs_valor(aiae_inactivarAlertaTierrasDto.getIs_tipoOficina());
		lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);
		
		ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
		ltc_tipoCriterioWsDto.setIs_codigo(EnumCriterio.NOMBRE_OFICINA_ORIGEN.getIs_criterio());
		ltc_tipoCriterioWsDto.setIs_valor(aiae_inactivarAlertaTierrasDto.getIs_nombreOficinaOrigen());
		lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);
		
		
		ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
		ltc_tipoCriterioWsDto.setIs_codigo(EnumCriterio.TIPO_DOCUMENTO_ALERTA.getIs_criterio());
		ltc_tipoCriterioWsDto.setIs_valor(aiae_inactivarAlertaTierrasDto.getIs_tipoDocumentoInactivacion());
		lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);
		
		
		ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
		ltc_tipoCriterioWsDto.setIs_codigo(EnumCriterio.NUMERO_DOCUMENTO_ALERTA.getIs_criterio());
		ltc_tipoCriterioWsDto.setIs_valor(aiae_inactivarAlertaTierrasDto.getIs_numeroDocInactivacion());
		lts_tipoServicioGsiWsDto.setIltc_tipoCriterio(lltc_tipoCriterio);

		List<TipoServicioGSIWSDTO> lltsg_listaTipoServicioGsiWsDto = new ArrayList<>();
		lltsg_listaTipoServicioGsiWsDto.add(lts_tipoServicioGsiWsDto);
		ltegs_tipoEntradaGenerarSolicitudWsDto.setIltsgw_servicios(lltsg_listaTipoServicioGsiWsDto);

		TipoSalidaGenerarSolicitudWSDTO ltsgs_tipoSalidaGenerarSolicitudWsDto = iisspb_solicitudSinPagoBusiness
				.generarSolicitud(ltegs_tipoEntradaGenerarSolicitudWsDto);

		TransaccionSolicitudModeloDTO ltsm_transaccionSolicitudModeloDto = new TransaccionSolicitudModeloDTO();
		ltsm_transaccionSolicitudModeloDto.setIs_nir(ltsgs_tipoSalidaGenerarSolicitudWsDto.getIs_nir());
		ltsm_transaccionSolicitudModeloDto
		.setIs_estadoTransaccion(EnumEstadoSolicitudSinPago.EN_CURSO.getIs_codigo());
		ltsm_transaccionSolicitudModeloDto.setIu_idUsuario(lu_usuarioDto);

		guardarTransaccionAlertaTierras(ltsm_transaccionSolicitudModeloDto);
		return ltsm_transaccionSolicitudModeloDto;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITransaccionSolicitudModeloBusiness#guardarTransaccionAlertaTierras(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionSolicitudModeloDTO)
	 */
	@Override
	public void guardarTransaccionAlertaTierras(TransaccionSolicitudModeloDTO atsm_transaccionSolicitudModeloDto) {
		atsm_transaccionSolicitudModeloDto = (TransaccionSolicitudModeloDTO) UtilidadAuditoria
				.adicionarDatosCreacion(atsm_transaccionSolicitudModeloDto);
		iitsm_transaccionSolicitudModeloDao.crearTransaccionSolicitudModelo(TransaccionSolicitudModeloHelper
				.dtoAEntidadCompleto(atsm_transaccionSolicitudModeloDto, new TransaccionSolicitudModelo()));
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITransaccionSolicitudModeloBusiness#consultarNIR(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionSolicitudModeloDTO)
	 */
	@Override
	public TransaccionSolicitudModeloDTO consultarNIR(TransaccionSolicitudModeloDTO atsm_transaccionSolicitudModeloDto) {
		TransaccionSolicitudModeloDTO ltsm_transaccionSolicitudModeloDto;
		ltsm_transaccionSolicitudModeloDto = TransaccionSolicitudModeloHelper
				.entidadADtoCompleto(iitsm_transaccionSolicitudModeloDao.consultarNir(TransaccionSolicitudModeloHelper
						.dtoAEntidadSimple(atsm_transaccionSolicitudModeloDto, new TransaccionSolicitudModelo())));
		return ltsm_transaccionSolicitudModeloDto;
	}
	
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITransaccionSolicitudModeloBusiness#consultarNirEntidadEspecial(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionSolicitudModeloDTO)
	 */
	@Override
	public TransaccionSolicitudModeloDTO consultarNirEntidadEspecial(TransaccionSolicitudModeloDTO atsm_transaccionSolicitudModeloDto) {
		TransaccionSolicitudModeloDTO ltsm_transaccionSolicitudModeloDto;
		ltsm_transaccionSolicitudModeloDto = TransaccionSolicitudModeloHelper
				.entidadADtoUsuarioCompleto(iitsm_transaccionSolicitudModeloDao.consultarNir(TransaccionSolicitudModeloHelper
						.dtoAEntidadSimple(atsm_transaccionSolicitudModeloDto, new TransaccionSolicitudModelo())));
		return ltsm_transaccionSolicitudModeloDto;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITransaccionSolicitudModeloBusiness#eliminarTransaccionAlertaTierras(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionSolicitudModeloDTO)
	 */
	@Override
	public Boolean eliminarTransaccionAlertaTierras(TransaccionSolicitudModeloDTO atsm_transaccionAlertaTierrasDto) {
		Boolean lb_resultado = false;
		TransaccionSolicitudModelo ltsm_transaccionSolicitudModeloAlertaTierras = iitsm_transaccionSolicitudModeloDao
				.consultarNir(TransaccionSolicitudModeloHelper.dtoAEntidadSimple(atsm_transaccionAlertaTierrasDto,
						new TransaccionSolicitudModelo()));
		lb_resultado = iitsm_transaccionSolicitudModeloDao
				.eliminarTransaccionAlertaTierras(ltsm_transaccionSolicitudModeloAlertaTierras);
		
		return lb_resultado;
	}

}

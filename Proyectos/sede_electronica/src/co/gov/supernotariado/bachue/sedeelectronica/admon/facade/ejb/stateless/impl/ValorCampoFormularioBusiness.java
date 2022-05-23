/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ValorCampoFormularioBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl
 * Nombre del elemento: ValorCampoFormularioBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl;

import java.security.SecureRandom;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import co.gov.supernotariado.bachue.sedeelectronica.admon.exception.ExcepcionesNegocio;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICatalogoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IDetalleCatalogoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IFormularioUsuarioBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITransaccionFormularioBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IUsuarioBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IValorCampoFormularioBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CatalogoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ConfiguracionCampoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.DetalleCatalogoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.DireccionDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.DireccionDevolucionesDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.FormularioCrearCuentaCupoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.FormularioDevolucionConsignacionErradaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.FormularioDevolucionServicioRegistralDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.FormularioDevolucionesCuentaCupoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.FormularioModificarCuentaCupoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.FormularioUsuarioDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ProrrogaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionFormularioDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioSesionDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ValorCampoFormularioDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ValorCampoFormularioPKDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IConfiguracionCampoDAO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IConfiguracionFormularioDAO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IDocumentosCargadosOwccDAO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IFormularioUsuarioDAO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.ITransaccionFormularioDAO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IValorCampoFormularioDAO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper.ConfiguracionCampoHelper;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper.ConfiguracionFormularioHelper;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper.FormularioUsuarioHelper;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper.TransaccionFormularioHelper;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper.ValorCampoFormularioHelper;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.ConfiguracionCampo;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.ConfiguracionFormulario;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.FormularioUsuario;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.TransaccionFormulario;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.ValorCampoFormulario;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IGestionCuentaCupoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.ISolicitudesSinPagoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoAdminCICCIWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoCriterioWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarEstadoSolicitudWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarIDCuentaCupoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaGenerarSolicitudWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarEstadoSolicitudWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarIDCuentaCupoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaGenerarSolicitudWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoServicioGSIWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSolicitanteCESIWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSolicitanteGSIWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumBoolean;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumCatalogoTipoServicio;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumCodigosRespuestas;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumConfiguracionFormulario;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumConstantesDevoluciones;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumCriterio;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumEstadoSolicitudSinPago;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumFormatoFecha;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumNumeros;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumRol;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoPersona;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones.EnumExcepcionesCuentaCupo;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones.EnumExcepcionesGenerales;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.GeneradorGrowlGenerico;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadAuditoria;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadAutoridadUsuario;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadConstantesDevoluciones;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadExcepciones;

/**
 * Clase tipo EJB (Enterprise Java Bean) de la capa de negocio. <br>
 * Contiene la implementacion logica de las operaciones del recurso Valor campo
 * formulario. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless(name = "ValorCampoFormularioBusiness", mappedName = "ValorCampoFormularioBusiness")
@LocalBean
public class ValorCampoFormularioBusiness implements IValorCampoFormularioBusiness {

	/**
	 * Atributo de instancia tipo IConfiguracionFormularioDAO para definir la
	 * propiedad configuracion formulario dao.
	 */
	@EJB
	private IConfiguracionFormularioDAO iicf_configuracionFormularioDao;

	/**
	 * Atributo de instancia tipo IValorCampoFormularioDAO para definir la propiedad
	 * valor campo formulario dao.
	 */
	@EJB
	private IValorCampoFormularioDAO iivcf_valorCampoFormularioDao;

	/**
	 * Atributo de instancia tipo ITransaccionFormularioDAO para definir la
	 * propiedad transaccion formulario dao.
	 */
	@EJB
	private ITransaccionFormularioDAO iitf_transaccionFormularioDao;

	/**
	 * Atributo de instancia tipo IFormularioUsuarioDAO para definir la propiedad
	 * formulario usuario dao.
	 */
	@EJB
	private IFormularioUsuarioDAO iifu_formularioUsuarioDao;

	/**
	 * Atributo de instancia tipo IConfiguracionCampoDAO para definir la propiedad
	 * configuracion campo dao.
	 */
	@EJB
	private IConfiguracionCampoDAO iicc_configuracionCampoDao;

	/**
	 * Atributo de instancia tipo IDocumentosCargadosOwccDAO para definir la
	 * propiedad documentos cargados oracle web center content dao.
	 */
	@EJB
	private IDocumentosCargadosOwccDAO iidco_documentosCargadosOwccDao;

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
	 * Atributo de instancia tipo ITransaccionFormularioBusiness para definir la
	 * propiedad transaccion formulario business.
	 */
	@EJB
	private ITransaccionFormularioBusiness iitfb_transaccionFormularioBusiness;

	/**
	 * Atributo de instancia tipo IUsuarioBusiness para definir la propiedad usuario
	 * business.
	 */
	@EJB
	private IUsuarioBusiness iiub_usuarioBusiness;

	/**
	 * Atributo de instancia tipo IGestionCuentaCupoBusiness para definir la
	 * propiedad gestion cuenta cupo business.
	 */
	@EJB
	private IGestionCuentaCupoBusiness iigcc_gestionCuentaCupoBusiness;

	/**
	 * Atributo de instancia tipo IFormularioUsuarioBusiness para definir la
	 * propiedad formulario usuario business.
	 */
	@EJB
	private IFormularioUsuarioBusiness iifub_formularioUsuarioBusiness;

	/*
	 * (non-Javadoc)
	 * 
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.
	 * IValorCampoFormularioBusiness#consultarFormularioCuentaCupo(co.gov.
	 * supernotariado.bachue.sedeelectronica.common.enums.
	 * EnumConfiguracionFormulario)
	 */
	@Override
	public List<ValorCampoFormularioDTO> consultarFormulario(
			EnumConfiguracionFormulario aecf_enumConfiguracionFormulario) {
		UsuarioSesionDTO lus_usuarioSesionDto;
		lus_usuarioSesionDto = UtilidadAutoridadUsuario.consultarUsuarioSesion();
		UsuarioDTO lu_usuarioDto = new UsuarioDTO();
		lu_usuarioDto.setIs_id(lus_usuarioSesionDto.getIs_idUsuario());
		ConfiguracionFormulario lcf_configuracionFormulario = iicf_configuracionFormularioDao
				.consultarIdConfiguracionFormulario(aecf_enumConfiguracionFormulario.getIs_nombreFormulario());
		FormularioUsuario lfu_formularioUsuario = iifu_formularioUsuarioDao
				.consultarFormularioUsuario(lcf_configuracionFormulario, lus_usuarioSesionDto.getIs_idUsuario());
		if (lcf_configuracionFormulario == null) {
			throw new ExcepcionesNegocio(EnumExcepcionesCuentaCupo.TRANSACCION_EN_CURSO);
		}

		List<ValorCampoFormularioDTO> llvcf_listaValorCampoFormularioDto;
		llvcf_listaValorCampoFormularioDto = ValorCampoFormularioHelper
				.listaEntidadADtoCompleto(iivcf_valorCampoFormularioDao
						.consultarListaValorCampoFormulario(lcf_configuracionFormulario, lfu_formularioUsuario));
		return llvcf_listaValorCampoFormularioDto;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.
	 * IValorCampoFormularioBusiness#consultarFormularioCuentaCupo(co.gov.
	 * supernotariado.bachue.sedeelectronica.common.enums.
	 * EnumConfiguracionFormulario, java.lang.String)
	 */
	@Override
	public List<ValorCampoFormularioDTO> consultarFormulario(
			EnumConfiguracionFormulario aecf_enumConfiguracionFormulario, String as_idUsuario) {
		ConfiguracionFormulario lcf_configuracionFormulario = iicf_configuracionFormularioDao
				.consultarIdConfiguracionFormulario(aecf_enumConfiguracionFormulario.getIs_nombreFormulario());
		FormularioUsuario lfu_formularioUsuario = iifu_formularioUsuarioDao
				.consultarFormularioUsuario(lcf_configuracionFormulario, as_idUsuario);
		if (lcf_configuracionFormulario == null) {
			throw new ExcepcionesNegocio(EnumExcepcionesCuentaCupo.TRANSACCION_EN_CURSO);
		}

		List<ValorCampoFormularioDTO> llvcf_listaValorCampoFormularioDto;
		llvcf_listaValorCampoFormularioDto = ValorCampoFormularioHelper
				.listaEntidadADtoCompleto(iivcf_valorCampoFormularioDao
						.consultarListaValorCampoFormulario(lcf_configuracionFormulario, lfu_formularioUsuario));
		return llvcf_listaValorCampoFormularioDto;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.
	 * IValorCampoFormularioBusiness#guardarTransaccionTemporal(java.lang.String,
	 * java.lang.String, co.gov.supernotariado.bachue.sedeelectronica.common.enums.
	 * EnumConfiguracionFormulario)
	 */
	@Override
	public void guardarTransaccionTemporal(String as_campo, String as_valor,
			EnumConfiguracionFormulario aecf_nombreFormulario) {
		FormularioUsuarioDTO lfu_formularioUsuarioDto = consultarFormularioUsuario(aecf_nombreFormulario);

		ValorCampoFormularioDTO lvcf_valorCampoFormularioDto = new ValorCampoFormularioDTO();
		lvcf_valorCampoFormularioDto.setIfu_idFormularioUsuario(lfu_formularioUsuarioDto);
		lvcf_valorCampoFormularioDto
		.setIcf_idConfiguracionFormulario(lfu_formularioUsuarioDto.getIcf_idConfiguracionFormularioDto());
		ConfiguracionCampoDTO lcc_configuracionCampoDto = ConfiguracionCampoHelper
				.entidadADtoCompleto(iicc_configuracionCampoDao.consultarPorNombre(as_campo));
		lvcf_valorCampoFormularioDto.setIcc_idConfiguracionCampo(lcc_configuracionCampoDto);

		ValorCampoFormularioPKDTO lvcfp_idValorCampoFormularioDto = new ValorCampoFormularioPKDTO();

		lvcfp_idValorCampoFormularioDto.setIs_idConfiguracionCampo(
				lcc_configuracionCampoDto.getIccp_idConfiguracionFormularioDto().getIs_id());
		lvcfp_idValorCampoFormularioDto.setIs_idConfiguracionFormulario(
				lfu_formularioUsuarioDto.getIcf_idConfiguracionFormularioDto().getIs_id());
		lvcfp_idValorCampoFormularioDto.setIs_idFormularioUsuario(lfu_formularioUsuarioDto.getIs_id());
		String ls_valorAGuardar = as_valor;

		ValorCampoFormulario lvcf_valorCampoFormularioConsulta = iivcf_valorCampoFormularioDao
				.consultarValorCampoFormulario(ConfiguracionCampoHelper.dtoAEntidadCompleto(lcc_configuracionCampoDto,
						new ConfiguracionCampo()), lfu_formularioUsuarioDto.getIs_id());
		if (lvcf_valorCampoFormularioConsulta != null) {
			lvcf_valorCampoFormularioDto = ValorCampoFormularioHelper
					.entidadADtoCompleto(lvcf_valorCampoFormularioConsulta);
			lvcf_valorCampoFormularioDto.setIs_valor(ls_valorAGuardar);
			lvcf_valorCampoFormularioDto = (ValorCampoFormularioDTO) UtilidadAuditoria
					.adicionarDatosModificacion(lvcf_valorCampoFormularioDto);
			iivcf_valorCampoFormularioDao.actualizaValorCampoFormulario(ValorCampoFormularioHelper
					.dtoAEntidadCompleto(lvcf_valorCampoFormularioDto, new ValorCampoFormulario()));
		} else {
			lvcf_valorCampoFormularioDto.setIs_activo(EnumBoolean.CHAR_S.getIs_codigo());
			lvcf_valorCampoFormularioDto.setIs_valor(ls_valorAGuardar);
			lvcf_valorCampoFormularioDto = (ValorCampoFormularioDTO) UtilidadAuditoria
					.adicionarDatosCreacion(lvcf_valorCampoFormularioDto);
			iivcf_valorCampoFormularioDao.crearValorCampoFormulario(ValorCampoFormularioHelper
					.dtoAEntidadCompleto(lvcf_valorCampoFormularioDto, new ValorCampoFormulario()));
		}
	}

	/**
	 * Metodo encargado de consultar el todos los datos del formulario usuario.
	 *
	 * @param aecf_nombreFormulario el parametro nombre formulario
	 * @return Resultado para consultar formulario usuario retornado como
	 *         FormularioUsuarioDTO
	 */
	public FormularioUsuarioDTO consultarFormularioUsuario(EnumConfiguracionFormulario aecf_nombreFormulario) {
		UsuarioSesionDTO lus_usuarioSesionDto;
		lus_usuarioSesionDto = UtilidadAutoridadUsuario.consultarUsuarioSesion();
		ConfiguracionFormulario lcf_configuracionFormulario = iicf_configuracionFormularioDao
				.consultarIdConfiguracionFormulario(aecf_nombreFormulario.getIs_nombreFormulario());
		FormularioUsuario lfu_formularioUsuario = iifu_formularioUsuarioDao
				.consultarFormularioUsuario(lcf_configuracionFormulario, lus_usuarioSesionDto.getIs_idUsuario());
		FormularioUsuarioDTO lfu_formularioUsuarioDto;
		if (lfu_formularioUsuario == null) {
			FormularioUsuarioDTO lfu_formularioUsuarioTemporal = new FormularioUsuarioDTO();
			UsuarioDTO lud_usuarioDto = new UsuarioDTO(lus_usuarioSesionDto.getIs_idUsuario());
			lfu_formularioUsuarioTemporal.setIud_usuarioDto(lud_usuarioDto);
			lfu_formularioUsuarioTemporal.setIcf_idConfiguracionFormularioDto(
					ConfiguracionFormularioHelper.entidadADtoCompleto(lcf_configuracionFormulario));
			lfu_formularioUsuarioTemporal.setIs_activo(EnumBoolean.CHAR_S.getIs_codigo());
			lfu_formularioUsuarioTemporal = (FormularioUsuarioDTO) UtilidadAuditoria
					.adicionarDatosCreacion(lfu_formularioUsuarioTemporal);
			lfu_formularioUsuarioDto = FormularioUsuarioHelper
					.entidadADtoCompleto(iifu_formularioUsuarioDao.crearFormularioUsuario(FormularioUsuarioHelper
							.dtoAEntidadCompleto(lfu_formularioUsuarioTemporal, new FormularioUsuario())));
		} else {
			lfu_formularioUsuarioDto = FormularioUsuarioHelper.entidadADtoCompleto(lfu_formularioUsuario);
		}
		return lfu_formularioUsuarioDto;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.
	 * IValorCampoFormularioBusiness#eliminarFormularioCuentaCupo(java.util.List,
	 * co.gov.supernotariado.bachue.sedeelectronica.common.enums.
	 * EnumConfiguracionFormulario)
	 */
	@Override
	public Boolean eliminarFormulario(List<ValorCampoFormularioDTO> alvcf_listaValorCampoFormularioDto,
			EnumConfiguracionFormulario aecf_enumConfiguracionFormulario) {
		Boolean lb_resultado = false;
		if (alvcf_listaValorCampoFormularioDto == null || alvcf_listaValorCampoFormularioDto.isEmpty()) {
			alvcf_listaValorCampoFormularioDto = consultarFormulario(aecf_enumConfiguracionFormulario);
		}
		for (ValorCampoFormulario lvcf_valorCampoFormulario : ValorCampoFormularioHelper
				.listaDtoAEntidadCompleto(alvcf_listaValorCampoFormularioDto)) {
			lb_resultado = iivcf_valorCampoFormularioDao.eliminarFormulario(lvcf_valorCampoFormulario);
		}
		return lb_resultado;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.
	 * IValorCampoFormularioBusiness#eliminarTransaccionCuentaCupo(co.gov.
	 * supernotariado.bachue.sedeelectronica.admon.persistence.dto.
	 * TransaccionFormularioDTO)
	 */
	@Override
	public Boolean eliminarTransaccion(TransaccionFormularioDTO atf_transaccionFormularioDto) {
		Boolean lb_resultado = false;
		TransaccionFormulario ltf_transaccionFormulario = iitf_transaccionFormularioDao
				.consultarNir(TransaccionFormularioHelper.dtoAEntidadSimple(atf_transaccionFormularioDto,
						new TransaccionFormulario()));
		lb_resultado = iitf_transaccionFormularioDao.eliminarTransaccion(ltf_transaccionFormulario);
		return lb_resultado;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.
	 * IValorCampoFormularioBusiness#crearSolicitudCuentaCupo(co.gov.supernotariado.
	 * bachue.sedeelectronica.admon.persistence.dto.FormularioCrearCuentaCupoDTO,
	 * co.gov.supernotariado.bachue.sedeelectronica.common.enums.
	 * EnumConfiguracionFormulario)
	 */
	@Override
	public TransaccionFormularioDTO crearSolicitudCuentaCupo(
			FormularioCrearCuentaCupoDTO afccc_formularioCrearCuentaCupo,
			EnumConfiguracionFormulario aecf_nombreFormulario) {
		UsuarioSesionDTO lus_usuarioSesionDto;
		lus_usuarioSesionDto = UtilidadAutoridadUsuario.consultarUsuarioSesion();
		UsuarioDTO lu_usuarioDto = new UsuarioDTO();
		lu_usuarioDto.setIs_id(lus_usuarioSesionDto.getIs_idUsuario());
		lu_usuarioDto = iiub_usuarioBusiness
				.consultarUsuarioConDireccionYPersonaJuridica(lus_usuarioSesionDto.getIs_nombreUsuario());
		TipoEntradaGenerarSolicitudWSDTO ltegs_tipoEntradaGenerarSolicitudWsDto = new TipoEntradaGenerarSolicitudWSDTO();
		ltegs_tipoEntradaGenerarSolicitudWsDto.setIs_modulo(EnumCriterio.CANAL_ORIGEN.getIs_criterio());

		TipoSolicitanteGSIWSDTO ltsgv_solicitante = new TipoSolicitanteGSIWSDTO();
		ltsgv_solicitante.setIs_numeroDocumento(lu_usuarioDto.getIp_personaDto().getIs_numeroDocumento());
		ltsgv_solicitante.setIs_tipoDocumento(lu_usuarioDto.getIp_personaDto().getItd_tipoDocumentoDto().getIs_id());
		ltsgv_solicitante.setIs_tipoPersona(EnumTipoPersona.JURIDICA.getIs_codigo());

		ltegs_tipoEntradaGenerarSolicitudWsDto.setItsgv_solicitante(ltsgv_solicitante);

		TipoServicioGSIWSDTO lts_tipoServicioGsiWsDto = new TipoServicioGSIWSDTO();
		CatalogoDTO lc_catalogoDto = iic_catalogoBusiness
				.consultarCatalogoCodigoValor(EnumCatalogoTipoServicio.CREAR_CUENTA_CUPO.getIs_codigo());
		DetalleCatalogoDTO ldc_detalleCatalogoDto = iidc_detalleCatalogoBusiness
				.consultarDetalleCatalogo(lc_catalogoDto);
		lts_tipoServicioGsiWsDto.setIs_tipoServicio(ldc_detalleCatalogoDto.getIs_idCodigoServicio());
		lts_tipoServicioGsiWsDto.setIs_subTipoServicio(ldc_detalleCatalogoDto.getIs_idCodigoSubServicio());

		List<TipoCriterioWSDTO> lltc_tipoCriterio = new ArrayList<>();

		TipoCriterioWSDTO ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
		ltc_tipoCriterioWsDto.setIs_codigo(EnumCriterio.RAZON_SOCIAL_CC.getIs_criterio());
		ltc_tipoCriterioWsDto.setIs_valor(lu_usuarioDto.getIpj_personaJuridicaDto().getIs_razonSocial());
		lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);

		ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
		ltc_tipoCriterioWsDto.setIs_codigo(EnumCriterio.FECHA_DILIGENCIAMIENTO.getIs_criterio());
		Format lf_fecha = new SimpleDateFormat(EnumFormatoFecha.FORMATO_FECHA.getIs_formato());
		ltc_tipoCriterioWsDto.setIs_valor(lf_fecha.format(new Date()));
		lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);

		ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
		ltc_tipoCriterioWsDto.setIs_codigo(EnumCriterio.EMPRESA_TIPO_DOCUMENTO.getIs_criterio());
		ltc_tipoCriterioWsDto.setIs_valor(lu_usuarioDto.getIp_personaDto().getItd_tipoDocumentoDto().getIs_id());
		lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);

		ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
		ltc_tipoCriterioWsDto.setIs_codigo(EnumCriterio.EMPRESA_NUMERO_DOCUMENTO.getIs_criterio());
		ltc_tipoCriterioWsDto.setIs_valor(lu_usuarioDto.getIp_personaDto().getIs_numeroDocumento());
		lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);

		DireccionDTO ldd_personaDireccion = lu_usuarioDto.getIp_personaDto().getIlpd_personaDireccionsDto().iterator()
				.next();
		ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
		ltc_tipoCriterioWsDto.setIs_codigo(EnumCriterio.DIRECCION.getIs_criterio());
		ltc_tipoCriterioWsDto.setIs_valor(ldd_personaDireccion.getIs_direccionCompleta());
		lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);

		ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
		ltc_tipoCriterioWsDto.setIs_codigo(EnumCriterio.EMPRESA_DIGITO_VERIFICACION_NIT.getIs_criterio());
		ltc_tipoCriterioWsDto.setIs_valor(afccc_formularioCrearCuentaCupo.getIs_digitoVerificacion());
		lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);

		ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
		ltc_tipoCriterioWsDto.setIs_codigo(EnumCriterio.REPRESENTANTE_LEGAL_TIPO_DOCUMENTO.getIs_criterio());
		ltc_tipoCriterioWsDto.setIs_valor(afccc_formularioCrearCuentaCupo.getIs_tipoDocumentoRepresentanteLegal());
		lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);

		ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
		ltc_tipoCriterioWsDto.setIs_codigo(EnumCriterio.REPRESENTANTE_LEGAL_NUMERO_DOC.getIs_criterio());
		ltc_tipoCriterioWsDto.setIs_valor(afccc_formularioCrearCuentaCupo.getIs_numeroDocumentoRepresentanteLegal());
		lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);

		ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
		ltc_tipoCriterioWsDto.setIs_codigo(EnumCriterio.REPRESENTANTE_LEGAL_PRIMER_NOMBRE.getIs_criterio());
		ltc_tipoCriterioWsDto
		.setIs_valor(lu_usuarioDto.getIpj_personaJuridicaDto().getIs_primerNombreRepresentanteLegal());
		lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);

		ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
		ltc_tipoCriterioWsDto.setIs_codigo(EnumCriterio.REPRESENTANTE_LEGAL_SEGUNDO_NOMBRE.getIs_criterio());
		ltc_tipoCriterioWsDto
		.setIs_valor(lu_usuarioDto.getIpj_personaJuridicaDto().getIs_segundoNombreRepresentanteLegal());
		lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);

		ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
		ltc_tipoCriterioWsDto.setIs_codigo(EnumCriterio.REPRESENTANTE_LEGAL_PRIMER_APELLIDO.getIs_criterio());
		ltc_tipoCriterioWsDto
		.setIs_valor(lu_usuarioDto.getIpj_personaJuridicaDto().getIs_primerApellidoRepresentanteLegal());
		lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);

		ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
		ltc_tipoCriterioWsDto.setIs_codigo(EnumCriterio.REPRESENTANTE_LEGAL_SEGUNDO_APELLIDO.getIs_criterio());
		if (lu_usuarioDto.getIpj_personaJuridicaDto().getIs_segundoApellidoRepresentanteLegal() != null) {
			ltc_tipoCriterioWsDto
			.setIs_valor(lu_usuarioDto.getIpj_personaJuridicaDto().getIs_segundoApellidoRepresentanteLegal());
			lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);
		} else {
			ltc_tipoCriterioWsDto.setIs_valor("");
			lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);
		}

		ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
		ltc_tipoCriterioWsDto.setIs_codigo(EnumCriterio.REPRESENTANTE_LEGAL_CELULAR.getIs_criterio());
		ltc_tipoCriterioWsDto.setIs_valor(lu_usuarioDto.getIs_celular());
		lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);

		ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
		ltc_tipoCriterioWsDto.setIs_codigo(EnumCriterio.REPRESENTANTE_LEGAL_CORREO_ELECTRONICO.getIs_criterio());
		ltc_tipoCriterioWsDto.setIs_valor(lu_usuarioDto.getIs_correoElectronico());
		lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);

		ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
		ltc_tipoCriterioWsDto.setIs_codigo(EnumCriterio.OCUPACION.getIs_criterio());
		ltc_tipoCriterioWsDto.setIs_valor(afccc_formularioCrearCuentaCupo.getIs_ocupacionProfesion());
		lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);

		ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
		ltc_tipoCriterioWsDto.setIs_codigo(EnumCriterio.DESCRIPCION_ACTIVIDAD_ECONOMICA.getIs_criterio());
		ltc_tipoCriterioWsDto.setIs_valor(afccc_formularioCrearCuentaCupo.getIs_codigoActividadEconomica());
		lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);

		ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
		ltc_tipoCriterioWsDto.setIs_codigo(EnumCriterio.TIPO_EMPRESA.getIs_criterio());
		ltc_tipoCriterioWsDto.setIs_valor(
				lu_usuarioDto.getIpj_personaJuridicaDto().getIc_tipoCatalogoTipoOrganizacion().getIs_nombre());
		lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);

		ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
		ltc_tipoCriterioWsDto.setIs_codigo(EnumCriterio.MONTO_SOLICITADO.getIs_criterio());
		ltc_tipoCriterioWsDto.setIs_valor(afccc_formularioCrearCuentaCupo.getIs_montoSolicitado());
		lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);

		ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
		ltc_tipoCriterioWsDto.setIs_codigo(EnumCriterio.DESCRIPCION_FRECUENCIA_RECARGAS.getIs_criterio());
		ltc_tipoCriterioWsDto.setIs_valor(afccc_formularioCrearCuentaCupo.getIs_frecuenciaRecarga());
		lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);

		ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
		ltc_tipoCriterioWsDto.setIs_codigo(EnumCriterio.DESCRIPCION_NECESIDAD_DE_CUENTA_CUPO.getIs_criterio());
		ltc_tipoCriterioWsDto.setIs_valor(afccc_formularioCrearCuentaCupo.getIs_necesidadSolicitud());
		lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);

		ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
		ltc_tipoCriterioWsDto.setIs_codigo(EnumCriterio.DESCRIPCION_ORIGEN_RECURSOS.getIs_criterio());
		ltc_tipoCriterioWsDto.setIs_valor(afccc_formularioCrearCuentaCupo.getIs_declaracionJuramentada());
		lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);
		lts_tipoServicioGsiWsDto.setIltc_tipoCriterio(lltc_tipoCriterio);

		List<TipoServicioGSIWSDTO> lltsg_listaTipoServicioGsiWsDto = new ArrayList<>();
		lltsg_listaTipoServicioGsiWsDto.add(lts_tipoServicioGsiWsDto);
		ltegs_tipoEntradaGenerarSolicitudWsDto.setIltsgw_servicios(lltsg_listaTipoServicioGsiWsDto);

		TipoSalidaGenerarSolicitudWSDTO ltsgs_tipoSalidaGenerarSolicitudWsDto = iisspb_solicitudSinPagoBusiness
				.generarSolicitud(ltegs_tipoEntradaGenerarSolicitudWsDto);
		UtilidadExcepciones.manejadorExcepcionesServicios(ltsgs_tipoSalidaGenerarSolicitudWsDto);
		TransaccionFormularioDTO ltf_transaccionFormularioDto = new TransaccionFormularioDTO();
		if (!ltsgs_tipoSalidaGenerarSolicitudWsDto.getIs_codigoMensaje()
				.equals(EnumCodigosRespuestas.CODIGO_200.getIs_codigo())) {
			GeneradorGrowlGenerico
			.generarMensajeError(ltsgs_tipoSalidaGenerarSolicitudWsDto.getIs_descripcionMensaje());
		} else {
			ltf_transaccionFormularioDto = guardarTransaccionFormulario(aecf_nombreFormulario,
					ltsgs_tipoSalidaGenerarSolicitudWsDto.getIs_nir());
		}
		return ltf_transaccionFormularioDto;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.
	 * IValorCampoFormularioBusiness#crearSolicitudCuentaCupo(co.gov.supernotariado.
	 * bachue.sedeelectronica.admon.persistence.dto.FormularioCrearCuentaCupoDTO,
	 * co.gov.supernotariado.bachue.sedeelectronica.common.enums.
	 * EnumConfiguracionFormulario)
	 */
	public TransaccionFormularioDTO crearSolicitudProrroga(ProrrogaDTO ap_prorroga,
			EnumConfiguracionFormulario aecf_nombreFormulario) {
		UsuarioSesionDTO lus_usuarioSesionDto;
		lus_usuarioSesionDto = UtilidadAutoridadUsuario.consultarUsuarioSesion();
		UsuarioDTO lu_usuarioDto = new UsuarioDTO();
		lu_usuarioDto.setIs_id(lus_usuarioSesionDto.getIs_idUsuario());
		lu_usuarioDto = iiub_usuarioBusiness
				.consultarUsuarioConDireccionYPersonaJuridica(lus_usuarioSesionDto.getIs_nombreUsuario());
		TipoEntradaGenerarSolicitudWSDTO ltegs_tipoEntradaGenerarSolicitudWsDto = new TipoEntradaGenerarSolicitudWSDTO();
		ltegs_tipoEntradaGenerarSolicitudWsDto.setIs_modulo(EnumCriterio.CANAL_ORIGEN.getIs_criterio());

		TipoSolicitanteGSIWSDTO ltsgv_solicitante = new TipoSolicitanteGSIWSDTO();
		ltsgv_solicitante.setIs_numeroDocumento(lu_usuarioDto.getIp_personaDto().getIs_numeroDocumento());
		ltsgv_solicitante.setIs_tipoDocumento(lu_usuarioDto.getIp_personaDto().getItd_tipoDocumentoDto().getIs_id());
		ltsgv_solicitante.setIs_tipoPersona(EnumTipoPersona.JURIDICA.getIs_codigo());

		ltegs_tipoEntradaGenerarSolicitudWsDto.setItsgv_solicitante(ltsgv_solicitante);

		TipoServicioGSIWSDTO lts_tipoServicioGsiWsDto = new TipoServicioGSIWSDTO();
		CatalogoDTO lc_catalogoDto = iic_catalogoBusiness.consultarCatalogoCodigoValor(
				EnumCatalogoTipoServicio.DEVOLUCION_SERVICIO_REGISTRAL_PRORROGA.getIs_codigo());
		DetalleCatalogoDTO ldc_detalleCatalogoDto = iidc_detalleCatalogoBusiness
				.consultarDetalleCatalogo(lc_catalogoDto);
		lts_tipoServicioGsiWsDto.setIs_tipoServicio(ldc_detalleCatalogoDto.getIs_idCodigoServicio());
		lts_tipoServicioGsiWsDto.setIs_subTipoServicio(ldc_detalleCatalogoDto.getIs_idCodigoSubServicio());

		List<TipoCriterioWSDTO> lltc_tipoCriterio = new ArrayList<>();
		//--- VOY AQUI ---//
		TipoCriterioWSDTO ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
		ltc_tipoCriterioWsDto.setIs_codigo(EnumCriterio.FECHA_DILIGENCIAMIENTO.getIs_criterio());
		Format lf_fecha = new SimpleDateFormat(EnumFormatoFecha.FORMATO_FECHA.getIs_formato());
		ltc_tipoCriterioWsDto.setIs_valor(lf_fecha.format(new Date()));
		lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);

		if(lu_usuarioDto.getIpj_personaJuridicaDto() != null) {
			ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
			ltc_tipoCriterioWsDto.setIs_codigo(EnumCriterio.RAZON_SOCIAL_CC.getIs_criterio());
			ltc_tipoCriterioWsDto.setIs_valor(lu_usuarioDto.getIpj_personaJuridicaDto().getIs_razonSocial());
			lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);
			
			ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
			ltc_tipoCriterioWsDto.setIs_codigo(EnumCriterio.TIPO_EMPRESA.getIs_criterio());
			ltc_tipoCriterioWsDto.setIs_valor(
					lu_usuarioDto.getIpj_personaJuridicaDto().getIc_tipoCatalogoTipoOrganizacion().getIs_nombre());
			lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);
		}

		ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
		ltc_tipoCriterioWsDto.setIs_codigo(EnumCriterio.EMPRESA_TIPO_DOCUMENTO.getIs_criterio());
		ltc_tipoCriterioWsDto.setIs_valor(lu_usuarioDto.getIp_personaDto().getItd_tipoDocumentoDto().getIs_id());
		lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);

		ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
		ltc_tipoCriterioWsDto.setIs_codigo(EnumCriterio.EMPRESA_NUMERO_DOCUMENTO.getIs_criterio());
		ltc_tipoCriterioWsDto.setIs_valor(lu_usuarioDto.getIp_personaDto().getIs_numeroDocumento());
		lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);

		DireccionDTO ldd_personaDireccion = lu_usuarioDto.getIp_personaDto().getIlpd_personaDireccionsDto().iterator()
				.next();
		ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
		ltc_tipoCriterioWsDto.setIs_codigo(EnumCriterio.DIRECCION.getIs_criterio());
		ltc_tipoCriterioWsDto.setIs_valor(ldd_personaDireccion.getIs_direccionCompleta());
		lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);

		ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
		ltc_tipoCriterioWsDto.setIs_codigo(EnumCriterio.REPRESENTANTE_LEGAL_CELULAR.getIs_criterio());
		ltc_tipoCriterioWsDto.setIs_valor(lu_usuarioDto.getIs_celular());
		lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);

		ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
		ltc_tipoCriterioWsDto.setIs_codigo(EnumCriterio.REPRESENTANTE_LEGAL_CORREO_ELECTRONICO.getIs_criterio());
		ltc_tipoCriterioWsDto.setIs_valor(lu_usuarioDto.getIs_correoElectronico());
		lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);

		List<TipoServicioGSIWSDTO> lltsg_listaTipoServicioGsiWsDto = new ArrayList<>();
		lts_tipoServicioGsiWsDto.setIltc_tipoCriterio(lltc_tipoCriterio);
		lltsg_listaTipoServicioGsiWsDto.add(lts_tipoServicioGsiWsDto);
		ltegs_tipoEntradaGenerarSolicitudWsDto.setIltsgw_servicios(lltsg_listaTipoServicioGsiWsDto);

		TipoSalidaGenerarSolicitudWSDTO ltsgs_tipoSalidaGenerarSolicitudWsDto = iisspb_solicitudSinPagoBusiness
				.generarSolicitud(ltegs_tipoEntradaGenerarSolicitudWsDto);
		UtilidadExcepciones.manejadorExcepcionesServicios(ltsgs_tipoSalidaGenerarSolicitudWsDto);
		TransaccionFormularioDTO ltf_transaccionFormularioDto = new TransaccionFormularioDTO();
		if (!ltsgs_tipoSalidaGenerarSolicitudWsDto.getIs_codigoMensaje()
				.equals(EnumCodigosRespuestas.CODIGO_200.getIs_codigo())) {
			GeneradorGrowlGenerico
			.generarMensajeError(ltsgs_tipoSalidaGenerarSolicitudWsDto.getIs_descripcionMensaje());
		} else {
			ltf_transaccionFormularioDto = guardarTransaccionFormulario(aecf_nombreFormulario,
					ltsgs_tipoSalidaGenerarSolicitudWsDto.getIs_nir());
		}
		return ltf_transaccionFormularioDto;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.
	 * IValorCampoFormularioBusiness#crearSolicitudDevolucionConsignacionErrada(co.
	 * gov.supernotariado. bachue.sedeelectronica.admon.persistence.dto.
	 * FormularioDevolcionConsignacionErradaDTO,
	 * co.gov.supernotariado.bachue.sedeelectronica.common.enums.
	 * EnumConfiguracionFormulario)
	 */
	@Override
	public TransaccionFormularioDTO crearSolicitudDevolucionConsignacionErrada(
			FormularioDevolucionConsignacionErradaDTO afdce_formularioDevolcionConsignacionErradaDto,
			EnumConfiguracionFormulario aecf_nombreFormulario) {
		TransaccionFormularioDTO ltf_transaccionFormularioDto = new TransaccionFormularioDTO();
		UsuarioSesionDTO lus_usuarioSesionDto;
		lus_usuarioSesionDto = UtilidadAutoridadUsuario.consultarUsuarioSesion();
		UsuarioDTO lu_usuarioDto = new UsuarioDTO();
		lu_usuarioDto.setIs_id(lus_usuarioSesionDto.getIs_idUsuario());

		TipoEntradaGenerarSolicitudWSDTO ltegs_tipoEntradaGenerarSolicitudWsDto = new TipoEntradaGenerarSolicitudWSDTO();
		ltegs_tipoEntradaGenerarSolicitudWsDto.setIs_modulo(EnumCriterio.CANAL_ORIGEN.getIs_criterio());

		TipoServicioGSIWSDTO lts_tipoServicioGsiWsDto = new TipoServicioGSIWSDTO();
		CatalogoDTO lc_catalogoDto = iic_catalogoBusiness
				.consultarCatalogoCodigoValor(EnumCatalogoTipoServicio.DEVOLUCION_CONSIGNACION_ERRADA_CREAR.getIs_codigo());
		DetalleCatalogoDTO ldc_detalleCatalogoDto = iidc_detalleCatalogoBusiness
				.consultarDetalleCatalogo(lc_catalogoDto);
		lts_tipoServicioGsiWsDto.setIs_tipoServicio(ldc_detalleCatalogoDto.getIs_idCodigoServicio());
		lts_tipoServicioGsiWsDto.setIs_subTipoServicio(ldc_detalleCatalogoDto.getIs_idCodigoSubServicio());

		List<TipoCriterioWSDTO> lltc_tipoCriterio;
		TipoCriterioWSDTO ltc_tipoCriterioWsDto;

		if (lus_usuarioSesionDto.getIs_rol().equals(EnumRol.ADMIN_PERSONA_JURIDICA.getIs_rol())) {
			lu_usuarioDto = iiub_usuarioBusiness
					.consultarUsuarioConDireccionYPersonaJuridica(lus_usuarioSesionDto.getIs_nombreUsuario());
			TipoSolicitanteGSIWSDTO ltsgv_solicitante = new TipoSolicitanteGSIWSDTO();
			ltsgv_solicitante.setIs_numeroDocumento(lu_usuarioDto.getIp_personaDto().getIs_numeroDocumento());
			ltsgv_solicitante
			.setIs_tipoDocumento(lu_usuarioDto.getIp_personaDto().getItd_tipoDocumentoDto().getIs_id());
			ltsgv_solicitante.setIs_tipoPersona(EnumTipoPersona.JURIDICA.getIs_codigo());

			ltegs_tipoEntradaGenerarSolicitudWsDto.setItsgv_solicitante(ltsgv_solicitante);

			List<TipoCriterioWSDTO> lltc_tipoCriterioWsDto = UtilidadConstantesDevoluciones
					.validarNoTitularPersonaJuridica(afdce_formularioDevolcionConsignacionErradaDto, lu_usuarioDto);
			lltc_tipoCriterio = lltc_tipoCriterioWsDto;
		} else {
			lu_usuarioDto = iiub_usuarioBusiness
					.consultarUsuarioConDireccion(lus_usuarioSesionDto.getIs_nombreUsuario());

			TipoSolicitanteGSIWSDTO ltsgv_solicitante = new TipoSolicitanteGSIWSDTO();
			ltsgv_solicitante.setIs_numeroDocumento(lus_usuarioSesionDto.getIs_numeroDocumento());
			ltsgv_solicitante.setIs_tipoDocumento(lus_usuarioSesionDto.getIs_tipoDocumento());
			ltsgv_solicitante.setIs_tipoPersona(EnumTipoPersona.NATURAL.getIs_codigo());

			ltegs_tipoEntradaGenerarSolicitudWsDto.setItsgv_solicitante(ltsgv_solicitante);

			List<TipoCriterioWSDTO> lltc_tipoCriterioWsDto = UtilidadConstantesDevoluciones
					.validarNoTitularPersonaNatural(afdce_formularioDevolcionConsignacionErradaDto, lu_usuarioDto);
			lltc_tipoCriterio = lltc_tipoCriterioWsDto;
		}
		ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
		ltc_tipoCriterioWsDto
		.setIs_codigo(EnumConstantesDevoluciones.CODIGO_ENTIDAD_FINANCIERA_CONSIGNACION.getIs_nombreCampo());
		ltc_tipoCriterioWsDto.setIs_valor(afdce_formularioDevolcionConsignacionErradaDto.getIs_nombreEntidad());
		lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);

		ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
		ltc_tipoCriterioWsDto.setIs_codigo(EnumConstantesDevoluciones.TIPO_CONSIGNACION.getIs_nombreCampo());
		ltc_tipoCriterioWsDto.setIs_valor(afdce_formularioDevolcionConsignacionErradaDto.getIs_tipoConsignacion());
		lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);

		ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
		ltc_tipoCriterioWsDto.setIs_codigo(EnumConstantesDevoluciones.NUMERO_TIPO_CONSIGNACION.getIs_nombreCampo());
		ltc_tipoCriterioWsDto.setIs_valor(afdce_formularioDevolcionConsignacionErradaDto.getIs_numeroConsignacion());
		lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);

		ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
		ltc_tipoCriterioWsDto.setIs_codigo(EnumConstantesDevoluciones.VALOR_CONSIGNACION.getIs_nombreCampo());
		ltc_tipoCriterioWsDto
		.setIs_valor(String.valueOf((afdce_formularioDevolcionConsignacionErradaDto.getIbi_valor())));
		lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);

		ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
		ltc_tipoCriterioWsDto.setIs_codigo(EnumConstantesDevoluciones.FECHA_CONSIGNACION.getIs_nombreCampo());
		Format lf_fecha = new SimpleDateFormat(EnumFormatoFecha.FORMATO_FECHA_AMD.getIs_formato());
		ltc_tipoCriterioWsDto
		.setIs_valor(lf_fecha.format(afdce_formularioDevolcionConsignacionErradaDto.getId_fechaConsignacion()));
		lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);

		ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
		ltc_tipoCriterioWsDto
		.setIs_codigo(EnumConstantesDevoluciones.NUMERO_CUENTA_BANCARIA_CONSIGNACION.getIs_nombreCampo());
		ltc_tipoCriterioWsDto.setIs_valor(afdce_formularioDevolcionConsignacionErradaDto.getIs_numeroCuenta());
		lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);

		ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
		ltc_tipoCriterioWsDto.setIs_codigo(EnumConstantesDevoluciones.SOLICITANTE_APODERADO.getIs_nombreCampo());
		ltc_tipoCriterioWsDto
		.setIs_valor(String.valueOf((afdce_formularioDevolcionConsignacionErradaDto.getIb_intervino())));
		lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);

		ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
		ltc_tipoCriterioWsDto.setIs_codigo(EnumConstantesDevoluciones.MOTIVO_SOLICITUD.getIs_nombreCampo());
		ltc_tipoCriterioWsDto.setIs_valor((afdce_formularioDevolcionConsignacionErradaDto.getIs_motivoSolicitud()));
		lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);

		List<TipoCriterioWSDTO> lltc_tipoCriterioWsDto = UtilidadConstantesDevoluciones
				.cargarInfoCuentaDevoluciones(afdce_formularioDevolcionConsignacionErradaDto);
		lltc_tipoCriterio.addAll(lltc_tipoCriterioWsDto);

		lts_tipoServicioGsiWsDto.setIltc_tipoCriterio(lltc_tipoCriterio);
		List<TipoServicioGSIWSDTO> lltsg_listaTipoServicioGsiWsDto = new ArrayList<>();
		lltsg_listaTipoServicioGsiWsDto.add(lts_tipoServicioGsiWsDto);
		ltegs_tipoEntradaGenerarSolicitudWsDto.setIltsgw_servicios(lltsg_listaTipoServicioGsiWsDto);

		TipoSalidaGenerarSolicitudWSDTO ltsgs_tipoSalidaGenerarSolicitudWsDto = iisspb_solicitudSinPagoBusiness
				.generarSolicitud(ltegs_tipoEntradaGenerarSolicitudWsDto);
		UtilidadExcepciones.manejadorExcepcionesServicios(ltsgs_tipoSalidaGenerarSolicitudWsDto);

		if (!ltsgs_tipoSalidaGenerarSolicitudWsDto.getIs_codigoMensaje()
				.equals(EnumCodigosRespuestas.CODIGO_200.getIs_codigo())) {
			GeneradorGrowlGenerico
			.generarMensajeError(ltsgs_tipoSalidaGenerarSolicitudWsDto.getIs_descripcionMensaje());
		} else {
			ltf_transaccionFormularioDto = guardarTransaccionFormulario(aecf_nombreFormulario,
					ltsgs_tipoSalidaGenerarSolicitudWsDto.getIs_nir());
		}
		return ltf_transaccionFormularioDto;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.
	 * IValorCampoFormularioBusiness#guardarTransaccionCuentaCupo(co.gov.
	 * supernotariado.bachue.sedeelectronica.common.enums.
	 * EnumConfiguracionFormulario, java.lang.String)
	 */
	@Override
	public TransaccionFormularioDTO guardarTransaccionFormulario(EnumConfiguracionFormulario aecf_nombreFormulario,
			String as_nir) {
		UsuarioSesionDTO lus_usuarioSesionDto;
		lus_usuarioSesionDto = UtilidadAutoridadUsuario.consultarUsuarioSesion();
		UsuarioDTO lu_usuarioDto = new UsuarioDTO();
		lu_usuarioDto.setIs_id(lus_usuarioSesionDto.getIs_idUsuario());
		lu_usuarioDto = iiub_usuarioBusiness
				.consultarUsuarioConDireccionYPersonaJuridica(lus_usuarioSesionDto.getIs_nombreUsuario());

		TransaccionFormularioDTO ltf_transaccionFormularioDto = new TransaccionFormularioDTO();
		ltf_transaccionFormularioDto.setIs_nir(as_nir);
		ltf_transaccionFormularioDto.setIs_estadoTransaccion(EnumEstadoSolicitudSinPago.EN_CURSO.getIs_codigo());
		ltf_transaccionFormularioDto.setIu_idUsuario(lu_usuarioDto);
		FormularioUsuarioDTO lfu_formularioUsuarioDto = consultarFormularioUsuario(aecf_nombreFormulario);
		ltf_transaccionFormularioDto.setIfu_idFormularioUsuario(lfu_formularioUsuarioDto);

		iitfb_transaccionFormularioBusiness.crearTransaccionSolicitudFormulario(ltf_transaccionFormularioDto);
		return ltf_transaccionFormularioDto;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.
	 * IValorCampoFormularioBusiness#guardarTransaccionFormularioDevolucion(co.gov.
	 * supernotariado.bachue.sedeelectronica.common.enums.
	 * EnumConfiguracionFormulario, co.gov.
	 * supernotariado.bachue.sedeelectronica.admon.persistence.dto.
	 * TipoSalidaGenerarSolicitudWSDTO)
	 */
	@Override
	public TransaccionFormularioDTO guardarTransaccionFormularioDevolucion(
			EnumConfiguracionFormulario aecf_nombreFormulario,
			TipoSalidaGenerarSolicitudWSDTO atsgs_tipoSalidaGenerarSolicitudWsDto) {
		UsuarioSesionDTO lus_usuarioSesionDto;
		lus_usuarioSesionDto = UtilidadAutoridadUsuario.consultarUsuarioSesion();
		UsuarioDTO lu_usuarioDto = new UsuarioDTO();
		lu_usuarioDto.setIs_id(lus_usuarioSesionDto.getIs_idUsuario());
		lu_usuarioDto = iiub_usuarioBusiness
				.consultarUsuarioConDireccionYPersonaJuridica(lus_usuarioSesionDto.getIs_nombreUsuario());

		String[] ls_nirHash = atsgs_tipoSalidaGenerarSolicitudWsDto.getIs_nir().split(";");

		TransaccionFormularioDTO ltf_transaccionFormularioDto = new TransaccionFormularioDTO();
		ltf_transaccionFormularioDto.setIs_nir(ls_nirHash[0]);
		ltf_transaccionFormularioDto
		.setIs_estadoTransaccion(EnumEstadoSolicitudSinPago.CODIGO_VERIFICACION_NO_VALIDADO.getIs_codigo());
		ltf_transaccionFormularioDto.setIu_idUsuario(lu_usuarioDto);
		FormularioUsuarioDTO lfu_formularioUsuarioDto = consultarFormularioUsuario(aecf_nombreFormulario);
		ltf_transaccionFormularioDto.setIfu_idFormularioUsuario(lfu_formularioUsuarioDto);
		ltf_transaccionFormularioDto.setIs_hashCodigoVerificacion(ls_nirHash[1]);
		ltf_transaccionFormularioDto.setIi_cantidadIntentos(0);

		iitfb_transaccionFormularioBusiness.crearTransaccionSolicitudFormulario(ltf_transaccionFormularioDto);
		return ltf_transaccionFormularioDto;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.
	 * IValorCampoFormularioBusiness#crearSolicitudModificacionCuentaCupo(co.gov.
	 * supernotariado.bachue.sedeelectronica.admon.persistence.dto.
	 * FormularioModificarCuentaCupoDTO,
	 * co.gov.supernotariado.bachue.sedeelectronica.common.enums.
	 * EnumConfiguracionFormulario)
	 */
	@Override
	public TransaccionFormularioDTO crearSolicitudModificacionCuentaCupo(
			FormularioModificarCuentaCupoDTO afmcc_formularioModificarCuentaCupo,
			EnumConfiguracionFormulario aecf_nombreFormulario) {
		FormularioCrearCuentaCupoDTO lfccc_camposFormularioCreacionCuentaCupo = iifub_formularioUsuarioBusiness
				.consultarDatosFormularioCuentaCupoCreacion();
		TipoEntradaGenerarSolicitudWSDTO ltegs_tipoEntradaGenerarSolicitudWsDto = new TipoEntradaGenerarSolicitudWSDTO();
		ltegs_tipoEntradaGenerarSolicitudWsDto.setIs_modulo(EnumCriterio.CANAL_ORIGEN.getIs_criterio());

		TipoSolicitanteGSIWSDTO ltsgv_solicitante = new TipoSolicitanteGSIWSDTO();
		ltsgv_solicitante.setIs_numeroDocumento(
				lfccc_camposFormularioCreacionCuentaCupo.getIs_numeroDocumentoRepresentanteLegal());
		ltsgv_solicitante
		.setIs_tipoDocumento(lfccc_camposFormularioCreacionCuentaCupo.getIs_tipoDocumentoRepresentanteLegal());
		ltsgv_solicitante.setIs_tipoPersona(EnumTipoPersona.JURIDICA.getIs_codigo());

		ltegs_tipoEntradaGenerarSolicitudWsDto.setItsgv_solicitante(ltsgv_solicitante);

		TipoServicioGSIWSDTO lts_tipoServicioGsiWsDto = new TipoServicioGSIWSDTO();
		CatalogoDTO lc_catalogoDto = iic_catalogoBusiness
				.consultarCatalogoCodigoValor(EnumCatalogoTipoServicio.MODIFICACION_CUENTA_CUPO.getIs_codigo());
		DetalleCatalogoDTO ldc_detalleCatalogoDto = iidc_detalleCatalogoBusiness
				.consultarDetalleCatalogo(lc_catalogoDto);
		lts_tipoServicioGsiWsDto.setIs_tipoServicio(ldc_detalleCatalogoDto.getIs_idCodigoServicio());
		lts_tipoServicioGsiWsDto.setIs_subTipoServicio(ldc_detalleCatalogoDto.getIs_idCodigoSubServicio());

		TipoEntradaConsultarIDCuentaCupoWSDTO ltecicc_tipoEntradaConsultarIdCuentaCupoWsDto = new TipoEntradaConsultarIDCuentaCupoWSDTO();
		ltecicc_tipoEntradaConsultarIdCuentaCupoWsDto.setIs_modulo(EnumCriterio.CANAL_ORIGEN.getIs_criterio());
		TipoAdminCICCIWSDTO ltac_adminCicciVo = new TipoAdminCICCIWSDTO();
		ltac_adminCicciVo
		.setIs_correoElectronicoCorporativoUsuario(lfccc_camposFormularioCreacionCuentaCupo.getIs_correo());
		ltac_adminCicciVo
		.setIs_numDocAdmin(lfccc_camposFormularioCreacionCuentaCupo.getIs_numeroDocumentoRepresentanteLegal());
		ltac_adminCicciVo
		.setIs_tipoDocAdmin(lfccc_camposFormularioCreacionCuentaCupo.getIs_tipoDocumentoRepresentanteLegal());
		ltecicc_tipoEntradaConsultarIdCuentaCupoWsDto.setItac_adminCicciVo(ltac_adminCicciVo);
		TipoSalidaConsultarIDCuentaCupoWSDTO ltscicc_tipoSalidaConsultarIdCuentaCupoWsDto = iigcc_gestionCuentaCupoBusiness
				.consultarIdCuentaCupo(ltecicc_tipoEntradaConsultarIdCuentaCupoWsDto);
		afmcc_formularioModificarCuentaCupo.setIs_idCuentaCupo(ltscicc_tipoSalidaConsultarIdCuentaCupoWsDto.getIs_id());

		List<TipoCriterioWSDTO> lltc_tipoCriterio = new ArrayList<>();

		TipoCriterioWSDTO ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
		ltc_tipoCriterioWsDto.setIs_codigo(EnumCriterio.ID_CUENTA_CUPO.getIs_criterio());
		ltc_tipoCriterioWsDto.setIs_valor(afmcc_formularioModificarCuentaCupo.getIs_idCuentaCupo());
		lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);

		ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
		ltc_tipoCriterioWsDto.setIs_codigo(EnumCriterio.NUEVO_VALOR_MINIMO.getIs_criterio());
		ltc_tipoCriterioWsDto.setIs_valor(afmcc_formularioModificarCuentaCupo.getIs_valorMinimoSolicitado());
		lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);

		ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
		ltc_tipoCriterioWsDto.setIs_codigo(EnumCriterio.NUEVO_VALOR_MAXIMO.getIs_criterio());
		ltc_tipoCriterioWsDto.setIs_valor(afmcc_formularioModificarCuentaCupo.getIs_valorMaximoSolicitado());
		lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);

		ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
		ltc_tipoCriterioWsDto.setIs_codigo(EnumCriterio.MOTIVO_SOLICITUD.getIs_criterio());
		ltc_tipoCriterioWsDto.setIs_valor(afmcc_formularioModificarCuentaCupo.getIs_motivoSolicitud());
		lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);

		ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
		ltc_tipoCriterioWsDto.setIs_codigo(EnumCriterio.FECHA_DILIGENCIAMIENTO.getIs_criterio());
		Format lf_fecha = new SimpleDateFormat(EnumFormatoFecha.FORMATO_FECHA.getIs_formato());
		ltc_tipoCriterioWsDto.setIs_valor(lf_fecha.format(new Date()));
		lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);
		lts_tipoServicioGsiWsDto.setIltc_tipoCriterio(lltc_tipoCriterio);

		List<TipoServicioGSIWSDTO> lltsg_listaTipoServicioGsiWsDto = new ArrayList<>();
		lltsg_listaTipoServicioGsiWsDto.add(lts_tipoServicioGsiWsDto);
		ltegs_tipoEntradaGenerarSolicitudWsDto.setIltsgw_servicios(lltsg_listaTipoServicioGsiWsDto);

		TipoSalidaGenerarSolicitudWSDTO ltsgs_tipoSalidaGenerarSolicitudWsDto = iisspb_solicitudSinPagoBusiness
				.generarSolicitud(ltegs_tipoEntradaGenerarSolicitudWsDto);

		TransaccionFormularioDTO ltf_transaccionFormularioDto;
		ltf_transaccionFormularioDto = guardarTransaccionFormulario(aecf_nombreFormulario,
				ltsgs_tipoSalidaGenerarSolicitudWsDto.getIs_nir());
		return ltf_transaccionFormularioDto;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.
	 * IValorCampoFormularioBusiness#consultarNIR(co.gov.supernotariado.bachue.
	 * sedeelectronica.admon.persistence.dto.TransaccionFormularioDTO)
	 */
	@Override
	public TransaccionFormularioDTO consultarNIR(TransaccionFormularioDTO atf_transaccionFormularioDto) {
		TransaccionFormularioDTO ltf_transaccionFormularioDto;
		ltf_transaccionFormularioDto = TransaccionFormularioHelper
				.entidadADtoCompleto(iitf_transaccionFormularioDao.consultarNir(TransaccionFormularioHelper
						.dtoAEntidadSimple(atf_transaccionFormularioDto, new TransaccionFormulario())));
		return ltf_transaccionFormularioDto;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.
	 * IValorCampoFormularioBusiness#consultarEstadoSolicitud(co.gov.supernotariado.
	 * bachue.sedeelectronica.admon.persistence.dto.TransaccionFormularioDTO)
	 */
	@Override
	public int consultarEstadoSolicitud(TransaccionFormularioDTO atf_transaccionFormularioDto) {
		FormularioCrearCuentaCupoDTO lfccc_camposFormularioCreacionCuentaCupo = iifub_formularioUsuarioBusiness
				.consultarDatosFormularioCuentaCupoCreacion();
		TipoEntradaConsultarEstadoSolicitudWSDTO lteces_tipoEntradaConsultarEstadoSolicitudWsDto = new TipoEntradaConsultarEstadoSolicitudWSDTO();
		lteces_tipoEntradaConsultarEstadoSolicitudWsDto.setIs_modulo(EnumCriterio.CANAL_ORIGEN.getIs_criterio());
		lteces_tipoEntradaConsultarEstadoSolicitudWsDto.setIs_nir(atf_transaccionFormularioDto.getIs_nir());

		TipoSolicitanteCESIWSDTO ltss_solicitante = new TipoSolicitanteCESIWSDTO();
		ltss_solicitante.setIs_numeroDocumento(
				lfccc_camposFormularioCreacionCuentaCupo.getIs_numeroDocumentoRepresentanteLegal());
		ltss_solicitante
		.setIs_tipoDocumento(lfccc_camposFormularioCreacionCuentaCupo.getIs_tipoDocumentoRepresentanteLegal());
		ltss_solicitante.setIs_tipoPersona(EnumTipoPersona.JURIDICA.getIs_codigo());

		lteces_tipoEntradaConsultarEstadoSolicitudWsDto.setItsc_solicitante(ltss_solicitante);

		TipoSalidaConsultarEstadoSolicitudWSDTO ltsces_tipoSalidaConsultarEstadoSolicitudServicioWsDto = iisspb_solicitudSinPagoBusiness
				.consultarEstadoSolicitud(lteces_tipoEntradaConsultarEstadoSolicitudWsDto);

		if (ltsces_tipoSalidaConsultarEstadoSolicitudServicioWsDto.getIs_nir()
				.equals(atf_transaccionFormularioDto.getIs_nir())
				&& ltsces_tipoSalidaConsultarEstadoSolicitudServicioWsDto.getIs_nombreEtapa().equals("")) {
			atf_transaccionFormularioDto.setIs_estadoTransaccion(EnumEstadoSolicitudSinPago.APROBADA.getIs_codigo());
			ltsces_tipoSalidaConsultarEstadoSolicitudServicioWsDto
			.setIs_nombreEtapa(EnumEstadoSolicitudSinPago.APROBADA.getIs_codigo());
		}

		TransaccionFormularioDTO atf_transaccionFormulariosDto = consultarNIR(atf_transaccionFormularioDto);

		int li_estadoCuentaCupo = EnumNumeros.CERO.getIi_numero();
		if (atf_transaccionFormulariosDto.getIs_estadoTransaccion()
				.equals(EnumEstadoSolicitudSinPago.MODIFICACION_APROBADA.getIs_codigo())) {
			li_estadoCuentaCupo = EnumNumeros.CERO.getIi_numero();
		} else {
			if (!atf_transaccionFormulariosDto.getIs_estadoTransaccion()
					.equals(ltsces_tipoSalidaConsultarEstadoSolicitudServicioWsDto.getIs_nombreEtapa())) {
				// ACTUALIZAR REGISTRO EN BD
				atf_transaccionFormularioDto.setIs_estadoTransaccion(
						ltsces_tipoSalidaConsultarEstadoSolicitudServicioWsDto.getIs_nombreEtapa());
				iitfb_transaccionFormularioBusiness.actualizarEstadoFormulario(atf_transaccionFormularioDto);
				atf_transaccionFormularioDto = consultarNIR(atf_transaccionFormularioDto);
			}
			if (atf_transaccionFormularioDto.getIs_estadoTransaccion()
					.equals(EnumEstadoSolicitudSinPago.APROBADA.getIs_codigo())) {
				li_estadoCuentaCupo = EnumNumeros.CINCO.getIi_numero(); // REDIRECCION A RECARGA CUENTA CUPO
			} else if (atf_transaccionFormularioDto.getIs_estadoTransaccion()
					.equals(EnumEstadoSolicitudSinPago.APROBACION_SOLICITUD_CUENTA_CUPO.getIs_codigo())) {
				li_estadoCuentaCupo = EnumNumeros.CUATRO.getIi_numero(); // RESUMEN SOLICITUD
			} else if (atf_transaccionFormularioDto.getIs_estadoTransaccion()
					.equals(EnumEstadoSolicitudSinPago.INACTIVO.getIs_codigo())
					|| atf_transaccionFormularioDto.getIs_estadoTransaccion()
					.equals(EnumEstadoSolicitudSinPago.BLOQUEADO.getIs_codigo())) {
				li_estadoCuentaCupo = EnumNumeros.CERO.getIi_numero(); // TUTORIAL CREACION SOLICITUD
			}
		}
		return li_estadoCuentaCupo;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.
	 * IValorCampoFormularioBusiness#consultarEstadoCuentaCupo(co.gov.
	 * supernotariado.
	 * bachue.sedeelectronica.admon.persistence.dto.TransaccionFormularioDTO)
	 */
	@Override
	public String consultarEstadoCuentaCupo(TransaccionFormularioDTO atf_transaccionFormularioDto) {
		FormularioCrearCuentaCupoDTO lfccc_camposFormularioCreacionCuentaCupo = iifub_formularioUsuarioBusiness
				.consultarDatosFormularioCuentaCupoCreacion();
		TipoEntradaConsultarEstadoSolicitudWSDTO lteces_tipoEntradaConsultarEstadoSolicitudWsDto = new TipoEntradaConsultarEstadoSolicitudWSDTO();
		lteces_tipoEntradaConsultarEstadoSolicitudWsDto.setIs_modulo(EnumCriterio.CANAL_ORIGEN.getIs_criterio());
		lteces_tipoEntradaConsultarEstadoSolicitudWsDto.setIs_nir(atf_transaccionFormularioDto.getIs_nir());

		TipoSolicitanteCESIWSDTO ltss_solicitante = new TipoSolicitanteCESIWSDTO();
		ltss_solicitante.setIs_numeroDocumento(
				lfccc_camposFormularioCreacionCuentaCupo.getIs_numeroDocumentoRepresentanteLegal());
		ltss_solicitante
		.setIs_tipoDocumento(lfccc_camposFormularioCreacionCuentaCupo.getIs_tipoDocumentoRepresentanteLegal());
		ltss_solicitante.setIs_tipoPersona(EnumTipoPersona.JURIDICA.getIs_codigo());

		lteces_tipoEntradaConsultarEstadoSolicitudWsDto.setItsc_solicitante(ltss_solicitante);

		TipoSalidaConsultarEstadoSolicitudWSDTO ltsces_tipoSalidaConsultarEstadoSolicitudServicioWsDto = iisspb_solicitudSinPagoBusiness
				.consultarEstadoSolicitud(lteces_tipoEntradaConsultarEstadoSolicitudWsDto);

		if (ltsces_tipoSalidaConsultarEstadoSolicitudServicioWsDto.getIs_nombreEtapa().equals("")) {
			atf_transaccionFormularioDto.setIs_estadoTransaccion(EnumEstadoSolicitudSinPago.APROBADA.getIs_codigo());
		} else {
			atf_transaccionFormularioDto.setIs_estadoTransaccion(
					ltsces_tipoSalidaConsultarEstadoSolicitudServicioWsDto.getIs_nombreEtapa());
		}
		iitfb_transaccionFormularioBusiness.actualizarEstadoFormulario(atf_transaccionFormularioDto);

		return atf_transaccionFormularioDto.getIs_estadoTransaccion();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.
	 * IValorCampoFormularioBusiness#consultarEstadoSolicitudDevolucion(co.gov.
	 * supernotariado.
	 * bachue.sedeelectronica.admon.persistence.dto.TransaccionFormularioDTO)
	 */
	@Override
	public int consultarEstadoSolicitudDevolucion(TransaccionFormularioDTO atf_transaccionFormularioDto,
			UsuarioDTO au_usuarioDto) {
		TipoEntradaConsultarEstadoSolicitudWSDTO lteces_tipoEntradaConsultarEstadoSolicitudWsDto = new TipoEntradaConsultarEstadoSolicitudWSDTO();
		lteces_tipoEntradaConsultarEstadoSolicitudWsDto.setIs_modulo(EnumCriterio.CANAL_ORIGEN.getIs_criterio());
		lteces_tipoEntradaConsultarEstadoSolicitudWsDto.setIs_nir(atf_transaccionFormularioDto.getIs_nir());

		TipoSolicitanteCESIWSDTO lts_tipoSolicitanteCESIWsDto = new TipoSolicitanteCESIWSDTO();
		if (au_usuarioDto.getIs_rol().equals(EnumRol.PERSONA_NATURAL.getIs_rol())) {
			lts_tipoSolicitanteCESIWsDto
			.setIs_numeroDocumento(au_usuarioDto.getIp_personaDto().getIs_numeroDocumento());
			lts_tipoSolicitanteCESIWsDto
			.setIs_tipoDocumento(au_usuarioDto.getIp_personaDto().getItd_tipoDocumentoDto().getIs_id());
			lts_tipoSolicitanteCESIWsDto.setIs_tipoPersona(EnumTipoPersona.NATURAL.getIs_codigo());
		} else {
			lts_tipoSolicitanteCESIWsDto.setIs_numeroDocumento(
					au_usuarioDto.getIpj_personaJuridicaDto().getIp_personaDto().getIs_numeroDocumento());
			lts_tipoSolicitanteCESIWsDto.setIs_tipoDocumento(
					au_usuarioDto.getIpj_personaJuridicaDto().getIp_personaDto().getItd_tipoDocumentoDto().getIs_id());
			lts_tipoSolicitanteCESIWsDto.setIs_tipoPersona(EnumTipoPersona.JURIDICA.getIs_codigo());
		}
		lteces_tipoEntradaConsultarEstadoSolicitudWsDto.setItsc_solicitante(lts_tipoSolicitanteCESIWsDto);
		TipoSalidaConsultarEstadoSolicitudWSDTO ltsces_tipoSalidaConsultarEstadoSolicitudServicioWsDto = iisspb_solicitudSinPagoBusiness
				.consultarEstadoSolicitud(lteces_tipoEntradaConsultarEstadoSolicitudWsDto);

		if (ltsces_tipoSalidaConsultarEstadoSolicitudServicioWsDto.getIs_nir()
				.equals(atf_transaccionFormularioDto.getIs_nir())
				&& ltsces_tipoSalidaConsultarEstadoSolicitudServicioWsDto.getIs_nombreEtapa().equals("")) {
			atf_transaccionFormularioDto.setIs_estadoTransaccion(EnumEstadoSolicitudSinPago.APROBADA.getIs_codigo());
			ltsces_tipoSalidaConsultarEstadoSolicitudServicioWsDto
			.setIs_nombreEtapa(EnumEstadoSolicitudSinPago.APROBADA.getIs_codigo());
		}

		TransaccionFormularioDTO atf_transaccionFormulariosDto = consultarNIR(atf_transaccionFormularioDto);

		int li_estadoDevolucion = EnumNumeros.CERO.getIi_numero();
		if (atf_transaccionFormulariosDto.getIs_estadoTransaccion()
				.equals(EnumEstadoSolicitudSinPago.MODIFICACION_APROBADA.getIs_codigo())) {
			li_estadoDevolucion = EnumNumeros.CERO.getIi_numero();
		} else {
			if (!atf_transaccionFormulariosDto.getIs_estadoTransaccion()
					.equals(ltsces_tipoSalidaConsultarEstadoSolicitudServicioWsDto.getIs_nombreEtapa())) {
				// ACTUALIZAR REGISTRO EN BD
				atf_transaccionFormularioDto.setIs_estadoTransaccion(
						ltsces_tipoSalidaConsultarEstadoSolicitudServicioWsDto.getIs_nombreEtapa());
				iitfb_transaccionFormularioBusiness.actualizarEstadoFormulario(atf_transaccionFormularioDto);
				atf_transaccionFormularioDto = consultarNIR(atf_transaccionFormularioDto);
			}
			if (atf_transaccionFormularioDto.getIs_estadoTransaccion()
					.equals(EnumEstadoSolicitudSinPago.Validar.getIs_codigo())) {
				li_estadoDevolucion = EnumNumeros.CUATRO.getIi_numero();
			} else if (atf_transaccionFormularioDto.getIs_estadoTransaccion()
					.equals(EnumEstadoSolicitudSinPago.APROBACION_SOLICITUD_CUENTA_CUPO.getIs_codigo())) {
				li_estadoDevolucion = EnumNumeros.TRES.getIi_numero();
			} else if (atf_transaccionFormularioDto.getIs_estadoTransaccion()
					.equals(EnumEstadoSolicitudSinPago.INACTIVO.getIs_codigo())
					|| atf_transaccionFormularioDto.getIs_estadoTransaccion()
					.equals(EnumEstadoSolicitudSinPago.BLOQUEADO.getIs_codigo())) {
				li_estadoDevolucion = EnumNumeros.CERO.getIi_numero();
			}
		}
		return li_estadoDevolucion;
	}

	@Override
	public TransaccionFormularioDTO crearSolicitudDevolucionServicioRegistral(
			FormularioDevolucionServicioRegistralDTO afdsr_formularioDevolcionServicioRegistralDTO,
			EnumConfiguracionFormulario aecf_nombreFormulario) {
		TransaccionFormularioDTO ltf_transaccionFormularioDto = new TransaccionFormularioDTO();
		UsuarioSesionDTO lus_usuarioSesionDto;
		lus_usuarioSesionDto = UtilidadAutoridadUsuario.consultarUsuarioSesion();
		UsuarioDTO lu_usuarioDto = new UsuarioDTO();
		lu_usuarioDto.setIs_id(lus_usuarioSesionDto.getIs_idUsuario());

		TipoEntradaGenerarSolicitudWSDTO ltegs_tipoEntradaGenerarSolicitudWsDto = new TipoEntradaGenerarSolicitudWSDTO();
		ltegs_tipoEntradaGenerarSolicitudWsDto.setIs_modulo(EnumCriterio.CANAL_ORIGEN.getIs_criterio());

		TipoServicioGSIWSDTO lts_tipoServicioGsiWsDto = new TipoServicioGSIWSDTO();
		CatalogoDTO lc_catalogoDto = iic_catalogoBusiness.consultarCatalogoCodigoValor(
				EnumCatalogoTipoServicio.DEVOLUCION_SERVICIO_REGISTRAL_CREAR.getIs_codigo());
		DetalleCatalogoDTO ldc_detalleCatalogoDto = iidc_detalleCatalogoBusiness
				.consultarDetalleCatalogo(lc_catalogoDto);
		lts_tipoServicioGsiWsDto.setIs_tipoServicio(ldc_detalleCatalogoDto.getIs_idCodigoServicio());
		lts_tipoServicioGsiWsDto.setIs_subTipoServicio(ldc_detalleCatalogoDto.getIs_idCodigoSubServicio());

		List<TipoCriterioWSDTO> lltc_tipoCriterio;
		TipoCriterioWSDTO ltc_tipoCriterioWsDto;

		if (lus_usuarioSesionDto.getIs_rol().equals(EnumRol.ADMIN_PERSONA_JURIDICA.getIs_rol())) {
			lu_usuarioDto = iiub_usuarioBusiness
					.consultarUsuarioConDireccionYPersonaJuridica(lus_usuarioSesionDto.getIs_nombreUsuario());
			TipoSolicitanteGSIWSDTO ltsgv_solicitante = new TipoSolicitanteGSIWSDTO();
			ltsgv_solicitante.setIs_numeroDocumento(lu_usuarioDto.getIp_personaDto().getIs_numeroDocumento());
			ltsgv_solicitante
			.setIs_tipoDocumento(lu_usuarioDto.getIp_personaDto().getItd_tipoDocumentoDto().getIs_id());
			ltsgv_solicitante.setIs_tipoPersona(EnumTipoPersona.JURIDICA.getIs_codigo());

			ltegs_tipoEntradaGenerarSolicitudWsDto.setItsgv_solicitante(ltsgv_solicitante);

			List<TipoCriterioWSDTO> lltc_tipoCriterioWsDto = UtilidadConstantesDevoluciones
					.validarNoTitularPersonaJuridicaServicioRegistral(afdsr_formularioDevolcionServicioRegistralDTO,
							lu_usuarioDto);
			lltc_tipoCriterio = lltc_tipoCriterioWsDto;

			ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
			ltc_tipoCriterioWsDto
			.setIs_codigo(EnumConstantesDevoluciones.TITULAR_CUENTA_RAZON_SOCIAL.getIs_nombreCampo());
			ltc_tipoCriterioWsDto.setIs_valor(
					afdsr_formularioDevolcionServicioRegistralDTO.getIs_titularCuentaBancariaRazonSocial());
			lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);

		} else {
			lu_usuarioDto = iiub_usuarioBusiness
					.consultarUsuarioConDireccion(lus_usuarioSesionDto.getIs_nombreUsuario());

			ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();

			TipoSolicitanteGSIWSDTO ltsgv_solicitante = new TipoSolicitanteGSIWSDTO();
			ltsgv_solicitante.setIs_numeroDocumento(lus_usuarioSesionDto.getIs_numeroDocumento());
			ltsgv_solicitante.setIs_tipoDocumento(lus_usuarioSesionDto.getIs_tipoDocumento());
			ltsgv_solicitante.setIs_tipoPersona(EnumTipoPersona.NATURAL.getIs_codigo());

			ltegs_tipoEntradaGenerarSolicitudWsDto.setItsgv_solicitante(ltsgv_solicitante);

			List<TipoCriterioWSDTO> lltc_tipoCriterioWsDto = UtilidadConstantesDevoluciones
					.validarNoTitularPersonaNaturalServicioRegistral(afdsr_formularioDevolcionServicioRegistralDTO,
							lu_usuarioDto);
			lltc_tipoCriterio = lltc_tipoCriterioWsDto;

			ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
			ltc_tipoCriterioWsDto
			.setIs_codigo(EnumConstantesDevoluciones.TITULAR_CUENTA_PRIMER_APELLIDO.getIs_nombreCampo());
			ltc_tipoCriterioWsDto
			.setIs_valor(afdsr_formularioDevolcionServicioRegistralDTO.getIs_apellidoTitularCuentaBancaria());
			lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);

			ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
			ltc_tipoCriterioWsDto
			.setIs_codigo(EnumConstantesDevoluciones.TITULAR_CUENTA_PRIMER_NOMBRE.getIs_nombreCampo());
			ltc_tipoCriterioWsDto
			.setIs_valor(afdsr_formularioDevolcionServicioRegistralDTO.getIs_nombreTitularCuentaBancaria());
			lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);

			ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
			ltc_tipoCriterioWsDto
			.setIs_codigo(EnumConstantesDevoluciones.TITULAR_CUENTA_SEGUNDO_APELLIDO.getIs_nombreCampo());
			ltc_tipoCriterioWsDto.setIs_valor(
					afdsr_formularioDevolcionServicioRegistralDTO.getIs_segundoApellidoTitularCuentaBancaria());
			lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);

			ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
			ltc_tipoCriterioWsDto
			.setIs_codigo(EnumConstantesDevoluciones.TITULAR_CUENTA_SEGUNDO_NOMBRE.getIs_nombreCampo());
			ltc_tipoCriterioWsDto.setIs_valor(
					afdsr_formularioDevolcionServicioRegistralDTO.getIs_segundoNombreTitularCuentaBancaria());
			lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);

		}

		ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
		ltc_tipoCriterioWsDto.setIs_codigo(EnumConstantesDevoluciones.CODIGO_ENTIDAD_FINANCIERA.getIs_nombreCampo());
		ltc_tipoCriterioWsDto.setIs_valor(afdsr_formularioDevolcionServicioRegistralDTO.getIs_entidadFinanciera());
		lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);

		ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
		ltc_tipoCriterioWsDto.setIs_codigo(EnumConstantesDevoluciones.SOLICITANTE_INTERVINIENTE.getIs_nombreCampo());
		ltc_tipoCriterioWsDto.setIs_valor(EnumBoolean
				.buscarString(afdsr_formularioDevolcionServicioRegistralDTO.getIb_intervino()).getIs_codigo());
		lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);

		ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
		ltc_tipoCriterioWsDto
		.setIs_codigo(EnumConstantesDevoluciones.TITULAR_CUENTA_TIPO_DOCUMENTO.getIs_nombreCampo());
		ltc_tipoCriterioWsDto
		.setIs_valor(afdsr_formularioDevolcionServicioRegistralDTO.getIs_tipoDocumentoTitularCuentaBancaria());
		lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);

		ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
		ltc_tipoCriterioWsDto
		.setIs_codigo(EnumConstantesDevoluciones.TITULAR_CUENTA_NUMERO_DOCUMENTO.getIs_nombreCampo());
		ltc_tipoCriterioWsDto.setIs_valor(
				afdsr_formularioDevolcionServicioRegistralDTO.getIs_numeroDocumentoTitularCuentaBancaria());
		lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);

		if (afdsr_formularioDevolcionServicioRegistralDTO.getIs_turno() != null
				&& !afdsr_formularioDevolcionServicioRegistralDTO.getIs_turno().isEmpty()) {
			ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
			ltc_tipoCriterioWsDto.setIs_codigo(EnumConstantesDevoluciones.TURNO.getIs_nombreCampo());
			ltc_tipoCriterioWsDto.setIs_valor(afdsr_formularioDevolcionServicioRegistralDTO.getIs_turno());
			lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);

		}

		if (afdsr_formularioDevolcionServicioRegistralDTO.getIs_nir() != null
				&& !afdsr_formularioDevolcionServicioRegistralDTO.getIs_nir().isEmpty()) {

			ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
			ltc_tipoCriterioWsDto.setIs_codigo(EnumConstantesDevoluciones.NIR.getIs_nombreCampo());
			ltc_tipoCriterioWsDto.setIs_valor(afdsr_formularioDevolcionServicioRegistralDTO.getIs_nir());
			lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);
		}

		if (afdsr_formularioDevolcionServicioRegistralDTO.getIs_proceso() != null
				&& !afdsr_formularioDevolcionServicioRegistralDTO.getIs_proceso().isEmpty()) {
			ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
			ltc_tipoCriterioWsDto.setIs_codigo(EnumConstantesDevoluciones.PROCESO.getIs_nombreCampo());
			ltc_tipoCriterioWsDto.setIs_valor(afdsr_formularioDevolcionServicioRegistralDTO.getIs_proceso());
			lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);
		}

		if (afdsr_formularioDevolcionServicioRegistralDTO.getIs_observacionDevolucionServicioRegistral() != null
				&& !afdsr_formularioDevolcionServicioRegistralDTO.getIs_observacionDevolucionServicioRegistral()
				.isEmpty()) {

			ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
			ltc_tipoCriterioWsDto.setIs_codigo(EnumConstantesDevoluciones.OBSERVACIONES.getIs_nombreCampo());
			ltc_tipoCriterioWsDto.setIs_valor(
					afdsr_formularioDevolcionServicioRegistralDTO.getIs_observacionDevolucionServicioRegistral());
			lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);
		}

		if (afdsr_formularioDevolcionServicioRegistralDTO.getIs_actos() != null
				&& !afdsr_formularioDevolcionServicioRegistralDTO.getIs_actos().isEmpty()) {

			ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
			ltc_tipoCriterioWsDto.setIs_codigo(EnumConstantesDevoluciones.ACTOS.getIs_nombreCampo());
			ltc_tipoCriterioWsDto.setIs_valor(afdsr_formularioDevolcionServicioRegistralDTO.getIs_actos());
			lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);
		}

		if (afdsr_formularioDevolcionServicioRegistralDTO.getIs_certificados() != null
				&& !afdsr_formularioDevolcionServicioRegistralDTO.getIs_certificados().isEmpty()) {

			ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
			ltc_tipoCriterioWsDto.setIs_codigo(EnumConstantesDevoluciones.CERTIFICADOS.getIs_nombreCampo());
			ltc_tipoCriterioWsDto.setIs_valor(afdsr_formularioDevolcionServicioRegistralDTO.getIs_certificados());
			lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);
		}

		lts_tipoServicioGsiWsDto.setIltc_tipoCriterio(lltc_tipoCriterio);
		List<TipoServicioGSIWSDTO> lltsg_listaTipoServicioGsiWsDto = new ArrayList<>();
		lltsg_listaTipoServicioGsiWsDto.add(lts_tipoServicioGsiWsDto);
		ltegs_tipoEntradaGenerarSolicitudWsDto.setIltsgw_servicios(lltsg_listaTipoServicioGsiWsDto);

		TipoSalidaGenerarSolicitudWSDTO ltsgs_tipoSalidaGenerarSolicitudWsDto = iisspb_solicitudSinPagoBusiness
				.generarSolicitud(ltegs_tipoEntradaGenerarSolicitudWsDto);
		if (!ltsgs_tipoSalidaGenerarSolicitudWsDto.getIs_codigoMensaje()
				.equals(EnumCodigosRespuestas.CODIGO_200.getIs_codigo())) {
			UtilidadExcepciones.manejadorExcepcionesServicios(ltsgs_tipoSalidaGenerarSolicitudWsDto);
			GeneradorGrowlGenerico
			.generarMensajeError(ltsgs_tipoSalidaGenerarSolicitudWsDto.getIs_descripcionMensaje());
		} else {
			ltf_transaccionFormularioDto = guardarTransaccionFormularioDevolucion(aecf_nombreFormulario,
					ltsgs_tipoSalidaGenerarSolicitudWsDto);
		}
		return ltf_transaccionFormularioDto;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.
	 * IValorCampoFormularioBusiness#crearSolicitudDevolucionCuentaCupo(co.gov.
	 * supernotariado.bachue.sedeelectronica.admon.persistence.dto.
	 * FormularioDevolucionesCuentaCupoDTO,
	 * co.gov.supernotariado.bachue.sedeelectronica.common.enums.
	 * EnumConfiguracionFormulario)
	 */
	@Override
	public TransaccionFormularioDTO crearSolicitudDevolucionCuentaCupo(
			FormularioDevolucionesCuentaCupoDTO afdcc_formularioDevolucionCuentaCupoDto,
			EnumConfiguracionFormulario aecf_nombreFormulario) {
		TransaccionFormularioDTO ltf_transaccionFormularioDto = new TransaccionFormularioDTO();
		UsuarioSesionDTO lus_usuarioSesionDto;
		lus_usuarioSesionDto = UtilidadAutoridadUsuario.consultarUsuarioSesion();
		UsuarioDTO lu_usuarioDto = new UsuarioDTO();
		lu_usuarioDto.setIs_id(lus_usuarioSesionDto.getIs_idUsuario());

		TipoEntradaGenerarSolicitudWSDTO ltegs_tipoEntradaGenerarSolicitudWsDto = new TipoEntradaGenerarSolicitudWSDTO();
		ltegs_tipoEntradaGenerarSolicitudWsDto.setIs_modulo(EnumCriterio.CANAL_ORIGEN.getIs_criterio());

		TipoServicioGSIWSDTO lts_tipoServicioGsiWsDto = new TipoServicioGSIWSDTO();
		CatalogoDTO lc_catalogoDto = iic_catalogoBusiness
				.consultarCatalogoCodigoValor(EnumCatalogoTipoServicio.DEVOLUCION_CUENTA_CUPO_CREAR.getIs_codigo());
		DetalleCatalogoDTO ldc_detalleCatalogoDto = iidc_detalleCatalogoBusiness
				.consultarDetalleCatalogo(lc_catalogoDto);
		lts_tipoServicioGsiWsDto.setIs_tipoServicio(ldc_detalleCatalogoDto.getIs_idCodigoServicio());
		lts_tipoServicioGsiWsDto.setIs_subTipoServicio(ldc_detalleCatalogoDto.getIs_idCodigoSubServicio());

		List<TipoCriterioWSDTO> lltc_tipoCriterio = new ArrayList<>();
		TipoCriterioWSDTO ltc_tipoCriterioWsDto;

		lu_usuarioDto = iiub_usuarioBusiness
				.consultarUsuarioConDireccionYPersonaJuridica(lus_usuarioSesionDto.getIs_nombreUsuario());
		TipoSolicitanteGSIWSDTO ltsg_solicitante = new TipoSolicitanteGSIWSDTO();
		ltsg_solicitante.setIs_numeroDocumento(lu_usuarioDto.getIp_personaDto().getIs_numeroDocumento());
		ltsg_solicitante.setIs_tipoDocumento(lu_usuarioDto.getIp_personaDto().getItd_tipoDocumentoDto().getIs_id());
		ltsg_solicitante.setIs_tipoPersona(EnumTipoPersona.JURIDICA.getIs_codigo());

		ltegs_tipoEntradaGenerarSolicitudWsDto.setItsgv_solicitante(ltsg_solicitante);

		ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
		ltc_tipoCriterioWsDto.setIs_codigo(EnumConstantesDevoluciones.EMPRESA_TIPO_DOCUMENTO.getIs_nombreCampo());
		ltc_tipoCriterioWsDto.setIs_valor(lu_usuarioDto.getIp_personaDto().getItd_tipoDocumentoDto().getIs_nombre());
		lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);

		ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
		ltc_tipoCriterioWsDto.setIs_codigo(EnumConstantesDevoluciones.EMPRESA_NUMERO_DOCUMENTO.getIs_nombreCampo());
		ltc_tipoCriterioWsDto.setIs_valor(lu_usuarioDto.getIp_personaDto().getIs_numeroDocumento());
		lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);

		ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
		ltc_tipoCriterioWsDto.setIs_codigo(EnumConstantesDevoluciones.EMPRESA_RAZON_SOCIAL.getIs_nombreCampo());
		ltc_tipoCriterioWsDto.setIs_valor(lu_usuarioDto.getIpj_personaJuridicaDto().getIs_razonSocial());
		lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);

		ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
		ltc_tipoCriterioWsDto
		.setIs_codigo(EnumConstantesDevoluciones.EMPRESA_DIRECCION_CORRESPONDENCIA.getIs_nombreCampo());
		ltc_tipoCriterioWsDto.setIs_valor(new DireccionDevolucionesDTO(
				lu_usuarioDto.getIp_personaDto().getIlpd_personaDireccionsDto().iterator().next()).toString());
		lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);

		ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
		ltc_tipoCriterioWsDto.setIs_codigo(EnumConstantesDevoluciones.EMPRESA_TELEFONO_FIJO.getIs_nombreCampo());
		ltc_tipoCriterioWsDto.setIs_valor(lu_usuarioDto.getIpj_personaJuridicaDto().getIs_telefono());
		lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);

		ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
		ltc_tipoCriterioWsDto.setIs_codigo(EnumConstantesDevoluciones.EMPRESA_TELEFONO_MOVIL.getIs_nombreCampo());
		ltc_tipoCriterioWsDto.setIs_valor(lu_usuarioDto.getIs_celular());
		lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);

		ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
		ltc_tipoCriterioWsDto.setIs_codigo(EnumConstantesDevoluciones.EMPRESA_CORREO_ELECTRONICO.getIs_nombreCampo());
		ltc_tipoCriterioWsDto.setIs_valor(lu_usuarioDto.getIs_correoElectronico());
		lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);

		ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
		ltc_tipoCriterioWsDto.setIs_codigo(EnumConstantesDevoluciones.TIPO_DEVOLUCION.getIs_nombreCampo());
		ltc_tipoCriterioWsDto.setIs_valor(afdcc_formularioDevolucionCuentaCupoDto.getIs_tipoDevolucion());
		lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);

		if (afdcc_formularioDevolucionCuentaCupoDto.getIs_tipoDevolucion()
				.equals(EnumCriterio.POR_CANCELACION_CUENTA_CUPO.getIs_criterio())) {
			ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
			ltc_tipoCriterioWsDto.setIs_codigo(EnumConstantesDevoluciones.CODIGO_CUENTA_CUPO.getIs_nombreCampo());
			ltc_tipoCriterioWsDto.setIs_valor(afdcc_formularioDevolucionCuentaCupoDto.getIs_codigoCuentaCupo());
			lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);
		} else {
			ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
			ltc_tipoCriterioWsDto.setIs_codigo(EnumConstantesDevoluciones.CODIGO_NOTA_CREDITO.getIs_nombreCampo());
			ltc_tipoCriterioWsDto.setIs_valor(afdcc_formularioDevolucionCuentaCupoDto.getIs_codigoNotaCredito());
			lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);

			ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
			ltc_tipoCriterioWsDto.setIs_codigo(EnumConstantesDevoluciones.CODIGO_CUENTA_CUPO.getIs_nombreCampo());
			ltc_tipoCriterioWsDto.setIs_valor(afdcc_formularioDevolucionCuentaCupoDto.getIs_codigoCuentaCupo());
			lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);
		}

		ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
		ltc_tipoCriterioWsDto.setIs_codigo(EnumConstantesDevoluciones.MOTIVO_SOLICITUD.getIs_nombreCampo());
		ltc_tipoCriterioWsDto.setIs_valor(afdcc_formularioDevolucionCuentaCupoDto.getIs_motivoSolicitud());
		lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);

		List<TipoCriterioWSDTO> lltc_tipoCriterioWsDto = UtilidadConstantesDevoluciones
				.cargarInfoCuentaDevoluciones(afdcc_formularioDevolucionCuentaCupoDto);
		lltc_tipoCriterio.addAll(lltc_tipoCriterioWsDto);

		lts_tipoServicioGsiWsDto.setIltc_tipoCriterio(lltc_tipoCriterio);
		List<TipoServicioGSIWSDTO> lltsg_listaTipoServicioGsiWsDto = new ArrayList<>();
		lltsg_listaTipoServicioGsiWsDto.add(lts_tipoServicioGsiWsDto);
		ltegs_tipoEntradaGenerarSolicitudWsDto.setIltsgw_servicios(lltsg_listaTipoServicioGsiWsDto);

		// TODO: Descomentar cuando entregen bien el servicio de generar nir
		//		TipoSalidaGenerarSolicitudWSDTO ltsgs_tipoSalidaGenerarSolicitudWsDto = iisspb_solicitudSinPagoBusiness
		//				.generarSolicitud(ltegs_tipoEntradaGenerarSolicitudWsDto);
		//		UtilidadExcepciones.manejadorExcepcionesServicios(ltsgs_tipoSalidaGenerarSolicitudWsDto);
		//		if (!ltsgs_tipoSalidaGenerarSolicitudWsDto.getIs_codigoMensaje()
		//				.equals(EnumCodigosRespuestas.CODIGO_200.getIs_codigo())) {
		//			GeneradorGrowlGenerico
		//					.generarMensajeError(ltsgs_tipoSalidaGenerarSolicitudWsDto.getIs_descripcionMensaje());
		//		} else {
		//			ltf_transaccionFormularioDto = guardarTransaccionFormulario(aecf_nombreFormulario,
		//					ltsgs_tipoSalidaGenerarSolicitudWsDto.getIs_nir());
		//		}

		// TODO: Eliminar
		TipoSalidaGenerarSolicitudWSDTO ltsgs_tipoSalidaGenerarSolicitudWsDto = new TipoSalidaGenerarSolicitudWSDTO();
		SecureRandom lr_aleatorio = new SecureRandom();
		Integer li_cantidad = 13;
		String ls_numeros = "0123456789";
		Integer li_generado = 0;
		StringBuilder lsb_builder = new StringBuilder();

		while (li_cantidad-- != 0) {
			li_generado = (lr_aleatorio.nextInt(ls_numeros.length()));
			lsb_builder.append(ls_numeros.charAt(li_generado));
		}
		String ls_nir = "SNR" + lsb_builder.toString();
		ltsgs_tipoSalidaGenerarSolicitudWsDto.setIs_nir(ls_nir);

		ltf_transaccionFormularioDto = guardarTransaccionFormulario(aecf_nombreFormulario,
				ltsgs_tipoSalidaGenerarSolicitudWsDto.getIs_nir());
		// TODO: Eliminar

		return ltf_transaccionFormularioDto;
	}

	@Override
	public Boolean validarCodigoVerificacion(TransaccionFormularioDTO atf_transaccionFormulario,
			String as_codigoVerificacion, Boolean ab_verificacionCodigo) {
		try {
			if (ab_verificacionCodigo) {
				return true;
			} else {
				atf_transaccionFormulario
				.setIi_cantidadIntentos(atf_transaccionFormulario.getIi_cantidadIntentos() + 1);
				iitfb_transaccionFormularioBusiness.actualizarCantidadIntentosFallidos(atf_transaccionFormulario);
				GeneradorGrowlGenerico.generarMensajeError(EnumExcepcionesGenerales.CODIGO_INCORRECTO);
			}
		} catch (Exception ae_excepcion) {
			throw new ExcepcionesNegocio(EnumExcepcionesGenerales.CODIGO_INCORRECTO);
		}
		return ab_verificacionCodigo;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.
	 * IValorCampoFormularioBusiness#actualizarEstadoCodigoVerificacionValidado(co.
	 * gov.supernotariado.
	 * bachue.sedeelectronica.admon.persistence.dto.TransaccionFormularioDTO)
	 */
	@Override
	public void actualizarEstadoCodigoVerificacionValidado(TransaccionFormularioDTO atf_transaccionFormularioDto) {
		iitfb_transaccionFormularioBusiness.actualizarEstadoFormulario(atf_transaccionFormularioDto);
	}
}
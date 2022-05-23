/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: IntegracionTemporalBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl
 * Nombre del elemento: IntegracionTemporalBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import org.apache.log4j.Logger;

import com.mysql.jdbc.StringUtils;

import co.gov.supernotariado.bachue.sedeelectronica.admon.exception.ExcepcionesNegocio;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IAsociacionUsuarioPersonaJuridicaBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICarritoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICertificadoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IDetalleCatalogoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IFormularioUsuarioBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IIntegracionTemporalBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITipoProcesoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.AsociacionUsuarioPersonaJuridicaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CopiasDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.DatosEntradaSolicitudConsultaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.DetalleCuentaCupoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.FormularioCrearCuentaCupoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.IntegracionEntradaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.IntegracionTemporalDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.PersonaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.RecargaCuentaCupoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.SalidaMatriculaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.SolicitudConsultasDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionCEDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionCopiasDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionIndividualDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioSesionDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.interfaces.ITransaccionDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IIntegracionTemporalDAO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IUsuarioDAO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper.AsociacionUsuarioPersonaJuridicaHelper;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper.IntegracionEntradaHelper;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper.IntegracionTemporalHelper;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper.UsuarioHelper;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.AsociacionUsuarioPersonaJuridica;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.IntegracionTemporal;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Usuario;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IGestionCuentaCupoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IInterfacesFinancierasBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.ObtenerPdfLiquidacionSalidaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoAdminCICCIWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoAdminWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoCriterioGLIWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarIDCuentaCupoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarMovimientosWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarSaldoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarUsuarioWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaGenerarLiquidacionWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaObtenerPDFLiquidacionWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaPagarCuentaCupoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarIDCuentaCupoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarMovimientosWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarSaldoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarUsuarioWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaGenerarLiquidacionWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaPagarCuentaCupoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoServicioGLIWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoUsuarioCSIWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoUsuarioCUIWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumBoolean;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumCodigosRespuestas;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumCriterio;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumEstadoActivo;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumEstadoReferenciaPago;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumModoTipoServicio;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumNumeros;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumRol;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoPersona;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoProceso;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoServicio;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadAuditoria;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadAutoridadUsuario;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadExcepciones;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadSeguridad;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadUsuarioSesion;

/**
 * Clase tipo EJB (Enterprise Java Bean) de la capa de negocio. <br>
 * Contiene la implementacion logica de las operaciones del recurso Integracion
 * temporal. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless(name = "IntegracionTemporalBusiness", mappedName = "IntegracionTemporalBusiness")
@LocalBean
public class IntegracionTemporalBusiness implements IIntegracionTemporalBusiness {

	/**
	 * Atributo de instancia tipo IIntegracionTemporalDAO para definir la propiedad
	 * integracion temporal DAO.
	 */
	@EJB
	private IIntegracionTemporalDAO iiit_integracionTemporalDAO;

	/**
	 * Atributo de instancia tipo IInterfacesFinancierasBusiness para definir la
	 * propiedad interfaces financieras business.
	 */
	@EJB
	private IInterfacesFinancierasBusiness iiif_interfacesFinancierasBusiness;

	/**
	 * Atributo de instancia tipo IDetalleCatalogoBusiness para definir la propiedad
	 * detalle catalogo business.
	 */
	@EJB
	private IDetalleCatalogoBusiness iidcb_detalleCatalogoBusiness;

	/**
	 * Atributo de instancia tipo ICarritoBusiness para definir la propiedad carrito
	 * business.
	 */
	@EJB
	private ICarritoBusiness iic_carritoBusiness;

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
	 * Atributo de instancia tipo IGestionCuentaCupoBusiness para definir la
	 * propiedad gestion cuenta cupo business.
	 */
	@EJB
	private IGestionCuentaCupoBusiness iigcc_gestionCuentaCupoBusiness;

	/**
	 * Atributo de instancia tipo IAsociacionUsuarioPersonaJuridicaBusiness para
	 * definir la propiedad asociacion usuario persona juridica business.
	 */
	@EJB
	private IAsociacionUsuarioPersonaJuridicaBusiness iiaupj_asociacionUsuarioPersonaJuridicaBusiness;

	/**
	 * Atributo de instancia tipo IFormularioUsuarioBusiness para definir la
	 * propiedad formulario usuario business.
	 */
	@EJB
	private IFormularioUsuarioBusiness iifub_formularioUsuarioBusiness;
	
	/**
	 * Atributo de instancia tipo ICertificadoBusiness para definir la
	 * propiedad certificado business.
	 */
	@EJB
	private ICertificadoBusiness iicb_certificadosBusiness;

	/**
	 * Define la constante CL_LOGGER.
	 */
	private static final Logger CL_LOGGER = Logger.getLogger(IntegracionTemporalBusiness.class);

	/**
	 * Define la constante CI_DIAS_NO_VISIBLE.
	 */
	private static final Integer CI_DIAS_NO_VISIBLE = 24;
	

	/*
	 * (non-Javadoc)
	 * 
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.
	 * IIntegracionTemporalBusiness#crearIntegracionTemporal(co.gov.supernotariado.
	 * bachue.sedeelectronica.admon.persistence.dto.IntegracionTemporalDTO)
	 */
	@Override
	public Boolean crearIntegracionTemporal(IntegracionTemporalDTO ait_integracionTemporalDto) {
		ait_integracionTemporalDto = (IntegracionTemporalDTO) UtilidadAuditoria
				.adicionarDatosCreacion(ait_integracionTemporalDto);
		return iiit_integracionTemporalDAO.crearIntegracionTemporal(
				IntegracionTemporalHelper.dtoAEntidadCompleto(ait_integracionTemporalDto, new IntegracionTemporal()));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.
	 * IIntegracionTemporalBusiness#consultarHistorico(co.gov.supernotariado.bachue.
	 * sedeelectronica.admon.persistence.dto.TransaccionIndividualDTO)
	 */
	@Override
	public List<IntegracionEntradaDTO> consultarHistorico(TransaccionIndividualDTO ati_transaccionIndividualDto) {
		UsuarioSesionDTO lus_usuarioSesionDto;
		lus_usuarioSesionDto = UtilidadAutoridadUsuario.consultarUsuarioSesion();
		List<IntegracionTemporalDTO> llit_listaIntegracionTemporalDto;
		if (!lus_usuarioSesionDto.getIs_idAsociacion().equals("")) {
			llit_listaIntegracionTemporalDto = IntegracionTemporalHelper.listaEntidadADtoCompleto(
					iiit_integracionTemporalDAO.consultarHistoricoConAsociacion(lus_usuarioSesionDto.getIs_idUsuario(),
							lus_usuarioSesionDto.getIs_idAsociacion()));
		} else {
			llit_listaIntegracionTemporalDto = IntegracionTemporalHelper.listaEntidadADtoCompleto(
					iiit_integracionTemporalDAO.consultarHistorico(lus_usuarioSesionDto.getIs_idUsuario()));
		}
		List<IntegracionEntradaDTO> llie_integracionEntradaDto;
		llie_integracionEntradaDto = IntegracionEntradaHelper.listaDtoAEntradaSimple(llit_listaIntegracionTemporalDto);
		return llie_integracionEntradaDto;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.
	 * IIntegracionTemporalBusiness#consultarIntegraciones()
	 */
	@Override
	public List<IntegracionTemporalDTO> consultarIntegraciones() {
		UsuarioSesionDTO lus_usuarioSesionDto;
		lus_usuarioSesionDto = UtilidadAutoridadUsuario.consultarUsuarioSesion();
		List<IntegracionTemporalDTO> llit_listaIntegracionTemporalDto;
		if (lus_usuarioSesionDto.getIs_idAsociacion() != null
				&& !lus_usuarioSesionDto.getIs_idAsociacion().equals("")) {
			llit_listaIntegracionTemporalDto = IntegracionTemporalHelper.listaEntidadADtoCompleto(
					iiit_integracionTemporalDAO.consultarHistoricoConAsociacion(lus_usuarioSesionDto.getIs_idUsuario(),
							lus_usuarioSesionDto.getIs_idAsociacion()));
		} else {
			llit_listaIntegracionTemporalDto = IntegracionTemporalHelper.listaEntidadADtoCompleto(
					iiit_integracionTemporalDAO.consultarHistorico(lus_usuarioSesionDto.getIs_idUsuario()));
		}
		return llit_listaIntegracionTemporalDto;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.
	 * IIntegracionTemporalBusiness#consultarTransaccion(java.lang.String)
	 */
	@Override
	public IntegracionTemporalDTO consultarTransaccion(String as_nir) {
		IntegracionTemporalDTO lit_integracionTemporalDto;
		lit_integracionTemporalDto = IntegracionTemporalHelper
				.entidadADtoCompleto(iiit_integracionTemporalDAO.consultarTransaccion(as_nir));
		return lit_integracionTemporalDto;
	}

	@Override
	public IntegracionTemporalDTO consultarTransaccionReferencia(String as_referencia) {
		IntegracionTemporalDTO lit_integracionTemporalDto;
		lit_integracionTemporalDto = IntegracionTemporalHelper
				.entidadADtoCompleto(iiit_integracionTemporalDAO.consultarTransaccionReferencia(as_referencia));
		return lit_integracionTemporalDto;
	}

	/// Consulta o generarLiquidacion

	/**
	 * Metodo que carga una variable de integracion temporal con los datos de la
	 * transaccion.
	 *
	 * @param ait_transaccionDto                       transaccion en curso
	 * @param ategl_tipoEntradaGenerarLiquidacionWSDTO datos que se envian al
	 *                                                 servicio
	 * @param atsgl_tipoSalidaGenerarLiquidacionWSDTO  datos que se reciben del
	 *                                                 servicio
	 * @param aetp_enumTipoProceso                     enum del proceso realizado
	 * @return Resultado para cargar datos integracion temporal retornado como
	 *         IntegracionTemporalDTO
	 */
	private IntegracionTemporalDTO cargarDatosIntegracionTemporal(ITransaccionDTO ait_transaccionDto,
			TipoEntradaGenerarLiquidacionWSDTO ategl_tipoEntradaGenerarLiquidacionWSDTO,
			TipoSalidaGenerarLiquidacionWSDTO atsgl_tipoSalidaGenerarLiquidacionWSDTO,
			EnumTipoProceso aetp_enumTipoProceso) {
		IntegracionTemporalDTO lit_integracionTemporalDto = new IntegracionTemporalDTO();
		lit_integracionTemporalDto
		.setIs_codigoRespuesta(atsgl_tipoSalidaGenerarLiquidacionWSDTO.getIbi_codigoMensaje().toString());

		lit_integracionTemporalDto.setIs_idAsosiacion(ait_transaccionDto.getIs_idAsociacion());
		lit_integracionTemporalDto.setIs_entrada(ategl_tipoEntradaGenerarLiquidacionWSDTO.toString());
		lit_integracionTemporalDto.setIs_nir(atsgl_tipoSalidaGenerarLiquidacionWSDTO.getIs_nir());
		lit_integracionTemporalDto.setIs_modeloEntrada(ait_transaccionDto.toString());
		lit_integracionTemporalDto
		.setIs_operacion(ait_transaccionDto.getIdc_detalleCatalogoDto().getIc_catalogoDto().getIs_nombre());
		lit_integracionTemporalDto.setIu_usuarioDto(ait_transaccionDto.getIp_personaDto().getIu_usuarioDto());
		lit_integracionTemporalDto
		.setIs_referenciaPago(atsgl_tipoSalidaGenerarLiquidacionWSDTO.getIs_numeroReferencia());
		lit_integracionTemporalDto
		.setIs_resultadoGeneral(atsgl_tipoSalidaGenerarLiquidacionWSDTO.getIs_descripcionMensaje());
		lit_integracionTemporalDto.setIs_salida(atsgl_tipoSalidaGenerarLiquidacionWSDTO.toString());
		lit_integracionTemporalDto
		.setIbd_valorTotalServicio(atsgl_tipoSalidaGenerarLiquidacionWSDTO.getIbd_valorTotalServicio());
		lit_integracionTemporalDto.setItp_tipoProcesoDto(
				iitp_tipoProcesoBusiness.consultarTipoProcesoPorCodigo(aetp_enumTipoProceso.getIs_codigo()));
		lit_integracionTemporalDto.setIs_visibilidad(EnumEstadoActivo.VARCHAR_ACTIVO_S.getIs_codigo());
		return lit_integracionTemporalDto;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.
	 * IIntegracionTemporalBusiness#guardarTransaccion(co.gov.supernotariado.bachue.
	 * sedeelectronica.admon.persistence.dto.interfaces.ITransaccionDTO)
	 */
	@Override
	public IntegracionTemporalDTO guardarTransaccion(ITransaccionDTO ait_transaccionDto) {

		TipoEntradaGenerarLiquidacionWSDTO ltegl_tipoEntradaGenerarLiquidacionWSDTO = cargarEntradaLiquidacion(
				ait_transaccionDto);
		List<TipoServicioGLIWSDTO> llts_serviciosEntradaWSDto;
		if (ait_transaccionDto.getIdc_detalleCatalogoDto().getIs_codigoServicio()
				.equals(EnumTipoServicio.ALERTA.getIs_codigo())) {
			llts_serviciosEntradaWSDto = generarEntradaLiquidacionAlerta(ait_transaccionDto);
		} else if (ait_transaccionDto.getIdc_detalleCatalogoDto().getIs_codigoServicio()
				.equals(EnumTipoServicio.CERTIFICADO.getIs_codigo())) {
			ltegl_tipoEntradaGenerarLiquidacionWSDTO.setIb_matriculasMigradas(
					ait_transaccionDto.getIlsm_listaSalidaMatriculaDto().iterator().next().getIb_migradaMatricula());
			llts_serviciosEntradaWSDto = generarEntradaLiquidacionCertificado(ait_transaccionDto);
		} else if (ait_transaccionDto.getIdc_detalleCatalogoDto().getIs_codigoServicio()
				.equals(EnumTipoServicio.CONSULTA.getIs_codigo())) {
			SolicitudConsultasDTO lsc_solicitudConsultaDto = (SolicitudConsultasDTO) ait_transaccionDto;
			llts_serviciosEntradaWSDto = cargarCriteriosConsultas(lsc_solicitudConsultaDto);
		} else if (ait_transaccionDto.getIdc_detalleCatalogoDto().getIs_codigoServicio()
				.equals(EnumTipoServicio.COPIA.getIs_codigo())) {
			TransaccionCopiasDTO ltc_transaccionCopiaDto = (TransaccionCopiasDTO) ait_transaccionDto;
			llts_serviciosEntradaWSDto = cargarCriteriosCopias(ltc_transaccionCopiaDto);
		} else {
			llts_serviciosEntradaWSDto = new ArrayList<>();
		}

		TipoSalidaGenerarLiquidacionWSDTO ltsgl_tipoSalidaGenerarLiquidacionWSDTO = new TipoSalidaGenerarLiquidacionWSDTO();

		if (ltegl_tipoEntradaGenerarLiquidacionWSDTO.getIb_matriculasMigradas() != null
				&& !ltegl_tipoEntradaGenerarLiquidacionWSDTO.getIb_matriculasMigradas()) {
			ltsgl_tipoSalidaGenerarLiquidacionWSDTO = iicb_certificadosBusiness
					.generarTransaccionExtendida(ait_transaccionDto.getIlsm_listaSalidaMatriculaDto());
		} else {
			ltegl_tipoEntradaGenerarLiquidacionWSDTO
			.setIlts_listaTipoServicioLiquidacionWsDto(llts_serviciosEntradaWSDto);
			ltsgl_tipoSalidaGenerarLiquidacionWSDTO = this.iiif_interfacesFinancierasBusiness
					.generarLiquidacion(ltegl_tipoEntradaGenerarLiquidacionWSDTO);
			if (ait_transaccionDto.getIdc_detalleCatalogoDto().getIs_codigoServicio()
					.equals(EnumTipoServicio.CONSULTA.getIs_codigo()) && ltsgl_tipoSalidaGenerarLiquidacionWSDTO.getIs_codigoMensaje().equals(EnumCodigosRespuestas.CODIGO_409.getIs_codigo())) {
				CL_LOGGER.error(ltsgl_tipoSalidaGenerarLiquidacionWSDTO.getIs_descripcionMensaje());
				throw new ExcepcionesNegocio(ltsgl_tipoSalidaGenerarLiquidacionWSDTO.getIs_descripcionMensaje());
			} else {
				UtilidadExcepciones.manejadorExcepcionesServicios(ltsgl_tipoSalidaGenerarLiquidacionWSDTO);
			}
		}

		// ----------------------------------------
		IntegracionTemporalDTO lit_integracionTemporalDto;
		if (ait_transaccionDto.getIdc_detalleCatalogoDto().getIs_codigoServicio()
				.equals(EnumTipoServicio.ALERTA.getIs_codigo())) {
			lit_integracionTemporalDto = cargarDatosIntegracionTemporal(ait_transaccionDto,
					ltegl_tipoEntradaGenerarLiquidacionWSDTO, ltsgl_tipoSalidaGenerarLiquidacionWSDTO,
					EnumTipoProceso.REGISTRO_ALERTAS);
		} else if (ait_transaccionDto.getIdc_detalleCatalogoDto().getIs_codigoServicio()
				.equals(EnumTipoServicio.CERTIFICADO.getIs_codigo())) {
			lit_integracionTemporalDto = cargarDatosIntegracionTemporal(ait_transaccionDto,
					ltegl_tipoEntradaGenerarLiquidacionWSDTO, ltsgl_tipoSalidaGenerarLiquidacionWSDTO,
					EnumTipoProceso.CERTIFICADOS);
		} else if (ait_transaccionDto.getIdc_detalleCatalogoDto().getIs_codigoServicio()
				.equals(EnumTipoServicio.CONSULTA.getIs_codigo())) {
			lit_integracionTemporalDto = cargarDatosIntegracionTemporal(ait_transaccionDto,
					ltegl_tipoEntradaGenerarLiquidacionWSDTO, ltsgl_tipoSalidaGenerarLiquidacionWSDTO,
					EnumTipoProceso.CONSULTAS);
		} else if (ait_transaccionDto.getIdc_detalleCatalogoDto().getIs_codigoServicio()
				.equals(EnumTipoServicio.COPIA.getIs_codigo())) {
			lit_integracionTemporalDto = cargarDatosIntegracionTemporal(ait_transaccionDto,
					ltegl_tipoEntradaGenerarLiquidacionWSDTO, ltsgl_tipoSalidaGenerarLiquidacionWSDTO,
					EnumTipoProceso.COPIAS);
			if(lit_integracionTemporalDto.getIs_referenciaPago() == null || lit_integracionTemporalDto.getIs_referenciaPago().isEmpty())
				lit_integracionTemporalDto.setIs_referenciaPago(EnumEstadoReferenciaPago.PENDIENTE_GENERAR.getIs_estado());
		} else {
			lit_integracionTemporalDto = new IntegracionTemporalDTO();
		}
		if (crearIntegracionTemporal(lit_integracionTemporalDto)) {
			iic_carritoBusiness.cancelarCarrito(ait_transaccionDto, null);
			return lit_integracionTemporalDto;
		}
		return null;
	}

	/**
	 * Metodo que se encarga de generar la lista de criterios para copias.
	 *
	 * @param atc_transaccionCopiaDto transaccion de copias
	 * @return Resultado para cargar criterios copias retornado como una lista de
	 *         TipoServicioGLIWSDTO
	 */
	private List<TipoServicioGLIWSDTO> cargarCriteriosCopias(TransaccionCopiasDTO atc_transaccionCopiaDto) {
		List<TipoServicioGLIWSDTO> llts_listaTipoServiciosWSDto = new ArrayList<>();
		TipoServicioGLIWSDTO lts_tipoServicioLiquidacionWSDto = new TipoServicioGLIWSDTO();
		lts_tipoServicioLiquidacionWSDto.setIs_valorServicio(String.valueOf(atc_transaccionCopiaDto.getIbd_valorTotal()));
		lts_tipoServicioLiquidacionWSDto.setIs_cantidadSolicitada(cargarNumeroFoliosCopias(atc_transaccionCopiaDto.getIlc_listaCopiasDto()).toString());
		lts_tipoServicioLiquidacionWSDto
		.setIs_subtipoServicio(atc_transaccionCopiaDto.getIdc_detalleCatalogoDto().getIs_idCodigoSubServicio());
		lts_tipoServicioLiquidacionWSDto
		.setIs_tipoServicio(atc_transaccionCopiaDto.getIdc_detalleCatalogoDto().getIs_idCodigoServicio());

		List<TipoCriterioGLIWSDTO> lltc_listaCriterioWSDto = new ArrayList<>();

		TipoCriterioGLIWSDTO ltc_criterioWSDTO = new TipoCriterioGLIWSDTO();
		ltc_criterioWSDTO.setIs_valor(atc_transaccionCopiaDto.getIs_idSolicitud());
		ltc_criterioWSDTO.setIs_codigo(EnumCriterio.COPIAS_ID_SOLICITUD.getIs_criterio());
		lltc_listaCriterioWSDto.add(ltc_criterioWSDTO);

		ltc_criterioWSDTO = new TipoCriterioGLIWSDTO();
		ltc_criterioWSDTO.setIs_valor(atc_transaccionCopiaDto.getIs_correoEnvio());
		ltc_criterioWSDTO.setIs_codigo(EnumCriterio.COPIAS_FORMA_ENVIO_MAIL.getIs_criterio());
		lltc_listaCriterioWSDto.add(ltc_criterioWSDTO);
		lts_tipoServicioLiquidacionWSDto.setIltc_criterios(lltc_listaCriterioWSDto);
		llts_listaTipoServiciosWSDto.add(lts_tipoServicioLiquidacionWSDto);
		return llts_listaTipoServiciosWSDto;
	}
	
	/**
	 * Metodo que se encarga de contabilizar los folios de la solicitud
	 * 
	 * @param alc_listaCopiasDto listado de copias que se realizan
	 * @return BigInteger valor con la cantidad de folios de la transaccion
	 */
	private BigInteger cargarNumeroFoliosCopias(List<CopiasDTO> alc_listaCopiasDto) {
		BigInteger lbi_cantidadSolicitada = BigInteger.ZERO;
		for(CopiasDTO ic_copiasDto: alc_listaCopiasDto) {
			lbi_cantidadSolicitada = lbi_cantidadSolicitada.add(BigInteger.valueOf(ic_copiasDto.getIi_cantidadFolios()));
		}
		return lbi_cantidadSolicitada;
	}

	/**
	 * Metodo que carga la entrada para consumir loa operacion Generar liquidacion
	 * del servicio de operaciones financieras para alertas.
	 *
	 * @param ait_transaccionDTO transaccion realizada de registro alertas
	 * @return Resultado para generar entrada liquidacion alerta retornado como una
	 *         lista de TipoServicioGLIWSDTO
	 */
	private List<TipoServicioGLIWSDTO> generarEntradaLiquidacionAlerta(ITransaccionDTO ait_transaccionDTO) {
		List<TipoServicioGLIWSDTO> llts_listaTipoServiciosWSDto = new ArrayList<>();
		for (SalidaMatriculaDTO lsm_salidaMatriculaDto : ait_transaccionDTO.getIlsm_listaSalidaMatriculaDto()) {
			TipoServicioGLIWSDTO lts_tipoServicioLiquidacionWSDto = new TipoServicioGLIWSDTO();

			lts_tipoServicioLiquidacionWSDto.setIs_valorServicio(ait_transaccionDTO.getIbd_valorTotal().toString());
			BigInteger lbi_cantidadSolicitada = new BigInteger(EnumCriterio.RESPUESTA_CANTIDAD.getIs_criterio());
			lts_tipoServicioLiquidacionWSDto.setIs_cantidadSolicitada(lbi_cantidadSolicitada.toString());
			lts_tipoServicioLiquidacionWSDto
			.setIs_subtipoServicio(ait_transaccionDTO.getIdc_detalleCatalogoDto().getIs_idCodigoSubServicio());
			lts_tipoServicioLiquidacionWSDto
			.setIs_tipoServicio(ait_transaccionDTO.getIdc_detalleCatalogoDto().getIs_idCodigoServicio());

			List<TipoCriterioGLIWSDTO> lltc_listaCriterioWSDto = new ArrayList<>();

			TipoCriterioGLIWSDTO ltc_criterioWSDTO = new TipoCriterioGLIWSDTO();
			ltc_criterioWSDTO.setIs_valor(lsm_salidaMatriculaDto.getIm_matriculaDto().getIs_codigoMatricula());
			ltc_criterioWSDTO.setIs_codigo(EnumCriterio.MATRICULA.getIs_criterio());
			lltc_listaCriterioWSDto.add(ltc_criterioWSDTO);

			ltc_criterioWSDTO = new TipoCriterioGLIWSDTO();
			ltc_criterioWSDTO.setIs_valor(
					lsm_salidaMatriculaDto.getIm_matriculaDto().getIcr_circuloRegistralMatricula().getIs_id());
			ltc_criterioWSDTO.setIs_codigo(EnumCriterio.ORIP_MATRICULA.getIs_criterio());
			lltc_listaCriterioWSDto.add(ltc_criterioWSDTO);

			ltc_criterioWSDTO = new TipoCriterioGLIWSDTO();
			ltc_criterioWSDTO.setIs_valor(ait_transaccionDTO.getIp_personaDto().getIu_usuarioDto().getIs_celular());
			ltc_criterioWSDTO.setIs_codigo(EnumCriterio.NUMERO_CELULAR_SOLICITANTE.getIs_criterio());
			lltc_listaCriterioWSDto.add(ltc_criterioWSDTO);

			ltc_criterioWSDTO = new TipoCriterioGLIWSDTO();
			ltc_criterioWSDTO
			.setIs_valor(ait_transaccionDTO.getIp_personaDto().getIu_usuarioDto().getIs_correoElectronico());
			ltc_criterioWSDTO.setIs_codigo(EnumCriterio.CORREO_ELECTRONICO_SOLICITANTE.getIs_criterio());
			lltc_listaCriterioWSDto.add(ltc_criterioWSDTO);

			lts_tipoServicioLiquidacionWSDto.setIltc_criterios(lltc_listaCriterioWSDto);

			llts_listaTipoServiciosWSDto.add(lts_tipoServicioLiquidacionWSDto);
		}
		return llts_listaTipoServiciosWSDto;
	}

	/**
	 * Metodo que carga la entrada para consumir loa operacion Generar liquidacion
	 * del servicio de operaciones financieras para solicitar certificados.
	 *
	 * @param ait_transaccionDTO transaccion realizada de solicitud de certificados
	 * @return Resultado para generar entrada liquidacion certificado retornado como
	 *         una lista de TipoServicioGLIWSDTO
	 */
	private List<TipoServicioGLIWSDTO> generarEntradaLiquidacionCertificado(ITransaccionDTO ait_transaccionDTO) {
		List<TipoServicioGLIWSDTO> llts_listaTipoServiciosEntradaWSDto = new ArrayList<>();

		List<SalidaMatriculaDTO> llsm_listaSalidaMatricula = cargarCantidadesTransaccion(
				ait_transaccionDTO.getIlsm_listaSalidaMatriculaDto());
		for (SalidaMatriculaDTO lsm_salidaMatriculaDto : llsm_listaSalidaMatricula) {
			TipoServicioGLIWSDTO lts_servicioLiquidacionEntradaWSDto = new TipoServicioGLIWSDTO();

			lts_servicioLiquidacionEntradaWSDto
			.setIs_valorServicio(lsm_salidaMatriculaDto.getIbd_valorUnitario().toString());
			lts_servicioLiquidacionEntradaWSDto
			.setIs_cantidadSolicitada(lsm_salidaMatriculaDto.getIbi_cantidadSolicitada().toString());

			List<TipoCriterioGLIWSDTO> lltc_listaCriterioWSDto = new ArrayList<>();

			TipoCriterioGLIWSDTO ltc_criterioWSDTO = new TipoCriterioGLIWSDTO();
			ltc_criterioWSDTO.setIs_valor(lsm_salidaMatriculaDto.getIm_matriculaDto().getIs_codigoMatricula());
			ltc_criterioWSDTO.setIs_codigo(EnumCriterio.MATRICULA.getIs_criterio());
			lltc_listaCriterioWSDto.add(ltc_criterioWSDTO);

			// Cedula catastral si es certificado predial y es opcional junto a matricula

			ltc_criterioWSDTO = new TipoCriterioGLIWSDTO();
			ltc_criterioWSDTO.setIs_valor(
					lsm_salidaMatriculaDto.getIm_matriculaDto().getIcr_circuloRegistralMatricula().getIs_id());
			ltc_criterioWSDTO.setIs_codigo(EnumCriterio.ORIP_MATRICULA.getIs_criterio());
			lltc_listaCriterioWSDto.add(ltc_criterioWSDTO);

			ltc_criterioWSDTO = new TipoCriterioGLIWSDTO();
			ltc_criterioWSDTO.setIs_valor(ait_transaccionDTO.getIs_envio());
			ltc_criterioWSDTO.setIs_codigo(EnumCriterio.FORMA_ENVIO_MAIL.getIs_criterio());
			lltc_listaCriterioWSDto.add(ltc_criterioWSDTO);

			ltc_criterioWSDTO = new TipoCriterioGLIWSDTO();
			ltc_criterioWSDTO.setIs_valor(EnumCriterio.RESPUESTA_CANTIDAD.getIs_criterio());
			ltc_criterioWSDTO.setIs_codigo(EnumCriterio.CANTIDAD.getIs_criterio());
			lltc_listaCriterioWSDto.add(ltc_criterioWSDTO);

			ltc_criterioWSDTO = new TipoCriterioGLIWSDTO();
			ltc_criterioWSDTO.setIs_valor(lsm_salidaMatriculaDto.getIs_direccion());
			ltc_criterioWSDTO.setIs_codigo(EnumCriterio.NOMBRE_PREDIO.getIs_criterio());
			lltc_listaCriterioWSDto.add(ltc_criterioWSDTO);

			lts_servicioLiquidacionEntradaWSDto.setIltc_criterios(lltc_listaCriterioWSDto);
			lts_servicioLiquidacionEntradaWSDto
			.setIs_subtipoServicio(ait_transaccionDTO.getIdc_detalleCatalogoDto().getIs_idCodigoSubServicio());
			lts_servicioLiquidacionEntradaWSDto
			.setIs_tipoServicio(ait_transaccionDTO.getIdc_detalleCatalogoDto().getIs_idCodigoServicio());
			llts_listaTipoServiciosEntradaWSDto.add(lts_servicioLiquidacionEntradaWSDto);
		}

		return llts_listaTipoServiciosEntradaWSDto;
	}

	/**
	 * Metodo que se utiliza para cargar y quitar matriculas duplicadas.
	 *
	 * @param alsm_listaSalidaMatriculaDto salida matricula con datos duplicados
	 * @return Lista de SalidaMatriculaDTO, salida matricula sin duplicados y
	 *         agregado cantidad
	 */
	private List<SalidaMatriculaDTO> cargarCantidadesTransaccion(
			List<SalidaMatriculaDTO> alsm_listaSalidaMatriculaDto) {
		List<SalidaMatriculaDTO> llsm_listaSalidaMatricula = new ArrayList<>();

		if (!alsm_listaSalidaMatriculaDto.iterator().next().getIb_migradaMatricula()) {
			return alsm_listaSalidaMatriculaDto;
		}

		for (SalidaMatriculaDTO lsm_salidaMatricula : alsm_listaSalidaMatriculaDto) {
			for (SalidaMatriculaDTO lsm_salidaCargada : llsm_listaSalidaMatricula) {
				if (lsm_salidaCargada.getIm_matriculaDto().getIs_codigoMatricula()
						.equals(lsm_salidaMatricula.getIm_matriculaDto().getIs_codigoMatricula())
						&& lsm_salidaCargada.getIm_matriculaDto().getIcr_circuloRegistralMatricula().getIs_id()
						.equals(lsm_salidaMatricula.getIm_matriculaDto().getIcr_circuloRegistralMatricula()
								.getIs_id())) {
					lsm_salidaCargada.setIbi_cantidadSolicitada(
							lsm_salidaCargada.getIbi_cantidadSolicitada().add(BigInteger.valueOf(1)));
					lsm_salidaMatricula = lsm_salidaCargada;
					llsm_listaSalidaMatricula.remove(lsm_salidaCargada);
					break;
				}
			}
			llsm_listaSalidaMatricula.add(lsm_salidaMatricula);
		}
		return llsm_listaSalidaMatricula;
	}

	/**
	 * Cargar criterios consultas.
	 *
	 * @param asc_solicitudConsultasDTO el parametro solicitud consultas DTO
	 * @return Resultado para cargar criterios consultas retornado como una lista de
	 *         TipoServicioGLIWSDTO
	 */
	private List<TipoServicioGLIWSDTO> cargarCriteriosConsultas(SolicitudConsultasDTO asc_solicitudConsultasDTO) {
		List<TipoServicioGLIWSDTO> llts_listaServicioLiquidacionEntradaWsDto = new ArrayList<>();
		Boolean lb_validarTransaccion = asc_solicitudConsultasDTO.getIemts_enumModoTipoServicio().equals(EnumModoTipoServicio.MASIVO);
		for (DatosEntradaSolicitudConsultaDTO ldesc_datosEntradaSolicitudConsultasDto : asc_solicitudConsultasDTO
				.getIldesc_listaDatosEntradaSolicitudConsultaDto()) {

			TipoServicioGLIWSDTO lts_tipoServicioWSDto = new TipoServicioGLIWSDTO();
			lts_tipoServicioWSDto
			.setIs_valorServicio(ldesc_datosEntradaSolicitudConsultasDto.getIbd_valorUnitario().toString());
			BigInteger lbi_cantidadSolicitada = new BigInteger(EnumCriterio.RESPUESTA_CANTIDAD.getIs_criterio());
			lts_tipoServicioWSDto.setIs_cantidadSolicitada(lbi_cantidadSolicitada.toString());

			lts_tipoServicioWSDto.setIs_subtipoServicio(
					asc_solicitudConsultasDTO.getIdc_detalleCatalogoDto().getIs_idCodigoSubServicio());
			lts_tipoServicioWSDto
			.setIs_tipoServicio(asc_solicitudConsultasDTO.getIdc_detalleCatalogoDto().getIs_idCodigoServicio());

			List<TipoCriterioGLIWSDTO> lltc_listaCriterioWsDto = new ArrayList<>();

			TipoCriterioGLIWSDTO ltc_criterioWsDto = new TipoCriterioGLIWSDTO();
			ltc_criterioWsDto.setIs_codigo(EnumCriterio.FORMA_ENVIO_MAIL.getIs_criterio());
			ltc_criterioWsDto.setIs_valor(asc_solicitudConsultasDTO.getIs_correoEnvio());
			lltc_listaCriterioWsDto.add(ltc_criterioWsDto);

			if (ldesc_datosEntradaSolicitudConsultasDto.getIs_tipoPersona() != null
					&& !ldesc_datosEntradaSolicitudConsultasDto.getIs_tipoPersona().isEmpty()) {
				ltc_criterioWsDto = new TipoCriterioGLIWSDTO();
				ltc_criterioWsDto.setIs_codigo(EnumCriterio.TIPO_PERSONA_PROPIETARIO.getIs_criterio());
				ltc_criterioWsDto.setIs_valor(ldesc_datosEntradaSolicitudConsultasDto.getIs_tipoPersona());
				lltc_listaCriterioWsDto.add(ltc_criterioWsDto);
			}

			if (ldesc_datosEntradaSolicitudConsultasDto.getIs_tipoDocumento() != null
					&& !ldesc_datosEntradaSolicitudConsultasDto.getIs_tipoDocumento().isEmpty()) {
				ltc_criterioWsDto = new TipoCriterioGLIWSDTO();
				ltc_criterioWsDto.setIs_codigo(EnumCriterio.TIPO_DOCUMENTO_PROPIETARIO.getIs_criterio());
				ltc_criterioWsDto.setIs_valor(ldesc_datosEntradaSolicitudConsultasDto.getIs_tipoDocumento());
				lltc_listaCriterioWsDto.add(ltc_criterioWsDto);
			}

			if (ldesc_datosEntradaSolicitudConsultasDto.getIs_numeroDocumento() != null
					&& !ldesc_datosEntradaSolicitudConsultasDto.getIs_numeroDocumento().isEmpty()) {
				ltc_criterioWsDto = new TipoCriterioGLIWSDTO();
				ltc_criterioWsDto.setIs_codigo(EnumCriterio.NUMERO_DOCUMENTO_PROPIETARIO.getIs_criterio());
				ltc_criterioWsDto.setIs_valor(ldesc_datosEntradaSolicitudConsultasDto.getIs_numeroDocumento());
				lltc_listaCriterioWsDto.add(ltc_criterioWsDto);
			}

			if (ldesc_datosEntradaSolicitudConsultasDto.getIs_primerNombre() != null
					&& !ldesc_datosEntradaSolicitudConsultasDto.getIs_primerNombre().isEmpty()) {
				ltc_criterioWsDto = new TipoCriterioGLIWSDTO();
				ltc_criterioWsDto.setIs_codigo(EnumCriterio.PRIMER_NOMBRE_PROPIETARIO.getIs_criterio());
				ltc_criterioWsDto.setIs_valor(ldesc_datosEntradaSolicitudConsultasDto.getIs_primerNombre());
				lltc_listaCriterioWsDto.add(ltc_criterioWsDto);
			}

			if (ldesc_datosEntradaSolicitudConsultasDto.getIs_segundoNombre() != null
					&& !ldesc_datosEntradaSolicitudConsultasDto.getIs_segundoNombre().isEmpty()) {
				ltc_criterioWsDto = new TipoCriterioGLIWSDTO();
				ltc_criterioWsDto.setIs_codigo(EnumCriterio.SEGUNDO_NOMBRE_PROPIETARIO.getIs_criterio());
				ltc_criterioWsDto.setIs_valor(ldesc_datosEntradaSolicitudConsultasDto.getIs_segundoNombre());
				lltc_listaCriterioWsDto.add(ltc_criterioWsDto);
			}

			if (ldesc_datosEntradaSolicitudConsultasDto.getIs_primerApellido() != null
					&& !ldesc_datosEntradaSolicitudConsultasDto.getIs_primerApellido().isEmpty()) {
				ltc_criterioWsDto = new TipoCriterioGLIWSDTO();
				ltc_criterioWsDto.setIs_codigo(EnumCriterio.PRIMER_APELLIDO_PROPIETARIO.getIs_criterio());
				ltc_criterioWsDto.setIs_valor(ldesc_datosEntradaSolicitudConsultasDto.getIs_primerApellido());
				lltc_listaCriterioWsDto.add(ltc_criterioWsDto);
			}

			if (ldesc_datosEntradaSolicitudConsultasDto.getIs_segundoApellido() != null
					&& !ldesc_datosEntradaSolicitudConsultasDto.getIs_segundoApellido().isEmpty()) {
				ltc_criterioWsDto = new TipoCriterioGLIWSDTO();
				ltc_criterioWsDto.setIs_codigo(EnumCriterio.SEGUNDO_APELLIDO_PROPIETARIO.getIs_criterio());
				ltc_criterioWsDto.setIs_valor(ldesc_datosEntradaSolicitudConsultasDto.getIs_segundoApellido());
				lltc_listaCriterioWsDto.add(ltc_criterioWsDto);
			}

			if (ldesc_datosEntradaSolicitudConsultasDto.getIs_razonSocial() != null
					&& !ldesc_datosEntradaSolicitudConsultasDto.getIs_razonSocial().isEmpty()) {
				ltc_criterioWsDto = new TipoCriterioGLIWSDTO();
				ltc_criterioWsDto.setIs_codigo(EnumCriterio.RAZON_SOCIAL_PROPIETARIO.getIs_criterio());
				ltc_criterioWsDto.setIs_valor(ldesc_datosEntradaSolicitudConsultasDto.getIs_razonSocial());
				lltc_listaCriterioWsDto.add(ltc_criterioWsDto);
			}
			if (ldesc_datosEntradaSolicitudConsultasDto.getIcr_orip() != null
					&& !ldesc_datosEntradaSolicitudConsultasDto.getIcr_orip().getIs_id().isEmpty()) {
				ltc_criterioWsDto = new TipoCriterioGLIWSDTO();
				ltc_criterioWsDto.setIs_codigo(EnumCriterio.ORIP_MATRICULA.getIs_criterio());
				if(lb_validarTransaccion) {
					ltc_criterioWsDto.setIs_valor(ldesc_datosEntradaSolicitudConsultasDto.getIcr_orip().getIs_id());
				}else {
					ltc_criterioWsDto.setIs_valor(ldesc_datosEntradaSolicitudConsultasDto.getIcr_orip().getIs_id());
				}
				lltc_listaCriterioWsDto.add(ltc_criterioWsDto);
			}

			if (ldesc_datosEntradaSolicitudConsultasDto.getIta_tipoActo() != null
					&& !ldesc_datosEntradaSolicitudConsultasDto.getIta_tipoActo().getIs_id().isEmpty()) {
				ltc_criterioWsDto = new TipoCriterioGLIWSDTO();
				ltc_criterioWsDto.setIs_codigo(EnumCriterio.TIPO_ACTO.getIs_criterio());
				ltc_criterioWsDto.setIs_valor(ldesc_datosEntradaSolicitudConsultasDto.getIta_tipoActo().getIs_id());
				lltc_listaCriterioWsDto.add(ltc_criterioWsDto);
			}

			lts_tipoServicioWSDto.setIltc_criterios(lltc_listaCriterioWsDto);
			llts_listaServicioLiquidacionEntradaWsDto.add(lts_tipoServicioWSDto);

		}
		return llts_listaServicioLiquidacionEntradaWsDto;
	}

	/**
	 * Cargar entrada liquidacion.
	 *
	 * @param ait_transaccionDTO el parametro transaccion DTO
	 * @return Resultado para cargar entrada liquidacion retornado como
	 *         TipoEntradaGenerarLiquidacionWSDTO
	 */
	private TipoEntradaGenerarLiquidacionWSDTO cargarEntradaLiquidacion(ITransaccionDTO ait_transaccionDTO) {
		TipoEntradaGenerarLiquidacionWSDTO ltegl_liquidacionEntradaWsDto = new TipoEntradaGenerarLiquidacionWSDTO();

		PersonaDTO lp_personaDto = ait_transaccionDTO.getIp_personaDto();
		ltegl_liquidacionEntradaWsDto.setIs_codigoConvenio("");
		ltegl_liquidacionEntradaWsDto.setIs_codigoCanal(EnumCriterio.CODIGO_CANAL.getIs_criterio());
		ltegl_liquidacionEntradaWsDto.setIs_codigoSucursalCanal(EnumCriterio.CODIGO_SUCURSAL.getIs_criterio());
		ltegl_liquidacionEntradaWsDto.setIs_oripSolicitud("");

		ltegl_liquidacionEntradaWsDto.setIs_numeroDocSolicitante(lp_personaDto.getIs_numeroDocumento());

		ltegl_liquidacionEntradaWsDto.setIs_tipoDocSolicitante(lp_personaDto.getItd_tipoDocumentoDto().getIs_id());
		String ls_tipoPersona = "";
		if (lp_personaDto.getIpj_personaJuridicaDto() != null) {
			ls_tipoPersona = EnumTipoPersona.JURIDICA.getIs_nombreConsulta();
			ltegl_liquidacionEntradaWsDto.setIs_primerApellidoSolicitante("");
			ltegl_liquidacionEntradaWsDto.setIs_primerNombreSolicitante("");
			ltegl_liquidacionEntradaWsDto.setIs_segundoApellidoSolicitante("");
			ltegl_liquidacionEntradaWsDto.setIs_segundoNombreSolicitante("");
			ltegl_liquidacionEntradaWsDto
			.setIs_razonSocial(lp_personaDto.getIpj_personaJuridicaDto().getIs_razonSocial());
		} else if (lp_personaDto.getIpn_personaNaturalDto() != null) {
			ls_tipoPersona = EnumTipoPersona.NATURAL.getIs_nombreConsulta();
			ltegl_liquidacionEntradaWsDto.setIs_primerApellidoSolicitante(
					(lp_personaDto.getIpn_personaNaturalDto().getIs_primerApellido() == null) ? ""
							: lp_personaDto.getIpn_personaNaturalDto().getIs_primerApellido());
			ltegl_liquidacionEntradaWsDto.setIs_segundoApellidoSolicitante(
					(lp_personaDto.getIpn_personaNaturalDto().getIs_segundoApellido() == null) ? ""
							: lp_personaDto.getIpn_personaNaturalDto().getIs_segundoApellido());
			ltegl_liquidacionEntradaWsDto.setIs_primerNombreSolicitante(
					(lp_personaDto.getIpn_personaNaturalDto().getIs_primerNombre() == null) ? ""
							: lp_personaDto.getIpn_personaNaturalDto().getIs_primerNombre());
			ltegl_liquidacionEntradaWsDto.setIs_segundoNombreSolicitante(
					(lp_personaDto.getIpn_personaNaturalDto().getIs_segundoNombre() == null) ? ""
							: lp_personaDto.getIpn_personaNaturalDto().getIs_segundoNombre());
			ltegl_liquidacionEntradaWsDto.setIs_razonSocial("");
		}
		ltegl_liquidacionEntradaWsDto.setIs_tipoPersona(ls_tipoPersona);
		return ltegl_liquidacionEntradaWsDto;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.
	 * IIntegracionTemporalBusiness#eliminarTemporal(co.gov.supernotariado.bachue.
	 * sedeelectronica.admon.persistence.dto.IntegracionTemporalDTO)
	 */
	@Override
	public Boolean eliminarTemporal(IntegracionTemporalDTO ait_integracionTemporalDto) {
		return iiit_integracionTemporalDAO.eliminarTransacionTemporal(
				IntegracionTemporalHelper.dtoAEntidadCompleto(ait_integracionTemporalDto, new IntegracionTemporal()));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.
	 * IIntegracionTemporalBusiness#guardarTransaccionCE(co.gov.supernotariado.
	 * bachue.sedeelectronica.admon.persistence.dto.TransaccionCEDTO)
	 */
	@Override
	public IntegracionTemporalDTO guardarTransaccionCE(TransaccionCEDTO atce_transaccionCEDTO) {
		TipoEntradaGenerarLiquidacionWSDTO ltegl_tipoEntradaGenerarLiquidacionWSDTO = generarEntradaLiquidacionCertificadoEspecial(
				atce_transaccionCEDTO);
		TipoSalidaGenerarLiquidacionWSDTO ltsgl_generarLiquidacionSalidaWSDTO = this.iiif_interfacesFinancierasBusiness
				.generarLiquidacion(ltegl_tipoEntradaGenerarLiquidacionWSDTO);

		UtilidadExcepciones.manejadorExcepcionesServicios(ltsgl_generarLiquidacionSalidaWSDTO);
		IntegracionTemporalDTO lit_integracionTemporalDto = cargarDatosIntegracionTemporal(atce_transaccionCEDTO,
				ltegl_tipoEntradaGenerarLiquidacionWSDTO, ltsgl_generarLiquidacionSalidaWSDTO,
				EnumTipoProceso.CERTIFICADOS);
		lit_integracionTemporalDto.setIs_visibilidad(EnumEstadoActivo.VARCHAR_INACTIVO_N.getIs_codigo());
		if (crearIntegracionTemporal(lit_integracionTemporalDto)) {
			return lit_integracionTemporalDto;
		}
		return null;
	}

	/**
	 * Metod que se encarga de cargar los datos de generar liquidacion para la
	 * solicitud de certificado especial.
	 *
	 * @param atce_transaccionCEDTO transaccion de certificado especial
	 * @return Resultado para generar entrada liquidacion certificado especial
	 *         retornado como TipoEntradaGenerarLiquidacionWSDTO
	 */
	private TipoEntradaGenerarLiquidacionWSDTO generarEntradaLiquidacionCertificadoEspecial(
			TransaccionCEDTO atce_transaccionCEDTO) {
		TipoEntradaGenerarLiquidacionWSDTO ltegl_tipoEntradaGenrarLiquidacionWsDto = cargarEntradaLiquidacion(
				atce_transaccionCEDTO);
		List<TipoServicioGLIWSDTO> llts_listaServiciosEntradaWSDto = new ArrayList<>();
		TipoServicioGLIWSDTO lts_servicioLiquidacionEntradaWSDto = new TipoServicioGLIWSDTO();
		SalidaMatriculaDTO lsm_salidaMatriculaDto = new SalidaMatriculaDTO();

		lts_servicioLiquidacionEntradaWSDto.setIs_valorServicio(atce_transaccionCEDTO.getIbd_valorTotal().toString());
		BigInteger lbi_cantidadSolicitada = new BigInteger(EnumCriterio.RESPUESTA_CANTIDAD.getIs_criterio());
		lts_servicioLiquidacionEntradaWSDto.setIs_cantidadSolicitada(lbi_cantidadSolicitada.toString());

		List<TipoCriterioGLIWSDTO> lltc_listaCriterioWSDto = new ArrayList<>();

		TipoCriterioGLIWSDTO ltc_criterioWSDTO = new TipoCriterioGLIWSDTO();
		if (atce_transaccionCEDTO.getIcenm_numeroMatriculaDTO() != null) {
			lsm_salidaMatriculaDto.setIm_matriculaDto(atce_transaccionCEDTO.getIcenm_numeroMatriculaDTO()
					.getIsm_salidaMatriculaDTO().getIm_matriculaDto());
			if (lsm_salidaMatriculaDto.getIm_matriculaDto() != null) {
				ltc_criterioWSDTO.setIs_valor(lsm_salidaMatriculaDto.getIm_matriculaDto().getIs_codigoMatricula());
				ltc_criterioWSDTO.setIs_codigo(EnumCriterio.MATRICULA.getIs_criterio());
				lltc_listaCriterioWSDto.add(ltc_criterioWSDTO);

				ltc_criterioWSDTO = new TipoCriterioGLIWSDTO();
				ltc_criterioWSDTO.setIs_valor(
						lsm_salidaMatriculaDto.getIm_matriculaDto().getIcr_circuloRegistralMatricula().getIs_id());
				ltc_criterioWSDTO.setIs_codigo(EnumCriterio.ORIP_MATRICULA.getIs_criterio());
				lltc_listaCriterioWSDto.add(ltc_criterioWSDTO);

				ltc_criterioWSDTO = new TipoCriterioGLIWSDTO();
				ltc_criterioWSDTO.setIs_valor(
						atce_transaccionCEDTO.getIcenm_numeroMatriculaDTO().getId_fechaSolicitud().toString());
				ltc_criterioWSDTO.setIs_codigo(EnumCriterio.FECHA_SOLICITUD.getIs_criterio());
				lltc_listaCriterioWSDto.add(ltc_criterioWSDTO);
			}
			if (!StringUtils
					.isNullOrEmpty(atce_transaccionCEDTO.getIcenm_numeroMatriculaDTO().getIs_cedulaCatastral())) {
				ltc_criterioWSDTO = new TipoCriterioGLIWSDTO();
				ltc_criterioWSDTO
				.setIs_valor(atce_transaccionCEDTO.getIcenm_numeroMatriculaDTO().getIs_cedulaCatastral());
				ltc_criterioWSDTO.setIs_codigo(EnumCriterio.CEDULA_CATASTRAL.getIs_criterio());
				lltc_listaCriterioWSDto.add(ltc_criterioWSDTO);
			}
		}

		ltc_criterioWSDTO = new TipoCriterioGLIWSDTO();
		ltc_criterioWSDTO
		.setIs_valor(atce_transaccionCEDTO.getIp_personaDto().getIu_usuarioDto().getIs_correoElectronico());
		ltc_criterioWSDTO.setIs_codigo(EnumCriterio.FORMA_ENVIO_MAIL.getIs_criterio());
		lltc_listaCriterioWSDto.add(ltc_criterioWSDTO);

		if (atce_transaccionCEDTO.getIceip_idPropietarioDTO() != null) {
			ltc_criterioWSDTO = new TipoCriterioGLIWSDTO();
			ltc_criterioWSDTO.setIs_valor(
					atce_transaccionCEDTO.getIceip_idPropietarioDTO().getItd_tipoDocumentoDto().getIs_id());
			ltc_criterioWSDTO.setIs_codigo(EnumCriterio.TIPO_DOCUMENTO.getIs_criterio());
			lltc_listaCriterioWSDto.add(ltc_criterioWSDTO);

			ltc_criterioWSDTO = new TipoCriterioGLIWSDTO();
			ltc_criterioWSDTO.setIs_valor(atce_transaccionCEDTO.getIceip_idPropietarioDTO().getIs_numeroDocumento());
			ltc_criterioWSDTO.setIs_codigo(EnumCriterio.NUMERO_DOCUMENTO.getIs_criterio());
			lltc_listaCriterioWSDto.add(ltc_criterioWSDTO);

			if (atce_transaccionCEDTO.getIceip_idPropietarioDTO().getIc_tipoPersonaDto().getIs_codigoValor()
					.equals(EnumTipoPersona.NATURAL.getIs_codigo())) {
				ltc_criterioWSDTO = new TipoCriterioGLIWSDTO();
				ltc_criterioWSDTO.setIs_valor(EnumTipoPersona.NATURAL.getIs_parametro());
				ltc_criterioWSDTO.setIs_codigo(EnumCriterio.TIPO_PERSONA.getIs_criterio());
				lltc_listaCriterioWSDto.add(ltc_criterioWSDTO);

				ltc_criterioWSDTO = new TipoCriterioGLIWSDTO();
				ltc_criterioWSDTO.setIs_valor(atce_transaccionCEDTO.getIceip_idPropietarioDTO().getIs_primerNombre());
				ltc_criterioWSDTO.setIs_codigo(EnumCriterio.PRIMER_NOMPRE.getIs_criterio());
				lltc_listaCriterioWSDto.add(ltc_criterioWSDTO);

				if (!StringUtils
						.isNullOrEmpty(atce_transaccionCEDTO.getIceip_idPropietarioDTO().getIs_segundoNombre())) {
					ltc_criterioWSDTO = new TipoCriterioGLIWSDTO();
					ltc_criterioWSDTO
					.setIs_valor(atce_transaccionCEDTO.getIceip_idPropietarioDTO().getIs_segundoNombre());
					ltc_criterioWSDTO.setIs_codigo(EnumCriterio.SEGUNDO_NOMBRE.getIs_criterio());
					lltc_listaCriterioWSDto.add(ltc_criterioWSDTO);
				}

				ltc_criterioWSDTO = new TipoCriterioGLIWSDTO();
				ltc_criterioWSDTO.setIs_valor(atce_transaccionCEDTO.getIceip_idPropietarioDTO().getIs_primerApellido());
				ltc_criterioWSDTO.setIs_codigo(EnumCriterio.PRIMER_APELLIDO.getIs_criterio());
				lltc_listaCriterioWSDto.add(ltc_criterioWSDTO);

				if (!StringUtils
						.isNullOrEmpty(atce_transaccionCEDTO.getIceip_idPropietarioDTO().getIs_segundoApellido())) {
					ltc_criterioWSDTO = new TipoCriterioGLIWSDTO();
					ltc_criterioWSDTO
					.setIs_valor(atce_transaccionCEDTO.getIceip_idPropietarioDTO().getIs_segundoApellido());
					ltc_criterioWSDTO.setIs_codigo(EnumCriterio.SEGUNDO_APELLIDO.getIs_criterio());
					lltc_listaCriterioWSDto.add(ltc_criterioWSDTO);
				}
			} else {
				ltc_criterioWSDTO = new TipoCriterioGLIWSDTO();
				ltc_criterioWSDTO.setIs_valor(EnumTipoPersona.JURIDICA.getIs_parametro());
				ltc_criterioWSDTO.setIs_codigo(EnumCriterio.TIPO_PERSONA.getIs_criterio());
				lltc_listaCriterioWSDto.add(ltc_criterioWSDTO);

				ltc_criterioWSDTO = new TipoCriterioGLIWSDTO();
				ltc_criterioWSDTO.setIs_valor(atce_transaccionCEDTO.getIceip_idPropietarioDTO().getIs_razonSocial());
				ltc_criterioWSDTO.setIs_codigo(EnumCriterio.RAZON_SOCIAL.getIs_criterio());
				lltc_listaCriterioWSDto.add(ltc_criterioWSDTO);
			}
		}
		if (atce_transaccionCEDTO.getIced_direccionDTO() != null) {
			ltc_criterioWSDTO = new TipoCriterioGLIWSDTO();
			ltc_criterioWSDTO
			.setIs_valor(atce_transaccionCEDTO.getIced_direccionDTO().getIc_tipoPredioDto().getIs_nombre());
			ltc_criterioWSDTO.setIs_codigo(EnumCriterio.TIPO_PREDIO_DIRECCION.getIs_criterio());
			lltc_listaCriterioWSDto.add(ltc_criterioWSDTO);

			ltc_criterioWSDTO = new TipoCriterioGLIWSDTO();
			ltc_criterioWSDTO
			.setIs_valor((atce_transaccionCEDTO.getIced_direccionDTO().getId_departamentoDto() == null) ? ""
					: atce_transaccionCEDTO.getIced_direccionDTO().getId_departamentoDto().getIs_nombre());
			ltc_criterioWSDTO.setIs_codigo(EnumCriterio.DEPARTAMENTO_CE.getIs_criterio());
			lltc_listaCriterioWSDto.add(ltc_criterioWSDTO);

			ltc_criterioWSDTO = new TipoCriterioGLIWSDTO();
			ltc_criterioWSDTO
			.setIs_valor((atce_transaccionCEDTO.getIced_direccionDTO().getIm_municipioDto() == null) ? ""
					: atce_transaccionCEDTO.getIced_direccionDTO().getIm_municipioDto().getIs_nombre());
			ltc_criterioWSDTO.setIs_codigo(EnumCriterio.MUNICIPIO_DIRECCION.getIs_criterio());
			lltc_listaCriterioWSDto.add(ltc_criterioWSDTO);

			ltc_criterioWSDTO = new TipoCriterioGLIWSDTO();
			ltc_criterioWSDTO.setIs_valor((atce_transaccionCEDTO.getIced_direccionDTO().getIv_veredaDto() == null) ? ""
					: atce_transaccionCEDTO.getIced_direccionDTO().getIv_veredaDto().getIs_nombre());
			ltc_criterioWSDTO.setIs_codigo(EnumCriterio.VEREDA_CE.getIs_criterio());
			lltc_listaCriterioWSDto.add(ltc_criterioWSDTO);

			ltc_criterioWSDTO = new TipoCriterioGLIWSDTO();
			ltc_criterioWSDTO
			.setIs_valor((atce_transaccionCEDTO.getIced_direccionDTO().getIs_nombrePredio() == null) ? ""
					: atce_transaccionCEDTO.getIced_direccionDTO().getIs_nombrePredio());
			ltc_criterioWSDTO.setIs_codigo(EnumCriterio.NOMBRE_PREDIO_CE.getIs_criterio());
			lltc_listaCriterioWSDto.add(ltc_criterioWSDTO);

			ltc_criterioWSDTO = new TipoCriterioGLIWSDTO();
			ltc_criterioWSDTO
			.setIs_valor(atce_transaccionCEDTO.getIced_direccionDTO().getIte_tipoEjeDto().getIs_nombre());
			ltc_criterioWSDTO.setIs_codigo(EnumCriterio.TIPO_EJE_CE.getIs_criterio());
			lltc_listaCriterioWSDto.add(ltc_criterioWSDTO);

			ltc_criterioWSDTO = new TipoCriterioGLIWSDTO();
			ltc_criterioWSDTO.setIs_valor(atce_transaccionCEDTO.getIced_direccionDTO().getIs_ejePrincipal());
			ltc_criterioWSDTO.setIs_codigo(EnumCriterio.EJE_PRINCIPAL_CE.getIs_criterio());
			lltc_listaCriterioWSDto.add(ltc_criterioWSDTO);

			ltc_criterioWSDTO = new TipoCriterioGLIWSDTO();
			ltc_criterioWSDTO.setIs_valor(atce_transaccionCEDTO.getIced_direccionDTO().getIte_eje1Dto().getIs_nombre());
			ltc_criterioWSDTO.setIs_codigo(EnumCriterio.EJE_UNO_CE.getIs_criterio());
			lltc_listaCriterioWSDto.add(ltc_criterioWSDTO);

			ltc_criterioWSDTO = new TipoCriterioGLIWSDTO();
			ltc_criterioWSDTO.setIs_valor(atce_transaccionCEDTO.getIced_direccionDTO().getIs_ejeSecundario());
			ltc_criterioWSDTO.setIs_codigo(EnumCriterio.EJE_SEGUNDARIO.getIs_criterio());
			lltc_listaCriterioWSDto.add(ltc_criterioWSDTO);

			ltc_criterioWSDTO = new TipoCriterioGLIWSDTO();
			ltc_criterioWSDTO.setIs_valor(atce_transaccionCEDTO.getIced_direccionDTO().getIs_complementoDireccion());
			ltc_criterioWSDTO.setIs_codigo(EnumCriterio.DIRECCION_COMPLEMENTO_CE.getIs_criterio());
			lltc_listaCriterioWSDto.add(ltc_criterioWSDTO);
		}
		if (atce_transaccionCEDTO.getIceas_antiguoSistemaDTO() != null) {
			ltc_criterioWSDTO = new TipoCriterioGLIWSDTO();
			ltc_criterioWSDTO.setIs_valor(atce_transaccionCEDTO.getIceas_antiguoSistemaDTO().getIs_detalle());
			ltc_criterioWSDTO.setIs_codigo(EnumCriterio.DETALLE_AS.getIs_criterio());
			lltc_listaCriterioWSDto.add(ltc_criterioWSDTO);

			ltc_criterioWSDTO = new TipoCriterioGLIWSDTO();
			ltc_criterioWSDTO.setIs_valor(atce_transaccionCEDTO.getIceas_antiguoSistemaDTO().getIs_libro());
			ltc_criterioWSDTO.setIs_codigo(EnumCriterio.LIBRO.getIs_criterio());
			lltc_listaCriterioWSDto.add(ltc_criterioWSDTO);

			ltc_criterioWSDTO = new TipoCriterioGLIWSDTO();
			ltc_criterioWSDTO
			.setIs_valor(String.valueOf(atce_transaccionCEDTO.getIceas_antiguoSistemaDTO().getIi_tomo()));
			ltc_criterioWSDTO.setIs_codigo(EnumCriterio.TOMO.getIs_criterio());
			lltc_listaCriterioWSDto.add(ltc_criterioWSDTO);

			ltc_criterioWSDTO = new TipoCriterioGLIWSDTO();
			ltc_criterioWSDTO.setIs_valor(atce_transaccionCEDTO.getIceas_antiguoSistemaDTO().getIs_anio());
			ltc_criterioWSDTO.setIs_codigo(EnumCriterio.ANIO.getIs_criterio());
			lltc_listaCriterioWSDto.add(ltc_criterioWSDTO);

			ltc_criterioWSDTO = new TipoCriterioGLIWSDTO();
			ltc_criterioWSDTO.setIs_valor(
					(atce_transaccionCEDTO.getIceas_antiguoSistemaDTO().getIc_tipoPartida().getIs_codigoValor() != null)
					? atce_transaccionCEDTO.getIceas_antiguoSistemaDTO().getIc_tipoPartida().getIs_codigoValor()
							: "");
			ltc_criterioWSDTO.setIs_codigo(EnumCriterio.TIPO_PARTIDA.getIs_criterio());
			lltc_listaCriterioWSDto.add(ltc_criterioWSDTO);

			ltc_criterioWSDTO = new TipoCriterioGLIWSDTO();
			ltc_criterioWSDTO.setIs_valor(atce_transaccionCEDTO.getIceas_antiguoSistemaDTO().getIs_numeroPartida());
			ltc_criterioWSDTO.setIs_codigo(EnumCriterio.NUMERO_PARTIDA.getIs_criterio());
			lltc_listaCriterioWSDto.add(ltc_criterioWSDTO);

			ltc_criterioWSDTO = new TipoCriterioGLIWSDTO();
			ltc_criterioWSDTO.setIs_valor(
					atce_transaccionCEDTO.getIceas_antiguoSistemaDTO().getIc_tipoPredio().getIs_codigoValor());
			ltc_criterioWSDTO.setIs_codigo(EnumCriterio.TIPO_PREDIO.getIs_criterio());
			lltc_listaCriterioWSDto.add(ltc_criterioWSDTO);

			ltc_criterioWSDTO = new TipoCriterioGLIWSDTO();
			ltc_criterioWSDTO.setIs_valor(atce_transaccionCEDTO.getIceas_antiguoSistemaDTO().getIs_nombrePredio());
			ltc_criterioWSDTO.setIs_codigo(EnumCriterio.NOMBRE_PREDIO.getIs_criterio());
			lltc_listaCriterioWSDto.add(ltc_criterioWSDTO);

			ltc_criterioWSDTO = new TipoCriterioGLIWSDTO();
			ltc_criterioWSDTO
			.setIs_valor(atce_transaccionCEDTO.getIceas_antiguoSistemaDTO().getIm_municipio().getIs_nombre());
			ltc_criterioWSDTO.setIs_codigo(EnumCriterio.MUNICIPIO_PREDIO.getIs_criterio());
			lltc_listaCriterioWSDto.add(ltc_criterioWSDTO);

			ltc_criterioWSDTO = new TipoCriterioGLIWSDTO();
			ltc_criterioWSDTO.setIs_valor(atce_transaccionCEDTO.getIceas_antiguoSistemaDTO().getIs_folio());
			ltc_criterioWSDTO.setIs_codigo(EnumCriterio.FOLIO.getIs_criterio());
			lltc_listaCriterioWSDto.add(ltc_criterioWSDTO);

			ltc_criterioWSDTO = new TipoCriterioGLIWSDTO();
			ltc_criterioWSDTO.setIs_valor(
					atce_transaccionCEDTO.getIceas_antiguoSistemaDTO().getIcr_circuloRegistralMatricula().getIs_id());
			ltc_criterioWSDTO.setIs_codigo(EnumCriterio.ORIP_ANTIGUO_SISTEMA.getIs_criterio());
			lltc_listaCriterioWSDto.add(ltc_criterioWSDTO);

			if (atce_transaccionCEDTO.getIceas_antiguoSistemaDTO().getIs_numeroMatricula() != null) {
				ltc_criterioWSDTO = new TipoCriterioGLIWSDTO();
				ltc_criterioWSDTO
				.setIs_valor(atce_transaccionCEDTO.getIceas_antiguoSistemaDTO().getIs_numeroMatricula());
				ltc_criterioWSDTO.setIs_codigo(EnumCriterio.NUMERO_MATRICULA_AS.getIs_criterio());
				lltc_listaCriterioWSDto.add(ltc_criterioWSDTO);
			}
		}
		lts_servicioLiquidacionEntradaWSDto.setIltc_criterios(lltc_listaCriterioWSDto);
		lts_servicioLiquidacionEntradaWSDto.setIs_cantidadSolicitada(EnumCriterio.RESPUESTA_CANTIDAD.getIs_criterio());
		lts_servicioLiquidacionEntradaWSDto
		.setIs_subtipoServicio(atce_transaccionCEDTO.getIdc_detalleCatalogoDto().getIs_idCodigoSubServicio());
		lts_servicioLiquidacionEntradaWSDto
		.setIs_tipoServicio(atce_transaccionCEDTO.getIdc_detalleCatalogoDto().getIs_idCodigoServicio());
		llts_listaServiciosEntradaWSDto.add(lts_servicioLiquidacionEntradaWSDto);
		ltegl_tipoEntradaGenrarLiquidacionWsDto
		.setIlts_listaTipoServicioLiquidacionWsDto(llts_listaServiciosEntradaWSDto);

		return ltegl_tipoEntradaGenrarLiquidacionWsDto;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.
	 * IIntegracionTemporalBusiness#validarContrasenaCorrecta(java.lang.String)
	 */
	@Override
	public boolean validarContrasenaCorrecta(String as_contrasenaConfirmacion) {
		UsuarioSesionDTO lus_usuarioSesionDto;
		lus_usuarioSesionDto = UtilidadAutoridadUsuario.consultarUsuarioSesion();
		Usuario lu_usuario = iiu_usuarioDao.consultarUsuario(lus_usuarioSesionDto.getIs_nombreUsuario());
		UsuarioDTO lu_usuarioDto = UsuarioHelper.entidadADtoCompleto(lu_usuario);
		return UtilidadSeguridad.validarContrasena(as_contrasenaConfirmacion, lu_usuarioDto.getIs_claveHash());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.
	 * IIntegracionTemporalBusiness#consultarCuentaCupo(co.gov.supernotariado.bachue
	 * .sedeelectronica.admon.persistence.dto.IntegracionEntradaDTO)
	 */
	@Override
	public DetalleCuentaCupoDTO consultarCuentaCupo(IntegracionEntradaDTO aie_integracionEntradaDto) {
		AsociacionUsuarioPersonaJuridicaDTO laupj_asociacionUsuarioPersonaJuridicaDto = new AsociacionUsuarioPersonaJuridicaDTO();
		AsociacionUsuarioPersonaJuridica laupj_asociacionUsuarioPersonaJuridica = null;

		if (EnumRol.PERSONA_JURIDICA.getIs_estereotipo()
				.equals(aie_integracionEntradaDto.getIs_estereotipoCreacion())) {
			laupj_asociacionUsuarioPersonaJuridica = iiaupj_asociacionUsuarioPersonaJuridicaBusiness
					.consultarPorId(aie_integracionEntradaDto.getIs_idAsosiacion());
			laupj_asociacionUsuarioPersonaJuridicaDto = AsociacionUsuarioPersonaJuridicaHelper
					.entidadADtoCompleto(laupj_asociacionUsuarioPersonaJuridica);
			laupj_asociacionUsuarioPersonaJuridicaDto.getId_fechaCreacion();
		}
		FormularioCrearCuentaCupoDTO lfccc_camposFormularioCreacionCuentaCupo = iifub_formularioUsuarioBusiness
				.consultarDatosFormularioCuentaCupoCreacion(laupj_asociacionUsuarioPersonaJuridicaDto
						.getIpj_idPersonaJuridica().getIu_usuarioDto().getIs_id());
		TipoEntradaConsultarIDCuentaCupoWSDTO ltecicc_tipoEntradaConsultarIdCuentaCupoWsDto = new TipoEntradaConsultarIDCuentaCupoWSDTO();
		ltecicc_tipoEntradaConsultarIdCuentaCupoWsDto.setIs_modulo(EnumCriterio.CANAL_ORIGEN.getIs_criterio());
		String ls_correoCorporativo = "";
		String ls_numDoc = "";
		String ls_tipoDoc = "";
		TipoAdminCICCIWSDTO ltac_adminCicciVo = new TipoAdminCICCIWSDTO();

		ls_numDoc = lfccc_camposFormularioCreacionCuentaCupo.getIs_numeroDocumentoRepresentanteLegal();
		ls_tipoDoc = lfccc_camposFormularioCreacionCuentaCupo.getIs_tipoDocumentoRepresentanteLegal();
		ls_correoCorporativo = lfccc_camposFormularioCreacionCuentaCupo.getIs_correo();
		ltac_adminCicciVo.setIs_correoElectronicoCorporativoUsuario(ls_correoCorporativo);
		ltac_adminCicciVo.setIs_numDocAdmin(ls_numDoc);
		ltac_adminCicciVo.setIs_tipoDocAdmin(ls_tipoDoc);
		ltecicc_tipoEntradaConsultarIdCuentaCupoWsDto.setItac_adminCicciVo(ltac_adminCicciVo);
		TipoSalidaConsultarIDCuentaCupoWSDTO ltscicc_tipoSalidaConsultarIdCuentaCupoWsDto = iigcc_gestionCuentaCupoBusiness
				.consultarIdCuentaCupo(ltecicc_tipoEntradaConsultarIdCuentaCupoWsDto);

		TipoEntradaConsultarUsuarioWSDTO ltecu_tipoEntradaConsultarUsuarioWsDto = new TipoEntradaConsultarUsuarioWSDTO();
		ltecu_tipoEntradaConsultarUsuarioWsDto.setIs_modulo(EnumCriterio.CANAL_ORIGEN.getIs_criterio());
		ltecu_tipoEntradaConsultarUsuarioWsDto
		.setIs_idCuentaCupo(ltscicc_tipoSalidaConsultarIdCuentaCupoWsDto.getIs_id());
		TipoAdminWSDTO lta_adminVo = new TipoAdminWSDTO();
		lta_adminVo.setIs_numDocAdmin(ls_numDoc);
		lta_adminVo.setIs_tipoDocAdmin(ls_tipoDoc);
		ltecu_tipoEntradaConsultarUsuarioWsDto.setIta_adminVo(lta_adminVo);
		String ls_numDocUsu = "";
		String ls_tipoDocUsu = "";
		TipoUsuarioCUIWSDTO ltuc_usuarioVo = new TipoUsuarioCUIWSDTO();
		if (laupj_asociacionUsuarioPersonaJuridicaDto.getIu_usuarioDto() != null) {
			ls_numDocUsu = laupj_asociacionUsuarioPersonaJuridicaDto.getIu_usuarioDto().getIp_personaDto()
					.getIs_numeroDocumento();
			ls_tipoDocUsu = laupj_asociacionUsuarioPersonaJuridicaDto.getIu_usuarioDto().getIp_personaDto()
					.getItd_tipoDocumentoDto().getIs_id();
		}
		ltuc_usuarioVo.setIs_numDocUsuario(ls_numDocUsu);
		ltuc_usuarioVo.setIs_tipoDocUsuario(ls_tipoDocUsu);
		ltecu_tipoEntradaConsultarUsuarioWsDto.setItuc_usuarioVo(ltuc_usuarioVo);
		TipoSalidaConsultarUsuarioWSDTO ltscu_tipoSalidaConsultarUsuarioWsDto = iigcc_gestionCuentaCupoBusiness
				.consultarUsuario(ltecu_tipoEntradaConsultarUsuarioWsDto);

		TipoEntradaConsultarSaldoWSDTO ltecs_tipoEntradaConsultarSaldowsDto = new TipoEntradaConsultarSaldoWSDTO();
		ltecs_tipoEntradaConsultarSaldowsDto
		.setIs_idCuentaCupo(ltscicc_tipoSalidaConsultarIdCuentaCupoWsDto.getIs_id());
		ltecs_tipoEntradaConsultarSaldowsDto.setIs_modulo(EnumCriterio.CANAL_ORIGEN.getIs_criterio());
		ltecs_tipoEntradaConsultarSaldowsDto.setIta_adminWSDto(lta_adminVo);
		TipoUsuarioCSIWSDTO ltu_usuarioCsi = new TipoUsuarioCSIWSDTO();
		ltu_usuarioCsi.setIs_numDocUsuario(ls_numDocUsu);
		ltu_usuarioCsi.setIs_tipoDocUsuario(ls_tipoDocUsu);
		ltecs_tipoEntradaConsultarSaldowsDto.setItu_usuarioCsi(ltu_usuarioCsi);
		TipoSalidaConsultarSaldoWSDTO ltscs_tipoSalidaConsultarSaldoWsDto = iigcc_gestionCuentaCupoBusiness
				.consultarSaldo(ltecs_tipoEntradaConsultarSaldowsDto);
		TipoEntradaConsultarMovimientosWSDTO ltecm_tipoEntradaConsultarMovimientosWsdto = new TipoEntradaConsultarMovimientosWSDTO();
		ltecm_tipoEntradaConsultarMovimientosWsdto.setIs_modulo(EnumCriterio.CANAL_ORIGEN.getIs_criterio());
		ltecm_tipoEntradaConsultarMovimientosWsdto
		.setIs_idCuentaCupo(ltscicc_tipoSalidaConsultarIdCuentaCupoWsDto.getIs_id());
		ltecm_tipoEntradaConsultarMovimientosWsdto.setIta_adminVo(lta_adminVo);
		ltecm_tipoEntradaConsultarMovimientosWsdto.setId_fechaInicial(new Date());
		ltecm_tipoEntradaConsultarMovimientosWsdto.setId_fechaFinal(new Date());

		TipoSalidaConsultarMovimientosWSDTO ltscm_tipoSalidaConsultarMovimientosWsdto = iigcc_gestionCuentaCupoBusiness
				.consultarMovimientos(ltecm_tipoEntradaConsultarMovimientosWsdto);

		DetalleCuentaCupoDTO ldcc_detalleCuentaCupoDto = new DetalleCuentaCupoDTO();
		ldcc_detalleCuentaCupoDto.setIs_numeroCuenta(ltscicc_tipoSalidaConsultarIdCuentaCupoWsDto.getIs_id());
		ldcc_detalleCuentaCupoDto.setIbd_saldo(ltscs_tipoSalidaConsultarSaldoWsDto.getIbd_saldoActual());
		ldcc_detalleCuentaCupoDto
		.setIs_estadoCuenta(ltscu_tipoSalidaConsultarUsuarioWsDto.getItuc_usuarioVo().getIs_estado());
		ldcc_detalleCuentaCupoDto.setId_ultimoMovimiento(ltscm_tipoSalidaConsultarMovimientosWsdto.getIltm_movimientos()
				.get(ltscm_tipoSalidaConsultarMovimientosWsdto.getIltm_movimientos().size() - 1)
				.getId_fechaMovimiento());
		return ldcc_detalleCuentaCupoDto;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.
	 * IIntegracionTemporalBusiness#pagarCuentaCupo(co.gov.supernotariado.bachue.
	 * sedeelectronica.admon.persistence.dto.IntegracionEntradaDTO)
	 */
	@Override
	public boolean pagarCuentaCupo(IntegracionEntradaDTO aie_integracionEntradaDto) {

		AsociacionUsuarioPersonaJuridicaDTO laupj_asociacionUsuarioPersonaJuridicaDto = null;
		AsociacionUsuarioPersonaJuridica laupj_asociacionUsuarioPersonaJuridica = null;

		if (EnumRol.PERSONA_JURIDICA.getIs_estereotipo()
				.equals(aie_integracionEntradaDto.getIs_estereotipoCreacion())) {
			laupj_asociacionUsuarioPersonaJuridica = iiaupj_asociacionUsuarioPersonaJuridicaBusiness
					.consultarPorId(aie_integracionEntradaDto.getIs_idAsosiacion());
			laupj_asociacionUsuarioPersonaJuridicaDto = AsociacionUsuarioPersonaJuridicaHelper
					.entidadADtoCompleto(laupj_asociacionUsuarioPersonaJuridica);
			laupj_asociacionUsuarioPersonaJuridicaDto.getId_fechaCreacion();
		}


		FormularioCrearCuentaCupoDTO lfccc_camposFormularioCreacionCuentaCupo = new FormularioCrearCuentaCupoDTO();

		if (laupj_asociacionUsuarioPersonaJuridicaDto != null) {
			lfccc_camposFormularioCreacionCuentaCupo = iifub_formularioUsuarioBusiness
					.consultarDatosFormularioCuentaCupoCreacion(laupj_asociacionUsuarioPersonaJuridicaDto
							.getIpj_idPersonaJuridica().getIu_usuarioDto().getIs_id());
		}


		TipoEntradaConsultarIDCuentaCupoWSDTO ltecicc_tipoEntradaConsultarIdCuentaCupoWsDto = new TipoEntradaConsultarIDCuentaCupoWSDTO();
		ltecicc_tipoEntradaConsultarIdCuentaCupoWsDto.setIs_modulo(EnumCriterio.CANAL_ORIGEN.getIs_criterio());
		TipoAdminCICCIWSDTO ltac_adminCicciVo = new TipoAdminCICCIWSDTO();
		String ls_correoCorporativo = "";
		if (laupj_asociacionUsuarioPersonaJuridicaDto != null) {
			if (laupj_asociacionUsuarioPersonaJuridicaDto.getIs_correoElectronicoCorporativo() != null)
				ls_correoCorporativo = lfccc_camposFormularioCreacionCuentaCupo.getIs_correo();
			ltac_adminCicciVo.setIs_numDocAdmin(
					lfccc_camposFormularioCreacionCuentaCupo.getIs_numeroDocumentoRepresentanteLegal());
			ltac_adminCicciVo.setIs_tipoDocAdmin(
					lfccc_camposFormularioCreacionCuentaCupo.getIs_tipoDocumentoRepresentanteLegal());
		}
		ltac_adminCicciVo.setIs_correoElectronicoCorporativoUsuario(ls_correoCorporativo);
		ltecicc_tipoEntradaConsultarIdCuentaCupoWsDto.setItac_adminCicciVo(ltac_adminCicciVo);
		TipoSalidaConsultarIDCuentaCupoWSDTO ltscicc_tipoSalidaConsultarIdCuentaCupoWsDto = iigcc_gestionCuentaCupoBusiness
				.consultarIdCuentaCupo(ltecicc_tipoEntradaConsultarIdCuentaCupoWsDto);

		TipoEntradaPagarCuentaCupoWSDTO ltepcc_tipoEntradaPagarCuentaCupoWsDto = new TipoEntradaPagarCuentaCupoWSDTO();
		ltepcc_tipoEntradaPagarCuentaCupoWsDto.setIbd_montoPago(aie_integracionEntradaDto.getIbd_valorTotalServicio());
		ltepcc_tipoEntradaPagarCuentaCupoWsDto.setId_fechaPago(new Date());
		ltepcc_tipoEntradaPagarCuentaCupoWsDto.setIs_correoElectronicoCorporativoUsuario(ls_correoCorporativo);
		ltepcc_tipoEntradaPagarCuentaCupoWsDto
		.setIs_idCuentaCupo(ltscicc_tipoSalidaConsultarIdCuentaCupoWsDto.getIs_id());
		ltepcc_tipoEntradaPagarCuentaCupoWsDto.setIs_modulo(EnumCriterio.CANAL_ORIGEN.getIs_criterio());
		ltepcc_tipoEntradaPagarCuentaCupoWsDto.setIs_referenciaPago(aie_integracionEntradaDto.getIs_referenciaPago());

		TipoSalidaPagarCuentaCupoWSDTO ltspcc_tipoSalidaPagarCuentaCupoWsdto = iigcc_gestionCuentaCupoBusiness
				.pagarCuentaCupo(ltepcc_tipoEntradaPagarCuentaCupoWsDto);

		boolean lb_booleano = false;
		if (EnumCodigosRespuestas.CODIGO_200.getIs_codigo()
				.equals(ltspcc_tipoSalidaPagarCuentaCupoWsdto.getIbi_codigoMensaje().toString())) {
			lb_booleano = true;
		}
		return lb_booleano;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.
	 * IIntegracionTemporalBusiness#generarEntradaLiquidacionRecarga(co.gov.
	 * supernotariado.bachue.sedeelectronica.admon.persistence.dto.
	 * RecargaCuentaCupoDTO)
	 */
	@Override
	public TipoEntradaGenerarLiquidacionWSDTO generarEntradaLiquidacionRecarga(
			RecargaCuentaCupoDTO arcc_recargaCuentaCupoDto) {
		TipoEntradaGenerarLiquidacionWSDTO ltegl_tipoEntradaGenerarLiquidacionWsDto = new TipoEntradaGenerarLiquidacionWSDTO();
		TipoServicioGLIWSDTO lts_servicioLiquidacionEntradaWSDTO = new TipoServicioGLIWSDTO();
		BigInteger lbi_cantidadSolicitada = new BigInteger(EnumCriterio.RESPUESTA_CANTIDAD.getIs_criterio());
		TipoCriterioGLIWSDTO ltc_criterioWSDTOValorRecarga = new TipoCriterioGLIWSDTO();
		TipoCriterioGLIWSDTO ltc_criterioWSDTOIDCuentaCupo = new TipoCriterioGLIWSDTO();
		List<TipoServicioGLIWSDTO> llsle_serviciosEntradaWSDTO = new ArrayList<>();
		List<TipoCriterioGLIWSDTO> lltc_listaTipoCriterioWSDTO = new ArrayList<>();
		UsuarioDTO lu_usuarioDto = UtilidadUsuarioSesion.usuarioSesion();

		String ls_nombreSolicitante = "";
		String ls_primerApellidoSolicitante = "";
		String ls_segundoApellidoSolicitante = "";
		String ls_segundoNombreSolicitante = "";
		String ls_razonSocial = "";
		String ls_tipoPersona = "";
		String ls_numeroDocumento = "";
		String ls_tipoDocumento = "";

		// Si es persona natural es posible sacar el nombre y apellidos
		if (lu_usuarioDto.getIs_rol().equals(EnumRol.PERSONA_JURIDICA.getIs_rol())) {
			ls_nombreSolicitante = lu_usuarioDto.getIp_personaDto().getIpn_personaNaturalDto().getIs_primerNombre();
			ls_segundoNombreSolicitante = lu_usuarioDto.getIp_personaDto().getIpn_personaNaturalDto()
					.getIs_segundoNombre();
			ls_primerApellidoSolicitante = lu_usuarioDto.getIp_personaDto().getIpn_personaNaturalDto()
					.getIs_primerApellido();
			ls_segundoApellidoSolicitante = lu_usuarioDto.getIp_personaDto().getIpn_personaNaturalDto()
					.getIs_segundoApellido();
			ls_tipoPersona = EnumTipoPersona.NATURAL.getIs_nombreConsulta();
			ls_numeroDocumento = lu_usuarioDto.getIp_personaDto().getIs_numeroDocumento();
			ls_tipoDocumento = lu_usuarioDto.getIp_personaDto().getItd_tipoDocumentoDto().getIs_id();
		}
		// Si es persona juridica saca los datos de la bd
		else if (lu_usuarioDto.getIs_rol().equals(EnumRol.ADMIN_PERSONA_JURIDICA.getIs_rol())) {
			ls_razonSocial = lu_usuarioDto.getIpj_personaJuridicaDto().getIs_razonSocial();
			ls_tipoPersona = EnumTipoPersona.JURIDICA.getIs_nombreConsulta();
			ls_numeroDocumento = lu_usuarioDto.getIp_personaDto().getIs_numeroDocumento();
			ls_tipoDocumento = lu_usuarioDto.getIp_personaDto().getItd_tipoDocumentoDto().getIs_id();
		}

		// Valores Vacio por defecto
		ltegl_tipoEntradaGenerarLiquidacionWsDto.setIs_codigoConvenio("");
		ltegl_tipoEntradaGenerarLiquidacionWsDto.setIs_oripSolicitud("");

		// Se completan nombres de quien recarga la cuenta cupo
		ltegl_tipoEntradaGenerarLiquidacionWsDto.setIs_primerNombreSolicitante(ls_nombreSolicitante);
		ltegl_tipoEntradaGenerarLiquidacionWsDto.setIs_primerApellidoSolicitante(ls_primerApellidoSolicitante);
		ltegl_tipoEntradaGenerarLiquidacionWsDto.setIs_segundoApellidoSolicitante(ls_segundoApellidoSolicitante);
		ltegl_tipoEntradaGenerarLiquidacionWsDto.setIs_segundoNombreSolicitante(ls_segundoNombreSolicitante);

		// Documentos especificos de quien recarga cuenta cupo
		ltegl_tipoEntradaGenerarLiquidacionWsDto.setIs_numeroDocSolicitante(ls_numeroDocumento);
		ltegl_tipoEntradaGenerarLiquidacionWsDto.setIs_tipoDocSolicitante(ls_tipoDocumento);
		ltegl_tipoEntradaGenerarLiquidacionWsDto.setIs_razonSocial(ls_razonSocial);
		lts_servicioLiquidacionEntradaWSDTO.setIs_valorServicio(arcc_recargaCuentaCupoDto.getIbd_valor());
		lts_servicioLiquidacionEntradaWSDTO.setIs_cantidadSolicitada(lbi_cantidadSolicitada.toString());

		ltegl_tipoEntradaGenerarLiquidacionWsDto.setIs_codigoCanal(EnumCriterio.CODIGO_CANAL.getIs_criterio());
		ltegl_tipoEntradaGenerarLiquidacionWsDto
		.setIs_codigoSucursalCanal(EnumCriterio.CODIGO_SUCURSAL.getIs_criterio());
		ltegl_tipoEntradaGenerarLiquidacionWsDto.setIs_tipoPersona(ls_tipoPersona);

		// Se configuran los criterios
		ltc_criterioWSDTOValorRecarga.setIs_codigo(EnumCriterio.VALOR_RECARGA.getIs_criterio());
		ltc_criterioWSDTOValorRecarga.setIs_valor(arcc_recargaCuentaCupoDto.getIbd_valor().toString());

		ltc_criterioWSDTOIDCuentaCupo.setIs_codigo(EnumCriterio.ID_CUENTA_CUPO.getIs_criterio());
		String[] ls_idCuentaCupo = arcc_recargaCuentaCupoDto.getIs_idCuentaCupo().split(":");
		ltc_criterioWSDTOIDCuentaCupo.setIs_valor(ls_idCuentaCupo[EnumNumeros.CERO.getIi_numero()]);

		lltc_listaTipoCriterioWSDTO.add(ltc_criterioWSDTOValorRecarga);
		lltc_listaTipoCriterioWSDTO.add(ltc_criterioWSDTOIDCuentaCupo);

		lts_servicioLiquidacionEntradaWSDTO.setIltc_criterios(lltc_listaTipoCriterioWSDTO);

		// Defino los tipos de servicios
		lts_servicioLiquidacionEntradaWSDTO.setIs_subtipoServicio(
				arcc_recargaCuentaCupoDto.getIdc_detalleCatalogoDto().getIs_idCodigoSubServicio());
		lts_servicioLiquidacionEntradaWSDTO
		.setIs_tipoServicio(arcc_recargaCuentaCupoDto.getIdc_detalleCatalogoDto().getIs_idCodigoServicio());

		llsle_serviciosEntradaWSDTO.add(lts_servicioLiquidacionEntradaWSDTO);

		ltegl_tipoEntradaGenerarLiquidacionWsDto.setIlts_listaTipoServicioLiquidacionWsDto(llsle_serviciosEntradaWSDTO);
		return ltegl_tipoEntradaGenerarLiquidacionWsDto;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.
	 * IIntegracionTemporalBusiness#guardarTransaccionRecarga(co.gov.supernotariado.
	 * bachue.sedeelectronica.admon.persistence.dto.RecargaCuentaCupoDTO)
	 */
	@Override
	public IntegracionTemporalDTO guardarTransaccionRecarga(RecargaCuentaCupoDTO arcc_recargarCuentaCupoDto) {

		TipoEntradaGenerarLiquidacionWSDTO ltegl_generarLiquidacionEntradaWSDTO = generarEntradaLiquidacionRecarga(
				arcc_recargarCuentaCupoDto);

		TipoSalidaGenerarLiquidacionWSDTO ltsgl_generarLiquidacionSalidaWSDTO = this.iiif_interfacesFinancierasBusiness
				.generarLiquidacion(ltegl_generarLiquidacionEntradaWSDTO);

		UtilidadExcepciones.manejadorExcepcionesServicios(ltsgl_generarLiquidacionSalidaWSDTO);

		Usuario lu_usuario;
		UsuarioSesionDTO lus_usuarioSesionDto;
		lus_usuarioSesionDto = UtilidadAutoridadUsuario.consultarUsuarioSesion();
		lu_usuario = iiu_usuarioDao.consultarUsuario(lus_usuarioSesionDto.getIs_nombreUsuario());

		IntegracionTemporalDTO lit_integracionTemporalDto = new IntegracionTemporalDTO();

		lit_integracionTemporalDto.setIs_codigoRespuesta(ltsgl_generarLiquidacionSalidaWSDTO.getIs_codigoMensaje());
		lit_integracionTemporalDto.setIs_entrada(ltegl_generarLiquidacionEntradaWSDTO.toString());
		lit_integracionTemporalDto.setIs_nir(ltsgl_generarLiquidacionSalidaWSDTO.getIs_nir());
		lit_integracionTemporalDto.setIs_modeloEntrada(arcc_recargarCuentaCupoDto.toString());
		lit_integracionTemporalDto.setIs_operacion(
				arcc_recargarCuentaCupoDto.getIdc_detalleCatalogoDto().getIc_catalogoDto().getIs_nombre());
		lit_integracionTemporalDto.setIs_referenciaPago(ltsgl_generarLiquidacionSalidaWSDTO.getIs_numeroReferencia());
		lit_integracionTemporalDto
		.setIs_resultadoGeneral(ltsgl_generarLiquidacionSalidaWSDTO.getIs_descripcionMensaje());
		lit_integracionTemporalDto.setIs_salida(ltsgl_generarLiquidacionSalidaWSDTO.toString());
		lit_integracionTemporalDto.setIbd_valorTotalServicio(new BigDecimal(arcc_recargarCuentaCupoDto.getIbd_valor()));
		lit_integracionTemporalDto.setIs_visibilidad(EnumBoolean.CHAR_S.getIs_codigo());
		lit_integracionTemporalDto
		.setIu_usuarioDto(UsuarioHelper.entidadADtoDireccionPersonaJuridaSinArchivo(lu_usuario));
		lit_integracionTemporalDto.setItp_tipoProcesoDto(iitp_tipoProcesoBusiness
				.consultarTipoProcesoPorCodigo(EnumTipoProceso.RECARGA_CUENTA_CUPO.getIs_codigo()));

		if (crearIntegracionTemporal(lit_integracionTemporalDto)) {
			return lit_integracionTemporalDto;
		}

		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.
	 * IIntegracionTemporalBusiness#generarRecibo(co.gov.supernotariado.bachue.
	 * sedeelectronica.admon.persistence.dto.IntegracionTemporalDTO)
	 */
	@Override
	public ObtenerPdfLiquidacionSalidaWSDTO generarRecibo(IntegracionTemporalDTO ait_integracionTemporal) {
		TipoEntradaObtenerPDFLiquidacionWSDTO lteopl_obtenerPdfLiquidacionWSDto = new TipoEntradaObtenerPDFLiquidacionWSDTO();
		lteopl_obtenerPdfLiquidacionWSDto.setIs_numeroReferencia(ait_integracionTemporal.getIs_referenciaPago());
		ObtenerPdfLiquidacionSalidaWSDTO lopls_obtenerPdfLiquidacionSalidaWsdto;
		lopls_obtenerPdfLiquidacionSalidaWsdto = iiif_interfacesFinancierasBusiness
				.obtenerPDFLiquidacion(lteopl_obtenerPdfLiquidacionWSDto);
		return lopls_obtenerPdfLiquidacionSalidaWsdto;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.
	 * IIntegracionTemporalBusiness#consultarRecarga(java.lang.String)
	 */
	@Override
	public IntegracionTemporalDTO consultarRecarga(String as_tipoProceso) {

		UsuarioSesionDTO lus_usuarioSessionDto = null;
		IntegracionTemporalDTO lit_integracionTemporalDto = null;
		try {
			lus_usuarioSessionDto = UtilidadAutoridadUsuario.consultarUsuarioSesion();
			IntegracionTemporal lit_integracionTemporal = iiit_integracionTemporalDAO
					.consultarTipoProceso(as_tipoProceso, lus_usuarioSessionDto.getIs_idUsuario());
			if (lit_integracionTemporal != null) {
				lit_integracionTemporalDto = IntegracionTemporalHelper.entidadADtoCompleto(lit_integracionTemporal);
			}
		} catch (Exception ae_excepcion) {
			CL_LOGGER.error(ae_excepcion.getMessage(), ae_excepcion);
		}
		return lit_integracionTemporalDto;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.
	 * IIntegracionTemporalBusiness#modificarReferencia(co.gov.supernotariado.bachue
	 * .sedeelectronica.admon.persistence.dto.IntegracionEntradaDTO)
	 */
	@Override
	public IntegracionEntradaDTO modificarReferencia(IntegracionEntradaDTO aie_integracionEntradaDto) {
		iiit_integracionTemporalDAO.modificarIntegracion(
				IntegracionTemporalHelper.dtoAEntidadCompleto(aie_integracionEntradaDto, new IntegracionTemporal()));
		return aie_integracionEntradaDto;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.
	 * IIntegracionTemporalBusiness#eliminarIntegracionTemporalNoVisibleUsuario()
	 */
	@Override
	public List<IntegracionTemporalDTO> eliminarIntegracionTemporalNoVisibleUsuario() {
		UsuarioSesionDTO lus_usuarioSesionDto;
		lus_usuarioSesionDto = UtilidadAutoridadUsuario.consultarUsuarioSesion();
		List<IntegracionTemporalDTO> llit_listaIntegracionTemporalDto;
		llit_listaIntegracionTemporalDto = IntegracionTemporalHelper.listaEntidadADtoCompleto(
				iiit_integracionTemporalDAO.consultarIntegracionCE(EnumEstadoActivo.VARCHAR_INACTIVO_N.getIs_codigo(),
						lus_usuarioSesionDto.getIs_idUsuario()));
		for (IntegracionTemporalDTO lit_integracionTemporalDto : llit_listaIntegracionTemporalDto) {
			eliminarTemporal(lit_integracionTemporalDto);
		}
		return llit_listaIntegracionTemporalDto;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.
	 * IIntegracionTemporalBusiness#eliminarIntegracionTemporalesNoVisibles()
	 */
	@Override
	public List<IntegracionTemporalDTO> eliminarIntegracionTemporalesNoVisibles() {
		List<IntegracionTemporalDTO> llit_integracionTemporalDto = new ArrayList<>();
		Calendar lc_horas = Calendar.getInstance();
		lc_horas.add(Calendar.HOUR, CI_DIAS_NO_VISIBLE);
		for (IntegracionTemporalDTO lit_integracionTemporalDTO : llit_integracionTemporalDto) {
			lc_horas.setTime(lit_integracionTemporalDTO.getId_fechaCreacion());
			if (lc_horas.getTime().after(lit_integracionTemporalDTO.getId_fechaCreacion())) {
				llit_integracionTemporalDto = eliminarIntegracionTemporalNoVisibleUsuario();
			}
		}
		return llit_integracionTemporalDto;
	}

}

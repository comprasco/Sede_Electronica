/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: CuentaCupoBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl
 * Nombre del elemento: CuentaCupoBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import com.bachue.snr.formularios.dto.comun.ArchivoDinamicoDTO;
import com.bachue.snr.formularios.dto.comun.ISalidaGenericaDocumentoDTO;
import com.bachue.snr.formularios.dto.entrada.FormularioCancelacionCuentaCupoDTO;
import com.bachue.snr.formularios.dto.entrada.FormularioCreacionCuentaCupoDTO;
import com.bachue.snr.formularios.dto.entrada.FormularioDevolucionCuentaCupoDTO;
import com.bachue.snr.formularios.dto.entrada.FormularioModificacionCuentaCupoDTO;
import com.bachue.snr.formularios.enums.EnumFormulario;
import com.bachue.snr.formularios.factory.DocumentosFactory;
import com.mysql.jdbc.StringUtils;

import co.gov.supernotariado.bachue.clientebus.vo.gestioncuentacupos.TipoAdminCICCIVO;
import co.gov.supernotariado.bachue.clientebus.vo.gestioncuentacupos.TipoEntradaConsultarIDCuentaCupoVO;
import co.gov.supernotariado.bachue.clientebus.vo.gestioncuentacupos.TipoSalidaConsultarIDCuentaCupoVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.exception.ExcepcionesDatosEntrada;
import co.gov.supernotariado.bachue.sedeelectronica.admon.exception.ExcepcionesNegocio;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICatalogoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICuentaCupoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IDetalleCatalogoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IFormularioUsuarioBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITransaccionFormularioBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IValorCampoFormularioBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ArchivosDinamicosDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CatalogoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ConsultarCuentaCupoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.DetalleCatalogoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.FormularioCancelarCuentaCupoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.FormularioCrearCuentaCupoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.FormularioDevolucionesCuentaCupoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.FormularioModificarCuentaCupoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.NotaCreditoDevolucionCuentaCupoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.NotasCreditoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.PersonaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionFormularioDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioSesionDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IUsuarioDAO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper.PersonaHelper;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper.UsuarioHelper;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Usuario;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters.GestionarCuentaCupoWsDtoConverter;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IGestionCuentaCupoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.ISolicitudesSinPagoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoAdminCICCIWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoAdminWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoCriterioWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaCancelarUsuarioWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarIDCuentaCupoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarMovimientosWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarSaldoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarSaldosNotaCreditoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaGenerarSolicitudWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaInscribirUsuarioWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoMovimientoCMOWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoNotaCreditoCSNCWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaCancelarUsuarioWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarIDCuentaCupoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarMovimientosWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarSaldoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarSaldosNotaCreditoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaGenerarSolicitudWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaInscribirUsuarioWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoServicioGSIWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSolicitanteGSIWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoUsuarioCSIWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumCatalogoTipoServicio;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumCodResConsultaMovimientosCC;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumCodigosRespuestas;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumConfiguracionFormulario;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumCriterio;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumEstadoSolicitudSinPago;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumFormatoFecha;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumNumeros;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumOperacionesWs;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumServiciosWs;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoDocumento;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoPersona;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones.EnumExcepcionesCuentaCupo;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones.EnumExcepcionesGenerales;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.GeneradorGrowlGenerico;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadAutoridadUsuario;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadBusCliente;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadExcepciones;
import co.gov.supernotariado.bachue.sedeelectronica.documentos.converters.ArchivoDinamicoConverter;
import co.gov.supernotariado.bachue.sedeelectronica.documentos.converters.FormularioCuentaCupoConverter;
import net.sf.jasperreports.engine.JRException;

/**
 * Clase tipo EJB (Enterprise Java Bean) de la capa de negocio. <br>
 * Contiene la implementacion logica de las operaciones del recurso Cuenta cupo.
 * <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless(name = "CuentaCupoBusiness", mappedName = "CuentaCupoBusiness")
@LocalBean
public class CuentaCupoBusiness implements ICuentaCupoBusiness {

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

	/**
	 * Atributo de instancia tipo IUsuarioDAO para definir la propiedad usuario dao.
	 */
	@EJB
	private IUsuarioDAO iiu_usuarioDao;

	/**
	 * Atributo de instancia tipo IValorCampoFormularioBusiness para definir la
	 * propiedad valor campo formulario business.
	 */
	@EJB
	private IValorCampoFormularioBusiness iivcf_valorCampoFormularioBusiness;

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
	private ITransaccionFormularioBusiness iitf_transaccionFormularioBusiness;

	/*
	 * (non-Javadoc)
	 * 
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.
	 * ICuentaCupoBusiness#consultarEstadoCuentaCupo()
	 */
	@Override
	public TipoSalidaConsultarIDCuentaCupoWSDTO consultarIdEstadoCuentaCupo() {
		TipoSalidaConsultarIDCuentaCupoWSDTO ltscicc_tipoSalidaCuentaCupo = new TipoSalidaConsultarIDCuentaCupoWSDTO();

		FormularioCrearCuentaCupoDTO lfccc_camposFormularioCreacionCuentaCupo = iifub_formularioUsuarioBusiness
				.consultarDatosFormularioCuentaCupoCreacion();
		if (!StringUtils
				.isNullOrEmpty(lfccc_camposFormularioCreacionCuentaCupo.getIs_numeroDocumentoRepresentanteLegal())) {

			// Revision servicio para consultar id cuenta cupo para los max y min.
			TipoEntradaConsultarIDCuentaCupoVO ltecicc_tipoEntradaConsultarCuentaCupo = new TipoEntradaConsultarIDCuentaCupoVO();

			ltecicc_tipoEntradaConsultarCuentaCupo.setIs_modulo(EnumCriterio.CANAL_ORIGEN.getIs_criterio());
			ltecicc_tipoEntradaConsultarCuentaCupo
					.setIs_nombreServicioSoap(EnumServiciosWs.GESTIONAR_CUENTA_CUPO.getIs_nombreServicio());

			TipoAdminCICCIVO ltac_adminCicciVo = new TipoAdminCICCIVO();

			ltac_adminCicciVo
					.setIs_correoElectronicoCorporativoUsuario(lfccc_camposFormularioCreacionCuentaCupo.getIs_correo());
			ltac_adminCicciVo.setIs_numDocAdmin(
					lfccc_camposFormularioCreacionCuentaCupo.getIs_numeroDocumentoRepresentanteLegal());
			ltac_adminCicciVo.setIs_tipoDocAdmin(
					lfccc_camposFormularioCreacionCuentaCupo.getIs_tipoDocumentoRepresentanteLegal());

			ltecicc_tipoEntradaConsultarCuentaCupo.setItac_adminCicciVo(ltac_adminCicciVo);
			TipoSalidaConsultarIDCuentaCupoVO ltscicc_tipoSalidaConsultarIdCuentaCupo = new TipoSalidaConsultarIDCuentaCupoVO();
			try {
				ltscicc_tipoSalidaConsultarIdCuentaCupo = (TipoSalidaConsultarIDCuentaCupoVO) UtilidadBusCliente
						.crearEntradaClienteIntegracionBase(EnumServiciosWs.GESTIONAR_CUENTA_CUPO,
								EnumOperacionesWs.GESTION_CUENTA_CUPO_CONSULTAR_ID,
								ltecicc_tipoEntradaConsultarCuentaCupo);
			} catch (Exception ae_excepcion) {
				throw new ExcepcionesDatosEntrada(EnumExcepcionesGenerales.ERROR_TECNICO, ae_excepcion);
			}

			ltscicc_tipoSalidaCuentaCupo = GestionarCuentaCupoWsDtoConverter
					.voAEntidad(ltscicc_tipoSalidaConsultarIdCuentaCupo);
		}
		return ltscicc_tipoSalidaCuentaCupo;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.
	 * ICuentaCupoBusiness#consultarDocumentoCreacionCuentaCupo(co.gov.
	 * supernotariado.bachue.sedeelectronica.admon.persistence.dto.
	 * FormularioCrearCuentaCupoDTO,
	 * co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.
	 * UsuarioDTO, java.util.List)
	 */
	@Override
	public byte[] consultarDocumentoCreacionCuentaCupo(FormularioCrearCuentaCupoDTO afccc_formulario,
			UsuarioDTO au_usuario, List<ArchivosDinamicosDTO> alad_archivos) throws JRException {

		FormularioCreacionCuentaCupoDTO lfccc_formularioCreacionCuentaCupoDto = FormularioCuentaCupoConverter
				.dtoAFormularioDto(afccc_formulario, au_usuario);
		List<ArchivoDinamicoDTO> llad_archivos = ArchivoDinamicoConverter.listaDtoAFormularioDto(alad_archivos);

		lfccc_formularioCreacionCuentaCupoDto
				.setLs_nombreFormulario(EnumFormulario.FORMULARIO_CREACION_CUENTA_CUPO.getIs_nombreFormulario());
		lfccc_formularioCreacionCuentaCupoDto.setImagenes(llad_archivos);

		ISalidaGenericaDocumentoDTO lisgd_salidaArchivoDto = DocumentosFactory
				.generarFormulario(lfccc_formularioCreacionCuentaCupoDto);

		byte[] lb_archivo;
		lb_archivo = lisgd_salidaArchivoDto.consultarDocumentoGenerado();
		return lb_archivo;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.
	 * ICuentaCupoBusiness#consultarDocumentoModificacionCuentaCupo(co.gov.
	 * supernotariado.bachue.sedeelectronica.admon.persistence.dto.
	 * FormularioModificarCuentaCupoDTO,
	 * co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.
	 * UsuarioDTO, java.util.List)
	 */
	@Override
	public byte[] consultarDocumentoModificacionCuentaCupo(FormularioModificarCuentaCupoDTO afmcc_formulario,
			UsuarioDTO au_usuario, List<ArchivosDinamicosDTO> alad_archivos) throws JRException {

		FormularioModificacionCuentaCupoDTO lfmcc_formularioModificacionCuentaCupoDto = FormularioCuentaCupoConverter
				.dtoAFormularioDto(afmcc_formulario, au_usuario);
		List<ArchivoDinamicoDTO> llad_archivos = ArchivoDinamicoConverter.listaDtoAFormularioDto(alad_archivos);

		lfmcc_formularioModificacionCuentaCupoDto
				.setLs_nombreFormulario(EnumFormulario.FORMULARIO_MODIFICACION_CUENTA_CUPO.getIs_nombreFormulario());
		lfmcc_formularioModificacionCuentaCupoDto.setImagenes(llad_archivos);

		ISalidaGenericaDocumentoDTO lisgd_salidaArchivoDto = DocumentosFactory
				.generarFormulario(lfmcc_formularioModificacionCuentaCupoDto);

		byte[] lb_archivo;
		lb_archivo = lisgd_salidaArchivoDto.consultarDocumentoGenerado();
		return lb_archivo;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.
	 * ICuentaCupoBusiness#consultarCuentaCupo(co.gov.supernotariado.bachue.
	 * sedeelectronica.admon.persistence.dto.ConsultarCuentaCupoDTO)
	 */
	@Override
	public TipoSalidaConsultarMovimientosWSDTO consultarCuentaCupo(ConsultarCuentaCupoDTO acc_cuentaCupoDto) {
		FormularioCrearCuentaCupoDTO lfccc_datosFormularioCuentaCupo = iifub_formularioUsuarioBusiness
				.consultarDatosFormularioCuentaCupoCreacion();
		TipoEntradaConsultarMovimientosWSDTO ltecm_movimientoEntradaWsdto = new TipoEntradaConsultarMovimientosWSDTO();
		TipoSalidaConsultarIDCuentaCupoWSDTO ltscidcc_cuentaCupoWsdto = consultarIdEstadoCuentaCupo();
		TipoAdminWSDTO lta_adminWsdto = new TipoAdminWSDTO();

		TipoEntradaConsultarIDCuentaCupoWSDTO ltecicc_tipoEntradaConsultarIdCuentaCupoWsDto = new TipoEntradaConsultarIDCuentaCupoWSDTO();
		ltecicc_tipoEntradaConsultarIdCuentaCupoWsDto.setIs_modulo(EnumCriterio.CANAL_ORIGEN.getIs_criterio());
		TipoAdminCICCIWSDTO ltac_adminCicciVo = new TipoAdminCICCIWSDTO();
		ltac_adminCicciVo.setIs_correoElectronicoCorporativoUsuario(lfccc_datosFormularioCuentaCupo.getIs_correo());
		ltac_adminCicciVo.setIs_numDocAdmin(lfccc_datosFormularioCuentaCupo.getIs_numeroDocumentoRepresentanteLegal());
		ltac_adminCicciVo.setIs_tipoDocAdmin(lfccc_datosFormularioCuentaCupo.getIs_tipoDocumentoRepresentanteLegal());
		ltecicc_tipoEntradaConsultarIdCuentaCupoWsDto.setItac_adminCicciVo(ltac_adminCicciVo);
		TipoSalidaConsultarIDCuentaCupoWSDTO ltscicc_tipoSalidaConsultarIdCuentaCupoWsDto = iigcc_gestionCuentaCupoBusiness
				.consultarIdCuentaCupo(ltecicc_tipoEntradaConsultarIdCuentaCupoWsDto);
		String[] ls_idCuentaCupo = ltscicc_tipoSalidaConsultarIdCuentaCupoWsDto.getIs_id().split(":");

		TipoAdminWSDTO lta_adminVo = new TipoAdminWSDTO();
		lta_adminVo.setIs_numDocAdmin(lfccc_datosFormularioCuentaCupo.getIs_numeroDocumentoRepresentanteLegal());
		lta_adminVo.setIs_tipoDocAdmin(lfccc_datosFormularioCuentaCupo.getIs_tipoDocumentoRepresentanteLegal());

		TipoEntradaConsultarSaldoWSDTO ltecs_tipoEntradaConsultarSaldowsDto = new TipoEntradaConsultarSaldoWSDTO();
		ltecs_tipoEntradaConsultarSaldowsDto.setIs_idCuentaCupo(ls_idCuentaCupo[EnumNumeros.CERO.getIi_numero()]);
		ltecs_tipoEntradaConsultarSaldowsDto.setIs_modulo(EnumCriterio.CANAL_ORIGEN.getIs_criterio());
		ltecs_tipoEntradaConsultarSaldowsDto.setIta_adminWSDto(lta_adminVo);
		TipoUsuarioCSIWSDTO ltu_usuarioCsi = new TipoUsuarioCSIWSDTO();
		ltu_usuarioCsi.setIs_numDocUsuario("");
		ltu_usuarioCsi.setIs_tipoDocUsuario("");
		ltecs_tipoEntradaConsultarSaldowsDto.setItu_usuarioCsi(ltu_usuarioCsi);
		TipoSalidaConsultarSaldoWSDTO ltscs_tipoSalidaConsultarSaldoWsDto = iigcc_gestionCuentaCupoBusiness
				.consultarSaldo(ltecs_tipoEntradaConsultarSaldowsDto);
		UtilidadExcepciones.manejadorExcepcionesServicios(ltscs_tipoSalidaConsultarSaldoWsDto);
		lta_adminWsdto.setIs_numDocAdmin(lfccc_datosFormularioCuentaCupo.getIs_numeroDocumentoRepresentanteLegal());
		lta_adminWsdto.setIs_tipoDocAdmin(lfccc_datosFormularioCuentaCupo.getIs_tipoDocumentoRepresentanteLegal());
		ltecm_movimientoEntradaWsdto.setIs_modulo(EnumCriterio.CANAL_ORIGEN.getIs_criterio());
		ltecm_movimientoEntradaWsdto.setId_fechaInicial(acc_cuentaCupoDto.getId_fechainicial());
		ltecm_movimientoEntradaWsdto.setId_fechaFinal(acc_cuentaCupoDto.getId_fechafinal());
		ltecm_movimientoEntradaWsdto.setIs_idCuentaCupo(ltscidcc_cuentaCupoWsdto.getIs_id());
		ltecm_movimientoEntradaWsdto.setIta_adminVo(lta_adminWsdto);
		TipoSalidaConsultarMovimientosWSDTO ltscm_movimientoSalidaWsdto;
		ltscm_movimientoSalidaWsdto = iigcc_gestionCuentaCupoBusiness
				.consultarMovimientos(ltecm_movimientoEntradaWsdto);
		if (ltscm_movimientoSalidaWsdto.getIs_codigoMensaje()
				.equals(EnumCodResConsultaMovimientosCC.CODIGO_422.getIs_codigo())) {
			GeneradorGrowlGenerico.generarMensajeInformacion(ltscm_movimientoSalidaWsdto.getIs_descripcionMensaje());
		} else if (ltscm_movimientoSalidaWsdto.getIs_codigoMensaje()
				.equals(EnumCodResConsultaMovimientosCC.CODIGO_400.getIs_codigo())) {
			GeneradorGrowlGenerico.generarMensajeError(ltscm_movimientoSalidaWsdto.getIs_descripcionMensaje());
		}
		ltscm_movimientoSalidaWsdto.setIlnc_listaNotaCredito(new ArrayList<>());
		TipoMovimientoCMOWSDTO lcm_consultaMovimientosDto = new TipoMovimientoCMOWSDTO();
		lcm_consultaMovimientosDto.setIlnc_listaNotaCredito(new ArrayList<>());
		BigDecimal lbd_valorRecarga = new BigDecimal(EnumNumeros.CERO.getIi_numero());
		BigDecimal lbd_valorConsumo = new BigDecimal(EnumNumeros.CERO.getIi_numero());
		Integer ii_prueba = EnumNumeros.CERO.getIi_numero();
		BigDecimal lbd_saldoInicial = new BigDecimal(EnumNumeros.CERO.getIi_numero());
		for (TipoMovimientoCMOWSDTO ltm_tipoMovimientoCmoWsDto : ltscm_movimientoSalidaWsdto.getIltm_movimientos()) {
			NotasCreditoDTO lnc_notasCredito = new NotasCreditoDTO();
			lnc_notasCredito.setIs_notaCredito(ltm_tipoMovimientoCmoWsDto.getItnc_notaCredito().getIs_numero() + " "
					+ ltm_tipoMovimientoCmoWsDto.getIs_tipo());
			lnc_notasCredito.setId_fechaMovimiento(ltm_tipoMovimientoCmoWsDto.getId_fechaMovimiento());
			if (ltm_tipoMovimientoCmoWsDto.getIs_tipo()
					.equals(EnumCodResConsultaMovimientosCC.RECARGA.getIs_codigo())) {
				lbd_valorRecarga = lbd_valorRecarga
						.add(ltm_tipoMovimientoCmoWsDto.getItnc_notaCredito().getIbd_valor());
			} else if (ltm_tipoMovimientoCmoWsDto.getIs_tipo()
					.equals(EnumCodResConsultaMovimientosCC.CONSUMO.getIs_codigo())) {
				lbd_valorConsumo = lbd_valorConsumo
						.add(ltm_tipoMovimientoCmoWsDto.getItnc_notaCredito().getIbd_valor());
			}
			ii_prueba++;
			if (ii_prueba.equals(EnumNumeros.UNO.getIi_numero())) {
				lnc_notasCredito.setIs_saldoDisponible(
						ltm_tipoMovimientoCmoWsDto.getItnc_notaCredito().getIbd_valor().toString());
				lbd_saldoInicial = ltm_tipoMovimientoCmoWsDto.getItnc_notaCredito().getIbd_valor();
			} else if (ltm_tipoMovimientoCmoWsDto.getIs_tipo()
					.equals(EnumCodResConsultaMovimientosCC.RECARGA.getIs_codigo())
					&& !ii_prueba.equals(EnumNumeros.UNO.getIi_numero())) {
				lnc_notasCredito.setIs_saldoDisponible(lbd_saldoInicial
						.add(ltm_tipoMovimientoCmoWsDto.getItnc_notaCredito().getIbd_valor()).toString());
			} else if (ltm_tipoMovimientoCmoWsDto.getIs_tipo()
					.equals(EnumCodResConsultaMovimientosCC.CONSUMO.getIs_codigo())) {
				lnc_notasCredito.setIs_saldoDisponible(lbd_saldoInicial
						.subtract(ltm_tipoMovimientoCmoWsDto.getItnc_notaCredito().getIbd_valor()).toString());
			}
			lnc_notasCredito
					.setIs_valorConsumo(ltm_tipoMovimientoCmoWsDto.getItnc_notaCredito().getIbd_valor().toString());
			lcm_consultaMovimientosDto.getIlnc_listaNotaCredito().add(lnc_notasCredito);
		}
		ltscm_movimientoSalidaWsdto.setIlnc_listaNotaCredito(lcm_consultaMovimientosDto.getIlnc_listaNotaCredito());
		ltscm_movimientoSalidaWsdto.setIbd_totalRecarga(lbd_valorRecarga);
		ltscm_movimientoSalidaWsdto.setIbd_totalConsumo(lbd_valorConsumo);
		return ltscm_movimientoSalidaWsdto;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.
	 * ICuentaCupoBusiness#iniciarCancelacionCuentaCupo()
	 */
	// Cancelacion Cuenta cupo
	@Override
	public FormularioCancelarCuentaCupoDTO iniciarCancelacionCuentaCupo() {
		FormularioCrearCuentaCupoDTO lfccc_datosFormularioCuentaCupo = iifub_formularioUsuarioBusiness
				.consultarDatosFormularioCuentaCupoCreacion();
		FormularioCancelarCuentaCupoDTO lfccc_formularioCancelacionCuentaCupoDto = new FormularioCancelarCuentaCupoDTO();
		Usuario lu_usuario;
		UsuarioSesionDTO lus_usuarioSesionDto;
		lus_usuarioSesionDto = UtilidadAutoridadUsuario.consultarUsuarioSesion();
		lu_usuario = iiu_usuarioDao.consultarUsuario(lus_usuarioSesionDto.getIs_nombreUsuario());
		UsuarioDTO lu_usuarioDto = UsuarioHelper.entidadADtoSimple(lu_usuario);
		PersonaDTO lp_personaDto = PersonaHelper
				.entidadADtoCompletoConPersonaJuridicaSinDocumentos(lu_usuario.getPersona());
		lfccc_formularioCancelacionCuentaCupoDto.setIs_celular(lu_usuarioDto.getIs_celular());
		if (lp_personaDto.getIlpd_personaDireccionsDto().get(EnumNumeros.CERO.getIi_numero())
				.getId_departamentoDto() != null) {
			lfccc_formularioCancelacionCuentaCupoDto.setIs_ciudad(lp_personaDto.getIlpd_personaDireccionsDto()
					.get(EnumNumeros.CERO.getIi_numero()).getId_departamentoDto().getIs_nombre());
		}
		lfccc_formularioCancelacionCuentaCupoDto.setIs_correo(lfccc_datosFormularioCuentaCupo.getIs_correo());
		lfccc_formularioCancelacionCuentaCupoDto
				.setIs_digitoVerificacion(lfccc_datosFormularioCuentaCupo.getIs_digitoVerificacion());
		lfccc_formularioCancelacionCuentaCupoDto
				.setIs_direccion(lp_personaDto.getIlpd_personaDireccionsDto().get(0).getIs_direccionCompleta());
		lfccc_formularioCancelacionCuentaCupoDto
				.setIs_razonSocial(lp_personaDto.getIpj_personaJuridicaDto().getIs_razonSocial());
		lfccc_formularioCancelacionCuentaCupoDto
				.setIs_telefono(lp_personaDto.getIpj_personaJuridicaDto().getIs_telefono());
		lfccc_formularioCancelacionCuentaCupoDto
				.setIs_tipoDocumento(lp_personaDto.getItd_tipoDocumentoDto().getIs_id());
		lfccc_formularioCancelacionCuentaCupoDto.setIs_numeroDocumentoRepresentanteLegal(
				lfccc_datosFormularioCuentaCupo.getIs_numeroDocumentoRepresentanteLegal());
		lfccc_formularioCancelacionCuentaCupoDto.setIs_numeroDocumento(lp_personaDto.getIs_numeroDocumento());
		lfccc_formularioCancelacionCuentaCupoDto.setIs_tipoPersona(EnumTipoPersona.JURIDICA.getIs_codigo());
		lfccc_formularioCancelacionCuentaCupoDto
				.setIs_representanteLegal(lp_personaDto.getIpj_personaJuridicaDto().getNombreRepresentanteLegal());
		TransaccionFormularioDTO ltf_transaccionFormularioDto = iitf_transaccionFormularioBusiness
				.consultarTransaccionVigente(EnumConfiguracionFormulario.FORMULARIO_SOLICITUD_CREACION_CUENTA_CUPO);
		if (!(ltf_transaccionFormularioDto.getIs_estadoTransaccion()
				.equals(EnumEstadoSolicitudSinPago.TRAMITE.getIs_codigo())
				|| ltf_transaccionFormularioDto.getIs_estadoTransaccion()
						.equals(EnumEstadoSolicitudSinPago.APROBADA.getIs_codigo()))) {
			throw new ExcepcionesNegocio(EnumExcepcionesCuentaCupo.NO_TERMINADO_FORMULARIO_CREACION);
		}

		TipoEntradaConsultarIDCuentaCupoWSDTO ltecicc_tipoEntradaConsultarIdCuentaCupoWsDto = new TipoEntradaConsultarIDCuentaCupoWSDTO();
		ltecicc_tipoEntradaConsultarIdCuentaCupoWsDto.setIs_modulo(EnumCriterio.CANAL_ORIGEN.getIs_criterio());
		TipoAdminCICCIWSDTO ltac_adminCicciVo = new TipoAdminCICCIWSDTO();
		ltac_adminCicciVo.setIs_correoElectronicoCorporativoUsuario(lfccc_datosFormularioCuentaCupo.getIs_correo());
		ltac_adminCicciVo.setIs_numDocAdmin(lfccc_datosFormularioCuentaCupo.getIs_numeroDocumentoRepresentanteLegal());
		ltac_adminCicciVo.setIs_tipoDocAdmin(lfccc_datosFormularioCuentaCupo.getIs_tipoDocumentoRepresentanteLegal());
		ltecicc_tipoEntradaConsultarIdCuentaCupoWsDto.setItac_adminCicciVo(ltac_adminCicciVo);
		TipoSalidaConsultarIDCuentaCupoWSDTO ltscicc_tipoSalidaConsultarIdCuentaCupoWsDto = iigcc_gestionCuentaCupoBusiness
				.consultarIdCuentaCupo(ltecicc_tipoEntradaConsultarIdCuentaCupoWsDto);
		String[] ls_idCuentaCupo = ltscicc_tipoSalidaConsultarIdCuentaCupoWsDto.getIs_id().split(":");
		lfccc_formularioCancelacionCuentaCupoDto.setIs_idCuentaCupo(ls_idCuentaCupo[EnumNumeros.CERO.getIi_numero()]);
		lfccc_formularioCancelacionCuentaCupoDto
				.setIs_saldo(ltscicc_tipoSalidaConsultarIdCuentaCupoWsDto.getIs_saldo());
		TipoAdminWSDTO lta_adminVo = new TipoAdminWSDTO();
		lta_adminVo.setIs_numDocAdmin(lfccc_datosFormularioCuentaCupo.getIs_numeroDocumentoRepresentanteLegal());
		lta_adminVo.setIs_tipoDocAdmin(lfccc_datosFormularioCuentaCupo.getIs_tipoDocumentoRepresentanteLegal());

		TipoEntradaConsultarSaldoWSDTO ltecs_tipoEntradaConsultarSaldowsDto = new TipoEntradaConsultarSaldoWSDTO();
		ltecs_tipoEntradaConsultarSaldowsDto.setIs_idCuentaCupo(ls_idCuentaCupo[EnumNumeros.CERO.getIi_numero()]);
		ltecs_tipoEntradaConsultarSaldowsDto.setIs_modulo(EnumCriterio.CANAL_ORIGEN.getIs_criterio());
		ltecs_tipoEntradaConsultarSaldowsDto.setIta_adminWSDto(lta_adminVo);
		TipoUsuarioCSIWSDTO ltu_usuarioCsi = new TipoUsuarioCSIWSDTO();
		ltu_usuarioCsi.setIs_numDocUsuario("");
		ltu_usuarioCsi.setIs_tipoDocUsuario("");
		ltecs_tipoEntradaConsultarSaldowsDto.setItu_usuarioCsi(ltu_usuarioCsi);
		TipoSalidaConsultarSaldoWSDTO ltscs_tipoSalidaConsultarSaldoWsDto;
		ltscs_tipoSalidaConsultarSaldoWsDto = iigcc_gestionCuentaCupoBusiness
				.consultarSaldo(ltecs_tipoEntradaConsultarSaldowsDto);

		TipoEntradaConsultarMovimientosWSDTO ltecm_tipoEntradaConsultarMovimientosWsdto = new TipoEntradaConsultarMovimientosWSDTO();
		ltecm_tipoEntradaConsultarMovimientosWsdto.setIs_modulo(EnumCriterio.CANAL_ORIGEN.getIs_criterio());
		ltecm_tipoEntradaConsultarMovimientosWsdto.setIs_idCuentaCupo(ls_idCuentaCupo[EnumNumeros.CERO.getIi_numero()]);
		ltecm_tipoEntradaConsultarMovimientosWsdto.setIta_adminVo(lta_adminVo);
		ltecm_tipoEntradaConsultarMovimientosWsdto
				.setId_fechaInicial(ltscs_tipoSalidaConsultarSaldoWsDto.getId_ultimaRecargaFecha());
		Calendar lc_fechaFinal = Calendar.getInstance();
		lc_fechaFinal.add(Calendar.MINUTE, -5);
		Date ld_fecha = lc_fechaFinal.getTime();
		ltecm_tipoEntradaConsultarMovimientosWsdto.setId_fechaFinal(ld_fecha);
		TipoSalidaConsultarMovimientosWSDTO ltscm_tipoSalidaConsultarMovimientosWsdto = iigcc_gestionCuentaCupoBusiness
				.consultarMovimientos(ltecm_tipoEntradaConsultarMovimientosWsdto);
		if (!ltscm_tipoSalidaConsultarMovimientosWsdto.getIs_codigoMensaje()
				.equals(EnumCodigosRespuestas.CODIGO_200.getIs_codigo())) {
			lfccc_formularioCancelacionCuentaCupoDto
					.setIs_mensaje(ltscm_tipoSalidaConsultarMovimientosWsdto.getIs_descripcionMensaje());
		} else {
			lfccc_formularioCancelacionCuentaCupoDto.setIlnc_listaNotaCredito(new ArrayList<>());
			for (TipoMovimientoCMOWSDTO ltm_tipoMovimientoCmoWsDto : ltscm_tipoSalidaConsultarMovimientosWsdto
					.getIltm_movimientos()) {
				NotasCreditoDTO lnc_notasCredito = new NotasCreditoDTO();
				lnc_notasCredito.setIs_notaCredito(ltm_tipoMovimientoCmoWsDto.getItnc_notaCredito().getIs_numero() + " "
						+ ltm_tipoMovimientoCmoWsDto.getIs_tipo());
				if (ltscs_tipoSalidaConsultarSaldoWsDto.getIbd_ultimaRecargaValor()
						.equals(ltm_tipoMovimientoCmoWsDto.getItnc_notaCredito().getIbd_valor())) {
					lnc_notasCredito.setIs_saldoDisponible(
							ltm_tipoMovimientoCmoWsDto.getItnc_notaCredito().getIbd_valor().toString());
				} else {
					lnc_notasCredito
							.setIs_saldoDisponible(ltm_tipoMovimientoCmoWsDto.getItnc_notaCredito().getIbd_valor()
									.add(ltscs_tipoSalidaConsultarSaldoWsDto.getIbd_ultimaRecargaValor()).toString());
				}
				lnc_notasCredito
						.setIs_valorConsumo(ltm_tipoMovimientoCmoWsDto.getItnc_notaCredito().getIbd_valor().toString());
				lfccc_formularioCancelacionCuentaCupoDto.getIlnc_listaNotaCredito().add(lnc_notasCredito);
			}
		}
		return lfccc_formularioCancelacionCuentaCupoDto;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.
	 * ICuentaCupoBusiness#consultarDevolucionCuentaCupo()
	 */
	@Override
	public FormularioDevolucionesCuentaCupoDTO consultaDevolucionCuentaCupo() {
		FormularioCrearCuentaCupoDTO lfccc_datosFormularioCuentaCupo = iifub_formularioUsuarioBusiness
				.consultarDatosFormularioCuentaCupoCreacion();
		FormularioDevolucionesCuentaCupoDTO lfdcc_formularioDevolucionCuentaCupoDto = new FormularioDevolucionesCuentaCupoDTO();
		TransaccionFormularioDTO ltf_transaccionFormularioDto = iitf_transaccionFormularioBusiness
				.consultarTransaccionVigente(EnumConfiguracionFormulario.FORMULARIO_SOLICITUD_CREACION_CUENTA_CUPO);
		if (!(ltf_transaccionFormularioDto.getIs_estadoTransaccion()
				.equals(EnumEstadoSolicitudSinPago.TRAMITE.getIs_codigo())
				|| ltf_transaccionFormularioDto.getIs_estadoTransaccion()
						.equals(EnumEstadoSolicitudSinPago.APROBADA.getIs_codigo()))) {
			throw new ExcepcionesNegocio(EnumExcepcionesCuentaCupo.NO_TERMINADO_FORMULARIO_CREACION);
		}

		TipoEntradaConsultarIDCuentaCupoWSDTO ltecicc_tipoEntradaConsultarIdCuentaCupoWsDto = new TipoEntradaConsultarIDCuentaCupoWSDTO();
		ltecicc_tipoEntradaConsultarIdCuentaCupoWsDto.setIs_modulo(EnumCriterio.CANAL_ORIGEN.getIs_criterio());
		TipoAdminCICCIWSDTO ltac_adminCicciVo = new TipoAdminCICCIWSDTO();
		ltac_adminCicciVo.setIs_correoElectronicoCorporativoUsuario(lfccc_datosFormularioCuentaCupo.getIs_correo());
		ltac_adminCicciVo.setIs_numDocAdmin(lfccc_datosFormularioCuentaCupo.getIs_numeroDocumentoRepresentanteLegal());
		ltac_adminCicciVo.setIs_tipoDocAdmin(lfccc_datosFormularioCuentaCupo.getIs_tipoDocumentoRepresentanteLegal());
		ltecicc_tipoEntradaConsultarIdCuentaCupoWsDto.setItac_adminCicciVo(ltac_adminCicciVo);
		TipoSalidaConsultarIDCuentaCupoWSDTO ltscicc_tipoSalidaConsultarIdCuentaCupoWsDto = iigcc_gestionCuentaCupoBusiness
				.consultarIdCuentaCupo(ltecicc_tipoEntradaConsultarIdCuentaCupoWsDto);
		String[] ls_idCuentaCupo = ltscicc_tipoSalidaConsultarIdCuentaCupoWsDto.getIs_id().split(":");
		lfdcc_formularioDevolucionCuentaCupoDto.setIs_codigoCuentaCupo(ls_idCuentaCupo[EnumNumeros.UNO.getIi_numero()]);
		lfdcc_formularioDevolucionCuentaCupoDto.setIs_saldo(ltscicc_tipoSalidaConsultarIdCuentaCupoWsDto.getIs_saldo());
		TipoAdminWSDTO lta_adminVo = new TipoAdminWSDTO();
		lta_adminVo.setIs_numDocAdmin(lfccc_datosFormularioCuentaCupo.getIs_numeroDocumentoRepresentanteLegal());
		lta_adminVo.setIs_tipoDocAdmin(lfccc_datosFormularioCuentaCupo.getIs_tipoDocumentoRepresentanteLegal());

		TipoEntradaConsultarSaldoWSDTO ltecs_tipoEntradaConsultarSaldowsDto = new TipoEntradaConsultarSaldoWSDTO();
		ltecs_tipoEntradaConsultarSaldowsDto.setIs_idCuentaCupo(ls_idCuentaCupo[EnumNumeros.CERO.getIi_numero()]);
		ltecs_tipoEntradaConsultarSaldowsDto.setIs_modulo(EnumCriterio.CANAL_ORIGEN.getIs_criterio());
		ltecs_tipoEntradaConsultarSaldowsDto.setIta_adminWSDto(lta_adminVo);
		TipoUsuarioCSIWSDTO ltu_usuarioCsi = new TipoUsuarioCSIWSDTO();
		ltu_usuarioCsi.setIs_numDocUsuario("");
		ltu_usuarioCsi.setIs_tipoDocUsuario("");
		ltecs_tipoEntradaConsultarSaldowsDto.setItu_usuarioCsi(ltu_usuarioCsi);
		TipoSalidaConsultarSaldoWSDTO ltscs_tipoSalidaConsultarSaldoWsDto;
		ltscs_tipoSalidaConsultarSaldoWsDto = iigcc_gestionCuentaCupoBusiness
				.consultarSaldo(ltecs_tipoEntradaConsultarSaldowsDto);

		TipoEntradaConsultarSaldosNotaCreditoWSDTO ltecsnc_tipoEntradaConsultarSaldosNotaCreditoWsDto = new TipoEntradaConsultarSaldosNotaCreditoWSDTO();

		ltecsnc_tipoEntradaConsultarSaldosNotaCreditoWsDto.setIs_modulo(EnumCriterio.CANAL_ORIGEN.getIs_criterio());
		ltecsnc_tipoEntradaConsultarSaldosNotaCreditoWsDto
				.setIs_idCuentaCupo(ls_idCuentaCupo[EnumNumeros.CERO.getIi_numero()]);
		ltecsnc_tipoEntradaConsultarSaldosNotaCreditoWsDto.setIta_adminVo(lta_adminVo);
		TipoSalidaConsultarSaldosNotaCreditoWSDTO ltscsnc_tipoSalidaConsultarSaldosNotaCreditoWsDto = iigcc_gestionCuentaCupoBusiness
				.consultarSaldosNotaCredito(ltecsnc_tipoEntradaConsultarSaldosNotaCreditoWsDto);
		// TODO: Eliminar una vez datatools de respuesta del consumo del servicio
		if (ltscsnc_tipoSalidaConsultarSaldosNotaCreditoWsDto.getIbi_codigoMensaje().equals(new BigInteger("416"))) {
			ltecsnc_tipoEntradaConsultarSaldosNotaCreditoWsDto.setIs_modulo(EnumCriterio.CANAL_ORIGEN.getIs_criterio());
			ltecsnc_tipoEntradaConsultarSaldosNotaCreditoWsDto
					.setIs_idCuentaCupo(ls_idCuentaCupo[EnumNumeros.CERO.getIi_numero()]);
			ltecsnc_tipoEntradaConsultarSaldosNotaCreditoWsDto.setIta_adminVo(lta_adminVo);
			ltscsnc_tipoSalidaConsultarSaldosNotaCreditoWsDto = iigcc_gestionCuentaCupoBusiness
					.consultarSaldosNotaCredito(ltecsnc_tipoEntradaConsultarSaldosNotaCreditoWsDto);
		}
		// TODO: Fin eliminar 
		if (!ltscsnc_tipoSalidaConsultarSaldosNotaCreditoWsDto.getIs_codigoMensaje()
				.equals(EnumCodigosRespuestas.CODIGO_200.getIs_codigo())) {
			lfdcc_formularioDevolucionCuentaCupoDto
					.setIs_mensaje(ltscsnc_tipoSalidaConsultarSaldosNotaCreditoWsDto.getIs_descripcionMensaje());
		} else {
			lfdcc_formularioDevolucionCuentaCupoDto.setIlncdcc_listaNotaCredito(new ArrayList<>());
			for (TipoNotaCreditoCSNCWSDTO ltnc_tipoNotaCreditoWsDto : ltscsnc_tipoSalidaConsultarSaldosNotaCreditoWsDto
					.getIltnc_listaNotasCredito()) {
				NotaCreditoDevolucionCuentaCupoDTO lncdcc_notasCredito = new NotaCreditoDevolucionCuentaCupoDTO();
				lncdcc_notasCredito.setId_fecha(ltnc_tipoNotaCreditoWsDto.getId_fecha());
				lncdcc_notasCredito.setIs_codigo(ltnc_tipoNotaCreditoWsDto.getIs_codigo());
				lncdcc_notasCredito.setIs_saldo(ltnc_tipoNotaCreditoWsDto.getIs_saldo());
				lncdcc_notasCredito.setIs_valorRecarga(ltnc_tipoNotaCreditoWsDto.getIs_valorRecarga());
				lfdcc_formularioDevolucionCuentaCupoDto.getIlncdcc_listaNotaCredito().add(lncdcc_notasCredito);
			}
		}
		lfdcc_formularioDevolucionCuentaCupoDto.setIs_tipoDocumentoRepresentanteLegal(
				lfccc_datosFormularioCuentaCupo.getIs_tipoDocumentoRepresentanteLegal());
		lfdcc_formularioDevolucionCuentaCupoDto.setIs_numeroDocumentoRepresentanteLegal(
				lfccc_datosFormularioCuentaCupo.getIs_numeroDocumentoRepresentanteLegal());
		lfdcc_formularioDevolucionCuentaCupoDto
				.setIs_saldo(ltscs_tipoSalidaConsultarSaldoWsDto.getIbd_saldoActual().toString());

		return lfdcc_formularioDevolucionCuentaCupoDto;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.
	 * ICuentaCupoBusiness#generarSolicitudCancelacionCuentaCupo(co.gov.
	 * supernotariado.bachue.sedeelectronica.admon.persistence.dto.
	 * FormularioCancelarCuentaCupoDTO)
	 */
	@Override
	public String generarSolicitudCancelacionCuentaCupo(
			FormularioCancelarCuentaCupoDTO afccc_formularioCancelacionCuentaCupoDto) {
		TipoEntradaGenerarSolicitudWSDTO ltegs_tipoEntradaGenerarSolicitudWsDto = new TipoEntradaGenerarSolicitudWSDTO();
		FormularioCrearCuentaCupoDTO lfccc_camposFormularioCreacionCuentaCupo = iifub_formularioUsuarioBusiness
				.consultarDatosFormularioCuentaCupoCreacion();
		TipoSolicitanteGSIWSDTO ltsgw_solicitante = new TipoSolicitanteGSIWSDTO();
		ltsgw_solicitante.setIs_numeroDocumento(
				lfccc_camposFormularioCreacionCuentaCupo.getIs_numeroDocumentoRepresentanteLegal());
		ltsgw_solicitante
				.setIs_tipoDocumento(lfccc_camposFormularioCreacionCuentaCupo.getIs_tipoDocumentoRepresentanteLegal());
		ltsgw_solicitante.setIs_tipoPersona(EnumTipoPersona.JURIDICA.getIs_codigo());
		CatalogoDTO lc_catalogoDto = iic_catalogoBusiness
				.consultarCatalogoCodigoValor(EnumCatalogoTipoServicio.CANCELAR_CUENTA_CUPO.getIs_codigo());
		DetalleCatalogoDTO ldc_detalleCatalogoDto = iidc_detalleCatalogoBusiness
				.consultarDetalleCatalogo(lc_catalogoDto);
		TipoServicioGSIWSDTO lts_tipoServicioGsiWsDto = new TipoServicioGSIWSDTO();
		lts_tipoServicioGsiWsDto.setIs_tipoServicio(ldc_detalleCatalogoDto.getIs_idCodigoServicio());
		lts_tipoServicioGsiWsDto.setIs_subTipoServicio(ldc_detalleCatalogoDto.getIs_idCodigoSubServicio());

		TipoCriterioWSDTO ltc_tipoCriterioWsDtoIdCC = new TipoCriterioWSDTO();
		ltc_tipoCriterioWsDtoIdCC.setIs_codigo(EnumCriterio.ID_CUENTA_CUPO.getIs_criterio());
		ltc_tipoCriterioWsDtoIdCC.setIs_valor(afccc_formularioCancelacionCuentaCupoDto.getIs_idCuentaCupo());

		TipoCriterioWSDTO ltc_tipoCriterioWsDtoFechaDiligenciamiento = new TipoCriterioWSDTO();
		ltc_tipoCriterioWsDtoFechaDiligenciamiento.setIs_codigo(EnumCriterio.FECHA_DILIGENCIAMIENTO.getIs_criterio());
		Format lf_fecha = new SimpleDateFormat(EnumFormatoFecha.FORMATO_FECHA.getIs_formato());
		ltc_tipoCriterioWsDtoFechaDiligenciamiento.setIs_valor(lf_fecha.format(new Date()));

		TipoCriterioWSDTO ltc_tipoCriterioWsDtoMotivo = new TipoCriterioWSDTO();
		ltc_tipoCriterioWsDtoMotivo.setIs_codigo(EnumCriterio.CANCELACION_CC_MOTIVO_SOLICITUD.getIs_criterio());
		ltc_tipoCriterioWsDtoMotivo.setIs_valor(afccc_formularioCancelacionCuentaCupoDto.getIs_motivoCancelacion());

		List<TipoServicioGSIWSDTO> lltsgw_servicios = new ArrayList<>();
		lltsgw_servicios.add(lts_tipoServicioGsiWsDto);
		List<TipoCriterioWSDTO> lltc_tipoCriterio = new ArrayList<>();
		lltc_tipoCriterio.add(ltc_tipoCriterioWsDtoFechaDiligenciamiento);
		lltc_tipoCriterio.add(ltc_tipoCriterioWsDtoIdCC);
		lltc_tipoCriterio.add(ltc_tipoCriterioWsDtoMotivo);
		lts_tipoServicioGsiWsDto.setIltc_tipoCriterio(lltc_tipoCriterio);
		ltegs_tipoEntradaGenerarSolicitudWsDto.setIs_modulo(EnumCriterio.CANAL_ORIGEN.getIs_criterio());
		ltegs_tipoEntradaGenerarSolicitudWsDto.setItsgv_solicitante(ltsgw_solicitante);
		ltegs_tipoEntradaGenerarSolicitudWsDto.setIltsgw_servicios(lltsgw_servicios);

		TipoSalidaGenerarSolicitudWSDTO ltsgs_tipoSalidaGenerarSolicitudWsDto = iisspb_solicitudSinPagoBusiness
				.generarSolicitud(ltegs_tipoEntradaGenerarSolicitudWsDto);
		return ltsgs_tipoSalidaGenerarSolicitudWsDto.getIs_nir();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.
	 * ICuentaCupoBusiness#consultarDocumentoCancelacionCuentaCupo(co.gov.
	 * supernotariado.bachue.sedeelectronica.admon.persistence.dto.
	 * FormularioCancelarCuentaCupoDTO, java.util.List)
	 */
	@Override
	public byte[] consultarDocumentoCancelacionCuentaCupo(FormularioCancelarCuentaCupoDTO afccc_formulario,
			List<ArchivosDinamicosDTO> alad_archivos) throws JRException {

		FormularioCancelacionCuentaCupoDTO lfccc_formularioCreacionCuentaCupoDto = FormularioCuentaCupoConverter
				.dtoAFormularioCancelacionDto(afccc_formulario);
		List<ArchivoDinamicoDTO> llad_archivos = ArchivoDinamicoConverter.listaDtoAFormularioDto(alad_archivos);
		lfccc_formularioCreacionCuentaCupoDto
				.setLs_nombreFormulario(EnumFormulario.FORMULARIO_CANCELACION_CUENTA_CUPO.getIs_nombreFormulario());
		lfccc_formularioCreacionCuentaCupoDto.setImagenes(llad_archivos);

		ISalidaGenericaDocumentoDTO lisgd_salidaArchivoDto = DocumentosFactory
				.generarFormulario(lfccc_formularioCreacionCuentaCupoDto);

		byte[] lb_archivo;
		lb_archivo = lisgd_salidaArchivoDto.consultarDocumentoGenerado();
		return lb_archivo;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.
	 * ICuentaCupoBusiness#consultarSaldo()
	 */
	@Override
	public TipoSalidaConsultarSaldoWSDTO consultarSaldo() {
		FormularioCrearCuentaCupoDTO lfccc_camposFormularioCreacionCuentaCupo = iifub_formularioUsuarioBusiness
				.consultarDatosFormularioCuentaCupoCreacion();

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
		TipoAdminWSDTO lta_adminVo = new TipoAdminWSDTO();
		lta_adminVo
				.setIs_numDocAdmin(lfccc_camposFormularioCreacionCuentaCupo.getIs_numeroDocumentoRepresentanteLegal());
		lta_adminVo
				.setIs_tipoDocAdmin(lfccc_camposFormularioCreacionCuentaCupo.getIs_tipoDocumentoRepresentanteLegal());
		TipoEntradaConsultarSaldoWSDTO ltecs_tipoEntradaConsultarSaldowsDto = new TipoEntradaConsultarSaldoWSDTO();
		String[] ls_idCuentaCupo = ltscicc_tipoSalidaConsultarIdCuentaCupoWsDto.getIs_id().split(":");
		ltecs_tipoEntradaConsultarSaldowsDto.setIs_idCuentaCupo(ls_idCuentaCupo[EnumNumeros.CERO.getIi_numero()]);
		ltecs_tipoEntradaConsultarSaldowsDto.setIs_modulo(EnumCriterio.CANAL_ORIGEN.getIs_criterio());
		ltecs_tipoEntradaConsultarSaldowsDto.setIta_adminWSDto(lta_adminVo);
		TipoUsuarioCSIWSDTO ltu_usuarioCsi = new TipoUsuarioCSIWSDTO();
		ltu_usuarioCsi.setIs_numDocUsuario("");
		ltu_usuarioCsi.setIs_tipoDocUsuario("");
		ltecs_tipoEntradaConsultarSaldowsDto.setItu_usuarioCsi(ltu_usuarioCsi);
		TipoSalidaConsultarSaldoWSDTO ltscs_tipoSalidaConsultarSaldoWsDto;
		ltscs_tipoSalidaConsultarSaldoWsDto = iigcc_gestionCuentaCupoBusiness
				.consultarSaldo(ltecs_tipoEntradaConsultarSaldowsDto);
		return ltscs_tipoSalidaConsultarSaldoWsDto;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.
	 * ICuentaCupoBusiness#inscribirUsuario(co.gov.supernotariado.bachue.
	 * sedeelectronica.admon.services.wsdto.TipoEntradaInscribirUsuarioWSDTO)
	 */
	@Override
	public TipoSalidaInscribirUsuarioWSDTO inscribirUsuario(
			TipoEntradaInscribirUsuarioWSDTO ateiu_tipoEntradaInscribirUsuarioDto) {
		FormularioCrearCuentaCupoDTO lfccc_datosFormularioCuentaCupo = iifub_formularioUsuarioBusiness
				.consultarDatosFormularioCuentaCupoCreacion();

		TipoEntradaConsultarIDCuentaCupoWSDTO ltecicc_tipoEntradaConsultarIdCuentaCupoWsDto = new TipoEntradaConsultarIDCuentaCupoWSDTO();
		ltecicc_tipoEntradaConsultarIdCuentaCupoWsDto.setIs_modulo(EnumCriterio.CANAL_ORIGEN.getIs_criterio());
		TipoAdminCICCIWSDTO ltac_adminCicciVo = new TipoAdminCICCIWSDTO();
		ltac_adminCicciVo.setIs_correoElectronicoCorporativoUsuario(lfccc_datosFormularioCuentaCupo.getIs_correo());
		ltac_adminCicciVo.setIs_numDocAdmin(lfccc_datosFormularioCuentaCupo.getIs_numeroDocumentoRepresentanteLegal());
		ltac_adminCicciVo.setIs_tipoDocAdmin(lfccc_datosFormularioCuentaCupo.getIs_tipoDocumentoRepresentanteLegal());
		ltecicc_tipoEntradaConsultarIdCuentaCupoWsDto.setItac_adminCicciVo(ltac_adminCicciVo);
		TipoSalidaConsultarIDCuentaCupoWSDTO ltscicc_tipoSalidaConsultarIdCuentaCupoWsDto = iigcc_gestionCuentaCupoBusiness
				.consultarIdCuentaCupo(ltecicc_tipoEntradaConsultarIdCuentaCupoWsDto);

		TipoEntradaInscribirUsuarioWSDTO lteiu_tipoEntradaInscribirUsuarioDto = new TipoEntradaInscribirUsuarioWSDTO();
		String[] ls_idCuentaCupo = ltscicc_tipoSalidaConsultarIdCuentaCupoWsDto.getIs_id().split(":");
		lteiu_tipoEntradaInscribirUsuarioDto.setIs_idCuentaCupo(ls_idCuentaCupo[EnumNumeros.CERO.getIi_numero()]);
		lteiu_tipoEntradaInscribirUsuarioDto.setIs_modulo(EnumCriterio.CANAL_ORIGEN.getIs_criterio());
		TipoAdminWSDTO lta_adminWsDto = new TipoAdminWSDTO();
		lta_adminWsDto.setIs_numDocAdmin(lfccc_datosFormularioCuentaCupo.getIs_numeroDocumentoRepresentanteLegal());
		lta_adminWsDto.setIs_tipoDocAdmin(lfccc_datosFormularioCuentaCupo.getIs_tipoDocumentoRepresentanteLegal());
		lteiu_tipoEntradaInscribirUsuarioDto.setIta_admin(lta_adminWsDto);
		lteiu_tipoEntradaInscribirUsuarioDto.setItu_usuario(ateiu_tipoEntradaInscribirUsuarioDto.getItu_usuario());
		TipoSalidaInscribirUsuarioWSDTO ltscs_tipoSalidaConsultarSaldoWsDto;
		ltscs_tipoSalidaConsultarSaldoWsDto = iigcc_gestionCuentaCupoBusiness
				.inscribirUsuario(lteiu_tipoEntradaInscribirUsuarioDto);
		return ltscs_tipoSalidaConsultarSaldoWsDto;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.
	 * ICuentaCupoBusiness#cancelarUsuario(co.gov.supernotariado.bachue.
	 * sedeelectronica.admon.services.wsdto.TipoEntradaCancelarUsuarioWSDTO)
	 */
	@Override
	public TipoSalidaCancelarUsuarioWSDTO cancelarUsuario(
			TipoEntradaCancelarUsuarioWSDTO atecu_tipoEntradaCancelarUsuarioDto) {
		FormularioCrearCuentaCupoDTO lfccc_datosFormularioCuentaCupo = iifub_formularioUsuarioBusiness
				.consultarDatosFormularioCuentaCupoCreacion();

		TipoEntradaConsultarIDCuentaCupoWSDTO ltecicc_tipoEntradaConsultarIdCuentaCupoWsDto = new TipoEntradaConsultarIDCuentaCupoWSDTO();
		ltecicc_tipoEntradaConsultarIdCuentaCupoWsDto.setIs_modulo(EnumCriterio.CANAL_ORIGEN.getIs_criterio());
		TipoAdminCICCIWSDTO ltac_adminCicciVo = new TipoAdminCICCIWSDTO();
		ltac_adminCicciVo.setIs_correoElectronicoCorporativoUsuario(lfccc_datosFormularioCuentaCupo.getIs_correo());
		ltac_adminCicciVo.setIs_numDocAdmin(lfccc_datosFormularioCuentaCupo.getIs_numeroDocumentoRepresentanteLegal());
		ltac_adminCicciVo.setIs_tipoDocAdmin(lfccc_datosFormularioCuentaCupo.getIs_tipoDocumentoRepresentanteLegal());
		ltecicc_tipoEntradaConsultarIdCuentaCupoWsDto.setItac_adminCicciVo(ltac_adminCicciVo);
		TipoSalidaConsultarIDCuentaCupoWSDTO ltscicc_tipoSalidaConsultarIdCuentaCupoWsDto = iigcc_gestionCuentaCupoBusiness
				.consultarIdCuentaCupo(ltecicc_tipoEntradaConsultarIdCuentaCupoWsDto);

		TipoEntradaCancelarUsuarioWSDTO ltecu_tipoEntradaCancelarUsuarioDto = new TipoEntradaCancelarUsuarioWSDTO();
		String[] ls_idCuentaCupo = ltscicc_tipoSalidaConsultarIdCuentaCupoWsDto.getIs_id().split(":");
		ltecu_tipoEntradaCancelarUsuarioDto.setIs_idCuentaCupo(ls_idCuentaCupo[EnumNumeros.CERO.getIi_numero()]);
		ltecu_tipoEntradaCancelarUsuarioDto.setIs_modulo(EnumCriterio.CANAL_ORIGEN.getIs_criterio());
		TipoAdminWSDTO lta_adminWsDto = new TipoAdminWSDTO();
		lta_adminWsDto.setIs_numDocAdmin(lfccc_datosFormularioCuentaCupo.getIs_numeroDocumentoRepresentanteLegal());
		lta_adminWsDto.setIs_tipoDocAdmin(lfccc_datosFormularioCuentaCupo.getIs_tipoDocumentoRepresentanteLegal());
		ltecu_tipoEntradaCancelarUsuarioDto.setIta_administradorVo(lta_adminWsDto);
		ltecu_tipoEntradaCancelarUsuarioDto
				.setItucnui_usuarioVo(atecu_tipoEntradaCancelarUsuarioDto.getItucnui_usuarioVo());
		TipoSalidaCancelarUsuarioWSDTO ltscs_tipoSalidaConsultarSaldoWsDto;
		ltscs_tipoSalidaConsultarSaldoWsDto = iigcc_gestionCuentaCupoBusiness
				.cancelarUsuario(ltecu_tipoEntradaCancelarUsuarioDto);
		return ltscs_tipoSalidaConsultarSaldoWsDto;
	}

	@Override
	public byte[] consultarDevolucionCuentaCupo(
			FormularioDevolucionesCuentaCupoDTO afdcc_formularioDevolucionCuentaCupoDto, UsuarioDTO au_usuarioDto,
			List<ArchivosDinamicosDTO> alad_archivos) throws JRException {
		FormularioDevolucionCuentaCupoDTO lfdcc_formularioDevolucionCuentaCupoDto = FormularioCuentaCupoConverter
				.dtoAFormularioDevolucionDto(afdcc_formularioDevolucionCuentaCupoDto, au_usuarioDto);

		List<ArchivoDinamicoDTO> llad_archivoDinamicoDto = ArchivoDinamicoConverter
				.listaDtoAFormularioDto(alad_archivos);
		if (afdcc_formularioDevolucionCuentaCupoDto.getIs_tipoDevolucion()
				.equals(EnumCriterio.POR_CANCELACION_CUENTA_CUPO.getIs_criterio())
				&& afdcc_formularioDevolucionCuentaCupoDto.getIs_tipoDocumentoTitularCuentaBancaria()
						.equals(EnumTipoDocumento.NIT.getIs_codigo())) {
			lfdcc_formularioDevolucionCuentaCupoDto
					.setLs_nombreFormulario(EnumFormulario.FORMULARIO_DEVOLUCION_CUENTA_CUPO_CANCELACIONCUENTACUPO_NIT
							.getIs_nombreFormulario());
		} else if (afdcc_formularioDevolucionCuentaCupoDto.getIs_tipoDevolucion()
				.equals(EnumCriterio.POR_CANCELACION_CUENTA_CUPO.getIs_criterio())
				&& !afdcc_formularioDevolucionCuentaCupoDto.getIs_tipoDocumentoTitularCuentaBancaria()
						.equals(EnumTipoDocumento.NIT.getIs_codigo())) {
			lfdcc_formularioDevolucionCuentaCupoDto.setLs_nombreFormulario(
					EnumFormulario.FORMULARIO_DEVOLUCION_CUENTA_CUPO_CANCELACIONCUENTACUPO_CC.getIs_nombreFormulario());
		} else if (afdcc_formularioDevolucionCuentaCupoDto.getIs_tipoDevolucion()
				.equals(EnumCriterio.POR_NOTA_CREDITO.getIs_criterio())
				&& afdcc_formularioDevolucionCuentaCupoDto.getIs_tipoDocumentoTitularCuentaBancaria()
						.equals(EnumTipoDocumento.NIT.getIs_codigo())) {
			lfdcc_formularioDevolucionCuentaCupoDto.setLs_nombreFormulario(
					EnumFormulario.FORMULARIO_DEVOLUCION_CUENTA_CUPO_NOTACREDITO_NIT.getIs_nombreFormulario());
		} else if (afdcc_formularioDevolucionCuentaCupoDto.getIs_tipoDevolucion()
				.equals(EnumCriterio.POR_NOTA_CREDITO.getIs_criterio())
				&& !afdcc_formularioDevolucionCuentaCupoDto.getIs_tipoDocumentoTitularCuentaBancaria()
						.equals(EnumTipoDocumento.NIT.getIs_codigo())) {
			lfdcc_formularioDevolucionCuentaCupoDto.setLs_nombreFormulario(
					EnumFormulario.FORMULARIO_DEVOLUCION_CUENTA_CUPO_NOTACREDITO_CC.getIs_nombreFormulario());
		}
		lfdcc_formularioDevolucionCuentaCupoDto.setImagenes(llad_archivoDinamicoDto);
		lfdcc_formularioDevolucionCuentaCupoDto
				.setCodigoCuentaCupo(afdcc_formularioDevolucionCuentaCupoDto.getIs_codigoCuentaCupo());
		lfdcc_formularioDevolucionCuentaCupoDto
				.setCodigoNotaCredito(afdcc_formularioDevolucionCuentaCupoDto.getIs_codigoNotaCredito());
		lfdcc_formularioDevolucionCuentaCupoDto.setSaldo(afdcc_formularioDevolucionCuentaCupoDto.getIs_saldo());

		ISalidaGenericaDocumentoDTO lisgd_salidaArchivoDto = DocumentosFactory
				.generarFormulario(lfdcc_formularioDevolucionCuentaCupoDto);

		byte[] lb_archivo;
		lb_archivo = lisgd_salidaArchivoDto.consultarDocumentoGenerado();
		return lb_archivo;
	}

}

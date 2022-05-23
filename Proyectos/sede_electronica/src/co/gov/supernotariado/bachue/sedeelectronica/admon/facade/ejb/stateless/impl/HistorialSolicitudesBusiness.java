/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: HistorialSolicitudesBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl
 * Nombre del elemento: HistorialSolicitudesBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl;

import java.util.ArrayList;
import java.util.Base64;
import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IDetalleCatalogoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IHistorialSolicitudesBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITransaccionBancarizacionBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.DetalleCatalogoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.HistorialSolicitudesEntradaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.HistorialSolicitudesSalidaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.PersonaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionBancarizacionDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TurnoHistorialSolicitudesDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioSesionDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IUsuarioDAO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper.HistorialSolicitudesPagadasHelper;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper.PersonaHelper;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Usuario;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IConsultarHistorialesSolicitudesPagadasBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IEntregaProductoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.SolicitanteWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.SolicitudWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaBuscarSolicitudesWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarDetalleSolicitudWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaObtenerProductoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaObtenerReciboCajaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaBuscarSolicitudesWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarDetalleSolicitudWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaObtenerProductoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaObtenerReciboCajaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TurnoConsultarDetallesSolicitudWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumCriterio;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadAutoridadUsuario;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadExcepciones;

/**
 * Clase tipo EJB (Enterprise Java Bean) de la capa de negocio. <br>
 * Contiene la implementacion logica de las operaciones del recurso Historial
 * solicitudes. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless(name = "HistorialSolicitudesBusiness", mappedName = "HistorialSolicitudesBusiness")
@LocalBean
public class HistorialSolicitudesBusiness implements IHistorialSolicitudesBusiness{

	/**
	 * Atributo de instancia tipo IUsuarioDAO para definir la propiedad usuario dao.
	 */
	@EJB
	private IUsuarioDAO iiu_usuarioDao;

	/**
	 * Atributo de instancia tipo IConsultarHistorialesSolicitudesPagadasBusiness
	 * para definir la propiedad consultar historial solicitudes pagadas business.
	 */
	@EJB
	private IConsultarHistorialesSolicitudesPagadasBusiness iichsp_consultarHistorialSolicitudesPagadasBusiness;

	/**
	 * Atributo de instancia tipo IEntregaProductoBusiness para definir la propiedad
	 * entrega producto business.
	 */
	@EJB
	private IEntregaProductoBusiness iiep_entregaProductoBusiness;


	/**
	 * Atributo de instancia tipo ITransaccionBancarizacionBusiness para definir la propiedad
	 * transaccion Bancarizacion business.
	 */
	@EJB
	private ITransaccionBancarizacionBusiness iitb_transaccionBancarizacionBusiness;

	
	/**
	 * Atributo de instancia tipo IDetalleCatalogoBusiness para definir la propiedad
	 * detalle catalogo business.
	 */
	@EJB
	private IDetalleCatalogoBusiness iidc_detalleCatalogoBusiness;
	
	/**
	 * Define la constante CS_DOCUMENTO.
	 */
	private static final String CS_DOCUMENTO = "Documento";
	
	/**
	 * Define la constante CS_EXTENSION.
	 */
	private static final String CS_EXTENSION = ".pdf";
	
	/**
	 * Define la constante CS_PERSONA_NATURAL.
	 */
	private static final String CS_PERSONA_NATURAL = "N";

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IHistorialSolicitudesBusiness#consultarHistorial(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.HistorialSolicitudesEntradaDTO)
	 */
	@Override
	public List<HistorialSolicitudesSalidaDTO> consultarHistorial(
			HistorialSolicitudesEntradaDTO ahse_historialSolicitudesEntradaDto) {
		List<DetalleCatalogoDTO> lldc_listaDetalleCatalogo = iidc_detalleCatalogoBusiness.consultarDetallesCatalogos(ahse_historialSolicitudesEntradaDto.getIs_servicio());
		TipoEntradaBuscarSolicitudesWSDTO ltebs_tipoEntradaBuscarSolicitudesWsdto = new TipoEntradaBuscarSolicitudesWSDTO();
		ltebs_tipoEntradaBuscarSolicitudesWsdto.setId_fechaDesdeBusqueda(ahse_historialSolicitudesEntradaDto.getId_fechaDesde());
		ltebs_tipoEntradaBuscarSolicitudesWsdto.setId_fechaHastaBusqueda(ahse_historialSolicitudesEntradaDto.getId_fechaHasta());
		ltebs_tipoEntradaBuscarSolicitudesWsdto.setIs_servicio(lldc_listaDetalleCatalogo.iterator().next().getIs_idCodigoServicio());
		ltebs_tipoEntradaBuscarSolicitudesWsdto.setIs_nir(ahse_historialSolicitudesEntradaDto.getIs_nir());
		ltebs_tipoEntradaBuscarSolicitudesWsdto.setIs_modulo(EnumCriterio.CANAL_ORIGEN.getIs_criterio());
		SolicitanteWSDTO ls_solicitante = new SolicitanteWSDTO();

		Usuario lu_usuario;
		UsuarioSesionDTO lus_usuarioSesionDto;
		PersonaDTO lp_personaDto;
		lus_usuarioSesionDto = UtilidadAutoridadUsuario.consultarUsuarioSesion();
		lu_usuario = iiu_usuarioDao.consultarUsuario(lus_usuarioSesionDto.getIs_nombreUsuario());
		lp_personaDto = PersonaHelper.entidadADtoCompleto(lu_usuario.getPersona());
		ahse_historialSolicitudesEntradaDto.setIp_personaDto(lp_personaDto);
		ls_solicitante.setIs_numeroDocumento(ahse_historialSolicitudesEntradaDto.getIp_personaDto().getIs_numeroDocumento());
		ls_solicitante.setIs_tipoDocumento(ahse_historialSolicitudesEntradaDto.getIp_personaDto().getItd_tipoDocumentoDto().getIs_id());
		ls_solicitante.setIs_tipoPersona(CS_PERSONA_NATURAL);
		ltebs_tipoEntradaBuscarSolicitudesWsdto.setIs_solicitante(ls_solicitante);

		TipoSalidaBuscarSolicitudesWSDTO ltsbs_tipoSalidaBuscarSolicitudesWsDto = iichsp_consultarHistorialSolicitudesPagadasBusiness.buscarSolicitudes(ltebs_tipoEntradaBuscarSolicitudesWsdto);
		UtilidadExcepciones.manejadorExcepcionesServicios(ltsbs_tipoSalidaBuscarSolicitudesWsDto);
		List<HistorialSolicitudesSalidaDTO> llhss_listaHistorialSolicitudesSalidaDto = new ArrayList<>();
		for(SolicitudWSDTO ls_solicitudWsDto: ltsbs_tipoSalidaBuscarSolicitudesWsDto.getIls_solicitudes())
		{
			llhss_listaHistorialSolicitudesSalidaDto.add(cargarHistorialSolicitudes(ls_solicitudWsDto,lp_personaDto));
		}
		return llhss_listaHistorialSolicitudesSalidaDto;
	}

	/**
	 * Metodo que se encarga de pasar de un WsDto a un Dto para enviar al bean.
	 *
	 * @param as_solicitudWsDto WsDto de la lista que trae el servicio
	 * @param ap_personaDto     el parametro persona dto
	 * @return Resultado para cargar historial solicitudes retornado como
	 *         HistorialSolicitudesSalidaDTO
	 */
	private HistorialSolicitudesSalidaDTO cargarHistorialSolicitudes(SolicitudWSDTO as_solicitudWsDto,PersonaDTO ap_personaDto) {
		HistorialSolicitudesSalidaDTO lhss_historialSolicitudesSalidaDto = new HistorialSolicitudesSalidaDTO();
		lhss_historialSolicitudesSalidaDto.setId_fechaServicio(as_solicitudWsDto.getId_fechaServicio());
		lhss_historialSolicitudesSalidaDto.setIs_nir(as_solicitudWsDto.getIs_nir());
		lhss_historialSolicitudesSalidaDto.setIs_servicio(as_solicitudWsDto.getIs_descripcionServicio());
		lhss_historialSolicitudesSalidaDto.setIs_subServicio(as_solicitudWsDto.getIs_descripcionSubServicio());
		lhss_historialSolicitudesSalidaDto.setIp_personaDto(ap_personaDto);
		return lhss_historialSolicitudesSalidaDto;
	}

	/**
	 * Metodo que consulta el recibo de pago del nir.
	 *
	 * @param ahss_historialSolicitudesSalidaDto el parametro historial solicitudes
	 *                                           salida dto
	 * @return Resultado para consultar archivo retornado como String
	 */
	@Override
	public String consultarArchivo(HistorialSolicitudesSalidaDTO ahss_historialSolicitudesSalidaDto) {
		TipoEntradaObtenerReciboCajaWSDTO lteorc_tipoEntradaObtenerReciboCajaWsDto = new TipoEntradaObtenerReciboCajaWSDTO();
		lteorc_tipoEntradaObtenerReciboCajaWsDto.setIs_nir(ahss_historialSolicitudesSalidaDto.getIs_nir());
		lteorc_tipoEntradaObtenerReciboCajaWsDto.setIs_referenciaPago("");
		TipoSalidaObtenerReciboCajaWSDTO ltsorc_tipoSalidaObtenerReciboCajaWsDto;
		ltsorc_tipoSalidaObtenerReciboCajaWsDto = iiep_entregaProductoBusiness.obtenerReciboCaja(lteorc_tipoEntradaObtenerReciboCajaWsDto);
		String ls_textocodificado = "";
		if(ltsorc_tipoSalidaObtenerReciboCajaWsDto.getIb_archivo() != null)
			ls_textocodificado =  new String(Base64.getEncoder().encode(ltsorc_tipoSalidaObtenerReciboCajaWsDto.getIb_archivo()));
		return ls_textocodificado;
	}

	
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IHistorialSolicitudesBusiness#detalleHistorial(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.HistorialSolicitudesSalidaDTO)
	 */
	@Override
	public List<TurnoHistorialSolicitudesDTO> detalleHistorial(
			HistorialSolicitudesSalidaDTO ahss_historialSolicitudesSalidaDto) {

		TipoEntradaConsultarDetalleSolicitudWSDTO ltecds_tipoEntradaConsultarDetalleSolicitudWsdto = new TipoEntradaConsultarDetalleSolicitudWSDTO();
		ltecds_tipoEntradaConsultarDetalleSolicitudWsdto.setIs_modulo(EnumCriterio.CANAL_ORIGEN.getIs_criterio());
		ltecds_tipoEntradaConsultarDetalleSolicitudWsdto.setIs_nir(ahss_historialSolicitudesSalidaDto.getIs_nir());
		SolicitanteWSDTO ls_solicitante = new SolicitanteWSDTO();
		ls_solicitante.setIs_numeroDocumento(ahss_historialSolicitudesSalidaDto.getIp_personaDto().getIs_numeroDocumento());
		ls_solicitante.setIs_tipoDocumento(ahss_historialSolicitudesSalidaDto.getIp_personaDto().getItd_tipoDocumentoDto().getIs_id());
		ls_solicitante.setIs_tipoPersona(CS_PERSONA_NATURAL);
		ltecds_tipoEntradaConsultarDetalleSolicitudWsdto.setIs_solicitante(ls_solicitante);
		TipoSalidaConsultarDetalleSolicitudWSDTO ltscds_tipoSalidaConsultarDetalleSolicitudWsDto = iichsp_consultarHistorialSolicitudesPagadasBusiness.consultarDetalleSolicitud(ltecds_tipoEntradaConsultarDetalleSolicitudWsdto);
		List<TurnoHistorialSolicitudesDTO> llths_listaTurnoHistorialSolicitudesDto = new ArrayList<>();
		for(TurnoConsultarDetallesSolicitudWSDTO ltcds_turnoConsultarDetalleSolicitud :ltscds_tipoSalidaConsultarDetalleSolicitudWsDto.getIltcds_listaTurnoConsultarDetallesSolicitudWsDto())
		{
			llths_listaTurnoHistorialSolicitudesDto.add(cargarDetalleHistorial(ltcds_turnoConsultarDetalleSolicitud));
		}
		return llths_listaTurnoHistorialSolicitudesDto;
	}

	//	Se dana por que necesita referencia de pago y no turno
	/**
	 * Metodo que carga el detalle del historial para enviar al bean.
	 *
	 * @param atcds_turnoConsultarDetalleSolicitud datos del servicio a convertir
	 *                                             para la vista
	 * @return Resultado para cargar detalle historial retornado como
	 *         TurnoHistorialSolicitudesDTO
	 */
	private TurnoHistorialSolicitudesDTO cargarDetalleHistorial(
			TurnoConsultarDetallesSolicitudWSDTO atcds_turnoConsultarDetalleSolicitud) {
		TurnoHistorialSolicitudesDTO lths_turnoHistorialSolicitudesDto = new TurnoHistorialSolicitudesDTO();
		lths_turnoHistorialSolicitudesDto.setId_fechaTurno(atcds_turnoConsultarDetalleSolicitud.getId_fechaServicio());
		lths_turnoHistorialSolicitudesDto.setIs_turno(atcds_turnoConsultarDetalleSolicitud.getIs_turno());
		lths_turnoHistorialSolicitudesDto.setIs_archivoConvertido(consultarArchivo(lths_turnoHistorialSolicitudesDto));
		lths_turnoHistorialSolicitudesDto.setIb_archivoDisponible(!lths_turnoHistorialSolicitudesDto.getIs_archivoConvertido().isEmpty());
		lths_turnoHistorialSolicitudesDto.setIs_nombreArchivo(CS_DOCUMENTO+lths_turnoHistorialSolicitudesDto.getIs_turno()+CS_EXTENSION);
		return lths_turnoHistorialSolicitudesDto;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IHistorialSolicitudesBusiness#consultarArchivo(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TurnoHistorialSolicitudesDTO)
	 */
	@Override
	public String consultarArchivo(TurnoHistorialSolicitudesDTO aths_turnoHistorialSolicitudesDto) {
		TipoEntradaObtenerProductoWSDTO lteop_tipoEntradaObtenerProductoWsDto = new TipoEntradaObtenerProductoWSDTO();
		lteop_tipoEntradaObtenerProductoWsDto.setIs_turno(aths_turnoHistorialSolicitudesDto.getIs_turno());
		TipoSalidaObtenerProductoWSDTO ltsop_tipoSalidaObtenerProducto;
		ltsop_tipoSalidaObtenerProducto = iiep_entregaProductoBusiness.obtenerProducto(lteop_tipoEntradaObtenerProductoWsDto);
		String ls_textocodificado = "";
		if(ltsop_tipoSalidaObtenerProducto.getIb_archivo() != null)
			ls_textocodificado =  new String(Base64.getEncoder().encode(ltsop_tipoSalidaObtenerProducto.getIb_archivo()));
		return ls_textocodificado;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IHistorialSolicitudesBusiness#consultarArchivo(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TurnoHistorialSolicitudesDTO)
	 */
	@Override
	public List<HistorialSolicitudesSalidaDTO> consultarHistorialBancarizacion(String as_idUsuario, Date ad_fechaInicial, Date ad_fechaFinal) {
		List<TransaccionBancarizacionDTO> ltb_transaccionBancarizacion = iitb_transaccionBancarizacionBusiness.consultarTransaccionBancarizacion(as_idUsuario, ad_fechaInicial, ad_fechaFinal);
		List<HistorialSolicitudesSalidaDTO> llhss_listaSolicitudesPagadas = HistorialSolicitudesPagadasHelper.listaTransaccionBancarizacionDTOAListaHistorialSolicitudesSalidaDTO(ltb_transaccionBancarizacion); 
		return llhss_listaSolicitudesPagadas;
	}
	
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IHistorialSolicitudesBusiness#consultarArchivo(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TurnoHistorialSolicitudesDTO)
	 */	@Override
	public HistorialSolicitudesSalidaDTO consultarTurnosBancarizacion(String as_codigoTransaccion) {
		TransaccionBancarizacionDTO ltb_transaccion = iitb_transaccionBancarizacionBusiness.actualizarEstadoTurnos(as_codigoTransaccion);
		HistorialSolicitudesSalidaDTO llhss_SolicitudesPagadas = HistorialSolicitudesPagadasHelper.transaccionBancarizacionDTOAHistorialSolicitudesSalidaDTO(ltb_transaccion); 
		return llhss_SolicitudesPagadas;
	}

}

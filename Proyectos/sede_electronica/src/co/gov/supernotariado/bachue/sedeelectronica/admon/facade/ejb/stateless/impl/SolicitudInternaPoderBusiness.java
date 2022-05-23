/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: AccionBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl
 * Nombre del elemento: AccionBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import org.jboss.logging.Logger;

import co.gov.supernotariado.bachue.sedeelectronica.admon.exception.ExcepcionesDatosEntrada;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IEnvioCorreoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ISolicitudInternaPoderBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.EntidadEspecialDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.SolicitudPendientePoderDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.ISolicitudPendientePoderDAO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper.SolicitudPendientePoderHelper;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.SolicitudPendientePoder;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IPoderesWSBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.poderes.ParametroWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.poderes.TipoEntradaActualizarMetadatosPoderWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.poderes.TipoEntradaConsultaPoderWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.poderes.TipoSalidaActualizarMetadatosPoderWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.poderes.TipoSalidaConsultaPoderWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumCodigosRespuestas;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumCriterio;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumMensajesLog;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTiposEstadoTransaccionSolicitudInterna;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTiposSolicitudesPoderes;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones.EnumExcepcionesGenerales;
import co.gov.supernotariado.bachue.sedeelectronica.common.mailer.dto.PlantillaCorreoInstanciaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.mailer.enums.EnumPlantillasCorreo;
import co.gov.supernotariado.bachue.sedeelectronica.common.mailer.enums.parametrosPlantillas.EnumParametrosSolicitudesInternas;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadAuditoria;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadSeguridad;

/**
 * Clase tipo EJB (Enterprise Java Bean) de la capa de negocio. <br>
 * Contiene la implementacion logica de las operaciones del recurso Accion. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless(name = "solicitudInternaPoderBusiness", mappedName = "solicitudInternaPoderBusiness")
@LocalBean
public class SolicitudInternaPoderBusiness implements ISolicitudInternaPoderBusiness {
	

	/**
	 * Define la constante CL_LOGGER.
	 */
	static final Logger CL_LOGGER = Logger.getLogger(SolicitudInternaPoderBusiness.class);

	@EJB
	private ISolicitudPendientePoderDAO iispp_solicitudPendientePoderDAO;

	@EJB
	private IEnvioCorreoBusiness iiec_envioCorreo;

	@EJB
	private IPoderesWSBusiness iipb_poderWsBusiness;

	@Override
	public List<SolicitudPendientePoderDTO> consultarSolicitudesPendientesPoderes(String as_tipoSolicitud,
			String as_estadoSolicitud, EntidadEspecialDTO aee_idNotariaOrigen) {
		List<SolicitudPendientePoder> llspp_solicitudesPendientes;
		if (aee_idNotariaOrigen != null) {
			llspp_solicitudesPendientes = iispp_solicitudPendientePoderDAO
					.consultarSolicitudesPendientesPoderes(as_tipoSolicitud, as_estadoSolicitud, aee_idNotariaOrigen.getIs_id());
		}else {
			llspp_solicitudesPendientes = iispp_solicitudPendientePoderDAO
					.consultarSolicitudesPendientesPoderes(as_tipoSolicitud, as_estadoSolicitud);
		}

		List<SolicitudPendientePoderDTO> llspp_solicitudesPendientesDto;
		llspp_solicitudesPendientesDto = SolicitudPendientePoderHelper
				.listaentidadADtoCompleto(llspp_solicitudesPendientes);

		return llspp_solicitudesPendientesDto;
	}

	@Override
	public SolicitudPendientePoderDTO consultarSolicitudPendientePoder(String as_identificadorSolicitudPendiente,
			EntidadEspecialDTO aee_idNotariaOrigen) {

		SolicitudPendientePoder lspp_solicitudPendiente ;
		
		if (aee_idNotariaOrigen == null) {
			 lspp_solicitudPendiente = iispp_solicitudPendientePoderDAO
					.consultarSolicitudPendientePoder(as_identificadorSolicitudPendiente);
		}else {
			lspp_solicitudPendiente = iispp_solicitudPendientePoderDAO
					.consultarSolicitudPendientePoder(as_identificadorSolicitudPendiente, aee_idNotariaOrigen.getIs_id());
		}		

		if (lspp_solicitudPendiente == null) {
			throw new ExcepcionesDatosEntrada(EnumExcepcionesGenerales.DATOS_INEXISTENTES);
		}
		SolicitudPendientePoderDTO lspp_solicitudPendienteDto = SolicitudPendientePoderHelper
				.entidadADtoSimple(lspp_solicitudPendiente);

		return lspp_solicitudPendienteDto;
	}

	@Override
	public void actualizarSolicitud(SolicitudPendientePoderDTO aspp_solicitudPoder, ParametroWSDTO ap_poder) {
		SolicitudPendientePoder lspp_solicitudPendientePoder = new SolicitudPendientePoder();

		if (aspp_solicitudPoder.getIs_idUsuarioCreacion() == null) {
			UtilidadAuditoria.adicionarDatosCreacion(aspp_solicitudPoder);			
		}
		else {
			UtilidadAuditoria.adicionarDatosModificacion(aspp_solicitudPoder);
		}
		
		lspp_solicitudPendientePoder = SolicitudPendientePoderHelper.dtoAEntidadSimple(aspp_solicitudPoder,
				lspp_solicitudPendientePoder);
		
		if (ap_poder != null) {
			
			String ls_poder =  aspp_solicitudPoder.getIs_idPoder() + "-" + aspp_solicitudPoder.getIs_idVersionPoder();
			TipoSalidaActualizarMetadatosPoderWSDTO ltsamp_poder = actualizarMetadataPoder(ap_poder, ls_poder);		
			
			if (!ltsamp_poder.getIi_codigoMensaje().toString().equals(EnumCodigosRespuestas.CODIGO_200.getIs_codigo())) {
				throw new ExcepcionesDatosEntrada(EnumExcepcionesGenerales.DATOS_INEXISTENTES_GENERAL);
			}
		}	
		
		String ls_idSolictud = iispp_solicitudPendientePoderDAO.actualizarSolicitudPendientePoder(lspp_solicitudPendientePoder);
		aspp_solicitudPoder.setIs_id(ls_idSolictud);
		
		PlantillaCorreoInstanciaDTO lpci_plantillaCorreoInstancia = generarPlantillaSolicitudInterna(aspp_solicitudPoder);
		Boolean lb_estadoEnvioCorreo = iiec_envioCorreo.enviarCorreo(lpci_plantillaCorreoInstancia);
		
		if (lb_estadoEnvioCorreo) {
			CL_LOGGER.info(EnumMensajesLog.ENVIO_CORREO_EXITOSO.getIs_criterio());
		}else {
			CL_LOGGER.info(EnumMensajesLog.ENVIO_CORREO_NO_EXITOSO.getIs_criterio());
		}

	}
	
	/**
	 * Metodo que permite actualizar la metada de un servicio

	 * @param ap_parametroPoder parametros del poder
	 * @param as_docName nombre del documento
	 * @return TipoSalidaActualizarMetadatosPoderWSDTO datos de salida despues de actualizar los metadatos de poder
	 */
	private TipoSalidaActualizarMetadatosPoderWSDTO actualizarMetadataPoder(ParametroWSDTO ap_parametroPoder, String as_docName) {
		TipoEntradaActualizarMetadatosPoderWSDTO ateamp_tipoEntradaActualizarMetadatosPoder = new TipoEntradaActualizarMetadatosPoderWSDTO();
		
		List<ParametroWSDTO> llp_parametros = new ArrayList<ParametroWSDTO>();
		
		if (ap_parametroPoder.getId_xFinalizacionPoder() == null) 
			ap_parametroPoder.setId_xFinalizacionPoder(new Date());
		
		if(ap_parametroPoder.getId_xFechaInstrumento() == null) 
			ap_parametroPoder.setId_xFechaInstrumento(new Date());		
		
		llp_parametros.add(ap_parametroPoder);
		ateamp_tipoEntradaActualizarMetadatosPoder.setIlp_parametros(llp_parametros);
		ateamp_tipoEntradaActualizarMetadatosPoder.setIs_dDocName(as_docName);
		ateamp_tipoEntradaActualizarMetadatosPoder.setIs_sistemaOrigen(EnumCriterio.CANAL_ORIGEN.getIs_criterio());
		
		TipoSalidaActualizarMetadatosPoderWSDTO ltsamp_tipoSalidaMetadatosPoder = iipb_poderWsBusiness.actualizarMetadataPoder(ateamp_tipoEntradaActualizarMetadatosPoder);
		
		return ltsamp_tipoSalidaMetadatosPoder;
	}

	/**
	 * Metodo que permite generar una plantilla de correo para solicitudes internas
	 * 
	 * @param aspp_solicitudPoder Datos de la solicitud interna a enviar correo
	 * @return PlantillaCorreoInstanciaDTO Dto con los datos de la plantilla generada para enviar el correo
	 */
	private PlantillaCorreoInstanciaDTO generarPlantillaSolicitudInterna(SolicitudPendientePoderDTO aspp_solicitudPoder) {

		PlantillaCorreoInstanciaDTO lpci_plantilla = null;
		String ls_servidor = UtilidadSeguridad.consultarUrlServidor();

		if (EnumTiposEstadoTransaccionSolicitudInterna.PENDIENTE.getIs_criterio().contentEquals(aspp_solicitudPoder.getIs_estadoSolicitud())) {
			lpci_plantilla = iiec_envioCorreo.crearPlantillaCorreo(EnumPlantillasCorreo.CREACION_SOLICITUD_INTERNA);	
			
			lpci_plantilla
			.addAsunto(EnumParametrosSolicitudesInternas.TIPO_SOLICITUD.getIs_parametro(), EnumTiposSolicitudesPoderes.consultarTipo( aspp_solicitudPoder.getIs_tipoTransaccion()).getIs_nombre())
			.addAsunto(EnumParametrosSolicitudesInternas.INDENTIFICADOR_SOLICITUD_INTERNA.getIs_parametro(), aspp_solicitudPoder.getIs_id())
			.addMensaje(EnumParametrosSolicitudesInternas.SERVIDOR.getIs_parametro(), ls_servidor)
			.addMensaje(EnumParametrosSolicitudesInternas.NOTARIA_SOLICITANTE.getIs_parametro(), aspp_solicitudPoder.getIee_entidadEspecialSolicitante().getIs_nombreEntidadExterna())
			.addMensaje(EnumParametrosSolicitudesInternas.NOMBRE_USUARIO.getIs_parametro(),aspp_solicitudPoder.getIee_entidadEspecialOrigen().getIs_nombreEntidadExterna())
			.addMensaje(EnumParametrosSolicitudesInternas.INDENTIFICADOR_SOLICITUD_INTERNA.getIs_parametro(), aspp_solicitudPoder.getIs_id())
			.addMensaje(EnumParametrosSolicitudesInternas.ESTADO_SOLICITUD.getIs_parametro(), aspp_solicitudPoder.getIs_estadoSolicitud())
			.addMensaje(EnumParametrosSolicitudesInternas.OBSERVACIONES.getIs_parametro(), aspp_solicitudPoder.getIs_observacion())
			.addMensaje(EnumParametrosSolicitudesInternas.TIPO_SOLICITUD.getIs_parametro(), EnumTiposSolicitudesPoderes.consultarTipo( aspp_solicitudPoder.getIs_tipoTransaccion()).getIs_nombre())
			;	
			lpci_plantilla.setIs_destino(aspp_solicitudPoder.getIee_entidadEspecialOrigen().getIu_usuarioDto().getIs_correoElectronico());
		
		}else {
			lpci_plantilla = iiec_envioCorreo.crearPlantillaCorreo(EnumPlantillasCorreo.RESPUESTA_SOLICITUD_INTERNA_PODERES);		
			
			lpci_plantilla
			.addAsunto(EnumParametrosSolicitudesInternas.TIPO_SOLICITUD.getIs_parametro(), EnumTiposSolicitudesPoderes.consultarTipo( aspp_solicitudPoder.getIs_tipoTransaccion()).getIs_nombre())
			.addAsunto(EnumParametrosSolicitudesInternas.INDENTIFICADOR_SOLICITUD_INTERNA.getIs_parametro(), aspp_solicitudPoder.getIs_id())
			
			.addMensaje(EnumParametrosSolicitudesInternas.SERVIDOR.getIs_parametro(), ls_servidor)
			.addMensaje(EnumParametrosSolicitudesInternas.NOTARIA_ORIGEN.getIs_parametro(), aspp_solicitudPoder.getIee_entidadEspecialOrigen().getIs_nombreEntidadExterna())
			.addMensaje(EnumParametrosSolicitudesInternas.NOMBRE_USUARIO.getIs_parametro(),aspp_solicitudPoder.getIee_entidadEspecialSolicitante().getIs_nombreEntidadExterna())
			.addMensaje(EnumParametrosSolicitudesInternas.INDENTIFICADOR_SOLICITUD_INTERNA.getIs_parametro(), aspp_solicitudPoder.getIs_id())
			.addMensaje(EnumParametrosSolicitudesInternas.ESTADO_SOLICITUD.getIs_parametro(), aspp_solicitudPoder.getIs_estadoSolicitud())
			.addMensaje(EnumParametrosSolicitudesInternas.OBSERVACIONES.getIs_parametro(),aspp_solicitudPoder.getIs_justificacion())
			.addMensaje(EnumParametrosSolicitudesInternas.TIPO_SOLICITUD.getIs_parametro(), EnumTiposSolicitudesPoderes.consultarTipo(aspp_solicitudPoder.getIs_tipoTransaccion()).getIs_nombre())
			;	
			lpci_plantilla.setIs_destino(aspp_solicitudPoder.getIee_entidadEspecialSolicitante().getIs_correoElectronico());
		}		
		
		lpci_plantilla.generarCorreo();

		return lpci_plantilla;
	}

	@Override
	public TipoSalidaConsultaPoderWSDTO consultarPoderPendiente(SolicitudPendientePoderDTO aspp_solicitudPendiente) {
		TipoEntradaConsultaPoderWSDTO ltecp_consultaPoder = new TipoEntradaConsultaPoderWSDTO();
		TipoSalidaConsultaPoderWSDTO ltscp_salidaConsultarPoder = iipb_poderWsBusiness
				.consultarPoder(ltecp_consultaPoder);
		return ltscp_salidaConsultarPoder;
	}

}

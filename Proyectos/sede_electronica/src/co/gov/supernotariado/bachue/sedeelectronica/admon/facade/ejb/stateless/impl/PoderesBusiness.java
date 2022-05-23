package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import org.jboss.logging.Logger;

import co.gov.supernotariado.bachue.sedeelectronica.admon.exception.ExcepcionesNegocio;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IEntidadEspecialBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IEnvioCorreoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IPoderesBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ActualizacionPoderCorreoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ArchivoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ObservacionPoderDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.PoderDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters.PoderesConverter;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IPoderesWSBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.poderes.DocumentoConsultaPoderWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.poderes.ParametroConsultaPoderWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.poderes.TipoEntradaActualizarMetadatosPoderWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.poderes.TipoEntradaConsultaPoderWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.poderes.TipoEntradaEnviarPoderWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.poderes.TipoEntradaObtenerPoderWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.poderes.TipoSalidaActualizarMetadatosPoderWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.poderes.TipoSalidaConsultaPoderWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.poderes.TipoSalidaEnviarPoderWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.poderes.TipoSalidaObtenerPoderWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumCriterio;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumMensajesLog;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTiposSolicitudesPoderes;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones.EnumExcepcionesServicios;
import co.gov.supernotariado.bachue.sedeelectronica.common.mailer.dto.PlantillaCorreoInstanciaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.mailer.enums.EnumPlantillasCorreo;
import co.gov.supernotariado.bachue.sedeelectronica.common.mailer.enums.parametrosPlantillas.EnumParametrosSolicitudesInternas;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadExcepciones;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadSeguridad;

/**
 * Clase tipo EJB (Enterprise Java Bean) de la capa de negocio. <br>
 * Contiene la implementacion logica para consumir operaciones del servicio
 * Poderes WS. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless(name = "PoderesBusiness", mappedName = "PoderesBusiness")
@LocalBean
public class PoderesBusiness implements IPoderesBusiness {


	/**
	 * Define la constante CL_LOGGER.
	 */
	static final Logger CL_LOGGER = Logger.getLogger(PoderesBusiness.class);

	@EJB
	private IPoderesWSBusiness iipb_poderBusinessWS;

	@EJB
	private IEnvioCorreoBusiness iiec_envioCorreo;

	@EJB
	private IEntidadEspecialBusiness iieeb_entidadEspecial;
	
	/**
	 * Metodo que permite actualizar el poder
	 * @param aspp_solicitudPoder solciitud interna
	 * @return PlantillaCorreoInstanciaDTO
	 */
	@Override
	public TipoSalidaEnviarPoderWSDTO actualizarPoder(PoderDTO ap_poder) throws ParseException {
		TipoSalidaEnviarPoderWSDTO ltsep_poder = new TipoSalidaEnviarPoderWSDTO();
		TipoEntradaEnviarPoderWSDTO lteep_poder = PoderesConverter.dtoAWsDto(ap_poder);
		lteep_poder.setIs_did(ap_poder.getIs_did());
		lteep_poder.setIs_dDocName(ap_poder.getIs_dDocName());

		if (ap_poder.getIa_archivoPoder() == null || ap_poder.getIa_archivoPoder().getIf_archivo() == null || ap_poder.getIa_archivoPoder().getIf_archivo().length <= 0) {
			TipoSalidaActualizarMetadatosPoderWSDTO ls_salidaActualizacionPoder = iipb_poderBusinessWS.actualizarMetadataPoder(lteep_poder);
			UtilidadExcepciones.manejadorExcepcionesServicios(ls_salidaActualizacionPoder);
			ltsep_poder.setIi_codigoMensaje(ls_salidaActualizacionPoder.getIi_codigoMensaje());
			ltsep_poder.setIi_did(ls_salidaActualizacionPoder.getIi_did());
			ltsep_poder.setIs_docName(ls_salidaActualizacionPoder.getIs_docName());
			CL_LOGGER.info(EnumMensajesLog.ACTUALIZACION_METADATOS_PODER.getIs_criterio() +"-"+ ltsep_poder.getIs_codigoMensaje());
			return ltsep_poder;
		}

		for(ObservacionPoderDTO lop_observacionPoderDto :ap_poder.getIlop_observaciones()) {
			if(lop_observacionPoderDto.getIs_did() == null)
			{
				lop_observacionPoderDto.setIa_archivoDto(new ArchivoDTO());
				lop_observacionPoderDto.getIa_archivoDto().setIs_nombreArchivo(ap_poder.getIs_dDocName());
				lop_observacionPoderDto.setIs_did(ap_poder.getIs_did());
			}
		}
		lteep_poder = PoderesConverter.dtoAWsDto(ap_poder);
		lteep_poder.setIs_did(ap_poder.getIs_did());
		lteep_poder.setIs_dDocName(ap_poder.getIs_dDocName());
		lteep_poder.setIs_sistemaOrigen(EnumCriterio.CANAL_ORIGEN.getIs_criterio());
		ltsep_poder = iipb_poderBusinessWS.enviarPoder(lteep_poder);
		CL_LOGGER.info(EnumMensajesLog.ENVIO_PODER.getIs_criterio() +"-"+ ltsep_poder.getIs_codigoMensaje());
		return ltsep_poder;
	}

	@Override
	public PoderDTO consultarPoder(ParametroConsultaPoderWSDTO apcp_parametroConsultarPoder) throws ParseException {
		TipoEntradaConsultaPoderWSDTO ltecp_tipoEntradaConsultaPoder = new TipoEntradaConsultaPoderWSDTO();
		ltecp_tipoEntradaConsultaPoder.setIs_sistemaOrigen(EnumCriterio.CANAL_ORIGEN.getIs_criterio());
		List<ParametroConsultaPoderWSDTO> llpcp_listaParametroConsultaPoderWsdto = new ArrayList<>();
		llpcp_listaParametroConsultaPoderWsdto.add(apcp_parametroConsultarPoder);
		ltecp_tipoEntradaConsultaPoder.setIlpcp_listaParametroConsultaPoderWsdto(llpcp_listaParametroConsultaPoderWsdto);
		TipoSalidaConsultaPoderWSDTO ltscp_poder = iipb_poderBusinessWS.consultarPoder(ltecp_tipoEntradaConsultaPoder);

		PoderDTO lp_poder = PoderesConverter.wsdtoToDto(ltscp_poder);
		return lp_poder;
	}

	@Override
	public TipoEntradaActualizarMetadatosPoderWSDTO consultarPoder(String as_did, String as_idDocName) {
		TipoSalidaConsultaPoderWSDTO ltscp_salidaConsultarPoder = iipb_poderBusinessWS.consultarPoder(as_did, as_idDocName);
		TipoEntradaActualizarMetadatosPoderWSDTO lteamp_actualizarMetadataPoder = PoderesConverter.wsDtoConsultaSalidaAWsDtoEntradaActualizarMetadatos(ltscp_salidaConsultarPoder);
		return lteamp_actualizarMetadataPoder;
	}

	@Override
	public void notificarActualizacionNotariaOrigen(ActualizacionPoderCorreoDTO aapc_actualizacionPoderCorreo) {

		if (aapc_actualizacionPoderCorreo.getIs_tipoSolicitud().equals(EnumTiposSolicitudesPoderes.NOTIFICACION.getIs_nombre())) {
			PlantillaCorreoInstanciaDTO lpci_plantillaCorreoInstancia = generarPlantillaSolicitudInterna(aapc_actualizacionPoderCorreo);

			Boolean lb_estadoEnvioCorreo = iiec_envioCorreo.enviarCorreo(lpci_plantillaCorreoInstancia);

			if (lb_estadoEnvioCorreo) {
				CL_LOGGER.info(EnumMensajesLog.ENVIO_CORREO_EXITOSO.getIs_criterio());
			}else {
				CL_LOGGER.info(EnumMensajesLog.ENVIO_CORREO_NO_EXITOSO.getIs_criterio());
			}

		}

	}


	/**
	 * Metodo que permite generar una plantilla de correo para solicitudes internas
	 * @param aspp_solicitudPoder solciitud interna
	 * @return PlantillaCorreoInstanciaDTO
	 */
	private PlantillaCorreoInstanciaDTO generarPlantillaSolicitudInterna(ActualizacionPoderCorreoDTO aapc_actualizacionPoder) {

		PlantillaCorreoInstanciaDTO lpci_plantilla = null;
		String ls_servidor = UtilidadSeguridad.consultarUrlServidor();

		lpci_plantilla = iiec_envioCorreo.crearPlantillaCorreo(EnumPlantillasCorreo.ACTUALIZACION_PODER);	

		lpci_plantilla
		.addAsunto(EnumParametrosSolicitudesInternas.TIPO_SOLICITUD.getIs_parametro(), aapc_actualizacionPoder.getIs_tipoSolicitud())

		.addMensaje(EnumParametrosSolicitudesInternas.SERVIDOR.getIs_parametro(), ls_servidor)
		.addMensaje(EnumParametrosSolicitudesInternas.NOTARIA_SOLICITANTE.getIs_parametro(), aapc_actualizacionPoder.getIs_nombreOrigen())
		.addMensaje(EnumParametrosSolicitudesInternas.NOMBRE_USUARIO.getIs_parametro(),aapc_actualizacionPoder.getIs_nombreDestino())
		.addMensaje(EnumParametrosSolicitudesInternas.INDENTIFICADOR_SOLICITUD_INTERNA.getIs_parametro(),aapc_actualizacionPoder.getIs_identificacionTipoSolicitud())
		.addMensaje(EnumParametrosSolicitudesInternas.OBSERVACIONES.getIs_parametro(), aapc_actualizacionPoder.getIs_observaciones())
		.addMensaje(EnumParametrosSolicitudesInternas.TIPO_SOLICITUD.getIs_parametro(), aapc_actualizacionPoder.getIs_tipoSolicitud());	

		lpci_plantilla.setIs_destino(aapc_actualizacionPoder.getIs_correoDestino());

		lpci_plantilla.generarCorreo();

		return lpci_plantilla;
	}

	public byte[] consultaArchivoPoder(String as_idPoder, String as_nombre) {

		//Dato de prueba null
		if (as_idPoder == null || as_idPoder.isEmpty() || "123".equals(as_idPoder)) {
			return null;
		}else {

			TipoEntradaObtenerPoderWSDTO ateamp_tipoEntradaActualizarMetadatosPoder = new TipoEntradaObtenerPoderWSDTO();
			ateamp_tipoEntradaActualizarMetadatosPoder.setIs_dDocName(as_nombre);
			ateamp_tipoEntradaActualizarMetadatosPoder.setIs_did(as_idPoder);
			TipoSalidaObtenerPoderWSDTO ltsop_tipoSalidaObtenerPoder = iipb_poderBusinessWS.obtenerPoder(ateamp_tipoEntradaActualizarMetadatosPoder);
			if(ltsop_tipoSalidaObtenerPoder != null)
				return ltsop_tipoSalidaObtenerPoder.getIb_archivo();
			return null;
		}		
	}

	@Override
	public PoderDTO consultaPoder(String as_idPoder, String as_nombre) {

		//Dato de prueba null
		if (as_idPoder == null || as_idPoder.isEmpty()) {
			return null;
		}else {

			ParametroConsultaPoderWSDTO lpcp_parametroConsultaPoder = new ParametroConsultaPoderWSDTO();
			lpcp_parametroConsultaPoder.setIs_did(as_idPoder);
			lpcp_parametroConsultaPoder.setIs_dDocName(as_nombre);
			List<PoderDTO> llp_listaPoderesDto = consultarPoderes(lpcp_parametroConsultaPoder);
			if(!llp_listaPoderesDto.isEmpty())
				return llp_listaPoderesDto.iterator().next();
			return null;
		}		
	}

	@Override
	public List<PoderDTO> consultarPoderes(ParametroConsultaPoderWSDTO apcp_parametroConsultarPoderWsDto){
		TipoEntradaConsultaPoderWSDTO ltecp_tipoEntradaConsultaPoder = new TipoEntradaConsultaPoderWSDTO();
		ltecp_tipoEntradaConsultaPoder.setIs_sistemaOrigen(EnumCriterio.CANAL_ORIGEN.getIs_criterio());
		List<ParametroConsultaPoderWSDTO> llpcp_listaParametroConsultaPoderWsdto = new ArrayList<>();
		llpcp_listaParametroConsultaPoderWsdto.add(apcp_parametroConsultarPoderWsDto);
		ltecp_tipoEntradaConsultaPoder.setIlpcp_listaParametroConsultaPoderWsdto(llpcp_listaParametroConsultaPoderWsdto);
		TipoSalidaConsultaPoderWSDTO ltscp_tipoSalidaConsultaPoderWsDto = iipb_poderBusinessWS.consultarPoder(ltecp_tipoEntradaConsultaPoder);

		if(ltscp_tipoSalidaConsultaPoderWsDto.getIldcp_listaDocumentoConsultaPoderWsdto().isEmpty())
			throw new ExcepcionesNegocio(EnumExcepcionesServicios.PROBLEMA_RESPUESTA_NULA);
		List<PoderDTO> llp_listaPoderesDto = new ArrayList<>();
		for(DocumentoConsultaPoderWSDTO ldcp_documetnoConsultaPoder: ltscp_tipoSalidaConsultaPoderWsDto.getIldcp_listaDocumentoConsultaPoderWsdto()) {
			llp_listaPoderesDto.add(PoderesConverter.wsdtoToDto(ldcp_documetnoConsultaPoder));
		}
		return llp_listaPoderesDto;
	}

}

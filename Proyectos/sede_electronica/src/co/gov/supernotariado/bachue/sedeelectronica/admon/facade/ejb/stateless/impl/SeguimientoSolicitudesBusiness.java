/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: SeguimientoSolicitudesBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl
 * Nombre del elemento: SeguimientoSolicitudesBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ISeguimientoSolicitudesBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.SeguimientoSolicitudesDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.SeguimientoSolicitudesRespuestaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.SeguimientoSolicitudesRespuestaDetalleDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.SeguimientoSolicitudesRespuestaMatriculasDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IInterfazTrazabilidadBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.DocumentoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.ElementoNirWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.MatriculaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaTrazabilidadTramiteRegistroNodoCentralWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaTrazabilidadTramiteRegistroNodoCentralWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TrazabilidadEntradaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TrazabilidadSalidaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TrazabilidadWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumPais;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadExcepciones;

/**
 * Clase tipo EJB (Enterprise Java Bean) de la capa de negocio. <br>
 * Contiene la implementacion logica de las operaciones del recurso Seguimiento
 * solicitudes. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless(name = "SeguimientoSolicitudesBusiness", mappedName = "SeguimientoSolicitudesBusiness")
@LocalBean
public class SeguimientoSolicitudesBusiness implements ISeguimientoSolicitudesBusiness {

	/**
	 * Atributo de instancia tipo IInterfazTrazabilidadBusiness para definir la
	 * propiedad interfaz trazabilidad business.
	 */
	@EJB
	private IInterfazTrazabilidadBusiness iiif_interfazTrazabilidadBusiness;

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ISeguimientoSolicitudesBusiness#cargarListaConsultas(co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TrazabilidadEntradaWSDTO)
	 */
	@Override
	public SeguimientoSolicitudesDTO cargarListaConsultas(TrazabilidadEntradaWSDTO ate_trazabilidadEntradaWsDto) {
		TrazabilidadSalidaWSDTO lts_trazabilidadSalida = iiif_interfazTrazabilidadBusiness
				.consultarTrazabilidad(ate_trazabilidadEntradaWsDto);
		UtilidadExcepciones.manejadorExcepcionesServicios(lts_trazabilidadSalida);
		List<SeguimientoSolicitudesRespuestaDTO> llssr_listaSeguimientoSolicitudesRespuestaDto = new ArrayList<>();

		for (ElementoNirWSDTO len_elementoNirWsDto : lts_trazabilidadSalida.getIlen_elementosnir()) {
			SeguimientoSolicitudesRespuestaDTO lssr_seguimientoSolicitudesRespuestaDto = new SeguimientoSolicitudesRespuestaDTO();
			lssr_seguimientoSolicitudesRespuestaDto
					.setIs_decisionCalificacion(len_elementoNirWsDto.getIs_decisionCalificacion());
			lssr_seguimientoSolicitudesRespuestaDto.setIs_faseActualTurno(len_elementoNirWsDto.getIs_faseActualTurno());
			lssr_seguimientoSolicitudesRespuestaDto.setIs_nir(lts_trazabilidadSalida.getIs_nir());
			lssr_seguimientoSolicitudesRespuestaDto.setIs_numeroTurno(len_elementoNirWsDto.getIs_turno());
			lssr_seguimientoSolicitudesRespuestaDto.setIs_procesoTurno(len_elementoNirWsDto.getIs_procesoTurno());
			llssr_listaSeguimientoSolicitudesRespuestaDto.add(lssr_seguimientoSolicitudesRespuestaDto);

			for (DocumentoWSDTO ld_documentoWsdto : len_elementoNirWsDto.getIld_documentos()) {
				lssr_seguimientoSolicitudesRespuestaDto.setIs_tipo(ld_documentoWsdto.getIs_tipo());
				lssr_seguimientoSolicitudesRespuestaDto
						.setIs_numeroDocumento(ld_documentoWsdto.getIs_numeroDocumento());
				lssr_seguimientoSolicitudesRespuestaDto.setIs_fechaDocumento(ld_documentoWsdto.getIs_fechaDocumento());
				lssr_seguimientoSolicitudesRespuestaDto.setIs_oficinaRegistro(ld_documentoWsdto.getIs_oficinaOrigen());
				lssr_seguimientoSolicitudesRespuestaDto.setIs_tipoOficina(ld_documentoWsdto.getIs_tipoOficina());
				lssr_seguimientoSolicitudesRespuestaDto.setIs_pais(EnumPais.PAIS_COLOMBIA_POR_DEFECTO.getIs_codigo());
				lssr_seguimientoSolicitudesRespuestaDto.setIs_departamento(ld_documentoWsdto.getIs_departamento());
				lssr_seguimientoSolicitudesRespuestaDto.setIs_municipio(ld_documentoWsdto.getIs_municipio());
				lssr_seguimientoSolicitudesRespuestaDto.setIs_tipoEntidad(ld_documentoWsdto.getIs_tipoEntidad());
			}
			List<SeguimientoSolicitudesRespuestaMatriculasDTO> llssrm_listaSeguimientoSolicitudesRespuestaMatriculaDto = new ArrayList<>();
			for (MatriculaWSDTO lm_matriculaWsDto : len_elementoNirWsDto.getIlm_matriculas()) {
				SeguimientoSolicitudesRespuestaMatriculasDTO lssrm_seguimientoSolicitudesRespuestaMatriculasDto = new SeguimientoSolicitudesRespuestaMatriculasDTO();
				lssrm_seguimientoSolicitudesRespuestaMatriculasDto
						.setIs_circuloRegistral(lm_matriculaWsDto.getIs_orip());
				lssrm_seguimientoSolicitudesRespuestaMatriculasDto
						.setIs_matriculaNumero(lm_matriculaWsDto.getIs_numeroMatricula());
				lssrm_seguimientoSolicitudesRespuestaMatriculasDto.setIs_estado(lm_matriculaWsDto.getIs_estado());
				lssrm_seguimientoSolicitudesRespuestaMatriculasDto
						.setIs_alertasVigentes(lm_matriculaWsDto.getIs_alertaVigente());
				llssrm_listaSeguimientoSolicitudesRespuestaMatriculaDto
						.add(lssrm_seguimientoSolicitudesRespuestaMatriculasDto);
			}
			lssr_seguimientoSolicitudesRespuestaDto.setIlssrm_listaSeguimientoSolicitudesRespuestaMatriculasDto(
					llssrm_listaSeguimientoSolicitudesRespuestaMatriculaDto);
			List<SeguimientoSolicitudesRespuestaDetalleDTO> llssrd_listaSeguimientoSolicitudesRespuestaDetalleDto = new ArrayList<>();
			for (TrazabilidadWSDTO lt_trazabilidadWsDto : len_elementoNirWsDto.getIlt_trazabilidades()) {
				SeguimientoSolicitudesRespuestaDetalleDTO lssrd_seguimientoSolicitudesRespuestaDetalleDto = new SeguimientoSolicitudesRespuestaDetalleDTO();
				lssrd_seguimientoSolicitudesRespuestaDetalleDto.setIs_numeroTurno(len_elementoNirWsDto.getIs_turno());
				lssrd_seguimientoSolicitudesRespuestaDetalleDto
						.setIs_oficinaRegistro(len_elementoNirWsDto.getIs_orip());
				lssrd_seguimientoSolicitudesRespuestaDetalleDto.setIs_etapa(lt_trazabilidadWsDto.getIs_etapa());
				lssrd_seguimientoSolicitudesRespuestaDetalleDto
						.setIs_nombreEtapa(lt_trazabilidadWsDto.getIs_nombreEtapa());
				lssrd_seguimientoSolicitudesRespuestaDetalleDto
						.setIs_estadoActividad(lt_trazabilidadWsDto.getIs_estadoActividad());
				lssrd_seguimientoSolicitudesRespuestaDetalleDto.setIs_usuario(lt_trazabilidadWsDto.getIs_usuario());
				lssrd_seguimientoSolicitudesRespuestaDetalleDto
						.setIs_fechaAsignacion(lt_trazabilidadWsDto.getId_fechaAsignacion());
				lssrd_seguimientoSolicitudesRespuestaDetalleDto
						.setIs_fechaReparto(lt_trazabilidadWsDto.getId_fechaReparto());
				lssrd_seguimientoSolicitudesRespuestaDetalleDto
						.setIs_fechaInicioEtapa(lt_trazabilidadWsDto.getId_fechaInicioEtapa());
				lssrd_seguimientoSolicitudesRespuestaDetalleDto
						.setIs_fechaFinalEtapa(lt_trazabilidadWsDto.getId_fechaFinalEtapa());
				llssrd_listaSeguimientoSolicitudesRespuestaDetalleDto
						.add(lssrd_seguimientoSolicitudesRespuestaDetalleDto);
			}
			lssr_seguimientoSolicitudesRespuestaDto.setIlssrd_listaSeguimientoSolicitudesRespuestaDetalleDto(
					llssrd_listaSeguimientoSolicitudesRespuestaDetalleDto);
		}
		SeguimientoSolicitudesDTO lss_seguimientoSolicitudesDto = new SeguimientoSolicitudesDTO();
		lss_seguimientoSolicitudesDto
				.setIlssr_listaSeguimientoSolicitudesRespuestaDto(llssr_listaSeguimientoSolicitudesRespuestaDto);
		lss_seguimientoSolicitudesDto.setIs_nir(lts_trazabilidadSalida.getIs_nir());
		lss_seguimientoSolicitudesDto.setIs_faseActualNIR(lts_trazabilidadSalida.getIs_faseActualNIR());
		lss_seguimientoSolicitudesDto.setIs_nirVinculado(lts_trazabilidadSalida.getIs_nirVinculado());
		lss_seguimientoSolicitudesDto.setIs_tramiteVinculado(lts_trazabilidadSalida.getIs_tramiteVinculado());
		return lss_seguimientoSolicitudesDto;

	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ISeguimientoSolicitudesBusiness#consultasNoc(java.lang.String, java.lang.String)
	 */
	@Override
	public TipoSalidaTrazabilidadTramiteRegistroNodoCentralWSDTO consultasNoc(String as_codigoRegistral,
			String as_radicado) {
		TipoEntradaTrazabilidadTramiteRegistroNodoCentralWSDTO ltettrnc_tipoEntradaTrazabilidadTramiteRegistroNodoCentralWsDto = new TipoEntradaTrazabilidadTramiteRegistroNodoCentralWSDTO();
		ltettrnc_tipoEntradaTrazabilidadTramiteRegistroNodoCentralWsDto.setIs_codCirculoRegisral(as_codigoRegistral);
		ltettrnc_tipoEntradaTrazabilidadTramiteRegistroNodoCentralWsDto.setIs_radicacion(as_radicado);
		TipoSalidaTrazabilidadTramiteRegistroNodoCentralWSDTO ltsttrnc_tramiteNodoCentralWsDto;
		ltsttrnc_tramiteNodoCentralWsDto = iiif_interfazTrazabilidadBusiness
				.consultarTrazabilidadNoc(ltettrnc_tipoEntradaTrazabilidadTramiteRegistroNodoCentralWsDto);
		return ltsttrnc_tramiteNodoCentralWsDto;
	}

}

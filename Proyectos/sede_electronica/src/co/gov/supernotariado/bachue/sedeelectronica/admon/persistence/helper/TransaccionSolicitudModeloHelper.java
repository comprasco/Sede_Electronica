/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: TransaccionSolicitudModeloHelper.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper
 * Nombre del elemento: TransaccionSolicitudModeloHelper
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionSolicitudModeloDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.TipoProceso;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.TransaccionSolicitudModelo;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Usuario;

/**
 * Clase auxiliar(helper) que permite transformar objetos de DTO(Data Transfer
 * Object) a Entidades de persistencia y viceversa. <br>
 * Contiene operaciones de transformacion para el DTO y la entidad Transaccion
 * solicitud modelo. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TransaccionSolicitudModeloHelper {
	// --- to DTO

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * TransaccionSolicitudModeloHelper.
	 */
	private TransaccionSolicitudModeloHelper() {
		super();
	}

	/**
	 * Metodo que convierte de entidad a dto.
	 *
	 * @param atsm_transaccionSolicitudCarguePoder el parametro transaccion
	 *                                             solicitud cargue poder
	 * @return Resultado para entidad A dto simple retornado como
	 *         TransaccionSolicitudModeloDTO
	 */
	public static TransaccionSolicitudModeloDTO entidadADtoSimple(
			TransaccionSolicitudModelo atsm_transaccionSolicitudCarguePoder) {

		TransaccionSolicitudModeloDTO ltsm_dto = new TransaccionSolicitudModeloDTO();
		ltsm_dto.setIs_id(atsm_transaccionSolicitudCarguePoder.getId());
		ltsm_dto.setIs_nir(atsm_transaccionSolicitudCarguePoder.getNir());
		ltsm_dto.setIs_estadoTransaccion(atsm_transaccionSolicitudCarguePoder.getEstadoTransaccion());
		ltsm_dto.setIs_modeloTransaccionVigente(atsm_transaccionSolicitudCarguePoder.getModeloTransaccionVigente());
		ltsm_dto.setIs_idUsuarioCreacion(atsm_transaccionSolicitudCarguePoder.getIdUsuarioCreacion());
		ltsm_dto.setIs_idUsuarioModificacion(atsm_transaccionSolicitudCarguePoder.getIdUsuarioModificacion());
		ltsm_dto.setIs_ipCreacion(atsm_transaccionSolicitudCarguePoder.getIpCreacion());
		ltsm_dto.setIs_ipModificacion(atsm_transaccionSolicitudCarguePoder.getIpModificacion());
		ltsm_dto.setIs_estereotipoCreacion(atsm_transaccionSolicitudCarguePoder.getEstereotipoCreacion());
		ltsm_dto.setIs_estereotipoModificacion(atsm_transaccionSolicitudCarguePoder.getEstereotipoModificacion());
		ltsm_dto.setId_fechaCreacion(atsm_transaccionSolicitudCarguePoder.getFechaCreacion());
		ltsm_dto.setId_fechaModificacion(atsm_transaccionSolicitudCarguePoder.getFechaModificacion());
		return ltsm_dto;
	}

	/**
	 * Metodo que convierte de entidad a dto utilizando todos los datos incluyendo
	 * relaciones.
	 *
	 * @param atsm_entidad el parametro entidad
	 * @return Resultado para entidad A dto completo retornado como
	 *         TransaccionSolicitudModeloDTO
	 */
	public static TransaccionSolicitudModeloDTO entidadADtoCompleto(TransaccionSolicitudModelo atsm_entidad) {
		TransaccionSolicitudModeloDTO ltsm_dto = entidadADtoSimple(atsm_entidad);
		if (atsm_entidad.getIdUsuario() != null)
			ltsm_dto.setIu_idUsuario(UsuarioHelper.entidadADtoPersonaConDireccion(atsm_entidad.getIdUsuario()));
		if (atsm_entidad.getTipoProceso() != null)
			ltsm_dto.setItp_tipoProcesoDto(TipoProcesoHelper.entidadADtoSimple(atsm_entidad.getTipoProceso()));
		return ltsm_dto;
	}

	/**
	 * Metodo que convierte de entidad a dto utilizando todos los datos incluyendo
	 * relaciones.
	 *
	 * @param atsm_entidad el parametro entidad
	 * @return Resultado para entidad A dto usuario completo retornado como
	 *         TransaccionSolicitudModeloDTO
	 */
	public static TransaccionSolicitudModeloDTO entidadADtoUsuarioCompleto(TransaccionSolicitudModelo atsm_entidad) {
		TransaccionSolicitudModeloDTO ltsm_dto = entidadADtoSimple(atsm_entidad);
		if (atsm_entidad.getIdUsuario() != null)
			ltsm_dto.setIu_idUsuario(UsuarioHelper.entidadADtoCompleto(atsm_entidad.getIdUsuario()));
		if (atsm_entidad.getTipoProceso() != null)
			ltsm_dto.setItp_tipoProcesoDto(TipoProcesoHelper.entidadADtoSimple(atsm_entidad.getTipoProceso()));
		return ltsm_dto;
	}

	/**
	 * Metodo que convierte de una lista de entidades a una lista de dto.
	 *
	 * @param altsm_listaEntidades el parametro lista entidades
	 * @return Resultado para lista entidad A dto simple retornado como una lista de
	 *         TransaccionSolicitudModeloDTO
	 */
	public static List<TransaccionSolicitudModeloDTO> listaEntidadADtoSimple(
			List<TransaccionSolicitudModelo> altsm_listaEntidades) {
		List<TransaccionSolicitudModeloDTO> lltsm_listaDto = new ArrayList<>();
		for (TransaccionSolicitudModelo ltsm_entidad : altsm_listaEntidades) {
			lltsm_listaDto.add(entidadADtoSimple(ltsm_entidad));
		}
		return lltsm_listaDto;
	}

	/**
	 * Metodo que convierte de una lista de entidades a una lista de dto usando
	 * todos los datos.
	 *
	 * @param altsm_listaEntidades el parametro lista entidades
	 * @return Resultado para lista entidad A dto completo retornado como una lista
	 *         de TransaccionSolicitudModeloDTO
	 */
	public static List<TransaccionSolicitudModeloDTO> listaEntidadADtoCompleto(
			List<TransaccionSolicitudModelo> altsm_listaEntidades) {
		List<TransaccionSolicitudModeloDTO> lltsm_listaDto = new ArrayList<>();
		for (TransaccionSolicitudModelo ltsm_entidad : altsm_listaEntidades) {
			lltsm_listaDto.add(entidadADtoCompleto(ltsm_entidad));
		}
		return lltsm_listaDto;
	}

	// --- fin to DTO
	// --- to Entidad

	/**
	 * Metodo que convierte un dto a una entidad.
	 *
	 * @param atsm_dto     el parametro dto
	 * @param atsm_entidad el parametro entidad
	 * @return Resultado para dto A entidad simple retornado como
	 *         TransaccionSolicitudModelo
	 */
	public static TransaccionSolicitudModelo dtoAEntidadSimple(TransaccionSolicitudModeloDTO atsm_dto,
			TransaccionSolicitudModelo atsm_entidad) {
		if (null == atsm_entidad) {
			atsm_entidad = new TransaccionSolicitudModelo();
		}
		atsm_entidad.setId(atsm_dto.getIs_id());
		atsm_entidad.setNir(atsm_dto.getIs_nir());
		atsm_entidad.setModeloTransaccionVigente(atsm_dto.getIs_modeloTransaccionVigente());
		atsm_entidad.setEstadoTransaccion(atsm_dto.getIs_estadoTransaccion());
		atsm_entidad.setFechaCreacion(atsm_dto.getId_fechaCreacion());
		atsm_entidad.setFechaModificacion(atsm_dto.getId_fechaModificacion());
		atsm_entidad.setIdUsuarioCreacion(atsm_dto.getIs_idUsuarioCreacion());
		atsm_entidad.setIdUsuarioModificacion(atsm_dto.getIs_idUsuarioModificacion());
		atsm_entidad.setIpCreacion(atsm_dto.getIs_ipCreacion());
		atsm_entidad.setIpModificacion(atsm_dto.getIs_ipModificacion());
		atsm_entidad.setEstereotipoCreacion(atsm_dto.getIs_estereotipoCreacion());
		atsm_entidad.setEstereotipoModificacion(atsm_dto.getIs_estereotipoModificacion());
		return atsm_entidad;
	}

	/**
	 * Metodo que convierte un dto a una entidad incluyendo relaciones.
	 *
	 * @param atsm_dto     el parametro dto
	 * @param atsm_entidad el parametro entidad
	 * @return Resultado para dto A entidad completo retornado como
	 *         TransaccionSolicitudModelo
	 */
	public static TransaccionSolicitudModelo dtoAEntidadCompleto(TransaccionSolicitudModeloDTO atsm_dto,
			TransaccionSolicitudModelo atsm_entidad) {
		atsm_entidad = dtoAEntidadSimple(atsm_dto, atsm_entidad);
		if (atsm_dto.getIu_idUsuario() != null) {
			Usuario lu_usuario = UsuarioHelper.dtoAEntidadCompleto(atsm_dto.getIu_idUsuario(), new Usuario());
			atsm_entidad.setIdUsuario(lu_usuario);
		}
		if (atsm_dto.getItp_tipoProcesoDto() != null) {
			TipoProceso ltp_tipoProceso = TipoProcesoHelper.dtoAEntidadCompleto(atsm_dto.getItp_tipoProcesoDto(),
					new TipoProceso());
			atsm_entidad.setTipoProceso(ltp_tipoProceso);
		}
		return atsm_entidad;
	}

	/**
	 * Metodo que convierte una lista dto a una lista de entidades.
	 *
	 * @param altsm_listaDto el parametro lista dto
	 * @return Resultado para lista dto A entidad simple retornado como una lista de
	 *         TransaccionSolicitudModelo
	 */
	public static List<TransaccionSolicitudModelo> listaDtoAEntidadSimple(
			List<TransaccionSolicitudModeloDTO> altsm_listaDto) {
		List<TransaccionSolicitudModelo> lltsm_listaEntidades = new ArrayList<>();
		for (TransaccionSolicitudModeloDTO ltsm_dto : altsm_listaDto) {
			lltsm_listaEntidades.add(dtoAEntidadSimple(ltsm_dto, null));
		}
		return lltsm_listaEntidades;
	}

	/**
	 * Metodo que convierte una lista dto a una lista de entidades usando todos los
	 * datos.
	 *
	 * @param altsm_listaDto el parametro lista dto
	 * @return Resultado para lista dto A entidad completo retornado como una lista
	 *         de TransaccionSolicitudModelo
	 */
	public static List<TransaccionSolicitudModelo> listaDtoAEntidadCompleto(
			List<TransaccionSolicitudModeloDTO> altsm_listaDto) {
		List<TransaccionSolicitudModelo> lltsm_listaEntidades = new ArrayList<>();
		for (TransaccionSolicitudModeloDTO ltsm_dto : altsm_listaDto) {
			lltsm_listaEntidades.add(dtoAEntidadCompleto(ltsm_dto, null));
		}
		return lltsm_listaEntidades;
	}
	// --- fin to Entidad

}

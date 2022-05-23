/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: TransaccionFormularioHelper.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper
 * Nombre del elemento: TransaccionFormularioHelper
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionFormularioDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.FormularioUsuario;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.TransaccionFormulario;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Usuario;

/**
 * Clase auxiliar(helper) que permite transformar objetos de DTO(Data Transfer
 * Object) a Entidades de persistencia y viceversa. <br>
 * Contiene operaciones de transformacion para el DTO y la entidad Transaccion
 * formulario. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TransaccionFormularioHelper {
	// --- to DTO

	/**
	 * Construye una nueva instancia/objeto de la clase TransaccionFormularioHelper.
	 */
	private TransaccionFormularioHelper() {
		super();
	}

	/**
	 * Metodo que convierte de entidad a dto.
	 *
	 * @param atf_transaccionFormulario el parametro transaccion formulario
	 * @return Resultado para entidad A dto simple retornado como
	 *         TransaccionFormularioDTO
	 */
	public static TransaccionFormularioDTO entidadADtoSimple(TransaccionFormulario atf_transaccionFormulario) {
		TransaccionFormularioDTO ltf_dto = new TransaccionFormularioDTO();
		if (atf_transaccionFormulario == null)
			return ltf_dto;
		ltf_dto.setIs_id(atf_transaccionFormulario.getId());
		ltf_dto.setIs_nir(atf_transaccionFormulario.getNir());
		ltf_dto.setIs_estadoTransaccion(atf_transaccionFormulario.getEstadoTransaccion());
		ltf_dto.setIs_idUsuarioCreacion(atf_transaccionFormulario.getIdUsuarioCreacion());
		ltf_dto.setIs_idUsuarioModificacion(atf_transaccionFormulario.getIdUsuarioModificacion());
		ltf_dto.setIs_ipCreacion(atf_transaccionFormulario.getIpCreacion());
		ltf_dto.setIs_ipModificacion(atf_transaccionFormulario.getIpModificacion());
		ltf_dto.setIs_estereotipoCreacion(atf_transaccionFormulario.getEstereotipoCreacion());
		ltf_dto.setIs_estereotipoModificacion(atf_transaccionFormulario.getEstereotipoModificacion());
		ltf_dto.setId_fechaCreacion(atf_transaccionFormulario.getFechaCreacion());
		ltf_dto.setId_fechaModificacion(atf_transaccionFormulario.getFechaModificacion());
		ltf_dto.setIi_cantidadIntentos(atf_transaccionFormulario.getIntentosVerificacionFallida());
		ltf_dto.setIs_hashCodigoVerificacion(atf_transaccionFormulario.getHashCodigoVerificacion());
		return ltf_dto;
	}

	/**
	 * Metodo que convierte de entidad a dto utilizando todos los datos incluyendo
	 * relaciones.
	 *
	 * @param atf_entidad el parametro entidad
	 * @return Resultado para entidad A dto completo retornado como
	 *         TransaccionFormularioDTO
	 */
	public static TransaccionFormularioDTO entidadADtoCompleto(TransaccionFormulario atf_entidad) {
		TransaccionFormularioDTO ltf_dto = entidadADtoSimple(atf_entidad);
		if (atf_entidad.getIdUsuario() != null)
			ltf_dto.setIu_idUsuario(UsuarioHelper.entidadADtoSimple(atf_entidad.getIdUsuario()));
		if (atf_entidad.getIdFormularioUsuario() != null) {
			ltf_dto.setIfu_idFormularioUsuario(
					FormularioUsuarioHelper.entidadADtoSimple(atf_entidad.getIdFormularioUsuario()));
		}
		return ltf_dto;
	}

	/**
	 * Metodo que convierte de una lista de entidades a una lista de dto.
	 *
	 * @param altf_listaEntidades el parametro lista entidades
	 * @return Resultado para lista entidad A dto simple retornado como una lista de
	 *         TransaccionFormularioDTO
	 */
	public static List<TransaccionFormularioDTO> listaEntidadADtoSimple(
			List<TransaccionFormulario> altf_listaEntidades) {
		List<TransaccionFormularioDTO> lltf_listaDto = new ArrayList<>();
		for (TransaccionFormulario lvcf_entidad : altf_listaEntidades) {
			lltf_listaDto.add(entidadADtoSimple(lvcf_entidad));
		}
		return lltf_listaDto;
	}

	/**
	 * Metodo que convierte de una lista de entidades a una lista de dto usando
	 * todos los datos.
	 *
	 * @param altf_listaEntidades el parametro lista entidades
	 * @return Resultado para lista entidad A dto completo retornado como una lista
	 *         de TransaccionFormularioDTO
	 */
	public static List<TransaccionFormularioDTO> listaEntidadADtoCompleto(
			List<TransaccionFormulario> altf_listaEntidades) {
		List<TransaccionFormularioDTO> lltf_listaDto = new ArrayList<>();
		for (TransaccionFormulario ltscc_entidad : altf_listaEntidades) {
			lltf_listaDto.add(entidadADtoCompleto(ltscc_entidad));
		}
		return lltf_listaDto;
	}

	// --- fin to DTO
	// --- to Entidad

	/**
	 * Metodo que convierte un dto a una entidad.
	 *
	 * @param atf_dto     el parametro dto
	 * @param atf_entidad el parametro entidad
	 * @return Resultado para dto A entidad simple retornado como
	 *         TransaccionFormulario
	 */
	public static TransaccionFormulario dtoAEntidadSimple(TransaccionFormularioDTO atf_dto,
			TransaccionFormulario atf_entidad) {
		if (null == atf_entidad) {
			atf_entidad = new TransaccionFormulario();
		}
		atf_entidad.setId(atf_dto.getIs_id());
		atf_entidad.setNir(atf_dto.getIs_nir());
		atf_entidad.setEstadoTransaccion(atf_dto.getIs_estadoTransaccion());
		atf_entidad.setFechaCreacion(atf_dto.getId_fechaCreacion());
		atf_entidad.setFechaModificacion(atf_dto.getId_fechaModificacion());
		atf_entidad.setIdUsuarioCreacion(atf_dto.getIs_idUsuarioCreacion());
		atf_entidad.setIdUsuarioModificacion(atf_dto.getIs_idUsuarioModificacion());
		atf_entidad.setIpCreacion(atf_dto.getIs_ipCreacion());
		atf_entidad.setIpModificacion(atf_dto.getIs_ipModificacion());
		atf_entidad.setEstereotipoCreacion(atf_dto.getIs_estereotipoCreacion());
		atf_entidad.setEstereotipoModificacion(atf_dto.getIs_estereotipoModificacion());
		atf_entidad.setIntentosVerificacionFallida(atf_dto.getIi_cantidadIntentos());
		atf_entidad.setHashCodigoVerificacion(atf_dto.getIs_hashCodigoVerificacion());
		return atf_entidad;
	}

	/**
	 * Metodo que convierte un dto a una entidad usando todos los datos incluyendo
	 * relaciones.
	 *
	 * @param atf_dto     el parametro dto
	 * @param atf_entidad el parametro entidad
	 * @return Resultado para dto A entidad completo retornado como
	 *         TransaccionFormulario
	 */
	public static TransaccionFormulario dtoAEntidadCompleto(TransaccionFormularioDTO atf_dto,
			TransaccionFormulario atf_entidad) {
		atf_entidad = dtoAEntidadSimple(atf_dto, atf_entidad);
		if (atf_dto.getIu_idUsuario() != null) {
			Usuario lu_usuario = UsuarioHelper.dtoAEntidadCompleto(atf_dto.getIu_idUsuario(), new Usuario());
			atf_entidad.setIdUsuario(lu_usuario);
		}
		if (atf_dto.getIfu_idFormularioUsuario() != null) {
			FormularioUsuario lfu_formularioUsuario = FormularioUsuarioHelper
					.dtoAEntidadCompleto(atf_dto.getIfu_idFormularioUsuario(), new FormularioUsuario());
			atf_entidad.setIdFormularioUsuario(lfu_formularioUsuario);
		}
		return atf_entidad;
	}

	/**
	 * Metodo que convierte una lista dto a una lista de entidades.
	 *
	 * @param altf_listaDto el parametro lista dto
	 * @return Resultado para lista dto A entidad simple retornado como una lista de
	 *         TransaccionFormulario
	 */
	public static List<TransaccionFormulario> listaDtoAEntidadSimple(List<TransaccionFormularioDTO> altf_listaDto) {
		List<TransaccionFormulario> lltf_listaEntidades = new ArrayList<>();
		for (TransaccionFormularioDTO ltf_dto : altf_listaDto) {
			lltf_listaEntidades.add(dtoAEntidadSimple(ltf_dto, null));
		}
		return lltf_listaEntidades;
	}

	/**
	 * Metodo que convierte una lista dto a una lista de entidades usando todos los
	 * datos.
	 *
	 * @param altf_listaDto el parametro lista dto
	 * @return Resultado para lista dto A entidad completo retornado como una lista
	 *         de TransaccionFormulario
	 */
	public static List<TransaccionFormulario> listaDtoAEntidadCompleto(List<TransaccionFormularioDTO> altf_listaDto) {
		List<TransaccionFormulario> lltf_listaEntidades = new ArrayList<>();
		for (TransaccionFormularioDTO ltf_dto : altf_listaDto) {
			lltf_listaEntidades.add(dtoAEntidadCompleto(ltf_dto, null));
		}
		return lltf_listaEntidades;
	}
	// --- fin to Entidad

}

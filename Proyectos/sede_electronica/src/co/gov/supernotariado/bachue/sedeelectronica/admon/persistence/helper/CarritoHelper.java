/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: CarritoHelper.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper
 * Nombre del elemento: CarritoHelper
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CarritoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Carrito;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.TipoProceso;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Usuario;

/**
 * Clase auxiliar(helper) que permite transformar objetos de DTO(Data Transfer
 * Object) a Entidades de persistencia y viceversa. <br>
 * Contiene operaciones de transformacion para el DTO y la entidad Carrito. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class CarritoHelper {

	/**
	 * Construye una nueva instancia/objeto de la clase CarritoHelper.
	 */
	private CarritoHelper() {
		// Constructor vacio de la clase
	}

	// --- to DTO
	/**
	 * Método que convierte de carrito a DTO.
	 *
	 * @param ac_carrito el parametro carrito
	 * @return Resultado para entidad A dto simple retornado como CarritoDTO
	 */
	public static CarritoDTO entidadADtoSimple(Carrito ac_carrito) {
		CarritoDTO lcd_dto = new CarritoDTO();
		lcd_dto.setIs_uuidUrlCarrito(ac_carrito.getUuidUrlCarrito());
		lcd_dto.setIs_id(ac_carrito.getId());
		lcd_dto.setId_fechaCreacion(ac_carrito.getFechaCreacion());
		lcd_dto.setId_fechaModificacion(ac_carrito.getFechaModificacion());
		lcd_dto.setIs_idUsuarioModificacion(ac_carrito.getIdUsuarioModificacion());
		lcd_dto.setIs_ipCreacion(ac_carrito.getIpCreacion());
		lcd_dto.setIs_ipModificacion(ac_carrito.getIpModificacion());
		lcd_dto.setIs_codigoTipoServicio(ac_carrito.getCodigoTipoServicio());
		lcd_dto.setIs_codigoTipoSubServicio(ac_carrito.getCodigoTipoSubServicio());
		lcd_dto.setIs_modo(ac_carrito.getModo());
		lcd_dto.setIs_modeloTransaccionVigente(ac_carrito.getModeloTransaccionVigente());
		lcd_dto.setIs_activo(ac_carrito.getActivo());
		lcd_dto.setIs_idUsuarioCreacion(ac_carrito.getUsuario());
		lcd_dto.setIs_estereotipoCreacion(ac_carrito.getEstereotipoCreacion());
		lcd_dto.setIs_estereotipoModificacion(ac_carrito.getEstereotipoModificacion());
		lcd_dto.setIs_idAsosiacion(ac_carrito.getIdAsosiacion());
		return lcd_dto;
	}

	/**
	 * Método que convierte de carrito a DTO utilizando todos los datos incluyendo
	 * relaciones.
	 *
	 * @param ac_carrito el parametro carrito
	 * @return Resultado para entidad A dto completo retornado como CarritoDTO
	 */
	public static CarritoDTO entidadADtoCompleto(Carrito ac_carrito) {
		CarritoDTO lcd_dto = entidadADtoSimple(ac_carrito);
		if (ac_carrito.getTipoProceso() != null)
			lcd_dto.setItp_tipoProcesoDto(TipoProcesoHelper.entidadADtoSimple(ac_carrito.getTipoProceso()));
		if (ac_carrito.getIdUsuario() != null)
			lcd_dto.setIu_usuarioDto(UsuarioHelper.entidadADtoCompleto(ac_carrito.getIdUsuario()));
		return lcd_dto;
	}

	/**
	 * Método que convierte de una lista de carrito en a una lista de DTO.
	 *
	 * @param alc_listaCarritoes el parametro lista carritoes
	 * @return Resultado para lista entidad A dto simple retornado como una lista de
	 *         CarritoDTO
	 */
	public static List<CarritoDTO> listaEntidadADtoSimple(List<Carrito> alc_listaCarritoes) {
		List<CarritoDTO> llc_listaDto = new ArrayList<>();
		for (Carrito lc_carrito : alc_listaCarritoes) {
			llc_listaDto.add(entidadADtoSimple(lc_carrito));
		}
		return llc_listaDto;
	}

	/**
	 * Método que convierte de una lista de carrito en una lista de DTO usando todos
	 * los datos.
	 *
	 * @param alc_listaCarritoes el parametro lista carritoes
	 * @return Resultado para lista entidad A dto completo retornado como una lista
	 *         de CarritoDTO
	 */
	public static List<CarritoDTO> listaEntidadADtoCompleto(List<Carrito> alc_listaCarritoes) {
		List<CarritoDTO> llc_listaCarritoDto = new ArrayList<>();
		for (Carrito lc_carrito : alc_listaCarritoes) {
			llc_listaCarritoDto.add(entidadADtoCompleto(lc_carrito));
		}
		return llc_listaCarritoDto;
	}

	// --- fin to DTO
	// --- to Carrito
	/**
	 * Método que convierte un DTO a una carrito.
	 *
	 * @param ac_carritoDto el parametro carrito dto
	 * @param ac_carrito    el parametro carrito
	 * @return Resultado para dto A entidad simple retornado como Carrito
	 */
	public static Carrito dtoAEntidadSimple(CarritoDTO ac_carritoDto, Carrito ac_carrito) {
		if (null == ac_carrito) {
			ac_carrito = new Carrito();
		}
		ac_carrito.setId(ac_carritoDto.getIs_id());
		ac_carrito.setModeloTransaccionVigente(ac_carritoDto.getIs_modeloTransaccionVigente());
		ac_carrito.setCodigoTipoServicio(ac_carritoDto.getIs_codigoTipoServicio());
		ac_carrito.setCodigoTipoSubServicio(ac_carritoDto.getIs_codigoTipoSubServicio());
		ac_carrito.setModo(ac_carritoDto.getIs_modo());
		ac_carrito.setActivo(ac_carritoDto.getIs_activo());
		ac_carrito.setFechaCreacion(ac_carritoDto.getId_fechaCreacion());
		ac_carrito.setFechaModificacion(ac_carritoDto.getId_fechaModificacion());
		ac_carrito.setIdUsuarioModificacion(ac_carritoDto.getIs_idUsuarioModificacion());
		ac_carrito.setIpCreacion(ac_carritoDto.getIs_ipCreacion());
		ac_carrito.setIpModificacion(ac_carritoDto.getIs_ipModificacion());
		ac_carrito.setUsuario(ac_carritoDto.getIs_idUsuarioCreacion());
		ac_carrito.setUuidUrlCarrito(ac_carritoDto.getIs_uuidUrlCarrito());
		ac_carrito.setEstereotipoCreacion(ac_carritoDto.getIs_estereotipoCreacion());
		ac_carrito.setEstereotipoModificacion(ac_carritoDto.getIs_estereotipoModificacion());
		ac_carrito.setIdAsosiacion(ac_carritoDto.getIs_idAsosiacion());
		return ac_carrito;
	}

	/**
	 * Método que convierte un DTO a una carrito incluyendo relaciones.
	 *
	 * @param ac_carritoDto el parametro carrito dto
	 * @param ac_carrito    el parametro carrito
	 * @return Resultado para dto A entidad completo retornado como Carrito
	 */
	public static Carrito dtoAEntidadCompleto(CarritoDTO ac_carritoDto, Carrito ac_carrito) {
		ac_carrito = dtoAEntidadSimple(ac_carritoDto, ac_carrito);
		if (ac_carritoDto.getItp_tipoProcesoDto() != null) {
			ac_carrito.setTipoProceso(new TipoProceso());
			ac_carrito.getTipoProceso().setId(ac_carritoDto.getItp_tipoProcesoDto().getIs_id());
		}
		if (ac_carritoDto.getIu_usuarioDto() != null) {
			ac_carrito.setIdUsuario(new Usuario());
			ac_carrito.getIdUsuario().setId(ac_carritoDto.getIu_usuarioDto().getIs_id());
		}
		return ac_carrito;
	}

	/**
	 * Método que convierte una lista DTO a una lista de carrito.
	 *
	 * @param alc_carritoDto el parametro carrito dto
	 * @return Resultado para lista dto A entidad simple retornado como una lista de
	 *         Carrito
	 */
	public static List<Carrito> listaDtoAEntidadSimple(List<CarritoDTO> alc_carritoDto) {
		List<Carrito> lc_listaCarritoes = new ArrayList<>();
		for (CarritoDTO lc_carritoDto : alc_carritoDto) {
			lc_listaCarritoes.add(dtoAEntidadSimple(lc_carritoDto, null));
		}
		return lc_listaCarritoes;
	}

	/**
	 * Método que convierte una lista DTO a una lista de carrito usando todos los
	 * datos.
	 *
	 * @param alc_carritoDto el parametro carrito dto
	 * @return Resultado para lista dto A entidad completo retornado como una lista
	 *         de Carrito
	 */
	public static List<Carrito> listaDtoAEntidadCompleto(List<CarritoDTO> alc_carritoDto) {
		List<Carrito> lc_listaCarritoes = new ArrayList<>();
		for (CarritoDTO lc_carritoDto : alc_carritoDto) {
			lc_listaCarritoes.add(dtoAEntidadCompleto(lc_carritoDto, null));
		}
		return lc_listaCarritoes;
	}
	// --- fin to Carrito
}

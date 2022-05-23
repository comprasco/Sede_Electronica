/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: CarritoTransaccionVigenteHelper.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper
 * Nombre del elemento: CarritoTransaccionVigenteHelper
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CarritoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CarritoTransaccionVigenteDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.GenericoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.SolicitudConsultasDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionCopiasDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionIndividualDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionMasivoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumModoTipoServicio;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoProceso;

/**
 * Clase auxiliar(helper) que permite transformar objetos de DTO(Data Transfer
 * Object) a Entidades de persistencia y viceversa. <br>
 * Contiene operaciones de transformacion para el DTO y la entidad Carrito
 * transaccion vigente. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class CarritoTransaccionVigenteHelper {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * CarritoTransaccionVigenteHelper.
	 */
	private CarritoTransaccionVigenteHelper() {
		// Constructor vacio de la clase
	}

	// --- to CarritoDTO
	/**
	 * Método que convierte de carritoTransaccion a CarritoDto.
	 *
	 * @param actv_carritoTransaccionDto el parametro carrito transaccion dto
	 * @return Resultado para carrito transaccion vigente dto A carrito dto
	 *         retornado como CarritoDTO
	 */
	public static CarritoDTO carritoTransaccionVigenteDtoACarritoDto(
			CarritoTransaccionVigenteDTO actv_carritoTransaccionDto) {
		CarritoDTO lc_carritoDto = new CarritoDTO();
		lc_carritoDto.setIs_id(actv_carritoTransaccionDto.getIs_id());
		lc_carritoDto.setIs_uuidUrlCarrito(actv_carritoTransaccionDto.getIs_uuidUrlCarrito());
		lc_carritoDto.setId_fechaCreacion(actv_carritoTransaccionDto.getId_fechaCreacion());
		lc_carritoDto.setId_fechaModificacion(actv_carritoTransaccionDto.getId_fechaModificacion());
		lc_carritoDto.setIs_idUsuarioModificacion(actv_carritoTransaccionDto.getIs_idUsuarioModificacion());
		lc_carritoDto.setIs_ipCreacion(actv_carritoTransaccionDto.getIs_ipCreacion());
		lc_carritoDto.setIs_ipModificacion(actv_carritoTransaccionDto.getIs_ipModificacion());
		lc_carritoDto.setIs_codigoTipoServicio(actv_carritoTransaccionDto.getIs_codigoTipoServicio());
		lc_carritoDto.setIs_codigoTipoSubServicio(actv_carritoTransaccionDto.getIs_codigoTipoSubServicio());
		lc_carritoDto.setIs_modo(actv_carritoTransaccionDto.getIs_modo());
		lc_carritoDto.setIs_activo(actv_carritoTransaccionDto.getIs_activo());
		lc_carritoDto.setIs_idUsuarioCreacion(actv_carritoTransaccionDto.getIs_idUsuarioCreacion());
		lc_carritoDto.setItp_tipoProcesoDto(actv_carritoTransaccionDto.getItp_tipoProcesoDto());
		lc_carritoDto.setIs_estereotipoCreacion(actv_carritoTransaccionDto.getIs_estereotipoCreacion());
		lc_carritoDto.setIs_estereotipoModificacion(actv_carritoTransaccionDto.getIs_estereotipoModificacion());
		return lc_carritoDto;
	}

	/**
	 * Metodo que convierte de una lista de carritoTransaccioneVigenteDto a una
	 * lista de CarritoDto.
	 *
	 * @param alctv_listaCarritoTransaccionVigenteDto el parametro lista carrito
	 *                                                transaccion vigente dto
	 * @return Resultado para lista carrito transaccion vigente dto A carrito dto
	 *         retornado como una lista de CarritoDTO
	 */
	public static List<CarritoDTO> listaCarritoTransaccionVigenteDtoACarritoDto(
			List<CarritoTransaccionVigenteDTO> alctv_listaCarritoTransaccionVigenteDto) {
		List<CarritoDTO> llc_listaCarritoDto = new ArrayList<>();
		for (CarritoTransaccionVigenteDTO lctv_carritoTransaccionVigenteDto : alctv_listaCarritoTransaccionVigenteDto) {
			llc_listaCarritoDto.add(carritoTransaccionVigenteDtoACarritoDto(lctv_carritoTransaccionVigenteDto));
		}
		return llc_listaCarritoDto;
	}

	// --- fin to CarritoDTO
	// --- to CarritoTransaccionVigenteDto

	/**
	 * Metodo que convierte de CarritoDto a CarritoTransaccionVigenteDto.
	 *
	 * @param ac_carritoDto el parametro carrito dto
	 * @return Resultado para carrito carrito dto A transaccion vigente dto
	 *         retornado como CarritoTransaccionVigenteDTO
	 */
	public static CarritoTransaccionVigenteDTO carritoCarritoDtoATransaccionVigenteDto(CarritoDTO ac_carritoDto) {
		CarritoTransaccionVigenteDTO lctv_carritoTransaccionVigenteDto = new CarritoTransaccionVigenteDTO();
		lctv_carritoTransaccionVigenteDto.setIs_id(ac_carritoDto.getIs_id());
		lctv_carritoTransaccionVigenteDto.setIs_uuidUrlCarrito(ac_carritoDto.getIs_uuidUrlCarrito());
		lctv_carritoTransaccionVigenteDto.setId_fechaCreacion(ac_carritoDto.getId_fechaCreacion());
		lctv_carritoTransaccionVigenteDto.setId_fechaModificacion(ac_carritoDto.getId_fechaModificacion());
		lctv_carritoTransaccionVigenteDto.setIs_idUsuarioModificacion(ac_carritoDto.getIs_idUsuarioModificacion());
		lctv_carritoTransaccionVigenteDto.setIs_ipCreacion(ac_carritoDto.getIs_ipCreacion());
		lctv_carritoTransaccionVigenteDto.setIs_ipModificacion(ac_carritoDto.getIs_ipModificacion());
		lctv_carritoTransaccionVigenteDto.setIs_codigoTipoServicio(ac_carritoDto.getIs_codigoTipoServicio());
		lctv_carritoTransaccionVigenteDto.setIs_codigoTipoSubServicio(ac_carritoDto.getIs_codigoTipoSubServicio());
		lctv_carritoTransaccionVigenteDto.setIs_modo(ac_carritoDto.getIs_modo());

		if (ac_carritoDto.getIs_modo().equals(EnumModoTipoServicio.MASIVO.getIs_codigo())) {
			lctv_carritoTransaccionVigenteDto.setItm_transaccionMasivoDto((TransaccionMasivoDTO) GenericoDTO
					.toObject(ac_carritoDto.getIs_modeloTransaccionVigente(), TransaccionMasivoDTO.class));
			lctv_carritoTransaccionVigenteDto.setIs_nombreSubServicioLegible(lctv_carritoTransaccionVigenteDto
					.getItm_transaccionMasivoDto().getIdc_detalleCatalogoDto().getIc_catalogoDto().getIs_nombre());
		}
		if (ac_carritoDto.getIs_modo().equals(EnumModoTipoServicio.INDIVIDUAL.getIs_codigo())) {
			lctv_carritoTransaccionVigenteDto.setIti_transaccionIndividualDto((TransaccionIndividualDTO) GenericoDTO
					.toObject(ac_carritoDto.getIs_modeloTransaccionVigente(), TransaccionIndividualDTO.class));
			lctv_carritoTransaccionVigenteDto.setIs_nombreSubServicioLegible(lctv_carritoTransaccionVigenteDto
					.getIti_transaccionIndividualDto().getIdc_detalleCatalogoDto().getIc_catalogoDto().getIs_nombre());
		}
		if (ac_carritoDto.getItp_tipoProcesoDto().getIs_codigo().equals(EnumTipoProceso.CONSULTAS.getIs_codigo())) {
			lctv_carritoTransaccionVigenteDto.setIti_transaccionIndividualDto(new TransaccionIndividualDTO());
			lctv_carritoTransaccionVigenteDto.setItm_transaccionMasivoDto(new TransaccionMasivoDTO());
			lctv_carritoTransaccionVigenteDto
					.setIs_modeloTransaccionVigente(ac_carritoDto.getIs_modeloTransaccionVigente());
			lctv_carritoTransaccionVigenteDto.setIsc_solicitudConsultasDto((SolicitudConsultasDTO) GenericoDTO
					.toObject(ac_carritoDto.getIs_modeloTransaccionVigente(), SolicitudConsultasDTO.class));
		}
		if (ac_carritoDto.getItp_tipoProcesoDto().getIs_codigo().equals(EnumTipoProceso.COPIAS.getIs_codigo())) {
			lctv_carritoTransaccionVigenteDto.setIti_transaccionIndividualDto(new TransaccionIndividualDTO());
			lctv_carritoTransaccionVigenteDto.setItm_transaccionMasivoDto(new TransaccionMasivoDTO());
			lctv_carritoTransaccionVigenteDto
					.setIs_modeloTransaccionVigente(ac_carritoDto.getIs_modeloTransaccionVigente());
			lctv_carritoTransaccionVigenteDto.setItc_transaccionCopiasDto((TransaccionCopiasDTO) GenericoDTO
					.toObject(ac_carritoDto.getIs_modeloTransaccionVigente(), TransaccionCopiasDTO.class));
		}
		lctv_carritoTransaccionVigenteDto.setIs_activo(ac_carritoDto.getIs_activo());
		lctv_carritoTransaccionVigenteDto.setIs_idUsuarioCreacion(ac_carritoDto.getIs_idUsuarioCreacion());
		lctv_carritoTransaccionVigenteDto.setItp_tipoProcesoDto(ac_carritoDto.getItp_tipoProcesoDto());
		return lctv_carritoTransaccionVigenteDto;
	}

	/**
	 * Metodo que convierte de una lista de carritoes a una lista de dto usando
	 * todos los datos.
	 *
	 * @param alc_listaCarritoDto el parametro lista carrito dto
	 * @return Resultado para lista carrito dto A carrito transaccion vigente dto
	 *         retornado como una lista de CarritoTransaccionVigenteDTO
	 */
	public static List<CarritoTransaccionVigenteDTO> listaCarritoDtoACarritoTransaccionVigenteDto(
			List<CarritoDTO> alc_listaCarritoDto) {
		List<CarritoTransaccionVigenteDTO> llctv_listaCarritoTransaccionVigenteDto = new ArrayList<>();
		for (CarritoDTO lc_carritoDto : alc_listaCarritoDto) {
			llctv_listaCarritoTransaccionVigenteDto.add(carritoCarritoDtoATransaccionVigenteDto(lc_carritoDto));
		}
		return llctv_listaCarritoTransaccionVigenteDto;
	}
	// --- fin to CarritoTransaccionVigenteDto
}

/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: TransaccionPasarelaHelper.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper
 * Nombre del elemento: TransaccionPasarelaHelper
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionPasarelaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.TransaccionPasarela;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Usuario;

/**
 * Clase auxiliar(helper) que permite transformar objetos de DTO(Data Transfer
 * Object) a Entidades de persistencia y viceversa. <br>
 * Contiene operaciones de transformacion para el DTO y la entidad Transaccion
 * pasarela. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TransaccionPasarelaHelper {

	/**
	 * Construye una nueva instancia/objeto de la clase TransaccionPasarelaHelper.
	 */
	private TransaccionPasarelaHelper() {
		// Constructor vacio de la clase
	}

	/**
	 * Metodo que permite convertir de entidad a dto.
	 *
	 * @param atp_entidad el parametro entidad
	 * @return Resultado para entidad A dto simple retornado como
	 *         TransaccionPasarelaDTO
	 */
	public static TransaccionPasarelaDTO entidadADtoSimple(TransaccionPasarela atp_entidad) {
		TransaccionPasarelaDTO lpt_dto = new TransaccionPasarelaDTO();
		lpt_dto.setIs_id(atp_entidad.getId());
		lpt_dto.setIs_activo(atp_entidad.getActivo());
		lpt_dto.setIs_estereotipoCreacion(atp_entidad.getEstereotipoCreacion());
		lpt_dto.setIs_estereotipoModificacion(atp_entidad.getEstereotipoModificacion());
		lpt_dto.setId_fechaCreacion(atp_entidad.getFechaCreacion());
		lpt_dto.setId_fechaModificacion(atp_entidad.getFechaModificacion());
		lpt_dto.setIs_idUsuarioCreacion(atp_entidad.getIdUsuarioCreacion());
		lpt_dto.setIs_idUsuarioModificacion(atp_entidad.getIdUsuarioModificacion());
		lpt_dto.setIs_ipCreacion(atp_entidad.getIpCreacion());
		lpt_dto.setIs_ipModificacion(atp_entidad.getIpModificacion());
		lpt_dto.setIs_modeloTransaccionVigente(atp_entidad.getModeloTransaccionVigente());
		lpt_dto.setIs_nir(atp_entidad.getNir());
		lpt_dto.setIs_tipoTransaccion(atp_entidad.getTipoTransaccion());
		lpt_dto.setIs_tokenTransaccion(atp_entidad.getTokenTrasaccion());
		lpt_dto.setIs_estadoBachue(atp_entidad.getEstadoBachue());
		lpt_dto.setIs_estadoPasarela(atp_entidad.getEstadoPasarela());
		lpt_dto.setIs_servicio(atp_entidad.getCodigoServicio());
		lpt_dto.setIs_tipoServicio(atp_entidad.getCodigoSubServicio());
		lpt_dto.setIs_referenciaPago(atp_entidad.getReferencia());

		return lpt_dto;
	}

	/**
	 * Metodo que convierte de entidad a dto usando todos los datos incluyendo
	 * relaciones.
	 *
	 * @param atp_entidad el parametro entidad
	 * @return Resultado para entidad A dto completo retornado como
	 *         TransaccionPasarelaDTO
	 */
	public static TransaccionPasarelaDTO entidadADtoCompleto(TransaccionPasarela atp_entidad) {
		TransaccionPasarelaDTO ltp_dto = entidadADtoSimple(atp_entidad);
		if (atp_entidad.getUsuario() != null)
			ltp_dto.setIu_usuario(UsuarioHelper.entidadADtoSimple(atp_entidad.getUsuario()));

		return ltp_dto;
	}

	/**
	 * Metodo que permite convertir de entidad a dto.
	 *
	 * @param altp_listEntidad el parametro list entidad
	 * @return Resultado para listaentidad A dto simple retornado como una lista de
	 *         TransaccionPasarelaDTO
	 */
	public static List<TransaccionPasarelaDTO> listaentidadADtoSimple(List<TransaccionPasarela> altp_listEntidad) {
		List<TransaccionPasarelaDTO> lltp_listDto = new ArrayList<>();
		for (TransaccionPasarela ltp_entidad : altp_listEntidad) {
			lltp_listDto.add(entidadADtoSimple(ltp_entidad));
		}
		return lltp_listDto;
	}

	/**
	 * Metodo que convierte de dto a entidad usando todos los datos incluyendo
	 * relaciones.
	 *
	 * @param altp_listEntidad el parametro list entidad
	 * @return Resultado para listaentidad A dto completo retornado como una lista
	 *         de TransaccionPasarelaDTO
	 */
	public static List<TransaccionPasarelaDTO> listaentidadADtoCompleto(List<TransaccionPasarela> altp_listEntidad) {
		List<TransaccionPasarelaDTO> lltp_listDto = new ArrayList<>();
		for (TransaccionPasarela ltp_entidad : altp_listEntidad) {
			lltp_listDto.add(entidadADtoCompleto(ltp_entidad));
		}
		return lltp_listDto;
	}

	/**
	 * Metodo que permite convertir de dto a entidad.
	 *
	 * @param atp_dto     el parametro dto
	 * @param atp_entidad el parametro entidad
	 * @return Resultado para dto A entidad simple retornado como
	 *         TransaccionPasarela
	 */
	public static TransaccionPasarela dtoAEntidadSimple(TransaccionPasarelaDTO atp_dto,
			TransaccionPasarela atp_entidad) {
		if (null == atp_entidad) {
			atp_entidad = new TransaccionPasarela();
		}
		atp_entidad.setId(atp_dto.getIs_id());
		atp_entidad.setActivo(atp_dto.getIs_activo());
		atp_entidad.setEstereotipoCreacion(atp_dto.getIs_estereotipoCreacion());
		atp_entidad.setEstereotipoModificacion(atp_dto.getIs_estereotipoModificacion());
		atp_entidad.setFechaCreacion(atp_dto.getId_fechaCreacion());
		atp_entidad.setFechaModificacion(atp_dto.getId_fechaModificacion());
		atp_entidad.setIdUsuarioCreacion(atp_dto.getIs_idUsuarioCreacion());
		atp_entidad.setIdUsuarioModificacion(atp_dto.getIs_idUsuarioModificacion());
		atp_entidad.setIpCreacion(atp_dto.getIs_ipCreacion());
		atp_entidad.setIpModificacion(atp_dto.getIs_ipModificacion());
		atp_entidad.setModeloTransaccionVigente(atp_dto.getIs_modeloTransaccionVigente());
		atp_entidad.setNir(atp_dto.getIs_nir());
		atp_entidad.setTipoTransaccion(atp_dto.getIs_tipoTransaccion());
		atp_entidad.setTokenTrasaccion(atp_dto.getIs_tokenTransaccion());
		atp_entidad.setEstadoBachue(atp_dto.getIs_estadoBachue());
		atp_entidad.setEstadoPasarela(atp_dto.getIs_estadoPasarela());
		atp_entidad.setCodigoServicio(atp_dto.getIs_servicio());
		atp_entidad.setCodigoSubServicio(atp_dto.getIs_tipoServicio());
		atp_entidad.setReferencia(atp_dto.getIs_referenciaPago());
		return atp_entidad;
	}

	/**
	 * Metodo que convierte de dto a entidad usando todos los datos incluyendo
	 * relaciones.
	 *
	 * @param atp_dto     el parametro dto
	 * @param atp_entidad el parametro entidad
	 * @return Resultado para dto A entidad completo retornado como
	 *         TransaccionPasarela
	 */
	public static TransaccionPasarela dtoAEntidadCompleto(TransaccionPasarelaDTO atp_dto,
			TransaccionPasarela atp_entidad) {
		atp_entidad = dtoAEntidadSimple(atp_dto, atp_entidad);
		if (atp_dto.getIu_usuario() != null) {
			atp_entidad.setUsuario(new Usuario());
			atp_entidad.getUsuario().setId(atp_dto.getIu_usuario().getIs_id());
		}

		return atp_entidad;
	}

	/**
	 * Metodo que permite convertir de dto a entidad.
	 *
	 * @param altp_listDto el parametro list dto
	 * @return Resultado para listadto A entidad simple retornado como una lista de
	 *         TransaccionPasarela
	 */
	public static List<TransaccionPasarela> listadtoAEntidadSimple(List<TransaccionPasarelaDTO> altp_listDto) {
		List<TransaccionPasarela> lltp_listEntidad = new ArrayList<>();
		for (TransaccionPasarelaDTO ltp_dto : altp_listDto) {
			lltp_listEntidad.add(dtoAEntidadSimple(ltp_dto, null));
		}
		return lltp_listEntidad;
	}

	/**
	 * Metodo que convierte de dto a entidad usando todos los datos incluyendo
	 * relaciones.
	 *
	 * @param altp_listDto el parametro list dto
	 * @return Resultado para listadto A entidad completo retornado como una lista
	 *         de TransaccionPasarela
	 */
	public static List<TransaccionPasarela> listadtoAEntidadCompleto(List<TransaccionPasarelaDTO> altp_listDto) {
		List<TransaccionPasarela> lltp_listEntidad = new ArrayList<>();
		for (TransaccionPasarelaDTO ltp_dto : altp_listDto) {
			lltp_listEntidad.add(dtoAEntidadCompleto(ltp_dto, null));
		}
		return lltp_listEntidad;
	}
}

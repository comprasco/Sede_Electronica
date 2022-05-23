/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ParametroBooleanoDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: ParametroBooleanoDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumBoolean;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Parametro
 * booleano.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ParametroBooleanoDTO extends ParametroDTO {
	
	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad activo.
	 */
	private Boolean ib_activo;
	
	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad
	 * editable.
	 */
	private Boolean ib_editable;

	/**
	 * Construye una nueva instancia/objeto de la clase ParametroBooleanoDTO.
	 */
	// Contructores
	public ParametroBooleanoDTO() {
	}

	/**
	 * Construye una nueva instancia/objeto de la clase ParametroBooleanoDTO.
	 *
	 * @param ap_parametroDto el parametro parametro dto
	 */
	public ParametroBooleanoDTO(ParametroDTO ap_parametroDto) {
		this.setIs_id(ap_parametroDto.getIs_id());
		this.setIs_activo(ap_parametroDto.getIs_activo());
		this.setIs_codigoParametro(ap_parametroDto.getIs_codigoParametro());
		this.setIs_editable(ap_parametroDto.getIs_editable());
		this.setId_fechaCreacion(ap_parametroDto.getId_fechaCreacion());
		this.setId_fechaModificacion(ap_parametroDto.getId_fechaModificacion());
		this.setIs_textoAyuda(ap_parametroDto.getIs_textoAyuda());
		this.setIs_idUsuarioCreacion(ap_parametroDto.getIs_idUsuarioCreacion());
		this.setIs_idUsuarioModificacion(ap_parametroDto.getIs_idUsuarioModificacion());
		this.setIs_ipCreacion(ap_parametroDto.getIs_ipCreacion());
		this.setIs_ipModificacion(ap_parametroDto.getIs_ipModificacion());
		this.setIs_nombre(ap_parametroDto.getIs_nombre());
		this.setIs_tipoVariable(ap_parametroDto.getIs_tipoVariable());
		this.setIs_unidadParametro(ap_parametroDto.getIs_unidadParametro());
		this.setIs_descripcion(ap_parametroDto.getIs_descripcion());
		this.setIs_valor(ap_parametroDto.getIs_valor());
		this.setIs_valorParametroDefecto(ap_parametroDto.getIs_valorParametroDefecto());
		this.setIs_valorUi(ap_parametroDto.getIs_valorUi());
		this.setIbi_valorMinimo(ap_parametroDto.getIbi_valorMinimo());
		this.setIbi_valorMaximo(ap_parametroDto.getIbi_valorMaximo());
		this.setItp_tipoProcesoDto(ap_parametroDto.getItp_tipoProcesoDto());
		this.setIs_estereotipoCreacion(ap_parametroDto.getIs_estereotipoCreacion());
		this.setIs_estereotipoModificacion(ap_parametroDto.getIs_estereotipoModificacion());
		this.setIb_activo(EnumBoolean.buscarBooleano(ap_parametroDto.getIs_activo()).getIb_valor());
		this.setIb_editable(EnumBoolean.buscarBooleano(ap_parametroDto.getIs_editable()).getIb_valor());
	}

	/**
	 * Obtiene el valor para la propiedad activo.
	 *
	 * @return El valor de la propiedad activo
	 */
	// Getters and Setters
	public Boolean getIb_activo() {
		return ib_activo;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad activo.
	 *
	 * @param ab_activo el nuevo valor para la propiedad activo
	 */
	public void setIb_activo(Boolean ab_activo) {
		this.ib_activo = ab_activo;
	}

	/**
	 * Obtiene el valor para la propiedad editable.
	 *
	 * @return El valor de la propiedad editable
	 */
	public Boolean getIb_editable() {
		return ib_editable;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad editable.
	 *
	 * @param ab_editable el nuevo valor para la propiedad editable
	 */
	public void setIb_editable(Boolean ab_editable) {
		this.ib_editable = ab_editable;
	}
}

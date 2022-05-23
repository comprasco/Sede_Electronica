/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: DatosEntradaSolicitudConsultaDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: DatosEntradaSolicitudConsultaDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

import java.math.BigDecimal;

import com.google.gson.annotations.SerializedName;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Datos entrada
 * solicitud consulta.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class DatosEntradaSolicitudConsultaDTO extends DatosPersonaDTO{

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad consulta
	 * nacional.
	 */
	@SerializedName("consultaNacional")
	private Boolean ib_consultaNacional;
	
	/**
	 * Atributo de instancia tipo CirculoRegistralDTO para definir la propiedad
	 * orip.
	 */
	@SerializedName("orip")
	private CirculoRegistralDTO icr_orip;
	
	/**
	 * Atributo de instancia tipo TipoActoDTO para definir la propiedad tipo acto.
	 */
	@SerializedName("tipoActo")
	private TipoActoDTO ita_tipoActo;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * solicitante.
	 */
	@SerializedName("solicitante")
	private String is_solicitante;
	
	/**
	 * Atributo de instancia tipo numero real/decimal de gran magnitud para definir
	 * la propiedad valor unitario.
	 */
	@SerializedName("valorUnitario")
	private BigDecimal ibd_valorUnitario;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * correo envio.
	 */
	@SerializedName("correoEnvio")
	private String is_correoEnvio;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * estado.
	 */
	@SerializedName("estado")
	private String is_estado;
	
	/**
	 * Obtiene el valor para la propiedad orip.
	 *
	 * @return El valor de la propiedad orip
	 */
	public CirculoRegistralDTO getIcr_orip() {
		return icr_orip;
	}
	
	/**
	 * Obtiene el valor para la propiedad tipo acto.
	 *
	 * @return El valor de la propiedad tipo acto
	 */
	public TipoActoDTO getIta_tipoActo() {
		return ita_tipoActo;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad orip.
	 *
	 * @param acr_orip el nuevo valor para la propiedad orip
	 */
	public void setIcr_orip(CirculoRegistralDTO acr_orip) {
		this.icr_orip = acr_orip;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad tipo acto.
	 *
	 * @param ata_tipoActo el nuevo valor para la propiedad tipo acto
	 */
	public void setIta_tipoActo(TipoActoDTO ata_tipoActo) {
		this.ita_tipoActo = ata_tipoActo;
	}
	
	/**
	 * Obtiene el valor para la propiedad valor unitario.
	 *
	 * @return El valor de la propiedad valor unitario
	 */
	public BigDecimal getIbd_valorUnitario() {
		return ibd_valorUnitario;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad valor unitario.
	 *
	 * @param abd_valorUnitario el nuevo valor para la propiedad valor unitario
	 */
	public void setIbd_valorUnitario(BigDecimal abd_valorUnitario) {
		this.ibd_valorUnitario = abd_valorUnitario;
	}
	
	/**
	 * Obtiene el valor para la propiedad correo envio.
	 *
	 * @return El valor de la propiedad correo envio
	 */
	public String getIs_correoEnvio() {
		return is_correoEnvio;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad correo envio.
	 *
	 * @param as_correoEnvio el nuevo valor para la propiedad correo envio
	 */
	public void setIs_correoEnvio(String as_correoEnvio) {
		this.is_correoEnvio = as_correoEnvio;
	}
	
	/**
	 * Obtiene el valor para la propiedad solicitante.
	 *
	 * @return El valor de la propiedad solicitante
	 */
	public String getIs_solicitante() {
		return is_solicitante;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad solicitante.
	 *
	 * @param as_solicitante el nuevo valor para la propiedad solicitante
	 */
	public void setIs_solicitante(String as_solicitante) {
		this.is_solicitante = as_solicitante;
	}
	
	/**
	 * Obtiene el valor para la propiedad consulta nacional.
	 *
	 * @return El valor de la propiedad consulta nacional
	 */
	public Boolean getIb_consultaNacional() {
		return ib_consultaNacional;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad consulta nacional.
	 *
	 * @param ab_consultaNacional el nuevo valor para la propiedad consulta nacional
	 */
	public void setIb_consultaNacional(Boolean ab_consultaNacional) {
		this.ib_consultaNacional = ab_consultaNacional;
	}
	
	/**
	 * Obtiene el valor para la propiedad estado.
	 *
	 * @return El valor de la propiedad estado
	 */
	public String getIs_estado() {
		return is_estado;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad estado.
	 *
	 * @param as_estado el nuevo valor para la propiedad estado
	 */
	public void setIs_estado(String as_estado) {
		this.is_estado = as_estado;
	}
	
}

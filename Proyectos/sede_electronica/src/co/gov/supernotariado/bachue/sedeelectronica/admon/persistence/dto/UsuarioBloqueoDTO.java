/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: UsuarioBloqueoDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: UsuarioBloqueoDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

import java.util.Date;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Usuario bloqueo.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class UsuarioBloqueoDTO extends GenericoBaseDTO {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo fecha para definir la propiedad fecha bloqueo fin.
	 */
	private Date id_fechaBloqueoFin;
	
	/**
	 * Atributo de instancia tipo fecha para definir la propiedad fecha bloqueo
	 * inicio.
	 */
	private Date id_fechaBloqueoInicio;
	
	/**
	 * Atributo de instancia tipo UsuarioDTO para definir la propiedad usuario.
	 */
	private UsuarioDTO iud_usuarioDto;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * observacion bloqueo.
	 */
	private String is_observacionBloqueo;
	
	/**
	 * Atributo de instancia tipo arreglo de bytes para definir la propiedad soporte
	 * bloqueo.
	 */
	private byte[] ib_soporteBloqueo;

	/**
	 * Obtiene el valor para la propiedad fecha bloqueo fin.
	 *
	 * @return El valor de la propiedad fecha bloqueo fin
	 */
	public Date getId_fechaBloqueoFin() {
		return id_fechaBloqueoFin;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad fecha bloqueo fin.
	 *
	 * @param ad_fechaBloqueoFin el nuevo valor para la propiedad fecha bloqueo fin
	 */
	public void setId_fechaBloqueoFin(Date ad_fechaBloqueoFin) {
		this.id_fechaBloqueoFin = ad_fechaBloqueoFin;
	}

	/**
	 * Obtiene el valor para la propiedad fecha bloqueo inicio.
	 *
	 * @return El valor de la propiedad fecha bloqueo inicio
	 */
	public Date getId_fechaBloqueoInicio() {
		return id_fechaBloqueoInicio;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad fecha bloqueo inicio.
	 *
	 * @param ad_fechaBloqueoInicio el nuevo valor para la propiedad fecha bloqueo
	 *                              inicio
	 */
	public void setId_fechaBloqueoInicio(Date ad_fechaBloqueoInicio) {
		this.id_fechaBloqueoInicio = ad_fechaBloqueoInicio;
	}

	/**
	 * Obtiene el valor para la propiedad usuario dto.
	 *
	 * @return El valor de la propiedad usuario dto
	 */
	public UsuarioDTO getIud_usuarioDto() {
		return iud_usuarioDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad usuario dto.
	 *
	 * @param aud_usuarioDto el nuevo valor para la propiedad usuario dto
	 */
	public void setIud_usuarioDto(UsuarioDTO aud_usuarioDto) {
		this.iud_usuarioDto = aud_usuarioDto;
	}

	/**
	 * Obtiene el valor para la propiedad observacion bloqueo.
	 *
	 * @return El valor de la propiedad observacion bloqueo
	 */
	public String getIs_observacionBloqueo() {
		return is_observacionBloqueo;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad observacion bloqueo.
	 *
	 * @param as_observacionBloqueo el nuevo valor para la propiedad observacion
	 *                              bloqueo
	 */
	public void setIs_observacionBloqueo(String as_observacionBloqueo) {
		this.is_observacionBloqueo = as_observacionBloqueo;
	}

	/**
	 * Obtiene el valor para la propiedad soporte bloqueo.
	 *
	 * @return El valor de la propiedad soporte bloqueo
	 */
	public byte[] getIb_soporteBloqueo() {
		return ib_soporteBloqueo;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad soporte bloqueo.
	 *
	 * @param ab_soporteBloqueo el nuevo valor para la propiedad soporte bloqueo
	 */
	public void setIb_soporteBloqueo(byte[] ab_soporteBloqueo) {
		this.ib_soporteBloqueo = ab_soporteBloqueo;
	}

}

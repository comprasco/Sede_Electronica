/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: CENumMatriculaDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: CENumMatriculaDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

import java.util.Date;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto CE num matricula.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class CENumMatriculaDTO extends GenericoDTO {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo SalidaMatriculaDTO para definir la propiedad
	 * salida matricula.
	 */
	private SalidaMatriculaDTO ism_salidaMatriculaDTO;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * cedula catastral.
	 */
	private String is_cedulaCatastral;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nupre.
	 */
	private String is_nupre;
	
	/**
	 * Atributo de instancia tipo fecha para definir la propiedad fecha solicitud.
	 */
	private Date id_fechaSolicitud;

	/**
	 * Obtiene el valor para la propiedad salida matricula DTO.
	 *
	 * @return El valor de la propiedad salida matricula DTO
	 */
	public SalidaMatriculaDTO getIsm_salidaMatriculaDTO() {
		return ism_salidaMatriculaDTO;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad salida matricula DTO.
	 *
	 * @param asm_salidaMatriculaDTO el nuevo valor para la propiedad salida
	 *                               matricula DTO
	 */
	public void setIsm_salidaMatriculaDTO(SalidaMatriculaDTO asm_salidaMatriculaDTO) {
		this.ism_salidaMatriculaDTO = asm_salidaMatriculaDTO;
	}

	/**
	 * Obtiene el valor para la propiedad cedula catastral.
	 *
	 * @return El valor de la propiedad cedula catastral
	 */
	public String getIs_cedulaCatastral() {
		return is_cedulaCatastral;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad cedula catastral.
	 *
	 * @param as_cedulaCatastral el nuevo valor para la propiedad cedula catastral
	 */
	public void setIs_cedulaCatastral(String as_cedulaCatastral) {
		this.is_cedulaCatastral = as_cedulaCatastral;
	}

	/**
	 * Obtiene el valor para la propiedad nupre.
	 *
	 * @return El valor de la propiedad nupre
	 */
	public String getIs_nupre() {
		return is_nupre;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad nupre.
	 *
	 * @param as_nupre el nuevo valor para la propiedad nupre
	 */
	public void setIs_nupre(String as_nupre) {
		this.is_nupre = as_nupre;
	}

	/**
	 * Obtiene el valor para la propiedad fecha solicitud.
	 *
	 * @return El valor de la propiedad fecha solicitud
	 */
	public Date getId_fechaSolicitud() {
		return id_fechaSolicitud;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad fecha solicitud.
	 *
	 * @param ad_fechaSolicitud el nuevo valor para la propiedad fecha solicitud
	 */
	public void setId_fechaSolicitud(Date ad_fechaSolicitud) {
		this.id_fechaSolicitud = ad_fechaSolicitud;
	}

}

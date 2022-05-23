/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: SeguimientoSolicitudesRespuestaMatriculasDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: SeguimientoSolicitudesRespuestaMatriculasDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Seguimiento
 * solicitudes respuesta matriculas.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class SeguimientoSolicitudesRespuestaMatriculasDTO extends GenericoDTO {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * circulo registral.
	 */
	private String is_circuloRegistral;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * matricula numero.
	 */
	private String is_matriculaNumero;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * estado.
	 */
	private String is_estado;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * alertas vigentes.
	 */
	private String is_alertasVigentes;

	/**
	 * Obtiene el valor para la propiedad circulo registral.
	 *
	 * @return El valor de la propiedad circulo registral
	 */
	public String getIs_circuloRegistral() {
		return is_circuloRegistral;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad circulo registral.
	 *
	 * @param as_circuloRegistral el nuevo valor para la propiedad circulo registral
	 */
	public void setIs_circuloRegistral(String as_circuloRegistral) {
		this.is_circuloRegistral = as_circuloRegistral;
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

	/**
	 * Obtiene el valor para la propiedad alertas vigentes.
	 *
	 * @return El valor de la propiedad alertas vigentes
	 */
	public String getIs_alertasVigentes() {
		return is_alertasVigentes;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad alertas vigentes.
	 *
	 * @param as_alertasVigentes el nuevo valor para la propiedad alertas vigentes
	 */
	public void setIs_alertasVigentes(String as_alertasVigentes) {
		this.is_alertasVigentes = as_alertasVigentes;
	}

	/**
	 * Obtiene el valor para la propiedad matricula numero.
	 *
	 * @return El valor de la propiedad matricula numero
	 */
	public String getIs_matriculaNumero() {
		return is_matriculaNumero;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad matricula numero.
	 *
	 * @param as_matriculaNumero el nuevo valor para la propiedad matricula numero
	 */
	public void setIs_matriculaNumero(String as_matriculaNumero) {
		this.is_matriculaNumero = as_matriculaNumero;
	}
}

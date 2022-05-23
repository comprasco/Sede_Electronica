/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: AlertasGeneradasDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: AlertasGeneradasDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

import java.io.Serializable;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Alertas generadas.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class AlertasGeneradasDTO implements Serializable {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad nom
	 * circulo registral.
	 */
	private String is_nomCirculoRegistral;
	
	/**
	 * Atributo de instancia tipo entero para definir la propiedad num matricula
	 * inmobiliaria.
	 */
	private Integer ii_numMatriculaInmobiliaria;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * turno.
	 */
	private String is_turno;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * texto.
	 */
	private String is_texto;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * usuario generador.
	 */
	private String is_usuarioGenerador;

	/**
	 * Obtiene el valor para la propiedad nom circulo registral.
	 *
	 * @return El valor de la propiedad nom circulo registral
	 */
	public String getIs_nomCirculoRegistral() {
		return is_nomCirculoRegistral;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad nom circulo registral.
	 *
	 * @param as_nomCirculoRegistral el nuevo valor para la propiedad nom circulo
	 *                               registral
	 */
	public void setIs_nomCirculoRegistral(String as_nomCirculoRegistral) {
		this.is_nomCirculoRegistral = as_nomCirculoRegistral;
	}

	/**
	 * Obtiene el valor para la propiedad num matricula inmobiliaria.
	 *
	 * @return El valor de la propiedad num matricula inmobiliaria
	 */
	public Integer getIi_numMatriculaInmobiliaria() {
		return ii_numMatriculaInmobiliaria;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad num matricula inmobiliaria.
	 *
	 * @param ai_numMatriculaInmobiliaria el nuevo valor para la propiedad num
	 *                                    matricula inmobiliaria
	 */
	public void setIi_numMatriculaInmobiliaria(Integer ai_numMatriculaInmobiliaria) {
		this.ii_numMatriculaInmobiliaria = ai_numMatriculaInmobiliaria;
	}

	/**
	 * Obtiene el valor para la propiedad turno.
	 *
	 * @return El valor de la propiedad turno
	 */
	public String getIs_turno() {
		return is_turno;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad turno.
	 *
	 * @param as_turno el nuevo valor para la propiedad turno
	 */
	public void setIs_turno(String as_turno) {
		this.is_turno = as_turno;
	}

	/**
	 * Obtiene el valor para la propiedad texto.
	 *
	 * @return El valor de la propiedad texto
	 */
	public String getIs_texto() {
		return is_texto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad texto.
	 *
	 * @param as_texto el nuevo valor para la propiedad texto
	 */
	public void setIs_texto(String as_texto) {
		this.is_texto = as_texto;
	}

	/**
	 * Obtiene el valor para la propiedad usuario generador.
	 *
	 * @return El valor de la propiedad usuario generador
	 */
	public String getIs_usuarioGenerador() {
		return is_usuarioGenerador;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad usuario generador.
	 *
	 * @param as_usuarioGenerador el nuevo valor para la propiedad usuario generador
	 */
	public void setIs_usuarioGenerador(String as_usuarioGenerador) {
		this.is_usuarioGenerador = as_usuarioGenerador;
	}

}

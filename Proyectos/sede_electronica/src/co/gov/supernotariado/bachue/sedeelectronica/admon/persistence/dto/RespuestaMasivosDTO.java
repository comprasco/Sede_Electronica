/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: RespuestaMasivosDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: RespuestaMasivosDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

import com.google.gson.annotations.SerializedName;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Respuesta masivos.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class RespuestaMasivosDTO extends GenericoDTO {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo arreglo de bytes para definir la propiedad archivo
	 * respuesta byte.
	 */
	@SerializedName("archivoRespuesta")
	private byte[] ib_archivoRespuestaByte;
	
	/**
	 * Atributo de instancia tipo entero para definir la propiedad cantidad
	 * matriculas correctas.
	 */
	@SerializedName("cantidadCorrectas")
	private int ii_cantidadMatriculasCorrectas;
	
	/**
	 * Atributo de instancia tipo entero para definir la propiedad cantidad
	 * matriculas no titular.
	 */
	@SerializedName("cantidadNoTitular")
	private int ii_cantidadMatriculasNoTitular;
	
	/**
	 * Atributo de instancia tipo entero para definir la propiedad cantidad
	 * matriculas no existen sistema.
	 */
	@SerializedName("cantidadNoExistenSistema")
	private int ii_cantidadMatriculasNoExistenSistema;
	
	/**
	 * Atributo de instancia tipo entero para definir la propiedad cantidad
	 * matriculas ya asosiadas.
	 */
	@SerializedName("cantidadYaAsociadas")
	private int ii_cantidadMatriculasYaAsosiadas;

	/**
	 * Obtiene el valor para la propiedad archivo respuesta byte.
	 *
	 * @return El valor de la propiedad archivo respuesta byte
	 */
	public byte[] getIb_archivoRespuestaByte() {
		return ib_archivoRespuestaByte;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad archivo respuesta byte.
	 *
	 * @param ab_archivoRespuestaByte el nuevo valor para la propiedad archivo
	 *                                respuesta byte
	 */
	public void setIb_archivoRespuestaByte(byte[] ab_archivoRespuestaByte) {
		this.ib_archivoRespuestaByte = ab_archivoRespuestaByte;
	}

	/**
	 * Obtiene el valor para la propiedad cantidad matriculas correctas.
	 *
	 * @return El valor de la propiedad cantidad matriculas correctas
	 */
	public int getIi_cantidadMatriculasCorrectas() {
		return ii_cantidadMatriculasCorrectas;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad cantidad matriculas correctas.
	 *
	 * @param ai_cantidadMatriculasCorrectas el nuevo valor para la propiedad
	 *                                       cantidad matriculas correctas
	 */
	public void setIi_cantidadMatriculasCorrectas(int ai_cantidadMatriculasCorrectas) {
		this.ii_cantidadMatriculasCorrectas = ai_cantidadMatriculasCorrectas;
	}

	/**
	 * Obtiene el valor para la propiedad cantidad matriculas no titular.
	 *
	 * @return El valor de la propiedad cantidad matriculas no titular
	 */
	public int getIi_cantidadMatriculasNoTitular() {
		return ii_cantidadMatriculasNoTitular;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad cantidad matriculas no titular.
	 *
	 * @param ai_cantidadMatriculasNoTitular el nuevo valor para la propiedad
	 *                                       cantidad matriculas no titular
	 */
	public void setIi_cantidadMatriculasNoTitular(int ai_cantidadMatriculasNoTitular) {
		this.ii_cantidadMatriculasNoTitular = ai_cantidadMatriculasNoTitular;
	}

	/**
	 * Obtiene el valor para la propiedad cantidad matriculas no existen sistema.
	 *
	 * @return El valor de la propiedad cantidad matriculas no existen sistema
	 */
	public int getIi_cantidadMatriculasNoExistenSistema() {
		return ii_cantidadMatriculasNoExistenSistema;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad cantidad matriculas no existen
	 * sistema.
	 *
	 * @param ai_cantidadMatriculasNoExistenSistema el nuevo valor para la propiedad
	 *                                              cantidad matriculas no existen
	 *                                              sistema
	 */
	public void setIi_cantidadMatriculasNoExistenSistema(int ai_cantidadMatriculasNoExistenSistema) {
		this.ii_cantidadMatriculasNoExistenSistema = ai_cantidadMatriculasNoExistenSistema;
	}

	/**
	 * Obtiene el valor para la propiedad cantidad matriculas ya asosiadas.
	 *
	 * @return El valor de la propiedad cantidad matriculas ya asosiadas
	 */
	public int getIi_cantidadMatriculasYaAsosiadas() {
		return ii_cantidadMatriculasYaAsosiadas;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad cantidad matriculas ya asosiadas.
	 *
	 * @param ai_cantidadMatriculasYaAsosiadas el nuevo valor para la propiedad
	 *                                         cantidad matriculas ya asosiadas
	 */
	public void setIi_cantidadMatriculasYaAsosiadas(int ai_cantidadMatriculasYaAsosiadas) {
		this.ii_cantidadMatriculasYaAsosiadas = ai_cantidadMatriculasYaAsosiadas;
	}

}

/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: MatriculaDerivadaEJDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: MatriculaDerivadaEJDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Matricula derivada
 * EJ.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class MatriculaDerivadaEJDTO extends GenericoDTO{

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad num
	 * matricula inmobiliaria.
	 */
	private String is_numMatriculaInmobiliaria;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad cod
	 * circulo registral.
	 */
	private String is_codCirculoRegistral;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * direccion predial.
	 */
	private String is_direccionPredial;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nir.
	 */
	private String is_nir;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * radicacion.
	 */
	private String is_radicacion;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * anotacion relacionada.
	 */
	private String is_anotacionRelacionada;
	
	/**
	 * Obtiene el valor para la propiedad num matricula inmobiliaria.
	 *
	 * @return El valor de la propiedad num matricula inmobiliaria
	 */
	public String getIs_numMatriculaInmobiliaria() {
		return is_numMatriculaInmobiliaria;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad num matricula inmobiliaria.
	 *
	 * @param as_numMatriculaInmobiliaria el nuevo valor para la propiedad num
	 *                                    matricula inmobiliaria
	 */
	public void setIs_numMatriculaInmobiliaria(String as_numMatriculaInmobiliaria) {
		this.is_numMatriculaInmobiliaria = as_numMatriculaInmobiliaria;
	}
	
	/**
	 * Obtiene el valor para la propiedad cod circulo registral.
	 *
	 * @return El valor de la propiedad cod circulo registral
	 */
	public String getIs_codCirculoRegistral() {
		return is_codCirculoRegistral;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad cod circulo registral.
	 *
	 * @param as_codCirculoRegistral el nuevo valor para la propiedad cod circulo
	 *                               registral
	 */
	public void setIs_codCirculoRegistral(String as_codCirculoRegistral) {
		this.is_codCirculoRegistral = as_codCirculoRegistral;
	}
	
	/**
	 * Obtiene el valor para la propiedad direccion predial.
	 *
	 * @return El valor de la propiedad direccion predial
	 */
	public String getIs_direccionPredial() {
		return is_direccionPredial;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad direccion predial.
	 *
	 * @param as_direccionPredial el nuevo valor para la propiedad direccion predial
	 */
	public void setIs_direccionPredial(String as_direccionPredial) {
		this.is_direccionPredial = as_direccionPredial;
	}
	
	/**
	 * Obtiene el valor para la propiedad nir.
	 *
	 * @return El valor de la propiedad nir
	 */
	public String getIs_nir() {
		return is_nir;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad nir.
	 *
	 * @param as_nir el nuevo valor para la propiedad nir
	 */
	public void setIs_nir(String as_nir) {
		this.is_nir = as_nir;
	}
	
	/**
	 * Obtiene el valor para la propiedad radicacion.
	 *
	 * @return El valor de la propiedad radicacion
	 */
	public String getIs_radicacion() {
		return is_radicacion;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad radicacion.
	 *
	 * @param as_radicacion el nuevo valor para la propiedad radicacion
	 */
	public void setIs_radicacion(String as_radicacion) {
		this.is_radicacion = as_radicacion;
	}
	
	/**
	 * Obtiene el valor para la propiedad anotacion relacionada.
	 *
	 * @return El valor de la propiedad anotacion relacionada
	 */
	public String getIs_anotacionRelacionada() {
		return is_anotacionRelacionada;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad anotacion relacionada.
	 *
	 * @param as_anotacionRelacionada el nuevo valor para la propiedad anotacion
	 *                                relacionada
	 */
	public void setIs_anotacionRelacionada(String as_anotacionRelacionada) {
		this.is_anotacionRelacionada = as_anotacionRelacionada;
	}
	
}

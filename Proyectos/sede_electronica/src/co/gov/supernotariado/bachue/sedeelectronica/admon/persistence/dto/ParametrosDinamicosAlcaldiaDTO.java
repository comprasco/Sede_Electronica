/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ParametrosDinamicosAlcaldiaDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: ParametrosDinamicosAlcaldiaDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.interfaces.IAuditableDTO;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Parametros
 * dinamicos alcaldia.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ParametrosDinamicosAlcaldiaDTO extends GenericoBaseDTO implements IAuditableDTO { 
	
	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * constante.
	 */
	// --- Atributos
	private String is_constante;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad id
	 * alcaldia parametrizacion.
	 */
	private String is_idAlcaldiaParametrizacion;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nombre.
	 */
	private String is_nombre;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * administrable.
	 */
	private String is_administrable;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * parametro aplicacion.
	 */
	private String is_parametroAplicacion;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * parametro ui.
	 */
	private String is_parametroUi;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * valor.
	 */
	private String is_valor;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * place holder.
	 */
	private String is_placeHolder;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nombre ui.
	 */
	private String is_nombreUi;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * descripcion ui.
	 */
	private String is_descripcionUi;

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * ParametrosDinamicosAlcaldiaDTO.
	 */
	// --- Constructor
	public ParametrosDinamicosAlcaldiaDTO () {
		//Metodo constructor parametros dinámicos
	}

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * ParametrosDinamicosAlcaldiaDTO.
	 *
	 * @param as_id el parametro id
	 */
	public ParametrosDinamicosAlcaldiaDTO (String as_id ) {

		this.setIs_id(as_id);
	}

	/**
	 * Obtiene el valor para la propiedad constante.
	 *
	 * @return El valor de la propiedad constante
	 */
	public String getIs_constante() {
		return is_constante;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad constante.
	 *
	 * @param as_constante el nuevo valor para la propiedad constante
	 */
	public void setIs_constante(String as_constante) {
		this.is_constante = as_constante;
	}

	/**
	 * Obtiene el valor para la propiedad id alcaldia parametrizacion.
	 *
	 * @return El valor de la propiedad id alcaldia parametrizacion
	 */
	public String getIs_idAlcaldiaParametrizacion() {
		return is_idAlcaldiaParametrizacion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad id alcaldia parametrizacion.
	 *
	 * @param as_idAlcaldiaParametrizacion el nuevo valor para la propiedad id
	 *                                     alcaldia parametrizacion
	 */
	public void setIs_idAlcaldiaParametrizacion(String as_idAlcaldiaParametrizacion) {
		this.is_idAlcaldiaParametrizacion = as_idAlcaldiaParametrizacion;
	}

	/**
	 * Obtiene el valor para la propiedad nombre.
	 *
	 * @return El valor de la propiedad nombre
	 */
	public String getIs_nombre() {
		return is_nombre;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad nombre.
	 *
	 * @param as_nombre el nuevo valor para la propiedad nombre
	 */
	public void setIs_nombre(String as_nombre) {
		this.is_nombre = as_nombre;
	}

	/**
	 * Obtiene el valor para la propiedad parametro aplicacion.
	 *
	 * @return El valor de la propiedad parametro aplicacion
	 */
	public String getIs_parametroAplicacion() {
		return is_parametroAplicacion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad parametro aplicacion.
	 *
	 * @param as_parametroAplicacion el nuevo valor para la propiedad parametro
	 *                               aplicacion
	 */
	public void setIs_parametroAplicacion(String as_parametroAplicacion) {
		this.is_parametroAplicacion = as_parametroAplicacion;
	}

	/**
	 * Obtiene el valor para la propiedad parametro ui.
	 *
	 * @return El valor de la propiedad parametro ui
	 */
	public String getIs_parametroUi() {
		return is_parametroUi;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad parametro ui.
	 *
	 * @param as_parametroUi el nuevo valor para la propiedad parametro ui
	 */
	public void setIs_parametroUi(String as_parametroUi) {
		this.is_parametroUi = as_parametroUi;
	}

	/**
	 * Obtiene el valor para la propiedad valor.
	 *
	 * @return El valor de la propiedad valor
	 */
	public String getIs_valor() {
		return is_valor;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad valor.
	 *
	 * @param as_valor el nuevo valor para la propiedad valor
	 */
	public void setIs_valor(String as_valor) {
		this.is_valor = as_valor;
	}

	/**
	 * Obtiene el valor para la propiedad place holder.
	 *
	 * @return El valor de la propiedad place holder
	 */
	public String getIs_placeHolder() {
		return is_placeHolder;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad place holder.
	 *
	 * @param as_placeHolder el nuevo valor para la propiedad place holder
	 */
	public void setIs_placeHolder(String as_placeHolder) {
		this.is_placeHolder = as_placeHolder;
	}

	/**
	 * Obtiene el valor para la propiedad administrable.
	 *
	 * @return El valor de la propiedad administrable
	 */
	public String getIs_administrable() {
		return is_administrable;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad administrable.
	 *
	 * @param as_administrable el nuevo valor para la propiedad administrable
	 */
	public void setIs_administrable(String as_administrable) {
		this.is_administrable = as_administrable;
	}

	/**
	 * Obtiene el valor para la propiedad nombre ui.
	 *
	 * @return El valor de la propiedad nombre ui
	 */
	public String getIs_nombreUi() {
		return is_nombreUi;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad nombre ui.
	 *
	 * @param as_nombreUi el nuevo valor para la propiedad nombre ui
	 */
	public void setIs_nombreUi(String as_nombreUi) {
		this.is_nombreUi = as_nombreUi;
	}

	/**
	 * Obtiene el valor para la propiedad descripcion ui.
	 *
	 * @return El valor de la propiedad descripcion ui
	 */
	public String getIs_descripcionUi() {
		return is_descripcionUi;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad descripcion ui.
	 *
	 * @param as_descripcionUi el nuevo valor para la propiedad descripcion ui
	 */
	public void setIs_descripcionUi(String as_descripcionUi) {
		this.is_descripcionUi = as_descripcionUi;
	}	
	
	
}
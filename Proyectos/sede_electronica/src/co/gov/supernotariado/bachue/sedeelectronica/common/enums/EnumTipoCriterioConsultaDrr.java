/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: EnumAdministracionPersonaNatural.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.enums
 * Nombre del elemento: EnumAdministracionPersonaNatural
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.enums;

/**
 * Enumeracion para definir el grupo de constantes para Administracion persona
 * natural. <br>
 * Enum que contiene los asociados y desasociados
 * 
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public enum EnumTipoCriterioConsultaDrr {

	/**
	 * Constante de la enumeracion para definir el item: NUMERO_MATRICULA.
	 */
	NUMERO_MATRICULA("NUMERO_MATRICULA", "matricula"),

	/**
	 * Constante de la enumeracion para definir el item: NUMERO_PREDIAL.
	 */
	NUMERO_PREDIAL("NUMERO_PREDIAL", "numeroPredial"),
	
	/**
	 * Constante de la enumeracion para definir el item: NUMERO_PREDIAL_ANTERIOR.
	 */
	NUMERO_PREDIAL_ANTERIOR("NUMERO_PREDIAL_ANTERIOR", "numeroPredialAnterior"),
	
	/**
	 * Constante de la enumeracion para definir el item: NUPRE.
	 */
	NUPRE("NUPRE", "nupre"),;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo.
	 */
	private String is_codigo;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * descripcion.
	 */
	private String is_criterioBusqueda;

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * EnumAdministracionPersonaNatural.
	 *
	 * @param as_codigo      el parametro codigo
	 * @param as_descripcion el parametro descripcion
	 */
	private EnumTipoCriterioConsultaDrr(String as_codigo, String as_criterioBusqueda) {
		this.is_codigo = as_codigo;
		this.is_criterioBusqueda = as_criterioBusqueda;
	}

	/**
	 * Obtiene el valor para la propiedad codigo.
	 *
	 * @return El valor de la propiedad codigo
	 */
	public String getIs_codigo() {
		return is_codigo;
	}


	
	/**
	 * Obtiene el valor para la propiedad criterio Busqueda.
	 *
	 * @return El valor de la propiedad criterio Busqueda
	 */
	public String getIs_criterioBusqueda() {
		return is_criterioBusqueda;
	}


	/**
	 * Metodo que retornar el enum por su propiedad
	 * @param as_criterio
	 * @return EnumTipoCriterioConsultaDrr
	 */
	public static EnumTipoCriterioConsultaDrr consultarCriterioBusqueda(String as_criterio) {
		for (EnumTipoCriterioConsultaDrr letcc_tipoCriterio : EnumTipoCriterioConsultaDrr.values()) {
			if (letcc_tipoCriterio.name().equals(as_criterio)) {
				return letcc_tipoCriterio;
			}
		}
		return null;
	}
}
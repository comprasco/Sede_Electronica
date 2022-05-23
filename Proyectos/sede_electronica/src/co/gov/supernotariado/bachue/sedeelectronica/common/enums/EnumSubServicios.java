/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: EnumSubServicios.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.enums
 * Nombre del elemento: EnumSubServicios
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.enums;

/**
 * Enumeracion para definir el grupo de constantes para Sub servicios. <br>
 * Enum catalogos de tipo subservicio de consultas
 * 
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public enum EnumSubServicios implements ICatalogable {

	/**
	 * Constante de la enumeracion para definir el item: CONSULTA_OTROS_DERECHOS.
	 */
	// Sub servicios de CONSULTAS
	CONSULTA_OTROS_DERECHOS("CONSULTA_OTROS_DERECHOS"),

	/**
	 * Constante de la enumeracion para definir el item:
	 * CONSULTA_INDICE_PROPIETARIO.
	 */
	CONSULTA_INDICE_PROPIETARIO("CONSULTA_INDICE_PROPIETARIO"),
	/**
	 * Constante de la enumeracion para definir el item:
	 * CONSULTA_CERTIFICADOS_MEDIO_ELECTRONICO.
	 */
	CONSULTA_CERTIFICADOS_MEDIO_ELECTRONICO("CERTIFICADO MEDIOS ELECTRÓNICOS"),

	/**
	 * Constante de la enumeracion para definir el item:
	 * CONSULTA_INDICE_TITULARES_DERECHO.
	 */
	CONSULTA_INDICE_TITULARES_DERECHO("CONSULTA_INDICE_TITULARES_DERECHO");


	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo.
	 */
	private String is_codigo;

	/**
	 * Construye una nueva instancia/objeto de la clase EnumSubServicios.
	 *
	 * @param as_codigo el parametro codigo
	 */
	private EnumSubServicios(String as_codigo) {
		this.is_codigo = as_codigo;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see co.gov.supernotariado.bachue.sedeelectronica.common.enums.ICatalogable#
	 * getIs_codigo()
	 */
	@Override
	public String getIs_codigo() {
		return this.is_codigo;
	}
}

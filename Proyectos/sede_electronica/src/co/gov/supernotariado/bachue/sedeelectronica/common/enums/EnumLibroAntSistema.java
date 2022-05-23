/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: EnumLibroAntSistema.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.enums
 * Nombre del elemento: EnumLibroAntSistema
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.enums;

/**
 * Enumeracion para definir el grupo de constantes para Libro antiguo
 * sistema.(codigo, nombre) <br>
 * Enum que detalla los valores para los libros en el formulario de antiguo
 * sistema
 * 
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public enum EnumLibroAntSistema {

	/**
	 * Constante de la enumeracion para definir el item: CAUSAS_MORTUORIAS.
	 */
	CAUSAS_MORTUORIAS("CAUSAS_MORTUORIAS", "CAUSAS MORTUORIAS"),

	/**
	 * Constante de la enumeracion para definir el item: DEMANDAS.
	 */
	DEMANDAS("DEMANDAS", "DEMANDAS"),

	/**
	 * Constante de la enumeracion para definir el item: EMBARGOS.
	 */
	EMBARGOS("EMBARGOS", "EMBARGOS"),

	/**
	 * Constante de la enumeracion para definir el item: HIPOTECARIA.
	 */
	HIPOTECARIA("HIPOTECARIA", "HIPOTECARIA"),

	/**
	 * Constante de la enumeracion para definir el item: INDICES.
	 */
	INDICES("INDICES", "INDICES"),

	/**
	 * Constante de la enumeracion para definir el item: MATRICULAS.
	 */
	MATRICULAS("MATRICULAS", "MATRICULAS"),

	/**
	 * Constante de la enumeracion para definir el item: MEDIDAS_CAUTELARES.
	 */
	MEDIDAS_CAUTELARES("MEDIDAS_CAUTELARES", "MEDIDAS CAUTELARES"),

	/**
	 * Constante de la enumeracion para definir el item: PATRIMONIO.
	 */
	PATRIMONIO("PATRIMONIO", "PATRIMONIO"),

	/**
	 * Constante de la enumeracion para definir el item: PRENDA_AGRARIA.
	 */
	PRENDA_AGRARIA("PRENDA_AGRARIA", "PRENDA AGRARIA"),

	/**
	 * Constante de la enumeracion para definir el item: PRIMERO.
	 */
	PRIMERO("PRIMERO", "PRIMERO"),

	/**
	 * Constante de la enumeracion para definir el item: SEGUNDO.
	 */
	SEGUNDO("SEGUNDO", "SEGUNDO");

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo.
	 */
	private String is_codigo;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nombre.
	 */
	private String is_nombre;

	/**
	 * Construye una nueva instancia/objeto de la clase EnumLibroAntSistema.
	 *
	 * @param as_codigo el parametro codigo
	 * @param as_nombre el parametro nombre
	 */
	private EnumLibroAntSistema(String as_codigo, String as_nombre) {
		this.is_codigo = as_codigo;
		this.is_nombre = as_nombre;
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
	 * Obtiene el valor para la propiedad nombre.
	 *
	 * @return El valor de la propiedad nombre
	 */
	public String getIs_nombre() {
		return is_nombre;
	}
}

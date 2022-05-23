/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: EnumLibroAntiguoSistema.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.enums
 * Nombre del elemento: EnumLibroAntiguoSistema
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.enums;

import java.util.ArrayList;
import java.util.List;

/**
 * Enumeracion para definir el grupo de constantes para Libro antiguo sistema.
 * (codigo, nombre, parametro)<br>
 * Enum que contiene los posibles libros de antiguo sistema
 * 
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public enum EnumLibroAntiguoSistema {

	/**
	 * Constante de la enumeracion para definir el item: EMBARGOS.
	 */
	EMBARGOS("Embargos", "1", "EMBARGOS"),
	/**
	 * Constante de la enumeracion para definir el item: MEDIDAS_CAUTELARES.
	 */
	MEDIDAS_CAUTELARES("Medidas_cautelares", "2", "MEDIDAS_CAUTELARES"),

	/**
	 * Constante de la enumeracion para definir el item: CAUSAS_MORTUORIAS.
	 */
	CAUSAS_MORTUORIAS("Causas Mortuorias", "3", "CAUSAS_MORTUORIAS"),
	/**
	 * Constante de la enumeracion para definir el item: HIPOTECARIA.
	 */
	HIPOTECARIA("Hipotecaria", "4", "HIPOTECARIA"),

	/**
	 * Constante de la enumeracion para definir el item: PRENDA_AGRARIA.
	 */
	PRENDA_AGRARIA("Prenda Agraria", "5", "PRENDA_AGRARIA"),
	/**
	 * Constante de la enumeracion para definir el item: PATRIMONIO.
	 */
	PATRIMONIO("Patrimonio", "6", "PATRIMONIO"),

	/**
	 * Constante de la enumeracion para definir el item: DEMANDAS.
	 */
	DEMANDAS("Demandas", "7", "DEMANDAS"),
	/**
	 * Constante de la enumeracion para definir el item: INDICES.
	 */
	INDICES("Indices", "8", "INDICES"),
	/**
	 * Constante de la enumeracion para definir el item: PRIMERO.
	 */
	PRIMERO("Primero", "9", "PRIMERO"),

	/**
	 * Constante de la enumeracion para definir el item: SEGUNDO.
	 */
	SEGUNDO("Segundo", "10", "SEGUNDO"),
	/**
	 * Constante de la enumeracion para definir el item: MATRICULAS.
	 */
	MATRICULAS("Matriculas", "11", "MATRICULAS"),

	/**
	 * Constante de la enumeracion para definir el item: TESTAMENTOS.
	 */
	TESTAMENTOS("Testamentos", "12", "TESTAMENTOS");

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nombre.
	 */
	private final String is_nombre;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo.
	 */
	private final String is_codigo;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * parametro.
	 */
	private final String is_parametro;

	/**
	 * Construye una nueva instancia/objeto de la clase EnumLibroAntiguoSistema.
	 *
	 * @param as_nombre    el parametro nombre
	 * @param as_codigo    el parametro codigo
	 * @param as_parametro el parametro parametro
	 */
	private EnumLibroAntiguoSistema(String as_nombre, String as_codigo, String as_parametro) {
		this.is_nombre = as_nombre;
		this.is_codigo = as_codigo;
		this.is_parametro = as_parametro;
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
	 * Obtiene el valor para la propiedad codigo.
	 *
	 * @return El valor de la propiedad codigo
	 */
	public String getIs_codigo() {
		return is_codigo;
	}

	/**
	 * Obtiene el valor para la propiedad parametro.
	 *
	 * @return El valor de la propiedad parametro
	 */
	public String getIs_parametro() {
		return is_parametro;
	}

	/**
	 * Consultar libros.
	 *
	 * @return Resultado para consultar libros retornado como una lista de
	 *         EnumLibroAntiguoSistema
	 */
	public static List<EnumLibroAntiguoSistema> consultarLibros() {
		List<EnumLibroAntiguoSistema> llelas_listaEnumLibroAntSistema = new ArrayList<>();
		for (EnumLibroAntiguoSistema lelas_listaEnumLibroAntSistema : EnumLibroAntiguoSistema.values()) {
			llelas_listaEnumLibroAntSistema.add(lelas_listaEnumLibroAntSistema);
		}
		return llelas_listaEnumLibroAntSistema;
	}

	/**
	 * Consultar codigo.
	 *
	 * @param as_parametro el parametro parametro
	 * @return Resultado para consultar codigo retornado como String
	 */
	public static String consultarCodigo(String as_parametro) {
		for (EnumLibroAntiguoSistema lelas_libroEstado : EnumLibroAntiguoSistema.values()) {
			if (lelas_libroEstado.getIs_parametro().equals(as_parametro))
				as_parametro = lelas_libroEstado.is_codigo;
		}
		return as_parametro;
	}
}

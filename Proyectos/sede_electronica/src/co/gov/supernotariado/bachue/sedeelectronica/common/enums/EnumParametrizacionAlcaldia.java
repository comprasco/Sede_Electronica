/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: EnumParametrizacionAlcaldia.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.enums
 * Nombre del elemento: EnumParametrizacionAlcaldia
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.enums;

/**
 * Enumeracion para definir el grupo de constantes para Parametrizacion
 * alcaldia. <br>
 * Enum que contiene campos de parametrizacion de alcaldias
 * 
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public enum EnumParametrizacionAlcaldia {

	/**
	 * Constante de la enumeracion para definir el item: CHIP.
	 */
	CHIP("chip", false),

	/**
	 * Constante de la enumeracion para definir el item: CLAVE.
	 */
	CLAVE("clave", false),

	/**
	 * Constante de la enumeracion para definir el item: CODIGO_DEPARTAMENTO.
	 */
	CODIGO_DEPARTAMENTO("codigoDepartamento", true),

	/**
	 * Constante de la enumeracion para definir el item: CODIGO_MUNICIPIO.
	 */
	CODIGO_MUNICIPIO("codigoMunicipio", true),

	/**
	 * Constante de la enumeracion para definir el item: CODIGO_NOTARIA.
	 */
	CODIGO_NOTARIA("codigoNotaria", true),

	/**
	 * Constante de la enumeracion para definir el item: DIRECCION.
	 */
	DIRECCION("direccion", false),

	/**
	 * Constante de la enumeracion para definir el item: ENTIDAD.
	 */
	ENTIDAD("entidad", false),

	/**
	 * Constante de la enumeracion para definir el item: ENTIDAD_CERTIFICADORA.
	 */
	ENTIDAD_CERTIFICADORA("entidadCertificadora", false),

	/**
	 * Constante de la enumeracion para definir el item: ID_PERSONA.
	 */
	ID_PERSONA("idPersona", true),

	/**
	 * Constante de la enumeracion para definir el item: IMPUESTO.
	 */
	IMPUESTO("impuesto", false),

	/**
	 * Constante de la enumeracion para definir el item: IP.
	 */
	IP("ip", true),

	/**
	 * Constante de la enumeracion para definir el item: NUMERO_MATRICULA.
	 */
	NUMERO_MATRICULA("numeroMatricula", false),

	/**
	 * Constante de la enumeracion para definir el item: PDF.
	 */
	PDF("pdf", false),

	/**
	 * Constante de la enumeracion para definir el item: REFERENCIA_CATASTARAL.
	 */
	REFERENCIA_CATASTARAL("referenciaCatastral", false),

	/**
	 * Constante de la enumeracion para definir el item: USUARIO.
	 */
	USUARIO("usuario", false);

	/**
	 * Atributo String que indica el codigo de la base de datos del parametro.
	 */
	private String is_propiedad;

	/**
	 * Atributo booleano que indica si el valor del servicio debe ser llenado por
	 * aplicacion.
	 */
	private Boolean ib_aplicacion;

	/**
	 * Construye una nueva instancia/objeto de la clase EnumParametrizacionAlcaldia.
	 *
	 * @param as_propiedad  el parametro propiedad
	 * @param ab_aplicacion el parametro aplicacion
	 */
	private EnumParametrizacionAlcaldia(String as_propiedad, Boolean ab_aplicacion) {
		this.is_propiedad = as_propiedad;
		this.ib_aplicacion = ab_aplicacion;
	}

	/**
	 * Obtiene el valor para la propiedad propiedad.
	 *
	 * @return El valor de la propiedad propiedad
	 */
	public String getIs_propiedad() {
		return is_propiedad;
	}

	/**
	 * Obtiene el valor para la propiedad aplicacion.
	 *
	 * @return El valor de la propiedad aplicacion
	 */
	public Boolean getIb_aplicacion() {
		return ib_aplicacion;
	}

}

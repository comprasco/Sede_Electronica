/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: EnumTipoDatosBasicoMatricula.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.enums
 * Nombre del elemento: EnumTipoDatosBasicoMatricula
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.enums;

/**
 * Enumeracion para definir el grupo de constantes para Tipo datos basico
 * matricula. <br>
 * Enum que contiene las modalidades para consultar los datos basicos de la
 * matricula
 * 
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public enum EnumTipoDatosBasicoMatricula implements ICatalogable {

	/**
	 * Constante de la enumeracion para definir el item: MATRICULA.
	 */
	MATRICULA("MATRICULA_DB"),

	/**
	 * Constante de la enumeracion para definir el item: PREDIAL.
	 */
	PREDIAL("PREDIAL_DB"),

	/**
	 * Constante de la enumeracion para definir el item: PREDIAL_ANTIGUA.
	 */
	PREDIAL_ANTIGUA("PREDIAL_ANTIGUA_DB"),

	/**
	 * Constante de la enumeracion para definir el item: NUPRE.
	 */
	NUPRE("NUPRE_DB"),

	/**
	 * Constante de la enumeracion para definir el item: NUM_DOC_CC.
	 */
	NUM_DOC_CC("NUM_DOCUMENTO_CC_DB"),

	/**
	 * Constante de la enumeracion para definir el item: NUM_DOC_CE.
	 */
	NUM_DOC_CE("NUM_DOCUMENTO_CE_DB"),

	/**
	 * Constante de la enumeracion para definir el item: NUM_DOC_NUIP.
	 */
	NUM_DOC_NUIP("NUM_DOCUMENTO_NUIP_DB"),

	/**
	 * Constante de la enumeracion para definir el item: NUM_DOC_PA.
	 */
	NUM_DOC_PA("NUM_DOCUMENTO_PA_DB"),

	/**
	 * Constante de la enumeracion para definir el item: NUM_DOC_TI.
	 */
	NUM_DOC_TI("NUM_DOCUMENTO_TI_DB"),

	/**
	 * Constante de la enumeracion para definir el item: NUM_DOC_NIT.
	 */
	NUM_DOC_NIT("NUM_DOCUMENTO_NIT_DB"),

	/**
	 * Constante de la enumeracion para definir el item: NOMBRES.
	 */
	NOMBRES("NOMBRES_DB"),

	/**
	 * Constante de la enumeracion para definir el item: RAZON_SOCIAL.
	 */
	RAZON_SOCIAL("RAZON_SOCIAL_DB"),

	/**
	 * Constante de la enumeracion para definir el item: DIRECCION.
	 */
	DIRECCION("DIRECCION_DB");

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo.
	 */
	private String is_codigo;

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * EnumTipoDatosBasicoMatricula.
	 *
	 * @param as_codigo el parametro codigo
	 */
	private EnumTipoDatosBasicoMatricula(String as_codigo) {
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
		return is_codigo;
	}
}

/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: EnumTipoDocumento.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.enums
 * Nombre del elemento: EnumTipoDocumento
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.enums;

import java.util.ArrayList;
import java.util.List;

/**
 * Enumeracion para definir el grupo de constantes para Tipo documento. <br>
 * Enum que contiene los tipos de documentos disponibles en la plataforma
 * 
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public enum EnumTipoDocumento implements ICatalogable {

	/**
	 * Constante de la enumeracion para definir el item: CEDULA_CIUDADANIA.
	 */
	CEDULA_CIUDADANIA("CC", "Cedula Ciudadania"),

	/**
	 * Constante de la enumeracion para definir el item: CEDULA_EXTRANJERIA.
	 */
	CEDULA_EXTRANJERIA("CE", "Cedula de extranjeria"),

	/**
	 * Constante de la enumeracion para definir el item: NIT.
	 */
	NIT("NIT", "Número de Identificación Tributaria"),

	/**
	 * Constante de la enumeracion para definir el item: PASAPORTE.
	 */
	PASAPORTE("PS", "Pasaporte"),

	/**
	 * Constante de la enumeracion para definir el item: SECUENCIA.
	 */
	SECUENCIA("SE", "Secuencia"),

	/**
	 * Constante de la enumeracion para definir el item: NUIP.
	 */
	NUIP("NUIP", "Número Único de Identificación Personal"),

	/**
	 * Constante de la enumeracion para definir el item: CODIGO_UNICO.
	 */
	CODIGO_UNICO("CU", "Código Único");

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo.
	 */
	private final String is_codigo;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nombre tipo documento.
	 */
	private final String is_nombreTipoDocumento;

	/**
	 * Construye una nueva instancia/objeto de la clase EnumTipoDocumento.
	 *
	 * @param as_idTipoDocumento     el parametro id tipo documento
	 * @param as_nombreTipoDocumento el parametro nombre tipo documento
	 */
	private EnumTipoDocumento(String as_idTipoDocumento, String as_nombreTipoDocumento) {
		this.is_codigo = as_idTipoDocumento;
		this.is_nombreTipoDocumento = as_nombreTipoDocumento;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see co.gov.supernotariado.bachue.sedeelectronica.common.enums.ICatalogable#
	 * getIs_codigo()
	 */
	public String getIs_codigo() {
		return is_codigo;
	}

	/**
	 * Obtiene el valor para la propiedad nombre tipo documento.
	 *
	 * @return El valor de la propiedad nombre tipo documento
	 */
	public String getIs_nombreTipoDocumento() {
		return is_nombreTipoDocumento;
	}

	/**
	 * Genera una lista de todos los tipos de documento asociados con entidad
	 * especial.
	 *
	 * @return Resultado para consultar tipo documento entidad especial retornado
	 *         como una lista de EnumTipoDocumento
	 */
	public static List<EnumTipoDocumento> consultarTipoDocumentoEntidadEspecial() {
		List<EnumTipoDocumento> lletd_tiposEntidadEspecial = new ArrayList<>();

		lletd_tiposEntidadEspecial.add(EnumTipoDocumento.CEDULA_CIUDADANIA);
		lletd_tiposEntidadEspecial.add(EnumTipoDocumento.NIT);
		lletd_tiposEntidadEspecial.add(EnumTipoDocumento.CODIGO_UNICO);
		lletd_tiposEntidadEspecial.add(EnumTipoDocumento.CEDULA_EXTRANJERIA);

		return lletd_tiposEntidadEspecial;
	}

	/**
	 * Genera una lista de todos los tipos de documento asociados a un representante
	 * legal cuenta cupo.
	 *
	 * @return Resultado para consultar tipo documento representante legal cuenta
	 *         cupo retornado como una lista de EnumTipoDocumento
	 */
	public static List<EnumTipoDocumento> consultarTipoDocumentoRepresentanteLegalCC() {
		List<EnumTipoDocumento> lletd_tiposEntidadEspecial = new ArrayList<>();

		lletd_tiposEntidadEspecial.add(EnumTipoDocumento.CEDULA_CIUDADANIA);
		lletd_tiposEntidadEspecial.add(EnumTipoDocumento.CEDULA_EXTRANJERIA);
		lletd_tiposEntidadEspecial.add(EnumTipoDocumento.PASAPORTE);

		return lletd_tiposEntidadEspecial;
	}

	/**
	 * Metodo que confirma la existencia de un tipo de documento en la lista de
	 * entidades especiales.
	 *
	 * @param as_idTipoDocumento el parametro id tipo documento
	 * @return true, si se cumple o la accion se realiza exitosamente, false en caso
	 *         contrario.
	 */
	public static Boolean consultarTipoDocumentoEntidadEspecial(String as_idTipoDocumento) {
		List<EnumTipoDocumento> lletd_tiposEntidadEspecial = consultarTipoDocumentoEntidadEspecial();
		Boolean lb_estado = false;

		for (EnumTipoDocumento letd_enumTipoDocumento : lletd_tiposEntidadEspecial) {
			if (letd_enumTipoDocumento.getIs_codigo().equals(as_idTipoDocumento)) {
				lb_estado = true;
			}
		}
		return lb_estado;
	}

	/**
	 * Metodo queconfirma la existencia de un tipo de documento en la lista de
	 * representante legal cuenta cupo.
	 *
	 * @param as_idTipoDocumento el parametro id tipo documento
	 * @return true, si se cumple o la accion se realiza exitosamente, false en caso
	 *         contrario.
	 */
	public static Boolean consultarTipoDocumentoRepresentanteLegalCC(String as_idTipoDocumento) {
		List<EnumTipoDocumento> lletd_tiposEntidadEspecial = consultarTipoDocumentoRepresentanteLegalCC();
		Boolean lb_estado = false;

		for (EnumTipoDocumento letd_enumTipoDocumento : lletd_tiposEntidadEspecial) {
			if (letd_enumTipoDocumento.getIs_codigo().equals(as_idTipoDocumento)) {
				lb_estado = true;
			}
		}
		return lb_estado;
	}
}

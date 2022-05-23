/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: EnumTipoServicio.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.enums
 * Nombre del elemento: EnumTipoServicio
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.enums;

import java.util.ArrayList;
import java.util.List;

/**
 * Enumeracion para definir el grupo de constantes para Tipo servicio. <br>
 * Enum que contiene los tipos de servicios para consultar en la base de datos
 * los detalles de catalogos, consultar nombres legibles y hacer comparaciones
 * de servicios.
 * 
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public enum EnumTipoServicio implements ICatalogable {

	/**
	 * Constante de la enumeracion para definir el item: ALERTA.
	 */
	ALERTA("REGISTRO_ALERTA", "REGISTRO DE ALERTAS"),

	/**
	 * Constante de la enumeracion para definir el item: CERTIFICADO.
	 */
	CERTIFICADO("CERTIFICADO", "CERTIFICADOS"),

	/**
	 * Constante de la enumeracion para definir el item: CONSULTA.
	 */
	CONSULTA("CONSULTA", "CONSULTAS"),

	/**
	 * Constante de la enumeracion para definir el item: COPIA.
	 */
	COPIA("COPIA_VIRTUAL", "COPIAS"),

	/**
	 * Constante de la enumeracion para definir el item: RECARGA_CUENTA_CUPO.
	 */
	RECARGA_CUENTA_CUPO("RECARGA", "RECARGA CUENTA CUPO"),

	/**
	 * Constante de la enumeracion para definir el item: SOLICITUD_CUENTA_CUPO.
	 */
	SOLICITUD_CUENTA_CUPO("SOLICITUD_CUENTA_CUPO", "CREAR SOLICITUD CUENTA CUPO"),
	
	INTERPOSICION_RECURSOS("INTERPOSICION_RECURSOS", "INTERPOSICION RECURSOS"),
	
	TRASLADO_MATRICULA("TRASLADO_MATRICULA","TRASLADO MATRICULA"),
	
	SOLICITUD_SUSPENSION("SOLICITUD_SUSPENSION_TEMPORAL","SOLICITUD SUSPENSION_TEMPORAL"),
	
	SOLICITUD_DESISTIMIENTO("SOLICITUD_DESISTIMIENTO", "SOLICITUD DESISTIMIENTO"),
	
	SOLICITUD_PRORROGA("SOLICITUD_PRORROGA", "SOLICITUD PRORROGA"),
	
	RECEPCION("RECEPCION", "RECEPCION"),
	;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo.
	 */
	private String is_codigo;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nombre legible.
	 */
	private String is_nombreLegible;

	/**
	 * Construye una nueva instancia/objeto de la clase EnumTipoServicio.
	 *
	 * @param as_codigo        el parametro codigo
	 * @param as_nombreLegible el parametro nombre legible
	 */
	private EnumTipoServicio(String as_codigo, String as_nombreLegible) {
		this.is_codigo = as_codigo;
		this.is_nombreLegible = as_nombreLegible;
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
	 * Obtiene el valor para la propiedad nombre legible.
	 *
	 * @return El valor de la propiedad nombre legible
	 */
	public String getIs_nombreLegible() {
		return is_nombreLegible;
	}

	/**
	 * Metodo que crea una lista de enumTipoServicio con todos los enum creados.
	 *
	 * @return List<EnumTipoServicio> trae todos los enumTipoServicio en una lista
	 */
	public static List<EnumTipoServicio> consultarServicios() {
		List<EnumTipoServicio> lets_listaEnumTipoServicio = new ArrayList<>();
		for (EnumTipoServicio lets_enumTipoServicio : EnumTipoServicio.values()) {
			lets_listaEnumTipoServicio.add(lets_enumTipoServicio);
		}
		return lets_listaEnumTipoServicio;
	}

}

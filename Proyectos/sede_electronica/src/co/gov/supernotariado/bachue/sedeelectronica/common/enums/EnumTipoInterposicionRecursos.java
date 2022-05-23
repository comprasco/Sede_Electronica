/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: EnumTipoInterposicionRecursos.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.enums
 * Nombre del elemento: EnumTipoInterposicionRecursos
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.enums;

import java.util.ArrayList;
import java.util.List;

/**
 * Enumeracion para definir el grupo de constantes para Tipo interposicion recursos. <br>
 * Enum que aloja tipos de interposicion recursos
 * 
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public enum EnumTipoInterposicionRecursos {

	/**
	 * Constante de la enumeracion para definir el item: RECURSO_REPOSICION.
	 */		 
	RECURSO_REPOSICION("Recurso Reposicion","recurso.reposicion"),
	
	/**
	 * Constante de la enumeracion para definir el item: RECURSO_REPOSICION_SUBSIDIO.
	 */
	RECURSO_REPOSICION_SUBSIDIO("Recurso de Reposicion con Subsidio de Apelacion","recurso.reposicion.subsidio"),
	
	/**
	 * Constante de la enumeracion para definir el item: APELACION.
	 */	
	APELACION("Apelacion","apelacion"),
	
	/**
	 * Constante de la enumeracion para definir el item: QUEJA.
	 */
	QUEJA("Queja","queja"),
	
	/**
	 * Constante de la enumeracion para definir el item: DESISTIMIENTO.
	 */
	DESISTIMIENTO("Solicitud de desistimiento de recurso","desistimiento"),
	;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * recurso.
	 */
	private final String is_recurso;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo.
	 */
	private final String is_codigo;
	
	/**
	 * Construye una nueva instancia/objeto de la clase EnumTipoInterposicionRecursos.
	 *
	 * @param as_codigo        el parametro codigo
	 * @param as_resource      el parametro resource
	 */
	private EnumTipoInterposicionRecursos(String as_codigo,String as_resource){
		this.is_recurso = as_resource;
		this.is_codigo = as_codigo;
	}

	/**
	 * Consultar recurso
	 * 
	 * @return Resultado para consultar recurso retornado como String
	 */
	public String getIs_recurso() {
		return is_recurso;
	}

	/**
	 * Consultar codigo
	 * 
	 * @return Resultado para consultar codigo retornado como String
	 */
	public String getIs_codigo() {
		return is_codigo;
	}
	
	/**
	 * Genera una lista de los tipos de interesados para seleccionar.
	 *
	 * @return Resultado para consultar tipo interesado retornado como una lista de
	 *         EnumTipoInteresado
	 */
	public static List<EnumTipoInterposicionRecursos> consultarInterposicionRecursos(){
		List<EnumTipoInterposicionRecursos> lleti_listaTiposInterposicionRecursos = new ArrayList<>();
		for (EnumTipoInterposicionRecursos letir_enumInteresado : EnumTipoInterposicionRecursos.values()) {
			lleti_listaTiposInterposicionRecursos.add(letir_enumInteresado);
		}
		return lleti_listaTiposInterposicionRecursos;
	}
	
}

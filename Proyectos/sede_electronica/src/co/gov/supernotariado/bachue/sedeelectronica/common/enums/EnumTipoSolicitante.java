/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: EnumTipoSolicitante.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.enums
 * Nombre del elemento: EnumTipoSolicitante
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.enums;

import java.util.ArrayList;
import java.util.List;

/**
 * Enumeracion para definir el grupo de constantes para Tipo interesados. <br>
 * Enum que aloja tipos de excepcion y detalles del mismo
 * 
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public enum EnumTipoSolicitante {

	/**
	 * Constante de la enumeracion para definir el item: APOREDADO.
	 */
	APODERADO("1","APODERADO","wizardsolicitudConsultas.datos.individual.condiciones.apoderado"),
	
	/**
	 * Constante de la enumeracion para definir el item: INTERESADO.
	 */
	FUNCIONARIO("2","FUNCIONARIO","wizardsolicitudConsultas.datos.individual.condiciones.funcionario"),
	
	/**
	 * Constante de la enumeracion para definir el item: INTERESADO.
	 */
	INTERESADO("3","INTERESADO","wizardsolicitudConsultas.datos.individual.condiciones.interesado"),
	
	/**
	 * Constante de la enumeracion para definir el item: INTERESADO.
	 */
	INTERVINIENTE("4","INTERVINIENTE","wizardsolicitudConsultas.datos.individual.condiciones.interviniente"),
	
	/**
	 * Constante de la enumeracion para definir el item: INTERESADO.
	 */
	TERCERO("5","TERCERO","wizardsolicitudConsultas.datos.individual.condiciones.tercero"),
	
	/**
	 * Constante de la enumeracion para definir el item: INTERESADO.
	 */
	AGENTE_OFICIOSO("6","AGENTE OFICIOSO","wizardsolicitudConsultas.datos.individual.condiciones.agente"),
	
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
	
	private final String is_nombre;
	
	/**
	 * Construye una nueva instancia/objeto de la clase EnumTipoSolicitante.
	 *
	 * @param as_codigo        el parametro codigo
	 * @param as_resource      el parametro resource
	 */
	private EnumTipoSolicitante(String as_codigo,String as_nombre,String as_resource){
		this.is_recurso = as_resource;
		this.is_nombre = as_nombre;
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
	
	public String getIs_nombre() {
		return is_nombre;
	}
	
	/**
	 * Genera una lista de los tipos de interesados para seleccionar.
	 *
	 * @return Resultado para consultar tipo interesado retornado como una lista de
	 *         EnumTipoSolicitante
	 */
	public static List<EnumTipoSolicitante> consultarTipoInteresado(){
		List<EnumTipoSolicitante> llets_listaTiposInteresado = new ArrayList<>();
		for (EnumTipoSolicitante lets_enumInteresado : EnumTipoSolicitante.values()) {
			llets_listaTiposInteresado.add(lets_enumInteresado);
		}
		return llets_listaTiposInteresado;
	}
	
	/**
	 * Genera una lista de los tipos de solicitante para interposicion recursos
	 * 
	 * @return Resultado para consultar tipo interesado retornado como una lista de
	 *         EnumTipoSolicitante
	 */
	public static List<EnumTipoSolicitante> consultarTipoSolicitanteRecurso(){
		List<EnumTipoSolicitante> llets_listaTiposInteresado = new ArrayList<>();
		llets_listaTiposInteresado.add(APODERADO);
		llets_listaTiposInteresado.add(INTERESADO);
		return llets_listaTiposInteresado;
	}
	
	/**
	 * Genera una lista de los tipos de solicitante para suspension
	 * 
	 * @return Resultado para consultar tipo interesado retornado como una lista de
	 *         EnumTipoSolicitante
	 */
	public static List<EnumTipoSolicitante> consultarTipoSolicitanteSuspension(){
		List<EnumTipoSolicitante> llets_listaTiposInteresado = new ArrayList<>();
		llets_listaTiposInteresado.add(APODERADO);
		llets_listaTiposInteresado.add(INTERESADO);
		return llets_listaTiposInteresado;
	}
	
	/**
	 * Genera una lista de los tipos de solicitante para desistimiento
	 * 
	 * @return Resultado para consultar tipo interesado retornado como una lista de
	 *         EnumTipoSolicitante
	 */
	public static List<EnumTipoSolicitante> consultarTipoSolicitanteDesistimiento(){
		List<EnumTipoSolicitante> llets_listaTiposInteresado = new ArrayList<>();
		llets_listaTiposInteresado.add(APODERADO);
		llets_listaTiposInteresado.add(INTERESADO);
		return llets_listaTiposInteresado;
	}
	
	/**
	 * Genera una lista de los tipos de solicitante para traslado matricula
	 * 
	 * @return Resultado para consultar tipo interesado retornado como una lista de
	 *         EnumTipoSolicitante
	 */
	public static List<EnumTipoSolicitante> consultarTipoSolicitanteTraslado(){
		List<EnumTipoSolicitante> llets_listaTiposInteresado = new ArrayList<>();
		llets_listaTiposInteresado.add(APODERADO);
		llets_listaTiposInteresado.add(INTERVINIENTE);
		return llets_listaTiposInteresado;
	}
	
}

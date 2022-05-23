package co.gov.supernotariado.bachue.sedeelectronica.common.enums;

import java.util.ArrayList;
import java.util.List;

/**
 * Enumeracion para definir el grupo de constantes para Estado poder. <br>
 * Enum que contiene estados posibles de la columna activo de poder
 * 
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public enum EnumUsosPoder {

	USO_TOTAL("USO_TOTAL","uso.total"),
	USO_PARCIAL("USO_PARCIAL","uso.parcial"),
	REVOCATORIA_PARCIAL("REVOCATORIA_PARCIAL","revocatoria.parcial"),
	REVOCATORIA_TOTAL("REVOCATORIA_TOTAL","revocatoria.total"),
	SUSTITUCION("SUSTITUCION","sustitucion"),
	RENUNCIA_PARCIAL("RENUNCIA_PARCIAL","renuncia.parcial"),
	RENUNCIA_TOTAL("RENUNCIA_TOTAL","renuncia.total"),
	SOLICITUD_ANULACION("SOLICITUD_ANULACION","anulacion"),
	SOLICITUD_CORRECCION("SOLICITUD_CORRECCION","correccion"),
	;
	private String is_codigo;
	private String is_nombreVisible;
	
	private EnumUsosPoder(String as_codigo, String as_nombreVisible) {
		this.is_codigo = as_codigo;
		this.is_nombreVisible = as_nombreVisible;
	}

	public String getIs_codigo() {
		return is_codigo;
	}

	public String getIs_nombreVisible() {
		return is_nombreVisible;
	}
	
	/**
	 * Metodo que se encarga de listar todos los usos de poder
	 * 
	 * @return List<EnumUsosPoder> lista con todos los usos de poder para realizar
	 */
	public static List<EnumUsosPoder> consultarUsosPoder(){
		List<EnumUsosPoder> lleup_listaEnumEstadoPoder = new ArrayList<>();
		for(EnumUsosPoder leup_enumEstadoPoder :EnumUsosPoder.values()) {
			lleup_listaEnumEstadoPoder.add(leup_enumEstadoPoder);
		}
		return lleup_listaEnumEstadoPoder;
	}
	
	/**
	 * Metodo que se encarga de consultar un uso de poder por su codigo
	 * 
	 * @param is_codigo codigo del enum usos poder
	 * @return EnumUsosPoder enum del uso poder buscado
	 */
	public static EnumUsosPoder consultarUsosPoder(String is_codigo){
		for(EnumUsosPoder leup_enumEstadoPoder :EnumUsosPoder.values()) {
			if (is_codigo.equals(leup_enumEstadoPoder.getIs_codigo())) {
				return leup_enumEstadoPoder;
			}
		}
		return null;
	}
	
	/**
	 * Metodo que se encarga de sacar cuales son los usos de poder que no pueden haber sido generados para una revocatoria parcial
	 * 
	 * @return List<EnumUsosPoder> lista de usos de poder que no deben de haber sido realizados para poder hacer una revocatoria parcial
	 */
	public static List<EnumUsosPoder> consultarLimitantesRevocatoriaParcial(){
		List<EnumUsosPoder> lleup_listaUsosPoder = new ArrayList<>();
		lleup_listaUsosPoder.add(SOLICITUD_ANULACION);
		lleup_listaUsosPoder.add(USO_TOTAL);
		lleup_listaUsosPoder.add(SUSTITUCION);
		lleup_listaUsosPoder.add(RENUNCIA_TOTAL);
		return lleup_listaUsosPoder;
	}
	
	/**
	 * Metodo que se encarga de sacar cuales son los usos de poder que no pueden haber sido generados para una sustitucion
	 * 
	 * @return List<EnumUsosPoder> lista de usos de poder que no deben de haber sido realizados para poder hacer una sustitucion
	 */
	public static List<EnumUsosPoder> consultarLimitantesSustitucion(){
		List<EnumUsosPoder> lleup_listaUsosPoder = new ArrayList<>();
		lleup_listaUsosPoder.add(SOLICITUD_ANULACION);
		lleup_listaUsosPoder.add(USO_TOTAL);
		lleup_listaUsosPoder.add(REVOCATORIA_TOTAL);
		lleup_listaUsosPoder.add(RENUNCIA_TOTAL);
		return lleup_listaUsosPoder;
	}
	
	/**
	 * Metodo que se encarga de sacar cuales son los usos de poder que no pueden haber sido generados para una renuncia total
	 * 
	 * @return List<EnumUsosPoder> lista de usos de poder que no deben de haber sido realizados para poder hacer una renuncia total
	 */
	public static List<EnumUsosPoder> consultarLimitantesRenunciaTotal(){
		List<EnumUsosPoder> lleup_listaUsosPoder = new ArrayList<>();
		lleup_listaUsosPoder.add(SOLICITUD_ANULACION);
		lleup_listaUsosPoder.add(USO_TOTAL);
		lleup_listaUsosPoder.add(REVOCATORIA_TOTAL);
		return lleup_listaUsosPoder;
	}
}

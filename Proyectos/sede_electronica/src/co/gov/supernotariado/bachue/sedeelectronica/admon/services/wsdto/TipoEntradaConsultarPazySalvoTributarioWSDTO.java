/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: TipoEntradaConsultarPazySalvoTributarioWSDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto
 * Nombre del elemento: TipoEntradaConsultarPazySalvoTributarioWSDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.GenericoDTO;

/**
 * Clase tipo objeto de transferencia de datos para web service (WSDTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y servicios web.
 * <br>
 * Contiene propiedades para representar los datos del objeto Tipo entrada
 * consultar pazy salvo tributario.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoEntradaConsultarPazySalvoTributarioWSDTO extends GenericoDTO {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * entidad certificadora.
	 */
	private String is_entidadCertificadora;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * entidad.
	 */
	private String is_entidad;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * usuario.
	 */
	private String is_usuario;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * clave.
	 */
	private String is_clave;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo departamento.
	 */
	private String is_codigoDepartamento;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo municipio.
	 */
	private String is_codigoMunicipio;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo notaria.
	 */
	private String is_codigoNotaria;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * referencia catastral.
	 */
	private String is_referenciaCatastral;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * numero matricula.
	 */
	private String is_numeroMatricula;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * chip.
	 */
	private String is_chip;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * direccion.
	 */
	private String is_direccion;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * impuesto.
	 */
	private String is_impuesto;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * pdf.
	 */
	private String is_pdf;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * idpersona.
	 */
	private String is_idpersona;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad ip.
	 */
	private String is_ip;
	
	/**
	 * Obtiene el valor para la propiedad entidad certificadora.
	 *
	 * @return El valor de la propiedad entidad certificadora
	 */
	public String getIs_entidadCertificadora() {
		return is_entidadCertificadora;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad entidad certificadora.
	 *
	 * @param as_entidadCertificadora el nuevo valor para la propiedad entidad
	 *                                certificadora
	 */
	public void setIs_entidadCertificadora(String as_entidadCertificadora) {
		this.is_entidadCertificadora = as_entidadCertificadora;
	}
	
	/**
	 * Obtiene el valor para la propiedad entidad.
	 *
	 * @return El valor de la propiedad entidad
	 */
	public String getIs_entidad() {
		return is_entidad;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad entidad.
	 *
	 * @param as_entidad el nuevo valor para la propiedad entidad
	 */
	public void setIs_entidad(String as_entidad) {
		this.is_entidad = as_entidad;
	}
	
	/**
	 * Obtiene el valor para la propiedad usuario.
	 *
	 * @return El valor de la propiedad usuario
	 */
	public String getIs_usuario() {
		return is_usuario;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad usuario.
	 *
	 * @param as_usuario el nuevo valor para la propiedad usuario
	 */
	public void setIs_usuario(String as_usuario) {
		this.is_usuario = as_usuario;
	}
	
	/**
	 * Obtiene el valor para la propiedad clave.
	 *
	 * @return El valor de la propiedad clave
	 */
	public String getIs_clave() {
		return is_clave;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad clave.
	 *
	 * @param as_clave el nuevo valor para la propiedad clave
	 */
	public void setIs_clave(String as_clave) {
		this.is_clave = as_clave;
	}
	
	/**
	 * Obtiene el valor para la propiedad codigo departamento.
	 *
	 * @return El valor de la propiedad codigo departamento
	 */
	public String getIs_codigoDepartamento() {
		return is_codigoDepartamento;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad codigo departamento.
	 *
	 * @param as_codigoDepartamento el nuevo valor para la propiedad codigo
	 *                              departamento
	 */
	public void setIs_codigoDepartamento(String as_codigoDepartamento) {
		this.is_codigoDepartamento = as_codigoDepartamento;
	}
	
	/**
	 * Obtiene el valor para la propiedad codigo municipio.
	 *
	 * @return El valor de la propiedad codigo municipio
	 */
	public String getIs_codigoMunicipio() {
		return is_codigoMunicipio;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad codigo municipio.
	 *
	 * @param as_codigoMunicipio el nuevo valor para la propiedad codigo municipio
	 */
	public void setIs_codigoMunicipio(String as_codigoMunicipio) {
		this.is_codigoMunicipio = as_codigoMunicipio;
	}
	
	/**
	 * Obtiene el valor para la propiedad codigo notaria.
	 *
	 * @return El valor de la propiedad codigo notaria
	 */
	public String getIs_codigoNotaria() {
		return is_codigoNotaria;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad codigo notaria.
	 *
	 * @param as_codigoNotaria el nuevo valor para la propiedad codigo notaria
	 */
	public void setIs_codigoNotaria(String as_codigoNotaria) {
		this.is_codigoNotaria = as_codigoNotaria;
	}
	
	/**
	 * Obtiene el valor para la propiedad referencia catastral.
	 *
	 * @return El valor de la propiedad referencia catastral
	 */
	public String getIs_referenciaCatastral() {
		return is_referenciaCatastral;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad referencia catastral.
	 *
	 * @param as_referenciaCatastral el nuevo valor para la propiedad referencia
	 *                               catastral
	 */
	public void setIs_referenciaCatastral(String as_referenciaCatastral) {
		this.is_referenciaCatastral = as_referenciaCatastral;
	}
	
	/**
	 * Obtiene el valor para la propiedad numero matricula.
	 *
	 * @return El valor de la propiedad numero matricula
	 */
	public String getIs_numeroMatricula() {
		return is_numeroMatricula;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad numero matricula.
	 *
	 * @param as_numeroMatricula el nuevo valor para la propiedad numero matricula
	 */
	public void setIs_numeroMatricula(String as_numeroMatricula) {
		this.is_numeroMatricula = as_numeroMatricula;
	}
	
	/**
	 * Obtiene el valor para la propiedad chip.
	 *
	 * @return El valor de la propiedad chip
	 */
	public String getIs_chip() {
		return is_chip;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad chip.
	 *
	 * @param as_chip el nuevo valor para la propiedad chip
	 */
	public void setIs_chip(String as_chip) {
		this.is_chip = as_chip;
	}
	
	/**
	 * Obtiene el valor para la propiedad direccion.
	 *
	 * @return El valor de la propiedad direccion
	 */
	public String getIs_direccion() {
		return is_direccion;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad direccion.
	 *
	 * @param as_direccion el nuevo valor para la propiedad direccion
	 */
	public void setIs_direccion(String as_direccion) {
		this.is_direccion = as_direccion;
	}
	
	/**
	 * Obtiene el valor para la propiedad impuesto.
	 *
	 * @return El valor de la propiedad impuesto
	 */
	public String getIs_impuesto() {
		return is_impuesto;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad impuesto.
	 *
	 * @param as_impuesto el nuevo valor para la propiedad impuesto
	 */
	public void setIs_impuesto(String as_impuesto) {
		this.is_impuesto = as_impuesto;
	}
	
	/**
	 * Obtiene el valor para la propiedad pdf.
	 *
	 * @return El valor de la propiedad pdf
	 */
	public String getIs_pdf() {
		return is_pdf;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad pdf.
	 *
	 * @param as_pdf el nuevo valor para la propiedad pdf
	 */
	public void setIs_pdf(String as_pdf) {
		this.is_pdf = as_pdf;
	}
	
	/**
	 * Obtiene el valor para la propiedad idpersona.
	 *
	 * @return El valor de la propiedad idpersona
	 */
	public String getIs_idpersona() {
		return is_idpersona;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad idpersona.
	 *
	 * @param as_idpersona el nuevo valor para la propiedad idpersona
	 */
	public void setIs_idpersona(String as_idpersona) {
		this.is_idpersona = as_idpersona;
	}
	
	/**
	 * Obtiene el valor para la propiedad ip.
	 *
	 * @return El valor de la propiedad ip
	 */
	public String getIs_ip() {
		return is_ip;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad ip.
	 *
	 * @param as_ip el nuevo valor para la propiedad ip
	 */
	public void setIs_ip(String as_ip) {
		this.is_ip = as_ip;
	}
	
}
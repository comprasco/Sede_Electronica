/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: HistorialEnvioDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: HistorialEnvioDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

import java.util.Date;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Historial envio.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class HistorialEnvioDTO extends GenericoDTO { 
	
	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad id.
	 */
	// --- Atributos
	private String is_id;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * estereotipo creacion.
	 */
	private String is_estereotipoCreacion;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * estereotipo modificacion.
	 */
	private String is_estereotipoModificacion;
	
	/**
	 * Atributo de instancia tipo fecha para definir la propiedad fecha creacion.
	 */
	private Date id_fechaCreacion;
	
	/**
	 * Atributo de instancia tipo fecha para definir la propiedad fecha
	 * modificacion.
	 */
	private Date id_fechaModificacion;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad id
	 * usuario creacion.
	 */
	private String is_idUsuarioCreacion;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad id
	 * usuario modificacion.
	 */
	private String is_idUsuarioModificacion;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad ip
	 * creacion.
	 */
	private String is_ipCreacion;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad ip
	 * modificacion.
	 */
	private String is_ipModificacion;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * plantilla llena envio.
	 */
	private String is_plantillaLlenaEnvio;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * ultimo detalle.
	 */
	private String is_ultimoDetalle;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * ultimo estado.
	 */
	private String is_ultimoEstado;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * ultimo intento envio.
	 */
	private String is_ultimoIntentoEnvio;
	
	/**
	 * Atributo de instancia tipo ParametrizacionPlantillaDTO para definir la
	 * propiedad parametrizacion plantilla.
	 */
	private ParametrizacionPlantillaDTO ippd_parametrizacionPlantilla;

	/**
	 * Construye una nueva instancia/objeto de la clase HistorialEnvioDTO.
	 */
	// --- Constructor
	public HistorialEnvioDTO () {
		//Constructor vacio
	}

	/**
	 * Construye una nueva instancia/objeto de la clase HistorialEnvioDTO.
	 *
	 * @param as_id el parametro id
	 */
	public HistorialEnvioDTO (String as_id ) {
		this.is_id=as_id;

	}

	/**
	 * Obtiene el valor para la propiedad id.
	 *
	 * @return El valor de la propiedad id
	 */
	public String getIs_id() {
		return is_id;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad id.
	 *
	 * @param as_id el nuevo valor para la propiedad id
	 */
	public void setIs_id(String as_id) {
		this.is_id = as_id;
	}

	/**
	 * Obtiene el valor para la propiedad estereotipo creacion.
	 *
	 * @return El valor de la propiedad estereotipo creacion
	 */
	public String getIs_estereotipoCreacion() {
		return is_estereotipoCreacion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad estereotipo creacion.
	 *
	 * @param as_estereotipoCreacion el nuevo valor para la propiedad estereotipo
	 *                               creacion
	 */
	public void setIs_estereotipoCreacion(String as_estereotipoCreacion) {
		this.is_estereotipoCreacion = as_estereotipoCreacion;
	}

	/**
	 * Obtiene el valor para la propiedad estereotipo modificacion.
	 *
	 * @return El valor de la propiedad estereotipo modificacion
	 */
	public String getIs_estereotipoModificacion() {
		return is_estereotipoModificacion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad estereotipo modificacion.
	 *
	 * @param as_estereotipoModificacion el nuevo valor para la propiedad
	 *                                   estereotipo modificacion
	 */
	public void setIs_estereotipoModificacion(String as_estereotipoModificacion) {
		this.is_estereotipoModificacion = as_estereotipoModificacion;
	}

	/**
	 * Obtiene el valor para la propiedad fecha creacion.
	 *
	 * @return El valor de la propiedad fecha creacion
	 */
	public Date getId_fechaCreacion() {
		return id_fechaCreacion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad fecha creacion.
	 *
	 * @param ad_fechaCreacion el nuevo valor para la propiedad fecha creacion
	 */
	public void setId_fechaCreacion(Date ad_fechaCreacion) {
		this.id_fechaCreacion = ad_fechaCreacion;
	}

	/**
	 * Obtiene el valor para la propiedad fecha modificacion.
	 *
	 * @return El valor de la propiedad fecha modificacion
	 */
	public Date getId_fechaModificacion() {
		return id_fechaModificacion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad fecha modificacion.
	 *
	 * @param ad_fechaModificacion el nuevo valor para la propiedad fecha
	 *                             modificacion
	 */
	public void setId_fechaModificacion(Date ad_fechaModificacion) {
		this.id_fechaModificacion = ad_fechaModificacion;
	}

	/**
	 * Obtiene el valor para la propiedad id usuario creacion.
	 *
	 * @return El valor de la propiedad id usuario creacion
	 */
	public String getIs_idUsuarioCreacion() {
		return is_idUsuarioCreacion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad id usuario creacion.
	 *
	 * @param as_idUsuarioCreacion el nuevo valor para la propiedad id usuario
	 *                             creacion
	 */
	public void setIs_idUsuarioCreacion(String as_idUsuarioCreacion) {
		this.is_idUsuarioCreacion = as_idUsuarioCreacion;
	}

	/**
	 * Obtiene el valor para la propiedad id usuario modificacion.
	 *
	 * @return El valor de la propiedad id usuario modificacion
	 */
	public String getIs_idUsuarioModificacion() {
		return is_idUsuarioModificacion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad id usuario modificacion.
	 *
	 * @param as_idUsuarioModificacion el nuevo valor para la propiedad id usuario
	 *                                 modificacion
	 */
	public void setIs_idUsuarioModificacion(String as_idUsuarioModificacion) {
		this.is_idUsuarioModificacion = as_idUsuarioModificacion;
	}

	/**
	 * Obtiene el valor para la propiedad ip creacion.
	 *
	 * @return El valor de la propiedad ip creacion
	 */
	public String getIs_ipCreacion() {
		return is_ipCreacion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad ip creacion.
	 *
	 * @param as_ipCreacion el nuevo valor para la propiedad ip creacion
	 */
	public void setIs_ipCreacion(String as_ipCreacion) {
		this.is_ipCreacion = as_ipCreacion;
	}

	/**
	 * Obtiene el valor para la propiedad ip modificacion.
	 *
	 * @return El valor de la propiedad ip modificacion
	 */
	public String getIs_ipModificacion() {
		return is_ipModificacion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad ip modificacion.
	 *
	 * @param as_ipModificacion el nuevo valor para la propiedad ip modificacion
	 */
	public void setIs_ipModificacion(String as_ipModificacion) {
		this.is_ipModificacion = as_ipModificacion;
	}

	/**
	 * Obtiene el valor para la propiedad plantilla llena envio.
	 *
	 * @return El valor de la propiedad plantilla llena envio
	 */
	public String getIs_plantillaLlenaEnvio() {
		return is_plantillaLlenaEnvio;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad plantilla llena envio.
	 *
	 * @param as_plantillaLlenaEnvio el nuevo valor para la propiedad plantilla
	 *                               llena envio
	 */
	public void setIs_plantillaLlenaEnvio(String as_plantillaLlenaEnvio) {
		this.is_plantillaLlenaEnvio = as_plantillaLlenaEnvio;
	}

	/**
	 * Obtiene el valor para la propiedad ultimo detalle.
	 *
	 * @return El valor de la propiedad ultimo detalle
	 */
	public String getIs_ultimoDetalle() {
		return is_ultimoDetalle;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad ultimo detalle.
	 *
	 * @param as_ultimoDetalle el nuevo valor para la propiedad ultimo detalle
	 */
	public void setIs_ultimoDetalle(String as_ultimoDetalle) {
		this.is_ultimoDetalle = as_ultimoDetalle;
	}

	/**
	 * Obtiene el valor para la propiedad ultimo estado.
	 *
	 * @return El valor de la propiedad ultimo estado
	 */
	public String getIs_ultimoEstado() {
		return is_ultimoEstado;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad ultimo estado.
	 *
	 * @param as_ultimoEstado el nuevo valor para la propiedad ultimo estado
	 */
	public void setIs_ultimoEstado(String as_ultimoEstado) {
		this.is_ultimoEstado = as_ultimoEstado;
	}

	/**
	 * Obtiene el valor para la propiedad ultimo intento envio.
	 *
	 * @return El valor de la propiedad ultimo intento envio
	 */
	public String getIs_ultimoIntentoEnvio() {
		return is_ultimoIntentoEnvio;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad ultimo intento envio.
	 *
	 * @param as_ultimoIntentoEnvio el nuevo valor para la propiedad ultimo intento
	 *                              envio
	 */
	public void setIs_ultimoIntentoEnvio(String as_ultimoIntentoEnvio) {
		this.is_ultimoIntentoEnvio = as_ultimoIntentoEnvio;
	}

	/**
	 * Obtiene el valor para la propiedad parametrizacion plantilla.
	 *
	 * @return El valor de la propiedad parametrizacion plantilla
	 */
	public ParametrizacionPlantillaDTO getIppd_parametrizacionPlantilla() {
		return ippd_parametrizacionPlantilla;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad parametrizacion plantilla.
	 *
	 * @param appd_parametrizacionPlantilla el nuevo valor para la propiedad
	 *                                      parametrizacion plantilla
	 */
	public void setIppd_parametrizacionPlantilla(ParametrizacionPlantillaDTO appd_parametrizacionPlantilla) {
		this.ippd_parametrizacionPlantilla = appd_parametrizacionPlantilla;
	}

	
}

/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ParametrizacionPlantillaDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: ParametrizacionPlantillaDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;
import java.util.Date;
import java.util.List;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Parametrizacion
 * plantilla.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ParametrizacionPlantillaDTO extends GenericoDTO { 
	
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
	 * codigo.
	 */
	private String is_codigo;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * conf campos asunto.
	 */
	private String is_confCamposAsunto;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * conf campos contenido.
	 */
	private String is_confCamposContenido;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * conf from.
	 */
	private String is_confFrom;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * conf html contenido.
	 */
	private String is_confHtmlContenido;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * conf prioridad.
	 */
	private String is_confPrioridad;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * conf texto asunto.
	 */
	private String is_confTextoAsunto;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * conf to.
	 */
	private String is_confTo;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * descripcion.
	 */
	private String is_descripcion;
	
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
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad max
	 * intentos.
	 */
	private String is_maxIntentos;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nombre.
	 */
	private String is_nombre;
	
	/**
	 * Atributo para definir la propiedad ilce cola envios.
	 */
	private List<ColaEnvioDTO> ilce_ColaEnvios;
	
	/**
	 * Atributo para definir la propiedad ilhe historial envios.
	 */
	private List<HistorialEnvioDTO> ilhe_HistorialEnvios;

	/**
	 * Construye una nueva instancia/objeto de la clase ParametrizacionPlantillaDTO.
	 */
	// --- Constructor
	public ParametrizacionPlantillaDTO () {
		//Constructor vacio
	}

	/**
	 * Construye una nueva instancia/objeto de la clase ParametrizacionPlantillaDTO.
	 *
	 * @param as_id el parametro id
	 */
	public ParametrizacionPlantillaDTO (String as_id ) {
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
	 * Obtiene el valor para la propiedad codigo.
	 *
	 * @return El valor de la propiedad codigo
	 */
	public String getIs_codigo() {
		return is_codigo;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad codigo.
	 *
	 * @param as_codigo el nuevo valor para la propiedad codigo
	 */
	public void setIs_codigo(String as_codigo) {
		this.is_codigo = as_codigo;
	}

	/**
	 * Obtiene el valor para la propiedad conf campos asunto.
	 *
	 * @return El valor de la propiedad conf campos asunto
	 */
	public String getIs_confCamposAsunto() {
		return is_confCamposAsunto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad conf campos asunto.
	 *
	 * @param as_confCamposAsunto el nuevo valor para la propiedad conf campos
	 *                            asunto
	 */
	public void setIs_confCamposAsunto(String as_confCamposAsunto) {
		this.is_confCamposAsunto = as_confCamposAsunto;
	}

	/**
	 * Obtiene el valor para la propiedad conf campos contenido.
	 *
	 * @return El valor de la propiedad conf campos contenido
	 */
	public String getIs_confCamposContenido() {
		return is_confCamposContenido;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad conf campos contenido.
	 *
	 * @param as_confCamposContenido el nuevo valor para la propiedad conf campos
	 *                               contenido
	 */
	public void setIs_confCamposContenido(String as_confCamposContenido) {
		this.is_confCamposContenido = as_confCamposContenido;
	}

	/**
	 * Obtiene el valor para la propiedad conf from.
	 *
	 * @return El valor de la propiedad conf from
	 */
	public String getIs_confFrom() {
		return is_confFrom;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad conf from.
	 *
	 * @param as_confFrom el nuevo valor para la propiedad conf from
	 */
	public void setIs_confFrom(String as_confFrom) {
		this.is_confFrom = as_confFrom;
	}

	/**
	 * Obtiene el valor para la propiedad conf html contenido.
	 *
	 * @return El valor de la propiedad conf html contenido
	 */
	public String getIs_confHtmlContenido() {
		return is_confHtmlContenido;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad conf html contenido.
	 *
	 * @param as_confHtmlContenido el nuevo valor para la propiedad conf html
	 *                             contenido
	 */
	public void setIs_confHtmlContenido(String as_confHtmlContenido) {
		this.is_confHtmlContenido = as_confHtmlContenido;
	}

	/**
	 * Obtiene el valor para la propiedad conf prioridad.
	 *
	 * @return El valor de la propiedad conf prioridad
	 */
	public String getIs_confPrioridad() {
		return is_confPrioridad;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad conf prioridad.
	 *
	 * @param as_confPrioridad el nuevo valor para la propiedad conf prioridad
	 */
	public void setIs_confPrioridad(String as_confPrioridad) {
		this.is_confPrioridad = as_confPrioridad;
	}

	/**
	 * Obtiene el valor para la propiedad conf texto asunto.
	 *
	 * @return El valor de la propiedad conf texto asunto
	 */
	public String getIs_confTextoAsunto() {
		return is_confTextoAsunto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad conf texto asunto.
	 *
	 * @param as_confTextoAsunto el nuevo valor para la propiedad conf texto asunto
	 */
	public void setIs_confTextoAsunto(String as_confTextoAsunto) {
		this.is_confTextoAsunto = as_confTextoAsunto;
	}

	/**
	 * Obtiene el valor para la propiedad conf to.
	 *
	 * @return El valor de la propiedad conf to
	 */
	public String getIs_confTo() {
		return is_confTo;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad conf to.
	 *
	 * @param as_confTo el nuevo valor para la propiedad conf to
	 */
	public void setIs_confTo(String as_confTo) {
		this.is_confTo = as_confTo;
	}

	/**
	 * Obtiene el valor para la propiedad descripcion.
	 *
	 * @return El valor de la propiedad descripcion
	 */
	public String getIs_descripcion() {
		return is_descripcion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad descripcion.
	 *
	 * @param as_descripcion el nuevo valor para la propiedad descripcion
	 */
	public void setIs_descripcion(String as_descripcion) {
		this.is_descripcion = as_descripcion;
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
	 * Obtiene el valor para la propiedad max intentos.
	 *
	 * @return El valor de la propiedad max intentos
	 */
	public String getIs_maxIntentos() {
		return is_maxIntentos;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad max intentos.
	 *
	 * @param as_maxIntentos el nuevo valor para la propiedad max intentos
	 */
	public void setIs_maxIntentos(String as_maxIntentos) {
		this.is_maxIntentos = as_maxIntentos;
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
	 * Cambia/actualiza el valor para la propiedad nombre.
	 *
	 * @param as_nombre el nuevo valor para la propiedad nombre
	 */
	public void setIs_nombre(String as_nombre) {
		this.is_nombre = as_nombre;
	}

	/**
	 * Obtiene el valor para la propiedad cola envios.
	 *
	 * @return El valor de la propiedad cola envios
	 */
	public List<ColaEnvioDTO> getIlce_ColaEnvios() {
		return ilce_ColaEnvios;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad cola envios.
	 *
	 * @param alce_ColaEnvios el nuevo valor para la propiedad cola envios
	 */
	public void setIlce_ColaEnvios(List<ColaEnvioDTO> alce_ColaEnvios) {
		this.ilce_ColaEnvios = alce_ColaEnvios;
	}

	/**
	 * Obtiene el valor para la propiedad historial envios.
	 *
	 * @return El valor de la propiedad historial envios
	 */
	public List<HistorialEnvioDTO> getIlhe_HistorialEnvios() {
		return ilhe_HistorialEnvios;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad historial envios.
	 *
	 * @param alhe_HistorialEnvios el nuevo valor para la propiedad historial envios
	 */
	public void setIlhe_HistorialEnvios(List<HistorialEnvioDTO> alhe_HistorialEnvios) {
		this.ilhe_HistorialEnvios = alhe_HistorialEnvios;
	}

}

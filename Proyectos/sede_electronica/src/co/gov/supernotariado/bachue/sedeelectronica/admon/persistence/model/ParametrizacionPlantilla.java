/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ParametrizacionPlantilla.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model
 * Nombre del elemento: ParametrizacionPlantilla
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.eclipse.persistence.annotations.Cache;
import org.eclipse.persistence.config.CacheIsolationType;


/**
 * Clase tipo entidad o modelo de datos de la capa de persistencia.<br>
 * Representa una entidad de persistencia para una tabla de la base de
 * datos.<br>
 * Esta clase representa la entidad <b>Parametrizacion plantilla</b>, <br>
 * que permite la persistencia en la tabla
 * <b>SDB_PGN_PARAMETRIZACION_PLANTILLAS</b> de la base de datos.
 * 
 * <br>
 * <em>Nota:</em> En modelos de base de datos el nombre de las
 * variables/propiedades no aplican el estandar de nomenclatura de las demas
 * clases, porque es necesario el estandar clasico de java para el correcto
 * mapeo de los campos con base de datos y correcta serializacion.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Entity
@Table(name="SDB_PGN_PARAMETRIZACION_PLANTILLAS")
@Cache(isolation=CacheIsolationType.ISOLATED)
@NamedQueries( value= {
@NamedQuery(name="ParametrizacionPlantilla.findAll", query="SELECT s FROM ParametrizacionPlantilla s"),
@NamedQuery(name="ParametrizacionPlantilla.consultarPorCodigo", query = "SELECT s FROM ParametrizacionPlantilla s WHERE s.codigo = :codigo"),
})
public class ParametrizacionPlantilla implements Serializable {
	
	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo para definir la propiedad id.
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String id;

	/**
	 * Atributo para definir la propiedad codigo.
	 */
	@Column(name="CODIGO")
	private String codigo;

	/**
	 * Atributo para definir la propiedad conf campos asunto.
	 */
	@Lob
	@Column(name="CONF_CAMPOS_ASUNTO")
	private String confCamposAsunto;

	/**
	 * Atributo para definir la propiedad conf campos contenido.
	 */
	@Lob
	@Column(name="CONF_CAMPOS_CONTENIDO")
	private String confCamposContenido;

	/**
	 * Atributo para definir la propiedad conf from.
	 */
	@Column(name="CONF_FROM")
	private String confFrom;

	/**
	 * Atributo para definir la propiedad conf html contenido.
	 */
	@Column(name="CONF_HTML_CONTENIDO")
	private String confHtmlContenido;

	/**
	 * Atributo para definir la propiedad conf prioridad.
	 */
	@Column(name="CONF_PRIORIDAD")
	private String confPrioridad;

	/**
	 * Atributo para definir la propiedad conf texto asunto.
	 */
	@Column(name="CONF_TEXTO_ASUNTO")
	private String confTextoAsunto;

	/**
	 * Atributo para definir la propiedad conf to.
	 */
	@Column(name="CONF_TO")
	private String confTo;

	/**
	 * Atributo para definir la propiedad descripcion.
	 */
	private String descripcion;

	/**
	 * Atributo para definir la propiedad estereotipo creacion.
	 */
	@Column(name="ESTEREOTIPO_CREACION")
	private String estereotipoCreacion;

	/**
	 * Atributo para definir la propiedad estereotipo modificacion.
	 */
	@Column(name="ESTEREOTIPO_MODIFICACION")
	private String estereotipoModificacion;

	/**
	 * Atributo para definir la propiedad fecha creacion.
	 */
	@Column(name="FECHA_CREACION")
	@Temporal(TemporalType.DATE)
	private Date fechaCreacion;

	/**
	 * Atributo para definir la propiedad fecha modificacion.
	 */
	@Column(name="FECHA_MODIFICACION")
	@Temporal(TemporalType.DATE)
	private Date fechaModificacion;

	/**
	 * Atributo para definir la propiedad id usuario creacion.
	 */
	@Column(name="ID_USUARIO_CREACION")
	private String idUsuarioCreacion;

	/**
	 * Atributo para definir la propiedad id usuario modificacion.
	 */
	@Column(name="ID_USUARIO_MODIFICACION")
	private String idUsuarioModificacion;

	/**
	 * Atributo para definir la propiedad ip creacion.
	 */
	@Column(name="IP_CREACION")
	private String ipCreacion;

	/**
	 * Atributo para definir la propiedad ip modificacion.
	 */
	@Column(name="IP_MODIFICACION")
	private String ipModificacion;

	/**
	 * Atributo para definir la propiedad max intentos.
	 */
	@Column(name="MAX_INTENTOS")
	private String maxIntentos;

	/**
	 * Atributo para definir la propiedad nombre.
	 */
	private String nombre;

	/**
	 * Atributo para definir la propiedad cola envios.
	 */
	//bi-directional many-to-one association to ColaEnvio
	//@OneToMany
	private List<ColaEnvio> colaEnvios;
	

	/**
	 * Atributo para definir la propiedad historial envios.
	 */
	//bi-directional many-to-one association to HistorialEnvio
	//@OneToMany
	private List<HistorialEnvio> historialEnvios;

	/**
	 * Construye una nueva instancia/objeto de la clase ParametrizacionPlantilla.
	 */
	public ParametrizacionPlantilla() {
		//Constructor vacio
	}

	/**
	 * Obtiene el valor para la propiedad id.
	 *
	 * @return El valor de la propiedad id
	 */
	public String getId() {
		return this.id;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad id.
	 *
	 * @param id el nuevo valor para la propiedad id
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Obtiene el valor para la propiedad codigo.
	 *
	 * @return El valor de la propiedad codigo
	 */
	public String getCodigo() {
		return this.codigo;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad codigo.
	 *
	 * @param codigo el nuevo valor para la propiedad codigo
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	/**
	 * Obtiene el valor para la propiedad conf campos asunto.
	 *
	 * @return El valor de la propiedad conf campos asunto
	 */
	public String getConfCamposAsunto() {
		return this.confCamposAsunto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad conf campos asunto.
	 *
	 * @param confCamposAsunto el nuevo valor para la propiedad conf campos asunto
	 */
	public void setConfCamposAsunto(String confCamposAsunto) {
		this.confCamposAsunto = confCamposAsunto;
	}

	/**
	 * Obtiene el valor para la propiedad conf campos contenido.
	 *
	 * @return El valor de la propiedad conf campos contenido
	 */
	public String getConfCamposContenido() {
		return this.confCamposContenido;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad conf campos contenido.
	 *
	 * @param confCamposContenido el nuevo valor para la propiedad conf campos
	 *                            contenido
	 */
	public void setConfCamposContenido(String confCamposContenido) {
		this.confCamposContenido = confCamposContenido;
	}

	/**
	 * Obtiene el valor para la propiedad conf from.
	 *
	 * @return El valor de la propiedad conf from
	 */
	public String getConfFrom() {
		return this.confFrom;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad conf from.
	 *
	 * @param confFrom el nuevo valor para la propiedad conf from
	 */
	public void setConfFrom(String confFrom) {
		this.confFrom = confFrom;
	}

	/**
	 * Obtiene el valor para la propiedad conf html contenido.
	 *
	 * @return El valor de la propiedad conf html contenido
	 */
	public String getConfHtmlContenido() {
		return this.confHtmlContenido;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad conf html contenido.
	 *
	 * @param confHtmlContenido el nuevo valor para la propiedad conf html contenido
	 */
	public void setConfHtmlContenido(String confHtmlContenido) {
		this.confHtmlContenido = confHtmlContenido;
	}

	/**
	 * Obtiene el valor para la propiedad conf prioridad.
	 *
	 * @return El valor de la propiedad conf prioridad
	 */
	public String getConfPrioridad() {
		return this.confPrioridad;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad conf prioridad.
	 *
	 * @param confPrioridad el nuevo valor para la propiedad conf prioridad
	 */
	public void setConfPrioridad(String confPrioridad) {
		this.confPrioridad = confPrioridad;
	}

	/**
	 * Obtiene el valor para la propiedad conf texto asunto.
	 *
	 * @return El valor de la propiedad conf texto asunto
	 */
	public String getConfTextoAsunto() {
		return this.confTextoAsunto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad conf texto asunto.
	 *
	 * @param confTextoAsunto el nuevo valor para la propiedad conf texto asunto
	 */
	public void setConfTextoAsunto(String confTextoAsunto) {
		this.confTextoAsunto = confTextoAsunto;
	}

	/**
	 * Obtiene el valor para la propiedad conf to.
	 *
	 * @return El valor de la propiedad conf to
	 */
	public String getConfTo() {
		return this.confTo;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad conf to.
	 *
	 * @param confTo el nuevo valor para la propiedad conf to
	 */
	public void setConfTo(String confTo) {
		this.confTo = confTo;
	}

	/**
	 * Obtiene el valor para la propiedad descripcion.
	 *
	 * @return El valor de la propiedad descripcion
	 */
	public String getDescripcion() {
		return this.descripcion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad descripcion.
	 *
	 * @param descripcion el nuevo valor para la propiedad descripcion
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * Obtiene el valor para la propiedad estereotipo creacion.
	 *
	 * @return El valor de la propiedad estereotipo creacion
	 */
	public String getEstereotipoCreacion() {
		return this.estereotipoCreacion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad estereotipo creacion.
	 *
	 * @param estereotipoCreacion el nuevo valor para la propiedad estereotipo
	 *                            creacion
	 */
	public void setEstereotipoCreacion(String estereotipoCreacion) {
		this.estereotipoCreacion = estereotipoCreacion;
	}

	/**
	 * Obtiene el valor para la propiedad estereotipo modificacion.
	 *
	 * @return El valor de la propiedad estereotipo modificacion
	 */
	public String getEstereotipoModificacion() {
		return this.estereotipoModificacion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad estereotipo modificacion.
	 *
	 * @param estereotipoModificacion el nuevo valor para la propiedad estereotipo
	 *                                modificacion
	 */
	public void setEstereotipoModificacion(String estereotipoModificacion) {
		this.estereotipoModificacion = estereotipoModificacion;
	}

	/**
	 * Obtiene el valor para la propiedad fecha creacion.
	 *
	 * @return El valor de la propiedad fecha creacion
	 */
	public Date getFechaCreacion() {
		return this.fechaCreacion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad fecha creacion.
	 *
	 * @param fechaCreacion el nuevo valor para la propiedad fecha creacion
	 */
	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	/**
	 * Obtiene el valor para la propiedad fecha modificacion.
	 *
	 * @return El valor de la propiedad fecha modificacion
	 */
	public Date getFechaModificacion() {
		return this.fechaModificacion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad fecha modificacion.
	 *
	 * @param fechaModificacion el nuevo valor para la propiedad fecha modificacion
	 */
	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

	/**
	 * Obtiene el valor para la propiedad id usuario creacion.
	 *
	 * @return El valor de la propiedad id usuario creacion
	 */
	public String getIdUsuarioCreacion() {
		return this.idUsuarioCreacion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad id usuario creacion.
	 *
	 * @param idUsuarioCreacion el nuevo valor para la propiedad id usuario creacion
	 */
	public void setIdUsuarioCreacion(String idUsuarioCreacion) {
		this.idUsuarioCreacion = idUsuarioCreacion;
	}

	/**
	 * Obtiene el valor para la propiedad id usuario modificacion.
	 *
	 * @return El valor de la propiedad id usuario modificacion
	 */
	public String getIdUsuarioModificacion() {
		return this.idUsuarioModificacion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad id usuario modificacion.
	 *
	 * @param idUsuarioModificacion el nuevo valor para la propiedad id usuario
	 *                              modificacion
	 */
	public void setIdUsuarioModificacion(String idUsuarioModificacion) {
		this.idUsuarioModificacion = idUsuarioModificacion;
	}

	/**
	 * Obtiene el valor para la propiedad ip creacion.
	 *
	 * @return El valor de la propiedad ip creacion
	 */
	public String getIpCreacion() {
		return this.ipCreacion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad ip creacion.
	 *
	 * @param ipCreacion el nuevo valor para la propiedad ip creacion
	 */
	public void setIpCreacion(String ipCreacion) {
		this.ipCreacion = ipCreacion;
	}

	/**
	 * Obtiene el valor para la propiedad ip modificacion.
	 *
	 * @return El valor de la propiedad ip modificacion
	 */
	public String getIpModificacion() {
		return this.ipModificacion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad ip modificacion.
	 *
	 * @param ipModificacion el nuevo valor para la propiedad ip modificacion
	 */
	public void setIpModificacion(String ipModificacion) {
		this.ipModificacion = ipModificacion;
	}

	/**
	 * Obtiene el valor para la propiedad max intentos.
	 *
	 * @return El valor de la propiedad max intentos
	 */
	public String getMaxIntentos() {
		return this.maxIntentos;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad max intentos.
	 *
	 * @param maxIntentos el nuevo valor para la propiedad max intentos
	 */
	public void setMaxIntentos(String maxIntentos) {
		this.maxIntentos = maxIntentos;
	}

	/**
	 * Obtiene el valor para la propiedad nombre.
	 *
	 * @return El valor de la propiedad nombre
	 */
	public String getNombre() {
		return this.nombre;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad nombre.
	 *
	 * @param nombre el nuevo valor para la propiedad nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Obtiene el valor para la propiedad cola envios.
	 *
	 * @return El valor de la propiedad cola envios
	 */
	public List<ColaEnvio> getColaEnvios() {
		return this.colaEnvios;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad cola envios.
	 *
	 * @param colaEnvios el nuevo valor para la propiedad cola envios
	 */
	public void setColaEnvios(List<ColaEnvio> colaEnvios) {
		this.colaEnvios = colaEnvios;
	}

	/**
	 * Agrega el/la cola envio.
	 *
	 * @param colaEnvio el parametro cola envio
	 * @return Resultado para Agrega el/la cola envio retornado como ColaEnvio
	 */
	public ColaEnvio addColaEnvio(ColaEnvio colaEnvio) {
		getColaEnvios().add(colaEnvio);
		colaEnvio.setparametrizacionPlantilla(this);

		return colaEnvio;
	}

	/**
	 * Remueve el/la cola envio.
	 *
	 * @param colaEnvio el parametro cola envio
	 * @return Resultado para Remueve el/la cola envio retornado como ColaEnvio
	 */
	public ColaEnvio removeColaEnvio(ColaEnvio colaEnvio) {
		getColaEnvios().remove(colaEnvio);
		colaEnvio.setparametrizacionPlantilla(null);

		return colaEnvio;
	}

	/**
	 * Obtiene el valor para la propiedad historial envios.
	 *
	 * @return El valor de la propiedad historial envios
	 */
	public List<HistorialEnvio> gethistorialEnvios() {
		return this.historialEnvios;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad historial envios.
	 *
	 * @param historialEnvios el nuevo valor para la propiedad historial envios
	 */
	public void setHistorialEnvios(List<HistorialEnvio> historialEnvios) {
		this.historialEnvios = historialEnvios;
	}

	/**
	 * Agrega el/la historial envio.
	 *
	 * @param historialEnvio el parametro historial envio
	 * @return Resultado para Agrega el/la historial envio retornado como
	 *         HistorialEnvio
	 */
	public HistorialEnvio addHistorialEnvio(HistorialEnvio historialEnvio) {
		gethistorialEnvios().add(historialEnvio);
		historialEnvio.setParametrizacionPlantilla(this);

		return historialEnvio;
	}

	/**
	 * Remueve el/la historial envio.
	 *
	 * @param historialEnvio el parametro historial envio
	 * @return Resultado para Remueve el/la historial envio retornado como
	 *         HistorialEnvio
	 */
	public HistorialEnvio removeHistorialEnvio(HistorialEnvio historialEnvio) {
		gethistorialEnvios().remove(historialEnvio);
		historialEnvio.setParametrizacionPlantilla(null);

		return historialEnvio;
	}

}
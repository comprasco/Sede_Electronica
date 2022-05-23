/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ServicioIntegracion.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model
 * Nombre del elemento: ServicioIntegracion
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

import org.eclipse.persistence.annotations.Cache;
import org.eclipse.persistence.config.CacheIsolationType;

/**
 * Clase tipo entidad o modelo de datos de la capa de persistencia.<br>
 * Representa una entidad de persistencia para una tabla de la base de
 * datos.<br>
 * Esta clase representa la entidad <b>Servicio integracion</b>, <br>
 * que permite la persistencia en la tabla <b>SDB_BNG_SERVICIO_INTEGRACION</b>
 * de la base de datos.
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
@Table(name = "SDB_BNG_SERVICIO_INTEGRACION")
@Cache(isolation = CacheIsolationType.ISOLATED)
@NamedQueries(value = {
		@NamedQuery(name = "ServicioIntegracion.findAll", query = "SELECT s FROM ServicioIntegracion s WHERE s.activo = 'S'"),
		@NamedQuery(name = "ServicioIntegracion.consultarNombreServicio", query = "SELECT s FROM ServicioIntegracion s WHERE s.nombre =:nombre AND s.activo = 'S'") })
public class ServicioIntegracion implements Serializable {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo para definir la propiedad id.
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEC_BNG_SERVICIO_INTEGRACION_ID_GENERATOR")
	@SequenceGenerator(sequenceName = "SEC_BNG_SERVICIO_INTEGRACION", allocationSize = 1, name = "SEC_BNG_SERVICIO_INTEGRACION_ID_GENERATOR")
	private String id;

	/**
	 * Atributo para definir la propiedad activo.
	 */
	private String activo;

	/**
	 * Atributo para definir la propiedad descripcion.
	 */
	@Column(name = "DESCRIPCION")
	private String descripcion;

	/**
	 * Atributo para definir la propiedad espacio nombre.
	 */
	@Column(name = "ESPACIO_NOMBRE")
	private String espacioNombre;

	/**
	 * Atributo para definir la propiedad fecha creacion.
	 */
	@Column(name = "FECHA_CREACION")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaCreacion;

	/**
	 * Atributo para definir la propiedad fecha modificacion.
	 */
	@Column(name = "FECHA_MODIFICACION")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaModificacion;

	/**
	 * Atributo para definir la propiedad id usuario creacion.
	 */
	@Column(name = "ID_USUARIO_CREACION")
	private String idUsuarioCreacion;

	/**
	 * Atributo para definir la propiedad id usuario modificacion.
	 */
	@Column(name = "ID_USUARIO_MODIFICACION")
	private String idUsuarioModificacion;

	/**
	 * Atributo para definir la propiedad ip creacion.
	 */
	@Column(name = "IP_CREACION")
	private String ipCreacion;

	/**
	 * Atributo para definir la propiedad ip modificacion.
	 */
	@Column(name = "IP_MODIFICACION")
	private String ipModificacion;

	/**
	 * Atributo para definir la propiedad nombre.
	 */
	@Column(name = "NOMBRE")
	private String nombre;

	/**
	 * Atributo para definir la propiedad nombre servicio.
	 */
	@Column(name = "NOMBRE_SERVICIO")
	private String nombreServicio;

	/**
	 * Atributo para definir la propiedad url.
	 */
	@Column(name = "URL")
	private String url;

	/**
	 * Atributo para definir la propiedad url.
	 */
	@Column(name = "ID_TIPO_PROCESO")
	private String idTipoProceso;
	
	@ManyToOne
	@JoinColumn(name = "ID_TIPO_PROCESO", insertable = false, updatable = false)
	private TipoProceso tipoProceso;

	/**
	 * Atributo para definir la propiedad tiempo fuera.
	 */
	@Column(name = "TIEMPO_FUERA")
	private String tiempoFuera;

	/**
	 * Atributo para definir la propiedad estereotipo creacion.
	 */
	@Column(name = "ESTEREOTIPO_CREACION")
	private String estereotipoCreacion;

	/**
	 * Atributo para definir la propiedad estereotipo modificacion.
	 */
	@Column(name = "ESTEREOTIPO_MODIFICACION")
	private String estereotipoModificacion;

	/**
	 * Construye una nueva instancia/objeto de la clase ServicioIntegracion.
	 */
	public ServicioIntegracion() {
		// Constructor vacio
	}

	/**
	 * Obtiene el valor para la propiedad activo.
	 *
	 * @return El valor de la propiedad activo
	 */
	public String getActivo() {
		return this.activo;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad activo.
	 *
	 * @param activo el nuevo valor para la propiedad activo
	 */
	public void setActivo(String activo) {
		this.activo = activo;
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
	 * Obtiene el valor para la propiedad espacio nombre.
	 *
	 * @return El valor de la propiedad espacio nombre
	 */
	public String getEspacioNombre() {
		return this.espacioNombre;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad espacio nombre.
	 *
	 * @param espacioNombre el nuevo valor para la propiedad espacio nombre
	 */
	public void setEspacioNombre(String espacioNombre) {
		this.espacioNombre = espacioNombre;
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
	 * Obtiene el valor para la propiedad url.
	 *
	 * @return El valor de la propiedad url
	 */
	public String getUrl() {
		return this.url;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad url.
	 *
	 * @param url el nuevo valor para la propiedad url
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * Obtiene el valor para la propiedad tiempo fuera.
	 *
	 * @return El valor de la propiedad tiempo fuera
	 */
	public String getTiempoFuera() {
		return tiempoFuera;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tiempo fuera.
	 *
	 * @param tiempoFuera el nuevo valor para la propiedad tiempo fuera
	 */
	public void setTiempoFuera(String tiempoFuera) {
		this.tiempoFuera = tiempoFuera;
	}

	/**
	 * Obtiene el valor para la propiedad nombre servicio.
	 *
	 * @return El valor de la propiedad nombre servicio
	 */
	public String getNombreServicio() {
		return nombreServicio;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad nombre servicio.
	 *
	 * @param nombreServicio el nuevo valor para la propiedad nombre servicio
	 */
	public void setNombreServicio(String nombreServicio) {
		this.nombreServicio = nombreServicio;
	}

	/**
	 * Obtiene el valor para la propiedad estereotipo creacion.
	 *
	 * @return El valor de la propiedad estereotipo creacion
	 */
	public String getEstereotipoCreacion() {
		return estereotipoCreacion;
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
		return estereotipoModificacion;
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

	public String getIdTipoProceso() {
		return idTipoProceso;
	}

	public void setIdTipoProceso(String idTipoProceso) {
		this.idTipoProceso = idTipoProceso;
	}

	public TipoProceso getTipoProceso() {
		return tipoProceso;
	}

	public void setTipoProceso(TipoProceso tipoProceso) {
		this.tipoProceso = tipoProceso;
	}

}
/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: SolicitudRecuperacionClave.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model
 * Nombre del elemento: SolicitudRecuperacionClave
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
 * Esta clase representa la entidad <b>Solicitud recuperacion clave</b>, <br>
 * que permite la persistencia en la tabla
 * <b>SDB_AUT_SOLICITUD_RECUPERACION_CLAVE</b> de la base de datos.
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
@Cache(isolation=CacheIsolationType.ISOLATED)
@Table(name="SDB_AUT_SOLICITUD_RECUPERACION_CLAVE")
@NamedQueries( value = {
	@NamedQuery(name="SolicitudRecuperacionClave.findAll", query="SELECT s FROM SolicitudRecuperacionClave s"),
	@NamedQuery(name="SolicitudRecuperacionClave.findByUrlRecuperacionAndClaveTemporal", query="SELECT s FROM SolicitudRecuperacionClave s where s.uuidUrlRecuperacion =:codigo")	
})
public class SolicitudRecuperacionClave implements Serializable {
	
	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo para definir la propiedad id.
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEC_AUT_SOLICITUD_RECUPERACION_CLAVE_GENERATOR")
	@SequenceGenerator(sequenceName = "SEC_AUT_SOLICITUD_RECUPERACION_CLAVE", allocationSize = 1,name = "SEC_AUT_SOLICITUD_RECUPERACION_CLAVE_GENERATOR")
	private String id;

	/**
	 * Atributo para definir la propiedad clave temporal.
	 */
	@Column(name="CLAVE_TEMPORAL")
	private String claveTemporal;

	/**
	 * Atributo para definir la propiedad clave temporal usada.
	 */
	@Column(name="CLAVE_TEMPORAL_USADA")
	private String claveTemporalUsada;

	/**
	 * Atributo para definir la propiedad fecha cierre solicitud.
	 */
	@Column(name="FECHA_CIERRE_SOLICITUD")
	//@Temporal(TemporalType.DATE) --> Se comenta debido a que al enviar la fecha de cierre solicitud se deben tener en cuenta los minutos y segundos
	private Date fechaCierreSolicitud;

	/**
	 * Atributo para definir la propiedad fecha creacion.
	 */
	@Column(name="FECHA_CREACION")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaCreacion;

	/**
	 * Atributo para definir la propiedad fecha modificacion.
	 */
	@Column(name = "FECHA_MODIFICACION")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaModificacion;

	/**
	 * Atributo para definir la propiedad fecha solicitud.
	 */
	@Column(name = "FECHA_SOLICITUD")
	private Date fechaSolicitud;

	/**
	 * Atributo para definir la propiedad id usuario.
	 */
	@Column(name = "ID_USUARIO")
	private String idUsuario;

	/**
	 * Atributo para definir la propiedad id usuario creacion.
	 */
	@Column(name = "ID_USUARIO_CREACION")
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
	@Column(name = "IP_MODIFICACION")
	private String ipModificacion;
	
	/**
	 * Atributo para definir la propiedad uuid url recuperacion.
	 */
	@Column(name="UUID_URL_RECUPERACION")
	private String uuidUrlRecuperacion;

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
	 * Atributo para definir la propiedad usuario.
	 */
	// bi-directional many-to-one association to SdbAutUsuario
	@ManyToOne
	@JoinColumn(name = "ID_USUARIO", updatable = false, insertable = false)
	private Usuario usuario;

	/**
	 * Construye una nueva instancia/objeto de la clase SolicitudRecuperacionClave.
	 */
	public SolicitudRecuperacionClave() {
		//Metodo constructor vacio para modelo de persistencia 
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
	 * Obtiene el valor para la propiedad clave temporal.
	 *
	 * @return El valor de la propiedad clave temporal
	 */
	public String getClaveTemporal() {
		return this.claveTemporal;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad clave temporal.
	 *
	 * @param claveTemporal el nuevo valor para la propiedad clave temporal
	 */
	public void setClaveTemporal(String claveTemporal) {
		this.claveTemporal = claveTemporal;
	}

	/**
	 * Obtiene el valor para la propiedad clave temporal usada.
	 *
	 * @return El valor de la propiedad clave temporal usada
	 */
	public String getClaveTemporalUsada() {
		return this.claveTemporalUsada;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad clave temporal usada.
	 *
	 * @param claveTemporalUsada el nuevo valor para la propiedad clave temporal
	 *                           usada
	 */
	public void setClaveTemporalUsada(String claveTemporalUsada) {
		this.claveTemporalUsada = claveTemporalUsada;
	}

	/**
	 * Obtiene el valor para la propiedad fecha cierre solicitud.
	 *
	 * @return El valor de la propiedad fecha cierre solicitud
	 */
	public Date getFechaCierreSolicitud() {
		return this.fechaCierreSolicitud;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad fecha cierre solicitud.
	 *
	 * @param fechaCierreSolicitud el nuevo valor para la propiedad fecha cierre
	 *                             solicitud
	 */
	public void setFechaCierreSolicitud(Date fechaCierreSolicitud) {
		this.fechaCierreSolicitud = fechaCierreSolicitud;
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
	 * Obtiene el valor para la propiedad fecha solicitud.
	 *
	 * @return El valor de la propiedad fecha solicitud
	 */
	public Date getFechaSolicitud() {
		return this.fechaSolicitud;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad fecha solicitud.
	 *
	 * @param fechaSolicitud el nuevo valor para la propiedad fecha solicitud
	 */
	public void setFechaSolicitud(Date fechaSolicitud) {
		this.fechaSolicitud = fechaSolicitud;
	}

	/**
	 * Obtiene el valor para la propiedad id usuario.
	 *
	 * @return El valor de la propiedad id usuario
	 */
	public String getIdUsuario() {
		return this.idUsuario;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad id usuario.
	 *
	 * @param idUsuario el nuevo valor para la propiedad id usuario
	 */
	public void setIdUsuario(String idUsuario) {
		this.idUsuario = idUsuario;
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
	 * Obtiene el valor para la propiedad usuario.
	 *
	 * @return El valor de la propiedad usuario
	 */
	public Usuario getUsuario() {
		return usuario;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad usuario.
	 *
	 * @param usuario el nuevo valor para la propiedad usuario
	 */
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	/**
	 * Obtiene el valor para la propiedad uuid url recuperacion.
	 *
	 * @return El valor de la propiedad uuid url recuperacion
	 */
	public String getUuidUrlRecuperacion() {
		return uuidUrlRecuperacion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad uuid url recuperacion.
	 *
	 * @param uuidUrlRecuperacion el nuevo valor para la propiedad uuid url
	 *                            recuperacion
	 */
	public void setUuidUrlRecuperacion(String uuidUrlRecuperacion) {
		this.uuidUrlRecuperacion = uuidUrlRecuperacion;
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
	
}
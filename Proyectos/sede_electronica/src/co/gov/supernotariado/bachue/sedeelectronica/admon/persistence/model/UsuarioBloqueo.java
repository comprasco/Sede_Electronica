/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: UsuarioBloqueo.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model
 * Nombre del elemento: UsuarioBloqueo
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
 * Esta clase representa la entidad <b>Usuario bloqueo</b>, <br>
 * que permite la persistencia en la tabla <b>SDB_AUT_USUARIO_BLOQUEO</b> de la
 * base de datos.
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
@Cache(isolation = CacheIsolationType.ISOLATED)
@Table(name = "SDB_AUT_USUARIO_BLOQUEO")
@NamedQueries({
	@NamedQuery(name = "UsuarioBloqueo.findAll", query = " SELECT ub FROM UsuarioBloqueo ub "),
	@NamedQuery(name = "UsuarioBloqueo.findByUser", query = " SELECT ub FROM UsuarioBloqueo ub WHERE ub.usuario = :usuario")
})
public class UsuarioBloqueo implements Serializable {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo para definir la propiedad id.
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEC_AUT_USUARIO_BLOQUEO")
	@SequenceGenerator(name = "SEC_AUT_USUARIO_BLOQUEO", sequenceName = "SEC_AUT_USUARIO_BLOQUEO", allocationSize = 1)
	private String id;

	/**
	 * Atributo para definir la propiedad fecha bloqueo fin.
	 */
	@Column(name = "FECHA_BLOQUEO_FIN")
	@Temporal(TemporalType.DATE)
	private Date fechaBloqueoFin;

	/**
	 * Atributo para definir la propiedad fecha bloqueo inicio.
	 */
	@Column(name = "FECHA_BLOQUEO_INICIO")
	@Temporal(TemporalType.DATE)
	private Date fechaBloqueoInicio;

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
	 * Atributo para definir la propiedad usuario.
	 */
	@ManyToOne
	@JoinColumn(name = "ID_USUARIO")
	private Usuario usuario;

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
	 * Atributo para definir la propiedad observacion bloqueo.
	 */
	@Column(name = "OBSERVACION_BLOQUEO")
	private String observacionBloqueo;

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
	 * Atributo para definir la propiedad soporte bloqueo.
	 */
	@Lob
	@Column(name = "SOPORTE_BLOQUEO")
	private byte[] soporteBloqueo;

	/**
	 * Construye una nueva instancia/objeto de la clase UsuarioBloqueo.
	 */
	public UsuarioBloqueo() {
		// Metodo constructor vacio para modelo de persistencia
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
	 * Obtiene el valor para la propiedad id.
	 *
	 * @return El valor de la propiedad id
	 */
	public String getId() {
		return id;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad fecha bloqueo fin.
	 *
	 * @param fechaBloqueoFin el nuevo valor para la propiedad fecha bloqueo fin
	 */
	public void setFechaBloqueoFin(Date fechaBloqueoFin) {
		this.fechaBloqueoFin = fechaBloqueoFin;
	}

	/**
	 * Obtiene el valor para la propiedad fecha bloqueo fin.
	 *
	 * @return El valor de la propiedad fecha bloqueo fin
	 */
	public Date getFechaBloqueoFin() {
		return fechaBloqueoFin;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad fecha bloqueo inicio.
	 *
	 * @param fechaBloqueoInicio el nuevo valor para la propiedad fecha bloqueo
	 *                           inicio
	 */
	public void setFechaBloqueoInicio(Date fechaBloqueoInicio) {
		this.fechaBloqueoInicio = fechaBloqueoInicio;
	}

	/**
	 * Obtiene el valor para la propiedad fecha bloqueo inicio.
	 *
	 * @return El valor de la propiedad fecha bloqueo inicio
	 */
	public java.util.Date getFechaBloqueoInicio() {
		return fechaBloqueoInicio;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad fecha creacion.
	 *
	 * @param fechaCreacion el nuevo valor para la propiedad fecha creacion
	 */
	public void setFechaCreacion(java.util.Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	/**
	 * Obtiene el valor para la propiedad fecha creacion.
	 *
	 * @return El valor de la propiedad fecha creacion
	 */
	public java.util.Date getFechaCreacion() {
		return fechaCreacion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad fecha modificacion.
	 *
	 * @param fechaModificacion el nuevo valor para la propiedad fecha modificacion
	 */
	public void setFechaModificacion(java.util.Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

	/**
	 * Obtiene el valor para la propiedad fecha modificacion.
	 *
	 * @return El valor de la propiedad fecha modificacion
	 */
	public java.util.Date getFechaModificacion() {
		return fechaModificacion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad observacion bloqueo.
	 *
	 * @param observacionBloqueo el nuevo valor para la propiedad observacion
	 *                           bloqueo
	 */
	public void setObservacionBloqueo(java.lang.String observacionBloqueo) {
		this.observacionBloqueo = observacionBloqueo;
	}

	/**
	 * Obtiene el valor para la propiedad observacion bloqueo.
	 *
	 * @return El valor de la propiedad observacion bloqueo
	 */
	public java.lang.String getObservacionBloqueo() {
		return observacionBloqueo;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad id usuario creacion.
	 *
	 * @param idUsuarioCreacion el nuevo valor para la propiedad id usuario creacion
	 */
	public void setIdUsuarioCreacion(java.lang.String idUsuarioCreacion) {
		this.idUsuarioCreacion = idUsuarioCreacion;
	}

	/**
	 * Obtiene el valor para la propiedad id usuario creacion.
	 *
	 * @return El valor de la propiedad id usuario creacion
	 */
	public java.lang.String getIdUsuarioCreacion() {
		return idUsuarioCreacion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad ip creacion.
	 *
	 * @param ipCreacion el nuevo valor para la propiedad ip creacion
	 */
	public void setIpCreacion(java.lang.String ipCreacion) {
		this.ipCreacion = ipCreacion;
	}

	/**
	 * Obtiene el valor para la propiedad ip creacion.
	 *
	 * @return El valor de la propiedad ip creacion
	 */
	public java.lang.String getIpCreacion() {
		return ipCreacion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad id usuario modificacion.
	 *
	 * @param idUsuarioModificacion el nuevo valor para la propiedad id usuario
	 *                              modificacion
	 */
	public void setIdUsuarioModificacion(java.lang.String idUsuarioModificacion) {
		this.idUsuarioModificacion = idUsuarioModificacion;
	}

	/**
	 * Obtiene el valor para la propiedad id usuario modificacion.
	 *
	 * @return El valor de la propiedad id usuario modificacion
	 */
	public java.lang.String getIdUsuarioModificacion() {
		return idUsuarioModificacion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad ip modificacion.
	 *
	 * @param ipModificacion el nuevo valor para la propiedad ip modificacion
	 */
	public void setIpModificacion(java.lang.String ipModificacion) {
		this.ipModificacion = ipModificacion;
	}

	/**
	 * Obtiene el valor para la propiedad ip modificacion.
	 *
	 * @return El valor de la propiedad ip modificacion
	 */
	public java.lang.String getIpModificacion() {
		return ipModificacion;
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
	 * Obtiene el valor para la propiedad soporte bloqueo.
	 *
	 * @return El valor de la propiedad soporte bloqueo
	 */
	public byte[] getSoporteBloqueo() {
		return soporteBloqueo;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad soporte bloqueo.
	 *
	 * @param soporteBloqueo el nuevo valor para la propiedad soporte bloqueo
	 */
	public void setSoporteBloqueo(byte[] soporteBloqueo) {
		this.soporteBloqueo = soporteBloqueo;
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

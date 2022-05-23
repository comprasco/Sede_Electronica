/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: AsociacionUsuarioEntidadEspecial.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model
 * Nombre del elemento: AsociacionUsuarioEntidadEspecial
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Clase tipo entidad o modelo de datos de la capa de persistencia.<br>
 * Representa una entidad de persistencia para una tabla de la base de
 * datos.<br>
 * Esta clase representa la entidad <b>Asociacion usuario entidad especial</b>,
 * <br>
 * que permite la persistencia en la tabla
 * <b>SDB_AUT_ASOCIACION_USUARIO_ENTIDAD_ESPECIAL</b> de la base de datos.
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
@Table(name="SDB_AUT_ASOCIACION_USUARIO_ENTIDAD_ESPECIAL")
@NamedQueries( value = {
	@NamedQuery(name="AsociacionUsuarioEntidadEspecial.findAll", query="SELECT s FROM AsociacionUsuarioEntidadEspecial s"),
	@NamedQuery(name="AsociacionUsuarioEntidadEspecial.consultarAsociacionesEE", query="SELECT s FROM AsociacionUsuarioEntidadEspecial s WHERE s.entidadEspecial.id = :idEntidadEspecial"),
	@NamedQuery(name="AsociacionUsuarioEntidadEspecial.consultarAsociacionesUsuarioEE", query="SELECT s FROM AsociacionUsuarioEntidadEspecial s WHERE s.usuario.id = :idUsuario"),
	@NamedQuery(name="AsociacionUsuarioEntidadEspecial.consultarAsociacionEEPN", query="SELECT s FROM AsociacionUsuarioEntidadEspecial s WHERE s.usuario.id = :idUsuario AND s.entidadEspecial.id = :idUsuarioEE"),
	@NamedQuery(name="AsociacionUsuarioEntidadEspecial.consultarAsociacion", query="SELECT s FROM AsociacionUsuarioEntidadEspecial s WHERE s.usuario.id = :idUsuario AND s.entidadEspecial.id = :entidadEspecial")
})
public class AsociacionUsuarioEntidadEspecial implements Serializable {
	
	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo para definir la propiedad id asociacion.
	 */
	@Id
	@Column(name="ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEC_AUT_ASOCIACION_USUARIO_ENTIDAD_ESPECIAL")
	@SequenceGenerator(sequenceName = "SEC_AUT_ASOCIACION_USUARIO_ENTIDAD_ESPECIAL",allocationSize = 1,  name = "SEC_AUT_ASOCIACION_USUARIO_ENTIDAD_ESPECIAL")
	private String idAsociacion;

	/**
	 * Atributo para definir la propiedad activo.
	 */
	@Column(name="ACTIVO")
	private String activo;

	/**
	 * Atributo para definir la propiedad celular.
	 */
	@Column(name="CELULAR")
	private String celular;

	/**
	 * Atributo para definir la propiedad confirmacion usuario.
	 */
	@Column(name="CONFIRMACION_USUARIO")
	private String confirmacionUsuario;

	/**
	 * Atributo para definir la propiedad correo electronico.
	 */
	@Column(name="CORREO_ELECTRONICO")
	private String correoElectronico;

	/**
	 * Atributo para definir la propiedad estado.
	 */
	@Column(name="ESTADO")
	private String estado;

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
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaCreacion;

	/**
	 * Atributo para definir la propiedad fecha modificacion.
	 */
	@Column(name="FECHA_MODIFICACION")
	@Temporal(TemporalType.TIMESTAMP)
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
	 * Atributo para definir la propiedad entidad especial.
	 */
	//bi-directional many-to-one association to EntidadEspecial
	@ManyToOne
	@JoinColumn(name="ID_ENTIDAD_ESPECIAL")
	private EntidadEspecial entidadEspecial;

	/**
	 * Atributo para definir la propiedad usuario.
	 */
	//bi-directional many-to-one association to Usuario
	@ManyToOne
	@JoinColumn(name="ID_USUARIO")
	private Usuario usuario;

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * AsociacionUsuarioEntidadEspecial.
	 */
	public AsociacionUsuarioEntidadEspecial() {
		// Metodo constructor vacio para modelo de persistencia 
	}

	/**
	 * Obtiene el valor para la propiedad id asociacion.
	 *
	 * @return El valor de la propiedad id asociacion
	 */
	public String getIdAsociacion() {
		return this.idAsociacion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad id asociacion.
	 *
	 * @param idAsociacion el nuevo valor para la propiedad id asociacion
	 */
	public void setIdAsociacion(String idAsociacion) {
		this.idAsociacion = idAsociacion;
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
	 * Obtiene el valor para la propiedad celular.
	 *
	 * @return El valor de la propiedad celular
	 */
	public String getCelular() {
		return this.celular;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad celular.
	 *
	 * @param celular el nuevo valor para la propiedad celular
	 */
	public void setCelular(String celular) {
		this.celular = celular;
	}

	/**
	 * Obtiene el valor para la propiedad confirmacion usuario.
	 *
	 * @return El valor de la propiedad confirmacion usuario
	 */
	public String getConfirmacionUsuario() {
		return this.confirmacionUsuario;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad confirmacion usuario.
	 *
	 * @param confirmacionUsuario el nuevo valor para la propiedad confirmacion
	 *                            usuario
	 */
	public void setConfirmacionUsuario(String confirmacionUsuario) {
		this.confirmacionUsuario = confirmacionUsuario;
	}

	/**
	 * Obtiene el valor para la propiedad correo electronico.
	 *
	 * @return El valor de la propiedad correo electronico
	 */
	public String getCorreoElectronico() {
		return this.correoElectronico;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad correo electronico.
	 *
	 * @param correoElectronico el nuevo valor para la propiedad correo electronico
	 */
	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	/**
	 * Obtiene el valor para la propiedad estado.
	 *
	 * @return El valor de la propiedad estado
	 */
	public String getEstado() {
		return this.estado;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad estado.
	 *
	 * @param estado el nuevo valor para la propiedad estado
	 */
	public void setEstado(String estado) {
		this.estado = estado;
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
	 * Obtiene el valor para la propiedad entidad especial.
	 *
	 * @return El valor de la propiedad entidad especial
	 */
	public EntidadEspecial getEntidadEspecial() {
		return this.entidadEspecial;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad entidad especial.
	 *
	 * @param entidadEspecial el nuevo valor para la propiedad entidad especial
	 */
	public void setEntidadEspecial(EntidadEspecial entidadEspecial) {
		this.entidadEspecial = entidadEspecial;
	}

	/**
	 * Obtiene el valor para la propiedad usuario.
	 *
	 * @return El valor de la propiedad usuario
	 */
	public Usuario getUsuario() {
		return this.usuario;
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
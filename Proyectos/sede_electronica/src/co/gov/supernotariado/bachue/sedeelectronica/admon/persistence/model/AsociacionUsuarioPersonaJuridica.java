/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: AsociacionUsuarioPersonaJuridica.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model
 * Nombre del elemento: AsociacionUsuarioPersonaJuridica
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.eclipse.persistence.annotations.Cache;
import org.eclipse.persistence.config.CacheIsolationType;

/**
 * Clase tipo entidad o modelo de datos de la capa de persistencia.<br>
 * Representa una entidad de persistencia para una tabla de la base de
 * datos.<br>
 * Esta clase representa la entidad <b>Asociacion usuario persona juridica</b>,
 * <br>
 * que permite la persistencia en la tabla
 * <b>SDB_AUT_ASOCIACION_USUARIO_PERSONA_JURIDICA</b> de la base de datos.
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
@Table(name="SDB_AUT_ASOCIACION_USUARIO_PERSONA_JURIDICA")
@NamedQueries( value = {
	@NamedQuery(name="AsociacionUsuarioPersonaJuridica.findAll", query="SELECT s FROM AsociacionUsuarioPersonaJuridica s"),
	@NamedQuery(name="AsociacionUsuarioPersonaJuridica.consultarAsociacionId", query="SELECT s FROM AsociacionUsuarioPersonaJuridica s WHERE s.idAsociacion = :idAsociacion"),
	@NamedQuery(name="AsociacionUsuarioPersonaJuridica.consultarAsociacionesPJ", query="SELECT s FROM AsociacionUsuarioPersonaJuridica s WHERE s.idPersonaJuridica = :idPersonaJuridica ORDER BY s.estadoAsociacion DESC"),
	@NamedQuery(name="AsociacionUsuarioPersonaJuridica.consultarAsociacionesUsuarioPJ", query="SELECT s FROM AsociacionUsuarioPersonaJuridica s WHERE s.usuario.id = :idUsuario"),
	@NamedQuery(name="AsociacionUsuarioPersonaJuridica.consultarAsociaciones", query="SELECT s FROM AsociacionUsuarioPersonaJuridica s WHERE s.personaJuridica.persona.numeroDocumento = :numeroPersonaJuridica AND s.usuario.id = :idUsuario")
})
public class AsociacionUsuarioPersonaJuridica implements Serializable {
	
	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo para definir la propiedad id asociacion.
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEC_AUT_ASOCIACION_USUARIO_PERSONA_JURIDICA")
	@SequenceGenerator(sequenceName = "SEC_AUT_ASOCIACION_USUARIO_PERSONA_JURIDICA", allocationSize = 1,  name = "SEC_AUT_ASOCIACION_USUARIO_PERSONA_JURIDICA")
	@Column(name="ID")
	private String idAsociacion;

	/**
	 * Atributo para definir la propiedad activo.
	 */
	@Column(name="ACTIVO")
	private String activo;

	/**
	 * Atributo para definir la propiedad celular corporativo.
	 */
	@Column(name="CELULAR_CORPORATIVO")
	private String celularCorporativo;

	/**
	 * Atributo para definir la propiedad confirmacion usuario.
	 */
	@Column(name="CONFIRMACION_USUARIO")
	private String confirmacionUsuario;

	/**
	 * Atributo para definir la propiedad correo electronico corporativo.
	 */
	@Column(name="CORREO_ELECTRONICO_CORPORATIVO")
	private String correoElectronicoCorporativo;

	/**
	 * Atributo para definir la propiedad estado asociacion.
	 */
	@Column(name="ESTADO_ASOCIACION")
	private String estadoAsociacion;

	/**
	 * Atributo para definir la propiedad estado cuenta cupo.
	 */
	@Column(name="ESTADO_CUENTA_CUPO")
	private String estadoCuentaCupo;

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
	 * Atributo para definir la propiedad id persona juridica.
	 */
	@Column(name="ID_PERSONA_JURIDICA")
	private String idPersonaJuridica;

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
	 * Atributo para definir la propiedad usuario.
	 */
	//bi-directional many-to-one association to Usuario
	@ManyToOne
	@JoinColumn(name="ID_USUARIO_PERSONA_NATURAL")
	private Usuario usuario;

	/**
	 * Atributo para definir la propiedad persona juridica.
	 */
	//bi-directional many-to-one association to Usuario
	@ManyToOne(cascade=CascadeType.REMOVE)
	@PrimaryKeyJoinColumn(name="ID_PERSONA_JURIDICA")
	private PersonaJuridica personaJuridica;

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * AsociacionUsuarioPersonaJuridica.
	 */
	public AsociacionUsuarioPersonaJuridica() {
		//Metodo constructor vacio para modelo de persistencia
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
	 * Obtiene el valor para la propiedad celular corporativo.
	 *
	 * @return El valor de la propiedad celular corporativo
	 */
	public String getCelularCorporativo() {
		return this.celularCorporativo;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad celular corporativo.
	 *
	 * @param celularCorporativo el nuevo valor para la propiedad celular
	 *                           corporativo
	 */
	public void setCelularCorporativo(String celularCorporativo) {
		this.celularCorporativo = celularCorporativo;
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
	 * Obtiene el valor para la propiedad correo electronico corporativo.
	 *
	 * @return El valor de la propiedad correo electronico corporativo
	 */
	public String getCorreoElectronicoCorporativo() {
		return this.correoElectronicoCorporativo;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad correo electronico corporativo.
	 *
	 * @param correoElectronicoCorporativo el nuevo valor para la propiedad correo
	 *                                     electronico corporativo
	 */
	public void setCorreoElectronicoCorporativo(String correoElectronicoCorporativo) {
		this.correoElectronicoCorporativo = correoElectronicoCorporativo;
	}

	/**
	 * Obtiene el valor para la propiedad estado asociacion.
	 *
	 * @return El valor de la propiedad estado asociacion
	 */
	public String getEstadoAsociacion() {
		return this.estadoAsociacion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad estado asociacion.
	 *
	 * @param estadoAsociacion el nuevo valor para la propiedad estado asociacion
	 */
	public void setEstadoAsociacion(String estadoAsociacion) {
		this.estadoAsociacion = estadoAsociacion;
	}

	/**
	 * Obtiene el valor para la propiedad estado cuenta cupo.
	 *
	 * @return El valor de la propiedad estado cuenta cupo
	 */
	public String getEstadoCuentaCupo() {
		return this.estadoCuentaCupo;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad estado cuenta cupo.
	 *
	 * @param estadoCuentaCupo el nuevo valor para la propiedad estado cuenta cupo
	 */
	public void setEstadoCuentaCupo(String estadoCuentaCupo) {
		this.estadoCuentaCupo = estadoCuentaCupo;
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
	 * @param date el nuevo valor para la propiedad fecha creacion
	 */
	public void setFechaCreacion(Date date) {
		this.fechaCreacion = date;
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
	 * Obtiene el valor para la propiedad id persona juridica.
	 *
	 * @return El valor de la propiedad id persona juridica
	 */
	public String getIdPersonaJuridica() {
		return this.idPersonaJuridica;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad id persona juridica.
	 *
	 * @param idPersonaJuridica el nuevo valor para la propiedad id persona juridica
	 */
	public void setIdPersonaJuridica(String idPersonaJuridica) {
		this.idPersonaJuridica = idPersonaJuridica;
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
	 * Obtiene el valor para la propiedad persona juridica.
	 *
	 * @return El valor de la propiedad persona juridica
	 */
	public PersonaJuridica getPersonaJuridica() {
		return personaJuridica;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad persona juridica.
	 *
	 * @param personaJuridica el nuevo valor para la propiedad persona juridica
	 */
	public void setPersonaJuridica(PersonaJuridica personaJuridica) {
		this.personaJuridica = personaJuridica;
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
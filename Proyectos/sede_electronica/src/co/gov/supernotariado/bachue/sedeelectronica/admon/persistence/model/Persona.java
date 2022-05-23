/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: Persona.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model
 * Nombre del elemento: Persona
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model;

import java.io.Serializable;
import javax.persistence.*;

import org.eclipse.persistence.annotations.Cache;
import org.eclipse.persistence.config.CacheIsolationType;

import java.util.Date;
import java.util.List;

/**
 * Clase tipo entidad o modelo de datos de la capa de persistencia.<br>
 * Representa una entidad de persistencia para una tabla de la base de
 * datos.<br>
 * Esta clase representa la entidad <b>Persona</b>, <br>
 * que permite la persistencia en la tabla <b>SDB_AUT_PERSONA</b> de la base de
 * datos.
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
@Table(name = "SDB_AUT_PERSONA")
@NamedQueries(value = { 
		@NamedQuery(name = "Persona.findAll", query = "SELECT s FROM Persona s"),
		@NamedQuery(name = "Persona.findPersonById", query = "SELECT s FROM Persona s WHERE s.id = :idPersona"),
		@NamedQuery(name = "Persona.findPersonByDocument", query = "SELECT c FROM Persona c WHERE c.tipoDocumento.id = :idTipoDocumento and c.numeroDocumento = :numeroDocumento ")
})
public class Persona implements Serializable {
	
	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo para definir la propiedad id.
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEC_AUT_PERSONA_ID_GENERATOR")
	@SequenceGenerator(sequenceName = "SEC_AUT_PERSONA",allocationSize = 1,  name = "SEC_AUT_PERSONA_ID_GENERATOR")
	private String id;

	/**
	 * Atributo para definir la propiedad activo.
	 */
	@Column(name = "ACTIVO")
	private String activo;

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
	 * Atributo para definir la propiedad numero documento.
	 */
	@Column(name = "NUMERO_DOCUMENTO")
	private String numeroDocumento;
	
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
	 * Atributo para definir la propiedad catalogo.
	 */
	// bi-directional many-to-one association to Catalogo
	@ManyToOne
	@JoinColumn(name = "ID_CATALOGO_TIPO_PERSONA")
	private Catalogo catalogo;

	/**
	 * Atributo para definir la propiedad tipo documento.
	 */
	// bi-directional many-to-one association to TipoDocumento
	@ManyToOne
	@JoinColumn(name = "ID_TIPO_DOCUMENTO")
	private TipoDocumento tipoDocumento;

	/**
	 * Atributo para definir la propiedad persona juridica.
	 */
	// bi-directional one-to-one association to PersonaJuridica
	@OneToOne(mappedBy = "persona")
	private PersonaJuridica personaJuridica;

	/**
	 * Atributo para definir la propiedad persona natural.
	 */
	// bi-directional one-to-one association to PersonaNatural
	@OneToOne(mappedBy = "persona")
	private PersonaNatural personaNatural;

	/**
	 * Atributo para definir la propiedad usuario.
	 */
	// bi-directional many-to-one association to Usuario
	@OneToOne(mappedBy = "persona" )
	private Usuario usuario;

	/**
	 * Atributo para definir la propiedad persona direccions.
	 */
	// bi-directional many-to-one association to PersonaDireccion
	@OneToMany(mappedBy = "persona",cascade=CascadeType.REMOVE)
	private List<PersonaDireccion> personaDireccions;

	/**
	 * Construye una nueva instancia/objeto de la clase Persona.
	 */
	public Persona() {
		super();
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
	 * Obtiene el valor para la propiedad numero documento.
	 *
	 * @return El valor de la propiedad numero documento
	 */
	public String getNumeroDocumento() {
		return this.numeroDocumento;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad numero documento.
	 *
	 * @param numeroDocumento el nuevo valor para la propiedad numero documento
	 */
	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	/**
	 * Obtiene el valor para la propiedad catalogo.
	 *
	 * @return El valor de la propiedad catalogo
	 */
	public Catalogo getCatalogo() {
		return this.catalogo;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad catalogo.
	 *
	 * @param catalogo el nuevo valor para la propiedad catalogo
	 */
	public void setCatalogo(Catalogo catalogo) {
		this.catalogo = catalogo;
	}

	/**
	 * Obtiene el valor para la propiedad tipo documento.
	 *
	 * @return El valor de la propiedad tipo documento
	 */
	public TipoDocumento getTipoDocumento() {
		return this.tipoDocumento;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tipo documento.
	 *
	 * @param tipoDocumento el nuevo valor para la propiedad tipo documento
	 */
	public void setTipoDocumento(TipoDocumento tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	/**
	 * Obtiene el valor para la propiedad persona juridica.
	 *
	 * @return El valor de la propiedad persona juridica
	 */
	public PersonaJuridica getPersonaJuridica() {
		return this.personaJuridica;
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
	 * Obtiene el valor para la propiedad persona natural.
	 *
	 * @return El valor de la propiedad persona natural
	 */
	public PersonaNatural getPersonaNatural() {
		return this.personaNatural;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad persona natural.
	 *
	 * @param personaNatural el nuevo valor para la propiedad persona natural
	 */
	public void setPersonaNatural(PersonaNatural personaNatural) {
		this.personaNatural = personaNatural;
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
	 * Obtiene el valor para la propiedad persona direccions.
	 *
	 * @return El valor de la propiedad persona direccions
	 */
	public List<PersonaDireccion> getPersonaDireccions() {
		return this.personaDireccions;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad persona direccions.
	 *
	 * @param personaDireccions el nuevo valor para la propiedad persona direccions
	 */
	public void setPersonaDireccions(List<PersonaDireccion> personaDireccions) {
		this.personaDireccions = personaDireccions;
	}

	/**
	 * Agrega el/la persona direccion.
	 *
	 * @param personaDireccion el parametro persona direccion
	 * @return Resultado para Agrega el/la persona direccion retornado como
	 *         PersonaDireccion
	 */
	public PersonaDireccion addPersonaDireccion(PersonaDireccion personaDireccion) {
		getPersonaDireccions().add(personaDireccion);
		personaDireccion.setPersona(this);

		return personaDireccion;
	}

	/**
	 * Remueve el/la persona direccion.
	 *
	 * @param personaDireccion el parametro persona direccion
	 * @return Resultado para Remueve el/la persona direccion retornado como
	 *         PersonaDireccion
	 */
	public PersonaDireccion removePersonaDireccion(PersonaDireccion personaDireccion) {
		getPersonaDireccions().remove(personaDireccion);
		personaDireccion.setPersona(null);

		return personaDireccion;
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
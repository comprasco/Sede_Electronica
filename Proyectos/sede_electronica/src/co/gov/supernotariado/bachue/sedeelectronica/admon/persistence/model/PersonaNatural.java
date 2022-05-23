/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: PersonaNatural.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model
 * Nombre del elemento: PersonaNatural
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * Clase tipo entidad o modelo de datos de la capa de persistencia.<br>
 * Representa una entidad de persistencia para una tabla de la base de
 * datos.<br>
 * Esta clase representa la entidad <b>Persona natural</b>, <br>
 * que permite la persistencia en la tabla <b>SDB_AUT_PERSONA_NATURAL</b> de la
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
@Table(name = "SDB_AUT_PERSONA_NATURAL")
@NamedQueries( value = {
	@NamedQuery(name = "PersonaNatural.findAll", query = "SELECT s FROM PersonaNatural s"),
	@NamedQuery(name="PersonaNatural.consultarPersonaNatural", query="SELECT s FROM PersonaNatural s WHERE s.persona.numeroDocumento =:numeroDocumento")})
public class PersonaNatural implements Serializable {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo para definir la propiedad persona.
	 */
	// bi-directional one-to-one association to Persona
	@Id
	@OneToOne(cascade=CascadeType.ALL, optional=false)
	@JoinColumn(name = "ID_PERSONA", unique=true, nullable=false)
	private Persona persona;
	
	/**
	 * Atributo para definir la propiedad activo.
	 */
	@Column(name="ACTIVO")
	private String activo;
	
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
	@Column(name = "FECHA_CREACION")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaCreacion;

	/**
	 * Atributo para definir la propiedad fecha expedicion.
	 */
	@Column(name = "FECHA_EXPEDICION")
	@Temporal(TemporalType.DATE)
	private Date fechaExpedicion;

	/**
	 * Atributo para definir la propiedad fecha modificacion.
	 */
	@Column(name = "FECHA_MODIFICACION")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaModificacion;

	/**
	 * Atributo para definir la propiedad fecha nacimiento.
	 */
	@Column(name = "FECHA_NACIMIENTO")
	@Temporal(TemporalType.DATE)
	private Date fechaNacimiento;

	/**
	 * Atributo para definir la propiedad catalogo tipo genero.
	 */
	// bi-directional many-to-one association to Catalogo
	@ManyToOne
	@JoinColumn(name = "ID_CATALOGO_TIPO_GENERO")
	private Catalogo catalogoTipoGenero;

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
	 * Atributo para definir la propiedad primer apellido.
	 */
	@Column(name = "PRIMER_APELLIDO")
	private String primerApellido;

	/**
	 * Atributo para definir la propiedad primer nombre.
	 */
	@Column(name = "PRIMER_NOMBRE")
	private String primerNombre;

	/**
	 * Atributo para definir la propiedad segundo apellido.
	 */
	@Column(name = "SEGUNDO_APELLIDO")
	private String segundoApellido;

	/**
	 * Atributo para definir la propiedad segundo nombre.
	 */
	@Column(name = "SEGUNDO_NOMBRE")
	private String segundoNombre;

	/**
	 * Atributo para definir la propiedad telefono.
	 */
	@Column(name = "TELEFONO")
	private String telefono;

	/**
	 * Construye una nueva instancia/objeto de la clase PersonaNatural.
	 */
	public PersonaNatural() {
		this.setPersona(new Persona());
	}
	
	/**
	 * Obtiene el valor para la propiedad activo.
	 *
	 * @return El valor de la propiedad activo
	 */
	public String getActivo() {
		return activo;
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
	
	/**
	 * Obtiene el valor para la propiedad persona.
	 *
	 * @return El valor de la propiedad persona
	 */
	public Persona getPersona() {
		return persona;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad persona.
	 *
	 * @param persona el nuevo valor para la propiedad persona
	 */
	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	/**
	 * Obtiene el valor para la propiedad fecha creacion.
	 *
	 * @return El valor de la propiedad fecha creacion
	 */
	public Date getFechaCreacion() {
		return fechaCreacion;
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
	 * Obtiene el valor para la propiedad fecha expedicion.
	 *
	 * @return El valor de la propiedad fecha expedicion
	 */
	public Date getFechaExpedicion() {
		return fechaExpedicion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad fecha expedicion.
	 *
	 * @param fechaExpedicion el nuevo valor para la propiedad fecha expedicion
	 */
	public void setFechaExpedicion(Date fechaExpedicion) {
		this.fechaExpedicion = fechaExpedicion;
	}

	/**
	 * Obtiene el valor para la propiedad fecha modificacion.
	 *
	 * @return El valor de la propiedad fecha modificacion
	 */
	public Date getFechaModificacion() {
		return fechaModificacion;
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
	 * Obtiene el valor para la propiedad fecha nacimiento.
	 *
	 * @return El valor de la propiedad fecha nacimiento
	 */
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad fecha nacimiento.
	 *
	 * @param fechaNacimiento el nuevo valor para la propiedad fecha nacimiento
	 */
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	/**
	 * Obtiene el valor para la propiedad catalogo tipo genero.
	 *
	 * @return El valor de la propiedad catalogo tipo genero
	 */
	public Catalogo getCatalogoTipoGenero() {
		return catalogoTipoGenero;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad catalogo tipo genero.
	 *
	 * @param catalogoTipoGenero el nuevo valor para la propiedad catalogo tipo
	 *                           genero
	 */
	public void setCatalogoTipoGenero(Catalogo catalogoTipoGenero) {
		this.catalogoTipoGenero = catalogoTipoGenero;
	}

	/**
	 * Obtiene el valor para la propiedad id usuario creacion.
	 *
	 * @return El valor de la propiedad id usuario creacion
	 */
	public String getIdUsuarioCreacion() {
		return idUsuarioCreacion;
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
		return idUsuarioModificacion;
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
		return ipCreacion;
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
		return ipModificacion;
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
	 * Obtiene el valor para la propiedad primer apellido.
	 *
	 * @return El valor de la propiedad primer apellido
	 */
	public String getPrimerApellido() {
		return primerApellido;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad primer apellido.
	 *
	 * @param primerApellido el nuevo valor para la propiedad primer apellido
	 */
	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	/**
	 * Obtiene el valor para la propiedad primer nombre.
	 *
	 * @return El valor de la propiedad primer nombre
	 */
	public String getPrimerNombre() {
		return primerNombre;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad primer nombre.
	 *
	 * @param primerNombre el nuevo valor para la propiedad primer nombre
	 */
	public void setPrimerNombre(String primerNombre) {
		this.primerNombre = primerNombre;
	}

	/**
	 * Obtiene el valor para la propiedad segundo apellido.
	 *
	 * @return El valor de la propiedad segundo apellido
	 */
	public String getSegundoApellido() {
		return segundoApellido;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad segundo apellido.
	 *
	 * @param segundoApellido el nuevo valor para la propiedad segundo apellido
	 */
	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	/**
	 * Obtiene el valor para la propiedad segundo nombre.
	 *
	 * @return El valor de la propiedad segundo nombre
	 */
	public String getSegundoNombre() {
		return segundoNombre;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad segundo nombre.
	 *
	 * @param segundoNombre el nuevo valor para la propiedad segundo nombre
	 */
	public void setSegundoNombre(String segundoNombre) {
		this.segundoNombre = segundoNombre;
	}

	/**
	 * Obtiene el valor para la propiedad telefono.
	 *
	 * @return El valor de la propiedad telefono
	 */
	public String getTelefono() {
		return telefono;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad telefono.
	 *
	 * @param telefono el nuevo valor para la propiedad telefono
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
}
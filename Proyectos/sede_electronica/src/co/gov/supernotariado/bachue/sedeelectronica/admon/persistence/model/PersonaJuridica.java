/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: PersonaJuridica.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model
 * Nombre del elemento: PersonaJuridica
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.eclipse.persistence.annotations.Cache;
import org.eclipse.persistence.config.CacheIsolationType;


/**
 * Clase tipo entidad o modelo de datos de la capa de persistencia.<br>
 * Representa una entidad de persistencia para una tabla de la base de
 * datos.<br>
 * Esta clase representa la entidad <b>Persona juridica</b>, <br>
 * que permite la persistencia en la tabla <b>SDB_AUT_PERSONA_JURIDICA</b> de la
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
@Cache(isolation=CacheIsolationType.ISOLATED)
@Table(name="SDB_AUT_PERSONA_JURIDICA")
@NamedQueries( value ={
	@NamedQuery(name="PersonaJuridica.findAll", query="SELECT s FROM PersonaJuridica s"),
	@NamedQuery(name="PersonaJuridica.consultarPersonaJuridica", query="SELECT s FROM PersonaJuridica s WHERE s.persona.numeroDocumento =:numeroDocumento"),
	@NamedQuery(name="PersonaJuridicaDocumento.findByNombre", query = "SELECT s FROM PersonaJuridica s WHERE s.nombreDocumentoCamara = :nombreDocumentoCamara")
})
public class PersonaJuridica implements Serializable {
	
	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo para definir la propiedad persona.
	 */
	//bi-directional one-to-one association to Persona
	@Id
	@OneToOne(cascade=CascadeType.REMOVE)
	@JoinColumn(name="ID_PERSONA")
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
	 * Atributo para definir la propiedad documento camara comercio.
	 */
	@Lob
	@Column(name="DOCUMENTO_CAMARA_COMERCIO")
	private byte[] documentoCamaraComercio;
	
	/**
	 * Atributo para definir la propiedad nombre documento camara.
	 */
	@Column(name="NOMBRE_DOCUMENTO_CAMARA")
	private String nombreDocumentoCamara;

	/**
	 * Atributo para definir la propiedad documento carta representante legal.
	 */
	@Lob
	@Column(name="DOCUMENTO_CARTA_REPRESENTANTE_LEGAL")
	private byte[] documentoCartaRepresentanteLegal;
	
	/**
	 * Atributo para definir la propiedad nombre documento representante.
	 */
	@Column(name="NOMBRE_DOCUMENTO_REPRESENTANTE")
	private String nombreDocumentoRepresentante;

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
	 * Atributo para definir la propiedad id usuario administrador.
	 */
	@Column(name="ID_USUARIO_ADMINISTRADOR")
	private String idUsuarioAdministrador;

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
	 * Atributo para definir la propiedad razon social.
	 */
	@Column(name="RAZON_SOCIAL")
	private String razonSocial;

	/**
	 * Atributo para definir la propiedad representante legal.
	 */
	@Column(name="PRIMER_NOMBRE_REPRESENTANTE")
	private String primerNombreRepresentanteLegal;
	
	/**
	 * Atributo para definir la propiedad representante legal.
	 */
	@Column(name="SEGUNDO_NOMBRE_REPRESENTANTE")
	private String segundoNombreRepresentanteLegal;

	/**
	 * Atributo para definir la propiedad representante legal.
	 */
	@Column(name="PRIMER_APELLIDO_REPRESENTANTE")
	private String primerApellidoRepresentanteLegal;
	
	/**
	 * Atributo para definir la propiedad representante legal.
	 */
	@Column(name="SEGUNDO_APELLIDO_REPRESENTANTE")
	private String segundoApellidoRepresentanteLegal;

	/**
	 * Atributo para definir la propiedad telefono.
	 */
	@Column(name="TELEFONO")
	private String telefono;

	/**
	 * Atributo para definir la propiedad usuarios.
	 */
	//bi-directional many-to-one association to Usuario
	@OneToMany(mappedBy="personaJuridica")
	private List<Usuario> usuarios;

	/**
	 * Atributo para definir la propiedad tipo catalogo tipo organizacion.
	 */
	// bi-directional many-to-one association to Catalogo
	@ManyToOne
	@JoinColumn(name = "ID_CATALOGO_TIPO_ORGANIZACION")
	private Catalogo tipoCatalogoTipoOrganizacion;

	/**
	 * Atributo para definir la propiedad asociacion usuario persona juridicas.
	 */
	//bi-directional many-to-one association to AsociacionUsuarioPersonaJuridica
	@OneToMany(mappedBy="personaJuridica")
	private List<AsociacionUsuarioPersonaJuridica> asociacionUsuarioPersonaJuridicas;

	/**
	 * Construye una nueva instancia/objeto de la clase PersonaJuridica.
	 */
	public PersonaJuridica() {
		//Metodo constructor vacio para modelo de persistencia
	}

	/**
	 * Obtiene el valor para la propiedad documento camara comercio.
	 *
	 * @return El valor de la propiedad documento camara comercio
	 */
	public byte[] getDocumentoCamaraComercio() {
		return this.documentoCamaraComercio;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad documento camara comercio.
	 *
	 * @param documentoCamaraComercio el nuevo valor para la propiedad documento
	 *                                camara comercio
	 */
	public void setDocumentoCamaraComercio(byte[] documentoCamaraComercio) {
		this.documentoCamaraComercio = documentoCamaraComercio;
	}

	/**
	 * Obtiene el valor para la propiedad documento carta representante legal.
	 *
	 * @return El valor de la propiedad documento carta representante legal
	 */
	public byte[] getDocumentoCartaRepresentanteLegal() {
		return this.documentoCartaRepresentanteLegal;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad documento carta representante
	 * legal.
	 *
	 * @param documentoCartaRepresentanteLegal el nuevo valor para la propiedad
	 *                                         documento carta representante legal
	 */
	public void setDocumentoCartaRepresentanteLegal(byte[] documentoCartaRepresentanteLegal) {
		this.documentoCartaRepresentanteLegal = documentoCartaRepresentanteLegal;
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
	 * Obtiene el valor para la propiedad id usuario administrador.
	 *
	 * @return El valor de la propiedad id usuario administrador
	 */
	public String getIdUsuarioAdministrador() {
		return this.idUsuarioAdministrador;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad id usuario administrador.
	 *
	 * @param idUsuarioAdministrador el nuevo valor para la propiedad id usuario
	 *                               administrador
	 */
	public void setIdUsuarioAdministrador(String idUsuarioAdministrador) {
		this.idUsuarioAdministrador = idUsuarioAdministrador;
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
	 * Obtiene el valor para la propiedad razon social.
	 *
	 * @return El valor de la propiedad razon social
	 */
	public String getRazonSocial() {
		return this.razonSocial;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad razon social.
	 *
	 * @param razonSocial el nuevo valor para la propiedad razon social
	 */
	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	public String getPrimerNombreRepresentanteLegal() {
		return primerNombreRepresentanteLegal;
	}

	public void setPrimerNombreRepresentanteLegal(String primerNombreRepresentanteLegal) {
		this.primerNombreRepresentanteLegal = primerNombreRepresentanteLegal;
	}

	public String getSegundoNombreRepresentanteLegal() {
		return segundoNombreRepresentanteLegal;
	}

	public void setSegundoNombreRepresentanteLegal(String segundoNombreRepresentanteLegal) {
		this.segundoNombreRepresentanteLegal = segundoNombreRepresentanteLegal;
	}

	public String getPrimerApellidoRepresentanteLegal() {
		return primerApellidoRepresentanteLegal;
	}

	public void setPrimerApellidoRepresentanteLegal(String primerApellidoRepresentanteLegal) {
		this.primerApellidoRepresentanteLegal = primerApellidoRepresentanteLegal;
	}

	public String getSegundoApellidoRepresentanteLegal() {
		return segundoApellidoRepresentanteLegal;
	}

	public void setSegundoApellidoRepresentanteLegal(String segundoApellidoRepresentanteLegal) {
		this.segundoApellidoRepresentanteLegal = segundoApellidoRepresentanteLegal;
	}

	/**
	 * Obtiene el valor para la propiedad telefono.
	 *
	 * @return El valor de la propiedad telefono
	 */
	public String getTelefono() {
		return this.telefono;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad telefono.
	 *
	 * @param telefono el nuevo valor para la propiedad telefono
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	/**
	 * Obtiene el valor para la propiedad persona.
	 *
	 * @return El valor de la propiedad persona
	 */
	public Persona getPersona() {
		return this.persona;
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
	 * Obtiene el valor para la propiedad usuarios.
	 *
	 * @return El valor de la propiedad usuarios
	 */
	public List<Usuario> getUsuarios() {
		return this.usuarios;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad usuarios.
	 *
	 * @param usuarios el nuevo valor para la propiedad usuarios
	 */
	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	/**
	 * Agrega el/la usuario.
	 *
	 * @param usuario el parametro usuario
	 * @return Resultado para Agrega el/la usuario retornado como Usuario
	 */
	public Usuario addUsuario(Usuario usuario) {
		getUsuarios().add(usuario);
		usuario.setPersonaJuridica(this);

		return usuario;
	}

	/**
	 * Remueve el/la usuario.
	 *
	 * @param usuario el parametro usuario
	 * @return Resultado para Remueve el/la usuario retornado como Usuario
	 */
	public Usuario removeUsuario(Usuario usuario) {
		getUsuarios().remove(usuario);
		usuario.setPersonaJuridica(null);

		return usuario;
	}

	/**
	 * Obtiene el valor para la propiedad tipo catalogo tipo organizacion.
	 *
	 * @return El valor de la propiedad tipo catalogo tipo organizacion
	 */
	public Catalogo getTipoCatalogoTipoOrganizacion() {
		return tipoCatalogoTipoOrganizacion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tipo catalogo tipo organizacion.
	 *
	 * @param tipoCatalogoTipoOrganizacion el nuevo valor para la propiedad tipo
	 *                                     catalogo tipo organizacion
	 */
	public void setTipoCatalogoTipoOrganizacion(Catalogo tipoCatalogoTipoOrganizacion) {
		this.tipoCatalogoTipoOrganizacion = tipoCatalogoTipoOrganizacion;
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
	 * Obtiene el valor para la propiedad nombre documento camara.
	 *
	 * @return El valor de la propiedad nombre documento camara
	 */
	public String getNombreDocumentoCamara() {
		return nombreDocumentoCamara;
	}

	/**
	 * Obtiene el valor para la propiedad asociacion usuario persona juridicas.
	 *
	 * @return El valor de la propiedad asociacion usuario persona juridicas
	 */
	public List<AsociacionUsuarioPersonaJuridica> getAsociacionUsuarioPersonaJuridicas() {
		return asociacionUsuarioPersonaJuridicas;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad asociacion usuario persona
	 * juridicas.
	 *
	 * @param asociacionUsuarioPersonaJuridicas el nuevo valor para la propiedad
	 *                                          asociacion usuario persona juridicas
	 */
	public void setAsociacionUsuarioPersonaJuridicas(
			List<AsociacionUsuarioPersonaJuridica> asociacionUsuarioPersonaJuridicas) {
		this.asociacionUsuarioPersonaJuridicas = asociacionUsuarioPersonaJuridicas;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad nombre documento camara.
	 *
	 * @param nombreDocumentoCamara el nuevo valor para la propiedad nombre
	 *                              documento camara
	 */
	public void setNombreDocumentoCamara(String nombreDocumentoCamara) {
		this.nombreDocumentoCamara = nombreDocumentoCamara;
	}

	/**
	 * Obtiene el valor para la propiedad nombre documento representante.
	 *
	 * @return El valor de la propiedad nombre documento representante
	 */
	public String getNombreDocumentoRepresentante() {
		return nombreDocumentoRepresentante;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad nombre documento representante.
	 *
	 * @param nombreDocumentoRepresentante el nuevo valor para la propiedad nombre
	 *                                     documento representante
	 */
	public void setNombreDocumentoRepresentante(String nombreDocumentoRepresentante) {
		this.nombreDocumentoRepresentante = nombreDocumentoRepresentante;
	}
}
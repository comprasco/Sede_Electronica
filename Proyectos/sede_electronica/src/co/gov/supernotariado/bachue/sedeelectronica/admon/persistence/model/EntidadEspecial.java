/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: EntidadEspecial.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model
 * Nombre del elemento: EntidadEspecial
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * Clase tipo entidad o modelo de datos de la capa de persistencia.<br>
 * Representa una entidad de persistencia para una tabla de la base de
 * datos.<br>
 * Esta clase representa la entidad <b>Entidad especial</b>, <br>
 * que permite la persistencia en la tabla <b>SDB_AUT_ENTIDAD_ESPECIAL</b> de la
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
@Table(name="SDB_AUT_ENTIDAD_ESPECIAL")
@NamedQueries( value ={
	@NamedQuery(name="EntidadEspecial.consultarEntidadEspecialDoc", query="SELECT s FROM EntidadEspecial s WHERE s.idTipoDocumentoEntidadEspecial = :tipoDocumento AND s.documentoEntidadEspecial = :numeroDocumento"),
	@NamedQuery(name="EntidadEspecial.consultarEntidadEspecialRazonSocial", query="SELECT s FROM EntidadEspecial s WHERE s.id = :id"),
	@NamedQuery(name="EntidadEspecial.consultarIdEntidadEspecial", query="SELECT s FROM EntidadEspecial s WHERE s.id = :id"),
	@NamedQuery(name="EntidadEspecial.consultarEntidadesEspeciales", query="SELECT s FROM EntidadEspecial s "),
	@NamedQuery(name="EntidadEspecial.consultarEntidadEspecial", query="SELECT s FROM EntidadEspecial s WHERE s.documentoEntidadEspecial = :documentoEntidadEspecial"),
	@NamedQuery(name="EntidadEspecial.consultarEntidadEspecialCod", query="SELECT s FROM EntidadEspecial s WHERE s.codigoEntidad = :codigoEntidad")
})
public class EntidadEspecial implements Serializable {
	
	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo para definir la propiedad id.
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEC_AUT_ENTIDAD_ESPECIAL_ID_GENERATOR")
	@SequenceGenerator(sequenceName = "SEC_AUT_ENTIDAD_ESPECIAL",allocationSize = 1,  name = "SEC_AUT_ENTIDAD_ESPECIAL_ID_GENERATOR")
	private String id;

	/**
	 * Atributo para definir la propiedad activo.
	 */
	@Column(name="ACTIVO")
	private String activo;

	/**
	 * Atributo para definir la propiedad acto administrativo.
	 */
	@Lob
	@Column(name="ACTO_ADMINISTRATIVO")
	private byte[] actoAdministrativo;

	/**
	 * Atributo para definir la propiedad celular.
	 */
	@Column(name="CELULAR")
	private String celular;
	
	/**
	 * Atributo para definir la propiedad codigo entidad.
	 */
	@Column(name="CODIGO_ENTIDAD")
	private String codigoEntidad;

	/**
	 * Atributo para definir la propiedad documento entidad especial.
	 */
	@Column(name="DOCUMENTO_ENTIDAD_ESPECIAL")
	private String documentoEntidadEspecial;

	/**
	 * Atributo para definir la propiedad documento representante legal.
	 */
	@Column(name="DOCUMENTO_REPRESENTANTE_LEGAL")
	private String documentoRepresentanteLegal;

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
	 * Atributo para definir la propiedad id tipo documento entidad especial.
	 */
	@Column(name="ID_TIPO_DOCUMENTO_ENTIDAD_ESPECIAL")
	private String idTipoDocumentoEntidadEspecial;

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
	@Column(name="REPRESENTANTE_LEGAL")
	private String representanteLegal;

	/**
	 * Atributo para definir la propiedad telefono.
	 */
	@Column(name="TELEFONO")
	private String telefono;

	/**
	 * Atributo para definir la propiedad tipo entidad.
	 */
	@Column(name="ID_TIPO_ENTIDAD_ESPECIAL")
	private String tipoEntidad;
	
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
	 * Atributo para definir la propiedad entidad especial direccions.
	 */
	//bi-directional many-to-one association to AsociacionUsuarioEntidadEspecial
	@OneToMany(mappedBy="entidadEspecial")
	private List<AsociacionUsuarioEntidadEspecial> asociacionUsuarioEntidadEspecials;

	/**
	 * Atributo para definir la propiedad usuarios.
	 */
	//bi-directional many-to-one association to Usuario
	@OneToMany(mappedBy="entidadEspecial")
	private List<Usuario> usuarios;
	
	@OneToMany(mappedBy = "notariaOrigen")
	private List<SolicitudPendientePoder> solicitudesPendientes;

	/**
	 * Atributo para definir la propiedad observaciones.
	 */
	//bi-directional many-to-one association to Observacione
	@OneToMany(mappedBy="entidadEspecial")
	private List<Observaciones> observaciones;

	/**
	 * Construye una nueva instancia/objeto de la clase EntidadEspecial.
	 */
	public EntidadEspecial() {
		// Metodo constructor vacio para modelo de persistencia
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
	 * Obtiene el valor para la propiedad acto administrativo.
	 *
	 * @return El valor de la propiedad acto administrativo
	 */
	public byte[] getActoAdministrativo() {
		return this.actoAdministrativo;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad acto administrativo.
	 *
	 * @param actoAdministrativo el nuevo valor para la propiedad acto
	 *                           administrativo
	 */
	public void setActoAdministrativo(byte[] actoAdministrativo) {
		this.actoAdministrativo = actoAdministrativo;
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
	 * Obtiene el valor para la propiedad documento entidad especial.
	 *
	 * @return El valor de la propiedad documento entidad especial
	 */
	public String getDocumentoEntidadEspecial() {
		return this.documentoEntidadEspecial;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad documento entidad especial.
	 *
	 * @param documentoEntidadEspecial el nuevo valor para la propiedad documento
	 *                                 entidad especial
	 */
	public void setDocumentoEntidadEspecial(String documentoEntidadEspecial) {
		this.documentoEntidadEspecial = documentoEntidadEspecial;
	}

	/**
	 * Obtiene el valor para la propiedad documento representante legal.
	 *
	 * @return El valor de la propiedad documento representante legal
	 */
	public String getDocumentoRepresentanteLegal() {
		return this.documentoRepresentanteLegal;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad documento representante legal.
	 *
	 * @param documentoRepresentanteLegal el nuevo valor para la propiedad documento
	 *                                    representante legal
	 */
	public void setDocumentoRepresentanteLegal(String documentoRepresentanteLegal) {
		this.documentoRepresentanteLegal = documentoRepresentanteLegal;
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
	 * Obtiene el valor para la propiedad id tipo documento entidad especial.
	 *
	 * @return El valor de la propiedad id tipo documento entidad especial
	 */
	public String getIdTipoDocumentoEntidadEspecial() {
		return this.idTipoDocumentoEntidadEspecial;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad id tipo documento entidad
	 * especial.
	 *
	 * @param idTipoDocumentoEntidadEspecial el nuevo valor para la propiedad id
	 *                                       tipo documento entidad especial
	 */
	public void setIdTipoDocumentoEntidadEspecial(String idTipoDocumentoEntidadEspecial) {
		this.idTipoDocumentoEntidadEspecial = idTipoDocumentoEntidadEspecial;
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

	/**
	 * Obtiene el valor para la propiedad representante legal.
	 *
	 * @return El valor de la propiedad representante legal
	 */
	public String getRepresentanteLegal() {
		return this.representanteLegal;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad representante legal.
	 *
	 * @param representanteLegal el nuevo valor para la propiedad representante
	 *                           legal
	 */
	public void setRepresentanteLegal(String representanteLegal) {
		this.representanteLegal = representanteLegal;
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
	 * Obtiene el valor para la propiedad asociacion usuario entidad especials.
	 *
	 * @return El valor de la propiedad asociacion usuario entidad especials
	 */
	public List<AsociacionUsuarioEntidadEspecial> getAsociacionUsuarioEntidadEspecials() {
		return this.asociacionUsuarioEntidadEspecials;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad asociacion usuario entidad
	 * especials.
	 *
	 * @param asociacionUsuarioEntidadEspecials el nuevo valor para la propiedad
	 *                                          asociacion usuario entidad especials
	 */
	public void setAsociacionUsuarioEntidadEspecials(List<AsociacionUsuarioEntidadEspecial> asociacionUsuarioEntidadEspecials) {
		this.asociacionUsuarioEntidadEspecials = asociacionUsuarioEntidadEspecials;
	}

	/**
	 * Agrega el/la asociacion usuario entidad especial.
	 *
	 * @param asociacionUsuarioEntidadEspecial el parametro asociacion usuario
	 *                                         entidad especial
	 * @return Resultado para Agrega el/la asociacion usuario entidad especial
	 *         retornado como AsociacionUsuarioEntidadEspecial
	 */
	public AsociacionUsuarioEntidadEspecial addAsociacionUsuarioEntidadEspecial(AsociacionUsuarioEntidadEspecial asociacionUsuarioEntidadEspecial) {
		getAsociacionUsuarioEntidadEspecials().add(asociacionUsuarioEntidadEspecial);
		asociacionUsuarioEntidadEspecial.setEntidadEspecial(this);

		return asociacionUsuarioEntidadEspecial;
	}

	/**
	 * Remueve el/la asociacion usuario entidad especial.
	 *
	 * @param asociacionUsuarioEntidadEspecial el parametro asociacion usuario
	 *                                         entidad especial
	 * @return Resultado para Remueve el/la asociacion usuario entidad especial
	 *         retornado como AsociacionUsuarioEntidadEspecial
	 */
	public AsociacionUsuarioEntidadEspecial removeAsociacionUsuarioEntidadEspecial(AsociacionUsuarioEntidadEspecial asociacionUsuarioEntidadEspecial) {
		getAsociacionUsuarioEntidadEspecials().remove(asociacionUsuarioEntidadEspecial);
		asociacionUsuarioEntidadEspecial.setEntidadEspecial(null);

		return asociacionUsuarioEntidadEspecial;
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
		usuario.setEntidadEspecial(this);

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
		usuario.setEntidadEspecial(null);

		return usuario;
	}

	/**
	 * Obtiene el valor para la propiedad observaciones.
	 *
	 * @return El valor de la propiedad observaciones
	 */
	public List<Observaciones> getObservaciones() {
		return this.observaciones;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad observaciones.
	 *
	 * @param observaciones el nuevo valor para la propiedad observaciones
	 */
	public void setObservaciones(List<Observaciones> observaciones) {
		this.observaciones = observaciones;
	}

	/**
	 * Agrega el/la observacione.
	 *
	 * @param observacione el parametro observacione
	 * @return Resultado para Agrega el/la observacione retornado como Observaciones
	 */
	public Observaciones addObservacione(Observaciones observacione) {
		getObservaciones().add(observacione);
		observacione.setEntidadEspecial(this);

		return observacione;
	}

	/**
	 * Remueve el/la observacione.
	 *
	 * @param observacione el parametro observacione
	 * @return Resultado para Remueve el/la observacione retornado como
	 *         Observaciones
	 */
	public Observaciones removeObservacione(Observaciones observacione) {
		getObservaciones().remove(observacione);
		observacione.setEntidadEspecial(null);

		return observacione;
	}

	/**
	 * Obtiene el valor para la propiedad tipo entidad.
	 *
	 * @return El valor de la propiedad tipo entidad
	 */
	public String getTipoEntidad() {
		return tipoEntidad;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tipo entidad.
	 *
	 * @param tipoEntidad el nuevo valor para la propiedad tipo entidad
	 */
	public void setTipoEntidad(String tipoEntidad) {
		this.tipoEntidad = tipoEntidad;
	}

	/**
	 * Obtiene el valor para la propiedad codigo entidad.
	 *
	 * @return El valor de la propiedad codigo entidad
	 */
	public String getCodigoEntidad() {
		return codigoEntidad;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad codigo entidad.
	 *
	 * @param codigoEntidad el nuevo valor para la propiedad codigo entidad
	 */
	public void setCodigoEntidad(String codigoEntidad) {
		this.codigoEntidad = codigoEntidad;
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

	public List<SolicitudPendientePoder> getSolicitudesPendientes() {
		return solicitudesPendientes;
	}

	public void setSolicitudesPendientes(List<SolicitudPendientePoder> solicitudesPendientes) {
		this.solicitudesPendientes = solicitudesPendientes;
	}
	
	

	
}
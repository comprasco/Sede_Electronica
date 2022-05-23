/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: Usuario.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model
 * Nombre del elemento: Usuario
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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
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
 * Esta clase representa la entidad <b>Usuario</b>, <br>
 * que permite la persistencia en la tabla <b>SDB_AUT_USUARIO</b> de la base de
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
@Table(name = "SDB_AUT_USUARIO")
@NamedQueries( value ={
		@NamedQuery(name = "Usuario.consultarUsuariosEstado", query = "SELECT s FROM Usuario s WHERE s.tipoEstadoCuenta.id = :tipoEstado "),		
		@NamedQuery(name = "Usuario.findAll", query = " SELECT s FROM Usuario s "),
		@NamedQuery(name = "Usuario.consultarUUIDActivacion", query = " SELECT u FROM Usuario u WHERE u.uuidUrlActivacion =:uuidUrlActivacion "),
		@NamedQuery(name = "Usuario.consultarUsuariosPersonaJuridica", query = " SELECT u FROM Usuario u WHERE u.personaJuridica.persona.id =:idPersonaJuridica "),
		@NamedQuery(name = "Usuario.consultarUsuariosNombre", query = " SELECT u.nombreUsuario FROM Usuario u WHERE u.nombreUsuario LIKE :usuario "),
		@NamedQuery(name = "Usuario.consultarUsuarioEstado", query = " SELECT u FROM Usuario u WHERE u.nombreUsuario =:usuario AND u.activo = :activo AND U.tipoEstadoCuenta.id = :estadoCuenta"),
		@NamedQuery(name = "Usuario.consultarUsuario", query = " SELECT u FROM Usuario u WHERE u.nombreUsuario = :usuario "),
		@NamedQuery(name = "Usuario.consultarUsuarioEstadoActivo", query = " SELECT u FROM Usuario u WHERE u.nombreUsuario =:usuario AND u.activo = :activo"),
		@NamedQuery(name = "Usuario.consultarUsuarioEstadoPA", query = " SELECT u FROM Usuario u WHERE u.tipoEstadoCuenta.id = :estadoCuentaPA AND u.personaJuridica IS NOT NULL"),	
		@NamedQuery(name = "Usuario.consultarUsuarioPersona", query = " SELECT u FROM Usuario u WHERE u.nombreUsuario = :nombreUsuario AND u.persona.numeroDocumento = :numeroDocumento AND u.persona.tipoDocumento.id = :tipoDocumento AND u.activo = :activo"),
		@NamedQuery(name = "Usuario.consultarUsuariosAsociacion", query = " SELECT u FROM Usuario u WHERE u.persona.numeroDocumento = :numeroDocumento AND u.persona.tipoDocumento.id = :tipoDocumento AND u.activo = :activo"),
		@NamedQuery(name = "Usuario.consultarUsuarioPersonaEntidadEspecial", query = " SELECT u FROM Usuario u WHERE u.nombreUsuario = :usuarioNombre AND u.activo = :activo"),
		@NamedQuery(name = "Usuario.consultarCorreoElectronico", query = " SELECT u FROM Usuario u WHERE u.correoElectronico = :correoElectronico"),
})
public class Usuario implements Serializable {
	
	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo para definir la propiedad id.
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEC_AUT_USUARIO")
	@SequenceGenerator(sequenceName = "SEC_AUT_USUARIO", allocationSize = 1,  name = "SEC_AUT_USUARIO")
	private String id;

	/**
	 * Atributo para definir la propiedad activo.
	 */
	@Column(name = "ACTIVO")
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
	 * Atributo para definir la propiedad celular.
	 */
	@Column(name = "CELULAR")
	private String celular;

	/**
	 * Atributo para definir la propiedad celular confirmado.
	 */
	@Column(name = "CELULAR_CONFIRMADO")
	private String celularConfirmado;	

	/**
	 * Atributo para definir la propiedad clave hash.
	 */
	@Column(name = "CLAVE_HASH")
	private String claveHash;

	/**
	 * Atributo para definir la propiedad descripcion.
	 */
	@Column(name = "DESCRIPCION")
	private String descripcion;	

	/**
	 * Atributo para definir la propiedad correo electronico.
	 */
	@Column(name = "CORREO_ELECTRONICO")
	private String correoElectronico;

	/**
	 * Atributo para definir la propiedad correo electronico confirmado.
	 */
	@Column(name = "CORREO_ELECTRONICO_CONFIRMADO")
	private String correoElectronicoConfirmado;

	/**
	 * Atributo para definir la propiedad fecha confirmacion celular.
	 */
	@Column(name = "FECHA_CONFIRMACION_CELULAR")
	@Temporal(TemporalType.DATE)
	private Date fechaConfirmacionCelular;

	/**
	 * Atributo para definir la propiedad fecha confirmacion correo electronico.
	 */
	@Column(name = "FECHA_CONFIRMACION_CORREO_ELECTRONICO")
	@Temporal(TemporalType.DATE)
	private Date fechaConfirmacionCorreoElectronico;

	/**
	 * Atributo para definir la propiedad fecha creacion.
	 */
	@Column(name = "FECHA_CREACION")
	@Temporal(TemporalType.DATE)
	private Date fechaCreacion;

	/**
	 * Atributo para definir la propiedad fecha modificacion.
	 */
	@Column(name = "FECHA_MODIFICACION")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaModificacion;

	/**
	 * Atributo para definir la propiedad fecha modificacion clave.
	 */
	@Column(name = "FECHA_MODIFICACION_CLAVE")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaModificacionClave;


	/**
	 * Atributo para definir la propiedad fecha ultimo inicio sesion.
	 */
	@Column(name = "FECHA_ULTIMO_INICIO_SESION")
	@Temporal(TemporalType.DATE)
	private Date fechaUltimoInicioSesion;

	/**
	 * Atributo para definir la propiedad fecha ultimo intento.
	 */
	@Column(name = "FECHA_ULTIMO_INTENTO")
	@Temporal(TemporalType.DATE)
	private Date fechaUltimoIntento;

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
	 * Atributo para definir la propiedad intentos fallidos acceso.
	 */
	@Column(name = "INTENTOS_FALLIDOS_ACCESO")
	private Integer intentosFallidosAcceso;

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
	 * Atributo para definir la propiedad nombre usuario.
	 */
	@Column(name = "USUARIO")
	private String nombreUsuario;

	/**
	 * Atributo para definir la propiedad uuid url activacion.
	 */
	@Column(name = "UUID_URL_ACTIVACION")
	private String uuidUrlActivacion;

	/**
	 * Atributo para definir la propiedad bitacora auds.
	 */
	// bi-directional many-to-one association to BitacoraAud
	@OneToMany(mappedBy = "usuario")
	private List<BitacoraAud> bitacoraAuds;

	/**
	 * Atributo para definir la propiedad historico claves.
	 */
	// bi-directional many-to-one association to HistoricoClave
	@OneToMany(mappedBy = "usuario", cascade = CascadeType.REMOVE)
	private List<HistoricoClave> historicoClaves;

	/**
	 * Atributo para definir la propiedad solicitud recuperacion claves.
	 */
	// bi-directional many-to-one association to SolicitudRecuperacionClave
	@OneToMany(mappedBy = "usuario")
	private List<SolicitudRecuperacionClave> solicitudRecuperacionClaves;

	/**
	 * Atributo para definir la propiedad persona.
	 */
	// bi-directional many-to-one association to Persona
	@OneToOne
	@JoinColumn(name = "ID_PERSONA")
	private Persona persona;

	/**
	 * Atributo para definir la propiedad tipo estado cuenta.
	 */
	// bi-directional many-to-one association to TipoEstadoCuenta
	@ManyToOne
	@JoinColumn(name = "ID_ESTADO_CUENTA")
	private TipoEstadoCuenta tipoEstadoCuenta;

	/**
	 * Atributo para definir la propiedad usuario rols.
	 */
	// bi-directional many-to-one association to UsuarioRol
	@OneToMany(mappedBy = "usuario" ,cascade=CascadeType.REMOVE)
	private List<UsuarioRol> usuarioRols;

	/**
	 * Atributo para definir la propiedad usuario bloqueo.
	 */
	// bi-directional many-to-one association to UsuarioBloqueo
	@OneToMany(mappedBy = "usuario")
	private List<UsuarioBloqueo> usuarioBloqueo;

	/**
	 * Atributo para definir la propiedad asociacion usuario entidad especial.
	 */
	//bi-directional many-to-one association to AsociacionUsuarioEntidadEspecial
	@OneToMany(mappedBy="usuario")
	private List<AsociacionUsuarioEntidadEspecial> asociacionUsuarioEntidadEspecial;

	/**
	 * Atributo para definir la propiedad asociacion usuario persona juridicas.
	 */
	//bi-directional many-to-one association to AsociacionUsuarioPersonaJuridica
	@OneToMany(mappedBy="usuario" )
	private List<AsociacionUsuarioPersonaJuridica> asociacionUsuarioPersonaJuridicas;

	/**
	 * Atributo para definir la propiedad entidad especial.
	 */
	//bi-directional many-to-one association to EntidadEspecial
	@ManyToOne
	@JoinColumn(name="ID_ENTIDAD_ESPECIAL")
	private EntidadEspecial entidadEspecial;

	/**
	 * Atributo para definir la propiedad persona juridica.
	 */
	//bi-directional many-to-one association to SdbAutPersonaJuridica
	@ManyToOne(cascade=CascadeType.REMOVE)
	@JoinColumn(name="ID_PERSONA_JURIDICA")
	private PersonaJuridica personaJuridica;

	/**
	 * Atributo para definir la propiedad transaccion pasarelas.
	 */
	//bi-directional many-to-one association to SdbAccTransaccionPasarela
	@OneToMany(mappedBy="usuario")
	private List<TransaccionPasarela> transaccionPasarelas;


	/**
	 * Construye una nueva instancia/objeto de la clase Usuario.
	 */
	public Usuario() {
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
	 * Obtiene el valor para la propiedad clave hash.
	 *
	 * @return El valor de la propiedad clave hash
	 */
	public String getClaveHash() {
		return this.claveHash;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad clave hash.
	 *
	 * @param claveHash el nuevo valor para la propiedad clave hash
	 */
	public void setClaveHash(String claveHash) {
		this.claveHash = claveHash;
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
	 * Obtiene el valor para la propiedad correo electronico confirmado.
	 *
	 * @return El valor de la propiedad correo electronico confirmado
	 */
	public String getCorreoElectronicoConfirmado() {
		return this.correoElectronicoConfirmado;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad correo electronico confirmado.
	 *
	 * @param correoElectronicoConfirmado el nuevo valor para la propiedad correo
	 *                                    electronico confirmado
	 */
	public void setCorreoElectronicoConfirmado(String correoElectronicoConfirmado) {
		this.correoElectronicoConfirmado = correoElectronicoConfirmado;
	}

	/**
	 * Obtiene el valor para la propiedad fecha confirmacion celular.
	 *
	 * @return El valor de la propiedad fecha confirmacion celular
	 */
	public Date getFechaConfirmacionCelular() {
		return this.fechaConfirmacionCelular;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad fecha confirmacion celular.
	 *
	 * @param fechaConfirmacionCelular el nuevo valor para la propiedad fecha
	 *                                 confirmacion celular
	 */
	public void setFechaConfirmacionCelular(Date fechaConfirmacionCelular) {
		this.fechaConfirmacionCelular = fechaConfirmacionCelular;
	}

	/**
	 * Obtiene el valor para la propiedad fecha confirmacion correo electronico.
	 *
	 * @return El valor de la propiedad fecha confirmacion correo electronico
	 */
	public Date getFechaConfirmacionCorreoElectronico() {
		return this.fechaConfirmacionCorreoElectronico;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad fecha confirmacion correo
	 * electronico.
	 *
	 * @param fechaConfirmacionCorreoElectronico el nuevo valor para la propiedad
	 *                                           fecha confirmacion correo
	 *                                           electronico
	 */
	public void setFechaConfirmacionCorreoElectronico(Date fechaConfirmacionCorreoElectronico) {
		this.fechaConfirmacionCorreoElectronico = fechaConfirmacionCorreoElectronico;
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
	 * Obtiene el valor para la propiedad fecha ultimo inicio sesion.
	 *
	 * @return El valor de la propiedad fecha ultimo inicio sesion
	 */
	public Date getFechaUltimoInicioSesion() {
		return this.fechaUltimoInicioSesion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad fecha ultimo inicio sesion.
	 *
	 * @param fechaUltimoInicioSesion el nuevo valor para la propiedad fecha ultimo
	 *                                inicio sesion
	 */
	public void setFechaUltimoInicioSesion(Date fechaUltimoInicioSesion) {
		this.fechaUltimoInicioSesion = fechaUltimoInicioSesion;
	}

	/**
	 * Obtiene el valor para la propiedad fecha ultimo intento.
	 *
	 * @return El valor de la propiedad fecha ultimo intento
	 */
	public Date getFechaUltimoIntento() {
		return this.fechaUltimoIntento;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad fecha ultimo intento.
	 *
	 * @param fechaUltimoIntento el nuevo valor para la propiedad fecha ultimo
	 *                           intento
	 */
	public void setFechaUltimoIntento(Date fechaUltimoIntento) {
		this.fechaUltimoIntento = fechaUltimoIntento;
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
	 * Obtiene el valor para la propiedad intentos fallidos acceso.
	 *
	 * @return El valor de la propiedad intentos fallidos acceso
	 */
	public Integer getIntentosFallidosAcceso() {
		return this.intentosFallidosAcceso;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad intentos fallidos acceso.
	 *
	 * @param intentosFallidosAcceso el nuevo valor para la propiedad intentos
	 *                               fallidos acceso
	 */
	public void setIntentosFallidosAcceso(Integer intentosFallidosAcceso) {
		this.intentosFallidosAcceso = intentosFallidosAcceso;
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
	 * Obtiene el valor para la propiedad uuid url activacion.
	 *
	 * @return El valor de la propiedad uuid url activacion
	 */
	public String getUuidUrlActivacion() {
		return this.uuidUrlActivacion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad uuid url activacion.
	 *
	 * @param uuidUrlActivacion el nuevo valor para la propiedad uuid url activacion
	 */
	public void setUuidUrlActivacion(String uuidUrlActivacion) {
		this.uuidUrlActivacion = uuidUrlActivacion;
	}

	/**
	 * Obtiene el valor para la propiedad bitacora auds.
	 *
	 * @return El valor de la propiedad bitacora auds
	 */
	public List<BitacoraAud> getBitacoraAuds() {
		return this.bitacoraAuds;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad bitacora auds.
	 *
	 * @param bitacoraAuds el nuevo valor para la propiedad bitacora auds
	 */
	public void setBitacoraAuds(List<BitacoraAud> bitacoraAuds) {
		this.bitacoraAuds = bitacoraAuds;
	}

	/**
	 * Agrega el/la bitacora aud.
	 *
	 * @param bitacoraAud el parametro bitacora aud
	 * @return Resultado para Agrega el/la bitacora aud retornado como BitacoraAud
	 */
	public BitacoraAud addBitacoraAud(BitacoraAud bitacoraAud) {
		getBitacoraAuds().add(bitacoraAud);
		bitacoraAud.setUsuario(this);

		return bitacoraAud;
	}

	/**
	 * Remueve el/la bitacora aud.
	 *
	 * @param bitacoraAud el parametro bitacora aud
	 * @return Resultado para Remueve el/la bitacora aud retornado como BitacoraAud
	 */
	public BitacoraAud removeBitacoraAud(BitacoraAud bitacoraAud) {
		getBitacoraAuds().remove(bitacoraAud);
		bitacoraAud.setUsuario(null);

		return bitacoraAud;
	}

	/**
	 * Obtiene el valor para la propiedad historico claves.
	 *
	 * @return El valor de la propiedad historico claves
	 */
	public List<HistoricoClave> getHistoricoClaves() {
		return this.historicoClaves;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad historico claves.
	 *
	 * @param historicoClaves el nuevo valor para la propiedad historico claves
	 */
	public void setHistoricoClaves(List<HistoricoClave> historicoClaves) {
		this.historicoClaves = historicoClaves;
	}

	/**
	 * Agrega el/la historico clave.
	 *
	 * @param historicoClave el parametro historico clave
	 * @return Resultado para Agrega el/la historico clave retornado como
	 *         HistoricoClave
	 */
	public HistoricoClave addHistoricoClave(HistoricoClave historicoClave) {
		getHistoricoClaves().add(historicoClave);
		historicoClave.setUsuario(this);

		return historicoClave;
	}

	/**
	 * Remueve el/la historico clave.
	 *
	 * @param historicoClave el parametro historico clave
	 * @return Resultado para Remueve el/la historico clave retornado como
	 *         HistoricoClave
	 */
	public HistoricoClave removeHistoricoClave(HistoricoClave historicoClave) {
		getHistoricoClaves().remove(historicoClave);
		historicoClave.setUsuario(null);

		return historicoClave;
	}

	/**
	 * Obtiene el valor para la propiedad solicitud recuperacion claves.
	 *
	 * @return El valor de la propiedad solicitud recuperacion claves
	 */
	public List<SolicitudRecuperacionClave> getSolicitudRecuperacionClaves() {
		return this.solicitudRecuperacionClaves;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad solicitud recuperacion claves.
	 *
	 * @param solicitudRecuperacionClaves el nuevo valor para la propiedad solicitud
	 *                                    recuperacion claves
	 */
	public void setSolicitudRecuperacionClaves(List<SolicitudRecuperacionClave> solicitudRecuperacionClaves) {
		this.solicitudRecuperacionClaves = solicitudRecuperacionClaves;
	}

	/**
	 * Agrega el/la solicitud recuperacion clave.
	 *
	 * @param solicitudRecuperacionClave el parametro solicitud recuperacion clave
	 * @return Resultado para Agrega el/la solicitud recuperacion clave retornado
	 *         como SolicitudRecuperacionClave
	 */
	public SolicitudRecuperacionClave addSolicitudRecuperacionClave(
			SolicitudRecuperacionClave solicitudRecuperacionClave) {
		getSolicitudRecuperacionClaves().add(solicitudRecuperacionClave);
		solicitudRecuperacionClave.setUsuario(this);

		return solicitudRecuperacionClave;
	}

	/**
	 * Remueve el/la solicitud recuperacion clave.
	 *
	 * @param solicitudRecuperacionClave el parametro solicitud recuperacion clave
	 * @return Resultado para Remueve el/la solicitud recuperacion clave retornado
	 *         como SolicitudRecuperacionClave
	 */
	public SolicitudRecuperacionClave removeSolicitudRecuperacionClave(
			SolicitudRecuperacionClave solicitudRecuperacionClave) {
		getSolicitudRecuperacionClaves().remove(solicitudRecuperacionClave);
		solicitudRecuperacionClave.setUsuario(null);

		return solicitudRecuperacionClave;
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
	 * Obtiene el valor para la propiedad tipo estado cuenta.
	 *
	 * @return El valor de la propiedad tipo estado cuenta
	 */
	public TipoEstadoCuenta getTipoEstadoCuenta() {
		return this.tipoEstadoCuenta;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tipo estado cuenta.
	 *
	 * @param tipoEstadoCuenta el nuevo valor para la propiedad tipo estado cuenta
	 */
	public void setTipoEstadoCuenta(TipoEstadoCuenta tipoEstadoCuenta) {
		this.tipoEstadoCuenta = tipoEstadoCuenta;
	}

	/**
	 * Obtiene el valor para la propiedad usuario rols.
	 *
	 * @return El valor de la propiedad usuario rols
	 */
	public List<UsuarioRol> getUsuarioRols() {
		return this.usuarioRols;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad usuario rols.
	 *
	 * @param usuarioRols el nuevo valor para la propiedad usuario rols
	 */
	public void setUsuarioRols(List<UsuarioRol> usuarioRols) {
		this.usuarioRols = usuarioRols;
	}

	/**
	 * Agrega el/la usuario rol.
	 *
	 * @param usuarioRol el parametro usuario rol
	 * @return Resultado para Agrega el/la usuario rol retornado como UsuarioRol
	 */
	public UsuarioRol addUsuarioRol(UsuarioRol usuarioRol) {
		getUsuarioRols().add(usuarioRol);
		usuarioRol.setUsuario(this);

		return usuarioRol;
	}

	/**
	 * Obtiene el valor para la propiedad celular confirmado.
	 *
	 * @return El valor de la propiedad celular confirmado
	 */
	public String getCelularConfirmado() {
		return celularConfirmado;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad celular confirmado.
	 *
	 * @param celularConfirmado el nuevo valor para la propiedad celular confirmado
	 */
	public void setCelularConfirmado(String celularConfirmado) {
		this.celularConfirmado = celularConfirmado;
	}

	/**
	 * Remueve el/la usuario rol.
	 *
	 * @param usuarioRol el parametro usuario rol
	 * @return Resultado para Remueve el/la usuario rol retornado como UsuarioRol
	 */
	public UsuarioRol removeUsuarioRol(UsuarioRol usuarioRol) {
		getUsuarioRols().remove(usuarioRol);
		usuarioRol.setUsuario(null);

		return usuarioRol;
	}

	/**
	 * Obtiene el valor para la propiedad nombre usuario.
	 *
	 * @return El valor de la propiedad nombre usuario
	 */
	public String getNombreUsuario() {
		return nombreUsuario;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad nombre usuario.
	 *
	 * @param nombreUsuario el nuevo valor para la propiedad nombre usuario
	 */
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	/**
	 * Obtiene el valor para la propiedad usuario bloqueo.
	 *
	 * @return El valor de la propiedad usuario bloqueo
	 */
	public List<UsuarioBloqueo> getUsuarioBloqueo() {
		return usuarioBloqueo;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad usuario bloqueo.
	 *
	 * @param usuarioBloqueo el nuevo valor para la propiedad usuario bloqueo
	 */
	public void setUsuarioBloqueo(List<UsuarioBloqueo> usuarioBloqueo) {
		this.usuarioBloqueo = usuarioBloqueo;
	}

	/**
	 * Agrega el/la usuario bloqueo.
	 *
	 * @param usuarioBloqueo el parametro usuario bloqueo
	 * @return Resultado para Agrega el/la usuario bloqueo retornado como
	 *         UsuarioBloqueo
	 */
	public UsuarioBloqueo addUsuarioBloqueo(UsuarioBloqueo usuarioBloqueo) {
		getUsuarioBloqueo().add(usuarioBloqueo);
		usuarioBloqueo.setUsuario(this);
		return usuarioBloqueo;
	}


	/**
	 * Obtiene el valor para la propiedad fecha modificacion clave.
	 *
	 * @return El valor de la propiedad fecha modificacion clave
	 */
	public Date getFechaModificacionClave() {
		return fechaModificacionClave;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad fecha modificacion clave.
	 *
	 * @param fechaModicacionClave el nuevo valor para la propiedad fecha
	 *                             modificacion clave
	 */
	public void setFechaModificacionClave(Date fechaModicacionClave) {
		this.fechaModificacionClave = fechaModicacionClave;
	}

	/**
	 * Remueve el/la usuario bloqueo.
	 *
	 * @param usuarioBloqueo el parametro usuario bloqueo
	 * @return Resultado para Remueve el/la usuario bloqueo retornado como
	 *         UsuarioBloqueo
	 */
	public UsuarioBloqueo removeUsuarioBloqueo(UsuarioBloqueo usuarioBloqueo) {
		getUsuarioBloqueo().remove(usuarioBloqueo);
		usuarioBloqueo.setUsuario(null);

		return usuarioBloqueo;
	}

	/**
	 * Obtiene el valor para la propiedad asociacion usuario entidad especials.
	 *
	 * @return El valor de la propiedad asociacion usuario entidad especials
	 */
	public List<AsociacionUsuarioEntidadEspecial> getAsociacionUsuarioEntidadEspecials() {
		return this.asociacionUsuarioEntidadEspecial;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad asociacion usuario entidad
	 * especials.
	 *
	 * @param asociacionUsuarioEntidadEspecials el nuevo valor para la propiedad
	 *                                          asociacion usuario entidad especials
	 */
	public void setAsociacionUsuarioEntidadEspecials(List<AsociacionUsuarioEntidadEspecial> asociacionUsuarioEntidadEspecials) {
		this.asociacionUsuarioEntidadEspecial = asociacionUsuarioEntidadEspecials;
	}

	/**
	 * Obtiene el valor para la propiedad asociacion usuario persona juridicas.
	 *
	 * @return El valor de la propiedad asociacion usuario persona juridicas
	 */
	public List<AsociacionUsuarioPersonaJuridica> getAsociacionUsuarioPersonaJuridicas() {
		return this.asociacionUsuarioPersonaJuridicas;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad asociacion usuario persona
	 * juridicas.
	 *
	 * @param asociacionUsuarioPersonaJuridicas el nuevo valor para la propiedad
	 *                                          asociacion usuario persona juridicas
	 */
	public void setAsociacionUsuarioPersonaJuridicas(List<AsociacionUsuarioPersonaJuridica> asociacionUsuarioPersonaJuridicas) {
		this.asociacionUsuarioPersonaJuridicas = asociacionUsuarioPersonaJuridicas;
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
	 * Obtiene el valor para la propiedad descripcion.
	 *
	 * @return El valor de la propiedad descripcion
	 */
	public String getDescripcion() {
		return descripcion;
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
	 * Obtiene el valor para la propiedad transaccion pasarelas.
	 *
	 * @return El valor de la propiedad transaccion pasarelas
	 */
	public List<TransaccionPasarela> getTransaccionPasarelas() {
		return this.transaccionPasarelas;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad transaccion pasarelas.
	 *
	 * @param transaccionPasarelas el nuevo valor para la propiedad transaccion
	 *                             pasarelas
	 */
	public void setTransaccionPasarelas(List<TransaccionPasarela> transaccionPasarelas) {
		this.transaccionPasarelas = transaccionPasarelas;
	}

	/**
	 * Agrega el/la transaccion pasarela.
	 *
	 * @param transaccionPasarela el parametro transaccion pasarela
	 * @return Resultado para Agrega el/la transaccion pasarela retornado como
	 *         TransaccionPasarela
	 */
	public TransaccionPasarela addTransaccionPasarela(TransaccionPasarela transaccionPasarela) {
		getTransaccionPasarelas().add(transaccionPasarela);
		transaccionPasarela.setUsuario(this);

		return transaccionPasarela;
	}

	/**
	 * Remueve el/la transaccion pasarela.
	 *
	 * @param transaccionPasarela el parametro transaccion pasarela
	 * @return Resultado para Remueve el/la transaccion pasarela retornado como
	 *         TransaccionPasarela
	 */
	public TransaccionPasarela removeTransaccionPasarela(TransaccionPasarela transaccionPasarela) {
		getTransaccionPasarelas().remove(transaccionPasarela);
		transaccionPasarela.setUsuario(null);

		return transaccionPasarela;
	}


}
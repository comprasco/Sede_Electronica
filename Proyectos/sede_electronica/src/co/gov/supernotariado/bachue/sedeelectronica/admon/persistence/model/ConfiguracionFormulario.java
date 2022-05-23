/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ConfiguracionFormulario.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model
 * Nombre del elemento: ConfiguracionFormulario
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
 * Esta clase representa la entidad <b>Configuracion formulario</b>, <br>
 * que permite la persistencia en la tabla
 * <b>SDB_ACC_CONFIGURACION_FORMULARIO</b> de la base de datos.
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
@Table(name = "SDB_ACC_CONFIGURACION_FORMULARIO")
@NamedQueries(value = {
		@NamedQuery(name = "ConfiguracionFormulario.findAll", query = "SELECT s FROM ConfiguracionFormulario s"),
		@NamedQuery(name = "ConfiguracionFormulario.consultaNombreFormulario", query = "SELECT s FROM ConfiguracionFormulario s WHERE s.nombre = :nombreFormulario AND s.activo = :activo"), })
public class ConfiguracionFormulario implements Serializable {
	
	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo para definir la propiedad id.
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEC_ACC_CONFIGURACION_FORMULARIO")
	@SequenceGenerator(sequenceName = "SEC_ACC_CONFIGURACION_FORMULARIO", allocationSize = 1, name = "SEC_ACC_CONFIGURACION_FORMULARIO")
	private String id;

	/**
	 * Atributo para definir la propiedad activo.
	 */
	@Column(name = "ACTIVO")
	private String activo;

	/**
	 * Atributo para definir la propiedad descripcion.
	 */
	@Column(name = "DESCRIPCION")
	private String descripcion;

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
	 * Atributo para definir la propiedad configuracion campos.
	 */
	// bi-directional many-to-one association to ConfiguracionCampo
	@OneToMany(mappedBy = "configuracionFormulario")
	private List<ConfiguracionCampo> configuracionCampos;

	/**
	 * Atributo para definir la propiedad formulario usuarios.
	 */
	// bi-directional many-to-one association to FormularioUsuario
	@OneToMany(mappedBy = "configuracionFormulario")
	private List<FormularioUsuario> formularioUsuarios;

	/**
	 * Construye una nueva instancia/objeto de la clase ConfiguracionFormulario.
	 */
	public ConfiguracionFormulario() {
		//
	}

	/**
	 * Construye una nueva instancia/objeto de la clase ConfiguracionFormulario.
	 *
	 * @param as_idConfiguracionFormulario el parametro id configuracion formulario
	 */
	public ConfiguracionFormulario(String as_idConfiguracionFormulario) {
		this.id = as_idConfiguracionFormulario;
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
	 * Obtiene el valor para la propiedad estereotipo creacion.
	 *
	 * @return El valor de la propiedad estereotipo creacion
	 */
	public String getEstereotipoCreacion() {
		return this.estereotipoCreacion;
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
		return this.estereotipoModificacion;
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
	 * Obtiene el valor para la propiedad configuracion campos.
	 *
	 * @return El valor de la propiedad configuracion campos
	 */
	public List<ConfiguracionCampo> getConfiguracionCampos() {
		return this.configuracionCampos;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad configuracion campos.
	 *
	 * @param configuracionCampos el nuevo valor para la propiedad configuracion
	 *                            campos
	 */
	public void setConfiguracionCampos(List<ConfiguracionCampo> configuracionCampos) {
		this.configuracionCampos = configuracionCampos;
	}

	/**
	 * Agrega el/la configuracion campo.
	 *
	 * @param configuracionCampo el parametro configuracion campo
	 * @return Resultado para Agrega el/la configuracion campo retornado como
	 *         ConfiguracionCampo
	 */
	public ConfiguracionCampo addConfiguracionCampo(ConfiguracionCampo configuracionCampo) {
		configuracionCampos.add(configuracionCampo);
		configuracionCampo.setConfiguracionFormulario(this);

		return configuracionCampo;
	}

	/**
	 * Remueve el/la configuracion campo.
	 *
	 * @param configuracionCampo el parametro configuracion campo
	 * @return Resultado para Remueve el/la configuracion campo retornado como
	 *         ConfiguracionCampo
	 */
	public ConfiguracionCampo removeConfiguracionCampo(ConfiguracionCampo configuracionCampo) {
		getConfiguracionCampos().remove(configuracionCampo);
		configuracionCampo.setConfiguracionFormulario(null);

		return configuracionCampo;
	}

	/**
	 * Obtiene el valor para la propiedad formulario usuarios.
	 *
	 * @return El valor de la propiedad formulario usuarios
	 */
	public List<FormularioUsuario> getFormularioUsuarios() {
		return this.formularioUsuarios;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad formulario usuarios.
	 *
	 * @param formularioUsuarios el nuevo valor para la propiedad formulario
	 *                           usuarios
	 */
	public void setFormularioUsuarios(List<FormularioUsuario> formularioUsuarios) {
		this.formularioUsuarios = formularioUsuarios;
	}

	/**
	 * Agrega el/la formulario usuario.
	 *
	 * @param formularioUsuario el parametro formulario usuario
	 * @return Resultado para Agrega el/la formulario usuario retornado como
	 *         FormularioUsuario
	 */
	public FormularioUsuario addFormularioUsuario(FormularioUsuario formularioUsuario) {
		getFormularioUsuarios().add(formularioUsuario);
		formularioUsuario.setConfiguracionFormulario(this);

		return formularioUsuario;
	}

	/**
	 * Remueve el/la formulario usuario.
	 *
	 * @param formularioUsuario el parametro formulario usuario
	 * @return Resultado para Remueve el/la formulario usuario retornado como
	 *         FormularioUsuario
	 */
	public FormularioUsuario removeFormularioUsuario(FormularioUsuario formularioUsuario) {
		getFormularioUsuarios().remove(formularioUsuario);
		formularioUsuario.setConfiguracionFormulario(null);

		return formularioUsuario;
	}

}
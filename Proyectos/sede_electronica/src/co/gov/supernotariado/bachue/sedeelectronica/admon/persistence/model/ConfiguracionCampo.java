/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ConfiguracionCampo.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model
 * Nombre del elemento: ConfiguracionCampo
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Clase tipo entidad o modelo de datos de la capa de persistencia.<br>
 * Representa una entidad de persistencia para una tabla de la base de
 * datos.<br>
 * Esta clase representa la entidad <b>Configuracion campo</b>, <br>
 * que permite la persistencia en la tabla <b>SDB_ACC_CONFIGURACION_CAMPO</b> de
 * la base de datos.
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
@Table(name = "SDB_ACC_CONFIGURACION_CAMPO")
@NamedQueries(value = { @NamedQuery(name = "ConfiguracionCampo.findAll", query = "SELECT s FROM ConfiguracionCampo s"),
		@NamedQuery(name = "ConfiguracionCampo.consultarPorNombre", query = "SELECT c FROM ConfiguracionCampo c WHERE c.nombre = :nombre"), })
public class ConfiguracionCampo implements Serializable {
	
	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo para definir la propiedad id.
	 */
	@EmbeddedId
	private ConfiguracionCampoPK id;

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
	 * Atributo para definir la propiedad formato.
	 */
	@Column(name = "FORMATO")
	private String formato;

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
	 * Atributo para definir la propiedad obligatorio.
	 */
	@Column(name = "OBLIGATORIO")
	private String obligatorio;

	/**
	 * Atributo para definir la propiedad tipo dato.
	 */
	@Column(name = "TIPO_DATO")
	private String tipoDato;

	/**
	 * Atributo para definir la propiedad valor defecto.
	 */
	@Column(name = "VALOR_DEFECTO")
	private String valorDefecto;

	/**
	 * Atributo para definir la propiedad configuracion formulario.
	 */
	// bi-directional many-to-one association to ConfiguracionFormulario
	@ManyToOne
	@JoinColumn(name = "ID_CONFIGURACION_FORMULARIO")
	private ConfiguracionFormulario configuracionFormulario;

	/**
	 * Atributo para definir la propiedad valor campo formularios.
	 */
	// bi-directional many-to-one association to ValorCampoFormulario
	@OneToMany(mappedBy = "configuracionCampo")
	private List<ValorCampoFormulario> valorCampoFormularios;

	/**
	 * Construye una nueva instancia/objeto de la clase ConfiguracionCampo.
	 */
	public ConfiguracionCampo() {
		//
	}

	/**
	 * Construye una nueva instancia/objeto de la clase ConfiguracionCampo.
	 *
	 * @param as_idConfiguracionCampo el parametro id configuracion campo
	 */
	public ConfiguracionCampo(String as_idConfiguracionCampo) {
		ConfiguracionCampoPK lcc_configuracionCampoPk = new ConfiguracionCampoPK();
		lcc_configuracionCampoPk.setId(as_idConfiguracionCampo);
		this.id = lcc_configuracionCampoPk;
	}

	/**
	 * Obtiene el valor para la propiedad id.
	 *
	 * @return El valor de la propiedad id
	 */
	public ConfiguracionCampoPK getId() {
		return this.id;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad id.
	 *
	 * @param id el nuevo valor para la propiedad id
	 */
	public void setId(ConfiguracionCampoPK id) {
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
	 * Obtiene el valor para la propiedad formato.
	 *
	 * @return El valor de la propiedad formato
	 */
	public String getFormato() {
		return this.formato;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad formato.
	 *
	 * @param formato el nuevo valor para la propiedad formato
	 */
	public void setFormato(String formato) {
		this.formato = formato;
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
	 * Obtiene el valor para la propiedad obligatorio.
	 *
	 * @return El valor de la propiedad obligatorio
	 */
	public String getObligatorio() {
		return this.obligatorio;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad obligatorio.
	 *
	 * @param obligatorio el nuevo valor para la propiedad obligatorio
	 */
	public void setObligatorio(String obligatorio) {
		this.obligatorio = obligatorio;
	}

	/**
	 * Obtiene el valor para la propiedad tipo dato.
	 *
	 * @return El valor de la propiedad tipo dato
	 */
	public String getTipoDato() {
		return this.tipoDato;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tipo dato.
	 *
	 * @param tipoDato el nuevo valor para la propiedad tipo dato
	 */
	public void setTipoDato(String tipoDato) {
		this.tipoDato = tipoDato;
	}

	/**
	 * Obtiene el valor para la propiedad valor defecto.
	 *
	 * @return El valor de la propiedad valor defecto
	 */
	public String getValorDefecto() {
		return this.valorDefecto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad valor defecto.
	 *
	 * @param valorDefecto el nuevo valor para la propiedad valor defecto
	 */
	public void setValorDefecto(String valorDefecto) {
		this.valorDefecto = valorDefecto;
	}

	/**
	 * Obtiene el valor para la propiedad configuracion formulario.
	 *
	 * @return El valor de la propiedad configuracion formulario
	 */
	public ConfiguracionFormulario getConfiguracionFormulario() {
		return this.configuracionFormulario;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad configuracion formulario.
	 *
	 * @param configuracionFormulario el nuevo valor para la propiedad configuracion
	 *                                formulario
	 */
	public void setConfiguracionFormulario(ConfiguracionFormulario configuracionFormulario) {
		this.configuracionFormulario = configuracionFormulario;
	}

	/**
	 * Obtiene el valor para la propiedad valor campo formularios.
	 *
	 * @return El valor de la propiedad valor campo formularios
	 */
	public List<ValorCampoFormulario> getValorCampoFormularios() {
		return this.valorCampoFormularios;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad valor campo formularios.
	 *
	 * @param valorCampoFormularios el nuevo valor para la propiedad valor campo
	 *                              formularios
	 */
	public void setValorCampoFormularios(List<ValorCampoFormulario> valorCampoFormularios) {
		this.valorCampoFormularios = valorCampoFormularios;
	}

	/**
	 * Agrega el/la valor campo formulario.
	 *
	 * @param valorCampoFormulario el parametro valor campo formulario
	 * @return Resultado para Agrega el/la valor campo formulario retornado como
	 *         ValorCampoFormulario
	 */
	public ValorCampoFormulario addValorCampoFormulario(ValorCampoFormulario valorCampoFormulario) {
		getValorCampoFormularios().add(valorCampoFormulario);
		valorCampoFormulario.setConfiguracionCampo(this);

		return valorCampoFormulario;
	}

	/**
	 * Remueve el/la valor campo formulario.
	 *
	 * @param valorCampoFormulario el parametro valor campo formulario
	 * @return Resultado para Remueve el/la valor campo formulario retornado como
	 *         ValorCampoFormulario
	 */
	public ValorCampoFormulario removeValorCampoFormulario(ValorCampoFormulario valorCampoFormulario) {
		getValorCampoFormularios().remove(valorCampoFormulario);
		valorCampoFormulario.setConfiguracionCampo(null);

		return valorCampoFormulario;
	}

}
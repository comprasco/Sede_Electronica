/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: TipoProceso.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model
 * Nombre del elemento: TipoProceso
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
 * Esta clase representa la entidad <b>Tipo proceso</b>, <br>
 * que permite la persistencia en la tabla <b>SDB_PGN_TIPO_PROCESO</b> de la
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
@Table(name = "SDB_PGN_TIPO_PROCESO")
@NamedQuery(name = "TipoProceso.findAll", query = "SELECT s FROM TipoProceso s")
public class TipoProceso implements Serializable {
	
	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo para definir la propiedad id.
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SDB_PGN_TIPO_PROCESO_ID_GENERATOR")
	@SequenceGenerator(sequenceName = "SEC_PGN_TIPO_PROCESO", allocationSize = 1, name = "SDB_PGN_TIPO_PROCESO_ID_GENERATOR")
	private String id;

	/**
	 * Atributo para definir la propiedad activo.
	 */
	@Column(name = "ACTIVO")
	private String activo;

	/**
	 * Atributo para definir la propiedad codigo.
	 */
	@Column(name = "CODIGO")
	private String codigo;

	/**
	 * Atributo para definir la propiedad descripcion.
	 */
	@Column(name = "DESCRIPCION")
	private String descripcion;

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
	 * Atributo para definir la propiedad nombre.
	 */
	@Column(name = "NOMBRE")
	private String nombre;
	
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
	 * Atributo para definir la propiedad tx integracions.
	 */
	// bi-directional many-to-one association to TxIntegracion
	@OneToMany(mappedBy = "tipoProceso")
	private List<Integracion> txIntegracions;

	/**
	 * Atributo para definir la propiedad parametros.
	 */
	// bi-directional many-to-one association to Parametro
	@OneToMany(mappedBy = "tipoProceso", fetch=FetchType.EAGER)
	private List<Parametro> parametros;

	/**
	 * Atributo para definir la propiedad tx integracion temporals.
	 */
	// bi-directional many-to-one association to TxIntegracionTemporal
	@OneToMany(mappedBy = "tipoProceso")
	private List<IntegracionTemporal> txIntegracionTemporals;
	
	/**
	 * Atributo para definir la propiedad tx integracion temporals.
	 */
	// bi-directional many-to-one association to TxIntegracionTemporal
	@OneToMany(mappedBy = "tipoProceso", fetch=FetchType.EAGER)
	private List<ServicioIntegracion> servicioIntegracion;

	/**
	 * Construye una nueva instancia/objeto de la clase TipoProceso.
	 */
	public TipoProceso() {
		//Metodo constructor vacio para modelo de persistencia 
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
	 * Obtiene el valor para la propiedad codigo.
	 *
	 * @return El valor de la propiedad codigo
	 */
	public String getCodigo() {
		return this.codigo;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad codigo.
	 *
	 * @param codigo el nuevo valor para la propiedad codigo
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
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
	 * Obtiene el valor para la propiedad tx integracions.
	 *
	 * @return El valor de la propiedad tx integracions
	 */
	public List<Integracion> getTxIntegracions() {
		return this.txIntegracions;
	}

	/**
	 * S tx integracions.
	 *
	 * @param txIntegracions el parametro tx integracions
	 */
	public void sTxIntegracions(List<Integracion> txIntegracions) {
		this.txIntegracions = txIntegracions;
	}

	/**
	 * Agrega el/la tx integracion.
	 *
	 * @param txIntegracion el parametro tx integracion
	 * @return Resultado para Agrega el/la tx integracion retornado como Integracion
	 */
	public Integracion addTxIntegracion(Integracion txIntegracion) {
		getTxIntegracions().add(txIntegracion);
		txIntegracion.setTipoProceso(this);

		return txIntegracion;
	}

	/**
	 * Remueve el/la tx integracion.
	 *
	 * @param txIntegracion el parametro tx integracion
	 * @return Resultado para Remueve el/la tx integracion retornado como
	 *         Integracion
	 */
	public Integracion removeTxIntegracion(Integracion txIntegracion) {
		getTxIntegracions().remove(txIntegracion);
		txIntegracion.setTipoProceso(null);

		return txIntegracion;
	}

	/**
	 * Obtiene el valor para la propiedad parametros.
	 *
	 * @return El valor de la propiedad parametros
	 */
	public List<Parametro> getParametros() {
		return this.parametros;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad parametros.
	 *
	 * @param parametros el nuevo valor para la propiedad parametros
	 */
	public void setParametros(List<Parametro> parametros) {
		this.parametros = parametros;
	}

	/**
	 * Agrega el/la parametro.
	 *
	 * @param parametro el parametro parametro
	 * @return Resultado para Agrega el/la parametro retornado como Parametro
	 */
	public Parametro addParametro(Parametro parametro) {
		getParametros().add(parametro);
		parametro.setTipoProceso(this);

		return parametro;
	}

	/**
	 * Remueve el/la parametro.
	 *
	 * @param parametro el parametro parametro
	 * @return Resultado para Remueve el/la parametro retornado como Parametro
	 */
	public Parametro removeParametro(Parametro parametro) {
		getParametros().remove(parametro);
		parametro.setTipoProceso(null);

		return parametro;
	}

	/**
	 * Obtiene el valor para la propiedad tx integracion temporals.
	 *
	 * @return El valor de la propiedad tx integracion temporals
	 */
	public List<IntegracionTemporal> getTxIntegracionTemporals() {
		return this.txIntegracionTemporals;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tx integracion temporals.
	 *
	 * @param txIntegracionTemporals el nuevo valor para la propiedad tx integracion
	 *                               temporals
	 */
	public void setTxIntegracionTemporals(List<IntegracionTemporal> txIntegracionTemporals) {
		this.txIntegracionTemporals = txIntegracionTemporals;
	}

	/**
	 * Agrega el/la tx integracion temporal.
	 *
	 * @param txIntegracionTemporal el parametro tx integracion temporal
	 * @return Resultado para Agrega el/la tx integracion temporal retornado como
	 *         IntegracionTemporal
	 */
	public IntegracionTemporal addTxIntegracionTemporal(IntegracionTemporal txIntegracionTemporal) {
		getTxIntegracionTemporals().add(txIntegracionTemporal);
		txIntegracionTemporal.setTipoProceso(this);

		return txIntegracionTemporal;
	}

	/**
	 * Remueve el/la tx integracion temporal.
	 *
	 * @param txIntegracionTemporal el parametro tx integracion temporal
	 * @return Resultado para Remueve el/la tx integracion temporal retornado como
	 *         IntegracionTemporal
	 */
	public IntegracionTemporal removeTxIntegracionTemporal(IntegracionTemporal txIntegracionTemporal) {
		getTxIntegracionTemporals().remove(txIntegracionTemporal);
		txIntegracionTemporal.setTipoProceso(null);

		return txIntegracionTemporal;
	}

	public List<ServicioIntegracion> getServicioIntegracion() {
		return servicioIntegracion;
	}

	public void setServicioIntegracion(List<ServicioIntegracion> servicioIntegracion) {
		this.servicioIntegracion = servicioIntegracion;
	}
	
	

}
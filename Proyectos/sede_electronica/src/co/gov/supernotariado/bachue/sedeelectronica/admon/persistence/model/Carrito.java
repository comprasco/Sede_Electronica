/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: Carrito.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model
 * Nombre del elemento: Carrito
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
import javax.persistence.Lob;
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
 * Esta clase representa la entidad <b>Carrito</b>, <br>
 * que permite la persistencia en la tabla <b>SDB_ACC_TX_CARRITO</b> de la base
 * de datos.
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
@Table(name = "SDB_ACC_TX_CARRITO")
@NamedQueries( value ={
		@NamedQuery(name = "Carrito.findAll", query = "SELECT s FROM Carrito s"),
		@NamedQuery(name = "Carrito.eliminarElementosCarritoFecha", query = "DELETE FROM Carrito s WHERE s.fechaModificacion <= :fechaLimite "),
		@NamedQuery(name = "Carrito.findById", query = "SELECT s FROM Carrito s WHERE s.uuidUrlCarrito = :codigo AND s.activo = :activo"),
		@NamedQuery(name = "Carrito.findByUser", query = "SELECT c FROM Carrito c WHERE c.idUsuario.id = :usuario AND c.activo = :activo AND c.idAsociacion IS NULL"),
		@NamedQuery(name = "Carrito.findByUserAsociado", query = "SELECT c FROM Carrito c WHERE c.idUsuario.id = :usuario AND c.activo = :activo AND c.idAsociacion = :idAsociacion"),
		@NamedQuery(name = "Carrito.findByUserCounter", query = "SELECT COUNT(c) FROM Carrito c WHERE c.idUsuario.id = :usuario AND c.activo = :activo AND c.idAsociacion IS NULL"),
		@NamedQuery(name = "Carrito.findByUserCounterAsociado", query = "SELECT COUNT(c) FROM Carrito c WHERE c.idUsuario.id = :usuario AND c.activo = :activo AND c.idAsociacion = :idAsociacion")	
})
public class Carrito implements Serializable {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo para definir la propiedad id.
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SSEC_ACC_TX_CARRITO_ID_GENERATOR")
	@SequenceGenerator(sequenceName = "SEC_ACC_TX_CARRITO",allocationSize = 1, name = "SSEC_ACC_TX_CARRITO_ID_GENERATOR")
	private String id;

	/**
	 * Atributo para definir la propiedad uuid url carrito.
	 */
	@Column(name = "UUID_URL_CARRITO")
	private String uuidUrlCarrito;
	
	/**
	 * Atributo para definir la propiedad modelo transaccion vigente.
	 */
	@Lob
	@Column(name = "MODELO_TRANSACCION_VIGENTE")
	private String modeloTransaccionVigente;

	/**
	 * Atributo para definir la propiedad codigo tipo servicio.
	 */
	@Column(name = "CODIGO_TIPO_SERVICIO")
	private String codigoTipoServicio;

	/**
	 * Atributo para definir la propiedad codigo tipo sub servicio.
	 */
	@Column(name = "CODIGO_TIPO_SUB_SERVICIO")
	private String codigoTipoSubServicio;

	/**
	 * Atributo para definir la propiedad modo.
	 */
	@Column(name = "MODO")
	private String modo;
	
	/**
	 * Atributo para definir la propiedad id asociacion.
	 */
	@Column(name = "ID_ASOCIACION")
	private String idAsociacion;
	
	/**
	 * Atributo para definir la propiedad id usuario.
	 */
	@ManyToOne
	@JoinColumn(name = "ID_USUARIO")
	private Usuario idUsuario;

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
	 * Atributo para definir la propiedad fecha creacion.
	 */
	@Column(name = "FECHA_CREACION")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaCreacion;

	/**
	 * Atributo para definir la propiedad ip creacion.
	 */
	@Column(name = "IP_CREACION")
	private String ipCreacion;

	/**
	 * Atributo para definir la propiedad fecha modificacion.
	 */
	@Column(name = "FECHA_MODIFICACION")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaModificacion;

	/**
	 * Atributo para definir la propiedad ip modificacion.
	 */
	@Column(name = "IP_MODIFICACION")
	private String ipModificacion;

	/**
	 * Atributo para definir la propiedad id usuario modificacion.
	 */
	@Column(name = "ID_USUARIO_MODIFICACION")
	private String idUsuarioModificacion;

	/**
	 * Atributo para definir la propiedad usuario.
	 */
	@Column(name = "ID_USUARIO_CREACION")
	private String usuario;

	/**
	 * Atributo para definir la propiedad tipo proceso.
	 */
	// bi-directional many-to-one association to SdbPgnTipoProceso
	@ManyToOne
	@JoinColumn(name = "ID_PROCESO")
	private TipoProceso tipoProceso;

	/**
	 * Obtiene el valor para la propiedad id.
	 *
	 * @return El valor de la propiedad id
	 */
	public String getId() {
		return id;
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
	 * Obtiene el valor para la propiedad uuid url carrito.
	 *
	 * @return El valor de la propiedad uuid url carrito
	 */
	public String getUuidUrlCarrito() {
		return uuidUrlCarrito;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad uuid url carrito.
	 *
	 * @param uuidUrlCarrito el nuevo valor para la propiedad uuid url carrito
	 */
	public void setUuidUrlCarrito(String uuidUrlCarrito) {
		this.uuidUrlCarrito = uuidUrlCarrito;
	}

	/**
	 * Obtiene el valor para la propiedad modelo transaccion vigente.
	 *
	 * @return El valor de la propiedad modelo transaccion vigente
	 */
	public String getModeloTransaccionVigente() {
		return modeloTransaccionVigente;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad modelo transaccion vigente.
	 *
	 * @param modeloTransaccionVigente el nuevo valor para la propiedad modelo
	 *                                 transaccion vigente
	 */
	public void setModeloTransaccionVigente(String modeloTransaccionVigente) {
		this.modeloTransaccionVigente = modeloTransaccionVigente;
	}

	/**
	 * Obtiene el valor para la propiedad codigo tipo servicio.
	 *
	 * @return El valor de la propiedad codigo tipo servicio
	 */
	public String getCodigoTipoServicio() {
		return codigoTipoServicio;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad codigo tipo servicio.
	 *
	 * @param codigoTipoServicio el nuevo valor para la propiedad codigo tipo
	 *                           servicio
	 */
	public void setCodigoTipoServicio(String codigoTipoServicio) {
		this.codigoTipoServicio = codigoTipoServicio;
	}

	/**
	 * Obtiene el valor para la propiedad codigo tipo sub servicio.
	 *
	 * @return El valor de la propiedad codigo tipo sub servicio
	 */
	public String getCodigoTipoSubServicio() {
		return codigoTipoSubServicio;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad codigo tipo sub servicio.
	 *
	 * @param codigoTipoSubServicio el nuevo valor para la propiedad codigo tipo sub
	 *                              servicio
	 */
	public void setCodigoTipoSubServicio(String codigoTipoSubServicio) {
		this.codigoTipoSubServicio = codigoTipoSubServicio;
	}

	/**
	 * Obtiene el valor para la propiedad modo.
	 *
	 * @return El valor de la propiedad modo
	 */
	public String getModo() {
		return modo;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad modo.
	 *
	 * @param modo el nuevo valor para la propiedad modo
	 */
	public void setModo(String modo) {
		this.modo = modo;
	}

	/**
	 * Obtiene el valor para la propiedad id usuario.
	 *
	 * @return El valor de la propiedad id usuario
	 */
	public Usuario getIdUsuario() {
		return idUsuario;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad id usuario.
	 *
	 * @param idUsuario el nuevo valor para la propiedad id usuario
	 */
	public void setIdUsuario(Usuario idUsuario) {
		this.idUsuario = idUsuario;
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
	 * Obtiene el valor para la propiedad usuario.
	 *
	 * @return El valor de la propiedad usuario
	 */
	public String getUsuario() {
		return usuario;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad usuario.
	 *
	 * @param usuario el nuevo valor para la propiedad usuario
	 */
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	/**
	 * Obtiene el valor para la propiedad tipo proceso.
	 *
	 * @return El valor de la propiedad tipo proceso
	 */
	public TipoProceso getTipoProceso() {
		return tipoProceso;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tipo proceso.
	 *
	 * @param tipoProceso el nuevo valor para la propiedad tipo proceso
	 */
	public void setTipoProceso(TipoProceso tipoProceso) {
		this.tipoProceso = tipoProceso;
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
	 * Obtiene el valor para la propiedad id asosiacion.
	 *
	 * @return El valor de la propiedad id asosiacion
	 */
	public String getIdAsosiacion() {
		return idAsociacion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad id asosiacion.
	 *
	 * @param idAsosiacion el nuevo valor para la propiedad id asosiacion
	 */
	public void setIdAsosiacion(String idAsosiacion) {
		this.idAsociacion = idAsosiacion;
	}

}

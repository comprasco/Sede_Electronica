/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: TransaccionFormulario.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model
 * Nombre del elemento: TransaccionFormulario
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

/**
 * Clase tipo entidad o modelo de datos de la capa de persistencia.<br>
 * Representa una entidad de persistencia para una tabla de la base de
 * datos.<br>
 * Esta clase representa la entidad <b>Transaccion formulario</b>, <br>
 * que permite la persistencia en la tabla <b>SDB_ACC_TRANSACCION_FORMULARIO</b>
 * de la base de datos.
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
@Table(name = "SDB_ACC_TRANSACCION_FORMULARIO")
@NamedQueries(value = {
		@NamedQuery(name = "TransaccionSolicitudCuentaCupo.findAll", query = "SELECT s FROM TransaccionFormulario s"),
		@NamedQuery(name = "TransaccionSolicitudCuentaCupo.consultarNir", query = "SELECT s FROM TransaccionFormulario s WHERE s.nir = :nir"),
		@NamedQuery(name = "EstadoTransaccionSolicitudCuentaCupo.consultarEstadoCuentaCupo", query = "SELECT s FROM TransaccionFormulario s WHERE s.estadoTransaccion = :estadoTransaccion"),
		@NamedQuery(name = "TransaccionSolicitudCuentaCupo.consultarUsuarioPorId", query = "SELECT s FROM TransaccionFormulario s WHERE s.idUsuario = :idUsuario"),
		@NamedQuery(name = "TransaccionFormulario.consultarFormularioUsuario", query = "Select s from TransaccionFormulario s WHERE s.idFormularioUsuario = :formularioUsuario"), })
public class TransaccionFormulario implements Serializable {
	
	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo para definir la propiedad id.
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEC_ACC_TRANSACCION_FORMULARIO")
	@SequenceGenerator(name = "SEC_ACC_TRANSACCION_FORMULARIO", sequenceName = "SEC_ACC_TRANSACCION_FORMULARIO", allocationSize = 1)
	private String id;

	/**
	 * Atributo para definir la propiedad estado transaccion.
	 */
	@Column(name = "ESTADO_TRANSACCION")
	private String estadoTransaccion;

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
	 * Atributo para definir la propiedad id formulario usuario.
	 */
	@ManyToOne
	@JoinColumn(name = "ID_FORMULARIO_USUARIO")
	private FormularioUsuario idFormularioUsuario;

	/**
	 * Atributo para definir la propiedad id usuario.
	 */
	@ManyToOne
	@JoinColumn(name = "ID_USUARIO")
	private Usuario idUsuario;

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
	 * Atributo para definir la propiedad nir.
	 */
	@Column(name = "NIR")
	private String nir;
	
	/**
	 * Atributo para definir la propiedad intentos verificacion fallida.
	 */
	@Column(name = "INTENTOS_VERIFICACION_FALLIDA")
	private Integer intentosVerificacionFallida;
	
	/**
	 * Atributo para definir la propiedad hash codigo verificacion.
	 */
	@Column(name = "HASH_CODIGO_VERIFICACION")
	private String hashCodigoVerificacion;

	/**
	 * Construye una nueva instancia/objeto de la clase TransaccionFormulario.
	 */
	public TransaccionFormulario() {
		// Constructor vacio
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
	 * Obtiene el valor para la propiedad estado transaccion.
	 *
	 * @return El valor de la propiedad estado transaccion
	 */
	public String getEstadoTransaccion() {
		return this.estadoTransaccion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad estado transaccion.
	 *
	 * @param estadoTransaccion el nuevo valor para la propiedad estado transaccion
	 */
	public void setEstadoTransaccion(String estadoTransaccion) {
		this.estadoTransaccion = estadoTransaccion;
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
	 * Obtiene el valor para la propiedad id formulario usuario.
	 *
	 * @return El valor de la propiedad id formulario usuario
	 */
	public FormularioUsuario getIdFormularioUsuario() {
		return idFormularioUsuario;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad id formulario usuario.
	 *
	 * @param idFormularioUsuario el nuevo valor para la propiedad id formulario
	 *                            usuario
	 */
	public void setIdFormularioUsuario(FormularioUsuario idFormularioUsuario) {
		this.idFormularioUsuario = idFormularioUsuario;
	}

	/**
	 * Obtiene el valor para la propiedad id usuario.
	 *
	 * @return El valor de la propiedad id usuario
	 */
	public Usuario getIdUsuario() {
		return this.idUsuario;
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
	 * Obtiene el valor para la propiedad nir.
	 *
	 * @return El valor de la propiedad nir
	 */
	public String getNir() {
		return this.nir;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad nir.
	 *
	 * @param nir el nuevo valor para la propiedad nir
	 */
	public void setNir(String nir) {
		this.nir = nir;
	}

	/**
	 * Obtiene el valor para la propiedad intentosVerificacionFallida.
	 *
	 * @return El valor de la propiedad intentosVerificacionFallida
	 */
	public Integer getIntentosVerificacionFallida() {
		return intentosVerificacionFallida;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad intentosVerificacionFallida.
	 *
	 * @param intentosVerificacionFallida el nuevo valor para la propiedad intentosVerificacionFallida
	 */
	public void setIntentosVerificacionFallida(Integer intentosVerificacionFallida) {
		this.intentosVerificacionFallida = intentosVerificacionFallida;
	}

	/**
	 * Obtiene el valor para la propiedad hashCodigoVerificacion.
	 *
	 * @return El valor de la propiedad hashCodigoVerificacion
	 */
	public String getHashCodigoVerificacion() {
		return hashCodigoVerificacion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad hashCodigoVerificacion.
	 *
	 * @param intentosVerificacionFallida el nuevo valor para la propiedad hashCodigoVerificacion
	 */
	public void setHashCodigoVerificacion(String hashCodigoVerificacion) {
		this.hashCodigoVerificacion = hashCodigoVerificacion;
	}
	
}
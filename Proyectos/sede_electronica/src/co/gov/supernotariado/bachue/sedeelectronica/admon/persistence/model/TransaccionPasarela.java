/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: TransaccionPasarela.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model
 * Nombre del elemento: TransaccionPasarela
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

import org.eclipse.persistence.annotations.Cache;
import org.eclipse.persistence.config.CacheIsolationType;

/**
 * Clase tipo entidad o modelo de datos de la capa de persistencia.<br>
 * Representa una entidad de persistencia para una tabla de la base de
 * datos.<br>
 * Esta clase representa la entidad <b>Transaccion pasarela</b>, <br>
 * que permite la persistencia en la tabla <b>SDB_ACC_TRANSACCION_PASARELA</b>
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
@Cache(isolation=CacheIsolationType.ISOLATED)
@Table(name="SDB_ACC_TRANSACCION_PASARELA")
@NamedQueries( value= {
@NamedQuery(name="TransaccionPasarela.consultarTransaccion", query="SELECT s FROM TransaccionPasarela s WHERE s.nir = :nir "),
@NamedQuery(name="TransaccionPasarela.consultarTransaccionPorReferenciaPago", query="SELECT s FROM TransaccionPasarela s WHERE s.referencia = :referencia "),
@NamedQuery(name="TransaccionPasarela.consultarTransacciones", query="SELECT s FROM TransaccionPasarela s WHERE s.estadoBachue <> :estadoBachue AND (s.estadoPasarela = :estadoPasarela OR s.estadoPasarela = :estadoPasarelaDos OR s.estadoPasarela = :estadoPasarelaTres) "),
@NamedQuery(name="TransaccionPasarela.findAll", query="SELECT s FROM TransaccionPasarela s"),
@NamedQuery(name="TransaccionPasarela.consultarToken", query="SELECT s FROM TransaccionPasarela s WHERE s.tokenTrasaccion = :token ")})
public class TransaccionPasarela implements Serializable {
	
	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo para definir la propiedad id.
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEC_ACC_TRANSACCION_PASARELA")
	@SequenceGenerator(sequenceName = "SEC_ACC_TRANSACCION_PASARELA", allocationSize = 1,  name = "SEC_ACC_TRANSACCION_PASARELA")
	private String id;

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
	 * Atributo para definir la propiedad codigo servicio.
	 */
	@Column(name="CODIGO_SERVICIO")
	private String codigoServicio;

	/**
	 * Atributo para definir la propiedad codigo sub servicio.
	 */
	@Column(name="CODIGO_SUBSERVICIO")
	private String codigoSubServicio;

	/**
	 * Atributo para definir la propiedad estereotipo modificacion.
	 */
	@Column(name="ESTEREOTIPO_MODIFICACION")
	private String estereotipoModificacion;

	/**
	 * Atributo para definir la propiedad fecha creacion.
	 */
	@Column(name="FECHA_CREACION")
	private Date fechaCreacion;

	/**
	 * Atributo para definir la propiedad fecha modificacion.
	 */
	@Column(name="FECHA_MODIFICACION")
	private Date fechaModificacion;

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
	 * Atributo para definir la propiedad modelo transaccion vigente.
	 */
	@Lob
	@Column(name="MODELO_TRANSACCION_VIGENTE")
	private String modeloTransaccionVigente;

	/**
	 * Atributo para definir la propiedad nir.
	 */
	@Column(name="NIR")
	private String nir;
	
	@Column(name="REFERENCIA_PAGO")
	private String referencia;

	/**
	 * Atributo para definir la propiedad estado pasarela.
	 */
	@Column(name="ESTADO_PASARELA")
	private String estadoPasarela;

	/**
	 * Atributo para definir la propiedad estado bachue.
	 */
	@Column(name="ESTADO_BACHUE")
	private String estadoBachue;

	/**
	 * Atributo para definir la propiedad tipo transaccion.
	 */
	@Column(name="TIPO_TRANSACCION")
	private String tipoTransaccion;

	/**
	 * Atributo para definir la propiedad token trasaccion.
	 */
	@Column(name="TOKEN_TRANSACCION")
	private String tokenTrasaccion;

	/**
	 * Atributo para definir la propiedad usuario.
	 */
	//bi-directional many-to-one association to SdbAutUsuario
	@ManyToOne
	@JoinColumn(name="ID_USUARIO")
	private Usuario usuario;

	/**
	 * Construye una nueva instancia/objeto de la clase TransaccionPasarela.
	 */
	public TransaccionPasarela() {
		//Constructor privado
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
	 * Obtiene el valor para la propiedad modelo transaccion vigente.
	 *
	 * @return El valor de la propiedad modelo transaccion vigente
	 */
	public String getModeloTransaccionVigente() {
		return this.modeloTransaccionVigente;
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
	 * Obtiene el valor para la propiedad tipo transaccion.
	 *
	 * @return El valor de la propiedad tipo transaccion
	 */
	public String getTipoTransaccion() {
		return this.tipoTransaccion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tipo transaccion.
	 *
	 * @param tipoTransaccion el nuevo valor para la propiedad tipo transaccion
	 */
	public void setTipoTransaccion(String tipoTransaccion) {
		this.tipoTransaccion = tipoTransaccion;
	}

	/**
	 * Obtiene el valor para la propiedad token trasaccion.
	 *
	 * @return El valor de la propiedad token trasaccion
	 */
	public String getTokenTrasaccion() {
		return this.tokenTrasaccion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad token trasaccion.
	 *
	 * @param tokenTrasaccion el nuevo valor para la propiedad token trasaccion
	 */
	public void setTokenTrasaccion(String tokenTrasaccion) {
		this.tokenTrasaccion = tokenTrasaccion;
	}

	/**
	 * Obtiene el valor para la propiedad usuario.
	 *
	 * @return El valor de la propiedad usuario
	 */
	public Usuario getUsuario() {
		return this.usuario;
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
	 * Obtiene el valor para la propiedad estado pasarela.
	 *
	 * @return El valor de la propiedad estado pasarela
	 */
	public String getEstadoPasarela() {
		return estadoPasarela;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad estado pasarela.
	 *
	 * @param estadoPasarela el nuevo valor para la propiedad estado pasarela
	 */
	public void setEstadoPasarela(String estadoPasarela) {
		this.estadoPasarela = estadoPasarela;
	}

	/**
	 * Obtiene el valor para la propiedad estado bachue.
	 *
	 * @return El valor de la propiedad estado bachue
	 */
	public String getEstadoBachue() {
		return estadoBachue;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad estado bachue.
	 *
	 * @param estadoBachue el nuevo valor para la propiedad estado bachue
	 */
	public void setEstadoBachue(String estadoBachue) {
		this.estadoBachue = estadoBachue;
	}

	/**
	 * Obtiene el valor para la propiedad codigo servicio.
	 *
	 * @return El valor de la propiedad codigo servicio
	 */
	public String getCodigoServicio() {
		return codigoServicio;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad codigo servicio.
	 *
	 * @param codigoServicio el nuevo valor para la propiedad codigo servicio
	 */
	public void setCodigoServicio(String codigoServicio) {
		this.codigoServicio = codigoServicio;
	}

	/**
	 * Obtiene el valor para la propiedad codigo sub servicio.
	 *
	 * @return El valor de la propiedad codigo sub servicio
	 */
	public String getCodigoSubServicio() {
		return codigoSubServicio;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad codigo sub servicio.
	 *
	 * @param codigoSubServicio el nuevo valor para la propiedad codigo sub servicio
	 */
	public void setCodigoSubServicio(String codigoSubServicio) {
		this.codigoSubServicio = codigoSubServicio;
	}

	public String getReferencia() {
		return referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}	


}
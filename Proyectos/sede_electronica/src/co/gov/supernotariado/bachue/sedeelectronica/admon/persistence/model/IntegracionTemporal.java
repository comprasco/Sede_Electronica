/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: IntegracionTemporal.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model
 * Nombre del elemento: IntegracionTemporal
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.*;

/**
 * Clase tipo entidad o modelo de datos de la capa de persistencia.<br>
 * Representa una entidad de persistencia para una tabla de la base de
 * datos.<br>
 * Esta clase representa la entidad <b>Integracion temporal</b>, <br>
 * que permite la persistencia en la tabla
 * <b>SDB_ACC_TX_INTEGRACION_TEMPORAL</b> de la base de datos.
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
@Table(name = "SDB_ACC_TX_INTEGRACION_TEMPORAL")
@NamedQueries( value = {
	@NamedQuery(name = "IntegracionTemporal.findAll", query = "SELECT s FROM IntegracionTemporal s"),
	@NamedQuery(name = "IntegracionTemporal.findByUsuario", query = "SELECT s FROM IntegracionTemporal s WHERE s.idUsuario.id = :usuario AND  s.visibilidad <> :visibilidadNegativa AND s.idAsosiacion IS NULL "),
	@NamedQuery(name = "IntegracionTemporal.findByUsuarioConAsociacion", query = "SELECT s FROM IntegracionTemporal s WHERE s.idUsuario.id = :usuario AND s.idAsosiacion = :idAsocicacion AND  s.visibilidad <> :visibilidadNegativa"),
	@NamedQuery(name = "IntegracionTemporal.findByNir", query = "SELECT s FROM IntegracionTemporal s WHERE s.nir = :nir"),
	@NamedQuery(name = "IntegracionTemporal.findByRef", query = "SELECT s FROM IntegracionTemporal s WHERE s.referenciaPago = :referencia"),
	@NamedQuery(name = "IntegracionTemporal.findByRecarga", query = "SELECT s FROM IntegracionTemporal s WHERE s.tipoProceso.id = :tipoProceso and s.idUsuario.id = :usuario"),
	@NamedQuery(name = "IntegracionTemporal.findByVisibilidad", query = "SELECT s FROM IntegracionTemporal s WHERE s.idUsuario.id = :usuario AND s.visibilidad = :visibilidad")
})
public class IntegracionTemporal implements Serializable {
	
	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo para definir la propiedad id.
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SSEC_ACC_TX_INTEGRACION_TEMPORAL_ID_GENERATOR")
	@SequenceGenerator(sequenceName = "SEC_ACC_TX_INTEGRACION_TEMPORAL",allocationSize = 1, name = "SSEC_ACC_TX_INTEGRACION_TEMPORAL_ID_GENERATOR")
	private String id;

	/**
	 * Atributo para definir la propiedad tipo proceso.
	 */
	// bi-directional many-to-one association to SdbPgnTipoProceso
	@ManyToOne
	@JoinColumn(name = "ID_PROCESO")
	private TipoProceso tipoProceso;

	/**
	 * Atributo para definir la propiedad id usuario.
	 */
	@ManyToOne
	@JoinColumn(name = "ID_USUARIO")
	private Usuario idUsuario; 

	/**
	 * Atributo para definir la propiedad nir.
	 */
	@Column(name = "NIR")
	private String nir;

	/**
	 * Atributo para definir la propiedad modelo entrada.
	 */
	@Lob
	@Column(name = "MODELO_ENTRADA")
	private String modeloEntrada;
	
	/**
	 * Atributo para definir la propiedad visibilidad.
	 */
	@Column(name = "VISIBILIDAD")
	private String visibilidad;

	/**
	 * Atributo para definir la propiedad entrada.
	 */
	@Lob
	@Column(name = "ENTRADA")
	private String entrada;

	/**
	 * Atributo para definir la propiedad salida.
	 */
	@Lob
	@Column(name = "SALIDA")
	private String salida;

	/**
	 * Atributo para definir la propiedad valor total servicio.
	 */
	@Column(name = "VALOR_TOTAL_SERVICIO")
	private BigDecimal valorTotalServicio;

	/**
	 * Atributo para definir la propiedad operacion.
	 */
	@Column(name = "OPERACION")
	private String operacion;

	/**
	 * Atributo para definir la propiedad id asosiacion.
	 */
	@Column(name = "ID_ASOCIACION")
	private String idAsosiacion;

	/**
	 * Atributo para definir la propiedad resultado general.
	 */
	@Column(name = "RESULTADO_GENERAL")
	private String resultadoGeneral;

	/**
	 * Atributo para definir la propiedad codigo respuesta.
	 */
	@Column(name = "CODIGO_RESPUESTA")
	private String codigoRespuesta;
	
	/**
	 * Atributo para definir la propiedad referencia pago.
	 */
	@Column(name = "REFERENCIA_PAGO")
	private String referenciaPago;
	
	/**
	 * Atributo para definir la propiedad activo.
	 */
	@Column(name = "ACTIVO")
	private String activo;
	
	/**
	 * Atributo para definir la propiedad estereotipo creacion.
	 */
	@Column(name = "ESTEREOTIPO_CREACION")
	private String estereotipoCreacion;
	
	/**
	 * Atributo para definir la propiedad usuario.
	 */
	@Column(name = "ID_USUARIO_CREACION")
	private String usuario;
	
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
	 * Atributo para definir la propiedad estereotipo modificacion.
	 */
	@Column(name = "ESTEREOTIPO_MODIFICACION")
	private String estereotipoModificacion;
	
	/**
	 * Atributo para definir la propiedad id usuario modificacion.
	 */
	@Column(name = "ID_USUARIO_MODIFICACION")
	private String idUsuarioModificacion;
	
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
	 * Construye una nueva instancia/objeto de la clase IntegracionTemporal.
	 */
	public IntegracionTemporal() {
		//Metodo constructor vacio para modelo de persistencia 
	}

	/**
	 * Obtiene el valor para la propiedad id.
	 *
	 * @return El valor de la propiedad id
	 */
	public String getId() {
		return id;
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
	 * Obtiene el valor para la propiedad id usuario.
	 *
	 * @return El valor de la propiedad id usuario
	 */
	public Usuario getIdUsuario() {
		return idUsuario;
	}

	/**
	 * Obtiene el valor para la propiedad nir.
	 *
	 * @return El valor de la propiedad nir
	 */
	public String getNir() {
		return nir;
	}

	/**
	 * Obtiene el valor para la propiedad modelo entrada.
	 *
	 * @return El valor de la propiedad modelo entrada
	 */
	public String getModeloEntrada() {
		return modeloEntrada;
	}

	/**
	 * Obtiene el valor para la propiedad entrada.
	 *
	 * @return El valor de la propiedad entrada
	 */
	public String getEntrada() {
		return entrada;
	}

	/**
	 * Obtiene el valor para la propiedad salida.
	 *
	 * @return El valor de la propiedad salida
	 */
	public String getSalida() {
		return salida;
	}

	/**
	 * Obtiene el valor para la propiedad valor total servicio.
	 *
	 * @return El valor de la propiedad valor total servicio
	 */
	public BigDecimal getValorTotalServicio() {
		return valorTotalServicio;
	}

	/**
	 * Obtiene el valor para la propiedad operacion.
	 *
	 * @return El valor de la propiedad operacion
	 */
	public String getOperacion() {
		return operacion;
	}

	/**
	 * Obtiene el valor para la propiedad id asosiacion.
	 *
	 * @return El valor de la propiedad id asosiacion
	 */
	public String getIdAsosiacion() {
		return idAsosiacion;
	}

	/**
	 * Obtiene el valor para la propiedad resultado general.
	 *
	 * @return El valor de la propiedad resultado general
	 */
	public String getResultadoGeneral() {
		return resultadoGeneral;
	}

	/**
	 * Obtiene el valor para la propiedad codigo respuesta.
	 *
	 * @return El valor de la propiedad codigo respuesta
	 */
	public String getCodigoRespuesta() {
		return codigoRespuesta;
	}

	/**
	 * Obtiene el valor para la propiedad referencia pago.
	 *
	 * @return El valor de la propiedad referencia pago
	 */
	public String getReferenciaPago() {
		return referenciaPago;
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
	 * Obtiene el valor para la propiedad estereotipo creacion.
	 *
	 * @return El valor de la propiedad estereotipo creacion
	 */
	public String getEstereotipoCreacion() {
		return estereotipoCreacion;
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
	 * Obtiene el valor para la propiedad fecha creacion.
	 *
	 * @return El valor de la propiedad fecha creacion
	 */
	public Date getFechaCreacion() {
		return fechaCreacion;
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
	 * Obtiene el valor para la propiedad estereotipo modificacion.
	 *
	 * @return El valor de la propiedad estereotipo modificacion
	 */
	public String getEstereotipoModificacion() {
		return estereotipoModificacion;
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
	 * Obtiene el valor para la propiedad fecha modificacion.
	 *
	 * @return El valor de la propiedad fecha modificacion
	 */
	public Date getFechaModificacion() {
		return fechaModificacion;
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
	 * Cambia/actualiza el valor para la propiedad id.
	 *
	 * @param id el nuevo valor para la propiedad id
	 */
	public void setId(String id) {
		this.id = id;
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
	 * Cambia/actualiza el valor para la propiedad id usuario.
	 *
	 * @param idUsuario el nuevo valor para la propiedad id usuario
	 */
	public void setIdUsuario(Usuario idUsuario) {
		this.idUsuario = idUsuario;
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
	 * Cambia/actualiza el valor para la propiedad modelo entrada.
	 *
	 * @param modeloEntrada el nuevo valor para la propiedad modelo entrada
	 */
	public void setModeloEntrada(String modeloEntrada) {
		this.modeloEntrada = modeloEntrada;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad entrada.
	 *
	 * @param entrada el nuevo valor para la propiedad entrada
	 */
	public void setEntrada(String entrada) {
		this.entrada = entrada;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad salida.
	 *
	 * @param salida el nuevo valor para la propiedad salida
	 */
	public void setSalida(String salida) {
		this.salida = salida;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad valor total servicio.
	 *
	 * @param valorTotalServicio el nuevo valor para la propiedad valor total
	 *                           servicio
	 */
	public void setValorTotalServicio(BigDecimal valorTotalServicio) {
		this.valorTotalServicio = valorTotalServicio;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad operacion.
	 *
	 * @param operacion el nuevo valor para la propiedad operacion
	 */
	public void setOperacion(String operacion) {
		this.operacion = operacion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad id asosiacion.
	 *
	 * @param idAsosiacion el nuevo valor para la propiedad id asosiacion
	 */
	public void setIdAsosiacion(String idAsosiacion) {
		this.idAsosiacion = idAsosiacion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad resultado general.
	 *
	 * @param resultadoGeneral el nuevo valor para la propiedad resultado general
	 */
	public void setResultadoGeneral(String resultadoGeneral) {
		this.resultadoGeneral = resultadoGeneral;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad codigo respuesta.
	 *
	 * @param codigoRespuesta el nuevo valor para la propiedad codigo respuesta
	 */
	public void setCodigoRespuesta(String codigoRespuesta) {
		this.codigoRespuesta = codigoRespuesta;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad referencia pago.
	 *
	 * @param referenciaPago el nuevo valor para la propiedad referencia pago
	 */
	public void setReferenciaPago(String referenciaPago) {
		this.referenciaPago = referenciaPago;
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
	 * Cambia/actualiza el valor para la propiedad estereotipo creacion.
	 *
	 * @param estereotipoCreacion el nuevo valor para la propiedad estereotipo
	 *                            creacion
	 */
	public void setEstereotipoCreacion(String estereotipoCreacion) {
		this.estereotipoCreacion = estereotipoCreacion;
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
	 * Cambia/actualiza el valor para la propiedad fecha creacion.
	 *
	 * @param fechaCreacion el nuevo valor para la propiedad fecha creacion
	 */
	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
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
	 * Cambia/actualiza el valor para la propiedad estereotipo modificacion.
	 *
	 * @param estereotipoModificacion el nuevo valor para la propiedad estereotipo
	 *                                modificacion
	 */
	public void setEstereotipoModificacion(String estereotipoModificacion) {
		this.estereotipoModificacion = estereotipoModificacion;
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
	 * Cambia/actualiza el valor para la propiedad fecha modificacion.
	 *
	 * @param fechaModificacion el nuevo valor para la propiedad fecha modificacion
	 */
	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
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
	 * Obtiene el valor para la propiedad visibilidad.
	 *
	 * @return El valor de la propiedad visibilidad
	 */
	public String getVisibilidad() {
		return visibilidad;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad visibilidad.
	 *
	 * @param visibilidad el nuevo valor para la propiedad visibilidad
	 */
	public void setVisibilidad(String visibilidad) {
		this.visibilidad = visibilidad;
	} 
	

}
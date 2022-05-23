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
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.eclipse.persistence.annotations.Cache;
import org.eclipse.persistence.config.CacheIsolationType;

/**
 *
 * @version 1.0
 * @author Smartsoft Solutions S.A.S
 * Nota: Clase de persistencia para la tabla TransaccionBancarizacion de la base de datos.
 * 
 */
@Entity
@Table(name="SDB_ACC_TRANSACCION_BANCARIZACION")
@Cache(isolation=CacheIsolationType.ISOLATED)
@NamedQueries( value = {
		@NamedQuery(name="TransaccionBancarizacion.findAll", query="SELECT s FROM TransaccionBancarizacion s"),
		@NamedQuery(name="TransaccionBancarizacion.findByCodigoTransaccion", query="SELECT s FROM TransaccionBancarizacion s where s.referenciaPago = :codigoTransaccion"),
		@NamedQuery(name="TransaccionBancarizacion.findByUsuarioDate", query="SELECT s FROM TransaccionBancarizacion s where s.fechaServicio >= :fechaInicio and  s.fechaServicio <= :fechaFinal and s.idUsuario = :idUsuario")})
public class TransaccionBancarizacion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEC_ACC_TRANSACCION_BANCARIZACION_ID_GENERATOR")
	@SequenceGenerator(sequenceName = "SEC_ACC_TRANSACCION_BANCARIZACION",allocationSize = 1, name = "SEC_ACC_TRANSACCION_BANCARIZACION_ID_GENERATOR")
	private String id;

	private String activo;

	@Column(name="CODIGO_SEGUIMIENTO")
	private String codigoSeguimiento;

	@Column(name="ESTADO_SERVICIO")
	private String estadoServicio;

	@Column(name="ESTEREOTIPO_CREACION")
	private String estereotipoCreacion;

	@Column(name="ESTEREOTIPO_MODIFICACION")
	private String estereotipoModificacion;

	@Column(name="FECHA_CREACION")
	private Date fechaCreacion;

	@Column(name="FECHA_MODIFICACION")
	private Date fechaModificacion;

	@Column(name="FECHA_SERVICIO")
	private Date fechaServicio;

	@Column(name="ID_USUARIO")
	private String idUsuario;

	@Column(name="ID_USUARIO_CREACION")
	private String idUsuarioCreacion;

	@Column(name="ID_USUARIO_MODIFICACION")
	private String idUsuarioModificacion;

	@Column(name="IP_CREACION")
	private String ipCreacion;

	@Column(name="IP_MODIFICACION")
	private String ipModificacion;

	@Column(name="REFERENCIA_PAGO")
	private String referenciaPago;

	@Lob
	@Column(name="RECIBO_PAGO")
	private String reciboPago;


	//bi-directional many-to-one association to TurnosBancarizacion
	@OneToMany(mappedBy="transaccionBancarizacion", cascade={CascadeType.ALL})
	private List<TurnosBancarizacion> turnosBancarizacions;

	public TransaccionBancarizacion() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getActivo() {
		return this.activo;
	}

	public void setActivo(String activo) {
		this.activo = activo;
	}

	public String getCodigoSeguimiento() {
		return this.codigoSeguimiento;
	}

	public void setCodigoSeguimiento(String codigoSeguimiento) {
		this.codigoSeguimiento = codigoSeguimiento;
	}

	public String getEstadoServicio() {
		return this.estadoServicio;
	}

	public void setEstadoServicio(String estadoServicio) {
		this.estadoServicio = estadoServicio;
	}

	public String getEstereotipoCreacion() {
		return this.estereotipoCreacion;
	}

	public void setEstereotipoCreacion(String estereotipoCreacion) {
		this.estereotipoCreacion = estereotipoCreacion;
	}

	public String getEstereotipoModificacion() {
		return this.estereotipoModificacion;
	}

	public void setEstereotipoModificacion(String estereotipoModificacion) {
		this.estereotipoModificacion = estereotipoModificacion;
	}

	public Date getFechaCreacion() {
		return this.fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public Date getFechaModificacion() {
		return this.fechaModificacion;
	}

	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

	public Date getFechaServicio() {
		return this.fechaServicio;
	}

	public void setFechaServicio(Date fechaServicio) {
		this.fechaServicio = fechaServicio;
	}

	public String getIdUsuario() {
		return this.idUsuario;
	}

	public void setIdUsuario(String idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getIdUsuarioCreacion() {
		return this.idUsuarioCreacion;
	}

	public void setIdUsuarioCreacion(String idUsuarioCreacion) {
		this.idUsuarioCreacion = idUsuarioCreacion;
	}

	public String getIdUsuarioModificacion() {
		return this.idUsuarioModificacion;
	}

	public void setIdUsuarioModificacion(String idUsuarioModificacion) {
		this.idUsuarioModificacion = idUsuarioModificacion;
	}

	public String getIpCreacion() {
		return this.ipCreacion;
	}

	public void setIpCreacion(String ipCreacion) {
		this.ipCreacion = ipCreacion;
	}

	public String getIpModificacion() {
		return this.ipModificacion;
	}

	public void setIpModificacion(String ipModificacion) {
		this.ipModificacion = ipModificacion;
	}

	public String getReferenciaPago() {
		return this.referenciaPago;
	}

	public void setReferenciaPago(String referenciaPago) {
		this.referenciaPago = referenciaPago;
	}

	public List<TurnosBancarizacion> getTurnosBancarizacions() {
		return this.turnosBancarizacions;
	}

	public void setTurnosBancarizacions(List<TurnosBancarizacion> turnosBancarizacions) {
		this.turnosBancarizacions = turnosBancarizacions;
	}

	public TurnosBancarizacion addTurnosBancarizacion(TurnosBancarizacion turnosBancarizacion) {
		getTurnosBancarizacions().add(turnosBancarizacion);
		turnosBancarizacion.setTransaccionBancarizacion(this);

		return turnosBancarizacion;
	}

	public TurnosBancarizacion removeTurnosBancarizacion(TurnosBancarizacion turnosBancarizacion) {
		getTurnosBancarizacions().remove(turnosBancarizacion);
		turnosBancarizacion.setTransaccionBancarizacion(null);

		return turnosBancarizacion;
	}

	public String getReciboPago() {
		return reciboPago;
	}

	public void setReciboPago(String reciboPago) {
		this.reciboPago = reciboPago;
	}



}
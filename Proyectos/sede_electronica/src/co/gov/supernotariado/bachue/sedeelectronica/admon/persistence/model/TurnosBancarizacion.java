package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
*
* @version 1.0
* @author Smartsoft Solutions S.A.S
* Nota: Clase de persistencia para la tabla TurnosBancarizacion de la base de datos.
* 
*/
@Entity
@Table(name="SDB_ACC_TURNOS_BANCARIZACION")
@NamedQueries( value = {
@NamedQuery(name="TurnosBancarizacion.findAll", query="SELECT s FROM TurnosBancarizacion s")})
public class TurnosBancarizacion implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TurnosBancarizacionPK id;

	@Lob
	private String archivo;

	@Column(name="FECHA_CREACION")
	private Date fechaCreacion;
	
	@Column(name="FECHA_SERVICIO")
	private Date fechaServicio;

	@Column(name="FECHA_MODIFICACION")
	private Date fechaModificacion;

	@Column(name="ID_USUARIO_CREACION")
	private String idUsuarioCreacion;

	@Column(name="ID_USUARIO_MODIFICACION")
	private String idUsuarioModificacion;

	@Column(name="IP_CREACION")
	private String ipCreacion;

	@Column(name="IP_MODIFICACION")
	private String ipModificacion;

	private String matricula;

	@Column(name="NUMERO_PAGINAS")
	private String numeroPaginas;
	
	@Column(name="ESTEREOTIPO_CREACION")
	private String estereotipoCreacion;

	@Column(name="ESTEREOTIPO_MODIFICACION")
	private String estereotipoModificacion;
	
	@Column(name="ACTIVO")
	private String activo;

	private String pin;

	//bi-directional many-to-one association to TransaccionBancarizacion
	@ManyToOne(cascade={CascadeType.ALL})
	@JoinColumn(name="ID_TRANSACCION_BANCARIZACION", insertable=false, updatable=false)
	private TransaccionBancarizacion transaccionBancarizacion;

	public TurnosBancarizacion() {
	}

	public TurnosBancarizacionPK getId() {
		return this.id;
	}

	public void setId(TurnosBancarizacionPK id) {
		this.id = id;
	}

	public String getArchivo() {
		return this.archivo;
	}

	public void setArchivo(String archivo) {
		this.archivo = archivo;
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

	public String getMatricula() {
		return this.matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNumeroPaginas() {
		return this.numeroPaginas;
	}

	public void setNumeroPaginas(String numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}

	public String getPin() {
		return this.pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public TransaccionBancarizacion getTransaccionBancarizacion() {
		return this.transaccionBancarizacion;
	}

	public void setTransaccionBancarizacion(TransaccionBancarizacion transaccionBancarizacion) {
		this.transaccionBancarizacion = transaccionBancarizacion;
	}

	public String getActivo() {
		return activo;
	}

	public void setActivo(String activo) {
		this.activo = activo;
	}

	public String getEstereotipoCreacion() {
		return estereotipoCreacion;
	}

	public void setEstereotipoCreacion(String estereotipoCreacion) {
		this.estereotipoCreacion = estereotipoCreacion;
	}

	public String getEstereotipoModificacion() {
		return estereotipoModificacion;
	}

	public void setEstereotipoModificacion(String estereotipoModificacion) {
		this.estereotipoModificacion = estereotipoModificacion;
	}

	public Date getFechaServicio() {
		return fechaServicio;
	}

	public void setFechaServicio(Date fechaServicio) {
		this.fechaServicio = fechaServicio;
	}


}
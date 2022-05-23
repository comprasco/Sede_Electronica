package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

import org.eclipse.persistence.annotations.Cache;
import org.eclipse.persistence.config.CacheIsolationType;


/**
 * The persistent class for the SDB_BNG_SOLICITUDES_PENDIENTES_PODERES database table.
 * 
 */
@Entity
@Table(name="SDB_BNG_SOLICITUD_PENDIENTE_PODER")
@Cache(isolation = CacheIsolationType.ISOLATED)
@NamedQueries(value = {
@NamedQuery(name="SolicitudPendientePoder.findAll", query="SELECT s FROM SolicitudPendientePoder s"),
@NamedQuery(name="SolicitudPendientePoder.findByType", query="SELECT s FROM SolicitudPendientePoder s where s.tipoTransaccion = :tipoTransaccion and s.estadoSolicitud = :estadoSolicitud and s.idNotariaOrigen = :idNotariaOrigen "),
@NamedQuery(name="SolicitudPendientePoder.findByTypeClean", query="SELECT s FROM SolicitudPendientePoder s where s.tipoTransaccion = :tipoTransaccion and s.estadoSolicitud = :estadoSolicitud "),
@NamedQuery(name="SolicitudPendientePoder.findById", query="SELECT s FROM SolicitudPendientePoder s where  s.idNotariaOrigen = :idNotariaOrigen and s.id = :id "),
@NamedQuery(name="SolicitudPendientePoder.findByIdClean", query="SELECT s FROM SolicitudPendientePoder s where s.id = :id ")
})
public class SolicitudPendientePoder implements Serializable {
	
	private static final long serialVersionUID = 1L;

	/* Variables negocio */	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEC_BNG_SOLICITUD_PENDIENTE_PODER_ID_GENERATOR")
	@SequenceGenerator(sequenceName = "SEC_BNG_SOLICITUD_PENDIENTE_PODER",allocationSize = 1, name = "SEC_BNG_SOLICITUD_PENDIENTE_PODER_ID_GENERATOR")
	private String id;
	
	@Column(name="ID_PODER")
	private String idPoder;
	
	@Column(name="ID_VERSION_PODER")
	private String idVersionPoder;
	
	@Column(name="TIPO_TRANSACCION")
	private String tipoTransaccion;
	
	@Column(name="ID_NOTARIA_SOLICITANTE")
	private String idNotariaSolicitante;
	
	@Column(name="ID_NOTARIA_ORIGEN")
	private String idNotariaOrigen;

	@Column(name="OBSERVACION")
	private String observacion;
	
	@Column(name="JUSTIFICACION")
	private String justificacion;
	
	@Column(name="TIPO_PODER")
	private String tipoPoder;
	
	@Column(name="ESTADO_SOLICITUD")
	private String estadoSolicitud;	
	
	@Column(name="TIPO_TRAMITE")
	private String tipoTramite;
	
	@ManyToOne
	@JoinColumn(name = "ID_NOTARIA_ORIGEN", insertable = false, updatable = false)
	private EntidadEspecial notariaOrigen;
	
	@ManyToOne
	@JoinColumn(name = "ID_NOTARIA_SOLICITANTE", insertable = false, updatable = false)
	private EntidadEspecial notariaSolicitante;
	
	/* Variables auditoria */
	
	@Column(name="ACTIVO")
	private String activo;

	@Column(name="ESTEREOTIPO_CREACION")
	private String estereotipoCreacion;

	@Column(name="ESTEREOTIPO_MODIFICACION")
	private String estereotipoModificacion;

	@Column(name="FECHA_CREACION")
	private Date fechaCreacion;

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
	

	public SolicitudPendientePoder() {
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

	public String getEstadoSolicitud() {
		return this.estadoSolicitud;
	}

	public void setEstadoSolicitud(String estadoSolicitud) {
		this.estadoSolicitud = estadoSolicitud;
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

	public String getIdNotariaOrigen() {
		return this.idNotariaOrigen;
	}

	public void setIdNotariaOrigen(String idNotariaOrigen) {
		this.idNotariaOrigen = idNotariaOrigen;
	}

	public String getIdNotariaSolicitante() {
		return this.idNotariaSolicitante;
	}

	public void setIdNotariaSolicitante(String idNotariaSolicitante) {
		this.idNotariaSolicitante = idNotariaSolicitante;
	}

	public String getIdPoder() {
		return this.idPoder;
	}

	public void setIdPoder(String idPoder) {
		this.idPoder = idPoder;
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

	public String getObservacion() {
		return this.observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	public String getTipoPoder() {
		return this.tipoPoder;
	}

	public void setTipoPoder(String tipoPoder) {
		this.tipoPoder = tipoPoder;
	}
	
	public String getTipoTransaccion() {
		return this.tipoTransaccion;
	}

	public void setTipoTransaccion(String tipoTransaccion) {
		this.tipoTransaccion = tipoTransaccion;
	}

	public String getJustificacion() {
		return justificacion;
	}

	public void setJustificacion(String justificacion) {
		this.justificacion = justificacion;
	}

	public EntidadEspecial getNotariaOrigen() {
		return notariaOrigen;
	}

	public void setNotariaOrigen(EntidadEspecial notariaOrigen) {
		this.notariaOrigen = notariaOrigen;
	}

	public EntidadEspecial getNotariaSolicitante() {
		return notariaSolicitante;
	}

	public void setNotariaSolicitante(EntidadEspecial notariaSolicitante) {
		this.notariaSolicitante = notariaSolicitante;
	}

	public String getTipoTramite() {
		return tipoTramite;
	}

	public void setTipoTramite(String tipoTramite) {
		this.tipoTramite = tipoTramite;
	}

	public String getIdVersionPoder() {
		return idVersionPoder;
	}

	public void setIdVersionPoder(String idVersionPoder) {
		this.idVersionPoder = idVersionPoder;
	}
	
	
	
}
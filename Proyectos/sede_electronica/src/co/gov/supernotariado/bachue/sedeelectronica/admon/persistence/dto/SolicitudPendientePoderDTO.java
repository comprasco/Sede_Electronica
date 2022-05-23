package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;
import java.util.Date;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.interfaces.IAuditableDTO;
/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Solicitudes Pendientes Poderes DTO.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class SolicitudPendientePoderDTO extends GenericoDTO implements IAuditableDTO {

	private static final long serialVersionUID = 1L;

	// --- Atributos negocio
	private String is_id;
	private String is_idPoder;
	private String is_idVersionPoder;
	private String is_tipoTransaccion;
	private String is_idNotariaSolicitante;
	private String is_idNotariaOrigen;
	private String is_observacion;
	private String is_justificacion;
	private String is_tipoPoder;
	private String is_estadoSolicitud;
	private String is_tipoTramite;
	private EntidadEspecialDTO iee_entidadEspecialOrigen;
	private EntidadEspecialDTO iee_entidadEspecialSolicitante;
	// --- Atributos auditoria
	private String is_activo;
	private String is_estereotipoCreacion;
	private String is_estereotipoModificacion;
	private Date id_fechaCreacion;
	private Date id_fechaModificacion;
	private String is_idUsuarioCreacion;
	private String is_idUsuarioModificacion;
	private String is_ipCreacion;
	private String is_ipModificacion;	


	public String getIs_id() {
		return is_id;
	}
	public void setIs_id(String as_id) {
		this.is_id = as_id;
	}
	public String getIs_activo() {
		return is_activo;
	}
	public void setIs_activo(String as_activo) {
		this.is_activo = as_activo;
	}
	public String getIs_estadoSolicitud() {
		return is_estadoSolicitud;
	}
	public void setIs_estadoSolicitud(String as_estadoSolicitud) {
		this.is_estadoSolicitud = as_estadoSolicitud;
	}
	public String getIs_estereotipoCreacion() {
		return is_estereotipoCreacion;
	}
	public void setIs_estereotipoCreacion(String as_estereotipoCreacion) {
		this.is_estereotipoCreacion = as_estereotipoCreacion;
	}
	public String getIs_estereotipoModificacion() {
		return is_estereotipoModificacion;
	}
	public void setIs_estereotipoModificacion(String as_estereotipoModificacion) {
		this.is_estereotipoModificacion = as_estereotipoModificacion;
	}
	public Date getId_fechaCreacion() {
		return id_fechaCreacion;
	}
	public void setId_fechaCreacion(Date ad_fechaCreacion) {
		this.id_fechaCreacion = ad_fechaCreacion;
	}
	public Date getId_fechaModificacion() {
		return id_fechaModificacion;
	}
	public void setId_fechaModificacion(Date ad_fechaModificacion) {
		this.id_fechaModificacion = ad_fechaModificacion;
	}
	public String getIs_idNotariaOrigen() {
		return is_idNotariaOrigen;
	}
	public void setIs_idNotariaOrigen(String as_idNotariaOrigen) {
		this.is_idNotariaOrigen = as_idNotariaOrigen;
	}
	public String getIs_idNotariaSolicitante() {
		return is_idNotariaSolicitante;
	}
	public void setIs_idNotariaSolicitante(String as_idNotariaSolicitante) {
		this.is_idNotariaSolicitante = as_idNotariaSolicitante;
	}
	public String getIs_idUsuarioCreacion() {
		return is_idUsuarioCreacion;
	}
	public void setIs_idUsuarioCreacion(String as_idUsuarioCreacion) {
		this.is_idUsuarioCreacion = as_idUsuarioCreacion;
	}
	public String getIs_idUsuarioModificacion() {
		return is_idUsuarioModificacion;
	}
	public void setIs_idUsuarioModificacion(String as_idUsuarioModificacion) {
		this.is_idUsuarioModificacion = as_idUsuarioModificacion;
	}
	public String getIs_ipCreacion() {
		return is_ipCreacion;
	}
	public void setIs_ipCreacion(String as_ipCreacion) {
		this.is_ipCreacion = as_ipCreacion;
	}
	public String getIs_ipModificacion() {
		return is_ipModificacion;
	}
	public void setIs_ipModificacion(String as_ipModificacion) {
		this.is_ipModificacion = as_ipModificacion;
	}
	public String getIs_observacion() {
		return is_observacion;
	}
	public void setIs_observacion(String as_observacion) {
		this.is_observacion = as_observacion;
	}
	public String getIs_tipoPoder() {
		return is_tipoPoder;
	}
	public void setIs_tipoPoder(String as_tipoPoder) {
		this.is_tipoPoder = as_tipoPoder;
	}
	public String getIs_tipoTransaccion() {
		return is_tipoTransaccion;
	}
	public void setIs_tipoTransaccion(String as_tipoTransaccion) {
		this.is_tipoTransaccion = as_tipoTransaccion;
	}

	public String getIs_justificacion() {
		return is_justificacion;
	}

	public void setIs_justificacion(String as_justificacion) {
		this.is_justificacion = as_justificacion;
	}
	public String getIs_idPoder() {
		return is_idPoder;
	}
	public void setIs_idPoder(String as_idPoder) {
		this.is_idPoder = as_idPoder;
	}
	public EntidadEspecialDTO getIee_entidadEspecialOrigen() {
		return iee_entidadEspecialOrigen;
	}
	public void setIee_entidadEspecialOrigen(EntidadEspecialDTO aee_entidadEspecialOrigen) {
		this.iee_entidadEspecialOrigen = aee_entidadEspecialOrigen;
	}
	public EntidadEspecialDTO getIee_entidadEspecialSolicitante() {
		return iee_entidadEspecialSolicitante;
	}
	public void setIee_entidadEspecialSolicitante(EntidadEspecialDTO aee_entidadEspecialSolicitante) {
		this.iee_entidadEspecialSolicitante = aee_entidadEspecialSolicitante;
	}
	public String getIs_tipoTramite() {
		return is_tipoTramite;
	}
	public void setIs_tipoTramite(String as_tipoTramite) {
		this.is_tipoTramite = as_tipoTramite;
	}
	public String getIs_idVersionPoder() {
		return is_idVersionPoder;
	}
	public void setIs_idVersionPoder(String as_idVersionPoder) {
		this.is_idVersionPoder = as_idVersionPoder;
	}

	
}

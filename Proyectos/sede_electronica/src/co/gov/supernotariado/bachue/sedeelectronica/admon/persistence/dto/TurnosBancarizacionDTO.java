package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

import java.util.Date;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.interfaces.IAuditableDTO;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Turno historial
 * solicitudes.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TurnosBancarizacionDTO extends GenericoDTO implements IAuditableDTO { 
	private static final long serialVersionUID = 1L;
	// --- Atributos
	private TurnosBancarizacionPKDTO itb_id;
	private String is_archivo;
	private Date id_fechaCreacion;
	private Date id_fechaServicio;
	private Date id_fechaModificacion;
	private String is_idUsuarioCreacion;
	private String is_idUsuarioModificacion;
	private String is_ipCreacion;
	private String is_ipModificacion;
	private String is_matricula;
	private String is_numeroPaginas;
	private String is_pin;
	private TransaccionBancarizacionDTO itb_transaccionBancarizacion;
	private String is_estereotipoCreacion;
	private String is_activo;
	private String is_estereotipoModificacion;
	
	public TurnosBancarizacionPKDTO getItb_id() {
		return itb_id;
	}
	public void setItb_id(TurnosBancarizacionPKDTO itb_id) {
		this.itb_id = itb_id;
	}
	public String getIs_archivo() {
		return is_archivo;
	}
	public void setIs_archivo(String as_archivo) {
		this.is_archivo = as_archivo;
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
	public String getIs_matricula() {
		return is_matricula;
	}
	public void setIs_matricula(String as_matricula) {
		this.is_matricula = as_matricula;
	}
	public String getIs_numeroPaginas() {
		return is_numeroPaginas;
	}
	public void setIs_numeroPaginas(String as_numeroPaginas) {
		this.is_numeroPaginas = as_numeroPaginas;
	}
	public String getIs_pin() {
		return is_pin;
	}
	public void setIs_pin(String as_pin) {
		this.is_pin = as_pin;
	}
	public TransaccionBancarizacionDTO getItb_transaccionBancarizacion() {
		return itb_transaccionBancarizacion;
	}
	public void setItb_transaccionBancarizacion(TransaccionBancarizacionDTO atb_transaccionBancarizacion) {
		this.itb_transaccionBancarizacion = atb_transaccionBancarizacion;
	}
	public Date getId_fechaServicio() {
		return id_fechaServicio;
	}
	public void setId_fechaServicio(Date ad_fechaServicio) {
		this.id_fechaServicio = ad_fechaServicio;
	}
	public String getIs_estereotipoCreacion() {
		return is_estereotipoCreacion;
	}
	public void setIs_estereotipoCreacion(String as_estereotipoCreacion) {
		this.is_estereotipoCreacion = as_estereotipoCreacion;
	}
	public String getIs_activo() {
		return is_activo;
	}
	public void setIs_activo(String as_activo) {
		this.is_activo = as_activo;
	}
	public String getIs_estereotipoModificacion() {
		return is_estereotipoModificacion;
	}
	public void setIs_estereotipoModificacion(String as_estereotipoModificacion) {
		this.is_estereotipoModificacion = as_estereotipoModificacion;
	}

	
}

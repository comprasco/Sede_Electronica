package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;
import java.util.Date;
import java.util.List;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.interfaces.IAuditableDTO;
/**
*
* @version 1.0
* @author Smartsoft Solutions S.A.S
* Nota: DTO para los datos de la tabla TransaccionBancarizacion
*/
public class TransaccionBancarizacionDTO extends GenericoDTO implements IAuditableDTO { 
	private static final long serialVersionUID = 1L;
	// --- Atributos
	private String is_id;
	private String is_codigoSeguimiento;
	private Date id_fechaServicio;
	private String is_idUsuario;
	private String is_idUsuarioCreacion;
	private String is_idUsuarioModificacion;
	private String is_ipCreacion;
	private String is_ipModificacion;
	private String is_referenciaPago;
	private Date id_fechaCreacion;
	private Date id_fechaModificacion;
	private String is_estadoServicio;
	private String is_subServicio;
	private String is_servicio;
	private String is_estereotipoCreacion;
	private String is_activo;
	private String is_estereotipoModificacion;
	private String is_reciboPago;
	
	private List<TurnosBancarizacionDTO> iltb_turnosBancarizacion;
	
	public String getIs_id() {
		return is_id;
	}
	public void setIs_id(String as_id) {
		this.is_id = as_id;
	}
	public String getIs_codigoSeguimiento() {
		return is_codigoSeguimiento;
	}
	public void setIs_codigoSeguimiento(String as_codigoSeguimiento) {
		this.is_codigoSeguimiento = as_codigoSeguimiento;
	}
	public Date getId_fechaServicio() {
		return id_fechaServicio;
	}
	public void setId_fechaServicio(Date ad_fechaServicio) {
		this.id_fechaServicio = ad_fechaServicio;
	}
	public String getIs_idUsuario() {
		return is_idUsuario;
	}
	public void setIs_idUsuario(String as_idUsuario) {
		this.is_idUsuario = as_idUsuario;
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
	public String getIs_referenciaPago() {
		return is_referenciaPago;
	}
	public void setIs_referenciaPago(String as_referenciaPago) {
		this.is_referenciaPago = as_referenciaPago;
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
	public List<TurnosBancarizacionDTO> getIltb_turnosBancarizacion() {
		return iltb_turnosBancarizacion;
	}
	public void setIltb_turnosBancarizacion(List<TurnosBancarizacionDTO> altb_turnosBancarizacion) {
		this.iltb_turnosBancarizacion = altb_turnosBancarizacion;
	}
	public String getIs_estadoServicio() {
		return is_estadoServicio;
	}
	public void setIs_estadoServicio(String as_estadoServicio) {
		this.is_estadoServicio = as_estadoServicio;
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
	public String getIs_subServicio() {
		return is_subServicio;
	}
	public void setIs_subServicio(String as_subServicio) {
		this.is_subServicio = as_subServicio;
	}
	public String getIs_servicio() {
		return is_servicio;
	}
	public void setIs_servicio(String as_servicio) {
		this.is_servicio = as_servicio;
	}
	public String getIs_reciboPago() {
		return is_reciboPago;
	}
	public void setIs_reciboPago(String is_reciboPago) {
		this.is_reciboPago = is_reciboPago;
	}	
	
	
}

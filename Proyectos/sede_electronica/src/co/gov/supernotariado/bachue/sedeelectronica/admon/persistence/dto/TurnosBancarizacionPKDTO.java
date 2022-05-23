package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

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
public class TurnosBancarizacionPKDTO extends GenericoDTO { 
	private static final long serialVersionUID = 1L;
	// --- Atributos
	private String idTransaccionBancarizacion;
	private String idTurno;

	// --- Constructor
	public TurnosBancarizacionPKDTO () {
	}


	// --- Getters-Setters
	public String getIdTransaccionBancarizacion () {
		return this.idTransaccionBancarizacion;
	}

	public void setIdTransaccionBancarizacion (String idTransaccionBancarizacion) {
		this.idTransaccionBancarizacion=idTransaccionBancarizacion;
	}

	public String getIdTurno () {
		return this.idTurno;
	}

	public void setIdTurno (String idTurno) {
		this.idTurno=idTurno;
	}


}

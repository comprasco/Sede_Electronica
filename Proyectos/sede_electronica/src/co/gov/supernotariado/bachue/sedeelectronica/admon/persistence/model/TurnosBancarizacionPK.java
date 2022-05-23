package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @version 1.0
 * @author Smartsoft Solutions S.A.S
 * Nota: Clase de persistencia para la tabla TurnosBancarizacionPK de la base de datos.
 * 
 */
@Embeddable
public class TurnosBancarizacionPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="ID_TRANSACCION_BANCARIZACION")
	private String idTransaccionBancarizacion;

	@Column(name="ID_TURNO")
	private String idTurno;

	public TurnosBancarizacionPK() {
	}
	public String getIdTransaccionBancarizacion() {
		return this.idTransaccionBancarizacion;
	}
	public void setIdTransaccionBancarizacion(String idTransaccionBancarizacion) {
		this.idTransaccionBancarizacion = idTransaccionBancarizacion;
	}
	public String getIdTurno() {
		return this.idTurno;
	}
	public void setIdTurno(String idTurno) {
		this.idTurno = idTurno;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TurnosBancarizacionPK)) {
			return false;
		}
		TurnosBancarizacionPK castOther = (TurnosBancarizacionPK)other;
		return 
				this.idTransaccionBancarizacion.equals(castOther.idTransaccionBancarizacion)
				&& this.idTurno.equals(castOther.idTurno);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idTransaccionBancarizacion.hashCode();
		hash = hash * prime + this.idTurno.hashCode();

		return hash;
	}
}
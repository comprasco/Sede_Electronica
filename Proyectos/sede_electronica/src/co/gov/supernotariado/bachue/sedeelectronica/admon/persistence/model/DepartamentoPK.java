/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: DepartamentoPK.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model
 * Nombre del elemento: DepartamentoPK
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * El elemento Class DepartamentoPK.<br>
 * Representa un/una departamento PK.<br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */

@Embeddable
public class DepartamentoPK implements Serializable {
	
	/**
	 * Define la constante serialVersionUID.
	 */
	// default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo para definir la propiedad id departamento.
	 */
	@Column(name = "ID_DEPARTAMENTO")
	private String idDepartamento;

	/**
	 * Atributo para definir la propiedad id pais.
	 */
	@Column(name = "ID_PAIS", insertable = false, updatable = false)
	private String idPais;

	/**
	 * Construye una nueva instancia/objeto de la clase DepartamentoPK.
	 */
	public DepartamentoPK() {
		//Metodo constructor vacio para modelo de persistencia 
	}

	/**
	 * Obtiene el valor para la propiedad id departamento.
	 *
	 * @return El valor de la propiedad id departamento
	 */
	public String getIdDepartamento() {
		return this.idDepartamento;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad id departamento.
	 *
	 * @param idDepartamento el nuevo valor para la propiedad id departamento
	 */
	public void setIdDepartamento(String idDepartamento) {
		this.idDepartamento = idDepartamento;
	}

	/**
	 * Obtiene el valor para la propiedad id pais.
	 *
	 * @return El valor de la propiedad id pais
	 */
	public String getIdPais() {
		return this.idPais;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad id pais.
	 *
	 * @param idPais el nuevo valor para la propiedad id pais
	 */
	public void setIdPais(String idPais) {
		this.idPais = idPais;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof DepartamentoPK)) {
			return false;
		}
		DepartamentoPK castOther = (DepartamentoPK) other;
		return this.idDepartamento.equals(castOther.idDepartamento) && this.idPais.equals(castOther.idPais);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idDepartamento.hashCode();
		hash = hash * prime + this.idPais.hashCode();

		return hash;
	}
}
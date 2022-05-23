/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ConfiguracionCampoPK.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model
 * Nombre del elemento: ConfiguracionCampoPK
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * El elemento Class ConfiguracionCampoPK.<br>
 * Representa un/una configuracion campo PK.<br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */

@Embeddable
public class ConfiguracionCampoPK implements Serializable {
	
	/**
	 * Define la constante serialVersionUID.
	 */
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo para definir la propiedad id.
	 */
	private String id;

	/**
	 * Atributo para definir la propiedad id configuracion formulario.
	 */
	@Column(name="ID_CONFIGURACION_FORMULARIO", insertable=false, updatable=false)
	private String idConfiguracionFormulario;

	/**
	 * Construye una nueva instancia/objeto de la clase ConfiguracionCampoPK.
	 */
	public ConfiguracionCampoPK() {
		// Constructor vacio
	}
	
	/**
	 * Obtiene el valor para la propiedad id.
	 *
	 * @return El valor de la propiedad id
	 */
	public String getId() {
		return this.id;
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
	 * Obtiene el valor para la propiedad id configuracion formulario.
	 *
	 * @return El valor de la propiedad id configuracion formulario
	 */
	public String getIdConfiguracionFormulario() {
		return this.idConfiguracionFormulario;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad id configuracion formulario.
	 *
	 * @param idConfiguracionFormulario el nuevo valor para la propiedad id
	 *                                  configuracion formulario
	 */
	public void setIdConfiguracionFormulario(String idConfiguracionFormulario) {
		this.idConfiguracionFormulario = idConfiguracionFormulario;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ConfiguracionCampoPK)) {
			return false;
		}
		ConfiguracionCampoPK castOther = (ConfiguracionCampoPK)other;
		return 
			this.id.equals(castOther.id)
			&& this.idConfiguracionFormulario.equals(castOther.idConfiguracionFormulario);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.id.hashCode();
		hash = hash * prime + this.idConfiguracionFormulario.hashCode();
		
		return hash;
	}
}
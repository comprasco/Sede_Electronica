/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ValorCampoFormularioPK.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model
 * Nombre del elemento: ValorCampoFormularioPK
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * El elemento Class ValorCampoFormularioPK.<br>
 * Representa un/una valor campo formulario PK.<br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Embeddable
public class ValorCampoFormularioPK implements Serializable {
	
	/**
	 * Define la constante serialVersionUID.
	 */
	// default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo para definir la propiedad id formulario usuario.
	 */
	@Column(name = "ID_FORMULARIO_USUARIO", insertable = false, updatable = false)
	private String idFormularioUsuario;

	/**
	 * Atributo para definir la propiedad id configuracion formulario.
	 */
	@Column(name = "ID_CONFIGURACION_FORMULARIO", insertable = false, updatable = false)
	private String idConfiguracionFormulario;

	/**
	 * Atributo para definir la propiedad id configuracion campo.
	 */
	@Column(name = "ID_CONFIGURACION_CAMPO", insertable = false, updatable = false)
	private String idConfiguracionCampo;

	/**
	 * Construye una nueva instancia/objeto de la clase ValorCampoFormularioPK.
	 */
	public ValorCampoFormularioPK() {
		//
	}

	/**
	 * Obtiene el valor para la propiedad id formulario usuario.
	 *
	 * @return El valor de la propiedad id formulario usuario
	 */
	public String getIdFormularioUsuario() {
		return this.idFormularioUsuario;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad id formulario usuario.
	 *
	 * @param idFormularioUsuario el nuevo valor para la propiedad id formulario
	 *                            usuario
	 */
	public void setIdFormularioUsuario(String idFormularioUsuario) {
		this.idFormularioUsuario = idFormularioUsuario;
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

	/**
	 * Obtiene el valor para la propiedad id configuracion campo.
	 *
	 * @return El valor de la propiedad id configuracion campo
	 */
	public String getIdConfiguracionCampo() {
		return this.idConfiguracionCampo;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad id configuracion campo.
	 *
	 * @param idConfiguracionCampo el nuevo valor para la propiedad id configuracion
	 *                             campo
	 */
	public void setIdConfiguracionCampo(String idConfiguracionCampo) {
		this.idConfiguracionCampo = idConfiguracionCampo;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ValorCampoFormularioPK)) {
			return false;
		}
		ValorCampoFormularioPK castOther = (ValorCampoFormularioPK) other;
		return this.idFormularioUsuario.equals(castOther.idFormularioUsuario)
				&& this.idConfiguracionFormulario.equals(castOther.idConfiguracionFormulario)
				&& this.idConfiguracionCampo.equals(castOther.idConfiguracionCampo);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idFormularioUsuario.hashCode();
		hash = hash * prime + this.idConfiguracionFormulario.hashCode();
		hash = hash * prime + this.idConfiguracionCampo.hashCode();

		return hash;
	}
}
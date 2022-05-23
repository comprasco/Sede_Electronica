/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: VeredaPK.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model
 * Nombre del elemento: VeredaPK
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * El elemento Class VeredaPK.<br>
 * Representa un/una vereda PK.<br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Embeddable
public class VeredaPK implements Serializable {
	
	/**
	 * Define la constante serialVersionUID.
	 */
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo para definir la propiedad id pais.
	 */
	@Column(name="ID_PAIS")
	private String idPais;

	/**
	 * Atributo para definir la propiedad id departamento.
	 */
	@Column(name="ID_DEPARTAMENTO")
	private String idDepartamento;

	/**
	 * Atributo para definir la propiedad id municipio.
	 */
	@Column(name="ID_MUNICIPIO")
	private String idMunicipio;

	/**
	 * Atributo para definir la propiedad id vereda.
	 */
	@Column(name="ID_VEREDA")
	private String idVereda;

	/**
	 * Construye una nueva instancia/objeto de la clase VeredaPK.
	 */
	public VeredaPK() {
		//Metodo constructor vacio para modelo DTO 
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
	 * Obtiene el valor para la propiedad id municipio.
	 *
	 * @return El valor de la propiedad id municipio
	 */
	public String getIdMunicipio() {
		return this.idMunicipio;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad id municipio.
	 *
	 * @param idMunicipio el nuevo valor para la propiedad id municipio
	 */
	public void setIdMunicipio(String idMunicipio) {
		this.idMunicipio = idMunicipio;
	}
	
	/**
	 * Obtiene el valor para la propiedad id vereda.
	 *
	 * @return El valor de la propiedad id vereda
	 */
	public String getIdVereda() {
		return this.idVereda;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad id vereda.
	 *
	 * @param idVereda el nuevo valor para la propiedad id vereda
	 */
	public void setIdVereda(String idVereda) {
		this.idVereda = idVereda;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof VeredaPK)) {
			return false;
		}
		VeredaPK castOther = (VeredaPK)other;
		return 
			this.idPais.equals(castOther.idPais)
			&& this.idDepartamento.equals(castOther.idDepartamento)
			&& this.idMunicipio.equals(castOther.idMunicipio)
			&& this.idVereda.equals(castOther.idVereda);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idPais.hashCode();
		hash = hash * prime + this.idDepartamento.hashCode();
		hash = hash * prime + this.idMunicipio.hashCode();
		hash = hash * prime + this.idVereda.hashCode();
		
		return hash;
	}
}
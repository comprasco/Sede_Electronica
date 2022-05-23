/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: MunicipioPK.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model
 * Nombre del elemento: MunicipioPK
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * El elemento Class MunicipioPK.<br>
 * Representa un/una municipio PK.<br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Embeddable
public class MunicipioPK implements Serializable {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo para definir la propiedad id municipio.
	 */
	@Column(name="ID_MUNICIPIO")
	private String idMunicipio;

	/**
	 * Atributo para definir la propiedad id departamento.
	 */
	@Column(name="ID_DEPARTAMENTO", insertable=false, updatable=false)
	private String idDepartamento;

	/**
	 * Atributo para definir la propiedad id pais.
	 */
	@Column(name="ID_PAIS", insertable=false, updatable=false)
	private String idPais;

	/**
	 * Construye una nueva instancia/objeto de la clase MunicipioPK.
	 */
	public MunicipioPK() {
		//Key de municipio
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
		if (!(other instanceof MunicipioPK)) {
			return false;
		}
		MunicipioPK castOther = (MunicipioPK)other;
		return 
			this.idMunicipio.equals(castOther.idMunicipio)
			&& this.idDepartamento.equals(castOther.idDepartamento)
			&& this.idPais.equals(castOther.idPais);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idMunicipio.hashCode();
		hash = hash * prime + this.idDepartamento.hashCode();
		hash = hash * prime + this.idPais.hashCode();
		
		return hash;
	}
}
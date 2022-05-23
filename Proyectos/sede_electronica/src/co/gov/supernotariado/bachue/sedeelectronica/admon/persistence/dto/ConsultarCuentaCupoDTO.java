/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ConsultarCuentaCupoDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: ConsultarCuentaCupoDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

import java.util.Date;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Consultar cuenta
 * cupo.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ConsultarCuentaCupoDTO extends GenericoBaseDTO  {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo fecha para definir la propiedad fechainicial.
	 */
	private Date id_fechainicial;
	
	/**
	 * Atributo de instancia tipo fecha para definir la propiedad fechafinal.
	 */
	private Date id_fechafinal;	
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * numero nota credito.
	 */
	private String is_numeroNotaCredito;
	
	/**
	 * Construye una nueva instancia/objeto de la clase ConsultarCuentaCupoDTO.
	 */
	// --- Constructor
		public ConsultarCuentaCupoDTO() {
			// Metodo constructor vacio para modelo DTO
		}

	
	/**
	 * Obtiene el valor para la propiedad fechainicial.
	 *
	 * @return El valor de la propiedad fechainicial
	 */
	public Date getId_fechainicial() {
		return id_fechainicial;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad fechainicial.
	 *
	 * @param ad_fechainicial el nuevo valor para la propiedad fechainicial
	 */
	public void setId_fechainicial(Date ad_fechainicial) {
		this.id_fechainicial = ad_fechainicial;
	}
	
	/**
	 * Obtiene el valor para la propiedad fechafinal.
	 *
	 * @return El valor de la propiedad fechafinal
	 */
	public Date getId_fechafinal() {
		return id_fechafinal;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad fechafinal.
	 *
	 * @param ad_fechafinal el nuevo valor para la propiedad fechafinal
	 */
	public void setId_fechafinal(Date ad_fechafinal) {
		this.id_fechafinal = ad_fechafinal;
	}
	
	/**
	 * Obtiene el valor para la propiedad numero nota credito.
	 *
	 * @return El valor de la propiedad numero nota credito
	 */
	public String getIs_numeroNotaCredito() {
		return is_numeroNotaCredito;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad numero nota credito.
	 *
	 * @param as_numeroNotaCredito el nuevo valor para la propiedad numero nota
	 *                             credito
	 */
	public void setIs_numeroNotaCredito(String as_numeroNotaCredito) {
		this.is_numeroNotaCredito = as_numeroNotaCredito;
	}
	
	
}

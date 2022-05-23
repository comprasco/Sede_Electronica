/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: BandejaAlertaTierraSalidaDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: BandejaAlertaTierraSalidaDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

import java.util.Date;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto historial
 * notificaciones.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class HistorialNotificacionesDTO extends GenericoDTO {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo fecha para definir la propiedad fechainicial.
	 */
	private Date id_fechaInicial;

	/**
	 * Atributo de instancia tipo fecha para definir la propiedad fechafinal.
	 */
	private Date id_fechaFinal;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * filtro.
	 */
	private String is_filtro;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * numero.
	 */
	private String is_numero;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * pagina.
	 */
	private String is_pagina;

	/**
	 * Obtiene el valor para la propiedad numero
	 * 
	 * @return is_numero
	 */
	public String getIs_numero() {
		return is_numero;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad numero
	 * 
	 * @param as_numero
	 */
	public void setIs_numero(String as_numero) {
		this.is_numero = as_numero;
	}

	/**
	 * Obtiene el valor para la propiedad filtro
	 *
	 * @return El valor de la propiedad filtro
	 */
	public String getIs_filtro() {
		return is_filtro;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad filtro
	 *
	 * @param as_filtro el nuevo valor para la propiedad tipo filtro
	 */
	public void setIs_filtro(String as_filtro) {
		this.is_filtro = as_filtro;
	}

	/**
	 * Obtiene el valor para la propiedad fechainicial.
	 *
	 * @return El valor de la propiedad fechainicial
	 */
	public Date getId_fechaInicial() {
		return id_fechaInicial;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad fechainicial.
	 *
	 * @param ad_fechaInicial el nuevo valor para la propiedad fechainicial
	 */
	public void setId_fechaInicial(Date ad_fechaInicial) {
		this.id_fechaInicial = ad_fechaInicial;
	}

	/**
	 * Obtiene el valor para la propiedad fechafinal.
	 *
	 * @return El valor de la propiedad fechafinal
	 */
	public Date getId_fechaFinal() {
		return id_fechaFinal;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad fechafinal.
	 *
	 * @param ad_fechafinal el nuevo valor para la propiedad fechafinal
	 */
	public void setId_fechaFinal(Date ad_fechafinal) {
		this.id_fechaFinal = ad_fechafinal;
	}
	/**
	 * Obtiene el valor para la propiedad pagina.
	 *
	 * @return El valor de la propiedad pagina
	 */
	public String getIs_pagina() {
		return is_pagina;
	}
	/**
	 * Cambia/actualiza el valor para la propiedad pagina.
	 *
	 * @param as_pagina el nuevo valor para la propiedad pagina
	 */
	public void setIs_pagina(String as_pagina) {
		this.is_pagina = as_pagina;
	}

}

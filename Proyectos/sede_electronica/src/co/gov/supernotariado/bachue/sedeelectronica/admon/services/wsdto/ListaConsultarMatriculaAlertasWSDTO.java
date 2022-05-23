/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ListaConsultarMatriculaAlertasWSDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto
 * Nombre del elemento: ListaConsultarMatriculaAlertasWSDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto;

import java.io.Serializable;

/**
 * Clase tipo objeto de transferencia de datos para web service (WSDTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y servicios web.
 * <br>
 * Contiene propiedades para representar los datos del objeto Lista consultar
 * matricula alertas.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ListaConsultarMatriculaAlertasWSDTO implements Serializable{
	
	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo circulo registral.
	 */
	private String is_codCirculoRegistral;
	
	/**
	 * Atributo de instancia tipo Integer para definir la propiedad numero matricula
	 * inmobiliaria.
	 */
	private Integer is_numMatriculaInmobiliaria;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * numero predial.
	 */
	private String is_numPredial;

	/**
	 * Obtiene el valor para la propiedad codigo circulo registral.
	 *
	 * @return El valor de la propiedad codigo circulo registral
	 */
	public String getIs_codCirculoRegistral() {
		return is_codCirculoRegistral;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad codigo circulo registral.
	 *
	 * @param as_codCirculoRegistral el nuevo valor para la propiedad codigo circulo
	 *                               registral
	 */
	public void setIs_codCirculoRegistral(String as_codCirculoRegistral) {
		this.is_codCirculoRegistral = as_codCirculoRegistral;
	}

	/**
	 * Obtiene el valor para la propiedad numero matricula inmobiliaria.
	 *
	 * @return El valor de la propiedad numero matricula inmobiliaria
	 */
	public Integer getIs_numMatriculaInmobiliaria() {
		return is_numMatriculaInmobiliaria;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad numero matricula inmobiliaria.
	 *
	 * @param as_numMatriculaInmobiliaria el nuevo valor para la propiedad numero
	 *                                    matricula inmobiliaria
	 */
	public void setIs_numMatriculaInmobiliaria(Integer as_numMatriculaInmobiliaria) {
		this.is_numMatriculaInmobiliaria = as_numMatriculaInmobiliaria;
	}

	/**
	 * Obtiene el valor para la propiedad numero predial.
	 *
	 * @return El valor de la propiedad numero predial
	 */
	public String getIs_numPredial() {
		return is_numPredial;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad numero predial.
	 *
	 * @param as_numPredial el nuevo valor para la propiedad numero predial
	 */
	public void setIs_numPredial(String as_numPredial) {
		this.is_numPredial = as_numPredial;
	}


}

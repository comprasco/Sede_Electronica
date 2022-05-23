/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: TipoEntradaConsultarMatriculaFiltrosTierrasWSDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto
 * Nombre del elemento: TipoEntradaConsultarMatriculaFiltrosTierrasWSDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.GenericoDTO;

/**
 * Clase tipo objeto de transferencia de datos para web service (WSDTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y servicios web.
 * <br>
 * Contiene propiedades para representar los datos del objeto Tipo entrada
 * consultar matricula filtros tierras.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoEntradaConsultarMatriculaFiltrosTierrasWSDTO extends GenericoDTO{

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad id
	 * departamento.
	 */
	private String is_idDepartamento;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad id
	 * municipio.
	 */
	private String is_idMunicipio;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad id
	 * vereda.
	 */
	private String is_idVereda;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nombre predio.
	 */
	private String is_nombrePredio;
	
	/**
	 * Atributo de instancia tipo entero para definir la propiedad area predio.
	 */
	private Integer ii_areaPredio;

	/**
	 * Obtiene el valor para la propiedad id departamento.
	 *
	 * @return El valor de la propiedad id departamento
	 */
	public String getIs_idDepartamento() {
		return is_idDepartamento;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad id departamento.
	 *
	 * @param as_idDepartamento el nuevo valor para la propiedad id departamento
	 */
	public void setIs_idDepartamento(String as_idDepartamento) {
		this.is_idDepartamento = as_idDepartamento;
	}

	/**
	 * Obtiene el valor para la propiedad id municipio.
	 *
	 * @return El valor de la propiedad id municipio
	 */
	public String getIs_idMunicipio() {
		return is_idMunicipio;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad id municipio.
	 *
	 * @param as_idMunicipio el nuevo valor para la propiedad id municipio
	 */
	public void setIs_idMunicipio(String as_idMunicipio) {
		this.is_idMunicipio = as_idMunicipio;
	}

	/**
	 * Obtiene el valor para la propiedad id vereda.
	 *
	 * @return El valor de la propiedad id vereda
	 */
	public String getIs_idVereda() {
		return is_idVereda;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad id vereda.
	 *
	 * @param as_idVereda el nuevo valor para la propiedad id vereda
	 */
	public void setIs_idVereda(String as_idVereda) {
		this.is_idVereda = as_idVereda;
	}

	/**
	 * Obtiene el valor para la propiedad nombre predio.
	 *
	 * @return El valor de la propiedad nombre predio
	 */
	public String getIs_nombrePredio() {
		return is_nombrePredio;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad nombre predio.
	 *
	 * @param as_nombrePredio el nuevo valor para la propiedad nombre predio
	 */
	public void setIs_nombrePredio(String as_nombrePredio) {
		this.is_nombrePredio = as_nombrePredio;
	}

	/**
	 * Obtiene el valor para la propiedad area predio.
	 *
	 * @return El valor de la propiedad area predio
	 */
	public Integer getIi_areaPredio() {
		return ii_areaPredio;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad area predio.
	 *
	 * @param ai_areaPredio el nuevo valor para la propiedad area predio
	 */
	public void setIi_areaPredio(Integer ai_areaPredio) {
		this.ii_areaPredio = ai_areaPredio;
	}

}

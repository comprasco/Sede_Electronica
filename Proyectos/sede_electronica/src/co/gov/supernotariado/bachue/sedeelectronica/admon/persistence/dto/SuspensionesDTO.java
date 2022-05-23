/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: CorreccionesDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: CorreccionesDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

import java.util.List;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Correcciones.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class SuspensionesDTO extends GenericoDTO{

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo lista de CSuspensionDTO para definir la propiedad
	 * lista suspension.
	 */
	private List<SuspensionDTO> ils_listaSuspensionDto;
	
	/**
	 * Obtiene el valor para la propiedad lista suspension dto.
	 *
	 * @return El valor de la propiedad lista suspension dto
	 */
	public List<SuspensionDTO> getIlst_listaSuspensionDto() {
		return ils_listaSuspensionDto;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad lista suspension dto.
	 *
	 * @param alc_listaCorreccionDto el nuevo valor para la propiedad lista
	 *                               suspension dto
	 */
	public void setlst_listaSuspensionDto(List<SuspensionDTO> als_listaSuspensionDto) {
		this.ils_listaSuspensionDto = als_listaSuspensionDto;
	}
}

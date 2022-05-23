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
public class CorreccionesDTO extends GenericoDTO{

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo lista de CorreccionDTO para definir la propiedad
	 * lista correccion.
	 */
	private List<CorreccionDTO> ilc_listaCorreccionDto;
	
	/**
	 * Obtiene el valor para la propiedad lista correccion dto.
	 *
	 * @return El valor de la propiedad lista correccion dto
	 */
	public List<CorreccionDTO> getIlc_listaCorreccionDto() {
		return ilc_listaCorreccionDto;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad lista correccion dto.
	 *
	 * @param alc_listaCorreccionDto el nuevo valor para la propiedad lista
	 *                               correccion dto
	 */
	public void setIlc_listaCorreccionDto(List<CorreccionDTO> alc_listaCorreccionDto) {
		this.ilc_listaCorreccionDto = alc_listaCorreccionDto;
	}
}

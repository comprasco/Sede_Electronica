/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ConveniosRSDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.rsdto
 * Nombre del elemento: ConveniosRSDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.rsdto;

import java.util.List;

import com.google.gson.annotations.SerializedName;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.GenericoDTO;

/**
 * Clase tipo objeto de transferencia de datos para Rest services (RSDTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y servicios
 * REST(Representational State Transfer). <br>
 * Contiene propiedades para representar los datos del objeto Convenios.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ConveniosRSDTO extends GenericoDTO {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo lista de ConvenioRSDTO para definir la propiedad
	 * convenio.
	 */
	@SerializedName("convenio")
	private List<ConvenioRSDTO> ilc_convenio;

	/**
	 * Obtiene el valor para la propiedad convenio.
	 *
	 * @return El valor de la propiedad convenio
	 */
	public List<ConvenioRSDTO> getIlc_convenio() {
		return ilc_convenio;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad convenio.
	 *
	 * @param alc_convenio el nuevo valor para la propiedad convenio
	 */
	public void setIlc_convenio(List<ConvenioRSDTO> alc_convenio) {
		this.ilc_convenio = alc_convenio;
	}

}

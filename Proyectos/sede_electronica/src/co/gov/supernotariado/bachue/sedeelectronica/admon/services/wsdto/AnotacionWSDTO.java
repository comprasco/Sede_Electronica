/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: AnotacionWSDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto
 * Nombre del elemento: AnotacionWSDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto;

import java.io.Serializable;
import java.util.List;

/**
 * Clase tipo objeto de transferencia de datos para web service (WSDTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y servicios web.
 * <br>
 * Contiene propiedades para representar los datos del objeto Anotacion.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class AnotacionWSDTO implements Serializable {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;  
	  
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * consecutivo anotacion.
	 */
	private String is_consecutivoAnotacion;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * tipo documento anotacion.
	 */
	private String is_tipoDocumentoAnotacion;  
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * acto juridico.
	 */
	private String is_actoJuridico;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * drr.
	 */
	private String is_drr;  
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * valor acto.
	 */
	private String is_valorActo;  
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * fecha anotacion.
	 */
	private String is_fechaAnotacion;  
	
	/**
	 * Atributo de instancia tipo lista de IntervinienteWSDTO para definir la
	 * propiedad intervinientes.
	 */
	private List<IntervinienteWSDTO> ili_intervinientes;
	
	/**
	 * Obtiene el valor para la propiedad tipo documento anotacion.
	 *
	 * @return El valor de la propiedad tipo documento anotacion
	 */
	public String getIs_tipoDocumentoAnotacion() {
		return is_tipoDocumentoAnotacion;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad tipo documento anotacion.
	 *
	 * @param as_tipoDocumentoAnotacion el nuevo valor para la propiedad tipo
	 *                                  documento anotacion
	 */
	public void setIs_tipoDocumentoAnotacion(String as_tipoDocumentoAnotacion) {
		this.is_tipoDocumentoAnotacion = as_tipoDocumentoAnotacion;
	}
	
	/**
	 * Obtiene el valor para la propiedad drr.
	 *
	 * @return El valor de la propiedad drr
	 */
	public String getIs_drr() {
		return is_drr;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad drr.
	 *
	 * @param as_drr el nuevo valor para la propiedad drr
	 */
	public void setIs_drr(String as_drr) {
		this.is_drr = as_drr;
	}
	
	/**
	 * Obtiene el valor para la propiedad valor acto.
	 *
	 * @return El valor de la propiedad valor acto
	 */
	public String getIs_valorActo() {
		return is_valorActo;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad valor acto.
	 *
	 * @param as_valorActo el nuevo valor para la propiedad valor acto
	 */
	public void setIs_valorActo(String as_valorActo) {
		this.is_valorActo = as_valorActo;
	}
	
	/**
	 * Obtiene el valor para la propiedad fecha anotacion.
	 *
	 * @return El valor de la propiedad fecha anotacion
	 */
	public String getIs_fechaAnotacion() {
		return is_fechaAnotacion;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad fecha anotacion.
	 *
	 * @param as_fechaAnotacion el nuevo valor para la propiedad fecha anotacion
	 */
	public void setIs_fechaAnotacion(String as_fechaAnotacion) {
		this.is_fechaAnotacion = as_fechaAnotacion;
	}
	
	/**
	 * Obtiene el valor para la propiedad intervinientes.
	 *
	 * @return El valor de la propiedad intervinientes
	 */
	public List<IntervinienteWSDTO> getIli_intervinientes() {
		return ili_intervinientes;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad intervinientes.
	 *
	 * @param ali_intervinientes el nuevo valor para la propiedad intervinientes
	 */
	public void setIli_intervinientes(List<IntervinienteWSDTO> ali_intervinientes) {
		this.ili_intervinientes = ali_intervinientes;
	}
	
	/**
	 * Obtiene el valor para la propiedad consecutivo anotacion.
	 *
	 * @return El valor de la propiedad consecutivo anotacion
	 */
	public String getIs_consecutivoAnotacion() {
		return is_consecutivoAnotacion;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad consecutivo anotacion.
	 *
	 * @param as_consecutivoAnotacion el nuevo valor para la propiedad consecutivo
	 *                                anotacion
	 */
	public void setIs_consecutivoAnotacion(String as_consecutivoAnotacion) {
		this.is_consecutivoAnotacion = as_consecutivoAnotacion;
	}
	
	/**
	 * Obtiene el valor para la propiedad acto juridico.
	 *
	 * @return El valor de la propiedad acto juridico
	 */
	public String getIs_actoJuridico() {
		return is_actoJuridico;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad acto juridico.
	 *
	 * @param as_actoJuridico el nuevo valor para la propiedad acto juridico
	 */
	public void setIs_actoJuridico(String as_actoJuridico) {
		this.is_actoJuridico = as_actoJuridico;
	}	 
		
}

/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: TrazabilidadSalidaWSDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto
 * Nombre del elemento: TrazabilidadSalidaWSDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto;

import java.util.List;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.GenericoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.interfaces.ISalidaServicioWSDTO;

/**
 * Clase tipo objeto de transferencia de datos para web service (WSDTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y servicios web.
 * <br>
 * Contiene propiedades para representar los datos del objeto Trazabilidad
 * salida.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TrazabilidadSalidaWSDTO extends GenericoDTO implements ISalidaServicioWSDTO{

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nir.
	 */
	private String is_nir;    
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * fase actual NIR.
	 */
	private String is_faseActualNIR;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad nir
	 * vinculado.
	 */
	private String is_nirVinculado;    
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * tramite vinculado.
	 */
	private String is_tramiteVinculado;    
	
	/**
	 * Atributo de instancia tipo lista de ElementoNirWSDTO para definir la
	 * propiedad elementosnir.
	 */
	private List<ElementoNirWSDTO> ilen_elementosnir;    
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo mensaje.
	 */
	private String is_codigoMensaje;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * descripcion mensaje.
	 */
	private String is_descripcionMensaje;
	
	/**
	 * Obtiene el valor para la propiedad nir.
	 *
	 * @return El valor de la propiedad nir
	 */
	public String getIs_nir() {
		return is_nir;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad nir.
	 *
	 * @param as_nir el nuevo valor para la propiedad nir
	 */
	public void setIs_nir(String as_nir) {
		this.is_nir = as_nir;
	}
	
	/**
	 * Obtiene el valor para la propiedad fase actual NIR.
	 *
	 * @return El valor de la propiedad fase actual NIR
	 */
	public String getIs_faseActualNIR() {
		return is_faseActualNIR;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad fase actual NIR.
	 *
	 * @param as_faseActualNIR el nuevo valor para la propiedad fase actual NIR
	 */
	public void setIs_faseActualNIR(String as_faseActualNIR) {
		this.is_faseActualNIR = as_faseActualNIR;
	}
	
	/**
	 * Obtiene el valor para la propiedad nir vinculado.
	 *
	 * @return El valor de la propiedad nir vinculado
	 */
	public String getIs_nirVinculado() {
		return is_nirVinculado;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad nir vinculado.
	 *
	 * @param as_nirVinculado el nuevo valor para la propiedad nir vinculado
	 */
	public void setIs_nirVinculado(String as_nirVinculado) {
		this.is_nirVinculado = as_nirVinculado;
	}
	
	/**
	 * Obtiene el valor para la propiedad tramite vinculado.
	 *
	 * @return El valor de la propiedad tramite vinculado
	 */
	public String getIs_tramiteVinculado() {
		return is_tramiteVinculado;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad tramite vinculado.
	 *
	 * @param as_tramiteVinculado el nuevo valor para la propiedad tramite vinculado
	 */
	public void setIs_tramiteVinculado(String as_tramiteVinculado) {
		this.is_tramiteVinculado = as_tramiteVinculado;
	}
	
	/**
	 * Obtiene el valor para la propiedad elementosnir.
	 *
	 * @return El valor de la propiedad elementosnir
	 */
	public List<ElementoNirWSDTO> getIlen_elementosnir() {
		return ilen_elementosnir;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad elementosnir.
	 *
	 * @param alen_elementosnir el nuevo valor para la propiedad elementosnir
	 */
	public void setIlen_elementosnir(List<ElementoNirWSDTO> alen_elementosnir) {
		this.ilen_elementosnir = alen_elementosnir;
	}
	
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.interfaces.ISalidaServicioWSDTO#getIs_codigoMensaje()
	 */
	@Override
	public String getIs_codigoMensaje() {
		return is_codigoMensaje;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad codigo mensaje.
	 *
	 * @param as_codigoMensaje el nuevo valor para la propiedad codigo mensaje
	 */
	public void setIs_codigoMensaje(String as_codigoMensaje) {
		this.is_codigoMensaje = as_codigoMensaje;
	}
	
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.interfaces.ISalidaServicioWSDTO#getIs_descripcionMensaje()
	 */
	public String getIs_descripcionMensaje() {
		return is_descripcionMensaje;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad descripcion mensaje.
	 *
	 * @param as_descripcionMensaje el nuevo valor para la propiedad descripcion
	 *                              mensaje
	 */
	public void setIs_descripcionMensaje(String as_descripcionMensaje) {
		this.is_descripcionMensaje = as_descripcionMensaje;
	}	

}

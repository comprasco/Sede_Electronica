/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: TipoSalidaConsultarTrazabilidadVO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.vo.consultartrazabilidad
 * Nombre del elemento: TipoSalidaConsultarTrazabilidadVO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.vo.consultartrazabilidad;

import java.util.List;

import co.gov.supernotariado.bachue.clientebus.vo.ClienteIntegracionVO;

/**
 * Clase tipo objeto de valores de servicios (VO). <br>
 * Permite pasar datos de entrada o devolver los resultados al invocar una
 * operacion de un servicio, <br>
 * consumida usando el cliente bus. <br>
 * Contiene propiedades para representar los datos de entrada/salida del objeto
 * Tipo salida consultar trazabilidad .
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoSalidaConsultarTrazabilidadVO extends ClienteIntegracionVO{

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo lista de ElementoNirVO para definir la propiedad
	 * elementosnir.
	 */
	private List<ElementoNirVO> ilen_elementosnir;    
	
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
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * fase actual NIR.
	 */
	private String is_faseActualNIR;    
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nir.
	 */
	private String is_nir;    
	
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
	 * Obtiene el valor para la propiedad elementosnir.
	 *
	 * @return El valor de la propiedad elementosnir
	 */
	public List<ElementoNirVO> getIlen_elementosnir() {
		return ilen_elementosnir;
	}
	
	/**
	 * Obtiene el valor para la propiedad codigo mensaje.
	 *
	 * @return El valor de la propiedad codigo mensaje
	 */
	public String getIs_codigoMensaje() {
		return is_codigoMensaje;
	}
	
	/**
	 * Obtiene el valor para la propiedad descripcion mensaje.
	 *
	 * @return El valor de la propiedad descripcion mensaje
	 */
	public String getIs_descripcionMensaje() {
		return is_descripcionMensaje;
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
	 * Obtiene el valor para la propiedad nir.
	 *
	 * @return El valor de la propiedad nir
	 */
	public String getIs_nir() {
		return is_nir;
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
	 * Obtiene el valor para la propiedad tramite vinculado.
	 *
	 * @return El valor de la propiedad tramite vinculado
	 */
	public String getIs_tramiteVinculado() {
		return is_tramiteVinculado;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad elementosnir.
	 *
	 * @param alen_elementosnir el nuevo valor para la propiedad elementosnir
	 */
	public void setIlen_elementosnir(List<ElementoNirVO> alen_elementosnir) {
		this.ilen_elementosnir = alen_elementosnir;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad codigo mensaje.
	 *
	 * @param as_codigoMensaje el nuevo valor para la propiedad codigo mensaje
	 */
	public void setIs_codigoMensaje(String as_codigoMensaje) {
		this.is_codigoMensaje = as_codigoMensaje;
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
	
	/**
	 * Cambia/actualiza el valor para la propiedad fase actual NIR.
	 *
	 * @param as_faseActualNIR el nuevo valor para la propiedad fase actual NIR
	 */
	public void setIs_faseActualNIR(String as_faseActualNIR) {
		this.is_faseActualNIR = as_faseActualNIR;
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
	 * Cambia/actualiza el valor para la propiedad nir vinculado.
	 *
	 * @param as_nirVinculado el nuevo valor para la propiedad nir vinculado
	 */
	public void setIs_nirVinculado(String as_nirVinculado) {
		this.is_nirVinculado = as_nirVinculado;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad tramite vinculado.
	 *
	 * @param as_tramiteVinculado el nuevo valor para la propiedad tramite vinculado
	 */
	public void setIs_tramiteVinculado(String as_tramiteVinculado) {
		this.is_tramiteVinculado = as_tramiteVinculado;
	}	

}

/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: TipoEstadoTramiteWSDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto
 * Nombre del elemento: TipoEstadoTramiteWSDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto;

import java.io.Serializable;

/**
 * Clase tipo objeto de transferencia de datos para web service (WSDTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y servicios web.
 * <br>
 * Contiene propiedades para representar los datos del objeto Tipo estado
 * tramite.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoEstadoTramiteWSDTO implements Serializable{
	
	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo estado.
	 */
	private String is_codigoEstado;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * fecha inicio etapa.
	 */
	private String is_fechaInicioEtapa;
    
    /**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad paso por
	 * estado.
	 */
    private boolean ib_pasoPorEstado;
    
	/**
	 * Obtiene el valor para la propiedad codigo estado.
	 *
	 * @return El valor de la propiedad codigo estado
	 */
	public String getIs_codigoEstado() {
		return is_codigoEstado;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad codigo estado.
	 *
	 * @param as_codigoEstado el nuevo valor para la propiedad codigo estado
	 */
	public void setIs_codigoEstado(String as_codigoEstado) {
		this.is_codigoEstado = as_codigoEstado;
	}
	
	/**
	 * Obtiene el valor para la propiedad fecha inicio etapa.
	 *
	 * @return El valor de la propiedad fecha inicio etapa
	 */
	public String getIs_fechaInicioEtapa() {
		return is_fechaInicioEtapa;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad fecha inicio etapa.
	 *
	 * @param as_fechaInicioEtapa el nuevo valor para la propiedad fecha inicio
	 *                            etapa
	 */
	public void setIs_fechaInicioEtapa(String as_fechaInicioEtapa) {
		this.is_fechaInicioEtapa = as_fechaInicioEtapa;
	}
	
	/**
	 * Obtiene el valor para la propiedad paso por estado.
	 *
	 * @return true, si se cumple la propiedad paso por estado, false caso contrario
	 */
	public boolean isIb_pasoPorEstado() {
		return ib_pasoPorEstado;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad paso por estado.
	 *
	 * @param ab_pasoPorEstado el nuevo valor para la propiedad paso por estado
	 */
	public void setIb_pasoPorEstado(boolean ab_pasoPorEstado) {
		this.ib_pasoPorEstado = ab_pasoPorEstado;
	}
}

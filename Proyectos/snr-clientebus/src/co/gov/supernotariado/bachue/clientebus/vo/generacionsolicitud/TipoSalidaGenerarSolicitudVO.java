/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: TipoSalidaGenerarSolicitudVO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.vo.generacionsolicitud
 * Nombre del elemento: TipoSalidaGenerarSolicitudVO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.vo.generacionsolicitud;

import co.gov.supernotariado.bachue.clientebus.vo.ClienteIntegracionVO;

/**
 * Clase tipo objeto de valores de servicios (VO). <br>
 * Permite pasar datos de entrada o devolver los resultados al invocar una
 * operacion de un servicio, <br>
 * consumida usando el cliente bus. <br>
 * Contiene propiedades para representar los datos de entrada/salida del objeto
 * Tipo salida generar solicitud .
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoSalidaGenerarSolicitudVO extends ClienteIntegracionVO {

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
	 * codigo estado solicitud.
	 */
    private String is_codigoEstadoSolicitud;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * descripcion estado solicitud.
	 */
    private String is_descripcionEstadoSolicitud;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * mensaje al solicitante.
	 */
    private String is_mensajeAlSolicitante;
    
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
	 * Obtiene el valor para la propiedad codigo estado solicitud.
	 *
	 * @return El valor de la propiedad codigo estado solicitud
	 */
	public String getIs_codigoEstadoSolicitud() {
		return is_codigoEstadoSolicitud;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad codigo estado solicitud.
	 *
	 * @param as_codigoEstadoSolicitud el nuevo valor para la propiedad codigo
	 *                                 estado solicitud
	 */
	public void setIs_codigoEstadoSolicitud(String as_codigoEstadoSolicitud) {
		this.is_codigoEstadoSolicitud = as_codigoEstadoSolicitud;
	}
	
	/**
	 * Obtiene el valor para la propiedad descripcion estado solicitud.
	 *
	 * @return El valor de la propiedad descripcion estado solicitud
	 */
	public String getIs_descripcionEstadoSolicitud() {
		return is_descripcionEstadoSolicitud;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad descripcion estado solicitud.
	 *
	 * @param as_descripcionEstadoSolicitud el nuevo valor para la propiedad
	 *                                      descripcion estado solicitud
	 */
	public void setIs_descripcionEstadoSolicitud(String as_descripcionEstadoSolicitud) {
		this.is_descripcionEstadoSolicitud = as_descripcionEstadoSolicitud;
	}
	
	/**
	 * Obtiene el valor para la propiedad mensaje al solicitante.
	 *
	 * @return El valor de la propiedad mensaje al solicitante
	 */
	public String getIs_mensajeAlSolicitante() {
		return is_mensajeAlSolicitante;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad mensaje al solicitante.
	 *
	 * @param as_mensajeAlSolicitante el nuevo valor para la propiedad mensaje al
	 *                                solicitante
	 */
	public void setIs_mensajeAlSolicitante(String as_mensajeAlSolicitante) {
		this.is_mensajeAlSolicitante = as_mensajeAlSolicitante;
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
	 * Cambia/actualiza el valor para la propiedad codigo mensaje.
	 *
	 * @param as_codigoMensaje el nuevo valor para la propiedad codigo mensaje
	 */
	public void setIs_codigoMensaje(String as_codigoMensaje) {
		this.is_codigoMensaje = as_codigoMensaje;
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
	 * Cambia/actualiza el valor para la propiedad descripcion mensaje.
	 *
	 * @param as_descripcionMensaje el nuevo valor para la propiedad descripcion
	 *                              mensaje
	 */
	public void setIs_descripcionMensaje(String as_descripcionMensaje) {
		this.is_descripcionMensaje = as_descripcionMensaje;
	}
	
}

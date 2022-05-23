/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: DescargarResultadoConsultaVO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.vo.bancarizacion.descargarresultadoconsulta
 * Nombre del elemento: DescargarResultadoConsultaVO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */

package co.gov.supernotariado.bachue.clientebus.vo.bancarizacion.descargarresultadoconsulta;

import co.gov.supernotariado.bachue.clientebus.vo.ClienteIntegracionVO;

/**
 * Clase tipo objeto de valores de servicios (VO). <br>
 * Permite pasar datos de entrada o devolver los resultados al invocar una
 * operacion de un servicio, <br>
 * consumida usando el cliente bus. <br>
 * Contiene propiedades para representar los datos de entrada/salida del objeto
 * Descargar resultado consulta .
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class DescargarResultadoConsultaVO extends ClienteIntegracionVO
{


	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * usuario WS.
	 */
	private String is_usuarioWS;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * clave WS.
	 */
    private String is_claveWS;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo convenio.
	 */
    private String is_codigoConvenio;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo servicio.
	 */
    private String is_codigoServicio;
    
    /**
	 * Atributo de instancia tipo Long para definir la propiedad codigo transaccion.
	 */
    private Long il_codigoTransaccion;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * tipo respuesta.
	 */
    private String is_tipoRespuesta;
    
	/**
	 * Obtiene el valor para la propiedad usuario WS.
	 *
	 * @return El valor de la propiedad usuario WS
	 */
	public String getIs_usuarioWS() {
		return is_usuarioWS;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad usuario WS.
	 *
	 * @param as_usuarioWS el nuevo valor para la propiedad usuario WS
	 */
	public void setIs_usuarioWS(String as_usuarioWS) {
		this.is_usuarioWS = as_usuarioWS;
	}
	
	/**
	 * Obtiene el valor para la propiedad clave WS.
	 *
	 * @return El valor de la propiedad clave WS
	 */
	public String getIs_claveWS() {
		return is_claveWS;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad clave WS.
	 *
	 * @param as_claveWS el nuevo valor para la propiedad clave WS
	 */
	public void setIs_claveWS(String as_claveWS) {
		this.is_claveWS = as_claveWS;
	}
	
	/**
	 * Obtiene el valor para la propiedad codigo convenio.
	 *
	 * @return El valor de la propiedad codigo convenio
	 */
	public String getIs_codigoConvenio() {
		return is_codigoConvenio;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad codigo convenio.
	 *
	 * @param as_codigoConvenio el nuevo valor para la propiedad codigo convenio
	 */
	public void setIs_codigoConvenio(String as_codigoConvenio) {
		this.is_codigoConvenio = as_codigoConvenio;
	}
	
	/**
	 * Obtiene el valor para la propiedad codigo servicio.
	 *
	 * @return El valor de la propiedad codigo servicio
	 */
	public String getIs_codigoServicio() {
		return is_codigoServicio;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad codigo servicio.
	 *
	 * @param as_codigoServicio el nuevo valor para la propiedad codigo servicio
	 */
	public void setIs_codigoServicio(String as_codigoServicio) {
		this.is_codigoServicio = as_codigoServicio;
	}
	
	/**
	 * Obtiene el valor para la propiedad codigo transaccion.
	 *
	 * @return El valor de la propiedad codigo transaccion
	 */
	public Long getIl_codigoTransaccion() {
		return il_codigoTransaccion;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad codigo transaccion.
	 *
	 * @param al_codigoTransaccion el nuevo valor para la propiedad codigo
	 *                             transaccion
	 */
	public void setIl_codigoTransaccion(Long al_codigoTransaccion) {
		this.il_codigoTransaccion = al_codigoTransaccion;
	}
	
	/**
	 * Obtiene el valor para la propiedad tipo respuesta.
	 *
	 * @return El valor de la propiedad tipo respuesta
	 */
	public String getIs_tipoRespuesta() {
		return is_tipoRespuesta;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad tipo respuesta.
	 *
	 * @param as_tipoRespuesta el nuevo valor para la propiedad tipo respuesta
	 */
	public void setIs_tipoRespuesta(String as_tipoRespuesta) {
		this.is_tipoRespuesta = as_tipoRespuesta;
	}  
}

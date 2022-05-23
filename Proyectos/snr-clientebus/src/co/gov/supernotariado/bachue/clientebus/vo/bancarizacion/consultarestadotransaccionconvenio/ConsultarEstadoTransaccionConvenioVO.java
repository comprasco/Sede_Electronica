/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: ConsultarEstadoTransaccionConvenioVO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.vo.bancarizacion.consultarestadotransaccionconvenio
 * Nombre del elemento: ConsultarEstadoTransaccionConvenioVO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.vo.bancarizacion.consultarestadotransaccionconvenio;

import co.gov.supernotariado.bachue.clientebus.vo.ClienteIntegracionVO;


/**
 * Clase tipo objeto de valores de servicios (VO). <br>
 * Permite pasar datos de entrada o devolver los resultados al invocar una
 * operacion de un servicio, <br>
 * consumida usando el cliente bus. <br>
 * Contiene propiedades para representar los datos de entrada/salida del objeto
 * Consultar estado transaccion convenio .
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ConsultarEstadoTransaccionConvenioVO extends ClienteIntegracionVO{


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
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad id
	 * seguimiento convenio.
	 */
	private String is_idSeguimientoConvenio;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * confirmacion entrega.
	 */
	private String is_confirmacionEntrega;

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
	 * Obtiene el valor para la propiedad id seguimiento convenio.
	 *
	 * @return El valor de la propiedad id seguimiento convenio
	 */
	public String getIs_idSeguimientoConvenio() {
		return is_idSeguimientoConvenio;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad id seguimiento convenio.
	 *
	 * @param as_idSeguimientoConvenio el nuevo valor para la propiedad id
	 *                                 seguimiento convenio
	 */
	public void setIs_idSeguimientoConvenio(String as_idSeguimientoConvenio) {
		this.is_idSeguimientoConvenio = as_idSeguimientoConvenio;
	}
	
	/**
	 * Obtiene el valor para la propiedad confirmacion entrega.
	 *
	 * @return El valor de la propiedad confirmacion entrega
	 */
	public String getIs_confirmacionEntrega() {
		return is_confirmacionEntrega;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad confirmacion entrega.
	 *
	 * @param as_confirmacionEntrega el nuevo valor para la propiedad confirmacion
	 *                               entrega
	 */
	public void setIs_confirmacionEntrega(String as_confirmacionEntrega) {
		this.is_confirmacionEntrega = as_confirmacionEntrega;
	}


}

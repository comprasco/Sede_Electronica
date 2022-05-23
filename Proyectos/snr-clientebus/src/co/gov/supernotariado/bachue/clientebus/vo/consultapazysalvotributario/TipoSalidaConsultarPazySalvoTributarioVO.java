/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: TipoSalidaConsultarPazySalvoTributarioVO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.vo.consultapazysalvotributario
 * Nombre del elemento: TipoSalidaConsultarPazySalvoTributarioVO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.vo.consultapazysalvotributario;

import co.gov.supernotariado.bachue.clientebus.vo.ClienteIntegracionVO;

/**
 * Clase tipo objeto de valores de servicios (VO). <br>
 * Permite pasar datos de entrada o devolver los resultados al invocar una
 * operacion de un servicio, <br>
 * consumida usando el cliente bus. <br>
 * Contiene propiedades para representar los datos de entrada/salida del objeto
 * Tipo salida consultar pazy salvo tributario .
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoSalidaConsultarPazySalvoTributarioVO extends ClienteIntegracionVO
{
	
	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo arreglo de bytes para definir la propiedad pdf
	 * certificado.
	 */
	private byte[] ib_pdfCertificado;
	
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
	 * Obtiene el valor para la propiedad pdf certificado.
	 *
	 * @return El valor de la propiedad pdf certificado
	 */
	public byte[] getIb_pdfCertificado() {
		return ib_pdfCertificado;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad pdf certificado.
	 *
	 * @param ab_pdfCertificado el nuevo valor para la propiedad pdf certificado
	 */
	public void setIb_pdfCertificado(byte[] ab_pdfCertificado) {
		this.ib_pdfCertificado = ab_pdfCertificado;
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
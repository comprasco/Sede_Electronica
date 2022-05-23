/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: TipoSalidaConsultarEstadoSolicitudVO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.vo.generacionsolicitud
 * Nombre del elemento: TipoSalidaConsultarEstadoSolicitudVO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.vo.generacionsolicitud;

import java.util.Date;

import co.gov.supernotariado.bachue.clientebus.vo.ClienteIntegracionVO;

/**
 * Clase tipo objeto de valores de servicios (VO). <br>
 * Permite pasar datos de entrada o devolver los resultados al invocar una
 * operacion de un servicio, <br>
 * consumida usando el cliente bus. <br>
 * Contiene propiedades para representar los datos de entrada/salida del objeto
 * Tipo salida consultar estado solicitud .
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoSalidaConsultarEstadoSolicitudVO  extends ClienteIntegracionVO {

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
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad id
	 * etapa.
	 */
	private String is_idEtapa;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nombre etapa.
	 */
	private String is_nombreEtapa;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad id
	 * motivo.
	 */
	private String is_idMotivo;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * descripcion motivo.
	 */
	private String is_descripcionMotivo;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * estado.
	 */
	private String is_estado;
	
	/**
	 * Atributo de instancia tipo fecha para definir la propiedad fecha fin.
	 */
	private Date id_fechaFin;
	
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
	 * Obtiene el valor para la propiedad id etapa.
	 *
	 * @return El valor de la propiedad id etapa
	 */
	public String getIs_idEtapa() {
		return is_idEtapa;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad id etapa.
	 *
	 * @param as_idEtapa el nuevo valor para la propiedad id etapa
	 */
	public void setIs_idEtapa(String as_idEtapa) {
		this.is_idEtapa = as_idEtapa;
	}
	
	/**
	 * Obtiene el valor para la propiedad nombre etapa.
	 *
	 * @return El valor de la propiedad nombre etapa
	 */
	public String getIs_nombreEtapa() {
		return is_nombreEtapa;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad nombre etapa.
	 *
	 * @param as_nombreEtapa el nuevo valor para la propiedad nombre etapa
	 */
	public void setIs_nombreEtapa(String as_nombreEtapa) {
		this.is_nombreEtapa = as_nombreEtapa;
	}
	
	/**
	 * Obtiene el valor para la propiedad id motivo.
	 *
	 * @return El valor de la propiedad id motivo
	 */
	public String getIs_idMotivo() {
		return is_idMotivo;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad id motivo.
	 *
	 * @param as_idMotivo el nuevo valor para la propiedad id motivo
	 */
	public void setIs_idMotivo(String as_idMotivo) {
		this.is_idMotivo = as_idMotivo;
	}
	
	/**
	 * Obtiene el valor para la propiedad descripcion motivo.
	 *
	 * @return El valor de la propiedad descripcion motivo
	 */
	public String getIs_descripcionMotivo() {
		return is_descripcionMotivo;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad descripcion motivo.
	 *
	 * @param as_descripcionMotivo el nuevo valor para la propiedad descripcion
	 *                             motivo
	 */
	public void setIs_descripcionMotivo(String as_descripcionMotivo) {
		this.is_descripcionMotivo = as_descripcionMotivo;
	}
	
	/**
	 * Obtiene el valor para la propiedad estado.
	 *
	 * @return El valor de la propiedad estado
	 */
	public String getIs_estado() {
		return is_estado;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad estado.
	 *
	 * @param as_estado el nuevo valor para la propiedad estado
	 */
	public void setIs_estado(String as_estado) {
		this.is_estado = as_estado;
	}
	
	/**
	 * Obtiene el valor para la propiedad fecha fin.
	 *
	 * @return El valor de la propiedad fecha fin
	 */
	public Date getId_fechaFin() {
		return id_fechaFin;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad fecha fin.
	 *
	 * @param ad_fechaFin el nuevo valor para la propiedad fecha fin
	 */
	public void setId_fechaFin(Date ad_fechaFin) {
		this.id_fechaFin = ad_fechaFin;
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

/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: RespuestaDescargarResultadoConsultaVO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.vo.bancarizacion.descargarresultadoconsulta
 * Nombre del elemento: RespuestaDescargarResultadoConsultaVO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */

package co.gov.supernotariado.bachue.clientebus.vo.bancarizacion.descargarresultadoconsulta;

import co.gov.supernotariado.bachue.clientebus.vo.ClienteIntegracionVO;
import co.gov.supernotariado.bachue.clientebus.vo.bancarizacion.generico.EntidadLogVO;


/**
 * Clase tipo objeto de valores de servicios (VO). <br>
 * Permite pasar datos de entrada o devolver los resultados al invocar una
 * operacion de un servicio, <br>
 * consumida usando el cliente bus. <br>
 * Contiene propiedades para representar los datos de entrada/salida del objeto
 * Respuesta descargar resultado consulta .
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class RespuestaDescargarResultadoConsultaVO extends ClienteIntegracionVO 
{

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo arreglo de bytes para definir la propiedad
	 * archivo.
	 */
	private byte[] ib_archivo;
    
    /**
	 * Atributo de instancia tipo entero para definir la propiedad cantidad hojas.
	 */
    private Integer ii_cantidadHojas;
    
    /**
	 * Atributo de instancia tipo Long para definir la propiedad codigo transaccion.
	 */
    private Long il_codigoTransaccion;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * estado.
	 */
    private String is_estado;
    
    /**
	 * Atributo de instancia tipo EntidadLogVO para definir la propiedad log.
	 */
    private EntidadLogVO iel_log;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * pin.
	 */
    private String is_pin;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * url.
	 */
    private String is_url;
    
	/**
	 * Obtiene el valor para la propiedad archivo.
	 *
	 * @return El valor de la propiedad archivo
	 */
	public byte[] getIb_archivo() {
		return ib_archivo;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad archivo.
	 *
	 * @param ab_archivo el nuevo valor para la propiedad archivo
	 */
	public void setIb_archivo(byte[] ab_archivo) {
		this.ib_archivo = ab_archivo;
	}
	
	/**
	 * Obtiene el valor para la propiedad cantidad hojas.
	 *
	 * @return El valor de la propiedad cantidad hojas
	 */
	public Integer getIi_cantidadHojas() {
		return ii_cantidadHojas;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad cantidad hojas.
	 *
	 * @param ai_cantidadHojas el nuevo valor para la propiedad cantidad hojas
	 */
	public void setIi_cantidadHojas(Integer ai_cantidadHojas) {
		this.ii_cantidadHojas = ai_cantidadHojas;
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
	 * Obtiene el valor para la propiedad log.
	 *
	 * @return El valor de la propiedad log
	 */
	public EntidadLogVO getIel_log() {
		return iel_log;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad log.
	 *
	 * @param ael_log el nuevo valor para la propiedad log
	 */
	public void setIel_log(EntidadLogVO ael_log) {
		this.iel_log = ael_log;
	}
	
	/**
	 * Obtiene el valor para la propiedad pin.
	 *
	 * @return El valor de la propiedad pin
	 */
	public String getIs_pin() {
		return is_pin;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad pin.
	 *
	 * @param as_pin el nuevo valor para la propiedad pin
	 */
	public void setIs_pin(String as_pin) {
		this.is_pin = as_pin;
	}
	
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.clientebus.vo.ClienteIntegracionVO#getIs_url()
	 */
	public String getIs_url() {
		return is_url;
	}
	
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.clientebus.vo.ClienteIntegracionVO#setIs_url(java.lang.String)
	 */
	public void setIs_url(String as_url) {
		this.is_url = as_url;
	}
}
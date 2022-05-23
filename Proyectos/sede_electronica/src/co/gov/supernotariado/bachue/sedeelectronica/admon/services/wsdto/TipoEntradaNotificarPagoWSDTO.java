/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: TipoEntradaNotificarPagoWSDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto
 * Nombre del elemento: TipoEntradaNotificarPagoWSDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto;

import java.math.BigDecimal;
import java.util.Date;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.GenericoDTO;

/**
 * Clase tipo objeto de transferencia de datos para web service (WSDTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y servicios web.
 * <br>
 * Contiene propiedades para representar los datos del objeto Tipo entrada
 * notificar pago.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoEntradaNotificarPagoWSDTO extends GenericoDTO {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo numero real/decimal de gran magnitud para definir
	 * la propiedad monto transaccion.
	 */
	private BigDecimal ibd_montoTransaccion;
    
    /**
	 * Atributo de instancia tipo fecha para definir la propiedad fecha bancaria.
	 */
    private Date id_fechaBancaria;
    
    /**
	 * Atributo de instancia tipo fecha para definir la propiedad fecha transaccion.
	 */
    private Date id_fechaTransaccion;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo entidad recaudadora.
	 */
    private String is_codigoEntidadRecaudadora;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo punto recaudo entidad.
	 */
    private String is_codigoPuntoRecaudoEntidad;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo tipo recaudo.
	 */
    private String is_codigoTipoRecaudo;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo transaccion recaudador.
	 */
    private String is_codigoTransaccionRecaudador;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * numero referencia bachue.
	 */
    private String is_numeroReferenciaBachue;
    
	/**
	 * Obtiene el valor para la propiedad monto transaccion.
	 *
	 * @return El valor de la propiedad monto transaccion
	 */
	public BigDecimal getIbd_montoTransaccion() {
		return ibd_montoTransaccion;
	}
	
	/**
	 * Obtiene el valor para la propiedad fecha bancaria.
	 *
	 * @return El valor de la propiedad fecha bancaria
	 */
	public Date getId_fechaBancaria() {
		return id_fechaBancaria;
	}
	
	/**
	 * Obtiene el valor para la propiedad fecha transaccion.
	 *
	 * @return El valor de la propiedad fecha transaccion
	 */
	public Date getId_fechaTransaccion() {
		return id_fechaTransaccion;
	}
	
	/**
	 * Obtiene el valor para la propiedad codigo entidad recaudadora.
	 *
	 * @return El valor de la propiedad codigo entidad recaudadora
	 */
	public String getIs_codigoEntidadRecaudadora() {
		return is_codigoEntidadRecaudadora;
	}
	
	/**
	 * Obtiene el valor para la propiedad codigo punto recaudo entidad.
	 *
	 * @return El valor de la propiedad codigo punto recaudo entidad
	 */
	public String getIs_codigoPuntoRecaudoEntidad() {
		return is_codigoPuntoRecaudoEntidad;
	}
	
	/**
	 * Obtiene el valor para la propiedad codigo tipo recaudo.
	 *
	 * @return El valor de la propiedad codigo tipo recaudo
	 */
	public String getIs_codigoTipoRecaudo() {
		return is_codigoTipoRecaudo;
	}
	
	/**
	 * Obtiene el valor para la propiedad codigo transaccion recaudador.
	 *
	 * @return El valor de la propiedad codigo transaccion recaudador
	 */
	public String getIs_codigoTransaccionRecaudador() {
		return is_codigoTransaccionRecaudador;
	}
	
	/**
	 * Obtiene el valor para la propiedad numero referencia bachue.
	 *
	 * @return El valor de la propiedad numero referencia bachue
	 */
	public String getIs_numeroReferenciaBachue() {
		return is_numeroReferenciaBachue;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad monto transaccion.
	 *
	 * @param abd_montoTransaccion el nuevo valor para la propiedad monto
	 *                             transaccion
	 */
	public void setIbd_montoTransaccion(BigDecimal abd_montoTransaccion) {
		this.ibd_montoTransaccion = abd_montoTransaccion;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad fecha bancaria.
	 *
	 * @param ad_fechaBancaria el nuevo valor para la propiedad fecha bancaria
	 */
	public void setId_fechaBancaria(Date ad_fechaBancaria) {
		this.id_fechaBancaria = ad_fechaBancaria;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad fecha transaccion.
	 *
	 * @param ad_fechaTransaccion el nuevo valor para la propiedad fecha transaccion
	 */
	public void setId_fechaTransaccion(Date ad_fechaTransaccion) {
		this.id_fechaTransaccion = ad_fechaTransaccion;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad codigo entidad recaudadora.
	 *
	 * @param as_codigoEntidadRecaudadora el nuevo valor para la propiedad codigo
	 *                                    entidad recaudadora
	 */
	public void setIs_codigoEntidadRecaudadora(String as_codigoEntidadRecaudadora) {
		this.is_codigoEntidadRecaudadora = as_codigoEntidadRecaudadora;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad codigo punto recaudo entidad.
	 *
	 * @param as_codigoPuntoRecaudoEntidad el nuevo valor para la propiedad codigo
	 *                                     punto recaudo entidad
	 */
	public void setIs_codigoPuntoRecaudoEntidad(String as_codigoPuntoRecaudoEntidad) {
		this.is_codigoPuntoRecaudoEntidad = as_codigoPuntoRecaudoEntidad;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad codigo tipo recaudo.
	 *
	 * @param as_codigoTipoRecaudo el nuevo valor para la propiedad codigo tipo
	 *                             recaudo
	 */
	public void setIs_codigoTipoRecaudo(String as_codigoTipoRecaudo) {
		this.is_codigoTipoRecaudo = as_codigoTipoRecaudo;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad codigo transaccion recaudador.
	 *
	 * @param as_codigoTransaccionRecaudador el nuevo valor para la propiedad codigo
	 *                                       transaccion recaudador
	 */
	public void setIs_codigoTransaccionRecaudador(String as_codigoTransaccionRecaudador) {
		this.is_codigoTransaccionRecaudador = as_codigoTransaccionRecaudador;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad numero referencia bachue.
	 *
	 * @param as_numeroReferenciaBachue el nuevo valor para la propiedad numero
	 *                                  referencia bachue
	 */
	public void setIs_numeroReferenciaBachue(String as_numeroReferenciaBachue) {
		this.is_numeroReferenciaBachue = as_numeroReferenciaBachue;
	}
}

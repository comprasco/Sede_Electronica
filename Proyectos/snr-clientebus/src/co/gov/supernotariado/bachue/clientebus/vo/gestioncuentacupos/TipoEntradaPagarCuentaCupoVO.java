/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: TipoEntradaPagarCuentaCupoVO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.vo.gestioncuentacupos
 * Nombre del elemento: TipoEntradaPagarCuentaCupoVO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.vo.gestioncuentacupos;

import java.math.BigDecimal;
import java.util.Date;

import co.gov.supernotariado.bachue.clientebus.vo.ClienteIntegracionVO;

/**
 * Clase tipo objeto de valores de servicios (VO). <br>
 * Permite pasar datos de entrada o devolver los resultados al invocar una
 * operacion de un servicio, <br>
 * consumida usando el cliente bus. <br>
 * Contiene propiedades para representar los datos de entrada/salida del objeto
 * Tipo entrada pagar cuenta cupo .
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoEntradaPagarCuentaCupoVO extends ClienteIntegracionVO{

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * modulo.
	 */
	private String is_modulo;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad id
	 * cuenta cupo.
	 */
    private String is_idCuentaCupo;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * correo electronico corporativo usuario.
	 */
    private String is_correoElectronicoCorporativoUsuario;
    
    /**
	 * Atributo de instancia tipo numero real/decimal de gran magnitud para definir
	 * la propiedad monto pago.
	 */
    private BigDecimal ibd_montoPago;
    
    /**
	 * Atributo de instancia tipo fecha para definir la propiedad fecha pago.
	 */
    private Date id_fechaPago;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * referencia pago.
	 */
    private String is_referenciaPago;
    
	/**
	 * Obtiene el valor para la propiedad modulo.
	 *
	 * @return El valor de la propiedad modulo
	 */
	public String getIs_modulo() {
		return is_modulo;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad modulo.
	 *
	 * @param as_modulo el nuevo valor para la propiedad modulo
	 */
	public void setIs_modulo(String as_modulo) {
		this.is_modulo = as_modulo;
	}
	
	/**
	 * Obtiene el valor para la propiedad id cuenta cupo.
	 *
	 * @return El valor de la propiedad id cuenta cupo
	 */
	public String getIs_idCuentaCupo() {
		return is_idCuentaCupo;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad id cuenta cupo.
	 *
	 * @param as_idCuentaCupo el nuevo valor para la propiedad id cuenta cupo
	 */
	public void setIs_idCuentaCupo(String as_idCuentaCupo) {
		this.is_idCuentaCupo = as_idCuentaCupo;
	}
	
	/**
	 * Obtiene el valor para la propiedad correo electronico corporativo usuario.
	 *
	 * @return El valor de la propiedad correo electronico corporativo usuario
	 */
	public String getIs_correoElectronicoCorporativoUsuario() {
		return is_correoElectronicoCorporativoUsuario;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad correo electronico corporativo
	 * usuario.
	 *
	 * @param as_correoElectronicoCorporativoUsuario el nuevo valor para la
	 *                                               propiedad correo electronico
	 *                                               corporativo usuario
	 */
	public void setIs_correoElectronicoCorporativoUsuario(String as_correoElectronicoCorporativoUsuario) {
		this.is_correoElectronicoCorporativoUsuario = as_correoElectronicoCorporativoUsuario;
	}
	
	/**
	 * Obtiene el valor para la propiedad monto pago.
	 *
	 * @return El valor de la propiedad monto pago
	 */
	public BigDecimal getIbd_montoPago() {
		return ibd_montoPago;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad monto pago.
	 *
	 * @param abd_montoPago el nuevo valor para la propiedad monto pago
	 */
	public void setIbd_montoPago(BigDecimal abd_montoPago) {
		this.ibd_montoPago = abd_montoPago;
	}
	
	/**
	 * Obtiene el valor para la propiedad fecha pago.
	 *
	 * @return El valor de la propiedad fecha pago
	 */
	public Date getId_fechaPago() {
		return id_fechaPago;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad fecha pago.
	 *
	 * @param ad_fechaPago el nuevo valor para la propiedad fecha pago
	 */
	public void setId_fechaPago(Date ad_fechaPago) {
		this.id_fechaPago = ad_fechaPago;
	}
	
	/**
	 * Obtiene el valor para la propiedad referencia pago.
	 *
	 * @return El valor de la propiedad referencia pago
	 */
	public String getIs_referenciaPago() {
		return is_referenciaPago;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad referencia pago.
	 *
	 * @param as_referenciaPago el nuevo valor para la propiedad referencia pago
	 */
	public void setIs_referenciaPago(String as_referenciaPago) {
		this.is_referenciaPago = as_referenciaPago;
	}
    
}

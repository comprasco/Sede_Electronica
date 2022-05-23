/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: TipoSalidaConsultarIDCuentaCupoVO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.vo.gestioncuentacupos
 * Nombre del elemento: TipoSalidaConsultarIDCuentaCupoVO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.vo.gestioncuentacupos;

import java.math.BigInteger;

import co.gov.supernotariado.bachue.clientebus.vo.ClienteIntegracionVO;

/**
 * Clase tipo objeto de valores de servicios (VO). <br>
 * Permite pasar datos de entrada o devolver los resultados al invocar una
 * operacion de un servicio, <br>
 * consumida usando el cliente bus. <br>
 * Contiene propiedades para representar los datos de entrada/salida del objeto
 * Tipo salida consultar ID cuenta cupo .
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoSalidaConsultarIDCuentaCupoVO extends ClienteIntegracionVO{

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad id.
	 */
	private String is_id;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * estado.
	 */
    private String is_estado;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * fecha creacion.
	 */
    private String is_fechaCreacion;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * valor minimo.
	 */
    private String is_valorMinimo;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * valor maximo.
	 */
    private String is_valorMaximo;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * saldo.
	 */
    private String is_saldo;
    
    /**
	 * Atributo de instancia tipo entero de gran magnitud para definir la propiedad
	 * codigo mensaje.
	 */
    private BigInteger ibi_codigoMensaje;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * descripcion mensaje.
	 */
    private String is_descripcionMensaje;
    
	/**
	 * Obtiene el valor para la propiedad id.
	 *
	 * @return El valor de la propiedad id
	 */
	public String getIs_id() {
		return is_id;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad id.
	 *
	 * @param as_id el nuevo valor para la propiedad id
	 */
	public void setIs_id(String as_id) {
		this.is_id = as_id;
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
	 * Obtiene el valor para la propiedad fecha creacion.
	 *
	 * @return El valor de la propiedad fecha creacion
	 */
	public String getIs_fechaCreacion() {
		return is_fechaCreacion;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad fecha creacion.
	 *
	 * @param as_fechaCreacion el nuevo valor para la propiedad fecha creacion
	 */
	public void setIs_fechaCreacion(String as_fechaCreacion) {
		this.is_fechaCreacion = as_fechaCreacion;
	}
	
	/**
	 * Obtiene el valor para la propiedad valor minimo.
	 *
	 * @return El valor de la propiedad valor minimo
	 */
	public String getIs_valorMinimo() {
		return is_valorMinimo;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad valor minimo.
	 *
	 * @param as_valorMinimo el nuevo valor para la propiedad valor minimo
	 */
	public void setIs_valorMinimo(String as_valorMinimo) {
		this.is_valorMinimo = as_valorMinimo;
	}
	
	/**
	 * Obtiene el valor para la propiedad valor maximo.
	 *
	 * @return El valor de la propiedad valor maximo
	 */
	public String getIs_valorMaximo() {
		return is_valorMaximo;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad valor maximo.
	 *
	 * @param as_valorMaximo el nuevo valor para la propiedad valor maximo
	 */
	public void setIs_valorMaximo(String as_valorMaximo) {
		this.is_valorMaximo = as_valorMaximo;
	}
	
	/**
	 * Obtiene el valor para la propiedad saldo.
	 *
	 * @return El valor de la propiedad saldo
	 */
	public String getIs_saldo() {
		return is_saldo;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad saldo.
	 *
	 * @param as_saldo el nuevo valor para la propiedad saldo
	 */
	public void setIs_saldo(String as_saldo) {
		this.is_saldo = as_saldo;
	}
	
	/**
	 * Obtiene el valor para la propiedad codigo mensaje.
	 *
	 * @return El valor de la propiedad codigo mensaje
	 */
	public BigInteger getIbi_codigoMensaje() {
		return ibi_codigoMensaje;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad codigo mensaje.
	 *
	 * @param abi_codigoMensaje el nuevo valor para la propiedad codigo mensaje
	 */
	public void setIbi_codigoMensaje(BigInteger abi_codigoMensaje) {
		this.ibi_codigoMensaje = abi_codigoMensaje;
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

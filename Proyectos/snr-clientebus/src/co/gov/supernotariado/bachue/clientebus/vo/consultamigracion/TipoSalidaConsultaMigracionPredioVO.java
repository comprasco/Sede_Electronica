/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: TipoSalidaConsultaMigracionPredioVO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.vo.consultamigracion
 * Nombre del elemento: TipoSalidaConsultaMigracionPredioVO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.vo.consultamigracion;

import java.math.BigInteger;

import co.gov.supernotariado.bachue.clientebus.vo.ClienteIntegracionVO;

/**
 * Clase tipo objeto de valores de servicios (VO). <br>
 * Permite pasar datos de entrada o devolver los resultados al invocar una
 * operacion de un servicio, <br>
 * consumida usando el cliente bus. <br>
 * Contiene propiedades para representar los datos de entrada/salida del objeto
 * Tipo salida consulta migracion predio .
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoSalidaConsultaMigracionPredioVO  extends ClienteIntegracionVO {
	
	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

    /**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad
	 * informacion migrada.
	 */
    private Boolean ib_informacionMigrada;
    
    /**
	 * Atributo de instancia tipo entero de gran magnitud para definir la propiedad
	 * codigo mensaje.
	 */
    private BigInteger ibi_codMensaje;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * descripcion mensaje.
	 */
    private String is_descripcionMensaje;
    
	/**
	 * Obtiene el valor para la propiedad informacion migrada.
	 *
	 * @return El valor de la propiedad informacion migrada
	 */
	public Boolean getIb_informacionMigrada() {
		return ib_informacionMigrada;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad informacion migrada.
	 *
	 * @param ab_informacionMigrada el nuevo valor para la propiedad informacion
	 *                              migrada
	 */
	public void setIb_informacionMigrada(Boolean ab_informacionMigrada) {
		this.ib_informacionMigrada = ab_informacionMigrada;
	}
	
	/**
	 * Obtiene el valor para la propiedad codigo mensaje.
	 *
	 * @return El valor de la propiedad codigo mensaje
	 */
	public BigInteger getIbi_codMensaje() {
		return ibi_codMensaje;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad codigo mensaje.
	 *
	 * @param abi_codMensaje el nuevo valor para la propiedad codigo mensaje
	 */
	public void setIbi_codMensaje(BigInteger abi_codMensaje) {
		this.ibi_codMensaje = abi_codMensaje;
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

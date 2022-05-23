/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: HistoricoTransaccionesDescartadasDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: HistoricoTransaccionesDescartadasDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Historico
 * transacciones descartadas.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class HistoricoTransaccionesDescartadasDTO extends GenericoBaseDTO {

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
	 * motivo.
	 */
	private String is_motivo;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * observaciones.
	 */
	private String is_observaciones;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * ultimo estado transaccion.
	 */
	private String is_ultimoEstadoTransaccion;

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
	 * Obtiene el valor para la propiedad motivo.
	 *
	 * @return El valor de la propiedad motivo
	 */
	public String getIs_motivo() {
		return is_motivo;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad motivo.
	 *
	 * @param as_motivo el nuevo valor para la propiedad motivo
	 */
	public void setIs_motivo(String as_motivo) {
		this.is_motivo = as_motivo;
	}

	/**
	 * Obtiene el valor para la propiedad observaciones.
	 *
	 * @return El valor de la propiedad observaciones
	 */
	public String getIs_observaciones() {
		return is_observaciones;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad observaciones.
	 *
	 * @param as_observaciones el nuevo valor para la propiedad observaciones
	 */
	public void setIs_observaciones(String as_observaciones) {
		this.is_observaciones = as_observaciones;
	}

	/**
	 * Obtiene el valor para la propiedad ultimo estado transaccion.
	 *
	 * @return El valor de la propiedad ultimo estado transaccion
	 */
	public String getIs_ultimoEstadoTransaccion() {
		return is_ultimoEstadoTransaccion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad ultimo estado transaccion.
	 *
	 * @param as_ultimoEstadoTransaccion el nuevo valor para la propiedad ultimo
	 *                                   estado transaccion
	 */
	public void setIs_ultimoEstadoTransaccion(String as_ultimoEstadoTransaccion) {
		this.is_ultimoEstadoTransaccion = as_ultimoEstadoTransaccion;
	}

}
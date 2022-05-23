/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ServicioLiquidacionSalidaWSDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto
 * Nombre del elemento: ServicioLiquidacionSalidaWSDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto;

import java.math.BigDecimal;
import java.math.BigInteger;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.GenericoDTO;

/**
 * Clase tipo objeto de transferencia de datos para web service (WSDTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y servicios web.
 * <br>
 * Contiene propiedades para representar los datos del objeto Servicio
 * liquidacion salida.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ServicioLiquidacionSalidaWSDTO extends GenericoDTO{

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * tipo servicio.
	 */
	private String is_tipoServicio;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * subtipo servicio.
	 */
	private String is_subtipoServicio;
	
	/**
	 * Atributo de instancia tipo entero de gran magnitud para definir la propiedad
	 * cantidad solicitada.
	 */
	private BigInteger ibi_cantidadSolicitada;
	
	/**
	 * Atributo de instancia tipo numero real/decimal de gran magnitud para definir
	 * la propiedad valor individual.
	 */
	private BigDecimal ibd_valorIndividual;
	
	/**
	 * Atributo de instancia tipo numero real/decimal de gran magnitud para definir
	 * la propiedad valor servicio.
	 */
	private BigDecimal ibd_valorServicio;

	/**
	 * Obtiene el valor para la propiedad tipo servicio.
	 *
	 * @return El valor de la propiedad tipo servicio
	 */
	public String getIs_tipoServicio() {
		return is_tipoServicio;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad tipo servicio.
	 *
	 * @param as_tipoServicio el nuevo valor para la propiedad tipo servicio
	 */
	public void setIs_tipoServicio(String as_tipoServicio) {
		this.is_tipoServicio = as_tipoServicio;
	}
	
	/**
	 * Obtiene el valor para la propiedad subtipo servicio.
	 *
	 * @return El valor de la propiedad subtipo servicio
	 */
	public String getIs_subtipoServicio() {
		return is_subtipoServicio;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad subtipo servicio.
	 *
	 * @param as_subtipoServicio el nuevo valor para la propiedad subtipo servicio
	 */
	public void setIs_subtipoServicio(String as_subtipoServicio) {
		this.is_subtipoServicio = as_subtipoServicio;
	}
	
	/**
	 * Obtiene el valor para la propiedad cantidad solicitada.
	 *
	 * @return El valor de la propiedad cantidad solicitada
	 */
	public BigInteger getIbi_cantidadSolicitada() {
		return ibi_cantidadSolicitada;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad cantidad solicitada.
	 *
	 * @param abi_cantidadSolicitada el nuevo valor para la propiedad cantidad
	 *                               solicitada
	 */
	public void setIbi_cantidadSolicitada(BigInteger abi_cantidadSolicitada) {
		this.ibi_cantidadSolicitada = abi_cantidadSolicitada;
	}
	
	/**
	 * Obtiene el valor para la propiedad valor individual.
	 *
	 * @return El valor de la propiedad valor individual
	 */
	public BigDecimal getIbd_valorIndividual() {
		return ibd_valorIndividual;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad valor individual.
	 *
	 * @param abd_valorIndividual el nuevo valor para la propiedad valor individual
	 */
	public void setIbd_valorIndividual(BigDecimal abd_valorIndividual) {
		this.ibd_valorIndividual = abd_valorIndividual;
	}
	
	/**
	 * Obtiene el valor para la propiedad valor servicio.
	 *
	 * @return El valor de la propiedad valor servicio
	 */
	public BigDecimal getIbd_valorServicio() {
		return ibd_valorServicio;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad valor servicio.
	 *
	 * @param abd_valorServicio el nuevo valor para la propiedad valor servicio
	 */
	public void setIbd_valorServicio(BigDecimal abd_valorServicio) {
		this.ibd_valorServicio = abd_valorServicio;
	}
}

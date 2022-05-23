/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: TipoEntradaConsultarDetalleSolicitudVO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.vo.consultarhistorialsolicitudespagadas
 * Nombre del elemento: TipoEntradaConsultarDetalleSolicitudVO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.vo.consultarhistorialsolicitudespagadas;

import co.gov.supernotariado.bachue.clientebus.vo.ClienteIntegracionVO;

/**
 * Clase tipo objeto de valores de servicios (VO). <br>
 * Permite pasar datos de entrada o devolver los resultados al invocar una
 * operacion de un servicio, <br>
 * consumida usando el cliente bus. <br>
 * Contiene propiedades para representar los datos de entrada/salida del objeto
 * Tipo entrada consultar detalle solicitud .
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoEntradaConsultarDetalleSolicitudVO extends ClienteIntegracionVO 
{

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
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nir.
	 */
	private String is_nir;
	
	/**
	 * Atributo de instancia tipo SolicitanteDetalleVO para definir la propiedad
	 * solicitante detalle.
	 */
	private SolicitanteDetalleVO isd_solicitanteDetalle;
	
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
	 * Obtiene el valor para la propiedad solicitante detalle.
	 *
	 * @return El valor de la propiedad solicitante detalle
	 */
	public SolicitanteDetalleVO getIsd_solicitanteDetalle() {
		return isd_solicitanteDetalle;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad solicitante detalle.
	 *
	 * @param asd_solicitanteDetalle el nuevo valor para la propiedad solicitante
	 *                               detalle
	 */
	public void setIsd_solicitanteDetalle(SolicitanteDetalleVO asd_solicitanteDetalle) {
		this.isd_solicitanteDetalle = asd_solicitanteDetalle;
	}
}
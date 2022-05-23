/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: IEntregaProductoBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless
 * Nombre del elemento: IEntregaProductoBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaObtenerProductoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaObtenerReciboCajaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaObtenerTurnosRefPagoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaVerificarProductoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaObtenerProductoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaObtenerReciboCajaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaObtenerTurnosRefPagoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaVerificarProductoWSDTO;

/**
 * Interface de la capa de negocio. <br>
 * Contiene las definiciones logicas para consumir operaciones del servicio
 * Entrega producto. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface IEntregaProductoBusiness {

	
	/**
	 * Metodo que llama al proceso obtenerTurnoRefPago del servicio entregaProducto.
	 *
	 * @param ateotrp_tipoEntradaObtenerTurnosRefPagoWsDto datos para consumir el
	 *                                                     servicio
	 * @return Resultado para obtener turnos ref pago retornado como
	 *         TipoSalidaObtenerTurnosRefPagoWSDTO
	 */	
	public TipoSalidaObtenerTurnosRefPagoWSDTO obtenerTurnosRefPago(TipoEntradaObtenerTurnosRefPagoWSDTO ateotrp_tipoEntradaObtenerTurnosRefPagoWsDto);
	
	/**
	 * Metodo que llama al proceso verificarProducto del servicio entregaProducto.
	 *
	 * @param atevp_tipoEntradaVerificarProdcutoWsDto datos para consumir el
	 *                                                servicio
	 * @return Resultado para verificar producto retornado como
	 *         TipoSalidaVerificarProductoWSDTO
	 */
	public TipoSalidaVerificarProductoWSDTO verificarProducto(TipoEntradaVerificarProductoWSDTO atevp_tipoEntradaVerificarProdcutoWsDto);

	/**
	 * Metodo que llama al servicio de obtener producto del servicio entrega
	 * producto.
	 *
	 * @param ateop_tipoEntradaObtenerProductoWsDto el parametro tipo entrada
	 *                                              obtener producto ws dto
	 * @return Resultado para obtener producto retornado como
	 *         TipoSalidaObtenerProductoWSDTO
	 */
	public TipoSalidaObtenerProductoWSDTO obtenerProducto(TipoEntradaObtenerProductoWSDTO ateop_tipoEntradaObtenerProductoWsDto);
	
	/**
	 * Metodo que permite generar recibo de pago.
	 *
	 * @param ateorc_tipoEntradaObtenerReciboCajaWsDto el parametro tipo entrada
	 *                                                 obtener recibo caja ws dto
	 * @return Resultado para obtener recibo caja retornado como
	 *         TipoSalidaObtenerReciboCajaWSDTO
	 */
	public TipoSalidaObtenerReciboCajaWSDTO obtenerReciboCaja(TipoEntradaObtenerReciboCajaWSDTO ateorc_tipoEntradaObtenerReciboCajaWsDto);
}

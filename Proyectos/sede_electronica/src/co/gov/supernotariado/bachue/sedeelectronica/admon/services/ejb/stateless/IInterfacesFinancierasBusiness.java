/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: IInterfacesFinancierasBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless
 * Nombre del elemento: IInterfacesFinancierasBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless;

import java.math.BigDecimal;
import java.util.List;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.PersonaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.EstadoLiquidacionSalidaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.NotificacionPagoSalidaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.ObtenerPdfLiquidacionSalidaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaGenerarLiquidacionWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaNotificarPagoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaObtenerPDFLiquidacionWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarTarifaServicioWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaGenerarLiquidacionWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoServicioCTSIWSDTO;

/**
 * Interface de la capa de negocio. <br>
 * Contiene las definiciones logicas para consumir operaciones del servicio
 * Interfaces financieras. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface IInterfacesFinancierasBusiness {	

	/**
	 * Metodo que consume en el servicio web de interfaces financieras el metodo de
	 * consultarEstadoLiquidacion.
	 *
	 * @param abd_montoTransaccion valor de la transaccion
	 * @param as_numeroReferencia  numero de la referencia de pago de la transaccion
	 * @return EstadoLiquidacionSalidaWSDTO objeto wsdto con el resultado del estado
	 *         de la liquidacion
	 */
	public EstadoLiquidacionSalidaWSDTO consultarEstadoLiquidacion(BigDecimal abd_montoTransaccion, String as_numeroReferencia);

	/**
	 * Metodo que consume en el servicio web de interfaces financieras el metodo de
	 * consultarTarifaServicio.
	 *
	 * @param alts_listaServicioTarifaWsDto lista objeto Vo con los datos para el
	 *                                      consumo del servicio
	 * @param ap_persona                    el parametro persona
	 * @return TipoSalidaConsultarTarifaServicioWSDTO objeto wsdto con el resultado
	 *         de la consulta de la tarifa del servicio
	 */
	public TipoSalidaConsultarTarifaServicioWSDTO consultarTarifaServicio(List<TipoServicioCTSIWSDTO> alts_listaServicioTarifaWsDto,PersonaDTO ap_persona);

	/**
	 * Metodo que consume en el servicio web de interfaces financieras el metodo de
	 * generarLiquidacion.
	 *
	 * @param ategl_tipoEntradaGenerarLiquidacionWsDto objeto Vo con los datos para
	 *                                                 el consumo del servicio
	 * @return TipoSalidaGenerarLiquidacionWSDTO objeto wsdto con el resultado de
	 *         generar la liquidacion
	 */
	public TipoSalidaGenerarLiquidacionWSDTO generarLiquidacion(TipoEntradaGenerarLiquidacionWSDTO ategl_tipoEntradaGenerarLiquidacionWsDto);

	/**
	 * Metodo que consume en el servicio web de interfaces financieras el metodo de
	 * notificarPago.
	 *
	 * @param atenp_tipoEntradaNotificacionPagoWsDto objeto Vo con los datos para el
	 *                                               consumo del servicio
	 * @return NotificacionPagoSalidaWSDTO objeto wsdto con el resultado de la
	 *         notificacion del pago
	 */
	public NotificacionPagoSalidaWSDTO notificarPago(TipoEntradaNotificarPagoWSDTO atenp_tipoEntradaNotificacionPagoWsDto);

	/**
	 * Metodo que consume en el servicio web de interfaces financieras el metodo de
	 * obtenerPDFLiquidacion.
	 *
	 * @param ateopl_obtenerPdfLiquidacionEntradaWsDto objeto Vo con los datos para
	 *                                                 el consumo del servicio
	 * @return ObtenerPdfLiquidacionSalidaWSDTO objeto wsdto con el resultado de
	 *         obtener el pdf, si fue exitoso en el arreglo de bit estara para
	 *         generar el archivo para pago
	 */
	public ObtenerPdfLiquidacionSalidaWSDTO obtenerPDFLiquidacion(TipoEntradaObtenerPDFLiquidacionWSDTO ateopl_obtenerPdfLiquidacionEntradaWsDto);

}

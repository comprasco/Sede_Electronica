/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: IInterfazTrazabilidadBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless
 * Nombre del elemento: IInterfazTrazabilidadBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultaActosTurnoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultaDetalleCertificadoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaTrazabilidadTramiteRegistroNodoCentralWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultaActosTurnoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultaDetalleCertificadoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaTrazabilidadTramiteRegistroNodoCentralWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TrazabilidadEntradaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TrazabilidadSalidaWSDTO;

/**
 * Interface de la capa de negocio. <br>
 * Contiene las definiciones logicas para consumir operaciones del servicio
 * Interfaz trazabilidad. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface IInterfazTrazabilidadBusiness {

	/**
	 * Metodo que permite consultar la trazabilidad en el sistema.
	 *
	 * @param ate_trazabilidadEntradaWsDto valores de entrada
	 * @return TrazabilidadSalidaWSDTO con la trazabilidad de respuesta
	 */
	public TrazabilidadSalidaWSDTO consultarTrazabilidad(TrazabilidadEntradaWSDTO ate_trazabilidadEntradaWsDto);

	/**
	 * Metodo que permite consultar la trazabilidad en el sistema Nodo Central.
	 *
	 * @param atettrnc_tipoEntradaTrazabilidadTramiteRegistroNodoCentralWsDto el
	 *                                                                        parametro
	 *                                                                        tipo
	 *                                                                        entrada
	 *                                                                        trazabilidad
	 *                                                                        tramite
	 *                                                                        registro
	 *                                                                        nodo
	 *                                                                        central
	 *                                                                        ws dto
	 * @return TipoSalidaTrazabilidadTramiteRegistroNodoCentralWSDTO con la
	 *         trazabilidad de respuesta
	 */
	public TipoSalidaTrazabilidadTramiteRegistroNodoCentralWSDTO consultarTrazabilidadNoc(
			TipoEntradaTrazabilidadTramiteRegistroNodoCentralWSDTO atettrnc_tipoEntradaTrazabilidadTramiteRegistroNodoCentralWsDto);

	/**
	 * Metodo que permite consultar el acto turno.
	 *
	 * @param atecat_tipoEntradaConsultaActosTurnoWsDto el
	 *                                                                        parametro
	 *                                                                        tipo
	 *                                                                        entrada
	 *                                                                        consulta
	 *                                                                        actos
	 *                                                                        turno
	 *                                                                        
	 * @return TipoEntradaConsultaActosTurnoWSDTO con la
	 *         trazabilidad de respuesta
	 */
	public TipoSalidaConsultaActosTurnoWSDTO consultaActosTurno(
			TipoEntradaConsultaActosTurnoWSDTO atecat_tipoEntradaConsultaActosTurnoWsDto);

	
	/**
	 * Metodo que permite consultar el acto turno.
	 *
	 * @param atecdc_tipoEntradaConsultaDetalleCertificado el
	 *                                                                        parametro
	 *                                                                        tipo
	 *                                                                        entrada
	 *                                                                        consulta
	 *                                                                        detalle
	 *                                                                        certificado
	 *                                                                        
	 * @return TipoSalidaConsultaDetalleCertificadoWSDTO con la
	 *         trazabilidad de respuesta
	 */
	TipoSalidaConsultaDetalleCertificadoWSDTO consultaDetalleCertificado(
			TipoEntradaConsultaDetalleCertificadoWSDTO atecdc_tipoEntradaConsultaDetalleCertificado);
}

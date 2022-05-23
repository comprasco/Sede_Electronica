/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ISeguimientoSolicitudesBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless
 * Nombre del elemento: ISeguimientoSolicitudesBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.SeguimientoSolicitudesDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaTrazabilidadTramiteRegistroNodoCentralWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TrazabilidadEntradaWSDTO;

/**
 * Interface de la capa de negocio. <br>
 * Permite definir las operaciones requeridas del recurso Seguimiento
 * solicitudes.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface ISeguimientoSolicitudesBusiness {

	/**
	 * Metodo que consulta el servicio y carga los datos relacionados.
	 *
	 * @param ate_trazabilidadEntradaWsdto datos a consultar en el servicio
	 * @return Resultado para cargar lista consultas retornado como
	 *         SeguimientoSolicitudesDTO, listas con las respuestas por parte del
	 *         servicio.
	 */
	public SeguimientoSolicitudesDTO cargarListaConsultas(TrazabilidadEntradaWSDTO ate_trazabilidadEntradaWsdto);

	/**
	 * Metodo que se encarga de consultar trazabilidad en el Nodo Central.
	 *
	 * @param as_codigoRegistral el parametro codigo registral
	 * @param as_radicado        el parametro radicado
	 * @return Resultado para consultas noc retornado como
	 *         TipoSalidaTrazabilidadTramiteRegistroNodoCentralWSDTO
	 */
	public TipoSalidaTrazabilidadTramiteRegistroNodoCentralWSDTO consultasNoc(String as_codigoRegistral,
			String as_radicado);

}

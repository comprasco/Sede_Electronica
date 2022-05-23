/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ICorreccionesBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless
 * Nombre del elemento: ICorreccionesBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless;

import java.util.List;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CorreccionDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TipoCorreccionDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionCorreccionDTO;

/**
 * Interface de la capa de negocio. <br>
 * Permite definir las operaciones requeridas del recurso Correcciones.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface ICorreccionesBusiness extends IGenericoTransaccionModeloBusiness{

	/**
	 * Metodo de consultar los servicios para consultar datos del predio.
	 *
	 * @param ac_correccionDto informacion del predio a consultar
	 * @return CorreccionDTO dto con los datos consultados y su respuesta
	 */
	public CorreccionDTO consultarDatosPredio(CorreccionDTO ac_correccionDto);

	/**
	 * Metodo que se encarga de consumir el servicio de generar solicitud sin costo.
	 *
	 * @param atc_transaccionCorreccionDto datos de la transaccion a generar la
	 *                                     solicitud de correccion
	 * @return String Nir de la solicitud
	 */
	public String generarSolicitudCorreccion(TransaccionCorreccionDTO atc_transaccionCorreccionDto);

	/**
	 * Metodo que consulta la transaccion vigente.
	 *
	 * @param atc_transaccionCorreccionDto datos de la transaccion
	 * @return Resultado para consultar transaccion vigente retornado como
	 *         TransaccionCorreccionDTO
	 */
	public TransaccionCorreccionDTO consultarTransaccionVigente(TransaccionCorreccionDTO atc_transaccionCorreccionDto);

	/**
	 * Metodo que se encarga de eliminar la Transaccion de correccion.
	 *
	 * @param atc_transaccionCorreccionDto transaccion a eliminar
	 * @return Resultado para eliminar transaccion retornado como
	 *         TransaccionCorreccionDTO con una nueva transaccion
	 */
	public TransaccionCorreccionDTO eliminarTransaccion(TransaccionCorreccionDTO atc_transaccionCorreccionDto);

	/**
	 * Metodo que se encarga de consultar los tipos causales de correccion.
	 *
	 * @return Resultado para cargar tipo correcciones retornado como una lista de
	 *         TipoCorreccionDTO
	 */
	public List<TipoCorreccionDTO> cargarTipoCorrecciones();

}

/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: IServicioIntegracionBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless
 * Nombre del elemento: IServicioIntegracionBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless;

import java.util.List;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ServicioIntegracionBooleanoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ServicioIntegracionDTO;

/**
 * Interface de la capa de negocio. <br>
 * Permite definir las operaciones requeridas del recurso Servicio integracion.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface IServicioIntegracionBusiness {

	/**
	 * Metodo que permite consultar servicio de integracion.
	 *
	 * @param as_nombreServicioIntegracion nombre del servicio de integracion
	 * @return Resultado para consultar servicio integracion retornado como
	 *         ServicioIntegracionDTO
	 */
	public ServicioIntegracionDTO consultarServicioIntegracion(String as_nombreServicioIntegracion);

	/**
	 * Metodo que permite consultar todos los servicios de integracion activos.
	 *
	 * @return Resultado para consultar servicios integraciones retornado como una
	 *         lista de ServicioIntegracionBooleanoDTO
	 */
	public List<ServicioIntegracionBooleanoDTO> consultarServiciosIntegraciones();

	/**
	 * Metodo que se encarga de actualizar un servicio de integracion.
	 *
	 * @param asib_servicioIntegracionBooleanoDto el parametro servicio integracion
	 *                                            booleano dto
	 * @return true, si se cumple o la accion se realiza exitosamente, false en caso
	 *         contrario.
	 */
	public boolean editarServicio(ServicioIntegracionBooleanoDTO asib_servicioIntegracionBooleanoDto);

}

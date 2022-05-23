/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: IServicioIntegracionDAO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless
 * Nombre del elemento: IServicioIntegracionDAO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless;

import java.util.List;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.ServicioIntegracion;

/**
 * Interface para definir operaciones sobre objetos de acceso a datos (DAO) <br>
 * Define operaciones para manipular el modelo de datos Servicio integracion.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface IServicioIntegracionDAO {

	/**
	 * Metodo que permite consultar servicio integracion por su respectivo nombre.
	 *
	 * @param as_nombre nombre del servicio de integracion
	 * @return Servicio de integracion, modelo de persistencia
	 */
	public ServicioIntegracion consultarServicioIntegracion(String as_nombre);

	/**
	 * Metodo que permite consultar todos los servicios de integracion en la base de
	 * datos.
	 *
	 * @return Lista de ServicioIntegracion
	 */
	public List<ServicioIntegracion> consultarServiciosIntegraciones();
	
	/**
	 * Metodo que permite actualizar un servicio de integracion.
	 *
	 * @param asi_servicioIntegracion el parametro servicio integracion
	 * @return Lista de ServicioIntegracion
	 */
	public boolean actualizarServicioIntegracion(ServicioIntegracion asi_servicioIntegracion);

}

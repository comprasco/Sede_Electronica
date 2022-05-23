/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ITipoEstadoCuentaBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless
 * Nombre del elemento: ITipoEstadoCuentaBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless;

import java.util.List;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TipoEstadoCuentaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.TipoEstadoCuenta;

/**
 * Interface de la capa de negocio. <br>
 * Permite definir las operaciones requeridas del recurso Tipo estado cuenta.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface ITipoEstadoCuentaBusiness {

	/**
	 * Metodo que permite crear el objeto a una Entidad asociada a la capa DAO.
	 *
	 * @param atec_tipoEstadoCuentaDto el parametro tipo estado cuenta dto
	 * @return true si la operacion se realiza exitosamente.
	 */
	public Boolean crearTipoEstadoCuenta(TipoEstadoCuentaDTO atec_tipoEstadoCuentaDto);

	/**
	 * Metodo que permite actualizar el tipo de estado cuenta cache.
	 */
	public void actualizarTipoEstadoCuentaCache();

	/**
	 * Metodo que permite consultar todos los tipos de cuenta.
	 * 
	 * @return Lista de TipoEstadoCuentaDTO, lista de tipos estado cuenta DTOs
	 */
	public List<TipoEstadoCuentaDTO> consultarTipoEstadoCuenta();

	/**
	 * Metodo que permite consultar todos los tipos de cuenta.
	 *
	 * @param as_tiposEstadoCuenta el parametro tipos estado cuenta
	 * @return Resultado para consultar tipo estado cuenta retornado como
	 *         TipoEstadoCuentaDTO
	 */
	public TipoEstadoCuentaDTO consultarTipoEstadoCuenta(String as_tiposEstadoCuenta);

	/**
	 * Metodo que permite actualizar todos los tipos de estado cuenta existentes en
	 * cache asignandole directamente una lista de tipos de estado cuenta.
	 *
	 * @param altec_tipoEstadoCuenta el parametro tipo estado cuenta
	 */
	public void actualizarTipoEstadoCuentaCache(List<TipoEstadoCuenta> altec_tipoEstadoCuenta);
}

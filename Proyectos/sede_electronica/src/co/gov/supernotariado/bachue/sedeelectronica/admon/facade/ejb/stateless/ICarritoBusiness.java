/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ICarritoBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless
 * Nombre del elemento: ICarritoBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless;

import java.util.List;
import java.util.Map;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CarritoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CarritoTransaccionVigenteDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.interfaces.ITransaccionDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoProceso;

/**
 * Interface de la capa de negocio. <br>
 * Permite definir las operaciones requeridas del recurso Carrito.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface ICarritoBusiness {

	/**
	 * Metodo que permite crear el objeto a una Entidad asociada a la capa DAO.
	 * 
	 * @param ac_carritoDto DTO Carrito a convertir.
	 * @return true si la operacion se realiza exitosamente.
	 */
	public Boolean guardarCarrito(CarritoDTO ac_carritoDto);

	/**
	 * Metodo que se encarga de buscar si existe una transaccion .
	 *
	 * @param ac_carritoDto datos para consultar si existe transaccion vigente
	 * @return CarritoDTO si existe una transaccion
	 */
	public CarritoDTO consultarTransaccion(CarritoDTO ac_carritoDto);

	/**
	 * Metodo que se encarga de buscar si existe una transaccion guardada sin
	 * liquidar de ese subservicio activa.
	 *
	 * @param ac_carritoDto datos para consultar si existe transaccion vigente
	 * @return CarritoDTO si existe una transaccion vigente o null si no encuentra
	 *         nada
	 */
	public CarritoDTO consultarTransaccionVigente(CarritoDTO ac_carritoDto);

	/**
	 * Metodo que consulta en base de datos un carrito por codigo.
	 *
	 * @param as_idCarrito codigo de carrito a consultar
	 * @return CarritoDTO carrito que se encontro
	 */
	public CarritoTransaccionVigenteDTO consultarTransaccionVigente(String as_idCarrito);
	
	/**
	 * Metodo que se encarga de consultar todas las transacciones vigentes del
	 * usuario logueado agrupado por tipo de servicio.
	 *
	 * @return Map con llave String y valor lista de CarritoDTO, si existen transacciones vigentes para
	 *         un usuario agrupado por el tipo de servicio
	 */
	public Map<String, List<CarritoTransaccionVigenteDTO>> consultarTransacciones();
	
	/**
	 * Metodo que permite cancelar el objeto a una Entidad asociada a la capa DAO.
	 *
	 * @param ait_transaccionDto el parametro transaccion dto
	 * @param aetp_enumTipo      el parametro enum tipo
	 * @return true si la operacion se realiza exitosamente.
	 */
	public Boolean cancelarCarrito(ITransaccionDTO ait_transaccionDto,EnumTipoProceso aetp_enumTipo);

	/**
	 * Metodo que permite eliminar el objeto a una Entidad asociada a la capa DAO.
	 * 
	 * @param ac_carritoDto DTO Carrito a eliminar.
	 * @return true si la operacion se realiza exitosamente.
	 */
	public Boolean eliminarCarrito(CarritoDTO ac_carritoDto);

	/**
	 * Metodo que permite retornar el numero de transacciones vigentes.
	 *
	 * @return int numero de transacciones vigentes.
	 */
	public int consultarNumeroTransaccionesVigentes();

	/**
	 * Metodo que se encarga de modificar los datos de la transaccion actual.
	 *
	 * @param ait_transaccionDto los datos de la transaccon actual
	 * @param aetp_enumTipo      el parametro enum tipo
	 * @return true si guardo la transaccion exitosamente
	 */
	public Boolean guardarTransaccionVigente(ITransaccionDTO ait_transaccionDto, EnumTipoProceso aetp_enumTipo);

	/**
	 * Metodo que consulta una transaccion Vigente segun los parametros de la
	 * transaccion.
	 *
	 * @param ait_transaccionDto transacccion que va a consultar
	 * @return ITransaccionDTO con los datos de la transaccion encontrada
	 */
	public ITransaccionDTO consultarTransaccionVigente(ITransaccionDTO ait_transaccionDto);

	/**
	 * Metodo que pone los datos de transaccion iniciales.
	 *
	 * @param ait_transaccionDto transaccion con los parametros del tipoServicio y
	 *                           subServicio
	 * @return ITransaccionDTO transaccion generada
	 */
	public ITransaccionDTO iniciarTransaccion(ITransaccionDTO ait_transaccionDto);

	/**
	 * Metodo que consulta el carrito por la url .
	 *
	 * @param as_idCarrito url del carrito
	 * @return CarritoDTO con los datos del carrito encontrado
	 */
	public CarritoDTO consultarCarrito(String as_idCarrito);
	
	
	/**
	 * Metodo que permite eliminar elementos del carrito con fecha de modificacion
	 * superior a un determinado numerod e dias.
	 *
	 * @param ai_cantidadDias el parametro cantidad dias
	 * @return true si la operacion se realiza exitosamente.
	 */
	public Boolean eliminarCarritoMasivo(Integer ai_cantidadDias);
}

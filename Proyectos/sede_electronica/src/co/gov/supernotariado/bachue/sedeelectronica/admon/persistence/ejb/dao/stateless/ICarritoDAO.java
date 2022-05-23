/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ICarritoDAO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless
 * Nombre del elemento: ICarritoDAO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless;

import java.util.Date;
import java.util.List;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Carrito;

/**
 * Interface para definir operaciones sobre objetos de acceso a datos (DAO) <br>
 * Define operaciones para manipular el modelo de datos Carrito.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface ICarritoDAO {

	/**
	 * Metodo que permite crear carrito en la base de datos.
	 * 
	 * @param ac_carrito Entidad Carrito a crear en la base de datos.
	 * @return true si se almacena exitosamente el carrito.
	 */
	public Boolean crearCarrito(Carrito ac_carrito);

	/**
	 * Metodo que busca en base de datos una transaccion vigente .
	 *
	 * @param ac_carrito datos para consultar si existe en base de datos
	 * @return Carrito si existe una transaccion vigente o un null
	 */
	public Carrito consultarTransacionVigente(Carrito ac_carrito);

	/**
	 * Metodo que consulta un carrito por codigo en base de datos.
	 *
	 * @param as_carrito id de carrito a buscar en base de datos
	 * @return Carrito encontrado en base de datos
	 */
	public Carrito consultarTransacionVigente(String as_carrito);

	/**
	 * Metodo que busca en base de datos una transaccion .
	 *
	 * @param ac_carrito datos para consultar si existe en base de datos
	 * @return Carrito si existe una transaccion
	 */
	public Carrito consultarTransacion(Carrito ac_carrito);

	/**
	 * Metodo que se encarga de actualizar una transaccion en base de datos.
	 *
	 * @param ac_carrito datos con los que se actualizara en base de datos
	 * @return Boolean si se actualiza correctamente
	 */
	public Boolean actualizarCarrito(Carrito ac_carrito);

	/**
	 * Metodo que consulta las transacciones vigentes de un usuario en base de
	 * datos.
	 *
	 * @param as_idUsuario el parametro id usuario
	 * @return Lista de Carrito, lista de transacciones vigentes del usuario
	 */
	public List<Carrito> consultarTransaciones(String as_idUsuario);

	/**
	 * Metodo que permite eliminar una Entidad en la base de datos.
	 * 
	 * @param ac_carrito Carrito a eliminar.
	 * @return true si la operacion se realiza exitosamente.
	 */
	public Boolean eliminarCarrito(Carrito ac_carrito);

	/**
	 * Metodo que permite retornar el numero de transacciones vigentes.
	 *
	 * @param as_idUsuario el parametro id usuario
	 * @return int numero de transacciones vigentes.
	 */
	public int consultarNumeroTransacionesVigentes(String as_idUsuario);

	/**
	 * Metodo que permite eliminar todas las fechas superiores a la ingresada.
	 *
	 * @param ad_fechaLimite fecha limite
	 * @return estado booleano de la ransaccion
	 */
	public Boolean eliminarCarritoMasivo(Date ad_fechaLimite);
	
	// Consultas cuando tiene estereotipo
	
	/**
	 * Metodo que busca en base de datos una transaccion si tiene asociacion.
	 *
	 * @param ac_carrito datos para consultar si existe en base de datos
	 * @return Carrito si existe una transaccion
	 */
	public Carrito consultarTransacionConAsociacion(Carrito ac_carrito);
	
	/**
	 * Metodo que busca en base de datos una transaccion vigente si tiene una
	 * asociacion.
	 *
	 * @param ac_carrito datos para consultar si existe en base de datos
	 * @return Carrito si existe una transaccion vigente o un null
	 */
	public Carrito consultarTransacionVigenteConAsociacion(Carrito ac_carrito);
	
	/**
	 * Metodo que permite retornar el numero de transacciones vigentes de un
	 * asociado.
	 *
	 * @param as_idUsuario    el parametro id usuario
	 * @param as_idAsociacion id de la asociacion
	 * @return int numero de transacciones vigentes.
	 */
	public int consultarNumeroTransacionesVigentesConAsociacion(String as_idUsuario,String as_idAsociacion);
	
	/**
	 * Metodo que consulta las transacciones vigentes de un usuario asociado en base
	 * de datos.
	 *
	 * @param as_idUsuario    Usuario del que se le va a sacar las transacciones
	 * @param as_idAsociacion id de la asociacion
	 * @return Lista de Carrito lista de transacciones vigentes del usuario
	 */
	public List<Carrito> consultarTransacionesConAsociacion(String as_idUsuario,String as_idAsociacion);
}

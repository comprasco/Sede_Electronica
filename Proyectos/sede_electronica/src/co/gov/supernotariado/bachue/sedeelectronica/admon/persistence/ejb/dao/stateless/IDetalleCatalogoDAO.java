/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: IDetalleCatalogoDAO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless
 * Nombre del elemento: IDetalleCatalogoDAO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless;

import java.util.List;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Catalogo;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.DetalleCatalogo;

/**
 * Interface para definir operaciones sobre objetos de acceso a datos (DAO) <br>
 * Define operaciones para manipular el modelo de datos Detalle catalogo.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface IDetalleCatalogoDAO {

	/**
	 * Consulta los detalles de los catalogos.
	 *
	 * @return Resultado para consultar detalles catalogos retornado como List
	 */
	public List<DetalleCatalogo> consultarDetallesCatalogos();

	/**
	 * Metodo que consulta los detalles de los catalogos con el codigo del servicio
	 * enviado.
	 *
	 * @param as_codigoServicio condigo de servicio que se quiere consultar hay un
	 *                          enum
	 * @return Lista de DetalleCatalogo con los detalles de los catalogos con ese codigo
	 *         servicio
	 */
	public List<DetalleCatalogo> consultarDetallesCatalogos(String as_codigoServicio);

	/**
	 * Metodo que consulta el detalle de un catalogo.
	 *
	 * @param ac_catalogo catalogo del que se quiere saber su detalle
	 * @return DetalleCatalogo si el catalogo tiene un detalle
	 */
	public DetalleCatalogo consultarDetalleCatalogo(Catalogo ac_catalogo);

	/**
	 * Metodo que se encarga de consultar en base de datos segun el codigo de sub
	 * servicio.
	 *
	 * @param as_codigoSubServicio String con el codigo de sub servicio
	 * @return DetalleCatalogo con los datos de base de datos
	 */
	public DetalleCatalogo consultarDetalleCatalogo(String as_codigoSubServicio);

	/**
	 * Metodo encargado de cosultar el catalogo por tipo documental.
	 *
	 * @param as_idCodigoServicio el parametro id codigo servicio
	 * @return Resultado para consultar detalle catalogo tipo documental retornado
	 *         como Lista de DetalleCatalogo
	 */
	public List<DetalleCatalogo> consultarDetalleCatalogoTipoDocumental(String as_idCodigoServicio);
}

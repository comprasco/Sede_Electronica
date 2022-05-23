/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: IDetalleCatalogoBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless
 * Nombre del elemento: IDetalleCatalogoBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless;

import java.util.List;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CatalogoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.DetalleCatalogoDTO;

/**
 * Interface de la capa de negocio. <br>
 * Permite definir las operaciones requeridas del recurso Detalle catalogo.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface IDetalleCatalogoBusiness {

	/**
	 * Consulta los detalles de los catalogos.
	 *
	 * @return Resultado para consultar detalles catalogos retornado como una lista
	 *         de DetalleCatalogoDTO
	 */
	public List<DetalleCatalogoDTO> consultarDetallesCatalogos();

	/**
	 * Consulta los detalles de los catalogos dependiendo el codigo de servicio.
	 *
	 * @param as_codigoServicio String del codigo de servicio que estan en un enum
	 * @return Lista de DetalleCatalogoDTO, lista de detalle de los catalogos
	 */
	public List<DetalleCatalogoDTO> consultarDetallesCatalogos(String as_codigoServicio);

	/**
	 * Consulta los detalles de los catalogos dependiendo el codigo de servicio si
	 * no tiene especial.
	 *
	 * @param as_codigoServicio String del codigo de servicio que estan en un enum
	 * @return Lista de DetalleCatalogoDTO, lista de detalle de los catalogos
	 */
	public List<DetalleCatalogoDTO> consultarDetallesCatalogosSinEspecial(String as_codigoServicio);

	/**
	 * Metodo que consulta el detalle de un catalogo.
	 *
	 * @param ac_catalogo el parametro catalogo
	 * @return DetalleCatalogoDTO si el catalogo tiene detalle
	 */
	public DetalleCatalogoDTO consultarDetalleCatalogo(CatalogoDTO ac_catalogo);

	/**
	 * Metodo que se encarga de consultar un detalle de catalogo por el codigo de
	 * subservicio.
	 *
	 * @param as_codigoSubServicio string con el codigo del subservicio
	 * @return DetalleCatalogoDTO si se encuentra en base de datos
	 */
	public DetalleCatalogoDTO consultarDetalleCatalogo(String as_codigoSubServicio);

	/**
	 * Metodo que se encarga de traer todos los tipos de certificados especiales.
	 *
	 * @return Resultado para consultar detalles catalogos certificados especiales
	 *         retornado como una lista de DetalleCatalogoDTO
	 */
	public List<DetalleCatalogoDTO> consultarDetallesCatalogosCertificadosEspeciales();

	/**
	 * Metodo que se encarga de traer todos los tipos de Documentos Cuenta Cupo.
	 *
	 * @return Resultado para consultar detalles catalogos documentos cuenta cupo
	 *         retornado como una lista de DetalleCatalogoDTO
	 */
	public List<DetalleCatalogoDTO> consultarDetallesCatalogosDocumentosCuentaCupo();

	/**
	 * Metodo encargado de consultar catalogo por tipo documental.
	 *
	 * @param as_idCodigoServicio el parametro id codigo servicio
	 * @return Resultado para consultar detalles catalogo tipo documental retornado
	 *         como una lista de DetalleCatalogoDTO
	 */
	public List<DetalleCatalogoDTO> consultarDetallesCatalogoTipoDocumental(String as_idCodigoServicio);
}

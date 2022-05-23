/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ICirculoRegistralBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless
 * Nombre del elemento: ICirculoRegistralBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless;

import java.util.List;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CirculoRegistralDTO;

/**
 * Interface de la capa de negocio. <br>
 * Permite definir las operaciones requeridas del recurso Circulo registral.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface ICirculoRegistralBusiness {

	/**
	 * Metodo que retorna la lista de las ORIPS.
	 *
	 * @return Resultado para obtener lista circulo registral retornado como una
	 *         lista de CirculoRegistralDTO
	 */
	public List<CirculoRegistralDTO> obtenerListaCirculoRegistral();

	/**
	 * Metodo que consulta un circulo registral a traves de su codigo.
	 *
	 * @param as_codigoCirculo Codigo del circulo registral (ORIP)
	 * @return Resultado para obtener circulo registral retornado como
	 *         CirculoRegistralDTO
	 */
	public CirculoRegistralDTO obtenerCirculoRegistral(String as_codigoCirculo);
}

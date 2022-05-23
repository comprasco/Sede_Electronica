/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ICirculoRegistralDAO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless
 * Nombre del elemento: ICirculoRegistralDAO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless;

import java.util.List;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.CirculoRegistral;

/**
 * Interface para definir operaciones sobre objetos de acceso a datos (DAO) <br>
 * Define operaciones para manipular el modelo de datos Circulo registral.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface ICirculoRegistralDAO {
	
	/**
	 * Metodo para obtener la lista de las orips.
	 *
	 * @return Resultado para obtener orips retornado como List
	 */
	public List<CirculoRegistral> obtenerOrips();
	
	/**
	 * Metodo para obtener la ORIP del codigo.
	 *
	 * @param as_codigoCirculo Codigo de la ORIP
	 * @return Resultado para obtener orip X codigo retornado como CirculoRegistral
	 */
	public CirculoRegistral obtenerOripXCodigo(String as_codigoCirculo);
}

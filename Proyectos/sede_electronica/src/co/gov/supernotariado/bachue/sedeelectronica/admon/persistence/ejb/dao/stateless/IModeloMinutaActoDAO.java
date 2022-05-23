/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: IModeloMinutaActoDAO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless
 * Nombre del elemento: IModeloMinutaActoDAO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless;

import java.util.List;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.ModeloMinuta;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.ModeloMinutaActo;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.TipoActo;

/**
 * Interface para definir operaciones sobre objetos de acceso a datos (DAO) <br>
 * Define operaciones para manipular el modelo de datos Modelo minuta acto.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface IModeloMinutaActoDAO {
	
	/**
	 * Metodo que permite consultar modelo minutas activas por tipo de acto en la base de datos.
	 * 
	 * @param ata_tipoActo Entidad TipoActo por la cual se va a consultar modelo minutas en la base de datos.
	 * @return Lista de ModeloMinutaActo si existen modelo minutas asociadas a el tipo de acto en la base de datos.
	 */
	public List<ModeloMinutaActo> consultarMinutaPorTipoActo(TipoActo ata_tipoActo);
	
	/**
	 * Metodo que permite la asociacion de minutas con un tipo de acto.
	 * 
	 * @param amma_modeloMinutaActo Entidad ModeloMinutaActo en la cual se va a hacer la insercion en la base de datos.
	 * para la asociacion de modelo minutas a tipos de acto.
	 * @return true si se crea exitosamente.
	 */
	public Boolean crearAsociarActo(ModeloMinutaActo amma_modeloMinutaActo);
	
	/**
	 * Metodo que permite consultar tipos de acto por un modelo minuta en la base de datos.
	 * 
	 * @param amm_modeloMinuta Entidad ModeloMinuta por la cual se van a consultar los tipos de acto en la base de datos.
	 * @return Lista de ModeloMinutaActo si existen tipos de actos asociados a el modelo minuta en la base de datos.
	 */
	public List<ModeloMinutaActo> consultarTipoActoPorMinuta(ModeloMinuta amm_modeloMinuta);
	
	/**
	 * Metodo que permite elminar una asociacion entre un modelo minuta y un tipo de acta en la base de datos.
	 * 
	 * @param amma_modeloMinutaActo Entidad ModeloMinutaActo en la cual se va a eliminar la asociacion en la base de datos.
	 * @return true si se elimina correctamente.
	 */
	public Boolean quitarAsociarActo(ModeloMinutaActo amma_modeloMinutaActo);
}

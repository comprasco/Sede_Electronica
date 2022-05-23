/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: IModeloMinutaDAO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless
 * Nombre del elemento: IModeloMinutaDAO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless;

import java.util.List;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.ModeloMinuta;

/**
 * Interface para definir operaciones sobre objetos de acceso a datos (DAO) <br>
 * Define operaciones para manipular el modelo de datos Modelo minuta.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface IModeloMinutaDAO {

	/**
	 * Metodo en el cual se hace la actualizacion de informacion en la base de datos.
	 * 
	 * 
	 * @param amm_modeloMinuta Entidad ModeloMinuta en la cual se va a hacer la actualizacion en la base de datos.
	 * @return true si la actualizacion fue exitosa.
	 */
	public boolean guardarModeloMinuta(ModeloMinuta amm_modeloMinuta);
	
	/**
	 * Metodo que permite consultar modelo minuta por nombre.
	 *
	 * @param as_nombre String por el cual se realiza la consulta.
	 * @return ModeloMinuta si el modelo minuta existe en base de datos.
	 */
	public ModeloMinuta consultarModeloMinutaPorNombre(String as_nombre);
	
	/**
	 * Metodo que permite consultar los modelos de minuta en base de datos.
	 *
	 * @return Resultado para consultar modelos minuta retornado como List
	 */
	public List<ModeloMinuta> consultarModelosMinuta();
	
	/**
	 * Metodo que permite editar un modelo minuta en la base de datos.
	 * 
	 * @param amm_modeloMinuta Entidad ModeloMinuta en la cual se edita la informacion en la base de datos.
	 * @return True si el editar fue exitoso.
	 */
	public boolean actualizarModeloMinuta(ModeloMinuta amm_modeloMinuta);
	
}

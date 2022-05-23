/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: IModeloMinutaBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless
 * Nombre del elemento: IModeloMinutaBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless;

import java.util.List;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ModeloMinutaDTO;

/**
 * Interface de la capa de negocio. <br>
 * Permite definir las operaciones requeridas del recurso Modelo minuta.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface IModeloMinutaBusiness {

	/**
	 * Metodo que realiza el guardado o la actualizacion del modelo minuta. </br>
	 * Se pasa como parametro <b>ab_modificar</b>, si es <b>true</>, se modifica
	 * </br>
	 * el modelo minuta, de lo contrario se crea.
	 * 
	 * @param amm_modeloMinutaDto Objeto que se va a crear o modificar
	 * @param ab_modificar        indicador para seleccion del metodo del dao para
	 *                            modificar (true=modifica, false=crea)
	 * @return true si la transaccion se realiza correctamente, false en caso
	 *         contrario
	 */
	public boolean guardarModeloMinuta(ModeloMinutaDTO amm_modeloMinutaDto, boolean ab_modificar);

	/**
	 * Metodo que permite consultar un modelo minuta por nombre.
	 * 
	 * @param as_nombre String que identifica el nombre de una minuta.
	 * @return ModeloMinutaDTO segun el parametro con el que fue consultado.
	 */
	public ModeloMinutaDTO consultarModeloMinutaPorNombre(String as_nombre);

	/**
	 * Metodo que permite consultar los modelos de minuta.
	 *
	 * @return Resultado para consultar modelos minuta retornado como una lista de
	 *         ModeloMinutaDTO
	 */
	public List<ModeloMinutaDTO> consultarModelosMinuta();

}

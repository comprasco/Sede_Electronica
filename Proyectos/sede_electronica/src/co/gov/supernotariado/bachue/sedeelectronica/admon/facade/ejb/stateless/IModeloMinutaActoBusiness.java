/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: IModeloMinutaActoBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless
 * Nombre del elemento: IModeloMinutaActoBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless;

import java.util.List;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ModeloMinutaActoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ModeloMinutaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TipoActoDTO;

/**
 * Interface de la capa de negocio. <br>
 * Permite definir las operaciones requeridas del recurso Modelo minuta acto.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface IModeloMinutaActoBusiness {

	/**
	 * Metodo que permite consultar la lista de minutas que pertenezcan a un tipo
	 * acto en especifico.
	 *
	 * @param ata_idTipoActa el parametro id tipo acta
	 * @return Lista de ModeloMinutaActoDTO, con las minutas, segun el tipo acto
	 *         enviado como parametro.
	 */
	public List<ModeloMinutaActoDTO> consultarMinutaTipoActo(TipoActoDTO ata_idTipoActa);

	/**
	 * Metodo que permite crear la asociacion entre modelo minuta y tipo de acto.
	 *
	 * @param amma_modeloMinutaActoDto Entidad en la que se hace la insercion de la
	 *                                 asociacion de modelo minuta y tipo de acto
	 * @return True si la insercion fue exitosa
	 */
	public Boolean crearAsociarActo(ModeloMinutaActoDTO amma_modeloMinutaActoDto);

	/**
	 * Metodo que permite consultar la lista de tipos de acto que contiene una
	 * minuta.
	 * 
	 * @param amm_idModeloMinuta id de la minuta asociado a los tipos de acta.
	 * @return Lista de ModeloMinutaActoDTO, con los tipos de acto, segun la minuta
	 *         seleccionada.
	 */
	public List<ModeloMinutaActoDTO> consultarTipoActoMinuta(ModeloMinutaDTO amm_idModeloMinuta);

	/**
	 * Metodo que permite elimintar una asociacion de modelo minuta y tipo de acto.
	 * 
	 * @param amma_modeloMinutaActoDto Enitdad en la cual se elimina la asociacion
	 *                                 entre modelo minuta y tipo acto.
	 * @return True si la eliminacion fue exitossa.
	 */
	public Boolean quitarAsociarActo(ModeloMinutaActoDTO amma_modeloMinutaActoDto);
}

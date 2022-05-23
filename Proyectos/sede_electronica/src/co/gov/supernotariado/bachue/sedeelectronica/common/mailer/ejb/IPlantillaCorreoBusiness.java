/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: IPlantillaCorreoBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.mailer.ejb
 * Nombre del elemento: IPlantillaCorreoBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.mailer.ejb;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.common.mailer.dto.PlantillaCorreoInstanciaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.mailer.enums.IEnumPlantillasCorreo;

/**
 * Interface de la capa de negocio. <br>
 * Permite definir las operaciones requeridas del recurso Plantilla correo.
 * 
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface IPlantillaCorreoBusiness {

	/**
	 * Metodo que permite generar plantilla de correo instanciada (con valores).
	 *
	 * @param aiepc_plantillaCorreo el parametro plantilla correo
	 * @return PlantillaCorreoInstanciaDTO instancia de Plantilla
	 */
	public PlantillaCorreoInstanciaDTO generarPlantillaCorreoInstancia(IEnumPlantillasCorreo aiepc_plantillaCorreo);

}

package co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultaMigracionPredioWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultaMigracionPredioWSDTO;

/**
*
* @version 1.0
* @author Smartsoft Solutions S.A.S 
* Nota: VO que representa la entidad de clase
* 
*/
@Local
public interface IConsultarMigracionPredioWSBusiness {

	/**
	 * Metodo que realiza consulta del estado de un predio
	 * @param atecmp_tipoEntradaConsultarMigracionPredio
	 * @return TipoSalidaConsultaMigracionPredioWSDTO
	 */
	public TipoSalidaConsultaMigracionPredioWSDTO consultarMigracionPredio(
			TipoEntradaConsultaMigracionPredioWSDTO atecmp_tipoEntradaConsultarMigracionPredio);

	
}

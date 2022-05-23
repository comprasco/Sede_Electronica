/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: IRangoTarifasAlertasBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless
 * Nombre del elemento: IRangoTarifasAlertasBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless;

import java.util.List;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.PersonaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.RangoTarifasAlertaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarTarifaAlertasTitularesWSDTO;

/**
 * Interface de la capa de negocio. <br>
 * Permite definir las operaciones requeridas del recurso Rango tarifas alertas.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface IRangoTarifasAlertasBusiness {

	/**
	 * Metodo que consulta en base de datos el rango de tarifas para el registro de
	 * alertas.
	 *
	 * @return Resultado para consultar rango tarifas alertas retornado como una
	 *         lista de RangoTarifasAlertaDTO
	 */
	public List<RangoTarifasAlertaDTO> consultarRangoTarifasAlertas();

	/**
	 * Metodo que consulta el valor por registrar la alertas.
	 *
	 * @param ai_cantidadAlertas cantidad de alertas a generar
	 * @param ap_personaDto      persona que hace la solicitud
	 * @return Resultado para consultar rango tarifas alertas retornado como
	 *         TipoSalidaConsultarTarifaAlertasTitularesWSDTO
	 */
	public TipoSalidaConsultarTarifaAlertasTitularesWSDTO consultarRangoTarifasAlertas(Integer ai_cantidadAlertas,PersonaDTO ap_personaDto);
}

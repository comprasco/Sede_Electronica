/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: IAlcaldiaBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless
 * Nombre del elemento: IAlcaldiaBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless;

import java.util.List;
import java.util.Map;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.AlcaldiaParametrizacionDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarPazySalvoTributarioWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarPazySalvoTributarioWSDTO;

/**
 * Interface de la capa de negocio. <br>
 * Permite definir las operaciones requeridas del recurso Alcaldia.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface IAlcaldiaBusiness {
	
	/**
	 * Metodo que permite consultar todas las alcadias parametrizadas.
	 *
	 * @return Resultado para consultar alcaldias parametrizadas retornado como una
	 *         lista de AlcaldiaParametrizacionDTO
	 */
	public List<AlcaldiaParametrizacionDTO> consultarAlcaldiasParametrizadas();
	
	/**
	 * Metodo que permite consultar alcadias por su id.
	 *
	 * @param as_idAlcaldia id de la alcadia
	 * @return Resultado para consultar alcaldia retornado como
	 *         AlcaldiaParametrizacionDTO
	 */
	public AlcaldiaParametrizacionDTO consultarAlcaldia(String as_idAlcaldia);
	
	/**
	 * Metodo que permite actualizar una alcaldia.
	 *
	 * @param aap_alcaldia    el parametro alcaldia
	 * @param amss_parametros el parametro parametros
	 * @return true, si se cumple o la accion se realiza exitosamente, false en caso
	 *         contrario.
	 */
	public Boolean actualizarAlcadia(AlcaldiaParametrizacionDTO aap_alcaldia, Map<String, String> amss_parametros);

	/**
	 * Metodo que permite consultar alcaldias por su respectivo municipio.
	 *
	 * @param as_idPais         el parametro id pais
	 * @param as_idDepartamento el parametro id departamento
	 * @param as_municipio      el parametro municipio
	 * @return lista de alcaldias encontradas
	 */
	public List<AlcaldiaParametrizacionDTO> consultarAlcaldias(String as_idPais, String as_idDepartamento,	String as_municipio);
	
	/**
	 * Metodo que permite consultar paz y salvo.
	 *
	 * @param atecpst_tipoEntradaConsultarPazYSalvoTributarioWsDto el parametro tipo
	 *                                                             entrada consultar
	 *                                                             paz Y salvo
	 *                                                             tributario ws dto
	 * @return TipoSalidaConsultarPazySalvoTributarioWSDTO retorna un DTO de tipo
	 *         servicio consultar paz y salvo tributario
	 */
	public TipoSalidaConsultarPazySalvoTributarioWSDTO consultarPazySalvo( TipoEntradaConsultarPazySalvoTributarioWSDTO atecpst_tipoEntradaConsultarPazYSalvoTributarioWsDto);

}

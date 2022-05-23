/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ITransaccionDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.interfaces
 * Nombre del elemento: ITransaccionDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.interfaces;

import java.math.BigDecimal;
import java.util.List;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.DetalleCatalogoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.PersonaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.SalidaMatriculaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumModoTipoServicio;

/**
 * Interface para definir operaciones que caracterizan objetos de transferencia
 * de datos (DTO). <br>
 * Permite definir operaciones para un tipo/forma especial de ver un DTO. <br>
 * Define operaciones para representar un DTO como un elemento Transaccion.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public interface ITransaccionDTO {
	
	/**
	 * Metodo que consulta el detalle catalogo.
	 *
	 * @return DetalleCatalogoDTO
	 */
	public DetalleCatalogoDTO getIdc_detalleCatalogoDto();

	/**
	 * Metodo que carga el detalle catalogo de la transaccion.
	 *
	 * @param adc_detalleCatalogoDto el nuevo valor para la propiedad detalle
	 *                               catalogo dto
	 */
	public void setIdc_detalleCatalogoDto(DetalleCatalogoDTO adc_detalleCatalogoDto);
	
	/**
	 * Metodo que carga el valor total de la transaccion.
	 *
	 * @param abd_valorTotal el nuevo valor para la propiedad valor total
	 */
	public void setIbd_valorTotal(BigDecimal abd_valorTotal);
	
	/**
	 * Metodo que obtiene el valor total de la transaccion.
	 *
	 * @return BigDecimal
	 */
	public BigDecimal getIbd_valorTotal();
	
	/**
	 * Metodo que carga a la persona que hace la transaccion.
	 *
	 * @param ap_personaDto el nuevo valor para la propiedad persona dto
	 */
	public void setIp_personaDto(PersonaDTO ap_personaDto);

	/**
	 * Metodo que obtiene el valor de la persona.
	 *
	 * @return PersonaDTO
	 */
	public PersonaDTO getIp_personaDto();

	/**
	 * Metodo que obtiene un enum con el tipo de servicio a tratar.
	 *
	 * @return EnumModoTipoServicio
	 */
	public EnumModoTipoServicio getIemts_enumModoTipoServicio();
	
	/**
	 * Metodo que obtiene el id del carrito vigente.
	 *
	 * @return String
	 */
	public String getIs_carritoVigente();

	/**
	 * Metodo que obtiene la lista de matriculas de la transaccion.
	 *
	 * @return List<SalidaMatriculaDTO>
	 */
	public List<SalidaMatriculaDTO> getIlsm_listaSalidaMatriculaDto();

	/**
	 * Metodo que obtiene el correo por el que se va enviar.
	 *
	 * @return String
	 */
	public String getIs_envio();
	
	/**
	 * Metodo que obtiene un boleano para saber si es masivo o no es masivo.
	 *
	 * @return boolean
	 */
	public boolean getIb_envioMasivo();
	
	/**
	 * Metodo que obtiene un bolean si ya se llenaron datos para masivos.
	 *
	 * @return Boolean
	 */
	public Boolean getIb_registroSolicitar();
	
	/**
	 * Metodo que obtiene el id de la asociacion.
	 *
	 * @return String
	 */
	public String getIs_idAsociacion();
	
	/**
	 * Metodo que logra cargar el id de la asociacion.
	 *
	 * @param as_idAsociacion el nuevo valor para la propiedad id asociacion
	 */
	public void setIs_idAsociacion(String as_idAsociacion);
	
}

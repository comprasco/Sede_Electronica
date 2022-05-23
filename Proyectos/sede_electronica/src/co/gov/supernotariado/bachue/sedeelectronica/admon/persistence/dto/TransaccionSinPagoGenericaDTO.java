/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: TransaccionSinPagoGenericaDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: TransaccionSinPagoGenericaDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumEstadoSolicitudSinPago;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Transaccion sin
 * pago generica.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TransaccionSinPagoGenericaDTO extends GenericoDTO {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo PersonaDTO para definir la propiedad persona.
	 */
	private PersonaDTO ip_personaDto;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nir.
	 */
	private String is_nir;
	
	private String is_tiposDocumentales;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * modelo transaccion recuperado.
	 */
	private String is_modeloTransaccionRecuperado;
	
	/**
	 * Atributo de instancia tipo EnumEstadoSolicitudSinPago para definir la
	 * propiedad enum estado solicitud sin pago.
	 */
	private EnumEstadoSolicitudSinPago ieessp_enumEstadoSolicitudSinPago;
	
	/**
	 * Atributo de instancia tipo TipoProcesoDTO para definir la propiedad tipo
	 * proceso.
	 */
	private TipoProcesoDTO itp_tipoProcesoDto;
	
	private DetalleCatalogoDTO idc_detalleCatalgoDto; 
	
	/**
	 * Atributo de instancia tipo lista de SoporteTransaccionDTO para definir la
	 * propiedad soporte de la transaccion que son cargados.
	 */
	private List<SoporteTransaccionDTO> ilst_soportesTransaccionCargadosDto;
	
	/**
	 * Obtiene el valor para la propiedad size.
	 *
	 * @return El valor de la propiedad size
	 */
	public int getSize() {
		if(ilst_soportesTransaccionCargadosDto == null)
			ilst_soportesTransaccionCargadosDto = new ArrayList<>();
		return this.ilst_soportesTransaccionCargadosDto.size();
	}
	
	/**
	 * Obtiene el valor para la propiedad nir.
	 *
	 * @return El valor de la propiedad nir
	 */
	public String getIs_nir() {
		return is_nir;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad nir.
	 *
	 * @param as_nir el nuevo valor para la propiedad nir
	 */
	public void setIs_nir(String as_nir) {
		this.is_nir = as_nir;
	}
	
	/**
	 * Obtiene el valor para la propiedad enum estado solicitud sin pago.
	 *
	 * @return El valor de la propiedad enum estado solicitud sin pago
	 */
	public EnumEstadoSolicitudSinPago getIeessp_enumEstadoSolicitudSinPago() {
		return ieessp_enumEstadoSolicitudSinPago;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad enum estado solicitud sin pago.
	 *
	 * @param aeessp_enumEstadoSolicitudSinPago el nuevo valor para la propiedad
	 *                                          enum estado solicitud sin pago
	 */
	public void setIeessp_enumEstadoSolicitudSinPago(EnumEstadoSolicitudSinPago aeessp_enumEstadoSolicitudSinPago) {
		this.ieessp_enumEstadoSolicitudSinPago = aeessp_enumEstadoSolicitudSinPago;
	}
	
	/**
	 * Obtiene el valor para la propiedad tipo proceso dto.
	 *
	 * @return El valor de la propiedad tipo proceso dto
	 */
	public TipoProcesoDTO getItp_tipoProcesoDto() {
		return itp_tipoProcesoDto;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad tipo proceso dto.
	 *
	 * @param atp_tipoProcesoDto el nuevo valor para la propiedad tipo proceso dto
	 */
	public void setItp_tipoProcesoDto(TipoProcesoDTO atp_tipoProcesoDto) {
		this.itp_tipoProcesoDto = atp_tipoProcesoDto;
	}
	
	/**
	 * Obtiene el valor para la propiedad persona dto.
	 *
	 * @return El valor de la propiedad persona dto
	 */
	public PersonaDTO getIp_personaDto() {
		return ip_personaDto;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad persona dto.
	 *
	 * @param ap_personaDto el nuevo valor para la propiedad persona dto
	 */
	public void setIp_personaDto(PersonaDTO ap_personaDto) {
		this.ip_personaDto = ap_personaDto;
	}
	
	/**
	 * Obtiene el valor para la propiedad soporte correccion cargados dto.
	 *
	 * @return El valor de la propiedad soporte correccion cargados dto
	 */
	public List<SoporteTransaccionDTO> getIlst_soportesTransaccionCargadosDto() {
		return ilst_soportesTransaccionCargadosDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad soporte correccion cargados dto.
	 *
	 * @param alst_soportesTransaccionCargadosDto el nuevo valor para la propiedad
	 *                                          soporte correccion cargados dto
	 */
	public void setIlst_soportesTransaccionCargadosDto(List<SoporteTransaccionDTO> alst_soportesTransaccionCargadosDto) {
		this.ilst_soportesTransaccionCargadosDto = alst_soportesTransaccionCargadosDto;
	}

	/**
	 * Obtiene el valor para la propiedad modelo transaccion recuperado.
	 *
	 * @return El valor de la propiedad modelo transaccion recuperado
	 */
	public String getIs_modeloTransaccionRecuperado() {
		return is_modeloTransaccionRecuperado;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad modelo transaccion recuperado.
	 *
	 * @param as_nir el nuevo valor para la propiedad modelo transaccion recuperado
	 */
	public void setIs_modeloTransaccionRecuperado(String as_modeloTransaccionRecuperado) {
		this.is_modeloTransaccionRecuperado = as_modeloTransaccionRecuperado;
	}

	public DetalleCatalogoDTO getIdc_detalleCatalgoDto() {
		return idc_detalleCatalgoDto;
	}

	public void setIdc_detalleCatalgoDto(DetalleCatalogoDTO adc_detalleCatalgoDto) {
		this.idc_detalleCatalgoDto = adc_detalleCatalgoDto;
	}

	public String getIs_tiposDocumentales() {
		return is_tiposDocumentales;
	}

	public void setIs_tiposDocumentales(String as_tiposDocumentales) {
		this.is_tiposDocumentales = as_tiposDocumentales;
	}
}

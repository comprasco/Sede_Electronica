/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: TransaccionCopiasDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: TransaccionCopiasDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

import java.util.List;

import com.google.gson.annotations.SerializedName;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Transaccion
 * copias.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TransaccionCopiasDTO extends TransaccionGenericaDTO{

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo lista de CopiasDTO para definir la propiedad lista
	 * copias.
	 */
	@SerializedName("listaCopias")
	private List<CopiasDTO> ilc_listaCopiasDto;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * correo envio.
	 */
	@SerializedName("correoEnvio")
	private String is_correoEnvio;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad id
	 * solicitud.
	 */
	@SerializedName("idSolicitud")
	private String is_idSolicitud;
	
	/**
	 * Construye una nueva instancia/objeto de la clase TransaccionCopiasDTO.
	 *
	 * @param atg_transaccionGenericaDto el parametro transaccion generica dto
	 */
	public TransaccionCopiasDTO(TransaccionGenericaDTO atg_transaccionGenericaDto)
	{
		this.setIlsm_listaSalidaMatriculaDto(atg_transaccionGenericaDto.getIlsm_listaSalidaMatriculaDto());
		this.setIetp_enumTipoProceso(atg_transaccionGenericaDto.getIetp_enumTipoProceso());
		this.setIemts_enumModoTipoServicio(atg_transaccionGenericaDto.getIemts_enumModoTipoServicio());
		this.setIdc_detalleCatalogoDto(atg_transaccionGenericaDto.getIdc_detalleCatalogoDto());
		this.setIbd_valorTotal(atg_transaccionGenericaDto.getIbd_valorTotal());
		this.setIs_carritoVigente(atg_transaccionGenericaDto.getIs_carritoVigente());
		this.setIp_personaDto(atg_transaccionGenericaDto.getIp_personaDto());
		this.setIs_idAsociacion(atg_transaccionGenericaDto.getIs_idAsociacion());		
	}
	
	/**
	 * Construye una nueva instancia/objeto de la clase TransaccionCopiasDTO.
	 */
	public TransaccionCopiasDTO() {
		// Constructor vacio
	}

	/**
	 * Obtiene el valor para la propiedad correo envio.
	 *
	 * @return El valor de la propiedad correo envio
	 */
	public String getIs_correoEnvio() {
		return is_correoEnvio;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad correo envio.
	 *
	 * @param as_correoEnvio el nuevo valor para la propiedad correo envio
	 */
	public void setIs_correoEnvio(String as_correoEnvio) {
		this.is_correoEnvio = as_correoEnvio;
	}
	
	/**
	 * Obtiene el valor para la propiedad lista copias dto.
	 *
	 * @return El valor de la propiedad lista copias dto
	 */
	public List<CopiasDTO> getIlc_listaCopiasDto() {
		return ilc_listaCopiasDto;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad lista copias dto.
	 *
	 * @param alc_listaCopiasDto el nuevo valor para la propiedad lista copias dto
	 */
	public void setIlc_listaCopiasDto(List<CopiasDTO> alc_listaCopiasDto) {
		this.ilc_listaCopiasDto = alc_listaCopiasDto;
	}
	
	/**
	 * Obtiene el valor para la propiedad id solicitud.
	 *
	 * @return El valor de la propiedad id solicitud
	 */
	public String getIs_idSolicitud() {
		return is_idSolicitud;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad id solicitud.
	 *
	 * @param as_idSolicitud el nuevo valor para la propiedad id solicitud
	 */
	public void setIs_idSolicitud(String as_idSolicitud) {
		this.is_idSolicitud = as_idSolicitud;
	}
}

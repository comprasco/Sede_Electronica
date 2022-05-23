/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: TransaccionIndividualDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: TransaccionIndividualDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

import com.google.gson.annotations.SerializedName;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.interfaces.ITransaccionDTO;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Transaccion
 * individual.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TransaccionIndividualDTO extends TransaccionGenericaDTO implements ITransaccionDTO {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * envio.
	 */
	@SerializedName("correoEnvio")
	private String is_envio;
	
	/**
	 * Atributo de instancia tipo entero para definir la propiedad cantidad
	 * solicitudes.
	 */
	@SerializedName("cantidadSolicitudes")
	private int ii_cantidadSolicitudes;

	/**
	 * Construye una nueva instancia/objeto de la clase TransaccionIndividualDTO.
	 */
	public TransaccionIndividualDTO() {

	}

	/**
	 * Construye una nueva instancia/objeto de la clase TransaccionIndividualDTO.
	 *
	 * @param atg_transaccionGenericaDto el parametro transaccion generica dto
	 */
	public TransaccionIndividualDTO(TransaccionGenericaDTO atg_transaccionGenericaDto) {
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
	 * Cambia/actualiza el valor para la propiedad envio.
	 *
	 * @param as_envio el nuevo valor para la propiedad envio
	 */
	public void setIs_envio(String as_envio) {
		this.is_envio = as_envio;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionGenericaDTO#getIs_envio()
	 */
	@Override
	public String getIs_envio() {
		return is_envio;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionGenericaDTO#getIb_envioMasivo()
	 */
	@Override
	public boolean getIb_envioMasivo() {
		return false;
	}

	/**
	 * Obtiene el valor para la propiedad cantidad solicitudes.
	 *
	 * @return El valor de la propiedad cantidad solicitudes
	 */
	public int getIi_cantidadSolicitudes() {
		return ii_cantidadSolicitudes;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad cantidad solicitudes.
	 *
	 * @param ai_cantidadSolicitudes el nuevo valor para la propiedad cantidad
	 *                               solicitudes
	 */
	public void setIi_cantidadSolicitudes(int ai_cantidadSolicitudes) {
		this.ii_cantidadSolicitudes = ai_cantidadSolicitudes;
	}
}

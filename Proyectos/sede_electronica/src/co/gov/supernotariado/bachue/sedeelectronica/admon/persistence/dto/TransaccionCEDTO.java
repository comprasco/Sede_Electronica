/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: TransaccionCEDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: TransaccionCEDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.interfaces.ITransaccionDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumModoTipoServicio;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Transaccion CE.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TransaccionCEDTO extends GenericoDTO implements ITransaccionDTO{

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad registro
	 * solicitar.
	 */
	private Boolean ib_registroSolicitar;
	
	/**
	 * Atributo de instancia tipo CirculoRegistralDTO para definir la propiedad
	 * circulo registral envio.
	 */
	// Tipo de envio
	private CirculoRegistralDTO icr_circuloRegistralEnvioDTO;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * correo envio.
	 */
	private String is_correoEnvio;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * direccion.
	 */
	private String is_direccion;

	/**
	 * Atributo de instancia tipo CENumMatriculaDTO para definir la propiedad numero
	 * matricula.
	 */
	// Formularios DTO
	private CENumMatriculaDTO icenm_numeroMatriculaDTO;
	
	/**
	 * Atributo de instancia tipo CEIdPropietarioDTO para definir la propiedad id
	 * propietario.
	 */
	private CEIdPropietarioDTO iceip_idPropietarioDTO;
	
	/**
	 * Atributo de instancia tipo CEDireccionDTO para definir la propiedad
	 * direccion.
	 */
	private CEDireccionDTO iced_direccionDTO;
	
	/**
	 * Atributo de instancia tipo CEAntiguoSistemaDTO para definir la propiedad
	 * antiguo sistema.
	 */
	private CEAntiguoSistemaDTO iceas_antiguoSistemaDTO;

	/**
	 * Atributo de instancia tipo EnumModoTipoServicio para definir la propiedad
	 * enum modo tipo servicio.
	 */
	// Integracion
	private EnumModoTipoServicio iemts_enumModoTipoServicio;
	
	/**
	 * Atributo de instancia tipo DetalleCatalogoDTO para definir la propiedad
	 * detalle catalogo.
	 */
	private DetalleCatalogoDTO idc_detalleCatalogoDto;
	
	/**
	 * Atributo de instancia tipo PersonaDTO para definir la propiedad persona.
	 */
	private PersonaDTO ip_personaDto;
	
	/**
	 * Atributo de instancia tipo numero real/decimal de gran magnitud para definir
	 * la propiedad valor total.
	 */
	private BigDecimal ibd_valorTotal;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad id
	 * asociacion.
	 */
	private String is_idAsociacion;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * estado.
	 */
	private String is_estado;



	/**
	 * Obtiene el valor para la propiedad circulo registral envio DTO.
	 *
	 * @return El valor de la propiedad circulo registral envio DTO
	 */
	public CirculoRegistralDTO getIcr_circuloRegistralEnvioDTO() {
		return icr_circuloRegistralEnvioDTO;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad circulo registral envio DTO.
	 *
	 * @param acr_circuloRegistralEnvioDTO el nuevo valor para la propiedad circulo
	 *                                     registral envio DTO
	 */
	public void setIcr_circuloRegistralEnvioDTO(CirculoRegistralDTO acr_circuloRegistralEnvioDTO) {
		this.icr_circuloRegistralEnvioDTO = acr_circuloRegistralEnvioDTO;
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
	 * Obtiene el valor para la propiedad numero matricula DTO.
	 *
	 * @return El valor de la propiedad numero matricula DTO
	 */
	public CENumMatriculaDTO getIcenm_numeroMatriculaDTO() {
		return icenm_numeroMatriculaDTO;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad numero matricula DTO.
	 *
	 * @param acenm_numeroMatriculaDTO el nuevo valor para la propiedad numero
	 *                                 matricula DTO
	 */
	public void setIcenm_numeroMatriculaDTO(CENumMatriculaDTO acenm_numeroMatriculaDTO) {
		this.icenm_numeroMatriculaDTO = acenm_numeroMatriculaDTO;
	}

	/**
	 * Obtiene el valor para la propiedad id propietario DTO.
	 *
	 * @return El valor de la propiedad id propietario DTO
	 */
	public CEIdPropietarioDTO getIceip_idPropietarioDTO() {
		return iceip_idPropietarioDTO;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad id propietario DTO.
	 *
	 * @param aceip_idPropietarioDTO el nuevo valor para la propiedad id propietario
	 *                               DTO
	 */
	public void setIceip_idPropietarioDTO(CEIdPropietarioDTO aceip_idPropietarioDTO) {
		this.iceip_idPropietarioDTO = aceip_idPropietarioDTO;
	}

	/**
	 * Obtiene el valor para la propiedad direccion DTO.
	 *
	 * @return El valor de la propiedad direccion DTO
	 */
	public CEDireccionDTO getIced_direccionDTO() {
		return iced_direccionDTO;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad direccion DTO.
	 *
	 * @param aced_direccionDTO el nuevo valor para la propiedad direccion DTO
	 */
	public void setIced_direccionDTO(CEDireccionDTO aced_direccionDTO) {
		this.iced_direccionDTO = aced_direccionDTO;
	}

	/**
	 * Obtiene el valor para la propiedad antiguo sistema DTO.
	 *
	 * @return El valor de la propiedad antiguo sistema DTO
	 */
	public CEAntiguoSistemaDTO getIceas_antiguoSistemaDTO() {
		return iceas_antiguoSistemaDTO;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad antiguo sistema DTO.
	 *
	 * @param aceas_antiguoSistemaDTO el nuevo valor para la propiedad antiguo
	 *                                sistema DTO
	 */
	public void setIceas_antiguoSistemaDTO(CEAntiguoSistemaDTO aceas_antiguoSistemaDTO) {
		this.iceas_antiguoSistemaDTO = aceas_antiguoSistemaDTO;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.interfaces.ITransaccionDTO#getIemts_enumModoTipoServicio()
	 */
	public EnumModoTipoServicio getIemts_enumModoTipoServicio() {
		return iemts_enumModoTipoServicio;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad enum modo tipo servicio.
	 *
	 * @param aemts_enumModoTipoServicio el nuevo valor para la propiedad enum modo
	 *                                   tipo servicio
	 */
	public void setIemts_enumModoTipoServicio(EnumModoTipoServicio aemts_enumModoTipoServicio) {
		this.iemts_enumModoTipoServicio = aemts_enumModoTipoServicio;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.interfaces.ITransaccionDTO#getIdc_detalleCatalogoDto()
	 */
	@Override
	public DetalleCatalogoDTO getIdc_detalleCatalogoDto() {
		return idc_detalleCatalogoDto;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.interfaces.ITransaccionDTO#setIdc_detalleCatalogoDto(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.DetalleCatalogoDTO)
	 */
	@Override
	public void setIdc_detalleCatalogoDto(DetalleCatalogoDTO adc_detalleCatalogoDto) {
		this.idc_detalleCatalogoDto = adc_detalleCatalogoDto;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.interfaces.ITransaccionDTO#getIp_personaDto()
	 */
	@Override
	public PersonaDTO getIp_personaDto() {
		return ip_personaDto;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.interfaces.ITransaccionDTO#setIp_personaDto(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.PersonaDTO)
	 */
	@Override
	public void setIp_personaDto(PersonaDTO ap_personaDto) {
		this.ip_personaDto = ap_personaDto;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.interfaces.ITransaccionDTO#getIbd_valorTotal()
	 */
	@Override
	public BigDecimal getIbd_valorTotal() {
		return ibd_valorTotal;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.interfaces.ITransaccionDTO#setIbd_valorTotal(java.math.BigDecimal)
	 */
	@Override
	public void setIbd_valorTotal(BigDecimal ibd_valorTotal) {
		this.ibd_valorTotal = ibd_valorTotal;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.interfaces.ITransaccionDTO#getIs_carritoVigente()
	 */
	@Override
	public String getIs_carritoVigente() {
		return null;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.interfaces.ITransaccionDTO#getIlsm_listaSalidaMatriculaDto()
	 */
	@Override
	public List<SalidaMatriculaDTO> getIlsm_listaSalidaMatriculaDto() {
		return new ArrayList<>();
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.interfaces.ITransaccionDTO#getIs_envio()
	 */
	@Override
	public String getIs_envio() {
		return null;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.interfaces.ITransaccionDTO#getIb_envioMasivo()
	 */
	@Override
	public boolean getIb_envioMasivo() {
		return false;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.interfaces.ITransaccionDTO#getIb_registroSolicitar()
	 */
	@Override
	public Boolean getIb_registroSolicitar() {
		return this.ib_registroSolicitar;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad registro solicitar.
	 *
	 * @param ab_registroSolicitar el nuevo valor para la propiedad registro
	 *                             solicitar
	 */
	public void setIb_registroSolicitar(Boolean ab_registroSolicitar) {
		this.ib_registroSolicitar = ab_registroSolicitar;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.interfaces.ITransaccionDTO#getIs_idAsociacion()
	 */
	@Override
	public String getIs_idAsociacion() {
		return this.is_idAsociacion;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.interfaces.ITransaccionDTO#setIs_idAsociacion(java.lang.String)
	 */
	@Override
	public void setIs_idAsociacion(String as_idAsociacion) {
		this.is_idAsociacion = as_idAsociacion;
	}

	/**
	 * Obtiene el valor para la propiedad estado.
	 *
	 * @return El valor de la propiedad estado
	 */
	public String getIs_estado() {
		return is_estado;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad estado.
	 *
	 * @param as_estado el nuevo valor para la propiedad estado
	 */
	public void setIs_estado(String as_estado) {
		this.is_estado = as_estado;
	}

	public String getIs_direccion() {
		return is_direccion;
	}

	public void setIs_direccion(String as_direccion) {
		this.is_direccion = as_direccion;
	}

	

}

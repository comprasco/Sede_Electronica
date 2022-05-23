/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: TransaccionGenericaDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: TransaccionGenericaDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

import java.math.BigDecimal;
import java.util.List;

import com.google.gson.annotations.SerializedName;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.interfaces.ITransaccionDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumModoTipoServicio;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoProceso;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Transaccion
 * generica.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TransaccionGenericaDTO extends GenericoDTO implements ITransaccionDTO {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo lista de SalidaMatriculaDTO para definir la
	 * propiedad lista salida matricula.
	 */
	@SerializedName("listaRespuestas")
	private List<SalidaMatriculaDTO> ilsm_listaSalidaMatriculaDto;
	
	/**
	 * Atributo de instancia tipo EnumModoTipoServicio para definir la propiedad
	 * enum modo tipo servicio.
	 */
	@SerializedName("modoTipoServicio")
	private EnumModoTipoServicio iemts_enumModoTipoServicio;
	
	/**
	 * Atributo de instancia tipo EnumTipoProceso para definir la propiedad enum
	 * tipo proceso.
	 */
	@SerializedName("tipoProceso")
	private EnumTipoProceso ietp_enumTipoProceso;
	
	/**
	 * Atributo de instancia tipo DetalleCatalogoDTO para definir la propiedad
	 * detalle catalogo.
	 */
	@SerializedName("detalleCatalogo")
	private DetalleCatalogoDTO idc_detalleCatalogoDto;
	
	/**
	 * Atributo de instancia tipo numero real/decimal de gran magnitud para definir
	 * la propiedad valor total.
	 */
	@SerializedName("valorTottal")
	private BigDecimal ibd_valorTotal;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * valor total.
	 */
	@SerializedName("valorTotalTexto")
	private String is_valorTotal;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * carrito vigente.
	 */
	@SerializedName("urlCarrito")
	private String is_carritoVigente;
	
	/**
	 * Atributo de instancia tipo PersonaDTO para definir la propiedad persona.
	 */
	@SerializedName("persona")
	private PersonaDTO ip_personaDto;
	
	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad registro
	 * solicitar.
	 */
	@SerializedName("registroSolicitar")
	private Boolean ib_registroSolicitar;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad id
	 * asociacion.
	 */
	@SerializedName("idAsociacion")
	private String is_idAsociacion;
	
	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad migrado.
	 */
	@SerializedName("transaccionMigrada")
	private Boolean ib_migrado;

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.interfaces.ITransaccionDTO#getIlsm_listaSalidaMatriculaDto()
	 */
	@Override
	public List<SalidaMatriculaDTO> getIlsm_listaSalidaMatriculaDto() {
		return ilsm_listaSalidaMatriculaDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad lista salida matricula dto.
	 *
	 * @param alsm_listaSalidaMatriculaDto el nuevo valor para la propiedad lista
	 *                                     salida matricula dto
	 */
	public void setIlsm_listaSalidaMatriculaDto(List<SalidaMatriculaDTO> alsm_listaSalidaMatriculaDto) {
		this.ilsm_listaSalidaMatriculaDto = alsm_listaSalidaMatriculaDto;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.interfaces.ITransaccionDTO#getIemts_enumModoTipoServicio()
	 */
	@Override
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
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.interfaces.ITransaccionDTO#getIs_carritoVigente()
	 */
	@Override
	public String getIs_carritoVigente() {
		return is_carritoVigente;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad carrito vigente.
	 *
	 * @param as_carritoVigente el nuevo valor para la propiedad carrito vigente
	 */
	public void setIs_carritoVigente(String as_carritoVigente) {
		this.is_carritoVigente = as_carritoVigente;
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
	public void setIbd_valorTotal(BigDecimal abd_valorTotal) {
		this.ibd_valorTotal = abd_valorTotal;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.interfaces.ITransaccionDTO#setIp_personaDto(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.PersonaDTO)
	 */
	@Override
	public void setIp_personaDto(PersonaDTO ap_personaDto) {
		this.ip_personaDto = ap_personaDto;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.interfaces.ITransaccionDTO#getIp_personaDto()
	 */
	@Override
	public PersonaDTO getIp_personaDto() {
		return this.ip_personaDto;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.interfaces.ITransaccionDTO#getIs_envio()
	 */
	@Override
	public String getIs_envio() {
		return "";
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.interfaces.ITransaccionDTO#getIb_envioMasivo()
	 */
	@Override
	public boolean getIb_envioMasivo() {
		return false;
	}

	/**
	 * Obtiene el valor para la propiedad enum tipo proceso.
	 *
	 * @return El valor de la propiedad enum tipo proceso
	 */
	public EnumTipoProceso getIetp_enumTipoProceso() {
		return ietp_enumTipoProceso;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad enum tipo proceso.
	 *
	 * @param aetp_enumTipoProceso el nuevo valor para la propiedad enum tipo
	 *                             proceso
	 */
	public void setIetp_enumTipoProceso(EnumTipoProceso aetp_enumTipoProceso) {
		this.ietp_enumTipoProceso = aetp_enumTipoProceso;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.interfaces.ITransaccionDTO#getIb_registroSolicitar()
	 */
	@Override
	public Boolean getIb_registroSolicitar() {
		return ib_registroSolicitar;
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

	/**
	 * Obtiene el valor para la propiedad valor total.
	 *
	 * @return El valor de la propiedad valor total
	 */
	public String getIs_valorTotal() {
		return is_valorTotal;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad valor total.
	 *
	 * @param as_valorTotal el nuevo valor para la propiedad valor total
	 */
	public void setIs_valorTotal(String as_valorTotal) {
		this.is_valorTotal = as_valorTotal;
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
	 * Obtiene el valor para la propiedad migrado.
	 *
	 * @return El valor de la propiedad migrado
	 */
	public Boolean getIb_migrado() {
		return ib_migrado;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad migrado.
	 *
	 * @param ab_migrado el nuevo valor para la propiedad migrado
	 */
	public void setIb_migrado(Boolean ab_migrado) {
		this.ib_migrado = ab_migrado;
	}

}

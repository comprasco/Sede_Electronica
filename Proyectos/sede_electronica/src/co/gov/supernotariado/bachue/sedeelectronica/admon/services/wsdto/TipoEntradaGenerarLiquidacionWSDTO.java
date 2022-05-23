/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: TipoEntradaGenerarLiquidacionWSDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto
 * Nombre del elemento: TipoEntradaGenerarLiquidacionWSDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto;

import java.util.List;

import com.google.gson.annotations.SerializedName;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.GenericoDTO;

/**
 * Clase tipo objeto de transferencia de datos para web service (WSDTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y servicios web.
 * <br>
 * Contiene propiedades para representar los datos del objeto Tipo entrada
 * generar liquidacion.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoEntradaGenerarLiquidacionWSDTO  extends GenericoDTO {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo canal.
	 */
	@SerializedName("codigoCanal")
    private String is_codigoCanal;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo sucursal canal.
	 */
	@SerializedName("codigoSucursalCanal")
    private String is_codigoSucursalCanal;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * orip solicitud.
	 */
	@SerializedName("oripSolicitud")
    private String is_oripSolicitud;
    
    /**
	 * Atributo de instancia tipo lista de TipoServicioGLIWSDTO para definir la
	 * propiedad lista tipo servicio liquidacion ws.
	 */
    @SerializedName("listaTipoServicio")
    private List<TipoServicioGLIWSDTO> ilts_listaTipoServicioLiquidacionWsDto;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo convenio.
	 */
    @SerializedName("codigoConvenio")
    private String is_codigoConvenio;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * numero documento solicitante.
	 */
    @SerializedName("numeroDocSolicitud")
    private String is_numeroDocSolicitante;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * primer apellido solicitante.
	 */
    @SerializedName("primerApellidoSolicitante")
    private String is_primerApellidoSolicitante;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * primer nombre solicitante.
	 */
    @SerializedName("primerNombreSolicitante")
    private String is_primerNombreSolicitante;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * segundo apellido solicitante.
	 */
    @SerializedName("segundoApellidoSolicitante")
    private String is_segundoApellidoSolicitante;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * segundo nombre solicitante.
	 */
    @SerializedName("segundoNombreSolicitante")
    private String is_segundoNombreSolicitante;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * tipo documento solicitante.
	 */
    @SerializedName("tipoDocSolicitante")
    private String is_tipoDocSolicitante;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * tipo persona.
	 */
    @SerializedName("tipoPersona")
    private String is_tipoPersona;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * razon social.
	 */
    @SerializedName("razonSocial")
    private String is_razonSocial;
    
    /**
   	 * Atributo de instancia tipo verdadero/falso para definir la propiedad
   	 * matricula migradas.
   	 */
    @SerializedName("matriculasMigradas")
    private Boolean ib_matriculasMigradas;
	
	/**
	 * Obtiene el valor para la propiedad codigo convenio.
	 *
	 * @return El valor de la propiedad codigo convenio
	 */
	public String getIs_codigoConvenio() {
		return is_codigoConvenio;
	}
	
	/**
	 * Obtiene el valor para la propiedad numero documento solicitante.
	 *
	 * @return El valor de la propiedad numero documento solicitante
	 */
	public String getIs_numeroDocSolicitante() {
		return is_numeroDocSolicitante;
	}
	
	/**
	 * Obtiene el valor para la propiedad primer apellido solicitante.
	 *
	 * @return El valor de la propiedad primer apellido solicitante
	 */
	public String getIs_primerApellidoSolicitante() {
		return is_primerApellidoSolicitante;
	}
	
	/**
	 * Obtiene el valor para la propiedad primer nombre solicitante.
	 *
	 * @return El valor de la propiedad primer nombre solicitante
	 */
	public String getIs_primerNombreSolicitante() {
		return is_primerNombreSolicitante;
	}
	
	/**
	 * Obtiene el valor para la propiedad segundo apellido solicitante.
	 *
	 * @return El valor de la propiedad segundo apellido solicitante
	 */
	public String getIs_segundoApellidoSolicitante() {
		return is_segundoApellidoSolicitante;
	}
	
	/**
	 * Obtiene el valor para la propiedad segundo nombre solicitante.
	 *
	 * @return El valor de la propiedad segundo nombre solicitante
	 */
	public String getIs_segundoNombreSolicitante() {
		return is_segundoNombreSolicitante;
	}
	
	/**
	 * Obtiene el valor para la propiedad tipo documento solicitante.
	 *
	 * @return El valor de la propiedad tipo documento solicitante
	 */
	public String getIs_tipoDocSolicitante() {
		return is_tipoDocSolicitante;
	}
	
	/**
	 * Obtiene el valor para la propiedad tipo persona.
	 *
	 * @return El valor de la propiedad tipo persona
	 */
	public String getIs_tipoPersona() {
		return is_tipoPersona;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad codigo convenio.
	 *
	 * @param as_codigoConvenio el nuevo valor para la propiedad codigo convenio
	 */
	public void setIs_codigoConvenio(String as_codigoConvenio) {
		this.is_codigoConvenio = as_codigoConvenio;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad numero documento solicitante.
	 *
	 * @param as_numeroDocSolicitante el nuevo valor para la propiedad numero
	 *                                documento solicitante
	 */
	public void setIs_numeroDocSolicitante(String as_numeroDocSolicitante) {
		this.is_numeroDocSolicitante = as_numeroDocSolicitante;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad primer apellido solicitante.
	 *
	 * @param as_primerApellidoSolicitante el nuevo valor para la propiedad primer
	 *                                     apellido solicitante
	 */
	public void setIs_primerApellidoSolicitante(String as_primerApellidoSolicitante) {
		this.is_primerApellidoSolicitante = as_primerApellidoSolicitante;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad primer nombre solicitante.
	 *
	 * @param as_primerNombreSolicitante el nuevo valor para la propiedad primer
	 *                                   nombre solicitante
	 */
	public void setIs_primerNombreSolicitante(String as_primerNombreSolicitante) {
		this.is_primerNombreSolicitante = as_primerNombreSolicitante;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad segundo apellido solicitante.
	 *
	 * @param as_segundoApellidoSolicitante el nuevo valor para la propiedad segundo
	 *                                      apellido solicitante
	 */
	public void setIs_segundoApellidoSolicitante(String as_segundoApellidoSolicitante) {
		this.is_segundoApellidoSolicitante = as_segundoApellidoSolicitante;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad segundo nombre solicitante.
	 *
	 * @param as_segundoNombreSolicitante el nuevo valor para la propiedad segundo
	 *                                    nombre solicitante
	 */
	public void setIs_segundoNombreSolicitante(String as_segundoNombreSolicitante) {
		this.is_segundoNombreSolicitante = as_segundoNombreSolicitante;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad tipo documento solicitante.
	 *
	 * @param as_tipoDocSolicitante el nuevo valor para la propiedad tipo documento
	 *                              solicitante
	 */
	public void setIs_tipoDocSolicitante(String as_tipoDocSolicitante) {
		this.is_tipoDocSolicitante = as_tipoDocSolicitante;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad tipo persona.
	 *
	 * @param as_tipoPersona el nuevo valor para la propiedad tipo persona
	 */
	public void setIs_tipoPersona(String as_tipoPersona) {
		this.is_tipoPersona = as_tipoPersona;
	}
	
	/**
	 * Obtiene el valor para la propiedad codigo canal.
	 *
	 * @return El valor de la propiedad codigo canal
	 */
	public String getIs_codigoCanal() {
		return is_codigoCanal;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad codigo canal.
	 *
	 * @param as_codigoCanal el nuevo valor para la propiedad codigo canal
	 */
	public void setIs_codigoCanal(String as_codigoCanal) {
		this.is_codigoCanal = as_codigoCanal;
	}
	
	/**
	 * Obtiene el valor para la propiedad codigo sucursal canal.
	 *
	 * @return El valor de la propiedad codigo sucursal canal
	 */
	public String getIs_codigoSucursalCanal() {
		return is_codigoSucursalCanal;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad codigo sucursal canal.
	 *
	 * @param as_codigoSucursalCanal el nuevo valor para la propiedad codigo
	 *                               sucursal canal
	 */
	public void setIs_codigoSucursalCanal(String as_codigoSucursalCanal) {
		this.is_codigoSucursalCanal = as_codigoSucursalCanal;
	}
	
	/**
	 * Obtiene el valor para la propiedad orip solicitud.
	 *
	 * @return El valor de la propiedad orip solicitud
	 */
	public String getIs_oripSolicitud() {
		return is_oripSolicitud;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad orip solicitud.
	 *
	 * @param as_oripSolicitud el nuevo valor para la propiedad orip solicitud
	 */
	public void setIs_oripSolicitud(String as_oripSolicitud) {
		this.is_oripSolicitud = as_oripSolicitud;
	}
	
	/**
	 * Obtiene el valor para la propiedad lista tipo servicio liquidacion ws dto.
	 *
	 * @return El valor de la propiedad lista tipo servicio liquidacion ws dto
	 */
	public List<TipoServicioGLIWSDTO> getIlts_listaTipoServicioLiquidacionWsDto() {
		return ilts_listaTipoServicioLiquidacionWsDto;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad lista tipo servicio liquidacion
	 * ws dto.
	 *
	 * @param alts_listaTipoServicioLiquidacionWsDto el nuevo valor para la
	 *                                               propiedad lista tipo servicio
	 *                                               liquidacion ws dto
	 */
	public void setIlts_listaTipoServicioLiquidacionWsDto(List<TipoServicioGLIWSDTO> alts_listaTipoServicioLiquidacionWsDto) {
		this.ilts_listaTipoServicioLiquidacionWsDto = alts_listaTipoServicioLiquidacionWsDto;
	}
	
	/**
	 * Obtiene el valor para la propiedad razon social.
	 *
	 * @return El valor de la propiedad razon social
	 */
	public String getIs_razonSocial() {
		return is_razonSocial;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad razon social.
	 *
	 * @param as_razonSocial el nuevo valor para la propiedad razon social
	 */
	public void setIs_razonSocial(String as_razonSocial) {
		this.is_razonSocial = as_razonSocial;
	}
	
	/**
	 * Obtiene el valor para la propiedad matricula migradas.
	 *
	 * @return El valor de la propiedad matricula migradas
	 */
	public Boolean getIb_matriculasMigradas() {
		return ib_matriculasMigradas;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad matricula migradas.
	 *
	 * @param as_razonSocial el nuevo valor para la propiedad matricula migradas
	 */
	public void setIb_matriculasMigradas(Boolean ib_matriculasMigradas) {
		this.ib_matriculasMigradas = ib_matriculasMigradas;
	}

}

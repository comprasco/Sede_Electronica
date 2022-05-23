/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: TipoEntradaGenerarLiquidacionVO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.vo.operacionesfinancieras
 * Nombre del elemento: TipoEntradaGenerarLiquidacionVO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.vo.operacionesfinancieras;

import java.util.List;

import co.gov.supernotariado.bachue.clientebus.vo.ClienteIntegracionVO;

/**
 * Clase tipo objeto de valores de servicios (VO). <br>
 * Permite pasar datos de entrada o devolver los resultados al invocar una
 * operacion de un servicio, <br>
 * consumida usando el cliente bus. <br>
 * Contiene propiedades para representar los datos de entrada/salida del objeto
 * Tipo entrada generar liquidacion .
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoEntradaGenerarLiquidacionVO  extends ClienteIntegracionVO {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo canal.
	 */
    private String is_codigoCanal;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo sucursal canal.
	 */
    private String is_codigoSucursalCanal;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * orip solicitud.
	 */
    private String is_oripSolicitud;
    
    /**
	 * Atributo de instancia tipo lista de TipoServicioGLIVO para definir la
	 * propiedad lista tipo servicio objeto con valores de servicio.
	 */
    private List<TipoServicioGLIVO> ilts_listaTipoServicioVo;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo convenio.
	 */
    private String is_codigoConvenio;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * numero documento solicitante.
	 */
    private String is_numeroDocSolicitante;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * primer apellido solicitante.
	 */
    private String is_primerApellidoSolicitante;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * primer nombre solicitante.
	 */
    private String is_primerNombreSolicitante;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * segundo apellido solicitante.
	 */
    private String is_segundoApellidoSolicitante;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * segundo nombre solicitante.
	 */
    private String is_segundoNombreSolicitante;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * tipo documento solicitante.
	 */
    private String is_tipoDocSolicitante;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * tipo persona.
	 */
    private String is_tipoPersona;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * razon social.
	 */
	private String is_razonSocial;
	
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
	 * Obtiene el valor para la propiedad lista tipo servicio objeto con valores de
	 * servicio.
	 *
	 * @return El valor de la propiedad lista tipo servicio objeto con valores de
	 *         servicio
	 */
	public List<TipoServicioGLIVO> getIlts_listaTipoServicioVo() {
		return ilts_listaTipoServicioVo;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad lista tipo servicio objeto con
	 * valores de servicio.
	 *
	 * @param alts_listaTipoServicioVo el nuevo valor para la propiedad lista tipo
	 *                                 servicio objeto con valores de servicio
	 */
	public void setIlts_listaTipoServicioVo(List<TipoServicioGLIVO> alts_listaTipoServicioVo) {
		this.ilts_listaTipoServicioVo = alts_listaTipoServicioVo;
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
	
}

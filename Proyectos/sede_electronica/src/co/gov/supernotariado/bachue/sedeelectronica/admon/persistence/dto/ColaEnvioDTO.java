/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ColaEnvioDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: ColaEnvioDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

import java.util.Date;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.interfaces.IAuditableDTO;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Cola envio.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ColaEnvioDTO extends GenericoBaseDTO implements IAuditableDTO { 

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad id.
	 */
	// --- Atributos
	private String is_id;
	
	/**
	 * Atributo de instancia tipo entero para definir la propiedad cantidad
	 * intentos.
	 */
	private Integer ii_cantidadIntentos;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * detalle envio.
	 */
	private String is_detalleEnvio;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * estado envio.
	 */
	private String is_estadoEnvio;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * estereotipo creacion.
	 */
	private String is_estereotipoCreacion;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * estereotipo modificacion.
	 */
	private String is_estereotipoModificacion;
	
	/**
	 * Atributo de instancia tipo fecha para definir la propiedad fecha creacion.
	 */
	private Date id_fechaCreacion;
	
	/**
	 * Atributo de instancia tipo fecha para definir la propiedad fecha
	 * modificacion.
	 */
	private Date id_fechaModificacion;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad id
	 * usuario creacion.
	 */
	private String is_idUsuarioCreacion;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad id
	 * usuario modificacion.
	 */
	private String is_idUsuarioModificacion;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad ip
	 * creacion.
	 */
	private String is_ipCreacion;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad ip
	 * modificacion.
	 */
	private String is_ipModificacion;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * plantilla llena.
	 */
	private String is_plantillaLlena;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * prioridad.
	 */
	private String is_prioridad;
	
	/**
	 * Atributo de instancia tipo ParametrizacionPlantillaDTO para definir la
	 * propiedad parametrizacion plantilla.
	 */
	private ParametrizacionPlantillaDTO ipp_parametrizacionPlantilla;

	/**
	 * Construye una nueva instancia/objeto de la clase ColaEnvioDTO.
	 */
	public ColaEnvioDTO () {
		//Constructor vacio
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.GenericoBaseDTO#getIs_id()
	 */
	@Override
	public String getIs_id() {
		return is_id;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.GenericoBaseDTO#setIs_id(java.lang.String)
	 */
	@Override
	public void setIs_id(String as_id) {
		this.is_id = as_id;
	}

	/**
	 * Obtiene el valor para la propiedad cantidad intentos.
	 *
	 * @return El valor de la propiedad cantidad intentos
	 */
	public Integer getIi_cantidadIntentos() {
		return ii_cantidadIntentos;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad cantidad intentos.
	 *
	 * @param ai_cantidadIntentos el nuevo valor para la propiedad cantidad intentos
	 */
	public void setIi_cantidadIntentos(Integer ai_cantidadIntentos) {
		this.ii_cantidadIntentos = ai_cantidadIntentos;
	}

	/**
	 * Obtiene el valor para la propiedad detalle envio.
	 *
	 * @return El valor de la propiedad detalle envio
	 */
	public String getIs_detalleEnvio() {
		return is_detalleEnvio;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad detalle envio.
	 *
	 * @param as_detalleEnvio el nuevo valor para la propiedad detalle envio
	 */
	public void setIs_detalleEnvio(String as_detalleEnvio) {
		this.is_detalleEnvio = as_detalleEnvio;
	}

	/**
	 * Obtiene el valor para la propiedad estado envio.
	 *
	 * @return El valor de la propiedad estado envio
	 */
	public String getIs_estadoEnvio() {
		return is_estadoEnvio;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad estado envio.
	 *
	 * @param as_estadoEnvio el nuevo valor para la propiedad estado envio
	 */
	public void setIs_estadoEnvio(String as_estadoEnvio) {
		this.is_estadoEnvio = as_estadoEnvio;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.GenericoBaseDTO#getIs_estereotipoCreacion()
	 */
	@Override
	public String getIs_estereotipoCreacion() {
		return is_estereotipoCreacion;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.GenericoBaseDTO#setIs_estereotipoCreacion(java.lang.String)
	 */
	public void setIs_estereotipoCreacion(String as_estereotipoCreacion) {
		this.is_estereotipoCreacion = as_estereotipoCreacion;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.GenericoBaseDTO#getIs_estereotipoModificacion()
	 */
	@Override
	public String getIs_estereotipoModificacion() {
		return is_estereotipoModificacion;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.GenericoBaseDTO#setIs_estereotipoModificacion(java.lang.String)
	 */
	public void setIs_estereotipoModificacion(String as_estereotipoModificacion) {
		this.is_estereotipoModificacion = as_estereotipoModificacion;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.GenericoBaseDTO#getId_fechaCreacion()
	 */
	@Override
	public Date getId_fechaCreacion() {
		return id_fechaCreacion;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.GenericoBaseDTO#setId_fechaCreacion(java.util.Date)
	 */
	public void setId_fechaCreacion(Date ad_fechaCreacion) {
		this.id_fechaCreacion = ad_fechaCreacion;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.GenericoBaseDTO#getId_fechaModificacion()
	 */
	@Override
	public Date getId_fechaModificacion() {
		return id_fechaModificacion;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.GenericoBaseDTO#setId_fechaModificacion(java.util.Date)
	 */
	public void setId_fechaModificacion(Date ad_fechaModificacion) {
		this.id_fechaModificacion = ad_fechaModificacion;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.GenericoBaseDTO#getIs_idUsuarioCreacion()
	 */
	@Override
	public String getIs_idUsuarioCreacion() {
		return is_idUsuarioCreacion;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.GenericoBaseDTO#setIs_idUsuarioCreacion(java.lang.String)
	 */
	public void setIs_idUsuarioCreacion(String as_idUsuarioCreacion) {
		this.is_idUsuarioCreacion = as_idUsuarioCreacion;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.GenericoBaseDTO#getIs_idUsuarioModificacion()
	 */
	@Override
	public String getIs_idUsuarioModificacion() {
		return is_idUsuarioModificacion;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.GenericoBaseDTO#setIs_idUsuarioModificacion(java.lang.String)
	 */
	public void setIs_idUsuarioModificacion(String as_idUsuarioModificacion) {
		this.is_idUsuarioModificacion = as_idUsuarioModificacion;
	}
	
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.GenericoBaseDTO#getIs_ipCreacion()
	 */
	@Override
	public String getIs_ipCreacion() {
		return is_ipCreacion;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.GenericoBaseDTO#setIs_ipCreacion(java.lang.String)
	 */
	public void setIs_ipCreacion(String as_ipCreacion) {
		this.is_ipCreacion = as_ipCreacion;
	}
	
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.GenericoBaseDTO#getIs_ipModificacion()
	 */
	@Override
	public String getIs_ipModificacion() {
		return is_ipModificacion;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.GenericoBaseDTO#setIs_ipModificacion(java.lang.String)
	 */
	public void setIs_ipModificacion(String as_ipModificacion) {
		this.is_ipModificacion = as_ipModificacion;
	}

	/**
	 * Obtiene el valor para la propiedad plantilla llena.
	 *
	 * @return El valor de la propiedad plantilla llena
	 */
	public String getIs_plantillaLlena() {
		return is_plantillaLlena;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad plantilla llena.
	 *
	 * @param as_plantillaLlena el nuevo valor para la propiedad plantilla llena
	 */
	public void setIs_plantillaLlena(String as_plantillaLlena) {
		this.is_plantillaLlena = as_plantillaLlena;
	}

	/**
	 * Obtiene el valor para la propiedad prioridad.
	 *
	 * @return El valor de la propiedad prioridad
	 */
	public String getIs_prioridad() {
		return is_prioridad;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad prioridad.
	 *
	 * @param as_prioridad el nuevo valor para la propiedad prioridad
	 */
	public void setIs_prioridad(String as_prioridad) {
		this.is_prioridad = as_prioridad;
	}

	/**
	 * Obtiene el valor para la propiedad parametrizacion plantilla.
	 *
	 * @return El valor de la propiedad parametrizacion plantilla
	 */
	public ParametrizacionPlantillaDTO getIpp_parametrizacionPlantilla() {
		return ipp_parametrizacionPlantilla;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad parametrizacion plantilla.
	 *
	 * @param app_parametrizacionPlantilla el nuevo valor para la propiedad
	 *                                     parametrizacion plantilla
	 */
	public void setIpp_parametrizacionPlantilla(ParametrizacionPlantillaDTO app_parametrizacionPlantilla) {
		this.ipp_parametrizacionPlantilla = app_parametrizacionPlantilla;
	}

}

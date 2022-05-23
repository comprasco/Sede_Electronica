/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: HistoricoConsultaDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: HistoricoConsultaDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

import java.util.Date;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Historico
 * consulta.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class HistoricoConsultaDTO extends GenericoBaseDTO {
	
	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	// --- Atributos
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad id.
	 */
	private String is_id;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * activo.
	 */
	private String is_activo;
	
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
	 * usuario.
	 */
	private String is_idUsuario;
	
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
	 * nombre consulta.
	 */
	private String is_nombreConsulta;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * modelo entrada.
	 */
	private String is_modeloEntrada;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * modelo salida.
	 */
	private String is_modeloSalida;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * resultado.
	 */
	private String is_resultado;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * url.
	 */
	private String is_url;

	/**
	 * Construye una nueva instancia/objeto de la clase HistoricoConsultaDTO.
	 */
	// --- Constructor
	public HistoricoConsultaDTO () {
		//Constructor vacio
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.GenericoBaseDTO#getIs_id()
	 */
	public String getIs_id() {
		return is_id;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.GenericoBaseDTO#setIs_id(java.lang.String)
	 */
	public void setIs_id(String as_id) {
		this.is_id = as_id;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.GenericoBaseDTO#getIs_activo()
	 */
	public String getIs_activo() {
		return is_activo;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.GenericoBaseDTO#setIs_activo(java.lang.String)
	 */
	public void setIs_activo(String as_activo) {
		this.is_activo = as_activo;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.GenericoBaseDTO#getIs_estereotipoCreacion()
	 */
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
	public Date getId_fechaCreacion() {
		return id_fechaCreacion;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.GenericoBaseDTO#setId_fechaCreacion(java.util.Date)
	 */
	public void setId_fechaCreacion(Date id_fechaCreacion) {
		this.id_fechaCreacion = id_fechaCreacion;
	}
	
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.GenericoBaseDTO#getId_fechaModificacion()
	 */
	public Date getId_fechaModificacion() {
		return id_fechaModificacion;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.GenericoBaseDTO#setId_fechaModificacion(java.util.Date)
	 */
	public void setId_fechaModificacion(Date id_fechaModificacion) {
		this.id_fechaModificacion = id_fechaModificacion;
	}

	/**
	 * Obtiene el valor para la propiedad id usuario.
	 *
	 * @return El valor de la propiedad id usuario
	 */
	public String getIs_idUsuario() {
		return is_idUsuario;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad id usuario.
	 *
	 * @param as_idUsuario el nuevo valor para la propiedad id usuario
	 */
	public void setIs_idUsuario(String as_idUsuario) {
		this.is_idUsuario = as_idUsuario;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.GenericoBaseDTO#getIs_idUsuarioCreacion()
	 */
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
	 * Obtiene el valor para la propiedad nombre consulta.
	 *
	 * @return El valor de la propiedad nombre consulta
	 */
	public String getIs_nombreConsulta() {
		return is_nombreConsulta;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad nombre consulta.
	 *
	 * @param as_nombreConsulta el nuevo valor para la propiedad nombre consulta
	 */
	public void setIs_nombreConsulta(String as_nombreConsulta) {
		this.is_nombreConsulta = as_nombreConsulta;
	}

	/**
	 * Obtiene el valor para la propiedad modelo entrada.
	 *
	 * @return El valor de la propiedad modelo entrada
	 */
	public String getIs_modeloEntrada() {
		return is_modeloEntrada;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad modelo entrada.
	 *
	 * @param as_modeloEntrada el nuevo valor para la propiedad modelo entrada
	 */
	public void setIs_modeloEntrada(String as_modeloEntrada) {
		this.is_modeloEntrada = as_modeloEntrada;
	}

	/**
	 * Obtiene el valor para la propiedad modelo salida.
	 *
	 * @return El valor de la propiedad modelo salida
	 */
	public String getIs_modeloSalida() {
		return is_modeloSalida;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad modelo salida.
	 *
	 * @param as_modeloSalida el nuevo valor para la propiedad modelo salida
	 */
	public void setIs_modeloSalida(String as_modeloSalida) {
		this.is_modeloSalida = as_modeloSalida;
	}

	/**
	 * Obtiene el valor para la propiedad url.
	 *
	 * @return El valor de la propiedad url
	 */
	public String getIs_url() {
		return is_url;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad url.
	 *
	 * @param as_url el nuevo valor para la propiedad url
	 */
	public void setIs_url(String as_url) {
		this.is_url = as_url;
	}

	/**
	 * Obtiene el valor para la propiedad resultado.
	 *
	 * @return El valor de la propiedad resultado
	 */
	public String getIs_resultado() {
		return is_resultado;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad resultado.
	 *
	 * @param as_resultado el nuevo valor para la propiedad resultado
	 */
	public void setIs_resultado(String as_resultado) {
		this.is_resultado = as_resultado;
	}


}

/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: SeguimientoSolicitudesRespuestaDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: SeguimientoSolicitudesRespuestaDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

import java.util.List;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Seguimiento
 * solicitudes respuesta.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class SeguimientoSolicitudesRespuestaDTO extends GenericoDTO {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nir.
	 */
	private String is_nir;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * numero turno.
	 */
	private String is_numeroTurno;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * decision calificacion.
	 */
	private String is_decisionCalificacion;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * fase actual turno.
	 */
	private String is_faseActualTurno;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * proceso turno.
	 */
	private String is_procesoTurno;

	/**
	 * Atributo de instancia tipo lista de
	 * SeguimientoSolicitudesRespuestaMatriculasDTO para definir la propiedad lista
	 * seguimiento solicitudes respuesta matriculas.
	 */
	private List<SeguimientoSolicitudesRespuestaMatriculasDTO> ilssrm_listaSeguimientoSolicitudesRespuestaMatriculasDto;
	
	/**
	 * Atributo de instancia tipo lista de SeguimientoSolicitudesRespuestaDetalleDTO
	 * para definir la propiedad lista seguimiento solicitudes respuesta detalle.
	 */
	private List<SeguimientoSolicitudesRespuestaDetalleDTO> ilssrd_listaSeguimientoSolicitudesRespuestaDetalleDto;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * tipo.
	 */
	private String is_tipo;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * numero documento.
	 */
	private String is_numeroDocumento;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * fecha documento.
	 */
	private String is_fechaDocumento;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * oficina registro.
	 */
	private String is_oficinaRegistro;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * tipo oficina.
	 */
	private String is_tipoOficina;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * pais.
	 */
	private String is_pais;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * departamento.
	 */
	private String is_departamento;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * municipio.
	 */
	private String is_municipio;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * tipo entidad.
	 */
	private String is_tipoEntidad;

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
	 * Obtiene el valor para la propiedad numero turno.
	 *
	 * @return El valor de la propiedad numero turno
	 */
	public String getIs_numeroTurno() {
		return is_numeroTurno;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad numero turno.
	 *
	 * @param as_numeroTurno el nuevo valor para la propiedad numero turno
	 */
	public void setIs_numeroTurno(String as_numeroTurno) {
		this.is_numeroTurno = as_numeroTurno;
	}

	/**
	 * Obtiene el valor para la propiedad decision calificacion.
	 *
	 * @return El valor de la propiedad decision calificacion
	 */
	public String getIs_decisionCalificacion() {
		return is_decisionCalificacion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad decision calificacion.
	 *
	 * @param as_decisionCalificacion el nuevo valor para la propiedad decision
	 *                                calificacion
	 */
	public void setIs_decisionCalificacion(String as_decisionCalificacion) {
		this.is_decisionCalificacion = as_decisionCalificacion;
	}

	/**
	 * Obtiene el valor para la propiedad fase actual turno.
	 *
	 * @return El valor de la propiedad fase actual turno
	 */
	public String getIs_faseActualTurno() {
		return is_faseActualTurno;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad fase actual turno.
	 *
	 * @param as_faseActualTurno el nuevo valor para la propiedad fase actual turno
	 */
	public void setIs_faseActualTurno(String as_faseActualTurno) {
		this.is_faseActualTurno = as_faseActualTurno;
	}

	/**
	 * Obtiene el valor para la propiedad proceso turno.
	 *
	 * @return El valor de la propiedad proceso turno
	 */
	public String getIs_procesoTurno() {
		return is_procesoTurno;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad proceso turno.
	 *
	 * @param as_procesoTurno el nuevo valor para la propiedad proceso turno
	 */
	public void setIs_procesoTurno(String as_procesoTurno) {
		this.is_procesoTurno = as_procesoTurno;
	}

	/**
	 * Obtiene el valor para la propiedad tipo.
	 *
	 * @return El valor de la propiedad tipo
	 */
	public String getIs_tipo() {
		return is_tipo;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tipo.
	 *
	 * @param as_tipo el nuevo valor para la propiedad tipo
	 */
	public void setIs_tipo(String as_tipo) {
		this.is_tipo = as_tipo;
	}

	/**
	 * Obtiene el valor para la propiedad numero documento.
	 *
	 * @return El valor de la propiedad numero documento
	 */
	public String getIs_numeroDocumento() {
		return is_numeroDocumento;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad numero documento.
	 *
	 * @param as_numeroDocumento el nuevo valor para la propiedad numero documento
	 */
	public void setIs_numeroDocumento(String as_numeroDocumento) {
		this.is_numeroDocumento = as_numeroDocumento;
	}

	/**
	 * Obtiene el valor para la propiedad fecha documento.
	 *
	 * @return El valor de la propiedad fecha documento
	 */
	public String getIs_fechaDocumento() {
		return is_fechaDocumento;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad fecha documento.
	 *
	 * @param as_fechaDocumento el nuevo valor para la propiedad fecha documento
	 */
	public void setIs_fechaDocumento(String as_fechaDocumento) {
		this.is_fechaDocumento = as_fechaDocumento;
	}

	/**
	 * Obtiene el valor para la propiedad oficina registro.
	 *
	 * @return El valor de la propiedad oficina registro
	 */
	public String getIs_oficinaRegistro() {
		return is_oficinaRegistro;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad oficina registro.
	 *
	 * @param as_oficinaRegistro el nuevo valor para la propiedad oficina registro
	 */
	public void setIs_oficinaRegistro(String as_oficinaRegistro) {
		this.is_oficinaRegistro = as_oficinaRegistro;
	}

	/**
	 * Obtiene el valor para la propiedad tipo oficina.
	 *
	 * @return El valor de la propiedad tipo oficina
	 */
	public String getIs_tipoOficina() {
		return is_tipoOficina;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tipo oficina.
	 *
	 * @param as_tipoOficina el nuevo valor para la propiedad tipo oficina
	 */
	public void setIs_tipoOficina(String as_tipoOficina) {
		this.is_tipoOficina = as_tipoOficina;
	}

	/**
	 * Obtiene el valor para la propiedad pais.
	 *
	 * @return El valor de la propiedad pais
	 */
	public String getIs_pais() {
		return is_pais;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad pais.
	 *
	 * @param as_pais el nuevo valor para la propiedad pais
	 */
	public void setIs_pais(String as_pais) {
		this.is_pais = as_pais;
	}

	/**
	 * Obtiene el valor para la propiedad departamento.
	 *
	 * @return El valor de la propiedad departamento
	 */
	public String getIs_departamento() {
		return is_departamento;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad departamento.
	 *
	 * @param as_departamento el nuevo valor para la propiedad departamento
	 */
	public void setIs_departamento(String as_departamento) {
		this.is_departamento = as_departamento;
	}

	/**
	 * Obtiene el valor para la propiedad municipio.
	 *
	 * @return El valor de la propiedad municipio
	 */
	public String getIs_municipio() {
		return is_municipio;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad municipio.
	 *
	 * @param as_municipio el nuevo valor para la propiedad municipio
	 */
	public void setIs_municipio(String as_municipio) {
		this.is_municipio = as_municipio;
	}

	/**
	 * Obtiene el valor para la propiedad tipo entidad.
	 *
	 * @return El valor de la propiedad tipo entidad
	 */
	public String getIs_tipoEntidad() {
		return is_tipoEntidad;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tipo entidad.
	 *
	 * @param as_tipoEntidad el nuevo valor para la propiedad tipo entidad
	 */
	public void setIs_tipoEntidad(String as_tipoEntidad) {
		this.is_tipoEntidad = as_tipoEntidad;
	}

	/**
	 * Obtiene el valor para la propiedad lista seguimiento solicitudes respuesta
	 * matriculas dto.
	 *
	 * @return El valor de la propiedad lista seguimiento solicitudes respuesta
	 *         matriculas dto
	 */
	public List<SeguimientoSolicitudesRespuestaMatriculasDTO> getIlssrm_listaSeguimientoSolicitudesRespuestaMatriculasDto() {
		return ilssrm_listaSeguimientoSolicitudesRespuestaMatriculasDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad lista seguimiento solicitudes
	 * respuesta matriculas dto.
	 *
	 * @param alssrm_listaSeguimientoSolicitudesRespuestaMatriculasDto el nuevo
	 *                                                                 valor para la
	 *                                                                 propiedad
	 *                                                                 lista
	 *                                                                 seguimiento
	 *                                                                 solicitudes
	 *                                                                 respuesta
	 *                                                                 matriculas
	 *                                                                 dto
	 */
	public void setIlssrm_listaSeguimientoSolicitudesRespuestaMatriculasDto(
			List<SeguimientoSolicitudesRespuestaMatriculasDTO> alssrm_listaSeguimientoSolicitudesRespuestaMatriculasDto) {
		this.ilssrm_listaSeguimientoSolicitudesRespuestaMatriculasDto = alssrm_listaSeguimientoSolicitudesRespuestaMatriculasDto;
	}

	/**
	 * Obtiene el valor para la propiedad lista seguimiento solicitudes respuesta
	 * detalle dto.
	 *
	 * @return El valor de la propiedad lista seguimiento solicitudes respuesta
	 *         detalle dto
	 */
	public List<SeguimientoSolicitudesRespuestaDetalleDTO> getIlssrd_listaSeguimientoSolicitudesRespuestaDetalleDto() {
		return ilssrd_listaSeguimientoSolicitudesRespuestaDetalleDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad lista seguimiento solicitudes
	 * respuesta detalle dto.
	 *
	 * @param alssrd_listaSeguimientoSolicitudesRespuestaDetalleDto el nuevo valor
	 *                                                              para la
	 *                                                              propiedad lista
	 *                                                              seguimiento
	 *                                                              solicitudes
	 *                                                              respuesta
	 *                                                              detalle dto
	 */
	public void setIlssrd_listaSeguimientoSolicitudesRespuestaDetalleDto(
			List<SeguimientoSolicitudesRespuestaDetalleDTO> alssrd_listaSeguimientoSolicitudesRespuestaDetalleDto) {
		this.ilssrd_listaSeguimientoSolicitudesRespuestaDetalleDto = alssrd_listaSeguimientoSolicitudesRespuestaDetalleDto;
	}
}

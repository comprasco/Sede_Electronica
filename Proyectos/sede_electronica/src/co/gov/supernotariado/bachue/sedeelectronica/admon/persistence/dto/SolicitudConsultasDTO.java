/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: SolicitudConsultasDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: SolicitudConsultasDTO
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
 * Contiene propiedades para representar los datos del objeto Solicitud
 * consultas.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class SolicitudConsultasDTO extends TransaccionGenericaDTO {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo lista de DatosEntradaSolicitudConsultaDTO para
	 * definir la propiedad lista datos entrada solicitud consulta.
	 */
	@SerializedName("listaConsulta")
	private List<DatosEntradaSolicitudConsultaDTO> ildesc_listaDatosEntradaSolicitudConsultaDto;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo.
	 */
	@SerializedName("codigo")
	private String is_codigo;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * correo envio.
	 */
	@SerializedName("correoEnvio")
	private String is_correoEnvio;
	
	/**
	 * Atributo de instancia tipo ArchivoDTO para definir la propiedad archivo
	 * carga.
	 */
	@SerializedName("archivoCarga")
	private ArchivoDTO ia_archivoCarga;
	
	/**
	 * Atributo de instancia tipo ArchivoDTO para definir la propiedad archivo
	 * descarga.
	 */
	@SerializedName("archivoDescarga")
	private ArchivoDTO ia_archivoDescarga;
	
	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad paso
	 * resumen.
	 */
	@SerializedName("resumen")
	private Boolean ib_pasoResumen;
	
	/**
	 * Atributo de instancia tipo lista de String para definir la propiedad criterio
	 * busqueda identificacion.
	 */
	@SerializedName("listaCriterios")
	private List<String> ils_criterioBusquedaIdentificacion;
	
	/**
	 * Construye una nueva instancia/objeto de la clase SolicitudConsultasDTO.
	 *
	 * @param atg_transaccionGenericaDto el parametro transaccion generica dto
	 */
	public SolicitudConsultasDTO(TransaccionGenericaDTO atg_transaccionGenericaDto) {
		this.setIlsm_listaSalidaMatriculaDto(atg_transaccionGenericaDto.getIlsm_listaSalidaMatriculaDto());
		this.setIemts_enumModoTipoServicio(atg_transaccionGenericaDto.getIemts_enumModoTipoServicio());
		this.setIdc_detalleCatalogoDto(atg_transaccionGenericaDto.getIdc_detalleCatalogoDto());
		this.setIbd_valorTotal(atg_transaccionGenericaDto.getIbd_valorTotal());
		this.setIs_carritoVigente(atg_transaccionGenericaDto.getIs_carritoVigente());
		this.setIp_personaDto(atg_transaccionGenericaDto.getIp_personaDto());
		this.setIs_idAsociacion(atg_transaccionGenericaDto.getIs_idAsociacion());
	}
	
	/**
	 * Construye una nueva instancia/objeto de la clase SolicitudConsultasDTO.
	 */
	public SolicitudConsultasDTO() {
		// Constructor vacio
	}

	/**
	 * Obtiene el valor para la propiedad lista datos entrada solicitud consulta
	 * dto.
	 *
	 * @return El valor de la propiedad lista datos entrada solicitud consulta dto
	 */
	public List<DatosEntradaSolicitudConsultaDTO> getIldesc_listaDatosEntradaSolicitudConsultaDto() {
		return ildesc_listaDatosEntradaSolicitudConsultaDto;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad lista datos entrada solicitud
	 * consulta dto.
	 *
	 * @param aldesc_listaDatosEntradaSolicitudConsultaDto el nuevo valor para la
	 *                                                     propiedad lista datos
	 *                                                     entrada solicitud
	 *                                                     consulta dto
	 */
	public void setIldesc_listaDatosEntradaSolicitudConsultaDto(
			List<DatosEntradaSolicitudConsultaDTO> aldesc_listaDatosEntradaSolicitudConsultaDto) {
		this.ildesc_listaDatosEntradaSolicitudConsultaDto = aldesc_listaDatosEntradaSolicitudConsultaDto;
	}

	/**
	 * Obtiene el valor para la propiedad codigo.
	 *
	 * @return El valor de la propiedad codigo
	 */
	public String getIs_codigo() {
		return is_codigo;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad codigo.
	 *
	 * @param as_codigo el nuevo valor para la propiedad codigo
	 */
	public void setIs_codigo(String as_codigo) {
		this.is_codigo = as_codigo;
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
	 * Obtiene el valor para la propiedad archivo carga.
	 *
	 * @return El valor de la propiedad archivo carga
	 */
	public ArchivoDTO getIa_archivoCarga() {
		return ia_archivoCarga;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad archivo carga.
	 *
	 * @param aa_archivoCarga el nuevo valor para la propiedad archivo carga
	 */
	public void setIa_archivoCarga(ArchivoDTO aa_archivoCarga) {
		this.ia_archivoCarga = aa_archivoCarga;
	}

	/**
	 * Obtiene el valor para la propiedad archivo descarga.
	 *
	 * @return El valor de la propiedad archivo descarga
	 */
	public ArchivoDTO getIa_archivoDescarga() {
		return ia_archivoDescarga;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad archivo descarga.
	 *
	 * @param aa_archivoDescarga el nuevo valor para la propiedad archivo descarga
	 */
	public void setIa_archivoDescarga(ArchivoDTO aa_archivoDescarga) {
		this.ia_archivoDescarga = aa_archivoDescarga;
	}

	/**
	 * Obtiene el valor para la propiedad paso resumen.
	 *
	 * @return El valor de la propiedad paso resumen
	 */
	public Boolean getIb_pasoResumen() {
		return ib_pasoResumen;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad paso resumen.
	 *
	 * @param ab_pasoResumen el nuevo valor para la propiedad paso resumen
	 */
	public void setIb_pasoResumen(Boolean ab_pasoResumen) {
		this.ib_pasoResumen = ab_pasoResumen;
	}

	/**
	 * Obtiene el valor para la propiedad criterio busqueda identificacion.
	 *
	 * @return El valor de la propiedad criterio busqueda identificacion
	 */
	public List<String> getIls_criterioBusquedaIdentificacion() {
		return ils_criterioBusquedaIdentificacion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad criterio busqueda identificacion.
	 *
	 * @param als_criterioBusquedaIdentificacion el nuevo valor para la propiedad
	 *                                           criterio busqueda identificacion
	 */
	public void setIls_criterioBusquedaIdentificacion(List<String> als_criterioBusquedaIdentificacion) {
		this.ils_criterioBusquedaIdentificacion = als_criterioBusquedaIdentificacion;
	}
	
	
}

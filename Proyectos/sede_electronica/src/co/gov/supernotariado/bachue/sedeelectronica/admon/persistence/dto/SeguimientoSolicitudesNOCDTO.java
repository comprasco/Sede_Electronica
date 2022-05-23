/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: SeguimientoSolicitudesNOCDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: SeguimientoSolicitudesNOCDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Seguimiento
 * solicitudes NOC.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class SeguimientoSolicitudesNOCDTO extends GenericoDTO{

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo DepartamentoDTO para definir la propiedad
	 * departamento.
	 */
	private DepartamentoDTO id_departamentoDto;
	
	/**
	 * Atributo de instancia tipo MunicipioDTO para definir la propiedad municipio.
	 */
	private MunicipioDTO im_municipioDto;
	
	/**
	 * Atributo de instancia tipo CirculoRegistralDTO para definir la propiedad
	 * circulo registral.
	 */
	private CirculoRegistralDTO icr_circuloRegistralDto;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * fecha hora consulta.
	 */
	private String is_fechaHoraConsulta;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * fecha radicacion.
	 */
	private String is_fechaRadicacion;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * fecha instrumento.
	 */
	private String is_fechaInstrumento;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad num
	 * instrumento.
	 */
	private String is_numInstrumento;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad num
	 * tipo documento publico.
	 */
	private String is_numTipoDocumentoPublico;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad num
	 * consulta.
	 */
	private String is_numConsulta;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * descripcion mensaje.
	 */
	private String is_descripcionMensaje;
	
	/**
	 * Obtiene el valor para la propiedad departamento dto.
	 *
	 * @return El valor de la propiedad departamento dto
	 */
	public DepartamentoDTO getId_departamentoDto() {
		return id_departamentoDto;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad departamento dto.
	 *
	 * @param ad_departamentoDto el nuevo valor para la propiedad departamento dto
	 */
	public void setId_departamentoDto(DepartamentoDTO ad_departamentoDto) {
		this.id_departamentoDto = ad_departamentoDto;
	}
	
	/**
	 * Obtiene el valor para la propiedad municipio dto.
	 *
	 * @return El valor de la propiedad municipio dto
	 */
	public MunicipioDTO getIm_municipioDto() {
		return im_municipioDto;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad municipio dto.
	 *
	 * @param am_municipioDto el nuevo valor para la propiedad municipio dto
	 */
	public void setIm_municipioDto(MunicipioDTO am_municipioDto) {
		this.im_municipioDto = am_municipioDto;
	}
	
	/**
	 * Obtiene el valor para la propiedad circulo registral dto.
	 *
	 * @return El valor de la propiedad circulo registral dto
	 */
	public CirculoRegistralDTO getIcr_circuloRegistralDto() {
		return icr_circuloRegistralDto;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad circulo registral dto.
	 *
	 * @param acr_circuloRegistralDto el nuevo valor para la propiedad circulo
	 *                                registral dto
	 */
	public void setIcr_circuloRegistralDto(CirculoRegistralDTO acr_circuloRegistralDto) {
		this.icr_circuloRegistralDto = acr_circuloRegistralDto;
	}
	
	/**
	 * Obtiene el valor para la propiedad fecha hora consulta.
	 *
	 * @return El valor de la propiedad fecha hora consulta
	 */
	public String getIs_fechaHoraConsulta() {
		return is_fechaHoraConsulta;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad fecha hora consulta.
	 *
	 * @param as_fechaHoraConsulta el nuevo valor para la propiedad fecha hora
	 *                             consulta
	 */
	public void setIs_fechaHoraConsulta(String as_fechaHoraConsulta) {
		this.is_fechaHoraConsulta = as_fechaHoraConsulta;
	}
	
	/**
	 * Obtiene el valor para la propiedad fecha radicacion.
	 *
	 * @return El valor de la propiedad fecha radicacion
	 */
	public String getIs_fechaRadicacion() {
		return is_fechaRadicacion;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad fecha radicacion.
	 *
	 * @param as_fechaRadicacion el nuevo valor para la propiedad fecha radicacion
	 */
	public void setIs_fechaRadicacion(String as_fechaRadicacion) {
		this.is_fechaRadicacion = as_fechaRadicacion;
	}
	
	/**
	 * Obtiene el valor para la propiedad fecha instrumento.
	 *
	 * @return El valor de la propiedad fecha instrumento
	 */
	public String getIs_fechaInstrumento() {
		return is_fechaInstrumento;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad fecha instrumento.
	 *
	 * @param as_fechaInstrumento el nuevo valor para la propiedad fecha instrumento
	 */
	public void setIs_fechaInstrumento(String as_fechaInstrumento) {
		this.is_fechaInstrumento = as_fechaInstrumento;
	}
	
	/**
	 * Obtiene el valor para la propiedad num instrumento.
	 *
	 * @return El valor de la propiedad num instrumento
	 */
	public String getIs_numInstrumento() {
		return is_numInstrumento;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad num instrumento.
	 *
	 * @param as_numInstrumento el nuevo valor para la propiedad num instrumento
	 */
	public void setIs_numInstrumento(String as_numInstrumento) {
		this.is_numInstrumento = as_numInstrumento;
	}
	
	/**
	 * Obtiene el valor para la propiedad num tipo documento publico.
	 *
	 * @return El valor de la propiedad num tipo documento publico
	 */
	public String getIs_numTipoDocumentoPublico() {
		return is_numTipoDocumentoPublico;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad num tipo documento publico.
	 *
	 * @param as_numTipoDocumentoPublico el nuevo valor para la propiedad num tipo
	 *                                   documento publico
	 */
	public void setIs_numTipoDocumentoPublico(String as_numTipoDocumentoPublico) {
		this.is_numTipoDocumentoPublico = as_numTipoDocumentoPublico;
	}
	
	/**
	 * Obtiene el valor para la propiedad num consulta.
	 *
	 * @return El valor de la propiedad num consulta
	 */
	public String getIs_numConsulta() {
		return is_numConsulta;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad num consulta.
	 *
	 * @param as_numConsulta el nuevo valor para la propiedad num consulta
	 */
	public void setIs_numConsulta(String as_numConsulta) {
		this.is_numConsulta = as_numConsulta;
	}
	
	/**
	 * Obtiene el valor para la propiedad descripcion mensaje.
	 *
	 * @return El valor de la propiedad descripcion mensaje
	 */
	public String getIs_descripcionMensaje() {
		return is_descripcionMensaje;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad descripcion mensaje.
	 *
	 * @param as_descripcionMensaje el nuevo valor para la propiedad descripcion
	 *                              mensaje
	 */
	public void setIs_descripcionMensaje(String as_descripcionMensaje) {
		this.is_descripcionMensaje = as_descripcionMensaje;
	}
}

/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ModeloMinutaDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: ModeloMinutaDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

import java.util.List;

import org.primefaces.model.StreamedContent;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Modelo minuta.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ModeloMinutaDTO extends GenericoBaseDTO {
	
	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

/**
 * Atributo de instancia tipo arreglo de bytes para definir la propiedad
 * archivo.
 */
// --- Atributos
	private byte[] if_archivo;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * extension.
	 */
	private String is_extension;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * estado.
	 */
	private String is_estado;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nombre.
	 */
	private String is_nombre;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nombre documento.
	 */
	private String is_nombreDocumento;
	
	/**
	 * Atributo de instancia tipo lista de ModeloMinutaActoDTO para definir la
	 * propiedad modelo minuta actos.
	 */
	private List<ModeloMinutaActoDTO> ilmma_modeloMinutaActos;
	
	/**
	 * Atributo de instancia tipo StreamedContent para definir la propiedad archivo
	 * A descargar.
	 */
	private transient StreamedContent isc_archivoADescargar;

	/**
	 * Obtiene el valor para la propiedad archivo.
	 *
	 * @return El valor de la propiedad archivo
	 */
	public byte[] getIf_archivo() {
		return if_archivo;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad archivo.
	 *
	 * @param af_archivo el nuevo valor para la propiedad archivo
	 */
	public void setIf_archivo(byte[] af_archivo) {
		this.if_archivo = af_archivo;
	}

	/**
	 * Obtiene el valor para la propiedad extension.
	 *
	 * @return El valor de la propiedad extension
	 */
	public String getIs_extension() {
		return is_extension;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad extension.
	 *
	 * @param as_extension el nuevo valor para la propiedad extension
	 */
	public void setIs_extension(String as_extension) {
		this.is_extension = as_extension;
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

	/**
	 * Obtiene el valor para la propiedad nombre.
	 *
	 * @return El valor de la propiedad nombre
	 */
	public String getIs_nombre() {
		return is_nombre;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad nombre.
	 *
	 * @param as_nombre el nuevo valor para la propiedad nombre
	 */
	public void setIs_nombre(String as_nombre) {
		this.is_nombre = as_nombre;
	}

	/**
	 * Obtiene el valor para la propiedad modelo minuta actos.
	 *
	 * @return El valor de la propiedad modelo minuta actos
	 */
	public List<ModeloMinutaActoDTO> getIlmma_modeloMinutaActos() {
		return ilmma_modeloMinutaActos;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad modelo minuta actos.
	 *
	 * @param almma_modeloMinutaActos el nuevo valor para la propiedad modelo minuta
	 *                                actos
	 */
	public void setIlmma_modeloMinutaActos(List<ModeloMinutaActoDTO> almma_modeloMinutaActos) {
		this.ilmma_modeloMinutaActos = almma_modeloMinutaActos;
	}

	/**
	 * Obtiene el valor para la propiedad archivo A descargar.
	 *
	 * @return El valor de la propiedad archivo A descargar
	 */
	public StreamedContent getIsc_archivoADescargar() {
		return isc_archivoADescargar;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad archivo A descargar.
	 *
	 * @param asc_archivoADescargar el nuevo valor para la propiedad archivo A
	 *                              descargar
	 */
	public void setIsc_archivoADescargar(StreamedContent asc_archivoADescargar) {
		this.isc_archivoADescargar = asc_archivoADescargar;
	}

	/**
	 * Obtiene el valor para la propiedad nombre documento.
	 *
	 * @return El valor de la propiedad nombre documento
	 */
	public String getIs_nombreDocumento() {
		return is_nombreDocumento;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad nombre documento.
	 *
	 * @param as_nombreDocumento el nuevo valor para la propiedad nombre documento
	 */
	public void setIs_nombreDocumento(String as_nombreDocumento) {
		this.is_nombreDocumento = as_nombreDocumento;
	}

}

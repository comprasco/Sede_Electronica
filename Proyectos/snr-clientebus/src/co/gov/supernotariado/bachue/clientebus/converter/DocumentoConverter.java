/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: DocumentoConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.converter
 * Nombre del elemento: DocumentoConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.converter;

import co.gov.supernotariado.bachue.clientebus.consultatrazabilidad.types.consultatrazabilidad.DocumentosType;
import co.gov.supernotariado.bachue.clientebus.vo.consultartrazabilidad.DocumentoVO;

/**
 * Clase auxiliar (Converter) del proyecto Cliente BUS, que permite transformar
 * entre Value Object(VO) y ComplexType.<br>
 * <b>VO</b>, objeto que recibe o retorna el cliente de servicios cuando lo
 * invoca otra aplicacion o capa de negocio. <br>
 * <b>ComplexType</b>, objeto que representa un elemento especifico de un
 * esquema de servicios SOAP, relacionado a una representacion XML que sera
 * enviada o recibida al hacer ejecutar una operacion de un servicio. <br>
 * Contiene metodos de transformacion para el elemento u operacion Documento.
 * <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class DocumentoConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase DocumentoConverter.
	 */
	private DocumentoConverter() {
		// Metodo constructor privado y vacio
	}

	/**
	 * Metodo que convierte de ComplexType a VO ( De elemento especifico del esquema
	 * de un Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto con un resultado/salida de una peticion de
	 * Servicio SOAP, en un objeto de datos llamado VO; para ser retornado como
	 * resultado a la aplicacion o capa de negocio que consume el cliente de
	 * servicios. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> DocumentosType <b>a</b> DocumentoVO, <br>
	 * En otras palabras, <b>de</b> Documentos type (ComplexType relacionado a la
	 * representacion XML del servicio) <b>a</b> Documento objeto con valores de
	 * servicio.
	 *
	 * @param adt_documento el parametro que representa el complex type a convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como DocumentoVO.
	 */
	public static DocumentoVO tipoAVo(DocumentosType adt_documento) {

		DocumentoVO ld_documento = new DocumentoVO();

		ld_documento.setIs_fechaDocumento(adt_documento.getFechaDocumento());
		ld_documento.setIs_municipio(adt_documento.getMunicipio());
		ld_documento.setIs_numeroDocumento(adt_documento.getNumeroDocumento());
		ld_documento.setIs_oficinaOrigen(adt_documento.getOficinaOrigen());
		ld_documento.setIs_tipo(adt_documento.getTipo());
		ld_documento.setIs_tipoEntidad(adt_documento.getTipoEntidad());
		ld_documento.setIs_departamento(adt_documento.getDepartamento());
		ld_documento.setIs_tipoOficina(adt_documento.getTipoOficina());

		return ld_documento;
	}

}

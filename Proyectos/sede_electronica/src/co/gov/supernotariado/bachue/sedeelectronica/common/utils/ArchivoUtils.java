/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ArchivoUtils.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.utils
 * Nombre del elemento: ArchivoUtils
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.utils;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.io.FilenameUtils;
import org.apache.log4j.Logger;
import org.primefaces.model.UploadedFile;

import com.google.common.io.ByteStreams;

import co.gov.supernotariado.bachue.sedeelectronica.admon.exception.ExcepcionesNegocio;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ArchivoDTO;

/**
 * El elemento Class ArchivoUtils.<br>
 * Representa un/una archivo utils.<br>
 * Clase que se encarga de las utilidades en cuanto a uso de archivos (File,
 * inputStream, UploadedFile) etc.
 * 
 * @author SmartSoft Solutions S.A.S
 * @version 1.0
 */
public class ArchivoUtils {

	/**
	 * Define la constante CL_LOGGER.
	 */
	private static final Logger CL_LOGGER = Logger.getLogger(ArchivoUtils.class);

	/**
	 * Define la constante CS_PUNTOS_SUSPENSIVOS.
	 */
	private static final String CS_PUNTOS_SUSPENSIVOS = "...";

	/**
	 * Construye una nueva instancia/objeto de la clase ArchivoUtils.
	 */
	private ArchivoUtils() {
		throw new IllegalStateException("Utility class");
	}

	/**
	 * Metodo que permite cargar archivo acto administrativo para la creacion de
	 * persona entidad especial.
	 *
	 * @param auf_file el parametro file
	 * @return Resultado para cargar archivo retornado como ArchivoDTO
	 */
	public static ArchivoDTO cargarArchivo(UploadedFile auf_file) {
		ArchivoDTO la_archivoDto = null;
		try {
			la_archivoDto = new ArchivoDTO();
			la_archivoDto.setIs_extension('.' + FilenameUtils.getExtension(auf_file.getFileName()));
			String ls_nombreArchivo;
			if (auf_file.getFileName().length() > 150) {
				ls_nombreArchivo = auf_file.getFileName().substring(0, 142);
				ls_nombreArchivo += CS_PUNTOS_SUSPENSIVOS;
				ls_nombreArchivo += auf_file.getFileName().substring(auf_file.getFileName().lastIndexOf('.'));
			} else {
				ls_nombreArchivo = auf_file.getFileName();
			}
			la_archivoDto.setIs_nombreArchivo(ls_nombreArchivo);
			la_archivoDto.setIs_contentType(auf_file.getContentType());
			byte[] bytes = inputStreamAArregloBytes(auf_file.getInputstream());
			la_archivoDto.setIf_archivo(bytes);

		} catch (Exception ae_exception) {
			ae_exception.getMessage();
			CL_LOGGER.error(ae_exception.getMessage());
		}
		return la_archivoDto;
	}

	/**
	 * Metodo que recibe un arreglo de bytes y lo transforma en un <br>
	 * objeto tipo <b>UploadedFile</b>.
	 *
	 * @param ais_archivo el parametro archivo
	 * @return Resultado para input stream A arreglo bytes retornado como byte[]
	 */
	public static byte[] inputStreamAArregloBytes(InputStream ais_archivo) {
		try {
			return ByteStreams.toByteArray(ais_archivo);
		} catch (IOException ae_excepcion) {
			throw new ExcepcionesNegocio(ae_excepcion.getMessage());
		}
	}

	/**
	 * Metodo que procesa bytes para retornar el respectivo input stream.
	 *
	 * @param ab_archivo el parametro archivo
	 * @return Resultado para arreglo bytes A input stream retornado como
	 *         InputStream
	 */
	public static InputStream arregloBytesAInputStream(byte[] ab_archivo) {
		InputStream myInputStream;
		myInputStream = new ByteArrayInputStream(ab_archivo);
		return myInputStream;
	}

}

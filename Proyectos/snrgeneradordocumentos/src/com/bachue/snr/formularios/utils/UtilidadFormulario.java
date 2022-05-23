package com.bachue.snr.formularios.utils;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Base64;

import javax.imageio.ImageIO;

import com.bachue.snr.formularios.dto.comun.GenericoParametrosJasperDTO;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;

/**
 * 
 * @version 1.0
 * @author Smartsoft Solutions S.A.S
 * 
 */
public class UtilidadFormulario {

	private UtilidadFormulario() {
	}

	/**
	 * metodo que permite generar pdf de forma generica
	 * 
	 * @param as_nombrePlantilla nombre de la plantilla del formulario
	 * @param ac_datosFormulario Datos del formuario
	 * @return byte[] bytes del archivo
	 * @throws JRException
	 */
	public static byte[] generarPdf(String as_nombrePlantilla, GenericoParametrosJasperDTO agpj_parametros)
			throws JRException {

		JasperDesign ljd_jasperDiseno;
		JasperPrint ljp_jasperVista;
		JasperReport ljp_jasperReporte;

		InputStream lis_origenStream = Thread.currentThread().getContextClassLoader()
				.getResourceAsStream(as_nombrePlantilla);
		// Obtiene el reporte del archivo
		ljd_jasperDiseno = JRXmlLoader.load(lis_origenStream);
		// Compila el archivo
		ljp_jasperReporte = JasperCompileManager.compileReport(ljd_jasperDiseno);
		// Inyecta las variables en el informe
		ljp_jasperVista = JasperFillManager.fillReport(ljp_jasperReporte, agpj_parametros.getIhmso_parametros(),
				new JRBeanCollectionDataSource(agpj_parametros.getIfg_formulario()));

		ByteArrayOutputStream lbaos_arregloBytes = new ByteArrayOutputStream();
		JasperExportManager.exportReportToPdfStream(ljp_jasperVista, lbaos_arregloBytes);

		return lbaos_arregloBytes.toByteArray();

	}

	/**
	 * metodo que permite crear un BufferedImage de imagen
	 * 
	 * @param ab_imageData arreglo de bytes referente a la imagen
	 * @return BufferedImage
	 */
	public static BufferedImage createImageFromBytes(byte[] ab_imageData) {
		ByteArrayInputStream lbais_imagen = new ByteArrayInputStream(ab_imageData);
		try {
			return ImageIO.read(lbais_imagen);
		} catch (IOException aioe_excpcion) {
			throw new RuntimeException(aioe_excpcion);
		}
	}

	/**
	 * Metodo que permite descodificar archivos en base 64
	 * 
	 * @param ab_documentoSerializado bytes en 64
	 * @return elemento decodificado
	 */
	public static byte[] decodificarArchivoBase64(byte[] ab_documentoSerializado) {
		String ls_textocodificado = new String(ab_documentoSerializado);
		byte[] lb_arregloBiteDecodificado;
		lb_arregloBiteDecodificado = Base64.getDecoder().decode(ls_textocodificado.getBytes());
		return lb_arregloBiteDecodificado;
	}

}

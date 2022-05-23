/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: BeanArchivo.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean
 * Nombre del elemento: BeanArchivo
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ResourceBundle;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import com.mysql.jdbc.StringUtils;

import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IParametroBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumParametros;

/**
 * Clase tipo managed bean de la capa de UI (User Interface). <br>
 * Manipula operaciones y propiedades que permiten manejar <br>
 * la visualizacion de componentes JSF para Archivos.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@ManagedBean(name = "beanArchivo")
@ViewScoped
public class BeanArchivo implements Serializable {
	
	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo IParametroBusiness para definir la propiedad
	 * parametro business.
	 */
	@EJB
	private IParametroBusiness iip_parametroBusiness;
	
	/**
	 * Define la constante CS_LIMITE_PDF.
	 */
	private static final String CS_LIMITE_PDF = "mensaje.archivo.limiteTamano";
	
	/**
	 * Atributo de instancia tipo ResourceBundle para definir la propiedad bundle
	 * txt archivo.
	 */
	@ManagedProperty(value = "#{txt_archivos}")
	private transient ResourceBundle irb_bundleTxtArchivos;
	
	/**
	 * Define la constante CS_TAMANO_MAXIMO. 2 MB
	 */
	private static final String CS_TAMANO_MAXIMO = "2097152";
	
	/**
	 * Define la constante CL_DIVISION_MEGAS. 1 MB en bits
	 */
	private static final long CL_DIVISION_MEGAS = 1048576;
	
	/**
	 * Metodo que se encarga de consultar el tamano del archivo de los parametros
	 * 
	 * @return String valor parametrizado en BD del valor en bits
	 */
	public String validarTamanoArchivoPDF() {
		String ls_tamanoMaximo = iip_parametroBusiness.consultarParametro(EnumParametros.TAMANO_MAXIMO_PDF.getIs_nombreParametro()).getIs_valor();
		return (!(StringUtils.isNullOrEmpty(ls_tamanoMaximo))) ? ls_tamanoMaximo : CS_TAMANO_MAXIMO;
	}
	
	/**
	 * Metodo que se encarga de consultar el tamano del archivo de los parametros y realizar mensaje 
	 * de error cuando se pase el tamano
	 * 
	 * @return String mensaje de error internacionalizado por tamano maximo en PDF
	 */
	public String validarTamanoArchivoPDFError() {
		return validarTamanoArchivoDOCError();
	}
	
	/**
	 * Metodo que se encarga de consultar el tamano del archivo de los parametros
	 * 
	 * @return String valor parametrizado en BD del valor en bits
	 */
	public String validarTamanoArchivoDOC() {
		String ls_tamanoMaximo = iip_parametroBusiness.consultarParametro(EnumParametros.TAMANO_MAXIMO_DOC.getIs_nombreParametro()).getIs_valor();
		return (!(StringUtils.isNullOrEmpty(ls_tamanoMaximo))) ? ls_tamanoMaximo : CS_TAMANO_MAXIMO;
	}
	
	/**
	 * Metodo que se encarga de consultar el tamano del archivo de los parametros y realizar mensaje 
	 * de error cuando se pase el tamano
	 * 
	 * @return String mensaje de error internacionalizado por tamano maximo en PDF
	 */
	public String validarTamanoArchivoDOCError() {
		String ls_tamanoMaximo = iip_parametroBusiness.consultarParametro(EnumParametros.TAMANO_MAXIMO_PDF.getIs_nombreParametro()).getIs_valor();
		ls_tamanoMaximo = (!(StringUtils.isNullOrEmpty(ls_tamanoMaximo))) ? ls_tamanoMaximo : CS_TAMANO_MAXIMO;
		BigInteger lbi_valorBits = new BigInteger(ls_tamanoMaximo);
		String ls_valorMegas = lbi_valorBits.divide(BigInteger.valueOf(CL_DIVISION_MEGAS)).toString();
		ls_tamanoMaximo = String.format(irb_bundleTxtArchivos.getString(CS_LIMITE_PDF), ls_valorMegas);
		return ls_tamanoMaximo;
	}
	
	/**
	 * Metodo que se encarga de consultar el tamano del archivo de los parametros
	 * 
	 * @return String valor parametrizado en BD del valor en bits
	 */
	public String validarTamanoArchivoTXT() {
		String ls_tamanoMaximo = iip_parametroBusiness.consultarParametro(EnumParametros.TAMANO_MAXIMO_TXT.getIs_nombreParametro()).getIs_valor();
		return (!(StringUtils.isNullOrEmpty(ls_tamanoMaximo))) ? ls_tamanoMaximo : CS_TAMANO_MAXIMO;
	}
	
	/**
	 * Metodo que se encarga de consultar el tamano del archivo de los parametros y realizar mensaje 
	 * de error cuando se pase el tamano
	 * 
	 * @return String mensaje de error internacionalizado por tamano maximo en PDF
	 */
	public String validarTamanoArchivoTXTError() {
		String ls_tamanoMaximo = iip_parametroBusiness.consultarParametro(EnumParametros.TAMANO_MAXIMO_TXT.getIs_nombreParametro()).getIs_valor();
		ls_tamanoMaximo = (!(StringUtils.isNullOrEmpty(ls_tamanoMaximo))) ? ls_tamanoMaximo : CS_TAMANO_MAXIMO;
		BigInteger lbi_valorBits = new BigInteger(ls_tamanoMaximo);
		String ls_valorMegas = lbi_valorBits.divide(BigInteger.valueOf(CL_DIVISION_MEGAS)).toString();
		ls_tamanoMaximo = String.format(irb_bundleTxtArchivos.getString(CS_LIMITE_PDF), ls_valorMegas);
		return ls_tamanoMaximo;
	}

	/**
	 * Obtiene el valor para la propiedad bundle txt archivo.
	 *
	 * @return El valor de la propiedad bundle txt archivo
	 */
	public ResourceBundle getIrb_bundleTxtArchivos() {
		return irb_bundleTxtArchivos;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad bundle txt archivo.
	 *
	 * @param arb_bundleTxtArchivos el nuevo valor para la propiedad bundle txt
	 *                                archivo
	 */
	public void setIrb_bundleTxtArchivos(ResourceBundle arb_bundleTxtArchivos) {
		this.irb_bundleTxtArchivos = arb_bundleTxtArchivos;
	}
	
}

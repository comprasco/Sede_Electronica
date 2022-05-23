/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: InicializadorServletSpringSecurity.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.security
 * Nombre del elemento: InicializadorServletSpringSecurity
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.security;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * Clase que inicializa Servlet Spring. <br>
 * Extiende/especializa de la clase
 * AbstractAnnotationConfigDispatcherServletInitializer del framework spring
 * security
 * 
 * @author Smartsoft Solutions S.A.S Nota:
 * @version 1.0
 */
public class InicializadorServletSpringSecurity extends AbstractAnnotationConfigDispatcherServletInitializer {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.web.servlet.support.
	 * AbstractAnnotationConfigDispatcherServletInitializer#getRootConfigClasses()
	 */
	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] { ConfiguracionSpringSecurity.class };
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.web.servlet.support.
	 * AbstractAnnotationConfigDispatcherServletInitializer#getServletConfigClasses(
	 * )
	 */
	@Override
	protected Class<?>[] getServletConfigClasses() {
		Class<?>[] lc_clase;
		lc_clase = null;
		return lc_clase;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.springframework.web.servlet.support.AbstractDispatcherServletInitializer#
	 * getServletMappings()
	 */
	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}

}
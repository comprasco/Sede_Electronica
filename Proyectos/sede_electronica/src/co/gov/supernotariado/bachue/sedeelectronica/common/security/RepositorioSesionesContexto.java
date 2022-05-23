/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: RepositorioSesionesContexto.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.security
 * Nombre del elemento: RepositorioSesionesContexto
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.security;

import java.io.Serializable;

import org.springframework.security.web.context.HttpSessionSecurityContextRepository;

/**
 * Define de forma serializada un objeto de la clase
 * HttpSessionSecurityContextRepositorySerializable.<br>
 * Extiende/especializa de la clase HttpSessionSecurityContextRepository del
 * framework spring security
 * 
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class RepositorioSesionesContexto extends HttpSessionSecurityContextRepository implements Serializable {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = -3071498991435424112L;

	/**
	 * Construye una nueva instancia/objeto de la clase RepositorioSesionesContexto.
	 */
	public RepositorioSesionesContexto() {
		super();
	}

}

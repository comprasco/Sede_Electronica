/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: TipoEntradaEliminarProcAntiguoSistemaWSDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto
 * Nombre del elemento: TipoEntradaEliminarProcAntiguoSistemaWSDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.GenericoDTO;

/**
 * Clase tipo objeto de transferencia de datos para web service (WSDTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y servicios web.
 * <br>
 * Contiene propiedades para representar los datos del objeto Tipo entrada
 * eliminar proc antiguo sistema.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoEntradaEliminarProcAntiguoSistemaWSDTO extends GenericoDTO {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo entero para definir la propiedad id alerta.
	 */
	private Integer ii_idAlerta;
	
	/**
	 * Atributo de instancia tipo entero para definir la propiedad id antiguo
	 * sistema tierras.
	 */
	private Integer ii_idAntiguoSistemaTierras;

	/**
	 * Obtiene el valor para la propiedad id alerta.
	 *
	 * @return El valor de la propiedad id alerta
	 */
	public Integer getIi_idAlerta() {
		return ii_idAlerta;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad id alerta.
	 *
	 * @param ai_idAlerta el nuevo valor para la propiedad id alerta
	 */
	public void setIi_idAlerta(Integer ai_idAlerta) {
		this.ii_idAlerta = ai_idAlerta;
	}

	/**
	 * Obtiene el valor para la propiedad id antiguo sistema tierras.
	 *
	 * @return El valor de la propiedad id antiguo sistema tierras
	 */
	public Integer getIi_idAntiguoSistemaTierras() {
		return ii_idAntiguoSistemaTierras;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad id antiguo sistema tierras.
	 *
	 * @param ai_idAntiguoSistemaTierras el nuevo valor para la propiedad id antiguo
	 *                                   sistema tierras
	 */
	public void setIi_idAntiguoSistemaTierras(Integer ai_idAntiguoSistemaTierras) {
		this.ii_idAntiguoSistemaTierras = ai_idAntiguoSistemaTierras;
	}
}
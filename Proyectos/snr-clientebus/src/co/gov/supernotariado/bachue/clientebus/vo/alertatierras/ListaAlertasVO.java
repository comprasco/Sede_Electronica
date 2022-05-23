/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: ListaAlertasVO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.vo.alertatierras
 * Nombre del elemento: ListaAlertasVO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.vo.alertatierras;

import java.util.Date;

import co.gov.supernotariado.bachue.clientebus.vo.GenericoVO;

/**
 * Clase tipo objeto de valores de servicios (VO). <br>
 * Permite pasar datos de entrada o devolver los resultados al invocar una
 * operacion de un servicio, <br>
 * consumida usando el cliente bus. <br>
 * Contiene propiedades para representar los datos de entrada/salida del objeto
 * Lista alertas .
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ListaAlertasVO extends GenericoVO {
	
	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo entero para definir la propiedad id alerta.
	 */
	private Integer ii_idAlerta;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * estado alerta.
	 */
	private String is_estadoAlerta;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nombre entidad.
	 */
	private String is_nombreEntidad;
	
	/**
	 * Atributo de instancia tipo fecha para definir la propiedad fecha inscripcion.
	 */
	private Date id_fechaInscripcion;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo tipo documento publico.
	 */
	private String is_codTipoDocumentoPublico;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nombre comunidad etnica.
	 */
	private String is_nombreComunidadEtnica;

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
	 * Obtiene el valor para la propiedad estado alerta.
	 *
	 * @return El valor de la propiedad estado alerta
	 */
	public String getIs_estadoAlerta() {
		return is_estadoAlerta;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad estado alerta.
	 *
	 * @param as_estadoAlerta el nuevo valor para la propiedad estado alerta
	 */
	public void setIs_estadoAlerta(String as_estadoAlerta) {
		this.is_estadoAlerta = as_estadoAlerta;
	}

	/**
	 * Obtiene el valor para la propiedad nombre entidad.
	 *
	 * @return El valor de la propiedad nombre entidad
	 */
	public String getIs_nombreEntidad() {
		return is_nombreEntidad;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad nombre entidad.
	 *
	 * @param as_nombreEntidad el nuevo valor para la propiedad nombre entidad
	 */
	public void setIs_nombreEntidad(String as_nombreEntidad) {
		this.is_nombreEntidad = as_nombreEntidad;
	}

	/**
	 * Obtiene el valor para la propiedad fecha inscripcion.
	 *
	 * @return El valor de la propiedad fecha inscripcion
	 */
	public Date getId_fechaInscripcion() {
		return id_fechaInscripcion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad fecha inscripcion.
	 *
	 * @param ad_fechaInscripcion el nuevo valor para la propiedad fecha inscripcion
	 */
	public void setId_fechaInscripcion(Date ad_fechaInscripcion) {
		this.id_fechaInscripcion = ad_fechaInscripcion;
	}

	/**
	 * Obtiene el valor para la propiedad codigo tipo documento publico.
	 *
	 * @return El valor de la propiedad codigo tipo documento publico
	 */
	public String getIs_codTipoDocumentoPublico() {
		return is_codTipoDocumentoPublico;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad codigo tipo documento publico.
	 *
	 * @param as_codTipoDocumentoPublico el nuevo valor para la propiedad codigo
	 *                                   tipo documento publico
	 */
	public void setIs_codTipoDocumentoPublico(String as_codTipoDocumentoPublico) {
		this.is_codTipoDocumentoPublico = as_codTipoDocumentoPublico;
	}

	/**
	 * Obtiene el valor para la propiedad nombre comunidad etnica.
	 *
	 * @return El valor de la propiedad nombre comunidad etnica
	 */
	public String getIs_nombreComunidadEtnica() {
		return is_nombreComunidadEtnica;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad nombre comunidad etnica.
	 *
	 * @param as_nombreComunidadEtnica el nuevo valor para la propiedad nombre
	 *                                 comunidad etnica
	 */
	public void setIs_nombreComunidadEtnica(String as_nombreComunidadEtnica) {
		this.is_nombreComunidadEtnica = as_nombreComunidadEtnica;
	}

}

/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: TipoSalidaConsultarDatosRegistralesWSDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto
 * Nombre del elemento: TipoSalidaConsultarDatosRegistralesWSDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto;

import java.util.List;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.GenericoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.interfaces.ISalidaServicioWSDTO;

/**
 * Clase tipo objeto de transferencia de datos para web service (WSDTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y servicios web.
 * <br>
 * Contiene propiedades para representar los datos del objeto Tipo salida
 * consultar datos registrales.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoSalidaConsultarDatosRegistralesWSDTO extends GenericoDTO implements ISalidaServicioWSDTO {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo lista de MatriculaDatosRegistralesWSDTO para
	 * definir la propiedad matriculas.
	 */
	private List<MatriculaDatosRegistralesWSDTO> ilmdr_matriculas;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * cantidad matriculas.
	 */
	private String is_cantidadMatriculas;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo mensaje.
	 */
	private String is_codigoMensaje;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * descripcion mensaje.
	 */
	private String is_descripcionMensaje;

	/**
	 * Obtiene el valor para la propiedad matriculas.
	 *
	 * @return El valor de la propiedad matriculas
	 */
	public List<MatriculaDatosRegistralesWSDTO> getIlmdr_matriculas() {
		return ilmdr_matriculas;
	}
	
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.interfaces.ISalidaServicioWSDTO#getIs_codigoMensaje()
	 */
	public String getIs_codigoMensaje() {
		return is_codigoMensaje;
	}
	
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.interfaces.ISalidaServicioWSDTO#getIs_descripcionMensaje()
	 */
	public String getIs_descripcionMensaje() {
		return is_descripcionMensaje;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad matriculas.
	 *
	 * @param altscdr_matriculas el nuevo valor para la propiedad matriculas
	 */
	public void setIlmdr_matriculas(List<MatriculaDatosRegistralesWSDTO> altscdr_matriculas) {
		this.ilmdr_matriculas = altscdr_matriculas;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad codigo mensaje.
	 *
	 * @param as_codigoMensaje el nuevo valor para la propiedad codigo mensaje
	 */
	public void setIs_codigoMensaje(String as_codigoMensaje) {
		this.is_codigoMensaje = as_codigoMensaje;
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
	
	/**
	 * Obtiene el valor para la propiedad cantidad matriculas.
	 *
	 * @return El valor de la propiedad cantidad matriculas
	 */
	public String getIs_cantidadMatriculas() {
		return is_cantidadMatriculas;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad cantidad matriculas.
	 *
	 * @param as_cantidadMatriculas el nuevo valor para la propiedad cantidad
	 *                              matriculas
	 */
	public void setIs_cantidadMatriculas(String as_cantidadMatriculas) {
		this.is_cantidadMatriculas = as_cantidadMatriculas;
	}		

}

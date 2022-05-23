/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: TipoSalidaObtenerCausalesCorreccionWSDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto
 * Nombre del elemento: TipoSalidaObtenerCausalesCorreccionWSDTO
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
 * obtener causales correccion.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoSalidaObtenerCausalesCorreccionWSDTO extends GenericoDTO implements ISalidaServicioWSDTO{

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
    
    /**
	 * Atributo de instancia tipo lista de CausalWSDTO para definir la propiedad
	 * lista causal wsdto.
	 */
    private List<CausalWSDTO> ilc_listaCausalWsdto;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo.
	 */
    private String is_codigo;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * mensaje.
	 */
    private String is_mensaje;
    
	/**
	 * Cambia/actualiza el valor para la propiedad codigo.
	 *
	 * @param as_codigo el nuevo valor para la propiedad codigo
	 */
	public void setIs_codigo(String as_codigo) {
		this.is_codigo = as_codigo;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad mensaje.
	 *
	 * @param as_mensaje el nuevo valor para la propiedad mensaje
	 */
	public void setIs_mensaje(String as_mensaje) {
		this.is_mensaje = as_mensaje;
	}
	
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.interfaces.ISalidaServicioWSDTO#getIs_codigoMensaje()
	 */
	@Override
	public String getIs_codigoMensaje() {
		return is_codigo;
	}
	
	/**
	 * Obtiene el valor para la propiedad lista causal web service dto.
	 *
	 * @return El valor de la propiedad lista causal web service dto
	 */
	public List<CausalWSDTO> getIlc_listaCausalWsdto() {
		return ilc_listaCausalWsdto;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad lista causal web service dto.
	 *
	 * @param alc_listaCausalWsdto el nuevo valor para la propiedad lista causal web
	 *                             service dto
	 */
	public void setIlc_listaCausalWsdto(List<CausalWSDTO> alc_listaCausalWsdto) {
		this.ilc_listaCausalWsdto = alc_listaCausalWsdto;
	}
	
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.interfaces.ISalidaServicioWSDTO#getIs_descripcionMensaje()
	 */
	@Override
	public String getIs_descripcionMensaje() {
		return is_mensaje;
	}

}

/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: TipoEntradaIngresoSolicitudWSDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto
 * Nombre del elemento: TipoEntradaIngresoSolicitudWSDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */

package co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto;

import java.util.List;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.GenericoDTO;

/**
 * Clase tipo objeto de transferencia de datos para web service (WSDTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y servicios web.
 * <br>
 * Contiene propiedades para representar los datos del objeto Tipo entrada
 * ingreso solicitud.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoEntradaIngresoSolicitudWSDTO extends GenericoDTO{

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo lista de InteresadoWSDTO para definir la propiedad
	 * lista interesado wsdto.
	 */
	private List<InteresadoWSDTO> ili_listaInteresadoWsdto;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * observacion.
	 */
    private String is_observacion;
    
    /**
	 * Atributo de instancia tipo lista de MatriculaCorreccionWSDTO para definir la
	 * propiedad lista matricula wsdto.
	 */
    private List<MatriculaCorreccionWSDTO> ilm_listaMatriculaWsdto;
    
	/**
	 * Obtiene el valor para la propiedad observacion.
	 *
	 * @return El valor de la propiedad observacion
	 */
	public String getIs_observacion() {
		return is_observacion;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad observacion.
	 *
	 * @param as_observacion el nuevo valor para la propiedad observacion
	 */
	public void setIs_observacion(String as_observacion) {
		this.is_observacion = as_observacion;
	}
	
	/**
	 * Obtiene el valor para la propiedad lista interesado web service dto.
	 *
	 * @return El valor de la propiedad lista interesado web service dto
	 */
	public List<InteresadoWSDTO> getIli_listaInteresadoWsdto() {
		return ili_listaInteresadoWsdto;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad lista interesado web service dto.
	 *
	 * @param ali_listaInteresadoWsdto el nuevo valor para la propiedad lista
	 *                                 interesado web service dto
	 */
	public void setIli_listaInteresadoWsdto(List<InteresadoWSDTO> ali_listaInteresadoWsdto) {
		this.ili_listaInteresadoWsdto = ali_listaInteresadoWsdto;
	}
	
	/**
	 * Obtiene el valor para la propiedad lista matricula web service dto.
	 *
	 * @return El valor de la propiedad lista matricula web service dto
	 */
	public List<MatriculaCorreccionWSDTO> getIlm_listaMatriculaWsdto() {
		return ilm_listaMatriculaWsdto;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad lista matricula web service dto.
	 *
	 * @param alm_listaMatriculaWsdto el nuevo valor para la propiedad lista
	 *                                matricula web service dto
	 */
	public void setIlm_listaMatriculaWsdto(List<MatriculaCorreccionWSDTO> alm_listaMatriculaWsdto) {
		this.ilm_listaMatriculaWsdto = alm_listaMatriculaWsdto;
	}

}

/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: SolicitudWSDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto
 * Nombre del elemento: SolicitudWSDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto;

import java.util.Date;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.GenericoDTO;

/**
 * Clase tipo objeto de transferencia de datos para web service (WSDTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y servicios web.
 * <br>
 * Contiene propiedades para representar los datos del objeto Solicitud.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class SolicitudWSDTO extends GenericoDTO{

/**
 * Define la constante serialVersionUID.
 */
private static final long serialVersionUID = 1L;
	
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nir.
	 */
    private String is_nir;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * descripcion servicio.
	 */
    private String is_descripcionServicio;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * descripcion sub servicio.
	 */
    private String is_descripcionSubServicio;
    
    /**
	 * Atributo de instancia tipo fecha para definir la propiedad fecha servicio.
	 */
    private Date id_fechaServicio;
    
	/**
	 * Obtiene el valor para la propiedad nir.
	 *
	 * @return El valor de la propiedad nir
	 */
	public String getIs_nir() {
		return is_nir;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad nir.
	 *
	 * @param as_nir el nuevo valor para la propiedad nir
	 */
	public void setIs_nir(String as_nir) {
		this.is_nir = as_nir;
	}
	
	/**
	 * Obtiene el valor para la propiedad descripcion servicio.
	 *
	 * @return El valor de la propiedad descripcion servicio
	 */
	public String getIs_descripcionServicio() {
		return is_descripcionServicio;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad descripcion servicio.
	 *
	 * @param as_descripcionServicio el nuevo valor para la propiedad descripcion
	 *                               servicio
	 */
	public void setIs_descripcionServicio(String as_descripcionServicio) {
		this.is_descripcionServicio = as_descripcionServicio;
	}
	
	/**
	 * Obtiene el valor para la propiedad descripcion sub servicio.
	 *
	 * @return El valor de la propiedad descripcion sub servicio
	 */
	public String getIs_descripcionSubServicio() {
		return is_descripcionSubServicio;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad descripcion sub servicio.
	 *
	 * @param as_descripcionSubServicio el nuevo valor para la propiedad descripcion
	 *                                  sub servicio
	 */
	public void setIs_descripcionSubServicio(String as_descripcionSubServicio) {
		this.is_descripcionSubServicio = as_descripcionSubServicio;
	}
	
	/**
	 * Obtiene el valor para la propiedad fecha servicio.
	 *
	 * @return El valor de la propiedad fecha servicio
	 */
	public Date getId_fechaServicio() {
		return id_fechaServicio;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad fecha servicio.
	 *
	 * @param ad_fechaServicio el nuevo valor para la propiedad fecha servicio
	 */
	public void setId_fechaServicio(Date ad_fechaServicio) {
		this.id_fechaServicio = ad_fechaServicio;
	}
}

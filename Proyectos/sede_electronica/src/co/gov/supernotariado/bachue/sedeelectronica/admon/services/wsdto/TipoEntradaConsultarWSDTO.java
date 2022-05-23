/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: TipoEntradaConsultarWSDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto
 * Nombre del elemento: TipoEntradaConsultarWSDTO
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
 * consultar.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoEntradaConsultarWSDTO extends GenericoDTO{

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * sistema origen.
	 */
	private String is_sistemaOrigen;
    
    /**
	 * Atributo de instancia tipo lista de ParametroBusquedaDocumentoWSDTO para
	 * definir la propiedad lista parametros vo.
	 */
    private List<ParametroBusquedaDocumentoWSDTO> ilp_listaParametrosVo;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * repositorio.
	 */
    private String is_repositorio;
    
	/**
	 * Obtiene el valor para la propiedad sistema origen.
	 *
	 * @return El valor de la propiedad sistema origen
	 */
	public String getIs_sistemaOrigen() {
		return is_sistemaOrigen;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad sistema origen.
	 *
	 * @param as_sistemaOrigen el nuevo valor para la propiedad sistema origen
	 */
	public void setIs_sistemaOrigen(String as_sistemaOrigen) {
		this.is_sistemaOrigen = as_sistemaOrigen;
	}
	
	/**
	 * Obtiene el valor para la propiedad lista parametros objeto con valores de
	 * servicio.
	 *
	 * @return El valor de la propiedad lista parametros objeto con valores de
	 *         servicio
	 */
	public List<ParametroBusquedaDocumentoWSDTO> getIlp_listaParametrosVo() {
		return ilp_listaParametrosVo;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad lista parametros objeto con
	 * valores de servicio.
	 *
	 * @param alp_listaParametrosVo el nuevo valor para la propiedad lista
	 *                              parametros objeto con valores de servicio
	 */
	public void setIlp_listaParametrosVo(List<ParametroBusquedaDocumentoWSDTO> alp_listaParametrosVo) {
		this.ilp_listaParametrosVo = alp_listaParametrosVo;
	}
	
	/**
	 * Obtiene el valor para la propiedad repositorio.
	 *
	 * @return El valor de la propiedad repositorio
	 */
	public String getIs_repositorio() {
		return is_repositorio;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad repositorio.
	 *
	 * @param as_repositorio el nuevo valor para la propiedad repositorio
	 */
	public void setIs_repositorio(String as_repositorio) {
		this.is_repositorio = as_repositorio;
	}
    
}

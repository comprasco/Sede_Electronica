/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: TipoEntradaEnviarDocumentoWSDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto
 * Nombre del elemento: TipoEntradaEnviarDocumentoWSDTO
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
 * enviar documento.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoEntradaEnviarDocumentoWSDTO extends GenericoDTO{

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
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * repositorio.
	 */
	private String is_repositorio;
	
	/**
	 * Atributo de instancia tipo lista de TipoParametroWSDTO para definir la
	 * propiedad lista tipo parametro.
	 */
	private List<TipoParametroWSDTO> iltp_listaTipoParametro;
	
	/**
	 * Atributo de instancia tipo arreglo de bytes para definir la propiedad
	 * archivo.
	 */
	private byte[] ib_archivo;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nombre archivo.
	 */
	private String is_nombreArchivo;
	
	
	/**
	 * Obtiene el valor para la propiedad lista tipo parametro.
	 *
	 * @return El valor de la propiedad lista tipo parametro
	 */
	public List<TipoParametroWSDTO> getIltp_listaTipoParametro() {
		return iltp_listaTipoParametro;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad lista tipo parametro.
	 *
	 * @param altp_listaTipoParametro el nuevo valor para la propiedad lista tipo
	 *                                parametro
	 */
	public void setIltp_listaTipoParametro(List<TipoParametroWSDTO> altp_listaTipoParametro) {
		this.iltp_listaTipoParametro = altp_listaTipoParametro;
	}
	
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
	 * Obtiene el valor para la propiedad archivo.
	 *
	 * @return El valor de la propiedad archivo
	 */
	public byte[] getIb_archivo() {
		return ib_archivo;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad archivo.
	 *
	 * @param ab_archivo el nuevo valor para la propiedad archivo
	 */
	public void setIb_archivo(byte[] ab_archivo) {
		this.ib_archivo = ab_archivo;
	}
	
	/**
	 * Obtiene el valor para la propiedad nombre archivo.
	 *
	 * @return El valor de la propiedad nombre archivo
	 */
	public String getIs_nombreArchivo() {
		return is_nombreArchivo;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad nombre archivo.
	 *
	 * @param as_nombreArchivo el nuevo valor para la propiedad nombre archivo
	 */
	public void setIs_nombreArchivo(String as_nombreArchivo) {
		this.is_nombreArchivo = as_nombreArchivo;
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
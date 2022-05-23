/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: TipoEntradaConsultarAlertasVO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.vo.alertatierras
 * Nombre del elemento: TipoEntradaConsultarAlertasVO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.vo.alertatierras;

import java.util.Date;

import co.gov.supernotariado.bachue.clientebus.vo.ClienteIntegracionVO;

/**
 * Clase tipo objeto de valores de servicios (VO). <br>
 * Permite pasar datos de entrada o devolver los resultados al invocar una
 * operacion de un servicio, <br>
 * consumida usando el cliente bus. <br>
 * Contiene propiedades para representar los datos de entrada/salida del objeto
 * Tipo entrada consultar alertas .
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoEntradaConsultarAlertasVO extends ClienteIntegracionVO {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad es
	 * SNR.
	 */
	private String is_esSNR;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo estado.
	 */
	private String is_codigoEstado;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad id
	 * entidad.
	 */
	private String is_idEntidad;
	
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
	 * codigo circulo registral.
	 */
	private String is_codCirculoRegistral;
	
	/**
	 * Atributo de instancia tipo entero para definir la propiedad numero matricula
	 * inmobiliaria.
	 */
	private Integer ii_numMatriculaInmobiliaria;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nombre comunidad etnica.
	 */
	private String is_nombreComunidadEtnica;

	/**
	 * Obtiene el valor para la propiedad es SNR.
	 *
	 * @return El valor de la propiedad es SNR
	 */
	public String getIs_esSNR() {
		return is_esSNR;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad es SNR.
	 *
	 * @param as_esSNR el nuevo valor para la propiedad es SNR
	 */
	public void setIs_esSNR(String as_esSNR) {
		this.is_esSNR = as_esSNR;
	}

	/**
	 * Obtiene el valor para la propiedad codigo estado.
	 *
	 * @return El valor de la propiedad codigo estado
	 */
	public String getIs_codigoEstado() {
		return is_codigoEstado;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad codigo estado.
	 *
	 * @param as_codigoEstado el nuevo valor para la propiedad codigo estado
	 */
	public void setIs_codigoEstado(String as_codigoEstado) {
		this.is_codigoEstado = as_codigoEstado;
	}

	/**
	 * Obtiene el valor para la propiedad id entidad.
	 *
	 * @return El valor de la propiedad id entidad
	 */
	public String getIs_idEntidad() {
		return is_idEntidad;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad id entidad.
	 *
	 * @param as_idEntidad el nuevo valor para la propiedad id entidad
	 */
	public void setIs_idEntidad(String as_idEntidad) {
		this.is_idEntidad = as_idEntidad;
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
	 * Obtiene el valor para la propiedad numero matricula inmobiliaria.
	 *
	 * @return El valor de la propiedad numero matricula inmobiliaria
	 */
	public Integer getIi_numMatriculaInmobiliaria() {
		return ii_numMatriculaInmobiliaria;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad numero matricula inmobiliaria.
	 *
	 * @param ai_numMatriculaInmobiliaria el nuevo valor para la propiedad numero
	 *                                    matricula inmobiliaria
	 */
	public void setIi_numMatriculaInmobiliaria(Integer ai_numMatriculaInmobiliaria) {
		this.ii_numMatriculaInmobiliaria = ai_numMatriculaInmobiliaria;
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

	/**
	 * Obtiene el valor para la propiedad codigo circulo registral.
	 *
	 * @return El valor de la propiedad codigo circulo registral
	 */
	public String getIs_codCirculoRegistral() {
		return is_codCirculoRegistral;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad codigo circulo registral.
	 *
	 * @param as_codCirculoRegistral el nuevo valor para la propiedad codigo circulo
	 *                               registral
	 */
	public void setIs_codCirculoRegistral(String as_codCirculoRegistral) {
		this.is_codCirculoRegistral = as_codCirculoRegistral;
	}

}

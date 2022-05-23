/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: ResponsabilidadVO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.vo.consultarrrrmatriculas
 * Nombre del elemento: ResponsabilidadVO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.vo.consultarrrrmatriculas;

import java.util.Date;
import java.util.List;

import co.gov.supernotariado.bachue.clientebus.vo.GenericoVO;

/**
 * Clase tipo objeto de valores de servicios (VO). <br>
 * Permite pasar datos de entrada o devolver los resultados al invocar una
 * operacion de un servicio, <br>
 * consumida usando el cliente bus. <br>
 * Contiene propiedades para representar los datos de entrada/salida del objeto
 * Responsabilidad .
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ResponsabilidadVO extends GenericoVO {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * numero anotacion.
	 */
	private String is_numAnotacion;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * comentario.
	 */
	private String is_comentario;
	
	/**
	 * Atributo de instancia tipo fecha para definir la propiedad fecha anotacion.
	 */
	private Date id_fechaAnotacion;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo naturaleza juridica folio.
	 */
	private String is_codNaturalezaJuridicaFolio;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nombre naturaleza juridica folio.
	 */
	private String is_nomNaturalezaJuridicaFolio;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * dominio DRR.
	 */
	private String is_dominioDRR;
	
	/**
	 * Atributo de instancia tipo lista de IntervinienteVO para definir la propiedad
	 * intervinientes.
	 */
	private List<IntervinienteVO> ili_intervinientes;

	/**
	 * Obtiene el valor para la propiedad numero anotacion.
	 *
	 * @return El valor de la propiedad numero anotacion
	 */
	public String getIs_numAnotacion() {
		return is_numAnotacion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad numero anotacion.
	 *
	 * @param as_numAnotacion el nuevo valor para la propiedad numero anotacion
	 */
	public void setIs_numAnotacion(String as_numAnotacion) {
		this.is_numAnotacion = as_numAnotacion;
	}

	/**
	 * Obtiene el valor para la propiedad comentario.
	 *
	 * @return El valor de la propiedad comentario
	 */
	public String getIs_comentario() {
		return is_comentario;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad comentario.
	 *
	 * @param as_comentario el nuevo valor para la propiedad comentario
	 */
	public void setIs_comentario(String as_comentario) {
		this.is_comentario = as_comentario;
	}

	/**
	 * Obtiene el valor para la propiedad fecha anotacion.
	 *
	 * @return El valor de la propiedad fecha anotacion
	 */
	public Date getId_fechaAnotacion() {
		return id_fechaAnotacion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad fecha anotacion.
	 *
	 * @param ad_fechaAnotacion el nuevo valor para la propiedad fecha anotacion
	 */
	public void setId_fechaAnotacion(Date ad_fechaAnotacion) {
		this.id_fechaAnotacion = ad_fechaAnotacion;
	}

	/**
	 * Obtiene el valor para la propiedad codigo naturaleza juridica folio.
	 *
	 * @return El valor de la propiedad codigo naturaleza juridica folio
	 */
	public String getIs_codNaturalezaJuridicaFolio() {
		return is_codNaturalezaJuridicaFolio;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad codigo naturaleza juridica folio.
	 *
	 * @param as_codNaturalezaJuridicaFolio el nuevo valor para la propiedad codigo
	 *                                      naturaleza juridica folio
	 */
	public void setIs_codNaturalezaJuridicaFolio(String as_codNaturalezaJuridicaFolio) {
		this.is_codNaturalezaJuridicaFolio = as_codNaturalezaJuridicaFolio;
	}

	/**
	 * Obtiene el valor para la propiedad nombre naturaleza juridica folio.
	 *
	 * @return El valor de la propiedad nombre naturaleza juridica folio
	 */
	public String getIs_nomNaturalezaJuridicaFolio() {
		return is_nomNaturalezaJuridicaFolio;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad nombre naturaleza juridica folio.
	 *
	 * @param as_nomNaturalezaJuridicaFolio el nuevo valor para la propiedad nombre
	 *                                      naturaleza juridica folio
	 */
	public void setIs_nomNaturalezaJuridicaFolio(String as_nomNaturalezaJuridicaFolio) {
		this.is_nomNaturalezaJuridicaFolio = as_nomNaturalezaJuridicaFolio;
	}

	/**
	 * Obtiene el valor para la propiedad dominio DRR.
	 *
	 * @return El valor de la propiedad dominio DRR
	 */
	public String getIs_dominioDRR() {
		return is_dominioDRR;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad dominio DRR.
	 *
	 * @param as_dominioDRR el nuevo valor para la propiedad dominio DRR
	 */
	public void setIs_dominioDRR(String as_dominioDRR) {
		this.is_dominioDRR = as_dominioDRR;
	}

	/**
	 * Obtiene el valor para la propiedad intervinientes.
	 *
	 * @return El valor de la propiedad intervinientes
	 */
	public List<IntervinienteVO> getIli_intervinientes() {
		return ili_intervinientes;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad intervinientes.
	 *
	 * @param ali_intervinientes el nuevo valor para la propiedad intervinientes
	 */
	public void setIli_intervinientes(List<IntervinienteVO> ali_intervinientes) {
		this.ili_intervinientes = ali_intervinientes;
	}

}

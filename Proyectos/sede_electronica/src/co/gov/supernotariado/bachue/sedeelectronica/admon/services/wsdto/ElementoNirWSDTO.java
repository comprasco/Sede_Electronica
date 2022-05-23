/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ElementoNirWSDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto
 * Nombre del elemento: ElementoNirWSDTO
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
 * Contiene propiedades para representar los datos del objeto Elemento nir.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ElementoNirWSDTO extends GenericoDTO {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * turno.
	 */
	private String is_turno;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * orip.
	 */
	private String is_orip;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * decision calificacion.
	 */
	private String is_decisionCalificacion;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * fase actual turno.
	 */
	private String is_faseActualTurno;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * proceso turno.
	 */
	private String is_procesoTurno;
	
	/**
	 * Atributo de instancia tipo lista de DocumentoWSDTO para definir la propiedad
	 * documentos.
	 */
	private List<DocumentoWSDTO> ild_documentos;
	
	/**
	 * Atributo de instancia tipo lista de MatriculaWSDTO para definir la propiedad
	 * matriculas.
	 */
	private List<MatriculaWSDTO> ilm_matriculas;
	
	/**
	 * Atributo de instancia tipo lista de TrazabilidadWSDTO para definir la
	 * propiedad trazabilidades.
	 */
	private List<TrazabilidadWSDTO> ilt_trazabilidades;
	
	/**
	 * Obtiene el valor para la propiedad turno.
	 *
	 * @return El valor de la propiedad turno
	 */
	public String getIs_turno() {
		return is_turno;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad turno.
	 *
	 * @param as_turno el nuevo valor para la propiedad turno
	 */
	public void setIs_turno(String as_turno) {
		this.is_turno = as_turno;
	}
	
	/**
	 * Obtiene el valor para la propiedad orip.
	 *
	 * @return El valor de la propiedad orip
	 */
	public String getIs_orip() {
		return is_orip;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad orip.
	 *
	 * @param as_orip el nuevo valor para la propiedad orip
	 */
	public void setIs_orip(String as_orip) {
		this.is_orip = as_orip;
	}
	
	/**
	 * Obtiene el valor para la propiedad decision calificacion.
	 *
	 * @return El valor de la propiedad decision calificacion
	 */
	public String getIs_decisionCalificacion() {
		return is_decisionCalificacion;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad decision calificacion.
	 *
	 * @param as_decisionCalificacion el nuevo valor para la propiedad decision
	 *                                calificacion
	 */
	public void setIs_decisionCalificacion(String as_decisionCalificacion) {
		this.is_decisionCalificacion = as_decisionCalificacion;
	}
	
	/**
	 * Obtiene el valor para la propiedad fase actual turno.
	 *
	 * @return El valor de la propiedad fase actual turno
	 */
	public String getIs_faseActualTurno() {
		return is_faseActualTurno;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad fase actual turno.
	 *
	 * @param as_faseActualTurno el nuevo valor para la propiedad fase actual turno
	 */
	public void setIs_faseActualTurno(String as_faseActualTurno) {
		this.is_faseActualTurno = as_faseActualTurno;
	}
	
	/**
	 * Obtiene el valor para la propiedad proceso turno.
	 *
	 * @return El valor de la propiedad proceso turno
	 */
	public String getIs_procesoTurno() {
		return is_procesoTurno;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad proceso turno.
	 *
	 * @param as_procesoTurno el nuevo valor para la propiedad proceso turno
	 */
	public void setIs_procesoTurno(String as_procesoTurno) {
		this.is_procesoTurno = as_procesoTurno;
	}
	
	/**
	 * Obtiene el valor para la propiedad documentos.
	 *
	 * @return El valor de la propiedad documentos
	 */
	public List<DocumentoWSDTO> getIld_documentos() {
		return ild_documentos;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad documentos.
	 *
	 * @param ald_documentos el nuevo valor para la propiedad documentos
	 */
	public void setIld_documentos(List<DocumentoWSDTO> ald_documentos) {
		this.ild_documentos = ald_documentos;
	}
	
	/**
	 * Obtiene el valor para la propiedad matriculas.
	 *
	 * @return El valor de la propiedad matriculas
	 */
	public List<MatriculaWSDTO> getIlm_matriculas() {
		return ilm_matriculas;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad matriculas.
	 *
	 * @param alm_matriculas el nuevo valor para la propiedad matriculas
	 */
	public void setIlm_matriculas(List<MatriculaWSDTO> alm_matriculas) {
		this.ilm_matriculas = alm_matriculas;
	}
	
	/**
	 * Obtiene el valor para la propiedad trazabilidades.
	 *
	 * @return El valor de la propiedad trazabilidades
	 */
	public List<TrazabilidadWSDTO> getIlt_trazabilidades() {
		return ilt_trazabilidades;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad trazabilidades.
	 *
	 * @param alt_trazabilidades el nuevo valor para la propiedad trazabilidades
	 */
	public void setIlt_trazabilidades(List<TrazabilidadWSDTO> alt_trazabilidades) {
		this.ilt_trazabilidades = alt_trazabilidades;
	}
	
	}

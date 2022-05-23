/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: ElementoNirVO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.vo.consultartrazabilidad
 * Nombre del elemento: ElementoNirVO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.vo.consultartrazabilidad;

import java.util.List;

import co.gov.supernotariado.bachue.clientebus.vo.GenericoVO;

/**
 * Clase tipo objeto de valores de servicios (VO). <br>
 * Permite pasar datos de entrada o devolver los resultados al invocar una
 * operacion de un servicio, <br>
 * consumida usando el cliente bus. <br>
 * Contiene propiedades para representar los datos de entrada/salida del objeto
 * Elemento nir .
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ElementoNirVO extends GenericoVO{

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo lista de DocumentoVO para definir la propiedad
	 * documentos.
	 */
	private List<DocumentoVO> ild_documentos;
	
	/**
	 * Atributo de instancia tipo lista de TipoMatriculaVO para definir la propiedad
	 * matriculas.
	 */
	private List<TipoMatriculaVO> iltm_matriculas;
	
	/**
	 * Atributo de instancia tipo lista de TrazabilidadVO para definir la propiedad
	 * trazabilidades.
	 */
	private List<TrazabilidadVO> ilt_trazabilidades;
	
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
	 * orip.
	 */
	private String is_orip;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * proceso turno.
	 */
	private String is_procesoTurno;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * turno.
	 */
	private String is_turno;
	
	/**
	 * Obtiene el valor para la propiedad documentos.
	 *
	 * @return El valor de la propiedad documentos
	 */
	public List<DocumentoVO> getIld_documentos() {
		return ild_documentos;
	}
	
	/**
	 * Obtiene el valor para la propiedad trazabilidades.
	 *
	 * @return El valor de la propiedad trazabilidades
	 */
	public List<TrazabilidadVO> getIlt_trazabilidades() {
		return ilt_trazabilidades;
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
	 * Obtiene el valor para la propiedad fase actual turno.
	 *
	 * @return El valor de la propiedad fase actual turno
	 */
	public String getIs_faseActualTurno() {
		return is_faseActualTurno;
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
	 * Obtiene el valor para la propiedad proceso turno.
	 *
	 * @return El valor de la propiedad proceso turno
	 */
	public String getIs_procesoTurno() {
		return is_procesoTurno;
	}
	
	/**
	 * Obtiene el valor para la propiedad turno.
	 *
	 * @return El valor de la propiedad turno
	 */
	public String getIs_turno() {
		return is_turno;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad documentos.
	 *
	 * @param ald_documentos el nuevo valor para la propiedad documentos
	 */
	public void setIld_documentos(List<DocumentoVO> ald_documentos) {
		this.ild_documentos = ald_documentos;
	}
	
	/**
	 * Obtiene el valor para la propiedad matriculas.
	 *
	 * @return El valor de la propiedad matriculas
	 */
	public List<TipoMatriculaVO> getIltm_matriculas() {
		return iltm_matriculas;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad matriculas.
	 *
	 * @param altm_matriculas el nuevo valor para la propiedad matriculas
	 */
	public void setIltm_matriculas(List<TipoMatriculaVO> altm_matriculas) {
		this.iltm_matriculas = altm_matriculas;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad trazabilidades.
	 *
	 * @param alt_trazabilidades el nuevo valor para la propiedad trazabilidades
	 */
	public void setIlt_trazabilidades(List<TrazabilidadVO> alt_trazabilidades) {
		this.ilt_trazabilidades = alt_trazabilidades;
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
	 * Cambia/actualiza el valor para la propiedad fase actual turno.
	 *
	 * @param as_faseActualTurno el nuevo valor para la propiedad fase actual turno
	 */
	public void setIs_faseActualTurno(String as_faseActualTurno) {
		this.is_faseActualTurno = as_faseActualTurno;
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
	 * Cambia/actualiza el valor para la propiedad proceso turno.
	 *
	 * @param as_procesoTurno el nuevo valor para la propiedad proceso turno
	 */
	public void setIs_procesoTurno(String as_procesoTurno) {
		this.is_procesoTurno = as_procesoTurno;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad turno.
	 *
	 * @param as_turno el nuevo valor para la propiedad turno
	 */
	public void setIs_turno(String as_turno) {
		this.is_turno = as_turno;
	}
	
	}

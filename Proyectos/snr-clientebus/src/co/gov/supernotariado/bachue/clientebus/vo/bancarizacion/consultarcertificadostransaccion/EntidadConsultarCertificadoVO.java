/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: EntidadConsultarCertificadoVO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.vo.bancarizacion.consultarcertificadostransaccion
 * Nombre del elemento: EntidadConsultarCertificadoVO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */

package co.gov.supernotariado.bachue.clientebus.vo.bancarizacion.consultarcertificadostransaccion;

import co.gov.supernotariado.bachue.clientebus.vo.bancarizacion.generico.EntidadLogVO;


/**
 * Clase tipo objeto de valores de servicios (VO). <br>
 * Permite pasar datos de entrada o devolver los resultados al invocar una
 * operacion de un servicio, <br>
 * consumida usando el cliente bus. <br>
 * Contiene propiedades para representar los datos de entrada/salida del objeto
 * Entidad consultar certificado .
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class EntidadConsultarCertificadoVO {

	/**
	 * Atributo de instancia tipo arreglo de bytes para definir la propiedad
	 * archivo.
	 */
	private byte[] ib_archivo;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * circulo.
	 */
	private String is_circulo;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * estado.
	 */
	private String is_estado;
	
	/**
	 * Atributo de instancia tipo EntidadLogVO para definir la propiedad log.
	 */
	private EntidadLogVO iel_log;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * matricula.
	 */
	private String is_matricula;
	
	/**
	 * Atributo de instancia tipo entero para definir la propiedad numero paginas.
	 */
	private Integer ii_numeroPaginas;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * pin.
	 */
	private String is_pin;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * turno.
	 */
	private String is_turno;

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
	 * Obtiene el valor para la propiedad circulo.
	 *
	 * @return El valor de la propiedad circulo
	 */
	public String getIs_circulo() {
		return is_circulo;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad circulo.
	 *
	 * @param as_circulo el nuevo valor para la propiedad circulo
	 */
	public void setIs_circulo(String as_circulo) {
		this.is_circulo = as_circulo;
	}

	/**
	 * Obtiene el valor para la propiedad estado.
	 *
	 * @return El valor de la propiedad estado
	 */
	public String getIs_estado() {
		return is_estado;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad estado.
	 *
	 * @param as_estado el nuevo valor para la propiedad estado
	 */
	public void setIs_estado(String as_estado) {
		this.is_estado = as_estado;
	}

	/**
	 * Obtiene el valor para la propiedad log.
	 *
	 * @return El valor de la propiedad log
	 */
	public EntidadLogVO getIel_log() {
		return iel_log;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad log.
	 *
	 * @param ael_log el nuevo valor para la propiedad log
	 */
	public void setIel_log(EntidadLogVO ael_log) {
		this.iel_log = ael_log;
	}

	/**
	 * Obtiene el valor para la propiedad numero paginas.
	 *
	 * @return El valor de la propiedad numero paginas
	 */
	public Integer getIi_numeroPaginas() {
		return ii_numeroPaginas;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad numero paginas.
	 *
	 * @param ai_numeroPaginas el nuevo valor para la propiedad numero paginas
	 */
	public void setIi_numeroPaginas(Integer ai_numeroPaginas) {
		this.ii_numeroPaginas = ai_numeroPaginas;
	}

	/**
	 * Obtiene el valor para la propiedad pin.
	 *
	 * @return El valor de la propiedad pin
	 */
	public String getIs_pin() {
		return is_pin;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad pin.
	 *
	 * @param as_pin el nuevo valor para la propiedad pin
	 */
	public void setIs_pin(String as_pin) {
		this.is_pin = as_pin;
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
	 * Cambia/actualiza el valor para la propiedad turno.
	 *
	 * @param as_turno el nuevo valor para la propiedad turno
	 */
	public void setIs_turno(String as_turno) {
		this.is_turno = as_turno;
	}

	/**
	 * Obtiene el valor para la propiedad matricula.
	 *
	 * @return El valor de la propiedad matricula
	 */
	public String getIs_matricula() {
		return is_matricula;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad matricula.
	 *
	 * @param as_matricula el nuevo valor para la propiedad matricula
	 */
	public void setIs_matricula(String as_matricula) {
		this.is_matricula = as_matricula;
	}


}

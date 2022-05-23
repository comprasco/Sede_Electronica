/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: TipoDatosMatriculasMigracionVO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.vo.consultamigracion
 * Nombre del elemento: TipoDatosMatriculasMigracionVO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.vo.consultamigracion;

import co.gov.supernotariado.bachue.clientebus.vo.GenericoVO;

/**
 * Clase tipo objeto de valores de servicios (VO). <br>
 * Permite pasar datos de entrada o devolver los resultados al invocar una
 * operacion de un servicio, <br>
 * consumida usando el cliente bus. <br>
 * Contiene propiedades para representar los datos de entrada/salida del objeto
 * Tipo datos matriculas migracion .
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoDatosMatriculasMigracionVO extends GenericoVO 
{

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * matricula.
	 */
	private String is_matricula;
    
    /**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad info
	 * matricula migrada.
	 */
    private Boolean ib_infoMatriculaMigrada;
    
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
	
	/**
	 * Obtiene el valor para la propiedad info matricula migrada.
	 *
	 * @return El valor de la propiedad info matricula migrada
	 */
	public Boolean getIb_infoMatriculaMigrada() {
		return ib_infoMatriculaMigrada;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad info matricula migrada.
	 *
	 * @param ab_infoMatriculaMigrada el nuevo valor para la propiedad info
	 *                                matricula migrada
	 */
	public void setIb_infoMatriculaMigrada(Boolean ab_infoMatriculaMigrada) {
		this.ib_infoMatriculaMigrada = ab_infoMatriculaMigrada;
	}
}

/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: TipoEntradaConsultaMigracionMatriculasVO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.vo.consultamigracion
 * Nombre del elemento: TipoEntradaConsultaMigracionMatriculasVO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.vo.consultamigracion;

import java.util.List;

import co.gov.supernotariado.bachue.clientebus.vo.ClienteIntegracionVO;

/**
 * Clase tipo objeto de valores de servicios (VO). <br>
 * Permite pasar datos de entrada o devolver los resultados al invocar una
 * operacion de un servicio, <br>
 * consumida usando el cliente bus. <br>
 * Contiene propiedades para representar los datos de entrada/salida del objeto
 * Tipo entrada consulta migracion matriculas .
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoEntradaConsultaMigracionMatriculasVO extends ClienteIntegracionVO
{

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo lista de TipoMatriculaConsultadaVO para definir la
	 * propiedad matriculas consultadas.
	 */
	private List<TipoMatriculaConsultadaVO> iltmc_matriculasConsultadas;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * usuario.
	 */
    private String is_usuario;
    
	/**
	 * Obtiene el valor para la propiedad matriculas consultadas.
	 *
	 * @return El valor de la propiedad matriculas consultadas
	 */
	public List<TipoMatriculaConsultadaVO> getIltmc_matriculasConsultadas() {
		return iltmc_matriculasConsultadas;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad matriculas consultadas.
	 *
	 * @param altmc_matriculasConsultadas el nuevo valor para la propiedad
	 *                                    matriculas consultadas
	 */
	public void setIltmc_matriculasConsultadas(List<TipoMatriculaConsultadaVO> altmc_matriculasConsultadas) {
		this.iltmc_matriculasConsultadas = altmc_matriculasConsultadas;
	}
	
	/**
	 * Obtiene el valor para la propiedad usuario.
	 *
	 * @return El valor de la propiedad usuario
	 */
	public String getIs_usuario() {
		return is_usuario;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad usuario.
	 *
	 * @param as_usuario el nuevo valor para la propiedad usuario
	 */
	public void setIs_usuario(String as_usuario) {
		this.is_usuario = as_usuario;
	}
    
    
}

/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: ConsultarInformacionMatriculaMasivasVO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.vo.bancarizacion.consultarinformacionmatriculamasivas
 * Nombre del elemento: ConsultarInformacionMatriculaMasivasVO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */

package co.gov.supernotariado.bachue.clientebus.vo.bancarizacion.consultarinformacionmatriculamasivas;

import java.util.List;

import co.gov.supernotariado.bachue.clientebus.vo.ClienteIntegracionVO;
import co.gov.supernotariado.bachue.clientebus.vo.bancarizacion.generartransaccion.EntidadMatriculaVO;
import co.gov.supernotariado.bachue.clientebus.vo.bancarizacion.generico.IBancarizacionEntradaBase;


/**
 * Clase tipo objeto de valores de servicios (VO). <br>
 * Permite pasar datos de entrada o devolver los resultados al invocar una
 * operacion de un servicio, <br>
 * consumida usando el cliente bus. <br>
 * Contiene propiedades para representar los datos de entrada/salida del objeto
 * Consultar informacion matricula masivas .
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ConsultarInformacionMatriculaMasivasVO extends ClienteIntegracionVO implements IBancarizacionEntradaBase{


	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * usuario WS.
	 */
	private String is_usuarioWS;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * clave WS.
	 */
    private String is_claveWS;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo convenio.
	 */
    private String is_codigoConvenio;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo servicio.
	 */
    private String is_codigoServicio;
    
    /**
	 * Atributo para definir la propiedad llem matriculas.
	 */
    private List<EntidadMatriculaVO> llem_matriculas;
    
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.clientebus.vo.bancarizacion.generico.IBancarizacionEntradaBase#getIs_usuarioWS()
	 */
	public String getIs_usuarioWS() {
		return is_usuarioWS;
	}
	
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.clientebus.vo.bancarizacion.generico.IBancarizacionEntradaBase#setIs_usuarioWS(java.lang.String)
	 */
	public void setIs_usuarioWS(String as_usuarioWS) {
		this.is_usuarioWS = as_usuarioWS;
	}
	
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.clientebus.vo.bancarizacion.generico.IBancarizacionEntradaBase#getIs_claveWS()
	 */
	public String getIs_claveWS() {
		return is_claveWS;
	}
	
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.clientebus.vo.bancarizacion.generico.IBancarizacionEntradaBase#setIs_claveWS(java.lang.String)
	 */
	public void setIs_claveWS(String as_claveWS) {
		this.is_claveWS = as_claveWS;
	}
	
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.clientebus.vo.bancarizacion.generico.IBancarizacionEntradaBase#getIs_codigoConvenio()
	 */
	public String getIs_codigoConvenio() {
		return is_codigoConvenio;
	}
	
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.clientebus.vo.bancarizacion.generico.IBancarizacionEntradaBase#setIs_codigoConvenio(java.lang.String)
	 */
	public void setIs_codigoConvenio(String as_codigoConvenio) {
		this.is_codigoConvenio = as_codigoConvenio;
	}
	
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.clientebus.vo.bancarizacion.generico.IBancarizacionEntradaBase#getIs_codigoServicio()
	 */
	public String getIs_codigoServicio() {
		return is_codigoServicio;
	}
	
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.clientebus.vo.bancarizacion.generico.IBancarizacionEntradaBase#setIs_codigoServicio(java.lang.String)
	 */
	public void setIs_codigoServicio(String as_codigoServicio) {
		this.is_codigoServicio = as_codigoServicio;
	}
	
	/**
	 * Obtiene el valor para la propiedad lem matriculas.
	 *
	 * @return El valor de la propiedad lem matriculas
	 */
	public List<EntidadMatriculaVO> getLem_matriculas() {
		return llem_matriculas;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad lem matriculas.
	 *
	 * @param alem_matriculas el nuevo valor para la propiedad lem matriculas
	 */
	public void setLem_matriculas(List<EntidadMatriculaVO> alem_matriculas) {
		this.llem_matriculas = alem_matriculas;
	}
   
}

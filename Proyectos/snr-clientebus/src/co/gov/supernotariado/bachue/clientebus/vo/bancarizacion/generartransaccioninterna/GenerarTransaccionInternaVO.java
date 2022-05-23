/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: GenerarTransaccionInternaVO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.vo.bancarizacion.generartransaccioninterna
 * Nombre del elemento: GenerarTransaccionInternaVO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */

package co.gov.supernotariado.bachue.clientebus.vo.bancarizacion.generartransaccioninterna;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.clientebus.vo.bancarizacion.generartransaccion.EntidadMatriculaVO;

/**
 * Clase tipo objeto de valores de servicios (VO). <br>
 * Permite pasar datos de entrada o devolver los resultados al invocar una
 * operacion de un servicio, <br>
 * consumida usando el cliente bus. <br>
 * Contiene propiedades para representar los datos de entrada/salida del objeto
 * Generar transaccion interna .
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class GenerarTransaccionInternaVO {

	/**
	 * Atributo para definir la propiedad usuario WS.
	 */
	protected String usuarioWS;

	/**
	 * Atributo para definir la propiedad clave WS.
	 */
	protected String claveWS;

	/**
	 * Atributo para definir la propiedad codigo convenio.
	 */
	protected String codigoConvenio;

	/**
	 * Atributo para definir la propiedad codigo servicio.
	 */
	protected String codigoServicio;

	/**
	 * Atributo para definir la propiedad matriculas.
	 */
	protected List<EntidadMatriculaVO> matriculas;

	/**
	 * Atributo para definir la propiedad codigo usuario.
	 */
	protected Long codigoUsuario;

	/**
	 * Obtiene el valor de la propiedad usuarioWS.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getUsuarioWS() {
		return usuarioWS;
	}

	/**
	 * Define el valor de la propiedad usuarioWS.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setUsuarioWS(String value) {
		this.usuarioWS = value;
	}

	/**
	 * Obtiene el valor de la propiedad claveWS.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getClaveWS() {
		return claveWS;
	}

	/**
	 * Define el valor de la propiedad claveWS.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setClaveWS(String value) {
		this.claveWS = value;
	}

	/**
	 * Obtiene el valor de la propiedad codigoConvenio.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCodigoConvenio() {
		return codigoConvenio;
	}

	/**
	 * Define el valor de la propiedad codigoConvenio.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setCodigoConvenio(String value) {
		this.codigoConvenio = value;
	}

	/**
	 * Obtiene el valor de la propiedad codigoServicio.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCodigoServicio() {
		return codigoServicio;
	}

	/**
	 * Define el valor de la propiedad codigoServicio.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setCodigoServicio(String value) {
		this.codigoServicio = value;
	}

	/**
	 * Gets the value of the matriculas property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot.
	 * Therefore any modification you make to the returned list will be present
	 * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
	 * for the matriculas property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getMatriculas().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link EntidadMatriculaVO }
	 *
	 * @return El valor de la propiedad matriculas
	 */
	public List<EntidadMatriculaVO> getMatriculas() {
		if (matriculas == null) {
			matriculas = new ArrayList<>();
		}
		return this.matriculas;
	}

	/**
	 * Obtiene el valor de la propiedad codigoUsuario.
	 * 
	 * @return possible object is {@link Long }
	 * 
	 */
	public Long getCodigoUsuario() {
		return codigoUsuario;
	}

	/**
	 * Define el valor de la propiedad codigoUsuario.
	 * 
	 * @param value allowed object is {@link Long }
	 * 
	 */
	public void setCodigoUsuario(Long value) {
		this.codigoUsuario = value;
	}

}

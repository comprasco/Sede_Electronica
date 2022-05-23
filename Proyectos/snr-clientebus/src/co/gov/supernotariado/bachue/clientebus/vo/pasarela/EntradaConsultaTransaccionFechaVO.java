/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: EntradaConsultaTransaccionFechaVO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.vo.pasarela
 * Nombre del elemento: EntradaConsultaTransaccionFechaVO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.vo.pasarela;

import com.google.gson.annotations.SerializedName;

/**
 * Clase tipo objeto de valores de servicios (VO). <br>
 * Permite pasar datos de entrada o devolver los resultados al invocar una
 * operacion de un servicio, <br>
 * consumida usando el cliente bus. <br>
 * Contiene propiedades para representar los datos de entrada/salida del objeto
 * Entrada consulta transaccion fecha .
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class EntradaConsultaTransaccionFechaVO extends EntradaGenericaAutenticacionActivaVO {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 5635172875750908048L;
	
	/**
	 * Construye una nueva instancia/objeto de la clase
	 * EntradaConsultaTransaccionFechaVO.
	 */
	public EntradaConsultaTransaccionFechaVO() {
		//Metodo que permite consultar transaccion
	}
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * fecha.
	 */
	//formato DD/MM/YYYY
	@SerializedName("date")
	private String is_fecha;

	/**
	 * Obtiene el valor para la propiedad fecha.
	 *
	 * @return El valor de la propiedad fecha
	 */
	public String getIs_fecha() {
		return is_fecha;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad fecha.
	 *
	 * @param is_fecha el nuevo valor para la propiedad fecha
	 */
	public void setIs_fecha(String is_fecha) {
		this.is_fecha = is_fecha;
	}
}

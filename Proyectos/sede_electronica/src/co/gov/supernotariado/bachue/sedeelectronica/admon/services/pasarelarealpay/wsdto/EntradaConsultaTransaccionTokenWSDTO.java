/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: EntradaConsultaTransaccionTokenWSDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.pasarelarealpay.wsdto
 * Nombre del elemento: EntradaConsultaTransaccionTokenWSDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.pasarelarealpay.wsdto;

/**
 * Clase tipo objeto de transferencia de datos para web service (WSDTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y servicios web.
 * <br>
 * Contiene propiedades para representar los datos del objeto Entrada consulta
 * transaccion token. <br>
 * <em>Nota:</em> En modelos de pasarela el nombre de las variables no aplican
 * el estandar porque es necesario para el mapeo y serializacion al servicio de
 * realpay
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class EntradaConsultaTransaccionTokenWSDTO extends EntradaGenericaAutenticacionActivaWSDTO {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 5635172875750908048L;
	
	/**
	 * Construye una nueva instancia/objeto de la clase
	 * EntradaConsultaTransaccionTokenWSDTO.
	 */
	public EntradaConsultaTransaccionTokenWSDTO() {
		//Metodo que permite consultar transaccion
	}
	
}

/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: EntradaConsultaTransaccionFechaWSDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.pasarelarealpay.wsdto
 * Nombre del elemento: EntradaConsultaTransaccionFechaWSDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.pasarelarealpay.wsdto;

/**
 * Clase tipo objeto de transferencia de datos para web service (WSDTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y servicios web.
 * <br>
 * Contiene propiedades para representar los datos del objeto Entrada consulta
 * transaccion fecha. <br>
 * <em>Nota:</em> En modelos de pasarela el nombre de las variables no aplican
 * el estandar porque es necesario para el mapeo y serializacion al servicio de
 * realpay
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class EntradaConsultaTransaccionFechaWSDTO extends EntradaGenericaAutenticacionActivaWSDTO {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 5635172875750908048L;
	
	/**
	 * Construye una nueva instancia/objeto de la clase
	 * EntradaConsultaTransaccionFechaWSDTO.
	 */
	public EntradaConsultaTransaccionFechaWSDTO() {
		//Metodo que permite consultar transaccion
	}
	
	/**
	 * Atributo para definir la propiedad date.
	 */
	//formato DD/MM/YYYY
	private String date;

	/**
	 * Obtiene el valor para la propiedad date.
	 *
	 * @return El valor de la propiedad date
	 */
	public String getDate() {
		return date;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad date.
	 *
	 * @param date el nuevo valor para la propiedad date
	 */
	public void setDate(String date) {
		this.date = date;
	}
		
}

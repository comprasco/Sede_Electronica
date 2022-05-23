/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: EntidadConsultarCertificadoURLVO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.vo.bancarizacion.consultarurlcertificadostransaccion
 * Nombre del elemento: EntidadConsultarCertificadoURLVO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.vo.bancarizacion.consultarurlcertificadostransaccion;

import co.gov.supernotariado.bachue.clientebus.bancarizacion.type.generico.EntidadLog;
import co.gov.supernotariado.bachue.clientebus.vo.bancarizacion.generico.EntidadLogVO;

/**
 * Clase tipo objeto de valores de servicios (VO). <br>
 * Permite pasar datos de entrada o devolver los resultados al invocar una
 * operacion de un servicio, <br>
 * consumida usando el cliente bus. <br>
 * Contiene propiedades para representar los datos de entrada/salida del objeto
 * Entidad consultar certificado URL .
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class EntidadConsultarCertificadoURLVO {

    /**
	 * Atributo para definir la propiedad circulo.
	 */
    protected String circulo;
    
    /**
	 * Atributo para definir la propiedad estado.
	 */
    protected String estado;
    
    /**
	 * Atributo para definir la propiedad log.
	 */
    protected EntidadLogVO log;
    
    /**
	 * Atributo para definir la propiedad matricula.
	 */
    protected String matricula;
    
    /**
	 * Atributo para definir la propiedad numero hojas.
	 */
    protected Integer numeroHojas;
    
    /**
	 * Atributo para definir la propiedad pin.
	 */
    protected String pin;
    
    /**
	 * Atributo para definir la propiedad turno.
	 */
    protected String turno;
    
    /**
	 * Atributo para definir la propiedad url.
	 */
    protected String url;

    /**
     * Obtiene el valor de la propiedad circulo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCirculo() {
        return circulo;
    }

    /**
     * Define el valor de la propiedad circulo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCirculo(String value) {
        this.circulo = value;
    }

    /**
     * Obtiene el valor de la propiedad estado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Define el valor de la propiedad estado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstado(String value) {
        this.estado = value;
    }

    /**
     * Obtiene el valor de la propiedad log.
     * 
     * @return
     *     possible object is
     *     {@link EntidadLog }
     *     
     */
    public EntidadLogVO getLog() {
        return log;
    }

    /**
     * Define el valor de la propiedad log.
     * 
     * @param value
     *     allowed object is
     *     {@link EntidadLog }
     *     
     */
    public void setLog(EntidadLogVO value) {
        this.log = value;
    }

    /**
     * Obtiene el valor de la propiedad matricula.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * Define el valor de la propiedad matricula.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatricula(String value) {
        this.matricula = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroHojas.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumeroHojas() {
        return numeroHojas;
    }

    /**
     * Define el valor de la propiedad numeroHojas.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumeroHojas(Integer value) {
        this.numeroHojas = value;
    }

    /**
     * Obtiene el valor de la propiedad pin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPin() {
        return pin;
    }

    /**
     * Define el valor de la propiedad pin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPin(String value) {
        this.pin = value;
    }

    /**
     * Obtiene el valor de la propiedad turno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTurno() {
        return turno;
    }

    /**
     * Define el valor de la propiedad turno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTurno(String value) {
        this.turno = value;
    }

    /**
     * Obtiene el valor de la propiedad url.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Define el valor de la propiedad url.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

}

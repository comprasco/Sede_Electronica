/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: EntidadConsultarCertificadosTransaccionURLVO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.vo.bancarizacion.consultarurlcertificadostransaccion
 * Nombre del elemento: EntidadConsultarCertificadosTransaccionURLVO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.vo.bancarizacion.consultarurlcertificadostransaccion;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.clientebus.bancarizacion.type.generico.EntidadLog;

/**
 * Clase tipo objeto de valores de servicios (VO). <br>
 * Permite pasar datos de entrada o devolver los resultados al invocar una
 * operacion de un servicio, <br>
 * consumida usando el cliente bus. <br>
 * Contiene propiedades para representar los datos de entrada/salida del objeto
 * Entidad consultar certificados transaccion URL .
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class EntidadConsultarCertificadosTransaccionURLVO {

    /**
	 * Atributo para definir la propiedad certificados.
	 */
    protected List<EntidadConsultarCertificadoURLVO> certificados;
    
    /**
	 * Atributo para definir la propiedad estado.
	 */
    protected String estado;
    
    /**
	 * Atributo para definir la propiedad log.
	 */
    protected EntidadLog log;


    /**
	 * Obtiene el valor para la propiedad certificados.
	 *
	 * @return El valor de la propiedad certificados
	 */
    public List<EntidadConsultarCertificadoURLVO> getCertificados() {
        if (certificados == null) {
            certificados = new ArrayList<EntidadConsultarCertificadoURLVO>();
        }
        return this.certificados;
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
    public EntidadLog getLog() {
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
    public void setLog(EntidadLog value) {
        this.log = value;
    }

}

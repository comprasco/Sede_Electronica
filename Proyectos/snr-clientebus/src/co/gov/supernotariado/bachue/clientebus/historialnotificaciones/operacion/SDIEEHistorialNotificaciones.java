
package co.gov.supernotariado.bachue.clientebus.historialnotificaciones.operacion;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

import co.gov.supernotariado.bachue.clientebus.historialnotificaciones.type.consultarhistorial.ConsultarHistorialObjectFactory;
import co.gov.supernotariado.bachue.clientebus.historialnotificaciones.type.consultarhistorial.TipoEntradaConsultarHistorial;
import co.gov.supernotariado.bachue.clientebus.historialnotificaciones.type.consultarhistorial.TipoSalidaConsultarHistorial;

/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "SDI_EE_HistorialNotificaciones", targetNamespace = "https://www.supernotariado.gov.co/services/bachue/ee/historialNotificaciones/v1")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ConsultarHistorialObjectFactory.class
})
public interface SDIEEHistorialNotificaciones {


    /**
     * 
     * @param entrada
     * @return
     *     returns https.www_supernotariado_gov_co.schemas.bachue.ee.historialnotificaciones.consultarhistorial.v1.TipoSalidaConsultarHistorial
     */
    @WebMethod(action = "https://www.supernotariado.gov.co/schemas/bachue/ee/historialNotificaciones/consultarHistorial/v1")
    @WebResult(name = "salidaConsultarHistorial", targetNamespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/historialNotificaciones/consultarHistorial/v1", partName = "salida")
    public TipoSalidaConsultarHistorial consultarHistorial(
        @WebParam(name = "entradaConsultarHistorial", targetNamespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/historialNotificaciones/consultarHistorial/v1", partName = "entrada")
        TipoEntradaConsultarHistorial entrada);

}


package co.gov.supernotariado.bachue.clientebus.controldigitalizacion.operacion;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

import co.gov.supernotariado.bachue.clientebus.controldigitalizacion.types.notificardigitalizacion.NotificarDigitalizacionObjectFactory;
import co.gov.supernotariado.bachue.clientebus.controldigitalizacion.types.notificardigitalizacion.TipoEntradaNotificarDigitalizacion;
import co.gov.supernotariado.bachue.clientebus.controldigitalizacion.types.notificardigitalizacion.TipoSalidaNotificarDigitalizacion;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "SUT_CI_ControlDigitalizacion", targetNamespace = "https://www.supernotariado.gov.co/services/bachue/ci/controldigitalizacion/v1")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    NotificarDigitalizacionObjectFactory.class
})
public interface SUTCIControlDigitalizacion {


    /**
     * 
     * @param entrada
     * @return
     *     returns https.www_supernotariado_gov_co.schemas.bachue.ci.controldigitalizacion.notificardigitalizacion.v1.TipoSalidaNotificarDigitalizacion
     */
    @WebMethod(operationName = "NotificarDigitalizacion", action = "https://www.supernotariado.gov.co/services/bachue/ci/controldigitalizacion/v1/NotificarDigitalizacion")
    @WebResult(name = "salidaNotificarDigitalizacion", targetNamespace = "https://www.supernotariado.gov.co/schemas/bachue/ci/controldigitalizacion/notificardigitalizacion/v1", partName = "salida")
    public TipoSalidaNotificarDigitalizacion notificarDigitalizacion(
        @WebParam(name = "entradaNotificarDigitalizacion", targetNamespace = "https://www.supernotariado.gov.co/schemas/bachue/ci/controldigitalizacion/notificardigitalizacion/v1", partName = "entrada")
        TipoEntradaNotificarDigitalizacion entrada);

}

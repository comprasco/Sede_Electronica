package co.gov.supernotariado.bachue.clientebus.poderes.operacion;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

import co.gov.supernotariado.bachue.clientebus.poderes.types.enviarpoder.TipoEntradaEnviarPoder;
import co.gov.supernotariado.bachue.clientebus.poderes.types.enviarpoder.TipoSalidaEnviarPoder;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "BS_SUT_CO_EnvioPoderes", targetNamespace = "https://www.supernotariado.gov.co/services/bachue/co/enviopoderes/v1")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
	ObjectFactoryEnvioPoderes.class
})
public interface BSSUTCOEnvioPoderes {


    /**
     * 
     * @param entrada
     * @return
     *     returns https.www_supernotariado_gov_co.schemas.bachue.co.enviopoderes.enviarpoder.v1.TipoSalidaEnviarPoder
     */
    @WebMethod(operationName = "EnviarPoder", action = "https://www.supernotariado.gov.co/services/bachue/co/enviopoderes/v1/EnviarPoder")
    @WebResult(name = "salidaEnviarPoder", targetNamespace = "https://www.supernotariado.gov.co/schemas/bachue/co/enviopoderes/enviarpoder/v1", partName = "salida")
    public TipoSalidaEnviarPoder enviarPoder(
        @WebParam(name = "entradaEnviarPoder", targetNamespace = "https://www.supernotariado.gov.co/schemas/bachue/co/enviopoderes/enviarpoder/v1", partName = "entrada")
        TipoEntradaEnviarPoder entrada);

}

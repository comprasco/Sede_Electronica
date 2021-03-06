package co.gov.supernotariado.bachue.clientebus.consultadatosbasicos.operacion;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

import co.gov.supernotariado.bachue.clientebus.consultadatosbasicos.types.consultardatosbasicos.ConsultaDatosBasicosObjectFactory;
import co.gov.supernotariado.bachue.clientebus.consultadatosbasicos.types.consultardatosbasicos.TipoEntradaDatosBasicosMatricula;
import co.gov.supernotariado.bachue.clientebus.consultadatosbasicos.types.consultardatosbasicos.TipoSalidaDatosBasicosMatricula;

/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "SBB_EE_DatosBasicosMatricula", targetNamespace = "https://www.supernotariado.gov.co/services/bachue/ee/datosBasicosMatricula/v1")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
	ConsultaDatosBasicosObjectFactory.class
})
public interface SBBEEDatosBasicosMatricula {

    /**
     * 
     * @param entrada
     * @return
     *     returns co.gov.gobiernoenlinea.gel_xml._1_0.schemas.integracion.supernotariado.bachue.TipoSalidaDatosBasicosMatricula
     */
    @WebMethod(action = "http://www.gobiernoenlinea.gov.co/GEL-XML/1.0/schemas/integracion/supernotariado/bachue")
    @WebResult(name = "salidaDatosBasicos", targetNamespace = "http://www.gobiernoenlinea.gov.co/GEL-XML/1.0/schemas/integracion/supernotariado/bachue", partName = "salida")
    public TipoSalidaDatosBasicosMatricula consultarDatosBasicos(
        @WebParam(name = "entradaDatosBasicos", targetNamespace = "http://www.gobiernoenlinea.gov.co/GEL-XML/1.0/schemas/integracion/supernotariado/bachue", partName = "entrada")
        TipoEntradaDatosBasicosMatricula entrada);
}
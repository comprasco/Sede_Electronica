
package co.gov.supernotariado.bachue.clientebus.generacionsolicitud.operacion;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

import co.gov.supernotariado.bachue.clientebus.generacionsolicitud.types.consultarestadosolicitud.ConsultarEstadoSolicitudObjectFactory;
import co.gov.supernotariado.bachue.clientebus.generacionsolicitud.types.consultarestadosolicitud.TipoEntradaConsultarEstadoSolicitud;
import co.gov.supernotariado.bachue.clientebus.generacionsolicitud.types.consultarestadosolicitud.TipoSalidaConsultarEstadoSolicitud;
import co.gov.supernotariado.bachue.clientebus.generacionsolicitud.types.generarsolicitud.GenerarSolicitudObjectFactory;
import co.gov.supernotariado.bachue.clientebus.generacionsolicitud.types.generarsolicitud.TipoEntradaGenerarSolicitud;
import co.gov.supernotariado.bachue.clientebus.generacionsolicitud.types.generarsolicitud.TipoSalidaGenerarSolicitud;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10
 * Generated source version: 2.2
 * 
 */
@WebService(name = "SBB_EE_GeneracionSolicitud", targetNamespace = "https://www.supernotariado.gov.co/services/bachue/ee/generacionsolicitud/v1")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
	ConsultarEstadoSolicitudObjectFactory.class,
	GenerarSolicitudObjectFactory.class,
})
public interface SBBEEGeneracionSolicitud {


    /**
     * 
     * @param entrada
     * @return
     *     returns https.www_supernotariado_gov_co.schemas.bachue.ee.generacionsolicitud.generarsolicitud.v1.TipoSalidaGenerarSolicitud
     */
    @WebMethod(operationName = "GenerarSolicitud", action = "https://www.supernotariado.gov.co/services/bachue/ee/generacionsolicitud/v1/GenerarSolicitud")
    @WebResult(name = "salidaGenerarSolicitud", targetNamespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/generacionsolicitud/generarsolicitud/v1", partName = "salida")
    public TipoSalidaGenerarSolicitud generarSolicitud(
        @WebParam(name = "entradaGenerarSolicitud", targetNamespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/generacionsolicitud/generarsolicitud/v1", partName = "entrada")
        TipoEntradaGenerarSolicitud entrada);

    /**
     * 
     * @param entrada
     * @return
     *     returns https.www_supernotariado_gov_co.schemas.bachue.ee.generacionsolicitud.consultarestadosolicitud.v1.TipoSalidaConsultarEstadoSolicitud
     */
    @WebMethod(operationName = "ConsultarEstadoSolicitud", action = "https://www.supernotariado.gov.co/services/bachue/ee/generacionsolicitud/v1/ConsultarEstadoSolicitud")
    @WebResult(name = "salidaConsultarEstadoSolicitud", targetNamespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/generacionsolicitud/consultarestadosolicitud/v1", partName = "salida")
    public TipoSalidaConsultarEstadoSolicitud consultarEstadoSolicitud(
        @WebParam(name = "entradaConsultarEstadoSolicitud", targetNamespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/generacionsolicitud/consultarestadosolicitud/v1", partName = "entrada")
        TipoEntradaConsultarEstadoSolicitud entrada);

}

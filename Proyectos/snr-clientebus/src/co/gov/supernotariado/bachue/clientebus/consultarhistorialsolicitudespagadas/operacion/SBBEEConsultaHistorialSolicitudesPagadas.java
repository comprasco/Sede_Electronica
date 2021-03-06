
package co.gov.supernotariado.bachue.clientebus.consultarhistorialsolicitudespagadas.operacion;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

import co.gov.supernotariado.bachue.clientebus.consultarhistorialsolicitudespagadas.types.buscarsolicitudes.BuscarSolicitudesObjectFactory;
import co.gov.supernotariado.bachue.clientebus.consultarhistorialsolicitudespagadas.types.buscarsolicitudes.TipoEntradaBuscarSolicitudes;
import co.gov.supernotariado.bachue.clientebus.consultarhistorialsolicitudespagadas.types.buscarsolicitudes.TipoSalidaBuscarSolicitudes;
import co.gov.supernotariado.bachue.clientebus.consultarhistorialsolicitudespagadas.types.consultardetallesolicitud.ConsultarDetalleSolicitudObjectFactory;
import co.gov.supernotariado.bachue.clientebus.consultarhistorialsolicitudespagadas.types.consultardetallesolicitud.TipoEntradaConsultarDetalleSolicitud;
import co.gov.supernotariado.bachue.clientebus.consultarhistorialsolicitudespagadas.types.consultardetallesolicitud.TipoSalidaConsultarDetalleSolicitud;

/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "SBB_EE_ConsultaHistorialSolicitudesPagadas", targetNamespace = "https://www.supernotariado.gov.co/services/bachue/ee/consultahistorialsolicitudespagadas/v1")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
	BuscarSolicitudesObjectFactory.class,
	ConsultarDetalleSolicitudObjectFactory.class
})
public interface SBBEEConsultaHistorialSolicitudesPagadas {


    /**
     * 
     * @param entrada
     * @return
     *     returns https.www_supernotariado_gov_co.schemas.bachue.ee.consultahistorialsolicitudespagadas.consultardetallesolicitud.v1.TipoSalidaConsultarDetalleSolicitud
     */
    @WebMethod(operationName = "ConsultarDetalleSolicitud", action = "https://www.supernotariado.gov.co/services/bachue/cb/consultahistorialsolicitudespagadas/v1/ConsultarDetalleSolicitud")
    @WebResult(name = "salidaConsultarDetalleSolicitud", targetNamespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/consultahistorialsolicitudespagadas/consultardetallesolicitud/v1", partName = "salida")
    public TipoSalidaConsultarDetalleSolicitud consultarDetalleSolicitud(
        @WebParam(name = "entradaConsultarDetalleSolicitud", targetNamespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/consultahistorialsolicitudespagadas/consultardetallesolicitud/v1", partName = "entrada")
        TipoEntradaConsultarDetalleSolicitud entrada);

    /**
     * 
     * @param entrada
     * @return
     *     returns https.www_supernotariado_gov_co.schemas.bachue.ee.consultahistorialsolicitudespagadas.buscarsolicitudes.v1.TipoSalidaBuscarSolicitudes
     */
    @WebMethod(operationName = "BuscarSolicitudes", action = "https://www.supernotariado.gov.co/services/bachue/cb/consultahistorialsolicitudespagadas/v1/BuscarSolicitudes")
    @WebResult(name = "salidaBuscarSolicitudes", targetNamespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/consultahistorialsolicitudespagadas/buscarsolicitudes/v1", partName = "salida")
    public TipoSalidaBuscarSolicitudes buscarSolicitudes(
        @WebParam(name = "entradaBuscarSolicitudes", targetNamespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/consultahistorialsolicitudespagadas/buscarsolicitudes/v1", partName = "entrada")
        TipoEntradaBuscarSolicitudes entrada);

}

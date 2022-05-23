
package co.gov.supernotariado.bachue.clientebus.biometriacorebachue.operacion;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.naming.spi.ObjectFactory;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import co.gov.supernotariado.bachue.clientebus.biometriacorebachue.types.bimetrico.AgregarFirmaDTO;
import co.gov.supernotariado.bachue.clientebus.biometriacorebachue.types.bimetrico.AgregarFirmaSalidaDTO;
import co.gov.supernotariado.bachue.clientebus.biometriacorebachue.types.bimetrico.BooleanSalidaDTO;
import co.gov.supernotariado.bachue.clientebus.biometriacorebachue.types.bimetrico.BorrarHuellasDTO;
import co.gov.supernotariado.bachue.clientebus.biometriacorebachue.types.bimetrico.ClaveDTO;
import co.gov.supernotariado.bachue.clientebus.biometriacorebachue.types.bimetrico.ConstantesSalidaDTO;
import co.gov.supernotariado.bachue.clientebus.biometriacorebachue.types.bimetrico.ConsultarFirmaDTO;
import co.gov.supernotariado.bachue.clientebus.biometriacorebachue.types.bimetrico.EstadisticasEntradaDTO;
import co.gov.supernotariado.bachue.clientebus.biometriacorebachue.types.bimetrico.EstadisticasSalidaDTO;
import co.gov.supernotariado.bachue.clientebus.biometriacorebachue.types.bimetrico.FirmaSalidaDTO;
import co.gov.supernotariado.bachue.clientebus.biometriacorebachue.types.bimetrico.HuellaDTO;
import co.gov.supernotariado.bachue.clientebus.biometriacorebachue.types.bimetrico.LogDTO;
import co.gov.supernotariado.bachue.clientebus.biometriacorebachue.types.bimetrico.ObtenerFirmaSalidaDTO;
import co.gov.supernotariado.bachue.clientebus.biometriacorebachue.types.bimetrico.SesionDTO;
import co.gov.supernotariado.bachue.clientebus.biometriacorebachue.types.bimetrico.SesionEntradaDTO;
import co.gov.supernotariado.bachue.clientebus.biometriacorebachue.types.bimetrico.StringSalidaDTO;
import co.gov.supernotariado.bachue.clientebus.biometriacorebachue.types.bimetrico.UsuarioDTO;
import co.gov.supernotariado.bachue.clientebus.biometriacorebachue.types.bimetrico.UsuarioEntradaDTO;
import co.gov.supernotariado.bachue.clientebus.biometriacorebachue.types.bimetrico.VerificacionDTO;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "BiometriaWS", targetNamespace = "http://ws.servicios.corebachue.bachue.supernotariado.gov.co/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BiometriaWS {


    /**
     * 
     * @return
     *     returns co.gov.supernotariado.bachue.corebachue.servicios.ws.ConstantesSalidaDTO
     */
    @WebMethod(action = "obtenerConstantes")
    @WebResult(name = "salidaResultado", targetNamespace = "")
    @RequestWrapper(localName = "obtenerConstantes", targetNamespace = "http://ws.servicios.corebachue.bachue.supernotariado.gov.co/", className = "co.gov.supernotariado.bachue.corebachue.servicios.ws.ObtenerConstantes")
    @ResponseWrapper(localName = "obtenerConstantesResponse", targetNamespace = "http://ws.servicios.corebachue.bachue.supernotariado.gov.co/", className = "co.gov.supernotariado.bachue.corebachue.servicios.ws.ObtenerConstantesResponse")
    public ConstantesSalidaDTO obtenerConstantes();

    /**
     * 
     * @param entradaUsuario
     * @return
     *     returns co.gov.supernotariado.bachue.corebachue.servicios.ws.StringSalidaDTO
     */
    @WebMethod(action = "borrarHuellas")
    @WebResult(name = "salidaResultado", targetNamespace = "")
    @RequestWrapper(localName = "borrarHuellas", targetNamespace = "http://ws.servicios.corebachue.bachue.supernotariado.gov.co/", className = "co.gov.supernotariado.bachue.corebachue.servicios.ws.BorrarHuellas")
    @ResponseWrapper(localName = "borrarHuellasResponse", targetNamespace = "http://ws.servicios.corebachue.bachue.supernotariado.gov.co/", className = "co.gov.supernotariado.bachue.corebachue.servicios.ws.BorrarHuellasResponse")
    public StringSalidaDTO borrarHuellas(
        @WebParam(name = "entradaUsuario", targetNamespace = "")
        BorrarHuellasDTO entradaUsuario);

    /**
     * 
     * @param entradaHuella
     * @return
     *     returns co.gov.supernotariado.bachue.corebachue.servicios.ws.BooleanSalidaDTO
     */
    @WebMethod(action = "enrolarUsuario")
    @WebResult(name = "salidaResultado", targetNamespace = "")
    @RequestWrapper(localName = "enrolarUsuario", targetNamespace = "http://ws.servicios.corebachue.bachue.supernotariado.gov.co/", className = "co.gov.supernotariado.bachue.corebachue.servicios.ws.EnrolarUsuario")
    @ResponseWrapper(localName = "enrolarUsuarioResponse", targetNamespace = "http://ws.servicios.corebachue.bachue.supernotariado.gov.co/", className = "co.gov.supernotariado.bachue.corebachue.servicios.ws.EnrolarUsuarioResponse")
    public BooleanSalidaDTO enrolarUsuario(
        @WebParam(name = "entradaHuella", targetNamespace = "")
        List<HuellaDTO> entradaHuella);

    /**
     * 
     * @param entradaLog
     * @return
     *     returns co.gov.supernotariado.bachue.corebachue.servicios.ws.BooleanSalidaDTO
     */
    @WebMethod(action = "registrarEvento")
    @WebResult(name = "salidaResultado", targetNamespace = "")
    @RequestWrapper(localName = "registrarEvento", targetNamespace = "http://ws.servicios.corebachue.bachue.supernotariado.gov.co/", className = "co.gov.supernotariado.bachue.corebachue.servicios.ws.RegistrarEvento")
    @ResponseWrapper(localName = "registrarEventoResponse", targetNamespace = "http://ws.servicios.corebachue.bachue.supernotariado.gov.co/", className = "co.gov.supernotariado.bachue.corebachue.servicios.ws.RegistrarEventoResponse")
    public BooleanSalidaDTO registrarEvento(
        @WebParam(name = "entradaLog", targetNamespace = "")
        LogDTO entradaLog);

    /**
     * 
     * @param entradaSesion
     * @return
     *     returns co.gov.supernotariado.bachue.corebachue.servicios.ws.SesionDTO
     */
    @WebMethod(action = "consultarSesion")
    @WebResult(name = "salidaSesion", targetNamespace = "")
    @RequestWrapper(localName = "consultarSesion", targetNamespace = "http://ws.servicios.corebachue.bachue.supernotariado.gov.co/", className = "co.gov.supernotariado.bachue.corebachue.servicios.ws.ConsultarSesion")
    @ResponseWrapper(localName = "consultarSesionResponse", targetNamespace = "http://ws.servicios.corebachue.bachue.supernotariado.gov.co/", className = "co.gov.supernotariado.bachue.corebachue.servicios.ws.ConsultarSesionResponse")
    public SesionDTO consultarSesion(
        @WebParam(name = "entradaSesion", targetNamespace = "")
        SesionEntradaDTO entradaSesion);

    /**
     * 
     * @param entradaUsuario
     * @return
     *     returns co.gov.supernotariado.bachue.corebachue.servicios.ws.StringSalidaDTO
     */
    @WebMethod(action = "obtenerTipoSegundoFactor")
    @WebResult(name = "salidaResultado", targetNamespace = "")
    @RequestWrapper(localName = "obtenerTipoSegundoFactor", targetNamespace = "http://ws.servicios.corebachue.bachue.supernotariado.gov.co/", className = "co.gov.supernotariado.bachue.corebachue.servicios.ws.ObtenerTipoSegundoFactor")
    @ResponseWrapper(localName = "obtenerTipoSegundoFactorResponse", targetNamespace = "http://ws.servicios.corebachue.bachue.supernotariado.gov.co/", className = "co.gov.supernotariado.bachue.corebachue.servicios.ws.ObtenerTipoSegundoFactorResponse")
    public StringSalidaDTO obtenerTipoSegundoFactor(
        @WebParam(name = "entradaUsuario", targetNamespace = "")
        UsuarioEntradaDTO entradaUsuario);

    /**
     * 
     * @param entradaUsuario
     * @return
     *     returns co.gov.supernotariado.bachue.corebachue.servicios.ws.StringSalidaDTO
     */
    @WebMethod(action = "crearUsuario")
    @WebResult(name = "salidaResultado", targetNamespace = "")
    @RequestWrapper(localName = "crearUsuario", targetNamespace = "http://ws.servicios.corebachue.bachue.supernotariado.gov.co/", className = "co.gov.supernotariado.bachue.corebachue.servicios.ws.CrearUsuario")
    @ResponseWrapper(localName = "crearUsuarioResponse", targetNamespace = "http://ws.servicios.corebachue.bachue.supernotariado.gov.co/", className = "co.gov.supernotariado.bachue.corebachue.servicios.ws.CrearUsuarioResponse")
    public StringSalidaDTO crearUsuario(
        @WebParam(name = "entradaUsuario", targetNamespace = "")
        UsuarioDTO entradaUsuario);

    /**
     * 
     * @param entradaClave
     * @return
     *     returns co.gov.supernotariado.bachue.corebachue.servicios.ws.StringSalidaDTO
     */
    @WebMethod(action = "actualizarClave")
    @WebResult(name = "salidaResultado", targetNamespace = "")
    @RequestWrapper(localName = "actualizarClave", targetNamespace = "http://ws.servicios.corebachue.bachue.supernotariado.gov.co/", className = "co.gov.supernotariado.bachue.corebachue.servicios.ws.ActualizarClave")
    @ResponseWrapper(localName = "actualizarClaveResponse", targetNamespace = "http://ws.servicios.corebachue.bachue.supernotariado.gov.co/", className = "co.gov.supernotariado.bachue.corebachue.servicios.ws.ActualizarClaveResponse")
    public StringSalidaDTO actualizarClave(
        @WebParam(name = "entradaClave", targetNamespace = "")
        UsuarioDTO entradaClave);

    /**
     * 
     * @param entradaUsuario
     * @return
     *     returns co.gov.supernotariado.bachue.corebachue.servicios.ws.StringSalidaDTO
     */
    @WebMethod(action = "obtenerUsuario")
    @WebResult(name = "salidaResultado", targetNamespace = "")
    @RequestWrapper(localName = "obtenerUsuario", targetNamespace = "http://ws.servicios.corebachue.bachue.supernotariado.gov.co/", className = "co.gov.supernotariado.bachue.corebachue.servicios.ws.ObtenerUsuario")
    @ResponseWrapper(localName = "obtenerUsuarioResponse", targetNamespace = "http://ws.servicios.corebachue.bachue.supernotariado.gov.co/", className = "co.gov.supernotariado.bachue.corebachue.servicios.ws.ObtenerUsuarioResponse")
    public StringSalidaDTO obtenerUsuario(
        @WebParam(name = "entradaUsuario", targetNamespace = "")
        UsuarioEntradaDTO entradaUsuario);

    /**
     * 
     * @param entradaVerificacion
     * @return
     *     returns co.gov.supernotariado.bachue.corebachue.servicios.ws.BooleanSalidaDTO
     */
    @WebMethod(action = "verificarUsuario")
    @WebResult(name = "salidaResultado", targetNamespace = "")
    @RequestWrapper(localName = "verificarUsuario", targetNamespace = "http://ws.servicios.corebachue.bachue.supernotariado.gov.co/", className = "co.gov.supernotariado.bachue.corebachue.servicios.ws.VerificarUsuario")
    @ResponseWrapper(localName = "verificarUsuarioResponse", targetNamespace = "http://ws.servicios.corebachue.bachue.supernotariado.gov.co/", className = "co.gov.supernotariado.bachue.corebachue.servicios.ws.VerificarUsuarioResponse")
    public BooleanSalidaDTO verificarUsuario(
        @WebParam(name = "entradaVerificacion", targetNamespace = "")
        VerificacionDTO entradaVerificacion);

    /**
     * 
     * @param entradaEstadisticas
     * @return
     *     returns co.gov.supernotariado.bachue.corebachue.servicios.ws.EstadisticasSalidaDTO
     */
    @WebMethod(action = "consultarEstadisticas")
    @WebResult(name = "salidaEstadisticas", targetNamespace = "")
    @RequestWrapper(localName = "consultarEstadisticas", targetNamespace = "http://ws.servicios.corebachue.bachue.supernotariado.gov.co/", className = "co.gov.supernotariado.bachue.corebachue.servicios.ws.ConsultarEstadisticas")
    @ResponseWrapper(localName = "consultarEstadisticasResponse", targetNamespace = "http://ws.servicios.corebachue.bachue.supernotariado.gov.co/", className = "co.gov.supernotariado.bachue.corebachue.servicios.ws.ConsultarEstadisticasResponse")
    public EstadisticasSalidaDTO consultarEstadisticas(
        @WebParam(name = "entradaEstadisticas", targetNamespace = "")
        EstadisticasEntradaDTO entradaEstadisticas);

    /**
     * 
     * @param entradaClave
     * @return
     *     returns co.gov.supernotariado.bachue.corebachue.servicios.ws.BooleanSalidaDTO
     */
    @WebMethod(action = "verificarClave")
    @WebResult(name = "salidaResultado", targetNamespace = "")
    @RequestWrapper(localName = "verificarClave", targetNamespace = "http://ws.servicios.corebachue.bachue.supernotariado.gov.co/", className = "co.gov.supernotariado.bachue.corebachue.servicios.ws.VerificarClave")
    @ResponseWrapper(localName = "verificarClaveResponse", targetNamespace = "http://ws.servicios.corebachue.bachue.supernotariado.gov.co/", className = "co.gov.supernotariado.bachue.corebachue.servicios.ws.VerificarClaveResponse")
    public BooleanSalidaDTO verificarClave(
        @WebParam(name = "entradaClave", targetNamespace = "")
        ClaveDTO entradaClave);

    /**
     * 
     * @param entradaAgregarFirma
     * @return
     *     returns co.gov.supernotariado.bachue.corebachue.servicios.ws.AgregarFirmaSalidaDTO
     */
    @WebMethod(action = "agregarFirma")
    @WebResult(name = "agregarFirmaResponse", targetNamespace = "")
    @RequestWrapper(localName = "agregarFirma", targetNamespace = "http://ws.servicios.corebachue.bachue.supernotariado.gov.co/", className = "co.gov.supernotariado.bachue.corebachue.servicios.ws.AgregarFirma")
    @ResponseWrapper(localName = "agregarFirmaResponse", targetNamespace = "http://ws.servicios.corebachue.bachue.supernotariado.gov.co/", className = "co.gov.supernotariado.bachue.corebachue.servicios.ws.AgregarFirmaResponse")
    public AgregarFirmaSalidaDTO agregarFirma(
        @WebParam(name = "entradaAgregarFirma", targetNamespace = "")
        AgregarFirmaDTO entradaAgregarFirma);

    /**
     * 
     * @param entradaObtenerFirma
     * @return
     *     returns co.gov.supernotariado.bachue.corebachue.servicios.ws.ObtenerFirmaSalidaDTO
     */
    @WebMethod(action = "obtenerFirma")
    @WebResult(name = "obtenerFirmaResponse", targetNamespace = "")
    @RequestWrapper(localName = "obtenerFirma", targetNamespace = "http://ws.servicios.corebachue.bachue.supernotariado.gov.co/", className = "co.gov.supernotariado.bachue.corebachue.servicios.ws.ObtenerFirma")
    @ResponseWrapper(localName = "obtenerFirmaResponse", targetNamespace = "http://ws.servicios.corebachue.bachue.supernotariado.gov.co/", className = "co.gov.supernotariado.bachue.corebachue.servicios.ws.ObtenerFirmaResponse")
    public ObtenerFirmaSalidaDTO obtenerFirma(
        @WebParam(name = "entradaObtenerFirma", targetNamespace = "")
        ConsultarFirmaDTO entradaObtenerFirma);

    /**
     * 
     * @param entradaEliminarFirma
     * @return
     *     returns co.gov.supernotariado.bachue.corebachue.servicios.ws.FirmaSalidaDTO
     */
    @WebMethod(action = "eliminarFirma")
    @WebResult(name = "eliminarFirmaResponse", targetNamespace = "")
    @RequestWrapper(localName = "eliminarFirma", targetNamespace = "http://ws.servicios.corebachue.bachue.supernotariado.gov.co/", className = "co.gov.supernotariado.bachue.corebachue.servicios.ws.EliminarFirma")
    @ResponseWrapper(localName = "eliminarFirmaResponse", targetNamespace = "http://ws.servicios.corebachue.bachue.supernotariado.gov.co/", className = "co.gov.supernotariado.bachue.corebachue.servicios.ws.EliminarFirmaResponse")
    public FirmaSalidaDTO eliminarFirma(
        @WebParam(name = "entradaEliminarFirma", targetNamespace = "")
        ConsultarFirmaDTO entradaEliminarFirma);

}
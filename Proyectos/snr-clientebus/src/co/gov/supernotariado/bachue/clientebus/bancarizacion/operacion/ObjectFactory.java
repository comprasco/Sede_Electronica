package co.gov.supernotariado.bachue.clientebus.bancarizacion.operacion;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

import co.gov.supernotariado.bachue.clientebus.bancarizacion.type.cancelartransaccion.CancelarTransaccion;
import co.gov.supernotariado.bachue.clientebus.bancarizacion.type.cancelartransaccion.CancelarTransaccionResponse;
import co.gov.supernotariado.bachue.clientebus.bancarizacion.type.confirmartransaccion.ConfirmarTransaccion;
import co.gov.supernotariado.bachue.clientebus.bancarizacion.type.confirmartransaccion.ConfirmarTransaccionResponse;
import co.gov.supernotariado.bachue.clientebus.bancarizacion.type.confirmartransaccionextendida.ConfirmarTransaccionExtendida;
import co.gov.supernotariado.bachue.clientebus.bancarizacion.type.confirmartransaccionextendida.ConfirmarTransaccionExtendidaResponse;
import co.gov.supernotariado.bachue.clientebus.bancarizacion.type.confirmartransaccionextendidarel.ConfirmarTransaccionExtendidaREL;
import co.gov.supernotariado.bachue.clientebus.bancarizacion.type.confirmartransaccionextendidarel.ConfirmarTransaccionExtendidaRELResponse;
import co.gov.supernotariado.bachue.clientebus.bancarizacion.type.consultarInformacionmatricula.ConsultarInformacionMatricula;
import co.gov.supernotariado.bachue.clientebus.bancarizacion.type.consultarInformacionmatricula.ConsultarInformacionMatriculaResponse;
import co.gov.supernotariado.bachue.clientebus.bancarizacion.type.consultarInformacionmatricula.RespuestaConsultarInformacionMatricula;
import co.gov.supernotariado.bachue.clientebus.bancarizacion.type.consultarestadooficinasregistro.ConsultarEstadoOficinasRegistro;
import co.gov.supernotariado.bachue.clientebus.bancarizacion.type.consultarestadooficinasregistro.ConsultarEstadoOficinasRegistroResponse;
import co.gov.supernotariado.bachue.clientebus.bancarizacion.type.consultarestadooficinasregistro.EntidadOficina;
import co.gov.supernotariado.bachue.clientebus.bancarizacion.type.consultarestadooficinasregistro.RespuestaConsultarEstadoOficinas;
import co.gov.supernotariado.bachue.clientebus.bancarizacion.type.consultarestadotransaccionconvenio.ConsultarEstadoTransaccionConvenio;
import co.gov.supernotariado.bachue.clientebus.bancarizacion.type.consultarestadotransaccionconvenio.ConsultarEstadoTransaccionConvenioResponse;
import co.gov.supernotariado.bachue.clientebus.bancarizacion.type.consultarestadotransaccionconvenio.RespuestaConsultarEstadoTransaccionConvenio;
import co.gov.supernotariado.bachue.clientebus.bancarizacion.type.consultarinformacionmatriculamasivas.ConsultarInformacionMatriculaMasivas;
import co.gov.supernotariado.bachue.clientebus.bancarizacion.type.consultarinformacionmatriculamasivas.ConsultarInformacionMatriculaMasivasResponse;
import co.gov.supernotariado.bachue.clientebus.bancarizacion.type.consultarinformacionmatriculamasivas.EntidadMatriculaSalida;
import co.gov.supernotariado.bachue.clientebus.bancarizacion.type.consultarsaldocuentaprepago.ConsultarSaldoCuentaPrepago;
import co.gov.supernotariado.bachue.clientebus.bancarizacion.type.consultarsaldocuentaprepago.ConsultarSaldoCuentaPrepagoResponse;
import co.gov.supernotariado.bachue.clientebus.bancarizacion.type.consultarsaldocuentaprepago.RespuestaConsultarSaldoCuentaPrepago;
import co.gov.supernotariado.bachue.clientebus.bancarizacion.type.consultartarifaconvenio.ConsultarTarifaConvenio;
import co.gov.supernotariado.bachue.clientebus.bancarizacion.type.consultartarifaconvenio.ConsultarTarifaConvenioResponse;
import co.gov.supernotariado.bachue.clientebus.bancarizacion.type.consultartarifaconvenio.RespuestaConsultarTarifaConvenio;
import co.gov.supernotariado.bachue.clientebus.bancarizacion.type.consultarurlcertificadostransaccion.ConsultarURLCertificadosTransaccion;
import co.gov.supernotariado.bachue.clientebus.bancarizacion.type.consultarurlcertificadostransaccion.ConsultarURLCertificadosTransaccionResponse;
import co.gov.supernotariado.bachue.clientebus.bancarizacion.type.consultarurlcertificadostransaccion.EntidadConsultarCertificadoURL;
import co.gov.supernotariado.bachue.clientebus.bancarizacion.type.consultarurlcertificadostransaccion.EntidadConsultarCertificadosTransaccionURL;
import co.gov.supernotariado.bachue.clientebus.bancarizacion.type.descargarresultadoconsulta.DescargarResultadoConsulta;
import co.gov.supernotariado.bachue.clientebus.bancarizacion.type.descargarresultadoconsulta.DescargarResultadoConsultaResponse;
import co.gov.supernotariado.bachue.clientebus.bancarizacion.type.descargarresultadoconsulta.RespuestaDescargarResultadoConsulta;
import co.gov.supernotariado.bachue.clientebus.bancarizacion.type.generarpinprepago.GenerarPINPrepago;
import co.gov.supernotariado.bachue.clientebus.bancarizacion.type.generarpinprepago.GenerarPINPrepagoResponse;
import co.gov.supernotariado.bachue.clientebus.bancarizacion.type.generarpinprepago.RespuestaGenerarPINPrepago;
import co.gov.supernotariado.bachue.clientebus.bancarizacion.type.generartransaccion.EntidadMatricula;
import co.gov.supernotariado.bachue.clientebus.bancarizacion.type.generartransaccion.GenerarTransaccion;
import co.gov.supernotariado.bachue.clientebus.bancarizacion.type.generartransaccion.GenerarTransaccionResponse;
import co.gov.supernotariado.bachue.clientebus.bancarizacion.type.generartransaccionconsulta.GenerarTransaccionConsulta;
import co.gov.supernotariado.bachue.clientebus.bancarizacion.type.generartransaccionconsulta.GenerarTransaccionConsultaResponse;
import co.gov.supernotariado.bachue.clientebus.bancarizacion.type.generartransaccionconsulta.RespuestaGenerarTransaccionConsulta;
import co.gov.supernotariado.bachue.clientebus.bancarizacion.type.generartransaccionconsultaextendida.GenerarTransaccionConsultaExtendida;
import co.gov.supernotariado.bachue.clientebus.bancarizacion.type.generartransaccionconsultaextendida.GenerarTransaccionConsultaExtendidaResponse;
import co.gov.supernotariado.bachue.clientebus.bancarizacion.type.generartransaccionextendida.GenerarTransaccionExtendida;
import co.gov.supernotariado.bachue.clientebus.bancarizacion.type.generartransaccionextendida.GenerarTransaccionExtendidaResponse;
import co.gov.supernotariado.bachue.clientebus.bancarizacion.type.generartransaccionextendida.RespuestaGenerarTransaccion;
import co.gov.supernotariado.bachue.clientebus.bancarizacion.type.generartransaccioninterna.GenerarTransaccionInterna;
import co.gov.supernotariado.bachue.clientebus.bancarizacion.type.generartransaccioninterna.GenerarTransaccionInternaResponse;
import co.gov.supernotariado.bachue.clientebus.bancarizacion.type.generartransaccionpinprepago.GenerarTransaccionPINPrepago;
import co.gov.supernotariado.bachue.clientebus.bancarizacion.type.generartransaccionpinprepago.GenerarTransaccionPINPrepagoResponse;
import co.gov.supernotariado.bachue.clientebus.bancarizacion.type.generico.RespuestaGeneralTransaccion;
import co.gov.supernotariado.bachue.clientebus.bancarizacion.type.solicitartransaccionpinprepago.SolicitarTransaccionPINPrepago;
import co.gov.supernotariado.bachue.clientebus.bancarizacion.type.solicitartransaccionpinprepago.SolicitarTransaccionPINPrepagoResponse;
import co.gov.supernotariado.bachue.clientebus.bancarizacion.type.solicitarturnorel.RespuestaSolicitarTurnoREL;
import co.gov.supernotariado.bachue.clientebus.bancarizacion.type.solicitarturnorel.SolicitarTurnoREL;
import co.gov.supernotariado.bachue.clientebus.bancarizacion.type.solicitarturnorel.SolicitarTurnoRELResponse;
import co.gov.supernotariado.bachue.clientebus.vo.bancarizacion.consultarcertificadostransaccion.ConsultarCertificadosTransaccionResponseVO;
import co.gov.supernotariado.bachue.clientebus.vo.bancarizacion.consultarcertificadostransaccion.ConsultarCertificadosTransaccionVO;
import co.gov.supernotariado.bachue.clientebus.vo.bancarizacion.consultarcertificadostransaccion.EntidadConsultarCertificadoVO;
import co.gov.supernotariado.bachue.clientebus.vo.bancarizacion.consultarcertificadostransaccion.EntidadConsultarCertificadosTransaccionVO;
import co.gov.supernotariado.bachue.clientebus.vo.bancarizacion.generico.EntidadLogVO;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the co.gov.supernotariado.ctls.services package. 
 * <p>An ConsultaActosTurnoObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GenerarPINPrepagoResponse_QNAME = new QName("http://services.ctls.supernotariado.gov.co/", "generarPINPrepagoResponse");
    private final static QName _ConsultarInformacionMatriculaResponse_QNAME = new QName("http://services.ctls.supernotariado.gov.co/", "consultarInformacionMatriculaResponse");
    private final static QName _GenerarTransaccionPINPrepagoResponse_QNAME = new QName("http://services.ctls.supernotariado.gov.co/", "generarTransaccionPINPrepagoResponse");
    private final static QName _ConsultarTarifaConvenioResponse_QNAME = new QName("http://services.ctls.supernotariado.gov.co/", "consultarTarifaConvenioResponse");
    private final static QName _GenerarPINPrepago_QNAME = new QName("http://services.ctls.supernotariado.gov.co/", "generarPINPrepago");
    private final static QName _GenerarTransaccionConsulta_QNAME = new QName("http://services.ctls.supernotariado.gov.co/", "generarTransaccionConsulta");
    private final static QName _GenerarTransaccionInternaResponse_QNAME = new QName("http://services.ctls.supernotariado.gov.co/", "generarTransaccionInternaResponse");
    private final static QName _SolicitarTurnoRELResponse_QNAME = new QName("http://services.ctls.supernotariado.gov.co/", "solicitarTurnoRELResponse");
    private final static QName _CancelarTransaccionResponse_QNAME = new QName("http://services.ctls.supernotariado.gov.co/", "cancelarTransaccionResponse");
    private final static QName _GenerarTransaccionPINPrepago_QNAME = new QName("http://services.ctls.supernotariado.gov.co/", "generarTransaccionPINPrepago");
    private final static QName _CancelarTransaccion_QNAME = new QName("http://services.ctls.supernotariado.gov.co/", "cancelarTransaccion");
    private final static QName _ConfirmarTransaccion_QNAME = new QName("http://services.ctls.supernotariado.gov.co/", "confirmarTransaccion");
    private final static QName _GenerarTransaccionExtendidaResponse_QNAME = new QName("http://services.ctls.supernotariado.gov.co/", "generarTransaccionExtendidaResponse");
    private final static QName _GenerarTransaccionConsultaExtendida_QNAME = new QName("http://services.ctls.supernotariado.gov.co/", "generarTransaccionConsultaExtendida");
    private final static QName _ConsultarEstadoTransaccionConvenio_QNAME = new QName("http://services.ctls.supernotariado.gov.co/", "consultarEstadoTransaccionConvenio");
    private final static QName _ConsultarInformacionMatricula_QNAME = new QName("http://services.ctls.supernotariado.gov.co/", "consultarInformacionMatricula");
    private final static QName _SolicitarTransaccionPINPrepagoResponse_QNAME = new QName("http://services.ctls.supernotariado.gov.co/", "solicitarTransaccionPINPrepagoResponse");
    private final static QName _ConsultarSaldoCuentaPrepagoResponse_QNAME = new QName("http://services.ctls.supernotariado.gov.co/", "consultarSaldoCuentaPrepagoResponse");
    private final static QName _ConsultarURLCertificadosTransaccionResponse_QNAME = new QName("http://services.ctls.supernotariado.gov.co/", "consultarURLCertificadosTransaccionResponse");
    private final static QName _DescargarResultadoConsultaResponse_QNAME = new QName("http://services.ctls.supernotariado.gov.co/", "descargarResultadoConsultaResponse");
    private final static QName _ConfirmarTransaccionExtendidaRELResponse_QNAME = new QName("http://services.ctls.supernotariado.gov.co/", "confirmarTransaccionExtendidaRELResponse");
    private final static QName _GenerarTransaccionExtendida_QNAME = new QName("http://services.ctls.supernotariado.gov.co/", "generarTransaccionExtendida");
    private final static QName _ConfirmarTransaccionExtendidaResponse_QNAME = new QName("http://services.ctls.supernotariado.gov.co/", "confirmarTransaccionExtendidaResponse");
    private final static QName _ConsultarEstadoTransaccionConvenioResponse_QNAME = new QName("http://services.ctls.supernotariado.gov.co/", "consultarEstadoTransaccionConvenioResponse");
    private final static QName _ConsultarInformacionMatriculaMasivasResponse_QNAME = new QName("http://services.ctls.supernotariado.gov.co/", "consultarInformacionMatriculaMasivasResponse");
    private final static QName _ConsultarURLCertificadosTransaccion_QNAME = new QName("http://services.ctls.supernotariado.gov.co/", "consultarURLCertificadosTransaccion");
    private final static QName _ConsultarSaldoCuentaPrepago_QNAME = new QName("http://services.ctls.supernotariado.gov.co/", "consultarSaldoCuentaPrepago");
    private final static QName _ConsultarEstadoOficinasRegistroResponse_QNAME = new QName("http://services.ctls.supernotariado.gov.co/", "consultarEstadoOficinasRegistroResponse");
    private final static QName _ConsultarTarifaConvenio_QNAME = new QName("http://services.ctls.supernotariado.gov.co/", "consultarTarifaConvenio");
    private final static QName _ConsultarEstadoOficinasRegistro_QNAME = new QName("http://services.ctls.supernotariado.gov.co/", "consultarEstadoOficinasRegistro");
    private final static QName _GenerarTransaccionInterna_QNAME = new QName("http://services.ctls.supernotariado.gov.co/", "generarTransaccionInterna");
    private final static QName _GenerarTransaccionResponse_QNAME = new QName("http://services.ctls.supernotariado.gov.co/", "generarTransaccionResponse");
    private final static QName _ConsultarCertificadosTransaccionResponse_QNAME = new QName("http://services.ctls.supernotariado.gov.co/", "consultarCertificadosTransaccionResponse");
    private final static QName _ConsultarInformacionMatriculaMasivas_QNAME = new QName("http://services.ctls.supernotariado.gov.co/", "consultarInformacionMatriculaMasivas");
    private final static QName _SolicitarTransaccionPINPrepago_QNAME = new QName("http://services.ctls.supernotariado.gov.co/", "solicitarTransaccionPINPrepago");
    private final static QName _ConfirmarTransaccionResponse_QNAME = new QName("http://services.ctls.supernotariado.gov.co/", "confirmarTransaccionResponse");
    private final static QName _ConfirmarTransaccionExtendidaREL_QNAME = new QName("http://services.ctls.supernotariado.gov.co/", "confirmarTransaccionExtendidaREL");
    private final static QName _DescargarResultadoConsulta_QNAME = new QName("http://services.ctls.supernotariado.gov.co/", "descargarResultadoConsulta");
    private final static QName _SolicitarTurnoREL_QNAME = new QName("http://services.ctls.supernotariado.gov.co/", "solicitarTurnoREL");
    private final static QName _ConsultarCertificadosTransaccion_QNAME = new QName("http://services.ctls.supernotariado.gov.co/", "consultarCertificadosTransaccion");
    private final static QName _GenerarTransaccion_QNAME = new QName("http://services.ctls.supernotariado.gov.co/", "generarTransaccion");
    private final static QName _ConfirmarTransaccionExtendida_QNAME = new QName("http://services.ctls.supernotariado.gov.co/", "confirmarTransaccionExtendida");
    private final static QName _GenerarTransaccionConsultaResponse_QNAME = new QName("http://services.ctls.supernotariado.gov.co/", "generarTransaccionConsultaResponse");
    private final static QName _GenerarTransaccionConsultaExtendidaResponse_QNAME = new QName("http://services.ctls.supernotariado.gov.co/", "generarTransaccionConsultaExtendidaResponse");

    /**
     * Create a new ConsultaActosTurnoObjectFactory that can be used to create new instances of schema derived classes for package: co.gov.supernotariado.ctls.services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GenerarPINPrepagoResponse }
     * 
     */
    public GenerarPINPrepagoResponse createGenerarPINPrepagoResponse() {
        return new GenerarPINPrepagoResponse();
    }

    /**
     * Create an instance of {@link ConsultarTarifaConvenioResponse }
     * 
     */
    public ConsultarTarifaConvenioResponse createConsultarTarifaConvenioResponse() {
        return new ConsultarTarifaConvenioResponse();
    }

    /**
     * Create an instance of {@link GenerarPINPrepago }
     * 
     */
    public GenerarPINPrepago createGenerarPINPrepago() {
        return new GenerarPINPrepago();
    }

    /**
     * Create an instance of {@link ConsultarInformacionMatriculaResponse }
     * 
     */
    public ConsultarInformacionMatriculaResponse createConsultarInformacionMatriculaResponse() {
        return new ConsultarInformacionMatriculaResponse();
    }

    /**
     * Create an instance of {@link GenerarTransaccionPINPrepagoResponse }
     * 
     */
    public GenerarTransaccionPINPrepagoResponse createGenerarTransaccionPINPrepagoResponse() {
        return new GenerarTransaccionPINPrepagoResponse();
    }

    /**
     * Create an instance of {@link ConfirmarTransaccion }
     * 
     */
    public ConfirmarTransaccion createConfirmarTransaccion() {
        return new ConfirmarTransaccion();
    }

    /**
     * Create an instance of {@link GenerarTransaccionExtendidaResponse }
     * 
     */
    public GenerarTransaccionExtendidaResponse createGenerarTransaccionExtendidaResponse() {
        return new GenerarTransaccionExtendidaResponse();
    }

    /**
     * Create an instance of {@link CancelarTransaccion }
     * 
     */
    public CancelarTransaccion createCancelarTransaccion() {
        return new CancelarTransaccion();
    }

    /**
     * Create an instance of {@link CancelarTransaccionResponse }
     * 
     */
    public CancelarTransaccionResponse createCancelarTransaccionResponse() {
        return new CancelarTransaccionResponse();
    }

    /**
     * Create an instance of {@link GenerarTransaccionPINPrepago }
     * 
     */
    public GenerarTransaccionPINPrepago createGenerarTransaccionPINPrepago() {
        return new GenerarTransaccionPINPrepago();
    }

    /**
     * Create an instance of {@link GenerarTransaccionInternaResponse }
     * 
     */
    public GenerarTransaccionInternaResponse createGenerarTransaccionInternaResponse() {
        return new GenerarTransaccionInternaResponse();
    }

    /**
     * Create an instance of {@link SolicitarTurnoRELResponse }
     * 
     */
    public SolicitarTurnoRELResponse createSolicitarTurnoRELResponse() {
        return new SolicitarTurnoRELResponse();
    }

    /**
     * Create an instance of {@link GenerarTransaccionConsulta }
     * 
     */
    public GenerarTransaccionConsulta createGenerarTransaccionConsulta() {
        return new GenerarTransaccionConsulta();
    }

    /**
     * Create an instance of {@link ConsultarSaldoCuentaPrepagoResponse }
     * 
     */
    public ConsultarSaldoCuentaPrepagoResponse createConsultarSaldoCuentaPrepagoResponse() {
        return new ConsultarSaldoCuentaPrepagoResponse();
    }

    /**
     * Create an instance of {@link ConsultarURLCertificadosTransaccionResponse }
     * 
     */
    public ConsultarURLCertificadosTransaccionResponse createConsultarURLCertificadosTransaccionResponse() {
        return new ConsultarURLCertificadosTransaccionResponse();
    }

    /**
     * Create an instance of {@link SolicitarTransaccionPINPrepagoResponse }
     * 
     */
    public SolicitarTransaccionPINPrepagoResponse createSolicitarTransaccionPINPrepagoResponse() {
        return new SolicitarTransaccionPINPrepagoResponse();
    }

    /**
     * Create an instance of {@link ConsultarEstadoTransaccionConvenio }
     * 
     */
    public ConsultarEstadoTransaccionConvenio createConsultarEstadoTransaccionConvenio() {
        return new ConsultarEstadoTransaccionConvenio();
    }

    /**
     * Create an instance of {@link ConsultarInformacionMatricula }
     * 
     */
    public ConsultarInformacionMatricula createConsultarInformacionMatricula() {
        return new ConsultarInformacionMatricula();
    }

    /**
     * Create an instance of {@link GenerarTransaccionConsultaExtendida }
     * 
     */
    public GenerarTransaccionConsultaExtendida createGenerarTransaccionConsultaExtendida() {
        return new GenerarTransaccionConsultaExtendida();
    }

    /**
     * Create an instance of {@link ConsultarEstadoOficinasRegistroResponse }
     * 
     */
    public ConsultarEstadoOficinasRegistroResponse createConsultarEstadoOficinasRegistroResponse() {
        return new ConsultarEstadoOficinasRegistroResponse();
    }

    /**
     * Create an instance of {@link ConsultarTarifaConvenio }
     * 
     */
    public ConsultarTarifaConvenio createConsultarTarifaConvenio() {
        return new ConsultarTarifaConvenio();
    }

    /**
     * Create an instance of {@link ConsultarSaldoCuentaPrepago }
     * 
     */
    public ConsultarSaldoCuentaPrepago createConsultarSaldoCuentaPrepago() {
        return new ConsultarSaldoCuentaPrepago();
    }

    /**
     * Create an instance of {@link ConsultarEstadoTransaccionConvenioResponse }
     * 
     */
    public ConsultarEstadoTransaccionConvenioResponse createConsultarEstadoTransaccionConvenioResponse() {
        return new ConsultarEstadoTransaccionConvenioResponse();
    }

    /**
     * Create an instance of {@link ConsultarInformacionMatriculaMasivasResponse }
     * 
     */
    public ConsultarInformacionMatriculaMasivasResponse createConsultarInformacionMatriculaMasivasResponse() {
        return new ConsultarInformacionMatriculaMasivasResponse();
    }

    /**
     * Create an instance of {@link ConsultarURLCertificadosTransaccion }
     * 
     */
    public ConsultarURLCertificadosTransaccion createConsultarURLCertificadosTransaccion() {
        return new ConsultarURLCertificadosTransaccion();
    }

    /**
     * Create an instance of {@link ConfirmarTransaccionExtendidaResponse }
     * 
     */
    public ConfirmarTransaccionExtendidaResponse createConfirmarTransaccionExtendidaResponse() {
        return new ConfirmarTransaccionExtendidaResponse();
    }

    /**
     * Create an instance of {@link GenerarTransaccionExtendida }
     * 
     */
    public GenerarTransaccionExtendida createGenerarTransaccionExtendida() {
        return new GenerarTransaccionExtendida();
    }

    /**
     * Create an instance of {@link ConfirmarTransaccionExtendidaRELResponse }
     * 
     */
    public ConfirmarTransaccionExtendidaRELResponse createConfirmarTransaccionExtendidaRELResponse() {
        return new ConfirmarTransaccionExtendidaRELResponse();
    }

    /**
     * Create an instance of {@link DescargarResultadoConsultaResponse }
     * 
     */
    public DescargarResultadoConsultaResponse createDescargarResultadoConsultaResponse() {
        return new DescargarResultadoConsultaResponse();
    }

    /**
     * Create an instance of {@link SolicitarTransaccionPINPrepago }
     * 
     */
    public SolicitarTransaccionPINPrepago createSolicitarTransaccionPINPrepago() {
        return new SolicitarTransaccionPINPrepago();
    }

    /**
     * Create an instance of {@link ConsultarInformacionMatriculaMasivas }
     * 
     */
    public ConsultarInformacionMatriculaMasivas createConsultarInformacionMatriculaMasivas() {
        return new ConsultarInformacionMatriculaMasivas();
    }

    /**
     * Create an instance of {@link ConsultarCertificadosTransaccionResponseVO }
     * 
     */
    public ConsultarCertificadosTransaccionResponseVO createConsultarCertificadosTransaccionResponse() {
        return new ConsultarCertificadosTransaccionResponseVO();
    }

    /**
     * Create an instance of {@link GenerarTransaccionInterna }
     * 
     */
    public GenerarTransaccionInterna createGenerarTransaccionInterna() {
        return new GenerarTransaccionInterna();
    }

    /**
     * Create an instance of {@link GenerarTransaccionResponse }
     * 
     */
    public GenerarTransaccionResponse createGenerarTransaccionResponse() {
        return new GenerarTransaccionResponse();
    }

    /**
     * Create an instance of {@link ConsultarEstadoOficinasRegistro }
     * 
     */
    public ConsultarEstadoOficinasRegistro createConsultarEstadoOficinasRegistro() {
        return new ConsultarEstadoOficinasRegistro();
    }

    /**
     * Create an instance of {@link ConfirmarTransaccionResponse }
     * 
     */
    public ConfirmarTransaccionResponse createConfirmarTransaccionResponse() {
        return new ConfirmarTransaccionResponse();
    }

    /**
     * Create an instance of {@link GenerarTransaccionConsultaExtendidaResponse }
     * 
     */
    public GenerarTransaccionConsultaExtendidaResponse createGenerarTransaccionConsultaExtendidaResponse() {
        return new GenerarTransaccionConsultaExtendidaResponse();
    }

    /**
     * Create an instance of {@link GenerarTransaccionConsultaResponse }
     * 
     */
    public GenerarTransaccionConsultaResponse createGenerarTransaccionConsultaResponse() {
        return new GenerarTransaccionConsultaResponse();
    }

    /**
     * Create an instance of {@link ConfirmarTransaccionExtendida }
     * 
     */
    public ConfirmarTransaccionExtendida createConfirmarTransaccionExtendida() {
        return new ConfirmarTransaccionExtendida();
    }

    /**
     * Create an instance of {@link ConsultarCertificadosTransaccionVO }
     * 
     */
    public ConsultarCertificadosTransaccionVO createConsultarCertificadosTransaccion() {
        return new ConsultarCertificadosTransaccionVO();
    }

    /**
     * Create an instance of {@link GenerarTransaccion }
     * 
     */
    public GenerarTransaccion createGenerarTransaccion() {
        return new GenerarTransaccion();
    }

    /**
     * Create an instance of {@link ConfirmarTransaccionExtendidaREL }
     * 
     */
    public ConfirmarTransaccionExtendidaREL createConfirmarTransaccionExtendidaREL() {
        return new ConfirmarTransaccionExtendidaREL();
    }

    /**
     * Create an instance of {@link DescargarResultadoConsulta }
     * 
     */
    public DescargarResultadoConsulta createDescargarResultadoConsulta() {
        return new DescargarResultadoConsulta();
    }

    /**
     * Create an instance of {@link SolicitarTurnoREL }
     * 
     */
    public SolicitarTurnoREL createSolicitarTurnoREL() {
        return new SolicitarTurnoREL();
    }

    /**
     * Create an instance of {@link EntidadConsultarCertificadosTransaccionURL }
     * 
     */
    public EntidadConsultarCertificadosTransaccionURL createEntidadConsultarCertificadosTransaccionURL() {
        return new EntidadConsultarCertificadosTransaccionURL();
    }

    /**
     * Create an instance of {@link RespuestaConsultarInformacionMatricula }
     * 
     */
    public RespuestaConsultarInformacionMatricula createRespuestaConsultarInformacionMatricula() {
        return new RespuestaConsultarInformacionMatricula();
    }

    /**
     * Create an instance of {@link RespuestaConsultarEstadoOficinas }
     * 
     */
    public RespuestaConsultarEstadoOficinas createRespuestaConsultarEstadoOficinas() {
        return new RespuestaConsultarEstadoOficinas();
    }

    /**
     * Create an instance of {@link EntidadMatriculaSalida }
     * 
     */
    public EntidadMatriculaSalida createEntidadMatriculaSalida() {
        return new EntidadMatriculaSalida();
    }

    /**
     * Create an instance of {@link EntidadMatricula }
     * 
     */
    public EntidadMatricula createEntidadMatricula() {
        return new EntidadMatricula();
    }

    /**
     * Create an instance of {@link EntidadLogVO }
     * 
     */
    public EntidadLogVO createEntidadLog() {
        return new EntidadLogVO();
    }

    /**
     * Create an instance of {@link RespuestaConsultarSaldoCuentaPrepago }
     * 
     */
    public RespuestaConsultarSaldoCuentaPrepago createRespuestaConsultarSaldoCuentaPrepago() {
        return new RespuestaConsultarSaldoCuentaPrepago();
    }

    /**
     * Create an instance of {@link RespuestaGenerarTransaccion }
     * 
     */
    public RespuestaGenerarTransaccion createRespuestaGenerarTransaccion() {
        return new RespuestaGenerarTransaccion();
    }

    /**
     * Create an instance of {@link EntidadConsultarCertificadosTransaccionVO }
     * 
     */
    public EntidadConsultarCertificadosTransaccionVO createEntidadConsultarCertificadosTransaccion() {
        return new EntidadConsultarCertificadosTransaccionVO();
    }

    /**
     * Create an instance of {@link EntidadConsultarCertificadoURL }
     * 
     */
    public EntidadConsultarCertificadoURL createEntidadConsultarCertificadoURL() {
        return new EntidadConsultarCertificadoURL();
    }

    /**
     * Create an instance of {@link RespuestaGeneralTransaccion }
     * 
     */
    public RespuestaGeneralTransaccion createRespuestaGeneralTransaccion() {
        return new RespuestaGeneralTransaccion();
    }

    /**
     * Create an instance of {@link RespuestaSolicitarTurnoREL }
     * 
     */
    public RespuestaSolicitarTurnoREL createRespuestaSolicitarTurnoREL() {
        return new RespuestaSolicitarTurnoREL();
    }

    /**
     * Create an instance of {@link RespuestaGenerarPINPrepago }
     * 
     */
    public RespuestaGenerarPINPrepago createRespuestaGenerarPINPrepago() {
        return new RespuestaGenerarPINPrepago();
    }

    /**
     * Create an instance of {@link RespuestaDescargarResultadoConsulta }
     * 
     */
    public RespuestaDescargarResultadoConsulta createRespuestaDescargarResultadoConsulta() {
        return new RespuestaDescargarResultadoConsulta();
    }

    /**
     * Create an instance of {@link RespuestaConsultarEstadoTransaccionConvenio }
     * 
     */
    public RespuestaConsultarEstadoTransaccionConvenio createRespuestaConsultarEstadoTransaccionConvenio() {
        return new RespuestaConsultarEstadoTransaccionConvenio();
    }

    /**
     * Create an instance of {@link RespuestaGenerarTransaccionConsulta }
     * 
     */
    public RespuestaGenerarTransaccionConsulta createRespuestaGenerarTransaccionConsulta() {
        return new RespuestaGenerarTransaccionConsulta();
    }

    /**
     * Create an instance of {@link EntidadOficina }
     * 
     */
    public EntidadOficina createEntidadOficina() {
        return new EntidadOficina();
    }

    /**
     * Create an instance of {@link EntidadConsultarCertificadoVO }
     * 
     */
    public EntidadConsultarCertificadoVO createEntidadConsultarCertificado() {
        return new EntidadConsultarCertificadoVO();
    }

    /**
     * Create an instance of {@link RespuestaConsultarTarifaConvenio }
     * 
     */
    public RespuestaConsultarTarifaConvenio createRespuestaConsultarTarifaConvenio() {
        return new RespuestaConsultarTarifaConvenio();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenerarPINPrepagoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.ctls.supernotariado.gov.co/", name = "generarPINPrepagoResponse")
    public JAXBElement<GenerarPINPrepagoResponse> createGenerarPINPrepagoResponse(GenerarPINPrepagoResponse value) {
        return new JAXBElement<GenerarPINPrepagoResponse>(_GenerarPINPrepagoResponse_QNAME, GenerarPINPrepagoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarInformacionMatriculaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.ctls.supernotariado.gov.co/", name = "consultarInformacionMatriculaResponse")
    public JAXBElement<ConsultarInformacionMatriculaResponse> createConsultarInformacionMatriculaResponse(ConsultarInformacionMatriculaResponse value) {
        return new JAXBElement<ConsultarInformacionMatriculaResponse>(_ConsultarInformacionMatriculaResponse_QNAME, ConsultarInformacionMatriculaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenerarTransaccionPINPrepagoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.ctls.supernotariado.gov.co/", name = "generarTransaccionPINPrepagoResponse")
    public JAXBElement<GenerarTransaccionPINPrepagoResponse> createGenerarTransaccionPINPrepagoResponse(GenerarTransaccionPINPrepagoResponse value) {
        return new JAXBElement<GenerarTransaccionPINPrepagoResponse>(_GenerarTransaccionPINPrepagoResponse_QNAME, GenerarTransaccionPINPrepagoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarTarifaConvenioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.ctls.supernotariado.gov.co/", name = "consultarTarifaConvenioResponse")
    public JAXBElement<ConsultarTarifaConvenioResponse> createConsultarTarifaConvenioResponse(ConsultarTarifaConvenioResponse value) {
        return new JAXBElement<ConsultarTarifaConvenioResponse>(_ConsultarTarifaConvenioResponse_QNAME, ConsultarTarifaConvenioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenerarPINPrepago }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.ctls.supernotariado.gov.co/", name = "generarPINPrepago")
    public JAXBElement<GenerarPINPrepago> createGenerarPINPrepago(GenerarPINPrepago value) {
        return new JAXBElement<GenerarPINPrepago>(_GenerarPINPrepago_QNAME, GenerarPINPrepago.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenerarTransaccionConsulta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.ctls.supernotariado.gov.co/", name = "generarTransaccionConsulta")
    public JAXBElement<GenerarTransaccionConsulta> createGenerarTransaccionConsulta(GenerarTransaccionConsulta value) {
        return new JAXBElement<GenerarTransaccionConsulta>(_GenerarTransaccionConsulta_QNAME, GenerarTransaccionConsulta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenerarTransaccionInternaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.ctls.supernotariado.gov.co/", name = "generarTransaccionInternaResponse")
    public JAXBElement<GenerarTransaccionInternaResponse> createGenerarTransaccionInternaResponse(GenerarTransaccionInternaResponse value) {
        return new JAXBElement<GenerarTransaccionInternaResponse>(_GenerarTransaccionInternaResponse_QNAME, GenerarTransaccionInternaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SolicitarTurnoRELResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.ctls.supernotariado.gov.co/", name = "solicitarTurnoRELResponse")
    public JAXBElement<SolicitarTurnoRELResponse> createSolicitarTurnoRELResponse(SolicitarTurnoRELResponse value) {
        return new JAXBElement<SolicitarTurnoRELResponse>(_SolicitarTurnoRELResponse_QNAME, SolicitarTurnoRELResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelarTransaccionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.ctls.supernotariado.gov.co/", name = "cancelarTransaccionResponse")
    public JAXBElement<CancelarTransaccionResponse> createCancelarTransaccionResponse(CancelarTransaccionResponse value) {
        return new JAXBElement<CancelarTransaccionResponse>(_CancelarTransaccionResponse_QNAME, CancelarTransaccionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenerarTransaccionPINPrepago }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.ctls.supernotariado.gov.co/", name = "generarTransaccionPINPrepago")
    public JAXBElement<GenerarTransaccionPINPrepago> createGenerarTransaccionPINPrepago(GenerarTransaccionPINPrepago value) {
        return new JAXBElement<GenerarTransaccionPINPrepago>(_GenerarTransaccionPINPrepago_QNAME, GenerarTransaccionPINPrepago.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelarTransaccion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.ctls.supernotariado.gov.co/", name = "cancelarTransaccion")
    public JAXBElement<CancelarTransaccion> createCancelarTransaccion(CancelarTransaccion value) {
        return new JAXBElement<CancelarTransaccion>(_CancelarTransaccion_QNAME, CancelarTransaccion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConfirmarTransaccion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.ctls.supernotariado.gov.co/", name = "confirmarTransaccion")
    public JAXBElement<ConfirmarTransaccion> createConfirmarTransaccion(ConfirmarTransaccion value) {
        return new JAXBElement<ConfirmarTransaccion>(_ConfirmarTransaccion_QNAME, ConfirmarTransaccion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenerarTransaccionExtendidaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.ctls.supernotariado.gov.co/", name = "generarTransaccionExtendidaResponse")
    public JAXBElement<GenerarTransaccionExtendidaResponse> createGenerarTransaccionExtendidaResponse(GenerarTransaccionExtendidaResponse value) {
        return new JAXBElement<GenerarTransaccionExtendidaResponse>(_GenerarTransaccionExtendidaResponse_QNAME, GenerarTransaccionExtendidaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenerarTransaccionConsultaExtendida }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.ctls.supernotariado.gov.co/", name = "generarTransaccionConsultaExtendida")
    public JAXBElement<GenerarTransaccionConsultaExtendida> createGenerarTransaccionConsultaExtendida(GenerarTransaccionConsultaExtendida value) {
        return new JAXBElement<GenerarTransaccionConsultaExtendida>(_GenerarTransaccionConsultaExtendida_QNAME, GenerarTransaccionConsultaExtendida.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarEstadoTransaccionConvenio }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.ctls.supernotariado.gov.co/", name = "consultarEstadoTransaccionConvenio")
    public JAXBElement<ConsultarEstadoTransaccionConvenio> createConsultarEstadoTransaccionConvenio(ConsultarEstadoTransaccionConvenio value) {
        return new JAXBElement<ConsultarEstadoTransaccionConvenio>(_ConsultarEstadoTransaccionConvenio_QNAME, ConsultarEstadoTransaccionConvenio.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarInformacionMatricula }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.ctls.supernotariado.gov.co/", name = "consultarInformacionMatricula")
    public JAXBElement<ConsultarInformacionMatricula> createConsultarInformacionMatricula(ConsultarInformacionMatricula value) {
        return new JAXBElement<ConsultarInformacionMatricula>(_ConsultarInformacionMatricula_QNAME, ConsultarInformacionMatricula.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SolicitarTransaccionPINPrepagoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.ctls.supernotariado.gov.co/", name = "solicitarTransaccionPINPrepagoResponse")
    public JAXBElement<SolicitarTransaccionPINPrepagoResponse> createSolicitarTransaccionPINPrepagoResponse(SolicitarTransaccionPINPrepagoResponse value) {
        return new JAXBElement<SolicitarTransaccionPINPrepagoResponse>(_SolicitarTransaccionPINPrepagoResponse_QNAME, SolicitarTransaccionPINPrepagoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarSaldoCuentaPrepagoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.ctls.supernotariado.gov.co/", name = "consultarSaldoCuentaPrepagoResponse")
    public JAXBElement<ConsultarSaldoCuentaPrepagoResponse> createConsultarSaldoCuentaPrepagoResponse(ConsultarSaldoCuentaPrepagoResponse value) {
        return new JAXBElement<ConsultarSaldoCuentaPrepagoResponse>(_ConsultarSaldoCuentaPrepagoResponse_QNAME, ConsultarSaldoCuentaPrepagoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarURLCertificadosTransaccionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.ctls.supernotariado.gov.co/", name = "consultarURLCertificadosTransaccionResponse")
    public JAXBElement<ConsultarURLCertificadosTransaccionResponse> createConsultarURLCertificadosTransaccionResponse(ConsultarURLCertificadosTransaccionResponse value) {
        return new JAXBElement<ConsultarURLCertificadosTransaccionResponse>(_ConsultarURLCertificadosTransaccionResponse_QNAME, ConsultarURLCertificadosTransaccionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DescargarResultadoConsultaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.ctls.supernotariado.gov.co/", name = "descargarResultadoConsultaResponse")
    public JAXBElement<DescargarResultadoConsultaResponse> createDescargarResultadoConsultaResponse(DescargarResultadoConsultaResponse value) {
        return new JAXBElement<DescargarResultadoConsultaResponse>(_DescargarResultadoConsultaResponse_QNAME, DescargarResultadoConsultaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConfirmarTransaccionExtendidaRELResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.ctls.supernotariado.gov.co/", name = "confirmarTransaccionExtendidaRELResponse")
    public JAXBElement<ConfirmarTransaccionExtendidaRELResponse> createConfirmarTransaccionExtendidaRELResponse(ConfirmarTransaccionExtendidaRELResponse value) {
        return new JAXBElement<ConfirmarTransaccionExtendidaRELResponse>(_ConfirmarTransaccionExtendidaRELResponse_QNAME, ConfirmarTransaccionExtendidaRELResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenerarTransaccionExtendida }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.ctls.supernotariado.gov.co/", name = "generarTransaccionExtendida")
    public JAXBElement<GenerarTransaccionExtendida> createGenerarTransaccionExtendida(GenerarTransaccionExtendida value) {
        return new JAXBElement<GenerarTransaccionExtendida>(_GenerarTransaccionExtendida_QNAME, GenerarTransaccionExtendida.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConfirmarTransaccionExtendidaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.ctls.supernotariado.gov.co/", name = "confirmarTransaccionExtendidaResponse")
    public JAXBElement<ConfirmarTransaccionExtendidaResponse> createConfirmarTransaccionExtendidaResponse(ConfirmarTransaccionExtendidaResponse value) {
        return new JAXBElement<ConfirmarTransaccionExtendidaResponse>(_ConfirmarTransaccionExtendidaResponse_QNAME, ConfirmarTransaccionExtendidaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarEstadoTransaccionConvenioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.ctls.supernotariado.gov.co/", name = "consultarEstadoTransaccionConvenioResponse")
    public JAXBElement<ConsultarEstadoTransaccionConvenioResponse> createConsultarEstadoTransaccionConvenioResponse(ConsultarEstadoTransaccionConvenioResponse value) {
        return new JAXBElement<ConsultarEstadoTransaccionConvenioResponse>(_ConsultarEstadoTransaccionConvenioResponse_QNAME, ConsultarEstadoTransaccionConvenioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarInformacionMatriculaMasivasResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.ctls.supernotariado.gov.co/", name = "consultarInformacionMatriculaMasivasResponse")
    public JAXBElement<ConsultarInformacionMatriculaMasivasResponse> createConsultarInformacionMatriculaMasivasResponse(ConsultarInformacionMatriculaMasivasResponse value) {
        return new JAXBElement<ConsultarInformacionMatriculaMasivasResponse>(_ConsultarInformacionMatriculaMasivasResponse_QNAME, ConsultarInformacionMatriculaMasivasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarURLCertificadosTransaccion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.ctls.supernotariado.gov.co/", name = "consultarURLCertificadosTransaccion")
    public JAXBElement<ConsultarURLCertificadosTransaccion> createConsultarURLCertificadosTransaccion(ConsultarURLCertificadosTransaccion value) {
        return new JAXBElement<ConsultarURLCertificadosTransaccion>(_ConsultarURLCertificadosTransaccion_QNAME, ConsultarURLCertificadosTransaccion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarSaldoCuentaPrepago }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.ctls.supernotariado.gov.co/", name = "consultarSaldoCuentaPrepago")
    public JAXBElement<ConsultarSaldoCuentaPrepago> createConsultarSaldoCuentaPrepago(ConsultarSaldoCuentaPrepago value) {
        return new JAXBElement<ConsultarSaldoCuentaPrepago>(_ConsultarSaldoCuentaPrepago_QNAME, ConsultarSaldoCuentaPrepago.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarEstadoOficinasRegistroResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.ctls.supernotariado.gov.co/", name = "consultarEstadoOficinasRegistroResponse")
    public JAXBElement<ConsultarEstadoOficinasRegistroResponse> createConsultarEstadoOficinasRegistroResponse(ConsultarEstadoOficinasRegistroResponse value) {
        return new JAXBElement<ConsultarEstadoOficinasRegistroResponse>(_ConsultarEstadoOficinasRegistroResponse_QNAME, ConsultarEstadoOficinasRegistroResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarTarifaConvenio }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.ctls.supernotariado.gov.co/", name = "consultarTarifaConvenio")
    public JAXBElement<ConsultarTarifaConvenio> createConsultarTarifaConvenio(ConsultarTarifaConvenio value) {
        return new JAXBElement<ConsultarTarifaConvenio>(_ConsultarTarifaConvenio_QNAME, ConsultarTarifaConvenio.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarEstadoOficinasRegistro }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.ctls.supernotariado.gov.co/", name = "consultarEstadoOficinasRegistro")
    public JAXBElement<ConsultarEstadoOficinasRegistro> createConsultarEstadoOficinasRegistro(ConsultarEstadoOficinasRegistro value) {
        return new JAXBElement<ConsultarEstadoOficinasRegistro>(_ConsultarEstadoOficinasRegistro_QNAME, ConsultarEstadoOficinasRegistro.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenerarTransaccionInterna }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.ctls.supernotariado.gov.co/", name = "generarTransaccionInterna")
    public JAXBElement<GenerarTransaccionInterna> createGenerarTransaccionInterna(GenerarTransaccionInterna value) {
        return new JAXBElement<GenerarTransaccionInterna>(_GenerarTransaccionInterna_QNAME, GenerarTransaccionInterna.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenerarTransaccionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.ctls.supernotariado.gov.co/", name = "generarTransaccionResponse")
    public JAXBElement<GenerarTransaccionResponse> createGenerarTransaccionResponse(GenerarTransaccionResponse value) {
        return new JAXBElement<GenerarTransaccionResponse>(_GenerarTransaccionResponse_QNAME, GenerarTransaccionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarCertificadosTransaccionResponseVO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.ctls.supernotariado.gov.co/", name = "consultarCertificadosTransaccionResponse")
    public JAXBElement<ConsultarCertificadosTransaccionResponseVO> createConsultarCertificadosTransaccionResponse(ConsultarCertificadosTransaccionResponseVO value) {
        return new JAXBElement<ConsultarCertificadosTransaccionResponseVO>(_ConsultarCertificadosTransaccionResponse_QNAME, ConsultarCertificadosTransaccionResponseVO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarInformacionMatriculaMasivas }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.ctls.supernotariado.gov.co/", name = "consultarInformacionMatriculaMasivas")
    public JAXBElement<ConsultarInformacionMatriculaMasivas> createConsultarInformacionMatriculaMasivas(ConsultarInformacionMatriculaMasivas value) {
        return new JAXBElement<ConsultarInformacionMatriculaMasivas>(_ConsultarInformacionMatriculaMasivas_QNAME, ConsultarInformacionMatriculaMasivas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SolicitarTransaccionPINPrepago }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.ctls.supernotariado.gov.co/", name = "solicitarTransaccionPINPrepago")
    public JAXBElement<SolicitarTransaccionPINPrepago> createSolicitarTransaccionPINPrepago(SolicitarTransaccionPINPrepago value) {
        return new JAXBElement<SolicitarTransaccionPINPrepago>(_SolicitarTransaccionPINPrepago_QNAME, SolicitarTransaccionPINPrepago.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConfirmarTransaccionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.ctls.supernotariado.gov.co/", name = "confirmarTransaccionResponse")
    public JAXBElement<ConfirmarTransaccionResponse> createConfirmarTransaccionResponse(ConfirmarTransaccionResponse value) {
        return new JAXBElement<ConfirmarTransaccionResponse>(_ConfirmarTransaccionResponse_QNAME, ConfirmarTransaccionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConfirmarTransaccionExtendidaREL }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.ctls.supernotariado.gov.co/", name = "confirmarTransaccionExtendidaREL")
    public JAXBElement<ConfirmarTransaccionExtendidaREL> createConfirmarTransaccionExtendidaREL(ConfirmarTransaccionExtendidaREL value) {
        return new JAXBElement<ConfirmarTransaccionExtendidaREL>(_ConfirmarTransaccionExtendidaREL_QNAME, ConfirmarTransaccionExtendidaREL.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DescargarResultadoConsulta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.ctls.supernotariado.gov.co/", name = "descargarResultadoConsulta")
    public JAXBElement<DescargarResultadoConsulta> createDescargarResultadoConsulta(DescargarResultadoConsulta value) {
        return new JAXBElement<DescargarResultadoConsulta>(_DescargarResultadoConsulta_QNAME, DescargarResultadoConsulta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SolicitarTurnoREL }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.ctls.supernotariado.gov.co/", name = "solicitarTurnoREL")
    public JAXBElement<SolicitarTurnoREL> createSolicitarTurnoREL(SolicitarTurnoREL value) {
        return new JAXBElement<SolicitarTurnoREL>(_SolicitarTurnoREL_QNAME, SolicitarTurnoREL.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarCertificadosTransaccionVO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.ctls.supernotariado.gov.co/", name = "consultarCertificadosTransaccion")
    public JAXBElement<ConsultarCertificadosTransaccionVO> createConsultarCertificadosTransaccion(ConsultarCertificadosTransaccionVO value) {
        return new JAXBElement<ConsultarCertificadosTransaccionVO>(_ConsultarCertificadosTransaccion_QNAME, ConsultarCertificadosTransaccionVO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenerarTransaccion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.ctls.supernotariado.gov.co/", name = "generarTransaccion")
    public JAXBElement<GenerarTransaccion> createGenerarTransaccion(GenerarTransaccion value) {
        return new JAXBElement<GenerarTransaccion>(_GenerarTransaccion_QNAME, GenerarTransaccion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConfirmarTransaccionExtendida }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.ctls.supernotariado.gov.co/", name = "confirmarTransaccionExtendida")
    public JAXBElement<ConfirmarTransaccionExtendida> createConfirmarTransaccionExtendida(ConfirmarTransaccionExtendida value) {
        return new JAXBElement<ConfirmarTransaccionExtendida>(_ConfirmarTransaccionExtendida_QNAME, ConfirmarTransaccionExtendida.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenerarTransaccionConsultaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.ctls.supernotariado.gov.co/", name = "generarTransaccionConsultaResponse")
    public JAXBElement<GenerarTransaccionConsultaResponse> createGenerarTransaccionConsultaResponse(GenerarTransaccionConsultaResponse value) {
        return new JAXBElement<GenerarTransaccionConsultaResponse>(_GenerarTransaccionConsultaResponse_QNAME, GenerarTransaccionConsultaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenerarTransaccionConsultaExtendidaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.ctls.supernotariado.gov.co/", name = "generarTransaccionConsultaExtendidaResponse")
    public JAXBElement<GenerarTransaccionConsultaExtendidaResponse> createGenerarTransaccionConsultaExtendidaResponse(GenerarTransaccionConsultaExtendidaResponse value) {
        return new JAXBElement<GenerarTransaccionConsultaExtendidaResponse>(_GenerarTransaccionConsultaExtendidaResponse_QNAME, GenerarTransaccionConsultaExtendidaResponse.class, null, value);
    }

}

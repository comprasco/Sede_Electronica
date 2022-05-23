
package co.gov.supernotariado.bachue.clientebus.estadojuridicofolio.types.consultarestadojuridico;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the co.gov.gobiernoenlinea.gel_xml._1_0.schemas.integracion.supernotariado.bachue package. 
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
public class ConsultarEstadoJuridicoObjectFactory {

    private static final QName CQN_CONSULTA_ESTADO_JURIDICO_RESPUESTA = new QName("http://www.gobiernoenlinea.gov.co/GEL-XML/1.0/schemas/integracion/supernotariado/bachue", "consultaEstadoJuridicoRespuesta");
    private static final QName CQN_CONSULTA_ESTADO_JURIDICO_SOLICITUD = new QName("http://www.gobiernoenlinea.gov.co/GEL-XML/1.0/schemas/integracion/supernotariado/bachue", "consultaEstadoJuridicaSolicitud");

    /**
     * Create a new ConsultaActosTurnoObjectFactory that can be used to create new instances of schema derived classes for package: co.gov.gobiernoenlinea.gel_xml._1_0.schemas.integracion.supernotariado.bachue
     * 
     */
    public ConsultarEstadoJuridicoObjectFactory() {
    	//Constructor vacio
    }

    /**
     * Create an instance of {@link TipoSalidaConsultaEstadoJuridicoFolio }
     * 
     */
    public TipoSalidaConsultaEstadoJuridicoFolio createTipoSalidaConsultaEstadoJuridicoFolio() {
        return new TipoSalidaConsultaEstadoJuridicoFolio();
    }

    /**
     * Create an instance of {@link TipoEntradaConsultaJuridicaFolio }
     * 
     */
    public TipoEntradaConsultaJuridicaFolio createTipoEntradaConsultaJuridicaFolio() {
        return new TipoEntradaConsultaJuridicaFolio();
    }

    /**
     * Create an instance of {@link TipoInterviniente }
     * 
     */
    public TipoInterviniente createTipoInterviniente() {
        return new TipoInterviniente();
    }

    /**
     * Create an instance of {@link TipoMedidaCautelar }
     * 
     */
    public TipoMedidaCautelar createTipoMedidaCautelar() {
        return new TipoMedidaCautelar();
    }

    /**
     * Create an instance of {@link TipoPropietario }
     * 
     */
    public TipoPropietario createTipoPropietario() {
        return new TipoPropietario();
    }

    /**
     * Create an instance of {@link TipoMatriculaMatriz }
     * 
     */
    public TipoMatriculaMatriz createTipoMatriculaMatriz() {
        return new TipoMatriculaMatriz();
    }

    /**
     * Create an instance of {@link TipoAnotacion }
     * 
     */
    public TipoAnotacion createTipoAnotacion() {
        return new TipoAnotacion();
    }

    /**
     * Create an instance of {@link TipoAnotacionCancelada }
     * 
     */
    public TipoAnotacionCancelada createTipoAnotacionCancelada() {
        return new TipoAnotacionCancelada();
    }

    /**
     * Create an instance of {@link TipoMatriculaDerivada }
     * 
     */
    public TipoMatriculaDerivada createTipoMatriculaDerivada() {
        return new TipoMatriculaDerivada();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoSalidaConsultaEstadoJuridicoFolio }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gobiernoenlinea.gov.co/GEL-XML/1.0/schemas/integracion/supernotariado/bachue", name = "consultaEstadoJuridicoRespuesta")
    public JAXBElement<TipoSalidaConsultaEstadoJuridicoFolio> createConsultaEstadoJuridicoRespuesta(TipoSalidaConsultaEstadoJuridicoFolio value) {
        return new JAXBElement<>(CQN_CONSULTA_ESTADO_JURIDICO_RESPUESTA, TipoSalidaConsultaEstadoJuridicoFolio.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoEntradaConsultaJuridicaFolio }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gobiernoenlinea.gov.co/GEL-XML/1.0/schemas/integracion/supernotariado/bachue", name = "consultaEstadoJuridicaSolicitud")
    public JAXBElement<TipoEntradaConsultaJuridicaFolio> createConsultaEstadoJuridicaSolicitud(TipoEntradaConsultaJuridicaFolio value) {
        return new JAXBElement<>(CQN_CONSULTA_ESTADO_JURIDICO_SOLICITUD, TipoEntradaConsultaJuridicaFolio.class, null, value);
    }

}

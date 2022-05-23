
package co.gov.supernotariado.bachue.clientebus.consultarhistorialsolicitudespagadas.types.consultardetallesolicitud;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the https.www_supernotariado_gov_co.schemas.bachue.ee.consultahistorialsolicitudespagadas.consultardetallesolicitud.v1 package. 
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
public class ConsultarDetalleSolicitudObjectFactory {

    private static final QName CQN_SALIDA_CONSULTAR_DETALLE_SOLICITUD = new QName("https://www.supernotariado.gov.co/schemas/bachue/ee/consultahistorialsolicitudespagadas/consultardetallesolicitud/v1", "salidaConsultarDetalleSolicitud");
    private static final QName CQN_ENTRADA_CONSULTAR_DETALLE_SOLICITUD = new QName("https://www.supernotariado.gov.co/schemas/bachue/ee/consultahistorialsolicitudespagadas/consultardetallesolicitud/v1", "entradaConsultarDetalleSolicitud");

    /**
     * Create a new ConsultaActosTurnoObjectFactory that can be used to create new instances of schema derived classes for package: https.www_supernotariado_gov_co.schemas.bachue.ee.consultahistorialsolicitudespagadas.consultardetallesolicitud.v1
     * 
     */
    public ConsultarDetalleSolicitudObjectFactory() {
    	//Constructor vacio
    }

    /**
     * Create an instance of {@link TipoSalidaConsultarDetalleSolicitud }
     * 
     */
    public TipoSalidaConsultarDetalleSolicitud createTipoSalidaConsultarDetalleSolicitud() {
        return new TipoSalidaConsultarDetalleSolicitud();
    }

    /**
     * Create an instance of {@link TipoEntradaConsultarDetalleSolicitud }
     * 
     */
    public TipoEntradaConsultarDetalleSolicitud createTipoEntradaConsultarDetalleSolicitud() {
        return new TipoEntradaConsultarDetalleSolicitud();
    }

    /**
     * Create an instance of {@link SolicitanteType }
     * 
     */
    public SolicitanteType createSolicitanteType() {
        return new SolicitanteType();
    }

    /**
     * Create an instance of {@link TurnoType }
     * 
     */
    public TurnoType createTurnoType() {
        return new TurnoType();
    }

    /**
     * Create an instance of {@link TurnosType }
     * 
     */
    public TurnosType createTurnosType() {
        return new TurnosType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoSalidaConsultarDetalleSolicitud }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/consultahistorialsolicitudespagadas/consultardetallesolicitud/v1", name = "salidaConsultarDetalleSolicitud")
    public JAXBElement<TipoSalidaConsultarDetalleSolicitud> createSalidaConsultarDetalleSolicitud(TipoSalidaConsultarDetalleSolicitud value) {
        return new JAXBElement<>(CQN_SALIDA_CONSULTAR_DETALLE_SOLICITUD, TipoSalidaConsultarDetalleSolicitud.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoEntradaConsultarDetalleSolicitud }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/consultahistorialsolicitudespagadas/consultardetallesolicitud/v1", name = "entradaConsultarDetalleSolicitud")
    public JAXBElement<TipoEntradaConsultarDetalleSolicitud> createEntradaConsultarDetalleSolicitud(TipoEntradaConsultarDetalleSolicitud value) {
        return new JAXBElement<>(CQN_ENTRADA_CONSULTAR_DETALLE_SOLICITUD, TipoEntradaConsultarDetalleSolicitud.class, null, value);
    }

}

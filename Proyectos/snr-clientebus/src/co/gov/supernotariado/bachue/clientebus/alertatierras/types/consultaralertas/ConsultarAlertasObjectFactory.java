
package co.gov.supernotariado.bachue.clientebus.alertatierras.types.consultaralertas;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the https.www_supernotariado_gov_co.schemas.bachue.ee.alertatierras.consultaralertas.v1 package. 
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
public class ConsultarAlertasObjectFactory {

    private static final QName CQN_ENTRADA_CONSULTAR_ALERTAS = new QName("https://www.supernotariado.gov.co/schemas/bachue/ee/alertaTierras/consultarAlertas/v1", "entradaConsultarAlertas");
    private static final QName CQN_SALIDA_CONSULTAR_ALERTAS = new QName("https://www.supernotariado.gov.co/schemas/bachue/ee/alertaTierras/consultarAlertas/v1", "salidaConsultarAlertas");

    /**
     * Create a new ConsultaActosTurnoObjectFactory that can be used to create new instances of schema derived classes for package: https.www_supernotariado_gov_co.schemas.bachue.ee.alertatierras.consultaralertas.v1
     * 
     */
    public ConsultarAlertasObjectFactory() {
    	//Constructor vacio
    }

    /**
     * Create an instance of {@link TipoSalidaConsultarAlertas }
     * 
     */
    public TipoSalidaConsultarAlertas createTipoSalidaConsultarAlertas() {
        return new TipoSalidaConsultarAlertas();
    }

    /**
     * Create an instance of {@link TipoSalidaConsultarAlertas.ListaAlertas }
     * 
     */
    public TipoSalidaConsultarAlertas.ListaAlertas createTipoSalidaConsultarAlertasListaAlertas() {
        return new TipoSalidaConsultarAlertas.ListaAlertas();
    }

    /**
     * Create an instance of {@link TipoEntradaConsultarAlertas }
     * 
     */
    public TipoEntradaConsultarAlertas createTipoEntradaConsultarAlertas() {
        return new TipoEntradaConsultarAlertas();
    }

    /**
     * Create an instance of {@link TipoSalidaConsultarAlertas.ListaAlertas.Alerta }
     * 
     */
    public TipoSalidaConsultarAlertas.ListaAlertas.Alerta createTipoSalidaConsultarAlertasListaAlertasAlerta() {
        return new TipoSalidaConsultarAlertas.ListaAlertas.Alerta();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoEntradaConsultarAlertas }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/alertaTierras/consultarAlertas/v1", name = "entradaConsultarAlertas")
    public JAXBElement<TipoEntradaConsultarAlertas> createEntradaConsultarAlertas(TipoEntradaConsultarAlertas value) {
        return new JAXBElement<>(CQN_ENTRADA_CONSULTAR_ALERTAS, TipoEntradaConsultarAlertas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoSalidaConsultarAlertas }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/alertaTierras/consultarAlertas/v1", name = "salidaConsultarAlertas")
    public JAXBElement<TipoSalidaConsultarAlertas> createSalidaConsultarAlertas(TipoSalidaConsultarAlertas value) {
        return new JAXBElement<>(CQN_SALIDA_CONSULTAR_ALERTAS, TipoSalidaConsultarAlertas.class, null, value);
    }

}

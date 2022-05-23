
package co.gov.supernotariado.bachue.clientebus.alertatierras.types.rechazarcorreccionalerta;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the https.www_supernotariado_gov_co.schemas.bachue.ee.alertatierras.rechazarcorreccionalerta.v1 package. 
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
public class RechazarCorreccionAlertaObjectFactory {

    private static final QName CQN_SALIDA_RECHAZAR_CORRECCION_ALERTA = new QName("https://www.supernotariado.gov.co/schemas/bachue/ee/alertaTierras/rechazarCorreccionAlerta/v1", "salidaRechazarCorreccionAlerta");
    private static final QName CQN_ENTRADA_RECHAZAR_CORRECCION_ALERTA = new QName("https://www.supernotariado.gov.co/schemas/bachue/ee/alertaTierras/rechazarCorreccionAlerta/v1", "entradaRechazarCorreccionAlerta");

    /**
     * Create a new ConsultaActosTurnoObjectFactory that can be used to create new instances of schema derived classes for package: https.www_supernotariado_gov_co.schemas.bachue.ee.alertatierras.rechazarcorreccionalerta.v1
     * 
     */
    public RechazarCorreccionAlertaObjectFactory() {
    	//Constructor vacio
    }

    /**
     * Create an instance of {@link TipoEntradaRechazarCorreccionAlerta }
     * 
     */
    public TipoEntradaRechazarCorreccionAlerta createTipoEntradaRechazarCorreccionAlerta() {
        return new TipoEntradaRechazarCorreccionAlerta();
    }

    /**
     * Create an instance of {@link TipoSalidaRechazarCorreccionAlerta }
     * 
     */
    public TipoSalidaRechazarCorreccionAlerta createTipoSalidaRechazarCorreccionAlerta() {
        return new TipoSalidaRechazarCorreccionAlerta();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoSalidaRechazarCorreccionAlerta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/alertaTierras/rechazarCorreccionAlerta/v1", name = "salidaRechazarCorreccionAlerta")
    public JAXBElement<TipoSalidaRechazarCorreccionAlerta> createSalidaRechazarCorreccionAlerta(TipoSalidaRechazarCorreccionAlerta value) {
        return new JAXBElement<>(CQN_SALIDA_RECHAZAR_CORRECCION_ALERTA, TipoSalidaRechazarCorreccionAlerta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoEntradaRechazarCorreccionAlerta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/alertaTierras/rechazarCorreccionAlerta/v1", name = "entradaRechazarCorreccionAlerta")
    public JAXBElement<TipoEntradaRechazarCorreccionAlerta> createEntradaRechazarCorreccionAlerta(TipoEntradaRechazarCorreccionAlerta value) {
        return new JAXBElement<>(CQN_ENTRADA_RECHAZAR_CORRECCION_ALERTA, TipoEntradaRechazarCorreccionAlerta.class, null, value);
    }

}

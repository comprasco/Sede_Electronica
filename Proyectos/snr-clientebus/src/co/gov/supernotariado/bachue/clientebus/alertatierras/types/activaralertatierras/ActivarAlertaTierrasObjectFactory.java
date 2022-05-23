
package co.gov.supernotariado.bachue.clientebus.alertatierras.types.activaralertatierras;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the https.www_supernotariado_gov_co.schemas.bachue.ee.alertatierras.activaralertatierras.v1 package. 
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
public class ActivarAlertaTierrasObjectFactory {

    private static final QName CQN_ENTRADA_ACTIVAR_ALERTAS_TIERRAS = new QName("https://www.supernotariado.gov.co/schemas/bachue/ee/alertaTierras/activarAlertaTierras/v1", "entradaActivarAlertaTierras");
    private static final QName CQN_SALIDA_ACTIVAR_ALERTA_TIERRAS = new QName("https://www.supernotariado.gov.co/schemas/bachue/ee/alertaTierras/activarAlertaTierras/v1", "salidaActivarAlertaTierras");

    /**
     * Create a new ConsultaActosTurnoObjectFactory that can be used to create new instances of schema derived classes for package: https.www_supernotariado_gov_co.schemas.bachue.ee.alertatierras.activaralertatierras.v1
     * 
     */
    public ActivarAlertaTierrasObjectFactory() {
    	//Constructor vacio
    }

    /**
     * Create an instance of {@link TipoEntradaActivarAlertaTierras }
     * 
     */
    public TipoEntradaActivarAlertaTierras createTipoEntradaActivarAlertaTierras() {
        return new TipoEntradaActivarAlertaTierras();
    }

    /**
     * Create an instance of {@link TipoSalidaActivarAlertaTierras }
     * 
     */
    public TipoSalidaActivarAlertaTierras createTipoSalidaActivarAlertaTierras() {
        return new TipoSalidaActivarAlertaTierras();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoEntradaActivarAlertaTierras }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/alertaTierras/activarAlertaTierras/v1", name = "entradaActivarAlertaTierras")
    public JAXBElement<TipoEntradaActivarAlertaTierras> createEntradaActivarAlertaTierras(TipoEntradaActivarAlertaTierras value) {
        return new JAXBElement<>(CQN_ENTRADA_ACTIVAR_ALERTAS_TIERRAS, TipoEntradaActivarAlertaTierras.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoSalidaActivarAlertaTierras }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/alertaTierras/activarAlertaTierras/v1", name = "salidaActivarAlertaTierras")
    public JAXBElement<TipoSalidaActivarAlertaTierras> createSalidaActivarAlertaTierras(TipoSalidaActivarAlertaTierras value) {
        return new JAXBElement<>(CQN_SALIDA_ACTIVAR_ALERTA_TIERRAS, TipoSalidaActivarAlertaTierras.class, null, value);
    }

}

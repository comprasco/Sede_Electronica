
package co.gov.supernotariado.bachue.clientebus.alertatierras.types.inscribiralertacabecera;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the https.www_supernotariado_gov_co.schemas.bachue.ee.alertatierras.inscribiralertacabecera.v1 package. 
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
public class InscribirAlertaCabeceraObjectFactory {

    private static final QName CQN_SALIDA_INSCRIBIR_ALERTA_CABECERA = new QName("https://www.supernotariado.gov.co/schemas/bachue/ee/alertaTierras/inscribirAlertaCabecera/v1", "salidaInscribirAlertaCabecera");
    private static final QName CQN_ENTRADA_INSCRIBIR_ALERTA_CABECERA = new QName("https://www.supernotariado.gov.co/schemas/bachue/ee/alertaTierras/inscribirAlertaCabecera/v1", "entradaInscribirAlertaCabecera");

    /**
     * Create a new ConsultaActosTurnoObjectFactory that can be used to create new instances of schema derived classes for package: https.www_supernotariado_gov_co.schemas.bachue.ee.alertatierras.inscribiralertacabecera.v1
     * 
     */
    public InscribirAlertaCabeceraObjectFactory() {
    	//Constructor vacio
    }

    /**
     * Create an instance of {@link TipoEntradaInscribirAlertaCabecera }
     * 
     */
    public TipoEntradaInscribirAlertaCabecera createTipoEntradaInscribirAlertaCabecera() {
        return new TipoEntradaInscribirAlertaCabecera();
    }

    /**
     * Create an instance of {@link TipoSalidaInscribirAlertaCabecera }
     * 
     */
    public TipoSalidaInscribirAlertaCabecera createTipoSalidaInscribirAlertaCabecera() {
        return new TipoSalidaInscribirAlertaCabecera();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoSalidaInscribirAlertaCabecera }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/alertaTierras/inscribirAlertaCabecera/v1", name = "salidaInscribirAlertaCabecera")
    public JAXBElement<TipoSalidaInscribirAlertaCabecera> createSalidaInscribirAlertaCabecera(TipoSalidaInscribirAlertaCabecera value) {
        return new JAXBElement<>(CQN_SALIDA_INSCRIBIR_ALERTA_CABECERA, TipoSalidaInscribirAlertaCabecera.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoEntradaInscribirAlertaCabecera }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/alertaTierras/inscribirAlertaCabecera/v1", name = "entradaInscribirAlertaCabecera")
    public JAXBElement<TipoEntradaInscribirAlertaCabecera> createEntradaInscribirAlertaCabecera(TipoEntradaInscribirAlertaCabecera value) {
        return new JAXBElement<>(CQN_ENTRADA_INSCRIBIR_ALERTA_CABECERA, TipoEntradaInscribirAlertaCabecera.class, null, value);
    }

}

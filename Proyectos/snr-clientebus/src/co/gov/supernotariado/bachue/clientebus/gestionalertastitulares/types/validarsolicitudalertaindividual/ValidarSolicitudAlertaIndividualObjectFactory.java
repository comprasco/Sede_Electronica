
package co.gov.supernotariado.bachue.clientebus.gestionalertastitulares.types.validarsolicitudalertaindividual;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the https.www_supernotariado_gov_co.schemas.bachue.ee.gestionalertastitulares.validarsolicitudalertaindividual.v1 package. 
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
public class ValidarSolicitudAlertaIndividualObjectFactory {

    private static final QName CQN_ENTRADA_VALIDAR_SOLICITUD_ALERTA_INDIVIDUAL = new QName("https://www.supernotariado.gov.co/schemas/bachue/ee/gestionalertastitulares/validarsolicitudalertaindividual/v1", "entradaValidarSolicitudAlertaIndividual");
    private static final QName CQN_SALIDA_VALIDAR_SOLICITUD_ALERTA_INDIVIDUAL = new QName("https://www.supernotariado.gov.co/schemas/bachue/ee/gestionalertastitulares/validarsolicitudalertaindividual/v1", "salidaValidarSolicitudAlertaIndividual");

    /**
     * Create a new ConsultaActosTurnoObjectFactory that can be used to create new instances of schema derived classes for package: https.www_supernotariado_gov_co.schemas.bachue.ee.gestionalertastitulares.validarsolicitudalertaindividual.v1
     * 
     */
    public ValidarSolicitudAlertaIndividualObjectFactory() {
    	//Constructor vacio
    }

    /**
     * Create an instance of {@link TipoEntradaValidarSolicitudAlertaIndividual }
     * 
     */
    public TipoEntradaValidarSolicitudAlertaIndividual createTipoEntradaValidarSolicitudAlertaIndividual() {
        return new TipoEntradaValidarSolicitudAlertaIndividual();
    }

    /**
     * Create an instance of {@link TipoSalidaValidarSolicitudAlertaIndividual }
     * 
     */
    public TipoSalidaValidarSolicitudAlertaIndividual createTipoSalidaValidarSolicitudAlertaIndividual() {
        return new TipoSalidaValidarSolicitudAlertaIndividual();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoEntradaValidarSolicitudAlertaIndividual }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/gestionalertastitulares/validarsolicitudalertaindividual/v1", name = "entradaValidarSolicitudAlertaIndividual")
    public JAXBElement<TipoEntradaValidarSolicitudAlertaIndividual> createEntradaValidarSolicitudAlertaIndividual(TipoEntradaValidarSolicitudAlertaIndividual value) {
        return new JAXBElement<>(CQN_ENTRADA_VALIDAR_SOLICITUD_ALERTA_INDIVIDUAL, TipoEntradaValidarSolicitudAlertaIndividual.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoSalidaValidarSolicitudAlertaIndividual }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/gestionalertastitulares/validarsolicitudalertaindividual/v1", name = "salidaValidarSolicitudAlertaIndividual")
    public JAXBElement<TipoSalidaValidarSolicitudAlertaIndividual> createSalidaValidarSolicitudAlertaIndividual(TipoSalidaValidarSolicitudAlertaIndividual value) {
        return new JAXBElement<>(CQN_SALIDA_VALIDAR_SOLICITUD_ALERTA_INDIVIDUAL, TipoSalidaValidarSolicitudAlertaIndividual.class, null, value);
    }

}

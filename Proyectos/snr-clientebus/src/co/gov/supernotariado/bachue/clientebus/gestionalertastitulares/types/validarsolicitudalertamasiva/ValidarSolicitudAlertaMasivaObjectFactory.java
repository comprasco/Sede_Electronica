package co.gov.supernotariado.bachue.clientebus.gestionalertastitulares.types.validarsolicitudalertamasiva;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the https.www_supernotariado_gov_co.schemas.bachue.ee.gestionalertastitulares.validarsolicitudalertamasiva.v1 package. 
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
public class ValidarSolicitudAlertaMasivaObjectFactory {

    private static final QName CQN_ENTRADA_VALIDAR_SOLICITUD_ALERTA_MASIVA = new QName("https://www.supernotariado.gov.co/schemas/bachue/ee/gestionalertastitulares/validarsolicitudalertamasiva/v1", "entradaValidarSolicitudAlertaMasiva");
    private static final QName CQN_SALIDA_VALIDAR_SOLICITUD_ALERTA_MASIVA = new QName("https://www.supernotariado.gov.co/schemas/bachue/ee/gestionalertastitulares/validarsolicitudalertamasiva/v1", "salidaValidarSolicitudAlertaMasiva");

    /**
     * Create a new ConsultaActosTurnoObjectFactory that can be used to create new instances of schema derived classes for package: https.www_supernotariado_gov_co.schemas.bachue.ee.gestionalertastitulares.validarsolicitudalertamasiva.v1
     * 
     */
    public ValidarSolicitudAlertaMasivaObjectFactory() {
    	// Constructor vacio
    }

    /**
     * Create an instance of {@link TipoSalidaValidarSolicitudAlertaMasiva }
     * 
     */
    public TipoSalidaValidarSolicitudAlertaMasiva createTipoSalidaValidarSolicitudAlertaMasiva() {
        return new TipoSalidaValidarSolicitudAlertaMasiva();
    }

    /**
     * Create an instance of {@link TipoEntradaValidarSolicitudAlertaMasiva }
     * 
     */
    public TipoEntradaValidarSolicitudAlertaMasiva createTipoEntradaValidarSolicitudAlertaMasiva() {
        return new TipoEntradaValidarSolicitudAlertaMasiva();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoEntradaValidarSolicitudAlertaMasiva }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/gestionalertastitulares/validarsolicitudalertamasiva/v1", name = "entradaValidarSolicitudAlertaMasiva")
    public JAXBElement<TipoEntradaValidarSolicitudAlertaMasiva> createEntradaValidarSolicitudAlertaMasiva(TipoEntradaValidarSolicitudAlertaMasiva value) {
        return new JAXBElement<>(CQN_ENTRADA_VALIDAR_SOLICITUD_ALERTA_MASIVA, TipoEntradaValidarSolicitudAlertaMasiva.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoSalidaValidarSolicitudAlertaMasiva }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/gestionalertastitulares/validarsolicitudalertamasiva/v1", name = "salidaValidarSolicitudAlertaMasiva")
    public JAXBElement<TipoSalidaValidarSolicitudAlertaMasiva> createSalidaValidarSolicitudAlertaMasiva(TipoSalidaValidarSolicitudAlertaMasiva value) {
        return new JAXBElement<>(CQN_SALIDA_VALIDAR_SOLICITUD_ALERTA_MASIVA, TipoSalidaValidarSolicitudAlertaMasiva.class, null, value);
    }

}

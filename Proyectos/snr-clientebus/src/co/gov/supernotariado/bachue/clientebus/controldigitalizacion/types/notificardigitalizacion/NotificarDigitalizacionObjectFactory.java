
package co.gov.supernotariado.bachue.clientebus.controldigitalizacion.types.notificardigitalizacion;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the https.www_supernotariado_gov_co.schemas.bachue.ci.controldigitalizacion.notificardigitalizacion.v1 package. 
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
public class NotificarDigitalizacionObjectFactory {

    private static final QName CQN_SALIDA_NOTIFICAR_DIGITALIZACION = new QName("https://www.supernotariado.gov.co/schemas/bachue/ci/controldigitalizacion/notificardigitalizacion/v1", "salidaNotificarDigitalizacion");
    private static final QName CQN_ENTRADA_NOTIFICAR_DIGITALIZACION = new QName("https://www.supernotariado.gov.co/schemas/bachue/ci/controldigitalizacion/notificardigitalizacion/v1", "entradaNotificarDigitalizacion");

    /**
     * Create a new ConsultaActosTurnoObjectFactory that can be used to create new instances of schema derived classes for package: https.www_supernotariado_gov_co.schemas.bachue.ci.controldigitalizacion.notificardigitalizacion.v1
     * 
     */
    public NotificarDigitalizacionObjectFactory() {
    	//constructor vacio
    }

    /**
     * Create an instance of {@link TipoSalidaNotificarDigitalizacion }
     * 
     */
    public TipoSalidaNotificarDigitalizacion createTipoSalidaNotificarDigitalizacion() {
        return new TipoSalidaNotificarDigitalizacion();
    }

    /**
     * Create an instance of {@link TipoEntradaNotificarDigitalizacion }
     * 
     */
    public TipoEntradaNotificarDigitalizacion createTipoEntradaNotificarDigitalizacion() {
        return new TipoEntradaNotificarDigitalizacion();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoSalidaNotificarDigitalizacion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/ci/controldigitalizacion/notificardigitalizacion/v1", name = "salidaNotificarDigitalizacion")
    public JAXBElement<TipoSalidaNotificarDigitalizacion> createSalidaNotificarDigitalizacion(TipoSalidaNotificarDigitalizacion value) {
        return new JAXBElement<>(CQN_SALIDA_NOTIFICAR_DIGITALIZACION, TipoSalidaNotificarDigitalizacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoEntradaNotificarDigitalizacion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/ci/controldigitalizacion/notificardigitalizacion/v1", name = "entradaNotificarDigitalizacion")
    public JAXBElement<TipoEntradaNotificarDigitalizacion> createEntradaNotificarDigitalizacion(TipoEntradaNotificarDigitalizacion value) {
        return new JAXBElement<>(CQN_ENTRADA_NOTIFICAR_DIGITALIZACION, TipoEntradaNotificarDigitalizacion.class, null, value);
    }

}

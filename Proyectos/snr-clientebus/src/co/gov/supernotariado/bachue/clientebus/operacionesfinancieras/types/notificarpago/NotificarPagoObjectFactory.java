
package co.gov.supernotariado.bachue.clientebus.operacionesfinancieras.types.notificarpago;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the https.www_supernotariado_gov_co.schemas.bachue.ef.operacionesfinancieras.notificarpago.v2 package. 
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
public class NotificarPagoObjectFactory {

	private static final String CS_NOMBREESPACIO = "https://www.supernotariado.gov.co/schemas/bachue/ef/operacionesfinancieras/notificarpago/v2";
    private static final QName CQN_ENTRADA_NOTIFICAR_PAGO = new QName(CS_NOMBREESPACIO, "entradaNotificarPago");
    private static final QName CQN_SALIDA_NOTIFICAR_PAGO = new QName(CS_NOMBREESPACIO, "salidaNotificarPago");
    private static final QName CQN_TIPO_SALIDA_NOTIFICAR_PAGO_DESCRIPCION_MENSAJE = new QName(CS_NOMBREESPACIO, "descripcionMensaje");

    /**
     * Create a new ConsultaActosTurnoObjectFactory that can be used to create new instances of schema derived classes for package: https.www_supernotariado_gov_co.schemas.bachue.ef.operacionesfinancieras.notificarpago.v2
     * 
     */
    public NotificarPagoObjectFactory() {
    	// contructor vacio
    }

    /**
     * Create an instance of {@link TipoSalidaNotificarPago }
     * 
     */
    public TipoSalidaNotificarPago createTipoSalidaNotificarPago() {
        return new TipoSalidaNotificarPago();
    }

    /**
     * Create an instance of {@link TipoEntradaNotificarPago }
     * 
     */
    public TipoEntradaNotificarPago createTipoEntradaNotificarPago() {
        return new TipoEntradaNotificarPago();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoEntradaNotificarPago }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/ef/operacionesfinancieras/notificarpago/v2", name = "entradaNotificarPago")
    public JAXBElement<TipoEntradaNotificarPago> createEntradaNotificarPago(TipoEntradaNotificarPago value) {
        return new JAXBElement<>(CQN_ENTRADA_NOTIFICAR_PAGO, TipoEntradaNotificarPago.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoSalidaNotificarPago }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/ef/operacionesfinancieras/notificarpago/v2", name = "salidaNotificarPago")
    public JAXBElement<TipoSalidaNotificarPago> createSalidaNotificarPago(TipoSalidaNotificarPago value) {
        return new JAXBElement<>(CQN_SALIDA_NOTIFICAR_PAGO, TipoSalidaNotificarPago.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/ef/operacionesfinancieras/notificarpago/v2", name = "descripcionMensaje", scope = TipoSalidaNotificarPago.class)
    public JAXBElement<String> createTipoSalidaNotificarPagoDescripcionMensaje(String value) {
        return new JAXBElement<>(CQN_TIPO_SALIDA_NOTIFICAR_PAGO_DESCRIPCION_MENSAJE, String.class, TipoSalidaNotificarPago.class, value);
    }

}

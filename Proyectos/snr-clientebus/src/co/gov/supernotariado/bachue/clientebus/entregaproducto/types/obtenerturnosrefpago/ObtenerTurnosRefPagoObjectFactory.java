
package co.gov.supernotariado.bachue.clientebus.entregaproducto.types.obtenerturnosrefpago;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the https.www_supernotariado_gov_co.schemas.bachue.ee.entregaproducto.obtenerturnosrefpago.v1 package. 
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
public class ObtenerTurnosRefPagoObjectFactory {

    private static final QName CQN_SALIDA_OBTENER_TURNOS_REF_PAGO = new QName("https://www.supernotariado.gov.co/schemas/bachue/ee/entregaproducto/obtenerturnosrefpago/v1", "salidaObtenerTurnosRefPago");
    private static final QName CQN_ENTRADA_OBTENER_TURNOS_REF_PAGO = new QName("https://www.supernotariado.gov.co/schemas/bachue/ee/entregaproducto/obtenerturnosrefpago/v1", "entradaObtenerTurnosRefPago");

    /**
     * Create a new ConsultaActosTurnoObjectFactory that can be used to create new instances of schema derived classes for package: https.www_supernotariado_gov_co.schemas.bachue.ee.entregaproducto.obtenerturnosrefpago.v1
     * 
     */
    public ObtenerTurnosRefPagoObjectFactory() {
    	//Constructor vacio
    }

    /**
     * Create an instance of {@link TipoSalidaObtenerTurnosRefPago }
     * 
     */
    public TipoSalidaObtenerTurnosRefPago createTipoSalidaObtenerTurnosRefPago() {
        return new TipoSalidaObtenerTurnosRefPago();
    }

    /**
     * Create an instance of {@link TipoEntradaObtenerTurnosRefPago }
     * 
     */
    public TipoEntradaObtenerTurnosRefPago createTipoEntradaObtenerTurnosRefPago() {
        return new TipoEntradaObtenerTurnosRefPago();
    }

    /**
     * Create an instance of {@link Turno }
     * 
     */
    public Turno createTurno() {
        return new Turno();
    }

    /**
     * Create an instance of {@link TipoSalidaObtenerTurnosRefPago.Turnos }
     * 
     */
    public TipoSalidaObtenerTurnosRefPago.Turnos createTipoSalidaObtenerTurnosRefPagoTurnos() {
        return new TipoSalidaObtenerTurnosRefPago.Turnos();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoSalidaObtenerTurnosRefPago }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/entregaproducto/obtenerturnosrefpago/v1", name = "salidaObtenerTurnosRefPago")
    public JAXBElement<TipoSalidaObtenerTurnosRefPago> createSalidaObtenerTurnosRefPago(TipoSalidaObtenerTurnosRefPago value) {
        return new JAXBElement<>(CQN_SALIDA_OBTENER_TURNOS_REF_PAGO, TipoSalidaObtenerTurnosRefPago.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoEntradaObtenerTurnosRefPago }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/entregaproducto/obtenerturnosrefpago/v1", name = "entradaObtenerTurnosRefPago")
    public JAXBElement<TipoEntradaObtenerTurnosRefPago> createEntradaObtenerTurnosRefPago(TipoEntradaObtenerTurnosRefPago value) {
        return new JAXBElement<>(CQN_ENTRADA_OBTENER_TURNOS_REF_PAGO, TipoEntradaObtenerTurnosRefPago.class, null, value);
    }

}

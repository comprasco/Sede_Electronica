
package co.gov.supernotariado.bachue.clientebus.entregaproducto.types.obtenerrecibocaja;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the https.www_supernotariado_gov_co.schemas.bachue.ee.entregaproducto.obtenerrecibocaja.v1 package. 
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
public class ObtenerReciboCajaObjectFactory {

    private static final QName CQN_ENTRADA_OBTENER_RECIBO_CAJA = new QName("https://www.supernotariado.gov.co/schemas/bachue/ee/entregaproducto/obtenerrecibocaja/v1", "entradaObtenerReciboCaja");
    private static final QName CQN_SALIDA_OBTENER_RECIBO_CAJA = new QName("https://www.supernotariado.gov.co/schemas/bachue/ee/entregaproducto/obtenerrecibocaja/v1", "salidaObtenerReciboCaja");

    /**
     * Create a new ConsultaActosTurnoObjectFactory that can be used to create new instances of schema derived classes for package: https.www_supernotariado_gov_co.schemas.bachue.ee.entregaproducto.obtenerrecibocaja.v1
     * 
     */
    public ObtenerReciboCajaObjectFactory() {
    	//Constructor vacio
    }

    /**
     * Create an instance of {@link TipoSalidaObtenerReciboCaja }
     * 
     */
    public TipoSalidaObtenerReciboCaja createTipoSalidaObtenerReciboCaja() {
        return new TipoSalidaObtenerReciboCaja();
    }

    /**
     * Create an instance of {@link TipoEntradaObtenerReciboCaja }
     * 
     */
    public TipoEntradaObtenerReciboCaja createTipoEntradaObtenerReciboCaja() {
        return new TipoEntradaObtenerReciboCaja();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoEntradaObtenerReciboCaja }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/entregaproducto/obtenerrecibocaja/v1", name = "entradaObtenerReciboCaja")
    public JAXBElement<TipoEntradaObtenerReciboCaja> createEntradaObtenerReciboCaja(TipoEntradaObtenerReciboCaja value) {
        return new JAXBElement<>(CQN_ENTRADA_OBTENER_RECIBO_CAJA, TipoEntradaObtenerReciboCaja.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoSalidaObtenerReciboCaja }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/entregaproducto/obtenerrecibocaja/v1", name = "salidaObtenerReciboCaja")
    public JAXBElement<TipoSalidaObtenerReciboCaja> createSalidaObtenerReciboCaja(TipoSalidaObtenerReciboCaja value) {
        return new JAXBElement<>(CQN_SALIDA_OBTENER_RECIBO_CAJA, TipoSalidaObtenerReciboCaja.class, null, value);
    }

}

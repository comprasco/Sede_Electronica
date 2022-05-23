
package co.gov.supernotariado.bachue.clientebus.entregaproducto.types.obtenerproducto;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the https.www_supernotariado_gov_co.schemas.bachue.ee.entregaproducto.obtenerproducto.v1 package. 
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
public class ObtenerProductoObjectFactory {

    private static final QName CQN_SALIDA_OBTENER_PRODUCTO = new QName("https://www.supernotariado.gov.co/schemas/bachue/ee/entregaproducto/obtenerproducto/v1", "salidaObtenerProducto");
    private static final QName CQN_ENTRADA_OBTENER_PRODUCTO = new QName("https://www.supernotariado.gov.co/schemas/bachue/ee/entregaproducto/obtenerproducto/v1", "entradaObtenerProducto");

    /**
     * Create a new ConsultaActosTurnoObjectFactory that can be used to create new instances of schema derived classes for package: https.www_supernotariado_gov_co.schemas.bachue.ee.entregaproducto.obtenerproducto.v1
     * 
     */
    public ObtenerProductoObjectFactory() {
    	//Constructor vacio
    }

    /**
     * Create an instance of {@link TipoSalidaObtenerProducto }
     * 
     */
    public TipoSalidaObtenerProducto createTipoSalidaObtenerProducto() {
        return new TipoSalidaObtenerProducto();
    }

    /**
     * Create an instance of {@link TipoEntradaObtenerProducto }
     * 
     */
    public TipoEntradaObtenerProducto createTipoEntradaObtenerProducto() {
        return new TipoEntradaObtenerProducto();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoSalidaObtenerProducto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/entregaproducto/obtenerproducto/v1", name = "salidaObtenerProducto")
    public JAXBElement<TipoSalidaObtenerProducto> createSalidaObtenerProducto(TipoSalidaObtenerProducto value) {
        return new JAXBElement<>(CQN_SALIDA_OBTENER_PRODUCTO, TipoSalidaObtenerProducto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoEntradaObtenerProducto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/entregaproducto/obtenerproducto/v1", name = "entradaObtenerProducto")
    public JAXBElement<TipoEntradaObtenerProducto> createEntradaObtenerProducto(TipoEntradaObtenerProducto value) {
        return new JAXBElement<>(CQN_ENTRADA_OBTENER_PRODUCTO, TipoEntradaObtenerProducto.class, null, value);
    }

}

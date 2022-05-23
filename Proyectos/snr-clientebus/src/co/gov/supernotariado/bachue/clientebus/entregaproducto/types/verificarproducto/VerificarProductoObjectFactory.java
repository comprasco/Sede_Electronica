
package co.gov.supernotariado.bachue.clientebus.entregaproducto.types.verificarproducto;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the https.www_supernotariado_gov_co.schemas.bachue.ee.entregaproducto.verificarproducto.v1 package. 
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
public class VerificarProductoObjectFactory {

    private static final QName CQN_SALIDA_VERIFICAR_PRODUCTO = new QName("https://www.supernotariado.gov.co/schemas/bachue/ee/entregaproducto/verificarproducto/v1", "salidaVerificarProducto");
    private static final QName CQN_ENTRADA_VERIFICAR_PRODUCTO = new QName("https://www.supernotariado.gov.co/schemas/bachue/ee/entregaproducto/verificarproducto/v1", "entradaVerificarProducto");

    /**
     * Create a new ConsultaActosTurnoObjectFactory that can be used to create new instances of schema derived classes for package: https.www_supernotariado_gov_co.schemas.bachue.ee.entregaproducto.verificarproducto.v1
     * 
     */
    public VerificarProductoObjectFactory() {
    	//Constructor vacio
    }

    /**
     * Create an instance of {@link TipoSalidaVerificarProducto }
     * 
     */
    public TipoSalidaVerificarProducto createTipoSalidaVerificarProducto() {
        return new TipoSalidaVerificarProducto();
    }

    /**
     * Create an instance of {@link TipoEntradaVerificarProducto }
     * 
     */
    public TipoEntradaVerificarProducto createTipoEntradaVerificarProducto() {
        return new TipoEntradaVerificarProducto();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoSalidaVerificarProducto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/entregaproducto/verificarproducto/v1", name = "salidaVerificarProducto")
    public JAXBElement<TipoSalidaVerificarProducto> createSalidaVerificarProducto(TipoSalidaVerificarProducto value) {
        return new JAXBElement<>(CQN_SALIDA_VERIFICAR_PRODUCTO, TipoSalidaVerificarProducto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoEntradaVerificarProducto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/entregaproducto/verificarproducto/v1", name = "entradaVerificarProducto")
    public JAXBElement<TipoEntradaVerificarProducto> createEntradaVerificarProducto(TipoEntradaVerificarProducto value) {
        return new JAXBElement<>(CQN_ENTRADA_VERIFICAR_PRODUCTO, TipoEntradaVerificarProducto.class, null, value);
    }

}

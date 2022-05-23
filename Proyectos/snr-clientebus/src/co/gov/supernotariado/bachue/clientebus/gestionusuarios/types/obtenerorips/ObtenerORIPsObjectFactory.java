
package co.gov.supernotariado.bachue.clientebus.gestionusuarios.types.obtenerorips;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the https.www_supernotariado_gov_co.schemas.bachue.cb.gestionusuarios.obtenerorips.v1 package. 
 * <p>An ObjectFactory allows you to programatically 
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
public class ObtenerORIPsObjectFactory {

    private final static QName _SalidaObtenerORIPs_QNAME = new QName("https://www.supernotariado.gov.co/schemas/bachue/cb/gestionusuarios/obtenerorips/v1", "salidaObtenerORIPs");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: https.www_supernotariado_gov_co.schemas.bachue.cb.gestionusuarios.obtenerorips.v1
     * 
     */
    public ObtenerORIPsObjectFactory() {
    }

    /**
     * Create an instance of {@link TipoSalidaObtenerORIPs }
     * 
     */
    public TipoSalidaObtenerORIPs createTipoSalidaObtenerORIPs() {
        return new TipoSalidaObtenerORIPs();
    }

    /**
     * Create an instance of {@link EntradaObtenerORIPs }
     * 
     */
    public EntradaObtenerORIPs createEntradaObtenerORIPs() {
        return new EntradaObtenerORIPs();
    }

    /**
     * Create an instance of {@link TipoOrip }
     * 
     */
    public TipoOrip createTipoOrip() {
        return new TipoOrip();
    }

    /**
     * Create an instance of {@link TipoSalidaObtenerORIPs.Orips }
     * 
     */
    public TipoSalidaObtenerORIPs.Orips createTipoSalidaObtenerORIPsOrips() {
        return new TipoSalidaObtenerORIPs.Orips();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoSalidaObtenerORIPs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/cb/gestionusuarios/obtenerorips/v1", name = "salidaObtenerORIPs")
    public JAXBElement<TipoSalidaObtenerORIPs> createSalidaObtenerORIPs(TipoSalidaObtenerORIPs value) {
        return new JAXBElement<TipoSalidaObtenerORIPs>(_SalidaObtenerORIPs_QNAME, TipoSalidaObtenerORIPs.class, null, value);
    }

}


package co.gov.supernotariado.bachue.clientebus.gestionusuarios.types.obtenerroles;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the https.www_supernotariado_gov_co.schemas.bachue.cb.gestionusuarios.obtenerroles.v1 package. 
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
public class ObtenerRolesObjectFactory {

    private final static QName _SalidaObtenerRoles_QNAME = new QName("https://www.supernotariado.gov.co/schemas/bachue/cb/gestionusuarios/obtenerroles/v1", "salidaObtenerRoles");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: https.www_supernotariado_gov_co.schemas.bachue.cb.gestionusuarios.obtenerroles.v1
     * 
     */
    public ObtenerRolesObjectFactory() {
    }

    /**
     * Create an instance of {@link TipoSalidaObtenerRoles }
     * 
     */
    public TipoSalidaObtenerRoles createTipoSalidaObtenerRoles() {
        return new TipoSalidaObtenerRoles();
    }

    /**
     * Create an instance of {@link EntradaObtenerRoles }
     * 
     */
    public EntradaObtenerRoles createEntradaObtenerRoles() {
        return new EntradaObtenerRoles();
    }

    /**
     * Create an instance of {@link RolTypeOR }
     * 
     */
    public RolTypeOR createRolTypeOR() {
        return new RolTypeOR();
    }

    /**
     * Create an instance of {@link TipoSalidaObtenerRoles.Roles }
     * 
     */
    public TipoSalidaObtenerRoles.Roles createTipoSalidaObtenerRolesRoles() {
        return new TipoSalidaObtenerRoles.Roles();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoSalidaObtenerRoles }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/cb/gestionusuarios/obtenerroles/v1", name = "salidaObtenerRoles")
    public JAXBElement<TipoSalidaObtenerRoles> createSalidaObtenerRoles(TipoSalidaObtenerRoles value) {
        return new JAXBElement<TipoSalidaObtenerRoles>(_SalidaObtenerRoles_QNAME, TipoSalidaObtenerRoles.class, null, value);
    }

}

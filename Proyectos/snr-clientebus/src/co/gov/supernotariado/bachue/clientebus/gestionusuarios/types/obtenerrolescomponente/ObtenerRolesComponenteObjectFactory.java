
package co.gov.supernotariado.bachue.clientebus.gestionusuarios.types.obtenerrolescomponente;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the https.www_supernotariado_gov_co.schemas.bachue.cb.gestionusuarios.obtenerrolescomponente.v1 package. 
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
public class ObtenerRolesComponenteObjectFactory {

    private final static QName _EntradaObtenerRolesComponente_QNAME = new QName("https://www.supernotariado.gov.co/schemas/bachue/cb/gestionusuarios/obtenerrolescomponente/v1", "entradaObtenerRolesComponente");
    private final static QName _SalidaObtenerRolesComponente_QNAME = new QName("https://www.supernotariado.gov.co/schemas/bachue/cb/gestionusuarios/obtenerrolescomponente/v1", "salidaObtenerRolesComponente");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: https.www_supernotariado_gov_co.schemas.bachue.cb.gestionusuarios.obtenerrolescomponente.v1
     * 
     */
    public ObtenerRolesComponenteObjectFactory() {
    }

    /**
     * Create an instance of {@link TipoSalidaObtenerRolesComponente }
     * 
     */
    public TipoSalidaObtenerRolesComponente createTipoSalidaObtenerRolesComponente() {
        return new TipoSalidaObtenerRolesComponente();
    }

    /**
     * Create an instance of {@link TipoEntradaObtenerRolesComponente }
     * 
     */
    public TipoEntradaObtenerRolesComponente createTipoEntradaObtenerRolesComponente() {
        return new TipoEntradaObtenerRolesComponente();
    }

    /**
     * Create an instance of {@link RolTypeORC }
     * 
     */
    public RolTypeORC createRolTypeORC() {
        return new RolTypeORC();
    }

    /**
     * Create an instance of {@link TipoSalidaObtenerRolesComponente.Roles }
     * 
     */
    public TipoSalidaObtenerRolesComponente.Roles createTipoSalidaObtenerRolesComponenteRoles() {
        return new TipoSalidaObtenerRolesComponente.Roles();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoEntradaObtenerRolesComponente }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/cb/gestionusuarios/obtenerrolescomponente/v1", name = "entradaObtenerRolesComponente")
    public JAXBElement<TipoEntradaObtenerRolesComponente> createEntradaObtenerRolesComponente(TipoEntradaObtenerRolesComponente value) {
        return new JAXBElement<TipoEntradaObtenerRolesComponente>(_EntradaObtenerRolesComponente_QNAME, TipoEntradaObtenerRolesComponente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoSalidaObtenerRolesComponente }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/cb/gestionusuarios/obtenerrolescomponente/v1", name = "salidaObtenerRolesComponente")
    public JAXBElement<TipoSalidaObtenerRolesComponente> createSalidaObtenerRolesComponente(TipoSalidaObtenerRolesComponente value) {
        return new JAXBElement<TipoSalidaObtenerRolesComponente>(_SalidaObtenerRolesComponente_QNAME, TipoSalidaObtenerRolesComponente.class, null, value);
    }

}

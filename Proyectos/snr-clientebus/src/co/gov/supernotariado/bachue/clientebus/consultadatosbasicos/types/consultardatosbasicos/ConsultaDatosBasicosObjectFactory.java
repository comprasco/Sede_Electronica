package co.gov.supernotariado.bachue.clientebus.consultadatosbasicos.types.consultardatosbasicos;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the co.gov.gobiernoenlinea.gel_xml._1_0.schemas.integracion.supernotariado.bachue package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation
 * for XML content. The Java representation of XML
 * content can consist of schema derived interfaces
 * and classes representing the binding of schema
 * type definitions, element declarations and model
 * groups.  Factory methods for each of these are
>>>>>>> 4510ebf74d131c017b4f6235420582338e9bf209
 * provided in this class.
 *
 */
@XmlRegistry
public class ConsultaDatosBasicosObjectFactory {
    private final static QName _EntradaDatosBasicos_QNAME = new QName("http://www.gobiernoenlinea.gov.co/GEL-XML/1.0/schemas/integracion/supernotariado/bachue", "entradaDatosBasicos");
    private final static QName _SalidaDatosBasicos_QNAME = new QName("http://www.gobiernoenlinea.gov.co/GEL-XML/1.0/schemas/integracion/supernotariado/bachue", "salidaDatosBasicos");
    private final static QName _TipoEntradaDatosBasicosMatriculaCriterioBusqueda_QNAME = new QName("http://www.gobiernoenlinea.gov.co/GEL-XML/1.0/schemas/integracion/supernotariado/bachue", "criterioBusqueda");
    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: co.gov.gobiernoenlinea.gel_xml._1_0.schemas.integracion.supernotariado.bachue
     *
     */
    public ConsultaDatosBasicosObjectFactory() {
    }
    /**
     * Create an instance of {@link TipoSalidaDatosBasicosMatricula }
     *
     */
    public TipoSalidaDatosBasicosMatricula createTipoSalidaDatosBasicosMatricula() {
        return new TipoSalidaDatosBasicosMatricula();
    }
    /**
     * Create an instance of {@link TipoEntradaDatosBasicosMatricula }
     *
     */
    public TipoEntradaDatosBasicosMatricula createTipoEntradaDatosBasicosMatricula() {
        return new TipoEntradaDatosBasicosMatricula();
    }
    /**
     * Create an instance of {@link TipoMatricula }
     *
     */
    public TipoMatricula createTipoMatricula() {
        return new TipoMatricula();
    }
    /**
     * Create an instance of {@link TipoPropietario }
     *
     */
    public TipoPropietario createTipoPropietario() {
        return new TipoPropietario();
    }
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoEntradaDatosBasicosMatricula }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.gobiernoenlinea.gov.co/GEL-XML/1.0/schemas/integracion/supernotariado/bachue", name = "entradaDatosBasicos")
    public JAXBElement<TipoEntradaDatosBasicosMatricula> createEntradaDatosBasicos(TipoEntradaDatosBasicosMatricula value) {
        return new JAXBElement<TipoEntradaDatosBasicosMatricula>(_EntradaDatosBasicos_QNAME, TipoEntradaDatosBasicosMatricula.class, null, value);
    }
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoSalidaDatosBasicosMatricula }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.gobiernoenlinea.gov.co/GEL-XML/1.0/schemas/integracion/supernotariado/bachue", name = "salidaDatosBasicos")
    public JAXBElement<TipoSalidaDatosBasicosMatricula> createSalidaDatosBasicos(TipoSalidaDatosBasicosMatricula value) {
        return new JAXBElement<TipoSalidaDatosBasicosMatricula>(_SalidaDatosBasicos_QNAME, TipoSalidaDatosBasicosMatricula.class, null, value);
    }
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.gobiernoenlinea.gov.co/GEL-XML/1.0/schemas/integracion/supernotariado/bachue", name = "criterioBusqueda", scope = TipoEntradaDatosBasicosMatricula.class)
    public JAXBElement<String> createTipoEntradaDatosBasicosMatriculaCriterioBusqueda(String value) {
        return new JAXBElement<String>(_TipoEntradaDatosBasicosMatriculaCriterioBusqueda_QNAME, String.class, TipoEntradaDatosBasicosMatricula.class, value);
    }
}
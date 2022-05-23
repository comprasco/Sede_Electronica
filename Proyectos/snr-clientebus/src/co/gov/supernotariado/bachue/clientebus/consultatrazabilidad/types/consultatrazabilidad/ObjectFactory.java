
package co.gov.supernotariado.bachue.clientebus.consultatrazabilidad.types.consultatrazabilidad;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the https.www_supernotariado_gov_co.schemas.bachue.ee.consultatrazabilidad.consultartrazabilidad.v1 package. 
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
public class ObjectFactory {

    private final static QName _SalidaConsultarTrazabilidad_QNAME = new QName("https://www.supernotariado.gov.co/schemas/bachue/ee/consultatrazabilidad/consultartrazabilidad/v1", "salidaConsultarTrazabilidad");
    private final static QName _EntradaConsultarTrazabilidad_QNAME = new QName("https://www.supernotariado.gov.co/schemas/bachue/ee/consultatrazabilidad/consultartrazabilidad/v1", "entradaConsultarTrazabilidad");

    /**
     * Create a new ConsultaActosTurnoObjectFactory that can be used to create new instances of schema derived classes for package: https.www_supernotariado_gov_co.schemas.bachue.ee.consultatrazabilidad.consultartrazabilidad.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TipoSalidaConsultarTrazabilidad }
     * 
     */
    public TipoSalidaConsultarTrazabilidad createTipoSalidaConsultarTrazabilidad() {
        return new TipoSalidaConsultarTrazabilidad();
    }

    /**
     * Create an instance of {@link TipoEntradaConsultarTrazabilidad }
     * 
     */
    public TipoEntradaConsultarTrazabilidad createTipoEntradaConsultarTrazabilidad() {
        return new TipoEntradaConsultarTrazabilidad();
    }

    /**
     * Create an instance of {@link Documentos }
     * 
     */
    public Documentos createDocumentos() {
        return new Documentos();
    }

    /**
     * Create an instance of {@link Trazabilidad }
     * 
     */
    public Trazabilidad createTrazabilidad() {
        return new Trazabilidad();
    }

    /**
     * Create an instance of {@link DocumentosType }
     * 
     */
    public DocumentosType createDocumentosType() {
        return new DocumentosType();
    }

    /**
     * Create an instance of {@link Elementonir }
     * 
     */
    public Elementonir createElementonir() {
        return new Elementonir();
    }

    /**
     * Create an instance of {@link ElementonirType }
     * 
     */
    public ElementonirType createElementonirType() {
        return new ElementonirType();
    }

    /**
     * Create an instance of {@link Matricula }
     * 
     */
    public Matricula createMatricula() {
        return new Matricula();
    }

    /**
     * Create an instance of {@link MatriculaTpe }
     * 
     */
    public MatriculaTpe createMatriculaTpe() {
        return new MatriculaTpe();
    }

    /**
     * Create an instance of {@link TrazabilidadType }
     * 
     */
    public TrazabilidadType createTrazabilidadType() {
        return new TrazabilidadType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoSalidaConsultarTrazabilidad }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/consultatrazabilidad/consultartrazabilidad/v1", name = "salidaConsultarTrazabilidad")
    public JAXBElement<TipoSalidaConsultarTrazabilidad> createSalidaConsultarTrazabilidad(TipoSalidaConsultarTrazabilidad value) {
        return new JAXBElement<TipoSalidaConsultarTrazabilidad>(_SalidaConsultarTrazabilidad_QNAME, TipoSalidaConsultarTrazabilidad.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoEntradaConsultarTrazabilidad }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/consultatrazabilidad/consultartrazabilidad/v1", name = "entradaConsultarTrazabilidad")
    public JAXBElement<TipoEntradaConsultarTrazabilidad> createEntradaConsultarTrazabilidad(TipoEntradaConsultarTrazabilidad value) {
        return new JAXBElement<TipoEntradaConsultarTrazabilidad>(_EntradaConsultarTrazabilidad_QNAME, TipoEntradaConsultarTrazabilidad.class, null, value);
    }

}

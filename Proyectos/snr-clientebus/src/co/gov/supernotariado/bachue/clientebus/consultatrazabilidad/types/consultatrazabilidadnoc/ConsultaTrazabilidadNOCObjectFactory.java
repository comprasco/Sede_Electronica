
package co.gov.supernotariado.bachue.clientebus.consultatrazabilidad.types.consultatrazabilidadnoc;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the co.gov.gobiernoenlinea.gel_xml._1_0.schemas.integracion.supernotariado.bachue package. 
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
public class ConsultaTrazabilidadNOCObjectFactory {

    private static final QName CQN_SALIDA_TRAZABILIDAD_TRAMITE_REGISTRO_NODO_CENTRAL = new QName("http://www.gobiernoenlinea.gov.co/GEL-XML/1.0/schemas/integracion/supernotariado/bachue", "salidaTrazabilidadTramiteRegistroNodoCentral");
    private static final QName CQN_ENTRADA_TRAZABILIDAD_TRAMITE_REGISTRO_NODO_CENTRAL = new QName("http://www.gobiernoenlinea.gov.co/GEL-XML/1.0/schemas/integracion/supernotariado/bachue", "entradaTrazabilidadTramiteRegistroNodoCentral");

    /**
     * Create a new ConsultaActosTurnoObjectFactory that can be used to create new instances of schema derived classes for package: co.gov.gobiernoenlinea.gel_xml._1_0.schemas.integracion.supernotariado.bachue
     * 
     */
    public ConsultaTrazabilidadNOCObjectFactory() {
    	//Constructor vacio
    }

    /**
     * Create an instance of {@link TipoEntradaTrazabilidadTramiteRegistroNodoCentral }
     * 
     */
    public TipoEntradaTrazabilidadTramiteRegistroNodoCentral createTipoEntradaTrazabilidadTramiteRegistroNodoCentral() {
        return new TipoEntradaTrazabilidadTramiteRegistroNodoCentral();
    }

    /**
     * Create an instance of {@link TipoSalidaTrazabilidadTramiteRegistroNodoCentral }
     * 
     */
    public TipoSalidaTrazabilidadTramiteRegistroNodoCentral createTipoSalidaTrazabilidadTramiteRegistroNodoCentral() {
        return new TipoSalidaTrazabilidadTramiteRegistroNodoCentral();
    }

    /**
     * Create an instance of {@link TipoEstadoTramite }
     * 
     */
    public TipoEstadoTramite createTipoEstadoTramite() {
        return new TipoEstadoTramite();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoSalidaTrazabilidadTramiteRegistroNodoCentral }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gobiernoenlinea.gov.co/GEL-XML/1.0/schemas/integracion/supernotariado/bachue", name = "salidaTrazabilidadTramiteRegistroNodoCentral")
    public JAXBElement<TipoSalidaTrazabilidadTramiteRegistroNodoCentral> createSalidaTrazabilidadTramiteRegistroNodoCentral(TipoSalidaTrazabilidadTramiteRegistroNodoCentral value) {
        return new JAXBElement<>(CQN_SALIDA_TRAZABILIDAD_TRAMITE_REGISTRO_NODO_CENTRAL, TipoSalidaTrazabilidadTramiteRegistroNodoCentral.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoEntradaTrazabilidadTramiteRegistroNodoCentral }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gobiernoenlinea.gov.co/GEL-XML/1.0/schemas/integracion/supernotariado/bachue", name = "entradaTrazabilidadTramiteRegistroNodoCentral")
    public JAXBElement<TipoEntradaTrazabilidadTramiteRegistroNodoCentral> createEntradaTrazabilidadTramiteRegistroNodoCentral(TipoEntradaTrazabilidadTramiteRegistroNodoCentral value) {
        return new JAXBElement<>(CQN_ENTRADA_TRAZABILIDAD_TRAMITE_REGISTRO_NODO_CENTRAL, TipoEntradaTrazabilidadTramiteRegistroNodoCentral.class, null, value);
    }

}


package co.gov.supernotariado.bachue.clientebus.consultatrazabilidad.types.consultaactosturno;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the https.www_supernotariado_gov_co.schemas.bachue.ee.consultatrazabilidad.consultaactosturno.v1 package. 
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
public class ConsultaActosTurnoObjectFactory {

    private final static QName _EntradaConsultaActosTurno_QNAME = new QName("https://www.supernotariado.gov.co/schemas/bachue/ee/consultatrazabilidad/consultaActosTurno/v1", "entradaConsultaActosTurno");
    private final static QName _SalidaConsultaActosTurno_QNAME = new QName("https://www.supernotariado.gov.co/schemas/bachue/ee/consultatrazabilidad/consultaActosTurno/v1", "salidaConsultaActosTurno");

    /**
     * Create a new ConsultaActosTurnoObjectFactory that can be used to create new instances of schema derived classes for package: https.www_supernotariado_gov_co.schemas.bachue.ee.consultatrazabilidad.consultaactosturno.v1
     * 
     */
    public ConsultaActosTurnoObjectFactory() {
    }

    /**
     * Create an instance of {@link TipoSalidaConsultaActosTurno }
     * 
     */
    public TipoSalidaConsultaActosTurno createTipoSalidaConsultaActosTurno() {
        return new TipoSalidaConsultaActosTurno();
    }

    /**
     * Create an instance of {@link TipoSalidaConsultaActosTurno.Actos }
     * 
     */
    public TipoSalidaConsultaActosTurno.Actos createTipoSalidaConsultaActosTurnoActos() {
        return new TipoSalidaConsultaActosTurno.Actos();
    }

    /**
     * Create an instance of {@link TipoEntradaConsultaActosTurno }
     * 
     */
    public TipoEntradaConsultaActosTurno createTipoEntradaConsultaActosTurno() {
        return new TipoEntradaConsultaActosTurno();
    }

    /**
     * Create an instance of {@link TipoSalidaConsultaActosTurno.Actos.Acto }
     * 
     */
    public TipoSalidaConsultaActosTurno.Actos.Acto createTipoSalidaConsultaActosTurnoActosActo() {
        return new TipoSalidaConsultaActosTurno.Actos.Acto();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoEntradaConsultaActosTurno }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/consultatrazabilidad/consultaActosTurno/v1", name = "entradaConsultaActosTurno")
    public JAXBElement<TipoEntradaConsultaActosTurno> createEntradaConsultaActosTurno(TipoEntradaConsultaActosTurno value) {
        return new JAXBElement<TipoEntradaConsultaActosTurno>(_EntradaConsultaActosTurno_QNAME, TipoEntradaConsultaActosTurno.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoSalidaConsultaActosTurno }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/consultatrazabilidad/consultaActosTurno/v1", name = "salidaConsultaActosTurno")
    public JAXBElement<TipoSalidaConsultaActosTurno> createSalidaConsultaActosTurno(TipoSalidaConsultaActosTurno value) {
        return new JAXBElement<TipoSalidaConsultaActosTurno>(_SalidaConsultaActosTurno_QNAME, TipoSalidaConsultaActosTurno.class, null, value);
    }

}

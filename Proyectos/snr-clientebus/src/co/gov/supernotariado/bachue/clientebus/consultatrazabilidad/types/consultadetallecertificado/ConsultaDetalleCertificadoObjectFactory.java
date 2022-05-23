
package co.gov.supernotariado.bachue.clientebus.consultatrazabilidad.types.consultadetallecertificado;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the https.www_supernotariado_gov_co.schemas.bachue.ee.consultatrazabilidad.consultadetallecertificado.v1 package. 
 * <p>An ConsultaDetalleCertificadoObjectFactory allows you to programatically 
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
public class ConsultaDetalleCertificadoObjectFactory {

    private final static QName _SalidaConsultaDetalleCertificado_QNAME = new QName("https://www.supernotariado.gov.co/schemas/bachue/ee/consultatrazabilidad/consultaDetalleCertificado/v1", "salidaConsultaDetalleCertificado");
    private final static QName _EntradaConsultaDetalleCertificado_QNAME = new QName("https://www.supernotariado.gov.co/schemas/bachue/ee/consultatrazabilidad/consultaDetalleCertificado/v1", "entradaConsultaDetalleCertificado");

    /**
     * Create a new ConsultaDetalleCertificadoObjectFactory that can be used to create new instances of schema derived classes for package: https.www_supernotariado_gov_co.schemas.bachue.ee.consultatrazabilidad.consultadetallecertificado.v1
     * 
     */
    public ConsultaDetalleCertificadoObjectFactory() {
    }

    /**
     * Create an instance of {@link TipoSalidaConsultaDetalleCertificado }
     * 
     */
    public TipoSalidaConsultaDetalleCertificado createTipoSalidaConsultaDetalleCertificado() {
        return new TipoSalidaConsultaDetalleCertificado();
    }

    /**
     * Create an instance of {@link TipoSalidaConsultaDetalleCertificado.Certificados }
     * 
     */
    public TipoSalidaConsultaDetalleCertificado.Certificados createTipoSalidaConsultaDetalleCertificadoCertificados() {
        return new TipoSalidaConsultaDetalleCertificado.Certificados();
    }

    /**
     * Create an instance of {@link TipoEntradaConsultaDetalleCertificado }
     * 
     */
    public TipoEntradaConsultaDetalleCertificado createTipoEntradaConsultaDetalleCertificado() {
        return new TipoEntradaConsultaDetalleCertificado();
    }

    /**
     * Create an instance of {@link TipoSalidaConsultaDetalleCertificado.Certificados.Certificado }
     * 
     */
    public TipoSalidaConsultaDetalleCertificado.Certificados.Certificado createTipoSalidaConsultaDetalleCertificadoCertificadosCertificado() {
        return new TipoSalidaConsultaDetalleCertificado.Certificados.Certificado();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoSalidaConsultaDetalleCertificado }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/consultatrazabilidad/consultaDetalleCertificado/v1", name = "salidaConsultaDetalleCertificado")
    public JAXBElement<TipoSalidaConsultaDetalleCertificado> createSalidaConsultaDetalleCertificado(TipoSalidaConsultaDetalleCertificado value) {
        return new JAXBElement<TipoSalidaConsultaDetalleCertificado>(_SalidaConsultaDetalleCertificado_QNAME, TipoSalidaConsultaDetalleCertificado.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoEntradaConsultaDetalleCertificado }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/consultatrazabilidad/consultaDetalleCertificado/v1", name = "entradaConsultaDetalleCertificado")
    public JAXBElement<TipoEntradaConsultaDetalleCertificado> createEntradaConsultaDetalleCertificado(TipoEntradaConsultaDetalleCertificado value) {
        return new JAXBElement<TipoEntradaConsultaDetalleCertificado>(_EntradaConsultaDetalleCertificado_QNAME, TipoEntradaConsultaDetalleCertificado.class, null, value);
    }

}

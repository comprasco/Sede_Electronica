
package co.gov.supernotariado.bachue.clientebus.historialnotificaciones.type.consultarhistorial;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the https.www_supernotariado_gov_co.schemas.bachue.ee.historialnotificaciones.consultarhistorial.v1 package. 
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
public class ConsultarHistorialObjectFactory {

    private final static QName _EntradaConsultarHistorial_QNAME = new QName("https://www.supernotariado.gov.co/schemas/bachue/ee/historialNotificaciones/consultarHistorial/v1", "entradaConsultarHistorial");
    private final static QName _SalidaConsultarHistorial_QNAME = new QName("https://www.supernotariado.gov.co/schemas/bachue/ee/historialNotificaciones/consultarHistorial/v1", "salidaConsultarHistorial");
    private final static QName _TipoEntradaConsultarHistorialPagina_QNAME = new QName("https://www.supernotariado.gov.co/schemas/bachue/ee/historialNotificaciones/consultarHistorial/v1", "pagina");
    private final static QName _TipoEntradaConsultarHistorialTipoID_QNAME = new QName("https://www.supernotariado.gov.co/schemas/bachue/ee/historialNotificaciones/consultarHistorial/v1", "tipoID");
    private final static QName _TipoEntradaConsultarHistorialFechaFinal_QNAME = new QName("https://www.supernotariado.gov.co/schemas/bachue/ee/historialNotificaciones/consultarHistorial/v1", "fechaFinal");
    private final static QName _TipoEntradaConsultarHistorialNumeroTelefonoDestinatario_QNAME = new QName("https://www.supernotariado.gov.co/schemas/bachue/ee/historialNotificaciones/consultarHistorial/v1", "numeroTelefonoDestinatario");
    private final static QName _TipoEntradaConsultarHistorialDireccionCorreoElectronicoDestinatario_QNAME = new QName("https://www.supernotariado.gov.co/schemas/bachue/ee/historialNotificaciones/consultarHistorial/v1", "direccionCorreoElectronicoDestinatario");
    private final static QName _TipoEntradaConsultarHistorialIdentificador_QNAME = new QName("https://www.supernotariado.gov.co/schemas/bachue/ee/historialNotificaciones/consultarHistorial/v1", "identificador");
    private final static QName _TipoSalidaConsultarHistorialListaMensajesMensajeIdentificadorEE_QNAME = new QName("https://www.supernotariado.gov.co/schemas/bachue/ee/historialNotificaciones/consultarHistorial/v1", "identificadorEE");
    private final static QName _TipoSalidaConsultarHistorialListaMensajesMensajeTurno_QNAME = new QName("https://www.supernotariado.gov.co/schemas/bachue/ee/historialNotificaciones/consultarHistorial/v1", "turno");
    private final static QName _TipoSalidaConsultarHistorialListaMensajesMensajeOrip_QNAME = new QName("https://www.supernotariado.gov.co/schemas/bachue/ee/historialNotificaciones/consultarHistorial/v1", "orip");

    /**
     * Create a new ConsultaActosTurnoObjectFactory that can be used to create new instances of schema derived classes for package: https.www_supernotariado_gov_co.schemas.bachue.ee.historialnotificaciones.consultarhistorial.v1
     * 
     */
    public ConsultarHistorialObjectFactory() {
    }

    /**
     * Create an instance of {@link TipoSalidaConsultarHistorial }
     * 
     */
    public TipoSalidaConsultarHistorial createTipoSalidaConsultarHistorial() {
        return new TipoSalidaConsultarHistorial();
    }

    /**
     * Create an instance of {@link TipoSalidaConsultarHistorial.ListaMensajes }
     * 
     */
    public TipoSalidaConsultarHistorial.ListaMensajes createTipoSalidaConsultarHistorialListaMensajes() {
        return new TipoSalidaConsultarHistorial.ListaMensajes();
    }

    /**
     * Create an instance of {@link TipoSalidaConsultarHistorial.ListaMensajes.Mensaje }
     * 
     */
    public TipoSalidaConsultarHistorial.ListaMensajes.Mensaje createTipoSalidaConsultarHistorialListaMensajesMensaje() {
        return new TipoSalidaConsultarHistorial.ListaMensajes.Mensaje();
    }

    /**
     * Create an instance of {@link TipoEntradaConsultarHistorial }
     * 
     */
    public TipoEntradaConsultarHistorial createTipoEntradaConsultarHistorial() {
        return new TipoEntradaConsultarHistorial();
    }

    /**
     * Create an instance of {@link TipoSalidaConsultarHistorial.ListaMensajes.Mensaje.TipoDocumental }
     * 
     */
    public TipoSalidaConsultarHistorial.ListaMensajes.Mensaje.TipoDocumental createTipoSalidaConsultarHistorialListaMensajesMensajeTipoDocumental() {
        return new TipoSalidaConsultarHistorial.ListaMensajes.Mensaje.TipoDocumental();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoEntradaConsultarHistorial }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/historialNotificaciones/consultarHistorial/v1", name = "entradaConsultarHistorial")
    public JAXBElement<TipoEntradaConsultarHistorial> createEntradaConsultarHistorial(TipoEntradaConsultarHistorial value) {
        return new JAXBElement<TipoEntradaConsultarHistorial>(_EntradaConsultarHistorial_QNAME, TipoEntradaConsultarHistorial.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoSalidaConsultarHistorial }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/historialNotificaciones/consultarHistorial/v1", name = "salidaConsultarHistorial")
    public JAXBElement<TipoSalidaConsultarHistorial> createSalidaConsultarHistorial(TipoSalidaConsultarHistorial value) {
        return new JAXBElement<TipoSalidaConsultarHistorial>(_SalidaConsultarHistorial_QNAME, TipoSalidaConsultarHistorial.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/historialNotificaciones/consultarHistorial/v1", name = "pagina", scope = TipoEntradaConsultarHistorial.class)
    public JAXBElement<String> createTipoEntradaConsultarHistorialPagina(String value) {
        return new JAXBElement<String>(_TipoEntradaConsultarHistorialPagina_QNAME, String.class, TipoEntradaConsultarHistorial.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/historialNotificaciones/consultarHistorial/v1", name = "tipoID", scope = TipoEntradaConsultarHistorial.class)
    public JAXBElement<String> createTipoEntradaConsultarHistorialTipoID(String value) {
        return new JAXBElement<String>(_TipoEntradaConsultarHistorialTipoID_QNAME, String.class, TipoEntradaConsultarHistorial.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/historialNotificaciones/consultarHistorial/v1", name = "fechaFinal", scope = TipoEntradaConsultarHistorial.class)
    public JAXBElement<XMLGregorianCalendar> createTipoEntradaConsultarHistorialFechaFinal(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TipoEntradaConsultarHistorialFechaFinal_QNAME, XMLGregorianCalendar.class, TipoEntradaConsultarHistorial.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/historialNotificaciones/consultarHistorial/v1", name = "numeroTelefonoDestinatario", scope = TipoEntradaConsultarHistorial.class)
    public JAXBElement<BigInteger> createTipoEntradaConsultarHistorialNumeroTelefonoDestinatario(BigInteger value) {
        return new JAXBElement<BigInteger>(_TipoEntradaConsultarHistorialNumeroTelefonoDestinatario_QNAME, BigInteger.class, TipoEntradaConsultarHistorial.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/historialNotificaciones/consultarHistorial/v1", name = "direccionCorreoElectronicoDestinatario", scope = TipoEntradaConsultarHistorial.class)
    public JAXBElement<String> createTipoEntradaConsultarHistorialDireccionCorreoElectronicoDestinatario(String value) {
        return new JAXBElement<String>(_TipoEntradaConsultarHistorialDireccionCorreoElectronicoDestinatario_QNAME, String.class, TipoEntradaConsultarHistorial.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/historialNotificaciones/consultarHistorial/v1", name = "identificador", scope = TipoEntradaConsultarHistorial.class)
    public JAXBElement<String> createTipoEntradaConsultarHistorialIdentificador(String value) {
        return new JAXBElement<String>(_TipoEntradaConsultarHistorialIdentificador_QNAME, String.class, TipoEntradaConsultarHistorial.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/historialNotificaciones/consultarHistorial/v1", name = "identificadorEE", scope = TipoSalidaConsultarHistorial.ListaMensajes.Mensaje.class)
    public JAXBElement<String> createTipoSalidaConsultarHistorialListaMensajesMensajeIdentificadorEE(String value) {
        return new JAXBElement<String>(_TipoSalidaConsultarHistorialListaMensajesMensajeIdentificadorEE_QNAME, String.class, TipoSalidaConsultarHistorial.ListaMensajes.Mensaje.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/historialNotificaciones/consultarHistorial/v1", name = "turno", scope = TipoSalidaConsultarHistorial.ListaMensajes.Mensaje.class)
    public JAXBElement<String> createTipoSalidaConsultarHistorialListaMensajesMensajeTurno(String value) {
        return new JAXBElement<String>(_TipoSalidaConsultarHistorialListaMensajesMensajeTurno_QNAME, String.class, TipoSalidaConsultarHistorial.ListaMensajes.Mensaje.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/historialNotificaciones/consultarHistorial/v1", name = "orip", scope = TipoSalidaConsultarHistorial.ListaMensajes.Mensaje.class)
    public JAXBElement<String> createTipoSalidaConsultarHistorialListaMensajesMensajeOrip(String value) {
        return new JAXBElement<String>(_TipoSalidaConsultarHistorialListaMensajesMensajeOrip_QNAME, String.class, TipoSalidaConsultarHistorial.ListaMensajes.Mensaje.class, value);
    }

}

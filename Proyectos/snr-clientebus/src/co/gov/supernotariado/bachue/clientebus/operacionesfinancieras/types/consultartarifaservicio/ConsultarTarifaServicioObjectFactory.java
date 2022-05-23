package co.gov.supernotariado.bachue.clientebus.operacionesfinancieras.types.consultartarifaservicio;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the https.www_supernotariado_gov_co.schemas.bachue.ef.operacionesfinancieras.consultartarifaservicio.v2 package. 
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
public class ConsultarTarifaServicioObjectFactory {

	private static final String CS_NOMBREESPACIO = "https://www.supernotariado.gov.co/schemas/bachue/ef/operacionesfinancieras/consultartarifaservicio/v2";
    private static final QName CQN_SALIDA_CONSULTAR_TARIFA_SERVICIO = new QName(CS_NOMBREESPACIO, "salidaConsultarTarifaServicio");
    private static final QName CQN_ENTRADA_CONSULTAR_TARIFA_SERVICIO = new QName(CS_NOMBREESPACIO, "entradaConsultarTarifaServicio");
    private static final QName CQN_TIPO_SERVICIO_CTSO_DIRECCION_PREDIO = new QName(CS_NOMBREESPACIO, "direccionPredio");
    private static final QName CQN_TIPO_SERVICIO_CTSO_ESTADO_PREDIO = new QName(CS_NOMBREESPACIO, "estadoPredio");
    private static final QName CQN_TIPO_ENTRADA_CONSULTAR_TARIFA_SERVICIO_CODIGO_CONVENIO = new QName(CS_NOMBREESPACIO, "codigoConvenio");
    private static final QName CQN_TIPO_SALIDA_CONSULTAR_TARIFA_SERVICIO_DESCRIPCION_MENSAJE = new QName(CS_NOMBREESPACIO, "descripcionMensaje");

    /**
     * Create a new ConsultaActosTurnoObjectFactory that can be used to create new instances of schema derived classes for package: https.www_supernotariado_gov_co.schemas.bachue.ef.operacionesfinancieras.consultartarifaservicio.v2
     * 
     */
    public ConsultarTarifaServicioObjectFactory() {
    	//Constructor vacio
    }

    /**
     * Create an instance of {@link TipoServicioCTSI }
     * 
     */
    public TipoServicioCTSI createTipoServicioCTSI() {
        return new TipoServicioCTSI();
    }

    /**
     * Create an instance of {@link TipoEntradaConsultarTarifaServicio }
     * 
     */
    public TipoEntradaConsultarTarifaServicio createTipoEntradaConsultarTarifaServicio() {
        return new TipoEntradaConsultarTarifaServicio();
    }

    /**
     * Create an instance of {@link TipoSalidaConsultarTarifaServicio }
     * 
     */
    public TipoSalidaConsultarTarifaServicio createTipoSalidaConsultarTarifaServicio() {
        return new TipoSalidaConsultarTarifaServicio();
    }

    /**
     * Create an instance of {@link TipoCriterioCTSI }
     * 
     */
    public TipoCriterioCTSI createTipoCriterioCTSI() {
        return new TipoCriterioCTSI();
    }

    /**
     * Create an instance of {@link TipoServicioCTSO }
     * 
     */
    public TipoServicioCTSO createTipoServicioCTSO() {
        return new TipoServicioCTSO();
    }

    /**
     * Create an instance of {@link TipoServicioCTSI.Criterios }
     * 
     */
    public TipoServicioCTSI.Criterios createTipoServicioCTSICriterios() {
        return new TipoServicioCTSI.Criterios();
    }

    /**
     * Create an instance of {@link TipoEntradaConsultarTarifaServicio.Servicios }
     * 
     */
    public TipoEntradaConsultarTarifaServicio.Servicios createTipoEntradaConsultarTarifaServicioServicios() {
        return new TipoEntradaConsultarTarifaServicio.Servicios();
    }

    /**
     * Create an instance of {@link TipoSalidaConsultarTarifaServicio.ServiciosTarifados }
     * 
     */
    public TipoSalidaConsultarTarifaServicio.ServiciosTarifados createTipoSalidaConsultarTarifaServicioServiciosTarifados() {
        return new TipoSalidaConsultarTarifaServicio.ServiciosTarifados();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoSalidaConsultarTarifaServicio }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/ef/operacionesfinancieras/consultartarifaservicio/v2", name = "salidaConsultarTarifaServicio")
    public JAXBElement<TipoSalidaConsultarTarifaServicio> createSalidaConsultarTarifaServicio(TipoSalidaConsultarTarifaServicio value) {
        return new JAXBElement<>(CQN_SALIDA_CONSULTAR_TARIFA_SERVICIO, TipoSalidaConsultarTarifaServicio.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoEntradaConsultarTarifaServicio }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/ef/operacionesfinancieras/consultartarifaservicio/v2", name = "entradaConsultarTarifaServicio")
    public JAXBElement<TipoEntradaConsultarTarifaServicio> createEntradaConsultarTarifaServicio(TipoEntradaConsultarTarifaServicio value) {
        return new JAXBElement<>(CQN_ENTRADA_CONSULTAR_TARIFA_SERVICIO, TipoEntradaConsultarTarifaServicio.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/ef/operacionesfinancieras/consultartarifaservicio/v2", name = "direccionPredio", scope = TipoServicioCTSO.class)
    public JAXBElement<String> createTipoServicioCTSODireccionPredio(String value) {
        return new JAXBElement<>(CQN_TIPO_SERVICIO_CTSO_DIRECCION_PREDIO, String.class, TipoServicioCTSO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/ef/operacionesfinancieras/consultartarifaservicio/v2", name = "estadoPredio", scope = TipoServicioCTSO.class)
    public JAXBElement<String> createTipoServicioCTSOEstadoPredio(String value) {
        return new JAXBElement<>(CQN_TIPO_SERVICIO_CTSO_ESTADO_PREDIO, String.class, TipoServicioCTSO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/ef/operacionesfinancieras/consultartarifaservicio/v2", name = "codigoConvenio", scope = TipoEntradaConsultarTarifaServicio.class)
    public JAXBElement<String> createTipoEntradaConsultarTarifaServicioCodigoConvenio(String value) {
        return new JAXBElement<>(CQN_TIPO_ENTRADA_CONSULTAR_TARIFA_SERVICIO_CODIGO_CONVENIO, String.class, TipoEntradaConsultarTarifaServicio.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/ef/operacionesfinancieras/consultartarifaservicio/v2", name = "descripcionMensaje", scope = TipoSalidaConsultarTarifaServicio.class)
    public JAXBElement<String> createTipoSalidaConsultarTarifaServicioDescripcionMensaje(String value) {
        return new JAXBElement<>(CQN_TIPO_SALIDA_CONSULTAR_TARIFA_SERVICIO_DESCRIPCION_MENSAJE, String.class, TipoSalidaConsultarTarifaServicio.class, value);
    }

}

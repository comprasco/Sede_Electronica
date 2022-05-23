package co.gov.supernotariado.bachue.clientebus.operacionesfinancieras.types.consultarestadoliquidacion;


import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the https.www_supernotariado_gov_co.schemas.bachue.ef.operacionesfinancieras.consultarestadoliquidacion.v2 package. 
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
public class ConsultarEstadoLiquidacionObjectFactory {

	private static final String CS_NOMBREESPACIO ="https://www.supernotariado.gov.co/schemas/bachue/ef/operacionesfinancieras/consultarestadoliquidacion/v2";
    private static final QName CQN_SALIDA_CONSULTAR_ESTADO_LIQUIDACION = new QName(CS_NOMBREESPACIO, "salidaConsultarEstadoLiquidacion");
    private static final QName CQN_ENTRADA_CONSULTAR_ESTADO_LIQUIDACION = new QName(CS_NOMBREESPACIO, "entradaConsultarEstadoLiquidacion");
    private static final QName CQN_TIPO_SALIDA_CONSULTAR_ESTADO_LIQUIDACION_DESCRIPCION_MENSAJE = new QName(CS_NOMBREESPACIO, "descripcionMensaje");
    private static final QName CQN_TIPO_SALIDA_CONSULTAR_ESTADO_LIQUIDACION_CODIGO_TRANSACCION_RECAUDADOR = new QName(CS_NOMBREESPACIO, "codigoTransaccionRecaudador");

    /**
     * Create a new ConsultaActosTurnoObjectFactory that can be used to create new instances of schema derived classes for package: https.www_supernotariado_gov_co.schemas.bachue.ef.operacionesfinancieras.consultarestadoliquidacion.v2
     * 
     */
    public ConsultarEstadoLiquidacionObjectFactory() {
    	//Contructor vacio
    }

    /**
     * Create an instance of {@link TipoSalidaConsultarEstadoLiquidacion }
     * 
     */
    public TipoSalidaConsultarEstadoLiquidacion createTipoSalidaConsultarEstadoLiquidacion() {
        return new TipoSalidaConsultarEstadoLiquidacion();
    }

    /**
     * Create an instance of {@link TipoEntradaConsultarEstadoLiquidacion }
     * 
     */
    public TipoEntradaConsultarEstadoLiquidacion createTipoEntradaConsultarEstadoLiquidacion() {
        return new TipoEntradaConsultarEstadoLiquidacion();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoSalidaConsultarEstadoLiquidacion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/ef/operacionesfinancieras/consultarestadoliquidacion/v2", name = "salidaConsultarEstadoLiquidacion")
    public JAXBElement<TipoSalidaConsultarEstadoLiquidacion> createSalidaConsultarEstadoLiquidacion(TipoSalidaConsultarEstadoLiquidacion value) {
        return new JAXBElement<>(CQN_SALIDA_CONSULTAR_ESTADO_LIQUIDACION, TipoSalidaConsultarEstadoLiquidacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoEntradaConsultarEstadoLiquidacion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/ef/operacionesfinancieras/consultarestadoliquidacion/v2", name = "entradaConsultarEstadoLiquidacion")
    public JAXBElement<TipoEntradaConsultarEstadoLiquidacion> createEntradaConsultarEstadoLiquidacion(TipoEntradaConsultarEstadoLiquidacion value) {
        return new JAXBElement<>(CQN_ENTRADA_CONSULTAR_ESTADO_LIQUIDACION, TipoEntradaConsultarEstadoLiquidacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/ef/operacionesfinancieras/consultarestadoliquidacion/v2", name = "descripcionMensaje", scope = TipoSalidaConsultarEstadoLiquidacion.class)
    public JAXBElement<String> createTipoSalidaConsultarEstadoLiquidacionDescripcionMensaje(String value) {
        return new JAXBElement<>(CQN_TIPO_SALIDA_CONSULTAR_ESTADO_LIQUIDACION_DESCRIPCION_MENSAJE, String.class, TipoSalidaConsultarEstadoLiquidacion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/ef/operacionesfinancieras/consultarestadoliquidacion/v2", name = "codigoTransaccionRecaudador", scope = TipoSalidaConsultarEstadoLiquidacion.class)
    public JAXBElement<String> createTipoSalidaConsultarEstadoLiquidacionCodigoTransaccionRecaudador(String value) {
        return new JAXBElement<>(CQN_TIPO_SALIDA_CONSULTAR_ESTADO_LIQUIDACION_CODIGO_TRANSACCION_RECAUDADOR, String.class, TipoSalidaConsultarEstadoLiquidacion.class, value);
    }

}

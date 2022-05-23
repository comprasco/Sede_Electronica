
package co.gov.supernotariado.bachue.clientebus.operacionesfinancieras.types.obtenerpdfliquidacion;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the https.www_supernotariado_gov_co.schemas.bachue.ef.operacionesfinancieras.obtenerpdfliquidacion.v2 package. 
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
public class ObtenerPdfLiquidacionObjectFactory {

	private static final String CS_NOMBREPACIO = "https://www.supernotariado.gov.co/schemas/bachue/ef/operacionesfinancieras/obtenerpdfliquidacion/v2";
    private static final QName CQN_SALIDA_OBTENER_PDF_LIQUIDACION = new QName(CS_NOMBREPACIO, "salidaObtenerPDFLiquidacion");
    private static final QName CQN_ENTRADA_OBTENER_PDF_LIQUIDACION = new QName(CS_NOMBREPACIO, "entradaObtenerPDFLiquidacion");
    private static final QName CQN_TIPO_SALIDA_OBTENER_PDF_LIQUIDACION_DESCRIPCION_MENSAJE = new QName(CS_NOMBREPACIO, "descripcionMensaje");

    /**
     * Create a new ConsultaActosTurnoObjectFactory that can be used to create new instances of schema derived classes for package: https.www_supernotariado_gov_co.schemas.bachue.ef.operacionesfinancieras.obtenerpdfliquidacion.v2
     * 
     */
    public ObtenerPdfLiquidacionObjectFactory() {
    	//Constructor vacio
    }

    /**
     * Create an instance of {@link TipoSalidaObtenerPDFLiquidacion }
     * 
     */
    public TipoSalidaObtenerPDFLiquidacion createTipoSalidaObtenerPDFLiquidacion() {
        return new TipoSalidaObtenerPDFLiquidacion();
    }

    /**
     * Create an instance of {@link TipoEntradaObtenerPDFLiquidacion }
     * 
     */
    public TipoEntradaObtenerPDFLiquidacion createTipoEntradaObtenerPDFLiquidacion() {
        return new TipoEntradaObtenerPDFLiquidacion();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoSalidaObtenerPDFLiquidacion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/ef/operacionesfinancieras/obtenerpdfliquidacion/v2", name = "salidaObtenerPDFLiquidacion")
    public JAXBElement<TipoSalidaObtenerPDFLiquidacion> createSalidaObtenerPDFLiquidacion(TipoSalidaObtenerPDFLiquidacion value) {
        return new JAXBElement<>(CQN_SALIDA_OBTENER_PDF_LIQUIDACION, TipoSalidaObtenerPDFLiquidacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoEntradaObtenerPDFLiquidacion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/ef/operacionesfinancieras/obtenerpdfliquidacion/v2", name = "entradaObtenerPDFLiquidacion")
    public JAXBElement<TipoEntradaObtenerPDFLiquidacion> createEntradaObtenerPDFLiquidacion(TipoEntradaObtenerPDFLiquidacion value) {
        return new JAXBElement<>(CQN_ENTRADA_OBTENER_PDF_LIQUIDACION, TipoEntradaObtenerPDFLiquidacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/ef/operacionesfinancieras/obtenerpdfliquidacion/v2", name = "descripcionMensaje", scope = TipoSalidaObtenerPDFLiquidacion.class)
    public JAXBElement<String> createTipoSalidaObtenerPDFLiquidacionDescripcionMensaje(String value) {
        return new JAXBElement<>(CQN_TIPO_SALIDA_OBTENER_PDF_LIQUIDACION_DESCRIPCION_MENSAJE, String.class, TipoSalidaObtenerPDFLiquidacion.class, value);
    }

}

package co.gov.supernotariado.bachue.clientebus.busquedadocumentos.types.obtenerarchivo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the https.www_supernotariado_gov_co.schemas.bachue.co.busquedadocumentos.obtenerarchivo.v1 package. 
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
public class ObtenerArchivoObjectFactory {

    private final static QName CQN_ENTRADA_OBTENER_ARCHIVO = new QName("https://www.supernotariado.gov.co/schemas/bachue/co/busquedadocumentos/obtenerarchivo/v1", "entradaObtenerArchivo");
    private final static QName CQN_SALIDA_OBTENER_ARCHIVO = new QName("https://www.supernotariado.gov.co/schemas/bachue/co/busquedadocumentos/obtenerarchivo/v1", "salidaObtenerArchivo");

    /**
     * Create a new ConsultaActosTurnoObjectFactory that can be used to create new instances of schema derived classes for package: https.www_supernotariado_gov_co.schemas.bachue.co.busquedadocumentos.obtenerarchivo.v1
     * 
     */
    public ObtenerArchivoObjectFactory() {
    	//Constructor vacio
    }

    /**
     * Create an instance of {@link TipoSalidaObtenerArchivo }
     * 
     */
    public TipoSalidaObtenerArchivo createTipoSalidaObtenerArchivo() {
        return new TipoSalidaObtenerArchivo();
    }

    /**
     * Create an instance of {@link TipoEntradaObtenerArchivo }
     * 
     */
    public TipoEntradaObtenerArchivo createTipoEntradaObtenerArchivo() {
        return new TipoEntradaObtenerArchivo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoEntradaObtenerArchivo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/co/busquedadocumentos/obtenerarchivo/v1", name = "entradaObtenerArchivo")
    public JAXBElement<TipoEntradaObtenerArchivo> createEntradaObtenerArchivo(TipoEntradaObtenerArchivo value) {
        return new JAXBElement<>(CQN_ENTRADA_OBTENER_ARCHIVO, TipoEntradaObtenerArchivo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoSalidaObtenerArchivo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/co/busquedadocumentos/obtenerarchivo/v1", name = "salidaObtenerArchivo")
    public JAXBElement<TipoSalidaObtenerArchivo> createSalidaObtenerArchivo(TipoSalidaObtenerArchivo value) {
        return new JAXBElement<>(CQN_SALIDA_OBTENER_ARCHIVO, TipoSalidaObtenerArchivo.class, null, value);
    }

}

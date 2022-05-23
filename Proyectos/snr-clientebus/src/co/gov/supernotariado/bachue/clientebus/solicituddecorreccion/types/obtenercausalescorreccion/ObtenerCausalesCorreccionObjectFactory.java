
package co.gov.supernotariado.bachue.clientebus.solicituddecorreccion.types.obtenercausalescorreccion;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the https.www_supernotariado_gov_co.schemas.bachue.ee.solicituddecorreccion.obtenercausalescorreccion.v1 package. 
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
public class ObtenerCausalesCorreccionObjectFactory {

	private static final String CS_NOMBREESPACIO = "https://www.supernotariado.gov.co/schemas/bachue/ee/solicituddecorreccion/obtenercausalescorreccion/v1";
    private static final QName CQN_ENTRADA_OBTENER_CAUSALES_CORRECCION = new QName(CS_NOMBREESPACIO, "entradaObtenerCausalesCorreccion");
    private static final QName CQN_SALIDA_OBTENER_CAUSALES_CORRECCION = new QName(CS_NOMBREESPACIO, "salidaObtenerCausalesCorreccion");

    /**
     * Create a new ConsultaActosTurnoObjectFactory that can be used to create new instances of schema derived classes for package: https.www_supernotariado_gov_co.schemas.bachue.ee.solicituddecorreccion.obtenercausalescorreccion.v1
     * 
     */
    public ObtenerCausalesCorreccionObjectFactory() {
    	// constructor vacio
    }

    /**
     * Create an instance of {@link TipoSalidaObtenerCausalesCorreccion }
     * 
     */
    public TipoSalidaObtenerCausalesCorreccion createTipoSalidaObtenerCausalesCorreccion() {
        return new TipoSalidaObtenerCausalesCorreccion();
    }

    /**
     * Create an instance of {@link TipoSalidaObtenerCausalesCorreccion.ListaCausales }
     * 
     */
    public TipoSalidaObtenerCausalesCorreccion.ListaCausales createTipoSalidaObtenerCausalesCorreccionListaCausales() {
        return new TipoSalidaObtenerCausalesCorreccion.ListaCausales();
    }

    /**
     * Create an instance of {@link TipoObtenerCausalesCorreccion }
     * 
     */
    public TipoObtenerCausalesCorreccion createTipoObtenerCausalesCorreccion() {
        return new TipoObtenerCausalesCorreccion();
    }

    /**
     * Create an instance of {@link TipoSalidaObtenerCausalesCorreccion.ListaCausales.Causal }
     * 
     */
    public TipoSalidaObtenerCausalesCorreccion.ListaCausales.Causal createTipoSalidaObtenerCausalesCorreccionListaCausalesCausal() {
        return new TipoSalidaObtenerCausalesCorreccion.ListaCausales.Causal();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoObtenerCausalesCorreccion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/solicituddecorreccion/obtenercausalescorreccion/v1", name = "entradaObtenerCausalesCorreccion")
    public JAXBElement<TipoObtenerCausalesCorreccion> createEntradaObtenerCausalesCorreccion(TipoObtenerCausalesCorreccion value) {
        return new JAXBElement<>(CQN_ENTRADA_OBTENER_CAUSALES_CORRECCION, TipoObtenerCausalesCorreccion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoSalidaObtenerCausalesCorreccion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/solicituddecorreccion/obtenercausalescorreccion/v1", name = "salidaObtenerCausalesCorreccion")
    public JAXBElement<TipoSalidaObtenerCausalesCorreccion> createSalidaObtenerCausalesCorreccion(TipoSalidaObtenerCausalesCorreccion value) {
        return new JAXBElement<>(CQN_SALIDA_OBTENER_CAUSALES_CORRECCION, TipoSalidaObtenerCausalesCorreccion.class, null, value);
    }

}

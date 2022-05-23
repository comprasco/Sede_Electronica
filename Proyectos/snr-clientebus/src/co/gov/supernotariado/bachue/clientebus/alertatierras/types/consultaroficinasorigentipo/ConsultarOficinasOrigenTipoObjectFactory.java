
package co.gov.supernotariado.bachue.clientebus.alertatierras.types.consultaroficinasorigentipo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the https.www_supernotariado_gov_co.schemas.bachue.ee.alertatierras.consultaroficinasorigentipo.v1 package. 
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
public class ConsultarOficinasOrigenTipoObjectFactory {

    private static final QName CQN_ENTRADA_CONSULTAR_OFICINAS_ORIGEN_TIPO = new QName("https://www.supernotariado.gov.co/schemas/bachue/ee/alertaTierras/consultarOficinasOrigenTipo/v1", "entradaConsultarOficinasOrigenTipo");
    private static final QName CQN_SALIDA_CONSULTAR_OFICINAS_ORIGEN_TIPO = new QName("https://www.supernotariado.gov.co/schemas/bachue/ee/alertaTierras/consultarOficinasOrigenTipo/v1", "salidaConsultarOficinasOrigenTipo");

    /**
     * Create a new ConsultaActosTurnoObjectFactory that can be used to create new instances of schema derived classes for package: https.www_supernotariado_gov_co.schemas.bachue.ee.alertatierras.consultaroficinasorigentipo.v1
     * 
     */
    public ConsultarOficinasOrigenTipoObjectFactory() {
    	//Constructor vacio
    }

    /**
     * Create an instance of {@link TipoSalidaConsultarOficinasOrigenTipo }
     * 
     */
    public TipoSalidaConsultarOficinasOrigenTipo createTipoSalidaConsultarOficinasOrigenTipo() {
        return new TipoSalidaConsultarOficinasOrigenTipo();
    }

    /**
     * Create an instance of {@link TipoSalidaConsultarOficinasOrigenTipo.ListaOficinasOrigen }
     * 
     */
    public TipoSalidaConsultarOficinasOrigenTipo.ListaOficinasOrigen createTipoSalidaConsultarOficinasOrigenTipoListaOficinasOrigen() {
        return new TipoSalidaConsultarOficinasOrigenTipo.ListaOficinasOrigen();
    }

    /**
     * Create an instance of {@link TipoEntradaConsultarOficinasOrigenTipo }
     * 
     */
    public TipoEntradaConsultarOficinasOrigenTipo createTipoEntradaConsultarOficinasOrigenTipo() {
        return new TipoEntradaConsultarOficinasOrigenTipo();
    }

    /**
     * Create an instance of {@link TipoSalidaConsultarOficinasOrigenTipo.ListaOficinasOrigen.OficinaOrigen }
     * 
     */
    public TipoSalidaConsultarOficinasOrigenTipo.ListaOficinasOrigen.OficinaOrigen createTipoSalidaConsultarOficinasOrigenTipoListaOficinasOrigenOficinaOrigen() {
        return new TipoSalidaConsultarOficinasOrigenTipo.ListaOficinasOrigen.OficinaOrigen();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoEntradaConsultarOficinasOrigenTipo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/alertaTierras/consultarOficinasOrigenTipo/v1", name = "entradaConsultarOficinasOrigenTipo")
    public JAXBElement<TipoEntradaConsultarOficinasOrigenTipo> createEntradaConsultarOficinasOrigenTipo(TipoEntradaConsultarOficinasOrigenTipo value) {
        return new JAXBElement<>(CQN_ENTRADA_CONSULTAR_OFICINAS_ORIGEN_TIPO, TipoEntradaConsultarOficinasOrigenTipo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoSalidaConsultarOficinasOrigenTipo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/alertaTierras/consultarOficinasOrigenTipo/v1", name = "salidaConsultarOficinasOrigenTipo")
    public JAXBElement<TipoSalidaConsultarOficinasOrigenTipo> createSalidaConsultarOficinasOrigenTipo(TipoSalidaConsultarOficinasOrigenTipo value) {
        return new JAXBElement<>(CQN_SALIDA_CONSULTAR_OFICINAS_ORIGEN_TIPO, TipoSalidaConsultarOficinasOrigenTipo.class, null, value);
    }

}

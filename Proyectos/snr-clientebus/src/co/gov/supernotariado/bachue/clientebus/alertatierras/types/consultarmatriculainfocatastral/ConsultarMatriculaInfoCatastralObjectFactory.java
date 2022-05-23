
package co.gov.supernotariado.bachue.clientebus.alertatierras.types.consultarmatriculainfocatastral;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the https.www_supernotariado_gov_co.schemas.bachue.ee.alertatierras.consultarmatriculainfocatastral.v1 package. 
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
public class ConsultarMatriculaInfoCatastralObjectFactory {

    private static final QName CQN_ENTRADA_CONSULTAR_MATRICULA_INFO_CATASTRAL = new QName("https://www.supernotariado.gov.co/schemas/bachue/ee/alertaTierras/consultarMatriculaInfoCatastral/v1", "entradaConsultarMatriculaInfoCatastral");
    private static final QName CQN_SALIDA_CONSULTAR_MATRICULA_INFO_CATASTRAL = new QName("https://www.supernotariado.gov.co/schemas/bachue/ee/alertaTierras/consultarMatriculaInfoCatastral/v1", "salidaConsultarMatriculaInfoCatastral");

    /**
     * Create a new ConsultaActosTurnoObjectFactory that can be used to create new instances of schema derived classes for package: https.www_supernotariado_gov_co.schemas.bachue.ee.alertatierras.consultarmatriculainfocatastral.v1
     * 
     */
    public ConsultarMatriculaInfoCatastralObjectFactory() {
    	//Constructor vacio
    }

    /**
     * Create an instance of {@link TipoSalidaConsultarMatriculaICatastral }
     * 
     */
    public TipoSalidaConsultarMatriculaICatastral createTipoSalidaConsultarMatriculaICatastral() {
        return new TipoSalidaConsultarMatriculaICatastral();
    }

    /**
     * Create an instance of {@link TipoSalidaConsultarMatriculaICatastral.ListaMatriculas }
     * 
     */
    public TipoSalidaConsultarMatriculaICatastral.ListaMatriculas createTipoSalidaConsultarMatriculaICatastralListaMatriculas() {
        return new TipoSalidaConsultarMatriculaICatastral.ListaMatriculas();
    }

    /**
     * Create an instance of {@link TipoEntradaConsultarMatriculaInfoCatastral }
     * 
     */
    public TipoEntradaConsultarMatriculaInfoCatastral createTipoEntradaConsultarMatriculaInfoCatastral() {
        return new TipoEntradaConsultarMatriculaInfoCatastral();
    }

    /**
     * Create an instance of {@link TipoSalidaConsultarMatriculaICatastral.ListaMatriculas.Matricula }
     * 
     */
    public TipoSalidaConsultarMatriculaICatastral.ListaMatriculas.Matricula createTipoSalidaConsultarMatriculaICatastralListaMatriculasMatricula() {
        return new TipoSalidaConsultarMatriculaICatastral.ListaMatriculas.Matricula();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoEntradaConsultarMatriculaInfoCatastral }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/alertaTierras/consultarMatriculaInfoCatastral/v1", name = "entradaConsultarMatriculaInfoCatastral")
    public JAXBElement<TipoEntradaConsultarMatriculaInfoCatastral> createEntradaConsultarMatriculaInfoCatastral(TipoEntradaConsultarMatriculaInfoCatastral value) {
        return new JAXBElement<>(CQN_ENTRADA_CONSULTAR_MATRICULA_INFO_CATASTRAL, TipoEntradaConsultarMatriculaInfoCatastral.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoSalidaConsultarMatriculaICatastral }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/alertaTierras/consultarMatriculaInfoCatastral/v1", name = "salidaConsultarMatriculaInfoCatastral")
    public JAXBElement<TipoSalidaConsultarMatriculaICatastral> createSalidaConsultarMatriculaInfoCatastral(TipoSalidaConsultarMatriculaICatastral value) {
        return new JAXBElement<>(CQN_SALIDA_CONSULTAR_MATRICULA_INFO_CATASTRAL, TipoSalidaConsultarMatriculaICatastral.class, null, value);
    }

}

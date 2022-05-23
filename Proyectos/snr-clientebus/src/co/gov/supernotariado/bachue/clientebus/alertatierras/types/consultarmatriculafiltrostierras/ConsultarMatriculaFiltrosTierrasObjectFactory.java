
package co.gov.supernotariado.bachue.clientebus.alertatierras.types.consultarmatriculafiltrostierras;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the https.www_supernotariado_gov_co.schemas.bachue.ee.alertatierras.consultarmatriculafiltrostierras.v1 package. 
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
public class ConsultarMatriculaFiltrosTierrasObjectFactory {

    private static final QName CQN_ENTRADA_CONSULTAR_MATRICULA_FILTROS_TIERRAS = new QName("https://www.supernotariado.gov.co/schemas/bachue/ee/alertaTierras/consultarMatriculaFiltrosTierras/v1", "entradaConsultarMatriculaFiltrosTierras");
    private static final QName CQN_SALIDA_CONSULTAR_MATRICULA_FILTROS_TIERRAS = new QName("https://www.supernotariado.gov.co/schemas/bachue/ee/alertaTierras/consultarMatriculaFiltrosTierras/v1", "salidaConsultarMatriculaFiltrosTierras");

    /**
     * Create a new ConsultaActosTurnoObjectFactory that can be used to create new instances of schema derived classes for package: https.www_supernotariado_gov_co.schemas.bachue.ee.alertatierras.consultarmatriculafiltrostierras.v1
     * 
     */
    public ConsultarMatriculaFiltrosTierrasObjectFactory() {
    	//Constructor vacio
    }

    /**
     * Create an instance of {@link TipoSalidaConsultarMatriculaFiltrosTierras }
     * 
     */
    public TipoSalidaConsultarMatriculaFiltrosTierras createTipoSalidaConsultarMatriculaFiltrosTierras() {
        return new TipoSalidaConsultarMatriculaFiltrosTierras();
    }

    /**
     * Create an instance of {@link TipoSalidaConsultarMatriculaFiltrosTierras.ListaMatriculas }
     * 
     */
    public TipoSalidaConsultarMatriculaFiltrosTierras.ListaMatriculas createTipoSalidaConsultarMatriculaFiltrosTierrasListaMatriculas() {
        return new TipoSalidaConsultarMatriculaFiltrosTierras.ListaMatriculas();
    }

    /**
     * Create an instance of {@link TipoEntradaConsultarMatriculaFiltrosTierras }
     * 
     */
    public TipoEntradaConsultarMatriculaFiltrosTierras createTipoEntradaConsultarMatriculaFiltrosTierras() {
        return new TipoEntradaConsultarMatriculaFiltrosTierras();
    }

    /**
     * Create an instance of {@link TipoSalidaConsultarMatriculaFiltrosTierras.ListaMatriculas.Matricula }
     * 
     */
    public TipoSalidaConsultarMatriculaFiltrosTierras.ListaMatriculas.Matricula createTipoSalidaConsultarMatriculaFiltrosTierrasListaMatriculasMatricula() {
        return new TipoSalidaConsultarMatriculaFiltrosTierras.ListaMatriculas.Matricula();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoEntradaConsultarMatriculaFiltrosTierras }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/alertaTierras/consultarMatriculaFiltrosTierras/v1", name = "entradaConsultarMatriculaFiltrosTierras")
    public JAXBElement<TipoEntradaConsultarMatriculaFiltrosTierras> createEntradaConsultarMatriculaFiltrosTierras(TipoEntradaConsultarMatriculaFiltrosTierras value) {
        return new JAXBElement<>(CQN_ENTRADA_CONSULTAR_MATRICULA_FILTROS_TIERRAS, TipoEntradaConsultarMatriculaFiltrosTierras.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoSalidaConsultarMatriculaFiltrosTierras }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/alertaTierras/consultarMatriculaFiltrosTierras/v1", name = "salidaConsultarMatriculaFiltrosTierras")
    public JAXBElement<TipoSalidaConsultarMatriculaFiltrosTierras> createSalidaConsultarMatriculaFiltrosTierras(TipoSalidaConsultarMatriculaFiltrosTierras value) {
        return new JAXBElement<>(CQN_SALIDA_CONSULTAR_MATRICULA_FILTROS_TIERRAS, TipoSalidaConsultarMatriculaFiltrosTierras.class, null, value);
    }

}

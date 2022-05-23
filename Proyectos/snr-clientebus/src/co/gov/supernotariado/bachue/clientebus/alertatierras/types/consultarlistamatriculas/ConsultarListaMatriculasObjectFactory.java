
package co.gov.supernotariado.bachue.clientebus.alertatierras.types.consultarlistamatriculas;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the https.www_supernotariado_gov_co.schemas.bachue.ee.alertatierras.consultarlistamatriculas.v1 package. 
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
public class ConsultarListaMatriculasObjectFactory {

    private static final QName CQN_SALIDA_CONSULTAR_LISTA_MATRICULAS = new QName("https://www.supernotariado.gov.co/schemas/bachue/ee/alertaTierras/consultarListaMatriculas/v1", "salidaConsultarListaMatriculas");
    private static final QName CQN_ENTRADA_CONSULTAR_LISTA_MATRICULAS = new QName("https://www.supernotariado.gov.co/schemas/bachue/ee/alertaTierras/consultarListaMatriculas/v1", "entradaConsultarListaMatriculas");

    /**
     * Create a new ConsultaActosTurnoObjectFactory that can be used to create new instances of schema derived classes for package: https.www_supernotariado_gov_co.schemas.bachue.ee.alertatierras.consultarlistamatriculas.v1
     * 
     */
    public ConsultarListaMatriculasObjectFactory() {
    	//Constructor vacio
    }

    /**
     * Create an instance of {@link TipoEntradaConsultarListaMatriculas }
     * 
     */
    public TipoEntradaConsultarListaMatriculas createTipoEntradaConsultarListaMatriculas() {
        return new TipoEntradaConsultarListaMatriculas();
    }

    /**
     * Create an instance of {@link TipoEntradaConsultarListaMatriculas.ListaMatricula }
     * 
     */
    public TipoEntradaConsultarListaMatriculas.ListaMatricula createTipoEntradaConsultarListaMatriculasListaMatricula() {
        return new TipoEntradaConsultarListaMatriculas.ListaMatricula();
    }

    /**
     * Create an instance of {@link TipoSalidaConsultarListaMatriculas }
     * 
     */
    public TipoSalidaConsultarListaMatriculas createTipoSalidaConsultarListaMatriculas() {
        return new TipoSalidaConsultarListaMatriculas();
    }

    /**
     * Create an instance of {@link TipoSalidaConsultarListaMatriculas.ListaMatriculas }
     * 
     */
    public TipoSalidaConsultarListaMatriculas.ListaMatriculas createTipoSalidaConsultarListaMatriculasListaMatriculas() {
        return new TipoSalidaConsultarListaMatriculas.ListaMatriculas();
    }

    /**
     * Create an instance of {@link TipoEntradaConsultarListaMatriculas.ListaMatricula.Matricula }
     * 
     */
    public TipoEntradaConsultarListaMatriculas.ListaMatricula.Matricula createTipoEntradaConsultarListaMatriculasListaMatriculaMatricula() {
        return new TipoEntradaConsultarListaMatriculas.ListaMatricula.Matricula();
    }

    /**
     * Create an instance of {@link TipoSalidaConsultarListaMatriculas.ListaMatriculas.Matricula }
     * 
     */
    public TipoSalidaConsultarListaMatriculas.ListaMatriculas.Matricula createTipoSalidaConsultarListaMatriculasListaMatriculasMatricula() {
        return new TipoSalidaConsultarListaMatriculas.ListaMatriculas.Matricula();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoSalidaConsultarListaMatriculas }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/alertaTierras/consultarListaMatriculas/v1", name = "salidaConsultarListaMatriculas")
    public JAXBElement<TipoSalidaConsultarListaMatriculas> createSalidaConsultarListaMatriculas(TipoSalidaConsultarListaMatriculas value) {
        return new JAXBElement<>(CQN_SALIDA_CONSULTAR_LISTA_MATRICULAS, TipoSalidaConsultarListaMatriculas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoEntradaConsultarListaMatriculas }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/alertaTierras/consultarListaMatriculas/v1", name = "entradaConsultarListaMatriculas")
    public JAXBElement<TipoEntradaConsultarListaMatriculas> createEntradaConsultarListaMatriculas(TipoEntradaConsultarListaMatriculas value) {
        return new JAXBElement<>(CQN_ENTRADA_CONSULTAR_LISTA_MATRICULAS, TipoEntradaConsultarListaMatriculas.class, null, value);
    }

}

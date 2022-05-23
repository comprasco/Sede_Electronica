
package co.gov.supernotariado.bachue.clientebus.alertatierras.types.agregarlistamatriculasalerta;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the https.www_supernotariado_gov_co.schemas.bachue.ee.alertatierras.agregarlistamatriculasalerta.v1 package. 
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
public class AgregarListaMatriculasAlertaObjectFactory {

    private static final QName CQN_ENTRADA_AGREGAR_LISTA_MATRICULA_ALERTAS = new QName("https://www.supernotariado.gov.co/schemas/bachue/ee/alertaTierras/agregarListaMatriculasAlerta/v1", "entradaAgregarListaMatriculasAlerta");
    private static final QName CQN_SALIDA_AGREGAR_LISTA_MATRICULA_ALERTAS = new QName("https://www.supernotariado.gov.co/schemas/bachue/ee/alertaTierras/agregarListaMatriculasAlerta/v1", "salidaAgregarListaMatriculasAlerta");

    /**
     * Create a new ConsultaActosTurnoObjectFactory that can be used to create new instances of schema derived classes for package: https.www_supernotariado_gov_co.schemas.bachue.ee.alertatierras.agregarlistamatriculasalerta.v1
     * 
     */
    public AgregarListaMatriculasAlertaObjectFactory() {
    	//Constructor vacio
    }

    /**
     * Create an instance of {@link TipoEntradaAgregarListaMatriculasAlerta }
     * 
     */
    public TipoEntradaAgregarListaMatriculasAlerta createTipoEntradaAgregarListaMatriculasAlerta() {
        return new TipoEntradaAgregarListaMatriculasAlerta();
    }

    /**
     * Create an instance of {@link TipoEntradaAgregarListaMatriculasAlerta.ListaMatriculas }
     * 
     */
    public TipoEntradaAgregarListaMatriculasAlerta.ListaMatriculas createTipoEntradaAgregarListaMatriculasAlertaListaMatriculas() {
        return new TipoEntradaAgregarListaMatriculasAlerta.ListaMatriculas();
    }

    /**
     * Create an instance of {@link TipoSalidaAgregarListaMatriculasAlerta }
     * 
     */
    public TipoSalidaAgregarListaMatriculasAlerta createTipoSalidaAgregarListaMatriculasAlerta() {
        return new TipoSalidaAgregarListaMatriculasAlerta();
    }

    /**
     * Create an instance of {@link TipoEntradaAgregarListaMatriculasAlerta.ListaMatriculas.Matricula }
     * 
     */
    public TipoEntradaAgregarListaMatriculasAlerta.ListaMatriculas.Matricula createTipoEntradaAgregarListaMatriculasAlertaListaMatriculasMatricula() {
        return new TipoEntradaAgregarListaMatriculasAlerta.ListaMatriculas.Matricula();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoEntradaAgregarListaMatriculasAlerta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/alertaTierras/agregarListaMatriculasAlerta/v1", name = "entradaAgregarListaMatriculasAlerta")
    public JAXBElement<TipoEntradaAgregarListaMatriculasAlerta> createEntradaAgregarListaMatriculasAlerta(TipoEntradaAgregarListaMatriculasAlerta value) {
        return new JAXBElement<>(CQN_ENTRADA_AGREGAR_LISTA_MATRICULA_ALERTAS, TipoEntradaAgregarListaMatriculasAlerta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoSalidaAgregarListaMatriculasAlerta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/alertaTierras/agregarListaMatriculasAlerta/v1", name = "salidaAgregarListaMatriculasAlerta")
    public JAXBElement<TipoSalidaAgregarListaMatriculasAlerta> createSalidaAgregarListaMatriculasAlerta(TipoSalidaAgregarListaMatriculasAlerta value) {
        return new JAXBElement<>(CQN_SALIDA_AGREGAR_LISTA_MATRICULA_ALERTAS, TipoSalidaAgregarListaMatriculasAlerta.class, null, value);
    }

}

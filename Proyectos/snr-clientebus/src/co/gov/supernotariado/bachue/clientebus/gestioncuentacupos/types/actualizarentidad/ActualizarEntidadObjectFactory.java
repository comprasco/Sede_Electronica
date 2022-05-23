
package co.gov.supernotariado.bachue.clientebus.gestioncuentacupos.types.actualizarentidad;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the https.www_supernotariado_gov_co.schemas.bachue.cb.gestioncuentacupos.actualizarentidad.v1 package. 
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
public class ActualizarEntidadObjectFactory {

    private static final QName CQN_ENTRADA_ACTUALIZAR_ENTIDAD = new QName("https://www.supernotariado.gov.co/schemas/bachue/cb/gestioncuentacupos/actualizarentidad/v1", "entradaActualizarEntidad");
    private static final QName CQN_SALIDA_ACTUALIZAR_ENTIDAD = new QName("https://www.supernotariado.gov.co/schemas/bachue/cb/gestioncuentacupos/actualizarentidad/v1", "salidaActualizarEntidad");

    /**
     * Create a new ConsultaActosTurnoObjectFactory that can be used to create new instances of schema derived classes for package: https.www_supernotariado_gov_co.schemas.bachue.cb.gestioncuentacupos.actualizarentidad.v1
     * 
     */
    public ActualizarEntidadObjectFactory() {
    	//Constructor vacio
    }

    /**
     * Create an instance of {@link TipoSalidaActualizarEntidad }
     * 
     */
    public TipoSalidaActualizarEntidad createTipoSalidaActualizarEntidad() {
        return new TipoSalidaActualizarEntidad();
    }

    /**
     * Create an instance of {@link TipoEntradaActualizarEntidad }
     * 
     */
    public TipoEntradaActualizarEntidad createTipoEntradaActualizarEntidad() {
        return new TipoEntradaActualizarEntidad();
    }

    /**
     * Create an instance of {@link TipoEmpresaAEI }
     * 
     */
    public TipoEmpresaAEI createTipoEmpresaAEI() {
        return new TipoEmpresaAEI();
    }

    /**
     * Create an instance of {@link TipoRepresentanteLegalAEI }
     * 
     */
    public TipoRepresentanteLegalAEI createTipoRepresentanteLegalAEI() {
        return new TipoRepresentanteLegalAEI();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoEntradaActualizarEntidad }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/cb/gestioncuentacupos/actualizarentidad/v1", name = "entradaActualizarEntidad")
    public JAXBElement<TipoEntradaActualizarEntidad> createEntradaActualizarEntidad(TipoEntradaActualizarEntidad value) {
        return new JAXBElement<>(CQN_ENTRADA_ACTUALIZAR_ENTIDAD, TipoEntradaActualizarEntidad.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoSalidaActualizarEntidad }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/cb/gestioncuentacupos/actualizarentidad/v1", name = "salidaActualizarEntidad")
    public JAXBElement<TipoSalidaActualizarEntidad> createSalidaActualizarEntidad(TipoSalidaActualizarEntidad value) {
        return new JAXBElement<>(CQN_SALIDA_ACTUALIZAR_ENTIDAD, TipoSalidaActualizarEntidad.class, null, value);
    }

}

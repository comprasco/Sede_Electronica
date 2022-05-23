package co.gov.supernotariado.bachue.clientebus.gestioncuentacupos.types.actualizarentidad;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tipoEntradaActualizarEntidad complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tipoEntradaActualizarEntidad">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="modulo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="empresa" type="{https://www.supernotariado.gov.co/schemas/bachue/cb/gestioncuentacupos/actualizarentidad/v1}tipoEmpresaAEI"/>
 *         &lt;element name="representanteLegal" type="{https://www.supernotariado.gov.co/schemas/bachue/cb/gestioncuentacupos/actualizarentidad/v1}tipoRepresentanteLegalAEI"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoEntradaActualizarEntidad", propOrder = {
    "modulo",
    "empresa",
    "representanteLegal"
})
public class TipoEntradaActualizarEntidad {

    @XmlElement(required = true)
    protected String modulo;
    @XmlElement(required = true)
    protected TipoEmpresaAEI empresa;
    @XmlElement(required = true)
    protected TipoRepresentanteLegalAEI representanteLegal;

    /**
     * Obtiene el valor de la propiedad modulo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModulo() {
        return modulo;
    }

    /**
     * Define el valor de la propiedad modulo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModulo(String value) {
        this.modulo = value;
    }

    /**
     * Obtiene el valor de la propiedad empresa.
     * 
     * @return
     *     possible object is
     *     {@link TipoEmpresaAEI }
     *     
     */
    public TipoEmpresaAEI getEmpresa() {
        return empresa;
    }

    /**
     * Define el valor de la propiedad empresa.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoEmpresaAEI }
     *     
     */
    public void setEmpresa(TipoEmpresaAEI value) {
        this.empresa = value;
    }

    /**
     * Obtiene el valor de la propiedad representanteLegal.
     * 
     * @return
     *     possible object is
     *     {@link TipoRepresentanteLegalAEI }
     *     
     */
    public TipoRepresentanteLegalAEI getRepresentanteLegal() {
        return representanteLegal;
    }

    /**
     * Define el valor de la propiedad representanteLegal.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoRepresentanteLegalAEI }
     *     
     */
    public void setRepresentanteLegal(TipoRepresentanteLegalAEI value) {
        this.representanteLegal = value;
    }

}

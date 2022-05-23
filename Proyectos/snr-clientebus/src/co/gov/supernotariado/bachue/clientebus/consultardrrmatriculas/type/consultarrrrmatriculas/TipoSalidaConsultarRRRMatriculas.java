
package co.gov.supernotariado.bachue.clientebus.consultardrrmatriculas.type.consultarrrrmatriculas;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para tipoSalidaConsultarRRRMatriculas complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tipoSalidaConsultarRRRMatriculas">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codDepartamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codMunicipio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codCirculoRegistral" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numMatriculaInmobiliaria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="listaDerechos" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="derecho" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="numAnotacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="comentario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="fechaAnotacion" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                             &lt;element name="codNaturalezaJuridicaFolio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="nomNaturalezaJuridicaFolio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="dominioDRR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="intervinientes" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="interviniente" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="tipoDocumentoPersona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="numDocumentoPersona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="primerNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="segundoNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="primerApellido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="segundoApellido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="razonSocial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="rolInterviniente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="tipoParteInteresada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="listaRestricciones" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="restriccion" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="numAnotacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="comentario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="fechaAnotacion" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                             &lt;element name="codNaturalezaJuridicaFolio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="nomNaturalezaJuridicaFolio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="dominioDRR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="intervinientes" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="interviniente" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="tipoDocumentoPersona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="numDocumentoPersona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="primerNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="segundoNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="primerApellido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="segundoApellido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="razonSocial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="rolInterviniente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="tipoParteInteresada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="listaResponsabilidades" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="responsabilidad" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="numAnotacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="comentario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="fechaAnotacion" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                             &lt;element name="codNaturalezaJuridicaFolio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="nomNaturalezaJuridicaFolio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="dominioDRR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="intervinientes" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="interviniente" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="tipoDocumentoPersona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="numDocumentoPersona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="primerNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="segundoNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="primerApellido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="segundoApellido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="razonSocial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="rolInterviniente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="tipoParteInteresada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="listaPublicidades" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="publicidad" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="numAnotacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="comentario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="fechaAnotacion" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                             &lt;element name="codNaturalezaJuridicaFolio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="nomNaturalezaJuridicaFolio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="dominioDRR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="intervinientes" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="interviniente" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="tipoDocumentoPersona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="numDocumentoPersona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="primerNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="segundoNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="primerApellido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="segundoApellido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="razonSocial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="rolInterviniente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="tipoParteInteresada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="listaHipotecas" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="hipoteca" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="numAnotacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="comentario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="fechaAnotacion" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                             &lt;element name="codNaturalezaJuridicaFolio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="nomNaturalezaJuridicaFolio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="dominioDRR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="intervinientes" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="interviniente" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="tipoDocumentoPersona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="numDocumentoPersona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="primerNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="segundoNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="primerApellido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="segundoApellido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="razonSocial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="rolInterviniente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="tipoParteInteresada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="codMensaje" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="descripcionMensaje" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoSalidaConsultarRRRMatriculas", propOrder = {
		"codDepartamento",
		"codMunicipio",
		"codCirculoRegistral",
		"numMatriculaInmobiliaria",
		"listaDerechos",
		"listaRestricciones",
		"listaResponsabilidades",
		"listaPublicidades",
		"listaHipotecas",
		"codMensaje",
		"descripcionMensaje"
})
public class TipoSalidaConsultarRRRMatriculas {

	@XmlElement(name = "codDepartamento",namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/RRRMatriculas/consultarRRRMatriculas/v1")
	protected String codDepartamento;
	@XmlElement(name = "codMunicipio",namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/RRRMatriculas/consultarRRRMatriculas/v1")
	protected String codMunicipio;
	@XmlElement(name = "codCirculoRegistral",namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/RRRMatriculas/consultarRRRMatriculas/v1")
	protected String codCirculoRegistral;
	@XmlElement(name = "numMatriculaInmobiliaria",namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/RRRMatriculas/consultarRRRMatriculas/v1")
	protected String numMatriculaInmobiliaria;
	@XmlElement(name = "listaDerechos",namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/RRRMatriculas/consultarRRRMatriculas/v1")
	protected TipoSalidaConsultarRRRMatriculas.ListaDerechos listaDerechos;
	@XmlElement(name = "listaRestricciones",namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/RRRMatriculas/consultarRRRMatriculas/v1")
	protected TipoSalidaConsultarRRRMatriculas.ListaRestricciones listaRestricciones;
	@XmlElementRef(name = "listaResponsabilidades", namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/RRRMatriculas/consultarRRRMatriculas/v1", type = JAXBElement.class, required = false)
	protected JAXBElement<TipoSalidaConsultarRRRMatriculas.ListaResponsabilidades> listaResponsabilidades;
	@XmlElement(name = "listaPublicidades",namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/RRRMatriculas/consultarRRRMatriculas/v1")
	protected TipoSalidaConsultarRRRMatriculas.ListaPublicidades listaPublicidades;
	@XmlElement(name = "listaHipotecas",namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/RRRMatriculas/consultarRRRMatriculas/v1")
	protected TipoSalidaConsultarRRRMatriculas.ListaHipotecas listaHipotecas;
	@XmlElement(name = "codMensaje", required = true, namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/RRRMatriculas/consultarRRRMatriculas/v1")
	protected BigInteger codMensaje;
	@XmlElement(name = "descripcionMensaje", required = false, namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/RRRMatriculas/consultarRRRMatriculas/v1")
	protected String descripcionMensaje;

	/**
	 * Obtiene el valor de la propiedad codDepartamento.
	 * 
	 * @return
	 *     possible object is
	 *     {@link String }
	 *     
	 */
	public String getCodDepartamento() {
		return codDepartamento;
	}

	/**
	 * Define el valor de la propiedad codDepartamento.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link String }
	 *     
	 */
	public void setCodDepartamento(String value) {
		this.codDepartamento = value;
	}

	/**
	 * Obtiene el valor de la propiedad codMunicipio.
	 * 
	 * @return
	 *     possible object is
	 *     {@link String }
	 *     
	 */
	public String getCodMunicipio() {
		return codMunicipio;
	}

	/**
	 * Define el valor de la propiedad codMunicipio.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link String }
	 *     
	 */
	public void setCodMunicipio(String value) {
		this.codMunicipio = value;
	}

	/**
	 * Obtiene el valor de la propiedad codCirculoRegistral.
	 * 
	 * @return
	 *     possible object is
	 *     {@link String }
	 *     
	 */
	public String getCodCirculoRegistral() {
		return codCirculoRegistral;
	}

	/**
	 * Define el valor de la propiedad codCirculoRegistral.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link String }
	 *     
	 */
	public void setCodCirculoRegistral(String value) {
		this.codCirculoRegistral = value;
	}

	/**
	 * Obtiene el valor de la propiedad numMatriculaInmobiliaria.
	 * 
	 * @return
	 *     possible object is
	 *     {@link String }
	 *     
	 */
	public String getNumMatriculaInmobiliaria() {
		return numMatriculaInmobiliaria;
	}

	/**
	 * Define el valor de la propiedad numMatriculaInmobiliaria.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link String }
	 *     
	 */
	public void setNumMatriculaInmobiliaria(String value) {
		this.numMatriculaInmobiliaria = value;
	}

	/**
	 * Obtiene el valor de la propiedad listaDerechos.
	 * 
	 * @return
	 *     possible object is
	 *     {@link TipoSalidaConsultarRRRMatriculas.ListaDerechos }
	 *     
	 */
	public TipoSalidaConsultarRRRMatriculas.ListaDerechos getListaDerechos() {
		return listaDerechos;
	}

	/**
	 * Define el valor de la propiedad listaDerechos.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link TipoSalidaConsultarRRRMatriculas.ListaDerechos }
	 *     
	 */
	public void setListaDerechos(TipoSalidaConsultarRRRMatriculas.ListaDerechos value) {
		this.listaDerechos = value;
	}

	/**
	 * Obtiene el valor de la propiedad listaRestricciones.
	 * 
	 * @return
	 *     possible object is
	 *     {@link TipoSalidaConsultarRRRMatriculas.ListaRestricciones }
	 *     
	 */
	public TipoSalidaConsultarRRRMatriculas.ListaRestricciones getListaRestricciones() {
		return listaRestricciones;
	}

	/**
	 * Define el valor de la propiedad listaRestricciones.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link TipoSalidaConsultarRRRMatriculas.ListaRestricciones }
	 *     
	 */
	public void setListaRestricciones(TipoSalidaConsultarRRRMatriculas.ListaRestricciones value) {
		this.listaRestricciones = value;
	}

	/**
	 * Obtiene el valor de la propiedad listaResponsabilidades.
	 * 
	 * @return
	 *     possible object is
	 *     {@link JAXBElement }{@code <}{@link TipoSalidaConsultarRRRMatriculas.ListaResponsabilidades }{@code >}
	 *     
	 */
	public JAXBElement<TipoSalidaConsultarRRRMatriculas.ListaResponsabilidades> getListaResponsabilidades() {
		return listaResponsabilidades;
	}

	/**
	 * Define el valor de la propiedad listaResponsabilidades.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link JAXBElement }{@code <}{@link TipoSalidaConsultarRRRMatriculas.ListaResponsabilidades }{@code >}
	 *     
	 */
	public void setListaResponsabilidades(JAXBElement<TipoSalidaConsultarRRRMatriculas.ListaResponsabilidades> value) {
		this.listaResponsabilidades = value;
	}

	/**
	 * Obtiene el valor de la propiedad listaPublicidades.
	 * 
	 * @return
	 *     possible object is
	 *     {@link TipoSalidaConsultarRRRMatriculas.ListaPublicidades }
	 *     
	 */
	public TipoSalidaConsultarRRRMatriculas.ListaPublicidades getListaPublicidades() {
		return listaPublicidades;
	}

	/**
	 * Define el valor de la propiedad listaPublicidades.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link TipoSalidaConsultarRRRMatriculas.ListaPublicidades }
	 *     
	 */
	public void setListaPublicidades(TipoSalidaConsultarRRRMatriculas.ListaPublicidades value) {
		this.listaPublicidades = value;
	}

	/**
	 * Obtiene el valor de la propiedad listaHipotecas.
	 * 
	 * @return
	 *     possible object is
	 *     {@link TipoSalidaConsultarRRRMatriculas.ListaHipotecas }
	 *     
	 */
	public TipoSalidaConsultarRRRMatriculas.ListaHipotecas getListaHipotecas() {
		return listaHipotecas;
	}

	/**
	 * Define el valor de la propiedad listaHipotecas.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link TipoSalidaConsultarRRRMatriculas.ListaHipotecas }
	 *     
	 */
	public void setListaHipotecas(TipoSalidaConsultarRRRMatriculas.ListaHipotecas value) {
		this.listaHipotecas = value;
	}

	/**
	 * Obtiene el valor de la propiedad codMensaje.
	 * 
	 * @return
	 *     possible object is
	 *     {@link BigInteger }
	 *     
	 */
	public BigInteger getCodMensaje() {
		return codMensaje;
	}

	/**
	 * Define el valor de la propiedad codMensaje.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link BigInteger }
	 *     
	 */
	public void setCodMensaje(BigInteger value) {
		this.codMensaje = value;
	}

	/**
	 * Obtiene el valor de la propiedad descripcionMensaje.
	 * 
	 * @return
	 *     possible object is
	 *     {@link String }
	 *     
	 */
	public String getDescripcionMensaje() {
		return descripcionMensaje;
	}

	/**
	 * Define el valor de la propiedad descripcionMensaje.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link String }
	 *     
	 */
	public void setDescripcionMensaje(String value) {
		this.descripcionMensaje = value;
	}


	/**
	 * <p>Clase Java para anonymous complex type.
	 * 
	 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="derecho" maxOccurs="unbounded" minOccurs="0">
	 *           &lt;complexType>
	 *             &lt;complexContent>
	 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                 &lt;sequence>
	 *                   &lt;element name="numAnotacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
	 *                   &lt;element name="comentario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
	 *                   &lt;element name="fechaAnotacion" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
	 *                   &lt;element name="codNaturalezaJuridicaFolio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
	 *                   &lt;element name="nomNaturalezaJuridicaFolio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
	 *                   &lt;element name="dominioDRR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
	 *                   &lt;element name="intervinientes" minOccurs="0">
	 *                     &lt;complexType>
	 *                       &lt;complexContent>
	 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                           &lt;sequence>
	 *                             &lt;element name="interviniente" maxOccurs="unbounded" minOccurs="0">
	 *                               &lt;complexType>
	 *                                 &lt;complexContent>
	 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                                     &lt;sequence>
	 *                                       &lt;element name="tipoDocumentoPersona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
	 *                                       &lt;element name="numDocumentoPersona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
	 *                                       &lt;element name="primerNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
	 *                                       &lt;element name="segundoNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
	 *                                       &lt;element name="primerApellido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
	 *                                       &lt;element name="segundoApellido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
	 *                                       &lt;element name="razonSocial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
	 *                                       &lt;element name="rolInterviniente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
	 *                                       &lt;element name="tipoParteInteresada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
	 *                                     &lt;/sequence>
	 *                                   &lt;/restriction>
	 *                                 &lt;/complexContent>
	 *                               &lt;/complexType>
	 *                             &lt;/element>
	 *                           &lt;/sequence>
	 *                         &lt;/restriction>
	 *                       &lt;/complexContent>
	 *                     &lt;/complexType>
	 *                   &lt;/element>
	 *                 &lt;/sequence>
	 *               &lt;/restriction>
	 *             &lt;/complexContent>
	 *           &lt;/complexType>
	 *         &lt;/element>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = {
			"derecho"
	})
	public static class ListaDerechos {

		@XmlElement(name = "derecho",namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/RRRMatriculas/consultarRRRMatriculas/v1")    	   
		protected List<TipoSalidaConsultarRRRMatriculas.ListaDerechos.Derecho> derecho;

		/**
		 * Gets the value of the derecho property.
		 * 
		 * <p>
		 * This accessor method returns a reference to the live list,
		 * not a snapshot. Therefore any modification you make to the
		 * returned list will be present inside the JAXB object.
		 * This is why there is not a <CODE>set</CODE> method for the derecho property.
		 * 
		 * <p>
		 * For example, to add a new item, do as follows:
		 * <pre>
		 *    getDerecho().add(newItem);
		 * </pre>
		 * 
		 * 
		 * <p>
		 * Objects of the following type(s) are allowed in the list
		 * {@link TipoSalidaConsultarRRRMatriculas.ListaDerechos.Derecho }
		 * 
		 * 
		 */
		public List<TipoSalidaConsultarRRRMatriculas.ListaDerechos.Derecho> getDerecho() {
			if (derecho == null) {
				derecho = new ArrayList<TipoSalidaConsultarRRRMatriculas.ListaDerechos.Derecho>();
			}
			return this.derecho;
		}


		/**
		 * <p>Clase Java para anonymous complex type.
		 * 
		 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
		 * 
		 * <pre>
		 * &lt;complexType>
		 *   &lt;complexContent>
		 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *       &lt;sequence>
		 *         &lt;element name="numAnotacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
		 *         &lt;element name="comentario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
		 *         &lt;element name="fechaAnotacion" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
		 *         &lt;element name="codNaturalezaJuridicaFolio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
		 *         &lt;element name="nomNaturalezaJuridicaFolio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
		 *         &lt;element name="dominioDRR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
		 *         &lt;element name="intervinientes" minOccurs="0">
		 *           &lt;complexType>
		 *             &lt;complexContent>
		 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *                 &lt;sequence>
		 *                   &lt;element name="interviniente" maxOccurs="unbounded" minOccurs="0">
		 *                     &lt;complexType>
		 *                       &lt;complexContent>
		 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *                           &lt;sequence>
		 *                             &lt;element name="tipoDocumentoPersona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
		 *                             &lt;element name="numDocumentoPersona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
		 *                             &lt;element name="primerNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
		 *                             &lt;element name="segundoNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
		 *                             &lt;element name="primerApellido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
		 *                             &lt;element name="segundoApellido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
		 *                             &lt;element name="razonSocial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
		 *                             &lt;element name="rolInterviniente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
		 *                             &lt;element name="tipoParteInteresada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
		 *                           &lt;/sequence>
		 *                         &lt;/restriction>
		 *                       &lt;/complexContent>
		 *                     &lt;/complexType>
		 *                   &lt;/element>
		 *                 &lt;/sequence>
		 *               &lt;/restriction>
		 *             &lt;/complexContent>
		 *           &lt;/complexType>
		 *         &lt;/element>
		 *       &lt;/sequence>
		 *     &lt;/restriction>
		 *   &lt;/complexContent>
		 * &lt;/complexType>
		 * </pre>
		 * 
		 * 
		 */
		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "", propOrder = {
				"numAnotacion",
				"comentario",
				"fechaAnotacion",
				"codNaturalezaJuridicaFolio",
				"nomNaturalezaJuridicaFolio",
				"dominioDRR",
				"intervinientes"
		})
		public static class Derecho {

			@XmlElement(name = "numAnotacion",namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/RRRMatriculas/consultarRRRMatriculas/v1")    	
			protected String numAnotacion;
			@XmlElement(name = "comentario",namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/RRRMatriculas/consultarRRRMatriculas/v1")   
			protected String comentario;
			@XmlSchemaType(name = "dateTime")
			@XmlElement(name = "fechaAnotacion",namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/RRRMatriculas/consultarRRRMatriculas/v1")   
			protected XMLGregorianCalendar fechaAnotacion;
			@XmlElement(name = "codNaturalezaJuridicaFolio",namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/RRRMatriculas/consultarRRRMatriculas/v1")   
			protected String codNaturalezaJuridicaFolio;
			@XmlElement(name = "nomNaturalezaJuridicaFolio",namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/RRRMatriculas/consultarRRRMatriculas/v1")   
			protected String nomNaturalezaJuridicaFolio;
			@XmlElement(name = "dominioDRR",namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/RRRMatriculas/consultarRRRMatriculas/v1")   
			protected String dominioDRR;
			@XmlElement(name = "intervinientes",namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/RRRMatriculas/consultarRRRMatriculas/v1")   
			protected TipoSalidaConsultarRRRMatriculas.ListaDerechos.Derecho.Intervinientes intervinientes;

			/**
			 * Obtiene el valor de la propiedad numAnotacion.
			 * 
			 * @return
			 *     possible object is
			 *     {@link String }
			 *     
			 */
			public String getNumAnotacion() {
				return numAnotacion;
			}

			/**
			 * Define el valor de la propiedad numAnotacion.
			 * 
			 * @param value
			 *     allowed object is
			 *     {@link String }
			 *     
			 */
			public void setNumAnotacion(String value) {
				this.numAnotacion = value;
			}

			/**
			 * Obtiene el valor de la propiedad comentario.
			 * 
			 * @return
			 *     possible object is
			 *     {@link String }
			 *     
			 */
			public String getComentario() {
				return comentario;
			}

			/**
			 * Define el valor de la propiedad comentario.
			 * 
			 * @param value
			 *     allowed object is
			 *     {@link String }
			 *     
			 */
			public void setComentario(String value) {
				this.comentario = value;
			}

			/**
			 * Obtiene el valor de la propiedad fechaAnotacion.
			 * 
			 * @return
			 *     possible object is
			 *     {@link XMLGregorianCalendar }
			 *     
			 */
			public XMLGregorianCalendar getFechaAnotacion() {
				return fechaAnotacion;
			}

			/**
			 * Define el valor de la propiedad fechaAnotacion.
			 * 
			 * @param value
			 *     allowed object is
			 *     {@link XMLGregorianCalendar }
			 *     
			 */
			public void setFechaAnotacion(XMLGregorianCalendar value) {
				this.fechaAnotacion = value;
			}

			/**
			 * Obtiene el valor de la propiedad codNaturalezaJuridicaFolio.
			 * 
			 * @return
			 *     possible object is
			 *     {@link String }
			 *     
			 */
			public String getCodNaturalezaJuridicaFolio() {
				return codNaturalezaJuridicaFolio;
			}

			/**
			 * Define el valor de la propiedad codNaturalezaJuridicaFolio.
			 * 
			 * @param value
			 *     allowed object is
			 *     {@link String }
			 *     
			 */
			public void setCodNaturalezaJuridicaFolio(String value) {
				this.codNaturalezaJuridicaFolio = value;
			}

			/**
			 * Obtiene el valor de la propiedad nomNaturalezaJuridicaFolio.
			 * 
			 * @return
			 *     possible object is
			 *     {@link String }
			 *     
			 */
			public String getNomNaturalezaJuridicaFolio() {
				return nomNaturalezaJuridicaFolio;
			}

			/**
			 * Define el valor de la propiedad nomNaturalezaJuridicaFolio.
			 * 
			 * @param value
			 *     allowed object is
			 *     {@link String }
			 *     
			 */
			public void setNomNaturalezaJuridicaFolio(String value) {
				this.nomNaturalezaJuridicaFolio = value;
			}

			/**
			 * Obtiene el valor de la propiedad dominioDRR.
			 * 
			 * @return
			 *     possible object is
			 *     {@link String }
			 *     
			 */
			public String getDominioDRR() {
				return dominioDRR;
			}

			/**
			 * Define el valor de la propiedad dominioDRR.
			 * 
			 * @param value
			 *     allowed object is
			 *     {@link String }
			 *     
			 */
			public void setDominioDRR(String value) {
				this.dominioDRR = value;
			}

			/**
			 * Obtiene el valor de la propiedad intervinientes.
			 * 
			 * @return
			 *     possible object is
			 *     {@link TipoSalidaConsultarRRRMatriculas.ListaDerechos.Derecho.Intervinientes }
			 *     
			 */
			public TipoSalidaConsultarRRRMatriculas.ListaDerechos.Derecho.Intervinientes getIntervinientes() {
				return intervinientes;
			}

			/**
			 * Define el valor de la propiedad intervinientes.
			 * 
			 * @param value
			 *     allowed object is
			 *     {@link TipoSalidaConsultarRRRMatriculas.ListaDerechos.Derecho.Intervinientes }
			 *     
			 */
			public void setIntervinientes(TipoSalidaConsultarRRRMatriculas.ListaDerechos.Derecho.Intervinientes value) {
				this.intervinientes = value;
			}


			/**
			 * <p>Clase Java para anonymous complex type.
			 * 
			 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
			 * 
			 * <pre>
			 * &lt;complexType>
			 *   &lt;complexContent>
			 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
			 *       &lt;sequence>
			 *         &lt;element name="interviniente" maxOccurs="unbounded" minOccurs="0">
			 *           &lt;complexType>
			 *             &lt;complexContent>
			 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
			 *                 &lt;sequence>
			 *                   &lt;element name="tipoDocumentoPersona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
			 *                   &lt;element name="numDocumentoPersona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
			 *                   &lt;element name="primerNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
			 *                   &lt;element name="segundoNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
			 *                   &lt;element name="primerApellido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
			 *                   &lt;element name="segundoApellido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
			 *                   &lt;element name="razonSocial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
			 *                   &lt;element name="rolInterviniente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
			 *                   &lt;element name="tipoParteInteresada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
			 *                 &lt;/sequence>
			 *               &lt;/restriction>
			 *             &lt;/complexContent>
			 *           &lt;/complexType>
			 *         &lt;/element>
			 *       &lt;/sequence>
			 *     &lt;/restriction>
			 *   &lt;/complexContent>
			 * &lt;/complexType>
			 * </pre>
			 * 
			 * 
			 */
			@XmlAccessorType(XmlAccessType.FIELD)
			@XmlType(name = "", propOrder = {
					"interviniente"
			})
			public static class Intervinientes {

				@XmlElement(name = "interviniente",namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/RRRMatriculas/consultarRRRMatriculas/v1")   
				protected List<TipoSalidaConsultarRRRMatriculas.ListaDerechos.Derecho.Intervinientes.Interviniente> interviniente;

				/**
				 * Gets the value of the interviniente property.
				 * 
				 * <p>
				 * This accessor method returns a reference to the live list,
				 * not a snapshot. Therefore any modification you make to the
				 * returned list will be present inside the JAXB object.
				 * This is why there is not a <CODE>set</CODE> method for the interviniente property.
				 * 
				 * <p>
				 * For example, to add a new item, do as follows:
				 * <pre>
				 *    getInterviniente().add(newItem);
				 * </pre>
				 * 
				 * 
				 * <p>
				 * Objects of the following type(s) are allowed in the list
				 * {@link TipoSalidaConsultarRRRMatriculas.ListaDerechos.Derecho.Intervinientes.Interviniente }
				 * 
				 * 
				 */
				public List<TipoSalidaConsultarRRRMatriculas.ListaDerechos.Derecho.Intervinientes.Interviniente> getInterviniente() {
					if (interviniente == null) {
						interviniente = new ArrayList<TipoSalidaConsultarRRRMatriculas.ListaDerechos.Derecho.Intervinientes.Interviniente>();
					}
					return this.interviniente;
				}


				/**
				 * <p>Clase Java para anonymous complex type.
				 * 
				 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
				 * 
				 * <pre>
				 * &lt;complexType>
				 *   &lt;complexContent>
				 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
				 *       &lt;sequence>
				 *         &lt;element name="tipoDocumentoPersona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
				 *         &lt;element name="numDocumentoPersona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
				 *         &lt;element name="primerNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
				 *         &lt;element name="segundoNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
				 *         &lt;element name="primerApellido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
				 *         &lt;element name="segundoApellido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
				 *         &lt;element name="razonSocial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
				 *         &lt;element name="rolInterviniente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
				 *         &lt;element name="tipoParteInteresada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
				 *       &lt;/sequence>
				 *     &lt;/restriction>
				 *   &lt;/complexContent>
				 * &lt;/complexType>
				 * </pre>
				 * 
				 * 
				 */
				@XmlAccessorType(XmlAccessType.FIELD)
				@XmlType(name = "", propOrder = {
						"tipoDocumentoPersona",
						"numDocumentoPersona",
						"primerNombre",
						"segundoNombre",
						"primerApellido",
						"segundoApellido",
						"razonSocial",
						"rolInterviniente",
						"tipoParteInteresada"
				})
				public static class Interviniente {

					@XmlElement(name = "tipoDocumentoPersona",namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/RRRMatriculas/consultarRRRMatriculas/v1")   
					protected String tipoDocumentoPersona;
					@XmlElement(name = "numDocumentoPersona",namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/RRRMatriculas/consultarRRRMatriculas/v1")
					protected String numDocumentoPersona;
					@XmlElement(name = "primerNombre",namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/RRRMatriculas/consultarRRRMatriculas/v1")
					protected String primerNombre;
					@XmlElement(name = "segundoNombre",namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/RRRMatriculas/consultarRRRMatriculas/v1")
					protected String segundoNombre;
					@XmlElement(name = "primerApellido",namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/RRRMatriculas/consultarRRRMatriculas/v1")
					protected String primerApellido;
					@XmlElement(name = "segundoApellido",namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/RRRMatriculas/consultarRRRMatriculas/v1")
					protected String segundoApellido;
					@XmlElement(name = "razonSocial",namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/RRRMatriculas/consultarRRRMatriculas/v1")
					protected String razonSocial;
					@XmlElement(name = "rolInterviniente",namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/RRRMatriculas/consultarRRRMatriculas/v1")
					protected String rolInterviniente;
					@XmlElement(name = "tipoParteInteresada",namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/RRRMatriculas/consultarRRRMatriculas/v1")
					protected String tipoParteInteresada;

					/**
					 * Obtiene el valor de la propiedad tipoDocumentoPersona.
					 * 
					 * @return
					 *     possible object is
					 *     {@link String }
					 *     
					 */
					public String getTipoDocumentoPersona() {
						return tipoDocumentoPersona;
					}

					/**
					 * Define el valor de la propiedad tipoDocumentoPersona.
					 * 
					 * @param value
					 *     allowed object is
					 *     {@link String }
					 *     
					 */
					public void setTipoDocumentoPersona(String value) {
						this.tipoDocumentoPersona = value;
					}

					/**
					 * Obtiene el valor de la propiedad numDocumentoPersona.
					 * 
					 * @return
					 *     possible object is
					 *     {@link String }
					 *     
					 */
					public String getNumDocumentoPersona() {
						return numDocumentoPersona;
					}

					/**
					 * Define el valor de la propiedad numDocumentoPersona.
					 * 
					 * @param value
					 *     allowed object is
					 *     {@link String }
					 *     
					 */
					public void setNumDocumentoPersona(String value) {
						this.numDocumentoPersona = value;
					}

					/**
					 * Obtiene el valor de la propiedad primerNombre.
					 * 
					 * @return
					 *     possible object is
					 *     {@link String }
					 *     
					 */
					public String getPrimerNombre() {
						return primerNombre;
					}

					/**
					 * Define el valor de la propiedad primerNombre.
					 * 
					 * @param value
					 *     allowed object is
					 *     {@link String }
					 *     
					 */
					public void setPrimerNombre(String value) {
						this.primerNombre = value;
					}

					/**
					 * Obtiene el valor de la propiedad segundoNombre.
					 * 
					 * @return
					 *     possible object is
					 *     {@link String }
					 *     
					 */
					public String getSegundoNombre() {
						return segundoNombre;
					}

					/**
					 * Define el valor de la propiedad segundoNombre.
					 * 
					 * @param value
					 *     allowed object is
					 *     {@link String }
					 *     
					 */
					public void setSegundoNombre(String value) {
						this.segundoNombre = value;
					}

					/**
					 * Obtiene el valor de la propiedad primerApellido.
					 * 
					 * @return
					 *     possible object is
					 *     {@link String }
					 *     
					 */
					public String getPrimerApellido() {
						return primerApellido;
					}

					/**
					 * Define el valor de la propiedad primerApellido.
					 * 
					 * @param value
					 *     allowed object is
					 *     {@link String }
					 *     
					 */
					public void setPrimerApellido(String value) {
						this.primerApellido = value;
					}

					/**
					 * Obtiene el valor de la propiedad segundoApellido.
					 * 
					 * @return
					 *     possible object is
					 *     {@link String }
					 *     
					 */
					public String getSegundoApellido() {
						return segundoApellido;
					}

					/**
					 * Define el valor de la propiedad segundoApellido.
					 * 
					 * @param value
					 *     allowed object is
					 *     {@link String }
					 *     
					 */
					public void setSegundoApellido(String value) {
						this.segundoApellido = value;
					}

					/**
					 * Obtiene el valor de la propiedad razonSocial.
					 * 
					 * @return
					 *     possible object is
					 *     {@link String }
					 *     
					 */
					public String getRazonSocial() {
						return razonSocial;
					}

					/**
					 * Define el valor de la propiedad razonSocial.
					 * 
					 * @param value
					 *     allowed object is
					 *     {@link String }
					 *     
					 */
					public void setRazonSocial(String value) {
						this.razonSocial = value;
					}

					/**
					 * Obtiene el valor de la propiedad rolInterviniente.
					 * 
					 * @return
					 *     possible object is
					 *     {@link String }
					 *     
					 */
					public String getRolInterviniente() {
						return rolInterviniente;
					}

					/**
					 * Define el valor de la propiedad rolInterviniente.
					 * 
					 * @param value
					 *     allowed object is
					 *     {@link String }
					 *     
					 */
					public void setRolInterviniente(String value) {
						this.rolInterviniente = value;
					}

					/**
					 * Obtiene el valor de la propiedad tipoParteInteresada.
					 * 
					 * @return
					 *     possible object is
					 *     {@link String }
					 *     
					 */
					public String getTipoParteInteresada() {
						return tipoParteInteresada;
					}

					/**
					 * Define el valor de la propiedad tipoParteInteresada.
					 * 
					 * @param value
					 *     allowed object is
					 *     {@link String }
					 *     
					 */
					public void setTipoParteInteresada(String value) {
						this.tipoParteInteresada = value;
					}

				}

			}

		}

	}


	/**
	 * <p>Clase Java para anonymous complex type.
	 * 
	 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="hipoteca" maxOccurs="unbounded" minOccurs="0">
	 *           &lt;complexType>
	 *             &lt;complexContent>
	 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                 &lt;sequence>
	 *                   &lt;element name="numAnotacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
	 *                   &lt;element name="comentario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
	 *                   &lt;element name="fechaAnotacion" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
	 *                   &lt;element name="codNaturalezaJuridicaFolio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
	 *                   &lt;element name="nomNaturalezaJuridicaFolio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
	 *                   &lt;element name="dominioDRR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
	 *                   &lt;element name="intervinientes" minOccurs="0">
	 *                     &lt;complexType>
	 *                       &lt;complexContent>
	 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                           &lt;sequence>
	 *                             &lt;element name="interviniente" maxOccurs="unbounded" minOccurs="0">
	 *                               &lt;complexType>
	 *                                 &lt;complexContent>
	 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                                     &lt;sequence>
	 *                                       &lt;element name="tipoDocumentoPersona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
	 *                                       &lt;element name="numDocumentoPersona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
	 *                                       &lt;element name="primerNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
	 *                                       &lt;element name="segundoNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
	 *                                       &lt;element name="primerApellido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
	 *                                       &lt;element name="segundoApellido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
	 *                                       &lt;element name="razonSocial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
	 *                                       &lt;element name="rolInterviniente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
	 *                                       &lt;element name="tipoParteInteresada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
	 *                                     &lt;/sequence>
	 *                                   &lt;/restriction>
	 *                                 &lt;/complexContent>
	 *                               &lt;/complexType>
	 *                             &lt;/element>
	 *                           &lt;/sequence>
	 *                         &lt;/restriction>
	 *                       &lt;/complexContent>
	 *                     &lt;/complexType>
	 *                   &lt;/element>
	 *                 &lt;/sequence>
	 *               &lt;/restriction>
	 *             &lt;/complexContent>
	 *           &lt;/complexType>
	 *         &lt;/element>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = {
			"hipoteca"
	})
	public static class ListaHipotecas {

		@XmlElement(name = "hipoteca", required = true, namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/RRRMatriculas/consultarRRRMatriculas/v1")
		protected List<TipoSalidaConsultarRRRMatriculas.ListaHipotecas.Hipoteca> hipoteca;

		/**
		 * Gets the value of the hipoteca property.
		 * 
		 * <p>
		 * This accessor method returns a reference to the live list,
		 * not a snapshot. Therefore any modification you make to the
		 * returned list will be present inside the JAXB object.
		 * This is why there is not a <CODE>set</CODE> method for the hipoteca property.
		 * 
		 * <p>
		 * For example, to add a new item, do as follows:
		 * <pre>
		 *    getHipoteca().add(newItem);
		 * </pre>
		 * 
		 * 
		 * <p>
		 * Objects of the following type(s) are allowed in the list
		 * {@link TipoSalidaConsultarRRRMatriculas.ListaHipotecas.Hipoteca }
		 * 
		 * 
		 */
		public List<TipoSalidaConsultarRRRMatriculas.ListaHipotecas.Hipoteca> getHipoteca() {
			if (hipoteca == null) {
				hipoteca = new ArrayList<TipoSalidaConsultarRRRMatriculas.ListaHipotecas.Hipoteca>();
			}
			return this.hipoteca;
		}


		/**
		 * <p>Clase Java para anonymous complex type.
		 * 
		 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
		 * 
		 * <pre>
		 * &lt;complexType>
		 *   &lt;complexContent>
		 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *       &lt;sequence>
		 *         &lt;element name="numAnotacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
		 *         &lt;element name="comentario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
		 *         &lt;element name="fechaAnotacion" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
		 *         &lt;element name="codNaturalezaJuridicaFolio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
		 *         &lt;element name="nomNaturalezaJuridicaFolio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
		 *         &lt;element name="dominioDRR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
		 *         &lt;element name="intervinientes" minOccurs="0">
		 *           &lt;complexType>
		 *             &lt;complexContent>
		 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *                 &lt;sequence>
		 *                   &lt;element name="interviniente" maxOccurs="unbounded" minOccurs="0">
		 *                     &lt;complexType>
		 *                       &lt;complexContent>
		 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *                           &lt;sequence>
		 *                             &lt;element name="tipoDocumentoPersona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
		 *                             &lt;element name="numDocumentoPersona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
		 *                             &lt;element name="primerNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
		 *                             &lt;element name="segundoNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
		 *                             &lt;element name="primerApellido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
		 *                             &lt;element name="segundoApellido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
		 *                             &lt;element name="razonSocial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
		 *                             &lt;element name="rolInterviniente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
		 *                             &lt;element name="tipoParteInteresada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
		 *                           &lt;/sequence>
		 *                         &lt;/restriction>
		 *                       &lt;/complexContent>
		 *                     &lt;/complexType>
		 *                   &lt;/element>
		 *                 &lt;/sequence>
		 *               &lt;/restriction>
		 *             &lt;/complexContent>
		 *           &lt;/complexType>
		 *         &lt;/element>
		 *       &lt;/sequence>
		 *     &lt;/restriction>
		 *   &lt;/complexContent>
		 * &lt;/complexType>
		 * </pre>
		 * 
		 * 
		 */
		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "", propOrder = {
				"numAnotacion",
				"comentario",
				"fechaAnotacion",
				"codNaturalezaJuridicaFolio",
				"nomNaturalezaJuridicaFolio",
				"dominioDRR",
				"intervinientes"
		})
		public static class Hipoteca {

			@XmlElement(name = "numAnotacion", required = true, namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/RRRMatriculas/consultarRRRMatriculas/v1")
			protected String numAnotacion;
			@XmlElement(name = "comentario", required = true, namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/RRRMatriculas/consultarRRRMatriculas/v1")
			protected String comentario;
			@XmlSchemaType(name = "dateTime")
			protected XMLGregorianCalendar fechaAnotacion;
			@XmlElement(name = "codNaturalezaJuridicaFolio", required = true, namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/RRRMatriculas/consultarRRRMatriculas/v1")
			protected String codNaturalezaJuridicaFolio;
			@XmlElement(name = "nomNaturalezaJuridicaFolio", required = true, namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/RRRMatriculas/consultarRRRMatriculas/v1")
			protected String nomNaturalezaJuridicaFolio;
			@XmlElement(name = "dominioDRR", required = true, namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/RRRMatriculas/consultarRRRMatriculas/v1")
			protected String dominioDRR;
			@XmlElement(name = "intervinientes", required = true, namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/RRRMatriculas/consultarRRRMatriculas/v1")
			protected TipoSalidaConsultarRRRMatriculas.ListaHipotecas.Hipoteca.Intervinientes intervinientes;

			/**
			 * Obtiene el valor de la propiedad numAnotacion.
			 * 
			 * @return
			 *     possible object is
			 *     {@link String }
			 *     
			 */
			public String getNumAnotacion() {
				return numAnotacion;
			}

			/**
			 * Define el valor de la propiedad numAnotacion.
			 * 
			 * @param value
			 *     allowed object is
			 *     {@link String }
			 *     
			 */
			public void setNumAnotacion(String value) {
				this.numAnotacion = value;
			}

			/**
			 * Obtiene el valor de la propiedad comentario.
			 * 
			 * @return
			 *     possible object is
			 *     {@link String }
			 *     
			 */
			public String getComentario() {
				return comentario;
			}

			/**
			 * Define el valor de la propiedad comentario.
			 * 
			 * @param value
			 *     allowed object is
			 *     {@link String }
			 *     
			 */
			public void setComentario(String value) {
				this.comentario = value;
			}

			/**
			 * Obtiene el valor de la propiedad fechaAnotacion.
			 * 
			 * @return
			 *     possible object is
			 *     {@link XMLGregorianCalendar }
			 *     
			 */
			public XMLGregorianCalendar getFechaAnotacion() {
				return fechaAnotacion;
			}

			/**
			 * Define el valor de la propiedad fechaAnotacion.
			 * 
			 * @param value
			 *     allowed object is
			 *     {@link XMLGregorianCalendar }
			 *     
			 */
			public void setFechaAnotacion(XMLGregorianCalendar value) {
				this.fechaAnotacion = value;
			}

			/**
			 * Obtiene el valor de la propiedad codNaturalezaJuridicaFolio.
			 * 
			 * @return
			 *     possible object is
			 *     {@link String }
			 *     
			 */
			public String getCodNaturalezaJuridicaFolio() {
				return codNaturalezaJuridicaFolio;
			}

			/**
			 * Define el valor de la propiedad codNaturalezaJuridicaFolio.
			 * 
			 * @param value
			 *     allowed object is
			 *     {@link String }
			 *     
			 */
			public void setCodNaturalezaJuridicaFolio(String value) {
				this.codNaturalezaJuridicaFolio = value;
			}

			/**
			 * Obtiene el valor de la propiedad nomNaturalezaJuridicaFolio.
			 * 
			 * @return
			 *     possible object is
			 *     {@link String }
			 *     
			 */
			public String getNomNaturalezaJuridicaFolio() {
				return nomNaturalezaJuridicaFolio;
			}

			/**
			 * Define el valor de la propiedad nomNaturalezaJuridicaFolio.
			 * 
			 * @param value
			 *     allowed object is
			 *     {@link String }
			 *     
			 */
			public void setNomNaturalezaJuridicaFolio(String value) {
				this.nomNaturalezaJuridicaFolio = value;
			}

			/**
			 * Obtiene el valor de la propiedad dominioDRR.
			 * 
			 * @return
			 *     possible object is
			 *     {@link String }
			 *     
			 */
			public String getDominioDRR() {
				return dominioDRR;
			}

			/**
			 * Define el valor de la propiedad dominioDRR.
			 * 
			 * @param value
			 *     allowed object is
			 *     {@link String }
			 *     
			 */
			public void setDominioDRR(String value) {
				this.dominioDRR = value;
			}

			/**
			 * Obtiene el valor de la propiedad intervinientes.
			 * 
			 * @return
			 *     possible object is
			 *     {@link TipoSalidaConsultarRRRMatriculas.ListaHipotecas.Hipoteca.Intervinientes }
			 *     
			 */
			public TipoSalidaConsultarRRRMatriculas.ListaHipotecas.Hipoteca.Intervinientes getIntervinientes() {
				return intervinientes;
			}

			/**
			 * Define el valor de la propiedad intervinientes.
			 * 
			 * @param value
			 *     allowed object is
			 *     {@link TipoSalidaConsultarRRRMatriculas.ListaHipotecas.Hipoteca.Intervinientes }
			 *     
			 */
			public void setIntervinientes(TipoSalidaConsultarRRRMatriculas.ListaHipotecas.Hipoteca.Intervinientes value) {
				this.intervinientes = value;
			}


			/**
			 * <p>Clase Java para anonymous complex type.
			 * 
			 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
			 * 
			 * <pre>
			 * &lt;complexType>
			 *   &lt;complexContent>
			 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
			 *       &lt;sequence>
			 *         &lt;element name="interviniente" maxOccurs="unbounded" minOccurs="0">
			 *           &lt;complexType>
			 *             &lt;complexContent>
			 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
			 *                 &lt;sequence>
			 *                   &lt;element name="tipoDocumentoPersona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
			 *                   &lt;element name="numDocumentoPersona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
			 *                   &lt;element name="primerNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
			 *                   &lt;element name="segundoNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
			 *                   &lt;element name="primerApellido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
			 *                   &lt;element name="segundoApellido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
			 *                   &lt;element name="razonSocial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
			 *                   &lt;element name="rolInterviniente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
			 *                   &lt;element name="tipoParteInteresada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
			 *                 &lt;/sequence>
			 *               &lt;/restriction>
			 *             &lt;/complexContent>
			 *           &lt;/complexType>
			 *         &lt;/element>
			 *       &lt;/sequence>
			 *     &lt;/restriction>
			 *   &lt;/complexContent>
			 * &lt;/complexType>
			 * </pre>
			 * 
			 * 
			 */
			@XmlAccessorType(XmlAccessType.FIELD)
			@XmlType(name = "", propOrder = {
					"interviniente"
			})
			public static class Intervinientes {

				protected List<TipoSalidaConsultarRRRMatriculas.ListaHipotecas.Hipoteca.Intervinientes.Interviniente> interviniente;

				/**
				 * Gets the value of the interviniente property.
				 * 
				 * <p>
				 * This accessor method returns a reference to the live list,
				 * not a snapshot. Therefore any modification you make to the
				 * returned list will be present inside the JAXB object.
				 * This is why there is not a <CODE>set</CODE> method for the interviniente property.
				 * 
				 * <p>
				 * For example, to add a new item, do as follows:
				 * <pre>
				 *    getInterviniente().add(newItem);
				 * </pre>
				 * 
				 * 
				 * <p>
				 * Objects of the following type(s) are allowed in the list
				 * {@link TipoSalidaConsultarRRRMatriculas.ListaHipotecas.Hipoteca.Intervinientes.Interviniente }
				 * 
				 * 
				 */
				public List<TipoSalidaConsultarRRRMatriculas.ListaHipotecas.Hipoteca.Intervinientes.Interviniente> getInterviniente() {
					if (interviniente == null) {
						interviniente = new ArrayList<TipoSalidaConsultarRRRMatriculas.ListaHipotecas.Hipoteca.Intervinientes.Interviniente>();
					}
					return this.interviniente;
				}


				/**
				 * <p>Clase Java para anonymous complex type.
				 * 
				 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
				 * 
				 * <pre>
				 * &lt;complexType>
				 *   &lt;complexContent>
				 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
				 *       &lt;sequence>
				 *         &lt;element name="tipoDocumentoPersona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
				 *         &lt;element name="numDocumentoPersona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
				 *         &lt;element name="primerNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
				 *         &lt;element name="segundoNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
				 *         &lt;element name="primerApellido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
				 *         &lt;element name="segundoApellido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
				 *         &lt;element name="razonSocial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
				 *         &lt;element name="rolInterviniente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
				 *         &lt;element name="tipoParteInteresada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
				 *       &lt;/sequence>
				 *     &lt;/restriction>
				 *   &lt;/complexContent>
				 * &lt;/complexType>
				 * </pre>
				 * 
				 * 
				 */
				@XmlAccessorType(XmlAccessType.FIELD)
				@XmlType(name = "", propOrder = {
						"tipoDocumentoPersona",
						"numDocumentoPersona",
						"primerNombre",
						"segundoNombre",
						"primerApellido",
						"segundoApellido",
						"razonSocial",
						"rolInterviniente",
						"tipoParteInteresada"
				})
				public static class Interviniente {

					@XmlElement(name = "tipoDocumentoPersona",namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/RRRMatriculas/consultarRRRMatriculas/v1")   
					protected String tipoDocumentoPersona;
					@XmlElement(name = "numDocumentoPersona",namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/RRRMatriculas/consultarRRRMatriculas/v1")
					protected String numDocumentoPersona;
					@XmlElement(name = "primerNombre",namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/RRRMatriculas/consultarRRRMatriculas/v1")
					protected String primerNombre;
					@XmlElement(name = "segundoNombre",namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/RRRMatriculas/consultarRRRMatriculas/v1")
					protected String segundoNombre;
					@XmlElement(name = "primerApellido",namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/RRRMatriculas/consultarRRRMatriculas/v1")
					protected String primerApellido;
					@XmlElement(name = "segundoApellido",namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/RRRMatriculas/consultarRRRMatriculas/v1")
					protected String segundoApellido;
					@XmlElement(name = "razonSocial",namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/RRRMatriculas/consultarRRRMatriculas/v1")
					protected String razonSocial;
					@XmlElement(name = "rolInterviniente",namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/RRRMatriculas/consultarRRRMatriculas/v1")
					protected String rolInterviniente;
					@XmlElement(name = "tipoParteInteresada",namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/RRRMatriculas/consultarRRRMatriculas/v1")
					protected String tipoParteInteresada;

					/**
					 * Obtiene el valor de la propiedad tipoDocumentoPersona.
					 * 
					 * @return
					 *     possible object is
					 *     {@link String }
					 *     
					 */
					public String getTipoDocumentoPersona() {
						return tipoDocumentoPersona;
					}

					/**
					 * Define el valor de la propiedad tipoDocumentoPersona.
					 * 
					 * @param value
					 *     allowed object is
					 *     {@link String }
					 *     
					 */
					public void setTipoDocumentoPersona(String value) {
						this.tipoDocumentoPersona = value;
					}

					/**
					 * Obtiene el valor de la propiedad numDocumentoPersona.
					 * 
					 * @return
					 *     possible object is
					 *     {@link String }
					 *     
					 */
					public String getNumDocumentoPersona() {
						return numDocumentoPersona;
					}

					/**
					 * Define el valor de la propiedad numDocumentoPersona.
					 * 
					 * @param value
					 *     allowed object is
					 *     {@link String }
					 *     
					 */
					public void setNumDocumentoPersona(String value) {
						this.numDocumentoPersona = value;
					}

					/**
					 * Obtiene el valor de la propiedad primerNombre.
					 * 
					 * @return
					 *     possible object is
					 *     {@link String }
					 *     
					 */
					public String getPrimerNombre() {
						return primerNombre;
					}

					/**
					 * Define el valor de la propiedad primerNombre.
					 * 
					 * @param value
					 *     allowed object is
					 *     {@link String }
					 *     
					 */
					public void setPrimerNombre(String value) {
						this.primerNombre = value;
					}

					/**
					 * Obtiene el valor de la propiedad segundoNombre.
					 * 
					 * @return
					 *     possible object is
					 *     {@link String }
					 *     
					 */
					public String getSegundoNombre() {
						return segundoNombre;
					}

					/**
					 * Define el valor de la propiedad segundoNombre.
					 * 
					 * @param value
					 *     allowed object is
					 *     {@link String }
					 *     
					 */
					public void setSegundoNombre(String value) {
						this.segundoNombre = value;
					}

					/**
					 * Obtiene el valor de la propiedad primerApellido.
					 * 
					 * @return
					 *     possible object is
					 *     {@link String }
					 *     
					 */
					public String getPrimerApellido() {
						return primerApellido;
					}

					/**
					 * Define el valor de la propiedad primerApellido.
					 * 
					 * @param value
					 *     allowed object is
					 *     {@link String }
					 *     
					 */
					public void setPrimerApellido(String value) {
						this.primerApellido = value;
					}

					/**
					 * Obtiene el valor de la propiedad segundoApellido.
					 * 
					 * @return
					 *     possible object is
					 *     {@link String }
					 *     
					 */
					public String getSegundoApellido() {
						return segundoApellido;
					}

					/**
					 * Define el valor de la propiedad segundoApellido.
					 * 
					 * @param value
					 *     allowed object is
					 *     {@link String }
					 *     
					 */
					public void setSegundoApellido(String value) {
						this.segundoApellido = value;
					}

					/**
					 * Obtiene el valor de la propiedad razonSocial.
					 * 
					 * @return
					 *     possible object is
					 *     {@link String }
					 *     
					 */
					public String getRazonSocial() {
						return razonSocial;
					}

					/**
					 * Define el valor de la propiedad razonSocial.
					 * 
					 * @param value
					 *     allowed object is
					 *     {@link String }
					 *     
					 */
					public void setRazonSocial(String value) {
						this.razonSocial = value;
					}

					/**
					 * Obtiene el valor de la propiedad rolInterviniente.
					 * 
					 * @return
					 *     possible object is
					 *     {@link String }
					 *     
					 */
					public String getRolInterviniente() {
						return rolInterviniente;
					}

					/**
					 * Define el valor de la propiedad rolInterviniente.
					 * 
					 * @param value
					 *     allowed object is
					 *     {@link String }
					 *     
					 */
					public void setRolInterviniente(String value) {
						this.rolInterviniente = value;
					}

					/**
					 * Obtiene el valor de la propiedad tipoParteInteresada.
					 * 
					 * @return
					 *     possible object is
					 *     {@link String }
					 *     
					 */
					public String getTipoParteInteresada() {
						return tipoParteInteresada;
					}

					/**
					 * Define el valor de la propiedad tipoParteInteresada.
					 * 
					 * @param value
					 *     allowed object is
					 *     {@link String }
					 *     
					 */
					public void setTipoParteInteresada(String value) {
						this.tipoParteInteresada = value;
					}

				}

			}

		}

	}


	/**
	 * <p>Clase Java para anonymous complex type.
	 * 
	 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="publicidad" maxOccurs="unbounded" minOccurs="0">
	 *           &lt;complexType>
	 *             &lt;complexContent>
	 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                 &lt;sequence>
	 *                   &lt;element name="numAnotacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
	 *                   &lt;element name="comentario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
	 *                   &lt;element name="fechaAnotacion" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
	 *                   &lt;element name="codNaturalezaJuridicaFolio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
	 *                   &lt;element name="nomNaturalezaJuridicaFolio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
	 *                   &lt;element name="dominioDRR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
	 *                   &lt;element name="intervinientes" minOccurs="0">
	 *                     &lt;complexType>
	 *                       &lt;complexContent>
	 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                           &lt;sequence>
	 *                             &lt;element name="interviniente" maxOccurs="unbounded" minOccurs="0">
	 *                               &lt;complexType>
	 *                                 &lt;complexContent>
	 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                                     &lt;sequence>
	 *                                       &lt;element name="tipoDocumentoPersona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
	 *                                       &lt;element name="numDocumentoPersona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
	 *                                       &lt;element name="primerNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
	 *                                       &lt;element name="segundoNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
	 *                                       &lt;element name="primerApellido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
	 *                                       &lt;element name="segundoApellido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
	 *                                       &lt;element name="razonSocial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
	 *                                       &lt;element name="rolInterviniente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
	 *                                       &lt;element name="tipoParteInteresada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
	 *                                     &lt;/sequence>
	 *                                   &lt;/restriction>
	 *                                 &lt;/complexContent>
	 *                               &lt;/complexType>
	 *                             &lt;/element>
	 *                           &lt;/sequence>
	 *                         &lt;/restriction>
	 *                       &lt;/complexContent>
	 *                     &lt;/complexType>
	 *                   &lt;/element>
	 *                 &lt;/sequence>
	 *               &lt;/restriction>
	 *             &lt;/complexContent>
	 *           &lt;/complexType>
	 *         &lt;/element>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = {
			"publicidad"
	})
	public static class ListaPublicidades {

		@XmlElement(name = "publicidad", required = true, namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/RRRMatriculas/consultarRRRMatriculas/v1")
		protected List<TipoSalidaConsultarRRRMatriculas.ListaPublicidades.Publicidad> publicidad;

		/**
		 * Gets the value of the publicidad property.
		 * 
		 * <p>
		 * This accessor method returns a reference to the live list,
		 * not a snapshot. Therefore any modification you make to the
		 * returned list will be present inside the JAXB object.
		 * This is why there is not a <CODE>set</CODE> method for the publicidad property.
		 * 
		 * <p>
		 * For example, to add a new item, do as follows:
		 * <pre>
		 *    getPublicidad().add(newItem);
		 * </pre>
		 * 
		 * 
		 * <p>
		 * Objects of the following type(s) are allowed in the list
		 * {@link TipoSalidaConsultarRRRMatriculas.ListaPublicidades.Publicidad }
		 * 
		 * 
		 */
		public List<TipoSalidaConsultarRRRMatriculas.ListaPublicidades.Publicidad> getPublicidad() {
			if (publicidad == null) {
				publicidad = new ArrayList<TipoSalidaConsultarRRRMatriculas.ListaPublicidades.Publicidad>();
			}
			return this.publicidad;
		}


		/**
		 * <p>Clase Java para anonymous complex type.
		 * 
		 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
		 * 
		 * <pre>
		 * &lt;complexType>
		 *   &lt;complexContent>
		 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *       &lt;sequence>
		 *         &lt;element name="numAnotacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
		 *         &lt;element name="comentario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
		 *         &lt;element name="fechaAnotacion" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
		 *         &lt;element name="codNaturalezaJuridicaFolio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
		 *         &lt;element name="nomNaturalezaJuridicaFolio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
		 *         &lt;element name="dominioDRR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
		 *         &lt;element name="intervinientes" minOccurs="0">
		 *           &lt;complexType>
		 *             &lt;complexContent>
		 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *                 &lt;sequence>
		 *                   &lt;element name="interviniente" maxOccurs="unbounded" minOccurs="0">
		 *                     &lt;complexType>
		 *                       &lt;complexContent>
		 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *                           &lt;sequence>
		 *                             &lt;element name="tipoDocumentoPersona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
		 *                             &lt;element name="numDocumentoPersona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
		 *                             &lt;element name="primerNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
		 *                             &lt;element name="segundoNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
		 *                             &lt;element name="primerApellido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
		 *                             &lt;element name="segundoApellido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
		 *                             &lt;element name="razonSocial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
		 *                             &lt;element name="rolInterviniente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
		 *                             &lt;element name="tipoParteInteresada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
		 *                           &lt;/sequence>
		 *                         &lt;/restriction>
		 *                       &lt;/complexContent>
		 *                     &lt;/complexType>
		 *                   &lt;/element>
		 *                 &lt;/sequence>
		 *               &lt;/restriction>
		 *             &lt;/complexContent>
		 *           &lt;/complexType>
		 *         &lt;/element>
		 *       &lt;/sequence>
		 *     &lt;/restriction>
		 *   &lt;/complexContent>
		 * &lt;/complexType>
		 * </pre>
		 * 
		 * 
		 */
		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "", propOrder = {
				"numAnotacion",
				"comentario",
				"fechaAnotacion",
				"codNaturalezaJuridicaFolio",
				"nomNaturalezaJuridicaFolio",
				"dominioDRR",
				"intervinientes"
		})
		public static class Publicidad {

			@XmlElement(name = "numAnotacion", required = true, namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/RRRMatriculas/consultarRRRMatriculas/v1")
			protected String numAnotacion;
			@XmlElement(name = "comentario", required = true, namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/RRRMatriculas/consultarRRRMatriculas/v1")
			protected String comentario;
			@XmlSchemaType(name = "dateTime")
			protected XMLGregorianCalendar fechaAnotacion;
			@XmlElement(name = "codNaturalezaJuridicaFolio", required = true, namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/RRRMatriculas/consultarRRRMatriculas/v1")
			protected String codNaturalezaJuridicaFolio;
			@XmlElement(name = "nomNaturalezaJuridicaFolio", required = true, namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/RRRMatriculas/consultarRRRMatriculas/v1")
			protected String nomNaturalezaJuridicaFolio;
			@XmlElement(name = "dominioDRR", required = true, namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/RRRMatriculas/consultarRRRMatriculas/v1")
			protected String dominioDRR;
			@XmlElement(name = "intervinientes", required = true, namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/RRRMatriculas/consultarRRRMatriculas/v1")
			protected TipoSalidaConsultarRRRMatriculas.ListaPublicidades.Publicidad.Intervinientes intervinientes;

			/**
			 * Obtiene el valor de la propiedad numAnotacion.
			 * 
			 * @return
			 *     possible object is
			 *     {@link String }
			 *     
			 */
			public String getNumAnotacion() {
				return numAnotacion;
			}

			/**
			 * Define el valor de la propiedad numAnotacion.
			 * 
			 * @param value
			 *     allowed object is
			 *     {@link String }
			 *     
			 */
			public void setNumAnotacion(String value) {
				this.numAnotacion = value;
			}

			/**
			 * Obtiene el valor de la propiedad comentario.
			 * 
			 * @return
			 *     possible object is
			 *     {@link String }
			 *     
			 */
			public String getComentario() {
				return comentario;
			}

			/**
			 * Define el valor de la propiedad comentario.
			 * 
			 * @param value
			 *     allowed object is
			 *     {@link String }
			 *     
			 */
			public void setComentario(String value) {
				this.comentario = value;
			}

			/**
			 * Obtiene el valor de la propiedad fechaAnotacion.
			 * 
			 * @return
			 *     possible object is
			 *     {@link XMLGregorianCalendar }
			 *     
			 */
			public XMLGregorianCalendar getFechaAnotacion() {
				return fechaAnotacion;
			}

			/**
			 * Define el valor de la propiedad fechaAnotacion.
			 * 
			 * @param value
			 *     allowed object is
			 *     {@link XMLGregorianCalendar }
			 *     
			 */
			public void setFechaAnotacion(XMLGregorianCalendar value) {
				this.fechaAnotacion = value;
			}

			/**
			 * Obtiene el valor de la propiedad codNaturalezaJuridicaFolio.
			 * 
			 * @return
			 *     possible object is
			 *     {@link String }
			 *     
			 */
			public String getCodNaturalezaJuridicaFolio() {
				return codNaturalezaJuridicaFolio;
			}

			/**
			 * Define el valor de la propiedad codNaturalezaJuridicaFolio.
			 * 
			 * @param value
			 *     allowed object is
			 *     {@link String }
			 *     
			 */
			public void setCodNaturalezaJuridicaFolio(String value) {
				this.codNaturalezaJuridicaFolio = value;
			}

			/**
			 * Obtiene el valor de la propiedad nomNaturalezaJuridicaFolio.
			 * 
			 * @return
			 *     possible object is
			 *     {@link String }
			 *     
			 */
			public String getNomNaturalezaJuridicaFolio() {
				return nomNaturalezaJuridicaFolio;
			}

			/**
			 * Define el valor de la propiedad nomNaturalezaJuridicaFolio.
			 * 
			 * @param value
			 *     allowed object is
			 *     {@link String }
			 *     
			 */
			public void setNomNaturalezaJuridicaFolio(String value) {
				this.nomNaturalezaJuridicaFolio = value;
			}

			/**
			 * Obtiene el valor de la propiedad dominioDRR.
			 * 
			 * @return
			 *     possible object is
			 *     {@link String }
			 *     
			 */
			public String getDominioDRR() {
				return dominioDRR;
			}

			/**
			 * Define el valor de la propiedad dominioDRR.
			 * 
			 * @param value
			 *     allowed object is
			 *     {@link String }
			 *     
			 */
			public void setDominioDRR(String value) {
				this.dominioDRR = value;
			}

			/**
			 * Obtiene el valor de la propiedad intervinientes.
			 * 
			 * @return
			 *     possible object is
			 *     {@link TipoSalidaConsultarRRRMatriculas.ListaPublicidades.Publicidad.Intervinientes }
			 *     
			 */
			public TipoSalidaConsultarRRRMatriculas.ListaPublicidades.Publicidad.Intervinientes getIntervinientes() {
				return intervinientes;
			}

			/**
			 * Define el valor de la propiedad intervinientes.
			 * 
			 * @param value
			 *     allowed object is
			 *     {@link TipoSalidaConsultarRRRMatriculas.ListaPublicidades.Publicidad.Intervinientes }
			 *     
			 */
			public void setIntervinientes(TipoSalidaConsultarRRRMatriculas.ListaPublicidades.Publicidad.Intervinientes value) {
				this.intervinientes = value;
			}


			/**
			 * <p>Clase Java para anonymous complex type.
			 * 
			 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
			 * 
			 * <pre>
			 * &lt;complexType>
			 *   &lt;complexContent>
			 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
			 *       &lt;sequence>
			 *         &lt;element name="interviniente" maxOccurs="unbounded" minOccurs="0">
			 *           &lt;complexType>
			 *             &lt;complexContent>
			 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
			 *                 &lt;sequence>
			 *                   &lt;element name="tipoDocumentoPersona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
			 *                   &lt;element name="numDocumentoPersona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
			 *                   &lt;element name="primerNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
			 *                   &lt;element name="segundoNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
			 *                   &lt;element name="primerApellido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
			 *                   &lt;element name="segundoApellido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
			 *                   &lt;element name="razonSocial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
			 *                   &lt;element name="rolInterviniente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
			 *                   &lt;element name="tipoParteInteresada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
			 *                 &lt;/sequence>
			 *               &lt;/restriction>
			 *             &lt;/complexContent>
			 *           &lt;/complexType>
			 *         &lt;/element>
			 *       &lt;/sequence>
			 *     &lt;/restriction>
			 *   &lt;/complexContent>
			 * &lt;/complexType>
			 * </pre>
			 * 
			 * 
			 */
			@XmlAccessorType(XmlAccessType.FIELD)
			@XmlType(name = "", propOrder = {
					"interviniente"
			})
			public static class Intervinientes {

				protected List<TipoSalidaConsultarRRRMatriculas.ListaPublicidades.Publicidad.Intervinientes.Interviniente> interviniente;

				/**
				 * Gets the value of the interviniente property.
				 * 
				 * <p>
				 * This accessor method returns a reference to the live list,
				 * not a snapshot. Therefore any modification you make to the
				 * returned list will be present inside the JAXB object.
				 * This is why there is not a <CODE>set</CODE> method for the interviniente property.
				 * 
				 * <p>
				 * For example, to add a new item, do as follows:
				 * <pre>
				 *    getInterviniente().add(newItem);
				 * </pre>
				 * 
				 * 
				 * <p>
				 * Objects of the following type(s) are allowed in the list
				 * {@link TipoSalidaConsultarRRRMatriculas.ListaPublicidades.Publicidad.Intervinientes.Interviniente }
				 * 
				 * 
				 */
				public List<TipoSalidaConsultarRRRMatriculas.ListaPublicidades.Publicidad.Intervinientes.Interviniente> getInterviniente() {
					if (interviniente == null) {
						interviniente = new ArrayList<TipoSalidaConsultarRRRMatriculas.ListaPublicidades.Publicidad.Intervinientes.Interviniente>();
					}
					return this.interviniente;
				}


				/**
				 * <p>Clase Java para anonymous complex type.
				 * 
				 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
				 * 
				 * <pre>
				 * &lt;complexType>
				 *   &lt;complexContent>
				 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
				 *       &lt;sequence>
				 *         &lt;element name="tipoDocumentoPersona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
				 *         &lt;element name="numDocumentoPersona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
				 *         &lt;element name="primerNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
				 *         &lt;element name="segundoNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
				 *         &lt;element name="primerApellido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
				 *         &lt;element name="segundoApellido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
				 *         &lt;element name="razonSocial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
				 *         &lt;element name="rolInterviniente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
				 *         &lt;element name="tipoParteInteresada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
				 *       &lt;/sequence>
				 *     &lt;/restriction>
				 *   &lt;/complexContent>
				 * &lt;/complexType>
				 * </pre>
				 * 
				 * 
				 */
				@XmlAccessorType(XmlAccessType.FIELD)
				@XmlType(name = "", propOrder = {
						"tipoDocumentoPersona",
						"numDocumentoPersona",
						"primerNombre",
						"segundoNombre",
						"primerApellido",
						"segundoApellido",
						"razonSocial",
						"rolInterviniente",
						"tipoParteInteresada"
				})
				public static class Interviniente {

					@XmlElement(name = "tipoDocumentoPersona",namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/RRRMatriculas/consultarRRRMatriculas/v1")   
					protected String tipoDocumentoPersona;
					@XmlElement(name = "numDocumentoPersona",namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/RRRMatriculas/consultarRRRMatriculas/v1")
					protected String numDocumentoPersona;
					@XmlElement(name = "primerNombre",namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/RRRMatriculas/consultarRRRMatriculas/v1")
					protected String primerNombre;
					@XmlElement(name = "segundoNombre",namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/RRRMatriculas/consultarRRRMatriculas/v1")
					protected String segundoNombre;
					@XmlElement(name = "primerApellido",namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/RRRMatriculas/consultarRRRMatriculas/v1")
					protected String primerApellido;
					@XmlElement(name = "segundoApellido",namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/RRRMatriculas/consultarRRRMatriculas/v1")
					protected String segundoApellido;
					@XmlElement(name = "razonSocial",namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/RRRMatriculas/consultarRRRMatriculas/v1")
					protected String razonSocial;
					@XmlElement(name = "rolInterviniente",namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/RRRMatriculas/consultarRRRMatriculas/v1")
					protected String rolInterviniente;
					@XmlElement(name = "tipoParteInteresada",namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/RRRMatriculas/consultarRRRMatriculas/v1")
					protected String tipoParteInteresada;

					/**
					 * Obtiene el valor de la propiedad tipoDocumentoPersona.
					 * 
					 * @return
					 *     possible object is
					 *     {@link String }
					 *     
					 */
					public String getTipoDocumentoPersona() {
						return tipoDocumentoPersona;
					}

					/**
					 * Define el valor de la propiedad tipoDocumentoPersona.
					 * 
					 * @param value
					 *     allowed object is
					 *     {@link String }
					 *     
					 */
					public void setTipoDocumentoPersona(String value) {
						this.tipoDocumentoPersona = value;
					}

					/**
					 * Obtiene el valor de la propiedad numDocumentoPersona.
					 * 
					 * @return
					 *     possible object is
					 *     {@link String }
					 *     
					 */
					public String getNumDocumentoPersona() {
						return numDocumentoPersona;
					}

					/**
					 * Define el valor de la propiedad numDocumentoPersona.
					 * 
					 * @param value
					 *     allowed object is
					 *     {@link String }
					 *     
					 */
					public void setNumDocumentoPersona(String value) {
						this.numDocumentoPersona = value;
					}

					/**
					 * Obtiene el valor de la propiedad primerNombre.
					 * 
					 * @return
					 *     possible object is
					 *     {@link String }
					 *     
					 */
					public String getPrimerNombre() {
						return primerNombre;
					}

					/**
					 * Define el valor de la propiedad primerNombre.
					 * 
					 * @param value
					 *     allowed object is
					 *     {@link String }
					 *     
					 */
					public void setPrimerNombre(String value) {
						this.primerNombre = value;
					}

					/**
					 * Obtiene el valor de la propiedad segundoNombre.
					 * 
					 * @return
					 *     possible object is
					 *     {@link String }
					 *     
					 */
					public String getSegundoNombre() {
						return segundoNombre;
					}

					/**
					 * Define el valor de la propiedad segundoNombre.
					 * 
					 * @param value
					 *     allowed object is
					 *     {@link String }
					 *     
					 */
					public void setSegundoNombre(String value) {
						this.segundoNombre = value;
					}

					/**
					 * Obtiene el valor de la propiedad primerApellido.
					 * 
					 * @return
					 *     possible object is
					 *     {@link String }
					 *     
					 */
					public String getPrimerApellido() {
						return primerApellido;
					}

					/**
					 * Define el valor de la propiedad primerApellido.
					 * 
					 * @param value
					 *     allowed object is
					 *     {@link String }
					 *     
					 */
					public void setPrimerApellido(String value) {
						this.primerApellido = value;
					}

					/**
					 * Obtiene el valor de la propiedad segundoApellido.
					 * 
					 * @return
					 *     possible object is
					 *     {@link String }
					 *     
					 */
					public String getSegundoApellido() {
						return segundoApellido;
					}

					/**
					 * Define el valor de la propiedad segundoApellido.
					 * 
					 * @param value
					 *     allowed object is
					 *     {@link String }
					 *     
					 */
					public void setSegundoApellido(String value) {
						this.segundoApellido = value;
					}

					/**
					 * Obtiene el valor de la propiedad razonSocial.
					 * 
					 * @return
					 *     possible object is
					 *     {@link String }
					 *     
					 */
					public String getRazonSocial() {
						return razonSocial;
					}

					/**
					 * Define el valor de la propiedad razonSocial.
					 * 
					 * @param value
					 *     allowed object is
					 *     {@link String }
					 *     
					 */
					public void setRazonSocial(String value) {
						this.razonSocial = value;
					}

					/**
					 * Obtiene el valor de la propiedad rolInterviniente.
					 * 
					 * @return
					 *     possible object is
					 *     {@link String }
					 *     
					 */
					public String getRolInterviniente() {
						return rolInterviniente;
					}

					/**
					 * Define el valor de la propiedad rolInterviniente.
					 * 
					 * @param value
					 *     allowed object is
					 *     {@link String }
					 *     
					 */
					public void setRolInterviniente(String value) {
						this.rolInterviniente = value;
					}

					/**
					 * Obtiene el valor de la propiedad tipoParteInteresada.
					 * 
					 * @return
					 *     possible object is
					 *     {@link String }
					 *     
					 */
					public String getTipoParteInteresada() {
						return tipoParteInteresada;
					}

					/**
					 * Define el valor de la propiedad tipoParteInteresada.
					 * 
					 * @param value
					 *     allowed object is
					 *     {@link String }
					 *     
					 */
					public void setTipoParteInteresada(String value) {
						this.tipoParteInteresada = value;
					}

				}

			}

		}

	}


	/**
	 * <p>Clase Java para anonymous complex type.
	 * 
	 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="responsabilidad" maxOccurs="unbounded" minOccurs="0">
	 *           &lt;complexType>
	 *             &lt;complexContent>
	 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                 &lt;sequence>
	 *                   &lt;element name="numAnotacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
	 *                   &lt;element name="comentario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
	 *                   &lt;element name="fechaAnotacion" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
	 *                   &lt;element name="codNaturalezaJuridicaFolio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
	 *                   &lt;element name="nomNaturalezaJuridicaFolio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
	 *                   &lt;element name="dominioDRR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
	 *                   &lt;element name="intervinientes" minOccurs="0">
	 *                     &lt;complexType>
	 *                       &lt;complexContent>
	 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                           &lt;sequence>
	 *                             &lt;element name="interviniente" maxOccurs="unbounded" minOccurs="0">
	 *                               &lt;complexType>
	 *                                 &lt;complexContent>
	 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                                     &lt;sequence>
	 *                                       &lt;element name="tipoDocumentoPersona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
	 *                                       &lt;element name="numDocumentoPersona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
	 *                                       &lt;element name="primerNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
	 *                                       &lt;element name="segundoNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
	 *                                       &lt;element name="primerApellido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
	 *                                       &lt;element name="segundoApellido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
	 *                                       &lt;element name="razonSocial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
	 *                                       &lt;element name="rolInterviniente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
	 *                                       &lt;element name="tipoParteInteresada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
	 *                                     &lt;/sequence>
	 *                                   &lt;/restriction>
	 *                                 &lt;/complexContent>
	 *                               &lt;/complexType>
	 *                             &lt;/element>
	 *                           &lt;/sequence>
	 *                         &lt;/restriction>
	 *                       &lt;/complexContent>
	 *                     &lt;/complexType>
	 *                   &lt;/element>
	 *                 &lt;/sequence>
	 *               &lt;/restriction>
	 *             &lt;/complexContent>
	 *           &lt;/complexType>
	 *         &lt;/element>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = {
			"responsabilidad"
	})
	public static class ListaResponsabilidades {

		@XmlElement(name = "responsabilidad", required = true, namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/RRRMatriculas/consultarRRRMatriculas/v1")
		protected List<TipoSalidaConsultarRRRMatriculas.ListaResponsabilidades.Responsabilidad> responsabilidad;

		/**
		 * Gets the value of the responsabilidad property.
		 * 
		 * <p>
		 * This accessor method returns a reference to the live list,
		 * not a snapshot. Therefore any modification you make to the
		 * returned list will be present inside the JAXB object.
		 * This is why there is not a <CODE>set</CODE> method for the responsabilidad property.
		 * 
		 * <p>
		 * For example, to add a new item, do as follows:
		 * <pre>
		 *    getResponsabilidad().add(newItem);
		 * </pre>
		 * 
		 * 
		 * <p>
		 * Objects of the following type(s) are allowed in the list
		 * {@link TipoSalidaConsultarRRRMatriculas.ListaResponsabilidades.Responsabilidad }
		 * 
		 * 
		 */
		public List<TipoSalidaConsultarRRRMatriculas.ListaResponsabilidades.Responsabilidad> getResponsabilidad() {
			if (responsabilidad == null) {
				responsabilidad = new ArrayList<TipoSalidaConsultarRRRMatriculas.ListaResponsabilidades.Responsabilidad>();
			}
			return this.responsabilidad;
		}


		/**
		 * <p>Clase Java para anonymous complex type.
		 * 
		 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
		 * 
		 * <pre>
		 * &lt;complexType>
		 *   &lt;complexContent>
		 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *       &lt;sequence>
		 *         &lt;element name="numAnotacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
		 *         &lt;element name="comentario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
		 *         &lt;element name="fechaAnotacion" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
		 *         &lt;element name="codNaturalezaJuridicaFolio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
		 *         &lt;element name="nomNaturalezaJuridicaFolio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
		 *         &lt;element name="dominioDRR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
		 *         &lt;element name="intervinientes" minOccurs="0">
		 *           &lt;complexType>
		 *             &lt;complexContent>
		 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *                 &lt;sequence>
		 *                   &lt;element name="interviniente" maxOccurs="unbounded" minOccurs="0">
		 *                     &lt;complexType>
		 *                       &lt;complexContent>
		 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *                           &lt;sequence>
		 *                             &lt;element name="tipoDocumentoPersona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
		 *                             &lt;element name="numDocumentoPersona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
		 *                             &lt;element name="primerNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
		 *                             &lt;element name="segundoNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
		 *                             &lt;element name="primerApellido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
		 *                             &lt;element name="segundoApellido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
		 *                             &lt;element name="razonSocial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
		 *                             &lt;element name="rolInterviniente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
		 *                             &lt;element name="tipoParteInteresada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
		 *                           &lt;/sequence>
		 *                         &lt;/restriction>
		 *                       &lt;/complexContent>
		 *                     &lt;/complexType>
		 *                   &lt;/element>
		 *                 &lt;/sequence>
		 *               &lt;/restriction>
		 *             &lt;/complexContent>
		 *           &lt;/complexType>
		 *         &lt;/element>
		 *       &lt;/sequence>
		 *     &lt;/restriction>
		 *   &lt;/complexContent>
		 * &lt;/complexType>
		 * </pre>
		 * 
		 * 
		 */
		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "", propOrder = {
				"numAnotacion",
				"comentario",
				"fechaAnotacion",
				"codNaturalezaJuridicaFolio",
				"nomNaturalezaJuridicaFolio",
				"dominioDRR",
				"intervinientes"
		})
		public static class Responsabilidad {

			@XmlElement(name = "numAnotacion", required = true, namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/RRRMatriculas/consultarRRRMatriculas/v1")
			protected String numAnotacion;
			@XmlElement(name = "comentario", required = true, namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/RRRMatriculas/consultarRRRMatriculas/v1")
			protected String comentario;
			@XmlSchemaType(name = "dateTime")
			protected XMLGregorianCalendar fechaAnotacion;
			@XmlElement(name = "codNaturalezaJuridicaFolio", required = true, namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/RRRMatriculas/consultarRRRMatriculas/v1")
			protected String codNaturalezaJuridicaFolio;
			@XmlElement(name = "nomNaturalezaJuridicaFolio", required = true, namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/RRRMatriculas/consultarRRRMatriculas/v1")
			protected String nomNaturalezaJuridicaFolio;
			@XmlElement(name = "dominioDRR", required = true, namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/RRRMatriculas/consultarRRRMatriculas/v1")
			protected String dominioDRR;
			@XmlElement(name = "intervinientes", required = true, namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/RRRMatriculas/consultarRRRMatriculas/v1")
			protected TipoSalidaConsultarRRRMatriculas.ListaResponsabilidades.Responsabilidad.Intervinientes intervinientes;

			/**
			 * Obtiene el valor de la propiedad numAnotacion.
			 * 
			 * @return
			 *     possible object is
			 *     {@link String }
			 *     
			 */
			public String getNumAnotacion() {
				return numAnotacion;
			}

			/**
			 * Define el valor de la propiedad numAnotacion.
			 * 
			 * @param value
			 *     allowed object is
			 *     {@link String }
			 *     
			 */
			public void setNumAnotacion(String value) {
				this.numAnotacion = value;
			}

			/**
			 * Obtiene el valor de la propiedad comentario.
			 * 
			 * @return
			 *     possible object is
			 *     {@link String }
			 *     
			 */
			public String getComentario() {
				return comentario;
			}

			/**
			 * Define el valor de la propiedad comentario.
			 * 
			 * @param value
			 *     allowed object is
			 *     {@link String }
			 *     
			 */
			public void setComentario(String value) {
				this.comentario = value;
			}

			/**
			 * Obtiene el valor de la propiedad fechaAnotacion.
			 * 
			 * @return
			 *     possible object is
			 *     {@link XMLGregorianCalendar }
			 *     
			 */
			public XMLGregorianCalendar getFechaAnotacion() {
				return fechaAnotacion;
			}

			/**
			 * Define el valor de la propiedad fechaAnotacion.
			 * 
			 * @param value
			 *     allowed object is
			 *     {@link XMLGregorianCalendar }
			 *     
			 */
			public void setFechaAnotacion(XMLGregorianCalendar value) {
				this.fechaAnotacion = value;
			}

			/**
			 * Obtiene el valor de la propiedad codNaturalezaJuridicaFolio.
			 * 
			 * @return
			 *     possible object is
			 *     {@link String }
			 *     
			 */
			public String getCodNaturalezaJuridicaFolio() {
				return codNaturalezaJuridicaFolio;
			}

			/**
			 * Define el valor de la propiedad codNaturalezaJuridicaFolio.
			 * 
			 * @param value
			 *     allowed object is
			 *     {@link String }
			 *     
			 */
			public void setCodNaturalezaJuridicaFolio(String value) {
				this.codNaturalezaJuridicaFolio = value;
			}

			/**
			 * Obtiene el valor de la propiedad nomNaturalezaJuridicaFolio.
			 * 
			 * @return
			 *     possible object is
			 *     {@link String }
			 *     
			 */
			public String getNomNaturalezaJuridicaFolio() {
				return nomNaturalezaJuridicaFolio;
			}

			/**
			 * Define el valor de la propiedad nomNaturalezaJuridicaFolio.
			 * 
			 * @param value
			 *     allowed object is
			 *     {@link String }
			 *     
			 */
			public void setNomNaturalezaJuridicaFolio(String value) {
				this.nomNaturalezaJuridicaFolio = value;
			}

			/**
			 * Obtiene el valor de la propiedad dominioDRR.
			 * 
			 * @return
			 *     possible object is
			 *     {@link String }
			 *     
			 */
			public String getDominioDRR() {
				return dominioDRR;
			}

			/**
			 * Define el valor de la propiedad dominioDRR.
			 * 
			 * @param value
			 *     allowed object is
			 *     {@link String }
			 *     
			 */
			public void setDominioDRR(String value) {
				this.dominioDRR = value;
			}

			/**
			 * Obtiene el valor de la propiedad intervinientes.
			 * 
			 * @return
			 *     possible object is
			 *     {@link TipoSalidaConsultarRRRMatriculas.ListaResponsabilidades.Responsabilidad.Intervinientes }
			 *     
			 */
			public TipoSalidaConsultarRRRMatriculas.ListaResponsabilidades.Responsabilidad.Intervinientes getIntervinientes() {
				return intervinientes;
			}

			/**
			 * Define el valor de la propiedad intervinientes.
			 * 
			 * @param value
			 *     allowed object is
			 *     {@link TipoSalidaConsultarRRRMatriculas.ListaResponsabilidades.Responsabilidad.Intervinientes }
			 *     
			 */
			public void setIntervinientes(TipoSalidaConsultarRRRMatriculas.ListaResponsabilidades.Responsabilidad.Intervinientes value) {
				this.intervinientes = value;
			}


			/**
			 * <p>Clase Java para anonymous complex type.
			 * 
			 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
			 * 
			 * <pre>
			 * &lt;complexType>
			 *   &lt;complexContent>
			 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
			 *       &lt;sequence>
			 *         &lt;element name="interviniente" maxOccurs="unbounded" minOccurs="0">
			 *           &lt;complexType>
			 *             &lt;complexContent>
			 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
			 *                 &lt;sequence>
			 *                   &lt;element name="tipoDocumentoPersona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
			 *                   &lt;element name="numDocumentoPersona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
			 *                   &lt;element name="primerNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
			 *                   &lt;element name="segundoNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
			 *                   &lt;element name="primerApellido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
			 *                   &lt;element name="segundoApellido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
			 *                   &lt;element name="razonSocial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
			 *                   &lt;element name="rolInterviniente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
			 *                   &lt;element name="tipoParteInteresada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
			 *                 &lt;/sequence>
			 *               &lt;/restriction>
			 *             &lt;/complexContent>
			 *           &lt;/complexType>
			 *         &lt;/element>
			 *       &lt;/sequence>
			 *     &lt;/restriction>
			 *   &lt;/complexContent>
			 * &lt;/complexType>
			 * </pre>
			 * 
			 * 
			 */
			@XmlAccessorType(XmlAccessType.FIELD)
			@XmlType(name = "", propOrder = {
					"interviniente"
			})
			public static class Intervinientes {

				protected List<TipoSalidaConsultarRRRMatriculas.ListaResponsabilidades.Responsabilidad.Intervinientes.Interviniente> interviniente;

				/**
				 * Gets the value of the interviniente property.
				 * 
				 * <p>
				 * This accessor method returns a reference to the live list,
				 * not a snapshot. Therefore any modification you make to the
				 * returned list will be present inside the JAXB object.
				 * This is why there is not a <CODE>set</CODE> method for the interviniente property.
				 * 
				 * <p>
				 * For example, to add a new item, do as follows:
				 * <pre>
				 *    getInterviniente().add(newItem);
				 * </pre>
				 * 
				 * 
				 * <p>
				 * Objects of the following type(s) are allowed in the list
				 * {@link TipoSalidaConsultarRRRMatriculas.ListaResponsabilidades.Responsabilidad.Intervinientes.Interviniente }
				 * 
				 * 
				 */
				public List<TipoSalidaConsultarRRRMatriculas.ListaResponsabilidades.Responsabilidad.Intervinientes.Interviniente> getInterviniente() {
					if (interviniente == null) {
						interviniente = new ArrayList<TipoSalidaConsultarRRRMatriculas.ListaResponsabilidades.Responsabilidad.Intervinientes.Interviniente>();
					}
					return this.interviniente;
				}


				/**
				 * <p>Clase Java para anonymous complex type.
				 * 
				 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
				 * 
				 * <pre>
				 * &lt;complexType>
				 *   &lt;complexContent>
				 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
				 *       &lt;sequence>
				 *         &lt;element name="tipoDocumentoPersona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
				 *         &lt;element name="numDocumentoPersona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
				 *         &lt;element name="primerNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
				 *         &lt;element name="segundoNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
				 *         &lt;element name="primerApellido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
				 *         &lt;element name="segundoApellido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
				 *         &lt;element name="razonSocial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
				 *         &lt;element name="rolInterviniente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
				 *         &lt;element name="tipoParteInteresada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
				 *       &lt;/sequence>
				 *     &lt;/restriction>
				 *   &lt;/complexContent>
				 * &lt;/complexType>
				 * </pre>
				 * 
				 * 
				 */
				@XmlAccessorType(XmlAccessType.FIELD)
				@XmlType(name = "", propOrder = {
						"tipoDocumentoPersona",
						"numDocumentoPersona",
						"primerNombre",
						"segundoNombre",
						"primerApellido",
						"segundoApellido",
						"razonSocial",
						"rolInterviniente",
						"tipoParteInteresada"
				})
				public static class Interviniente {

					@XmlElement(name = "tipoDocumentoPersona",namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/RRRMatriculas/consultarRRRMatriculas/v1")   
					protected String tipoDocumentoPersona;
					@XmlElement(name = "numDocumentoPersona",namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/RRRMatriculas/consultarRRRMatriculas/v1")
					protected String numDocumentoPersona;
					@XmlElement(name = "primerNombre",namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/RRRMatriculas/consultarRRRMatriculas/v1")
					protected String primerNombre;
					@XmlElement(name = "segundoNombre",namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/RRRMatriculas/consultarRRRMatriculas/v1")
					protected String segundoNombre;
					@XmlElement(name = "primerApellido",namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/RRRMatriculas/consultarRRRMatriculas/v1")
					protected String primerApellido;
					@XmlElement(name = "segundoApellido",namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/RRRMatriculas/consultarRRRMatriculas/v1")
					protected String segundoApellido;
					@XmlElement(name = "razonSocial",namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/RRRMatriculas/consultarRRRMatriculas/v1")
					protected String razonSocial;
					@XmlElement(name = "rolInterviniente",namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/RRRMatriculas/consultarRRRMatriculas/v1")
					protected String rolInterviniente;
					@XmlElement(name = "tipoParteInteresada",namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/RRRMatriculas/consultarRRRMatriculas/v1")
					protected String tipoParteInteresada;

					/**
					 * Obtiene el valor de la propiedad tipoDocumentoPersona.
					 * 
					 * @return
					 *     possible object is
					 *     {@link String }
					 *     
					 */
					public String getTipoDocumentoPersona() {
						return tipoDocumentoPersona;
					}

					/**
					 * Define el valor de la propiedad tipoDocumentoPersona.
					 * 
					 * @param value
					 *     allowed object is
					 *     {@link String }
					 *     
					 */
					public void setTipoDocumentoPersona(String value) {
						this.tipoDocumentoPersona = value;
					}

					/**
					 * Obtiene el valor de la propiedad numDocumentoPersona.
					 * 
					 * @return
					 *     possible object is
					 *     {@link String }
					 *     
					 */
					public String getNumDocumentoPersona() {
						return numDocumentoPersona;
					}

					/**
					 * Define el valor de la propiedad numDocumentoPersona.
					 * 
					 * @param value
					 *     allowed object is
					 *     {@link String }
					 *     
					 */
					public void setNumDocumentoPersona(String value) {
						this.numDocumentoPersona = value;
					}

					/**
					 * Obtiene el valor de la propiedad primerNombre.
					 * 
					 * @return
					 *     possible object is
					 *     {@link String }
					 *     
					 */
					public String getPrimerNombre() {
						return primerNombre;
					}

					/**
					 * Define el valor de la propiedad primerNombre.
					 * 
					 * @param value
					 *     allowed object is
					 *     {@link String }
					 *     
					 */
					public void setPrimerNombre(String value) {
						this.primerNombre = value;
					}

					/**
					 * Obtiene el valor de la propiedad segundoNombre.
					 * 
					 * @return
					 *     possible object is
					 *     {@link String }
					 *     
					 */
					public String getSegundoNombre() {
						return segundoNombre;
					}

					/**
					 * Define el valor de la propiedad segundoNombre.
					 * 
					 * @param value
					 *     allowed object is
					 *     {@link String }
					 *     
					 */
					public void setSegundoNombre(String value) {
						this.segundoNombre = value;
					}

					/**
					 * Obtiene el valor de la propiedad primerApellido.
					 * 
					 * @return
					 *     possible object is
					 *     {@link String }
					 *     
					 */
					public String getPrimerApellido() {
						return primerApellido;
					}

					/**
					 * Define el valor de la propiedad primerApellido.
					 * 
					 * @param value
					 *     allowed object is
					 *     {@link String }
					 *     
					 */
					public void setPrimerApellido(String value) {
						this.primerApellido = value;
					}

					/**
					 * Obtiene el valor de la propiedad segundoApellido.
					 * 
					 * @return
					 *     possible object is
					 *     {@link String }
					 *     
					 */
					public String getSegundoApellido() {
						return segundoApellido;
					}

					/**
					 * Define el valor de la propiedad segundoApellido.
					 * 
					 * @param value
					 *     allowed object is
					 *     {@link String }
					 *     
					 */
					public void setSegundoApellido(String value) {
						this.segundoApellido = value;
					}

					/**
					 * Obtiene el valor de la propiedad razonSocial.
					 * 
					 * @return
					 *     possible object is
					 *     {@link String }
					 *     
					 */
					public String getRazonSocial() {
						return razonSocial;
					}

					/**
					 * Define el valor de la propiedad razonSocial.
					 * 
					 * @param value
					 *     allowed object is
					 *     {@link String }
					 *     
					 */
					public void setRazonSocial(String value) {
						this.razonSocial = value;
					}

					/**
					 * Obtiene el valor de la propiedad rolInterviniente.
					 * 
					 * @return
					 *     possible object is
					 *     {@link String }
					 *     
					 */
					public String getRolInterviniente() {
						return rolInterviniente;
					}

					/**
					 * Define el valor de la propiedad rolInterviniente.
					 * 
					 * @param value
					 *     allowed object is
					 *     {@link String }
					 *     
					 */
					public void setRolInterviniente(String value) {
						this.rolInterviniente = value;
					}

					/**
					 * Obtiene el valor de la propiedad tipoParteInteresada.
					 * 
					 * @return
					 *     possible object is
					 *     {@link String }
					 *     
					 */
					public String getTipoParteInteresada() {
						return tipoParteInteresada;
					}

					/**
					 * Define el valor de la propiedad tipoParteInteresada.
					 * 
					 * @param value
					 *     allowed object is
					 *     {@link String }
					 *     
					 */
					public void setTipoParteInteresada(String value) {
						this.tipoParteInteresada = value;
					}

				}

			}

		}

	}


	/**
	 * <p>Clase Java para anonymous complex type.
	 * 
	 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="restriccion" maxOccurs="unbounded" minOccurs="0">
	 *           &lt;complexType>
	 *             &lt;complexContent>
	 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                 &lt;sequence>
	 *                   &lt;element name="numAnotacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
	 *                   &lt;element name="comentario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
	 *                   &lt;element name="fechaAnotacion" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
	 *                   &lt;element name="codNaturalezaJuridicaFolio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
	 *                   &lt;element name="nomNaturalezaJuridicaFolio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
	 *                   &lt;element name="dominioDRR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
	 *                   &lt;element name="intervinientes" minOccurs="0">
	 *                     &lt;complexType>
	 *                       &lt;complexContent>
	 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                           &lt;sequence>
	 *                             &lt;element name="interviniente" maxOccurs="unbounded" minOccurs="0">
	 *                               &lt;complexType>
	 *                                 &lt;complexContent>
	 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                                     &lt;sequence>
	 *                                       &lt;element name="tipoDocumentoPersona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
	 *                                       &lt;element name="numDocumentoPersona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
	 *                                       &lt;element name="primerNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
	 *                                       &lt;element name="segundoNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
	 *                                       &lt;element name="primerApellido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
	 *                                       &lt;element name="segundoApellido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
	 *                                       &lt;element name="razonSocial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
	 *                                       &lt;element name="rolInterviniente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
	 *                                       &lt;element name="tipoParteInteresada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
	 *                                     &lt;/sequence>
	 *                                   &lt;/restriction>
	 *                                 &lt;/complexContent>
	 *                               &lt;/complexType>
	 *                             &lt;/element>
	 *                           &lt;/sequence>
	 *                         &lt;/restriction>
	 *                       &lt;/complexContent>
	 *                     &lt;/complexType>
	 *                   &lt;/element>
	 *                 &lt;/sequence>
	 *               &lt;/restriction>
	 *             &lt;/complexContent>
	 *           &lt;/complexType>
	 *         &lt;/element>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = {
			"restriccion"
	})
	public static class ListaRestricciones {

		@XmlElement(name = "restriccion", required = true, namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/RRRMatriculas/consultarRRRMatriculas/v1")
		protected List<TipoSalidaConsultarRRRMatriculas.ListaRestricciones.Restriccion> restriccion;

		/**
		 * Gets the value of the restriccion property.
		 * 
		 * <p>
		 * This accessor method returns a reference to the live list,
		 * not a snapshot. Therefore any modification you make to the
		 * returned list will be present inside the JAXB object.
		 * This is why there is not a <CODE>set</CODE> method for the restriccion property.
		 * 
		 * <p>
		 * For example, to add a new item, do as follows:
		 * <pre>
		 *    getRestriccion().add(newItem);
		 * </pre>
		 * 
		 * 
		 * <p>
		 * Objects of the following type(s) are allowed in the list
		 * {@link TipoSalidaConsultarRRRMatriculas.ListaRestricciones.Restriccion }
		 * 
		 * 
		 */
		public List<TipoSalidaConsultarRRRMatriculas.ListaRestricciones.Restriccion> getRestriccion() {
			if (restriccion == null) {
				restriccion = new ArrayList<TipoSalidaConsultarRRRMatriculas.ListaRestricciones.Restriccion>();
			}
			return this.restriccion;
		}


		/**
		 * <p>Clase Java para anonymous complex type.
		 * 
		 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
		 * 
		 * <pre>
		 * &lt;complexType>
		 *   &lt;complexContent>
		 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *       &lt;sequence>
		 *         &lt;element name="numAnotacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
		 *         &lt;element name="comentario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
		 *         &lt;element name="fechaAnotacion" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
		 *         &lt;element name="codNaturalezaJuridicaFolio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
		 *         &lt;element name="nomNaturalezaJuridicaFolio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
		 *         &lt;element name="dominioDRR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
		 *         &lt;element name="intervinientes" minOccurs="0">
		 *           &lt;complexType>
		 *             &lt;complexContent>
		 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *                 &lt;sequence>
		 *                   &lt;element name="interviniente" maxOccurs="unbounded" minOccurs="0">
		 *                     &lt;complexType>
		 *                       &lt;complexContent>
		 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *                           &lt;sequence>
		 *                             &lt;element name="tipoDocumentoPersona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
		 *                             &lt;element name="numDocumentoPersona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
		 *                             &lt;element name="primerNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
		 *                             &lt;element name="segundoNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
		 *                             &lt;element name="primerApellido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
		 *                             &lt;element name="segundoApellido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
		 *                             &lt;element name="razonSocial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
		 *                             &lt;element name="rolInterviniente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
		 *                             &lt;element name="tipoParteInteresada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
		 *                           &lt;/sequence>
		 *                         &lt;/restriction>
		 *                       &lt;/complexContent>
		 *                     &lt;/complexType>
		 *                   &lt;/element>
		 *                 &lt;/sequence>
		 *               &lt;/restriction>
		 *             &lt;/complexContent>
		 *           &lt;/complexType>
		 *         &lt;/element>
		 *       &lt;/sequence>
		 *     &lt;/restriction>
		 *   &lt;/complexContent>
		 * &lt;/complexType>
		 * </pre>
		 * 
		 * 
		 */
		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "", propOrder = {
				"numAnotacion",
				"comentario",
				"fechaAnotacion",
				"codNaturalezaJuridicaFolio",
				"nomNaturalezaJuridicaFolio",
				"dominioDRR",
				"intervinientes"
		})
		public static class Restriccion {

			@XmlElement(name = "numAnotacion", required = true, namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/RRRMatriculas/consultarRRRMatriculas/v1")
			protected String numAnotacion;
			@XmlElement(name = "comentario", required = true, namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/RRRMatriculas/consultarRRRMatriculas/v1")
			protected String comentario;
			@XmlSchemaType(name = "dateTime")
			protected XMLGregorianCalendar fechaAnotacion;
			@XmlElement(name = "codNaturalezaJuridicaFolio", required = true, namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/RRRMatriculas/consultarRRRMatriculas/v1")
			protected String codNaturalezaJuridicaFolio;
			@XmlElement(name = "nomNaturalezaJuridicaFolio", required = true, namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/RRRMatriculas/consultarRRRMatriculas/v1")
			protected String nomNaturalezaJuridicaFolio;
			@XmlElement(name = "dominioDRR", required = true, namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/RRRMatriculas/consultarRRRMatriculas/v1")
			protected String dominioDRR;
			@XmlElement(name = "intervinientes", required = true, namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/RRRMatriculas/consultarRRRMatriculas/v1")
			protected TipoSalidaConsultarRRRMatriculas.ListaRestricciones.Restriccion.Intervinientes intervinientes;

			/**
			 * Obtiene el valor de la propiedad numAnotacion.
			 * 
			 * @return
			 *     possible object is
			 *     {@link String }
			 *     
			 */
			public String getNumAnotacion() {
				return numAnotacion;
			}

			/**
			 * Define el valor de la propiedad numAnotacion.
			 * 
			 * @param value
			 *     allowed object is
			 *     {@link String }
			 *     
			 */
			public void setNumAnotacion(String value) {
				this.numAnotacion = value;
			}

			/**
			 * Obtiene el valor de la propiedad comentario.
			 * 
			 * @return
			 *     possible object is
			 *     {@link String }
			 *     
			 */
			public String getComentario() {
				return comentario;
			}

			/**
			 * Define el valor de la propiedad comentario.
			 * 
			 * @param value
			 *     allowed object is
			 *     {@link String }
			 *     
			 */
			public void setComentario(String value) {
				this.comentario = value;
			}

			/**
			 * Obtiene el valor de la propiedad fechaAnotacion.
			 * 
			 * @return
			 *     possible object is
			 *     {@link XMLGregorianCalendar }
			 *     
			 */
			public XMLGregorianCalendar getFechaAnotacion() {
				return fechaAnotacion;
			}

			/**
			 * Define el valor de la propiedad fechaAnotacion.
			 * 
			 * @param value
			 *     allowed object is
			 *     {@link XMLGregorianCalendar }
			 *     
			 */
			public void setFechaAnotacion(XMLGregorianCalendar value) {
				this.fechaAnotacion = value;
			}

			/**
			 * Obtiene el valor de la propiedad codNaturalezaJuridicaFolio.
			 * 
			 * @return
			 *     possible object is
			 *     {@link String }
			 *     
			 */
			public String getCodNaturalezaJuridicaFolio() {
				return codNaturalezaJuridicaFolio;
			}

			/**
			 * Define el valor de la propiedad codNaturalezaJuridicaFolio.
			 * 
			 * @param value
			 *     allowed object is
			 *     {@link String }
			 *     
			 */
			public void setCodNaturalezaJuridicaFolio(String value) {
				this.codNaturalezaJuridicaFolio = value;
			}

			/**
			 * Obtiene el valor de la propiedad nomNaturalezaJuridicaFolio.
			 * 
			 * @return
			 *     possible object is
			 *     {@link String }
			 *     
			 */
			public String getNomNaturalezaJuridicaFolio() {
				return nomNaturalezaJuridicaFolio;
			}

			/**
			 * Define el valor de la propiedad nomNaturalezaJuridicaFolio.
			 * 
			 * @param value
			 *     allowed object is
			 *     {@link String }
			 *     
			 */
			public void setNomNaturalezaJuridicaFolio(String value) {
				this.nomNaturalezaJuridicaFolio = value;
			}

			/**
			 * Obtiene el valor de la propiedad dominioDRR.
			 * 
			 * @return
			 *     possible object is
			 *     {@link String }
			 *     
			 */
			public String getDominioDRR() {
				return dominioDRR;
			}

			/**
			 * Define el valor de la propiedad dominioDRR.
			 * 
			 * @param value
			 *     allowed object is
			 *     {@link String }
			 *     
			 */
			public void setDominioDRR(String value) {
				this.dominioDRR = value;
			}

			/**
			 * Obtiene el valor de la propiedad intervinientes.
			 * 
			 * @return
			 *     possible object is
			 *     {@link TipoSalidaConsultarRRRMatriculas.ListaRestricciones.Restriccion.Intervinientes }
			 *     
			 */
			public TipoSalidaConsultarRRRMatriculas.ListaRestricciones.Restriccion.Intervinientes getIntervinientes() {
				return intervinientes;
			}

			/**
			 * Define el valor de la propiedad intervinientes.
			 * 
			 * @param value
			 *     allowed object is
			 *     {@link TipoSalidaConsultarRRRMatriculas.ListaRestricciones.Restriccion.Intervinientes }
			 *     
			 */
			public void setIntervinientes(TipoSalidaConsultarRRRMatriculas.ListaRestricciones.Restriccion.Intervinientes value) {
				this.intervinientes = value;
			}


			/**
			 * <p>Clase Java para anonymous complex type.
			 * 
			 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
			 * 
			 * <pre>
			 * &lt;complexType>
			 *   &lt;complexContent>
			 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
			 *       &lt;sequence>
			 *         &lt;element name="interviniente" maxOccurs="unbounded" minOccurs="0">
			 *           &lt;complexType>
			 *             &lt;complexContent>
			 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
			 *                 &lt;sequence>
			 *                   &lt;element name="tipoDocumentoPersona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
			 *                   &lt;element name="numDocumentoPersona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
			 *                   &lt;element name="primerNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
			 *                   &lt;element name="segundoNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
			 *                   &lt;element name="primerApellido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
			 *                   &lt;element name="segundoApellido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
			 *                   &lt;element name="razonSocial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
			 *                   &lt;element name="rolInterviniente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
			 *                   &lt;element name="tipoParteInteresada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
			 *                 &lt;/sequence>
			 *               &lt;/restriction>
			 *             &lt;/complexContent>
			 *           &lt;/complexType>
			 *         &lt;/element>
			 *       &lt;/sequence>
			 *     &lt;/restriction>
			 *   &lt;/complexContent>
			 * &lt;/complexType>
			 * </pre>
			 * 
			 * 
			 */
			@XmlAccessorType(XmlAccessType.FIELD)
			@XmlType(name = "", propOrder = {
					"interviniente"
			})
			public static class Intervinientes {

				@XmlElement(name = "interviniente", required = true, namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/RRRMatriculas/consultarRRRMatriculas/v1")
				protected List<TipoSalidaConsultarRRRMatriculas.ListaRestricciones.Restriccion.Intervinientes.Interviniente> interviniente;

				/**
				 * Gets the value of the interviniente property.
				 * 
				 * <p>
				 * This accessor method returns a reference to the live list,
				 * not a snapshot. Therefore any modification you make to the
				 * returned list will be present inside the JAXB object.
				 * This is why there is not a <CODE>set</CODE> method for the interviniente property.
				 * 
				 * <p>
				 * For example, to add a new item, do as follows:
				 * <pre>
				 *    getInterviniente().add(newItem);
				 * </pre>
				 * 
				 * 
				 * <p>
				 * Objects of the following type(s) are allowed in the list
				 * {@link TipoSalidaConsultarRRRMatriculas.ListaRestricciones.Restriccion.Intervinientes.Interviniente }
				 * 
				 * 
				 */
				public List<TipoSalidaConsultarRRRMatriculas.ListaRestricciones.Restriccion.Intervinientes.Interviniente> getInterviniente() {
					if (interviniente == null) {
						interviniente = new ArrayList<TipoSalidaConsultarRRRMatriculas.ListaRestricciones.Restriccion.Intervinientes.Interviniente>();
					}
					return this.interviniente;
				}


				/**
				 * <p>Clase Java para anonymous complex type.
				 * 
				 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
				 * 
				 * <pre>
				 * &lt;complexType>
				 *   &lt;complexContent>
				 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
				 *       &lt;sequence>
				 *         &lt;element name="tipoDocumentoPersona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
				 *         &lt;element name="numDocumentoPersona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
				 *         &lt;element name="primerNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
				 *         &lt;element name="segundoNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
				 *         &lt;element name="primerApellido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
				 *         &lt;element name="segundoApellido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
				 *         &lt;element name="razonSocial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
				 *         &lt;element name="rolInterviniente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
				 *         &lt;element name="tipoParteInteresada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
				 *       &lt;/sequence>
				 *     &lt;/restriction>
				 *   &lt;/complexContent>
				 * &lt;/complexType>
				 * </pre>
				 * 
				 * 
				 */
				@XmlAccessorType(XmlAccessType.FIELD)
				@XmlType(name = "", propOrder = {
						"tipoDocumentoPersona",
						"numDocumentoPersona",
						"primerNombre",
						"segundoNombre",
						"primerApellido",
						"segundoApellido",
						"razonSocial",
						"rolInterviniente",
						"tipoParteInteresada"
				})
				public static class Interviniente {

					@XmlElement(name = "tipoDocumentoPersona",namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/RRRMatriculas/consultarRRRMatriculas/v1")   
					protected String tipoDocumentoPersona;
					@XmlElement(name = "numDocumentoPersona",namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/RRRMatriculas/consultarRRRMatriculas/v1")
					protected String numDocumentoPersona;
					@XmlElement(name = "primerNombre",namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/RRRMatriculas/consultarRRRMatriculas/v1")
					protected String primerNombre;
					@XmlElement(name = "segundoNombre",namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/RRRMatriculas/consultarRRRMatriculas/v1")
					protected String segundoNombre;
					@XmlElement(name = "primerApellido",namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/RRRMatriculas/consultarRRRMatriculas/v1")
					protected String primerApellido;
					@XmlElement(name = "segundoApellido",namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/RRRMatriculas/consultarRRRMatriculas/v1")
					protected String segundoApellido;
					@XmlElement(name = "razonSocial",namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/RRRMatriculas/consultarRRRMatriculas/v1")
					protected String razonSocial;
					@XmlElement(name = "rolInterviniente",namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/RRRMatriculas/consultarRRRMatriculas/v1")
					protected String rolInterviniente;
					@XmlElement(name = "tipoParteInteresada",namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/RRRMatriculas/consultarRRRMatriculas/v1")
					protected String tipoParteInteresada;

					/**
					 * Obtiene el valor de la propiedad tipoDocumentoPersona.
					 * 
					 * @return
					 *     possible object is
					 *     {@link String }
					 *     
					 */
					public String getTipoDocumentoPersona() {
						return tipoDocumentoPersona;
					}

					/**
					 * Define el valor de la propiedad tipoDocumentoPersona.
					 * 
					 * @param value
					 *     allowed object is
					 *     {@link String }
					 *     
					 */
					public void setTipoDocumentoPersona(String value) {
						this.tipoDocumentoPersona = value;
					}

					/**
					 * Obtiene el valor de la propiedad numDocumentoPersona.
					 * 
					 * @return
					 *     possible object is
					 *     {@link String }
					 *     
					 */
					public String getNumDocumentoPersona() {
						return numDocumentoPersona;
					}

					/**
					 * Define el valor de la propiedad numDocumentoPersona.
					 * 
					 * @param value
					 *     allowed object is
					 *     {@link String }
					 *     
					 */
					public void setNumDocumentoPersona(String value) {
						this.numDocumentoPersona = value;
					}

					/**
					 * Obtiene el valor de la propiedad primerNombre.
					 * 
					 * @return
					 *     possible object is
					 *     {@link String }
					 *     
					 */
					public String getPrimerNombre() {
						return primerNombre;
					}

					/**
					 * Define el valor de la propiedad primerNombre.
					 * 
					 * @param value
					 *     allowed object is
					 *     {@link String }
					 *     
					 */
					public void setPrimerNombre(String value) {
						this.primerNombre = value;
					}

					/**
					 * Obtiene el valor de la propiedad segundoNombre.
					 * 
					 * @return
					 *     possible object is
					 *     {@link String }
					 *     
					 */
					public String getSegundoNombre() {
						return segundoNombre;
					}

					/**
					 * Define el valor de la propiedad segundoNombre.
					 * 
					 * @param value
					 *     allowed object is
					 *     {@link String }
					 *     
					 */
					public void setSegundoNombre(String value) {
						this.segundoNombre = value;
					}

					/**
					 * Obtiene el valor de la propiedad primerApellido.
					 * 
					 * @return
					 *     possible object is
					 *     {@link String }
					 *     
					 */
					public String getPrimerApellido() {
						return primerApellido;
					}

					/**
					 * Define el valor de la propiedad primerApellido.
					 * 
					 * @param value
					 *     allowed object is
					 *     {@link String }
					 *     
					 */
					public void setPrimerApellido(String value) {
						this.primerApellido = value;
					}

					/**
					 * Obtiene el valor de la propiedad segundoApellido.
					 * 
					 * @return
					 *     possible object is
					 *     {@link String }
					 *     
					 */
					public String getSegundoApellido() {
						return segundoApellido;
					}

					/**
					 * Define el valor de la propiedad segundoApellido.
					 * 
					 * @param value
					 *     allowed object is
					 *     {@link String }
					 *     
					 */
					public void setSegundoApellido(String value) {
						this.segundoApellido = value;
					}

					/**
					 * Obtiene el valor de la propiedad razonSocial.
					 * 
					 * @return
					 *     possible object is
					 *     {@link String }
					 *     
					 */
					public String getRazonSocial() {
						return razonSocial;
					}

					/**
					 * Define el valor de la propiedad razonSocial.
					 * 
					 * @param value
					 *     allowed object is
					 *     {@link String }
					 *     
					 */
					public void setRazonSocial(String value) {
						this.razonSocial = value;
					}

					/**
					 * Obtiene el valor de la propiedad rolInterviniente.
					 * 
					 * @return
					 *     possible object is
					 *     {@link String }
					 *     
					 */
					public String getRolInterviniente() {
						return rolInterviniente;
					}

					/**
					 * Define el valor de la propiedad rolInterviniente.
					 * 
					 * @param value
					 *     allowed object is
					 *     {@link String }
					 *     
					 */
					public void setRolInterviniente(String value) {
						this.rolInterviniente = value;
					}

					/**
					 * Obtiene el valor de la propiedad tipoParteInteresada.
					 * 
					 * @return
					 *     possible object is
					 *     {@link String }
					 *     
					 */
					public String getTipoParteInteresada() {
						return tipoParteInteresada;
					}

					/**
					 * Define el valor de la propiedad tipoParteInteresada.
					 * 
					 * @param value
					 *     allowed object is
					 *     {@link String }
					 *     
					 */
					public void setTipoParteInteresada(String value) {
						this.tipoParteInteresada = value;
					}

				}

			}

		}

	}

}

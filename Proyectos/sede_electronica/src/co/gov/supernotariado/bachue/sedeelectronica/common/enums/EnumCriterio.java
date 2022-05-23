/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: EnumCriterio.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.enums
 * Nombre del elemento: EnumCriterio
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.enums;

/**
 * Enumeracion para definir el grupo de constantes para Criterio. <br>
 * Enum que contiene el mapeo de los criterios para los servicios
 * 
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public enum EnumCriterio implements ICriterio {

	/**
	 * Constante de la enumeracion para definir el item: FECHA_SOLICITUD.
	 */
	FECHA_SOLICITUD("FECHA_SOLICITUD"),

	/**
	 * Constante de la enumeracion para definir el item: CDR_MATRICULA.
	 */
	// Consulta datos registrales
	CDR_MATRICULA("MATRICULA"),
	
	CON_MATRICULA("CON_MATRICULA"),
	
	NO_MATRICULA("NO_MATRICULA"),

	/**
	 * Constante de la enumeracion para definir el item: PAIS.
	 */
	PAIS("PAIS"),
	/**
	 * Constante de la enumeracion para definir el item: NUMERO_PREDIO.
	 */
	NUMERO_PREDIO("NUMERO_PREDIO"),
	
	APODERADOS("APODERADOS"),
	
	PODERDANTES("PODERDANTES"),
	
	PODER("PODER"),
	/**
	 * Constante de la enumeracion para definir el item: FORMA_ENVIO_MAIL.
	 */
	FORMA_ENVIO_MAIL("FORMA_ENVIO_MAIL"),

	/**
	 * Constante de la enumeracion para definir el item: FORMA_ENVIO_ORIP.
	 */
	FORMA_ENVIO_ORIP("FORMA_ENVIO_ORIP"),
	/**
	 * Constante de la enumeracion para definir el item: CANTIDAD.
	 */
	CANTIDAD("CANTIDAD"),
	/**
	 * Constante de la enumeracion para definir el item: NOMBRE_PREDIO.
	 */
	NOMBRE_PREDIO("NOMBRE_PREDIO"),
	
	/**
	 * Constante de la enumeracion para definir el item: NIR.
	 */
	NIR("NIR"),

	/**
	 * Constante de la enumeracion para definir el item: TURNO.
	 */
	TURNO("TURNO"),
	
	/**
	 * Constante de la enumeracion para definir el item: ACTIVO.
	 */
	ACTIVO("ACTIVO"),
	
	/**
	 * Constante de la enumeracion para definir el item: FOO.
	 */
	FOO("foo"),
	
	/**
	 * Constante de la enumeracion para definir el item: ESTADO_PREDIO_CERTIFICADO.
	 */
	ESTADO_PREDIO_CERTIFICADO("1"),

	/**
	 * Constante de la enumeracion para definir el item: MATRICULA.
	 */
	// certificados y alertas y especiales
	MATRICULA("NUMERO_MATRICULA"),
	/**
	 * Constante de la enumeracion para definir el item: ORIP_MATRICULA.
	 */
	ORIP_MATRICULA("ORIP_MATRICULA"),
	/**
	 * Constante de la enumeracion para definir el item: NUPRE.
	 */
	NUPRE("NUPRE"),

	/**
	 * Constante de la enumeracion para definir el item: CEDULA_CATASTRAL.
	 */
	CEDULA_CATASTRAL("CEDULA_CATASTRAL"),

	/**
	 * Constante de la enumeracion para definir el item: TIPO_PREDIO_DIRECCION.
	 */
	// Direccion especiales
	TIPO_PREDIO_DIRECCION("DIRECCION_PREDIO_TIPO_PREDIO"),
	/**
	 * Constante de la enumeracion para definir el item: DEPARTAMENTO_CE.
	 */
	DEPARTAMENTO_CE("DIRECCION_PREDIO_DEPARTAMENTO"),

	/**
	 * Constante de la enumeracion para definir el item: MUNICIPIO_DIRECCION.
	 */
	MUNICIPIO_DIRECCION("DIRECCION_PREDIO_MUNICIPIO"),
	/**
	 * Constante de la enumeracion para definir el item: VEREDA_CE.
	 */
	VEREDA_CE("DIRECCION_PREDIO_VEREDA"),

	/**
	 * Constante de la enumeracion para definir el item: NOMBRE_PREDIO_CE.
	 */
	NOMBRE_PREDIO_CE("DIRECCION_PREDIO_NOMBRE"),
	/**
	 * Constante de la enumeracion para definir el item: TIPO_EJE_CE.
	 */
	TIPO_EJE_CE("DIRECCION_PREDIO_TIPO_EJE"),

	/**
	 * Constante de la enumeracion para definir el item: EJE_PRINCIPAL_CE.
	 */
	EJE_PRINCIPAL_CE("DIRECCION_PREDIO_EJE_PRINCIPAL"),
	/**
	 * Constante de la enumeracion para definir el item: EJE_UNO_CE.
	 */
	EJE_UNO_CE("DIRECCION_PREDIO_EJE_1"),

	/**
	 * Constante de la enumeracion para definir el item: EJE_SEGUNDARIO.
	 */
	EJE_SEGUNDARIO("DIRECCION_PREDIO_EJE_SECUNDARIO"),
	/**
	 * Constante de la enumeracion para definir el item: DIRECCION_COMPLEMENTO_CE.
	 */
	DIRECCION_COMPLEMENTO_CE("DIRECCION_PREDIO_COMPLEMENTO"),

	/**
	 * Constante de la enumeracion para definir el item: CODIGO_CONVENIO.
	 */
	// Servicios
	CODIGO_CONVENIO("Sede Electronica"),
	/**
	 * Constante de la enumeracion para definir el item: RESPUESTA_CANTIDAD.
	 */
	RESPUESTA_CANTIDAD("1"),
	/**
	 * Constante de la enumeracion para definir el item: CANAL_ORIGEN.
	 */
	CANAL_ORIGEN("SEDE_ELECTRONICA"),
	/**
	 * Constante de la enumeracion para definir el item: CORE_BACHUE.
	 */
	CORE_BACHUE("CORE"),

	/**
	 * Constante de la enumeracion para definir el item: CANAL_ORIGEN_FINANCIERAS.
	 */
	CANAL_ORIGEN_FINANCIERAS("fisico"),
	/**
	 * Constante de la enumeracion para definir el item: CODIGO_CANAL.
	 */
	CODIGO_CANAL("SE"),
	/**
	 * Constante de la enumeracion para definir el item: CODIGO_SUCURSAL.
	 */
	CODIGO_SUCURSAL("SEDELEC"),

	/**
	 * Constante de la enumeracion para definir el item: LIBRO.
	 */
	// Antiguo sistema CE
	LIBRO("LIBRO_AS"),
	/**
	 * Constante de la enumeracion para definir el item: TOMO.
	 */
	TOMO("TOMO_AS"),
	/**
	 * Constante de la enumeracion para definir el item: ANIO.
	 */
	ANIO("ANIO_AS"),
	/**
	 * Constante de la enumeracion para definir el item: FOLIO.
	 */
	FOLIO("FOLIO_AS"),
	/**
	 * Constante de la enumeracion para definir el item: TIPO_PARTIDA.
	 */
	TIPO_PARTIDA("TIPO_PARTIDA_AS"),

	/**
	 * Constante de la enumeracion para definir el item: NUMERO_PARTIDA.
	 */
	NUMERO_PARTIDA("NUMERO_PARTIDA_AS"),
	/**
	 * Constante de la enumeracion para definir el item: TIPO_PREDIO.
	 */
	TIPO_PREDIO("TIPO_PREDIO_AS"),
	/**
	 * Constante de la enumeracion para definir el item: MUNICIPIO_PREDIO.
	 */
	MUNICIPIO_PREDIO("MUNICIPIO_PREDIO_AS"),

	/**
	 * Constante de la enumeracion para definir el item: ORIP_ANTIGUO_SISTEMA.
	 */
	ORIP_ANTIGUO_SISTEMA("ORIP_MATRICULA_AS"),

	/**
	 * Constante de la enumeracion para definir el item: DETALLE_AS.
	 */
	DETALLE_AS("DETALLE_AS"),

	/**
	 * Constante de la enumeracion para definir el item: NUMERO_MATRICULA_AS.
	 */
	NUMERO_MATRICULA_AS("NUMERO_MATRICULA_AS"),

	/**
	 * Constante de la enumeracion para definir el item: TIPO_PERSONA.
	 */
	// Propietario especiales
	TIPO_PERSONA("TIPO_PERSONA_PROPIETARIO"),
	/**
	 * Constante de la enumeracion para definir el item: TIPO_DOCUMENTO.
	 */
	TIPO_DOCUMENTO("TIPO_DOCUMENTO_PROPIETARIO"),

	/**
	 * Constante de la enumeracion para definir el item: NUMERO_DOCUMENTO.
	 */
	NUMERO_DOCUMENTO("NUMERO_DOCUMENTO_PROPIETARIO"),
	/**
	 * Constante de la enumeracion para definir el item: PRIMER_NOMPRE.
	 */
	PRIMER_NOMPRE("PRIMER_NOMBRE_PROPIETARIO"),

	/**
	 * Constante de la enumeracion para definir el item: SEGUNDO_NOMBRE.
	 */
	SEGUNDO_NOMBRE("SEGUNDO_NOMBRE_PROPIETARIO"),
	/**
	 * Constante de la enumeracion para definir el item: PRIMER_APELLIDO.
	 */
	PRIMER_APELLIDO("PRIMER_APELLIDO_PROPIETARIO"),

	/**
	 * Constante de la enumeracion para definir el item: SEGUNDO_APELLIDO.
	 */
	SEGUNDO_APELLIDO("SEGUNDO_APELLIDO_PROPIETARIO"),
	/**
	 * Constante de la enumeracion para definir el item: RAZON_SOCIAL.
	 */
	RAZON_SOCIAL("RAZON_SOCIAL_PROPIETARIO"),

	/**
	 * Constante de la enumeracion para definir el item: NUMERO_CELULAR_SOLICITANTE.
	 */
	NUMERO_CELULAR_SOLICITANTE("NUMERO_CELULAR_TITULAR"),
	/**
	 * Constante de la enumeracion para definir el item:
	 * CORREO_ELECTRONICO_SOLICITANTE.
	 */
	CORREO_ELECTRONICO_SOLICITANTE("CORREO_ELECTRONICO_TITULAR"),

	/**
	 * Constante de la enumeracion para definir el item: VALOR_RECARGA.
	 */
	VALOR_RECARGA("VALOR_RECARGA"),

	/**
	 * Constante de la enumeracion para definir el item: RAZON_SOCIAL_CC.
	 */
	// CONSTANTES CUENTA CUPO
	RAZON_SOCIAL_CC("RAZON_SOCIAL"),
	/**
	 * Constante de la enumeracion para definir el item:
	 * REPRESENTANTE_LEGAL_PRIMER_NOMBRE.
	 */
	REPRESENTANTE_LEGAL_PRIMER_NOMBRE("REPRESENTANTE_LEGAL_PRIMER_NOMBRE"),

	/**
	 * Constante de la enumeracion para definir el item:
	 * REPRESENTANTE_LEGAL_SEGUNDO_NOMBRE.
	 */
	REPRESENTANTE_LEGAL_SEGUNDO_NOMBRE("REPRESENTANTE_LEGAL_SEGUNDO_NOMBRE"),

	/**
	 * Constante de la enumeracion para definir el item:
	 * REPRESENTANTE_LEGAL_PRIMER_APELLIDO.
	 */
	REPRESENTANTE_LEGAL_PRIMER_APELLIDO("REPRESENTANTE_LEGAL_PRIMER_APELLIDO"),

	/**
	 * Constante de la enumeracion para definir el item:
	 * REPRESENTANTE_LEGAL_SEGUNDO_APELLIDO.
	 */
	REPRESENTANTE_LEGAL_SEGUNDO_APELLIDO("REPRESENTANTE_LEGAL_SEGUNDO_APELLIDO"),

	/**
	 * Constante de la enumeracion para definir el item:
	 * REPRESENTANTE_LEGAL_NUMERO_DOC.
	 */
	REPRESENTANTE_LEGAL_NUMERO_DOC("REPRESENTANTE_LEGAL_NUMERO_DOCUMENTO"),

	/**
	 * Constante de la enumeracion para definir el item:
	 * REPRESENTANTE_LEGAL_CELULAR.
	 */
	REPRESENTANTE_LEGAL_CELULAR("REPRESENTANTE_LEGAL_CELULAR"),

	/**
	 * Constante de la enumeracion para definir el item:
	 * REPRESENTANTE_LEGAL_CORREO_ELECTRONICO.
	 */
	REPRESENTANTE_LEGAL_CORREO_ELECTRONICO("REPRESENTANTE_LEGAL_CORREO_ELECTRONICO"),
	/**
	 * Constante de la enumeracion para definir el item: TELEFONO_FIJO.
	 */
	TELEFONO_FIJO("TELEFONO"),

	/**
	 * Constante de la enumeracion para definir el item: OCUPACION.
	 */
	OCUPACION("REPRESENTANTE_LEGAL_OCUPACION_PROFESION"),

	/**
	 * Constante de la enumeracion para definir el item:
	 * DESCRIPCION_ACTIVIDAD_ECONOMICA.
	 */
	DESCRIPCION_ACTIVIDAD_ECONOMICA("DESCRIPCION_ACTIVIDAD_ECONOMICA"),
	/**
	 * Constante de la enumeracion para definir el item: TIPO_EMPRESA.
	 */
	TIPO_EMPRESA("TIPO_EMPRESA"),

	/**
	 * Constante de la enumeracion para definir el item: SERVICIO_SOLICITADO.
	 */
	SERVICIO_SOLICITADO("SERVICIO_SOLICITADO"),
	/**
	 * Constante de la enumeracion para definir el item: MONTO_SOLICITADO.
	 */
	MONTO_SOLICITADO("MONTO_SOLICITADO"),

	/**
	 * Constante de la enumeracion para definir el item:
	 * DESCRIPCION_NECESIDAD_DE_CUENTA_CUPO.
	 */
	DESCRIPCION_NECESIDAD_DE_CUENTA_CUPO("DESCRIPCION_NECESIDAD_DE_CUENTA_CUPO"),

	/**
	 * Constante de la enumeracion para definir el item:
	 * DESCRIPCION_ORIGEN_RECURSOS.
	 */
	DESCRIPCION_ORIGEN_RECURSOS("DESCRIPCION_ORIGEN_RECURSOS"),
	/**
	 * Constante de la enumeracion para definir el item: CIUDAD_DILIGENCIAMIENTO.
	 */
	CIUDAD_DILIGENCIAMIENTO("CIUDAD"),

	/**
	 * Constante de la enumeracion para definir el item: DIRECCION.
	 */
	DIRECCION("EMPRESA_DIRECCION"),
	/**
	 * Constante de la enumeracion para definir el item: NUEVO_VALOR_MINIMO.
	 */
	NUEVO_VALOR_MINIMO("NUEVO_VALOR_MINIMO"),

	/**
	 * Constante de la enumeracion para definir el item: NUEVO_VALOR_MAXIMO.
	 */
	NUEVO_VALOR_MAXIMO("NUEVO_VALOR_MAXIMO"),
	/**
	 * Constante de la enumeracion para definir el item: MOTIVO_SOLICITUD.
	 */
	MOTIVO_SOLICITUD("MOTIVO_SOLICITUD"),

	/**
	 * Constante de la enumeracion para definir el item: FECHA_DILIGENCIAMIENTO.
	 */
	FECHA_DILIGENCIAMIENTO("FECHA DILIGENCIAMIENTO"),
	/**
	 * Constante de la enumeracion para definir el item: EMPRESA_TIPO_DOCUMENTO.
	 */
	EMPRESA_TIPO_DOCUMENTO("EMPRESA_TIPO_DOCUMENTO"),

	/**
	 * Constante de la enumeracion para definir el item: EMPRESA_NUMERO_DOCUMENTO.
	 */
	EMPRESA_NUMERO_DOCUMENTO("EMPRESA_NUMERO_DOCUMENTO"),

	/**
	 * Constante de la enumeracion para definir el item:
	 * EMPRESA_DIGITO_VERIFICACION_NIT.
	 */
	EMPRESA_DIGITO_VERIFICACION_NIT("EMPRESA_DIGITO_VERIFICACION_NIT"),

	/**
	 * Constante de la enumeracion para definir el item:
	 * REPRESENTANTE_LEGAL_TIPO_DOCUMENTO.
	 */
	REPRESENTANTE_LEGAL_TIPO_DOCUMENTO("REPRESENTANTE_LEGAL_TIPO_DOCUMENTO"),

	/**
	 * Constante de la enumeracion para definir el item:
	 * DESCRIPCION_FRECUENCIA_RECARGAS.
	 */
	DESCRIPCION_FRECUENCIA_RECARGAS("DESCRIPCION_FRECUENCIA_RECARGAS"),

	/**
	 * Constante de la enumeracion para definir el item: ID_CUENTA_CUPO.
	 */
	ID_CUENTA_CUPO("ID_CUENTA_CUPO"),

	/**
	 * Constante de la enumeracion para definir el item:
	 * CANCELACION_CC_MOTIVO_SOLICITUD.
	 */
	CANCELACION_CC_MOTIVO_SOLICITUD("MOTIVO_CANCELACION"),

	/**
	 * Constante de la enumeracion para definir el item: TIPO_PERSONA_PROPIETARIO.
	 */
	// SOLICITUD DE CONSULTAS
	TIPO_PERSONA_PROPIETARIO("TIPO_PERSONA_PROPIETARIO"),
	/**
	 * Constante de la enumeracion para definir el item: TIPO_DOCUMENTO_PROPIETARIO.
	 */
	TIPO_DOCUMENTO_PROPIETARIO("TIPO_DOCUMENTO_PROPIETARIO"),

	/**
	 * Constante de la enumeracion para definir el item:
	 * NUMERO_DOCUMENTO_PROPIETARIO.
	 */
	NUMERO_DOCUMENTO_PROPIETARIO("NUMERO_DOCUMENTO_PROPIETARIO"),

	/**
	 * Constante de la enumeracion para definir el item: PRIMER_NOMBRE_PROPIETARIO.
	 */
	PRIMER_NOMBRE_PROPIETARIO("PRIMER_NOMBRE_PROPIETARIO"),
	/**
	 * Constante de la enumeracion para definir el item: SEGUNDO_NOMBRE_PROPIETARIO.
	 */
	SEGUNDO_NOMBRE_PROPIETARIO("SEGUNDO_NOMBRE_PROPIETARIO"),

	/**
	 * Constante de la enumeracion para definir el item:
	 * PRIMER_APELLIDO_PROPIETARIO.
	 */
	PRIMER_APELLIDO_PROPIETARIO("PRIMER_APELLIDO_PROPIETARIO"),

	/**
	 * Constante de la enumeracion para definir el item:
	 * SEGUNDO_APELLIDO_PROPIETARIO.
	 */
	SEGUNDO_APELLIDO_PROPIETARIO("SEGUNDO_APELLIDO_PROPIETARIO"),
	/**
	 * Constante de la enumeracion para definir el item: RAZON_SOCIAL_PROPIETARIO.
	 */
	RAZON_SOCIAL_PROPIETARIO("RAZON_SOCIAL_PROPIETARIO"),

	/**
	 * Constante de la enumeracion para definir el item: TIPO_ACTO.
	 */
	TIPO_ACTO("TIPO_ACTO"),

	/**
	 * Constante de la enumeracion para definir el item: NOMBRE_OFICINA_ORIGEN.
	 */
	// Alerta Tierras
	NOMBRE_OFICINA_ORIGEN("NOMBRE_OFICINA_ORIGEN"),
	/**
	 * Constante de la enumeracion para definir el item: TIPO_DOCUMENTO_ALERTA.
	 */
	TIPO_DOCUMENTO_ALERTA("TIPO_DOCUMENTO_ALERTA"),

	/**
	 * Constante de la enumeracion para definir el item: NUMERO_DOCUMENTO_ALERTA.
	 */
	NUMERO_DOCUMENTO_ALERTA("NUMERO_DOCUMENTO_ALERTA"),
	/**
	 * Constante de la enumeracion para definir el item: FECHA_DOCUMENTO.
	 */
	FECHA_DOCUMENTO("FECHA_DOCUMENTO"),

	/**
	 * Constante de la enumeracion para definir el item: ID_ALERTA.
	 */
	// Inactivar Alerta
	ID_ALERTA("ID_ALERTA"),
	/**
	 * Constante de la enumeracion para definir el item: ID_MOTIVO.
	 */
	ID_MOTIVO("ID_MOTIVO"),
	/**
	 * Constante de la enumeracion para definir el item: TXT_INACTIVACION.
	 */
	TXT_INACTIVACION("TXT_INACTIVACION"),
	/**
	 * Constante de la enumeracion para definir el item: TIPO_OFICINA.
	 */
	TIPO_OFICINA("TIPO_OFICINA"),

	/**
	 * Constante de la enumeracion para definir el item: DOCUMENTO_NIR.
	 */
	// Consultar documentos
	DOCUMENTO_NIR("xNIR"),
	/**
	 * Constante de la enumeracion para definir el item: DOCUMENTO_MATRICULA.
	 */
	DOCUMENTO_MATRICULA("xMATRICULA"),

	/**
	 * Constante de la enumeracion para definir el item: DOCUMENTO_TURNO.
	 */
	DOCUMENTO_TURNO("xTURNO"),
	/**
	 * Constante de la enumeracion para definir el item: DOCUMENTO_TIPO.
	 */
	DOCUMENTO_TIPO("dDocType"),
	/**
	 * Constante de la enumeracion para definir el item: DOCUMENTO_NUMERO.
	 */
	DOCUMENTO_NUMERO("xNUMERODOC"),

	/**
	 * Constante de la enumeracion para definir el item: DOCUMENTO_FECHA.
	 */
	DOCUMENTO_FECHA("xFECHA_DOC"),
	/**
	 * Constante de la enumeracion para definir el item: TIPO_DOCUMENTO_FINAL.
	 */
	TIPO_DOCUMENTO_FINAL("FINAL"),

	/**
	 * Constante de la enumeracion para definir el item: COPIAS_ID_SOLICITUD.
	 */
	// Solicitud copias
	COPIAS_ID_SOLICITUD("IDENTIFICADOR_COPIAS_SE"),
	/**
	 * Constante de la enumeracion para definir el item: COPIAS_FORMA_ENVIO_MAIL.
	 */
	COPIAS_FORMA_ENVIO_MAIL("FORMA_ENVIO_MAIL"),

	/**
	 * Constante de la enumeracion para definir el item: CATALOGO_ENTIDAD_ESPECIAL.
	 */
	// Tipo Catalogo
	CATALOGO_ENTIDAD_ESPECIAL("ENTIDAD_ESPECIAL"),

	/**
	 * Constante de la enumeracion para definir el item: CATALOGO_TIPO_ALERTA.
	 */
	CATALOGO_TIPO_ALERTA("TIPO_ALERTA_TIERRAS"),

	/**
	 * Constante de la enumeracion para definir el item:
	 * CATALOGO_TIPO_COMUNIDAD_ETNICA.
	 */
	CATALOGO_TIPO_COMUNIDAD_ETNICA("COMUNIDAD_ETNICA"),

	/**
	 * Constante de la enumeracion para definir el item:
	 * CATALOGO_ENTIDAD_ESPECIAL_X_T_OFICINA.
	 */
	CATALOGO_ENTIDAD_ESPECIAL_X_T_OFICINA("ENTIDAD_ESPECIAL_X_T_OFICINA"),

	/**
	 * Constante de la enumeracion para definir el item: CATALOGO_TIPO_OFICINA.
	 */
	CATALOGO_TIPO_OFICINA("TIPO_OFICINA"),
	
	/**
	 * Constante de la enumeracion para definir el item: CATALOGO_ACTIVIDAD_ECONOMICA.
	 */
	CATALOGO_ACTIVIDAD_ECONOMICA("ACTIVIDAD_ECONOMICA"),
	
	CATALOGO_CIRCULOS_DESTINO("CIRCULOS_DESTINO"),
	
	CATALOGO_CALIDAD_SOLICITANTE("CALIDAD_SOLICITANTE"),
	
	CATALOGO_ETAPA("ETAPA_XTRAMITE_SEL"),
	
	CATALOGO_TIPODOC("TIPODOC_XTRAMITE"),
	
	POR_NOTA_CREDITO("NOTA_CREDITO"),
	
	POR_CANCELACION_CUENTA_CUPO("CUENTA_CUPO"),

	/**
	 * Constante de la enumeracion para definir el item: NOTARIA.
	 */
	// Tipos de oficina
	NOTARIA("NOTARIA"),

	/**
	 * Constante de la enumeracion para definir el item: JUZGADO.
	 */
	JUZGADO("JUZGADO"),

	/**
	 * Constante de la enumeracion para definir el item: TRIBUNAL.
	 */
	TRIBUNAL("TRIBUNAL"),

	/**
	 * Constante de la enumeracion para definir el item: SECRETARIA.
	 */
	SECRETARIA("SECRETARIA"),

	/**
	 * Constante de la enumeracion para definir el item: CONCEJO.
	 */
	CONCEJO("CONCEJO"),

	/**
	 * Constante de la enumeracion para definir el item: OFICINA_REGISTRO.
	 */
	OFICINA_REGISTRO("OFICINA REGISTRO"),

	/**
	 * Constante de la enumeracion para definir el item: CORTE.
	 */
	CORTE("CORTE"),

	/**
	 * Constante de la enumeracion para definir el item: DESPACHO.
	 */
	DESPACHO("DESPACHO"),

	/**
	 * Constante de la enumeracion para definir el item: SUPERINTENDENCIA.
	 */
	SUPERINTENDENCIA("SUPERINTENDENCIA"),

	/**
	 * Constante de la enumeracion para definir el item: CONSULADO.
	 */
	CONSULADO("CONSULADO"),
	
	/**
	 * Constante de la enumeracion para definir el item: CATALOGO_ENTIDAD_RECAUDADORA.
	 */
	CATALOGO_ENTIDAD_RECAUDADORA("ENTIDAD_RECAUDADORA"),

	/**
	 * Constante de la enumeracion para definir el item: PODERES.
	 */
	 PODERES("PODERES"),
	
	//Tipo Consignacion
	/**
	 * Constante de la enumeracion para definir el item: NUMERO_CONSIGNACION.
	 */
	NUMERO_CONSIGNACION("NUMERO_CONSIGNACION"),
	
	/**
	 * Constante de la enumeracion para definir el item: NUMERO_CUS.
	 */
	NUMERO_CUS("CUS"),
	
	/**
	 * Constante de la enumeracion para definir el item: NUMERO_TRANSACCION.
	 */
	NUMERO_TRANSACCION("NUMERO_TRANSACCION"),

	//Tipo cuenta bancaria
	/**
	 * Constante de la enumeracion para definir el item: CORRIENTE.
	 */
	CORRIENTE("CORRIENTE"),
	
	/**
	 * Constante de la enumeracion para definir el item: AHORROS.
	 */
	AHORROS("AHORROS"),
	
	/**
	 * Constante de la enumeracion para definir el item: CFT.
	 */
	CFT("CFT"),
	
	//Documentos no obligatorios Devolucion consignacion errada
	/**
	 * Constante de la enumeracion para definir el item: RECIBO_CONSIGNACION_DEVOLUCION_CONSIGNACION_ERRADA.
	 */
	RECIBO_CONSIGNACION_DEVOLUCION_CONSIGNACION_ERRADA("RECIBO_CONSIGNACION_DEVOLUCION_CONSIGNACION_ERRADA"),
	
	/**
	 * Constante de la enumeracion para definir el item: PODER_DEVOLUCION_CONSIGNACION_ERRADA.
	 */
	PODER_DEVOLUCION_CONSIGNACION_ERRADA("PODER_DEVOLUCION_CONSIGNACION_ERRADA"),
	
	/**
	 * Constante de la enumeracion para definir el item: PODER_DEVOLUCION_SERVICIO_REGISTRAL.
	 */
	PODER_DEVOLUCION_SERVICIO_REGISTRAL("PODER_DEVOLUCION_SERVICIO_REGISTRAL"),
	/**
	 * Constante de la enumeracion para definir el item: AUTORIZACION_PAGO_TITULAR_CUENTA_DEVOLUCION_CONSIGNACION_ERRADA.
	 */
	AUTORIZACION_PAGO_TITULAR_CUENTA_DEVOLUCION_CONSIGNACION_ERRADA("AUTORIZACION_PAGO_TITULAR_CUENTA_DEVOLUCION_CONSIGNACION_ERRADA"),
	
	/**
	 * Constante de la enumeracion para definir el item: AUTORIZACION_PAGO_TITULAR_CUENTA_DEVOLUCION_SERVICIO_REGISTRAL.
	 */
	AUTORIZACION_PAGO_TITULAR_CUENTA_DEVOLUCION_SERVICIO_REGISTRAL("AUTORIZACION_PAGO_TITULAR_CUENTA_DEVOLUCION_SERVICIO_REGISTRAL"),
	
	//Criterios caso de traslado matricula
	ID_CIRCULO("ID_CIRCULO"),
	
	ID_MATRICULA("ID_MATRICULA"),
	
	ID_CIRCULO_DESTINO("ID_CIRCULO_DESTINO"),
	
	CALIDAD_SOLICITANTE("CALIDAD_SOLICITANTE"),
	
	EMAIL("EMAIL"),
	
	DOCUMENTOS_SOLICITADOS("DOCUMENTOS_SOLICITADOS"),
	
	OBSERVACION("OBSERVACION"),
	
	//Criterios interposicion recursos
	
	TURNO_IR("TURNO"),
	
	CALIDAD_SOLICITANTE_IR("CALIDAD_SOLICITANTE"),
	
	TIPO_RECURSO_IR("TIPO_RECURSO"),
	
	EMAIL_IR("EMAIL"),
	
	DOCUMENTOS_SOLICITADOS_IR("DOCUMENTOS_SOLICITADOS"),
	
	OBSERVACION_IR("OBSERVACION"),
	
	// Criterios persona generar solicitud
	
	PRIMER_NOMBRE_GS("PRIMER_NOMBRE_SOLICITANTE"),
	
	SEGUNDO_NOMBRE_GS("SEGUNDO_NOMBRE_SOLICITANTE"),
	
	PRIMER_APELLIDO_GS("PRIMER_APELLIDO_SOLICITANTE"),
	
	SEGUNDO_APELLIDO_GS("SEGUNDO_APELLIDO_SOLICITANTE"),

	;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * criterio.
	 */
	private String is_criterio;

	/**
	 * Construye una nueva instancia/objeto de la clase EnumCriterio.
	 *
	 * @param as_criterio el parametro criterio
	 */
	private EnumCriterio(String as_criterio) {
		this.is_criterio = as_criterio;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see co.gov.supernotariado.bachue.sedeelectronica.common.enums.ICriterio#
	 * getIs_criterio()
	 */
	@Override
	public String getIs_criterio() {
		return is_criterio;
	}
}

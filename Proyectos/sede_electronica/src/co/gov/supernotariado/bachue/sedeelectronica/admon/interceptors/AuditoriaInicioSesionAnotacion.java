/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: AuditoriaInicioSesionAnotacion.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.interceptors
 * Nombre del elemento: AuditoriaInicioSesionAnotacion
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.interceptors;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.annotation.RetentionPolicy;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.ElementType.METHOD;

import javax.interceptor.InterceptorBinding;

/**
 * El elemento Interface AuditoriaInicioSesionAnotacion.<br>
 * Representa un/una auditoria inicio sesion anotacion.<br>
 * Anotacion para invocar interceptor de la auditoria de inicio de sesion
 * 
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@InterceptorBinding
@Target({ TYPE, METHOD })
@Retention(RetentionPolicy.RUNTIME)
public @interface AuditoriaInicioSesionAnotacion {
}

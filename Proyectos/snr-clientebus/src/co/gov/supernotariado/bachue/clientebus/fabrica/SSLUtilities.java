/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: SSLUtilities.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.fabrica
 * Nombre del elemento: SSLUtilities
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.fabrica;

import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

/**
 * Clase que tiene utilidades para la verificacion del la llave ssl.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public final class SSLUtilities {

	/**
	 * Construye una nueva instancia/objeto de la clase SSLUtilities.
	 */
	private SSLUtilities() {
		// Constructor vacio
	}

	/**
	 * Atributo de instancia tipo HostnameVerifier para definir la propiedad
	 * hostname verifier.
	 */
	private static HostnameVerifier ihv_hostnameVerifier;

	/**
	 * Atributo de instancia tipo TrustManager[] para definir la propiedad trust
	 * managers.
	 */
	private static TrustManager[] itm_trustManagers;

	/**
	 * Atributo de instancia tipo HostnameVerifier para definir la propiedad
	 * hostname verifier 2.
	 */
	private static HostnameVerifier ihv_hostnameVerifier2;

	/**
	 * Atributo de instancia tipo TrustManager[] para definir la propiedad trust
	 * managers 2.
	 */
	private static TrustManager[] itm_trustManagers2;

	/**
	 * Trust all hostnames 2.
	 */
	private static void trustAllHostnames2() {
		// Create a trust manager that does not validate certificate chains
		if (ihv_hostnameVerifier == null) {
			ihv_hostnameVerifier = new FakeHostnameVerifier2();
		} // if
			// Install the all-trusting host name verifier
		HttpsURLConnection.setDefaultHostnameVerifier(ihv_hostnameVerifier);
	} // __trustAllHttpsCertificates

	/**
	 * Trust all https certificates 2.
	 */
	private static void trustAllHttpsCertificates2() {
		SSLContext context;

		// Create a trust manager that does not validate certificate chains
		if (itm_trustManagers == null) {
			itm_trustManagers = new TrustManager[] { new FakeX509TrustManager2() };
		} // if
			// Install the all-trusting trust manager
		try {
			context = SSLContext.getInstance("SSL");
			context.init(null, itm_trustManagers, new SecureRandom());
		} catch (GeneralSecurityException gse) {
			throw new IllegalStateException(gse.getMessage());
		} // catch
		HttpsURLConnection.setDefaultSSLSocketFactory(context.getSocketFactory());
	} // __trustAllHttpsCertificates

	/**
	 * Obtiene el valor para la propiedad deprecated SSL protocol.
	 *
	 * @return true, si se cumple la propiedad deprecated SSL protocol, false caso
	 *         contrario
	 */
	private static boolean isDeprecatedSSLProtocol() {
		return ("com.sun.net.ssl.internal.www.protocol".equals(System.getProperty("java.protocol.handler.pkgs")));
	} // isDeprecatedSSLProtocol

	/**
	 * Trust all hostnames 1.
	 */
	private static void trustAllHostnames1() {
		// Create a trust manager that does not validate certificate chains
		if (ihv_hostnameVerifier2 == null) {
			ihv_hostnameVerifier2 = new FakeHostnameVerifier();
		} // if
			// Install the all-trusting host name verifier:
		HttpsURLConnection.setDefaultHostnameVerifier(ihv_hostnameVerifier2);
	} // _trustAllHttpsCertificates

	/**
	 * Trust all https certificates 1.
	 */
	private static void trustAllHttpsCertificates1() {
		SSLContext context;

		// Create a trust manager that does not validate certificate chains
		if (itm_trustManagers2 == null) {
			itm_trustManagers2 = new TrustManager[] { new FakeX509TrustManager() };
		} // if
			// Install the all-trusting trust manager:
		try {
			context = SSLContext.getInstance("SSL");
			context.init(null, itm_trustManagers2, new SecureRandom());
		} catch (GeneralSecurityException gse) {
			throw new IllegalStateException(gse.getMessage());
		} // catch
		HttpsURLConnection.setDefaultSSLSocketFactory(context.getSocketFactory());
	} // _trustAllHttpsCertificates

	/**
	 * Trust all hostnames.
	 */
	public static void trustAllHostnames() {
		// Is the deprecated protocol setted?
		if (isDeprecatedSSLProtocol()) {
			trustAllHostnames2();
		} else {
			trustAllHostnames1();
		} // else
	} // trustAllHostnames

	/**
	 * Trust all https certificates.
	 */
	public static void trustAllHttpsCertificates() {
		// Is the deprecated protocol setted?
		if (isDeprecatedSSLProtocol()) {
			trustAllHttpsCertificates2();
		} else {
			trustAllHttpsCertificates1();
		} // else
	} // trustAllHttpsCertificates

	/**
	 * El elemento Class FakeHostnameVerifier2.<br>
	 * Representa un/una fake hostname verifier 2.<br>
	 *
	 * @author Smartsoft Solutions S.A.S
	 * @version 1.0
	 */
	public static class FakeHostnameVerifier2 implements HostnameVerifier {

		/*
		 * (non-Javadoc)
		 * 
		 * @see javax.net.ssl.HostnameVerifier#verify(java.lang.String,
		 * javax.net.ssl.SSLSession)
		 */
		public boolean verify(String hostname, SSLSession session) {
			return (true);
		}
	} // _FakeHostnameVerifier

	/**
	 * El elemento Class FakeX509TrustManager2.<br>
	 * Representa un/una fake X 509 trust manager 2.<br>
	 *
	 * @author Smartsoft Solutions S.A.S
	 * @version 1.0
	 */
	public static class FakeX509TrustManager2 implements X509TrustManager {

		/**
		 * Define la constante _AcceptedIssuers.
		 */
		private static final X509Certificate[] _AcceptedIssuers = new X509Certificate[] {};

		/**
		 * Obtiene el valor para la propiedad client trusted.
		 *
		 * @param chain el parametro chain
		 * @return true, si se cumple la propiedad client trusted, false caso contrario
		 */
		public boolean isClientTrusted(X509Certificate[] chain) {
			return (true);
		} // checkClientTrusted

		/**
		 * Obtiene el valor para la propiedad server trusted.
		 *
		 * @param chain el parametro chain
		 * @return true, si se cumple la propiedad server trusted, false caso contrario
		 */
		public boolean isServerTrusted(X509Certificate[] chain) {
			return (true);
		} // checkServerTrusted

		/*
		 * (non-Javadoc)
		 * 
		 * @see javax.net.ssl.X509TrustManager#getAcceptedIssuers()
		 */
		public X509Certificate[] getAcceptedIssuers() {
			return (_AcceptedIssuers);
		} // getAcceptedIssuers

		/*
		 * (non-Javadoc)
		 * 
		 * @see javax.net.ssl.X509TrustManager#checkClientTrusted(java.security.cert.
		 * X509Certificate[], java.lang.String)
		 */
		public void checkClientTrusted(X509Certificate[] arg0, String arg1) throws CertificateException {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see javax.net.ssl.X509TrustManager#checkServerTrusted(java.security.cert.
		 * X509Certificate[], java.lang.String)
		 */
		public void checkServerTrusted(X509Certificate[] arg0, String arg1) throws CertificateException {
			throw new UnsupportedOperationException("Not supported yet.");
		}
	} // _FakeX509TrustManager

	/**
	 * El elemento Class FakeHostnameVerifier.<br>
	 * Representa un/una fake hostname verifier.<br>
	 *
	 * @author Smartsoft Solutions S.A.S
	 * @version 1.0
	 */
	public static class FakeHostnameVerifier implements HostnameVerifier {

		/*
		 * (non-Javadoc)
		 * 
		 * @see javax.net.ssl.HostnameVerifier#verify(java.lang.String,
		 * javax.net.ssl.SSLSession)
		 */
		public boolean verify(String hostname, SSLSession session) {
			return (true);
		} // verify
	} // FakeHostnameVerifier

	/**
	 * El elemento Class FakeX509TrustManager.<br>
	 * Representa un/una fake X 509 trust manager.<br>
	 *
	 * @author Smartsoft Solutions S.A.S
	 * @version 1.0
	 */
	public static class FakeX509TrustManager implements X509TrustManager {

		/**
		 * Define la constante _AcceptedIssuers.
		 */
		private static final X509Certificate[] _AcceptedIssuers = new X509Certificate[] {};

		/*
		 * (non-Javadoc)
		 * 
		 * @see javax.net.ssl.X509TrustManager#checkClientTrusted(java.security.cert.
		 * X509Certificate[], java.lang.String)
		 */
		public void checkClientTrusted(X509Certificate[] chain, String authType) {
		} // checkClientTrusted

		/*
		 * (non-Javadoc)
		 * 
		 * @see javax.net.ssl.X509TrustManager#checkServerTrusted(java.security.cert.
		 * X509Certificate[], java.lang.String)
		 */
		public void checkServerTrusted(X509Certificate[] chain, String authType) {
		} // checkServerTrusted

		/*
		 * (non-Javadoc)
		 * 
		 * @see javax.net.ssl.X509TrustManager#getAcceptedIssuers()
		 */
		public X509Certificate[] getAcceptedIssuers() {
			return (_AcceptedIssuers);
		} // getAcceptedIssuers
	} // FakeX509TrustManager
} // SSLUtilities
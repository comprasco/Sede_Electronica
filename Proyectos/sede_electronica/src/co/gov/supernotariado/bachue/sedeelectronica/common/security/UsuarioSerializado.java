/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: UsuarioSerializado.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.security
 * Nombre del elemento: UsuarioSerializado
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.security;

import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.CredentialsContainer;
import org.springframework.security.core.SpringSecurityCoreVersion;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.util.Assert;

/**
 * Clase que encapsula un usuario de tipo User Spring Security.<br>
 * Implementa las interfaces UserDetails, CredentialsContainer del framework
 * spring security
 * 
 * @author Smartsoft Solutions S.A.S NOTA:
 * @version 1.0
 */
public class UsuarioSerializado implements UserDetails, CredentialsContainer, Serializable {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * contrasena.
	 */
	private String is_contrasena;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nombre usuario.
	 */
	private final String is_nombreUsuario;

	/**
	 * Atributo para definir la propiedad isga autoridades.
	 */
	private final Set<GrantedAuthority> isga_autoridades;

	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad cuenta
	 * no expira.
	 */
	private final boolean ib_cuentaNoExpira;

	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad cuenta
	 * no bloqueada.
	 */
	private final boolean ib_cuentaNoBloqueada;

	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad
	 * credenciales no expira.
	 */
	private final boolean ib_credencialesNoExpira;

	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad estado
	 * activacion.
	 */
	private final boolean ib_estadoActivacion;

	/**
	 * Construye una nueva instancia/objeto de la clase UsuarioSerializado.
	 *
	 * @param as_nombreUsuario el parametro nombre usuario
	 * @param as_contrasena    el parametro contrasena
	 * @param asga_autoridades el parametro autoridades
	 */
	public UsuarioSerializado(String as_nombreUsuario, String as_contrasena,
			Collection<? extends GrantedAuthority> asga_autoridades) {
		this(as_nombreUsuario, as_contrasena, true, true, true, true, asga_autoridades);
	}

	/**
	 * Construye una nueva instancia/objeto de la clase UsuarioSerializado.
	 *
	 * @param as_nombreUsuario        el parametro nombre usuario
	 * @param as_contrasena           el parametro contrasena
	 * @param ab_estadoActivacion     el parametro estado activacion
	 * @param ab_cuentaNoExpira       el parametro cuenta no expira
	 * @param ab_credencialesNoExpira el parametro credenciales no expira
	 * @param ab_cuentaNoBloqueada    el parametro cuenta no bloqueada
	 * @param asga_autoridades        el parametro autoridades
	 */
	public UsuarioSerializado(String as_nombreUsuario, String as_contrasena, boolean ab_estadoActivacion,
			boolean ab_cuentaNoExpira, boolean ab_credencialesNoExpira, boolean ab_cuentaNoBloqueada,
			Collection<? extends GrantedAuthority> asga_autoridades) {

		if (((as_nombreUsuario == null) || "".equals(as_nombreUsuario)) || (as_contrasena == null)) {
			throw new IllegalArgumentException("Cannot pass null or empty values to constructor");
		}

		this.is_nombreUsuario = as_nombreUsuario;
		this.is_contrasena = as_contrasena;
		this.ib_estadoActivacion = ab_estadoActivacion;
		this.ib_cuentaNoExpira = ab_cuentaNoExpira;
		this.ib_credencialesNoExpira = ab_credencialesNoExpira;
		this.ib_cuentaNoBloqueada = ab_cuentaNoBloqueada;
		this.isga_autoridades = Collections.unmodifiableSet(sortAuthorities(asga_autoridades));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.springframework.security.core.userdetails.UserDetails#getAuthorities()
	 */
	@Override
	public Collection<GrantedAuthority> getAuthorities() {
		return isga_autoridades;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.security.core.userdetails.UserDetails#getPassword()
	 */
	@Override
	public String getPassword() {
		return is_contrasena;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.security.core.userdetails.UserDetails#getUsername()
	 */
	@Override
	public String getUsername() {
		return is_nombreUsuario;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.security.core.userdetails.UserDetails#isEnabled()
	 */
	@Override
	public boolean isEnabled() {
		return ib_estadoActivacion;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.springframework.security.core.userdetails.UserDetails#isAccountNonExpired
	 * ()
	 */
	@Override
	public boolean isAccountNonExpired() {
		return ib_cuentaNoExpira;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.springframework.security.core.userdetails.UserDetails#isAccountNonLocked(
	 * )
	 */
	@Override
	public boolean isAccountNonLocked() {
		return ib_cuentaNoBloqueada;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.security.core.userdetails.UserDetails#
	 * isCredentialsNonExpired()
	 */
	@Override
	public boolean isCredentialsNonExpired() {
		return ib_credencialesNoExpira;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.springframework.security.core.CredentialsContainer#eraseCredentials()
	 */
	@Override
	public void eraseCredentials() {
		is_contrasena = null;
	}

	/**
	 * Metodo que organiza usuarios autoridades.
	 *
	 * @param acga_autoridad autoridades
	 * @return autoridades ordenadas
	 */
	private static SortedSet<GrantedAuthority> sortAuthorities(Collection<? extends GrantedAuthority> acga_autoridad) {
		Assert.notNull(acga_autoridad, "Cannot pass a null GrantedAuthority collection");

		SortedSet<GrantedAuthority> lssga_autoridadesOrdenadas = new TreeSet<>(new AuthorityComparator());

		for (GrantedAuthority lga_autoridadPermiso : acga_autoridad) {
			Assert.notNull(lga_autoridadPermiso, "GrantedAuthority list cannot contain any null elements");
			lssga_autoridadesOrdenadas.add(lga_autoridadPermiso);
		}

		return lssga_autoridadesOrdenadas;
	}

	/**
	 * El elemento Class AuthorityComparator.<br>
	 * Representa un/una authority comparator.<br>
	 *
	 * @author Smartsoft Solutions S.A.S NOTA: Clase que apoya la comparacion de
	 *         autoridades
	 * @version 1.0
	 */
	private static class AuthorityComparator implements Comparator<GrantedAuthority>, Serializable {

		/**
		 * Define la constante serialVersionUID.
		 */
		private static final long serialVersionUID = SpringSecurityCoreVersion.SERIAL_VERSION_UID;

		/*
		 * (non-Javadoc)
		 * 
		 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
		 */
		@Override
		public int compare(GrantedAuthority aga_permisoUno, GrantedAuthority aga_permisoDos) {

			if (aga_permisoDos.getAuthority() == null) {
				return -1;
			}

			if (aga_permisoUno.getAuthority() == null) {
				return 1;
			}

			return aga_permisoUno.getAuthority().compareTo(aga_permisoDos.getAuthority());
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object ab_usuario) {
		if (ab_usuario instanceof UsuarioSerializado) {
			return is_nombreUsuario.equals(((UsuarioSerializado) ab_usuario).is_nombreUsuario);
		}
		return false;
	}

	/**
	 * Returns the hashcode of the {@code username}.
	 *
	 * @return Resultado para hash code retornado como int
	 */
	@Override
	public int hashCode() {
		return is_nombreUsuario.hashCode();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder lsb_cadenaContructor = new StringBuilder();
		lsb_cadenaContructor.append(super.toString()).append(": ");
		lsb_cadenaContructor.append("Username: ").append(this.is_nombreUsuario).append("; ");
		lsb_cadenaContructor.append("Password: [PROTECTED]; ");
		lsb_cadenaContructor.append("Enabled: ").append(this.ib_estadoActivacion).append("; ");
		lsb_cadenaContructor.append("AccountNonExpired: ").append(this.ib_cuentaNoExpira).append("; ");
		lsb_cadenaContructor.append("credentialsNonExpired: ").append(this.ib_credencialesNoExpira).append("; ");
		lsb_cadenaContructor.append("AccountNonLocked: ").append(this.ib_cuentaNoBloqueada).append("; ");

		if (!isga_autoridades.isEmpty()) {
			lsb_cadenaContructor.append("Granted Authorities: ");

			boolean lb_estado = true;
			for (GrantedAuthority lga_autoridad : isga_autoridades) {
				if (!lb_estado) {
					lsb_cadenaContructor.append(",");
				}
				lb_estado = false;

				lsb_cadenaContructor.append(lga_autoridad);
			}
		} else {
			lsb_cadenaContructor.append("Not granted any authorities");
		}

		return lsb_cadenaContructor.toString();
	}
}
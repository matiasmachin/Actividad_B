/**
 * 
 */
package Actividad_B;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.GregorianCalendar;
import java.util.*;

/**
 * @author Matias Machin
 *
 */
public class persona {
	
	private String dni;
	private String nombre;
	private String apellidos;
	private String sexo;
	private GregorianCalendar fechanac;
	private String direccion;
	private String telefono;
	private String email;
	private String nross; // nro de seguridad social
	

	// Constructores
	

	
	
	
	/**
	 * @param dni
	 * @param nombre
	 * @param apellidos
	 * @param sexo
	 * @param fechanac
	 * @param direccion
	 * @param telefono
	 * @param email
	 * @param nross
	 */
	public persona(String dni, String nombre, String apellidos, String sexo, GregorianCalendar fechanac,
			String direccion, String telefono, String email, String nross) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.sexo = sexo;
		this.fechanac = fechanac;
		this.direccion = direccion;
		this.telefono = telefono;
		this.email = email;
		this.nross = nross;
	}

	/**
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * @param dni the dni to set
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * @param apellidos the apellidos to set
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	/**
	 * @return the sexo
	 */
	public String getSexo() {
		return sexo;
	}

	/**
	 * @param sexo the sexo to set
	 */
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	/**
	 * @return the fechanac
	 */
	public GregorianCalendar getFechanac() {
		return fechanac;
	}

	/**
	 * @param fechanac the fechanac to set
	 */
	public void setFechanac(GregorianCalendar fechanac) {
		this.fechanac = fechanac;
	}

	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * @return the telefono
	 */
	public String getTelefono() {
		return telefono;
	}

	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the nross
	 */
	public String getNross() {
		return nross;
	}

	/**
	 * @param nross the nross to set
	 */
	public void setNross(String nross) {
		this.nross = nross;
	}

	
	
	
	
	SimpleDateFormat formatocorto =new SimpleDateFormat("dd/MM/yyyy"); // formato corto de fecha
	
	
	@Override
	public String toString() {
		return (" \n"+"D.N.I: "+ dni + "\n"+
				"Nombre: "+ nombre+ "\n"+
				"Apellidos: "+apellidos+ "\n"+
				"Sexo: "+sexo+ "\n"+
				"Fecha de Nacimiento: "+formatocorto.format(fechanac.getTime())+"\n"+ // formato corto de fecha
				"Nro de Seguridad Social: "+nross+ "\n"+
				"Direccion: "+direccion+ "\n"+
				"Telefono: "+telefono+"\n"+
				"Correo Electronico: "+email+ "\n");
	}
	

	
	

}

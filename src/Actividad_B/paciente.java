/**
 * 
 */
package Actividad_B;


import java.util.GregorianCalendar;

/**
 * @author Matias Machin
 *
 */
public class paciente {
	
	// atributos
	
	private int nrohistoria;
	private String nombre;
	private String apellidos;
	private GregorianCalendar  fechanac;
	private String dni;
	private String sexo;
	private String direccion;
	private String telefono;
	private String cip;  // codigo de identificacion del paciente
	private int ss; // nro de seguridad social

	// constructores
	
	/**
	 * @param nrohistoria
	 * @param nombre
	 * @param apellidos
	 * @param fechanac
	 * @param dni
	 * @param sexo
	 * @param direccion
	 * @param telefono
	 * @param cip
	 * @param ss
	 */
	public paciente(int nrohistoria, String nombre, String apellidos, GregorianCalendar fechanac, String dni,
			String sexo, String direccion, String telefono, String cip, int ss) {
		this.nrohistoria = nrohistoria;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechanac = fechanac;
		this.dni = dni;
		this.sexo = sexo;
		this.direccion = direccion;
		this.telefono = telefono;
		this.cip = cip;
		this.ss = ss;
	}
	
	
	
	

}

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

	/**
	 * Metodo getter del atributo nrohistoria
	 * @return the nrohistoria
	 */
	public int getNrohistoria() {
		return nrohistoria;
	}

	/**
	 * Metodo setter del atributo nrohistoria
	 * @param nrohistoria the nrohistoria to set
	 */
	public void setNrohistoria(int nrohistoria) {
		this.nrohistoria = nrohistoria;
	}

	/**
	 * Metodo getter del atributo nombre
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Metodo setter del atributo nombre
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Metodo getter del atributo apellidos
	 * @return the apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * Metodo setter del atributo apellidos
	 * @param apellidos the apellidos to set
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	/**
	 * Metodo getter del atributo fechanac
	 * @return the fechanac
	 */
	public GregorianCalendar getFechanac() {
		return fechanac;
	}

	/**
	 * Metodo setter del atributo fechanac
	 * @param fechanac the fechanac to set
	 */
	public void setFechanac(GregorianCalendar fechanac) {
		this.fechanac = fechanac;
	}

	/**
	 * Metodo getter del atributo dni
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * Metodo setter del atributo dni
	 * @param dni the dni to set
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}

	/**
	 * Metodo getter del atributo sexo
	 * @return the sexo
	 */
	public String getSexo() {
		return sexo;
	}

	/**
	 * Metodo setter del atributo sexo
	 * @param sexo the sexo to set
	 */
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	/**
	 * Metodo getter del atributo direccion
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * Metodo setter del atributo direccion
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * Metodo getter del atributo telefono
	 * @return the telefono
	 */
	public String getTelefono() {
		return telefono;
	}

	/**
	 * Metodo setter del atributo telefono
	 * @param telefono the telefono to set
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	/**
	 * Metodo getter del atributo cip
	 * @return the cip
	 */
	public String getCip() {
		return cip;
	}

	/**
	 * Metodo setter del atributo cip
	 * @param cip the cip to set
	 */
	public void setCip(String cip) {
		this.cip = cip;
	}

	/**
	 * Metodo getter del atributo ss
	 * @return the ss
	 */
	public int getSs() {
		return ss;
	}

	/**
	 * Metodo setter del atributo ss
	 * @param ss the ss to set
	 */
	public void setSs(int ss) {
		this.ss = ss;
	}
	
	
	//metodos
	
	
	
	
	

}

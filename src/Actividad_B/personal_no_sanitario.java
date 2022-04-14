/**
 * 
 */
package Actividad_B;

import java.util.GregorianCalendar;

/**
 * @author Matias Machin
 *
 */
public class personal_no_sanitario{
	
	private int id;
	private String profesion;
	private String departamento;
	private double salario;
	private persona perso;
	
	public personal_no_sanitario(int id, String dni, String nombre, String apellidos, String sexo, GregorianCalendar fechanac, String direccion, String telefono, String email, String nross,String profesion, String departamento, double salario) {
		this.id=id;
		this.perso=new persona(dni, nombre, apellidos, sexo, fechanac, direccion, telefono, email, nross);
		this.profesion=profesion;
		this.departamento=departamento;
		this.salario=salario;
	}

	
	public personal_no_sanitario(int id , persona perso, String profesion, String departamento, double salario) {
		this(id, perso.getDni(),perso.getNombre(),perso.getApellidos(),perso.getSexo(),perso.getFechanac(),perso.getDireccion(),perso.getTelefono(),perso.getEmail(),perso.getNross(),profesion,departamento,salario);
		
	}


	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}


	/**
	 * @return the profesion
	 */
	public String getProfesion() {
		return profesion;
	}


	/**
	 * @param profesion the profesion to set
	 */
	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}


	/**
	 * @return the departamento
	 */
	public String getDepartamento() {
		return departamento;
	}


	/**
	 * @param departamento the departamento to set
	 */
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}


	/**
	 * @return the salario
	 */
	public double getSalario() {
		return salario;
	}


	/**
	 * @param salario the salario to set
	 */
	public void setSalario(double salario) {
		this.salario = salario;
	}


	/**
	 * @return the perso
	 */
	public persona getPerso() {
		return perso;
	}


	/**
	 * @param perso the perso to set
	 */
	public void setPerso(persona perso) {
		this.perso = perso;
	}


	@Override
	public String toString() {
		return ("\nID: " + id +
				 perso + 
				"Profesion: " +profesion+ "\n"+
				"Departamento: "+departamento+ "\n"+
				"Salario: " + salario+"\n");
	}
	
	
}

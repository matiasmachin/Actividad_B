/**
 * 
 */
package Actividad_B;

import java.util.GregorianCalendar;

/**
 * @author Matias Machin
 *
 */
public class personal_sanitario {
	
	private int id;
	private String profesion;
	private String especialidad;
	private double salario;
	private persona perso;
	
	
	public personal_sanitario(int id, String dni, String nombre, String apellidos, String sexo, GregorianCalendar fechanac, String direccion, String telefono, String email, String nross,String profesion, String especialidad, double salario) {
		this.id=id;
		this.perso=new persona(dni, nombre, apellidos, sexo, fechanac, direccion, telefono, email, nross);
		this.profesion=profesion;
		this.especialidad=especialidad;
		this.salario=salario;
	}
	
	public personal_sanitario(int id , persona perso, String profesion, String especialidad, double salario) {
		this(id, perso.getDni(),perso.getNombre(),perso.getApellidos(),perso.getSexo(),perso.getFechanac(),perso.getDireccion(),perso.getTelefono(),perso.getEmail(),perso.getNross(),profesion,especialidad,salario);
		
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
	 * @return the especialidad
	 */
	public String getEspecialidad() {
		return especialidad;
	}

	/**
	 * @param especialidad the especialidad to set
	 */
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
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
				"Especialidad: "+especialidad+ "\n"+
				"Salario: " + salario+"\n");
				
	}
	
	
	

}

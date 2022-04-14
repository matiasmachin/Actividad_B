/**
 * 
 */
package Actividad_B;

import java.util.*;



/**
 * @author Matias Machin
 *
 */
public class paciente {
	
	// atributos
	
	private int nrodehistoria;
	private int cip;
	private persona perso;
	
	
	public paciente(int nrodehistoria, String dni, String nombre, String apellidos, String sexo, GregorianCalendar fechanac, String direccion, String telefono, String email, String nross, int cip) {
		
		this.nrodehistoria=nrodehistoria;
		this.perso=new persona(dni, nombre, apellidos, sexo, fechanac, direccion, telefono, email, nross);
		this.cip=cip;
	}
	

	
	public paciente(int nrodehistoria, persona perso, int cip) {
		this(nrodehistoria, perso.getDni(),perso.getNombre(),perso.getApellidos(),perso.getSexo(),perso.getFechanac(),perso.getDireccion(),perso.getTelefono(),perso.getEmail(),perso.getNross(),cip);
		
	}



	/**
	 * @return the nrodehistoria
	 */
	public int getNrodehistoria() {
		return nrodehistoria;
	}



	/**
	 * @param nrodehistoria the nrodehistoria to set
	 */
	public void setNrodehistoria(int nrodehistoria) {
		this.nrodehistoria = nrodehistoria;
	}



	/**
	 * @return the cip
	 */
	public int getCip() {
		return cip;
	}



	/**
	 * @param cip the cip to set
	 */
	public void setCip(int cip) {
		this.cip = cip;
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
		return ("\nNro de Historia: " + nrodehistoria + "\n" +
				"Nro C.I.P: " + cip  +
				 perso );
	}



	
	

}

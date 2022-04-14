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
	
	private final int maxexamenes=10;
	private final int maxpatoligia=100;
	// atributos
	
	private int nrodehistoria;
	private int cip;
	private persona perso;
	private examenes[] examen;
	private patologias[] patologia;
	private int nroexamenes;
	private int nropatologias;
	
	
	public paciente(int nrodehistoria, String dni, String nombre, String apellidos, String sexo, GregorianCalendar fechanac, String direccion, String telefono, String email, String nross, int cip ) {
		
		this.nrodehistoria=nrodehistoria;
		this.perso=new persona(dni, nombre, apellidos, sexo, fechanac, direccion, telefono, email, nross);
		this.cip=cip;
		this.examen=new examenes[maxexamenes];
		this.patologia=new patologias[maxpatoligia];
		this.nropatologias=0;
		this.nroexamenes=0;
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

	// Examenes
	
	  public void anadirexamen(examenes a) { if (nroexamenes<maxexamenes) {
	  this.examen[nroexamenes]= a; nroexamenes++; } else {
	  System.out.println("No se pueden anadir examenes!!..Cupo Lleno"); } }
	  
	  private String mostrarexamenes() { String examencadena=""; for (int i =
	  0;i<nroexamenes;i++) { examencadena+=this.examen[i].toString()+"\n";
	  
	  } return examencadena; }
	  
	  // Patologias
	 
	  public void anadirpatalogia(patologias a) { if (nropatologias<maxpatoligia) {
		  this.patologia[nropatologias]= a; nropatologias++; } else {
		  System.out.println("No se pueden anadir patologias!!..Cupo Lleno"); } }
	
	  private String mostrarpatologias() { String patologiacadena=""; for (int i =
			  0;i<nropatologias;i++) { patologiacadena+=this.patologia[i].toString()+"\n";
			  
			  } return patologiacadena; }
	


	@Override
	public String toString() {
		return ("\nNro de Historia: " + nrodehistoria + "\n" +
				"Nro C.I.P: " + cip  +
				 perso + "\n" +
				" Se ha realizado los siguientes examenes : \n"+
				 mostrarexamenes() +"\n"+
				" El Paciente a presentado las siguientes patologias : \n"+
				 mostrarpatologias());
				
			
	}



	
	

}

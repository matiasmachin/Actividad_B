/**
* Registro de patologias
 * 
 */
package Actividad_B;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

/**
 * @author Matias Machin
 *
 */
public class patologias {

	 private int id;
	 private String nombre_patologia;
	 private String descripción;
	 private String medicacion;
	 private GregorianCalendar fecha_p; // fecha que presento la patologia
	/**
	 * @param id
	 * @param nombre_patologia
	 * @param descripción
	 * @param medicacion
	 * @param fecha_p
	 */
	public patologias(int id, String nombre_patologia, String descripción, String medicacion,
			GregorianCalendar fecha_p) {
		this.id = id;
		this.nombre_patologia = nombre_patologia;
		this.descripción = descripción;
		this.medicacion = medicacion;
		this.fecha_p = fecha_p;
	}
	/**
	 * Metodo getter del atributo id
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * Metodo setter del atributo id
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * Metodo getter del atributo nombre_patologia
	 * @return the nombre_patologia
	 */
	public String getNombre_patologia() {
		return nombre_patologia;
	}
	/**
	 * Metodo setter del atributo nombre_patologia
	 * @param nombre_patologia the nombre_patologia to set
	 */
	public void setNombre_patologia(String nombre_patologia) {
		this.nombre_patologia = nombre_patologia;
	}
	/**
	 * Metodo getter del atributo descripción
	 * @return the descripción
	 */
	public String getDescripción() {
		return descripción;
	}
	/**
	 * Metodo setter del atributo descripción
	 * @param descripción the descripción to set
	 */
	public void setDescripción(String descripción) {
		this.descripción = descripción;
	}
	/**
	 * Metodo getter del atributo medicacion
	 * @return the medicacion
	 */
	public String getMedicacion() {
		return medicacion;
	}
	/**
	 * Metodo setter del atributo medicacion
	 * @param medicacion the medicacion to set
	 */
	public void setMedicacion(String medicacion) {
		this.medicacion = medicacion;
	}
	/**
	 * Metodo getter del atributo fecha_p
	 * @return the fecha_p
	 */
	public GregorianCalendar getFecha_p() {
		return fecha_p;
	}
	/**
	 * Metodo setter del atributo fecha_p
	 * @param fecha_p the fecha_p to set
	 */
	public void setFecha_p(GregorianCalendar fecha_p) {
		this.fecha_p = fecha_p;
	}
	 
	SimpleDateFormat formatocorto2 =new SimpleDateFormat("dd/MM/yyyy"); // formato corto de fecha
	@Override
	public String toString() {
		return 
				(" \n"+"ID: "+ id + "\n"+
						"Nombre de la Patologia presentada: "+ nombre_patologia + "\n"+
						"Descripcion de los Sistomas presentados: "+descripción+ "\n"+
						"Medicacion indicada:" +medicacion+ "\n"+
						"Fecha que presento la Patologia: "+formatocorto2.format(fecha_p.getTime())+"\n");
	
			
	}
	
	
	 
}

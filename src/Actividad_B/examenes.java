/**
 * 
 */
package Actividad_B;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

/**
 * @author Matias Machin
 *
 */
public class examenes {
	
	private int id;
	private String nombre_examen;
	private String tipo_examen;
	private GregorianCalendar fecha_a;

	/**
	 * @param id
	 * @param nombre_examen
	 * @param tipo_examen
	 * @param fecha_a
	 */
	public examenes(int id, String nombre_examen, String tipo_examen, GregorianCalendar fecha_a) {
		this.id = id;
		this.nombre_examen = nombre_examen;
		this.tipo_examen = tipo_examen;
		this.fecha_a = fecha_a;
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
	 * Metodo getter del atributo nombre_examen
	 * @return the nombre_examen
	 */
	public String getNombre_examen() {
		return nombre_examen;
	}

	/**
	 * Metodo setter del atributo nombre_examen
	 * @param nombre_examen the nombre_examen to set
	 */
	public void setNombre_examen(String nombre_examen) {
		this.nombre_examen = nombre_examen;
	}

	/**
	 * Metodo getter del atributo tipo_examen
	 * @return the tipo_examen
	 */
	public String getTipo_examen() {
		return tipo_examen;
	}

	/**
	 * Metodo setter del atributo tipo_examen
	 * @param tipo_examen the tipo_examen to set
	 */
	public void setTipo_examen(String tipo_examen) {
		this.tipo_examen = tipo_examen;
	}

	/**
	 * Metodo getter del atributo fecha_a
	 * @return the fecha_a
	 */
	public GregorianCalendar getFecha_a() {
		return fecha_a;
	}

	/**
	 * Metodo setter del atributo fecha_a
	 * @param fecha_a the fecha_a to set
	 */
	public void setFecha_a(GregorianCalendar fecha_a) {
		this.fecha_a = fecha_a;
	}
	SimpleDateFormat formatocorto1 =new SimpleDateFormat("dd/MM/yyyy"); // formato corto de fecha
	
	
	@Override
	public String toString() {
		return (" \n"+"ID: "+ id + "\n"+
				"Nombre del Examen: "+ nombre_examen + "\n"+
				"Tipo de Examen: "+tipo_examen+ "\n"+
				"Fecha de Aplicacion: "+formatocorto1.format(fecha_a.getTime())+"\n");
				
				
				
	}


	
	
	
	

}

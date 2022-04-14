/**
 * 
 */
package Actividad_B;

/**
 * @author Matias Machin
 *
 */
public class producto {
	
	protected String nombre;
	public double costo;
	
	/**
	 * @param nombre
	 * @param costo
	 * @param cantidad
	 */
	public producto(String nombre, double costo) {
		this.nombre = nombre;
		this.costo = costo;
			
		
	}
	/**
	 * Metodo getter del atributo nombre
	 * @return the nombre
	 */
	public  String getNombre() {
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
	 * Metodo getter del atributo costo
	 * @return the costo
	 */
	public double getCosto() {
		return costo;
	}
	/**
	 * Metodo setter del atributo costo
	 * @param costo the costo to set
	 */
	public void setCosto(double costo) {
		this.costo = costo;
	}
	
	@Override
	public String toString() {
		return ( "Producto: " + nombre + "\n"+
				    "Costo: " + costo +  "\n");
	}
	
	 

}

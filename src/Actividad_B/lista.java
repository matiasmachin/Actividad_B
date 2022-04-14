/**
 * 
 */
package Actividad_B;

/**
 * @author Matias Machin
 *
 */
public class lista {
	public int cantidad;
	public producto productos;
	/**
	 * @param cantidad
	 * @param productos
	 */
	public lista(int cantidad, producto productos) {
		this.cantidad = cantidad;
		this.productos = productos;
	}
	/**
	 * Metodo getter del atributo cantidad
	 * @return the cantidad
	 */
	public int getCantidad() {
		return cantidad;
	}
	/**
	 * Metodo setter del atributo cantidad
	 * @param cantidad the cantidad to set
	 */
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	/**
	 * Metodo getter del atributo productos
	 * @return the productos
	 */
	public producto getProductos() {
		return productos;
	}
	/**
	 * Metodo setter del atributo productos
	 * @param productos the productos to set
	 */
	public void setProductos(producto productos) {
		this.productos = productos;
	}
	
	@Override
	public String toString() {
		return ("Cantidad: "+ cantidad + "\n"+
				   productos + "\n" );
				
	}

	
	

}

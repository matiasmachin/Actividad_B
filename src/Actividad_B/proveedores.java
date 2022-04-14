/**
 * 
 */
package Actividad_B;

/**
 * @author kyle
 *
 */
public class proveedores {
	
	private int id;
	private String cif;
	private String nombreempresa;
	private String vendedor; 
	private String telefono;
	private String direccion;
	private String email;
	private String producto;
	private double preciocosto;
	/**
	 * @param id
	 * @param cif
	 * @param nombreempresa
	 * @param vendedor
	 * @param telefono
	 * @param direccion
	 * @param email
	 * @param producto
	 * @param preciocosto
	 */
	public proveedores(int id, String cif, String nombreempresa, String vendedor, String telefono, String direccion,
			String email, String producto, double preciocosto) {
		this.id = id;
		this.cif = cif;
		this.nombreempresa = nombreempresa;
		this.vendedor = vendedor;
		this.telefono = telefono;
		this.direccion = direccion;
		this.email = email;
		this.producto = producto;
		this.preciocosto = preciocosto;
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
	 * @return the cif
	 */
	public String getCif() {
		return cif;
	}
	/**
	 * @param cif the cif to set
	 */
	public void setCif(String cif) {
		this.cif = cif;
	}
	/**
	 * @return the nombreempresa
	 */
	public String getNombreempresa() {
		return nombreempresa;
	}
	/**
	 * @param nombreempresa the nombreempresa to set
	 */
	public void setNombreempresa(String nombreempresa) {
		this.nombreempresa = nombreempresa;
	}
	/**
	 * @return the vendedor
	 */
	public String getVendedor() {
		return vendedor;
	}
	/**
	 * @param vendedor the vendedor to set
	 */
	public void setVendedor(String vendedor) {
		this.vendedor = vendedor;
	}
	/**
	 * @return the telefono
	 */
	public String getTelefono() {
		return telefono;
	}
	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}
	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the producto
	 */
	public String getProducto() {
		return producto;
	}
	/**
	 * @param producto the producto to set
	 */
	public void setProducto(String producto) {
		this.producto = producto;
	}
	/**
	 * @return the preciocosto
	 */
	public double getPreciocosto() {
		return preciocosto;
	}
	/**
	 * @param preciocosto the preciocosto to set
	 */
	public void setPreciocosto(double preciocosto) {
		this.preciocosto = preciocosto;
	}
	@Override
	public String toString() {
		return "proveedores [id=" + id + ", cif=" + cif + ", nombreempresa=" + nombreempresa + ", vendedor=" + vendedor
				+ ", telefono=" + telefono + ", direccion=" + direccion + ", email=" + email + ", producto=" + producto
				+ ", preciocosto=" + preciocosto + "]";
	}
	
	
	

}

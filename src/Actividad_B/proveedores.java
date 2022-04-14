/**
 * 
 */
package Actividad_B;

/**
 * @author kyle
 *
 */
public class proveedores{
	private final int maxproductos=100;
	
	private int id;
	private String cif;
	private String nombreempresa;
	private String vendedor; 
	private String telefono;
	private String direccion;
	private String email;
	private producto productos;
	public lista[] listado;
	private int nroproducto;
	
	/**
	 * @param id
	 * @param cif
	 * @param nombreempresa
	 * @param vendedor
	 * @param telefono
	 * @param direccion
	 * @param email
	 * @param productos
	 * @param nroproducto
	 */
	public proveedores(int id, String cif, String nombreempresa, String vendedor, String telefono, String direccion,
			String email,String nombre, double costo) {
		this.id = id;
		this.cif = cif;
		this.nombreempresa = nombreempresa;
		this.vendedor = vendedor;
		this.telefono = telefono;
		this.direccion = direccion;
		this.email = email;
		this.productos = new producto(nombre,costo);
		this.listado=new lista[maxproductos];
		this.nroproducto = 0;
	}

	public proveedores (int id, String cif, String nombreempresa, String vendedor, String telefono, String direccion,	String email, producto productos){
		this(id, cif, nombreempresa, vendedor, telefono, direccion, email,productos.getNombre(),productos.getCosto() );
		
		
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
	 * Metodo getter del atributo cif
	 * @return the cif
	 */
	public String getCif() {
		return cif;
	}

	/**
	 * Metodo setter del atributo cif
	 * @param cif the cif to set
	 */
	public void setCif(String cif) {
		this.cif = cif;
	}

	/**
	 * Metodo getter del atributo nombreempresa
	 * @return the nombreempresa
	 */
	public String getNombreempresa() {
		return nombreempresa;
	}

	/**
	 * Metodo setter del atributo nombreempresa
	 * @param nombreempresa the nombreempresa to set
	 */
	public void setNombreempresa(String nombreempresa) {
		this.nombreempresa = nombreempresa;
	}

	/**
	 * Metodo getter del atributo vendedor
	 * @return the vendedor
	 */
	public String getVendedor() {
		return vendedor;
	}

	/**
	 * Metodo setter del atributo vendedor
	 * @param vendedor the vendedor to set
	 */
	public void setVendedor(String vendedor) {
		this.vendedor = vendedor;
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
	 * Metodo getter del atributo email
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Metodo setter del atributo email
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
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

	/**
	 * Metodo getter del atributo nroproducto
	 * @return the nroproducto
	 */
	public int getNroproducto() {
		return nroproducto;
	}

	/**
	 * Metodo setter del atributo nroproducto
	 * @param nroproducto the nroproducto to set
	 */
	public void setNroproducto(int nroproducto) {
		this.nroproducto = nroproducto;
	}



	  public void anadirlista(lista a) { 
		  if (nroproducto<maxproductos) {
		  this.listado[nroproducto]= a;
		  nroproducto++; 
		  } else {
		  System.out.println("No se pueden anadir productos!!..Cupo Lleno"); 
		  } 
		  }
	
	  private String mostrarlista() {
		  String listacadena="";
		  double total_factura=0;
		   for (int i = 0;i<nroproducto;i++) { 
			listacadena+=this.listado[i].toString()+"\n";
		   } 
		   return listacadena; }






  

	
	
	
	
	@Override
	public String toString() {
		return (" Codigo id: " + id +  "\n"+
				   " C.I.F:  "+ cif + "\n" +
				   " Nombre de la Empresa: "  + nombreempresa + "\n" +
				   " Nombre del Vendedor: " + vendedor+ "\n"+
				   " Telefono de Contacto: "+ telefono + "\n" +
				   " Direccion: " + direccion+ "\n"+
				   " Correo Electronico: " + email + "\n"+
				   " Listado de Productos Solicitados: "+ " \n"+
				   mostrarlista());
				   
	}
	
	
	
	}

package data;
import logic.Producto;

/**
 * @author Pedro
 *
 */
public class GestionProducto {

	// Atributos
	private Producto productos[] = null;
	public double caja;

	// Constructores
	public GestionProducto() {

	}

	public GestionProducto(Producto[] productos) {
		this.productos = productos;
	}

	// Methods
	/**
	 * 
	 * @return
	 */
	public Producto[] cargarProductos() {

		return productos;
	}

	/**
	 * 
	 * @param productos
	 */
	public void mostrarProductos(Producto[] productos) {
		for (int i = 0; i < productos.length; i++) {

			System.out.print("\n" + productos[i] + "\n" + "Nombre: " + productos[i].getNombre() + "\n" + "Disponible: "
					+ productos[i].getCantStock() + "\n" + "Precio Unitario: " + productos[i].getPrecioUnit()
					+ " euros."
					+ "\n");

		}
	}		
}
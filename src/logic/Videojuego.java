/**
 * 
 */
package logic;

/**
 * @author Pedro
 *
 */
public class Videojuego extends Producto {

	// Atributo
	private String plataforma;

	// Constructores
	public Videojuego() {

	}

	public Videojuego(String nombre, double precioUnit, int cantStock, boolean disponible, String plataforma) {
		super(nombre, precioUnit, cantStock, disponible, plataforma);
		this.plataforma = plataforma;
	}

	// Methods
	@Override
	public String toString() {
		return "PRODUCTO VIDEOJUEGO\n" + "Platarforma: " + this.plataforma;
	}

	// Gets and Sets
	public String getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}

}

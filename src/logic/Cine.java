package logic;

/**
 * @author Pedro
 *
 */
public class Cine extends Producto {

	// Atributo
	private String director;


	// Constructores
	public Cine() {

	}

	public Cine(String nombre, double precioUnit, int cantStock, boolean disponible, String director) {
		super(nombre, precioUnit, cantStock, disponible, director);
		this.director = director;
	}

	// Methods
	@Override
	public String toString() {
		return "PRODUCTO CINE\n" + "Director: " + this.director;
	}

	// Gets and Sets
	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

}
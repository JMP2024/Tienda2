/**
 * 
 */
package logic;

/**
 * @author Pedro
 *
 */
public class Musica extends Producto {

	// Atributo
	private String autor;// Autor de la canción

	// Constructores
	public Musica() {

	}

	public Musica(String nombre, double precioUnit, int cantStock, boolean disponible, String autor) {
		super(nombre, precioUnit, cantStock, disponible, autor);
		this.autor = autor;
	}

	// Methods
	@Override
	public String toString() {
		return "PRODUCTO MUSICA\n" + "Autor: " + this.autor;
	}

	// Gets and Sets
	public String getAutor() {
		return autor;
	}

	public void setAutor(String genero) {
		this.autor = genero;
	}

}

package logic;

/**
 * @author Pedro
 *
 */
public abstract class Producto {

	// Atributos
	private String nombre;
	private double precioUnit;
	private int cantStock;
	private boolean disponible = false;
	public static int dimesionArray;
	public String genero;

	// Constructores
	public Producto() {

	}

	/**
	 * Constructor clase producto con 5 parametros
	 * 
	 * @param nombre
	 * @param precioUnit
	 * @param cantStock
	 * @param disponible
	 * @param genero
	 */
	public Producto(String nombre, double precioUnit, int cantStock, boolean disponible, String genero) {

		this.nombre = nombre;
		this.precioUnit = precioUnit;
		this.cantStock = cantStock;
		this.disponible = disponible;
		this.genero = genero;

		// Se obtiene con esta variable la dimensión del array. Según número de
		// instancias del constructor
		dimesionArray++;
	}

	public String getAutor() {
		return genero;
	}

	public void setAutor(String genero) {
		this.genero = genero;
	}

	/**
	 * Nos devuelve si hay stock de un producto o no
	 * 
	 * @return
	 */
	public boolean isDisponible() {
		if (getCantStock() > 0) {
			this.disponible = true;
		}
		return this.disponible;
	}

	// Métodos Get and Set

	/**
	 * 
	 * @return
	 */
	public String getNombre() {
		return this.nombre;
	}

	/**
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * 
	 * @return
	 */
	public double getPrecioUnit() {
		return this.precioUnit;
	}

	/**
	 * 
	 * @param precioUnit
	 */
	public void setPrecioUnit(double precioUnit) {
		this.precioUnit = precioUnit;
	}

	/**
	 * 
	 * @return
	 */
	public int getCantStock() {
		return this.cantStock;
	}

	/**
	 * 
	 * @param cantStock
	 */
	public void setCantStock(int cantStock) {
		this.cantStock = cantStock;
	}

	/**
	 * 
	 * @param disponible
	 */
	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

}

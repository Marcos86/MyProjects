package j8t.leccion01_streams.concepto;


/**
 * The Class Factura.
 * Link ejemplo: http://www.arquitecturajava.com/java-8-stream-y-workflow/
 */
public class Factura {

	/** The nombre. */
	public String nombre;

	/** The importe. */
	public int importe;

	/**
	 * Instantiates a new factura.
	 */
	public Factura() {}

	
	/**
	 * Instantiates a new factura.
	 *
	 * @param nombre the nombre
	 */
	public Factura(String nombre) {
		this.nombre = nombre;
	}


	/**
	 * Instantiates a new factura.
	 *
	 * @param nombre the nombre
	 * @param importe the importe
	 */
	public Factura(String nombre, int importe) {
		this.nombre = nombre;
		this.importe = importe;
	}
	
	
	/**
	 * Gets the nombre.
	 *
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Sets the nombre.
	 *
	 * @param nombre the new nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Gets the importe.
	 *
	 * @return the importe
	 */
	public int getImporte() {
		return importe;
	}

	/**
	 * Sets the importe.
	 *
	 * @param importe the new importe
	 */
	public void setImporte(int importe) {
		this.importe = importe;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format(
				"Person[nombre=%s, importe=%s]",
				nombre, importe);
	}

}
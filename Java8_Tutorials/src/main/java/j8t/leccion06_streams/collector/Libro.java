package j8t.leccion06_streams.collector;

/**
 * The Class Libro.
 */
public class Libro {

	/** The titulo. */
	private String titulo;
	
	/** The paginas. */
	private int paginas;


	/**
	 * Instantiates a new libro.
	 *
	 * @param titulo the titulo
	 * @param paginas the paginas
	 */
	public Libro(String titulo, int paginas) {
		super();
		this.titulo = titulo;
		this.paginas = paginas;
	}
	
	/**
	 * Gets the titulo.
	 *
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}
	
	/**
	 * Sets the titulo.
	 *
	 * @param titulo the new titulo
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	/**
	 * Gets the paginas.
	 *
	 * @return the paginas
	 */
	public int getPaginas() {
		return paginas;
	}
	
	/**
	 * Sets the paginas.
	 *
	 * @param paginas the new paginas
	 */
	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}
	
	
    @Override
    public String toString() {
        return String.format(
                "Libro[titulo=%s, paginas=%s]",
                titulo, paginas);
    }
}

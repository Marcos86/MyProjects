package j8t.leccion11_flatmap;

import java.util.ArrayList;
import java.util.List;

/**
 * The Class Persona.
 * Link ejemplo:http://www.arquitecturajava.com/java-8-flatmap/
 */
public class Persona {

	/** The nombre. */
	private String nombre;
	
	/** The lista. */
	private List<Viaje> lista= new ArrayList<Viaje>();
	
	/**
	 * Gets the nombre.
	 *
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Adds the viaje.
	 *
	 * @param v the v
	 */
	public void addViaje(Viaje v) {
		lista.add(v);
	}
	
	/**
	 * Gets the lista.
	 *
	 * @return the lista
	 */
	public List<Viaje> getLista() {
		return lista;
	}

	/**
	 * Instantiates a new persona.
	 *
	 * @param nombre the nombre
	 */
	public Persona(String nombre) {
		super();
		this.nombre = nombre;
	}

	/**
	 * Sets the nombre.
	 *
	 * @param nombre the new nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}

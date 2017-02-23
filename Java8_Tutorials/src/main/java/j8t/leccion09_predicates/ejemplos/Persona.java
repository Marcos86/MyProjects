package j8t.leccion09_predicates.ejemplos;

/**
 * The Class Persona.
 * Link ejemplo:http://www.arquitecturajava.com/java-predicate-interface-y-sus-metodos/
 * 				http://www.arquitecturajava.com/utilizando-java-8-predicate/
 */
public class Persona {

	/** The nombre. */
	private String nombre;
	
	/** The apellidos. */
	private String apellidos;
	
	/** The edad. */
	private int edad;
	
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
	 * Gets the apellidos.
	 *
	 * @return the apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}
	
	/**
	 * Sets the apellidos.
	 *
	 * @param apellidos the new apellidos
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	/**
	 * Gets the edad.
	 *
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}
	
	/**
	 * Sets the edad.
	 *
	 * @param edad the new edad
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	/**
	 * Instantiates a new persona.
	 *
	 * @param nombre the nombre
	 * @param apellidos the apellidos
	 * @param edad the edad
	 */
	public Persona(String nombre, String apellidos, int edad) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	}
	
    @Override
    public String toString() {
        return String.format(
                "Person[nombre=%s, apellidos=%s, edad=%s]",
                nombre, apellidos, edad);
    }

}

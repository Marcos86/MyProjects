package j8t.leccion05_optional;



/**
 * The Class Persona.
 */
public class Persona {
    
    /** The nombre. */
    public String nombre;

    /**
     * Instantiates a new persona.
     */
    public Persona() {}

    /**
     * Instantiates a new persona.
     *
     * @param nombre the nombre
     */
    public Persona(String nombre) {
        this.nombre = nombre;
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
	
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return String.format(
                "Persona[nombre=%s]",
                nombre);
    }

}
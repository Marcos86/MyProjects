package j8t.leccion07_mixins.conceptoDefaultMethodInterface;

/**
 * The Class Persona.
 * Link ejemplo: http://www.arquitecturajava.com/java-8-default-methods-y-extensibilidad/
 */
public class Persona implements InformacionObjeto {

	/** The nombre. */
	private String nombre;
	
	
	/** The edad. */
	private String edad;
	
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
	 * Gets the edad.
	 *
	 * @return the edad
	 */
	public String getEdad() {
		return edad;
	}
	
	/**
	 * Sets the edad.
	 *
	 * @param edad the new edad
	 */
	public void setEdad(String edad) {
		this.edad = edad;
	
	}
}
package j8t.leccion4_optional;

import java.util.ArrayList;
import java.util.List;

/**
 * The Class NullPointerExcepcionJava7.
 * Link ejemplo: http://www.arquitecturajava.com/usando-java-8-optional/
 */
public class NullPointerExcepcionJava7 {

	/** The lista. */
	static List<Persona> lista= new ArrayList<Persona>();
	static {
		lista.add(new Persona("pedro"));
		lista.add(new Persona("angel"));
		lista.add(new Persona("ana"));
	}


	/**
	 * Buscar.
	 *
	 * @param nombre the nombre
	 * @return the persona
	 */
	public Persona buscar(String nombre) {

		for (Persona p:lista) {
			if (p.getNombre().equals(nombre)) {
				return p;
			}
		}

		return null;
	}

}

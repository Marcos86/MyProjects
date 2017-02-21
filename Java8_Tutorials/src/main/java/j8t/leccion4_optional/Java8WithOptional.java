package j8t.leccion4_optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * The Class Java8WithOptional.
 * Link ejemplo: http://www.arquitecturajava.com/usando-java-8-optional/
 */
public class Java8WithOptional {

	/** The lista. */
	static List<Persona> lista = new ArrayList<Persona>();
	static {
		lista.add(new Persona("pedro"));
		lista.add(new Persona("angel"));
		lista.add(new Persona("ana"));
	}

	/**
	 * Buscar.
	 *
	 * @param nombre the nombre
	 * @return the optional
	 */
	public Optional<Persona> buscarSinStreams(String nombre) {

		for (Persona p:lista) {
			if (p.getNombre().equals(nombre)) {
				return  Optional.of(p);
			}
		}

		return Optional.empty();
	}



	/**
	 * Buscar con streams.
	 *
	 * @param nombre the nombre
	 * @return the optional
	 */
	public Optional<Persona> buscarConStreams(String nombre) {
		return lista.stream().filter(p->p.getNombre().equals(nombre)).findFirst();
	}

}

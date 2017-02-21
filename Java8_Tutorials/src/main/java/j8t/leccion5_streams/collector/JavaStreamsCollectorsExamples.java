package j8t.leccion5_streams.collector;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;



/**
 * The Class CollectorExampleOfUse.
 * Link ejemplo: http://www.arquitecturajava.com/java-stream-collectors-y-su-uso/
 */
public class JavaStreamsCollectorsExamples {
	
	/** The i. */
	private static int i = 1;

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		Libro l1= new Libro ("El señor de los anillos",1000);
		Libro l2= new Libro ("La fundacion",500);
		Libro l3= new Libro ("El caliz de fuego",600);

		recorrerStream(l1, l2, l3);

		recorrerStreamYPintarEnMismaLinea (l1, l2, l3);
		
		sumarPaginasDeLibros(l1, l2, l3);

		recorrerArrayCreadoDesdeSteam (l1, l2, l3);

		convertirAListUnStream(l1, l2, l3);

		convertirASetUnStream(l1, l2, l3);

	}

	/**
	 * Recorrer stream.
	 *
	 * @param l1 the l 1
	 * @param l2 the l 2
	 * @param l3 the l 3
	 */
	private static void recorrerStream(Libro l1, Libro l2, Libro l3) {
		comenzarEjemplo("recorrerStream");
		
		// Creamos un stream y recorremos dicho stream
		Stream<Libro> st = Stream.of(l1, l2, l3);
		st.forEach((l) -> System.out.println(l.getTitulo()));
		
		terminarEjemplo();
	}


	/**
	 * Recorrer stream Y pintar en misma linea.
	 *
	 * @param l1 the l 1
	 * @param l2 the l 2
	 * @param l3 the l 3
	 */
	private static void recorrerStreamYPintarEnMismaLinea(Libro l1, Libro l2, Libro l3) {
		comenzarEjemplo("recorrerStreamYPintarEnMismaLinea");
		
		// Creamos un stream, recorremos dicho stream y pintamos todos los titulos en la misma linea
		Stream<Libro> st = Stream.of(l1, l2, l3);
		String resultado = st.map((l) -> l.getTitulo()).collect(Collectors.joining(","));
		System.out.println(resultado);
		
		terminarEjemplo();
	}
	

	/**
	 * Sumar paginas de libros.
	 *
	 * @param l1 the l 1
	 * @param l2 the l 2
	 * @param l3 the l 3
	 */
	private static void sumarPaginasDeLibros(Libro l1, Libro l2, Libro l3) {
		comenzarEjemplo("sumarPaginasDeLibros");
		
		// Creamos un stream, lo recorremos y juntamos el resultado en un integer
		
		Stream<Libro> st = Stream.of(l1, l2, l3);
		Optional<Integer> resultado = st.map((l) -> l.getPaginas()).collect(Collectors.reducing(Integer::sum));
		System.out.println(resultado.get());
		
		terminarEjemplo();
		
	}

	/**
	 * Recorrer array creado desde steam.
	 *
	 * @param l1 the l 1
	 * @param l2 the l 2
	 * @param l3 the l 3
	 */
	private static void recorrerArrayCreadoDesdeSteam (Libro l1, Libro l2, Libro l3) {
		comenzarEjemplo("recorrerArrayCreadoDesdeSteam");
		
		// Creamos un stream con los 3 libros, los pasamos a [] y lo pintamos
		Stream<Libro> st = Stream.of(l1, l2, l3);
		Libro[] arrayLibro= st.toArray(Libro[]::new);
		for(int i=0;i<arrayLibro.length;i++) {
			System.out.println(arrayLibro[i].getPaginas());
		}

		terminarEjemplo();
	}


	/**
	 * Convertir A list un stream.
	 *
	 * @param l1 the l 1
	 * @param l2 the l 2
	 * @param l3 the l 3
	 */
	private static void convertirAListUnStream(Libro l1, Libro l2, Libro l3) {
		comenzarEjemplo("convertirAListUnStream");
		
		// Creamos un stream con los 3 libros y los pintamos
		System.out.println("Recorriendo stream...");
		Stream<Libro> st = Stream.of(l1, l2, l3);
		st.forEach((l) -> System.out.println(l.getTitulo()));
		
		System.out.println("");
		
		// Convertimos a List y lo recorremos
		System.out.println("Recorriendo list...");
		// Importante volver a crear el stream porque cuando se se ha procesado un vez se cierra automaticamente
		st = Stream.of(l1, l2, l3);
		List<Libro> list = st.collect(Collectors.toList());
		for (Libro libro:list) {
			System.out.println(libro.getTitulo());
		}

		terminarEjemplo();

	}


	/**
	 * Convertir A set un stream.
	 *
	 * @param l1 the l 1
	 * @param l2 the l 2
	 * @param l3 the l 3
	 */
	private static void convertirASetUnStream(Libro l1, Libro l2, Libro l3) {
		comenzarEjemplo("convertirASetUnStream");
		
		Stream<Libro> st = Stream.of(l1, l2, l3);
		Set<Libro> lista = st.collect(Collectors.toSet());
		for (Libro l : lista) {
			System.out.println(l.getTitulo());
		}
		terminarEjemplo();

	}


	/**
	 * Comenzar ejemplo.
	 *
	 * @param titulo the titulo
	 */
	private static void comenzarEjemplo(String titulo) {
		System.out.println("--->>>EJEMPLO " + i + ": " + titulo + "<<<---");	
		i++;
	}


	/**
	 * Terminar ejemplo.
	 */
	private static void terminarEjemplo() {
		System.out.println();
		System.out.println("**********************************************************************");
		System.out.println();
	}

}

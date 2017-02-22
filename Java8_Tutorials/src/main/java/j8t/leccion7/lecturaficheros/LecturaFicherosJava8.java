package j8t.leccion7.lecturaficheros;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * The Class LecturaFicherosJava8.
 * Link ejemplo: https://www.mkyong.com/java8/java-8-stream-read-a-file-line-by-line/
 */
public class LecturaFicherosJava8 extends LecturaFicheros{
	
	private static final String LINEA_DEFECTO = "linea3";

	public void mostrarTodasLineasFichero1() {
		comenzarEjemplo("LecturaFicherosJava8.mostrarTodasLineasFichero1");
		String rutaFichero = obtenerRutaFichero();

		try (Stream<String> stream = Files.lines(Paths.get(rutaFichero))) {

			stream.forEach(System.out::println);

		} catch (IOException e) {
			e.printStackTrace();
		}
		terminarEjemplo();
	}
	
	
	public void mostrarTodasLineasFichero2() {
		comenzarEjemplo("LecturaFicherosJava8.mostrarTodasLineasFichero2");
		String rutaFichero = obtenerRutaFichero();
		List<String> list = new ArrayList<>();

		try (BufferedReader br = Files.newBufferedReader(Paths.get(rutaFichero))) {

			//br returns as stream and convert it into a List
			list = br.lines().collect(Collectors.toList());

		} catch (IOException e) {
			e.printStackTrace();
		}

		list.forEach(System.out::println);

		terminarEjemplo();
	}


	public void mostrarTodasLineasFicheroMenosUna() {
		comenzarEjemplo("LecturaFicherosJava8.mostrarTodasLineasFicheroMenosUna");
		String rutaFichero = obtenerRutaFichero();
		List<String> list = new ArrayList<>();

		try (Stream<String> stream = Files.lines(Paths.get(rutaFichero))) {

			list = stream
					.filter(line -> !line.startsWith(LINEA_DEFECTO))
					.collect(Collectors.toList());

		} catch (IOException e) {
			e.printStackTrace();
		}

		list.forEach(System.out::println);
		terminarEjemplo();
	}

}

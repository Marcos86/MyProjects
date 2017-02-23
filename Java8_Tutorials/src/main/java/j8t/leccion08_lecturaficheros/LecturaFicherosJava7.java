package j8t.leccion08_lecturaficheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * The Class LecturaFicherosJava7.
 * Link ejemplo: https://www.mkyong.com/java8/java-8-stream-read-a-file-line-by-line/
 */
public class LecturaFicherosJava7 extends LecturaFicheros{


	/**
	 * Mostrar todas las lineas de un fichero 1.
	 */
	public void mostrarTodasLasLineasDeUnFichero1() {
		comenzarEjemplo("Java7LecturaFicheros.mostrarTodasLasLineasDeUnFichero1");
		String rutaFichero = obtenerRutaFichero();

		try (BufferedReader br = new BufferedReader(new FileReader(rutaFichero))) {

			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		terminarEjemplo();
	}



	/**
	 * Mostrar todas las lineas de un fichero 2.
	 */
	public void mostrarTodasLasLineasDeUnFichero2() {
		comenzarEjemplo("Java7LecturaFicheros.mostrarTodasLasLineasDeUnFichero2");
		String rutaFichero = obtenerRutaFichero();
		try (Scanner scanner = new Scanner(new File(rutaFichero))) {

			while (scanner.hasNext()){
				System.out.println(scanner.nextLine());
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		terminarEjemplo();
	}

}

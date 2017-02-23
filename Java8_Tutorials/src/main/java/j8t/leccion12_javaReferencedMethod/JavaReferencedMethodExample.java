package j8t.leccion12_javaReferencedMethod;

import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;

/**
 * The Class JavaReferencedMethodExample.
 * Link ejemplo: http://www.arquitecturajava.com/utilizando-un-java-reference-method/
 */
public class JavaReferencedMethodExample {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		listarDirectoriosJava7();
		listarDirectoriosJava8();

	}


	/**
	 * Listar directorios java 7.
	 */
	private static void listarDirectoriosJava7() {
		System.out.println("Listando directorios sin utilizar un java Referenced Method");
		File[] ficheros=new File(".").listFiles(new FileFilter() {

			public boolean accept(File fichero) {

				return fichero.isDirectory();
			}
		});

		for(File fichero :ficheros) {
			System.out.println(fichero.getName());
		}
		espaciarCaso();
	}
	
	/**
	 * Listar directorios java 8.
	 */
	private static void listarDirectoriosJava8() {
		System.out.println("Listando directorios utilizando un java Referenced Method");
		File[] ficheros=new File(".").listFiles(File::isDirectory);
		Arrays.asList(ficheros).stream().forEach (f -> System.out.println(f.getName()));
		espaciarCaso();
	}

	/**
	 * Espaciar caso.
	 */
	private static void espaciarCaso() {
		System.out.println("---------------------------------------------------------------------------------------------------------------");
		System.out.println("---------------------------------------------------------------------------------------------------------------");
		System.out.println();
		System.out.println();
	}

}

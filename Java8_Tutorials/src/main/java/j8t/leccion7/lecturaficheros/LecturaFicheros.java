package j8t.leccion7.lecturaficheros;

import java.io.File;

/**
 * The Class LecturaFicheros.
 */
public class LecturaFicheros {

	/** The i. */
	private int i = 1;
	
	/** The Constant RUTA_DEFECTO. */
	private static final String RUTA_DEFECTO = "ficheros/Fichero.txt";

	/**
	 * Obtener fichero.
	 *
	 * @return the file
	 */
	protected String obtenerRutaFichero() {
		return obtenerFichero(RUTA_DEFECTO);
	}

	/**
	 * Obtener fichero.
	 *
	 * @param ruta the ruta
	 * @return the file
	 */
	protected String obtenerFichero(String ruta) {
		ClassLoader classLoader = getClass().getClassLoader();
		File file = new File(classLoader.getResource(ruta).getFile());
		String rutaFichero = file.getAbsolutePath();
		return rutaFichero;
	}

	/**
	 * Comenzar ejemplo.
	 *
	 * @param titulo the titulo
	 */
	protected void comenzarEjemplo(String titulo) {
		System.out.println("--->>>EJEMPLO " + i + ": " + titulo + "<<<---");	
		i++;
	}


	/**
	 * Terminar ejemplo.
	 */
	protected void terminarEjemplo() {
		System.out.println();
		System.out.println("**********************************************************************");
		System.out.println();
	}
}

package j8t.leccion7_lecturaficheros;

/**
 * The Class LecturaFicherosExample.
 * Link ejemplo:https://www.mkyong.com/java8/java-8-stream-read-a-file-line-by-line/
 */
public class LecturaFicherosExample {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		LecturaFicherosJava7 lecturaJava7 = new LecturaFicherosJava7();
		lecturaJava7.mostrarTodasLasLineasDeUnFichero1();
		lecturaJava7.mostrarTodasLasLineasDeUnFichero2();
		
		LecturaFicherosJava8 lecturaJava8 = new LecturaFicherosJava8();
		lecturaJava8.mostrarTodasLineasFichero1();
		lecturaJava8.mostrarTodasLineasFichero2();
		lecturaJava8.mostrarTodasLineasFicheroMenosUna();
		
	}

}

package j8t.leccion10_streams.paralelizacion;

import java.util.stream.DoubleStream;

/**
 * The Class SumasInfinitas.
 */
public class SumasInfinitas {

	/** The Constant NUM_ELEMENTOS. */
	private static final long NUM_ELEMENTOS = 10000000;

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		System.out.println("Elementos a procesar: " + NUM_ELEMENTOS);
		sumasInfinitasSinStreams();
		sumasInfinitasConStreams();
		sumasInfinitasConStreamsParalelizando();
	}

	/**
	 * Sumas infinitas sin streams.
	 */
	public static void sumasInfinitasSinStreams() {
		double resultado=0;
		long t1=System.nanoTime();
		for(int i=0;i<NUM_ELEMENTOS;i++) {
			resultado=resultado+(i+1);
		}
		long t2=System.nanoTime();

		mostrarResultadoOperacion("OPERACION SIN STREAMS", resultado, t1, t2);
	}

	/**
	 * Sumas infinitas con streams.
	 */
	public static void sumasInfinitasConStreams() {
		long t1=System.nanoTime();
		double resultado=DoubleStream.iterate(0,i->i+1).limit(NUM_ELEMENTOS + 1).sum();
		long t2=System.nanoTime();

		mostrarResultadoOperacion("OPERACION CON STREAMS", resultado, t1, t2);
	}


	/**
	 * Sumas infinitas con streams paralelizando.
	 */
	public static void sumasInfinitasConStreamsParalelizando() {
		long t1=System.nanoTime();
		double resultado=DoubleStream.iterate(0,i->i+1).limit(NUM_ELEMENTOS + 1).parallel().sum();
		long t2=System.nanoTime();

		mostrarResultadoOperacion("OPERACION CON STREAMS PARARELIZANDO", resultado, t1, t2);
	}


	/**
	 * Mostrar resultado operacion.
	 *
	 * @param titulo the titulo
	 * @param total the total
	 * @param t1 the t 1
	 * @param t2 the t 2
	 */
	private static void mostrarResultadoOperacion(String titulo, double total, long t1, long t2) {
		System.out.println(titulo + " *************");
		System.out.println("RESULTADO: " + total);
		System.out.println("TIEMPO: " + (t2-t1) + " nanosegundos");
		System.out.println("**********************************");
		System.out.println("");
	}

}

package j8t.leccion9_streams.paralelizacion;

import java.util.Arrays;
import java.util.List;

/**
 * The Class ProcesarElementosArrayListConcurrente.
 * Link ejemplo: http://www.arquitecturajava.com/expresiones-lambda-y-ejecucion-en-paralelo/
 */
public class ProcesarElementosArrayListConcurrente {
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		List<Integer> lista= Arrays.asList(100,200,300,100,500);
		recorrerArrayConStreamSinParalelizar(lista);
		recorrerArrayConStreamPararelizando(lista);
		
	}

	/**
	 * Recorrer array con stream sin paralelizar.
	 */
	private static void recorrerArrayConStreamSinParalelizar(List<Integer> lista) {
		System.out.println("Recorriendo array sin paralelizar y calculando el iva por elemento....");
		double total=lista.stream()
		.filter(elemento->(elemento>200))
		.mapToDouble(elemento->elemento*1.21).sum();
		 
		System.out.println(total);
		System.out.println("**********************************************************************");
		System.out.println();
	}
	
	private static void recorrerArrayConStreamPararelizando (List<Integer> lista) {
		System.out.println("Recorriendo array paralelizando y calculando el iva por elemento....");
		double total=lista.stream()
		.parallel()
		.filter(elemento->(elemento>200))
		.mapToDouble(elemento->elemento*1.21).sum();
		 
		System.out.println(total);
		System.out.println("**********************************************************************");
		System.out.println();
	}
}

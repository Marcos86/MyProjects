package j8t.leccion05_optional;

import java.util.Optional;

/**
 * The Class NullPointerExcepcionJava7vsJava8WithOptional.
 * Link ejemplo: http://www.arquitecturajava.com/usando-java-8-optional/
 */
public class NullPointerExcepcionJava7vsJava8WithOptional {
	
	public static void main(String[] args) {
		ejemploConJava8();
		ejemploConJava7();
	}

	private static void ejemploConJava8() {
		Java8WithOptional j8wo= new Java8WithOptional();
		Optional<Persona> opSinStreams=j8wo.buscarSinStreams("gema");
		if (opSinStreams.isPresent()) {
			System.out.println(opSinStreams.get().getNombre());
		}else { 
			System.out.println("No hay registros (sin streams)");
		}
		
		
		Optional<Persona> opConStreams=j8wo.buscarConStreams("gema");
		if (opConStreams.isPresent()) {
			System.out.println(opConStreams.get().getNombre());
		}else { 
			System.out.println("No hay registros (con streams)");
		}
		
	}

	private static void ejemploConJava7() {
        NullPointerExcepcionJava7 npeJava7= new NullPointerExcepcionJava7();
        Persona p=npeJava7.buscar("gema");
        System.out.println(p.getNombre());
	}

}

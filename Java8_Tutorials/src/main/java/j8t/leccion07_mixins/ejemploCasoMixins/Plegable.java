package j8t.leccion07_mixins.ejemploCasoMixins;

/**
 * The Interface Plegable.
 */
public interface Plegable {
	 
    /**
     * Plegar.
     */
    public  default void plegar() {
         
        System.out.println("el mueble se pliega");
    }
}
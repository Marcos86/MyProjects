package j8t.leccion6_mixins;

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
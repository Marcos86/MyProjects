package sbpz.vo;

import org.springframework.data.annotation.Id;

/**
 * The Class Number.
 */
public class Number {

    /** The id. */
    @Id
    public String id;

    /** The valor. */
    public int valor;
    
    /** The cadena id. */
    public String cadenaId;

    /**
     * Instantiates a new number.
     */
    public Number() {}

    /**
     * Instantiates a new number.
     *
     * @param valor the valor
     * @param cadenaId the cadena id
     */
    public Number(int valor, String cadenaId) {
        this.valor = valor;
        this.cadenaId = cadenaId;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return String.format(
                "Customer[id=%s, valor='%s', cadenaId='%s']",
                id, valor, cadenaId);
    }

}

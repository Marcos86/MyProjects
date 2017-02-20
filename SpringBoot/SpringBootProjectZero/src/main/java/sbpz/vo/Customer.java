package sbpz.vo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * The Class Customer.
 */
@Document(collection = "customers")
public class Customer {

    /** The id. */
    @Id
    public String id;

    /** The first name. */
    public String firstName;
    
    /** The last name. */
    public String lastName;

    /**
     * Instantiates a new customer.
     */
    public Customer() {}

    /**
     * Instantiates a new customer.
     *
     * @param firstName the first name
     * @param lastName the last name
     */
    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return String.format(
                "Customer[id=%s, firstName='%s', lastName='%s']",
                id, firstName, lastName);
    }

}
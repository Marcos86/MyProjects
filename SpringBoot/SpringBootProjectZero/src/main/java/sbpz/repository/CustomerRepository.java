package sbpz.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import sbpz.vo.Customer;

/**
 * The Interface CustomerRepository.
 */
public interface CustomerRepository extends MongoRepository<Customer, String> {

    /**
     * Find by first name.
     *
     * @param firstName the first name
     * @return the customer
     */
    public Customer findByFirstName(String firstName);
    
    /**
     * Find by last name.
     *
     * @param lastName the last name
     * @return the list
     */
    public List<Customer> findByLastName(String lastName);

}
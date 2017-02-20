package sbpz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import sbpz.config.EndPointUris;
import sbpz.repository.CustomerRepository;
import sbpz.vo.Customer;

/**
 * The Class CustomerController.
 */
@RestController
@RequestMapping (EndPointUris.CLIENTS)

public class CustomerController {
	
	/** The customer repository. */
	@Autowired
	private CustomerRepository customerRepository;
		
    /**
     * Gets the customers.
     *
     * @return the customers
     */
    @RequestMapping( method = RequestMethod.GET )
    public List<Customer> getCustomers() {
    	return customerRepository.findAll();
    }
    
    /**
     * Gets the number of customers.
     *
     * @return the number of customers
     */
    @RequestMapping( method = RequestMethod.GET,
    		value = EndPointUris.COUNT)
    public long getNumberOfCustomers() {
    	return customerRepository.count();
    }
    
    /**
     * Gets the detail of customer.
     *
     * @param clientId the client id
     * @return the detail of customer
     */
    @RequestMapping( method = RequestMethod.GET,
    		value = EndPointUris.CLIENT_ID)
    public Customer getDetailOfCustomer (@PathVariable(name = "clientId", required=true) final String clientId) {
    	return customerRepository.findOne(clientId);
    }
     

    /**
     * Insert customer.
     *
     * @param customer the customer
     * @return the string
     */
    @RequestMapping (method = RequestMethod.POST )
    public String insertCustomer(@RequestBody (required=true) final Customer customer) {
    	
    	Customer customerSaved = customerRepository.save(customer);
    	
    	return customerSaved.id;
    }
        
    /**
     * Delete customer.
     *
     * @param clientId the client id
     */
    @RequestMapping( method = RequestMethod.DELETE,
    		value = EndPointUris.CLIENT_ID)
    public void deleteCustomer(@PathVariable(name = "clientId", required=true) final String clientId) {
    	customerRepository.delete(clientId);
    }
      
    /**
     * Delete all customers.
     */
    @RequestMapping( method = RequestMethod.DELETE, 
    			value = EndPointUris.ALL)
    public void deleteAllCustomers() {
    	customerRepository.deleteAll();
    }
    
    /**
     * Update customer.
     *
     * @param clientId the client id
     * @param customer the customer
     * @throws Exception the exception
     */
    @RequestMapping( method = RequestMethod.PUT,
    		value = EndPointUris.CLIENT_ID)
    public void updateCustomer(
    		@PathVariable(name = "clientId", required=true) final String clientId,
    		@RequestBody (required=true) final Customer customer
    		) throws Exception {
    	
    	Customer customerFromDB = customerRepository.findOne(clientId);
    	
    	if (customerFromDB == null) {
    		throw new Exception("El cliente que se intenta actualizar no está en la base de datos");
    	}
    	
    	if (StringUtils.isEmpty(customer.firstName) || StringUtils.isEmpty(customer.lastName)) {
    		throw new Exception("Informacion incompleta del cliente");    		
    	}
    	customer.id = clientId;
    	
    	customerRepository.save(customer);
    	
    }
    
    /**
     * Patch customer.
     *
     * @param clientId the client id
     * @param customer the customer
     * @throws Exception the exception
     */
    @RequestMapping( method = RequestMethod.PATCH,
    		value = EndPointUris.CLIENT_ID)
    public void patchCustomer(
    		@PathVariable(name = "clientId", required=true) final String clientId,
    		@RequestBody (required=true) final Customer customer
    		) throws Exception {
    	
    	Customer customerFromDB = customerRepository.findOne(clientId);
    	
    	if (customerFromDB == null) {
    		throw new Exception("El cliente que se intenta actualizar no está en la base de datos");
    	}
    	
    	if (!StringUtils.isEmpty(customer.firstName)) {
    		customerFromDB.firstName = customer.firstName;
    	} 
    	
    	if(!StringUtils.isEmpty(customer.lastName)) {
    		customerFromDB.lastName = customer.lastName;
    	}
    	
    	customerRepository.save(customerFromDB);
    	
    }

}

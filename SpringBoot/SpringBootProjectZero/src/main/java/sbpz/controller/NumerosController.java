package sbpz.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import sbpz.config.EndPointUris;

/**
 * The Class NumerosController.
 */
@RestController
@RequestMapping (EndPointUris.NUMEROS)

public class NumerosController {
	
	/** The Constant MAX_NUMEROS. */
	private static final int MAX_NUMEROS = 20;
	
	
    /**
     * Gets the numeros.
     *
     * @return the numeros
     */
    @RequestMapping(method = RequestMethod.GET )
    public List<Integer> getNumeros() {
    	List<Integer> numeros = new ArrayList<Integer>();
    	for (int i=0;i<=MAX_NUMEROS;i++) {
    		numeros.add(i);
    	}
    	
        return numeros;
    }
	

    /**
     * Gets the numeros pares.
     *
     * @return the numeros pares
     */
    @RequestMapping(value=EndPointUris.PARES, method = RequestMethod.GET )
    public List<Integer> getNumerosPares() {
    	List<Integer> pares = new ArrayList<Integer>();
    	for (int i=0;i<=MAX_NUMEROS;i++) {
    		if (i%2 == 0) {
    			pares.add(i);
    		}
    	}
    	
        return pares;
    }
    
    
    /**
     * Gets the numeros impares.
     *
     * @return the numeros impares
     */
    @RequestMapping(value=EndPointUris.IMPARES, method = RequestMethod.GET )
    public List<Integer> getNumerosImpares() {
    	List<Integer> impares = new ArrayList<Integer>();
    	for (int i=0;i<=MAX_NUMEROS;i++) {
    		if (i%2 != 0) {
    			impares.add(i);
    		}
    	}
    	
        return impares;
    }

}

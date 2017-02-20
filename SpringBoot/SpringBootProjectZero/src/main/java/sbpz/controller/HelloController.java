package sbpz.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import sbpz.config.EndPointUris;

/**
 * The Class HelloController.
 */
@RestController
@RequestMapping (EndPointUris.HELLO_WORLD)

public class HelloController {

    /**
     * Hola majo.
     *
     * @return the string
     */
    @RequestMapping(method = RequestMethod.GET )
    public String holaMajo() {
        return "Hola majo";
    }

}

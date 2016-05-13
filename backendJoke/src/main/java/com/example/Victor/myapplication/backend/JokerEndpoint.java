package com.example.Victor.myapplication.backend;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;

import java.util.logging.Logger;

import javax.inject.Named;

/**
 * An endpoint class we are exposing
 */
@Api(
        name = "jokerApi",
        version = "v1",
        resource = "joker",
        namespace = @ApiNamespace(
                ownerDomain = "backend.myapplication.Victor.example.com",
                ownerName = "backend.myapplication.Victor.example.com",
                packagePath = ""
        )
)
public class JokerEndpoint {

    private static final Logger logger = Logger.getLogger(JokerEndpoint.class.getName());

    /**
     * This method gets the <code>Joker</code> object associated with the specified <code>id</code>.
     *
     * @param id The id of the object to be returned.
     * @return The <code>Joker</code> associated with <code>id</code>.
     */
    @ApiMethod(name = "getJoker")
    public Joker getJoker(@Named("id") Long id) {
        // TODO: Implement this function
        logger.info("Calling getJoker method");
        return null;
    }

    @ApiMethod(name = "getJoke")
    public Joker getJoke() {
        // TODO: Implement this function
        logger.info("Calling getJoker method");
        return null;
    }

    /**
     * This inserts a new <code>Joker</code> object.
     *
     * @param joker The object to be added.
     * @return The object to be added.
     */
    @ApiMethod(name = "insertJoker")
    public Joker insertJoker(Joker joker) {
        // TODO: Implement this function
        logger.info("Calling insertJoker method");
        return joker;
    }
}
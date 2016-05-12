package com.example.vic.myapplication.jokeGCM;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;

import java.util.logging.Logger;

import javax.inject.Named;

/**
 * An endpoint class we are exposing
 */
@Api(
        name = "jokeApi",
        version = "v1",
        resource = "joke",
        namespace = @ApiNamespace(
                ownerDomain = "jokeGCM.myapplication.vic.example.com",
                ownerName = "jokeGCM.myapplication.vic.example.com",
                packagePath = ""
        )
)
public class JokeEndpoint {

    private static final Logger logger = Logger.getLogger(JokeEndpoint.class.getName());


    @ApiMethod(name = "getJoke")
    public Joke getJoke() {
        // TODO: Implement this function
        logger.info("Calling getJoke method");
        return null;
    }

    /**
     * This inserts a new <code>Joke</code> object.
     *
     * @param joke The object to be added.
     * @return The object to be added.
     */
    @ApiMethod(name = "insertJoke")
    public Joke insertJoke(Joke joke) {
        // TODO: Implement this function
        logger.info("Calling insertJoke method");
        return joke;
    }
}
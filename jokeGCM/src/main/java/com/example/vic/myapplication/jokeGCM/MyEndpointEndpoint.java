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
        name = "myEndpointApi",
        version = "v1",
        resource = "myEndpoint",
        namespace = @ApiNamespace(
                ownerDomain = "jokeGCM.myapplication.vic.example.com",
                ownerName = "jokeGCM.myapplication.vic.example.com",
                packagePath = ""
        )
)
public class MyEndpointEndpoint {

    private static final Logger logger = Logger.getLogger(MyEndpointEndpoint.class.getName());

    /**
     * This method gets the <code>MyEndpoint</code> object associated with the specified <code>id</code>.
     *
     * @param id The id of the object to be returned.
     * @return The <code>MyEndpoint</code> associated with <code>id</code>.
     */
    @ApiMethod(name = "getMyEndpoint")
    public MyEndpoint getMyEndpoint(@Named("id") Long id) {
        // TODO: Implement this function
        logger.info("Calling getMyEndpoint method");
        return null;
    }

    /**
     * This inserts a new <code>MyEndpoint</code> object.
     *
     * @param myEndpoint The object to be added.
     * @return The object to be added.
     */
    @ApiMethod(name = "insertMyEndpoint")
    public MyEndpoint insertMyEndpoint(MyEndpoint myEndpoint) {
        // TODO: Implement this function
        logger.info("Calling insertMyEndpoint method");
        return myEndpoint;
    }
}
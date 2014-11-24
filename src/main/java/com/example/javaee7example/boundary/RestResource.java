package com.example.javaee7example.boundary;

import com.example.javaee7example.control.SimpleCdi;
import com.example.javaee7example.control.SimplePojo;
import com.example.javaee7example.control.SimpleSingleton;
import org.apache.log4j.Logger;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Example of Rest resource with CDI.
 */
@Path("example")
@Stateless
public class RestResource {

    @Inject
    private SimpleCdi simpleCdi;
    @Inject
    private SimpleSingleton simpleSingleton;
    @Inject
    private Logger logger;

    @GET
    public String getExampleString() {
        logger.info("Returned rest message");
        return "Rest message: " + simpleCdi.getMessage();
    }

    @GET
    @Path("pojos")
    @Produces(MediaType.APPLICATION_JSON)
    public List<SimplePojo> getSimplePojos() {
        return simpleSingleton.getSimplePojos();
    }


}

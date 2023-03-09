package com.example.test;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;


import java.util.List;

@Path("/list")
public class HelloResource {

    @Inject
    private Service service;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<String> list() {

        return service.getList();
    }


}
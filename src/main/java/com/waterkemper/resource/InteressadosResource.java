package com.waterkemper.resource;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

@Produces({"application/json", "text/plain"})
@Consumes("application/json")
@Path("/interessados")
public class InteressadosResource {

    @GET
    public String sayHello() {
        return "<h1>Learning JAX-RS</h1>";
    }

    @POST
    public Response addInteressado(String json) {
        System.out.println(json);
        return Response.ok().build();
    }

}
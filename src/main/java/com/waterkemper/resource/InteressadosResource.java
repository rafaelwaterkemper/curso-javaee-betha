package com.waterkemper.resource;

import com.waterkemper.model.Interessado;
import com.waterkemper.model.InteressadoService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;

@Produces({"application/json"})
@Consumes("application/json")
@Path("/interessados")
public class InteressadosResource {

//    @Inject
    private InteressadoService service;

    @GET
    public String sayHello() {
        return "<h1>Learning JAX-RS</h1>";
    }

    @POST
    public Response addInteressado(String json) {
        Interessado interessado = Interessado.Builder
                .create()
                .nome("Rafael")
                .email("rafaelwaterkemepr@gmail.com")
                .build();

        service.persist(interessado);
        return Response.ok().build();
    }

}
package com.waterkemper.resource;

import com.waterkemper.model.Interessado;
import com.waterkemper.model.InteressadoService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.util.Collections;

@Produces({"application/json"})
@Consumes("application/json")
@Path("/interessados")
public class InteressadosResource {

    @Inject
    private InteressadoService service;

    @GET
    public Response sayHello() {
        return Response.ok(Collections.singletonMap("STATUS", "OK")).build();
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
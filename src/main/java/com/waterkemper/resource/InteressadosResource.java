package com.waterkemper.resource;

import com.waterkemper.model.Interessado;
import com.waterkemper.model.InteressadoService;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.util.Collections;

@Produces({"application/json"})
@Consumes("application/json")
@Path("/interessados")
@Stateless
public class InteressadosResource {

    @Inject
    private InteressadoService service;

    @GET
    public Response list() {
        return Response.ok(service.list()).build();
    }

    @POST
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public Response addInteressado(Interessado interessado) {
        service.persist(interessado);
        return Response.ok(interessado).build();
    }

}
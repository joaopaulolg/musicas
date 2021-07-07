package com.joaoplg.musicas.controller;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.joaoplg.musicas.entities.Estilo;
import com.joaoplg.musicas.persistence.EstiloDAO;

@Path("estilos")
public class EstilosResource {

    private static final String MSG_ERRO_ADICIONA_ESTILO = "Erro ao adicionar o estilo: ";
    
    @Inject
    private EstiloDAO dao;
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Estilo> getEstilos() {
        return dao.getAll();
    }
    
    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Estilo getEstilo(@PathParam("id") Integer id) {
        return dao.findById(id);
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response adicionarEstilo(Estilo estilo) {
        try {
            dao.persistir(estilo);
            return Response.created(new URI("")).build();
        } catch (URISyntaxException e) {
            return Response.serverError().entity(MSG_ERRO_ADICIONA_ESTILO + e.getMessage()).build();
        }
    }
    
    @PUT
    @Path("{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response atualizarEstilo(@PathParam("id") Integer id, Estilo estilo) {
        dao.atualizar(estilo);
        return Response.ok().build();
    }
    
    @DELETE
    @Path("{id}")
    public Response excluirEstilo(@PathParam("id") Integer id) {
        dao.remover(id);
        return Response.ok().build();
    }
    
}

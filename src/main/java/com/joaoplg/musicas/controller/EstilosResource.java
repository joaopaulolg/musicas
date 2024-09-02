package com.joaoplg.musicas.controller;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import com.joaoplg.musicas.entities.Estilo;
import com.joaoplg.musicas.persistence.EstiloDAO;

import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

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

package com.joaoplg.musicas.controller;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import com.joaoplg.musicas.entities.Gravadora;
import com.joaoplg.musicas.persistence.GravadoraDAO;

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

@Path("gravadoras")
public class GravadorasResource {

    private static final String MSG_ERRO_ADICIONA_GRAVADORA = "Erro ao adicionar a gravadora: ";
    
    @Inject
    private GravadoraDAO dao;
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Gravadora> getGravadoras() {
        return dao.getAll();
    }
    
    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Gravadora getGravadora(@PathParam("id") Integer id) {
        return dao.findById(id);
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response adicionarGravadora(Gravadora gravadora) {
        try {
            dao.persistir(gravadora);
            return Response.created(new URI("")).build();
        } catch (URISyntaxException e) {
            return Response.serverError().entity(MSG_ERRO_ADICIONA_GRAVADORA + e.getMessage()).build();
        }
    }
    
    @PUT
    @Path("{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response atualizarGravadora(@PathParam("id") Integer id, Gravadora gravadora) {
        dao.atualizar(gravadora);
        return Response.ok().build();
    }
    
    @DELETE
    @Path("{id}")
    public Response excluirEstilo(@PathParam("id") Integer id) {
        dao.remover(id);
        return Response.ok().build();
    }
    
}

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

import com.joaoplg.musicas.entities.Gravadora;
import com.joaoplg.musicas.persistence.GravadoraDAO;

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

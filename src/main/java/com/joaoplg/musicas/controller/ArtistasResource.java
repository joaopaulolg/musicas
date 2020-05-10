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

import com.joaoplg.musicas.entities.Artista;
import com.joaoplg.musicas.persistence.ArtistaDAO;

@Path("artistas")
public class ArtistasResource {

    private static final String MSG_ERRO_ADICIONA_ARTISTA = "Erro ao adicionar o artista: ";
    
    @Inject
    private ArtistaDAO dao;
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Artista> getArtistas() {
        return dao.getAll();
    }
    
    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Artista getArtista(@PathParam("id") Integer id) {
        return dao.findById(id);
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response adicionarArtista(Artista artista) {
        try {
            dao.persistir(artista);
            return Response.created(new URI("")).build();
        } catch (URISyntaxException e) {
            return Response.serverError().entity(MSG_ERRO_ADICIONA_ARTISTA + e.getMessage()).build();
        }
    }
    
    @PUT
    @Path("{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response atualizarArtista(@PathParam("id") Integer id, Artista artista) {
        dao.atualizar(artista);
        return Response.ok().build();
    }
    
    @DELETE
    @Path("{id}")
    public Response excluirArtista(@PathParam("id") Integer id) {
        dao.remover(id);
        return Response.ok().build();
    }
    
}

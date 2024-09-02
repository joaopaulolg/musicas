package com.joaoplg.musicas.controller;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import com.joaoplg.musicas.entities.Artista;
import com.joaoplg.musicas.persistence.ArtistaDAO;

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
